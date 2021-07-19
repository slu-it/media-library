package medialibrary.common.core.model.contracts.integer

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

interface IsBetweenContract : IntTypeContract {

    val range: IntRange

    @Test
    fun `random values within range are valid`() {
        repeat(100) {
            createInstance(range.random())
        }
    }

    @Test
    fun `lower bound value is valid`() {
        createInstance(range.start)
    }

    @Test
    fun `upper bound value is valid`() {
        createInstance(range.endInclusive)
    }

    @Test
    fun `too low values are invalid`() {
        Assertions.assertThatThrownBy { createInstance(range.start - 1) }
            .hasMessageContaining("must be between")
    }

    @Test
    fun `too high values are invalid`() {
        Assertions.assertThatThrownBy { createInstance(range.endInclusive + 1) }
            .hasMessageContaining("must be between")
    }

}
