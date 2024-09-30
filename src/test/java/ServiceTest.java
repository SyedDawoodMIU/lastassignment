
  
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import org.swe.assignment10.UserService;

public class ServiceTest {

    @Test
    public void testGetUserName() {
        UserService userService = mock(UserService.class);

        when(userService.getUserName(1)).thenReturn("John Doe");

        String userName = userService.getUserName(1);
        assertEquals("John Doe", userName, "User name should be John Doe");

        verify(userService).getUserName(1);
    }
}
