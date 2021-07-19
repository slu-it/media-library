package medialibrary.domains.books.model

import java.util.UUID

data class BookRecord(
    val id: UUID,
    val book: Book,
    val state: BookState
)
