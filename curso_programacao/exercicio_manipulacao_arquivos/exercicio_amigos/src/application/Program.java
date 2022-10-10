package application;

import model.entities.Friends;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Friends> list = new ArrayList<>();

        System.out.print("Enter file path: ");
        String filePathStr = sc.nextLine();

        File filePath = new File(filePathStr);
        String folderPathStr = filePath.getParent();

        boolean success = new File(folderPathStr + "\\friendsData").mkdir();

        String targetFolderStr = folderPathStr + "\\friendsData\\summary.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(filePathStr))) {
            System.out.println("Reader succeded");

           String itemCsv = br.readLine();
            while (itemCsv != null) {
                String[] vect = itemCsv.split(",");
                String name = vect[0];
                int age = Integer.parseInt(vect[1]);
                double height = Double.parseDouble(vect[2]);

                list.add(new Friends(name, age, height));

                itemCsv = br.readLine();
            }

            try (BufferedWriter bw = new BufferedWriter(new FileWriter(targetFolderStr))) {
                double totalHeight = 0;
                int totalAge = 0;
                int totalFriends = 0;

                for (Friends friend : list) {
                    totalAge += friend.getAge();
                    totalHeight += friend.getHeight();
                    totalFriends++;
                }

                for (Friends friend : list) {
                    bw.write(friend.getName() + ", " + friend.getAge() + ", " + String.format("%.2f", friend.getHeight()));
                    bw.newLine();
                }
                bw.write("Friends average height: " + (String.format("%.2f", heightAverage(totalHeight, totalFriends))));
                bw.newLine();
                bw.write("Friends average age: " + ageAverage(totalAge, totalFriends));

                System.out.println("Write succeded");

            } catch (IOException e) {
                System.out.println("Error writing file: " + e.getMessage());
            }

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

    public static double heightAverage(double totalHeight, int totalCount) {
        return totalHeight / totalCount;
    }

    public static int ageAverage(int totalAge, int totalCount) {
        return totalAge / totalCount;
    }
}
