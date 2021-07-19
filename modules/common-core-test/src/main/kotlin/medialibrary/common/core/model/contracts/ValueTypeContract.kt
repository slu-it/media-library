package medialibrary.common.core.model.contracts

import medialibrary.common.core.model.ValueType
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.DynamicTest
import org.junit.jupiter.api.DynamicTest.dynamicTest
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestFactory

interface ValueTypeContract<T : Any> {

    val validExamples: List<T>

    @BeforeEach
    fun checkEqualityPreConditions() {
        check(validExamples.size >= 2) { "at least 2 valid examples are needed" }
    }

    @TestFactory
    fun `examples of valid values`(): List<DynamicTest> =
        validExamples.map { value ->
            dynamicTest("$value") { createInstance(value) }
        }

    @Test
    fun `equality is based on the original value`() {
        assertThat(createInstance(validExamples[0])).isEqualTo(createInstance(validExamples[0]))
        assertThat(createInstance(validExamples[0])).isNotSameAs(createInstance(validExamples[0]))
        assertThat(createInstance(validExamples[0])).isNotEqualTo(createInstance(validExamples[1]))
    }

    fun createInstance(value: T): ValueType<T>

}
