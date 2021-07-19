package medialibrary.common.core.model.contracts.string

import medialibrary.common.core.model.contracts.ValueTypeContract
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

interface StringTypeContract : ValueTypeContract<String> {

    @Test
    fun `toString returns the original value`() {
        val value = validExamples.first()
        val instance = createInstance(value)

        assertThat(instance.toString()).isEqualTo(value)
    }

}
