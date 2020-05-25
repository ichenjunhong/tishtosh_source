package com.p683ss.android.ugc.aweme.p1807im;

import android.app.Dialog;
import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.base.p1420ui.C23694h;
import java.lang.ref.WeakReference;

/* renamed from: com.ss.android.ugc.aweme.im.f */
public final /* synthetic */ class C33195f implements C23694h {

    /* renamed from: a */
    private final WeakReference f86191a;

    public C33195f(WeakReference weakReference) {
        this.f86191a = weakReference;
    }

    /* renamed from: a */
    public final void mo49118a(String str, String str2, boolean z, boolean z2) {
        Dialog dialog = (Dialog) this.f86191a.get();
        if (dialog != null && !TextUtils.equals(str, "HOME")) {
            dialog.dismiss();
        }
    }
}
