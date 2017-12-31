<%-- 
    Document   : cifra
    Created on : 26/12/2017, 01:50:28
    Author     : Alex Souza
--%>

<%@page import="br.com.fatecpg.cifra.Cifra"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
       <title>Cifra de Vegenere</title>
    </head>
        <body>
            <div id="geral"><br>
                <div id="conteudo">
                    <div id="conteudo-left">
                       <%
                            String[] palavraCifrada = (String[])request.getAttribute("palavraCifrada");                            
                        %>   
                            <%
                            out.println("Palavra Cifrada: ");
                            for(int i = 0; i < palavraCifrada.length; i++){
                            out.print(palavraCifrada[i]);                            
                            }%>
                        <h4><a href="home.jsp">Limpar</a></h4>
                        <jsp:include page="home.jsp"></jsp:include>      
                        
                    </div>
                    <div id="conteudo-rigth">
                        <%                            
                        String cifra[][] = Cifra.gerarCifra();
                        %>
                        <table border rules="cols">                 
                            <%
                            for(int linha=0; linha<cifra.length; linha++){
                            %>
                            <tr> 
                                <%
                                for(int coluna=0; coluna <cifra.length; coluna++){
                                %>          
                                <td>
                                    <%=cifra[linha][coluna]%>
                                </td>

                                <%}%>
                            </tr>     
                            <%}%> 
                        </table>
                    </div>    
                </div>
        </div>
    </body>
</html>