function teste(){alert("testado");}
const bgBlack = document.getElementById("bgBlackID");

document.getElementById("menu").addEventListener("click", showMenu);
document.getElementById("menu-mobile").addEventListener("click", showMenu);
bgBlack.addEventListener("click", showMenu);

function showMenu(){
    const sidebar = document.getElementById("sidebarID");
    sidebar.classList.toggle("sidebar-show");
    bgBlack.classList.toggle("bg-black-show");
}



function selectOption(element){
    var allOptions = document.querySelectorAll(".radio-div>span");
    for (var i = 0; i < allOptions.length; i++) {
        allOptions[i].classList.remove("selected");
    }
    element.classList.add("selected");
}