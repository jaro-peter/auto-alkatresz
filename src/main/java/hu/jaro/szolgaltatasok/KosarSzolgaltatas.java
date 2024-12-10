package hu.jaro.szolgaltatasok;

import hu.jaro.modells.KosarTermek;
import hu.jaro.modells.Termek;

import java.util.ArrayList;
import java.util.List;

public class KosarSzolgaltatas {

    private List<KosarTermek> termekek=new ArrayList<>();



    public boolean termekHozzaadas(Termek termek, int db){
        KosarTermek ujTermek = new KosarTermek(termek,db);
        termekek.add(ujTermek);
        return true;
    }
    public boolean termekDarabSzamModositas(Termek termek, int db){
        for (int i = 0; i < termekek.size(); i++) {
            if (termekek.get(i).getTermek()==termek && termekek.get(i).getTermek().getKeszlet()>=db) {
                termekek.get(i).setDb(db);
                return true;
            }
        }
        return false;
    }
    public boolean TermekTorles(Termek termek){
        for (int i = 0; i < termekek.size(); i++) {
            if (termekek.get(i).getTermek()==termek) {
                termekek.remove(i);
                return true;
            }
        }
        return false;
    }


}
