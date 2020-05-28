
package recursohumano;
import java.sql.SQLException;
import java.util.Scanner;

public class Update {

    Update()throws SQLException{
        Scanner leer = new Scanner (System.in);
        Persona person=new Persona();
        ConexionCRUD utilerias =new ConexionCRUD();
        System.out.println("<< ACTUALIZAR REGISTROS >>");
        
        System.out.println("Ingrese id del registro A modificar");
        person.setIdPersona(leer.nextInt());
        
        String tablaBuscar="tb_contacto";
        String camposBuscar="id_contacto, nom_contacto, email_contacto, tel_contacto";
        String condicionBuscar= "id_contacto= "+person.getIdPersona();
         utilerias.desplegarRegistro(tablaBuscar, camposBuscar, condicionBuscar);
      
         System.out.println("Nombre");
         person.setNomPersona(leer.next());
         
         System.out.println("Correo Electrónico: ");
         person.setEmailPersona(leer.next());
         
         System.out.println("Telefono: ");
         person.setTelPersona(leer.next());
         
         String tabla="tb_contacto";
    String camposValoresNuevos="nom_contacto= '"+ person.getNomPersona()+ "',email_contacto='"
            +person.getEmailPersona()+ "' , tel_contacto = '"+ person.getTelPersona()+"'";
    
    utilerias.actualizarEliminarRegistro(tabla, camposValoresNuevos, condicionBuscar);
    System.out.println("Modificar correctamente!");
    
    MenuPrincipal.desplegarMenu();
    }
    
}
