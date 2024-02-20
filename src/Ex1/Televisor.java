package Ex1;

public class Televisor extends Eletronico {
    public Televisor(String cor, String modelo, String marca, Boolean ligado) {
        super.setCor(cor);
        super.setModelo(modelo);
        super.setMarca(marca);
        super.setLigado(ligado);
    }

    public String ligado() {
        super.setLigado(true);

        return super.getModelo() + " está ligado" ;
    }

    public String desligado() {
        super.setLigado(false);

        return super.getModelo() + " está desligado" ;
    }

    public String trocarCanal() {
        return "Trocando de canal";
    }

    public String aumentarVolume() {
        return "Aumentando volume";
    }

    public String baixarVolume() {
        return "Baixando volume";
    }
}
