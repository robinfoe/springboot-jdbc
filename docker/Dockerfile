FROM registry.access.redhat.com/redhat-openjdk-18/openjdk18-openshift:latest 

ARG JAR_FILE
ARG BASE_DIR

#RUN mkdir /deployments

COPY scripts/launch.sh /deployments/launch.sh
COPY maven/$JAR_FILE /deployments
#RUN chmod -R 777 /deployments

#CMD ["/deployments/launch.sh"]
