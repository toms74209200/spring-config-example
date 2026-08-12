# spring-config-example

Three ways to bind `greeter.message` in Spring Boot, and what each one does when the value is
wrong.

## Usage

```bash
./gradlew bootRun
```

From another terminal:

```bash
curl "http://localhost:8080/greet?name=alice"
{"greeting":"Hello from the record, alice"}
```

```bash
SPRING_PROFILES_ACTIVE=field ./gradlew bootRun
```

```bash
curl "http://localhost:8080/greet?name=alice"
{"greeting":"Hello from field injection, alice"}
```

```bash
SPRING_PROFILES_ACTIVE=envvar GREETER_MESSAGE="Hello from the environment" ./gradlew bootRun
```

```bash
curl "http://localhost:8080/greet?name=alice"
{"greeting":"Hello from the environment, alice"}
```

```bash
SPRING_PROFILES_ACTIVE=envvar ./gradlew bootRun
APPLICATION FAILED TO START

    Property: greeter.message
    Value: "null"
    Reason: must not be blank
```

```bash
./gradlew test
```

## License

[MIT License](LICENSE)

## Author

[toms74209200](<https://github.com/toms74209200>)
