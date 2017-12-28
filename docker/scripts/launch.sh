#!/bin/sh

cd /deployments
java -Dspring.config.location=${APP_CONFIG_FILE} -jar springboot-jdbc-1.0.0.jar