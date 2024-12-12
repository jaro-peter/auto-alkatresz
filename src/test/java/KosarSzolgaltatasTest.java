import hu.jaro.modells.Termek;
import hu.jaro.szolgaltatasok.KosarSzolgaltatas;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class KosarSzolgaltatasTest {
    @Test
    public void termekHozzaAdas_whenAddingOneItemToEmptyBasket_thenSuccessful(){

        Termek termek1 =new Termek("Fek",1234,12000,5);
        int termekDarabSzam=3;
        boolean elVartVegeredmeny= true;
        KosarSzolgaltatas kosarSzolgaltatas= new KosarSzolgaltatas();

        boolean TenylegesVegeredmeny= kosarSzolgaltatas.termekHozzaadas(termek1,termekDarabSzam);

        Assertions.assertEquals(elVartVegeredmeny,TenylegesVegeredmeny);

    }
}
