/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktek1si4;

/**
 *
 * @author akagami
 */
public class nasigorengsuper {
    public static void main(String[] args) {
        nasigoreng ekstra_pedas = new nasigoreng();
        nasigoreng kambing = new nasigoreng();
        nasigoreng hati = new nasigoreng();
        
        ekstra_pedas.bumbu_masak = "reyco garam cabe rawit ";
        ekstra_pedas.peralatan_masak = "wajan kompor spatulla ";
        ekstra_pedas.diskon_harga = 5;
        ekstra_pedas.harga_nasigoreng = 10000 ;
        ekstra_pedas.kreasi_nasigoreng = "bentuk yang unik dan sederhana ";
        
        kambing.bumbu_masak = "reyco garam cabe rawit ";
        kambing.peralatan_masak = "wajan kompor spatulla ";
        kambing.diskon_harga = 5;
        kambing.harga_nasigoreng = 10000 ;
        kambing.kreasi_nasigoreng = "bentuk yang unik dan sederhana ";
        
        hati.bumbu_masak = "reyco garam cabe rawit ";
        hati.peralatan_masak = "wajan kompor spatulla ";
        hati.diskon_harga = 5;
        hati.harga_nasigoreng = 10000 ;
        hati.kreasi_nasigoreng = "bentuk yang unik dan sederhana ";
        
        ekstra_pedas.menu_nasigoreng();
       kambing.menu_nasigoreng();
       hati.menu_nasigoreng();
    
}
