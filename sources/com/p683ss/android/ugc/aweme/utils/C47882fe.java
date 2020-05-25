package com.p683ss.android.ugc.aweme.utils;

import android.content.Context;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.p1807im.DefaultIMService;
import com.p683ss.android.ugc.aweme.p1807im.service.IIMService;
import com.p683ss.android.ugc.aweme.p1807im.service.model.C35471h;

/* renamed from: com.ss.android.ugc.aweme.utils.fe */
final /* synthetic */ class C47882fe implements OnClickListener {

    /* renamed from: a */
    private final Context f120473a;

    /* renamed from: b */
    private final C35471h f120474b;

    /* renamed from: c */
    private final Snackbar f120475c;

    C47882fe(Context context, C35471h hVar, Snackbar snackbar) {
        this.f120473a = context;
        this.f120474b = hVar;
        this.f120475c = snackbar;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        Context context = this.f120473a;
        C35471h hVar = this.f120474b;
        Snackbar snackbar = this.f120475c;
        IIMService provideIMService_Monster = DefaultIMService.provideIMService_Monster();
        if (provideIMService_Monster != null) {
            provideIMService_Monster.startChat(context, hVar.contact);
        }
        snackbar.dismiss();
    }
}
