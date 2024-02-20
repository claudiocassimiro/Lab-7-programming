package Ex1;

public class Smartphone extends Eletronico {
    public Smartphone(String cor, String modelo, String marca, Boolean ligado) {
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

    public String fazerLigação(String numero) {
        return "Ligando para " + numero;
    }

    public String tirarFoto() {
        return "Tirando foto";
    }

    public String pesquisarNaInternet(String termo) {
        return "Pesquisando " + termo;
    }
}
