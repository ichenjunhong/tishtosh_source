package com.bytedance.frameworks.baselib.network.http.cronet.p572a;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.common.utility.C9415i;
import com.bytedance.common.utility.C9431p;
import com.bytedance.common.utility.p526f.C9409b;
import com.bytedance.frameworks.baselib.network.http.C9831a;
import com.bytedance.frameworks.baselib.network.http.C9858c;
import com.bytedance.frameworks.baselib.network.http.C9894e;
import com.bytedance.frameworks.baselib.network.http.C9894e.C9903i;
import com.bytedance.frameworks.baselib.network.http.C9894e.C9904j;
import com.bytedance.frameworks.baselib.network.http.cronet.ICronetClient;
import com.bytedance.frameworks.baselib.network.http.cronet.ICronetClient.ICronetBootFailureChecker;
import com.bytedance.frameworks.baselib.network.http.p573d.C9890a;
import com.bytedance.frameworks.baselib.network.http.p573d.C9893d;
import com.bytedance.frameworks.baselib.network.http.p574e.C9915j;
import com.bytedance.frameworks.baselib.network.http.retrofit.C9919a;
import com.bytedance.retrofit2.C12758l;
import com.bytedance.retrofit2.C12759m;
import com.bytedance.retrofit2.C12796s;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.bytedance.retrofit2.p830a.C12685b;
import com.bytedance.retrofit2.p830a.C12686c;
import com.bytedance.retrofit2.p830a.C12689e;
import com.p683ss.android.ttve.nativePort.TEVideoRecorder;
import com.p683ss.android.ugc.aweme.net.C37775g;
import com.p683ss.android.ugc.aweme.player.p2050a.C38828b;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.CookieHandler;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import org.json.JSONObject;

/* renamed from: com.bytedance.frameworks.baselib.network.http.cronet.a.c */
public class C9874c implements C9858c, ICronetBootFailureChecker, C9904j {

    /* renamed from: a */
    public static Context f26871a = null;

    /* renamed from: b */
    public static ICronetClient f26872b = null;

    /* renamed from: c */
    public static volatile boolean f26873c = false;

    /* renamed from: d */
    public static volatile int f26874d = 0;

    /* renamed from: e */
    private static String f26875e = "";

    /* renamed from: f */
    private static volatile C9874c f26876f;

    /* renamed from: g */
    private static C9877b f26877g;

    /* renamed from: h */
    private static C9878c f26878h;

    /* renamed from: com.bytedance.frameworks.baselib.network.http.cronet.a.c$a */
    public static class C9875a implements C12689e, C12758l, C12759m {

        /* renamed from: a */
        HttpURLConnection f26879a;

        /* renamed from: b */
        C9831a f26880b = C9831a.m19674a();

        /* renamed from: c */
        long f26881c = 0;

        /* renamed from: d */
        String f26882d = null;

        /* renamed from: e */
        C12686c f26883e;

        /* renamed from: f */
        boolean f26884f = false;

        /* renamed from: g */
        boolean f26885g = false;

        /* renamed from: h */
        C12796s f26886h = null;

        public final Object getRequestInfo() {
            return this.f26880b;
        }

        /* renamed from: b */
        public final void mo9560b() {
            if (this.f26879a != null) {
                this.f26879a.disconnect();
                this.f26884f = true;
            }
        }

