package MainPackage.thisKeyWord;

public class forConstructor {
    int rollno;
    String name,course;
    float fee;
    forConstructor(int rollno,String name,String course){
        this.rollno=rollno;
        this.name=name;
        this.course=course;
    }
    forConstructor(int rollno,String name,String course,float fee){
        this(rollno,name,course);
        this.fee=fee;
        System.out.println(rollno+" "+name+" "+course+" "+fee);
    }
    void display(){System.out.println(rollno+" "+name+" "+course+" "+fee);}
    public static void main(String args[]){
        forConstructor s1=new forConstructor(111,"ankit","java");
        forConstructor s2=new forConstructor(112,"sumit","java",6000f);
    }
}
