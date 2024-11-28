package Clases;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Usuarios {
    private Conector conector;

    public Usuarios() {
        this.conector = new Conector(); // Instancia del conector a la base de datos
    }

    /**
     * Verifica las credenciales del usuario en la base de datos.
     * 
     * @param username El nombre de usuario ingresado.
     * @param password La contraseña ingresada.
     * @return true si las credenciales son válidas, false de lo contrario.
     */
    public boolean verificarCredenciales(String username, String password) {
        String query = "SELECT password FROM Credenciales WHERE username = ?";
        try {
            conector.conectar(); // Asegurarse de que la conexión esté activa
            PreparedStatement ps = conector.getConnection().prepareStatement(query);
            ps.setString(1, username);

            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                String passwordDB = rs.getString("password");
                
                // Comparar contraseñas (puedes implementar hashing aquí)
                return password.equals(passwordDB);
            }
        } catch (SQLException ex) {
            System.err.println("Error al verificar credenciales: " + ex.getMessage());
        } finally {
            conector.desconectar(); // Cerrar la conexión
        }
        return false;
    }
}
