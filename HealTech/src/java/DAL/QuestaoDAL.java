/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import MODEL.Questao;

public class QuestaoDAL {
    
    /*public StringBuilder selectCategoria()throws SQLException, ClassNotFoundException {
        categorias = selectCategoriaSQL();
        StringBuilder jsonBuilder = new StringBuilder();
        
        jsonBuilder.append("[");
        for(Categoria categoria : categorias){
            if(jsonBuilder.length() > 1){
                jsonBuilder.append(",");
            }
            jsonBuilder.append("{");
            jsonBuilder.append("\"id\":").append(categoria.Id()).append(",");
            jsonBuilder.append("\"descricao\":\"").append(categoria.DescricaoCategoria()).append("\"");
            jsonBuilder.append("}");
        }
        jsonBuilder.append("]");
        return jsonBuilder;
    }*/
    
    /*private List<Categoria> selectCategoriaSQL() throws SQLException, ClassNotFoundException {
        
        List<Categoria> categorias = new ArrayList<>();
        String query = "SELECT  ID, DESCRICAO, FLG_ATIVO  FROM `tb_categoria` WHERE FLG_ATIVO = 1";
        
        try (Connection conn = ConnectionDAL.connectionOpen(); Statement stmt = conn.createStatement(); ResultSet res = stmt.executeQuery(query)) {
            while(res.next()){
                Categoria obj = new Categoria();
                obj.Id(Integer.parseInt(res.getString("ID")));
                obj.DescricaoCategoria(res.getString("DESCRICAO"));
                obj.CategoriaFLG(Integer.parseInt(res.getString("FLG_ATIVO")));
                categorias.add(obj);
            }
        } catch(SQLException e){
            throw e;
        }
        return this.categorias = categorias;
    }*/
    
    public boolean insertCategoria(Questao paramQuestao) throws SQLException, ClassNotFoundException {        
        
        String table = "`tb_questao`(`ID_CATEGORIA`, `ID_TIPO_RESPOSTA`, `DESCRICAO`, `FLG_ATIVO`, `DT_ORIGEM`)";
        String values = "('"+paramQuestao.IdCategoria()+"','"+paramQuestao.IdTipoResposta()+"','"+paramQuestao.DescricaoQuestao()+"', 1, now())";
        String query = "INSERT INTO "+table+"  VALUES "+values+" ";
        
        try (Connection conn = ConnectionDAL.connectionOpen(); Statement stmt = conn.createStatement()){
            stmt.executeUpdate(query);
            return true;
        } catch(SQLException e){
            return false;
        }
    }

}
