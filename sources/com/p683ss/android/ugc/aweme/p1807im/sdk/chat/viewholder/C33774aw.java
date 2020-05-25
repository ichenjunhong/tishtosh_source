package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35190af;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewholder.aw */
final /* synthetic */ class C33774aw implements OnClickListener {

    /* renamed from: a */
    private final C33767at f87620a;

    /* renamed from: b */
    private final OnClickListener f87621b;

    C33774aw(C33767at atVar, OnClickListener onClickListener) {
        this.f87620a = atVar;
        this.f87621b = onClickListener;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        C33767at atVar = this.f87620a;
        OnClickListener onClickListener = this.f87621b;
        if (atVar.f87604x == null || !atVar.f87604x.mo70354b()) {
            view.setTag(50331652, null);
            view.setTag(50331653, null);
        } else {
            long c = atVar.f87604x.mo70355c();
            Bundle bundle = new Bundle();
            bundle.putSerializable("currentAweme", atVar.f87605y);
            bundle.putLong("position", c);
            view.setTag(50331652, bundle);
            view.setTag(50331653, atVar.f87602v);
        }
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
        long currentTimeMillis = System.currentTimeMillis() - atVar.f87584B;
        atVar.f87585C = true;
        if (atVar.f87606z != null) {
            C35190af.m79460a(atVar.f87606z.getItemId(), currentTimeMillis);
        }
    }
}
