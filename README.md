GET http://localhost:8080/lions – Get all lions.
POST http://localhost:8080/lions – Add a new lion (body: { "lionId": 1, "name": "mufasa", "description": "the father of simba", "age": 30.0 }).
GET http://localhost:8080/lions/1 – Get a specific lion by ID.
DELETE http://localhost:8080/lions/1 – Delete a lion by ID. 
