package com.p683ss.android.ugc.aweme.shortvideo;

import com.p683ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import com.p683ss.android.ugc.aweme.tools.extract.C47038j.C47039a;
import com.p683ss.android.ugc.aweme.tools.extract.C47041l;
import java.util.concurrent.Callable;
import p001a.C0027j;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cg */
final /* synthetic */ class C42491cg implements Callable {

    /* renamed from: a */
    private final Object f107457a;

    /* renamed from: b */
    private final C0027j f107458b;

    C42491cg(Object obj, C0027j jVar) {
        this.f107457a = obj;
        this.f107458b = jVar;
    }

    public final Object call() {
        Object obj = this.f107457a;
        C0027j jVar = this.f107458b;
        C47041l lVar = new C47041l(((PhotoMovieContext) obj).mImageList);
        lVar.mo94318a((C47039a) new C42490cf(obj, lVar, jVar));
        return null;
    }
}
