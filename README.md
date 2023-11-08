# jpaHibernate
## Requirements
*Java 17
*Spring-Boot 3.1.5
*PostgreSql
*Lombok

## End-Points
| Method  | URI | Description |
| --- | --- | --- |
| GET  | /person | Find All |
| GET  | /person | Find By Id |
| POST | /person | Register |
| PUT | /person/{id} | Update |
| DELETE | /person/{id} | Delete |

**JSON BODY DATA REGISTER**
```
  {
    "name": "Euripedes Doutor",
    "email": "juniordoutor@gmail.com"
  }
```
**JSON BODY DATA UPDATE**
```
  {
    "name": "Euripedes Doutor Filho",
    "email": "juniordoutor_test@gmail.com"
  }
```
