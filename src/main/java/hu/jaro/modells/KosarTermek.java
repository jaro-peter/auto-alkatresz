package hu.jaro.modells;

public class KosarTermek {
    private Termek termek;

    private int db;

    public KosarTermek(Termek termek, int db) {
        this.termek = termek;
        this.db = db;
    }

    public Termek getTermek() {
        return termek;
    }

    public void setTermek(Termek termek) {
        this.termek = termek;
    }

    public int getDb() {
        return db;
    }

    public void setDb(int db) {
        this.db = db;
    }
}
