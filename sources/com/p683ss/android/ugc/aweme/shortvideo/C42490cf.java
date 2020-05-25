package com.p683ss.android.ugc.aweme.shortvideo;

import com.p683ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import com.p683ss.android.ugc.aweme.tools.extract.C47038j.C47039a;
import com.p683ss.android.ugc.aweme.tools.extract.C47041l;
import p001a.C0027j;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cf */
final /* synthetic */ class C42490cf implements C47039a {

    /* renamed from: a */
    private final Object f107454a;

    /* renamed from: b */
    private final C47041l f107455b;

    /* renamed from: c */
    private final C0027j f107456c;

    C42490cf(Object obj, C47041l lVar, C0027j jVar) {
        this.f107454a = obj;
        this.f107455b = lVar;
        this.f107456c = jVar;
    }

    /* renamed from: a */
    public final void mo86668a(boolean z) {
        Object obj = this.f107454a;
        C47041l lVar = this.f107455b;
        C0027j jVar = this.f107456c;
        ((PhotoMovieContext) obj).extractFramesModel = lVar.mo94324e();
        jVar.mo47b(null);
    }
}
