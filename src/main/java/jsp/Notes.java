/* JSP stands for Java Servlet Pages
 * 
 * it makes easier to work with begger and complex web pages
 * 
 * DIFFERENCE BETWEEN JSP AND SERVLET
 * in servlet you can write the html code inside the java code which might become super messy for bigger projects
 * in jsp we we write the java code inside the html code which is way more easier and efficient
 * 
 * JSP will give you the REQUESTS and RESPONSE objects so you dont have to initiate them
 * alo jsp gives you the object of PRINTWRITER just say out.println() and you are good to go
 * 
 * 
 *  TO WORK WITH JSP
 *  simply create a jsp file
 *  isnide it will be some html code if not write yourself damn it hhh
 *  then you should write the java code inside this <% hereJavaCode %>
 *  
 *  TO CALL JSP FILE IN HTML FILE
 *  simply in the FORM tag of html write the JSP file name and you are good to go
 *  
 *  
 *  JUST YOU KNOW THAT EVERY JSP FILE IS CONVERTED TO SERVLET
 *  <% here %> whatever you write inside these tags will go to the service method, or doGetor doPost
 *  <%! here %> whatever you write inside tese tags will go outside the servive method but inside the class
 *  <%@page here %> inside this tag you write your imports example <%@here import = "java.uitl.*"%>
 *  what if you have multiple imports, okay this is what you will do 
 *  <%@page import = "java.util.*, java.uitl.Scanner"%>
 *  <%= here %> whatever you write inside this will go to out.print(whatever)
 *  The list of the names of these brackets by order scriplet, declaration, directive, expression.
 *  
 *  
 *  THERE ARE MANY THINGS TO WORK WITH BUT I WILL EXPLAIN BY TIME AS I LEARN
 *  
 *  EXCEPTION HANDLING
 *  the best way to handle the excption is to create an ERROR PAGE, this is just a normal jsp file 
 *  whichi we will use to handle any error in other files.. is better to define it as an error page 
 *  and to do that simply in DIRECTIVE TAG say isErrorPage = "true" then you can the exception object inside the
 *  expression tag like this <%= exception.getMassage()%> to print any error. btw if you do initiate as an
 *  error page these object wont work for this file  and dont forget also to initiate the error page 
 *  in the class you want to handle the erros like errorPage = "NameOfTheErrorPage" 
 *  
 *  
 *  
 *  
 *  
 */