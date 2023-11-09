function teste(){alert("testado");}
const selectOptions = document.getElementById("selectCategoria");

function showCreateCategory(){
    const divShowCard = document.getElementById("createContentHolderIDCategory");
    divShowCard.classList.toggle("create-content-holder-show");
    bgBlack.classList.toggle("bg-black-show");
}

function showCreateQuestion(){
    const divShowCard = document.getElementById("createContentHolderIDQuestion");
    divShowCard.classList.toggle("create-content-holder-show");
    bgBlack.classList.toggle("bg-black-show");
}

document.addEventListener("DOMContentLoaded", function(){
    atualizarSelect();
});

function atualizarSelect(){
    var xhr = new XMLHttpRequest();
    xhr.open('GET','/HealTech/categoria/get', true);
    xhr.setRequestHeader('Accept','application/json');
    
    xhr.onreadystatechange = function(){
      if(xhr.readyState === 4 && xhr.status === 200){
        var data = JSON.parse(xhr.responseText);

        selectOptions.innerHTML = "";
        for(var i = 0; i < data.length; i++){
            var option = document.createElement('option');
            option.value = data[i].id;
            option.text = data[i].descricao;
            selectOptions.append(option);
        }
      }  
    };
    xhr.send();
}


document.getElementById('enviaCategoria').addEventListener('submit', async function (event) {
    event.preventDefault();
    
    const formData = new FormData(event.target);
    const data = new URLSearchParams(formData).toString();
   
    await fetch("/HealTech/categoria/send",{
       method:'POST',
       body: data,
       headers: { 'Content-Type':'application/x-www-form-urlencoded' }
    })
    .then(response => {
        if(response.ok){
            console.log("Sucesso");
        } else {
            console.log("Deu algum problema");
        }
    })
    .catch(err => console.error("Erro em: ", err));
   
});

document.getElementById('enviaQuestao').addEventListener('submit', async function (event) {
    event.preventDefault();
    
    const formData = new FormData(event.target);
    const data = new URLSearchParams(formData).toString();
   
    await fetch("/HealTech/questao/send",{
       method:'POST',
       body: data,
       headers: { 'Content-Type':'application/x-www-form-urlencoded' }
    })
    .then(response => {
        if(response.ok){
            console.log("Sucesso");
        } else {
            console.log("Deu algum problema");
        }
    })
    .catch(err => console.error("Erro em: ", err));
   
});

