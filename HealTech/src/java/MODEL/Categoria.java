/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODEL;

import java.io.Serializable;

public class Categoria implements Serializable {
    
    int id;
    String descricaoCategoria;
    boolean categoriaFLG;
    
    public int Id(){ return this.id; } 
    public void Id(int param){ this.id = param; }
    
    public String DescricaoCategoria(){ return this.descricaoCategoria; } 
    public void DescricaoCategoria(String param){ this.descricaoCategoria = param; }
    
    public boolean CategoriaFLG(){ return this.categoriaFLG; } 
    public void CategoriaFLG(int param){ this.categoriaFLG = (param == 1); }
    
}
