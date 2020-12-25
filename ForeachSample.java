public class ForeachSample {
    public static void main(String[] args) {
        double[] myList = new double[5];
        myList[0] = 1;
        myList[1] = 2;
        myList[2] = 3;
        myList[3] = 4;
        myList[4] = 5;

        double temp = myList[1];
        for (int i = 1; i < myList.length; i++) {
            myList[i - 1] = myList[i];
        }
        myList[myList.length - 1] = temp;

        for (int i = 0; i < myList.length; i++) {
            System.out.println(myList[i] + "  ");
        }
        System.out.println();
        for (double e : myList) {
            System.out.println(e);
        }
    }
}