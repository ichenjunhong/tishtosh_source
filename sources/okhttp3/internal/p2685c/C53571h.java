package okhttp3.internal.p2685c;

import okhttp3.C53506ae;
import okhttp3.C53678w;
import okio.BufferedSource;

/* renamed from: okhttp3.internal.c.h */
public final class C53571h extends C53506ae {

    /* renamed from: a */
    private final String f132772a;

    /* renamed from: b */
    private final long f132773b;

    /* renamed from: c */
    private final BufferedSource f132774c;

    public final long contentLength() {
        return this.f132773b;
    }

    public final BufferedSource source() {
        return this.f132774c;
    }

    public final C53678w contentType() {
        if (this.f132772a != null) {
            return C53678w.m114225a(this.f132772a);
        }
        return null;
    }

    public C53571h(String str, long j, BufferedSource bufferedSource) {
        this.f132772a = str;
        this.f132773b = j;
        this.f132774c = bufferedSource;
    }
}
