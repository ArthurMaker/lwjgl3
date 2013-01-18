/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system;

/** A platform or context specific provider of native function addresses. */
public interface FunctionProvider {

	/**
	 * Returns the function address of the specified function. If the function
	 * is not supported by the platform or context, 0L is returned.
	 *
	 * @param functionName the function name to query
	 *
	 * @return the function address or 0L if the function is not supported
	 */
	long getFunctionAddress(String functionName);

	/**
	 * Returns the function address of the specified function. This
	 * method should go straight to the underlying native OS library,
	 * without using an library-specific API.
	 *
	 * @param functionName the function name to query
	 *
	 * @return the function address or 0L if the function is not supported
	 */
	long getLibraryFunctionAddress(String functionName);

}