package com.p683ss.android.ugc.aweme.sec;

import android.app.Activity;
import com.bytedance.ies.ugc.p694a.C11016e;
import com.p683ss.android.ugc.aweme.sec.C41467c.C41468a;
import com.p683ss.android.ugc.aweme.secapi.C41483a;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.sec.f */
public class C41475f<T> extends C41468a<T> {

    /* renamed from: c */
    public boolean f105143c;

    /* renamed from: d */
    public boolean f105144d;

    /* renamed from: e */
    public final Object f105145e = new Object();

    /* renamed from: f */
    public JSONObject f105146f;

    /* renamed from: a */
    public T mo74485a() {
        if (this.f105120b == null) {
            return null;
        }
        return this.f105120b.mo74485a();
    }

    /* renamed from: b */
    public T mo74486b() throws Exception {
        if (this.f105120b == null) {
            return null;
        }
        return this.f105120b.mo74486b();
    }

    /* renamed from: c */
    public final T mo84211c() throws Exception {
        if (this.f105143c) {
            return mo74486b();
        }
        return mo74485a();
    }

    /* renamed from: a */
    public final boolean mo84222a(int i) throws InterruptedException {
        Activity g = C11016e.m22312g();
        if (g == null || !SecApiImpl.createISecApibyMonsterPlugin().needVerifyImage(i)) {
            return false;
        }
        SecApiImpl.createISecApibyMonsterPlugin().popCaptcha(g, i, new C41483a() {
            /* renamed from: a */
            public final void mo70446a(boolean z, int i) {
                C41475f.this.f105143c = z;
                C41475f.this.f105144d = true;
                synchronized (C41475f.this.f105145e) {
                    C41475f.this.f105145e.notifyAll();
                }
            }
        });
        synchronized (this.f105145e) {
            int i2 = 4;
            while (!this.f105144d) {
                int i3 = i2 - 1;
                if (i2 <= 0) {
                    break;
                }
                this.f105145e.wait(50000);
                i2 = i3;
            }
            this.f105145e.notifyAll();
        }
        return true;
    }
}
