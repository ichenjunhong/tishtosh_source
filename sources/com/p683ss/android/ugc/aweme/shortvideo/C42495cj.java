package com.p683ss.android.ugc.aweme.shortvideo;

import com.p683ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p683ss.android.ugc.aweme.tools.extract.C47038j.C47039a;
import com.p683ss.android.ugc.aweme.tools.extract.C47049q;
import java.util.concurrent.Callable;
import p001a.C0027j;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cj */
final /* synthetic */ class C42495cj implements Callable {

    /* renamed from: a */
    private final Object f107468a;

    /* renamed from: b */
    private final C0027j f107469b;

    C42495cj(Object obj, C0027j jVar) {
        this.f107468a = obj;
        this.f107469b = jVar;
    }

    public final Object call() {
        Object obj = this.f107468a;
        C0027j jVar = this.f107469b;
        C47049q qVar = new C47049q(((VideoPublishEditModel) obj).getPreviewInfo());
        qVar.mo94318a((C47039a) new C42487cc(obj, qVar, jVar));
        return null;
    }
}
