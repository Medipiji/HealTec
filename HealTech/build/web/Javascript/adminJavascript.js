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

function atualizarSelect(){
    var xhr = new XMLHttpRequest();
    xhr.open('GET','/HealTech/categoria/get', true);
    xhr.setRequestHeader('Accept','application/json');
    
    xhr.onreadystatechange = function(){
      if(xhr.readyState === 4 && xhr.status === 200){
        var data = JSON.parse(xhr.responseText);
          
         console.log(data);
        selectOptions.innerHTML = "";
        for(var i = 0; i < data.length; i++){
            var option = document.createElement('option');
            console.log(data[i]);
            option.value = data[i].id;
            option.text = data[i].descricaoCategoria;
            selectOptions.append(option);
        }
            
        /*data.forEach(option => {
        const optionElement = document.createElement("option");
        optionElement.value = option.value; // Altere isso para se adequar à sua estrutura de dados
        optionElement.textContent = option.label; // Altere isso para se adequar à sua estrutura de dados
        selectOptions.appendChild(optionElement);});*/
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

