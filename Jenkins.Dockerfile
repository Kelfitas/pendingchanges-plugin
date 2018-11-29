FROM jenkins/jenkins

USER root

COPY ./target/pending-changes.hpi /var/jenkins_home/plugins/
RUN mkdir -p /var/jenkins_home/plugins && \
    chown -R jenkins:jenkins /var/jenkins_home/plugins && \
    ls -lah /var/jenkins_home/

USER jenkins
