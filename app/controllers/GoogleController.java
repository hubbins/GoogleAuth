package controllers;

import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;
import play.mvc.*;

import views.html.*;

public class GoogleController extends Controller {

    private static final Config config = ConfigFactory.load();

    public Result index() {
        final String clientId = config.getString("google.clientId");
        final String signinScope = config.getString("google.signinScope");
        return ok(google.render(clientId, signinScope));
    }
}
