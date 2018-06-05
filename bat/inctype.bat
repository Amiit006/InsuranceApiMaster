@echo off
cd C:\AmitSahoo\InsuranceApi\InsuranceApiMaster\InsuranceApi-InsuranceType-Service
docker build -f Dockerfile -t insuranceapi-insurancetype-service .
docker run -p 8082:8082 insuranceapi-insurancetype-service