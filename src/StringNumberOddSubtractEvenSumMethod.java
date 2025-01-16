import java.util.Scanner;

public class StringNumberOddSubtractEvenSumMethod {
    public static void main(String[] args) {
        //5-EvenOddNums isminde bir method oluşturun.
        //Bu yöntem String olan bir parametreyi kabul etsin.
        //Bu String'de 1234567890 gibi 10 haneli sayılar olacak.
        //Sayıların her basamağını alın ve basamak çiftse toplayın, tekse çıkartın.
        //toplam sonucu yazdırın.
        //**İpucu:Sayılar işlemleri yapabilmeniz için, basamakları tam sayıya dönüştürmeniz gerekiyor.**
        //For example Örnek:
        //String =  "6678421312"
        //6+6-7+8+4+2-1-3-1+2
        //sonuç 16 olmalı

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number with 10 digits : ");
        String number = input.nextLine().trim();  // trim ile bosluklari sil bosuna for dongusu calismasin
        input.close();
        System.out.println("Result : " + EvenOddNums(number));


    }

    public static int EvenOddNums(String inputStr) {
        int sumResult = 0;      // dondurulecek sonuc degiskeni
        int digit;              // Stringden gelen her rakami tutacak degisken
        for (int i = 0; i < inputStr.length(); i++) {   // Stringdeki karakter sayisi kadar donecek dongu
            digit = inputStr.charAt(i) - '0';      //karakteri integer rakama donustur
            if (digit % 2 == 0) {            // rakam cift ise topla
                sumResult += digit;
            } else {
                sumResult -= digit;         // degilse cikart
            }
        }


        return sumResult;

    }

}
