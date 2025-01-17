import java.util.Arrays;
import java.util.Scanner;

public class Append_Array_Method {
    public static void main(String[] args) {
        //8-`append adında bir method oluşturun.`
        //`Parametre olarak iki int array  oluşturun.`
        // ve ikinci array'in değerlerini ilk array'in sonuna ekleme sonucunu içeren yeni bir array döndürün.
        // Örneğin, ilk array {2, 4, 6}  ve ikinci array {1, 2, 3, 4, 5} elemanlarına sahip ise,
        //Bunu döndürmelidir:
        // {2, 4, 6, 1, 2, 3, 4, 5}.

        Scanner scanInt = new Scanner(System.in);
        int[] mathNotes = new int[2];
        int[] physicalNotes = new int[2];
        for (int i = 0; i < mathNotes.length; i++) {
            System.out.print("Enter the math notes of the students : ");
            mathNotes[i] = scanInt.nextInt();
            System.out.print("Enter the  physical notes of the students : ");
            physicalNotes[i] = scanInt.nextInt();
        }
        scanInt.close();
        System.out.println("Result Array = " + Arrays.toString(append(mathNotes, physicalNotes)));    // append method undan geleni yazdirma islemi


    }

    public static int[] append(int[] sourceArray, int[] secondArray) {

        int[] mergedArray = new int[sourceArray.length + secondArray.length];     //birlestirilmis array in length i iki arrayin toplam length i kadar olucak
        for (int i = 0; i < sourceArray.length; i++) {  // ilk array i eklemek icin dongu
            mergedArray[i] = sourceArray[i];
        }
        for (int j = 0; j < secondArray.length; j++) {  // ikinci arrayi eklemek icin array
            mergedArray[sourceArray.length + j] = secondArray[j];  // ilk arrayin uzunlugu ile toplanarak kaldigi yerden birlestirilmis array e eklemeye devam ediyor
        }

        return mergedArray;


    }
}
