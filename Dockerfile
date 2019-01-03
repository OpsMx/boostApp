FROM java:8

ADD target/boostApp.jar /boostApp.jar
COPY runAgent.sh /usr/local/bin/runAgent.sh
RUN chmod +x /usr/local/bin/runAgent.sh

CMD ["runAgent.sh"]
