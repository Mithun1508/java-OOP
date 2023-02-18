import javax.swing.JOptionPane;

class Main {
  public static void main(String[] args) {
    String name = JOptionPane.showInputDialog(null, "What's      your name?");
    System.out.println(name);
    System.out.println("Hello world! \n" + "sum= ");
    sum(999.99, 111.11);
    B1 B11= new B1();
    System.out.println(B1.istrue());
    System.out.println("from clss B2: " + B2.istrue());
    System.out.println("from clss B2: " );
    B2.hasajob();
  }

  public static void sum(double x, double y) {

    System.out.println(x + y);
  }
}

class B1 {
   public B1()
  {
    System.out.println("Hello world this Mithun");
  }
  public static Boolean istrue() {
    return true;
  }

}
class B2 extends B1 {
  public static void hasajob() {
    System.out.println("yes, he has. ");
  }
}