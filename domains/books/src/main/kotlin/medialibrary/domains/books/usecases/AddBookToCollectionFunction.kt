package medialibrary.domains.books.usecases

import medialibrary.common.core.stereotypes.BusinessFunction
import medialibrary.domains.books.model.Book
import medialibrary.domains.books.model.BookRecord
import medialibrary.domains.books.model.BookState
import org.springframework.util.IdGenerator

@BusinessFunction
class AddBookToCollectionFunction(
    private val repository: BookRecordRepository,
    private val idGenerator: IdGenerator
) {

    operator fun invoke(book: Book, state: BookState = BookState.Unread): BookRecord {
        val record = BookRecord(
            id = idGenerator.generateId(),
            book = book,
            state = state
        )
        return repository.insert(record)
    }

}
