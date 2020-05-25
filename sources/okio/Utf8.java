package okio;

import p2628d.p2639f.p2641b.C52711k;

public final class Utf8 {
    public static final int codePointByteCount(int i) {
        if (i < 128) {
            return 1;
        }
        if (i < 2048) {
            return 2;
        }
        return i < 65536 ? 3 : 4;
    }

    public static final int codePointCharCount(int i) {
        return i < 65536 ? 1 : 2;
    }

    public static final boolean isIsoControl(int i) {
        return (i >= 0 && 31 >= i) || (127 <= i && 159 >= i);
    }

    public static final long size(String str) {
        return size$default(str, 0, 0, 3, null);
    }

    public static final long size(String str, int i) {
        return size$default(str, i, 0, 2, null);
    }

    public static final int codePointAt(byte[] bArr, int i) {
        byte b;
        int i2;
        byte b2;
        C52711k.m112240b(bArr, "$receiver");
        byte b3 = bArr[i];
        if ((b3 & 128) == 0) {
            b2 = b3 & Byte.MAX_VALUE;
            i2 = 1;
            b = 0;
        } else if ((b3 & 224) == 192) {
            b2 = b3 & 31;
            i2 = 2;
            b = 128;
        } else if ((b3 & 240) == 224) {
            b2 = b3 & 15;
            i2 = 3;
            b = 2048;
        } else if ((b3 & 248) != 240) {
            return 65533;
        } else {
            b2 = b3 & 7;
            i2 = 4;
            b = 65536;
        }
        if (bArr.length < i + i2) {
            return 65533;
        }
        for (int i3 = 1; i3 < i2; i3++) {
            byte b4 = bArr[i + i3];
            if ((b4 & 192) != 128) {
                return 65533;
            }
            b2 = (b2 << 6) | (b4 & 63);
        }
        if (b2 > 1114111) {
            return 65533;
        }
        if ((55296 <= b2 && 57343 >= b2) || b2 < b) {
            return 65533;
        }
        return b2;
    }

    public static final long size(String str, int i, int i2) {
        boolean z;
        boolean z2;
        char c;
        C52711k.m112240b(str, "$receiver");
        boolean z3 = true;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (i2 >= i) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (i2 > str.length()) {
                    z3 = false;
                }
                if (z3) {
                    long j = 0;
                    while (i < i2) {
                        char charAt = str.charAt(i);
                        if (charAt < 128) {
                            j++;
                            i++;
                        } else if (charAt < 2048) {
                            j += 2;
                            i++;
                        } else if (charAt < 55296 || charAt > 57343) {
                            j += 3;
                            i++;
                        } else {
                            int i3 = i + 1;
                            if (i3 < i2) {
                                c = str.charAt(i3);
                            } else {
                                c = 0;
                            }
                            if (charAt > 56319 || c < 56320 || c > 57343) {
                                j++;
                                i = i3;
                            } else {
                                j += 4;
                                i += 2;
                            }
                        }
                    }
                    return j;
                }
                StringBuilder sb = new StringBuilder("endIndex > string.length: ");
                sb.append(i2);
                sb.append(" > ");
                sb.append(str.length());
                throw new IllegalArgumentException(sb.toString().toString());
            }
            StringBuilder sb2 = new StringBuilder("endIndex < beginIndex: ");
            sb2.append(i2);
            sb2.append(" < ");
            sb2.append(i);
            throw new IllegalArgumentException(sb2.toString().toString());
        }
        StringBuilder sb3 = new StringBuilder("beginIndex < 0: ");
        sb3.append(i);
        throw new IllegalArgumentException(sb3.toString().toString());
    }

    public static /* synthetic */ long size$default(String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        return size(str, i, i2);
    }
}
