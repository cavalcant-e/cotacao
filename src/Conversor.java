import com.google.gson.Gson;
import com.google.gson.GsonBuilder;


import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Conversor{

public RecordRetorno conversao(String par1, String par2) throws IOException, InterruptedException {

    Scanner entrada = new Scanner(System.in);
    Double valor = 0.0;

    System.out.println("Digite o valor para efeturar a conversao:");
    valor   = entrada.nextDouble();
    String chave = "INSIRA SUA CHAVE PARA TESTAR";
    String endereco =  "https://v6.exchangerate-api.com/v6/"+ chave +"/pair/"+par1+"/"+par2+"/"+valor;



    HttpClient client = HttpClient.newHttpClient();
    HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create(endereco))
            .build();

    HttpResponse<String> response = client
            .send(request, HttpResponse.BodyHandlers.ofString());

    Gson gson = new GsonBuilder().setLenient().create();
    RecordRetorno retorno = new Gson().fromJson(response.body(), RecordRetorno.class);
    var d = retorno.conversion_result();

    String msg = "Conversão efetuada de "+valor+" de "+par1+" para "+par2+" é: "+ d;

    System.out.println(msg );

    return  retorno;



//    Gson gson = new GsonBuilder().setLenient().create();
//    Pessoa pessoa = gson.fromJson(jsonPessoa, Pessoa.class);
//
//    System.out.println("Objeto Pessoa: " + pessoa);


}


}
