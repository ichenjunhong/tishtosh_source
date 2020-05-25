package com.google.android.gms.internal.ads;

import android.util.Base64OutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

final class bwx {

    /* renamed from: a */
    private ByteArrayOutputStream f44184a = new ByteArrayOutputStream(4096);

    /* renamed from: b */
    private Base64OutputStream f44185b = new Base64OutputStream(this.f44184a, 10);

    /* renamed from: a */
    public final void mo30838a(byte[] bArr) throws IOException {
        this.f44185b.write(bArr);
    }

    public final String toString() {
        try {
            this.f44185b.close();
        } catch (IOException e) {
            abv.m32793b("HashManager: Unable to convert to Base64.", e);
        }
        try {
            this.f44184a.close();
            return this.f44184a.toString();
        } catch (IOException e2) {
            abv.m32793b("HashManager: Unable to convert to Base64.", e2);
            return "";
        } finally {
            this.f44184a = null;
            this.f44185b = null;
        }
    }
}
