#!/bin/bash
LABEL=$(date +'%Y%m%d-%H%M%S')
mvn clean package && docker build -t janmabomi/rail:$LABEL .
docker rm -f rail || true && docker run -it -p 8080:8080 -p 4848:4848 --name rail janmabomi/rail:$LABEL

