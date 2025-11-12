# HCDD-412

Building and running the Docker container
ran ./mvnw.cmd clean install
<img width="443" height="257" alt="image" src="https://github.com/user-attachments/assets/6e7992f4-d402-4cb3-9c29-0113bd3b034e" />

docker build <img width="469" height="441" alt="image" src="https://github.com/user-attachments/assets/65e7c8cd-1a7f-445f-9f5f-42f2c61a196d" />

To build the Docker: 
In bash or other command prompt navigate to the root directory of your peoject where the Dockerfile is located. 
From here run the command "docker build -t gameflixx-backend ."

Once this is completed run the following command 
"docker run -p 8080:8080 gameflix-backend"

Then test the container by opening the backend via http://localhost:8080

You can also verify the container is running by using this command "docker ps" which will display a table of containers displaying the Dockerfile container just created. 

