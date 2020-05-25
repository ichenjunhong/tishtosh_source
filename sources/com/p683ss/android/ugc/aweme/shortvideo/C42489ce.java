package com.p683ss.android.ugc.aweme.shortvideo;

import com.p683ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p683ss.android.ugc.aweme.tools.extract.C47038j.C47039a;
import com.p683ss.android.ugc.aweme.tools.extract.C47041l;
import p001a.C0027j;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ce */
final /* synthetic */ class C42489ce implements C47039a {

    /* renamed from: a */
    private final Object f107451a;

    /* renamed from: b */
    private final C47041l f107452b;

    /* renamed from: c */
    private final C0027j f107453c;

    C42489ce(Object obj, C47041l lVar, C0027j jVar) {
        this.f107451a = obj;
        this.f107452b = lVar;
        this.f107453c = jVar;
    }

    /* renamed from: a */
    public final void mo86668a(boolean z) {
        Object obj = this.f107451a;
        C47041l lVar = this.f107452b;
        C0027j jVar = this.f107453c;
        ((VideoPublishEditModel) obj).extractFramesModel = lVar.mo94324e();
        jVar.mo47b(null);
    }
}
