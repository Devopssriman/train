FROM payara/micro
COPY ./target/rail.war $DEPLOY_DIR
