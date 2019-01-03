#!/bin/sh

nohup java -Dserver.port=8090 -jar /boostApp.jar > /var/log/boostApp.log &

while true; do
  sleep 1000
done
