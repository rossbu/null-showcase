package com.showcase.nullability.spring;

import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;

/*
 * https://docs.spring.io/spring-framework/docs/5.3.10/reference/html/core.html#null-safety
 *
 *
 level for Parameters, return value and fields
 @Nullable: Annotation to indicate that a specific parameter, return value, or field can be null.
 @NonNull: Annotation to indicate that a specific parameter, return value, or field cannot be null (not needed on parameters / return values and fields where @NonNullApi and @NonNullFields apply, respectively).


 level on package level
 @NonNullApi: Annotation at the package level that declares non-null as the default semantics for parameters and return values.
 @NonNullFields: Annotation at the package level that declares non-null as the default semantics for fields.
 *
 */
public class SpringAnnotation {

	@NonNull
	String firstName;

	@NonNull
	String lastName;

	@Nullable
	String nickName;

	public static void main(String[] args) {
		SpringAnnotation springAnnotation = new SpringAnnotation();
		String fullName = springAnnotation.getNickName();
		System.out.println(fullName.toLowerCase()); // warning
		System.out.println(springAnnotation.firstName);
		System.out.println(springAnnotation.lastName);
	}

	public String getNickName() {
		return nickName;
	}

}
