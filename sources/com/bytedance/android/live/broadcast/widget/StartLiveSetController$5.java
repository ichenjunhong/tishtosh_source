package com.bytedance.android.live.broadcast.widget;

import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0183j;
import android.arch.lifecycle.C0200t;
import com.bytedance.android.live.core.widget.C4104a;

class StartLiveSetController$5 implements C0183j {

    /* renamed from: a */
    final /* synthetic */ C4104a f10511a;

    /* renamed from: b */
    final /* synthetic */ C3796v f10512b;

    @C0200t(mo345a = C0177a.ON_RESUME)
    public void onResume() {
        this.f10511a.getDialog().setOnDismissListener(new C3751ai(this));
    }

    StartLiveSetController$5(C3796v vVar, C4104a aVar) {
        this.f10512b = vVar;
        this.f10511a = aVar;
    }
}
