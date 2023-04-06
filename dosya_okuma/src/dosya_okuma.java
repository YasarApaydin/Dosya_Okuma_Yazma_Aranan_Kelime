import java.io.*;
import java.lang.reflect.Array;

public class dosya_okuma {
    public static void main(String[] args) throws IOException {

String path="alice_in_wonderland.txt";
FileInputStream fis =new FileInputStream(path);//
int kontrol=0;
String metin="";


while((kontrol= fis.read()) != -1){

   metin+= (char)kontrol;
}


        int sonuc=0,sonuc1=0,sonuc2=0,sonuc3=0,sonuc4=0;

String arr[]=metin.split(" ");


        for(int i=0;i< arr.length;i++){
       arr[i]=arr[i].toLowerCase();

            if(arr[i].contains("upon")  ){

                sonuc++;

            }
            if(arr[i].contains("sigh")){

                sonuc1++;
            }
            if(arr[i].contains("dormouse")){

                sonuc2++;
            }
            if(arr[i].contains("jury-box")){

                sonuc3++;
            }
            if(arr[i].contains("swim") || arr[i].contains("swım") ){
                sonuc4++;

            }

        }
        System.out.println("upon:  "+sonuc);
        System.out.println("sigh: "+sonuc1);
        System.out.println("Dormouse: "+sonuc2);
        System.out.println("jury-box: "+sonuc3);
        System.out.println("swim: "+sonuc4);


    }
}
