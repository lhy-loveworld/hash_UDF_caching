package org.apache.spark.sql.columnar.compression;
// no position
public  class LongDelta$ implements org.apache.spark.sql.columnar.compression.CompressionScheme, scala.Product, scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final LongDelta$ MODULE$ = null;
  public   LongDelta$ () { throw new RuntimeException(); }
  public  int typeId () { throw new RuntimeException(); }
  public <T extends org.apache.spark.sql.catalyst.types.NativeType> org.apache.spark.sql.columnar.compression.Decoder<T> decoder (java.nio.ByteBuffer buffer, org.apache.spark.sql.columnar.NativeColumnType<T> columnType) { throw new RuntimeException(); }
  public <T extends org.apache.spark.sql.catalyst.types.NativeType> org.apache.spark.sql.columnar.compression.Encoder<T> encoder (org.apache.spark.sql.columnar.NativeColumnType<T> columnType) { throw new RuntimeException(); }
  public  boolean supports (org.apache.spark.sql.columnar.ColumnType<?, ?> columnType) { throw new RuntimeException(); }
}
