FLYWAY_HOME=C:/Program Files/flyway-9.8.1
MIGRATION_HOME=C:/Users/indramulyanto/Project/Java/jatismobilecodingtest/src/main/resources/flyway

$FLYWAY_HOME/flyway -configFiles=$MIGRATION_HOME/flyway.conf -locations=filesystem:$MIGRATION_HOME/sql migrate