package medialibrary.common.core.model.contracts.string

import medialibrary.common.core.model.DEFAULT_MAX_TITLE_LENGTH

abstract class TitleTypeContract : IsNotBlankContract, HasMaxLengthContract {
    override val maxLength: Int = DEFAULT_MAX_TITLE_LENGTH
}
