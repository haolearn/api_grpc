### compile
- 编译 proto api (  ==without== google apis,http mapping support)
```
 protoc --java_out=src/main/java  -I./src/main/proto/api ./src/main/proto/api/*.proto
```
- 例子：生成policy  service.proto GRPC java代码,(不编译model.proto等）
```
# 生成policy  service.proto GRPC java stub代码：PolicyServiceGrpc.java
    protoc --plugin=protoc-gen-grpc-java=/home/hao/soft/grpc-java/compiler/build/exe/java_plugin/protoc-gen-grpc-java --grpc-java_out=./src/main/java --proto_path=./src/main/proto/api service.proto
```
- 例子：生成policy的go代码，go源码目录下运行：
protoc --go_out=plugins=grpc:./api -I=../proto/api ../proto/api/*.proto
### 数据类型说明：
- 金额类型：分
- 折扣、百分比，采用万分表示
- 时间、日期，以unix 秒表示，自行解析。
