package maua.br.dao;

import maua.br.model.Carta;
import maua.br.model.ListaCartas;
import maua.br.parser.StatusParser;

import java.sql.*;
import java.util.List;

/**
 * Classe CartDAO, possui metodos para criar, atualizar e deletar, para facilitar esses processos
 * quando necessário
 *
   * @author Henrique Silva Godoy - RA: 16.01147-3
   * @author Lucas Menezes - RA: 16.00683-6
   *
   * @since 21/09/2020
   * @version 1.0
 */
public class CartaDAO implements DAO<Carta> {
    private Connection connection;
    private String myDBConnectionString = "jdbc:sqlite:pokemon.db";

    public CartaDAO() {

        try {
            connection = DriverManager.getConnection(myDBConnectionString);

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public List<Carta> getAll() {
        ListaCartas listaCartas = new ListaCartas();
        try {
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery("SELECT * FROM pokemon");
            while (result.next()) {
                Carta carta = new Carta(
                        result.getString("url"),
                        result.getString("id"),
                        result.getString("nome"),
                        //        StatusParser.toStatus(result.getString("raridade")), ---> mudar a chave do banco de dados
                        result.getString("serie"),
                        result.getString("colecao"));
                listaCartas.add(carta);

            }
            result.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listaCartas.getLista();

    }

    @Override
    public void update(Carta carta) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("UPDATE pokemon SET url =?, id = ?, nome = ?, serie = ?, colecao =? WHERE nome = ?;"); // dps que arrumar a key do sql, colocar raridade como paramentro
            preparedStatement.setString(1, carta.getUrl());
            preparedStatement.setString(2,carta.getId());
            preparedStatement.setString(3,carta.getNome());
         // preparedStatement.setString(4, carta.getRaridade());
            preparedStatement.setString(4,carta.getSerie());
            preparedStatement.setString(5,carta.getColecao());
            // Executa o PreparedStatement
            int retorno = preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void delete(Carta carta) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("DELETE FROM pokemon WHERE nome = ?");
            preparedStatement.setString(1, carta.getNome());
            preparedStatement.executeLargeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void create(Carta carta) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO pokemon(url, id, nome, serie, colecao) VALUES (?,?,?,?,?)"); // dps que arrumar a key do sql, colocar raridade como paramentro
            preparedStatement.setString(1, carta.getUrl());
            preparedStatement.setString(2,carta.getId());
            preparedStatement.setString(3,carta.getNome());
            // preparedStatement.setString(4, carta.getRaridade());
            preparedStatement.setString(4,carta.getSerie());
            preparedStatement.setString(5,carta.getColecao());
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}

