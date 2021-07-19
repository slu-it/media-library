package medialibrary.domains.books.model

import medialibrary.common.core.model.contracts.string.TitleTypeContract
import medialibrary.testing.core.stringOfLength

internal class BookTitleTests : TitleTypeContract() {

    override val validExamples = listOf(
        "We Are Legion (We Are Bob) (Bobiverse, Band 1)",
        "The Lord of the Rings"
    )

    override fun createInstance(value: String) = BookTitle(value)
    override fun createInstanceOfLength(length: Int) = BookTitle(stringOfLength(length))

}
