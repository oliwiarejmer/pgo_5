package zadanie2;

import java.util.List;
import java.util.Optional;

public interface IZarzadzaniePozycjami {

    Optional<Pozycja> znajdzPozycjePoTytule(String tytul);
    Optional<Pozycja> znajdzPozycjePoId(int id);
    List<Pozycja> wypiszWszystkiePozycje();
}
