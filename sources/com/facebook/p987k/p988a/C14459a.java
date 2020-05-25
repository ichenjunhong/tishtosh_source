package com.facebook.p987k.p988a;

import com.taobao.android.dexposed.ClassUtils;
import java.util.NoSuchElementException;

/* renamed from: com.facebook.k.a.a */
final class C14459a {

    /* renamed from: a */
    byte[] f37551a;

    /* renamed from: b */
    int f37552b;

    /* renamed from: c */
    int f37553c;

    /* renamed from: d */
    char f37554d;

    /* renamed from: e */
    boolean f37555e;

    C14459a() {
    }

    /* renamed from: d */
    private void m29580d() {
        if (!this.f37555e) {
            throw new IllegalStateException("Must call useDelimiter first");
        }
    }

    /* renamed from: c */
    public final void mo26623c() throws NoSuchElementException {
        mo26620a();
        m29580d();
        m29581e();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo26620a() {
        if (this.f37551a == null) {
            throw new IllegalStateException("Must call reset first");
        }
    }

    /* renamed from: b */
    public final int mo26622b() throws NoSuchElementException {
        mo26620a();
        m29580d();
        int i = this.f37552b;
        int e = m29581e();
        byte[] bArr = this.f37551a;
        int i2 = e + i;
        int i3 = 0;
        while (i < i2) {
            int i4 = i + 1;
            int i5 = bArr[i] - 48;
            if (i5 < 0 || i5 > 9) {
                StringBuilder sb = new StringBuilder("Invalid int in buffer at ");
                sb.append(i4 - 1);
                sb.append(ClassUtils.PACKAGE_SEPARATOR);
                throw new NumberFormatException(sb.toString());
            }
            i3 = (i3 * 10) + i5;
            i = i4;
        }
        return i3;
    }

    /* renamed from: e */
    private int m29581e() throws NoSuchElementException {
        mo26620a();
        m29580d();
        if (this.f37553c > this.f37552b) {
            int a = m29579a(this.f37551a, this.f37552b, this.f37553c, this.f37554d);
            if (a == -1) {
                int i = this.f37553c - this.f37552b;
                this.f37552b = this.f37553c;
                return i;
            }
            int i2 = a - this.f37552b;
            this.f37552b = a + 1;
            return i2;
        }
        StringBuilder sb = new StringBuilder("Reading past end of input stream at ");
        sb.append(this.f37552b);
        sb.append(ClassUtils.PACKAGE_SEPARATOR);
        throw new NoSuchElementException(sb.toString());
    }

    /* renamed from: a */
    public final boolean mo26621a(String str) throws NoSuchElementException {
        int i = this.f37552b;
        if (str.length() != m29581e()) {
            return false;
        }
        int i2 = i;
        for (int i3 = 0; i3 < str.length(); i3++) {
            if (str.charAt(i3) != this.f37551a[i2]) {
                return false;
            }
            i2++;
        }
        return true;
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=char, code=byte, for r4v0, types: [char, byte] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m29579a(byte[] r1, int r2, int r3, byte r4) {
        /*
        L_0x0000:
            if (r2 >= r3) goto L_0x000a
            byte r0 = r1[r2]
            if (r0 != r4) goto L_0x0007
            return r2
        L_0x0007:
            int r2 = r2 + 1
            goto L_0x0000
        L_0x000a:
            r1 = -1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.p987k.p988a.C14459a.m29579a(byte[], int, int, char):int");
    }
}
