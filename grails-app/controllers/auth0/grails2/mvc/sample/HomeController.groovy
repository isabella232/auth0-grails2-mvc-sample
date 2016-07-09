package auth0.grails2.mvc.sample

import com.auth0.web.Auth0Config
import com.auth0.web.Auth0User
import com.auth0.web.SessionUtils
import org.codehaus.groovy.grails.web.servlet.mvc.GrailsWebRequest
import org.codehaus.groovy.grails.web.util.WebUtils
import org.springframework.beans.factory.annotation.Autowired

class HomeController {

    static defaultAction = "home"

    @Autowired
    Auth0Config auth0Config

    def home() {
        log.info("Home page")
        GrailsWebRequest webUtils = WebUtils.retrieveGrailsWebRequest()
        def req = webUtils.getCurrentRequest()
        final Auth0User user = SessionUtils.getAuth0User(req)
        log.info("User name: " + user.getName());
        def model = [:]
        model['user'] = user
        render(view: "home", model: [model: model])
        return "home"
    }

}

