public class Adaptee {
    public String specificAlgorithm() {
        int a = 2;
        int b = 3;
        int c = a * b;
        return "Working with Adaptee to perform a specific algorithm!" + c ;
    }
}