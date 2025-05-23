package com.mycompany.qiannsorting;

import java.util.Scanner;

public class f2 {

    public static void main(String[] args) {
  
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of names you want to sort: ");
        int n = scanner.nextInt();
        scanner.nextLine(); 

       
        String[] nameArray = new String[n];

        
        System.out.println("\"Vannesa\", \"Liam\", \"Joshua\", \"Alexander\", \"Abigail\", \"Natalie\", \"Thomas\", \"Sophia\", \"Benjamin\", \n" +
"            \"Mia\", \"Zoe\", \"Caleb\", \"Emma\", \"Isaac\", \"Kevin\", \"Penelop\", \"Dianna\", \"Quentine\", \"Gabriel\", \n" +
"            \"Sarah\", \"Samantha\", \"Charlotte\", \"Daniel\", \"Jacob\", \"Yasmine\", \"Leah\", \"Owen\", \"Aaron\", \n" +
"            \"Racheal\", \"Isabelle\", \"Madison\", \"Tristian\", \"Steven\", \"Elijah\", \"Alice\", \"Olivia\", \"Hannah\", \n" +
"            \"Victor\", \"Liam\", \"Lucas\", \"Joshua\", \"Hannah\", \"Samuel\", \"Jasmine\", \"Patrick\", \"Grace\", \"Noah\", \n" +
"            \"Zachary\", \"Alexander\", \"Katherine\", \"Benjamin\" (one per line):");
        for (int i = 0; i < n; i++) {
            nameArray[i] = scanner.nextLine();
        }

        
        System.out.println("Choose a sorting method: ");
        System.out.println("1. Selection Sort");
        System.out.println("2. Insertion Sort");
        int choice = scanner.nextInt();

      
        switch (choice) {
            case 1:
                selectionSort(nameArray);
                break;
            case 2:
                insertionSort(nameArray);
                break;
            default:
                System.out.println("Invalid choice. Please select 1 or 2.");
                scanner.close();
                return;
        }

    
        System.out.println("Sorted Names:");
        for (String name : nameArray) {
            System.out.println(name);
        }
      
    }

    
    public static void selectionSort(String[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j].compareToIgnoreCase(array[minIndex]) < 0) {
                    minIndex = j;
                }
            }
      
            String temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }

    
    public static void insertionSort(String[] array) {
        int n = array.length;
        for (int i = 1; i < n; i++) {
            String key = array[i];
            int j = i - 1;

          
            while (j >= 0 && array[j].compareToIgnoreCase(key) > 0) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
    }
}
