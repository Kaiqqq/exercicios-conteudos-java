package application;

import entities.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Product> list = new ArrayList<>();

        System.out.print("Write file path: ");
        String filePathStr = sc.nextLine();

        File filePath = new File(filePathStr);
        String folderPathStr = filePath.getParent();

        boolean success = new File(folderPathStr + "\\out").mkdir();

        String targetFileStr = folderPathStr + "\\out\\summary.csv";

        try(BufferedReader br = new BufferedReader(new FileReader(filePathStr))) {
            System.out.println("Success reading file: " + filePathStr);

            String itemCsv  = br.readLine();
            while (itemCsv != null) {
                String[] vect = itemCsv.split(",");
                String name = vect[0];
                double price = Double.parseDouble(vect[1]);
                int quantity = Integer.parseInt(vect[2]);

                list.add(new Product(name, price, quantity));

                itemCsv = br.readLine();
            }

            try (BufferedWriter bw = new BufferedWriter(new FileWriter(targetFileStr))) {

                for (Product item : list) {
                    bw.write(item.getName() + "," + String.format("%.2f",item.total()));
                    bw.newLine();
                }
                System.out.println("Success writing file: " + targetFileStr);
            } catch (IOException e) {
                System.out.println("Error writing file: " + e.getMessage());
            }

        } catch (IOException e ) {
            System.out.println("Error reading file " + e.getMessage());
        }
    }

}
