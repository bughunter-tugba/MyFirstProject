import java.util.Scanner;

public class powerOfThree_Method {
    public static void main(String[] args) {
        //7-powerOfThree isminde bir method oluşturun.
        //Parametre olarak int
        //Return tipi boolean
        //Bir tamsayı verildiğinde, 3 üssü olup olmadığını teyit edin. 3'ün üssü(kuvveti) ise true, değilse false döndürün.
        //**Örnek 1:**
        //**Girdi:** 27
        //**Çıktı:** true
        //Açıklama: 3*3*3 =27
        //Sonuç= true

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = scan.nextInt();
        scan.close();
        System.out.println(powerOfThree(number));


    }

    public static Boolean powerOfThree(int inputNumber) {
        int count = 1;                            // 0. kuvveti yakalamak icin 1 yaptim sayaci
        while ( count<= inputNumber) {            //sayac girilen sayi ile ayni ve kucukse dongu devam eder
            if (inputNumber == count) {           // girilen sayi ve sayac ayni ise return true doner
                return true;
            }
            count*=3;                         // count dongude sgirilen sayidan kucuk oldugu surece 3 ile carpilarak devam eder
        }
        return false;                        // eger dongu durur ve hala return olmadi ise buraya gelir ve false return eder






    }
}
