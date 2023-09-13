package semana22.exercicios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class BuscarAlunoPorNome {
    public static void main(String[] args) throws SQLException {

        String url = "jdbc:mysql://localhost/alunosdb?user=root&password=mateus&useSSL=true";
        Connection conn = DriverManager.getConnection(url);

        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        String sql = "SELECT * FROM alunos WHERE nome = ?;";
        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setString(1, name);
        ResultSet rs = pstm.executeQuery();

        while(rs.next()) {

            if(rs.getString("nome").equals(name)) {
                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                String email = rs.getString("email");
                boolean ativo = rs.getBoolean("ativo");

                System.out.println(id);
                System.out.println(nome);
                System.out.println(email);
                System.out.println(ativo);
            }
        }

        sc.close();
        pstm.close();
        conn.close();
    }
}