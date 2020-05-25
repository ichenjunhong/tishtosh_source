package com.p683ss.android.ugc.aweme.notification.p2016f;

import com.p683ss.android.ugc.aweme.notice.repo.list.bean.NoticeResponse;
import com.p683ss.android.ugc.aweme.notification.api.NoticeApiManager;
import com.p683ss.android.ugc.aweme.p1807im.service.p1906h.C35456b;
import com.p683ss.android.ugc.aweme.p2108r.p2109a.C41049a;
import p064c.p065a.C1674ab;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p093k.C2168a;

/* renamed from: com.ss.android.ugc.aweme.notification.f.d */
public abstract class C38188d extends C35456b {
    /* renamed from: g */
    public int mo78184g() {
        return -1;
    }

    /* renamed from: f */
    public void mo78183f() {
        int g = mo78184g();
        if (g == 16 || g == 19 || g == 47 || g == 60 || g == 65 || g == 67) {
            C41049a.m90714a().markSessionInMsgHelperRead(mo78184g(), this.f91119j);
        }
    }

    /* renamed from: i */
    public final void mo78186i() {
        NoticeApiManager.m85269a(Integer.valueOf(mo78184g())).mo6529b(C2168a.m6522c()).mo6514a(C1667a.m5940a()).mo6314a((C1674ab<? super T>) new C1674ab<NoticeResponse>() {
            public final void onComplete() {
            }

            public final void onError(Throwable th) {
            }

            public final /* bridge */ /* synthetic */ void onNext(Object obj) {
            }

            /* JADX WARNING: Code restructure failed: missing block: B:8:0x0060, code lost:
                if ((!p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r2, (java.lang.Object) r3.getCurUserId())) != false) goto L_0x0062;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void onSubscribe(p064c.p065a.p069b.C1690c r6) {
                /*
                    r5 = this;
                    com.ss.android.ugc.aweme.notification.f.d r6 = com.p683ss.android.ugc.aweme.notification.p2016f.C38188d.this
                    int r6 = r6.mo78184g()
                    com.ss.android.ugc.aweme.notification.f.d r0 = com.p683ss.android.ugc.aweme.notification.p2016f.C38188d.this
                    java.lang.String r0 = r0.bm_()
                    java.lang.String r1 = "session"
                    p2628d.p2639f.p2641b.C52711k.m112240b(r0, r1)
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    java.lang.String r2 = "Delete notice session("
                    r1.<init>(r2)
                    r1.append(r6)
                    java.lang.String r6 = ", "
                    r1.append(r6)
                    r1.append(r0)
                    java.lang.String r6 = ") in IM list."
                    r1.append(r6)
                    java.lang.String r6 = r1.toString()
                    com.p683ss.android.ugc.aweme.notification.C38208h.C38209a.m85379a(r6)
                    com.ss.android.ugc.aweme.notification.f.d r6 = com.p683ss.android.ugc.aweme.notification.p2016f.C38188d.this
                    int r6 = r6.mo78184g()
                    com.ss.android.ugc.aweme.notification.f.d r0 = com.p683ss.android.ugc.aweme.notification.p2016f.C38188d.this
                    long r0 = r0.f91118i
                    r2 = 1000(0x3e8, double:4.94E-321)
                    long r0 = r0 / r2
                    java.util.Map<java.lang.Integer, java.lang.Long> r2 = com.p683ss.android.ugc.aweme.notification.C38213i.C38214a.f97284d
                    if (r2 == 0) goto L_0x0062
                    java.lang.String r2 = com.p683ss.android.ugc.aweme.notification.C38213i.C38214a.f97281a
                    if (r2 == 0) goto L_0x0062
                    java.lang.String r2 = com.p683ss.android.ugc.aweme.notification.C38213i.C38214a.f97281a
                    if (r2 != 0) goto L_0x004d
                    java.lang.String r3 = "mUserId"
                    p2628d.p2639f.p2641b.C52711k.m112237a(r3)
                L_0x004d:
                    com.ss.android.ugc.aweme.IAccountUserService r3 = com.p683ss.android.ugc.aweme.account.C20854a.m53167g()
                    java.lang.String r4 = "AccountProxyService.userService()"
                    p2628d.p2639f.p2641b.C52711k.m112236a(r3, r4)
                    java.lang.String r3 = r3.getCurUserId()
                    boolean r2 = p2628d.p2639f.p2641b.C52711k.m112239a(r2, r3)
                    r2 = r2 ^ 1
                    if (r2 == 0) goto L_0x007b
                L_0x0062:
                    com.ss.android.ugc.aweme.IAccountUserService r2 = com.p683ss.android.ugc.aweme.account.C20854a.m53167g()
                    java.lang.String r3 = "AccountProxyService.userService()"
                    p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)
                    java.lang.String r2 = r2.getCurUserId()
                    java.lang.String r3 = "AccountProxyService.userService().curUserId"
                    p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)
                    com.p683ss.android.ugc.aweme.notification.C38213i.C38214a.f97281a = r2
                    com.ss.android.ugc.aweme.notification.i$a r2 = com.p683ss.android.ugc.aweme.notification.C38213i.C38214a.f97285e
                    r2.mo78201b()
                L_0x007b:
                    java.util.Map<java.lang.Integer, java.lang.Long> r2 = com.p683ss.android.ugc.aweme.notification.C38213i.C38214a.f97284d
                    if (r2 != 0) goto L_0x0084
                    java.lang.String r3 = "mCurrentNoticeMap"
                    p2628d.p2639f.p2641b.C52711k.m112237a(r3)
                L_0x0084:
                    java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
                    java.lang.Long r0 = java.lang.Long.valueOf(r0)
                    r2.put(r6, r0)
                    com.ss.android.ugc.aweme.notification.i$a r6 = com.p683ss.android.ugc.aweme.notification.C38213i.C38214a.f97285e
                    com.ss.android.ugc.aweme.notification.h.a.a r6 = r6.mo78200a()
                    com.google.gson.f r0 = com.p683ss.android.ugc.aweme.notification.C38213i.C38214a.f97282b
                    java.util.Map<java.lang.Integer, java.lang.Long> r1 = com.p683ss.android.ugc.aweme.notification.C38213i.C38214a.f97284d
                    if (r1 != 0) goto L_0x00a0
                    java.lang.String r2 = "mCurrentNoticeMap"
                    p2628d.p2639f.p2641b.C52711k.m112237a(r2)
                L_0x00a0:
                    java.lang.reflect.Type r2 = com.p683ss.android.ugc.aweme.notification.C38213i.C38214a.f97283c
                    java.lang.String r0 = r0.mo34890b(r1, r2)
                    r1 = 0
                    r6.mo78199a(r0, r1)
                    com.ss.android.ugc.aweme.im.service.IIMService r6 = com.p683ss.android.ugc.aweme.p2108r.p2109a.C41049a.m90714a()
                    com.ss.android.ugc.aweme.notification.f.d r0 = com.p683ss.android.ugc.aweme.notification.p2016f.C38188d.this
                    r6.deleteNoticeSession(r0)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.notification.p2016f.C38188d.C381891.onSubscribe(c.a.b.c):void");
            }
        });
    }
}
