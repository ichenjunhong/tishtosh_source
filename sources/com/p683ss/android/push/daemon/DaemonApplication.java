package com.p683ss.android.push.daemon;

import android.app.Application;
import android.content.Context;

/* renamed from: com.ss.android.push.daemon.DaemonApplication */
public abstract class DaemonApplication extends Application {

    /* renamed from: a */
    private C19637e f54056a = new C19625a(mo40935a());

    /* renamed from: b */
    private boolean f54057b;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract C19630b mo40935a();

    public final void attachBaseContext(Context context) {
        if (!this.f54057b) {
            this.f54057b = true;
            super.attachBaseContext(context);
        }
    }
}
