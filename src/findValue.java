import java.util.Scanner;

public class findValue {
    public static void main(String[] args) {

        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name students:");
        String nameStudent = sc.nextLine();

        boolean isValue = false;

        for (int i = 0; i < students.length; i++)
            if (students[i].equals(nameStudent)) {
                System.out.println(nameStudent + " o vi tri so " + i);
                isValue = true;
                break;
            }
        if (!isValue) System.out.println("Not found " + nameStudent + " in list");
    }
}
