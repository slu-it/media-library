package medialibrary.common.core.model.contracts.string

import medialibrary.common.core.validation.ValidationException
import org.junit.jupiter.api.DynamicTest
import org.junit.jupiter.api.DynamicTest.dynamicTest
import org.junit.jupiter.api.TestFactory
import org.junit.jupiter.api.assertThrows

interface MatchesPatternContract : StringTypeContract {

    val invalidExamples: Iterable<String>

    @TestFactory
    fun `examples of invalid values`(): List<DynamicTest> = invalidExamples.map { value ->
        dynamicTest("Example: [$value]") { assertThrows<ValidationException> { createInstance(value) } }
    }

}
