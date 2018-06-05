@echo off
cd C:\AmitSahoo\InsuranceApi\InsuranceApiMaster\InsuranceApi-Underwriter-Service
docker build -f Dockerfile -t insuranceapi-underwriter-service .
docker run -p 8085:8085 insuranceapi-underwriter-service