package conversor;

import com.google.gson.Gson;
import java.util.Map;
import java.util.Scanner;

public class Conversor {

    private static final String[] MONEDAS = {"USD", "ARS", "BRL", "COP"};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        APIClient apiClient = new APIClient();
        Gson gson = new Gson();

        String json = apiClient.obtenerDatosJson();
        if (json == null) return;

        Moneda moneda = gson.fromJson(json, Moneda.class);
        Map<String, Double> tasas = moneda.getConversionRates();

        int opcion;
        do {
            exibirMenu();
            opcion = scanner.nextInt();

            if (opcion >= 1 && opcion <= 6) {
                System.out.print("Ingrese el valor a convertir: ");
                double cantidad = scanner.nextDouble();

                String origen = "";
                String destino = "";

                switch (opcion) {
                    case 1 -> { origen = "USD"; destino = "ARS"; }
                    case 2 -> { origen = "ARS"; destino = "USD"; }
                    case 3 -> { origen = "USD"; destino = "BRL"; }
                    case 4 -> { origen = "BRL"; destino = "USD"; }
                    case 5 -> { origen = "USD"; destino = "COP"; }
                    case 6 -> { origen = "COP"; destino = "USD"; }
                }

                double tasaOrigen = tasas.get(origen);
                double tasaDestino = tasas.get(destino);
                double resultado = (cantidad / tasaOrigen) * tasaDestino;

                System.out.printf("%.2f %s equivale a %.2f %s%n", cantidad, origen, resultado, destino);
            }

        } while (opcion != 7);

        System.out.println("Gracias por usar el Conversor de Moneda. ¡Hasta pronto!");
    }

    public static void exibirMenu() {
        System.out.println("""
                ******************************************************
                Sea bienvenido/a al Conversor de Moneda =]

                1) Dólar =>> Peso argentino
                2) Peso argentino =>> Dólar
                3) Dólar =>> Real brasileño
                4) Real brasileño =>> Dólar
                5) Dólar =>> Peso colombiano
                6) Peso colombiano =>> Dólar
                7) Salir
                Elija una opción válida:
                ******************************************************
                """);
    }
}
