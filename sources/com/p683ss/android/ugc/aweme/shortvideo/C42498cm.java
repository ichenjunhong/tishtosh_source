package com.p683ss.android.ugc.aweme.shortvideo;

import com.p683ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p683ss.android.ugc.aweme.tools.extract.C47033e;
import com.p683ss.android.ugc.aweme.tools.extract.C47038j.C47039a;
import p001a.C0027j;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cm */
final /* synthetic */ class C42498cm implements C47039a {

    /* renamed from: a */
    private final Object f107475a;

    /* renamed from: b */
    private final C47033e f107476b;

    /* renamed from: c */
    private final C0027j f107477c;

    C42498cm(Object obj, C47033e eVar, C0027j jVar) {
        this.f107475a = obj;
        this.f107476b = eVar;
        this.f107477c = jVar;
    }

    /* renamed from: a */
    public final void mo86668a(boolean z) {
        Object obj = this.f107475a;
        C47033e eVar = this.f107476b;
        C0027j jVar = this.f107477c;
        ((VideoPublishEditModel) obj).extractFramesModel = eVar.mo94324e();
        jVar.mo47b(null);
    }
}
