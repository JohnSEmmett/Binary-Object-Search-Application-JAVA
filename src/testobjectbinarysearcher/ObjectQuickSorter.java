package testobjectbinarysearcher;

public class ObjectQuickSorter {
        private Comparable[] list;
        
        public ObjectQuickSorter(Comparable[] list) {
                this.list = list;
        }
        
        public Comparable[] sortElements() {
                for (int j = 0; j < this.list.length; j++) {
                        for (int y = 0; y < this.list.length; y++) {
                                if (this.list[j].toString().compareTo(this.list[y].toString()) < 0) {
                                        Comparable temp = this.list[j];
                                        this.list[j] = this.list[y];
                                        this.list[y] = temp;
                                }
                        }
                }
                
                return this.list;
        }
}