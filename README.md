# Spring Annotation
import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;

# JetBrain  Annotation
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

# Javax Annotation
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

# jakarta validation annotation ( JSR-303 )
import javax.validation.Valid;
import javax.validation.constraints.NotNull
import javax.validation.constraints.NotBlank
import javax.validation.constraints.NotEmpty
import javax.validation.constraints.Null

why: 
    Designed for convenient use with Spring's JSR-303 support.
where: 
    [jakarta bean validation api - 2017](https://github.com/eclipse-ee4j/beanvalidation-api)
who: 
    hibernate developers ( red hat Inc. )
when: 
    2017-12-19
How: 
    * Can be used e.g. with Spring MVC handler methods arguments. Supported through org.springframework.validation.SmartValidator
    * Can also be used with method level validation, indicating that a specific class is supposed to be validated at the method level
    * Can also be used as a meta-annotation on a custom stereotype annotation or a custom group-specific validated annotation.