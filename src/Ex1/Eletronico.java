package Ex1;

abstract class Eletronico {
    private String cor;
    private String modelo;
    private String marca;
    private boolean ligado;

    public String getCor () {
        return this.cor;
    }

    public void setCor (String cor) {
        this.cor = cor;
    }

    public String getModelo () {
        return this.modelo;
    }

    public void setModelo (String modelo) {
        this.modelo = modelo;
    }

    public String getMarca () {
        return this.marca;
    }

    public void setMarca (String marca) {
        this.marca = marca;
    }

    public boolean isLigado () {
        return this.ligado;
    }

    public void setLigado (boolean ligado) {
        this.ligado = ligado;
    }

    abstract String ligado();
}
