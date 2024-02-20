package Ex1;

import java.util.ArrayList;

public class Bolsa {
    public ArrayList<Eletronico> compartimento;

    public Bolsa() {
        compartimento = new ArrayList<>();
    }

    public void adicionarItens(Eletronico item) {
        this.compartimento.add(item);
    }

    public void listaItensDaBolsa() {
        for (Eletronico item : this.compartimento) {
            System.out.println(item.getModelo());
        }
    }
}
