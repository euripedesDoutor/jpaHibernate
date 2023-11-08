# jpaHibernate
## Requirements
*Java 17
*Spring-Boot 3.1.5
*PostgreSql
*Lombok

## End-Points
*GET /person (Find All)
*GET /person/{id} (Find By Id)
*POST /person (Resgister)
### JSON BODY DATA
```
  {
    "name": "Euripedes Doutor",
    "email": "juniordoutor@gmail.com"
  }
```
*PUT /person/{id} (Update)
### JSON BODY DATA
```
  {
    "name": "Euripedes Doutor Filho",
    "email": "juniordoutor_test@gmail.com"
  }
```
*DELETE /person/{id}
## 
