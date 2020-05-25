package okio.internal;

import java.util.Arrays;
import okio.Base64;
import okio.ByteString;
import okio.Platform;
import okio.Utf8;
import okio.Util;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52830p;

public final class ByteStringKt {
    private static final ByteString COMMON_EMPTY = ByteString.Companion.mo111883of(new byte[0]);
    private static final char[] COMMON_HEX_DIGITS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static final ByteString getCOMMON_EMPTY() {
        return COMMON_EMPTY;
    }

    public static final char[] getCOMMON_HEX_DIGITS() {
        return COMMON_HEX_DIGITS;
    }

    public static final String commonBase64(ByteString byteString) {
        C52711k.m112240b(byteString, "$receiver");
        return Base64.encodeBase64$default(byteString.getData$jvm(), null, 1, null);
    }

    public static final int commonGetSize(ByteString byteString) {
        C52711k.m112240b(byteString, "$receiver");
        return byteString.getData$jvm().length;
    }

    public static final byte[] commonInternalArray(ByteString byteString) {
        C52711k.m112240b(byteString, "$receiver");
        return byteString.getData$jvm();
    }

    public static final String commonBase64Url(ByteString byteString) {
        C52711k.m112240b(byteString, "$receiver");
        return Base64.encodeBase64(byteString.getData$jvm(), Base64.getBASE64_URL_SAFE());
    }

    public static final ByteString commonDecodeBase64(String str) {
        C52711k.m112240b(str, "$receiver");
        byte[] decodeBase64ToArray = Base64.decodeBase64ToArray(str);
        if (decodeBase64ToArray != null) {
            return new ByteString(decodeBase64ToArray);
        }
        return null;
    }

    public static final ByteString commonEncodeUtf8(String str) {
        C52711k.m112240b(str, "$receiver");
        ByteString byteString = new ByteString(Platform.asUtf8ToByteArray(str));
        byteString.setUtf8$jvm(str);
        return byteString;
    }

    public static final int commonHashCode(ByteString byteString) {
        C52711k.m112240b(byteString, "$receiver");
        int hashCode$jvm = byteString.getHashCode$jvm();
        if (hashCode$jvm != 0) {
            return hashCode$jvm;
        }
        byteString.setHashCode$jvm(Platform.hashCode(byteString.getData$jvm()));
        return byteString.getHashCode$jvm();
    }

    public static final ByteString commonOf(byte[] bArr) {
        C52711k.m112240b(bArr, "data");
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        C52711k.m112236a((Object) copyOf, "java.util.Arrays.copyOf(this, size)");
        return new ByteString(copyOf);
    }

    public static final byte[] commonToByteArray(ByteString byteString) {
        C52711k.m112240b(byteString, "$receiver");
        byte[] data$jvm = byteString.getData$jvm();
        byte[] copyOf = Arrays.copyOf(data$jvm, data$jvm.length);
        C52711k.m112236a((Object) copyOf, "java.util.Arrays.copyOf(this, size)");
        return copyOf;
    }

    public static final String commonUtf8(ByteString byteString) {
        C52711k.m112240b(byteString, "$receiver");
        String utf8$jvm = byteString.getUtf8$jvm();
        if (utf8$jvm != null) {
            return utf8$jvm;
        }
        String utf8String = Platform.toUtf8String(byteString.getData$jvm());
        byteString.setUtf8$jvm(utf8String);
        return utf8String;
    }

    public static final String commonHex(ByteString byteString) {
        byte[] data$jvm;
        C52711k.m112240b(byteString, "$receiver");
        char[] cArr = new char[(byteString.getData$jvm().length * 2)];
        int i = 0;
        for (byte b : byteString.getData$jvm()) {
            int i2 = i + 1;
            cArr[i] = ByteString.Companion.getHEX_DIGITS$jvm()[(b >> 4) & 15];
            i = i2 + 1;
            cArr[i2] = ByteString.Companion.getHEX_DIGITS$jvm()[b & 15];
        }
        return Platform.createString(cArr);
    }

    private static final int decodeHexDigit(char c) {
        if ('0' <= c && '9' >= c) {
            return c - '0';
        }
        if ('a' <= c && 'f' >= c) {
            return (c - 'a') + 10;
        }
        if ('A' <= c && 'F' >= c) {
            return (c - 'A') + 10;
        }
        StringBuilder sb = new StringBuilder("Unexpected hex digit: ");
        sb.append(c);
        throw new IllegalArgumentException(sb.toString());
    }

