package medialibrary.common.core.validation

import medialibrary.common.core.validation.Validation.Companion.validate
import medialibrary.testing.core.UnitTest
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

@UnitTest
internal class ValidationTests {

    @Test
    fun `without problems nothing happens`() {
        validate(1337, "test value") {
            // no problems
        }
    }

    @Test
    fun `with problems an exception is thrown`() {
        val ex = assertThrows<ValidationException> {
            validate(1337, "test value") {
                addViolation("foo")
                addViolation("bar")
            }
        }

        assertThat(ex)
            .hasMessage("Value of test value is invalid: 'test value' [1337] - foo; 'test value' [1337] - bar")
        assertThat(ex.problems).containsExactly("'test value' [1337] - foo", "'test value' [1337] - bar")
    }

}
