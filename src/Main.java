import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Lütfen sıcaklığı giriniz: ");
        int C = sc.nextInt();

        if(C<5){
            System.out.print("Hava sıcaklığı kayak yapmak için uygun.");
        }
        else if (C>=5 && C<15){
            System.out.print("Hava sıcaklığı sinemaya gitmek için uygun");
        }
        else if (C>=15 && C<25){
            System.out.print("Hava sıcaklığı pikniğe gitmek için uygun");
        }
        else{
            System.out.print("Hava sıcaklığı yüzmek için uygun");
        }
    }
}