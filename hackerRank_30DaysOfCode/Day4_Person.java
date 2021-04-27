package hackerRank_30DaysOfCode;

import java.util.Scanner;

public class Day4_Person {
    private int age;

    public Day4_Person(int initialAge) {
        // Add some more code to run some checks on initialAge
        setAge(initialAge);
    }

    public void amIOld() {
        // Write code determining if this person's age is old and print the correct statement:
        StringBuilder result  = new StringBuilder();
        if(this.getAge() < 13){
            result.append("You are young.");
        }else if(this.getAge() >= 13 && this.getAge() < 18){
            result.append("You are a teenager.");
        }else {
            result.append("You are old.");
        }

        System.out.println(result.toString());
    }

    public void yearPasses() {
        this.age += 1;
    }

    public int getAge() {
        return age;
    }

    public Day4_Person setAge(int age) {
        if(age > 0){
            this.age = age;
        }else {
            this.age = 0;
            System.out.println("Age is not valid, setting age to 0.");
        }
        return this;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int age = sc.nextInt();
            Day4_Person p = new Day4_Person(age);
            p.amIOld();
            for (int j = 0; j < 3; j++) {
                p.yearPasses();
            }
            p.amIOld();
            System.out.println();
        }
        sc.close();
    }
}
