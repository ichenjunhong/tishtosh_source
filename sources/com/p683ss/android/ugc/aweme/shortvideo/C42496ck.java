package com.p683ss.android.ugc.aweme.shortvideo;

import com.p683ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p683ss.android.ugc.aweme.tools.extract.C47030d;
import com.p683ss.android.ugc.aweme.tools.extract.C47038j.C47039a;
import java.util.concurrent.Callable;
import p001a.C0027j;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ck */
final /* synthetic */ class C42496ck implements Callable {

    /* renamed from: a */
    private final Object f107470a;

    /* renamed from: b */
    private final C0027j f107471b;

    C42496ck(Object obj, C0027j jVar) {
        this.f107470a = obj;
        this.f107471b = jVar;
    }

    public final Object call() {
        new C47030d((VideoPublishEditModel) this.f107470a).mo94318a((C47039a) new C42499cn(this.f107471b));
        return null;
    }
}
