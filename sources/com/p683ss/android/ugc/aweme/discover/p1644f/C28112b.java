package com.p683ss.android.ugc.aweme.discover.p1644f;

import com.p683ss.android.ugc.aweme.app.api.C22990h;
import java.util.concurrent.Callable;
import p001a.C0013i;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.discover.f.b */
public final class C28112b {

    /* renamed from: a */
    public static C28111a f73809a;

    /* renamed from: b */
    public static final C28112b f73810b = new C28112b();

    /* renamed from: com.ss.android.ugc.aweme.discover.f.b$a */
    static final class C28113a<V> implements Callable<TResult> {

        /* renamed from: a */
        final /* synthetic */ int f73811a;

        /* renamed from: b */
        final /* synthetic */ int f73812b;

        /* renamed from: c */
        final /* synthetic */ int f73813c;

        /* renamed from: d */
        final /* synthetic */ long f73814d;

        /* renamed from: e */
        final /* synthetic */ long f73815e;

        /* renamed from: f */
        final /* synthetic */ int f73816f;

        /* renamed from: g */
        final /* synthetic */ C22990h f73817g;

        /* renamed from: h */
        final /* synthetic */ String f73818h;

        /* renamed from: i */
        final /* synthetic */ String f73819i;

        C28113a(int i, int i2, int i3, long j, long j2, int i4, C22990h hVar, String str, String str2) {
            this.f73811a = i;
            this.f73812b = i2;
            this.f73813c = i3;
            this.f73814d = j;
            this.f73815e = j2;
            this.f73816f = i4;
            this.f73817g = hVar;
            this.f73818h = str;
            this.f73819i = str2;
        }

