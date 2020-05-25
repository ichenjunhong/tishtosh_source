package com.p683ss.android.ugc.aweme.utils.p2387a;

import android.os.Build;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;
import com.bytedance.common.utility.C9431p;
import com.bytedance.common.utility.p526f.C9409b;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.utils.a.b */
public final class C47657b {

    /* renamed from: com.ss.android.ugc.aweme.utils.a.b$a */
    static class C47658a implements Callback {

        /* renamed from: a */
        Handler f120135a;

        /* renamed from: b */
        Callback f120136b;

        /* renamed from: c */
        private List<Callback> f120137c = new ArrayList();

        /* renamed from: a */
        public final void mo94966a(Callback callback) {
            this.f120137c.add(callback);
        }

        public final boolean handleMessage(Message message) {
            boolean z = false;
            if (message == null) {
                if (this.f120136b != null) {
                    return this.f120136b.handleMessage(message);
                }
                return false;
            } else if (message.what == 131 && VERSION.SDK_INT == 19 && !C9431p.m18664a(Build.MODEL) && Build.MODEL.toLowerCase().trim().startsWith("vivo")) {
                try {
                    if (this.f120136b != null) {
                        z = this.f120136b.handleMessage(message);
                    }
                    if (!z && this.f120135a != null) {
                        this.f120135a.handleMessage(message);
                    }
                    return true;
                } catch (Throwable th) {
                    if (th instanceof SecurityException) {
                        return true;
                    }
                    throw th;
                }
            } else {
                for (Callback handleMessage : this.f120137c) {
                    if (handleMessage.handleMessage(message)) {
                        return true;
                    }
                }
                if (this.f120136b != null) {
                    return this.f120136b.handleMessage(message);
                }
                return false;
            }
        }

        C47658a(Handler handler, Callback callback) {
            this.f120135a = handler;
            this.f120136b = callback;
        }
    }

    /* renamed from: a */
    public static void m103158a() {
        try {
            C9409b b = C9409b.m18608a(Class.forName("android.app.ActivityThread")).mo17054b("currentActivityThread");
            if (b != null) {
                Handler handler = (Handler) b.mo17051a("mH", (Class<?>[]) new Class[]{Class.forName("android.app.ActivityThread$H")}).f25654a;
                if (handler != null) {
                    C9409b a = C9409b.m18609a((Object) handler);
                    C47658a aVar = new C47658a(handler, (Callback) a.mo17051a("mCallback", (Class<?>[]) new Class[]{Callback.class}).f25654a);
                    aVar.mo94966a(new C47656a());
                    a.mo17050a("mCallback", (Object) aVar);
                }
            }
        } catch (Throwable th) {
            C32458a.m75148a(th);
        }
    }
}
