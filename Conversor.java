package ConversorDeMonedas;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Conversor {
    private Valores valores;
    public Conversor() {
        this.ConversorConexion();
    }

    public Valores ConversorConexion(){
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/9e4631cdd00832d8bbcda4d3/latest/USD");

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        try {
            HttpResponse<String>response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            Cambios cambios = new Gson().fromJson(response.body(), Cambios.class);

            return this.valores =cambios.conversion_rates();
        } catch (IOException | InterruptedException e) {
            System.out.println(e.getMessage());
            System.out.println("Error en el cambio");;
        }
        return null;
        }

        public double dolarAPesoArgentino (double numero){
        return numero * valores.ARS();
        }
        public double pesoArgentinoADolar(double cantidad) {
            return cantidad / valores.ARS();
        }

        public double dolarABrasil(double cantidad) {
            return cantidad * valores.BRL();
        }

        public double brasilADolar(double cantidad) {
            return cantidad / valores.BRL();
        }

        public double dolarAPen(double cantidad) {
            return cantidad * valores.PEN();
        }

        public double penADolar(double cantidad) {
            return cantidad / valores.PEN();
        }
    }


