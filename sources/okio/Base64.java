package okio;

import p2628d.p2639f.p2641b.C52711k;

/* renamed from: okio.-Base64 reason: invalid class name */
public final class Base64 {
    private static final byte[] BASE64 = ByteString.Companion.encodeUtf8("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/").getData$jvm();
    private static final byte[] BASE64_URL_SAFE = ByteString.Companion.encodeUtf8("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_").getData$jvm();

    public static final byte[] getBASE64() {
        return BASE64;
    }

    public static final byte[] getBASE64_URL_SAFE() {
        return BASE64_URL_SAFE;
    }

    public static final byte[] decodeBase64ToArray(String str) {
        int i;
        C52711k.m112240b(str, "$receiver");
        int length = str.length();
        while (length > 0) {
            char charAt = str.charAt(length - 1);
            if (charAt != '=' && charAt != 10 && charAt != 13 && charAt != ' ' && charAt != 9) {
                break;
            }
            length--;
        }
        byte[] bArr = new byte[((int) ((((long) length) * 6) / 8))];
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < length; i5++) {
            char charAt2 = str.charAt(i5);
            if ('A' <= charAt2 && 'Z' >= charAt2) {
                i = charAt2 - 'A';
            } else if ('a' <= charAt2 && 'z' >= charAt2) {
                i = charAt2 - 'G';
            } else if ('0' <= charAt2 && '9' >= charAt2) {
                i = charAt2 + 4;
            } else if (charAt2 == '+' || charAt2 == '-') {
                i = 62;
            } else if (charAt2 == '/' || charAt2 == '_') {
                i = 63;
            } else {
                if (!(charAt2 == 10 || charAt2 == 13 || charAt2 == ' ' || charAt2 == 9)) {
                    return null;
                }
            }
            i3 = (i3 << 6) | i;
            i2++;
            if (i2 % 4 == 0) {
                int i6 = i4 + 1;
                bArr[i4] = (byte) (i3 >> 16);
                int i7 = i6 + 1;
                bArr[i6] = (byte) (i3 >> 8);
                int i8 = i7 + 1;
                bArr[i7] = (byte) i3;
                i4 = i8;
            }
        }
        switch (i2 % 4) {
            case 1:
                return null;
            case 2:
                int i9 = i4 + 1;
                bArr[i4] = (byte) ((i3 << 12) >> 16);
                i4 = i9;
                break;
            case 3:
                int i10 = i3 << 6;
                int i11 = i4 + 1;
                bArr[i4] = (byte) (i10 >> 16);
                i4 = i11 + 1;
                bArr[i11] = (byte) (i10 >> 8);
                break;
        }
        if (i4 == bArr.length) {
            return bArr;
        }
        byte[] bArr2 = new byte[i4];
        Platform.arraycopy(bArr, 0, bArr2, 0, i4);
        return bArr2;
    }

    public static final String encodeBase64(byte[] bArr, byte[] bArr2) {
        C52711k.m112240b(bArr, "$receiver");
        C52711k.m112240b(bArr2, "map");
        byte[] bArr3 = new byte[(((bArr.length + 2) / 3) * 4)];
        int length = bArr.length - (bArr.length % 3);
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = i + 1;
            byte b = bArr[i];
            int i4 = i3 + 1;
            byte b2 = bArr[i3];
            int i5 = i4 + 1;
            byte b3 = bArr[i4];
            int i6 = i2 + 1;
            bArr3[i2] = bArr2[(b & 255) >> 2];
            int i7 = i6 + 1;
            bArr3[i6] = bArr2[((b & 3) << 4) | ((b2 & 255) >> 4)];
            int i8 = i7 + 1;
            bArr3[i7] = bArr2[((b2 & 15) << 2) | ((b3 & 255) >> 6)];
            i2 = i8 + 1;
            bArr3[i8] = bArr2[b3 & 63];
            i = i5;
        }
        switch (bArr.length - length) {
            case 1:
                byte b4 = bArr[i];
                int i9 = i2 + 1;
                bArr3[i2] = bArr2[(b4 & 255) >> 2];
                int i10 = i9 + 1;
                bArr3[i9] = bArr2[(b4 & 3) << 4];
                int i11 = i10 + 1;
                bArr3[i10] = 61;
                bArr3[i11] = 61;
                break;
            case 2:
                int i12 = i + 1;
                byte b5 = bArr[i];
                byte b6 = bArr[i12];
                int i13 = i2 + 1;
                bArr3[i2] = bArr2[(b5 & 255) >> 2];
                int i14 = i13 + 1;
                bArr3[i13] = bArr2[((b5 & 3) << 4) | ((b6 & 255) >> 4)];
                int i15 = i14 + 1;
                bArr3[i14] = bArr2[(b6 & 15) << 2];
                bArr3[i15] = 61;
                break;
        }
        return Platform.toUtf8String(bArr3);
    }

    public static /* synthetic */ String encodeBase64$default(byte[] bArr, byte[] bArr2, int i, Object obj) {
        if ((i & 1) != 0) {
            bArr2 = BASE64;
        }
        return encodeBase64(bArr, bArr2);
    }
}
