package com.bytedance.android.livesdk.p330f;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.bytedance.android.livesdk.f.b */
public abstract class C6767b {

    /* renamed from: a */
    protected boolean f18535a;

    /* renamed from: b */
    protected Context f18536b;

    /* renamed from: c */
    protected View f18537c;

    /* renamed from: d */
    private Set<Dialog> f18538d = new HashSet();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo12901a() {
        this.f18535a = false;
        this.f18536b = null;
        this.f18537c = null;
        for (Dialog dialog : this.f18538d) {
            if (dialog != null && dialog.isShowing()) {
                dialog.dismiss();
            }
        }
        this.f18538d.clear();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo12902a(Context context, View view, Bundle bundle) {
        this.f18536b = context;
        this.f18537c = view;
        this.f18535a = true;
    }
}
