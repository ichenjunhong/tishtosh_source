package com.p683ss.android.push.daemon.p1203a;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.p683ss.android.push.daemon.C19630b;
import com.p683ss.android.push.daemon.C19638f;

/* renamed from: com.ss.android.push.daemon.a.a */
public class C19626a implements C19638f {

    /* renamed from: a */
    protected Context f54063a;

    /* renamed from: b */
    protected C19630b f54064b;

    /* renamed from: c */
    private ServiceConnection f54065c = new ServiceConnection() {
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        }

        public final void onServiceDisconnected(ComponentName componentName) {
            if (C19626a.this.f54063a != null && C19626a.this.f54064b != null) {
                try {
                    C19626a.this.mo40942a();
                } catch (Throwable unused) {
                }
            }
        }
    };

    /* renamed from: a */
    public void mo40942a() {
    }
}
