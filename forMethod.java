package MainPackage.thisKeyWord;

public class forMethod {
    public void m1(){
        int a =10;
        System.out.println(a);
    }
    public  void m2(){
        this.m1();
        int b =20;
        System.out.println(b);
    }

    public static void main(String[] args) {
        forMethod f =new forMethod();
        f.m2();
    }
}
