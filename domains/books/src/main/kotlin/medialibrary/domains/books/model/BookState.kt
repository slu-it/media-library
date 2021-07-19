package medialibrary.domains.books.model

import java.time.LocalDate

sealed interface BookState {
    object Unread : BookState
    data class Reading(val progress: Progress?) : BookState
    data class Finished(val timestamp: LocalDate?)
}
