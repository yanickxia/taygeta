package info.yannxia.java.utils;

import org.apache.logging.log4j.core.Logger;
import org.apache.logging.log4j.core.LoggerContext;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by yann on 15/10/19.
 */
public class Utils4BeanTest {

    private final Logger logger = LoggerContext.getContext().getLogger(Utils4BeanTest.class.getName());


    @Test
    public void testIsNotNull() {

        logger.info("utils for bean, test not null");

        Object o1 = new Object();
        Object o2 = new Object();

        Object no1 = null;
        Object no2 = null;

        Assert.assertTrue("not null error", Utils4Bean.isNotNull(o1, o2));
        Assert.assertTrue("not null error", Utils4Bean.isNotNull(o1));
        Assert.assertFalse("not null error", Utils4Bean.isNotNull(no1));
        Assert.assertFalse("not null error", Utils4Bean.isNotNull(no1, no2));
    }

}
