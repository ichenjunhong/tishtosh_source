package com.bytedance.android.live.broadcast.preview;

import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0183j;
import android.arch.lifecycle.C0200t;
import com.bytedance.android.live.core.widget.C4104a;

class StartLiveFragmentDefault$10 implements C0183j {

    /* renamed from: a */
    final /* synthetic */ C4104a f9923a;

    /* renamed from: b */
    final /* synthetic */ C3514al f9924b;

    @C0200t(mo345a = C0177a.ON_RESUME)
    public void onResume() {
        this.f9923a.getDialog().setOnDismissListener(new C3546bi(this));
    }
}
