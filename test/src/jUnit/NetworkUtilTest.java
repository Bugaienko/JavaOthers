package jUnit;

import org.junit.Test;

public class NetworkUtilTest {
    @Test(timeout = 1000)
    public void getConnectionShouldEndedFasterThanOneSecond(){
        NetworkUtils.getConnection();
    }
}