        public final void doCollect() {
            C9874c.m19767a(this.f26879a, this.f26880b, this.f26886h);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:66:?, code lost:
            r3 = r15.f26879a.getErrorStream();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:89:0x0171, code lost:
            r0 = th;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:65:0x00ea */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x004a A[Catch:{ Exception -> 0x0173, all -> 0x0171 }] */
        /* JADX WARNING: Removed duplicated region for block: B:35:0x0085 A[Catch:{ Exception -> 0x0173, all -> 0x0171 }] */
        /* JADX WARNING: Removed duplicated region for block: B:79:0x0122 A[Catch:{ Exception -> 0x0173, all -> 0x0171 }] */
        /* JADX WARNING: Removed duplicated region for block: B:83:0x015c  */
        /* JADX WARNING: Removed duplicated region for block: B:89:0x0171 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:23:0x0043] */
        /* JADX WARNING: Removed duplicated region for block: B:99:0x0180 A[Catch:{ all -> 0x01b7 }] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.retrofit2.p830a.C12688d mo9559a() throws java.io.IOException {
            /*
                r15 = this;
                com.bytedance.retrofit2.a.c r0 = r15.f26883e
                java.lang.String r0 = r0.f33321b
                boolean r1 = com.bytedance.frameworks.baselib.network.http.cronet.p572a.C9874c.f26873c
                if (r1 != 0) goto L_0x01df
                boolean r1 = r15.f26884f
                if (r1 != 0) goto L_0x01d7
                boolean r1 = r15.f26885g
                if (r1 != 0) goto L_0x0025
                android.content.Context r1 = com.bytedance.frameworks.baselib.network.http.cronet.p572a.C9874c.f26871a
                if (r1 == 0) goto L_0x0025
                android.content.Context r1 = com.bytedance.frameworks.baselib.network.http.cronet.p572a.C9874c.f26871a
                boolean r1 = com.bytedance.frameworks.baselib.network.http.cronet.p572a.C9879d.m19786a(r1)
                if (r1 == 0) goto L_0x001d
                goto L_0x0025
            L_0x001d:
                com.bytedance.frameworks.baselib.network.http.a.d r0 = new com.bytedance.frameworks.baselib.network.http.a.d
                java.lang.String r1 = "network not available"
                r0.<init>(r1)
                throw r0
            L_0x0025:
                r10 = 1
                r11 = 0
                com.bytedance.retrofit2.a.c r1 = r15.f26883e     // Catch:{ Exception -> 0x017a, all -> 0x0177 }
                boolean r1 = r1.f33326g     // Catch:{ Exception -> 0x017a, all -> 0x0177 }
                if (r1 != 0) goto L_0x0042
                com.bytedance.frameworks.baselib.network.http.e$g r1 = com.bytedance.frameworks.baselib.network.http.C9894e.m19827b()     // Catch:{ Exception -> 0x017a, all -> 0x0177 }
                if (r1 == 0) goto L_0x0042
                boolean r1 = r1.mo17828c(r0)     // Catch:{ Exception -> 0x017a, all -> 0x0177 }
                if (r1 == 0) goto L_0x0042
                com.bytedance.frameworks.baselib.network.a.e r1 = com.bytedance.frameworks.baselib.network.p566a.C9815e.m19643b()     // Catch:{ Exception -> 0x017a, all -> 0x0177 }
                r1.mo17654c()     // Catch:{ Exception -> 0x017a, all -> 0x0177 }
                r12 = 1
                goto L_0x0043
            L_0x0042:
                r12 = 0
            L_0x0043:
                com.bytedance.retrofit2.a.c r1 = r15.f26883e     // Catch:{ Exception -> 0x0173, all -> 0x0171 }
                java.net.HttpURLConnection r2 = r15.f26879a     // Catch:{ Exception -> 0x0173, all -> 0x0171 }
                r3 = -1
                if (r1 == 0) goto L_0x0060
                if (r2 != 0) goto L_0x004d
                goto L_0x0060
            L_0x004d:
                com.bytedance.retrofit2.mime.TypedOutput r1 = r1.mo23857a()     // Catch:{ Exception -> 0x0173, all -> 0x0171 }
                if (r1 == 0) goto L_0x005a
                java.io.OutputStream r4 = r2.getOutputStream()     // Catch:{ Exception -> 0x0173, all -> 0x0171 }
                r1.writeTo(r4)     // Catch:{ Exception -> 0x0173, all -> 0x0171 }
            L_0x005a:
                int r1 = r2.getResponseCode()     // Catch:{ Exception -> 0x0173, all -> 0x0171 }
                r13 = r1
                goto L_0x0061
            L_0x0060:
                r13 = -1
            L_0x0061:
                com.bytedance.frameworks.baselib.network.http.a r1 = r15.f26880b     // Catch:{ Exception -> 0x0173, all -> 0x0171 }
                long r4 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0173, all -> 0x0171 }
                r1.f26756f = r4     // Catch:{ Exception -> 0x0173, all -> 0x0171 }
                com.bytedance.frameworks.baselib.network.http.a r1 = r15.f26880b     // Catch:{ Exception -> 0x0173, all -> 0x0171 }
                r1.f26759i = r3     // Catch:{ Exception -> 0x0173, all -> 0x0171 }
                java.net.HttpURLConnection r1 = r15.f26879a     // Catch:{ Exception -> 0x0173, all -> 0x0171 }
                com.bytedance.frameworks.baselib.network.http.a r2 = r15.f26880b     // Catch:{ Exception -> 0x0173, all -> 0x0171 }
                java.lang.String r1 = com.bytedance.frameworks.baselib.network.http.cronet.p572a.C9874c.m19757a(r1, r2, r13)     // Catch:{ Exception -> 0x0173, all -> 0x0171 }
                r15.f26882d = r1     // Catch:{ Exception -> 0x0173, all -> 0x0171 }
                java.net.HttpURLConnection r1 = r15.f26879a     // Catch:{ Exception -> 0x0173, all -> 0x0171 }
                java.lang.String r2 = "Content-Type"
                java.lang.String r14 = com.bytedance.frameworks.baselib.network.http.cronet.p572a.C9874c.m19758a(r1, r2)     // Catch:{ Exception -> 0x0173, all -> 0x0171 }
                com.bytedance.retrofit2.a.c r1 = r15.f26883e     // Catch:{ Exception -> 0x0173, all -> 0x0171 }
                boolean r1 = r1.f33326g     // Catch:{ Exception -> 0x0173, all -> 0x0171 }
                if (r1 == 0) goto L_0x0122
                java.net.HttpURLConnection r1 = r15.f26879a     // Catch:{ Exception -> 0x0173, all -> 0x0171 }
                java.lang.String r2 = "Content-Encoding"
                java.lang.String r1 = com.bytedance.frameworks.baselib.network.http.cronet.p572a.C9874c.m19758a(r1, r2)     // Catch:{ Exception -> 0x0173, all -> 0x0171 }
                if (r1 == 0) goto L_0x0099
                java.lang.String r2 = "gzip"
                boolean r1 = r2.equalsIgnoreCase(r1)     // Catch:{ Exception -> 0x0173, all -> 0x0171 }
                if (r1 == 0) goto L_0x0099
                r1 = 1
                goto L_0x009a
            L_0x0099:
                r1 = 0
            L_0x009a:
                com.bytedance.frameworks.baselib.network.http.cronet.ICronetClient r2 = com.bytedance.frameworks.baselib.network.http.cronet.p572a.C9874c.f26872b     // Catch:{ Exception -> 0x0173, all -> 0x0171 }
                if (r2 == 0) goto L_0x00a9
                com.bytedance.frameworks.baselib.network.http.cronet.ICronetClient r2 = com.bytedance.frameworks.baselib.network.http.cronet.p572a.C9874c.f26872b     // Catch:{ Exception -> 0x0173, all -> 0x0171 }
                java.net.HttpURLConnection r3 = r15.f26879a     // Catch:{ Exception -> 0x0173, all -> 0x0171 }
                boolean r2 = r2.isCronetHttpURLConnection(r3)     // Catch:{ Exception -> 0x0173, all -> 0x0171 }
                if (r2 == 0) goto L_0x00a9
                r1 = 0
            L_0x00a9:
                r2 = 200(0xc8, float:2.8E-43)
                r3 = 0
                if (r13 < r2) goto L_0x00c5
                r2 = 300(0x12c, float:4.2E-43)
                if (r13 >= r2) goto L_0x00c5
                java.net.HttpURLConnection r2 = r15.f26879a     // Catch:{ Exception -> 0x0173, all -> 0x0171 }
                if (r2 == 0) goto L_0x00c2
                int r4 = r2.getContentLength()     // Catch:{ Exception -> 0x0173, all -> 0x0171 }
                if (r4 != 0) goto L_0x00bd
                goto L_0x00c2
            L_0x00bd:
                com.bytedance.frameworks.baselib.network.http.cronet.a.c$a$1 r3 = new com.bytedance.frameworks.baselib.network.http.cronet.a.c$a$1     // Catch:{ Exception -> 0x0173, all -> 0x0171 }
                r3.<init>(r2, r1)     // Catch:{ Exception -> 0x0173, all -> 0x0171 }
            L_0x00c2:
                r6 = r3
                goto L_0x013e
            L_0x00c5:
                java.net.HttpURLConnection r2 = r15.f26879a     // Catch:{ Exception -> 0x0173, all -> 0x0171 }
                java.lang.String r2 = r2.getResponseMessage()     // Catch:{ Exception -> 0x0173, all -> 0x0171 }
                com.bytedance.retrofit2.a.c r4 = r15.f26883e     // Catch:{ Throwable -> 0x00f4 }
                int r4 = r4.f33327h     // Catch:{ Throwable -> 0x00f4 }
                java.net.HttpURLConnection r5 = r15.f26879a     // Catch:{ Exception -> 0x00ea, all -> 0x0171 }
                r6 = r5
                java.net.URLConnection r6 = (java.net.URLConnection) r6     // Catch:{ Exception -> 0x00ea, all -> 0x0171 }
                boolean r7 = com.p683ss.android.ugc.aweme.lancet.p1153c.C18982g.m46160a(r6)     // Catch:{ Exception -> 0x00ea, all -> 0x0171 }
                if (r7 == 0) goto L_0x00e5
                java.net.URL r7 = r6.getURL()     // Catch:{ Exception -> 0x00ea, all -> 0x0171 }
                java.lang.String r6 = r6.getContentType()     // Catch:{ Exception -> 0x00ea, all -> 0x0171 }
                com.p683ss.android.ugc.aweme.lancet.p1153c.C18976b.m46151a(r7, r3, r3, r6)     // Catch:{ Exception -> 0x00ea, all -> 0x0171 }
            L_0x00e5:
                java.io.InputStream r3 = r5.getInputStream()     // Catch:{ Exception -> 0x00ea, all -> 0x0171 }
                goto L_0x00f0
            L_0x00ea:
                java.net.HttpURLConnection r3 = r15.f26879a     // Catch:{ Throwable -> 0x00f4 }
                java.io.InputStream r3 = r3.getErrorStream()     // Catch:{ Throwable -> 0x00f4 }
            L_0x00f0:
                com.bytedance.frameworks.baselib.network.http.cronet.p572a.C9874c.m19769a(r1, r4, r3, r14, r0)     // Catch:{ Throwable -> 0x00f4 }
                goto L_0x0113
            L_0x00f4:
                r1 = move-exception
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0173, all -> 0x0171 }
                java.lang.String r4 = "reason = "
                r3.<init>(r4)     // Catch:{ Exception -> 0x0173, all -> 0x0171 }
                if (r2 != 0) goto L_0x0100
                java.lang.String r2 = ""
            L_0x0100:
                r3.append(r2)     // Catch:{ Exception -> 0x0173, all -> 0x0171 }
                java.lang.String r2 = "  exception = "
                r3.append(r2)     // Catch:{ Exception -> 0x0173, all -> 0x0171 }
                java.lang.String r1 = r1.getMessage()     // Catch:{ Exception -> 0x0173, all -> 0x0171 }
                r3.append(r1)     // Catch:{ Exception -> 0x0173, all -> 0x0171 }
                java.lang.String r2 = r3.toString()     // Catch:{ Exception -> 0x0173, all -> 0x0171 }
            L_0x0113:
                java.net.HttpURLConnection r1 = r15.f26879a     // Catch:{ Exception -> 0x0173, all -> 0x0171 }
                if (r1 == 0) goto L_0x011c
                java.net.HttpURLConnection r1 = r15.f26879a     // Catch:{ Exception -> 0x0173, all -> 0x0171 }
                r1.disconnect()     // Catch:{ Exception -> 0x0173, all -> 0x0171 }
            L_0x011c:
                com.bytedance.frameworks.baselib.network.http.a.c r1 = new com.bytedance.frameworks.baselib.network.http.a.c     // Catch:{ Exception -> 0x0173, all -> 0x0171 }
                r1.<init>(r13, r2)     // Catch:{ Exception -> 0x0173, all -> 0x0171 }
                throw r1     // Catch:{ Exception -> 0x0173, all -> 0x0171 }
            L_0x0122:
                com.bytedance.retrofit2.a.c r1 = r15.f26883e     // Catch:{ Exception -> 0x0173, all -> 0x0171 }
                int r2 = r1.f33327h     // Catch:{ Exception -> 0x0173, all -> 0x0171 }
                java.net.HttpURLConnection r3 = r15.f26879a     // Catch:{ Exception -> 0x0173, all -> 0x0171 }
                long r4 = r15.f26881c     // Catch:{ Exception -> 0x0173, all -> 0x0171 }
                com.bytedance.frameworks.baselib.network.http.a r6 = r15.f26880b     // Catch:{ Exception -> 0x0173, all -> 0x0171 }
                java.lang.String r7 = r15.f26882d     // Catch:{ Exception -> 0x0173, all -> 0x0171 }
                com.bytedance.retrofit2.s r9 = r15.f26886h     // Catch:{ Exception -> 0x0173, all -> 0x0171 }
                r1 = r0
                r8 = r13
                byte[] r1 = com.bytedance.frameworks.baselib.network.http.cronet.p572a.C9874c.m19771a(r1, r2, r3, r4, r6, r7, r8, r9)     // Catch:{ Exception -> 0x0173, all -> 0x0171 }
                com.bytedance.retrofit2.mime.TypedByteArray r2 = new com.bytedance.retrofit2.mime.TypedByteArray     // Catch:{ Exception -> 0x0173, all -> 0x0171 }
                java.lang.String[] r3 = new java.lang.String[r11]     // Catch:{ Exception -> 0x0173, all -> 0x0171 }
                r2.<init>(r14, r1, r3)     // Catch:{ Exception -> 0x0173, all -> 0x0171 }
                r6 = r2
            L_0x013e:
                com.bytedance.retrofit2.a.d r7 = new com.bytedance.retrofit2.a.d     // Catch:{ Exception -> 0x0173, all -> 0x0171 }
                java.net.HttpURLConnection r1 = r15.f26879a     // Catch:{ Exception -> 0x0173, all -> 0x0171 }
                java.lang.String r4 = r1.getResponseMessage()     // Catch:{ Exception -> 0x0173, all -> 0x0171 }
                java.net.HttpURLConnection r1 = r15.f26879a     // Catch:{ Exception -> 0x0173, all -> 0x0171 }
                java.util.List r5 = m19780a(r1)     // Catch:{ Exception -> 0x0173, all -> 0x0171 }
                r1 = r7
                r2 = r0
                r3 = r13
                r1.<init>(r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x0173, all -> 0x0171 }
                com.bytedance.frameworks.baselib.network.http.a r1 = r15.f26880b     // Catch:{ Exception -> 0x0173, all -> 0x0171 }
                r7.f33351f = r1     // Catch:{ Exception -> 0x0173, all -> 0x0171 }
                com.bytedance.retrofit2.a.c r0 = r15.f26883e
                boolean r0 = r0.f33326g
                if (r0 != 0) goto L_0x0161
                java.net.HttpURLConnection r0 = r15.f26879a
                com.bytedance.frameworks.baselib.network.http.cronet.p572a.C9874c.m19766a(r0)
            L_0x0161:
                com.bytedance.retrofit2.a.c r0 = r15.f26883e
                boolean r0 = r0.f33326g
                if (r0 != 0) goto L_0x0170
                if (r12 == 0) goto L_0x0170
                com.bytedance.frameworks.baselib.network.a.e r0 = com.bytedance.frameworks.baselib.network.p566a.C9815e.m19643b()
                r0.mo17655d()
            L_0x0170:
                return r7
            L_0x0171:
                r0 = move-exception
                goto L_0x01ba
            L_0x0173:
                r1 = move-exception
                r9 = r1
                r11 = r12
                goto L_0x017c
            L_0x0177:
                r0 = move-exception
                r12 = 0
                goto L_0x01ba
            L_0x017a:
                r1 = move-exception
                r9 = r1
            L_0x017c:
                boolean r1 = r9 instanceof com.bytedance.frameworks.baselib.network.http.p568a.C9836c     // Catch:{ all -> 0x01b7 }
                if (r1 == 0) goto L_0x018d
                r1 = r9
                com.bytedance.frameworks.baselib.network.http.a.c r1 = (com.bytedance.frameworks.baselib.network.http.p568a.C9836c) r1     // Catch:{ all -> 0x01b7 }
                int r2 = r1.getStatusCode()     // Catch:{ all -> 0x01b7 }
                r3 = 304(0x130, float:4.26E-43)
                if (r2 == r3) goto L_0x018c
                goto L_0x018d
            L_0x018c:
                throw r1     // Catch:{ all -> 0x01b7 }
            L_0x018d:
                boolean r1 = r9 instanceof java.io.IOException     // Catch:{ all -> 0x01b7 }
                if (r1 == 0) goto L_0x019e
                java.lang.String r1 = "request canceled"
                java.lang.String r2 = r9.getMessage()     // Catch:{ all -> 0x01b7 }
                boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x01b7 }
                if (r1 == 0) goto L_0x019e
                throw r9     // Catch:{ all -> 0x01b7 }
            L_0x019e:
                long r2 = r15.f26881c     // Catch:{ all -> 0x01b7 }
                com.bytedance.frameworks.baselib.network.http.a r4 = r15.f26880b     // Catch:{ all -> 0x01b7 }
                java.lang.String r5 = r15.f26882d     // Catch:{ all -> 0x01b7 }
                java.net.HttpURLConnection r7 = r15.f26879a     // Catch:{ all -> 0x01b7 }
                com.bytedance.retrofit2.s r8 = r15.f26886h     // Catch:{ all -> 0x01b7 }
                r1 = r0
                r6 = r9
                com.bytedance.frameworks.baselib.network.http.cronet.p572a.C9874c.m19764a(r1, r2, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x01b7 }
                com.bytedance.frameworks.baselib.network.http.cronet.a.a r0 = new com.bytedance.frameworks.baselib.network.http.cronet.a.a     // Catch:{ all -> 0x01b7 }
                com.bytedance.frameworks.baselib.network.http.a r1 = r15.f26880b     // Catch:{ all -> 0x01b7 }
                java.lang.String r2 = r15.f26882d     // Catch:{ all -> 0x01b7 }
                r0.<init>(r9, r1, r2)     // Catch:{ all -> 0x01b7 }
                throw r0     // Catch:{ all -> 0x01b7 }
            L_0x01b7:
                r0 = move-exception
                r12 = r11
                r11 = 1
            L_0x01ba:
                com.bytedance.retrofit2.a.c r1 = r15.f26883e
                boolean r1 = r1.f33326g
                if (r1 == 0) goto L_0x01c2
                if (r11 == 0) goto L_0x01c7
            L_0x01c2:
                java.net.HttpURLConnection r1 = r15.f26879a
                com.bytedance.frameworks.baselib.network.http.cronet.p572a.C9874c.m19766a(r1)
            L_0x01c7:
                com.bytedance.retrofit2.a.c r1 = r15.f26883e
                boolean r1 = r1.f33326g
                if (r1 != 0) goto L_0x01d6
                if (r12 == 0) goto L_0x01d6
                com.bytedance.frameworks.baselib.network.a.e r1 = com.bytedance.frameworks.baselib.network.p566a.C9815e.m19643b()
                r1.mo17655d()
            L_0x01d6:
                throw r0
            L_0x01d7:
                java.io.IOException r0 = new java.io.IOException
                java.lang.String r1 = "request canceled"
                r0.<init>(r1)
                throw r0
            L_0x01df:
                com.bytedance.frameworks.baselib.network.http.a.g r0 = new com.bytedance.frameworks.baselib.network.http.a.g
                java.lang.String r1 = "request is not allowed using network"
                r0.<init>(r1)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.baselib.network.http.cronet.p572a.C9874c.C9875a.mo9559a():com.bytedance.retrofit2.a.d");
        }

        /* renamed from: a */
        private static List<C12685b> m19780a(HttpURLConnection httpURLConnection) {
            if (httpURLConnection == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (Entry entry : httpURLConnection.getHeaderFields().entrySet()) {
                String str = (String) entry.getKey();
                for (String bVar : (List) entry.getValue()) {
                    arrayList.add(new C12685b(str, bVar));
                }
            }
            return arrayList;
        }

        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0080 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:32:0x0140 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x016b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:44:0x018e */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x0086 A[Catch:{ Exception -> 0x01a3 }] */
        /* JADX WARNING: Removed duplicated region for block: B:42:0x0173 A[SYNTHETIC, Splitter:B:42:0x0173] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C9875a(com.bytedance.retrofit2.p830a.C12686c r14) throws java.io.IOException {
            /*
                r13 = this;
                r13.<init>()
                com.bytedance.frameworks.baselib.network.http.a r0 = com.bytedance.frameworks.baselib.network.http.C9831a.m19674a()
                r13.f26880b = r0
                r0 = 0
                r13.f26881c = r0
                r2 = 0
                r13.f26882d = r2
                r3 = 0
                r13.f26884f = r3
                r13.f26885g = r3
                r13.f26886h = r2
                r13.f26883e = r14
                com.bytedance.retrofit2.a.c r4 = r13.f26883e
                java.lang.String r5 = r4.f33321b
                r13.f26879a = r2
                com.bytedance.retrofit2.s r2 = r14.f33332m
                r13.f26886h = r2
                com.bytedance.retrofit2.s r2 = r13.f26886h
                if (r2 == 0) goto L_0x0037
                com.bytedance.frameworks.baselib.network.http.a r2 = r13.f26880b
                com.bytedance.retrofit2.s r4 = r13.f26886h
                long r6 = r4.f33470c
                r2.f26753c = r6
                com.bytedance.frameworks.baselib.network.http.a r2 = r13.f26880b
                com.bytedance.retrofit2.s r4 = r13.f26886h
                long r6 = r4.f33471d
                r2.f26754d = r6
            L_0x0037:
                long r6 = java.lang.System.currentTimeMillis()
                r13.f26881c = r6
                com.bytedance.frameworks.baselib.network.http.a r2 = r13.f26880b
                long r6 = r13.f26881c
                r2.f26755e = r6
                com.bytedance.frameworks.baselib.network.http.a r2 = r13.f26880b
                r2.f26772v = r3
                com.bytedance.retrofit2.a.c r2 = r13.f26883e
                boolean r2 = r2.f33326g
                r4 = 1
                if (r2 == 0) goto L_0x0053
                com.bytedance.frameworks.baselib.network.http.a r2 = r13.f26880b
                r2.f26776z = r4
                goto L_0x0057
            L_0x0053:
                com.bytedance.frameworks.baselib.network.http.a r2 = r13.f26880b
                r2.f26776z = r3
            L_0x0057:
                java.net.HttpURLConnection r2 = com.bytedance.frameworks.baselib.network.http.cronet.p572a.C9874c.m19759a(r5)     // Catch:{ Exception -> 0x01a3 }
                r13.f26879a = r2     // Catch:{ Exception -> 0x01a3 }
                int r2 = com.bytedance.frameworks.baselib.network.http.cronet.p572a.C9874c.f26874d     // Catch:{ Exception -> 0x01a3 }
                boolean r2 = com.bytedance.frameworks.baselib.network.http.cronet.p572a.C9874c.m19770a(r2)     // Catch:{ Exception -> 0x01a3 }
                if (r2 == 0) goto L_0x0080
                java.net.HttpURLConnection r2 = r13.f26879a     // Catch:{ Throwable -> 0x0080 }
                com.bytedance.common.utility.f.b r2 = com.bytedance.common.utility.p526f.C9409b.m18609a(r2)     // Catch:{ Throwable -> 0x0080 }
                java.lang.String r6 = "setInputStreamBufferSize"
                java.lang.Class[] r7 = new java.lang.Class[r4]     // Catch:{ Throwable -> 0x0080 }
                java.lang.Class r8 = java.lang.Integer.TYPE     // Catch:{ Throwable -> 0x0080 }
                r7[r3] = r8     // Catch:{ Throwable -> 0x0080 }
                java.lang.Object[] r8 = new java.lang.Object[r4]     // Catch:{ Throwable -> 0x0080 }
                int r9 = com.bytedance.frameworks.baselib.network.http.cronet.p572a.C9874c.f26874d     // Catch:{ Throwable -> 0x0080 }
                java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ Throwable -> 0x0080 }
                r8[r3] = r9     // Catch:{ Throwable -> 0x0080 }
                r2.mo17052a(r6, (java.lang.Class<?>[]) r7, r8)     // Catch:{ Throwable -> 0x0080 }
            L_0x0080:
                java.lang.Object r2 = r14.f33329j     // Catch:{ Exception -> 0x01a3 }
                boolean r2 = r2 instanceof com.bytedance.frameworks.baselib.network.http.C9841b     // Catch:{ Exception -> 0x01a3 }
                if (r2 == 0) goto L_0x018e
                com.bytedance.frameworks.baselib.network.http.a r2 = r13.f26880b     // Catch:{ Exception -> 0x01a3 }
                java.lang.Object r6 = r14.f33329j     // Catch:{ Exception -> 0x01a3 }
                com.bytedance.frameworks.baselib.network.http.b r6 = (com.bytedance.frameworks.baselib.network.http.C9841b) r6     // Catch:{ Exception -> 0x01a3 }
                r2.f26752b = r6     // Catch:{ Exception -> 0x01a3 }
                com.bytedance.frameworks.baselib.network.http.a r2 = r13.f26880b     // Catch:{ Exception -> 0x01a3 }
                T r2 = r2.f26752b     // Catch:{ Exception -> 0x01a3 }
                long r6 = r2.f26780c     // Catch:{ Exception -> 0x01a3 }
                int r8 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
                if (r8 <= 0) goto L_0x00a0
                java.net.HttpURLConnection r6 = r13.f26879a     // Catch:{ Exception -> 0x01a3 }
                long r7 = r2.f26780c     // Catch:{ Exception -> 0x01a3 }
                int r7 = (int) r7     // Catch:{ Exception -> 0x01a3 }
                r6.setConnectTimeout(r7)     // Catch:{ Exception -> 0x01a3 }
            L_0x00a0:
                long r6 = r2.f26781d     // Catch:{ Exception -> 0x01a3 }
                int r8 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
                if (r8 <= 0) goto L_0x00ae
                java.net.HttpURLConnection r6 = r13.f26879a     // Catch:{ Exception -> 0x01a3 }
                long r7 = r2.f26781d     // Catch:{ Exception -> 0x01a3 }
                int r7 = (int) r7     // Catch:{ Exception -> 0x01a3 }
                r6.setReadTimeout(r7)     // Catch:{ Exception -> 0x01a3 }
            L_0x00ae:
                long r6 = r2.f26786i     // Catch:{ Exception -> 0x01a3 }
                int r8 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
                if (r8 <= 0) goto L_0x0140
                java.net.HttpURLConnection r6 = r13.f26879a     // Catch:{ Throwable -> 0x0140 }
                com.bytedance.common.utility.f.b r6 = com.bytedance.common.utility.p526f.C9409b.m18609a(r6)     // Catch:{ Throwable -> 0x0140 }
                java.lang.String r7 = "setRequestTimeout"
                java.lang.Class[] r8 = new java.lang.Class[r4]     // Catch:{ Throwable -> 0x0140 }
                java.lang.Class r9 = java.lang.Integer.TYPE     // Catch:{ Throwable -> 0x0140 }
                r8[r3] = r9     // Catch:{ Throwable -> 0x0140 }
                java.lang.Object[] r9 = new java.lang.Object[r4]     // Catch:{ Throwable -> 0x0140 }
                long r10 = r2.f26786i     // Catch:{ Throwable -> 0x0140 }
                int r10 = (int) r10     // Catch:{ Throwable -> 0x0140 }
                java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ Throwable -> 0x0140 }
                r9[r3] = r10     // Catch:{ Throwable -> 0x0140 }
                r6.mo17052a(r7, (java.lang.Class<?>[]) r8, r9)     // Catch:{ Throwable -> 0x0140 }
                java.net.HttpURLConnection r6 = r13.f26879a     // Catch:{ Throwable -> 0x0140 }
                r6.setConnectTimeout(r3)     // Catch:{ Throwable -> 0x0140 }
                java.net.HttpURLConnection r6 = r13.f26879a     // Catch:{ Throwable -> 0x0140 }
                r6.setReadTimeout(r3)     // Catch:{ Throwable -> 0x0140 }
                long r6 = r2.f26783f     // Catch:{ Throwable -> 0x0140 }
                int r8 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
                if (r8 > 0) goto L_0x00ec
                long r6 = r2.f26785h     // Catch:{ Throwable -> 0x0140 }
                int r8 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
                if (r8 > 0) goto L_0x00ec
                long r6 = r2.f26784g     // Catch:{ Throwable -> 0x0140 }
                int r8 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
                if (r8 <= 0) goto L_0x0140
            L_0x00ec:
                java.net.HttpURLConnection r0 = r13.f26879a     // Catch:{ Throwable -> 0x0140 }
                com.bytedance.common.utility.f.b r0 = com.bytedance.common.utility.p526f.C9409b.m18609a(r0)     // Catch:{ Throwable -> 0x0140 }
                java.lang.String r1 = "setSocketConnectTimeout"
                java.lang.Class[] r6 = new java.lang.Class[r4]     // Catch:{ Throwable -> 0x0140 }
                java.lang.Class r7 = java.lang.Integer.TYPE     // Catch:{ Throwable -> 0x0140 }
                r6[r3] = r7     // Catch:{ Throwable -> 0x0140 }
                java.lang.Object[] r7 = new java.lang.Object[r4]     // Catch:{ Throwable -> 0x0140 }
                long r8 = r2.f26783f     // Catch:{ Throwable -> 0x0140 }
                int r8 = (int) r8     // Catch:{ Throwable -> 0x0140 }
                java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ Throwable -> 0x0140 }
                r7[r3] = r8     // Catch:{ Throwable -> 0x0140 }
                r0.mo17052a(r1, (java.lang.Class<?>[]) r6, r7)     // Catch:{ Throwable -> 0x0140 }
                java.net.HttpURLConnection r0 = r13.f26879a     // Catch:{ Throwable -> 0x0140 }
                com.bytedance.common.utility.f.b r0 = com.bytedance.common.utility.p526f.C9409b.m18609a(r0)     // Catch:{ Throwable -> 0x0140 }
                java.lang.String r1 = "setSocketReadTimeout"
                java.lang.Class[] r6 = new java.lang.Class[r4]     // Catch:{ Throwable -> 0x0140 }
                java.lang.Class r7 = java.lang.Integer.TYPE     // Catch:{ Throwable -> 0x0140 }
                r6[r3] = r7     // Catch:{ Throwable -> 0x0140 }
                java.lang.Object[] r7 = new java.lang.Object[r4]     // Catch:{ Throwable -> 0x0140 }
                long r8 = r2.f26785h     // Catch:{ Throwable -> 0x0140 }
                int r8 = (int) r8     // Catch:{ Throwable -> 0x0140 }
                java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ Throwable -> 0x0140 }
                r7[r3] = r8     // Catch:{ Throwable -> 0x0140 }
                r0.mo17052a(r1, (java.lang.Class<?>[]) r6, r7)     // Catch:{ Throwable -> 0x0140 }
                java.net.HttpURLConnection r0 = r13.f26879a     // Catch:{ Throwable -> 0x0140 }
                com.bytedance.common.utility.f.b r0 = com.bytedance.common.utility.p526f.C9409b.m18609a(r0)     // Catch:{ Throwable -> 0x0140 }
                java.lang.String r1 = "setSocketWriteTimeout"
                java.lang.Class[] r6 = new java.lang.Class[r4]     // Catch:{ Throwable -> 0x0140 }
                java.lang.Class r7 = java.lang.Integer.TYPE     // Catch:{ Throwable -> 0x0140 }
                r6[r3] = r7     // Catch:{ Throwable -> 0x0140 }
                java.lang.Object[] r7 = new java.lang.Object[r4]     // Catch:{ Throwable -> 0x0140 }
                long r8 = r2.f26784g     // Catch:{ Throwable -> 0x0140 }
                int r8 = (int) r8     // Catch:{ Throwable -> 0x0140 }
                java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ Throwable -> 0x0140 }
                r7[r3] = r8     // Catch:{ Throwable -> 0x0140 }
                r0.mo17052a(r1, (java.lang.Class<?>[]) r6, r7)     // Catch:{ Throwable -> 0x0140 }
            L_0x0140:
                int r0 = com.bytedance.frameworks.baselib.network.http.cronet.p572a.C9874c.f26874d     // Catch:{ Exception -> 0x01a3 }
                boolean r0 = com.bytedance.frameworks.baselib.network.http.cronet.p572a.C9874c.m19770a(r0)     // Catch:{ Exception -> 0x01a3 }
                if (r0 != 0) goto L_0x016b
                int r0 = r2.f26788k     // Catch:{ Exception -> 0x01a3 }
                boolean r0 = com.bytedance.frameworks.baselib.network.http.cronet.p572a.C9874c.m19770a(r0)     // Catch:{ Exception -> 0x01a3 }
                if (r0 == 0) goto L_0x016b
                java.net.HttpURLConnection r0 = r13.f26879a     // Catch:{ Throwable -> 0x016b }
                com.bytedance.common.utility.f.b r0 = com.bytedance.common.utility.p526f.C9409b.m18609a(r0)     // Catch:{ Throwable -> 0x016b }
                java.lang.String r1 = "setInputStreamBufferSize"
                java.lang.Class[] r6 = new java.lang.Class[r4]     // Catch:{ Throwable -> 0x016b }
                java.lang.Class r7 = java.lang.Integer.TYPE     // Catch:{ Throwable -> 0x016b }
                r6[r3] = r7     // Catch:{ Throwable -> 0x016b }
                java.lang.Object[] r7 = new java.lang.Object[r4]     // Catch:{ Throwable -> 0x016b }
                int r8 = r2.f26788k     // Catch:{ Throwable -> 0x016b }
                java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ Throwable -> 0x016b }
                r7[r3] = r8     // Catch:{ Throwable -> 0x016b }
                r0.mo17052a(r1, (java.lang.Class<?>[]) r6, r7)     // Catch:{ Throwable -> 0x016b }
            L_0x016b:
                boolean r0 = r2.f26787j     // Catch:{ Exception -> 0x01a3 }
                r13.f26885g = r0     // Catch:{ Exception -> 0x01a3 }
                int r0 = r2.f26789l     // Catch:{ Exception -> 0x01a3 }
                if (r0 <= 0) goto L_0x018e
                java.net.HttpURLConnection r0 = r13.f26879a     // Catch:{ Throwable -> 0x018e }
                com.bytedance.common.utility.f.b r0 = com.bytedance.common.utility.p526f.C9409b.m18609a(r0)     // Catch:{ Throwable -> 0x018e }
                java.lang.String r1 = "setRequestFlag"
                java.lang.Class[] r6 = new java.lang.Class[r4]     // Catch:{ Throwable -> 0x018e }
                java.lang.Class r7 = java.lang.Integer.TYPE     // Catch:{ Throwable -> 0x018e }
                r6[r3] = r7     // Catch:{ Throwable -> 0x018e }
                java.lang.Object[] r7 = new java.lang.Object[r4]     // Catch:{ Throwable -> 0x018e }
                int r2 = r2.f26789l     // Catch:{ Throwable -> 0x018e }
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ Throwable -> 0x018e }
                r7[r3] = r2     // Catch:{ Throwable -> 0x018e }
                r0.mo17052a(r1, (java.lang.Class<?>[]) r6, r7)     // Catch:{ Throwable -> 0x018e }
            L_0x018e:
                java.net.HttpURLConnection r0 = r13.f26879a     // Catch:{ Exception -> 0x01a3 }
                r0.setInstanceFollowRedirects(r4)     // Catch:{ Exception -> 0x01a3 }
                java.net.HttpURLConnection r0 = r13.f26879a     // Catch:{ Exception -> 0x01a3 }
                com.bytedance.frameworks.baselib.network.http.cronet.p572a.C9874c.m19768a(r0, r14)     // Catch:{ Exception -> 0x01a3 }
                com.bytedance.frameworks.baselib.network.http.a r14 = r13.f26880b     // Catch:{ Exception -> 0x01a3 }
                java.net.HttpURLConnection r0 = r13.f26879a     // Catch:{ Exception -> 0x01a3 }
                org.json.JSONObject r0 = com.bytedance.frameworks.baselib.network.http.cronet.p572a.C9874c.m19772b(r0)     // Catch:{ Exception -> 0x01a3 }
                r14.f26775y = r0     // Catch:{ Exception -> 0x01a3 }
                return
            L_0x01a3:
                r14 = move-exception
                long r6 = r13.f26881c
                com.bytedance.frameworks.baselib.network.http.a r8 = r13.f26880b
                java.lang.String r9 = r13.f26882d
                java.net.HttpURLConnection r11 = r13.f26879a
                com.bytedance.retrofit2.s r12 = r13.f26886h
                r10 = r14
                com.bytedance.frameworks.baselib.network.http.cronet.p572a.C9874c.m19764a(r5, r6, r8, r9, r10, r11, r12)
                r13.f26884f = r4
                boolean r0 = r14 instanceof java.io.IOException
                if (r0 == 0) goto L_0x01bb
                java.io.IOException r14 = (java.io.IOException) r14
                throw r14
            L_0x01bb:
                java.io.IOException r0 = new java.io.IOException
                java.lang.String r1 = r14.getMessage()
                java.lang.Throwable r14 = r14.getCause()
                r0.<init>(r1, r14)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.baselib.network.http.cronet.p572a.C9874c.C9875a.<init>(com.bytedance.retrofit2.a.c):void");
        }
    }

    /* renamed from: com.bytedance.frameworks.baselib.network.http.cronet.a.c$b */
    public interface C9877b {
        /* renamed from: a */
        boolean mo17792a();
    }

    /* renamed from: com.bytedance.frameworks.baselib.network.http.cronet.a.c$c */
    public interface C9878c {
        /* renamed from: b */
        boolean mo17793b();
    }

    /* renamed from: a */
    public static boolean m19770a(int i) {
        return i >= 8192 && i <= 20971520;
    }

    /* renamed from: a */
    public final void mo17789a(Map<String, ?> map) {
        if (map != null) {
            m19775b(map);
        }
    }

    /* renamed from: a */
    public final void mo17790a(boolean z, boolean z2, boolean z3, boolean z4) {
        m19773b();
        if (f26872b != null) {
            f26872b.setCronetBootFailureChecker(this);
            f26872b.setCronetEngine(f26871a, false, false, false, z4, C9894e.m19832f(), new C9919a());
        }
    }

    /* renamed from: a */
    public final C12689e mo9561a(C12686c cVar) throws IOException {
        return new C9875a(cVar);
    }

    /* renamed from: a */
    private static void m19765a(String str, C9831a aVar) {
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

    /* renamed from: a */
    static void m19768a(HttpURLConnection httpURLConnection, C12686c cVar) throws IOException {
        httpURLConnection.setRequestMethod(cVar.f33320a);
        httpURLConnection.setDoInput(true);
        boolean z = false;
        for (C12685b bVar : cVar.f33322c) {
            if (!C9431p.m18664a(bVar.f33318a) && !C9431p.m18664a(bVar.f33319b)) {
                if ("User-Agent".equalsIgnoreCase(bVar.f33318a)) {
                    z = true;
                }
                C9880e.m19788a(httpURLConnection, bVar.f33318a, bVar.f33319b);
            }
        }
        if (!z) {
            String f = C9894e.m19832f();
            if (!C9431p.m18664a(f)) {
                if (f26872b != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(f);
                    sb.append(" cronet/");
                    sb.append(f26872b.getCronetVersion());
                    f = sb.toString();
                }
                C9880e.m19788a(httpURLConnection, "User-Agent", f);
            }
        }
        TypedOutput a = cVar.mo23857a();
        if (a != null) {
            httpURLConnection.setDoOutput(true);
            C9880e.m19788a(httpURLConnection, "Content-Type", a.mimeType());
            String md5Stub = a.md5Stub();
            if (md5Stub != null) {
                C9880e.m19788a(httpURLConnection, "X-SS-STUB", md5Stub);
            }
            long length = a.length();
            if (length != -1) {
                httpURLConnection.setFixedLengthStreamingMode((int) length);
                C9880e.m19788a(httpURLConnection, "Content-Length", String.valueOf(length));
                return;
            }
            httpURLConnection.setChunkedStreamingMode(4096);
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00b8, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        r2 = r17.getErrorStream();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00c2, code lost:
        r2 = new java.lang.StringBuilder("reason = ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00c9, code lost:
        if (r1 == null) goto L_0x00cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00cb, code lost:
        r1 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00cd, code lost:
        r2.append(r1);
        r2.append("  exception = ");
        r2.append(r0.getMessage());
        r1 = r2.toString();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x00ba */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] m19771a(java.lang.String r15, int r16, java.net.HttpURLConnection r17, long r18, com.bytedance.frameworks.baselib.network.http.C9831a r20, java.lang.String r21, int r22, com.bytedance.retrofit2.C12796s r23) throws java.io.IOException {
        /*
            r0 = r15
            r8 = r16
            r9 = r17
            r7 = r20
            r10 = r22
            r1 = r23
            r2 = 0
            if (r9 != 0) goto L_0x0011
            byte[] r0 = new byte[r2]
            return r0
        L_0x0011:
            java.lang.String r5 = "gzip"
            java.lang.String r6 = "Content-Encoding"
            java.lang.String r6 = m19758a(r9, r6)
            boolean r5 = r5.equals(r6)
            com.bytedance.frameworks.baselib.network.http.cronet.ICronetClient r6 = f26872b
            if (r6 == 0) goto L_0x002b
            com.bytedance.frameworks.baselib.network.http.cronet.ICronetClient r6 = f26872b
            boolean r6 = r6.isCronetHttpURLConnection(r9)
            if (r6 == 0) goto L_0x002b
            r11 = 0
            goto L_0x002c
        L_0x002b:
            r11 = r5
        L_0x002c:
            java.lang.String r5 = "Content-Type"
            java.lang.String r12 = m19758a(r9, r5)
            r5 = 200(0xc8, float:2.8E-43)
            if (r10 != r5) goto L_0x0088
            long r5 = java.lang.System.currentTimeMillis()
            r7.f26757g = r5
            java.io.InputStream r5 = com.bytedance.frameworks.baselib.network.http.cronet.p572a.C9880e.m19787a(r17)
            r6 = 1
            int[] r6 = new int[r6]
            r6[r2] = r2     // Catch:{ all -> 0x0083 }
            byte[] r8 = com.bytedance.frameworks.baselib.network.http.p573d.C9893d.m19810a(r11, r8, r5, r6)     // Catch:{ all -> 0x0083 }
            com.bytedance.frameworks.baselib.network.http.p573d.C9893d.m19804a(r5)
            r5 = r6[r2]
            byte[] r10 = new byte[r5]
            if (r8 == 0) goto L_0x005b
            r5 = r6[r2]
            if (r5 <= 0) goto L_0x005b
            r5 = r6[r2]
            java.lang.System.arraycopy(r8, r2, r10, r2, r5)
        L_0x005b:
            boolean r2 = com.bytedance.frameworks.baselib.network.http.p573d.C9893d.m19809a(r12)
            if (r2 == 0) goto L_0x0065
            int r2 = r10.length
            com.bytedance.frameworks.baselib.network.http.p573d.C9893d.m19806a(r10, r2)
        L_0x0065:
            long r5 = java.lang.System.currentTimeMillis()
            long r5 = r5 - r18
            long r11 = java.lang.System.currentTimeMillis()
            r7.f26758h = r11
            m19767a(r9, r7, r1)
            com.bytedance.frameworks.baselib.network.http.C9894e.m19823a(r15, r5, r7)
            r1 = r5
            r3 = r18
            r5 = r15
            r6 = r21
            r7 = r20
            com.bytedance.frameworks.baselib.network.http.C9894e.m19818a(r1, r3, r5, r6, r7)
            return r10
        L_0x0083:
            r0 = move-exception
            com.bytedance.frameworks.baselib.network.http.p573d.C9893d.m19804a(r5)
            throw r0
        L_0x0088:
            r2 = 304(0x130, float:4.26E-43)
            if (r10 != r2) goto L_0x00af
            long r5 = java.lang.System.currentTimeMillis()
            r7.f26757g = r5
            long r5 = java.lang.System.currentTimeMillis()
            long r5 = r5 - r18
            long r13 = java.lang.System.currentTimeMillis()
            r7.f26758h = r13
            m19767a(r9, r7, r1)
            com.bytedance.frameworks.baselib.network.http.C9894e.m19823a(r15, r5, r7)
            r1 = r5
            r3 = r18
            r5 = r15
            r6 = r21
            r7 = r20
            com.bytedance.frameworks.baselib.network.http.C9894e.m19818a(r1, r3, r5, r6, r7)
        L_0x00af:
            java.lang.String r1 = r17.getResponseMessage()
            java.io.InputStream r2 = com.bytedance.frameworks.baselib.network.http.cronet.p572a.C9880e.m19787a(r17)     // Catch:{ Exception -> 0x00ba }
            goto L_0x00be
        L_0x00b8:
            r0 = move-exception
            goto L_0x00c2
        L_0x00ba:
            java.io.InputStream r2 = r17.getErrorStream()     // Catch:{ Throwable -> 0x00b8 }
        L_0x00be:
            m19769a(r11, r8, r2, r12, r15)     // Catch:{ Throwable -> 0x00b8 }
            goto L_0x00e0
        L_0x00c2:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "reason = "
            r2.<init>(r3)
            if (r1 != 0) goto L_0x00cd
            java.lang.String r1 = ""
        L_0x00cd:
            r2.append(r1)
            java.lang.String r1 = "  exception = "
            r2.append(r1)
            java.lang.String r0 = r0.getMessage()
            r2.append(r0)
            java.lang.String r1 = r2.toString()
        L_0x00e0:
            if (r9 == 0) goto L_0x00e5
            r17.disconnect()
        L_0x00e5:
            com.bytedance.frameworks.baselib.network.http.a.c r0 = new com.bytedance.frameworks.baselib.network.http.a.c
            r0.<init>(r10, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.baselib.network.http.cronet.p572a.C9874c.m19771a(java.lang.String, int, java.net.HttpURLConnection, long, com.bytedance.frameworks.baselib.network.http.a, java.lang.String, int, com.bytedance.retrofit2.s):byte[]");
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public static void m19769a(boolean z, int i, InputStream inputStream, String str, String str2) throws IOException {
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
                            String parameter = aVar.getParameter("charset");
                            if (C9431p.m18664a(parameter)) {
                                parameter = "utf-8";
                            }
                            StringBuilder sb = new StringBuilder(" response body = ");
                            sb.append(new String(bArr, parameter));
                            sb.append(" for url = ");
                            if (str2 == null) {
                                str2 = "";
                            }
                            sb.append(str2);
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

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002f */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x004b A[Catch:{ Throwable -> 0x004e }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x007d  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m19764a(java.lang.String r11, long r12, com.bytedance.frameworks.baselib.network.http.C9831a r14, java.lang.String r15, java.lang.Exception r16, java.net.HttpURLConnection r17, com.bytedance.retrofit2.C12796s r18) {
        /*
            r4 = r11
            r6 = r14
            r8 = r17
            if (r4 != 0) goto L_0x0007
            return
        L_0x0007:
            if (r6 == 0) goto L_0x0013
            org.json.JSONObject r0 = r6.f26775y     // Catch:{ Throwable -> 0x002f }
            if (r0 != 0) goto L_0x0013
            org.json.JSONObject r0 = m19772b(r17)     // Catch:{ Throwable -> 0x002f }
            r6.f26775y = r0     // Catch:{ Throwable -> 0x002f }
        L_0x0013:
            org.json.JSONObject r0 = r6.f26775y     // Catch:{ Throwable -> 0x002f }
            java.lang.String r1 = "ex"
            java.lang.String r2 = r16.getMessage()     // Catch:{ Throwable -> 0x002f }
            r0.put(r1, r2)     // Catch:{ Throwable -> 0x002f }
            java.lang.String r0 = m19776c(r17)     // Catch:{ Throwable -> 0x002f }
            boolean r1 = com.bytedance.common.utility.C9431p.m18664a(r0)     // Catch:{ Throwable -> 0x002f }
            if (r1 != 0) goto L_0x002f
            org.json.JSONObject r1 = r6.f26775y     // Catch:{ Throwable -> 0x002f }
            java.lang.String r2 = "response-headers"
            r1.put(r2, r0)     // Catch:{ Throwable -> 0x002f }
        L_0x002f:
            int r0 = r17.getResponseCode()     // Catch:{ Throwable -> 0x004e }
            java.lang.String r1 = "tko"
            java.lang.String r1 = r8.getHeaderField(r1)     // Catch:{ Throwable -> 0x004e }
            r2 = 498(0x1f2, float:6.98E-43)
            if (r0 != r2) goto L_0x004e
            java.lang.String r0 = "1"
            boolean r0 = r0.equals(r1)     // Catch:{ Throwable -> 0x004e }
            if (r0 == 0) goto L_0x004e
            com.bytedance.frameworks.baselib.network.http.e$i r0 = com.bytedance.frameworks.baselib.network.http.C9894e.m19812a()     // Catch:{ Throwable -> 0x004e }
            if (r0 == 0) goto L_0x004e
            r0.mo17836b()     // Catch:{ Throwable -> 0x004e }
        L_0x004e:
            if (r6 == 0) goto L_0x005f
            java.lang.String r0 = r6.f26751a
            boolean r0 = com.bytedance.common.utility.C9431p.m18664a(r0)
            if (r0 == 0) goto L_0x005f
            java.lang.String r0 = m19756a(r16)
            m19765a(r0, r14)
        L_0x005f:
            long r0 = java.lang.System.currentTimeMillis()
            long r0 = r0 - r12
            long r9 = java.lang.System.currentTimeMillis()
            r6.f26758h = r9
            r5 = r18
            m19767a(r8, r14, r5)
            r7 = r16
            com.bytedance.frameworks.baselib.network.http.C9894e.m19825a(r11, r7, r0, r14)
            r2 = r12
            r4 = r11
            r5 = r15
            r6 = r14
            com.bytedance.frameworks.baselib.network.http.C9894e.m19819a(r0, r2, r4, r5, r6, r7)
            if (r8 == 0) goto L_0x0080
            r17.disconnect()
        L_0x0080:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.baselib.network.http.cronet.p572a.C9874c.m19764a(java.lang.String, long, com.bytedance.frameworks.baselib.network.http.a, java.lang.String, java.lang.Exception, java.net.HttpURLConnection, com.bytedance.retrofit2.s):void");
    }

    /* renamed from: a */
    public static void m19766a(HttpURLConnection httpURLConnection) {
        if (!(httpURLConnection == null || httpURLConnection == null)) {
            httpURLConnection.disconnect();
        }
    }

    /* renamed from: a */
    public static void m19767a(HttpURLConnection httpURLConnection, C9831a aVar, C12796s sVar) {
        String str;
        String str2;
        m19774b(httpURLConnection, aVar, sVar);
        if (httpURLConnection != null && aVar != null && (aVar instanceof C37775g)) {
            try {
                C37775g gVar = (C37775g) aVar;
                if (httpURLConnection == null) {
                    str = "";
                } else {
                    str = httpURLConnection.getHeaderField("Bd-Tt-Error-Code");
                    if (TextUtils.isEmpty(str)) {
                        str = httpURLConnection.getHeaderField("bd-tt-error-code");
                        if (TextUtils.isEmpty(str)) {
                            str = httpURLConnection.getHeaderField("BD-TT-ERROR-CODE");
                        }
                    }
                }
                gVar.f96240E = str;
                C37775g gVar2 = (C37775g) aVar;
                if (httpURLConnection == null) {
                    str2 = "";
                } else {
                    String headerField = httpURLConnection.getHeaderField("X-Tt-Logid");
                    if (TextUtils.isEmpty(headerField)) {
                        headerField = httpURLConnection.getHeaderField("x-tt-logid");
                        if (TextUtils.isEmpty(headerField)) {
                            str2 = httpURLConnection.getHeaderField("X-TT-LOGID");
                        }
                    }
                    str2 = headerField;
                }
                gVar2.f96241F = str2;
            } catch (Throwable unused) {
            }
        }
    }

    public boolean isCronetBootFailureExpected() {
        if (f26877g == null) {
            return false;
        }
        return f26877g.mo17792a();
    }

    /* renamed from: b */
    private static void m19773b() {
        if (f26872b == null) {
            String str = "org.chromium.CronetClient";
            if (!C9431p.m18664a(f26875e)) {
                str = f26875e;
            }
            try {
                Object newInstance = Class.forName(str).newInstance();
                if (newInstance instanceof ICronetClient) {
                    f26872b = (ICronetClient) newInstance;
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m19760a() {
        if (f26872b == null) {
            throw new UnsupportedOperationException("CronetEngine is not created.");
        }
    }

    /* renamed from: a */
    public static void m19762a(C9877b bVar) {
        f26877g = bVar;
    }

    /* renamed from: a */
    public static void m19763a(C9878c cVar) {
        f26878h = cVar;
    }

    private C9874c(Context context) {
        f26871a = context.getApplicationContext();
    }

    /* renamed from: a */
    public static C9874c m19754a(Context context) {
        if (f26876f == null) {
            synchronized (C9874c.class) {
                if (f26876f == null) {
                    f26876f = new C9874c(context);
                    m19773b();
                    C9903i a = C9894e.m19812a();
                    if (a != null) {
                        Map a2 = a.mo17833a();
                        if (a2 != null) {
                            m19775b(a2);
                        }
                    }
                    C9894e.m19822a((C9904j) f26876f);
                }
            }
        }
        return f26876f;
    }

    /* renamed from: a */
    private static String m19756a(Exception exc) {
        if (exc == null) {
            return "";
        }
        try {
            String message = exc.getMessage();
            if (message == null) {
                return "";
            }
            String[] split = message.split("\\|");
            if (split != null && split.length >= 2) {
                return split[0];
            }
            return "";
        } catch (Throwable unused) {
        }
    }

    /* renamed from: b */
    private static void m19775b(Map<String, ?> map) {
        if (map != null) {
            try {
                if (f26872b != null) {
                    C9409b.m18609a((Object) f26872b).mo17052a("syncHttpEncryptConfig", (Class<?>[]) new Class[]{Map.class}, map);
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: b */
    public static JSONObject m19772b(HttpURLConnection httpURLConnection) {
        String str;
        JSONObject jSONObject = new JSONObject();
        if (httpURLConnection == null) {
            return jSONObject;
        }
        try {
            jSONObject.put("hc", "SsCronetHttpClient");
            if (f26872b != null) {
                jSONObject.put("hcv", f26872b.getCronetVersion());
            }
            jSONObject.put("ua", httpURLConnection.getRequestProperty("User-Agent"));
            CookieHandler cookieHandler = CookieHandler.getDefault();
            if (cookieHandler != null) {
                HashMap hashMap = new HashMap();
                String requestProperty = httpURLConnection.getRequestProperty("Cookie");
                if (!C9431p.m18664a(requestProperty)) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(requestProperty);
                    hashMap.put("Cookie", arrayList);
                }
                String requestProperty2 = httpURLConnection.getRequestProperty("X-SS-Cookie");
                if (!C9431p.m18664a(requestProperty2)) {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(requestProperty2);
                    hashMap.put("X-SS-Cookie", arrayList2);
                }
                String requestProperty3 = httpURLConnection.getRequestProperty("X-SS-No-Cookie");
                if (!C9431p.m18664a(requestProperty3)) {
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add(requestProperty3);
                    hashMap.put("X-SS-No-Cookie", arrayList3);
                }
                Map map = cookieHandler.get(C9915j.m19868a(httpURLConnection.getURL().toString()), hashMap);
                if (map != null && !map.isEmpty()) {
                    StringBuilder sb = new StringBuilder();
                    for (String str2 : map.keySet()) {
                        if (sb.length() > 0) {
                            sb.append(",");
                        }
                        List list = (List) map.get(str2);
                        if (str2 == null) {
                            str2 = TEVideoRecorder.FACE_BEAUTY_NULL;
                        }
                        sb.append(str2);
                        sb.append(":");
                        if (list != null) {
                            str = TextUtils.join(", ", list);
                        } else {
                            str = TEVideoRecorder.FACE_BEAUTY_NULL;
                        }
                        sb.append(str);
                    }
                    jSONObject.put("cookie", sb.toString());
                }
            }
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    /* renamed from: c */
    private static String m19776c(HttpURLConnection httpURLConnection) {
        if (httpURLConnection == null) {
            return "";
        }
        try {
            Map headerFields = httpURLConnection.getHeaderFields();
            if (headerFields != null) {
                if (!headerFields.isEmpty()) {
                    JSONObject jSONObject = new JSONObject();
                    for (Entry entry : headerFields.entrySet()) {
                        if (entry != null) {
                            String str = (String) entry.getKey();
                            if (!C9431p.m18664a(str)) {
                                List<String> list = (List) entry.getValue();
                                if (list != null && !list.isEmpty()) {
                                    StringBuilder sb = new StringBuilder();
                                    int i = 0;
                                    for (String str2 : list) {
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
                    }
                    return jSONObject.toString();
                }
            }
            return "";
        } catch (Throwable unused) {
            return "";
        }
    }

    /* renamed from: a */
    protected static HttpURLConnection m19759a(String str) throws IOException {
        boolean z;
        m19773b();
        C9894e.m19834h();
        if (f26872b != null) {
            f26872b.setCronetBootFailureChecker(f26876f);
            ICronetClient iCronetClient = f26872b;
            Context context = f26871a;
            if (f26878h == null) {
                z = false;
            } else {
                z = f26878h.mo17793b();
            }
            HttpURLConnection openConnection = iCronetClient.openConnection(context, str, z, C9894e.m19832f(), new C9919a());
            openConnection.setConnectTimeout(C9894e.m19830d());
            openConnection.setReadTimeout(C9894e.m19831e());
            return openConnection;
        }
        throw new IllegalArgumentException("CronetClient is null");
    }

    /* renamed from: a */
    public static void m19761a(SharedPreferences sharedPreferences) {
        f26874d = sharedPreferences.getInt("cronet_inputstream_buff_size", 0);
    }

    /* renamed from: a */
    public static String m19758a(HttpURLConnection httpURLConnection, String str) {
        if (httpURLConnection == null || TextUtils.isEmpty(str)) {
            return null;
        }
        String headerField = httpURLConnection.getHeaderField(str);
        if (TextUtils.isEmpty(headerField)) {
            headerField = httpURLConnection.getHeaderField(str.toLowerCase());
        }
        return headerField;
    }

    /* renamed from: a */
    private static <T> T m19755a(Object obj, Class<T> cls, T t) {
        if (obj == null || !obj.getClass().equals(cls)) {
            return t;
        }
        return obj;
    }

    /* renamed from: a */
    public static String m19757a(HttpURLConnection httpURLConnection, C9831a aVar, int i) {
        if (httpURLConnection == null) {
            return null;
        }
        m19765a(m19758a(httpURLConnection, "x-net-info.remoteaddr"), aVar);
        if (!(aVar == null || aVar.f26752b == null)) {
            aVar.f26752b.f26779b = i;
        }
        return m19758a(httpURLConnection, "X-TT-LOGID");
    }

    /* renamed from: b */
    public static void m19774b(HttpURLConnection httpURLConnection, C9831a aVar, C12796s sVar) {
        if (httpURLConnection != null && aVar != null) {
            try {
                if (f26872b != null) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    f26872b.getRequestMetrics(httpURLConnection, linkedHashMap);
                    if (!linkedHashMap.isEmpty()) {
                        aVar.f26751a = (String) m19755a(linkedHashMap.get("remote_ip"), String.class, (T) "");
                        aVar.f26760j = ((Long) m19755a(linkedHashMap.get("dns_time"), Long.class, (T) Long.valueOf(-1))).longValue();
                        aVar.f26761k = ((Long) m19755a(linkedHashMap.get("connect_time"), Long.class, (T) Long.valueOf(-1))).longValue();
                        aVar.f26762l = ((Long) m19755a(linkedHashMap.get("ssl_time"), Long.class, (T) Long.valueOf(-1))).longValue();
                        aVar.f26763m = ((Long) m19755a(linkedHashMap.get("send_time"), Long.class, (T) Long.valueOf(-1))).longValue();
                        aVar.f26764n = ((Long) m19755a(linkedHashMap.get("push_time"), Long.class, (T) Long.valueOf(-1))).longValue();
                        aVar.f26765o = ((Long) m19755a(linkedHashMap.get("receive_time"), Long.class, (T) Long.valueOf(-1))).longValue();
                        aVar.f26766p = ((Boolean) m19755a(linkedHashMap.get("socket_reused"), Boolean.class, (T) Boolean.valueOf(false))).booleanValue();
                        aVar.f26767q = ((Long) m19755a(linkedHashMap.get(C38828b.f98805w), Long.class, (T) Long.valueOf(-1))).longValue();
                        aVar.f26768r = ((Long) m19755a(linkedHashMap.get("total_time"), Long.class, (T) Long.valueOf(-1))).longValue();
                        aVar.f26769s = ((Long) m19755a(linkedHashMap.get("send_byte_count"), Long.class, (T) Long.valueOf(-1))).longValue();
                        aVar.f26770t = ((Long) m19755a(linkedHashMap.get("received_byte_count"), Long.class, (T) Long.valueOf(-1))).longValue();
                        aVar.f26774x = (String) m19755a(linkedHashMap.get("request_log"), String.class, (T) "");
                        aVar.f26771u = ((Long) m19755a(linkedHashMap.get("retry_attempts"), Long.class, (T) Long.valueOf(-1))).longValue();
                        aVar.f26749A = (String) m19755a(linkedHashMap.get("request_headers"), String.class, (T) "");
                        aVar.f26750B = (String) m19755a(linkedHashMap.get("response_headers"), String.class, (T) "");
                    }
                }
                if (sVar != null) {
                    sVar.f33468a = aVar.f26773w;
                    sVar.f33482o = SystemClock.uptimeMillis();
                    sVar.f33473f = System.currentTimeMillis();
                    aVar.f26775y.put("retrofit", sVar.mo23948a());
                }
            } catch (Throwable unused) {
            }
        }
    }
}
