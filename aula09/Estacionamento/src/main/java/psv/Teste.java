
package psv;

import java.sql.Connection;
import java.util.List;

public class Teste {

    public static void main(String[] args) {

        Connection con = Conexao.abrirConexao();

        if (con == null) {
            System.out.println("Não foi possível conectar.");
            return;
        }

        CarroBean cb = new CarroBean();
        CarroDAO cd = new CarroDAO(con);

        // Testando a inserção
        cb.setPlaca("JKK1900");
        cb.setCor("Azul");
        cb.setDescricao("Carro 1");

        System.out.println(cd.inserir(cb));

        // Testando a listagem
        List<CarroBean> lista = cd.listarTodos();

        if (lista != null) {
            for (CarroBean carro : lista) {
                System.out.println("Placa: " + carro.getPlaca());
                System.out.println("Cor: " + carro.getCor());
                System.out.println("Descrição: " + carro.getDescricao());
                System.out.println("--------------------");
            }
        }

        Conexao.fecharConexao(con);
    }
}
