package medialibrary.domains.books.model

import medialibrary.common.core.model.IntType

class Progress(value: Int) : IntType(value, min = 0, max = 100)
