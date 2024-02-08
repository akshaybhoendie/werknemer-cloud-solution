package sr.qualogy;
import jakarta.ws.rs.ApplicationPath;
import jakarta.ws.rs.core.Application;
import sr.qualogy.configuration.JPAConfiguration;

import java.util.HashMap;
import java.util.Map;

@ApplicationPath("/api")
public class ApplicationConfig extends Application {

    @Override
    public Map<String, Object> getProperties() {
        JPAConfiguration.getEntityManager();
        Map<String, Object> properties = new HashMap<String, Object>();
        properties.put("jersey.config.server.provider.packages", "sr.qualogy.controller");
        return properties;
    }
}
