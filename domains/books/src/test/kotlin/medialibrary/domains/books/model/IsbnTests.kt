package medialibrary.domains.books.model

import medialibrary.common.core.model.contracts.string.MatchesPatternContract
import medialibrary.testing.core.UnitTest

@UnitTest
internal class IsbnTests : MatchesPatternContract {

    override val validExamples =
        listOf("1680680587", "9781680680584", "1680680595", "9781680680591", "1680680609", "9781680680607")
    override val invalidExamples =
        listOf("978-1680680584", "123456789", "12345678901", "123456789012", "12345678901234")

    override fun createInstance(value: String) = Isbn(value)

}
