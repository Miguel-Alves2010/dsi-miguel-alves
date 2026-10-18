
package psv;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

    public static Connection abrirConexao() {
        Connection con = null;

        String url = "jdbc:mysql://localhost:3306/estacionamento";

        try {
            con = DriverManager.getConnection(
                url,
                "root",
                ""
            );

            System.out.println("Conexão aberta.");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return con;
    }

    public static void fecharConexao(Connection con) {
        try {
            if (con != null && !con.isClosed()) {
                con.close();
                System.out.println("Conexão fechada.");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
