import java.util.Scanner;

public class part2 {
    public static void main(String[] args) {
        /////////////////////////////////////////////
        for (int i=1;i<=100;i++){
            System.out.println(i);
        }
        /////////////////////////////////////////////
        for (int i=100;i<=1;i--){
            System.out.println(i);
        }
        ////////////////////////////////////////////
        Scanner scanner= new Scanner(System.in);
        int x = scanner.nextInt();
        for (int i=1;i<=10;i++){
            System.out.println(x);
        }
        ////////////////////////////////////////////

        for (int i=1;i<=100;i++){
            int x1= scanner.nextInt();
            System.out.println(x1);
        }
        /////////////////////////////////////////////

        for (int i=1;i<=100;i++){
            int x1= scanner.nextInt();
            if (x1>0){
                System.out.println(x1);
            }
        }

        ///////////////////////////////////////////////
        for (int i=1;i<=1000;i++){
            if (i%2==1){
                System.out.println(i);
            }
        }
        ////////////////////////////////////////////////

        int x3;
        do {
            x3= scanner.nextInt();
            System.out.println(x3);
        }while(x3<0);

        /////////////////////////////////////////////////
        char c;
        c='a';
        String name= scanner.next();
        while(c != 'Q'){
            if(name.length() < 10)
                System.out.println(name);
            name= scanner.next();
            c=name.charAt(0);
        }

        /////////////////////////////////////////////////////
        for (int i=1;i<=100;i++){
            System.out.println(500/i);
        }
    }
}
