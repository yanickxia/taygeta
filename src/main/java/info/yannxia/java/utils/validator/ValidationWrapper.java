package info.yannxia.java.utils.validator;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.empty;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.is;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import java.util.Iterator;
import java.util.Set;


/**
 * Created by yann on 2016/12/15.
 */
public class ValidationWrapper<T> {

    private static final Validator VALIDATOR = Validation.buildDefaultValidatorFactory().getValidator();
    private T bean;
    private String defaultMessage;

    public ValidationWrapper(T bean, String defaultMessage) {
        this.bean = bean;
        this.defaultMessage = defaultMessage;
    }

    public Set<ConstraintViolation<T>> validate(String property) {
        return VALIDATOR.validateProperty(bean, property);
    }

    public void assertNoViolations(String property) {
        Set<ConstraintViolation<T>> violations = validate(property);
        assertThat("Expected no violations, but got some", violations, is(empty()));
    }

    public void assertViolation(String property) {
        Set<ConstraintViolation<T>> violations = validate(property);
        assertThat("Wrong violations count", violations, hasSize(1));

        Iterator<ConstraintViolation<T>> Iterator = violations.iterator();
        ConstraintViolation<T> violation = null;
        while (Iterator.hasNext()) {
            violation = Iterator.next();
        }
        assertThat("Wrong violation message", violation.getMessage(), is(equalTo(defaultMessage)));
    }
}
