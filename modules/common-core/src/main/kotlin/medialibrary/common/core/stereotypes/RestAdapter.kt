package medialibrary.common.core.stereotypes

import org.springframework.web.bind.annotation.RestController
import kotlin.annotation.AnnotationTarget.CLASS

@Retention
@Target(CLASS)
@RestController
annotation class RestAdapter
