package com.p683ss.android.ugc.aweme.newfollow.p2003vh;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.newfollow.p1998e.C37863f;
import com.p683ss.android.ugc.aweme.shortvideo.p2205i.C43890d;
import com.p683ss.android.ugc.aweme.utils.C47718bf;

/* renamed from: com.ss.android.ugc.aweme.newfollow.vh.ac */
public final /* synthetic */ class C37950ac implements OnClickListener {

    /* renamed from: a */
    private final C37863f f96631a;

    public C37950ac(C37863f fVar) {
        this.f96631a = fVar;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        C37863f fVar = this.f96631a;
        C47718bf.m103288a(new C43890d(false));
        C26890h.m65011a("publish_retry", C23089d.m56640a().mo47829a("action_type", "cancel").mo47829a("creation_id", fVar.f96393a.mo58817z()).f61491a);
    }
}
