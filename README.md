# HCDD-412

Building and running the Docker container

To build the Docker: 
In bash or other command prompt navigate to the root directory of your peoject where the Dockerfile is located. 
From here run the command "docker build -t gameflixx-backend ."

Once this is completed run the following command 
"docker run -p 8080:8080 gameflix-backend"

Then test the container by opening the backend via http://localhost:8080

You can also verify the container is running by using this command "docker ps" which will display a table of containers displaying the Dockerfile container just created. 

