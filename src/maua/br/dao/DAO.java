package maua.br.dao;

import java.util.List;



/** Interface DAO
 * Interface que serve de base para os comandos do SQL
 * @param <T> - interface funciona para qualquer tipo (str, int, bool...)
 *
 * @author Henrique Silva Godoy - RA: 16.01147-3
 * @author Lucas Menezes - RA: 16.00683-6
 *
 * @since 21/09/2020
 * @version 1.0
 */
public interface DAO <T> {
    List <T> getAll();
    void update (T t);
    void delete (T t);
    void create (T t);

}
