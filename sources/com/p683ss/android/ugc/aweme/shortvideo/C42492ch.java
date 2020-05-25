package com.p683ss.android.ugc.aweme.shortvideo;

import com.p683ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p683ss.android.ugc.aweme.tools.extract.C47038j.C47039a;
import com.p683ss.android.ugc.aweme.tools.extract.C47041l;
import java.util.concurrent.Callable;
import p001a.C0027j;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ch */
final /* synthetic */ class C42492ch implements Callable {

    /* renamed from: a */
    private final Object f107459a;

    /* renamed from: b */
    private final C0027j f107460b;

    C42492ch(Object obj, C0027j jVar) {
        this.f107459a = obj;
        this.f107460b = jVar;
    }

    public final Object call() {
        Object obj = this.f107459a;
        C0027j jVar = this.f107460b;
        C47041l lVar = new C47041l(((VideoPublishEditModel) obj).mvCreateVideoData.selectMediaList);
        lVar.mo94318a((C47039a) new C42489ce(obj, lVar, jVar));
        return null;
    }
}
