# Spring Boot Bean Viewer

This Spring Boot application provides insights into the beans present in the Spring context. It offers two simple endpoints for basic interaction with the application.

It has been inspired from this [official guide](https://spring.io/guides/gs/spring-boot) offered by Spring Team.

## Endpoints

### `GET /`
Returns a simple greeting message.

**Response Example:**
```
Hello world !, hit /beans endpoint to see all the beans.
```


### `GET /beans`
Returns a list of all beans defined in the Spring application context, along with their names and types.

**Response Example:**
```
{
  "beanCount": 155,
  "beans": [
    {
      "name": "org.springframework.context.annotation.internalConfigurationAnnotationProcessor",
      "type": "org.springframework.context.annotation.ConfigurationClassPostProcessor"
    },
    {
      "name": "org.springframework.context.annotation.internalAutowiredAnnotationProcessor",
      "type": "org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor"
    },
    ...........
  ]
}
```
