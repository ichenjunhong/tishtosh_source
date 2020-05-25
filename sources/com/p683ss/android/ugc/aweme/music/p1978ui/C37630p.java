package com.p683ss.android.ugc.aweme.music.p1978ui;

import android.support.p030v4.p038f.C0777a;
import android.support.p030v4.p038f.C0794k;
import com.p683ss.android.ugc.aweme.p1445bp.C23883c;
import java.io.IOException;

/* renamed from: com.ss.android.ugc.aweme.music.ui.p */
public final class C37630p implements C23883c {

    /* renamed from: a */
    public final C0777a<String, C0794k<Long, byte[]>> f95961a = new C0777a<>();

    /* renamed from: b */
    private final C23883c f95962b;

    public final void close() throws IOException {
        this.f95961a.clear();
        this.f95962b.close();
    }

    public C37630p(C23883c cVar) {
        this.f95962b = cVar;
    }
}
