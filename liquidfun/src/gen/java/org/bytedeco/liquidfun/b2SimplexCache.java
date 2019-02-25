// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.liquidfun;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.liquidfun.global.liquidfun.*;


/** Used to warm start b2Distance.
 *  Set count to zero on first call. */
@Properties(inherit = org.bytedeco.liquidfun.presets.liquidfun.class)
public class b2SimplexCache extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public b2SimplexCache() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public b2SimplexCache(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public b2SimplexCache(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public b2SimplexCache position(long position) {
        return (b2SimplexCache)super.position(position);
    }

	/** length or area */
	public native @Cast("float32") float metric(); public native b2SimplexCache metric(float metric);
	public native @Cast("uint16") int count(); public native b2SimplexCache count(int count);
	/** vertices on shape A */
	public native @Cast("uint8") short indexA(int i); public native b2SimplexCache indexA(int i, short indexA);
	@MemberGetter public native @Cast("uint8*") BytePointer indexA();
	/** vertices on shape B */
	public native @Cast("uint8") short indexB(int i); public native b2SimplexCache indexB(int i, short indexB);
	@MemberGetter public native @Cast("uint8*") BytePointer indexB();
}