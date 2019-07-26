#!/bin/bash

curl  -H "Content-Type:application/json" -X POST -d '{"name":"MARY", "password":"SMITH"}' "localhost:18080/user/"
curl  -H "Content-Type:application/json" -X POST -d '{"name":"Lee", "password":"12345678"}' "localhost:18080/user/"
curl  -H "Content-Type:application/json" -X POST -d '{"name":"LINDA", "password":"WILLIAMS"}' "localhost:18080/user/"

curl -o filmresult.txt "localhost:18080/film/?page=4&pageSize=10"

curl -H "Content-Type:application/json" -X POST -d '{"customerId":1111,"firstName":"huang","lastName":"weixiang","email":"1234","address":"47 MySakila Drive"}' "localhost:18080/customer/"

curl -H "Content-Type:application/json" -X PUT -d '{"customerId":1111,"firstName":"handsome","lastName":"huangwx","email":"6666","address":"47 MySakila Drive"}' "localhost:18080/customer/"

curl -X DELETE  "localhost:18080/customer/1111"


