package com.p683ss.android.ugc.aweme.shortvideo.p2242ui.p2244b;

import android.content.Context;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.p683ss.android.ugc.aweme.tools.C47351z;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.b.h */
final /* synthetic */ class C45029h implements Runnable {

    /* renamed from: a */
    private final C45017b f114063a;

    C45029h(C45017b bVar) {
        this.f114063a = bVar;
    }

    public final void run() {
        C45017b bVar = this.f114063a;
        Context applicationContext = bVar.f114038p.getApplicationContext();
        int i = bVar.f113990H;
        bVar.f113990H = i + 1;
        C10691a.m21542b(applicationContext, i < 2 ? R.string.d8l : R.string.d8m).mo19066a();
        C47351z zVar = new C47351z();
        zVar.f119503a = 1;
        bVar.mo91335a(zVar);
        bVar.mo91354b(zVar);
    }
}
