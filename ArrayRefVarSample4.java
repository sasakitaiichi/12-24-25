public class ArrayRefVarSample4 {
    public static void main(String[] args) {
        double myList[] = new double[10];

        for(int i = 0;i<= myList.length;i++) {
            myList[i] = java.lang.Math.random() * 100;

            double total = 0;
            for(i=0;i< myList.length;i++) {
                total = myList[i];
                System.out.println("total:"+total);
            }
        }
    }
}
