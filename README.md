

## 実行

```
$ mvn spring-boot:run
```

ブラウザで http://localhost:8080/ にアクセス。

## 参考

プロジェクト作成方法は以下の通り

```
$ mvn -B archetype:generate -DarchetypeGroupId=org.apache.maven.archetypes -DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=1.4 -DgroupId=net.hoge -DartifactId=spring-boot-hello-world -Dversion=1.0.0-SNAPSHOT
```