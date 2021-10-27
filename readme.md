# Setup Instructions

## Databases

See application properties [file](./src/main/resources/application.properties) for database connection information. Update `spring.datasource.url`, `spring.datasource.username` and `spring.datasource.password` accordingly.

The setup is using PostgreSQL. Use the following SQL Commands to setup a database.
```sql
CREATE DATABASE demodb;
CREATE USER demouser WITH ENCRYPTED PASSWORD 'password';
GRANT ALL PRIVILEGES ON DATABASE demodb to demouser; 
```

The `spring.jpa.hibernate.ddl-auto=create` configuration will automatically create a table based on the @Entity annotated class file located [here](./src/main/java/com/example/demo/entity/Book.java).

## Run Spring Application

On your Terminal, navigate to the root directory of this project and run `./mvnw spring-boot:run` to start the project.

## Endpoints

- GET /book will return an array of books
- POST /book with request body `{
"title":"Book B",
"author":"Peter",
"publishedDate":"2021-01-01T00:00:00.000"
}`

See the RestController class file [here](./src/main/java/com/example/demo/controller/BookController.java).