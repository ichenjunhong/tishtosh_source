package com.google.p997a.p998a.p1020g.p1021a;

/* renamed from: com.google.a.a.g.a.e */
public abstract class C14791e extends C14787b {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo27109a(CharSequence charSequence, int i, int i2);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract char[] mo27110a(int i);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo27112a(String str, int i) {
        int i2;
        int length = str.length();
        char[] cArr = (char[]) C14789d.f38307a.get();
        int i3 = 0;
        int i4 = 0;
        while (i < length) {
            if (i < length) {
                int i5 = i + 1;
                char charAt = str.charAt(i);
                int i6 = 1;
                if (charAt >= 55296 && charAt <= 57343) {
                    if (charAt > 56319) {
                        int i7 = i5 - 1;
                        StringBuilder sb = new StringBuilder(82);
                        sb.append("Unexpected low surrogate character '");
                        sb.append(charAt);
                        sb.append("' with value ");
                        sb.append(charAt);
                        sb.append(" at index ");
                        sb.append(i7);
                        throw new IllegalArgumentException(sb.toString());
                    } else if (i5 == length) {
                        charAt = -charAt;
                    } else {
                        char charAt2 = str.charAt(i5);
                        if (Character.isLowSurrogate(charAt2)) {
                            charAt = Character.toCodePoint(charAt, charAt2);
                        } else {
                            StringBuilder sb2 = new StringBuilder(83);
                            sb2.append("Expected low surrogate but got char '");
                            sb2.append(charAt2);
                            sb2.append("' with value ");
                            sb2.append(charAt2);
                            sb2.append(" at index ");
                            sb2.append(i5);
                            throw new IllegalArgumentException(sb2.toString());
                        }
                    }
                }
                if (charAt >= 0) {
                    char[] a = mo27110a(charAt);
                    if (Character.isSupplementaryCodePoint(charAt)) {
                        i6 = 2;
                    }
                    int i8 = i6 + i;
                    if (a != null) {
                        int i9 = i - i3;
                        int i10 = i4 + i9;
                        int length2 = a.length + i10;
                        if (cArr.length < length2) {
                            cArr = m30250a(cArr, i4, ((length2 + length) - i) + 32);
                        }
                        if (i9 > 0) {
                            str.getChars(i3, i, cArr, i4);
                            i4 = i10;
                        }
                        if (a.length > 0) {
                            System.arraycopy(a, 0, cArr, i4, a.length);
                            i4 += a.length;
                        }
                        i3 = i8;
                    }
                    i = mo27109a((CharSequence) str, i8, length);
                } else {
                    throw new IllegalArgumentException("Trailing high surrogate at end of input");
                }
            } else {
                throw new IndexOutOfBoundsException("Index exceeds specified range");
            }
        }
        int i11 = length - i3;
        if (i11 > 0) {
            i2 = i11 + i4;
            if (cArr.length < i2) {
                cArr = m30250a(cArr, i4, i2);
            }
            str.getChars(i3, length, cArr, i4);
        } else {
            i2 = i4;
        }
        return new String(cArr, 0, i2);
    }

    /* renamed from: a */
    private static char[] m30250a(char[] cArr, int i, int i2) {
        char[] cArr2 = new char[i2];
        if (i > 0) {
            System.arraycopy(cArr, 0, cArr2, 0, i);
        }
        return cArr2;
    }
}
