@echo off
cd C:\AmitSahoo\InsuranceApi\InsuranceApiMaster\InsuranceApi-Premium-Service
docker build -f Dockerfile -t insuranceapi-premium-service .
docker run -p 8084:8084 insuranceapi-premium-service