package Ex1;

public class IPod extends Eletronico {
    public IPod(String cor, String modelo, String marca, Boolean ligado) {
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

    public String trocarMusica() {
        return "Trocando de musica";
    }

    public String aumentarVolume() {
        return "Aumentando volume";
    }

    public String baixarVolume() {
        return "Baixando volume";
    }
}
