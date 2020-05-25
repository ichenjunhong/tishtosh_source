package com.p683ss.android.ugc.aweme.shortvideo.p2242ui;

import android.graphics.Bitmap;
import android.os.Bundle;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.aj */
final /* synthetic */ class C44972aj implements Callable {

    /* renamed from: a */
    private final C44971ai f113901a;

    /* renamed from: b */
    private final Bundle f113902b;

    C44972aj(C44971ai aiVar, Bundle bundle) {
        this.f113901a = aiVar;
        this.f113902b = bundle;
    }

    public final Object call() {
        C44971ai aiVar = this.f113901a;
        Bundle bundle = this.f113902b;
        if (bundle != null) {
            aiVar.f113900e = (Bitmap) bundle.getParcelable("cover_data");
        }
        if (aiVar.f113900e == null && aiVar.f109279c != null) {
            aiVar.f113900e = aiVar.f109279c.mo80721c();
        }
        return aiVar.f113900e;
    }
}
