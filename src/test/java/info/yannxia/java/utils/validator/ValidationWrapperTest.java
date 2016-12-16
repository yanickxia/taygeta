package info.yannxia.java.utils.validator;

import org.junit.Before;
import org.junit.Test;

import javax.validation.constraints.NotNull;

import static org.junit.Assert.*;

/**
 * Created by yann on 2016/12/16.
 */
public class ValidationWrapperTest {

    private BeanValidation beanValidation;
    private ValidationWrapper<BeanValidation> validationWrapper;

    @Before
    public void before() {
        beanValidation = new BeanValidation();
        validationWrapper = new ValidationWrapper(beanValidation, null);
    }

    @Test
    public void assertNoViolations() throws Exception {
        validationWrapper.assertNoViolations("notNullString");
    }

    @Test
    public void assertViolation() throws Exception {
        validationWrapper.assertViolation("nullString");
    }


    static class BeanValidation {
        @NotNull
        private String nullString;

        @NotNull
        private String notNullString = "123";
    }

}