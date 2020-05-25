package com.p683ss.android.ugc.aweme.mobile;

import android.app.Activity;
import com.bytedance.ies.uikit.dialog.C11104b;

/* renamed from: com.ss.android.ugc.aweme.mobile.i */
final class C37147i extends C11104b {

    /* renamed from: c */
    public C37148a f94821c;

    /* renamed from: com.ss.android.ugc.aweme.mobile.i$a */
    interface C37148a {
        /* renamed from: a */
        void mo76417a(boolean z);
    }

    C37147i(Activity activity) {
        super(activity);
    }

    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (this.f94821c != null) {
            this.f94821c.mo76417a(z);
        }
    }
}
