package com.p683ss.android.ugc.aweme.notification.view;

import android.content.Context;
import android.support.p043v7.widget.LinearLayoutManager;

/* renamed from: com.ss.android.ugc.aweme.notification.view.CustomLinearLayoutManager */
public class CustomLinearLayoutManager extends LinearLayoutManager {

    /* renamed from: a */
    public boolean f97861a = false;

    /* renamed from: e */
    public final boolean mo4742e() {
        if (!this.f97861a || !super.mo4742e()) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo4745f() {
        if (!this.f97861a || !super.mo4745f()) {
            return false;
        }
        return true;
    }

    public CustomLinearLayoutManager(Context context) {
        super(context);
    }
}
