public class DynArray {
    private double[] array;
    private int size;
    private int nextIndex;

    public DynArray() {
        array = new double[1];
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
        size = size *2;
    }

    private void shrink() {
        double[] newArray = new double[array.length/2];

        for (int i=0; i<nextIndex;i++) {
            newArray[i]= array[i];
        }

        array = newArray;
        size= size/2;
    }

    public void insertAt(int index, double value) {
        if (index <0 || index> nextIndex ) {
            return;
        }

        if (nextIndex == size) {
            grow();
        }

        for (int i=nextIndex; i>index;i--) {
            array[i] = array[i-1];
        }

        array[index] = value;
        nextIndex++;
    }

    public void insert(double value) {
        insertAt(nextIndex, value);
    }

    public double removeAt(int index) {
        if (index <0 || index>= nextIndex) {
            return Double.NaN;
        }

        double removeValue = array[index];

        for (int i=index; i<nextIndex-1;i++) {
            array[i] = array[i+1];
        }

        nextIndex--;
        
        if (size>1 && nextIndex < size /2) {
            shrink();
        }

        return removeValue;
    }

    public double remove() {
        return removeAt(nextIndex - 1);
    }

    public void printArray() {
        for (int i=0; i< nextIndex; i++) {
            System.out.println("at: " + i + "value:" + array[i]);
        }
    }
}
