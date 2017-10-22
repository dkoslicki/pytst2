/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.24
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.lehuen.tst;

class tstJNI {
  public final static native String get_TST_VERSION();
  public final static native int get_UNDEFINED_INDEX();
  public final static native long new_TSTException(String jarg1);
  public final static native void set_TSTException_message(long jarg1, String jarg2);
  public final static native String get_TSTException_message(long jarg1);
  public final static native void delete_TSTException(long jarg1);
  public final static native long new__ObjectMemoryStorage(int jarg1);
  public final static native void delete__ObjectMemoryStorage(long jarg1);
  public final static native long _ObjectMemoryStorage_get(long jarg1, int jarg2);
  public final static native Object _ObjectMemoryStorage_store_data(long jarg1, long jarg2, Object jarg3);
  public final static native int _ObjectMemoryStorage_new_node(long jarg1);
  public final static native void _ObjectMemoryStorage_delete_node(long jarg1, int jarg2);
  public final static native void _ObjectMemoryStorage_pack(long jarg1);
  public final static native void _ObjectMemoryStorage_read(long jarg1, long jarg2, long jarg3, long jarg4, long jarg5, long jarg6);
  public final static native void _ObjectMemoryStorage_write(long jarg1, long jarg2, long jarg3, int jarg4, int jarg5, Object jarg6);
  public final static native long new__ObjectTST__SWIG_0(long jarg1, long jarg2, long jarg3);
  public final static native long new__ObjectTST__SWIG_1(long jarg1, Object jarg2);
  public final static native void delete__ObjectTST(long jarg1);
  public final static native void _ObjectTST_pack(long jarg1);
  public final static native Object _ObjectTST_walk(long jarg1, long jarg2, long jarg3);
  public final static native Object _ObjectTST_almost(long jarg1, String jarg2, int jarg4, long jarg5, long jarg6);
  public final static native Object _ObjectTST_common_prefix(long jarg1, String jarg2, long jarg4, long jarg5);
  public final static native Object _ObjectTST_get(long jarg1, String jarg2);
  public final static native Object _ObjectTST_get_or_build(long jarg1, String jarg2, long jarg4);
  public final static native Object _ObjectTST_put(long jarg1, String jarg2, Object jarg4);
  public final static native void _ObjectTST_remove(long jarg1, String jarg2);
  public final static native int _ObjectTST_get_maximum_key_length(long jarg1);
  public final static native void _ObjectTST_write(long jarg1, long jarg2, long jarg3);
  public final static native Object _ObjectTST_scan(long jarg1, String jarg2, long jarg4);
  public final static native Object _ObjectTST_scan_with_stop_chars(long jarg1, String jarg2, String jarg4, long jarg6);
  public final static native void delete__ObjectAction(long jarg1);
  public final static native void _ObjectAction_perform(long jarg1, String jarg2, int jarg4, Object jarg5);
  public final static native Object _ObjectAction_result(long jarg1);
  public final static native void delete__ObjectFilter(long jarg1);
  public final static native Object _ObjectFilter_perform(long jarg1, String jarg2, int jarg4, Object jarg5);
  public final static native void delete__ObjectSerializer(long jarg1);
  public final static native void _ObjectSerializer_write(long jarg1, long jarg2, Object jarg3);
  public final static native Object _ObjectSerializer_read(long jarg1, long jarg2);
  public final static native long new__LongMemoryStorage(int jarg1);
  public final static native void delete__LongMemoryStorage(long jarg1);
  public final static native long _LongMemoryStorage_get(long jarg1, int jarg2);
  public final static native long _LongMemoryStorage_store_data(long jarg1, long jarg2, long jarg3);
  public final static native int _LongMemoryStorage_new_node(long jarg1);
  public final static native void _LongMemoryStorage_delete_node(long jarg1, int jarg2);
  public final static native void _LongMemoryStorage_pack(long jarg1);
  public final static native void _LongMemoryStorage_read(long jarg1, long jarg2, long jarg3, long jarg4, long jarg5, long jarg6);
  public final static native void _LongMemoryStorage_write(long jarg1, long jarg2, long jarg3, int jarg4, int jarg5, long jarg6);
  public final static native long new__LongTST__SWIG_0(long jarg1, long jarg2, long jarg3);
  public final static native long new__LongTST__SWIG_1(long jarg1, long jarg2);
  public final static native void delete__LongTST(long jarg1);
  public final static native void _LongTST_pack(long jarg1);
  public final static native long _LongTST_walk(long jarg1, long jarg2, long jarg3);
  public final static native long _LongTST_almost(long jarg1, String jarg2, int jarg4, long jarg5, long jarg6);
  public final static native long _LongTST_common_prefix(long jarg1, String jarg2, long jarg4, long jarg5);
  public final static native long _LongTST_get(long jarg1, String jarg2);
  public final static native long _LongTST_get_or_build(long jarg1, String jarg2, long jarg4);
  public final static native long _LongTST_put(long jarg1, String jarg2, long jarg4);
  public final static native void _LongTST_remove(long jarg1, String jarg2);
  public final static native int _LongTST_get_maximum_key_length(long jarg1);
  public final static native void _LongTST_write(long jarg1, long jarg2, long jarg3);
  public final static native long _LongTST_scan(long jarg1, String jarg2, long jarg4);
  public final static native long _LongTST_scan_with_stop_chars(long jarg1, String jarg2, String jarg4, long jarg6);
  public final static native void delete__LongAction(long jarg1);
  public final static native void _LongAction_perform(long jarg1, String jarg2, int jarg4, long jarg5);
  public final static native long _LongAction_result(long jarg1);
  public final static native void delete__LongFilter(long jarg1);
  public final static native long _LongFilter_perform(long jarg1, String jarg2, int jarg4, long jarg5);
  public final static native void delete__LongSerializer(long jarg1);
  public final static native void _LongSerializer_write(long jarg1, long jarg2, long jarg3);
  public final static native long _LongSerializer_read(long jarg1, long jarg2);
  public final static native long new_ObjectMemoryStorage(int jarg1, long jarg2);
  public final static native void delete_ObjectMemoryStorage(long jarg1);
  public final static native Object ObjectMemoryStorage_store_data(long jarg1, long jarg2, Object jarg3);
  public final static native long new_ObjectTST(int jarg1, Object jarg2);
  public final static native void delete_ObjectTST(long jarg1);
  public final static native long new_ObjectAction(Object jarg1, String jarg2, String jarg3);
  public final static native void delete_ObjectAction(long jarg1);
  public final static native void ObjectAction_perform(long jarg1, String jarg2, int jarg4, Object jarg5);
  public final static native Object ObjectAction_result(long jarg1);
  public final static native long new_ObjectFilter(Object jarg1, String jarg2);
  public final static native void delete_ObjectFilter(long jarg1);
  public final static native Object ObjectFilter_perform(long jarg1, String jarg2, int jarg4, Object jarg5);
  public final static native void ObjectSerializer_write(long jarg1, long jarg2, Object jarg3);
  public final static native Object ObjectSerializer_read(long jarg1, long jarg2);
  public final static native long new_ObjectSerializer();
  public final static native void delete_ObjectSerializer(long jarg1);
  public final static native long new_LongTST(int jarg1, long jarg2);
  public final static native void delete_LongTST(long jarg1);
  public final static native long new_LongAction(Object jarg1, String jarg2, String jarg3);
  public final static native void delete_LongAction(long jarg1);
  public final static native void LongAction_perform(long jarg1, String jarg2, int jarg4, long jarg5);
  public final static native long LongAction_result(long jarg1);
  public final static native long new_LongFilter(Object jarg1, String jarg2);
  public final static native void delete_LongFilter(long jarg1);
  public final static native long LongFilter_perform(long jarg1, String jarg2, int jarg4, long jarg5);
  public final static native void LongSerializer_write(long jarg1, long jarg2, long jarg3);
  public final static native long LongSerializer_read(long jarg1, long jarg2);
  public final static native long new_LongSerializer();
  public final static native void delete_LongSerializer(long jarg1);
  public final static native long SWIGObjectMemoryStorageUpcast(long jarg1);
  public final static native long SWIGObjectTSTUpcast(long jarg1);
  public final static native long SWIGObjectActionUpcast(long jarg1);
  public final static native long SWIGObjectFilterUpcast(long jarg1);
  public final static native long SWIGObjectSerializerUpcast(long jarg1);
  public final static native long SWIGLongTSTUpcast(long jarg1);
  public final static native long SWIGLongActionUpcast(long jarg1);
  public final static native long SWIGLongFilterUpcast(long jarg1);
  public final static native long SWIGLongSerializerUpcast(long jarg1);
}