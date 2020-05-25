package com.p683ss.android.ugc.aweme.newfollow.p2003vh;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.newfollow.p1998e.C37863f;
import com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p683ss.android.ugc.aweme.shortvideo.p2205i.C43890d;
import com.p683ss.android.ugc.aweme.utils.C47718bf;

/* renamed from: com.ss.android.ugc.aweme.newfollow.vh.ad */
public final /* synthetic */ class C37951ad implements OnClickListener {

    /* renamed from: a */
    private final UpLoadRecoverItemViewHolder f96632a;

    /* renamed from: b */
    private final C37863f f96633b;

    public C37951ad(UpLoadRecoverItemViewHolder upLoadRecoverItemViewHolder, C37863f fVar) {
        this.f96632a = upLoadRecoverItemViewHolder;
        this.f96633b = fVar;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        UpLoadRecoverItemViewHolder upLoadRecoverItemViewHolder = this.f96632a;
        C37863f fVar = this.f96633b;
        AVExternalServiceImpl.getAVServiceImpl_Monster().publishService().publishFromDraft(upLoadRecoverItemViewHolder.f96619a, fVar.f96393a);
        C47718bf.m103288a(new C43890d(false));
        C26890h.m65011a("publish_retry", C23089d.m56640a().mo47829a("action_type", "publish").mo47829a("creation_id", fVar.f96393a.mo58817z()).f61491a);
    }
}
