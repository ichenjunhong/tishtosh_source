package com.bytedance.frameworks.baselib.network.http.p570c.p571a;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.common.utility.C9415i;
import com.bytedance.common.utility.C9431p;
import com.bytedance.frameworks.baselib.network.http.C9831a;
import com.bytedance.frameworks.baselib.network.http.C9841b;
import com.bytedance.frameworks.baselib.network.http.C9858c;
import com.bytedance.frameworks.baselib.network.http.C9894e;
import com.bytedance.frameworks.baselib.network.http.p568a.C9836c;
import com.bytedance.frameworks.baselib.network.http.p573d.C9890a;
import com.bytedance.frameworks.baselib.network.http.p573d.C9893d;
import com.bytedance.retrofit2.C12759m;
import com.bytedance.retrofit2.C12796s;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.bytedance.retrofit2.p830a.C12685b;
import com.bytedance.retrofit2.p830a.C12686c;
import com.bytedance.retrofit2.p830a.C12689e;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import okhttp3.C53498ab;
import okhttp3.C53498ab.C53499a;
import okhttp3.C53500ac;
import okhttp3.C53504ad;
import okhttp3.C53506ae;
import okhttp3.C53510ag;
import okhttp3.C53524e;
import okhttp3.C53655k;
import okhttp3.C53655k.C53656a;
import okhttp3.C53671s;
import okhttp3.C53678w;
import okhttp3.C53682y;
import okhttp3.C53682y.C53684a;
import okhttp3.internal.p2685c.C53569f;
import okio.BufferedSink;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.frameworks.baselib.network.http.c.a.e */
public class C9865e implements C9858c {

    /* renamed from: a */
    public static volatile boolean f26841a = false;

    /* renamed from: b */
    public static Context f26842b = null;

    /* renamed from: c */
    public static C9860b f26843c = null;

    /* renamed from: d */
    public static C9859a f26844d = null;

    /* renamed from: e */
    private static volatile C9865e f26845e = null;

    /* renamed from: f */
    private static volatile int f26846f = -1;

    /* renamed from: com.bytedance.frameworks.baselib.network.http.c.a.e$a */
    public static class C9866a implements C12689e, C12759m {

        /* renamed from: a */
        C53682y f26847a;

        /* renamed from: b */
        C9831a f26848b = C9831a.m19674a();

        /* renamed from: c */
        long f26849c = 0;

        /* renamed from: d */
        C53506ae f26850d;

        /* renamed from: e */
        String f26851e;

        /* renamed from: f */
        C12686c f26852f;

        /* renamed from: g */
        C53498ab f26853g;

        /* renamed from: h */
        C53504ad f26854h;

        /* renamed from: i */
        C53524e f26855i;

        /* renamed from: j */
        boolean f26856j;

        /* renamed from: k */
        C12796s f26857k;

        public final Object getRequestInfo() {
            return this.f26848b;
        }

