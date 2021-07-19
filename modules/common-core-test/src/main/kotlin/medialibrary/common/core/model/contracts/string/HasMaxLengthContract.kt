package medialibrary.common.core.model.contracts.string

import medialibrary.common.core.validation.ValidationException
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

/**
 *
 */
interface HasMaxLengthContract : StringTypeContract {

    val maxLength: Int

    @Test
    fun `instances with max-length values can be initialized`() {
        createInstanceOfLength(maxLength)
    }

    @Test
    fun `instances with greater than max-length values cannot be initialized`() {
        assertThrows<ValidationException> { createInstanceOfLength(maxLength + 1) }
    }

    fun createInstanceOfLength(length: Int): Any

}
