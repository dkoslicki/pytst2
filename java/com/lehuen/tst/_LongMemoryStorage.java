/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.24
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.lehuen.tst;

public class _LongMemoryStorage {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected _LongMemoryStorage(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(_LongMemoryStorage obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected _LongMemoryStorage() {
    this(0, false);
  }

  protected void finalize() {
    delete();
  }

  public void delete() {
    if(swigCPtr != 0 && swigCMemOwn) {
      swigCMemOwn = false;
      tstJNI.delete__LongMemoryStorage(swigCPtr);
    }
    swigCPtr = 0;
  }

  public _LongMemoryStorage(int initial_size) {
    this(tstJNI.new__LongMemoryStorage(initial_size), true);
  }

  public SWIGTYPE_p_tst_nodeTjchar_jlong_t get(int index) {
    long cPtr = tstJNI._LongMemoryStorage_get(swigCPtr, index);
    return (cPtr == 0) ? null : new SWIGTYPE_p_tst_nodeTjchar_jlong_t(cPtr, false);
  }

  public long store_data(SWIGTYPE_p_tst_nodeTjchar_jlong_t node, long data) {
    return tstJNI._LongMemoryStorage_store_data(swigCPtr, SWIGTYPE_p_tst_nodeTjchar_jlong_t.getCPtr(node), data);
  }

  public int new_node() {
    return tstJNI._LongMemoryStorage_new_node(swigCPtr);
  }

  public void delete_node(int index) {
    tstJNI._LongMemoryStorage_delete_node(swigCPtr, index);
  }

  public void pack() {
    tstJNI._LongMemoryStorage_pack(swigCPtr);
  }

  public void read(SWIGTYPE_p_FILE file, _LongSerializer reader, SWIGTYPE_p_int root, SWIGTYPE_p_int maximum_key_length, SWIGTYPE_p_jlong default_value) {
    tstJNI._LongMemoryStorage_read(swigCPtr, SWIGTYPE_p_FILE.getCPtr(file), _LongSerializer.getCPtr(reader), SWIGTYPE_p_int.getCPtr(root), SWIGTYPE_p_int.getCPtr(maximum_key_length), SWIGTYPE_p_jlong.getCPtr(default_value));
  }

  public void write(SWIGTYPE_p_FILE file, _LongSerializer writer, int root, int maximum_key_length, long default_value) {
    tstJNI._LongMemoryStorage_write(swigCPtr, SWIGTYPE_p_FILE.getCPtr(file), _LongSerializer.getCPtr(writer), root, maximum_key_length, default_value);
  }

}