



public class Main {

    public static <T> boolean compareArrays(T[] arr1, T[] arr2){
        if (arr1.length != arr2.length) return false;

        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].getClass().equals(arr2[i].getClass())) return false;
        }
        System.out.println();

        return true;
    }

    public static void main(String[] args) {

    }
}
