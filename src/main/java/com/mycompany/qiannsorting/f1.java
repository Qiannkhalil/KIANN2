package com.mycompany.qiannsorting;

public class f1 {

    public static void main(String[] args) {
        // Define the names in an array
        String[] nameArray = {
            "Vannesa", "Liam", "Joshua", "Alexander", "Abigail", "Natalie", "Thomas", "Sophia", "Benjamin", 
            "Mia", "Zoe", "Caleb", "Emma", "Isaac", "Kevin", "Penelop", "Dianna", "Quentine", "Gabriel", 
            "Sarah", "Samantha", "Charlotte", "Daniel", "Jacob", "Yasmine", "Leah", "Owen", "Aaron", 
            "Racheal", "Isabelle", "Madison", "Tristian", "Steven", "Elijah", "Alice", "Olivia", "Hannah", 
            "Victor", "Liam", "Lucas", "Joshua", "Hannah", "Samuel", "Jasmine", "Patrick", "Grace", "Noah", 
            "Zachary", "Alexander", "Katherine", "Benjamin"
        };

        // Sort the names using bubble sort
        bubbleSort(nameArray);

     
        System.out.println("Sorted Names:");
        for (int i = 0; i < nameArray.length; i++) {
            System.out.print(nameArray[i]);
            if (i != nameArray.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

 
    public static void bubbleSort(String[] array) {
        int n = array.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                // Compare strings ignoring case
                if (array[j].compareToIgnoreCase(array[j + 1]) > 0) {
                    // Swap array[j] and array[j + 1]
                    String temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
            // If no swaps occurred, array is sorted
            if (!swapped) {
                break;
            }
        }
    }
}
