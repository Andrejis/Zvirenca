import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        //ArrayList na cisla / integery
        ArrayList<Integer> CislaHociake = new ArrayList<>();    // do <> zatvoriek pises celym slovom bud integer alebo string alebo podla triedy co ti da ucitelka
        CislaHociake.add(3);   // index0
        CislaHociake.add(5);   // index1
        CislaHociake.add(7);   // index2
        CislaHociake.remove(1);  //pises index alebo poziciu, pozicia cisla 3 je index0, cislo 5 ma index1 atd. + prikaz remove je na vymazanie jedneho z cisel v array liste
        CislaHociake.clear();  // prikaz clear je na vymazanie celeho arraylistu

        //ArrayList na stringy
        ArrayList<String> PismenkaHociake = new ArrayList<>();
        PismenkaHociake.add("Ahoj :)");   // pri array stringu pises v zatvorkach ale to vies :)
        PismenkaHociake.add("Skap :(");
        PismenkaHociake.add("Zajtra cakaj :)");
        PismenkaHociake.remove(1);  // znovu ako pri cislach pises index juu
        PismenkaHociake.clear();    // jednym prikazom to ptm cele vymazes ak to zada na pisomke

    }
}
