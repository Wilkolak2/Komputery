public class KomputerMac implements Komputer{

    private String model;
    private String system;

    public KomputerMac(String model, String system) {
        this.model = model;
        this.system = system;
    }

    @Override
    public void uruchom() {
        System.out.println("Uruchamianie Maca");
    }

    @Override
    public void zepsujSie() {
        System.out.println("Mac został zepsuty");
    }

}
