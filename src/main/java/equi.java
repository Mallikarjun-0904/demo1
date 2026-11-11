


public class equi {

    public boolean checkTriangle(int a, int b, int c) {

        if (a <= 0 || b <= 0 || c <= 0) {
            return false;
        }

        if (a + b <= c || a + c <= b || b + c <= a) {
            return false;
        }

        return (a == b && b == c);
    }

    public static void main(String[] args) {

        equi obj = new equi();

        System.out.println(obj.checkTriangle(5, 5, 5));
    }
}
