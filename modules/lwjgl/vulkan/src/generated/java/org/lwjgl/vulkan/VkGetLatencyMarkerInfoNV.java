/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Structure specifying the parameters of vkGetLatencyTimingsNV.
 * 
 * <h5>Description</h5>
 * 
 * <p>The elements of {@code pTimings} are arranged in the order they were requested in, with the oldest data in the first entry.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link NVLowLatency2#VK_STRUCTURE_TYPE_GET_LATENCY_MARKER_INFO_NV STRUCTURE_TYPE_GET_LATENCY_MARKER_INFO_NV}</li>
 * <li>{@code pTimings} <b>must</b> be a valid pointer to a {@link VkLatencyTimingsFrameReportNV} structure</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkLatencyTimingsFrameReportNV}, {@link NVLowLatency2#vkGetLatencyTimingsNV GetLatencyTimingsNV}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkGetLatencyMarkerInfoNV {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     {@link VkLatencyTimingsFrameReportNV VkLatencyTimingsFrameReportNV} * {@link #pTimings};
 * }</code></pre>
 */
public class VkGetLatencyMarkerInfoNV extends Struct<VkGetLatencyMarkerInfoNV> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        PTIMINGS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PTIMINGS = layout.offsetof(2);
    }

    protected VkGetLatencyMarkerInfoNV(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkGetLatencyMarkerInfoNV create(long address, @Nullable ByteBuffer container) {
        return new VkGetLatencyMarkerInfoNV(address, container);
    }

    /**
     * Creates a {@code VkGetLatencyMarkerInfoNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkGetLatencyMarkerInfoNV(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** a {@code VkStructureType} value identifying this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** either {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** either {@code NULL} or a pointer to an array of {@link VkLatencyTimingsFrameReportNV} structures. */
    @NativeType("VkLatencyTimingsFrameReportNV *")
    public VkLatencyTimingsFrameReportNV pTimings() { return npTimings(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkGetLatencyMarkerInfoNV sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link NVLowLatency2#VK_STRUCTURE_TYPE_GET_LATENCY_MARKER_INFO_NV STRUCTURE_TYPE_GET_LATENCY_MARKER_INFO_NV} value to the {@link #sType} field. */
    public VkGetLatencyMarkerInfoNV sType$Default() { return sType(NVLowLatency2.VK_STRUCTURE_TYPE_GET_LATENCY_MARKER_INFO_NV); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkGetLatencyMarkerInfoNV pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the address of the specified {@link VkLatencyTimingsFrameReportNV} to the {@link #pTimings} field. */
    public VkGetLatencyMarkerInfoNV pTimings(@NativeType("VkLatencyTimingsFrameReportNV *") VkLatencyTimingsFrameReportNV value) { npTimings(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkGetLatencyMarkerInfoNV set(
        int sType,
        long pNext,
        VkLatencyTimingsFrameReportNV pTimings
    ) {
        sType(sType);
        pNext(pNext);
        pTimings(pTimings);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkGetLatencyMarkerInfoNV set(VkGetLatencyMarkerInfoNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkGetLatencyMarkerInfoNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkGetLatencyMarkerInfoNV malloc() {
        return new VkGetLatencyMarkerInfoNV(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkGetLatencyMarkerInfoNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkGetLatencyMarkerInfoNV calloc() {
        return new VkGetLatencyMarkerInfoNV(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkGetLatencyMarkerInfoNV} instance allocated with {@link BufferUtils}. */
    public static VkGetLatencyMarkerInfoNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkGetLatencyMarkerInfoNV(memAddress(container), container);
    }

    /** Returns a new {@code VkGetLatencyMarkerInfoNV} instance for the specified memory address. */
    public static VkGetLatencyMarkerInfoNV create(long address) {
        return new VkGetLatencyMarkerInfoNV(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkGetLatencyMarkerInfoNV createSafe(long address) {
        return address == NULL ? null : new VkGetLatencyMarkerInfoNV(address, null);
    }

    /**
     * Returns a new {@link VkGetLatencyMarkerInfoNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkGetLatencyMarkerInfoNV.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkGetLatencyMarkerInfoNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkGetLatencyMarkerInfoNV.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkGetLatencyMarkerInfoNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkGetLatencyMarkerInfoNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkGetLatencyMarkerInfoNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkGetLatencyMarkerInfoNV.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkGetLatencyMarkerInfoNV.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkGetLatencyMarkerInfoNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkGetLatencyMarkerInfoNV malloc(MemoryStack stack) {
        return new VkGetLatencyMarkerInfoNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkGetLatencyMarkerInfoNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkGetLatencyMarkerInfoNV calloc(MemoryStack stack) {
        return new VkGetLatencyMarkerInfoNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkGetLatencyMarkerInfoNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkGetLatencyMarkerInfoNV.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkGetLatencyMarkerInfoNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkGetLatencyMarkerInfoNV.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkGetLatencyMarkerInfoNV.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkGetLatencyMarkerInfoNV.PNEXT); }
    /** Unsafe version of {@link #pTimings}. */
    public static VkLatencyTimingsFrameReportNV npTimings(long struct) { return VkLatencyTimingsFrameReportNV.create(memGetAddress(struct + VkGetLatencyMarkerInfoNV.PTIMINGS)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkGetLatencyMarkerInfoNV.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkGetLatencyMarkerInfoNV.PNEXT, value); }
    /** Unsafe version of {@link #pTimings(VkLatencyTimingsFrameReportNV) pTimings}. */
    public static void npTimings(long struct, VkLatencyTimingsFrameReportNV value) { memPutAddress(struct + VkGetLatencyMarkerInfoNV.PTIMINGS, value.address()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + VkGetLatencyMarkerInfoNV.PTIMINGS));
    }

    // -----------------------------------

    /** An array of {@link VkGetLatencyMarkerInfoNV} structs. */
    public static class Buffer extends StructBuffer<VkGetLatencyMarkerInfoNV, Buffer> implements NativeResource {

        private static final VkGetLatencyMarkerInfoNV ELEMENT_FACTORY = VkGetLatencyMarkerInfoNV.create(-1L);

        /**
         * Creates a new {@code VkGetLatencyMarkerInfoNV.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkGetLatencyMarkerInfoNV#SIZEOF}, and its mark will be undefined.</p>
         *
         * <p>The created buffer instance holds a strong reference to the container object.</p>
         */
        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SIZEOF);
        }

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        @Override
        protected Buffer self() {
            return this;
        }

        @Override
        protected VkGetLatencyMarkerInfoNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkGetLatencyMarkerInfoNV#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkGetLatencyMarkerInfoNV.nsType(address()); }
        /** @return the value of the {@link VkGetLatencyMarkerInfoNV#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkGetLatencyMarkerInfoNV.npNext(address()); }
        /** @return a {@link VkLatencyTimingsFrameReportNV} view of the struct pointed to by the {@link VkGetLatencyMarkerInfoNV#pTimings} field. */
        @NativeType("VkLatencyTimingsFrameReportNV *")
        public VkLatencyTimingsFrameReportNV pTimings() { return VkGetLatencyMarkerInfoNV.npTimings(address()); }

        /** Sets the specified value to the {@link VkGetLatencyMarkerInfoNV#sType} field. */
        public VkGetLatencyMarkerInfoNV.Buffer sType(@NativeType("VkStructureType") int value) { VkGetLatencyMarkerInfoNV.nsType(address(), value); return this; }
        /** Sets the {@link NVLowLatency2#VK_STRUCTURE_TYPE_GET_LATENCY_MARKER_INFO_NV STRUCTURE_TYPE_GET_LATENCY_MARKER_INFO_NV} value to the {@link VkGetLatencyMarkerInfoNV#sType} field. */
        public VkGetLatencyMarkerInfoNV.Buffer sType$Default() { return sType(NVLowLatency2.VK_STRUCTURE_TYPE_GET_LATENCY_MARKER_INFO_NV); }
        /** Sets the specified value to the {@link VkGetLatencyMarkerInfoNV#pNext} field. */
        public VkGetLatencyMarkerInfoNV.Buffer pNext(@NativeType("void const *") long value) { VkGetLatencyMarkerInfoNV.npNext(address(), value); return this; }
        /** Sets the address of the specified {@link VkLatencyTimingsFrameReportNV} to the {@link VkGetLatencyMarkerInfoNV#pTimings} field. */
        public VkGetLatencyMarkerInfoNV.Buffer pTimings(@NativeType("VkLatencyTimingsFrameReportNV *") VkLatencyTimingsFrameReportNV value) { VkGetLatencyMarkerInfoNV.npTimings(address(), value); return this; }

    }

}