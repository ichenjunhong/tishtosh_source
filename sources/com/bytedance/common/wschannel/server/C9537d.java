package com.bytedance.common.wschannel.server;

import android.content.Context;
import android.database.ContentObserver;
import android.os.Handler;
import com.bytedance.common.wschannel.C9503d;
import com.bytedance.common.wschannel.WsChannelMultiProcessSharedProvider;

/* renamed from: com.bytedance.common.wschannel.server.d */
final class C9537d {

    /* renamed from: a */
    final C9539a f25997a;

    /* renamed from: b */
    public boolean f25998b;

    /* renamed from: c */
    private final Handler f25999c;

    /* renamed from: d */
    private final Context f26000d;

    /* renamed from: e */
    private ContentObserver f26001e = new ContentObserver(this.f25999c) {
        public final void onChange(boolean z) {
            C9537d dVar = C9537d.this;
            try {
                boolean z2 = dVar.f25998b;
                dVar.mo17324a();
                if (!(z2 == dVar.f25998b || dVar.f25997a == null)) {
                    dVar.f25997a.mo17317a(dVar.f25998b);
                }
            } catch (Exception unused) {
            }
        }
    };

    /* renamed from: com.bytedance.common.wschannel.server.d$a */
    interface C9539a {
        /* renamed from: a */
        void mo17317a(boolean z);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo17324a() {
        try {
            boolean a = C9503d.m18870a(this.f26000d).mo17230a();
            if (a != this.f25998b) {
                this.f25998b = a;
            }
        } catch (Throwable unused) {
        }
    }

    C9537d(Context context, Handler handler, C9539a aVar) {
        this.f25999c = handler;
        this.f26000d = context;
        this.f25997a = aVar;
        mo17324a();
        try {
            this.f26000d.getContentResolver().registerContentObserver(WsChannelMultiProcessSharedProvider.m18701a(this.f26000d, "frontier_enabled", "boolean"), true, this.f26001e);
        } catch (Throwable unused) {
        }
    }
}
