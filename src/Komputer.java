public interface Komputer extends Comparable<Komputer>{
    public void uruchom();
    public void zepsujSie();

    @Override
    default int compareTo(Komputer o) {
        return getClass().getName().length() - o.getClass().getName().length();
    }
}
