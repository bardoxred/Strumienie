
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class App {

    public static void main(String[] args) {
        List<Mieszkanie>list = Arrays.asList(
                new Mieszkanie("Białystok","Morska",5,2,5,523123,true),
                new Mieszkanie("Warszawa","Pierwsza",6,5,10,812381,false),
                new Mieszkanie("Ciechanów","Pierwsza",3,12,2,323256,true),
                new Mieszkanie("Bartoszyce","Kwiatowa",5,51,3,200000,false),
                new Mieszkanie("Warszawa","Gówniana",3,1,15,350000,false),
                new Mieszkanie("Ciechanów","Niebiańska",7,35,23,83233,true)
        );

        list.stream()
                .filter(mieszkanie -> mieszkanie.getMiejscowosc().equals("Warszawa"))
                .filter(mieszkanie -> mieszkanie.getCena()<900000)
                .filter(mieszkanie -> mieszkanie.getIloscPokoi()>3)
                .map(mieszkanie -> mieszkanie.getMiejscowosc()+" cena: "+mieszkanie.getCena()+" ilość pokoi: "+mieszkanie.getIloscPokoi())
                .forEach(System.out::println);

        Predicate<Mieszkanie> nazwa = mieszkanie -> mieszkanie.getMiejscowosc().equals("Warszawa");
        List<Mieszkanie> lista = new ArrayList<>();

        lista = list.stream()
                .filter(nazwa)
                .collect(Collectors.toList());

        System.out.println(lista);
    }
}
