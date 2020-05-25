package com.bytedance.common.wschannel.channel.p530a.p531a;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.bytedance.common.utility.C9431p;
import com.bytedance.common.utility.p522b.C9381g;
import com.bytedance.common.utility.p522b.C9381g.C9382a;
import com.bytedance.common.wschannel.channel.p530a.p531a.p532a.C9465c;
import com.bytedance.common.wschannel.channel.p530a.p531a.p533b.C9486a;
import com.bytedance.common.wschannel.channel.p530a.p531a.p533b.C9493b;
import com.bytedance.common.wschannel.channel.p530a.p531a.p533b.C9494c;
import com.bytedance.common.wschannel.p534d.C9504a;
import com.bytedance.common.wschannel.p534d.C9507b;
import com.bytedance.common.wschannel.p534d.C9507b.C9509a;
import com.bytedance.common.wschannel.p534d.C9516c;
import com.bytedance.common.wschannel.p534d.p535a.C9505a;
import com.bytedance.common.wschannel.p534d.p536b.C9510a;
import com.bytedance.common.wschannel.p534d.p536b.C9510a.C9512a;
import com.bytedance.common.wschannel.p534d.p536b.C9513b;
import com.bytedance.common.wschannel.server.C9534b;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import okhttp3.C53498ab;
import okhttp3.C53504ad;
import okhttp3.C53511ah;
import okhttp3.C53673t;
import okhttp3.C53682y;
import okio.ByteString;

/* renamed from: com.bytedance.common.wschannel.channel.a.a.b */
final class C9467b implements C9382a {

    /* renamed from: a */
    public C9500c f25759a;

    /* renamed from: b */
    public boolean f25760b;

    /* renamed from: c */
    public Handler f25761c;

    /* renamed from: d */
    public C9485d f25762d;

    /* renamed from: e */
    public C9486a f25763e;

    /* renamed from: f */
    public boolean f25764f;

    /* renamed from: g */
    public C9504a f25765g;

    /* renamed from: h */
    public C9507b f25766h;

    /* renamed from: i */
    private final Context f25767i;

    /* renamed from: j */
    private final C9476b f25768j;

    /* renamed from: k */
    private C53682y f25769k;

    /* renamed from: l */
    private int f25770l;

    /* renamed from: m */
    private C53498ab f25771m;

    /* renamed from: n */
    private Map<String, Object> f25772n;

    /* renamed from: o */
    private C9494c f25773o;

    /* renamed from: com.bytedance.common.wschannel.channel.a.a.b$a */
    public static final class C9475a {

        /* renamed from: a */
        Context f25785a;

        /* renamed from: b */
        List<String> f25786b;

        /* renamed from: c */
        C53682y f25787c;

        /* renamed from: d */
        C9465c f25788d;

        /* renamed from: e */
        C9504a f25789e;

        C9475a(Context context) {
            this.f25785a = context;
        }
    }

    /* renamed from: com.bytedance.common.wschannel.channel.a.a.b$b */
    static final class C9476b {

        /* renamed from: a */
        public Context f25790a;

        /* renamed from: b */
        public List<String> f25791b;

        /* renamed from: c */
        public C53682y f25792c;

        /* renamed from: d */
        public C9465c f25793d;

        /* renamed from: e */
        public C9504a f25794e;

        public final String toString() {
            StringBuilder sb = new StringBuilder("Config{mHeartBeatPolicy=");
            sb.append(this.f25794e);
            sb.append(", mContext=");
            sb.append(this.f25790a);
            sb.append(", wsUrls=");
            sb.append(this.f25791b);
            sb.append(", mOkHttpClient=");
            sb.append(this.f25792c);
            sb.append(", mRetryPolicy=");
            sb.append(this.f25793d);
            sb.append('}');
            return sb.toString();
        }

        C9476b(Context context, List<String> list, C53682y yVar, C9465c cVar, C9504a aVar) {
            this.f25790a = context;
            this.f25791b = list;
            this.f25792c = yVar;
            this.f25793d = cVar;
            this.f25794e = aVar;
        }
    }

    /* renamed from: com.bytedance.common.wschannel.channel.a.a.b$c */
    class C9477c extends C9494c {
        private C9477c() {
        }

        /* renamed from: b */
        public final void mo17181b(final C9493b bVar, ByteString byteString) {
            C9467b.this.mo17157a((Runnable) new Runnable() {
                public final void run() {
                    if (bVar == C9467b.this.f25763e) {
                        if (C9467b.this.f25766h.f25902b.get()) {
                            C9507b bVar = C9467b.this.f25766h;
                            bVar.f25902b.set(false);
                            bVar.f25905e.removeCallbacks(bVar.f25906f);
                            return;
                        }
                        C9467b.this.f25765g.mo17234a();
                    }
                }
            });
        }

