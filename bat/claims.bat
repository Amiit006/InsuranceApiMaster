@echo off
cd C:\AmitSahoo\InsuranceApi\InsuranceApiMaster\InsuranceApi-Claims-Service
docker build -f Dockerfile -t insuranceapi-claims-service .
docker run -p 8081:8081 insuranceapi-claims-service