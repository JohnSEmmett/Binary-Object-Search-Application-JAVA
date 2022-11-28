package testobjectbinarysearcher;

import java.util.Scanner;

public class ObjectBinarySearcher {
        
    
    private Comparable[] list;
        private int numberOfElements;
        private int low, high, mid;
        
        public ObjectBinarySearcher() {
                super();
        }

        public ObjectBinarySearcher(Comparable[] list, int numbOfElements) {
                super();
                this.list = list;
                this.numberOfElements = numbOfElements;
        }

        public Comparable[] getList() {
                return list;
        }
        
        public void setList(Comparable[] list) {
                this.list = list;
        }
        
        public int getNumberOfElements() {
                return numberOfElements;
        }
        
        public void setNumberOfElements(int numbOfElements) {
                this.numberOfElements = numbOfElements;
        }
        
        public void addElements(Comparable temp, int index) {
                this.list[index] = temp;
        }
        
        public int searchElement(String el) {
               
                this.low = 0;
               
                this.high = this.numberOfElements - 1;
                
               
                while (this.low <= this.high) {
                        // stanadard sorting algorithm
                     
                        // Selection Sort & Bubble Sort
                        this.mid = (this.low + this.high) / 2;
                        
                        
                        if (this.list[mid].toString().equals(el)) {
                                return mid;
                        }
                    
                        else if (this.list[mid].toString().compareTo(el) > 0){
                                this.high = this.mid - 1;
                        }
                      
                        else {
                                this.low = this.mid + 1;
                        }
                }
               
                return -1;
        }
}
