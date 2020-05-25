package com.p683ss.android.ugc.aweme.shortvideo.p2178c;

import android.view.SurfaceView;
import com.p683ss.android.ugc.asve.p1239c.C20342a;
import com.p683ss.android.ugc.asve.p1239c.C20348d;
import com.p683ss.android.ugc.asve.p1239c.C20349e;
import com.p683ss.android.ugc.asve.p1239c.C20351g;
import com.p683ss.android.ugc.aweme.utils.C47804db;
import com.p683ss.android.ugc.aweme.utils.C47926h;
import com.p683ss.android.vesdk.C50751p;
import leakcanary.internal.LeakCanaryFileProvider;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.c.b */
public final class C42484b extends C20342a {
    public C42484b(String str) throws C50751p {
        C52711k.m112240b(str, "workSpace");
        super(str);
    }

    /* renamed from: a */
    public final int mo42990a(C20348d dVar) {
        C52711k.m112240b(dVar, "param");
        if (dVar instanceof C20349e) {
            C20349e eVar = (C20349e) dVar;
            String[] a = C47926h.m103698a(eVar.f55855j, C47804db.VIDEO);
            C52711k.m112240b(a, "<set-?>");
            eVar.f55855j = a;
        } else if (dVar instanceof C20351g) {
            C20351g gVar = (C20351g) dVar;
            String[] a2 = C47926h.m103698a(gVar.f55859b, C47804db.IMAGE);
            C52711k.m112240b(a2, "<set-?>");
            gVar.f55859b = a2;
        }
        return super.mo42990a(dVar);
    }

    public C42484b(String str, SurfaceView surfaceView) {
        C52711k.m112240b(str, "workSpace");
        C52711k.m112240b(surfaceView, "surfaceView");
        super(str, surfaceView);
    }

    /* renamed from: a */
    public final int mo42999a(String str, int i, int i2) {
        C52711k.m112240b(str, LeakCanaryFileProvider.f132050j);
        return super.mo42999a(C47926h.m103696a(str, C47804db.AUDIO), i, i2);
    }

    public C42484b(String str, SurfaceView surfaceView, long j) {
        C52711k.m112240b(str, "workSpace");
        C52711k.m112240b(surfaceView, "surfaceView");
        super(str, surfaceView, j);
    }

    /* renamed from: a */
    public final int mo43001a(String str, int i, int i2, boolean z) {
        C52711k.m112240b(str, "file");
        return super.mo43001a(C47926h.m103696a(str, C47804db.AUDIO), i, i2, z);
    }
}
