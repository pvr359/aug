package welltech.service;

import org.springframework.stereotype.Service;
import welltech.domain.App;

/**
 * .
 *
 * @author ram
 */
@Service
public class AppService {
    public App getApp(String appName) {
        App app = new App();
        app.setAppName("App");

        return app;
    }
}