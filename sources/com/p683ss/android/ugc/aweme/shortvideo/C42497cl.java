package com.p683ss.android.ugc.aweme.shortvideo;

import com.p683ss.android.ugc.aweme.tools.extract.C47033e;
import com.p683ss.android.ugc.aweme.tools.extract.C47038j.C47039a;
import java.util.List;
import java.util.concurrent.Callable;
import p001a.C0027j;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cl */
final /* synthetic */ class C42497cl implements Callable {

    /* renamed from: a */
    private final List f107472a;

    /* renamed from: b */
    private final Object f107473b;

    /* renamed from: c */
    private final C0027j f107474c;

    C42497cl(List list, Object obj, C0027j jVar) {
        this.f107472a = list;
        this.f107473b = obj;
        this.f107474c = jVar;
    }

    public final Object call() {
        List list = this.f107472a;
        Object obj = this.f107473b;
        C0027j jVar = this.f107474c;
        C47033e eVar = new C47033e(list);
        eVar.mo94318a((C47039a) new C42498cm(obj, eVar, jVar));
        return null;
    }
}
