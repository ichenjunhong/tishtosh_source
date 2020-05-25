package com.google.android.gms.internal.ads;

import java.io.Closeable;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.yj */
public class C16400yj extends bcx implements Closeable {

    /* renamed from: f */
    private static bdf f45987f = bdf.m35439a(C16400yj.class);

    public C16400yj(bcz bcz, C16371xh xhVar) throws IOException {
        mo30043a(bcz, bcz.mo29078a(), xhVar);
    }

    public void close() throws IOException {
        this.f41910b.close();
    }

    public String toString() {
        String obj = this.f41910b.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 7);
        sb.append("model(");
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }
}
