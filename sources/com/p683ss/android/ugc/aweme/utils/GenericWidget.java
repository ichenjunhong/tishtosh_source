package com.p683ss.android.ugc.aweme.utils;

import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0199s;
import android.arch.lifecycle.GenericLifecycleObserver;
import com.p683ss.android.ugc.aweme.arch.widgets.base.C23274a;
import com.p683ss.android.ugc.aweme.arch.widgets.base.Widget;

/* renamed from: com.ss.android.ugc.aweme.utils.GenericWidget */
public class GenericWidget extends Widget implements GenericLifecycleObserver, C0199s<C23274a> {
    /* renamed from: a */
    public void onChanged(C23274a aVar) {
    }

    /* renamed from: e */
    public final void mo94947e() {
        super.onDestroy();
    }

    public final boolean ci_() {
        return super.ci_();
    }

    /* renamed from: a */
    public final void mo265a(C0184k kVar, C0177a aVar) {
        if (aVar == C0177a.ON_CREATE) {
            onCreate();
        } else if (aVar == C0177a.ON_START) {
            onStart();
        } else if (aVar == C0177a.ON_PAUSE) {
            onPause();
        } else if (aVar == C0177a.ON_RESUME) {
            onResume();
        } else if (aVar == C0177a.ON_STOP) {
            onStop();
        } else {
            if (aVar == C0177a.ON_DESTROY) {
                onDestroy();
            }
        }
    }
}
