package com.p683ss.android.ugc.aweme.friends.adapter;

import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.profile.model.RecommendAwemeItem;

/* renamed from: com.ss.android.ugc.aweme.friends.adapter.s */
final /* synthetic */ class C32545s implements OnClickListener {

    /* renamed from: a */
    private final C32543r f84730a;

    /* renamed from: b */
    private final int f84731b;

    C32545s(C32543r rVar, int i) {
        this.f84730a = rVar;
        this.f84731b = i;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        C32543r rVar = this.f84730a;
        int i = this.f84731b;
        if (rVar.f70665k != null && !TextUtils.isEmpty(((RecommendAwemeItem) rVar.f70665k).getAid()) && rVar.f84727b != null) {
            rVar.f84727b.mo65818a(((RecommendAwemeItem) rVar.f70665k).getAid(), i);
        }
    }
}
