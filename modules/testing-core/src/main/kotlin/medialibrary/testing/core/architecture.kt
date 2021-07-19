package medialibrary.testing.core

import com.tngtech.archunit.core.domain.JavaClasses
import com.tngtech.archunit.core.importer.ClassFileImporter
import com.tngtech.archunit.core.importer.ImportOption
import com.tngtech.archunit.core.importer.ImportOption.DoNotIncludeArchives
import com.tngtech.archunit.core.importer.ImportOption.DoNotIncludeJars
import com.tngtech.archunit.core.importer.ImportOptions
import com.tngtech.archunit.library.dependencies.SlicesRuleDefinition
import org.junit.jupiter.api.Test

abstract class AbstractArchitectureTests {

    protected val classes: JavaClasses by lazy {
        ClassFileImporter(getImportOptions())
            .importPackages(getPackage())
    }

    protected open fun getPackage(): String =
        this::class.java.packageName

    protected open fun getOptions(): List<ImportOption> =
        listOf(DoNotIncludeArchives(), DoNotIncludeJars())

    @Test
    fun `no cyclic dependencies between packages`() {
        SlicesRuleDefinition.slices()
            .matching("(**)")
            .should().beFreeOfCycles()
            .check(classes)
    }

    private fun getImportOptions(): ImportOptions =
        ImportOptions().apply { getOptions().forEach(::with) }

}
