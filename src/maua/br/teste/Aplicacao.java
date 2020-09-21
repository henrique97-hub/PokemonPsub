package maua.br.teste;


import maua.br.model.Carta;

import java.sql.*;

/**
 * Aplicacao - Classe de testes do programa, para detectar e previnir erros no código
 *
 * @author Henrique Silva Godoy - RA: 16.01147-3
 * @author Lucas Menezes - RA: 16.00683-6
 *
 * @since 21/09/2020
 * @version 1.0
 */
public class Aplicacao {
    public void run(){
        try {
            Connection connection = DriverManager.getConnection("jdbc:sqlite:pokemon.db");
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery("SELECT * FROM pokemon");
            while(result.next()){
                Carta carta = new Carta(
                        result.getString("url"),
                        result.getString("id"),
                        result.getString("nome"),
                        result.getString("serie"),
                        result.getString("colecao")

                );
                System.out.println(carta);

            }
            result.close();
            // Inserir uma nova carta
                Carta carta = new Carta("teste","teste","teste","teste","teste");
            // Inserir uma carta no banco
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO pokemon (url, id, nome, serie, colecao)" +
                    "VALUES (?,?,?,?,?);"); // Os ? siginifica que os campos serao preenchidos depois
            preparedStatement.setString(1, carta.getUrl());
            preparedStatement.setString(2, carta.getId());
            preparedStatement.setString(3, carta.getNome());
            preparedStatement.setString(4, carta.getSerie());
            preparedStatement.setString(5, carta.getColecao());
            // Executa o PreparedStatment
            int retorno = preparedStatement.executeUpdate();
            System.out.println("Retorno:"+retorno);
            result = statement.executeQuery("SELECT * FROM pokemon");

            while(result.next()) {
                Carta novaCarta = new Carta(
                        result.getString("url"),
                        result.getString("id"),
                        result.getString("nome"),
                        result.getString("serie"),
                        result.getString("colecao"));
                System.out.println(novaCarta);
            }
            result.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}
