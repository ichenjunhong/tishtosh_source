package com.p683ss.android.ugc.aweme.p1807im.sdk.module.session;

import android.view.View;
import android.view.View.OnLongClickListener;
import com.p683ss.android.ugc.aweme.p1807im.sdk.module.session.newstyle.p1865b.C34647a;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.module.session.t */
final /* synthetic */ class C34669t implements OnLongClickListener {

    /* renamed from: a */
    private final C34667r f89323a;

    /* renamed from: b */
    private final C34647a f89324b;

    C34669t(C34667r rVar, C34647a aVar) {
        this.f89323a = rVar;
        this.f89324b = aVar;
    }

    public final boolean onLongClick(View view) {
        C34667r rVar = this.f89323a;
        C34647a aVar = this.f89324b;
        if (!(rVar.f89306f == null || aVar == null)) {
            aVar.mo72674a(view.getContext(), rVar.f89307g, rVar.f89306f, 0);
        }
        return true;
    }
}
