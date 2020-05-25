package com.bytedance.android.live.broadcast.preview;

import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0183j;
import android.arch.lifecycle.C0200t;
import com.bytedance.android.live.core.widget.C4104a;

class StartLiveFragmentD$10 implements C0183j {

    /* renamed from: a */
    final /* synthetic */ C4104a f9921a;

    /* renamed from: b */
    final /* synthetic */ C3589i f9922b;

    @C0200t(mo345a = C0177a.ON_RESUME)
    public void onResume() {
        this.f9921a.getDialog().setOnDismissListener(new C3511ai(this));
    }
}
