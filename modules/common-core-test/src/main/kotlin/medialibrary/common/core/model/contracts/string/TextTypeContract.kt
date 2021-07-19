package medialibrary.common.core.model.contracts.string

import medialibrary.common.core.model.DEFAULT_MAX_TEXT_LENGTH


abstract class TextTypeContract : IsNotBlankContract, HasMaxLengthContract {
    override val maxLength: Int = DEFAULT_MAX_TEXT_LENGTH
}