    public static final ByteString commonDecodeHex(String str) {
        boolean z;
        C52711k.m112240b(str, "$receiver");
        if (str.length() % 2 == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            byte[] bArr = new byte[(str.length() / 2)];
            int length = bArr.length;
            for (int i = 0; i < length; i++) {
                int i2 = i * 2;
                bArr[i] = (byte) ((decodeHexDigit(str.charAt(i2)) << 4) + decodeHexDigit(str.charAt(i2 + 1)));
            }
            return new ByteString(bArr);
        }
        StringBuilder sb = new StringBuilder("Unexpected hex string: ");
        sb.append(str);
        throw new IllegalArgumentException(sb.toString().toString());
    }

    public static final ByteString commonToAsciiLowercase(ByteString byteString) {
        C52711k.m112240b(byteString, "$receiver");
        int i = 0;
        while (i < byteString.getData$jvm().length) {
            byte b = byteString.getData$jvm()[i];
            if (b < 65 || b > 90) {
                i++;
            } else {
                byte[] data$jvm = byteString.getData$jvm();
                byte[] copyOf = Arrays.copyOf(data$jvm, data$jvm.length);
                C52711k.m112236a((Object) copyOf, "java.util.Arrays.copyOf(this, size)");
                int i2 = i + 1;
                copyOf[i] = (byte) (b + 32);
                while (i2 < copyOf.length) {
                    byte b2 = copyOf[i2];
                    if (b2 < 65 || b2 > 90) {
                        i2++;
                    } else {
                        copyOf[i2] = (byte) (b2 + 32);
                        i2++;
                    }
                }
                return new ByteString(copyOf);
            }
        }
        return byteString;
    }

    public static final ByteString commonToAsciiUppercase(ByteString byteString) {
        C52711k.m112240b(byteString, "$receiver");
        int i = 0;
        while (i < byteString.getData$jvm().length) {
            byte b = byteString.getData$jvm()[i];
            if (b < 97 || b > 122) {
                i++;
            } else {
                byte[] data$jvm = byteString.getData$jvm();
                byte[] copyOf = Arrays.copyOf(data$jvm, data$jvm.length);
                C52711k.m112236a((Object) copyOf, "java.util.Arrays.copyOf(this, size)");
                int i2 = i + 1;
                copyOf[i] = (byte) (b - 32);
                while (i2 < copyOf.length) {
                    byte b2 = copyOf[i2];
                    if (b2 < 97 || b2 > 122) {
                        i2++;
                    } else {
                        copyOf[i2] = (byte) (b2 - 32);
                        i2++;
                    }
                }
                return new ByteString(copyOf);
            }
        }
        return byteString;
    }

    public static final String commonToString(ByteString byteString) {
        boolean z;
        ByteString byteString2 = byteString;
        C52711k.m112240b(byteString2, "$receiver");
        if (byteString.getData$jvm().length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return "[size=0]";
        }
        int codePointIndexToCharIndex = codePointIndexToCharIndex(byteString.getData$jvm(), 64);
        if (codePointIndexToCharIndex != -1) {
            String utf8 = byteString.utf8();
            if (utf8 != null) {
                String substring = utf8.substring(0, codePointIndexToCharIndex);
                C52711k.m112236a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                String a = C52830p.m112400a(C52830p.m112400a(C52830p.m112400a(substring, "\\", "\\\\", false), "\n", "\\n", false), "\r", "\\r", false);
                if (codePointIndexToCharIndex < utf8.length()) {
                    StringBuilder sb = new StringBuilder("[size=");
                    sb.append(byteString.getData$jvm().length);
                    sb.append(" text=");
                    sb.append(a);
                    sb.append("…]");
                    return sb.toString();
                }
                StringBuilder sb2 = new StringBuilder("[text=");
                sb2.append(a);
                sb2.append(']');
                return sb2.toString();
            }
            throw new C52857u("null cannot be cast to non-null type java.lang.String");
        } else if (byteString.getData$jvm().length <= 64) {
            StringBuilder sb3 = new StringBuilder("[hex=");
            sb3.append(byteString.hex());
            sb3.append(']');
            return sb3.toString();
        } else {
            StringBuilder sb4 = new StringBuilder("[size=");
            sb4.append(byteString.getData$jvm().length);
            sb4.append(" hex=");
            sb4.append(commonSubstring(byteString2, 0, 64).hex());
            sb4.append("…]");
            return sb4.toString();
        }
    }

    public static final byte commonGetByte(ByteString byteString, int i) {
        C52711k.m112240b(byteString, "$receiver");
        return byteString.getData$jvm()[i];
    }

    public static final boolean commonEndsWith(ByteString byteString, ByteString byteString2) {
        C52711k.m112240b(byteString, "$receiver");
        C52711k.m112240b(byteString2, "suffix");
        return byteString.rangeEquals(byteString.size() - byteString2.size(), byteString2, 0, byteString2.size());
    }

    public static final boolean commonStartsWith(ByteString byteString, ByteString byteString2) {
        C52711k.m112240b(byteString, "$receiver");
        C52711k.m112240b(byteString2, "prefix");
        return byteString.rangeEquals(0, byteString2, 0, byteString2.size());
    }

