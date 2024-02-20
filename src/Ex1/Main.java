package Ex1;

public class Main {
    public static void main (String[] args) {
        Bolsa bolsa = new Bolsa();
        Televisor tv = new Televisor("Amarelo", "TV LG-155", "LG", false);
        IPod iPod = new IPod("Branco", "Apple iPod-255", "Apple", false);
        Smartphone smartphone = new Smartphone("Preto", "Sony Experia-355", "Sony", false);

        // tv
        System.out.println(tv.ligado());
        System.out.println(tv.desligado());
        System.out.println(tv.trocarCanal());
        System.out.println(tv.aumentarVolume());
        System.out.println(tv.baixarVolume());

        System.out.println("================");

        // iPod
        System.out.println(iPod.ligado());
        System.out.println(iPod.desligado());
        System.out.println(iPod.trocarMusica());
        System.out.println(iPod.aumentarVolume());
        System.out.println(iPod.baixarVolume());

        System.out.println("================");

        // smartphone
        System.out.println(smartphone.ligado());
        System.out.println(smartphone.desligado());
        System.out.println(smartphone.fazerLigação("999999999"));
        System.out.println(smartphone.tirarFoto());
        System.out.println(smartphone.pesquisarNaInternet("AQW"));

        System.out.println("================");

        // bolsa
        System.out.println("Adicionando iPod");
        bolsa.adicionarItens(iPod);
        System.out.println("Adicionando tv");
        bolsa.adicionarItens(tv);
        System.out.println("Adicionando Smartphone");
        bolsa.adicionarItens(smartphone);

        System.out.println("================");

        System.out.println("Listando eletronicos");
        bolsa.listaItensDaBolsa();
    }
}
