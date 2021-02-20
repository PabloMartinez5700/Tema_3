import Modelo.Usuario;

public class gfhgh {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("pablo@gmail.com","Pablo",664872337,2000);
        String clavenueva = "hola";

        System.out.println(usuario.coficarClave(usuario.getClave()));
        usuario.cambioClave(clavenueva);

        System.out.println(usuario.getClave());
        System.out.println(usuario.coficarClave(usuario.getClave()));
    }
}
