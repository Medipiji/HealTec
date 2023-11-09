/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package MODEL;

public class Questao {

    int id, idCategoria, idTipoResposta;
    String descricaoQuestao;
    boolean questaoFLG;
    
    public int Id(){ return this.id; } 
    public void Id(int param){ this.id = param; }
    
    public int IdCategoria(){ return this.idCategoria; } 
    public void IdCategoria(int param){ this.idCategoria = param; }
    
    public int IdTipoResposta(){ return this.idTipoResposta; } 
    public void IdTipoResposta(int param){ this.idTipoResposta = param; }
    
    public String DescricaoQuestao(){ return this.descricaoQuestao; } 
    public void DescricaoQuestao(String param){ this.descricaoQuestao = param; }
    
    public boolean QuestaoFLG(){ return this.questaoFLG; } 
    public void QuestaoFLG(int param){ this.questaoFLG = (param == 1); }
    
}
