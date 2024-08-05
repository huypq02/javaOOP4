package vn.edu.cybersoft.pkg;

public class utils {
    public static String[] append(String[] arr, String element) {
        String[] newArr = new String[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        newArr[arr.length] = element;
        return newArr;
    }
}
