@echo off
cd C:\AmitSahoo\InsuranceApi\InsuranceApiMaster\InsuranceApi-Policy-Service
docker build -f Dockerfile -t insuranceapi-policy-service .
docker run -p 8083:8083 insuranceapi-policy-service