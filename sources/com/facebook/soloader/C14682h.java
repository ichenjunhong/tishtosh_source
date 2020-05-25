package com.facebook.soloader;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;

/* renamed from: com.facebook.soloader.h */
public final class C14682h {

    /* renamed from: com.facebook.soloader.h$a */
    static class C14683a extends RuntimeException {
        C14683a(String str) {
            super(str);
        }
    }

    /* renamed from: a */
    public static String[] m30027a(File file) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            return m30028a(fileInputStream.getChannel());
        } finally {
            fileInputStream.close();
        }
    }

    /* renamed from: a */
    private static String[] m30028a(FileChannel fileChannel) throws IOException {
        long j;
        long j2;
        int i;
        long j3;
        boolean z;
        long j4;
        long j5;
        long j6;
        long j7;
        long j8;
        long j9;
        long j10;
        long j11;
        long j12;
        long j13;
        long j14;
        long j15;
        long j16;
        long b;
        FileChannel fileChannel2 = fileChannel;
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        if (m30029b(fileChannel2, allocate, 0) == 1179403647) {
            boolean z2 = true;
            if (m30031d(fileChannel2, allocate, 4) != 1) {
                z2 = false;
            }
            if (m30031d(fileChannel2, allocate, 5) == 2) {
                allocate.order(ByteOrder.BIG_ENDIAN);
            }
            if (z2) {
                j = m30029b(fileChannel2, allocate, 28);
            } else {
                j = m30025a(fileChannel2, allocate, 32);
            }
            if (z2) {
                j2 = (long) m30030c(fileChannel2, allocate, 44);
            } else {
                j2 = (long) m30030c(fileChannel2, allocate, 56);
            }
            if (z2) {
                i = m30030c(fileChannel2, allocate, 42);
            } else {
                i = m30030c(fileChannel2, allocate, 54);
            }
            if (j2 == 65535) {
                if (z2) {
                    j16 = m30029b(fileChannel2, allocate, 32);
                } else {
                    j16 = m30025a(fileChannel2, allocate, 40);
                }
                if (z2) {
                    b = m30029b(fileChannel2, allocate, j16 + 28);
                } else {
                    b = m30029b(fileChannel2, allocate, j16 + 44);
                }
                j2 = b;
            }
            long j17 = j;
            long j18 = 0;
            while (true) {
                if (j18 >= j2) {
                    j3 = 0;
                    break;
                } else if (m30029b(fileChannel2, allocate, j17 + 0) != 2) {
                    j17 += (long) i;
                    j18++;
                } else if (z2) {
                    j3 = m30029b(fileChannel2, allocate, j17 + 4);
                } else {
                    j3 = m30025a(fileChannel2, allocate, j17 + 8);
                }
            }
            long j19 = 0;
            if (j3 != 0) {
                long j20 = j3;
                long j21 = 0;
                int i2 = 0;
                while (true) {
                    if (z2) {
                        z = z2;
                        j4 = m30029b(fileChannel2, allocate, j20 + j19);
                    } else {
                        z = z2;
                        j4 = m30025a(fileChannel2, allocate, j20 + j19);
                    }
                    if (j4 == 1) {
                        if (i2 != Integer.MAX_VALUE) {
                            i2++;
                            j5 = j3;
                        } else {
                            throw new C14683a("malformed DT_NEEDED section");
                        }
                    } else if (j4 == 5) {
                        if (z) {
                            j5 = j3;
                            j15 = m30029b(fileChannel2, allocate, j20 + 4);
                        } else {
                            j5 = j3;
                            j15 = m30025a(fileChannel2, allocate, j20 + 8);
                        }
                        j21 = j15;
                    } else {
                        j5 = j3;
                    }
                    long j22 = 16;
                    if (z) {
                        j6 = 8;
                    } else {
                        j6 = 16;
                    }
                    j20 += j6;
                    j19 = 0;
                    if (j4 != 0) {
                        z2 = z;
                        j3 = j5;
                    } else if (j21 != 0) {
                        int i3 = 0;
                        while (true) {
                            if (((long) i3) >= j2) {
                                j7 = 0;
                                break;
                            }
                            if (m30029b(fileChannel2, allocate, j + j19) == 1) {
                                if (z) {
                                    j12 = m30029b(fileChannel2, allocate, j + 8);
                                } else {
                                    j12 = m30025a(fileChannel2, allocate, j + j22);
                                }
                                if (z) {
                                    j11 = j2;
                                    j13 = m30029b(fileChannel2, allocate, j + 20);
                                } else {
                                    j11 = j2;
                                    j13 = m30025a(fileChannel2, allocate, j + 40);
                                }
                                if (j12 <= j21 && j21 < j13 + j12) {
                                    if (z) {
                                        j14 = m30029b(fileChannel2, allocate, j + 4);
                                    } else {
                                        j14 = m30025a(fileChannel2, allocate, j + 8);
                                    }
                                    j7 = j14 + (j21 - j12);
                                }
                            } else {
                                j11 = j2;
                            }
                            j += (long) i;
                            i3++;
                            j2 = j11;
                            j22 = 16;
                            j19 = 0;
                        }
                        long j23 = 0;
                        if (j7 != 0) {
                            String[] strArr = new String[i2];
                            int i4 = 0;
                            while (true) {
                                if (z) {
                                    j8 = m30029b(fileChannel2, allocate, j5 + j23);
                                } else {
                                    j8 = m30025a(fileChannel2, allocate, j5 + j23);
                                }
                                if (j8 == 1) {
                                    if (z) {
                                        j10 = m30029b(fileChannel2, allocate, j5 + 4);
                                    } else {
                                        j10 = m30025a(fileChannel2, allocate, j5 + 8);
                                    }
                                    long j24 = j10 + j7;
                                    StringBuilder sb = new StringBuilder();
                                    while (true) {
                                        long j25 = j24 + 1;
                                        short d = m30031d(fileChannel2, allocate, j24);
                                        if (d == 0) {
                                            break;
                                        }
                                        sb.append((char) d);
                                        j24 = j25;
                                    }
                                    strArr[i4] = sb.toString();
                                    if (i4 != Integer.MAX_VALUE) {
                                        i4++;
                                    } else {
                                        throw new C14683a("malformed DT_NEEDED section");
                                    }
                                }
                                if (z) {
                                    j9 = 8;
                                } else {
                                    j9 = 16;
                                }
                                j5 += j9;
                                if (j8 != 0) {
                                    j23 = 0;
                                } else if (i4 == strArr.length) {
                                    return strArr;
                                } else {
                                    throw new C14683a("malformed DT_NEEDED section");
                                }
                            }
                        } else {
                            throw new C14683a("did not find file offset of DT_STRTAB table");
                        }
                    } else {
                        throw new C14683a("Dynamic section string-table not found");
                    }
                }
            } else {
                throw new C14683a("ELF file does not contain dynamic linking information");
            }
        } else {
            throw new C14683a("file is not ELF");
        }
    }

    /* renamed from: a */
    private static long m30025a(FileChannel fileChannel, ByteBuffer byteBuffer, long j) throws IOException {
        m30026a(fileChannel, byteBuffer, 8, j);
        return byteBuffer.getLong();
    }

    /* renamed from: b */
    private static long m30029b(FileChannel fileChannel, ByteBuffer byteBuffer, long j) throws IOException {
        m30026a(fileChannel, byteBuffer, 4, j);
        return ((long) byteBuffer.getInt()) & 4294967295L;
    }

    /* renamed from: c */
    private static int m30030c(FileChannel fileChannel, ByteBuffer byteBuffer, long j) throws IOException {
        m30026a(fileChannel, byteBuffer, 2, j);
        return byteBuffer.getShort() & 65535;
    }

    /* renamed from: d */
    private static short m30031d(FileChannel fileChannel, ByteBuffer byteBuffer, long j) throws IOException {
        m30026a(fileChannel, byteBuffer, 1, j);
        return (short) (byteBuffer.get() & 255);
    }

    /* renamed from: a */
    private static void m30026a(FileChannel fileChannel, ByteBuffer byteBuffer, int i, long j) throws IOException {
        byteBuffer.position(0);
        byteBuffer.limit(i);
        while (byteBuffer.remaining() > 0) {
            int read = fileChannel.read(byteBuffer, j);
            if (read == -1) {
                break;
            }
            j += (long) read;
        }
        if (byteBuffer.remaining() <= 0) {
            byteBuffer.position(0);
            return;
        }
        throw new C14683a("ELF file truncated");
    }
}
