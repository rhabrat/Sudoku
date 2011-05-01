#!/bin/bash
#------------------------------------------------------------------
# sbt driver script.
#------------------------------------------------------------------

maxheap=1024M
debug=

if [ -n "$debug" ] ; then
 echo "Running in debug mode, port: $debug"
 JAVA_OPTIONS="$JAVA_OPTIONS -Xdebug -Xrunjdwp:transport=dt_socket,server=y,suspend=n,address=$debug"
fi

# -XX:+CMSClassUnloadingEnabled -XX:MaxPermSize=256m is supposed to reduce PermGen errors.
echo env java $JAVA_OPTIONS -Xmx$maxheap -XX:+CMSClassUnloadingEnabled -XX:MaxPermSize=256m -jar lib/sbt-launch-0.7.4.jar "$@"
env java $JAVA_OPTIONS -Xmx$maxheap -XX:+CMSClassUnloadingEnabled -XX:MaxPermSize=256m -jar lib/sbt-launch-0.7.4.jar "$@"
