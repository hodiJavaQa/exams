import java.util.Locale;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        //- תדפיס את השם שלך באותיות גדולות בגאווה בעזרת פונקציות של STRING
        String name = "hothaifa ZOUBI";
        System.out.println(name.toUpperCase());
        //- תדפיס את השם שלך באותיות קטנות בגאווה בעזרת פונקציות של STRING
        System.out.println(name.toLowerCase());
        //- תדפיס את השם שלך ושם המשפחה עם רווחים ואז תחליף את הרווח בנקודה בעזרת STRING
        System.out.println(name.replaceAll(" ","."));
        //- הדפס את התשובה של התרגיל 5^4
        System.out.println(Math.pow(4,5));
        //        - תקלוט שם מהמשתמש ותדפיס את השם שהוא מכניס באותיות גדולות
        Scanner scanner = new Scanner(System.in);
        String newName=scanner.next();
        System.out.println(newName.toUpperCase());
        //        - תקלוט שם מהמשתמש ותבדוק אם השם שהוא הכניס נמצא באותיות גדולות תדפיס לו "ב יי "
        if (newName.equals(newName.toUpperCase()))
            System.out.println("bye bye ");
        //        - תקלוט שם מהמשתמש ותדפיס את אורך השם של אותו משתמש
        System.out.println(newName.length());
        //        - תקלוט שם מהמשתמש ותדפיס לו שלום אם השם גדול מ 4 אותיות
        if(newName.length()>4)
            System.out.println(newName);
        //        - תקלוט שם מהמשתמש ותדפיס לו שלום אם השם גדול מ 4 אותיות ובי י אם השם קטן או שווה ל 4
        if(newName.length()>4)
            System.out.println("hii");
        else
            System.out.println("bye");
        //        - תקלוט שם מהמשתמש ותדפיס את השם שהוא מכניס בנוסף ל שלום מר באותה שורה
        System.out.println("Mr."+newName);
        //        - תדפיס את המשווה " 12=6 * 2 "
        System.out.println(2+" * "+6+" = "+6*2);
        //        -תבנה מחשבון שמבקש מהמשתמש רק את האופיראטור ולפי זה מציג לו את התשובה של שני מספרין
        int x1=12,x2=5;
        char op=scanner.next().charAt(0);
        switch (op){
            case '+'-> System.out.println(x1+x2);
            case '-'-> System.out.println(x1-x2);
            case '*'-> System.out.println(x1*x2);
            case '/'-> System.out.println(x1/x2);
            default -> System.out.println("naaaah");
        }

        //- תכתוב קוד שמקבל מספר ומדפיס אם הוא גדול מ 50 או לא
        int x3=scanner.nextInt();
        if (x3>50)
            System.out.println("grater than 50");
        else
            System.out.println("lower than 50");
        //- תכתוב קוד שמקבל מספר כלשהו ומדפיס אם המספר חיובי או שלילי
        if (x3>0)
            System.out.println("pos");
        else
            System.out.println("neg");
        //-כתוב קוד שמקבל מספר ומדפיס אם מהספר מתחלק ב 15 ל לא שא רית אם המספר לא מתחלקת לא
        //להדפיס כלום
        if (x3%15==0)
        System.out.println("divided bt 15");
        //-כתוב תוכנית שמקבלת מהמשתמש מספר ומדפיסה את ספרת האחדות של המספר הזה
        System.out.println(x3%10);
        //        -כתוב קוד שמקבל מספר ומדפיס אם המספר זו גי או אי זוגיכתבו קוד שמקבל מספר ומדפיסה לך את היום של המילים )SWITCH )
        if (x3%2==0)
            System.out.println("even");
        else
            System.out.println("odd");

        switch (x3){
            case 1 -> System.out.println("sunday");
            case 2 -> System.out.println("monday");
            case 3 -> System.out.println("tuesday");
            case 4 -> System.out.println("wednesday");
            case 5 -> System.out.println("thursday");
            case 6 -> System.out.println("friday");
            case 7 -> System.out.println("saturday");
            default -> System.out.println("try again");
        }
        //- כתוב קוד שמ קבל 3 מספרים ומדפיס את הגדול מביניהם
        if (x1>x2 && x1>x2)
            System.out.println(x1);
        else if (x2>x3)
            System.out.println(x3);
        else System.out.println(x3);
        //        -כתוב קוד שמדפיס "GOTIT "אם בכתיבת 3 מספירם יש לפחות 2 מספרים שוו ים
        if (x1==x2 && x1==x2)
            System.out.println(x1);
        if (x2==x3 && x2==x1)
            System.out.println(x1);
        if (x3==x2 && x3==x1)
            System.out.println(x1);

        //        - כתוב קוד שבוד ק אם האות הראשונה במילה שהמשתמש הכניס היא
        if (newName.charAt(0)=='a')
            System.out.println("GOT IT");

    }
}
