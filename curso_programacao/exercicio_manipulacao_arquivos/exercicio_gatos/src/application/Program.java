package application;

import model.entities.Cats;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Cats> list = new ArrayList<>();

        System.out.print("Enter file path: ");
        String filePathStr = sc.nextLine();

        File filePath = new File(filePathStr);
        String folderPathStr = filePath.getParent();

        boolean success = new File(folderPathStr + "\\catsData").mkdir();

        String targetFolderStr = folderPathStr + "\\catsData\\catsInfoUpdated.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(filePathStr))){
            String catsData = br.readLine();

            while(catsData != null) {
                String[] vect = catsData.split(",");
                String name = vect[0];
                int age = Integer.parseInt(vect[1]);
                double weight = Double.parseDouble(vect[2]);
                String color = vect[3];

                list.add(new Cats(name, age, weight, color));

                catsData = br.readLine();
            }

            try(BufferedWriter bw = new BufferedWriter(new FileWriter(targetFolderStr))) {

                for (Cats cat : list) {
                    bw.write("Name: " + cat.getName() + ", age: " + cat.getAge() + ", weight: " + cat.getWeight() + ", color: " + cat.getColor());
                    bw.newLine();
                }

            } catch (IOException e) {
                System.out.println("Error writing file: " + e.getMessage());
            }

        } catch (IOException e) {
            System.out.println("Error reading file:" + e.getMessage());
        }

    }

}
