package com.p683ss.android.ugc.aweme.feed;

import com.p683ss.android.ugc.aweme.C27989z;
import com.p683ss.android.ugc.aweme.familiar.service.C29650b;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.p1730m.C30471a;
import p064c.p065a.C2201v;
import p064c.p065a.C2205y;
import p064c.p065a.p093k.C2168a;

/* renamed from: com.ss.android.ugc.aweme.feed.b */
public final class C30158b {

    /* renamed from: a */
    private static C30471a f78720a;

    /* renamed from: a */
    public static void m70765a(Aweme aweme) {
        if (aweme != null && C27989z.f73414b.mo56386a().mo44458a() && C29650b.f77509a.browseRecordNeedFamiliarUpload()) {
            C2201v.m6601a((C2205y<T>) new C30160c<T>(aweme)).mo6529b(C2168a.m6521b()).mo6551j();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0020  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m70764a(int r3, java.lang.String r4, int r5, com.p683ss.android.ugc.aweme.feed.model.Aweme r6) {
        /*
            com.ss.android.ugc.aweme.familiar.service.b r0 = com.p683ss.android.ugc.aweme.familiar.service.C29650b.f77509a
            boolean r0 = r0.browseRecordNeedAwemeStatsUpload()
            r1 = -1
            if (r0 != 0) goto L_0x001a
            if (r6 == 0) goto L_0x001a
            com.ss.android.ugc.aweme.profile.model.User r6 = r6.getAuthor()
            if (r6 == 0) goto L_0x001a
            int r0 = r6.getFollowStatus()
            int r6 = r6.getFollowerStatus()
            goto L_0x001c
        L_0x001a:
            r6 = -1
            r0 = -1
        L_0x001c:
            com.ss.android.ugc.aweme.feed.m.a r2 = f78720a
            if (r2 != 0) goto L_0x0027
            com.ss.android.ugc.aweme.feed.m.a r2 = new com.ss.android.ugc.aweme.feed.m.a
            r2.<init>()
            f78720a = r2
        L_0x0027:
            com.ss.android.ugc.aweme.feed.m.c$a r2 = new com.ss.android.ugc.aweme.feed.m.c$a
            r2.<init>()
            com.ss.android.ugc.aweme.feed.m.c$a r4 = r2.mo60897a(r4)
            r2 = 1
            r4.f79634a = r2
            r4.f79636c = r0
            r4.f79637d = r6
            com.ss.android.ugc.aweme.feed.m.c$a r4 = r4.mo60899b(r5)
            r5 = 0
            switch(r3) {
                case 0: goto L_0x005a;
                case 1: goto L_0x0058;
                case 2: goto L_0x0056;
                case 7: goto L_0x0056;
                case 22: goto L_0x0053;
                case 1000: goto L_0x0051;
                case 1001: goto L_0x004f;
                case 2000: goto L_0x0051;
                case 2001: goto L_0x004f;
                case 3002: goto L_0x004d;
                case 3003: goto L_0x004a;
                case 4000: goto L_0x0048;
                case 4001: goto L_0x0045;
                case 5000: goto L_0x0043;
                case 8000: goto L_0x0040;
                default: goto L_0x003f;
            }
        L_0x003f:
            goto L_0x005b
        L_0x0040:
            r1 = 20
            goto L_0x005b
        L_0x0043:
            r1 = 7
            goto L_0x005b
        L_0x0045:
            r1 = 8
            goto L_0x005b
        L_0x0048:
            r1 = 6
            goto L_0x005b
        L_0x004a:
            r1 = 9
            goto L_0x005b
        L_0x004d:
            r1 = 5
            goto L_0x005b
        L_0x004f:
            r1 = 4
            goto L_0x005b
        L_0x0051:
            r1 = 3
            goto L_0x005b
        L_0x0053:
            r1 = 10
            goto L_0x005b
        L_0x0056:
            r1 = 2
            goto L_0x005b
        L_0x0058:
            r1 = 1
            goto L_0x005b
        L_0x005a:
            r1 = 0
        L_0x005b:
            r4.mo60901c(r1)
            com.ss.android.ugc.aweme.feed.m.a r3 = f78720a
            java.lang.Object[] r6 = new java.lang.Object[r2]
            com.ss.android.ugc.aweme.feed.m.c r4 = r4.mo60898a()
            r6[r5] = r4
            r3.sendRequest(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.feed.C30158b.m70764a(int, java.lang.String, int, com.ss.android.ugc.aweme.feed.model.Aweme):void");
    }
}
