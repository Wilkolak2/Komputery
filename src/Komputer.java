public interface Komputer extends Comparable<Komputer>{

    void uruchom();
    void zepsujSie();

    @Override
    int compareTo(Komputer o);
}
