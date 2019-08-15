public class Mieszkanie {

    public String miejscowosc;
    public String ulica;
    public int iloscPokoi;
    public int nrDomu;
    public int iloscOkien;
    public int cena;
    public boolean piwnica;

    public Mieszkanie(String miejscowosc, String ulica, int iloscPokoi, int nrDomu, int iloscOkien, int cena, boolean piwnica) {
        this.miejscowosc = miejscowosc;
        this.ulica = ulica;
        this.iloscPokoi = iloscPokoi;
        this.nrDomu = nrDomu;
        this.iloscOkien = iloscOkien;
        this.cena = cena;
        this.piwnica = piwnica;
    }

    public void setMiejscowosc(String miejscowosc) {
        this.miejscowosc = miejscowosc;
    }

    public void setUlica(String ulica) {
        this.ulica = ulica;
    }

    public void setIloscPokoi(int iloscPokoi) {
        this.iloscPokoi = iloscPokoi;
    }

    public void setNrDomu(int nrDomu) {
        this.nrDomu = nrDomu;
    }

    public void setIloscOkien(int iloscOkien) {
        this.iloscOkien = iloscOkien;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }

    public void setPiwnica(boolean piwnica) {
        this.piwnica = piwnica;
    }

    public String getMiejscowosc() {
        return miejscowosc;
    }

    public String getUlica() {
        return ulica;
    }

    public int getIloscPokoi() {
        return iloscPokoi;
    }

    public int getNrDomu() {
        return nrDomu;
    }

    public int getIloscOkien() {
        return iloscOkien;
    }

    public int getCena() {
        return cena;
    }

    public boolean isPiwnica() {
        return piwnica;
    }
}
