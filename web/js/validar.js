/*window.onload=function(){
    var botao = document.getElementById("validarr");
    botao.onclick=function(){
        validarFormulario();
    }
}*/
function validarFormulario(){
    var formulario = document.getElementById("formulario");
    var palavra = formulario.palavra.value;
    var chave = formulario.chave.value;
    var re_palavra =  /^([a-zA-Z]|\s)+$/;
    var re_chave = /^([a-zA-Z]|\s)+$/;
     
    if(palavra===""){
        alert("Preencha o campo palavra");
        document.getElementById("palavra").focus();
        return false;
    }else if (!re_palavra.test(palavra)){
        alert("O campo palavra deve conter apenas letras");
        document.getElementById("palavra").select();
        return false;
    }else if(/\s/.test(palavra)){
    alert("O campo palavra não pode conter espaços em branco, ou entre palavras!");
        document.getElementById("palavra").select();
        return false;    
    } else if(chave ===""){
        document.getElementById("chave").focus();
        alert("Preencha o campo chave");
        return false;    
    }else if(!re_chave.test(chave)){
        alert("O campo chave deve conter apenas letras");
        document.getElementById("chave").select();
        return false;
    }else if(/\s/.test(chave)){
    alert("O campo chave não pode conter espaços em branco, ou entre palavras!");
        document.getElementById("chave").select();
        return false;    
    }else{
    return true;
    }
}