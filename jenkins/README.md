# Jenkins job
This Jenkins job is to pull your application source code from GitHub and build your application by maven, then create docker image and push this image to the docker image repository.

To run this Jenkins job few prerequisite Jenkins plugin required
1. git 
2. maven
3. running docker daemon


change 'PLACEHOLDER' string with an appropriate value according to your environment 

example

1. git url:PLACEHOLDER                                                                  == git url:'https://github.com/opsmx11/boostApp.git'

2. sh "sudo docker login index.docker.io --username PLACEHOLDER --password PLACEHOLDER" == sh "sudo docker login index.docker.io --username opsmx --password opsmx"

3. sh "sudo docker tag boostapp:$BUILD_NUMBER PLACEHOLDER"                              == sh "sudo docker tag boostapp:$BUILD_NUMBER index.docker.io/opsmx11/restapp:boostapp"

4. sh "sudo docker push PLACEHOLDER"                                                    == sh "sudo docker push index.docker.io/opsmx11/restapp:boostapp"