        /* JADX WARNING: Removed duplicated region for block: B:21:0x006f  */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x008a  */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x00a5  */
        /* JADX WARNING: Removed duplicated region for block: B:45:0x00c0  */
        /* JADX WARNING: Removed duplicated region for block: B:53:0x00db  */
        /* JADX WARNING: Removed duplicated region for block: B:61:0x00f6  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Object call() {
            /*
                r7 = this;
                org.json.JSONObject r6 = new org.json.JSONObject
                r6.<init>()
                java.lang.String r0 = "cost"
                int r1 = r7.f73811a
                r6.put(r0, r1)
                java.lang.String r0 = "netCost"
                int r1 = r7.f73812b
                r6.put(r0, r1)
                java.lang.String r0 = "status"
                int r1 = r7.f73813c
                r6.put(r0, r1)
                java.lang.String r0 = "triggerNetStart"
                long r1 = r7.f73814d
                r6.put(r0, r1)
                java.lang.String r0 = "triggerStart"
                long r1 = r7.f73815e
                r6.put(r0, r1)
                java.lang.String r0 = "itemCount"
                int r1 = r7.f73816f
                r6.put(r0, r1)
                com.ss.android.ugc.aweme.app.api.h r0 = r7.f73817g
                if (r0 == 0) goto L_0x012b
                com.ss.android.ugc.aweme.app.api.h r0 = r7.f73817g
                if (r0 != 0) goto L_0x003a
                p2628d.p2639f.p2641b.C52711k.m112234a()
            L_0x003a:
                com.ss.android.ugc.aweme.app.api.j r0 = r0.getRequestLog()
                if (r0 == 0) goto L_0x0109
                java.lang.String r1 = "libcore"
                com.ss.android.ugc.aweme.app.api.j$b r2 = r0.f61325a
                r3 = 0
                if (r2 == 0) goto L_0x004a
                java.lang.String r2 = r2.f61335a
                goto L_0x004b
            L_0x004a:
                r2 = r3
            L_0x004b:
                r6.put(r1, r2)
                java.lang.String r1 = "body_recv"
                com.ss.android.ugc.aweme.app.api.j$c r2 = r0.f61326b
                if (r2 == 0) goto L_0x0065
                com.ss.android.ugc.aweme.app.api.j$a r2 = r2.f61336a
                if (r2 == 0) goto L_0x0065
                java.lang.String r2 = r2.f61327a
                if (r2 == 0) goto L_0x0065
                int r2 = java.lang.Integer.parseInt(r2)
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                goto L_0x0066
            L_0x0065:
                r2 = r3
            L_0x0066:
                r6.put(r1, r2)
                java.lang.String r1 = "dns"
                com.ss.android.ugc.aweme.app.api.j$c r2 = r0.f61326b
                if (r2 == 0) goto L_0x0080
                com.ss.android.ugc.aweme.app.api.j$a r2 = r2.f61336a
                if (r2 == 0) goto L_0x0080
                java.lang.String r2 = r2.f61328b
                if (r2 == 0) goto L_0x0080
                int r2 = java.lang.Integer.parseInt(r2)
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                goto L_0x0081
            L_0x0080:
                r2 = r3
            L_0x0081:
                r6.put(r1, r2)
                java.lang.String r1 = "inner"
                com.ss.android.ugc.aweme.app.api.j$c r2 = r0.f61326b
                if (r2 == 0) goto L_0x009b
                com.ss.android.ugc.aweme.app.api.j$a r2 = r2.f61336a
                if (r2 == 0) goto L_0x009b
                java.lang.String r2 = r2.f61329c
                if (r2 == 0) goto L_0x009b
                int r2 = java.lang.Integer.parseInt(r2)
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                goto L_0x009c
            L_0x009b:
                r2 = r3
            L_0x009c:
                r6.put(r1, r2)
                java.lang.String r1 = "rtt"
                com.ss.android.ugc.aweme.app.api.j$c r2 = r0.f61326b
                if (r2 == 0) goto L_0x00b6
                com.ss.android.ugc.aweme.app.api.j$a r2 = r2.f61336a
                if (r2 == 0) goto L_0x00b6
                java.lang.String r2 = r2.f61330d
                if (r2 == 0) goto L_0x00b6
                int r2 = java.lang.Integer.parseInt(r2)
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                goto L_0x00b7
            L_0x00b6:
                r2 = r3
            L_0x00b7:
                r6.put(r1, r2)
                java.lang.String r1 = "send"
                com.ss.android.ugc.aweme.app.api.j$c r2 = r0.f61326b
                if (r2 == 0) goto L_0x00d1
                com.ss.android.ugc.aweme.app.api.j$a r2 = r2.f61336a
                if (r2 == 0) goto L_0x00d1
                java.lang.String r2 = r2.f61331e
                if (r2 == 0) goto L_0x00d1
                int r2 = java.lang.Integer.parseInt(r2)
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                goto L_0x00d2
            L_0x00d1:
                r2 = r3
            L_0x00d2:
                r6.put(r1, r2)
                java.lang.String r1 = "tcp"
                com.ss.android.ugc.aweme.app.api.j$c r2 = r0.f61326b
                if (r2 == 0) goto L_0x00ec
                com.ss.android.ugc.aweme.app.api.j$a r2 = r2.f61336a
                if (r2 == 0) goto L_0x00ec
                java.lang.String r2 = r2.f61333g
                if (r2 == 0) goto L_0x00ec
                int r2 = java.lang.Integer.parseInt(r2)
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                goto L_0x00ed
            L_0x00ec:
                r2 = r3
            L_0x00ed:
                r6.put(r1, r2)
                java.lang.String r1 = "ttfb"
                com.ss.android.ugc.aweme.app.api.j$c r0 = r0.f61326b
                if (r0 == 0) goto L_0x0106
                com.ss.android.ugc.aweme.app.api.j$a r0 = r0.f61336a
                if (r0 == 0) goto L_0x0106
                java.lang.String r0 = r0.f61334h
                if (r0 == 0) goto L_0x0106
                int r0 = java.lang.Integer.parseInt(r0)
                java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            L_0x0106:
                r6.put(r1, r3)
            L_0x0109:
                com.ss.android.ugc.aweme.app.api.h r0 = r7.f73817g
                if (r0 != 0) goto L_0x0110
                p2628d.p2639f.p2641b.C52711k.m112234a()
            L_0x0110:
                com.bytedance.frameworks.baselib.network.http.a r0 = r0.getRequestInfo()
                if (r0 == 0) goto L_0x012b
                java.lang.String r1 = "timing_total"
                long r2 = r0.f26768r
                r6.put(r1, r2)
                java.lang.String r1 = "requestStart"
                long r2 = r0.f26755e
                r6.put(r1, r2)
                java.lang.String r1 = "appLevelRequestStart"
                long r2 = r0.f26753c
                r6.put(r1, r2)
            L_0x012b:
                com.ss.android.ugc.aweme.search.k r0 = com.p683ss.android.ugc.aweme.search.C41431k.f105004a
                java.lang.String r1 = "search_intermediate_show_monitor"
                java.lang.String r2 = "open_search_square"
                org.json.JSONObject r3 = new org.json.JSONObject
                r3.<init>()
                java.lang.String r4 = "netLogId"
                java.lang.String r5 = r7.f73818h
                r3.put(r4, r5)
                java.lang.String r4 = "errorMsg"
                java.lang.String r5 = r7.f73819i
                r3.put(r4, r5)
                r5 = 0
                r4 = r6
                r0.reportSlardarCommonEvent(r1, r2, r3, r4, r5)
                java.lang.String r0 = "netLogId"
                java.lang.String r1 = r7.f73818h
                r6.put(r0, r1)
                java.lang.String r0 = "errorMsg"
                java.lang.String r1 = r7.f73819i
                r6.put(r0, r1)
                java.lang.String r0 = "search_intermediate_show_monitor"
                com.p683ss.android.ugc.aweme.base.C23569o.m57779a(r0, r6)
                java.lang.String r0 = "search_intermediate_show_monitor"
                com.p683ss.android.common.p1146d.C18894a.m46006a(r0, r6)
                d.x r0 = p2628d.C52860x.f131107a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.discover.p1644f.C28112b.C28113a.call():java.lang.Object");
        }
    }

    private C28112b() {
    }

    /* renamed from: a */
    public final C28112b mo56507a() {
        long j;
        if (f73809a != null) {
            C28111a aVar = f73809a;
            if (aVar == null) {
                C52711k.m112234a();
            }
            if (aVar.f73802b != 0) {
                C28111a aVar2 = f73809a;
                if (aVar2 == null) {
                    C52711k.m112234a();
                }
                j = aVar2.f73802b;
            } else {
                C28111a aVar3 = f73809a;
                if (aVar3 == null) {
                    C52711k.m112234a();
                }
                j = aVar3.f73801a;
            }
            C28111a aVar4 = f73809a;
            if (aVar4 == null) {
                C52711k.m112234a();
            }
            aVar4.f73803c = (int) (System.currentTimeMillis() - j);
        }
        return this;
    }

