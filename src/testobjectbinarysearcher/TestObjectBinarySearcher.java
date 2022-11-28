/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testobjectbinarysearcher;



/**
 *
 * @author Jack Emmett
 */




import java.util.Scanner;

public class TestObjectBinarySearcher {
   
        public static void main(String[] args) {
                int choice, key;
                Scanner sc = new Scanner(System.in);
                
                ObjectBinarySearcher objectSearcher = new ObjectBinarySearcher();
             
                System.out.println("Enter the size of your Array: ");
                objectSearcher.setNumberOfElements(Integer.parseInt(sc.nextLine()));
                
               
                objectSearcher.setList(new Comparable[objectSearcher.getNumberOfElements()]);
                
                System.out.println("Enter data for Array: ");
                
              
                for (int i = 0; i < objectSearcher.getNumberOfElements(); i++) {
                        Comparable temp = sc.nextLine();
                        objectSearcher.addElements(temp, i);
                }
                
              
                ObjectQuickSorter objectSorter = new ObjectQuickSorter(objectSearcher.getList());
                objectSearcher.setList(objectSorter.sortElements());
                
                Comparable[] list = objectSearcher.getList();
                
                
                for (int i = 0; i < objectSearcher.getNumberOfElements(); i++) {
                        System.out.println(list[i].toString());
                }
            
              
        }
}
