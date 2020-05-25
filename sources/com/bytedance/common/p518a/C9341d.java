package com.bytedance.common.p518a;

import android.content.Context;
import com.bytedance.common.utility.p523c.C9389c;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: com.bytedance.common.a.d */
public class C9341d implements C9342e {

    /* renamed from: a */
    static C9341d f25567a;

    /* renamed from: d */
    private static C9336a f25568d;

    /* renamed from: b */
    private boolean f25569b;

    /* renamed from: c */
    private final C9339c f25570c;

    /* renamed from: e */
    private final Context f25571e;

    /* renamed from: f */
    private final String f25572f;

    /* renamed from: g */
    private final long f25573g;

    /* renamed from: h */
    private ConcurrentHashMap<String, Future<C9337b>> f25574h = new ConcurrentHashMap<>();

    /* renamed from: a */
    public static C9342e m18501a() {
        return f25567a;
    }

    /* renamed from: b */
    public final void mo16967b() {
        if (this.f25570c != null) {
            C9339c cVar = this.f25570c;
            C9339c.m18499b(cVar.f25558a);
            cVar.f25558a.clear();
            C9339c.m18499b(cVar.f25559b);
            cVar.f25559b.clear();
            cVar.f25560c.clear();
        }
    }

    /* renamed from: b */
    public final void mo16968b(boolean z) {
        this.f25569b = true;
    }

    /* renamed from: a */
    public final void mo16966a(boolean z) {
        C9343f.f25575a = true;
    }

    /* renamed from: b */
    private Future<C9337b> m18503b(String str) {
        try {
            ExecutorService a = C9389c.m18568a();
            C9344g gVar = new C9344g(str, this.f25571e, this.f25572f, this.f25570c, this.f25573g);
            Future<C9337b> submit = a.submit(gVar);
            this.f25570c.f25560c.add(str);
            this.f25574h.put(str, submit);
            return submit;
        } catch (RejectedExecutionException unused) {
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00a7, code lost:
        if (r6.f25569b != false) goto L_0x00ab;
     */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00b0 A[RETURN] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<java.net.InetAddress> mo16965a(java.lang.String r7) {
        /*
            r6 = this;
            r0 = 0
            if (r7 == 0) goto L_0x003a
            char[] r1 = r7.toCharArray()
            int r2 = r1.length
            if (r2 <= 0) goto L_0x003a
            int r2 = r1.length
            r3 = 255(0xff, float:3.57E-43)
            if (r2 <= r3) goto L_0x0010
            goto L_0x003a
        L_0x0010:
            int r2 = r1.length
            r3 = 0
        L_0x0012:
            if (r3 >= r2) goto L_0x0039
            char r4 = r1[r3]
            r5 = 65
            if (r4 < r5) goto L_0x001e
            r5 = 90
            if (r4 <= r5) goto L_0x0036
        L_0x001e:
            r5 = 97
            if (r4 < r5) goto L_0x0026
            r5 = 122(0x7a, float:1.71E-43)
            if (r4 <= r5) goto L_0x0036
        L_0x0026:
            r5 = 48
            if (r4 < r5) goto L_0x002e
            r5 = 57
            if (r4 <= r5) goto L_0x0036
        L_0x002e:
            r5 = 46
            if (r4 == r5) goto L_0x0036
            r5 = 45
            if (r4 != r5) goto L_0x003a
        L_0x0036:
            int r3 = r3 + 1
            goto L_0x0012
        L_0x0039:
            r0 = 1
        L_0x003a:
            r1 = 0
            if (r0 == 0) goto L_0x00aa
            boolean r0 = com.bytedance.common.p518a.C9345h.m18515a(r7)
            if (r0 != 0) goto L_0x00aa
            com.bytedance.common.a.a r0 = f25568d
            if (r0 == 0) goto L_0x004f
            com.bytedance.common.a.a r0 = f25568d
            boolean r0 = r0.mo16958a(r7)
            if (r0 != 0) goto L_0x00aa
        L_0x004f:
            android.content.Context r0 = r6.f25571e
            boolean r0 = com.bytedance.common.p518a.C9345h.m18514a(r0)
            if (r0 == 0) goto L_0x00aa
            com.bytedance.common.a.c r0 = r6.f25570c
            java.util.concurrent.ConcurrentMap r0 = r0.mo16963a()
            java.lang.Object r0 = r0.get(r7)
            com.bytedance.common.a.b r0 = (com.bytedance.common.p518a.C9337b) r0
            if (r0 == 0) goto L_0x0082
            boolean r2 = r0.mo16960b()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "refresh host sync: "
            r3.<init>(r4)
            r3.append(r7)
            java.lang.String r4 = " expired: "
            r3.append(r4)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            com.bytedance.common.p518a.C9343f.m18512a(r2)
        L_0x0082:
            if (r0 == 0) goto L_0x008a
            boolean r2 = r0.mo16960b()
            if (r2 == 0) goto L_0x0097
        L_0x008a:
            com.bytedance.common.a.c r2 = r6.f25570c
            java.util.concurrent.ConcurrentSkipListSet<java.lang.String> r2 = r2.f25560c
            boolean r2 = r2.contains(r7)
            if (r2 != 0) goto L_0x0097
            r6.m18503b(r7)
        L_0x0097:
            if (r0 == 0) goto L_0x00aa
            boolean r7 = r0.mo16960b()
            if (r7 == 0) goto L_0x00ab
            boolean r7 = r0.mo16960b()
            if (r7 == 0) goto L_0x00aa
            boolean r7 = r6.f25569b
            if (r7 == 0) goto L_0x00aa
            goto L_0x00ab
        L_0x00aa:
            r0 = r1
        L_0x00ab:
            if (r0 == 0) goto L_0x00b0
            java.util.List<java.net.InetAddress> r7 = r0.f25553c
            return r7
        L_0x00b0:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.p518a.C9341d.mo16965a(java.lang.String):java.util.List");
    }

    private C9341d(Context context, String str, long j, boolean z) {
        this.f25571e = context;
        this.f25572f = str;
        this.f25570c = new C9339c(context, z);
        if (j > 300) {
            this.f25573g = j;
        } else {
            this.f25573g = 300;
        }
    }

    /* renamed from: a */
    public static C9342e m18502a(Context context, String str, long j, boolean z) {
        if (f25567a == null) {
            synchronized (C9341d.class) {
                if (f25567a == null) {
                    C9341d dVar = new C9341d(context.getApplicationContext(), str, 300, z);
                    f25567a = dVar;
                }
            }
        }
        return f25567a;
    }
}
