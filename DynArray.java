public class DynArray {
    private double[] array;
    private int size;
    private int nextIndex;

    public DynArray() {
        double[] array = new double[1];
        size = 1;
        nextIndex =0;
    }

    public int arraySize() {
        return size;
    }

    public int elements() {
        return nextIndex;
    }

    public double at(int index) {
        if (0<= index && index <=nextIndex) {
            return array[index];
        }
        return Double.NaN;
    }

    private void grow() {
        double[] newArray = new double[array.length*2];

        for (int i =0;i<nextIndex;i++) {
            newArray[i] = array[i];      
        }

        array = newArray;
        size = array.length;
    }

    private void shrink() {
        double[] newArray = new double[array.length/2];

        for (int i=0; i<nextIndex;i++) {
            newArray[i]= array[i];
        }

        array = newArray;
        size= array.length;
    }

    public void insertAt(int index, double value) {
        
    }

    public void insert() {

    }

    public double removeAt(int index) {

    }

    public double remove() {

    }

    public void printArray() {
        
    }
}
