<%-- 
    Document   : cifravigenere
    Created on : 26/12/2017, 00:30:23
    Author     : Alex Souza
--%>

<%@page import="br.com.fatecpg.cifra.Cifra"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="css/estilo.css"/>        
        <script type="text/javascript" src="js/validar.js"></script>        
	<title>Cifra Vigenere</title>
    </head>
    <body>
        <div id="geral">   
            <div id=""></div> 
                <div id ="conteudo">
                    <div id="conteudo-left">
                        <form action="Controlador?acao=gerarCifra" method="post">
                        <input type="submit" name="gerar" value="Gerar Cifra"> 
                        </form>
                            <br>
                            <form id="formulario" action="Controlador?acao=cifrar" method="post" onsubmit="return validarFormulario();">
                            <fieldset>
                                <legend>Cifra de Vigenére</legend>
                                    Palavra:
                                    <br>
                                    <input id="palavra" type="text" name="palavra" placeholder="Somente letras">	
                                    <br><br>
                                    Chave:
                                    <br>
                                    <input id="chave" type="text" name="chave" placeholder="Somente letras!">	
                                    <br><br>      	 
                                    <input id="validar" type="submit" name="cifrar" value="Cifrar Palavra">
                                    <br>
                                    <p id="msg"></p>
                            </fieldset>
                        </form>
                    </div>
                </div>            
            <div id="f"></div>  
        </div>
    </body>
</html>