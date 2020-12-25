public class ArraycopySample {
    public static void main(String[] args) {
        int[] sourceArray = {2,3,1,5,10};
        int[] targetArray = new int[sourceArray.length];

        for (int i = 0;i<sourceArray.length;i++) {
            targetArray[i] = sourceArray[i];
        }
        for (int e :sourceArray) {
            System.out.println(e + "  ");
        }

        System.arraycopy(sourceArray,0,targetArray,0,sourceArray.length);
        for (int e :sourceArray) {
            System.out.println(e + "  ");
        }

    }
}
