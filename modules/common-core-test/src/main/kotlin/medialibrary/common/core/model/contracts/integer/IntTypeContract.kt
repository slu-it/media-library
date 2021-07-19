package medialibrary.common.core.model.contracts.integer

import medialibrary.common.core.model.contracts.ValueTypeContract
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

interface IntTypeContract : ValueTypeContract<Int> {

    @Test
    fun `toString returns the string representation of original value`() {
        val value = validExamples.first()
        val instance = createInstance(value)

        assertThat(instance.toString()).isEqualTo(value.toString())
    }

}
