<%-- 
    Document   : gerarcifra
    Created on : 26/12/2017, 06:47:48
    Author     : Alex Souza
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cifra Vigenere</title>
    </head>
        <body>
            <div id="geral">     
                <div id ="header">
                <h4><a href="home.jsp">Limpar</a></h4>
               </div>
                <div id="conteudo">
                    <div id="conteudo-left"> 
                    <br>
                    <jsp:include page="home.jsp"></jsp:include>                        
                    </div> 
                    <div id="">                    
                    </div>
                        <div id="conteudo-rigth">                            
                            <%
                             String cifra[][] = (String[][])request.getAttribute("cifra");
                            %>
                                <table border rules="cols">                 
                                    <%
                                        for(int linha=0; linha<cifra.length; linha++){
                                    %>
                                    <tr> 
                                    <%
                                        for(int coluna=0; coluna <cifra.length; coluna++){
                                    %>          
                                        <td><%=cifra[linha][coluna]%></td>

                                         <%}%>
                                    </tr>     
                                        <%}%> 
                                </table> 
                        </div>
                </div>
                <div id="f">
                </div>
        </div>            
    </body>
</html>
