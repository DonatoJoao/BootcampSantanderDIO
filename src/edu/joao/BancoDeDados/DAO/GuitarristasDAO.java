package edu.joao.BancoDeDados.DAO;

import edu.joao.BancoDeDados.Conexao.Conexao;
import edu.joao.BancoDeDados.Entidade.Guitarristas;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class GuitarristasDAO {
    public void cadastrarGuitarristas(Guitarristas guitarrista){

        String sql = "INSERT INTO GUITARRISTA (NOME, MODELOGUITARRA, QUANTIDADEGRAVACOES, IDADE, ANOSTOCANDOGUITARRA) VALUES (? , ?, ?, ?,?)";
        PreparedStatement ps = null;

        try {
            ps = Conexao.getConexao().prepareStatement(sql);
            ps.setString(1, guitarrista.getNome());
            ps.setString(2, guitarrista.getModeloGuitarra());
            ps.setInt(3, guitarrista.getIdade());
            ps.setInt(4,guitarrista.getAnosTocandoGuitarra());
            ps.setInt(5,guitarrista.getQuantidadeGravacoes());

            ps.execute();
            ps.close();
        } catch (SQLException e){
            e.printStackTrace();
        }
    }
}
