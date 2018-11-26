# Comp-360-Project-3

Objective: Java language provides mechanisms to support security. Exception is one of these language structures. Using exception can increase the reliability of software products and handle unexpected events. In this project students will apply object-oriented techniques and exception to the assigned problem. 

Project Assignment

In project 2 your team implemented a ticket reservation system for United Airlines by using object-oriented programming techniques. 
Let us use exception to handle an airplane full situation in this project. 

The United Airlines has multiple airplanes that fly between Greensboro and Newark every day. 
On December 6 there are two airplanes. 
One will departure from Greensboro at 7:00 AM and the other will departure from Greensboro at 2:00 PM. 
Each airplane has 20 seats that are all economic class. Each seat has a number associated with it. 
The reservation system must satisfy the following requirements:

1.	A constructor sets the date, time and number of seats.
2.	A method airplaneFull to check if there are any seats available
3.	A person purchases an airplane ticket via purchaseTicket method.
4.	If a customer tries to buy a ticket but the all tickets were sold an allTicketSold exception will occur. The corresponding exception handler must display tickets sold out information that must include date and time.
5.	If a customer bought a ticket the date, time and seat number should be displayed. 
6.	If a customer returned a ticket the seat will become available.
