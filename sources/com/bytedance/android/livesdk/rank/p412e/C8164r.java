package com.bytedance.android.livesdk.rank.p412e;

import android.os.Message;
import android.text.TextUtils;
import com.bytedance.android.live.network.response.C4175b;
import com.bytedance.android.livesdk.rank.model.C8214a;
import com.bytedance.android.livesdk.rank.p409b.C8134b.C8135a;
import com.bytedance.android.livesdk.rank.p409b.C8134b.C8136b;
import com.bytedance.common.utility.p522b.C9381g;
import com.bytedance.common.utility.p522b.C9381g.C9382a;

/* renamed from: com.bytedance.android.livesdk.rank.e.r */
public final class C8164r implements C8135a, C9382a {

    /* renamed from: a */
    private final C8136b f22295a;

    /* renamed from: b */
    private final C9381g f22296b = new C9381g(this);

    /* renamed from: c */
    private C8214a f22297c;

    /* renamed from: d */
    private int f22298d;

    /* renamed from: e */
    private C8165a f22299e;

    /* renamed from: f */
    private boolean f22300f;

    /* renamed from: com.bytedance.android.livesdk.rank.e.r$a */
    static class C8165a implements Runnable {

        /* renamed from: a */
        public int f22301a;

        /* renamed from: b */
        private C9381g f22302b;

        public final void run() {
            StringBuilder sb;
            StringBuilder sb2;
            StringBuilder sb3;
            String str = "00:00:00";
            if (this.f22301a > 0) {
                this.f22301a--;
                int i = this.f22301a / 3600;
                int i2 = (this.f22301a % 3600) / 60;
                int i3 = (this.f22301a % 3600) % 60;
                StringBuilder sb4 = new StringBuilder();
                if (i < 10) {
                    sb = new StringBuilder("0");
                } else {
                    sb = new StringBuilder();
                }
                sb.append(i);
                sb4.append(sb.toString());
                sb4.append(":");
                if (i2 < 10) {
                    sb2 = new StringBuilder("0");
                } else {
                    sb2 = new StringBuilder();
                }
                sb2.append(i2);
                sb4.append(sb2.toString());
                sb4.append(":");
                if (i3 < 10) {
                    sb3 = new StringBuilder("0");
                } else {
                    sb3 = new StringBuilder();
                }
                sb3.append(i3);
                sb4.append(sb3.toString());
                str = sb4.toString();
            }
            this.f22302b.sendMessage(this.f22302b.obtainMessage(100, str));
        }

        C8165a(int i, C9381g gVar) {
            this.f22301a = i;
            this.f22302b = gVar;
        }
    }

    /* renamed from: b */
    public final void mo14331b() {
        this.f22296b.removeCallbacksAndMessages(null);
    }

    /* renamed from: c */
    private int m16241c() {
        if (this.f22297c == null) {
            return 0;
        }
        long j = this.f22297c.f22425m;
        if (j < 0) {
            j = 0;
        }
        return (int) j;
    }

    /* renamed from: a */
    public final void mo14329a() {
        if (!this.f22300f && this.f22297c != null) {
            this.f22296b.removeCallbacksAndMessages(null);
            if (this.f22299e == null) {
                this.f22299e = new C8165a(m16241c(), this.f22296b);
            } else {
                this.f22299e.f22301a = m16241c();
            }
            this.f22296b.post(this.f22299e);
            this.f22300f = true;
        }
    }

    /* renamed from: a */
    public final void mo14330a(C8214a aVar) {
        this.f22297c = aVar;
    }

    public final void handleMsg(Message message) {
        long j;
        if (message.what != 100 || !this.f22300f) {
            if ((message.what == 12 || message.what == 16) && !(message.obj instanceof Exception)) {
                C4175b bVar = (C4175b) message.obj;
                C8214a aVar = (C8214a) bVar.data;
                if (aVar != null) {
                    if (bVar.extra != null) {
                        j = bVar.extra.now;
                    } else {
                        j = 0;
                    }
                    aVar.f22430r = j;
                    if (this.f22295a != null) {
                        this.f22295a.mo14332a(aVar);
                    }
                    this.f22297c = aVar;
                    mo14329a();
                }
            }
            return;
        }
        String str = (String) message.obj;
        if (this.f22295a != null) {
            this.f22295a.mo14333a(str);
        }
        if (!TextUtils.equals(str, "00:00:00")) {
            this.f22296b.postDelayed(this.f22299e, 1000);
        }
    }

    public C8164r(C8136b bVar, C8214a aVar, int i) {
        this.f22295a = bVar;
        this.f22297c = aVar;
        this.f22298d = i;
    }
}
