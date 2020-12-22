/**
 *Program to sort Students based on their marks
 *
 *
 * @author Jayakrishnan V R
 * @version 2.0
 * @since 2020-11-27
 */


import java.util.Scanner;

class Student {
    private String name;
    private int[] mark = new int[5];
    private float total;
    private float percentage;
    private int rank;

    public void getValues() { // for storing values
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name;");
        name = sc.nextLine();
        System.out.println("Enter marks of 5 subjects");
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter Mark of Subject " + (i + 1) + "-");
            mark[i] = sc.nextInt();
        }
    }

    public void calTotal() {
        total = 0;
        for (int i = 0; i < 5; i++) {
            total = total + mark[i];
        }
    }

    public float getTotal() {
        return total;
    }


    public void calPercentage()  {
        percentage = (total / 500) * 100;
    }

    public void displayValues() {
        System.out.println("\n\nName;" + name);
        System.out.println("Rank-" + rank);
        System.out.println("Marks are");
        for (int i = 0; i < 5; i++) {
            System.out.println("Subject " + (i + 1) + "-" + mark[i]);
        }
        System.out.println("Total Mark;" + total);
        System.out.println("Percentage;" + percentage);
    }

    public void setRank(int rank) {
        this.rank = rank;
    }
}

public class StudentSort {
    static void calculateRank(Student[] st, int size) {
        bubbleSort(st, size);
        for (int i = 0; i < size; i++) {
            st[i].setRank(i + 1);
        }
    }

    static void bubbleSort(Student[] st, int size) {
        Student temp;
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (st[j].getTotal() < st[j + 1].getTotal()) {
                    temp = st[j];
                    st[j] = st[j + 1];
                    st[j + 1] = temp;
                }
            }
        }
    }


    public static void main(String[] args) {
        int size;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of Students in the class;");
        size = sc.nextInt();
        Student[] st = new Student[size]; //array reference
        for (int i = 0; i < size; i++) {  //Making array usable
            st[i] = new Student();
        }

        for (Student i : st) {
            //data collection and processing
            i.getValues();
            i.calTotal();
            i.calPercentage();
        }

        calculateRank(st, size);    //Calculating rank by sorting students
        for (int i = 0; i < size; i++) {
            // To display the values(results)
            st[i].displayValues();
        }
    }
}

