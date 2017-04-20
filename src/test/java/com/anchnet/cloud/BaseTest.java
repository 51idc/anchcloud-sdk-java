package com.anchnet.cloud;

import org.apache.log4j.BasicConfigurator;
import org.junit.Before;

/**
 * Created by liangs on 17/3/3.
 */
public abstract class BaseTest {
    protected String clientId = "";
    protected String clientSecret = "";
    protected String zone = "";

    @Before
    public void init() {
        BasicConfigurator.configure();
        clientId = "5468715018646903";
        clientSecret = "NKdkmBNtkGOaA978LYfZHPNdlOWoJmSo";
        zone = "ac3";
    }
}
