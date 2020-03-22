# 
Build : docker build -t docker-demo-3 .

Mysql: docker run -p 7100:7000 --network="host" --env="DATABASE_HOST=localhost" --env="DATABASE_PORT=3306" --env="DATABASE_NAME=server_20200321" --env="DATABASE_USER=root" --env="DATABASE_PASSWORD=root" docker-demo-2


Postgresql: docker run -p 7000:7100 --network="host" --env="DATABASE_HOST=192.168.1.5" --env="DATABASE_PORT=5432" --env="DATABASE_NAME=postgres" --env="DATABASE_USER=postgres" --env="DATABASE_PASSWORD=postgrespassword" docker-demo-4

