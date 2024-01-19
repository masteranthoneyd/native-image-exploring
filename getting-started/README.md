主流程: compile -> package -> native agent generate config -> package with native plugin 
> native agent 的流程也可以是 compile 之后

运行:
```
mvn -Pnative -DskipTests package
```