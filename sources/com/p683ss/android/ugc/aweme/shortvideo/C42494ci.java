package com.p683ss.android.ugc.aweme.shortvideo;

import com.p683ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p683ss.android.ugc.aweme.tools.extract.C47038j.C47039a;
import com.p683ss.android.ugc.aweme.tools.extract.C47041l;
import java.util.Collections;
import java.util.concurrent.Callable;
import p001a.C0027j;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ci */
final /* synthetic */ class C42494ci implements Callable {

    /* renamed from: a */
    private final Object f107466a;

    /* renamed from: b */
    private final C0027j f107467b;

    C42494ci(Object obj, C0027j jVar) {
        this.f107466a = obj;
        this.f107467b = jVar;
    }

    public final Object call() {
        Object obj = this.f107466a;
        C0027j jVar = this.f107467b;
        C47041l lVar = new C47041l(Collections.singletonList(((VideoPublishEditModel) obj).statusCreateVideoData.getBgSrcImage()));
        lVar.mo94318a((C47039a) new C42488cd(obj, lVar, jVar));
        return null;
    }
}
