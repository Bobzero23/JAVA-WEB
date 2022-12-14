/* in our demo html class we tried to add two numbers but for that we need a SERVLET
 *
 * we will create a normal java class and that will behave just like a servlet
 * + right click the project you are working with
 * + create a normal java class
 * give it a name and give the package a name like com.bobzero
 *
 * but the java class needs to extend HttpServlet you will also need to import this
 * and for this to work we need to create a method called public void service this is neccesary
 * what this method does is to request and send a response to the user
 * so the method must take these two objects as parameters
 * (HttpRequest req, HttpResponse res)
 * yeah dont forget to import those two things*/


/*NOW WE NEED TO CONNECT JAVA CLASS WITH HTML CLASS
 * for that we gonna use the WEB.XML which also called DEPLOYMENT DISCRIPTOR in the WEB.INF folder
 * we gonna configure that when we say add we mean the java class
 * + open the xml and clean the welcom tags now
 * not then you gonna need two tags
 * + servlet tag
 * + serlet-mapping tag
 *
 * in the servlet tag you need two tags
 * + servlet-name tag
 * + servlet-class tag
 *
 * also in the servlet-mapping tag you need two tags
 * + servlet-name tag
 * + url-pattern
 * you need a servlet name tag because in you application you might have a couple servlets
 * and make sure the servlet-names are having the same name
 * the servlet-class will have the name of the clas start with the package name
 * and url-patter will have the name of the url in your html class */

/* NOW WE ARE CONNECTED BUT THIS WONT PRINT THE ANSWER ON THE BROWSER BUT IN THE CONSOLE
 * TO SOLVE THIS JUST USE GIT WRITER
 * + PrintWriter out = res.getWriter() --> this one throws some exception;
 * out.println(k);*/