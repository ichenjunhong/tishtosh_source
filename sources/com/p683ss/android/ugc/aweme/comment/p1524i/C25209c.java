package com.p683ss.android.ugc.aweme.comment.p1524i;

import com.p683ss.android.deviceregister.C19034d;
import com.p683ss.android.ugc.aweme.IAccountUserService;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.app.C23131p;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import com.p683ss.android.ugc.aweme.comment.model.BaseCommentResponse;
import com.p683ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.comment.i.c */
public final class C25209c {

    /* renamed from: c */
    public static int f66789c;

    /* renamed from: d */
    public static long f66790d;

    /* renamed from: e */
    public static final C25210a f66791e = new C25210a(null);

    /* renamed from: a */
    public final ConcurrentHashMap<String, String> f66792a = new ConcurrentHashMap<>();

    /* renamed from: b */
    public long f66793b;

    /* renamed from: com.ss.android.ugc.aweme.comment.i.c$a */
    public static final class C25210a {
        private C25210a() {
        }

        public /* synthetic */ C25210a(C52707g gVar) {
            this();
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x0036 A[Catch:{ Throwable -> 0x0095 }] */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x0042 A[Catch:{ Throwable -> 0x0095 }] */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x005f A[Catch:{ Throwable -> 0x0095 }] */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x0061 A[Catch:{ Throwable -> 0x0095 }] */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x0064 A[Catch:{ Throwable -> 0x0095 }] */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x0075 A[Catch:{ Throwable -> 0x0095 }] */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x0078 A[Catch:{ Throwable -> 0x0095 }] */
        /* JADX WARNING: Removed duplicated region for block: B:9:0x0029 A[Catch:{ Throwable -> 0x0095 }] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static void m61314a(java.lang.String r5, java.lang.String r6, long r7, int r9, java.lang.String r10, java.lang.String r11) {
            /*
                java.util.HashMap r0 = new java.util.HashMap     // Catch:{ Throwable -> 0x0095 }
                r0.<init>()     // Catch:{ Throwable -> 0x0095 }
                r1 = r0
                java.util.Map r1 = (java.util.Map) r1     // Catch:{ Throwable -> 0x0095 }
                java.lang.String r2 = "unexpectedType"
                java.lang.String r9 = java.lang.String.valueOf(r9)     // Catch:{ Throwable -> 0x0095 }
                r1.put(r2, r9)     // Catch:{ Throwable -> 0x0095 }
                java.util.HashMap r9 = new java.util.HashMap     // Catch:{ Throwable -> 0x0095 }
                r9.<init>()     // Catch:{ Throwable -> 0x0095 }
                r1 = r5
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1     // Catch:{ Throwable -> 0x0095 }
                r2 = 0
                r3 = 1
                if (r1 == 0) goto L_0x0026
                int r1 = r1.length()     // Catch:{ Throwable -> 0x0095 }
                if (r1 != 0) goto L_0x0024
                goto L_0x0026
            L_0x0024:
                r1 = 0
                goto L_0x0027
            L_0x0026:
                r1 = 1
            L_0x0027:
                if (r1 != 0) goto L_0x0031
                r1 = r9
                java.util.Map r1 = (java.util.Map) r1     // Catch:{ Throwable -> 0x0095 }
                java.lang.String r4 = "MethodName"
                r1.put(r4, r5)     // Catch:{ Throwable -> 0x0095 }
            L_0x0031:
                r5 = r6
                java.lang.CharSequence r5 = (java.lang.CharSequence) r5     // Catch:{ Throwable -> 0x0095 }
                if (r5 == 0) goto L_0x003f
                int r5 = r5.length()     // Catch:{ Throwable -> 0x0095 }
                if (r5 != 0) goto L_0x003d
                goto L_0x003f
            L_0x003d:
                r5 = 0
                goto L_0x0040
            L_0x003f:
                r5 = 1
            L_0x0040:
                if (r5 != 0) goto L_0x004a
                r5 = r9
                java.util.Map r5 = (java.util.Map) r5     // Catch:{ Throwable -> 0x0095 }
                java.lang.String r1 = "GroupId"
                r5.put(r1, r6)     // Catch:{ Throwable -> 0x0095 }
            L_0x004a:
                r5 = r9
                java.util.Map r5 = (java.util.Map) r5     // Catch:{ Throwable -> 0x0095 }
                java.lang.String r6 = "expectedCount"
                java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch:{ Throwable -> 0x0095 }
                r5.put(r6, r7)     // Catch:{ Throwable -> 0x0095 }
                r5 = r10
                java.lang.CharSequence r5 = (java.lang.CharSequence) r5     // Catch:{ Throwable -> 0x0095 }
                int r5 = r5.length()     // Catch:{ Throwable -> 0x0095 }
                if (r5 <= 0) goto L_0x0061
                r5 = 1
                goto L_0x0062
            L_0x0061:
                r5 = 0
            L_0x0062:
                if (r5 == 0) goto L_0x006c
                r5 = r9
                java.util.Map r5 = (java.util.Map) r5     // Catch:{ Throwable -> 0x0095 }
                java.lang.String r6 = "errorType"
                r5.put(r6, r10)     // Catch:{ Throwable -> 0x0095 }
            L_0x006c:
                r5 = r11
                java.lang.CharSequence r5 = (java.lang.CharSequence) r5     // Catch:{ Throwable -> 0x0095 }
                int r5 = r5.length()     // Catch:{ Throwable -> 0x0095 }
                if (r5 <= 0) goto L_0x0076
                r2 = 1
            L_0x0076:
                if (r2 == 0) goto L_0x0080
                r5 = r9
                java.util.Map r5 = (java.util.Map) r5     // Catch:{ Throwable -> 0x0095 }
                java.lang.String r6 = "errorDescription"
                r5.put(r6, r11)     // Catch:{ Throwable -> 0x0095 }
            L_0x0080:
                java.lang.String r5 = "aweme_comment_list_unexpected"
                org.json.JSONObject r6 = new org.json.JSONObject     // Catch:{ Throwable -> 0x0095 }
                java.util.Map r0 = (java.util.Map) r0     // Catch:{ Throwable -> 0x0095 }
                r6.<init>(r0)     // Catch:{ Throwable -> 0x0095 }
                r7 = 0
                org.json.JSONObject r8 = new org.json.JSONObject     // Catch:{ Throwable -> 0x0095 }
                java.util.Map r9 = (java.util.Map) r9     // Catch:{ Throwable -> 0x0095 }
                r8.<init>(r9)     // Catch:{ Throwable -> 0x0095 }
                com.bytedance.apm.C8936b.m17657a(r5, r6, r7, r8)     // Catch:{ Throwable -> 0x0095 }
                return
            L_0x0095:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.comment.p1524i.C25209c.C25210a.m61314a(java.lang.String, java.lang.String, long, int, java.lang.String, java.lang.String):void");
        }
    }

    /* renamed from: c */
    private void m61304c() {
        this.f66792a.clear();
    }

    /* renamed from: a */
    public final void mo51461a() {
        m61304c();
        this.f66793b = System.currentTimeMillis();
        this.f66792a.put("TimeStamp", String.valueOf(this.f66793b));
    }

    /* renamed from: b */
    public final void mo51466b() {
        if (!this.f66792a.containsKey("UserId")) {
            IAccountUserService g = C20854a.m53167g();
            C52711k.m112236a((Object) g, "AccountProxyService.userService()");
            if (g.isLogin()) {
                IAccountUserService g2 = C20854a.m53167g();
                C52711k.m112236a((Object) g2, "AccountProxyService.userService()");
                String curUserId = g2.getCurUserId();
                C52711k.m112236a((Object) curUserId, "AccountProxyService.userService().curUserId");
                this.f66792a.put("UserId", curUserId);
            }
        }
        if (!this.f66792a.containsKey("DeviceId")) {
            String c = C19034d.m46323c();
            C52711k.m112236a((Object) c, "DeviceRegisterManager.getDeviceId()");
            this.f66792a.put("DeviceId", c);
        }
        try {
            C23131p.m57779a("aweme_comment_list_api_monitor_log", new JSONObject(this.f66792a));
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public final void mo51462a(int i) {
        this.f66792a.put("ActualReturnCount", String.valueOf(i));
    }

    /* renamed from: b */
    public final void mo51467b(long j) {
        this.f66792a.put("TotalCount", String.valueOf(j));
    }

    /* renamed from: b */
    public final void mo51468b(String str) {
        C52711k.m112240b(str, "groupId");
        this.f66792a.put("GroupId", str);
    }

    /* renamed from: a */
    public final void mo51463a(long j) {
        this.f66792a.put("Offset", String.valueOf(j));
    }

    /* renamed from: a */
    public final void mo51464a(BaseResponse baseResponse) {
        C52711k.m112240b(baseResponse, "response");
        if (baseResponse instanceof BaseCommentResponse) {
            LogPbBean logPbBean = ((BaseCommentResponse) baseResponse).logPd;
            if (logPbBean != null) {
                String imprId = logPbBean.getImprId();
                if (imprId != null) {
                    this.f66792a.put("LogID", imprId);
                }
            }
        }
        this.f66792a.put("ErrorCode", String.valueOf(baseResponse.status_code));
    }

    /* renamed from: a */
    public final void mo51465a(String str) {
        C52711k.m112240b(str, "methodName");
        this.f66792a.put("MethodName", str);
    }

    /* renamed from: a */
    public static final void m61303a(int i, long j) {
        f66789c = i;
        f66790d = j;
    }
}
