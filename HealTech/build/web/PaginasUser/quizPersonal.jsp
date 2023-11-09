<%-- 
    Document   : content
    Created on : 05/11/2023, 15:35:42
    Author     : jr_ma
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<div class="container">
    <jsp:include page="../PaginasUser/sideMenu.jsp"/>
    <jsp:include page="../PaginasUser/header.jsp"/>
    <main>
        <form>
            <div class="card-holder">
                <div class="card-header">
                    <h2>1 - Soft Skill</h2>
                </div>
                <div class="hr-cyan"></div>
                <div class="card-content">
                    <p>Você percebe que teu líder sabe identificar as emoções que sente?</p>
                    <!-- inicio radio op -->
                    <div class="radio-div">
                        <span onclick="selectOption(this)">1</span>
                        <span onclick="selectOption(this)">2</span>
                        <span onclick="selectOption(this)">3</span>
                        <span onclick="selectOption(this)">4</span>
                        <span onclick="selectOption(this)">5</span>
                        <input type="hidden" id="" name="" value="">
                    </div>
                    <!-- fim radio op -->
                </div>
            </div>

            <div class="card-holder">
                <div class="card-header">
                    <h2>1 - Soft Skill</h2>
                </div>
                <div class="hr-cyan"></div>
                <div class="card-content">
                    <p>Você percebe que teu líder sabe identificar as emoções que sente?</p>
                    <!-- inicio radio op -->
                    <div class="radio-div">
                        <label>Resposta:</label>
                        <input type="text"/>
                    </div>
                    <!-- fim radio op -->
                </div>
            </div>
        </form>
    </main>
    <jsp:include page="../PaginasUser/footer.jsp"/>
</div>
