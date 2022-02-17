package net.hoge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import net.logstash.logback.argument.StructuredArguments;
import net.logstash.logback.marker.Markers;
import net.minidev.json.JSONObject;

@SpringBootApplication
@RestController
public class App 
{
    @RequestMapping("/")
    String home() {
        MyLogger.infoStructuredArguments("StructuredArguments.raw sample.");
        MyLogger.infoMarker("Markers.appendRaw sample.");
        return "Hello World!";
    }

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    public static class MyLogger
    {
        private static Logger logger = LoggerFactory.getLogger(MyLogger.class);

        public static void infoStructuredArguments(String msg)
        {
            JSONObject o = new JSONObject();
            o.put("hage", "hige");
            logger.info(msg, StructuredArguments.raw("hoge", o.toJSONString()));
        }

        public static void infoMarker(String msg)
        {
            JSONObject o1 = new JSONObject();
            o1.put("hage1", "hige1");
            JSONObject o2 = new JSONObject();
            o2.put("hage2", "hige2");

            logger.info(
                Markers.appendRaw("hoge1", o1.toJSONString())
                    .and(
                        Markers.appendRaw("hoge2", o2.toJSONString()
                    )
                ), msg);
        }
    }
}