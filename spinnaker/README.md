# Spinnaker pipeline definition 

This pipeline definition contains two stages first jenkinsjob and second deploy. 
Pipeline file contains a JSON, change 'PLACEHOLDER' string with an appropriate value according to your environment 


example

1. "account": "PLACEHOLDER"   --    "account": "my-k8s-account"
2. "account": "PLACEHOLDER"   --    "account": "opsmx-docker-registry"
3. "imageId": "PLACEHOLDER"   --    "imageId": "index.docker.io/opsmx11/restapp:boostapp"
4. "registry": "PLACEHOLDER"  --    "registry": "index.docker.io"
5. "tag": "PLACEHOLDER"       --    "tag": "boostapp"
6. "name": "PLACEHOLDER"      --    "name": "opsmx11-restapp"
7. "job": "PLACEHOLDER"       --    "job": "restApp_withdatadog"
8. "master": "PLACEHOLDER"    --    "master": "my-jenkins-master"