        /* renamed from: a */
        public final void mo17176a(C9493b bVar, final String str) {
            C9467b.this.mo17157a((Runnable) new Runnable() {
                public final void run() {
                    if (C9467b.this.f25762d != null) {
                        C9467b.this.f25762d.mo17193b(str);
                    }
                }
            });
        }

        /* renamed from: a */
        public final void mo17178a(final C9493b bVar, final C53504ad adVar) {
            C9467b.this.mo17157a((Runnable) new Runnable() {
                public final void run() {
                    if (C9467b.this.f25763e == bVar) {
                        C9467b.this.mo17155a(4);
                        C9467b.this.mo17161c();
                        C9467b.this.f25765g.mo17235a(adVar);
                        if (C9467b.this.f25762d != null) {
                            C9467b.this.f25762d.mo17191a(adVar);
                        }
                    }
                }
            });
        }

        /* renamed from: a */
        public final void mo17179a(C9493b bVar, final ByteString byteString) {
            C9467b.this.mo17157a((Runnable) new Runnable() {
                public final void run() {
                    if (C9467b.this.f25762d != null) {
                        C9467b.this.f25762d.mo17192a(byteString);
                    }
                }
            });
        }

        /* renamed from: a */
        public final void mo17175a(C9493b bVar, int i, String str) {
            super.mo17175a(bVar, i, str);
            C9467b.this.mo17157a((Runnable) new Runnable() {
                public final void run() {
                    C9467b.this.mo17155a(6);
                }
            });
        }

        /* renamed from: b */
        public final void mo17180b(C9493b bVar, int i, String str) {
            final String a = C9467b.m18781a((C53511ah) bVar);
            C9467b bVar2 = C9467b.this;
            final C9493b bVar3 = bVar;
            final int i2 = i;
            final String str2 = str;
            C94825 r0 = new Runnable() {
                public final void run() {
                    if (C9467b.this.f25763e == bVar3) {
                        C9467b.this.mo17155a(3);
                        C9467b.this.f25763e = null;
                        C9467b.this.f25765g.mo17237c();
                        if (C9467b.this.f25762d != null) {
                            C9467b.this.f25762d.mo17194b(a, i2, str2);
                        }
                        if (C9467b.this.f25764f) {
                            C9467b.this.f25764f = false;
                            C9467b.this.mo17158a(C9467b.this.f25759a.mo17229b());
                        } else if (!C9467b.this.f25760b) {
                            Pair a = C9467b.this.f25759a.mo17227a(null);
                            C9467b.this.mo17156a(((Long) a.second).longValue(), (String) a.first, true);
                        }
                    }
                }
            };
            bVar2.mo17157a((Runnable) r0);
        }