    /* renamed from: b */
    public static void m66905b() {
        if (f73809a != null) {
            C28111a aVar = f73809a;
            if (aVar == null) {
                C52711k.m112234a();
            }
            if (aVar.f73801a != 0) {
                long currentTimeMillis = System.currentTimeMillis();
                C28111a aVar2 = f73809a;
                if (aVar2 == null) {
                    C52711k.m112234a();
                }
                int i = (int) (currentTimeMillis - aVar2.f73801a);
                C28111a aVar3 = f73809a;
                if (aVar3 == null) {
                    C52711k.m112234a();
                }
                int i2 = aVar3.f73803c;
                C28111a aVar4 = f73809a;
                if (aVar4 == null) {
                    C52711k.m112234a();
                }
                int i3 = aVar4.f73805e;
                C28111a aVar5 = f73809a;
                if (aVar5 == null) {
                    C52711k.m112234a();
                }
                String str = aVar5.f73807g;
                C28111a aVar6 = f73809a;
                if (aVar6 == null) {
                    C52711k.m112234a();
                }
                long j = aVar6.f73802b;
                C28111a aVar7 = f73809a;
                if (aVar7 == null) {
                    C52711k.m112234a();
                }
                long j2 = aVar7.f73801a;
                C28111a aVar8 = f73809a;
                if (aVar8 == null) {
                    C52711k.m112234a();
                }
                int i4 = aVar8.f73806f;
                C28111a aVar9 = f73809a;
                if (aVar9 == null) {
                    C52711k.m112234a();
                }
                String str2 = aVar9.f73804d;
                C28111a aVar10 = f73809a;
                if (aVar10 == null) {
                    C52711k.m112234a();
                }
                C28113a aVar11 = new C28113a(i, i2, i3, j, j2, i4, aVar10.f73808h, str2, str);
                C0013i.m16a((Callable<TResult>) aVar11);
                f73809a = null;
            }
        }
    }

    /* renamed from: a */
    public final C28112b mo56508a(int i) {
        C28111a aVar = f73809a;
        if (aVar != null) {
            aVar.f73805e = i;
        }
        return this;
    }

    /* renamed from: a */
    public final C28112b mo56509a(C22990h hVar) {
        C28111a aVar = f73809a;
        if (aVar != null) {
            aVar.f73808h = hVar;
        }
        return this;
    }

    /* renamed from: a */
    public final C28112b mo56510a(String str) {
        C28111a aVar = f73809a;
        if (aVar != null) {
            aVar.f73804d = str;
        }
        return this;
    }
}
