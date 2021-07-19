package medialibrary.common.core.model.contracts.integer

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

interface IsLessThanOrEqualToContract : IntTypeContract {

    val max: Int

    @Test
    fun `lesser value is valid`() {
        createInstance(max - 1)
    }

    @Test
    fun `equal value is valid`() {
        createInstance(max)
    }

    @Test
    fun `greater value is invalid`() {
        Assertions.assertThatThrownBy { createInstance(max + 1) }
            .hasMessageContaining("must be less than or equal to ")
    }

}
