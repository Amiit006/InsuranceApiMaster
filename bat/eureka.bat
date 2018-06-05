@echo off
cd C:\AmitSahoo\InsuranceApi\InsuranceApiMaster\eureka-server
docker build -f Dockerfile -t eureka-server .
docker run -p 8090:8090 -t eureka-server