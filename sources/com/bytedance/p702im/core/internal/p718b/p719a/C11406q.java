package com.bytedance.p702im.core.internal.p718b.p719a;

import android.os.Build;
import android.os.Build.VERSION;
import android.os.SystemClock;
import com.bytedance.p702im.core.internal.p720c.C11442b;
import com.bytedance.p702im.core.internal.p720c.C11446e;
import com.bytedance.p702im.core.internal.p720c.C11447f;
import com.bytedance.p702im.core.internal.utils.C11500m;
import com.bytedance.p702im.core.p703a.C11165c;
import com.bytedance.p702im.core.p703a.C11169d.C11171b;
import com.bytedance.p702im.core.p703a.p704a.C11161a;
import com.bytedance.p702im.core.p703a.p704a.C11162b;
import com.bytedance.p702im.core.p703a.p704a.C11163c;
import com.bytedance.p702im.core.p705b.C11176d;
import com.bytedance.p702im.core.p706c.C11202k;
import com.bytedance.p702im.core.proto.IMCMD;
import com.bytedance.p702im.core.proto.Refer;
import com.bytedance.p702im.core.proto.Request;
import com.bytedance.p702im.core.proto.Request.Builder;
import com.bytedance.p702im.core.proto.RequestBody;
import com.bytedance.p702im.core.proto.SendMessageRequestBody;
import com.p683ss.android.ugc.aweme.feed.monitor.C30514a;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/* renamed from: com.bytedance.im.core.internal.b.a.q */
public abstract class C11406q<T> {

    /* renamed from: a */
    private C11162b<T> f30652a;

    /* renamed from: b */
    protected int f30653b;

    /* renamed from: com.bytedance.im.core.internal.b.a.q$a */
    public static class C11408a {

        /* renamed from: a */
        private static C11408a f30656a;

        /* renamed from: b */
        private long f30657b;

        private C11408a() {
            if (this.f30657b == 0) {
                this.f30657b = (long) new Random().nextInt(C30514a.f79747n);
            }
        }

        /* renamed from: a */
        public static C11408a m23290a() {
            if (f30656a == null) {
                synchronized (C11408a.class) {
                    if (f30656a == null) {
                        f30656a = new C11408a();
                    }
                }
            }
            return f30656a;
        }

        /* renamed from: b */
        public final synchronized long mo21061b() {
            long j;
            if (this.f30657b <= 0) {
                this.f30657b = 1;
            }
            j = this.f30657b;
            this.f30657b = 1 + j;
            return j;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo20946a(C11447f fVar, Runnable runnable);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo20952a() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo20947a(C11447f fVar);

    public C11406q(int i) {
        this.f30653b = i;
    }

    /* renamed from: a */
    public final void mo21054a(C11202k kVar) {
        if (this.f30652a != null) {
            this.f30652a.mo20508a(kVar);
        }
    }

    /* renamed from: b */
    public final void mo21058b(C11447f fVar) {
        if (this.f30652a != null) {
            this.f30652a.mo20508a(C11202k.m22730a(fVar));
        }
    }

    /* renamed from: a */
    public final void mo21055a(T t) {
        if (this.f30652a != null) {
            this.f30652a.mo20506a(t);
        }
    }

    /* renamed from: c */
    public final void mo21059c(final C11447f fVar) {
        SendMessageRequestBody sendMessageRequestBody;
        C11500m.m23559a();
        if (!fVar.mo21093g()) {
            if (fVar.f30734i == C11171b.f30119b || fVar.f30734i == C11171b.f30120c) {
                C11165c.m22588a().f30108c.mo20491a(fVar.f30734i);
            } else if (fVar.f30734i == C11171b.f30121d && this.f30653b == IMCMD.SEND_MESSAGE.getValue()) {
                if (fVar.f30731f.body != null) {
                    sendMessageRequestBody = fVar.f30731f.body.send_message_body;
                } else {
                    sendMessageRequestBody = null;
                }
                if (sendMessageRequestBody != null) {
                    C11409r.m23292a();
                    C11409r.m23302b(sendMessageRequestBody.conversation_id);
                }
            }
        }
        mo20946a(fVar, (Runnable) new Runnable() {
            public final void run() {
                if (fVar.f30729d != null) {
                    if (!fVar.mo21093g() || !C11406q.this.mo20947a(fVar)) {
                        fVar.f30729d.mo21082b(fVar);
                    } else {
                        fVar.f30729d.mo21081a(fVar);
                    }
                }
            }
        });
    }

    public C11406q(int i, C11162b<T> bVar) {
        this.f30653b = i;
        if (bVar != null) {
            this.f30652a = bVar;
        }
    }

    /* renamed from: a */
    public final void mo21057a(T t, C11447f fVar) {
        if (this.f30652a != null) {
            try {
                if (!(this.f30652a instanceof C11163c) || fVar == null) {
                    this.f30652a.mo20506a(t);
                    return;
                }
                ((C11163c) this.f30652a).mo20509a(t, C11202k.m22730a(fVar));
            } catch (Exception e) {
                C11176d.m22632a(e);
            }
        }
    }

    /* renamed from: a */
    public final void mo21056a(T t, long j, boolean z) {
        if (this.f30652a != null) {
            if (this.f30652a instanceof C11161a) {
                ((C11161a) this.f30652a).mo20507a(t, j, z);
                return;
            }
            this.f30652a.mo20506a(t);
        }
    }

    /* renamed from: a */
    public final long mo21053a(int i, RequestBody requestBody, C11446e eVar, Object... objArr) {
        int i2 = this.f30653b;
        Map f = C11165c.m22588a().f30108c.mo20503f();
        if (f == null) {
            f = new HashMap();
        }
        if (C11165c.m22588a().mo20513b().f30127B) {
            f.put("expected_user_id", String.valueOf(C11165c.m22588a().f30108c.mo20490a()));
        }
        Request build = new Builder().sequence_id(Long.valueOf(C11408a.m23290a().mo21061b())).sdk_version("4.0.6.0").token(C11165c.m22588a().f30108c.mo20497b()).refer(Refer.ANDROID).device_id(C11165c.m22588a().f30108c.mo20499c()).inbox_type(Integer.valueOf(i)).build_number("4060").channel(C11165c.m22588a().mo20513b().f30141e).device_platform("android").device_type(Build.MODEL).os_version(VERSION.RELEASE).version_code(String.valueOf(C11165c.m22588a().mo20513b().f30140d)).cmd(Integer.valueOf(i2)).body(requestBody).headers(f).build();
        C11447f fVar = new C11447f(build.sequence_id.longValue(), this);
        fVar.f30731f = build;
        fVar.f30730e = objArr;
        fVar.f30728c = mo20952a();
        fVar.f30729d = eVar;
        fVar.f30735j = SystemClock.uptimeMillis();
        C11442b a = C11442b.m23355a();
        if (fVar.mo21090d() == IMCMD.SEND_MESSAGE.getValue()) {
            a.f30715a.mo21076a(fVar);
        } else {
            a.f30716b.mo21076a(fVar);
        }
        return fVar.f30726a;
    }
}
