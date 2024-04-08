import java.sql.*;

public class SistemaReservasVuelos {
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/sistema_reservas_vuelos";
    static final String USER = "root";
    static final String PASS = "dbrootpass";

    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        try {
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.createStatement();

            boolean salir = false;
            while (!salir) {
                System.out.println("\nMENU");
                System.out.println("1. Alta Vuelo");
                System.out.println("2. Alta Pasajero");
                System.out.println("3. Reserva Vuelo");
                System.out.println("4. Modificar reserva");
                System.out.println("5. Baja reserva");
                System.out.println("6. Salir");

                System.out.print("Ingrese una opción: ");
                int opcion = Integer.parseInt(System.console().readLine());

                switch (opcion) {
                    case 1:
                        altaVuelo(conn);
                        break;
                    case 2:
                        altaPasajero(conn);
                        break;
                    case 3:
                        reservaVuelo(conn);
                        break;
                    case 4:
                        modificarReserva(conn);
                        break;
                    case 5:
                        bajaReserva(conn);
                        break;
                    case 6:
                        salir = true;
                        break;
                    default:
                        System.out.println("Opción inválida.");
                }
            }

            stmt.close();
            conn.close();
        } catch (SQLException se) {
            se.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (stmt != null) stmt.close();
            } catch (SQLException se2) {
            }
            try {
                if (conn != null) conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
    }

    public static void altaVuelo(Connection conn) throws SQLException {
        // Lógica para el alta de vuelo
    }

    public static void altaPasajero(Connection conn) throws SQLException {
        // Lógica para el alta de pasajero
    }

    public static void reservaVuelo(Connection conn) throws SQLException {
        // Lógica para la reserva de vuelo
    }

    public static void modificarReserva(Connection conn) throws SQLException {
        // Lógica para modificar reserva
    }

    public static void bajaReserva(Connection conn) throws SQLException {
        // Lógica para baja de reserva
    }
}