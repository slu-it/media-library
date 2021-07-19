package medialibrary.domains.books.model

import medialibrary.common.core.model.contracts.integer.IsBetweenContract
import medialibrary.testing.core.UnitTest

@UnitTest
internal class ProgressTests : IsBetweenContract {

    override val range = (0..100)
    override val validExamples = listOf(0, 10, 50, 99, 100)

    override fun createInstance(value: Int) = Progress(value)

}
