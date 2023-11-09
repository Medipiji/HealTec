<%-- 
    Document   : insertQuestion
    Created on : 05/11/2023, 23:07:13
    Author     : jr_ma
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<div class="container">
    <jsp:include page="../PaginasUser/sideMenu.jsp"/>
    <jsp:include page="../PaginasUser/header.jsp"/>
    
    <main>
        <div class="card-holder">
            <div class="card-header">
                <h2>Registrar</h2>
            </div>
            <div class="hr-cyan"></div>
            <div class="card-content">
                <p>Qual opção deseja registrar?</p>
                <!-- inicio radio op -->
                <div class="create-div">
                    <span id="criarCategoria" onclick="showCreateCategory()">Criar Categoria</span>
                    <span id="criarQuestao" onclick="showCreateQuestion()">Criar Questão</span>
                </div>
                <!-- fim radio op -->
            </div>
        </div>
    </main>
    
    <jsp:include page="../PaginasUser/footer.jsp"/>
    
    
        
    <div id="createContentHolderIDCategory" class="create-content-holder">
        <div class="create-content">
            <div class="card-header">
                <h2>Cadastro</h2>
            </div>
            <div class="hr-cyan"></div>
            <div class="card-content">
            <form id="enviaCategoria">
                 <div class="radio-div">
                    <label>Nova Categoria</label>
                    <input type="text" name="categoriaInput">
                </div> 
                <div class="create-div">
                    <button type="submit">Registrar</button>
                    <span onclick="showCreateCategory()">Cancelar</span>
                </div>
            </form>
            </div>
        </div>
    </div>
    
    
    
    

    <div id="createContentHolderIDQuestion" class="create-content-holder"  onload="atualizarSelect()">
        <div class="create-content">
            <div class="card-header">
                <h2>Cadastro</h2>
            </div>
            <div class="hr-cyan"></div>
            <div class="card-content">
            <form id="enviaQuestao">
                <div class="radio-div">
                    <label>Categoria:</label>
                    <select name="categoriaInput" id="selectCategoria">
                    </select>
                </div>
                <div class="radio-div">
                    <label>Questão:</label>
                </div>
                <div class="radio-div">
                    <input type="text" name="questaoInput">
                </div>
                <div class="radio-div">
                    <h2>Questão do tipo:</h2>
                </div>
                <div class="choice-div">
                    <div class="radio-div"> 
                        <input type="radio" name="tipoPerguntaInput" value="1">
                        <label>Dissertativa</label>
                    </div>
                    <div class="radio-div">     
                        <input type="radio" name="tipoPerguntaInput" value="2">
                        <label>Alternativa</label>
                    </div>
                </div>
                <div class="create-div">
                    <button type="submit">Registrar</button>
                    <span onclick="showCreateQuestion()">Cancelar</span>
                </div>
            </form>
            </div>
        </div>
    </div>
    
    
</div>