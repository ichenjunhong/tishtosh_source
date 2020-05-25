package com.bytedance.p513c;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.bytedance.p513c.p516c.C9301b;
import com.bytedance.p513c.p517d.C9313i;
import org.json.JSONArray;

/* renamed from: com.bytedance.c.j */
public class C9328j {

    /* renamed from: a */
    HandlerThread f25538a;

    /* renamed from: b */
    public C9331b f25539b;

    /* renamed from: com.bytedance.c.j$a */
    static class C9330a {

        /* renamed from: a */
        public static C9328j f25540a = new C9328j();
    }

    /* renamed from: com.bytedance.c.j$b */
    public class C9331b extends Handler {
        public final void handleMessage(Message message) {
            switch (message.what) {
                case 2:
                    C9282a.m18401a().mo16874d();
                    return;
                case 3:
                    C9302d.m18451a(C9302d.m18444a(C9302d.m18445a(C9302d.f25478f)), false);
                    return;
                case 4:
                    C9302d.m18451a(C9302d.m18443a((C9313i) message.obj), true);
                    return;
                case 5:
                    C9302d.m18455b(C9302d.m18445a(C9302d.f25478f));
                    return;
                case 6:
                    if (message.obj != null) {
                        C9302d.m18455b((JSONArray) message.obj);
                    }
                    return;
                case 7:
                    C9328j jVar = C9328j.this;
                    if (C9302d.m18456b()) {
                        jVar.mo16942a(7, null, 500);
                    }
                    return;
                case 8:
                    if (message.obj != null) {
                        ((C9317h) message.obj).mo16927b();
                    }
                    return;
                case 9:
                    String b = C9302d.m18452b((C9313i) message.obj);
                    C9317h c = C9282a.m18401a().mo16873c();
                    if (c != null) {
                        c.mo16926a(b);
                    }
                    return;
                case 10:
                    C9328j.m18488a(message);
                    break;
                case 11:
                    C9302d.m18447a();
                    return;
            }
        }

        private C9331b(Looper looper) {
            super(looper);
        }
    }

    private C9328j() {
    }

    /* renamed from: a */
    public static C9328j m18487a() {
        return C9330a.f25540a;
    }

    /* renamed from: a */
    public static void m18488a(Message message) {
        if (message.obj != null) {
            C9301b.m18436a().mo16909a("url", (String) message.obj);
        }
    }

    /* renamed from: a */
    public final void mo16943a(Runnable runnable) {
        if (this.f25539b != null) {
            this.f25539b.post(runnable);
        }
    }

    /* renamed from: a */
    public final void mo16941a(int i, Object obj) {
        if (this.f25539b != null) {
            this.f25539b.sendMessage(this.f25539b.obtainMessage(i, obj));
        }
    }

    /* renamed from: a */
    public final void mo16942a(int i, Object obj, long j) {
        if (this.f25539b != null) {
            this.f25539b.sendMessageDelayed(this.f25539b.obtainMessage(i, obj), j);
        }
    }
}
