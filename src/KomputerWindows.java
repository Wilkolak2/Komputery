public class KomputerWindows implements Komputer{

    private String model;
    private String system;

    public KomputerWindows(String model, String system) {
        this.model = model;
        this.system = system;
    }

    @Override
    public void uruchom() {
        System.out.println("Uruchamianie Windowsa");
    }

    @Override
    public void zepsujSie() {
        System.out.println("Windows został zepsuty");
    }

}