        /* renamed from: a */
        public final void mo17177a(C9493b bVar, Throwable th, C53504ad adVar) {
            final String str;
            String message;
            final String a = C9467b.m18781a((C53511ah) bVar);
            final int a2 = C9467b.m18780a(adVar);
            String str2 = "";
            if (a2 == 0) {
                str2 = "成功";
            } else if (a2 == 404) {
                str2 = "uri不存在";
            } else if (a2 == 409) {
                str2 = "fpid没有注册";
            } else if (a2 == 410) {
                str2 = "非法的设备id";
            } else if (a2 == 411) {
                str2 = "appid还没有注册";
            } else if (a2 == 412) {
                str2 = "websocket子协议不支持";
            } else if (a2 == 413) {
                str2 = "该设备已经建立连接";
            } else if (a2 == 414) {
                str2 = "服务器不能接受更多连接，可重试";
            } else if (a2 == 415) {
                str2 = "设备被限时禁止连接";
            } else if (a2 == 416) {
                str2 = "参数不正确";
            } else if (a2 == 417) {
                str2 = "鉴权失败";
            } else if (a2 == 510) {
                str2 = "服务器内部错误";
            } else if (a2 == 511) {
                str2 = "服务器忙，可稍后重试";
            } else if (a2 == 512) {
                str2 = "服务器正在关机";
            } else if (a2 == 513) {
                str2 = "auth服务异常";
            } else if (a2 == 514) {
                str2 = "auth服务返回失败";
            }
            if (C9431p.m18664a(str2)) {
                if (C9431p.m18664a(th.getMessage())) {
                    message = Log.getStackTraceString(th);
                } else {
                    message = th.getMessage();
                }
                str = message;
            } else {
                str = str2;
            }
            final Pair a3 = C9467b.this.f25759a.mo17227a(adVar);
            if (adVar != null) {
                try {
                    adVar.close();
                } catch (Throwable unused) {
                }
            }
            C9467b bVar2 = C9467b.this;
            final C9493b bVar3 = bVar;
            C94836 r0 = new Runnable() {
                public final void run() {
                    boolean z;
                    if (C9467b.this.f25762d != null) {
                        C9467b.this.f25762d.mo17190a(a, a2, str);
                    }
                    if (C9467b.this.f25764f) {
                        C9467b.this.f25764f = false;
                        C9467b.this.mo17158a(C9467b.this.f25759a.mo17229b());
                    } else if (C9467b.this.f25763e == bVar3) {
                        int i = a2;
                        if (i <= 0 || i == 414 || i == 511 || i == 512 || i == 513) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            C9467b.this.f25765g.mo17237c();
                            C9467b.this.mo17156a(((Long) a3.second).longValue(), (String) a3.first, false);
                            return;
                        }
                        C9467b.this.mo17155a(2);
                        C9467b.this.mo17162d();
                    }
                }
            };
            bVar2.mo17157a((Runnable) r0);
        }
    }

    /* renamed from: com.bytedance.common.wschannel.channel.a.a.b$d */
    interface C9485d {
        /* renamed from: a */
        void mo17189a(String str);

        /* renamed from: a */
        void mo17190a(String str, int i, String str2);

        /* renamed from: a */
        void mo17191a(C53504ad adVar);

        /* renamed from: a */
        void mo17192a(ByteString byteString);

        /* renamed from: b */
        void mo17193b(String str);

        /* renamed from: b */
        void mo17194b(String str, int i, String str2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo17159a(Map<String, Object> map) {
        if (map != null) {
            map.remove("channel_id");
            this.f25772n.putAll(map);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final synchronized int mo17163e() {
        return this.f25770l;
    }

    /* renamed from: i */
    private void m18785i() {
        if (this.f25763e != null) {
            this.f25763e.mo17206c(1000, "normal close");
        }
    }

    /* renamed from: c */
    public final void mo17161c() {
        mo17162d();
        this.f25761c.removeMessages(1);
    }

    /* renamed from: d */
    public final void mo17162d() {
        if (this.f25759a != null) {
            this.f25759a.mo17228a();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public final boolean mo17164f() {
        if (mo17163e() == 4) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final void mo17160b() {
        this.f25761c.removeMessages(2);
        this.f25761c.removeMessages(1);
        this.f25761c.removeMessages(3);
        this.f25761c.removeMessages(5);
        mo17161c();
        m18784h();
    }

    /* renamed from: g */
    public final void mo17165g() {
        if (!(this.f25771m == null || this.f25762d == null)) {
            this.f25762d.mo17190a(this.f25771m.f132378a.toString(), 3, "心跳超时");
        }
        Pair a = this.f25759a.mo17227a(null);
        mo17160b();
        m18785i();
        mo17156a(0, (String) a.first, true);
    }

    /* renamed from: h */
    private boolean m18784h() {
        int e = mo17163e();
        if (e == 3 || e == 2 || e == 5) {
            return true;
        }
        this.f25765g.mo17237c();
        if (this.f25763e == null) {
            return true;
        }
        this.f25761c.sendMessageDelayed(this.f25761c.obtainMessage(6, this.f25763e), 1000);
        if (e == 4) {
            this.f25763e.mo17203b(1000, "normal close");
            mo17155a(6);
            return false;
        }
        this.f25763e.mo17201b();
        mo17155a(3);
        if (e != 1) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo17154a() {
        mo17157a((Runnable) new Runnable() {
            public final void run() {
                C9467b.this.f25760b = true;
                C9467b.this.mo17160b();
            }
        });
    }

    /* renamed from: a */
    private static boolean m18783a(Context context) {
        return C9534b.m18929a(context);
    }

    /* renamed from: a */
    public static int m18780a(C53504ad adVar) {
        if (adVar != null) {
            try {
                return Integer.parseInt(adVar.mo111276b("Handshake-Status"));
            } catch (Throwable unused) {
            }
        }
        return -1;
    }

    /* renamed from: a */
    public static String m18781a(C53511ah ahVar) {
        if (ahVar != null) {
            C53498ab a = ahVar.mo17195a();
            if (a != null) {
                C53673t tVar = a.f132378a;
                if (tVar != null) {
                    return tVar.toString();
                }
            }
        }
        return "";
    }

    private C9467b(C9476b bVar) {
        this.f25770l = 3;
        this.f25772n = new ConcurrentHashMap();
        this.f25761c = new C9381g(Looper.myLooper(), this);
        this.f25773o = new C9477c();
        this.f25768j = bVar;
        this.f25767i = bVar.f25790a;
        this.f25769k = bVar.f25792c;
        this.f25765g = bVar.f25794e;
        if (this.f25765g == null) {
            new C9510a();
            this.f25765g = new C9513b(new C9512a());
        }
        this.f25765g.mo17232a(new C9516c() {
            /* renamed from: a */
            public final void mo17166a() {
                C9467b.this.mo17165g();
            }

            /* renamed from: b */
            public final void mo17167b() {
                C9467b bVar = C9467b.this;
                bVar.f25761c.post(new Runnable() {
                    public final void run() {
                        try {
                            if (C9467b.this.f25763e != null) {
                                C9467b.this.f25763e.mo17210e();
                            }
                        } catch (Throwable th) {
                            C9467b.this.f25765g.mo17236b();
                            throw th;
                        }
                        C9467b.this.f25765g.mo17236b();
                    }
                });
            }
        }, this.f25761c);
        this.f25766h = new C9507b(new C9509a() {
            /* renamed from: a */
            public final void mo17168a() {
                C9467b.this.mo17165g();
            }
        }, this.f25761c);
    }

    /* renamed from: a */
    public final synchronized void mo17155a(int i) {
        this.f25770l = i;
    }

    public final void handleMsg(Message message) {
        C9505a aVar;
        if (message != null) {
            int i = message.what;
            if (i != 1) {
                boolean z = false;
                if (i == 2) {
                    try {
                        this.f25761c.removeMessages(2);
                        this.f25761c.removeMessages(1);
                        this.f25768j.f25791b = (List) message.obj;
                        this.f25760b = false;
                        this.f25759a = new C9500c(this.f25768j.f25791b, this.f25768j.f25793d);
                        mo17161c();
                        mo17158a(this.f25759a.mo17229b());
                    } catch (Throwable unused) {
                    }
                } else if (i == 3) {
                    this.f25761c.removeMessages(2);
                    this.f25761c.removeMessages(1);
                    if (!mo17164f()) {
                        mo17161c();
                        if (!m18783a(this.f25767i)) {
                            return;
                        }
                        if (!m18784h()) {
                            this.f25764f = true;
                        } else if (this.f25759a != null) {
                            mo17158a(this.f25759a.mo17229b());
                        }
                    }
                } else if (i == 5) {
                    if (((Boolean) message.obj).booleanValue()) {
                        aVar = C9505a.STATE_FOREGROUND;
                    } else {
                        aVar = C9505a.STATE_BACKGROUND;
                    }
                    C9507b bVar = this.f25766h;
                    if (!bVar.f25902b.get()) {
                        if (bVar.f25901a == C9505a.STATE_BACKGROUND && aVar == C9505a.STATE_FOREGROUND) {
                            z = true;
                        }
                        if (z) {
                            try {
                                if (bVar.f25903c != null) {
                                    bVar.f25903c.mo17210e();
                                    bVar.f25902b.set(true);
                                    bVar.f25905e.removeCallbacks(bVar.f25906f);
                                    bVar.f25905e.postDelayed(bVar.f25906f, 5000);
                                }
                            } catch (Exception unused2) {
                            }
                        }
                    }
                    bVar.f25901a = aVar;
                } else {
                    if (i == 7) {
                        try {
                            this.f25761c.removeMessages(2);
                            this.f25761c.removeMessages(1);
                            this.f25768j.f25791b = (List) message.obj;
                            this.f25760b = false;
                            this.f25759a = new C9500c(this.f25768j.f25791b, this.f25768j.f25793d);
                            mo17161c();
                            if (m18784h()) {
                                mo17158a(this.f25759a.mo17229b());
                            } else {
                                this.f25764f = true;
                            }
                        } catch (Throwable unused3) {
                        }
                    }
                }
            } else if (!mo17164f()) {
                this.f25761c.removeMessages(1);
                this.f25761c.removeMessages(2);
                mo17158a((String) message.obj);
            }
        }
    }

    /* renamed from: a */
    public final void mo17157a(Runnable runnable) {
        this.f25761c.post(runnable);
    }

    /* JADX WARNING: Removed duplicated region for block: B:64:0x0153 A[Catch:{ Throwable -> 0x01f4 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo17158a(java.lang.String r13) {
        /*
            r12 = this;
            android.content.Context r0 = r12.f25767i
            boolean r0 = m18783a(r0)
            r1 = 1
            if (r0 != 0) goto L_0x000f
            java.lang.String r0 = "网络错误"
            r12.m18782a(r13, r1, r0, r1)
            return
        L_0x000f:
            int r0 = r12.mo17163e()
            r2 = 4
            if (r0 == r2) goto L_0x0202
            if (r0 == r1) goto L_0x0202
            okhttp3.y r0 = r12.f25769k     // Catch:{ Throwable -> 0x01f4 }
            if (r0 != 0) goto L_0x0031
            okhttp3.y$a r0 = new okhttp3.y$a     // Catch:{ Throwable -> 0x01f4 }
            r0.<init>()     // Catch:{ Throwable -> 0x01f4 }
            okhttp3.z r3 = okhttp3.C53685z.HTTP_1_1     // Catch:{ Throwable -> 0x01f4 }
            java.util.List r3 = java.util.Collections.singletonList(r3)     // Catch:{ Throwable -> 0x01f4 }
            okhttp3.y$a r0 = r0.mo111655a(r3)     // Catch:{ Throwable -> 0x01f4 }
            okhttp3.y r0 = r0.mo111667a()     // Catch:{ Throwable -> 0x01f4 }
            r12.f25769k = r0     // Catch:{ Throwable -> 0x01f4 }
        L_0x0031:
            java.util.Map<java.lang.String, java.lang.Object> r0 = r12.f25772n     // Catch:{ Throwable -> 0x01f4 }
            boolean r3 = android.text.TextUtils.isEmpty(r13)     // Catch:{ Throwable -> 0x01f4 }
            if (r3 != 0) goto L_0x014b
            if (r0 != 0) goto L_0x003d
            goto L_0x014b
        L_0x003d:
            java.lang.String r3 = "fpid"
            java.lang.Object r3 = r0.get(r3)     // Catch:{ Throwable -> 0x01f4 }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ Throwable -> 0x01f4 }
            java.lang.String r4 = "app_key"
            java.lang.Object r4 = r0.get(r4)     // Catch:{ Throwable -> 0x01f4 }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ Throwable -> 0x01f4 }
            java.lang.String r5 = "device_id"
            java.lang.Object r5 = r0.get(r5)     // Catch:{ Throwable -> 0x01f4 }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ Throwable -> 0x01f4 }
            java.lang.String r6 = "f8a69f1719916z"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x01f4 }
            r7.<init>()     // Catch:{ Throwable -> 0x01f4 }
            r7.append(r3)     // Catch:{ Throwable -> 0x01f4 }
            r7.append(r4)     // Catch:{ Throwable -> 0x01f4 }
            r7.append(r5)     // Catch:{ Throwable -> 0x01f4 }
            r7.append(r6)     // Catch:{ Throwable -> 0x01f4 }
            java.lang.String r3 = r7.toString()     // Catch:{ Throwable -> 0x01f4 }
            java.lang.String r3 = com.bytedance.common.wschannel.p538f.C9519a.m18890a(r3)     // Catch:{ Throwable -> 0x01f4 }
            java.lang.String r3 = r3.toLowerCase()     // Catch:{ Throwable -> 0x01f4 }
            android.net.Uri r4 = android.net.Uri.parse(r13)     // Catch:{ Throwable -> 0x01f4 }
            android.net.Uri$Builder r4 = r4.buildUpon()     // Catch:{ Throwable -> 0x01f4 }
            java.util.Set r5 = r0.entrySet()     // Catch:{ Throwable -> 0x01f4 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ Throwable -> 0x01f4 }
        L_0x008a:
            boolean r6 = r5.hasNext()     // Catch:{ Throwable -> 0x01f4 }
            if (r6 == 0) goto L_0x00dd
            java.lang.Object r6 = r5.next()     // Catch:{ Throwable -> 0x01f4 }
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6     // Catch:{ Throwable -> 0x01f4 }
            if (r6 == 0) goto L_0x008a
            java.lang.Object r7 = r6.getKey()     // Catch:{ Throwable -> 0x01f4 }
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7     // Catch:{ Throwable -> 0x01f4 }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ Throwable -> 0x01f4 }
            if (r7 != 0) goto L_0x008a
            java.lang.Object r7 = r6.getValue()     // Catch:{ Throwable -> 0x01f4 }
            if (r7 != 0) goto L_0x00ad
            java.lang.String r7 = ""
            goto L_0x00b5
        L_0x00ad:
            java.lang.Object r7 = r6.getValue()     // Catch:{ Throwable -> 0x01f4 }
            java.lang.String r7 = r7.toString()     // Catch:{ Throwable -> 0x01f4 }
        L_0x00b5:
            java.lang.Object r6 = r6.getKey()     // Catch:{ Throwable -> 0x01f4 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ Throwable -> 0x01f4 }
            java.lang.String r8 = "app_key"
            boolean r8 = com.bytedance.common.utility.C9431p.m18665a(r8, r6)     // Catch:{ Throwable -> 0x01f4 }
            if (r8 != 0) goto L_0x008a
            java.lang.String r8 = "extra"
            boolean r8 = com.bytedance.common.utility.C9431p.m18665a(r6, r8)     // Catch:{ Throwable -> 0x01f4 }
            if (r8 != 0) goto L_0x008a
            java.lang.String r8 = "app_version"
            boolean r8 = com.bytedance.common.utility.C9431p.m18665a(r8, r6)     // Catch:{ Throwable -> 0x01f4 }
            if (r8 == 0) goto L_0x00d9
            java.lang.String r6 = "version_code"
            r4.appendQueryParameter(r6, r7)     // Catch:{ Throwable -> 0x01f4 }
            goto L_0x008a
        L_0x00d9:
            r4.appendQueryParameter(r6, r7)     // Catch:{ Throwable -> 0x01f4 }
            goto L_0x008a
        L_0x00dd:
            java.lang.String r5 = "extra"
            java.lang.Object r0 = r0.get(r5)     // Catch:{ Throwable -> 0x01f4 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Throwable -> 0x01f4 }
            boolean r5 = com.bytedance.common.utility.C9431p.m18664a(r0)     // Catch:{ Throwable -> 0x01f4 }
            r6 = 2
            r7 = 0
            if (r5 != 0) goto L_0x0112
            java.lang.String r5 = "&"
            java.lang.String[] r0 = r0.split(r5)     // Catch:{ Throwable -> 0x01f4 }
            int r5 = r0.length     // Catch:{ Throwable -> 0x01f4 }
            r8 = 0
        L_0x00f5:
            if (r8 >= r5) goto L_0x0112
            r9 = r0[r8]     // Catch:{ Throwable -> 0x01f4 }
            boolean r10 = android.text.TextUtils.isEmpty(r9)     // Catch:{ Throwable -> 0x01f4 }
            if (r10 != 0) goto L_0x010f
            java.lang.String r10 = "="
            java.lang.String[] r9 = r9.split(r10)     // Catch:{ Throwable -> 0x01f4 }
            int r10 = r9.length     // Catch:{ Throwable -> 0x01f4 }
            if (r10 != r6) goto L_0x010f
            r10 = r9[r7]     // Catch:{ Throwable -> 0x01f4 }
            r9 = r9[r1]     // Catch:{ Throwable -> 0x01f4 }
            r4.appendQueryParameter(r10, r9)     // Catch:{ Throwable -> 0x01f4 }
        L_0x010f:
            int r8 = r8 + 1
            goto L_0x00f5
        L_0x0112:
            java.lang.String r0 = "access_key"
            r4.appendQueryParameter(r0, r3)     // Catch:{ Throwable -> 0x01f4 }
            android.content.Context r0 = r12.f25767i     // Catch:{ Throwable -> 0x01f4 }
            com.bytedance.common.wschannel.server.b$a r0 = com.bytedance.common.wschannel.server.C9534b.m18930b(r0)     // Catch:{ Throwable -> 0x01f4 }
            if (r0 != 0) goto L_0x0120
            goto L_0x0139
        L_0x0120:
            com.bytedance.common.wschannel.server.b$a r3 = com.bytedance.common.wschannel.server.C9534b.C9535a.NONE     // Catch:{ Throwable -> 0x01f4 }
            if (r0 != r3) goto L_0x0125
            goto L_0x0139
        L_0x0125:
            com.bytedance.common.wschannel.server.b$a r3 = com.bytedance.common.wschannel.server.C9534b.C9535a.WIFI     // Catch:{ Throwable -> 0x01f4 }
            if (r0 != r3) goto L_0x012b
            r7 = 1
            goto L_0x0139
        L_0x012b:
            com.bytedance.common.wschannel.server.b$a r3 = com.bytedance.common.wschannel.server.C9534b.C9535a.MOBILE_2G     // Catch:{ Throwable -> 0x01f4 }
            if (r0 != r3) goto L_0x0131
            r7 = 2
            goto L_0x0139
        L_0x0131:
            com.bytedance.common.wschannel.server.b$a r3 = com.bytedance.common.wschannel.server.C9534b.C9535a.MOBILE_3G     // Catch:{ Throwable -> 0x01f4 }
            if (r0 != r3) goto L_0x0138
            r0 = 3
            r7 = 3
            goto L_0x0139
        L_0x0138:
            r7 = 4
        L_0x0139:
            java.lang.String r0 = "ne"
            java.lang.String r3 = java.lang.String.valueOf(r7)     // Catch:{ Throwable -> 0x01f4 }
            r4.appendQueryParameter(r0, r3)     // Catch:{ Throwable -> 0x01f4 }
            android.net.Uri r0 = r4.build()     // Catch:{ Throwable -> 0x01f4 }
            java.lang.String r0 = r0.toString()     // Catch:{ Throwable -> 0x01f4 }
            goto L_0x014d
        L_0x014b:
            java.lang.String r0 = ""
        L_0x014d:
            boolean r3 = com.bytedance.common.utility.C9431p.m18664a(r0)     // Catch:{ Throwable -> 0x01f4 }
            if (r3 != 0) goto L_0x01f3
            r12.m18785i()     // Catch:{ Throwable -> 0x01f4 }
            okhttp3.ab r3 = r12.f25771m     // Catch:{ Throwable -> 0x01f4 }
            if (r3 == 0) goto L_0x0168
            okhttp3.ab r3 = r12.f25771m     // Catch:{ Throwable -> 0x01f4 }
            okhttp3.t r3 = r3.f132378a     // Catch:{ Throwable -> 0x01f4 }
            java.lang.String r3 = r3.toString()     // Catch:{ Throwable -> 0x01f4 }
            boolean r3 = r0.equals(r3)     // Catch:{ Throwable -> 0x01f4 }
            if (r3 != 0) goto L_0x017f
        L_0x0168:
            okhttp3.ab$a r3 = new okhttp3.ab$a     // Catch:{ Throwable -> 0x01f4 }
            r3.<init>()     // Catch:{ Throwable -> 0x01f4 }
            java.lang.String r4 = "Sec-Websocket-Protocol"
            java.lang.String r5 = "pbbp"
            okhttp3.ab$a r3 = r3.mo111271b(r4, r5)     // Catch:{ Throwable -> 0x01f4 }
            okhttp3.ab$a r3 = r3.mo111262a(r0)     // Catch:{ Throwable -> 0x01f4 }
            okhttp3.ab r3 = r3.mo111272c()     // Catch:{ Throwable -> 0x01f4 }
            r12.f25771m = r3     // Catch:{ Throwable -> 0x01f4 }
        L_0x017f:
            r12.mo17155a(r1)     // Catch:{ Throwable -> 0x01f4 }
            android.content.Context r1 = r12.f25767i     // Catch:{ Throwable -> 0x01f4 }
            com.bytedance.common.wschannel.d r1 = com.bytedance.common.wschannel.C9503d.m18870a(r1)     // Catch:{ Throwable -> 0x01f4 }
            com.bytedance.common.wschannel.WsChannelMultiProcessSharedProvider$a r1 = r1.f25897a     // Catch:{ Throwable -> 0x01f4 }
            java.lang.String r3 = "key_io_limit_size"
            r4 = 10485760(0xa00000, double:5.180654E-317)
            long r8 = r1.mo17079a(r3, r4)     // Catch:{ Throwable -> 0x01f4 }
            okhttp3.ab r7 = r12.f25771m     // Catch:{ Throwable -> 0x01f4 }
            com.bytedance.common.wschannel.channel.a.a.b.c r10 = r12.f25773o     // Catch:{ Throwable -> 0x01f4 }
            com.bytedance.common.wschannel.channel.a.a.b.a r1 = new com.bytedance.common.wschannel.channel.a.a.b.a     // Catch:{ Throwable -> 0x01f4 }
            java.util.Random r11 = new java.util.Random     // Catch:{ Throwable -> 0x01f4 }
            r11.<init>()     // Catch:{ Throwable -> 0x01f4 }
            r6 = r1
            r6.<init>(r7, r8, r10, r11)     // Catch:{ Throwable -> 0x01f4 }
            r12.f25763e = r1     // Catch:{ Throwable -> 0x01f4 }
            com.bytedance.common.wschannel.channel.a.a.b.a r1 = r12.f25763e     // Catch:{ Throwable -> 0x01f4 }
            okhttp3.y r3 = r12.f25769k     // Catch:{ Throwable -> 0x01f4 }
            okhttp3.ab r4 = r1.f25820b     // Catch:{ Throwable -> 0x01f4 }
            okhttp3.ab$a r4 = r4.mo111256a()     // Catch:{ Throwable -> 0x01f4 }
            java.lang.String r5 = "Upgrade"
            java.lang.String r6 = "websocket"
            okhttp3.ab$a r4 = r4.mo111263a(r5, r6)     // Catch:{ Throwable -> 0x01f4 }
            java.lang.String r5 = "Connection"
            java.lang.String r6 = "Upgrade"
            okhttp3.ab$a r4 = r4.mo111263a(r5, r6)     // Catch:{ Throwable -> 0x01f4 }
            java.lang.String r5 = "Sec-WebSocket-Key"
            java.lang.String r6 = r1.f25821c     // Catch:{ Throwable -> 0x01f4 }
            okhttp3.ab$a r4 = r4.mo111263a(r5, r6)     // Catch:{ Throwable -> 0x01f4 }
            java.lang.String r5 = "Sec-WebSocket-Version"
            java.lang.String r6 = "13"
            okhttp3.ab$a r4 = r4.mo111263a(r5, r6)     // Catch:{ Throwable -> 0x01f4 }
            okhttp3.ab r4 = r4.mo111272c()     // Catch:{ Throwable -> 0x01f4 }
            okhttp3.internal.a r5 = okhttp3.internal.C53533a.f132616a     // Catch:{ Throwable -> 0x01f4 }
            okhttp3.e r3 = r5.mo111340a(r3, r4)     // Catch:{ Throwable -> 0x01f4 }
            r1.f25822d = r3     // Catch:{ Throwable -> 0x01f4 }
            okhttp3.e r3 = r1.f25822d     // Catch:{ Throwable -> 0x01f4 }
            com.bytedance.common.wschannel.channel.a.a.b.a$2 r5 = new com.bytedance.common.wschannel.channel.a.a.b.a$2     // Catch:{ Throwable -> 0x01f4 }
            r5.<init>(r4)     // Catch:{ Throwable -> 0x01f4 }
            r3.mo111246a(r5)     // Catch:{ Throwable -> 0x01f4 }
            com.bytedance.common.wschannel.d.b r1 = r12.f25766h     // Catch:{ Throwable -> 0x01f4 }
            com.bytedance.common.wschannel.channel.a.a.b.a r3 = r12.f25763e     // Catch:{ Throwable -> 0x01f4 }
            r1.f25903c = r3     // Catch:{ Throwable -> 0x01f4 }
            com.bytedance.common.wschannel.channel.a.a.b$d r1 = r12.f25762d     // Catch:{ Throwable -> 0x01f4 }
            if (r1 == 0) goto L_0x01f3
            com.bytedance.common.wschannel.channel.a.a.b$d r1 = r12.f25762d     // Catch:{ Throwable -> 0x01f4 }
            r1.mo17189a(r0)     // Catch:{ Throwable -> 0x01f4 }
        L_0x01f3:
            return
        L_0x01f4:
            r0 = move-exception
            com.bytedance.common.wschannel.channel.a.a.b$d r1 = r12.f25762d
            if (r1 == 0) goto L_0x0202
            com.bytedance.common.wschannel.channel.a.a.b$d r1 = r12.f25762d
            java.lang.String r0 = android.util.Log.getStackTraceString(r0)
            r1.mo17190a(r13, r2, r0)
        L_0x0202:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.wschannel.channel.p530a.p531a.C9467b.mo17158a(java.lang.String):void");
    }

    /* renamed from: a */
    public final void mo17156a(long j, String str, boolean z) {
        this.f25761c.removeMessages(1);
        if (!m18783a(this.f25767i)) {
            m18782a(str, 1, "网络错误", z);
        } else if (!this.f25760b) {
            if (j == -1 || C9431p.m18664a(str)) {
                Bundle bundle = new Bundle();
                bundle.putString("method", "tryReconnect");
                bundle.putLong("interval", j);
                m18782a(str, 2, "重试失败", z);
                str = this.f25759a.mo17229b();
            } else {
                mo17155a(5);
            }
            Message message = new Message();
            message.what = 1;
            message.obj = str;
            this.f25761c.sendMessageDelayed(message, j);
        }
    }

    /* renamed from: a */
    private void m18782a(String str, int i, String str2, boolean z) {
        mo17155a(2);
        mo17162d();
        if (this.f25762d != null && z) {
            this.f25762d.mo17190a(str, i, str2);
        }
    }
}
