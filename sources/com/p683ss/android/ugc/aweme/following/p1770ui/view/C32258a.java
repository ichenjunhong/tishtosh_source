package com.p683ss.android.ugc.aweme.following.p1770ui.view;

import android.arch.lifecycle.C0184k;
import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.following.ui.view.a */
public final class C32258a extends View implements C32259b {
    /* renamed from: a */
    public final void mo65360a(int i, int i2) {
    }

    public final void setFollowStatus(int i) {
    }

    public final C0184k getLifeCycleOwner() {
        Context context = getContext();
        if (context != null) {
            return (C0184k) context;
        }
        throw new C52857u("null cannot be cast to non-null type android.arch.lifecycle.LifecycleOwner");
    }

    public C32258a(Context context) {
        super(context);
    }

    public final void setOnClickListener(OnClickListener onClickListener) {
        C52711k.m112240b(onClickListener, "listener");
        onClickListener.onClick(this);
    }
}
