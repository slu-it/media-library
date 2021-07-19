package medialibrary.domains.books.usecases

import medialibrary.domains.books.model.BookRecord

interface BookRecordRepository {
    fun insert(record: BookRecord): BookRecord
}
