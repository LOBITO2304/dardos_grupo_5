public class Ejercicio2{
    
    public static void main(String[] args) {
        int x = 0;
        while (x < 20) {
            x = x + 1;
            if (x>5 && x < 10){
                System.out.println("H");
                x=2;
            }
            if (x>10) {
                System.out.println("A");
            }
            if (x==8) {
                x=x-2;
            }
            System.out.println("B");
        }
    }
}