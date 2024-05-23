import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner entrada = new Scanner(System.in);

        int selecao;

        System.out.println("""
                Seja Bem vindo ao conversor de moedas\n
                
                1) Dolar =>> Peso argentino
                2) Peso argentino =>> Dolar
                3) Dolar =>> Real
                4) Real =>> Dolar
                5) Dolar =>> Peso colombiano
                6) Peso colombiano =>> Dolar
                7) Sair                
                
                """);

        Conversor conversor = new Conversor();

         selecao  = entrada.nextInt();
        switch (selecao){

            case 1:
            System.out.println(" Selecionado a opção 1");
            conversor.conversao("USD", "ARS");

            break;

            case 2:
                System.out.println(" Selecionado a opção 2");
                conversor.conversao("ARS", "USD");
                break;

            case 3:
                System.out.println(" Selecionado a opção 3");
                conversor.conversao("USD", "BRL");
                break;

            case 4:
                System.out.println(" Selecionado a opção 4");
                conversor.conversao("BRL", "USD");
                break;

            case 5:
                System.out.println(" Selecionado a opção 5");
                conversor.conversao("USD", "COP");
                break;

            case 6:
                System.out.println(" Selecionado a opção 6");
                conversor.conversao("COP", "USD");
                break;

            default:
                System.out.println("Opção invalida");
                break;

        }















    }



}
