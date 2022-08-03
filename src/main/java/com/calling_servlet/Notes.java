package com.calling_servlet;
/*CALLING A SERVLET FROM THE SERVLET
 * + just create another servlet
 * + create a RequestDispatcher object on the class you wanna call 
 *   here is wehre you past the url patter request
 * + then you have to send the variables */

/**PASSING DATA FROM SERVLET TO SERVLET
 * for that there is something called SESSION MANAGEMENT
 * there you say req.setAttribute and pass in what you wanna send 
 * then you gonna do the same one the other class but there you say getAttribute
 * 
 * WE CAN ALSO USE REDIRECT OR HTTPSESSION
 * I myself prefer http session 
 * you create its object and those two class you wanna use and bingo
 * one more thing when you use http session it is easy to locate with REDIRECT*/

/*WE CAN ALSO USE COOKIES
 * cookies is like when you go to the market to buy something and then the shopkeeper 
 * doesnt have a change so that she/he gives you something to remember you 
 * when you come back for the change
 * 
 * TO CREATE COOKIE IS SIMPLE COOKIE IS ALSO A CLASS
 * + Cookie cookie = new Coookie();
 * + res.addCookie(cookie);
 *   and also in other servlet ther are some code to write
 * + passs cookies to an array
 * + use enhanced for loop with if in it so that you specify which cookie you want
 * + that is it then display it 
 *   dont check the codes I didnt want to write it */