    public static final int codePointIndexToCharIndex(byte[] bArr, int i) {
        C52711k.m112240b(bArr, "s");
        int length = bArr.length;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i2 < length && i3 != i) {
            int codePointAt = Utf8.codePointAt(bArr, i2);
            if ((codePointAt != 10 && codePointAt != 13 && Utf8.isIsoControl(codePointAt)) || codePointAt == 65533) {
                return -1;
            }
            i3++;
            i4 += Utf8.codePointCharCount(codePointAt);
            i2 += Utf8.codePointByteCount(codePointAt);
        }
        return i4;
    }

    public static final int commonCompareTo(ByteString byteString, ByteString byteString2) {
        C52711k.m112240b(byteString, "$receiver");
        C52711k.m112240b(byteString2, "other");
        int size = byteString.size();
        int size2 = byteString2.size();
        int min = Math.min(size, size2);
        int i = 0;
        while (i < min) {
            byte b = byteString.getByte(i) & 255;
            byte b2 = byteString2.getByte(i) & 255;
            if (b == b2) {
                i++;
            } else if (b < b2) {
                return -1;
            } else {
                return 1;
            }
        }
        if (size == size2) {
            return 0;
        }
        if (size < size2) {
            return -1;
        }
        return 1;
    }

    public static final boolean commonEndsWith(ByteString byteString, byte[] bArr) {
        C52711k.m112240b(byteString, "$receiver");
        C52711k.m112240b(bArr, "suffix");
        return byteString.rangeEquals(byteString.size() - bArr.length, bArr, 0, bArr.length);
    }

    public static final boolean commonEquals(ByteString byteString, Object obj) {
        C52711k.m112240b(byteString, "$receiver");
        if (obj == byteString) {
            return true;
        }
        if (!(obj instanceof ByteString)) {
            return false;
        }
        ByteString byteString2 = (ByteString) obj;
        if (byteString2.size() != byteString.getData$jvm().length || !byteString2.rangeEquals(0, byteString.getData$jvm(), 0, byteString.getData$jvm().length)) {
            return false;
        }
        return true;
    }

    public static final boolean commonStartsWith(ByteString byteString, byte[] bArr) {
        C52711k.m112240b(byteString, "$receiver");
        C52711k.m112240b(bArr, "prefix");
        return byteString.rangeEquals(0, bArr, 0, bArr.length);
    }

    public static final int commonIndexOf(ByteString byteString, byte[] bArr, int i) {
        C52711k.m112240b(byteString, "$receiver");
        C52711k.m112240b(bArr, "other");
        int length = byteString.getData$jvm().length - bArr.length;
        int max = Math.max(i, 0);
        if (max <= length) {
            while (!Util.arrayRangeEquals(byteString.getData$jvm(), max, bArr, 0, bArr.length)) {
                if (max != length) {
                    max++;
                }
            }
            return max;
        }
        return -1;
    }

    public static final ByteString commonSubstring(ByteString byteString, int i, int i2) {
        boolean z;
        boolean z2;
        C52711k.m112240b(byteString, "$receiver");
        boolean z3 = true;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (i2 <= byteString.getData$jvm().length) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                int i3 = i2 - i;
                if (i3 < 0) {
                    z3 = false;
                }
                if (!z3) {
                    throw new IllegalArgumentException("endIndex < beginIndex".toString());
                } else if (i == 0 && i2 == byteString.getData$jvm().length) {
                    return byteString;
                } else {
                    byte[] bArr = new byte[i3];
                    Platform.arraycopy(byteString.getData$jvm(), i, bArr, 0, i3);
                    return new ByteString(bArr);
                }
            } else {
                StringBuilder sb = new StringBuilder("endIndex > length(");
                sb.append(byteString.getData$jvm().length);
                sb.append(')');
                throw new IllegalArgumentException(sb.toString().toString());
            }
        } else {
            throw new IllegalArgumentException("beginIndex < 0".toString());
        }
    }

    public static final boolean commonRangeEquals(ByteString byteString, int i, ByteString byteString2, int i2, int i3) {
        C52711k.m112240b(byteString, "$receiver");
        C52711k.m112240b(byteString2, "other");
        return byteString2.rangeEquals(i2, byteString.getData$jvm(), i, i3);
    }

    public static final boolean commonRangeEquals(ByteString byteString, int i, byte[] bArr, int i2, int i3) {
        C52711k.m112240b(byteString, "$receiver");
        C52711k.m112240b(bArr, "other");
        if (i < 0 || i > byteString.getData$jvm().length - i3 || i2 < 0 || i2 > bArr.length - i3 || !Util.arrayRangeEquals(byteString.getData$jvm(), i, bArr, i2, i3)) {
            return false;
        }
        return true;
    }
}
