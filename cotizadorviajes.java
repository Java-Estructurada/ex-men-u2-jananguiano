import java.util.scanner;
public class cotizadorviajes;
private static final double;
DESC_VUELO_NINO = 0.50;
private static final double
DESC_HOTEL_NINO = 0.30;
private static final double
DESC_PORC_COM = 0.12;
public static void main (straing [ ] args ) {
    scanner sc =new scanner (system.in);
    System.out.print ("Cotizador de viajes express");
    System.out.print ("Adultos:");
    Int Adultos = sc.nextInt();
    system.out.print ("Niños:");
    Int Ninos = sc.next.Int();
    System.out.print ("Noches de Hotel");
    Int noches = sc.nextInt();
    System.out.print ("Tarifa Base vuelo (por adulto):");
    double tarifaVuelo = sc.nextDouble();
    System.out.print ("Tarifa base Hotel por noche (Por Adulto)");
    double tarifaHotel = sc.nextDouble();
    double costovuelos = CalcularCostoVuelos (adultos, ninos, tarifaVuelo);
    double costoHotel = CalcularCostoHotel (adultos, ninos, noches, tarifaHotel);
    double subtotal = costovuelos + costoHotel;
    double comision = subtotal + PORC_COMISION;
    double totalGlobal = subtotal + comision;
    


}


