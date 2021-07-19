package medialibrary.domains.books.model

import medialibrary.common.core.model.StringType
import medialibrary.common.core.validation.StringRequirements
import medialibrary.common.core.validation.matchesPattern

private val isbnRegex = Regex("""(\d{10})|(\d{13})""")
private val isbnRequirements: StringRequirements = { matchesPattern(isbnRegex) }

class Isbn(value: String) : StringType(value, isbnRequirements) {
    fun toIsbn13String() = if (value.length == 10) "978$value" else value
}
