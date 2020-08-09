# Demo project using graphQL

TIPS: for use Lombok install plugin and restart IDEA

[API: http://localhost:8080/graphiql](http://localhost:8080/graphiql)

## Mutation
query:
```
mutation {
  createVehicle(type: "Car", modelCode: "LandCruser", brandName: "Toyota", launchDate: "2020-01-10")
  {
    id
  }
}
```
answer:
```
{
  "data": {
    "createVehicle": {
      "id": "2",
      "modelCode": "LandCruser"
    }
  }
}
```

## Query
query:
```
query {
  vehicles(count: 2) {
    id, type, modelCode, modelCode, launchDate
  }
}
```

answer:
```
{
  "data": {
    "vehicles": [
      {
        "id": "1",
        "type": "Car",
        "modelCode": "XYZ0192",
        "launchDate": "2016-08-16"
      },
      {
        "id": "2",
        "type": "Car",
        "modelCode": "LandCruser",
        "launchDate": "2020-01-10"
      }
    ]
  }
}
```

### Documentation:
* [Руководство по GraphQL для начинающих (RUS)](https://tproger.ru/translations/graphql-beginners-guide/)
* [Официальная документация (ENG)](https://graphql.org/learn/)
* [The Fullstack Tutorial for GraphQL (ENG)](https://www.howtographql.com/)