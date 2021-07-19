package medialibrary.common.core.model.contracts.integer

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

interface IsGreaterThanOrEqualToContract : IntTypeContract {

    val min: Int

    @Test
    fun `lesser value is invalid`() {
        Assertions.assertThatThrownBy { createInstance(min - 1) }
            .hasMessageContaining("must be greater than or equal to ")
    }

    @Test
    fun `equal value is valid`() {
        createInstance(min)
    }

    @Test
    fun `greater value is valid`() {
        createInstance(min + 1)
    }

}
