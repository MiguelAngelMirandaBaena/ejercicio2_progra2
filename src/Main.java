import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //cliente
        Cliente carlos = new Cliente(1, "Carlos", "Perez", "Vargas");

        //ciudad
        Ciudad cochabamba = new Ciudad (1, "Cochabamba");
        Ciudad santaCruz = new Ciudad(2, "Santa Cruz");
        Ciudad tarija = new Ciudad(3,"Tarija");

        //categoria
        Categoria turista = new Categoria(1, "Turista");

        //aeropuertos
        Aeropuerto jorgeWilstermann = new Aeropuerto("JW","Jorge Wilstermann Camacho", cochabamba);
        Aeropuerto viruviru = new Aeropuerto("VV", "Viru Viru", santaCruz);
        Aeropuerto oriellea = new Aeropuerto("OL", "Oriel Lea Plaza", tarija);

        //vuelos
        List<Vuelo> vuelos = new ArrayList<>();
        Vuelo cochabambaSantaCruz = new Vuelo("BOA-777", Calendar.getInstance().getTime(), jorgeWilstermann, viruviru);
        vuelos.add(cochabambaSantaCruz);
        Vuelo santaCruzTarija = new Vuelo("BOA-547", Calendar.getInstance().getTime(), viruviru, oriellea);
        vuelos.add(santaCruzTarija);

        //billete
        Billete billete = new Billete(1, Calendar.getInstance().getTime(), 650.5, carlos, cochabamba, tarija, turista, vuelos);

        System.out.println("Billete");

        System.out.println("=======");
        System.out.println("Id: " + billete.getIdBillete());
        System.out.println("Fecha:" + billete.getFechaEmision());
        System.out.println("Precio total:" + billete.getPrecio());
        System.out.println("Cliente:" + billete.getCliente().getNombre());
        System.out.println("Origen:" + billete.getOrigen().getNombre());
        System.out.println("Destino:" + billete.getDestino().getNombre());
        System.out.println("Categoria:" + billete.getCategoria().getNombre());
        System.out.println("Vuelos:");
        for (Vuelo vuelo:billete.getVuelos()){
            System.out.println("Codigo vuelo: " + vuelo.getCodigoVuelo()+"| Salida:" + vuelo.getSalida() + "| Origen: " + vuelo.getOrigen().getNombre()+ " | Destino:" + vuelo.getDestino().getNombre());


        }


    }
}
