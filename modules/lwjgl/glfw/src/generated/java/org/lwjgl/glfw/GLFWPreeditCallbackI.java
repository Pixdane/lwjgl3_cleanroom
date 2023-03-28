/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.glfw;

import org.lwjgl.system.*;
import org.lwjgl.system.libffi.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.libffi.LibFFI.*;

/**
 * This is the function pointer type for preedit callback functions.
 * 
 * <h3>Type</h3>
 * 
 * <pre><code>
 * void (*{@link #invoke}) (
 *     GLFWwindow *window,
 *     int preedit_count,
 *     unsigned int preedit_string,
 *     int block_count,
 *     int *block_sizes,
 *     int focused_block,
 *     int caret
 * )</code></pre>
 *
 * @since version 3.4.1
 */
@FunctionalInterface
@NativeType("GLFWpreeditfun")
public interface GLFWPreeditCallbackI extends CallbackI {

    FFICIF CIF = apiCreateCIF(
        FFI_DEFAULT_ABI,
        ffi_type_void,
        ffi_type_pointer, ffi_type_sint32, ffi_type_uint32, ffi_type_sint32, ffi_type_pointer, ffi_type_sint32, ffi_type_sint32
    );

    @Override
    default FFICIF getCallInterface() { return CIF; }

    @Override
    default void callback(long ret, long args) {
        invoke(
            memGetAddress(memGetAddress(args)),
            memGetInt(memGetAddress(args + POINTER_SIZE)),
            memGetInt(memGetAddress(args + 2 * POINTER_SIZE)),
            memGetInt(memGetAddress(args + 3 * POINTER_SIZE)),
            memGetAddress(memGetAddress(args + 4 * POINTER_SIZE)),
            memGetInt(memGetAddress(args + 5 * POINTER_SIZE)),
            memGetInt(memGetAddress(args + 6 * POINTER_SIZE))
        );
    }

    /**
     * This is the function pointer type for preedit callback functions.
     *
     * @param window         the window that received the event
     * @param preedit_count  preedit string count
     * @param preedit_string preedit string
     * @param block_count    Attributed block count.
     * @param block_sizes    List of attributed block size
     * @param focused_block  Focused block index.
     * @param caret          Caret position.
     */
    void invoke(@NativeType("GLFWwindow *") long window, int preedit_count, @NativeType("unsigned int") int preedit_string, int block_count, @NativeType("int *") long block_sizes, int focused_block, int caret);

}