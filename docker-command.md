docker build -t docker-demo-3 .

docker run -p 7100:7000 --network="localhost" --env="DATABASE_HOST=192.168.43.170" --env="DATABASE_PORT=3306" --env="DATABASE_NAME=server_20200321" --env="DATABASE_USER=root" --env="DATABASE_PASSWORD=root" docker-demo-2


