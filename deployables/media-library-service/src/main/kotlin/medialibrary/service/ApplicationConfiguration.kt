package medialibrary.service

import medialibrary.domains.books.BooksDomainConfiguration
import medialibrary.domains.games.GamesDomainConfiguration
import medialibrary.domains.movies.MoviesDomainConfiguration
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Import

@Import(
    BooksDomainConfiguration::class,
    GamesDomainConfiguration::class,
    MoviesDomainConfiguration::class
)
@Configuration
class ApplicationConfiguration {
}
