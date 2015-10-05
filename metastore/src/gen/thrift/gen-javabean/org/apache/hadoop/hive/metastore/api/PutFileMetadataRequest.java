/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.hadoop.hive.metastore.api;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2015-10-5")
public class PutFileMetadataRequest implements org.apache.thrift.TBase<PutFileMetadataRequest, PutFileMetadataRequest._Fields>, java.io.Serializable, Cloneable, Comparable<PutFileMetadataRequest> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("PutFileMetadataRequest");

  private static final org.apache.thrift.protocol.TField FILE_IDS_FIELD_DESC = new org.apache.thrift.protocol.TField("fileIds", org.apache.thrift.protocol.TType.LIST, (short)1);
  private static final org.apache.thrift.protocol.TField METADATA_FIELD_DESC = new org.apache.thrift.protocol.TField("metadata", org.apache.thrift.protocol.TType.LIST, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new PutFileMetadataRequestStandardSchemeFactory());
    schemes.put(TupleScheme.class, new PutFileMetadataRequestTupleSchemeFactory());
  }

  private List<Long> fileIds; // required
  private List<ByteBuffer> metadata; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    FILE_IDS((short)1, "fileIds"),
    METADATA((short)2, "metadata");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // FILE_IDS
          return FILE_IDS;
        case 2: // METADATA
          return METADATA;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.FILE_IDS, new org.apache.thrift.meta_data.FieldMetaData("fileIds", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64))));
    tmpMap.put(_Fields.METADATA, new org.apache.thrift.meta_data.FieldMetaData("metadata", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING            , true))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(PutFileMetadataRequest.class, metaDataMap);
  }

  public PutFileMetadataRequest() {
  }

  public PutFileMetadataRequest(
    List<Long> fileIds,
    List<ByteBuffer> metadata)
  {
    this();
    this.fileIds = fileIds;
    this.metadata = metadata;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public PutFileMetadataRequest(PutFileMetadataRequest other) {
    if (other.isSetFileIds()) {
      List<Long> __this__fileIds = new ArrayList<Long>(other.fileIds);
      this.fileIds = __this__fileIds;
    }
    if (other.isSetMetadata()) {
      List<ByteBuffer> __this__metadata = new ArrayList<ByteBuffer>(other.metadata);
      this.metadata = __this__metadata;
    }
  }

  public PutFileMetadataRequest deepCopy() {
    return new PutFileMetadataRequest(this);
  }

  @Override
  public void clear() {
    this.fileIds = null;
    this.metadata = null;
  }

  public int getFileIdsSize() {
    return (this.fileIds == null) ? 0 : this.fileIds.size();
  }

  public java.util.Iterator<Long> getFileIdsIterator() {
    return (this.fileIds == null) ? null : this.fileIds.iterator();
  }

  public void addToFileIds(long elem) {
    if (this.fileIds == null) {
      this.fileIds = new ArrayList<Long>();
    }
    this.fileIds.add(elem);
  }

  public List<Long> getFileIds() {
    return this.fileIds;
  }

  public void setFileIds(List<Long> fileIds) {
    this.fileIds = fileIds;
  }

  public void unsetFileIds() {
    this.fileIds = null;
  }

  /** Returns true if field fileIds is set (has been assigned a value) and false otherwise */
  public boolean isSetFileIds() {
    return this.fileIds != null;
  }

  public void setFileIdsIsSet(boolean value) {
    if (!value) {
      this.fileIds = null;
    }
  }

  public int getMetadataSize() {
    return (this.metadata == null) ? 0 : this.metadata.size();
  }

  public java.util.Iterator<ByteBuffer> getMetadataIterator() {
    return (this.metadata == null) ? null : this.metadata.iterator();
  }

  public void addToMetadata(ByteBuffer elem) {
    if (this.metadata == null) {
      this.metadata = new ArrayList<ByteBuffer>();
    }
    this.metadata.add(elem);
  }

  public List<ByteBuffer> getMetadata() {
    return this.metadata;
  }

  public void setMetadata(List<ByteBuffer> metadata) {
    this.metadata = metadata;
  }

  public void unsetMetadata() {
    this.metadata = null;
  }

  /** Returns true if field metadata is set (has been assigned a value) and false otherwise */
  public boolean isSetMetadata() {
    return this.metadata != null;
  }

  public void setMetadataIsSet(boolean value) {
    if (!value) {
      this.metadata = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case FILE_IDS:
      if (value == null) {
        unsetFileIds();
      } else {
        setFileIds((List<Long>)value);
      }
      break;

    case METADATA:
      if (value == null) {
        unsetMetadata();
      } else {
        setMetadata((List<ByteBuffer>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case FILE_IDS:
      return getFileIds();

    case METADATA:
      return getMetadata();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case FILE_IDS:
      return isSetFileIds();
    case METADATA:
      return isSetMetadata();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof PutFileMetadataRequest)
      return this.equals((PutFileMetadataRequest)that);
    return false;
  }

  public boolean equals(PutFileMetadataRequest that) {
    if (that == null)
      return false;

    boolean this_present_fileIds = true && this.isSetFileIds();
    boolean that_present_fileIds = true && that.isSetFileIds();
    if (this_present_fileIds || that_present_fileIds) {
      if (!(this_present_fileIds && that_present_fileIds))
        return false;
      if (!this.fileIds.equals(that.fileIds))
        return false;
    }

    boolean this_present_metadata = true && this.isSetMetadata();
    boolean that_present_metadata = true && that.isSetMetadata();
    if (this_present_metadata || that_present_metadata) {
      if (!(this_present_metadata && that_present_metadata))
        return false;
      if (!this.metadata.equals(that.metadata))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_fileIds = true && (isSetFileIds());
    list.add(present_fileIds);
    if (present_fileIds)
      list.add(fileIds);

    boolean present_metadata = true && (isSetMetadata());
    list.add(present_metadata);
    if (present_metadata)
      list.add(metadata);

    return list.hashCode();
  }

  @Override
  public int compareTo(PutFileMetadataRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetFileIds()).compareTo(other.isSetFileIds());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFileIds()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.fileIds, other.fileIds);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetMetadata()).compareTo(other.isSetMetadata());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMetadata()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.metadata, other.metadata);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("PutFileMetadataRequest(");
    boolean first = true;

    sb.append("fileIds:");
    if (this.fileIds == null) {
      sb.append("null");
    } else {
      sb.append(this.fileIds);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("metadata:");
    if (this.metadata == null) {
      sb.append("null");
    } else {
      sb.append(this.metadata);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!isSetFileIds()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'fileIds' is unset! Struct:" + toString());
    }

    if (!isSetMetadata()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'metadata' is unset! Struct:" + toString());
    }

    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class PutFileMetadataRequestStandardSchemeFactory implements SchemeFactory {
    public PutFileMetadataRequestStandardScheme getScheme() {
      return new PutFileMetadataRequestStandardScheme();
    }
  }

  private static class PutFileMetadataRequestStandardScheme extends StandardScheme<PutFileMetadataRequest> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, PutFileMetadataRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // FILE_IDS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list560 = iprot.readListBegin();
                struct.fileIds = new ArrayList<Long>(_list560.size);
                long _elem561;
                for (int _i562 = 0; _i562 < _list560.size; ++_i562)
                {
                  _elem561 = iprot.readI64();
                  struct.fileIds.add(_elem561);
                }
                iprot.readListEnd();
              }
              struct.setFileIdsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // METADATA
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list563 = iprot.readListBegin();
                struct.metadata = new ArrayList<ByteBuffer>(_list563.size);
                ByteBuffer _elem564;
                for (int _i565 = 0; _i565 < _list563.size; ++_i565)
                {
                  _elem564 = iprot.readBinary();
                  struct.metadata.add(_elem564);
                }
                iprot.readListEnd();
              }
              struct.setMetadataIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, PutFileMetadataRequest struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.fileIds != null) {
        oprot.writeFieldBegin(FILE_IDS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I64, struct.fileIds.size()));
          for (long _iter566 : struct.fileIds)
          {
            oprot.writeI64(_iter566);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.metadata != null) {
        oprot.writeFieldBegin(METADATA_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.metadata.size()));
          for (ByteBuffer _iter567 : struct.metadata)
          {
            oprot.writeBinary(_iter567);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class PutFileMetadataRequestTupleSchemeFactory implements SchemeFactory {
    public PutFileMetadataRequestTupleScheme getScheme() {
      return new PutFileMetadataRequestTupleScheme();
    }
  }

  private static class PutFileMetadataRequestTupleScheme extends TupleScheme<PutFileMetadataRequest> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, PutFileMetadataRequest struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      {
        oprot.writeI32(struct.fileIds.size());
        for (long _iter568 : struct.fileIds)
        {
          oprot.writeI64(_iter568);
        }
      }
      {
        oprot.writeI32(struct.metadata.size());
        for (ByteBuffer _iter569 : struct.metadata)
        {
          oprot.writeBinary(_iter569);
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, PutFileMetadataRequest struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      {
        org.apache.thrift.protocol.TList _list570 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I64, iprot.readI32());
        struct.fileIds = new ArrayList<Long>(_list570.size);
        long _elem571;
        for (int _i572 = 0; _i572 < _list570.size; ++_i572)
        {
          _elem571 = iprot.readI64();
          struct.fileIds.add(_elem571);
        }
      }
      struct.setFileIdsIsSet(true);
      {
        org.apache.thrift.protocol.TList _list573 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
        struct.metadata = new ArrayList<ByteBuffer>(_list573.size);
        ByteBuffer _elem574;
        for (int _i575 = 0; _i575 < _list573.size; ++_i575)
        {
          _elem574 = iprot.readBinary();
          struct.metadata.add(_elem574);
        }
      }
      struct.setMetadataIsSet(true);
    }
  }

}

