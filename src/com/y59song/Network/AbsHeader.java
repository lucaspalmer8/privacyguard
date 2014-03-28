package com.y59song.Network;

/**
 * Created by frank on 2014-03-27.
 */
public abstract class AbsHeader {
  protected byte[] data;
  protected int checkSum_pos, checkSum_size;
  public abstract AbsHeader reverse();
  public int headerLength() {
    return data.length;
  }
  public void setCheckSum(byte[] checksum) {
    System.arraycopy(checksum, 0, data, checkSum_pos, checkSum_size);
  };
  public byte[] toByteArray() {
    return data;
  }
}