        /* renamed from: b */
        public final void mo9560b() {
            if (this.f26855i != null) {
                this.f26855i.mo111248c();
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:101:0x01bf A[Catch:{ all -> 0x01cd }] */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x006b A[Catch:{ Exception -> 0x016d, all -> 0x016a }] */
        /* JADX WARNING: Removed duplicated region for block: B:41:0x00b0 A[Catch:{ Exception -> 0x016d, all -> 0x016a }] */
        /* JADX WARNING: Removed duplicated region for block: B:44:0x00cb A[Catch:{ Exception -> 0x016d, all -> 0x016a }] */
        /* JADX WARNING: Removed duplicated region for block: B:64:0x011c A[Catch:{ Exception -> 0x016d, all -> 0x016a }] */
        /* JADX WARNING: Removed duplicated region for block: B:68:0x0155  */
        /* JADX WARNING: Removed duplicated region for block: B:84:0x017b A[Catch:{ all -> 0x01cd }] */
        /* JADX WARNING: Removed duplicated region for block: B:87:0x0186 A[Catch:{ all -> 0x01cd }] */
        /* JADX WARNING: Removed duplicated region for block: B:93:0x0197 A[Catch:{ all -> 0x01cd }] */
        /* JADX WARNING: Removed duplicated region for block: B:99:0x01bc A[Catch:{ all -> 0x01cd }] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.retrofit2.p830a.C12688d mo9559a() throws java.io.IOException {
            /*
                r14 = this;
                com.bytedance.retrofit2.a.c r0 = r14.f26852f
                java.lang.String r0 = r0.f33321b
                boolean r1 = com.bytedance.frameworks.baselib.network.http.p570c.p571a.C9865e.f26841a
                if (r1 != 0) goto L_0x01ed
                okhttp3.e r1 = r14.f26855i
                if (r1 == 0) goto L_0x001d
                okhttp3.e r1 = r14.f26855i
                boolean r1 = r1.mo111250d()
                if (r1 != 0) goto L_0x0015
                goto L_0x001d
            L_0x0015:
                java.io.IOException r0 = new java.io.IOException
                java.lang.String r1 = "request canceled"
                r0.<init>(r1)
                throw r0
            L_0x001d:
                boolean r1 = r14.f26856j
                if (r1 != 0) goto L_0x0036
                android.content.Context r1 = com.bytedance.frameworks.baselib.network.http.p570c.p571a.C9865e.f26842b
                if (r1 == 0) goto L_0x0036
                android.content.Context r1 = com.bytedance.frameworks.baselib.network.http.p570c.p571a.C9865e.f26842b
                boolean r1 = com.bytedance.frameworks.baselib.network.http.p570c.p571a.C9869f.m19751a(r1)
                if (r1 == 0) goto L_0x002e
                goto L_0x0036
            L_0x002e:
                com.bytedance.frameworks.baselib.network.http.a.d r0 = new com.bytedance.frameworks.baselib.network.http.a.d
                java.lang.String r1 = "network not available"
                r0.<init>(r1)
                throw r0
            L_0x0036:
                r11 = 1
                r9 = 0
                com.bytedance.retrofit2.a.c r1 = r14.f26852f     // Catch:{ Exception -> 0x0174, all -> 0x0171 }
                boolean r1 = r1.f33326g     // Catch:{ Exception -> 0x0174, all -> 0x0171 }
                if (r1 != 0) goto L_0x0053
                com.bytedance.frameworks.baselib.network.http.e$g r1 = com.bytedance.frameworks.baselib.network.http.C9894e.m19827b()     // Catch:{ Exception -> 0x0174, all -> 0x0171 }
                if (r1 == 0) goto L_0x0053
                boolean r1 = r1.mo17828c(r0)     // Catch:{ Exception -> 0x0174, all -> 0x0171 }
                if (r1 == 0) goto L_0x0053
                com.bytedance.frameworks.baselib.network.a.e r1 = com.bytedance.frameworks.baselib.network.p566a.C9815e.m19643b()     // Catch:{ Exception -> 0x0174, all -> 0x0171 }
                r1.mo17654c()     // Catch:{ Exception -> 0x0174, all -> 0x0171 }
                r10 = 1
                goto L_0x0054
            L_0x0053:
                r10 = 0
            L_0x0054:
                com.bytedance.frameworks.baselib.network.http.a r1 = r14.f26848b     // Catch:{ Exception -> 0x016d, all -> 0x016a }
                okhttp3.e r2 = r14.f26855i     // Catch:{ Exception -> 0x016d, all -> 0x016a }
                okhttp3.ab r2 = r2.mo111245a()     // Catch:{ Exception -> 0x016d, all -> 0x016a }
                okhttp3.s r2 = r2.f132380c     // Catch:{ Exception -> 0x016d, all -> 0x016a }
                java.lang.String r2 = com.bytedance.frameworks.baselib.network.http.p570c.p571a.C9865e.m19734a(r2)     // Catch:{ Exception -> 0x016d, all -> 0x016a }
                r1.f26749A = r2     // Catch:{ Exception -> 0x016d, all -> 0x016a }
                okhttp3.y r1 = r14.f26847a     // Catch:{ Exception -> 0x016d, all -> 0x016a }
                okhttp3.e r2 = r14.f26855i     // Catch:{ Exception -> 0x016d, all -> 0x016a }
                r3 = 0
                if (r1 == 0) goto L_0x0073
                if (r2 != 0) goto L_0x006e
                goto L_0x0073
            L_0x006e:
                okhttp3.ad r1 = r2.mo111247b()     // Catch:{ Exception -> 0x016d, all -> 0x016a }
                goto L_0x0074
            L_0x0073:
                r1 = r3
            L_0x0074:
                r14.f26854h = r1     // Catch:{ Exception -> 0x016d, all -> 0x016a }
                com.bytedance.frameworks.baselib.network.http.a r1 = r14.f26848b     // Catch:{ Exception -> 0x016d, all -> 0x016a }
                long r4 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x016d, all -> 0x016a }
                r1.f26756f = r4     // Catch:{ Exception -> 0x016d, all -> 0x016a }
                okhttp3.e r1 = r14.f26855i     // Catch:{ Exception -> 0x016d, all -> 0x016a }
                if (r1 == 0) goto L_0x0096
                okhttp3.e r1 = r14.f26855i     // Catch:{ Exception -> 0x016d, all -> 0x016a }
                okhttp3.internal.b.g r1 = r1.mo111251e()     // Catch:{ Exception -> 0x016d, all -> 0x016a }
                if (r1 == 0) goto L_0x0096
                com.bytedance.frameworks.baselib.network.http.a r1 = r14.f26848b     // Catch:{ Exception -> 0x016d, all -> 0x016a }
                okhttp3.e r2 = r14.f26855i     // Catch:{ Exception -> 0x016d, all -> 0x016a }
                okhttp3.internal.b.g r2 = r2.mo111251e()     // Catch:{ Exception -> 0x016d, all -> 0x016a }
                int r2 = r2.f132722f     // Catch:{ Exception -> 0x016d, all -> 0x016a }
                r1.f26759i = r2     // Catch:{ Exception -> 0x016d, all -> 0x016a }
            L_0x0096:
                com.bytedance.frameworks.baselib.network.http.a r1 = r14.f26848b     // Catch:{ Exception -> 0x016d, all -> 0x016a }
                okhttp3.ad r2 = r14.f26854h     // Catch:{ Exception -> 0x016d, all -> 0x016a }
                okhttp3.s r2 = r2.f132403f     // Catch:{ Exception -> 0x016d, all -> 0x016a }
                java.lang.String r2 = com.bytedance.frameworks.baselib.network.http.p570c.p571a.C9865e.m19734a(r2)     // Catch:{ Exception -> 0x016d, all -> 0x016a }
                r1.f26750B = r2     // Catch:{ Exception -> 0x016d, all -> 0x016a }
                okhttp3.ad r1 = r14.f26854h     // Catch:{ Exception -> 0x016d, all -> 0x016a }
                com.bytedance.frameworks.baselib.network.http.a r2 = r14.f26848b     // Catch:{ Exception -> 0x016d, all -> 0x016a }
                java.lang.String r1 = com.bytedance.frameworks.baselib.network.http.p570c.p571a.C9870g.m19752a(r1, r2)     // Catch:{ Exception -> 0x016d, all -> 0x016a }
                r14.f26851e = r1     // Catch:{ Exception -> 0x016d, all -> 0x016a }
                com.bytedance.frameworks.baselib.network.http.c.a.a r1 = com.bytedance.frameworks.baselib.network.http.p570c.p571a.C9865e.f26844d     // Catch:{ Exception -> 0x016d, all -> 0x016a }
                if (r1 == 0) goto L_0x00b9
                com.bytedance.frameworks.baselib.network.http.c.a.a r1 = com.bytedance.frameworks.baselib.network.http.p570c.p571a.C9865e.f26844d     // Catch:{ Exception -> 0x016d, all -> 0x016a }
                okhttp3.ab r2 = r14.f26853g     // Catch:{ Exception -> 0x016d, all -> 0x016a }
                okhttp3.ad r4 = r14.f26854h     // Catch:{ Exception -> 0x016d, all -> 0x016a }
                r1.mo17709a(r2, r4)     // Catch:{ Exception -> 0x016d, all -> 0x016a }
            L_0x00b9:
                okhttp3.ad r1 = r14.f26854h     // Catch:{ Exception -> 0x016d, all -> 0x016a }
                int r12 = r1.f132400c     // Catch:{ Exception -> 0x016d, all -> 0x016a }
                okhttp3.ad r1 = r14.f26854h     // Catch:{ Exception -> 0x016d, all -> 0x016a }
                java.lang.String r2 = "Content-Type"
                java.lang.String r13 = r1.mo111276b(r2)     // Catch:{ Exception -> 0x016d, all -> 0x016a }
                com.bytedance.retrofit2.a.c r1 = r14.f26852f     // Catch:{ Exception -> 0x016d, all -> 0x016a }
                boolean r1 = r1.f33326g     // Catch:{ Exception -> 0x016d, all -> 0x016a }
                if (r1 == 0) goto L_0x011c
                okhttp3.ad r1 = r14.f26854h     // Catch:{ Exception -> 0x016d, all -> 0x016a }
                java.lang.String r2 = "Content-Encoding"
                java.lang.String r1 = r1.mo111276b(r2)     // Catch:{ Exception -> 0x016d, all -> 0x016a }
                if (r1 == 0) goto L_0x00df
                java.lang.String r2 = "gzip"
                boolean r1 = r2.equalsIgnoreCase(r1)     // Catch:{ Exception -> 0x016d, all -> 0x016a }
                if (r1 == 0) goto L_0x00df
                r1 = 1
                goto L_0x00e0
            L_0x00df:
                r1 = 0
            L_0x00e0:
                r2 = 200(0xc8, float:2.8E-43)
                if (r12 < r2) goto L_0x00fe
                r2 = 300(0x12c, float:4.2E-43)
                if (r12 >= r2) goto L_0x00fe
                okhttp3.ad r2 = r14.f26854h     // Catch:{ Exception -> 0x016d, all -> 0x016a }
                okhttp3.ae r2 = r2.f132404g     // Catch:{ Exception -> 0x016d, all -> 0x016a }
                long r4 = r2.contentLength()     // Catch:{ Exception -> 0x016d, all -> 0x016a }
                r6 = 0
                int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r8 != 0) goto L_0x00f7
                goto L_0x00fc
            L_0x00f7:
                com.bytedance.frameworks.baselib.network.http.c.a.e$a$2 r3 = new com.bytedance.frameworks.baselib.network.http.c.a.e$a$2     // Catch:{ Exception -> 0x016d, all -> 0x016a }
                r3.<init>(r2, r1)     // Catch:{ Exception -> 0x016d, all -> 0x016a }
            L_0x00fc:
                r6 = r3
                goto L_0x0137
            L_0x00fe:
                okhttp3.ad r2 = r14.f26854h     // Catch:{ Exception -> 0x016d, all -> 0x016a }
                java.lang.String r2 = r2.f132401d     // Catch:{ Exception -> 0x016d, all -> 0x016a }
                com.bytedance.retrofit2.a.c r3 = r14.f26852f     // Catch:{ Exception -> 0x016d, all -> 0x016a }
                int r3 = r3.f33327h     // Catch:{ Exception -> 0x016d, all -> 0x016a }
                okhttp3.ad r4 = r14.f26854h     // Catch:{ Exception -> 0x016d, all -> 0x016a }
                okhttp3.ae r4 = r4.f132404g     // Catch:{ Exception -> 0x016d, all -> 0x016a }
                if (r4 == 0) goto L_0x0116
                java.io.InputStream r5 = r4.byteStream()     // Catch:{ Exception -> 0x016d, all -> 0x016a }
                com.bytedance.frameworks.baselib.network.http.p570c.p571a.C9865e.m19743a(r1, r3, r5, r13, r0)     // Catch:{ Exception -> 0x016d, all -> 0x016a }
                com.bytedance.frameworks.baselib.network.http.p573d.C9893d.m19804a(r4)     // Catch:{ Exception -> 0x016d, all -> 0x016a }
            L_0x0116:
                com.bytedance.frameworks.baselib.network.http.a.c r1 = new com.bytedance.frameworks.baselib.network.http.a.c     // Catch:{ Exception -> 0x016d, all -> 0x016a }
                r1.<init>(r12, r2)     // Catch:{ Exception -> 0x016d, all -> 0x016a }
                throw r1     // Catch:{ Exception -> 0x016d, all -> 0x016a }
            L_0x011c:
                com.bytedance.retrofit2.a.c r1 = r14.f26852f     // Catch:{ Exception -> 0x016d, all -> 0x016a }
                int r2 = r1.f33327h     // Catch:{ Exception -> 0x016d, all -> 0x016a }
                okhttp3.ad r3 = r14.f26854h     // Catch:{ Exception -> 0x016d, all -> 0x016a }
                long r4 = r14.f26849c     // Catch:{ Exception -> 0x016d, all -> 0x016a }
                com.bytedance.frameworks.baselib.network.http.a r6 = r14.f26848b     // Catch:{ Exception -> 0x016d, all -> 0x016a }
                java.lang.String r7 = r14.f26851e     // Catch:{ Exception -> 0x016d, all -> 0x016a }
                com.bytedance.retrofit2.s r8 = r14.f26857k     // Catch:{ Exception -> 0x016d, all -> 0x016a }
                r1 = r0
                byte[] r1 = com.bytedance.frameworks.baselib.network.http.p570c.p571a.C9865e.m19744a(r1, r2, r3, r4, r6, r7, r8)     // Catch:{ Exception -> 0x016d, all -> 0x016a }
                com.bytedance.retrofit2.mime.TypedByteArray r2 = new com.bytedance.retrofit2.mime.TypedByteArray     // Catch:{ Exception -> 0x016d, all -> 0x016a }
                java.lang.String[] r3 = new java.lang.String[r9]     // Catch:{ Exception -> 0x016d, all -> 0x016a }
                r2.<init>(r13, r1, r3)     // Catch:{ Exception -> 0x016d, all -> 0x016a }
                r6 = r2
            L_0x0137:
                com.bytedance.retrofit2.a.d r7 = new com.bytedance.retrofit2.a.d     // Catch:{ Exception -> 0x016d, all -> 0x016a }
                okhttp3.ad r1 = r14.f26854h     // Catch:{ Exception -> 0x016d, all -> 0x016a }
                java.lang.String r4 = r1.f132401d     // Catch:{ Exception -> 0x016d, all -> 0x016a }
                okhttp3.ad r1 = r14.f26854h     // Catch:{ Exception -> 0x016d, all -> 0x016a }
                okhttp3.s r1 = r1.f132403f     // Catch:{ Exception -> 0x016d, all -> 0x016a }
                java.util.List r5 = m19746a(r1)     // Catch:{ Exception -> 0x016d, all -> 0x016a }
                r1 = r7
                r2 = r0
                r3 = r12
                r1.<init>(r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x016d, all -> 0x016a }
                com.bytedance.frameworks.baselib.network.http.a r1 = r14.f26848b     // Catch:{ Exception -> 0x016d, all -> 0x016a }
                r7.f33351f = r1     // Catch:{ Exception -> 0x016d, all -> 0x016a }
                com.bytedance.retrofit2.a.c r0 = r14.f26852f
                boolean r0 = r0.f33326g
                if (r0 != 0) goto L_0x015a
                okhttp3.ae r0 = r14.f26850d
                com.bytedance.frameworks.baselib.network.http.p570c.p571a.C9865e.m19742a(r0)
            L_0x015a:
                com.bytedance.retrofit2.a.c r0 = r14.f26852f
                boolean r0 = r0.f33326g
                if (r0 != 0) goto L_0x0169
                if (r10 == 0) goto L_0x0169
                com.bytedance.frameworks.baselib.network.a.e r0 = com.bytedance.frameworks.baselib.network.p566a.C9815e.m19643b()
                r0.mo17655d()
            L_0x0169:
                return r7
            L_0x016a:
                r0 = move-exception
                goto L_0x01d0
            L_0x016d:
                r1 = move-exception
                r12 = r1
                r13 = r10
                goto L_0x0177
            L_0x0171:
                r0 = move-exception
                r10 = 0
                goto L_0x01d0
            L_0x0174:
                r1 = move-exception
                r12 = r1
                r13 = 0
            L_0x0177:
                com.bytedance.frameworks.baselib.network.http.c.a.a r1 = com.bytedance.frameworks.baselib.network.http.p570c.p571a.C9865e.f26844d     // Catch:{ all -> 0x01cd }
                if (r1 == 0) goto L_0x0182
                com.bytedance.frameworks.baselib.network.http.c.a.a r1 = com.bytedance.frameworks.baselib.network.http.p570c.p571a.C9865e.f26844d     // Catch:{ all -> 0x01cd }
                okhttp3.ab r2 = r14.f26853g     // Catch:{ all -> 0x01cd }
                r1.mo17708a(r2, r12)     // Catch:{ all -> 0x01cd }
            L_0x0182:
                boolean r1 = r12 instanceof com.bytedance.frameworks.baselib.network.http.p568a.C9836c     // Catch:{ all -> 0x01cd }
                if (r1 == 0) goto L_0x0193
                r1 = r12
                com.bytedance.frameworks.baselib.network.http.a.c r1 = (com.bytedance.frameworks.baselib.network.http.p568a.C9836c) r1     // Catch:{ all -> 0x01cd }
                int r2 = r1.getStatusCode()     // Catch:{ all -> 0x01cd }
                r3 = 304(0x130, float:4.26E-43)
                if (r2 == r3) goto L_0x0192
                goto L_0x0193
            L_0x0192:
                throw r1     // Catch:{ all -> 0x01cd }
            L_0x0193:
                boolean r1 = r12 instanceof java.io.IOException     // Catch:{ all -> 0x01cd }
                if (r1 == 0) goto L_0x01a5
                java.lang.String r1 = "Canceled"
                java.lang.String r2 = r12.getMessage()     // Catch:{ all -> 0x01cd }
                boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x01cd }
                if (r1 != 0) goto L_0x01a4
                goto L_0x01a5
            L_0x01a4:
                throw r12     // Catch:{ all -> 0x01cd }
            L_0x01a5:
                okhttp3.ab r1 = r14.f26853g     // Catch:{ all -> 0x01cd }
                long r3 = r14.f26849c     // Catch:{ all -> 0x01cd }
                com.bytedance.frameworks.baselib.network.http.a r5 = r14.f26848b     // Catch:{ all -> 0x01cd }
                java.lang.String r6 = r14.f26851e     // Catch:{ all -> 0x01cd }
                okhttp3.e r8 = r14.f26855i     // Catch:{ all -> 0x01cd }
                okhttp3.ad r9 = r14.f26854h     // Catch:{ all -> 0x01cd }
                com.bytedance.retrofit2.s r10 = r14.f26857k     // Catch:{ all -> 0x01cd }
                r2 = r0
                r7 = r12
                com.bytedance.frameworks.baselib.network.http.p570c.p571a.C9865e.m19741a(r1, r2, r3, r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x01cd }
                boolean r0 = r12 instanceof java.io.IOException     // Catch:{ all -> 0x01cd }
                if (r0 == 0) goto L_0x01bf
                java.io.IOException r12 = (java.io.IOException) r12     // Catch:{ all -> 0x01cd }
                throw r12     // Catch:{ all -> 0x01cd }
            L_0x01bf:
                java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x01cd }
                java.lang.String r1 = r12.getMessage()     // Catch:{ all -> 0x01cd }
                java.lang.Throwable r2 = r12.getCause()     // Catch:{ all -> 0x01cd }
                r0.<init>(r1, r2)     // Catch:{ all -> 0x01cd }
                throw r0     // Catch:{ all -> 0x01cd }
            L_0x01cd:
                r0 = move-exception
                r10 = r13
                r9 = 1
            L_0x01d0:
                com.bytedance.retrofit2.a.c r1 = r14.f26852f
                boolean r1 = r1.f33326g
                if (r1 == 0) goto L_0x01d8
                if (r9 == 0) goto L_0x01dd
            L_0x01d8:
                okhttp3.ae r1 = r14.f26850d
                com.bytedance.frameworks.baselib.network.http.p570c.p571a.C9865e.m19742a(r1)
            L_0x01dd:
                com.bytedance.retrofit2.a.c r1 = r14.f26852f
                boolean r1 = r1.f33326g
                if (r1 != 0) goto L_0x01ec
                if (r10 == 0) goto L_0x01ec
                com.bytedance.frameworks.baselib.network.a.e r1 = com.bytedance.frameworks.baselib.network.p566a.C9815e.m19643b()
                r1.mo17655d()
            L_0x01ec:
                throw r0
            L_0x01ed:
                com.bytedance.frameworks.baselib.network.http.a.g r0 = new com.bytedance.frameworks.baselib.network.http.a.g
                java.lang.String r1 = "request is not allowed using network"
                r0.<init>(r1)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.baselib.network.http.p570c.p571a.C9865e.C9866a.mo9559a():com.bytedance.retrofit2.a.d");
        }

        /* renamed from: a */
        private static List<C12685b> m19746a(C53671s sVar) {
            int a = sVar.mo111591a();
            ArrayList arrayList = new ArrayList(a);
            for (int i = 0; i < a; i++) {
                arrayList.add(new C12685b(sVar.mo111592a(i), sVar.mo111594b(i)));
            }
            return arrayList;
        }

        /* renamed from: a */
        private static C53684a m19747a(C53684a aVar) {
            if (VERSION.SDK_INT >= 16 && VERSION.SDK_INT < 22) {
                try {
                    SSLContext instance = SSLContext.getInstance("TLSv1.2");
                    instance.init(null, null, null);
                    aVar.mo111656a((SSLSocketFactory) new C9871h(instance.getSocketFactory()));
                    C53655k a = new C53656a(C53655k.f133083a).mo111561a(C53510ag.TLS_1_2).mo111562a();
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(a);
                    arrayList.add(C53655k.f133084b);
                    arrayList.add(C53655k.f133085c);
                    aVar.mo111669b((List<C53655k>) arrayList);
                } catch (Exception unused) {
                }
            }
            return aVar;
        }

        public C9866a(C12686c cVar) throws IOException {
            String str;
            C12686c cVar2 = cVar;
            C53500ac acVar = null;
            this.f26850d = null;
            this.f26851e = null;
            this.f26856j = false;
            this.f26857k = null;
            this.f26847a = C9865e.f26843c.mo17710a();
            this.f26852f = cVar2;
            String str2 = this.f26852f.f33321b;
            this.f26857k = cVar2.f33332m;
            if (this.f26857k != null) {
                this.f26848b.f26753c = this.f26857k.f33470c;
                this.f26848b.f26754d = this.f26857k.f33471d;
            }
            this.f26849c = System.currentTimeMillis();
            this.f26848b.f26755e = this.f26849c;
            this.f26848b.f26772v = 1;
            if (this.f26852f.f33326g) {
                this.f26848b.f26776z = true;
            } else {
                this.f26848b.f26776z = false;
            }
            try {
                C53684a a = m19747a(this.f26847a.mo111653b());
                a.mo111666a(true);
                a.mo111654a((long) C9894e.m19830d(), TimeUnit.MILLISECONDS);
                a.mo111668b((long) C9894e.m19831e(), TimeUnit.MILLISECONDS);
                a.mo111672c((long) C9894e.m19831e(), TimeUnit.MILLISECONDS);
                if (cVar2.f33329j instanceof C9841b) {
                    this.f26848b.f26752b = (C9841b) cVar2.f33329j;
                    T t = this.f26848b.f26752b;
                    if (t.f26780c > 0 || t.f26781d > 0 || t.f26782e > 0) {
                        if (t.f26780c > 0) {
                            a.mo111654a(t.f26780c, TimeUnit.MILLISECONDS);
                        }
                        if (t.f26782e > 0) {
                            a.mo111672c(t.f26782e, TimeUnit.MILLISECONDS);
                        }
                        if (t.f26781d > 0) {
                            a.mo111668b(t.f26781d, TimeUnit.MILLISECONDS);
                        }
                    }
                    this.f26856j = t.f26787j;
                }
                this.f26847a = a.mo111667a();
                C53499a a2 = new C53499a().mo111262a(str2);
                if (!C53569f.m113839c(this.f26852f.f33320a)) {
                    str = this.f26852f.f33320a;
                } else {
                    str = this.f26852f.f33320a;
                    final TypedOutput a3 = this.f26852f.mo23857a();
                    C53500ac acVar2 = this.f26852f.f33324e;
                    if (acVar2 == null) {
                        if (a3 == null) {
                            acVar = C53500ac.create((C53678w) null, "body=null");
                        } else {
                            final C53678w a4 = C53678w.m114225a(a3.mimeType());
                            acVar2 = new C53500ac() {
                                public final C53678w contentType() {
                                    return a4;
                                }

                                public final long contentLength() {
                                    return a3.length();
                                }

                                public final void writeTo(BufferedSink bufferedSink) throws IOException {
                                    a3.writeTo(bufferedSink.outputStream());
                                }
                            };
                        }
                    }
                    acVar = acVar2;
                }
                C53499a a5 = a2.mo111264a(str, acVar);
                List<C12685b> list = this.f26852f.f33322c;
                if (this.f26852f.mo23857a() != null) {
                    String md5Stub = this.f26852f.mo23857a().md5Stub();
                    if (md5Stub != null) {
                        a5.mo111271b("X-SS-STUB", md5Stub);
                    }
                }
                this.f26853g = C9865e.m19735a(a5, list);
                this.f26855i = this.f26847a.mo111325a(this.f26853g);
                this.f26848b.f26775y = C9865e.m19736a(this.f26853g);
            } catch (Exception e) {
                C9865e.m19741a(this.f26853g, str2, this.f26849c, this.f26848b, this.f26851e, e, this.f26855i, this.f26854h, this.f26857k);
                if (e instanceof IOException) {
                    throw ((IOException) e);
                }
                throw new IOException(e.getMessage(), e.getCause());
            }
        }
    }

    /* renamed from: a */
    private static void m19740a(String str, C9831a aVar) {
        if (!C9431p.m18664a(str) && aVar != null) {
            try {
                aVar.f26751a = str;
                if (aVar.f26752b != null) {
                    aVar.f26752b.f26778a = str;
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public static byte[] m19744a(String str, int i, C53504ad adVar, long j, C9831a aVar, String str2, C12796s sVar) throws IOException {
        String str3 = str;
        int i2 = i;
        C53504ad adVar2 = adVar;
        C9831a aVar2 = aVar;
        C12796s sVar2 = sVar;
        if (adVar2 == null) {
            return new byte[0];
        }
        int i3 = adVar2.f132400c;
        C53506ae aeVar = adVar2.f132404g;
        boolean equals = "gzip".equals(adVar2.mo111276b("Content-Encoding"));
        String b = adVar2.mo111276b("Content-Type");
        if (i3 != 200) {
            if (i3 == 304) {
                aVar2.f26757g = System.currentTimeMillis();
                long currentTimeMillis = System.currentTimeMillis() - j;
                aVar2.f26758h = System.currentTimeMillis();
                aVar2.f26773w = f26846f;
                m19738a(aVar2, sVar2);
                C9894e.m19823a(str3, currentTimeMillis, aVar2);
                C9894e.m19818a(currentTimeMillis, j, str, str2, aVar);
            }
            String str4 = adVar2.f132401d;
            if (aeVar != null) {
                m19743a(equals, i2, aeVar.byteStream(), b, str3);
                C9893d.m19804a((Closeable) aeVar);
            }
            throw new C9836c(i3, str4);
        } else if (aeVar == null) {
            return new byte[0];
        } else {
            aVar2.f26757g = System.currentTimeMillis();
            InputStream byteStream = aeVar.byteStream();
            int[] iArr = new int[1];
            try {
                iArr[0] = 0;
                byte[] a = C9893d.m19810a(equals, i2, byteStream, iArr);
                C9893d.m19804a((Closeable) byteStream);
                byte[] bArr = new byte[iArr[0]];
                if (a != null && iArr[0] > 0) {
                    System.arraycopy(a, 0, bArr, 0, iArr[0]);
                }
                if (C9893d.m19809a(b)) {
                    C9893d.m19806a(bArr, bArr.length);
                }
                long currentTimeMillis2 = System.currentTimeMillis() - j;
                aVar2.f26758h = System.currentTimeMillis();
                aVar2.f26773w = f26846f;
                m19738a(aVar2, sVar2);
                C9894e.m19823a(str3, currentTimeMillis2, aVar2);
                C9894e.m19818a(currentTimeMillis2, j, str, str2, aVar);
                return bArr;
            } catch (Throwable th) {
                C9893d.m19804a((Closeable) byteStream);
                throw th;
            }
        }
    }

    /* renamed from: a */
    private static void m19738a(C9831a aVar, C12796s sVar) {
        if (aVar != null && sVar != null) {
            sVar.f33468a = aVar.f26773w;
            sVar.f33482o = SystemClock.uptimeMillis();
            sVar.f33473f = System.currentTimeMillis();
            try {
                aVar.f26775y.put("retrofit", sVar.mo23948a());
            } catch (JSONException unused) {
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public static void m19743a(boolean z, int i, InputStream inputStream, String str, String str2) throws IOException {
        if (inputStream != null) {
            int[] iArr = new int[1];
            try {
                iArr[0] = 0;
                byte[] a = C9893d.m19810a(z, i, inputStream, iArr);
                C9893d.m19804a((Closeable) inputStream);
                byte[] bArr = new byte[iArr[0]];
                if (a != null && iArr[0] > 0) {
                    System.arraycopy(a, 0, bArr, 0, iArr[0]);
                }
                if (bArr.length > 0 && !C9431p.m18664a(str) && C9415i.m18635b()) {
                    try {
                        C9890a aVar = new C9890a(str);
                        if ("text".equalsIgnoreCase(aVar.getPrimaryType()) || "application/json".equalsIgnoreCase(aVar.getBaseType())) {
                            C9431p.m18664a(aVar.getParameter("charset"));
                        }
                    } catch (Throwable unused) {
                    }
                }
            } catch (Throwable th) {
                C9893d.m19804a((Closeable) inputStream);
                throw th;
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(10:(3:4|5|(1:7))|8|(1:10)|11|12|(2:16|(1:18))|(1:23)|24|(1:26)|27) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002f */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0049 A[Catch:{ Throwable -> 0x004c }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x007e  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m19741a(okhttp3.C53498ab r9, java.lang.String r10, long r11, com.bytedance.frameworks.baselib.network.http.C9831a r13, java.lang.String r14, java.lang.Exception r15, okhttp3.C53524e r16, okhttp3.C53504ad r17, com.bytedance.retrofit2.C12796s r18) {
        /*
            r4 = r10
            r6 = r13
            r0 = r17
            if (r4 != 0) goto L_0x0007
            return
        L_0x0007:
            if (r6 == 0) goto L_0x0013
            org.json.JSONObject r1 = r6.f26775y     // Catch:{ Throwable -> 0x002f }
            if (r1 != 0) goto L_0x0013
            org.json.JSONObject r1 = m19736a(r9)     // Catch:{ Throwable -> 0x002f }
            r6.f26775y = r1     // Catch:{ Throwable -> 0x002f }
        L_0x0013:
            org.json.JSONObject r1 = r6.f26775y     // Catch:{ Throwable -> 0x002f }
            java.lang.String r2 = "ex"
            java.lang.String r3 = r15.getMessage()     // Catch:{ Throwable -> 0x002f }
            r1.put(r2, r3)     // Catch:{ Throwable -> 0x002f }
            java.lang.String r1 = m19732a(r17)     // Catch:{ Throwable -> 0x002f }
            boolean r2 = com.bytedance.common.utility.C9431p.m18664a(r1)     // Catch:{ Throwable -> 0x002f }
            if (r2 != 0) goto L_0x002f
            org.json.JSONObject r2 = r6.f26775y     // Catch:{ Throwable -> 0x002f }
            java.lang.String r3 = "response-headers"
            r2.put(r3, r1)     // Catch:{ Throwable -> 0x002f }
        L_0x002f:
            int r1 = r0.f132400c     // Catch:{ Throwable -> 0x004c }
            java.lang.String r2 = "tko"
            java.lang.String r0 = r0.mo111276b(r2)     // Catch:{ Throwable -> 0x004c }
            r2 = 498(0x1f2, float:6.98E-43)
            if (r1 != r2) goto L_0x004c
            java.lang.String r1 = "1"
            boolean r0 = r1.equals(r0)     // Catch:{ Throwable -> 0x004c }
            if (r0 == 0) goto L_0x004c
            com.bytedance.frameworks.baselib.network.http.e$i r0 = com.bytedance.frameworks.baselib.network.http.C9894e.m19812a()     // Catch:{ Throwable -> 0x004c }
            if (r0 == 0) goto L_0x004c
            r0.mo17836b()     // Catch:{ Throwable -> 0x004c }
        L_0x004c:
            if (r6 == 0) goto L_0x005d
            java.lang.String r0 = r6.f26751a
            boolean r0 = com.bytedance.common.utility.C9431p.m18664a(r0)
            if (r0 == 0) goto L_0x005d
            java.lang.String r0 = m19731a(r15)
            m19740a(r0, r13)
        L_0x005d:
            long r0 = java.lang.System.currentTimeMillis()
            long r0 = r0 - r11
            long r7 = java.lang.System.currentTimeMillis()
            r6.f26758h = r7
            int r5 = f26846f
            r6.f26773w = r5
            r5 = r18
            m19738a(r13, r5)
            r7 = r15
            com.bytedance.frameworks.baselib.network.http.C9894e.m19825a(r10, r15, r0, r13)
            r2 = r11
            r4 = r10
            r5 = r14
            r6 = r13
            com.bytedance.frameworks.baselib.network.http.C9894e.m19819a(r0, r2, r4, r5, r6, r7)
            if (r16 == 0) goto L_0x0081
            r16.mo111248c()
        L_0x0081:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.baselib.network.http.p570c.p571a.C9865e.m19741a(okhttp3.ab, java.lang.String, long, com.bytedance.frameworks.baselib.network.http.a, java.lang.String, java.lang.Exception, okhttp3.e, okhttp3.ad, com.bytedance.retrofit2.s):void");
    }

    /* renamed from: a */
    public final C12689e mo9561a(C12686c cVar) throws IOException {
        return new C9866a(cVar);
    }

    /* renamed from: a */
    public static void m19737a(int i) {
        f26846f = i;
    }

    /* renamed from: a */
    public static void m19739a(C9859a aVar) {
        f26844d = aVar;
    }

    /* renamed from: a */
    public static void m19742a(C53506ae aeVar) {
        if (aeVar != null) {
            C9893d.m19804a((Closeable) aeVar);
        }
    }

    private C9865e(Context context) {
        f26842b = context.getApplicationContext();
        f26843c = new C9860b();
    }

    /* renamed from: a */
    public static C9865e m19730a(Context context) {
        if (f26845e == null) {
            synchronized (C9865e.class) {
                if (f26845e == null) {
                    f26845e = new C9865e(context);
                }
            }
        }
        return f26845e;
    }

    /* renamed from: a */
    private static String m19731a(Exception exc) {
        if (exc == null) {
            return "";
        }
        try {
            String[] split = exc.getMessage().split("\\|");
            if (split != null && split.length >= 2) {
                return split[0];
            }
        } catch (Throwable unused) {
        }
        return "";
    }

    /* renamed from: a */
    private static String m19732a(C53504ad adVar) {
        if (adVar == null) {
            return "";
        }
        try {
            C53671s sVar = adVar.f132403f;
            if (sVar == null) {
                return "";
            }
            JSONObject jSONObject = new JSONObject();
            for (String str : sVar.mo111596b()) {
                if (!C9431p.m18664a(str)) {
                    List<String> b = sVar.mo111595b(str);
                    if (b != null && !b.isEmpty()) {
                        StringBuilder sb = new StringBuilder();
                        int i = 0;
                        for (String str2 : b) {
                            if (!C9431p.m18664a(str2)) {
                                if (i == 0) {
                                    sb.append(str2);
                                } else {
                                    sb.append("; ");
                                    sb.append(str2);
                                }
                                i++;
                            }
                        }
                        jSONObject.put(str, sb.toString());
                    }
                }
            }
            return jSONObject.toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    /* renamed from: a */
    public static String m19734a(C53671s sVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            for (Entry entry : sVar.mo111599e().entrySet()) {
                String str = (String) entry.getKey();
                List<String> list = (List) entry.getValue();
                if (!TextUtils.isEmpty(str) && list != null && list.size() > 0) {
                    for (String put : list) {
                        jSONObject.put(str, put);
                    }
                }
            }
            return jSONObject.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:17|18) */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        r3 = com.bytedance.frameworks.baselib.network.http.p574e.C9915j.m19871b(r7.f132378a.toString());
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0055 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static org.json.JSONObject m19736a(okhttp3.C53498ab r7) {
        /*
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            if (r7 != 0) goto L_0x0008
            return r0
        L_0x0008:
            java.lang.String r1 = "hc"
            java.lang.String r2 = "SsOkHttp3Client"
            r0.put(r1, r2)     // Catch:{ Exception -> 0x00ba }
            java.lang.String r1 = "hcv"
            java.lang.String r2 = "tt-ok/3.10.0.2"
            r0.put(r1, r2)     // Catch:{ Exception -> 0x00ba }
            java.lang.String r1 = "ua"
            java.lang.String r2 = "User-Agent"
            java.lang.String r2 = r7.mo111255a(r2)     // Catch:{ Exception -> 0x00ba }
            r0.put(r1, r2)     // Catch:{ Exception -> 0x00ba }
            java.net.CookieHandler r1 = java.net.CookieHandler.getDefault()     // Catch:{ Exception -> 0x00ba }
            if (r1 == 0) goto L_0x00ba
            java.util.HashMap r2 = new java.util.HashMap     // Catch:{ Exception -> 0x00ba }
            r2.<init>()     // Catch:{ Exception -> 0x00ba }
            okhttp3.s r3 = r7.f132380c     // Catch:{ Exception -> 0x00ba }
            if (r3 == 0) goto L_0x004e
            java.util.Set r4 = r3.mo111596b()     // Catch:{ Exception -> 0x00ba }
            if (r4 == 0) goto L_0x004e
            java.util.Iterator r4 = r4.iterator()     // Catch:{ Exception -> 0x00ba }
        L_0x003a:
            boolean r5 = r4.hasNext()     // Catch:{ Exception -> 0x00ba }
            if (r5 == 0) goto L_0x004e
            java.lang.Object r5 = r4.next()     // Catch:{ Exception -> 0x00ba }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x00ba }
            java.util.List r6 = r3.mo111595b(r5)     // Catch:{ Exception -> 0x00ba }
            r2.put(r5, r6)     // Catch:{ Exception -> 0x00ba }
            goto L_0x003a
        L_0x004e:
            okhttp3.t r3 = r7.f132378a     // Catch:{ Exception -> 0x0055 }
            java.net.URI r3 = r3.mo111611b()     // Catch:{ Exception -> 0x0055 }
            goto L_0x005f
        L_0x0055:
            okhttp3.t r7 = r7.f132378a     // Catch:{ Exception -> 0x00ba }
            java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x00ba }
            java.net.URI r3 = com.bytedance.frameworks.baselib.network.http.p574e.C9915j.m19871b(r7)     // Catch:{ Exception -> 0x00ba }
        L_0x005f:
            java.util.Map r7 = r1.get(r3, r2)     // Catch:{ Exception -> 0x00ba }
            if (r7 == 0) goto L_0x00ba
            boolean r1 = r7.isEmpty()     // Catch:{ Exception -> 0x00ba }
            if (r1 != 0) goto L_0x00ba
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00ba }
            r1.<init>()     // Catch:{ Exception -> 0x00ba }
            java.util.Set r2 = r7.keySet()     // Catch:{ Exception -> 0x00ba }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ Exception -> 0x00ba }
        L_0x0078:
            boolean r3 = r2.hasNext()     // Catch:{ Exception -> 0x00ba }
            if (r3 == 0) goto L_0x00b1
            java.lang.Object r3 = r2.next()     // Catch:{ Exception -> 0x00ba }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ Exception -> 0x00ba }
            int r4 = r1.length()     // Catch:{ Exception -> 0x00ba }
            if (r4 <= 0) goto L_0x008f
            java.lang.String r4 = ","
            r1.append(r4)     // Catch:{ Exception -> 0x00ba }
        L_0x008f:
            java.lang.Object r4 = r7.get(r3)     // Catch:{ Exception -> 0x00ba }
            java.util.List r4 = (java.util.List) r4     // Catch:{ Exception -> 0x00ba }
            if (r3 == 0) goto L_0x0098
            goto L_0x009a
        L_0x0098:
            java.lang.String r3 = "null"
        L_0x009a:
            r1.append(r3)     // Catch:{ Exception -> 0x00ba }
            java.lang.String r3 = ":"
            r1.append(r3)     // Catch:{ Exception -> 0x00ba }
            if (r4 == 0) goto L_0x00ab
            java.lang.String r3 = ", "
            java.lang.String r3 = android.text.TextUtils.join(r3, r4)     // Catch:{ Exception -> 0x00ba }
            goto L_0x00ad
        L_0x00ab:
            java.lang.String r3 = "null"
        L_0x00ad:
            r1.append(r3)     // Catch:{ Exception -> 0x00ba }
            goto L_0x0078
        L_0x00b1:
            java.lang.String r7 = "cookie"
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x00ba }
            r0.put(r7, r1)     // Catch:{ Exception -> 0x00ba }
        L_0x00ba:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.baselib.network.http.p570c.p571a.C9865e.m19736a(okhttp3.ab):org.json.JSONObject");
    }

    /* renamed from: a */
    public static String m19733a(C53504ad adVar, C9831a aVar) {
        if (adVar == null) {
            return null;
        }
        m19740a(adVar.mo111276b("x-net-info.remoteaddr"), aVar);
        if (!(aVar == null || aVar.f26752b == null)) {
            aVar.f26752b.f26779b = adVar.f132400c;
        }
        return adVar.mo111276b("X-TT-LOGID");
    }

    /* renamed from: a */
    public static C53498ab m19735a(C53499a aVar, List<C12685b> list) throws IOException {
        if (aVar == null) {
            return null;
        }
        aVar.mo111271b("Accept-Encoding", "gzip");
        boolean z = false;
        if (list != null) {
            for (C12685b bVar : list) {
                if (!C9431p.m18664a(bVar.f33318a) && !C9431p.m18664a(bVar.f33319b)) {
                    if ("User-Agent".equals(bVar.f33318a)) {
                        z = true;
                    }
                    aVar.mo111263a(bVar.f33318a, bVar.f33319b);
                }
            }
        }
        if (!z) {
            String f = C9894e.m19832f();
            if (!C9431p.m18664a(f)) {
                StringBuilder sb = new StringBuilder();
                sb.append(f);
                sb.append(" tt-ok/3.10.0.2");
                aVar.mo111263a("User-Agent", sb.toString());
            }
        }
        return aVar.mo111272c();
    }
}
