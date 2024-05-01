public class G4 extends Car{
    private String owner;

    G4(String name, double price) {
        super(name, price);
    }

    @Override
    void printData() {

    }

    @Override
    double countTax() {
        return 0;
    }
}
