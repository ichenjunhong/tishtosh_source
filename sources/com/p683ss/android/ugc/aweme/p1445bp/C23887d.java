package com.p683ss.android.ugc.aweme.p1445bp;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import okhttp3.internal.p2683a.C53539d;
import okhttp3.internal.p2688f.C53623a;

/* renamed from: com.ss.android.ugc.aweme.bp.d */
public final class C23887d implements C23883c, Closeable {

    /* renamed from: a */
    public final C53539d f63555a;

    public final void close() throws IOException {
        if (this.f63555a != null) {
            this.f63555a.close();
        }
    }

    public C23887d(File file, int i, long j) throws IOException {
        this.f63555a = C53539d.m113712a(C53623a.f132977a, file, 1, 2, 16777216);
    }
}
