package janmabomi.ping.boundary;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import janmabomi.ping.control.PingService;
import janmabomi.ping.entity.Ping;

@Stateless
@Path("ping")
public class PingResource {

    @Inject
    private PingService pingService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Ping ping() {
        return pingService.getPing();
    }

}
