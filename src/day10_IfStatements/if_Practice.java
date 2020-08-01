package day10_IfStatements;

import java.util.Scanner;

/*
HTTP is the protocol that governs communications between web servers
 and web clients (i.e. browsers).
Part of the protocol includes a status code returned by the server to tell the browser
 the status of its most recent page request.
Some of the codes and their meanings are listed below:
    status codes:
        200, OK
        201, Created
        202, Accepted
        301, Moved Permanently
        303, See Other
        304, Not Modified
        307, Temporary Redirect
        400, Bad Request
        401, Unauthorized
        403, Forbidden
        404, Not Found
        410, Gone
        500, Internal Server Error
        503, Service Unavailable
​
1. declare an int variable called StatusCode
2. write a if statement that prints out, on a line by itself, the appropriate label from
the above list based on status.
                    Example:
                        if status code = 200
                        output: ok
                        if status code = 201:
                        output: Created
            NOTE: use single if statements ONLY. DO NOT use more that one print statement

 */
public class if_Practice {
    public static void main(String[] args) {

        System.out.println("Enter your code please");
        int statusCode=200;
       String message ="";
        if(statusCode==200){
            message="OK";
        }else if(statusCode==201){
            message="Created";
        }else if (statusCode==202){
            message="Accepted";
        }else if (statusCode==301){
            message="Moved Permanently";
        }else if (statusCode==303){
            message="See Other";
        }else if (statusCode==304){
            message="Not Modified";
        }else if (statusCode==307){
            message="Temporary Redirect";
        }else if (statusCode==400){
            message="Bad Request";
        }else if (statusCode==401){
            message="Unauthorized";
        }else if (statusCode==403){
            message="Forbidden";
        }else if (statusCode==404){
            message="Not Found";
        }else if (statusCode==410){
            message="Gone";
        }else if (statusCode==500){
            message="Internal Server Error";
        }else if (statusCode==503){
            message="Service Unavailable";
        }else {
            message="Invalid number";
        }
        System.out.println(message);
        /*
        307, Temporary Redirect
        400, Bad Request
        401, Unauthorized
        403, Forbidden
        404, Not Found
        410, Gone
        500, Internal Server Error
        503, Service Unavailable
         */







    }
}
