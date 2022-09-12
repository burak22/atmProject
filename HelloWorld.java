import java.util.Scanner;

public class HelloWorld{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Kullanıcı adınızı giriniz: ");
        String userName = sc.nextLine();
        System.out.print("Parolanızı Giriniz: ");
        String password = sc.nextLine();
        int rightsLeft = 3;
        double balance = 1500;
        int selection;

        while(rightsLeft != 0){
            if(userName.equals("patika")&& password.equals("lmao123")){
                do{
                    System.out.println("Hoşgeldiniz yapmak istediğiniz işlemi seçiniz: ");
                    System.out.println("1- Para yatır\n2- Para çek\n3- Bakiye sorgula\n4- Çıkış yap");
                    selection = sc.nextInt();
                    switch(selection){
                        case 1:
                            System.out.print("Ne kadar yatırmak istiyorsunuz? ");
                            balance += sc.nextInt();
                            System.out.println("Para yatırma işlemi başarılı.");
                            break;
                        case 2:
                            System.out.print("Ne kadar çekmek istiyorsunuz?  ");
                            double withdrawAmount = sc.nextDouble();
                            if(withdrawAmount > balance){
                                System.out.println("Hesabınızda yeteri kadar para yok");
                            }
                            else{
                                balance -= withdrawAmount;
                                System.out.println(withdrawAmount+ " Miktarında çekim işlemi başarılı.");
                            }
                            break;
                        case 3:
                            System.out.println("Hesabınızın bakiyesi " + balance + " kadardır.");
                    }
                }
                while(selection!=4);
                System.out.println("Bizi seçtiğiniz için teşekkür ederiz.");
            }
            else{
                rightsLeft--;
                if(rightsLeft == 0){
                    System.out.println("Hesabınız dondurulmuştur geri açmak için bankanızla iletişime geçin.");
                }
                else{
                    System.out.println("Yanlış kullanıcı adı veya parola kalan hakkınız: " + rightsLeft);
                    System.out.print("Kullanıcı adınız: ");
                    userName = sc.nextLine();
                    System.out.print("Şifreniz: ");
                    password = sc.nextLine();
                }
            }
        }
        sc.close();
    }            
}