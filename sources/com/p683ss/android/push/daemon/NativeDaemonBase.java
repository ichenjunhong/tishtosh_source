package com.p683ss.android.push.daemon;

import android.content.Context;
import android.os.Build.VERSION;
import com.p683ss.android.push.daemon.C19638f.C19639a;
import com.p683ss.android.push.daemon.p1203a.C19626a;
import com.p683ss.android.push.daemon.p1203a.C19628b;
import com.p683ss.android.push.daemon.p1203a.C19629c;

/* renamed from: com.ss.android.push.daemon.NativeDaemonBase */
public class NativeDaemonBase {
    protected Context mContext;

    /* access modifiers changed from: protected */
    public void onDaemonDead() {
        if (C19639a.f54089a == null) {
            int i = VERSION.SDK_INT;
            if (i >= 26) {
                C19639a.f54089a = new C19626a();
            } else if (i >= 23) {
                C19639a.f54089a = new C19629c();
            } else {
                C19639a.f54089a = new C19628b();
            }
        }
        C19639a.f54089a.mo40942a();
    }

    public NativeDaemonBase(Context context) {
        this.mContext = context;
    }
}
