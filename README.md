

## 準備

log_aws_s3.properties.sampleを元にlog_aws_s3.propertiesを作成する。

## 実行

```
$ mvn spring-boot:run
```

ブラウザで http://localhost:8080/ にアクセス。

## プロジェクト作成方法

プロジェクト作成方法は以下の通り

```
$ mvn -B archetype:generate -DarchetypeGroupId=org.apache.maven.archetypes -DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=1.4 -DgroupId=net.hoge -DartifactId=spring-boot-hello-world -Dversion=1.0.0-SNAPSHOT
```

参考: https://qiita.com/hidakanoko/items/287dbd6ac6b1a9500e20