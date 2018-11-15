#!/bin/sh

ps -ef|grep cn-tuchangle-web-|grep -v grep|awk '{print $2}'|xargs kill

sleep 1

cd `dirname $0`

java -jar cn-tuchangle-web-1.0.0-SNAPSHOT.jar --spring.config.additional-location=cn-tuchangle-web.properties &
