package com.p683ss.android.ugc.aweme.analysis;

import com.p683ss.android.agilelogger.C18778a;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32460c;

/* renamed from: com.ss.android.ugc.aweme.analysis.a */
public final class C22579a implements C32460c {

    /* renamed from: a */
    private static int f60713a = 20971520;

    /* renamed from: b */
    private static int f60714b = 10485760;

    /* renamed from: c */
    private boolean f60715c;

    /* renamed from: b */
    public final String mo46951b() {
        return "AppLog";
    }

    /* renamed from: a */
    public final boolean mo46950a() {
        return this.f60715c;
    }

    public C22579a(boolean z) {
        this.f60715c = z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0041  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo46947a(android.content.Context r7) {
        /*
            r6 = this;
            java.io.File r0 = com.p683ss.android.ugc.aweme.shortvideo.util.C45469z.m99099e(r7)
            boolean r1 = com.bytedance.p829r.C12662c.m25456a()
            if (r1 == 0) goto L_0x0023
            long r1 = r0.getFreeSpace()
            r3 = 8
            long r1 = r1 / r3
            int r3 = f60713a
            long r3 = (long) r3
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 > 0) goto L_0x0023
            int r3 = f60714b
            long r3 = (long) r3
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 >= 0) goto L_0x0026
            int r1 = f60714b
            long r1 = (long) r1
            goto L_0x0026
        L_0x0023:
            int r1 = f60713a
            long r1 = (long) r1
        L_0x0026:
            com.ss.android.agilelogger.b$a r3 = new com.ss.android.agilelogger.b$a
            android.content.Context r7 = r7.getApplicationContext()
            r3.<init>(r7)
            int r7 = (int) r1
            com.ss.android.agilelogger.b$a r7 = r3.mo38392a(r7)
            r1 = 2097152(0x200000, float:2.938736E-39)
            com.ss.android.agilelogger.b$a r7 = r7.mo38394b(r1)
            if (r0 == 0) goto L_0x0041
            java.lang.String r0 = r0.getAbsolutePath()
            goto L_0x0042
        L_0x0041:
            r0 = 0
        L_0x0042:
            r7.f51938a = r0
            com.ss.android.agilelogger.b r7 = r7.mo38393a()
            java.lang.Class<com.ss.android.ugc.aweme.framework.a.a> r0 = com.p683ss.android.ugc.aweme.framework.p1780a.C32458a.class
            java.lang.String r0 = r0.getCanonicalName()
            com.p683ss.android.agilelogger.C18778a.m45842a(r0)
            com.ss.android.ugc.aweme.analysis.a$1 r0 = new com.ss.android.ugc.aweme.analysis.a$1
            r0.<init>()
            java.util.List<com.ss.android.agilelogger.e> r1 = com.p683ss.android.agilelogger.C18778a.f51920g
            r1.add(r0)
            com.p683ss.android.agilelogger.C18778a.m45846a(r7)
            java.lang.String r7 = com.bytedance.ies.ugc.p694a.C11010c.m22295p()
            java.lang.String r0 = "local_test"
            boolean r7 = android.text.TextUtils.equals(r7, r0)
            if (r7 != 0) goto L_0x0079
            java.lang.String r7 = com.bytedance.ies.ugc.p694a.C11010c.m22295p()
            java.lang.String r0 = "local_test_av"
            boolean r7 = android.text.TextUtils.equals(r7, r0)
            if (r7 == 0) goto L_0x0077
            goto L_0x0079
        L_0x0077:
            r7 = 0
            goto L_0x007a
        L_0x0079:
            r7 = 1
        L_0x007a:
            com.p683ss.android.agilelogger.C18778a.f51916c = r7
            com.ss.android.ugc.aweme.analysis.b r7 = new com.ss.android.ugc.aweme.analysis.b
            r7.<init>()
            com.p683ss.p2544b.p2545a.C51151a.m110014a(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.analysis.C22579a.mo46947a(android.content.Context):void");
    }

    /* renamed from: a */
    public final void mo46949a(String str, Throwable th) {
        C18778a.m45845a(str, th);
    }

    /* renamed from: a */
    public final void mo46948a(String str, String str2, Exception exc) {
        C18778a.m45844a(str, str2, exc);
    }

    /* renamed from: a */
    public final void mo46946a(int i, String str, String str2) {
        switch (i) {
            case 2:
                C18778a.m45843a(str, str2);
                return;
            case 3:
                C18778a.m45848b(str, str2);
                return;
            case 4:
                C18778a.m45850c(str, str2);
                return;
            case 5:
                C18778a.m45852d(str, str2);
                break;
            case 6:
                C18778a.m45854e(str, str2);
                return;
        }
    }
}
