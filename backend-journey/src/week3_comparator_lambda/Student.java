package week3_comparator_lambda;

public class Student {
    private int age;
    private String name;

    Student(int age, String name){
        this.age = age;
        this.name  =name;
    }

    public int getAge(){
        return age;
    }

    public String getName(){
        return name;
    }

    public String toString(){
        return "Student name "+this.getName()+" Student Age "+this.age;
    }
}
