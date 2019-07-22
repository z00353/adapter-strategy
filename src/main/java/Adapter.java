public class Adapter implements Strategy {
    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    public String algorithm() {
        // Implementing the Strategy interface in terms of
        // (by delegating to) an Adaptee object.
        return adaptee.specificAlgorithm();
    }
}