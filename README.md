# bank-customer-services

**Description** : Application to validate Bank Customer KYC Details

**Tech Stack** : Spring Boot, MySQL, Eureka Server, OpenFeign, Resilience4j

**Overview** :

1. **Spring Boot** : Develops REST endpoints to retrieve and modify data stored in a MySQL database.
2. **MySQL Database** : Manages and stores customer details, Aadhar card information, and PAN card data.
3. **Eureka Server** : Registers all autonomous microservices to facilitate effective communication.
4. **OpenFeign** : Integrates data retrieval from AadharCard Service and PanCard Service into Customer Service.
5. **Resilience4j** : Implements circuit breaker to isolate service interruptions and protect other services.

**API Documentation** :

1. **Add Aadhar Card** -> POST /aadhardetails
2. **Find Aadhar Card by Aadhar No.** -> GET /aadhardetails/find/{aadharNo}
3. **Find Aadhar Card by Aadhar No.** -> GET /aadhardetails/{aadharNo}
4. **Retrieve All Aadhar Cards** -> GET /aadhardetails
5. **Delete Aadhar Card** -> DELETE /aadhardetails
6. **Add PAN Card** -> POST /pandetails
7. **Find PAN Card by PAN No.** -> GET /pandetails/{panNo}
8. **Find PAN Card by PAN No.** -> GET /pandetails/find/{panNo}
9. **Retrieve All PAN Cards** -> GET /pandetails
10. **Delete PAN Card** -> DELETE /pandetails
11. **Add Customer** -> POST /customerdetails
12. **Find Customer by Account No.** -> GET /customerdetails/{accNo}
13. **Retrieve All Customers** -> GET /customerdetails
14. **Delete Customer by Account No.** -> DELETE /customerdetails/{accNo}
15. **Validate Aadhar Card (KYC)** -> GET /customerdetails/kyc/{accNo}/{aadharNo}
16. **Validate PAN Card** -> GET /customerdetails/panvalidate/{accNo}/{panNo}
