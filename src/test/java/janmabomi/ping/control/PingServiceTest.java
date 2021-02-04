package janmabomi.ping.control;

import janmabomi.ping.entity.Ping;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.mockito.Mockito.when;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class PingServiceTest {

    private static final String PING_MSG = "PONG";

    @Mock
    private PingService mockPingService;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        when(mockPingService.getPing()).thenReturn(new Ping(PING_MSG));
    }

    @Test
    public void testPing() {
        Ping ping = this.mockPingService.getPing();
        assertEquals(ping.getMessage(), PING_MSG);
    }

}
