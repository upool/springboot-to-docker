# springboot demo Greeting 

## application than is put in docker container...

API running on localhost...

<p align="left"> 
	<img src="https://github.com/upool/springboot-to-docker/blob/master/springboot-running-localhost.png" width="600"/> 
</p>



The project contain a dockerfile
<p align="left"> 
	<img src="https://github.com/upool/springboot-to-docker/blob/master/Dockerfile.PNG" width="600"/> 
</p>


1.-  run:

$ docker build "rute to springboot-to-docker folder" -t greeting

2.- run:

$ docker run --name=greeting -p 8080:8080 greeting

3.- springboot greeting app running on the docker container

<p align="left"> 
	<img src="https://github.com/upool/springboot-to-docker/blob/master/springboot-running.png" width="600"/> 
</p>


<p align="left"> 
	<img src="https://github.com/upool/springboot-to-docker/blob/master/springboot-running-docker.png" width="600"/> 
</p>


