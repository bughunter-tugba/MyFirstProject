import java.util.Scanner;

public class String_Reverse_Sentence_Method {
    public static void main(String[] args) {
        //4- adı  reverseWord olan bir method oluşturun
        //Bu methodun String olarak bir parametresi olmalıdır
        //Ve bu cümledeki kelimelerle tersine çevirmeli
        //Ters halini yazdırın.
        //Örnek 1 :
        //Dize: Java yazın
        //dönüş şöyle olmalıdır:  yazın Java

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a sentence : ");
        String sentence = input.nextLine().trim().replace("  ", " ");  // kullacidan alinan cumlenin gereksiz bosluklarini silme
        input.close();
        System.out.println(reverseWord(sentence));    // method dan geleni direk yazdirma


    }

    public static String reverseWord(String inputSentence) {
        String[] splitWords = inputSentence.split(" ");   // girilen String cumleyi bosluklar ile ayir
        String reversedSentence = "";                     // yeni olusacak olan ters cumlenin degiskeni
        for (int i = splitWords.length - 1; i >= 0; i--) {    // bolme sonrasi olusacak olan dizinin  uzunlugu kadar donecek dongu ama tersten olmasi icin sondan baslayip 0 a dogru azalarak
            reversedSentence += " " + splitWords[i];   // sirasi ile sondan basa dogru eklenecek yeni ters stringe
        }
        return reversedSentence;
    }
}
