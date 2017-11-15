/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilitários;

import DAO.MatrizesDAO;
import java.util.ArrayList;
import java.util.List;
import JavaBeans.Matrizes;

/**
 *
 * @author heito
 */
public class numerosLivres {

    public numerosLivres() {
    }

    public static List<numerosLivres> verificaNumerosLivres() {

        List lista = new ArrayList();
        MatrizesDAO dao = new MatrizesDAO();
        List<Matrizes> lista1 = dao.numerosLivres();
        int aux = 1;

        // Verifica a lista de numeros de todas as matrizes cadastradas.
        // Caso o numero da matriz seja diferente do numero sequencial 
        // dado com "aux", salva em uma nova lista o numero que é vago
        for (Matrizes m : lista1) {
            if (Integer.parseInt(m.getNumero()) != aux) {
                lista.add(aux);

                while (aux != Integer.parseInt(m.getNumero())) {
                    if (aux == Integer.parseInt(m.getNumero()) - 1) {
                        aux++;
                        break;
                    } else {
                        aux++;
                        lista.add(aux);
                    }
                }

            } else {
            }
            aux++;
        }
        // Verifica se existem 60 numeros vagos na lista
        // Se não, adiciona mais numeros sequenciais até completar 60
        if (lista.size() < 61) {
            while (lista.size() < 61) {
                lista.add(aux);
                aux++;
            }
        }
        return lista;
    }
}
