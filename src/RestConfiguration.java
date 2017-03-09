import org.glassfish.jersey.server.ResourceConfig;

import javax.ws.rs.ApplicationPath;

/**
 * Created by Askew on 3/8/2017.
 */
@ApplicationPath("/rest")
public class RestConfiguration extends ResourceConfig{
    public RestConfiguration(){
        packages("rest");
    }
}
