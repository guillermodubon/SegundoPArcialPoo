public class Adapter extends NuevoServicio implements EShopUniverseIneterface {

    private NuevoServicio adaptador;

    @Override
    public void pagoPayPal(String nombre, String contrasenia) {

        System.out.println("Pago realizado por: "+nombre+": "+"paypal");

    }
}
