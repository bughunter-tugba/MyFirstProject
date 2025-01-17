import java.util.Arrays;
import java.util.Scanner;

public class IsUnique_Method {
    public static void main(String[] args) {
        // 9- isUnique adında bir method oluşturun.
        //Parametre olarak int array alır.
        // ve bu dizideki değerlerin benzersiz olup olmadığını gösteren bir boolean değeri döndürür (benzerlik yoksa true, var ise false).
        //örneğin, list isminde bir array'imiz varsa,
        //int[] list = {3, 8, 12, 2, 9, 17, 43, -8, 46, 203, 14, 97, 10, 4};
        //Bu listede yinelenen eleman olmadığı için sonuç true dönmelidir.
        //int[] list = {4, 7, 2, 3, 9, 12, -47, -19, 308, 3, 74};
        //Bu listede eleman 3, iki tane olduğu için sonuç false dönmelidir.
        Scanner scan = new Scanner(System.in);
        int[] mathNotes = new int[5];
        for (int i = 0; i < mathNotes.length; i++) {
            System.out.print("Enter the math notes of the students : ");
            mathNotes[i] = scan.nextInt();
        }

        System.out.println(isUnique(mathNotes));


    }

    public static Boolean isUnique(int[] sourceArray) {
        Arrays.sort(sourceArray);   // notlari buyukten kucuge doru sirala
        boolean result = true;
        for (int i = 1; i < sourceArray.length; i++) {
            if (sourceArray[i] == sourceArray[i - 1]) {   // karakter ve ondan onceki karakter ayni ise false verir
                result = false;
            }
        }
        return result;
    }
}
