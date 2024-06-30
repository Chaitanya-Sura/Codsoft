import java.util.*;
public class StudentGreade {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of subjects:");
        int n= sc.nextInt();
        if(n<=0){
            System.out.println("invalid number.");
            return;
        }
        int[] marks=new int[n];
        int total=0;
        for(int i=0;i<n;i++){
            System.out.println("enter the subject marks obtained by student in each subject");
            marks[i]= sc.nextInt();
            if(marks[i]<0||marks[i]>100){
                System.out.println("enter the valid marks!");
                return;
            }
            total+=marks[i];
        }
        double avg=(double) total/n;
        char grade;
        if(avg>=90){
            grade='A';
        } else if (avg>=80) {
            grade='B';
        }
        else if (avg>=70) {
            grade='C';
        }
        else if (avg>=60) {
            grade='D';
        }
        else if (avg>=50) {
            grade='E';
        }
        else {
            grade='F';
        }
        System.out.println("\n Total marks Obtained:"+total);
        System.out.println("average percentage:%.2f%%\n"+avg);
        System.out.println("Grade obtained by student is:"+grade);
        sc.close();
    }
}
