public class DynArrayDriver {
    public static void main(String[] args) {
        DynArray myArray = new DynArray();

        System.out.println("size =" myArray.arraySize());
        System.out.println("elements ="+ myArray.elements());
        System.out.println('\n');

        int pot =1;
        for (int v =0;v<10;++v) {
            myArray.insert(pot);
            System.out.println("myArray.at(" + v +") =" + myArray.at(v));
            System.out.println("size =" myArray.arraySize());
            System.out.println("elements ="+ myArray.elements());
            System.out.println('\n');
            pot*=2;
        }
        System.out.println("myArray.at(10) =" + myArray.at(10));
        System.out.println('\n');

        for (int v=0;v<10;++v) {
            double value = myArray.remove();
            System.out.println("size =" myArray.arraySize());
            System.out.println("elements ="+ myArray.elements());
            System.out.println('\n');
        }
        double value = myArray.remove();
        System.out.println("size =" myArray.arraySize());
        System.out.println("elements ="+ myArray.elements());
        System.out.println('\n');

        for (int i=0;i<5;++i) {
            myArray.insertAt(i, 3*i);
            System.out.println("myArray.at(" + i + ") =" + myArray.at(i));
            System.out.println("size =" myArray.arraySize());
            System.out.println("elements ="+ myArray.elements());
            System.out.println('\n');
        }
        myArray.printArray();
        System.out.println();

        value = myArray.removeAt(2);
        System.out.println("value =" + value);
        System.out.println("size =" myArray.arraySize());
        System.out.println("elements ="+ myArray.elements());
        System.out.println('\n');
        myArray.printArray();
        System.out.println();

        value = myArray.removeAt(4);
        System.out.println("value =" + value);
        System.out.println("size =" myArray.arraySize());
        System.out.println("elements ="+ myArray.elements());
        System.out.println('\n');

        
    }
}
