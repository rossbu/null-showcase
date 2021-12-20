package com.showcase.nullability.jsr305;

import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/**
 * jsr305 annotation test by google guice
 */
public class JavaxAnnotation {

	@Nullable
	public String nullable() {
		return "";
	}

	@Nonnull
	public String nonnull() {
		return null; // IDEA, findbugs
	}

	@CheckForNull
	public String checkForNull() {
		return null;
	}

	public static void main(String[] args) {
		System.out.println(new JavaxAnnotation().nullable().length()); // IDEA
		System.out.println(new JavaxAnnotation().nonnull().length());
		System.out.println(new JavaxAnnotation().checkForNull().length());
	}

}
