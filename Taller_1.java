/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

import java.util.Scanner;

public class Taller_1 {
    
    private String[] licensePlate_Place;
    private int counter;
    private int option;
    private static Scanner scan = new Scanner(System.in);
    
    public Taller_1(int tam) { //constructor
        licensePlate_Place = new String[tam];
        counter = 0;
        this.tam = tam;
        this.option = option;
    }

    // Método para mostrar el arreglo
    public void view_TablePlate() {
        for (String license : licensePlate_Place) {
            System.out.println(license);
        }
    }
    
    
    public static void add_Thing(String[] licensePlate_Place, int tam, int counter){
        System.out.println("Prefer put yourself the license plate or create a random plate?");
        System.out.println("1. Put yourself");
        System.out.println("2. Generate random plate");
        int option = scan.nextInt();
        if(option == 1){
            System.out.println("Put the license plate that you need to add:");
            String plate =scan.nextLine();
            for(int i = 0; i<= counter;i++){ //we confirm if exist free space
                if (licensePlate_Place[i] == null){
                    licensePlate_Place [i] = plate;
                }else{
                    i++;
                    counter = i;
                        }
            }
            if(option == 2){
                for(int i = 0; i<= 99;i++){
                if (licensePlate_Place[i] == null){
                    licensePlate_Place [i] = plate;
                }else{
                    i++;
                        }
            }
            if(counter > tam){
                 System.out.println("No available space to add the plate.");
            }
    }

    }
    }



    public static void delete_Plate (String[] licensePlate_Place){

    }
    
    public static void change_PlatePlance (String[] licensePlate_Place){
        System.out.print("put the plate that you like change: ");
        String find_Plate = scan.nextLine();
        
        int flag = 0;
        for (int i = 0; i < licensePlate_Place.length; i++) {
            if (find_Plate.equals(licensePlate_Place[i])) {
                flag = i; 
                break; 
            }
        }
        if (flag != -1) {
            // Pedir la nueva placa
            System.out.print("Insert the new plate: ");
            String newPlate = scan.nextLine();
            licensePlate_Place[flag] = newPlate;
            System.out.println("plate has been changed succesfully.");
        } else {
            System.out.println("Plate not found.");
        }
    }


    int tam = 0;
    public static void main(String[] args) {
        do{
            System.out.println("Hi! Choose the number of spaces that you need for the Array:");
            tam = sc.nextInt;
            
            System.out.println("Hi! Select a option that you need:");
            System.out.println("1. Insert a license plate");
            System.out.println("2. Find and chance a word");
            System.out.println("3. Find and Delete word");
            switch(option){
                case 1:
                    add_Thing(licensePlate_Place, tam, counter);
                    break;
                case 2:
                    change_PlatePlance(licensePlate_Place);
                break;
                case 3:
                    delete_Plate (String[] licensePlate_Place);
                    break;
                
            }
        }while();
        }
    }
}


