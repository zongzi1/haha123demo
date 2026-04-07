#!/bin/bash
cd /opt/app
nohup java -jar *.jar > app.log 2>&1 &