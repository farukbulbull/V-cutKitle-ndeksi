import java.util.Scanner;

public class Vucut {
    public static void main(String[] args) {
        //değişkenlerimizi tanımladım
        double kg,boy;
        Scanner inp=new Scanner(System.in);
//kullanıcaıdan bilgisini aldım
        System.out.print("BOYUNUZU(metre cinsinden)GİRİNİZ:");
        boy= inp.nextDouble();
        System.out.print("KİLONUZU GİRİNİZ:" );
        kg=inp.nextDouble();
//hesap formülünü yazdım
        double indeks=(kg)/(boy*boy);
        
  //sonucu ekrana verdim:)  )    
        System.out.print("VÜCUT KİTLE İNDEKSİ:"+indeks);

    }

}

