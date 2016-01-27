The program here is not completely done, nor is it exactly implemented in it's final intended form.
The original intent was to have a console server application which handles all message transmission,
and a client which connects to the server. At first it looked like sockets can handle multiple connections,
but just as I was finishing the backend I realized that they cannot and the code to handle multiple connections
would take longer to put in place than the amount of time I have. 

To get by this issue and have a somewhat working program, I quickly set it up as a peer-to-peer connection
with only two members: a server and a client. The code I already had (which can be found in the "Unit6" git 
branch) was adapted to suit this new form quite hastily. Thus, many of the solutions are not as elegant as
they could be, and would be much better once a multi-connection server is implemented. 

The ServerGUI class is essentially the ClientGUI with a little extra code to run a server underneath.
This would not exist in the final program, at least not in it's current state.

To run the program in it's current state, launch "LaunchGUI" and start a server. For testing on one machine,
open a server instance on some port and a client connecting to the server port at the ip "localhost." 

========================TO BE IMPLEMENTED=======================================

1: Contacts. I have the classes done and the list in place, but no code has yet been written to implement
this. 

2: Server-client group chat. I already touched on this

3: Lists: the list in the top left will show the people in a group chat. The list in the bottom
left will show contacts
========================FINAL THOUGHTS=======================================
The time I've had to work on this was spent mostly on the backend. Thus, some user
features are a little lacking but the core functionality is there and I'm pleased
with what I have accomplished.
There is a chance I might play around with this project more this week and in 
the future. Everything will go on GitHub so pulling the project should ensure the most
updated code.