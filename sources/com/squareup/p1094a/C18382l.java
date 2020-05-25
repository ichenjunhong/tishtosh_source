package com.squareup.p1094a;

import android.graphics.Bitmap;
import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.squareup.a.l */
public interface C18382l {

    /* renamed from: com.squareup.a.l$a */
    public static class C18383a {

        /* renamed from: a */
        public final InputStream f50760a;

        /* renamed from: b */
        public final Bitmap f50761b;

        /* renamed from: c */
        final boolean f50762c;

        /* renamed from: d */
        public final long f50763d;

        public C18383a(InputStream inputStream, boolean z, long j) {
            if (inputStream != null) {
                this.f50760a = inputStream;
                this.f50761b = null;
                this.f50762c = z;
                this.f50763d = j;
                return;
            }
            throw new IllegalArgumentException("Stream may not be null.");
        }
    }

    /* renamed from: com.squareup.a.l$b */
    public static class C18384b extends IOException {

        /* renamed from: a */
        final boolean f50764a;

        /* renamed from: b */
        final int f50765b;

        public C18384b(String str, int i, int i2) {
            super(str);
            this.f50764a = C18392s.isOfflineOnly(i);
            this.f50765b = i2;
        }
    }

    /* renamed from: a */
    C18383a mo36800a(Uri uri, int i) throws IOException;
}
