import java.util.Scanner;

class StudentScoreTernary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the marks of student :");
        int marks = input.nextInt();
        StudentScoreTernary st = new StudentScoreTernary();
        String mark = st.mark(marks);
        System.out.println(mark);
    }

    public String mark(int marks){
        return marks >= 80 ? "High" : (marks >=50 ? "Moderate": "low");
    }
}
