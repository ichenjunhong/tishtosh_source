package com.bytedance.common.wschannel.p534d.p536b;

import android.os.Handler;
import android.text.TextUtils;
import com.bytedance.common.wschannel.p534d.C9504a;
import com.bytedance.common.wschannel.p534d.C9516c;
import java.util.concurrent.atomic.AtomicBoolean;
import okhttp3.C53504ad;

/* renamed from: com.bytedance.common.wschannel.d.b.b */
public final class C9513b extends C9504a<C9510a> {

    /* renamed from: b */
    public C9516c f25910b;

    /* renamed from: c */
    public AtomicBoolean f25911c = new AtomicBoolean(false);

    /* renamed from: d */
    private Handler f25912d;

    /* renamed from: e */
    private Runnable f25913e = new Runnable() {
        public final void run() {
            if (C9513b.this.f25911c.getAndSet(false)) {
                C9513b.this.mo17238d();
                if (C9513b.this.f25910b != null) {
                    C9513b.this.f25910b.mo17166a();
                }
            }
        }
    };

    /* renamed from: f */
    private Runnable f25914f = new Runnable() {
        public final void run() {
            if (C9513b.this.f25910b != null) {
                C9513b.this.mo17239e();
                C9513b.this.f25910b.mo17167b();
            }
        }
    };

    /* renamed from: c */
    public final void mo17237c() {
        mo17238d();
    }

    /* renamed from: a */
    public final void mo17234a() {
        this.f25911c.set(false);
        this.f25912d.removeCallbacks(this.f25913e);
    }

    /* renamed from: b */
    public final void mo17236b() {
        this.f25911c.set(true);
        this.f25912d.removeCallbacks(this.f25913e);
        this.f25912d.postDelayed(this.f25913e, ((C9510a) this.f25899a).f25909b);
    }

    /* renamed from: d */
    public final void mo17238d() {
        this.f25912d.removeCallbacks(this.f25913e);
        this.f25912d.removeCallbacks(this.f25914f);
        this.f25911c.set(false);
    }

    /* renamed from: e */
    public final void mo17239e() {
        long j = ((C9510a) this.f25899a).f25908a;
        this.f25912d.removeCallbacks(this.f25914f);
        this.f25912d.postDelayed(this.f25914f, j);
    }

    public C9513b(C9510a aVar) {
        super(aVar);
    }

    /* renamed from: a */
    public final void mo17235a(C53504ad adVar) {
        long j;
        if (((C9510a) this.f25899a).f25908a == -1) {
            if (adVar == null) {
                ((C9510a) this.f25899a).f25908a = 270000;
            } else {
                String b = adVar.mo111276b("Handshake-Options");
                if (b != null) {
                    String[] split = b.split(";");
                    int length = split.length;
                    long j2 = -1;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            j = j2;
                            break;
                        }
                        String str = split[i];
                        if (!TextUtils.isEmpty(str)) {
                            String[] split2 = str.split("=");
                            if ("ping-interval".equals(split2[0])) {
                                try {
                                    j = 1000 * Long.parseLong(split2[1]);
                                    break;
                                } catch (NumberFormatException unused) {
                                    j2 = 270000;
                                }
                            } else {
                                continue;
                            }
                        }
                        i++;
                    }
                } else {
                    j = -1;
                }
                if (j == -1) {
                    ((C9510a) this.f25899a).f25908a = 270000;
                } else {
                    ((C9510a) this.f25899a).f25908a = j;
                }
            }
        }
        mo17239e();
    }

    /* renamed from: a */
    public final void mo17232a(C9516c cVar, Handler handler) {
        this.f25910b = cVar;
        this.f25912d = handler;
    }
}
