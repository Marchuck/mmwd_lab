/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package problemzaopatrzeniasklepu;

/**
 *
 * @author lukasz
 */
public class Produkt {
    public int ilosc;
    public float cena;
    /**
     * 
     * @param tyle - ilość produktu
     * @param kasa - jednostkowa cena produktu
     */
    public Produkt(int tyle, int kasa){
        ilosc = tyle; cena = kasa;
    }
}
