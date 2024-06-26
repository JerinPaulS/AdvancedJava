package innerclasses;

public class Outer {

    private int anInt;
    private String string;

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public int getAnInt() {
        return anInt;
    }

    public void setAnInt(int anInt) {
        this.anInt = anInt;
    }

    public class Inner {
        public void myMethod() {
            System.out.println("anInt=" + anInt + ", string=" + string);
        }
    }

    public static class InnerStatic {
        public void myMethod() {
            System.out.println("Inside static class");
        }
    }
}
