package OOP_2.Ozellikler;

public class MainClass {
    public static void main(String[] args) {
        Calisan c=new Calisan("mehmet","ege",35,23233,"KTU");
        c.yazdir();


        System.out.println("----------------------\n");

        Yonetici y=new Yonetici("Ali","Uyanık",32,43434,"footbol");
        y.yazdir();
        y.projeBaslat("Evet");
    }
}
