package maua.br.dao;

import java.util.List;

// <T> = interface funciona para qualquer tipo (str, int, bool, etc)

public interface DAO <T> {
    List <T> getAll();
    void update (T t);
    void delete (T t);
    void create (T t);

}
