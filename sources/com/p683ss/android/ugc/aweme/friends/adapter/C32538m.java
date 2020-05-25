package com.p683ss.android.ugc.aweme.friends.adapter;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.friends.adapter.m */
final /* synthetic */ class C32538m implements OnClickListener {

    /* renamed from: a */
    private final C32534i f84723a;

    C32538m(C32534i iVar) {
        this.f84723a = iVar;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f84723a.mo65838a("click_card");
    }
}
