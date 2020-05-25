package com.p683ss.android.ugc.aweme.feed.p1736ui.masklayer2.p1737a;

import android.os.Bundle;
import com.p683ss.android.ugc.aweme.awemeservice.C23324d;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import com.p683ss.android.ugc.aweme.base.component.C23505g;
import com.p683ss.android.ugc.aweme.favorites.p1703c.C29686a;
import com.p683ss.android.ugc.aweme.favorites.p1703c.C29689c;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.p1736ui.masklayer2.C31051a;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.masklayer2.a.f */
public final class C31064f extends C31068i implements C29689c {

    /* renamed from: a */
    private C29686a f81318a;

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.masklayer2.a.f$a */
    static final class C31065a implements C23505g {

        /* renamed from: a */
        final /* synthetic */ C31064f f81319a;

        C31065a(C31064f fVar) {
            this.f81319a = fVar;
        }

        /* renamed from: a */
        public final void mo46280a(Bundle bundle) {
        }

        /* renamed from: a */
        public final void mo46279a() {
            this.f81319a.mo63848a();
        }
    }

    /* renamed from: a */
    public final void mo50570a(Exception exc) {
    }

    /* renamed from: a */
    public final void mo63848a() {
        String str;
        if (this.f81318a == null) {
            this.f81318a = new C29686a();
        }
        C29686a aVar = this.f81318a;
        if (aVar != null) {
            aVar.mo54800a(this);
        }
        C29686a aVar2 = this.f81318a;
        if (aVar2 != null) {
            Object[] objArr = new Object[3];
            int i = 0;
            objArr[0] = Integer.valueOf(2);
            Aweme aweme = this.f81322e;
            if (aweme != null) {
                str = aweme.getAid();
            } else {
                str = null;
            }
            objArr[1] = str;
            Aweme aweme2 = this.f81322e;
            if (aweme2 == null || !aweme2.isCollected()) {
                i = 1;
            }
            objArr[2] = Integer.valueOf(i);
            aVar2.mo44934a_(objArr);
        }
    }

    public C31064f(C31051a aVar) {
        C52711k.m112240b(aVar, "actionsManager");
        super(aVar);
    }

    /* renamed from: a */
    public final void mo50568a(BaseResponse baseResponse) {
        Aweme aweme = this.f81322e;
        if (aweme != null) {
            aweme.setCollectStatus(aweme.isCollected() ^ true ? 1 : 0);
            C23324d.m57378a().updateCollectStatus(aweme.getAid(), aweme.getCollectStatus());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x008f, code lost:
        if (r6 == null) goto L_0x0091;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo63838a(android.view.View r6) {
        /*
            r5 = this;
            java.lang.String r0 = "v"
            p2628d.p2639f.p2641b.C52711k.m112240b(r6, r0)
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r5.f81322e
            if (r0 == 0) goto L_0x0013
            boolean r0 = r0.isCollected()
            r1 = 1
            if (r0 != r1) goto L_0x0013
            java.lang.String r0 = "cancel_favourite_video"
            goto L_0x0015
        L_0x0013:
            java.lang.String r0 = "favourite_video"
        L_0x0015:
            com.ss.android.ugc.aweme.app.f.d r1 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
            java.lang.String r2 = "enter_from"
            java.lang.String r3 = r5.f81323f
            com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47829a(r2, r3)
            java.lang.String r2 = "group_id"
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r5.f81322e
            r4 = 0
            if (r3 == 0) goto L_0x002d
            java.lang.String r3 = r3.getAid()
            goto L_0x002e
        L_0x002d:
            r3 = r4
        L_0x002e:
            com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47829a(r2, r3)
            java.lang.String r2 = "author_id"
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r5.f81322e
            if (r3 == 0) goto L_0x003c
            java.lang.String r4 = r3.getAuthorUid()
        L_0x003c:
            com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47829a(r2, r4)
            java.lang.String r2 = "log_pb"
            com.ss.android.ugc.aweme.feed.aa r3 = com.p683ss.android.ugc.aweme.feed.C29981aa.m70153a()
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = r5.f81322e
            java.lang.String r4 = com.p683ss.android.ugc.aweme.p1382aq.C23198ae.m56857c(r4)
            java.lang.String r3 = r3.mo60161a(r4)
            com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47829a(r2, r3)
            java.lang.String r2 = "enter_method"
            java.lang.String r3 = "long_press"
            com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47829a(r2, r3)
            java.util.Map<java.lang.String, java.lang.String> r1 = r1.f61491a
            com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r0, r1)
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r5.f81322e
            boolean r0 = com.p683ss.android.ugc.aweme.commercialize.utils.C26503d.m64060c(r0)
            if (r0 == 0) goto L_0x0078
            android.content.Context r6 = r6.getContext()
            r0 = 2132541684(0x7f1c00f4, float:2.0736452E38)
            com.bytedance.ies.dmt.ui.d.a r6 = com.bytedance.ies.dmt.p664ui.p668d.C10691a.m21542b(r6, r0)
            r6.mo19066a()
            return
        L_0x0078:
            com.ss.android.ugc.aweme.IAccountUserService r6 = com.p683ss.android.ugc.aweme.account.C20902b.m53242a()
            java.lang.String r0 = "AccountUserProxyService.get()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r6, r0)
            boolean r6 = r6.isLogin()
            if (r6 != 0) goto L_0x00bc
            com.ss.android.ugc.aweme.feed.model.Aweme r6 = r5.f81322e
            if (r6 == 0) goto L_0x0091
            java.lang.String r6 = r6.getAid()
            if (r6 != 0) goto L_0x0093
        L_0x0091:
            java.lang.String r6 = ""
        L_0x0093:
            android.app.Activity r0 = com.bytedance.ies.ugc.p694a.C11016e.m22312g()
            java.lang.String r1 = r5.f81323f
            java.lang.String r2 = "click_favorite_video"
            com.ss.android.ugc.aweme.utils.ab r3 = com.p683ss.android.ugc.aweme.utils.C47661ab.m103163a()
            java.lang.String r4 = "group_id"
            com.ss.android.ugc.aweme.utils.ab r3 = r3.mo94972a(r4, r6)
            java.lang.String r4 = "log_pb"
            java.lang.String r6 = com.p683ss.android.ugc.aweme.p1382aq.C23198ae.m56874k(r6)
            com.ss.android.ugc.aweme.utils.ab r6 = r3.mo94972a(r4, r6)
            android.os.Bundle r6 = r6.f120139a
            com.ss.android.ugc.aweme.feed.ui.masklayer2.a.f$a r3 = new com.ss.android.ugc.aweme.feed.ui.masklayer2.a.f$a
            r3.<init>(r5)
            com.ss.android.ugc.aweme.base.component.g r3 = (com.p683ss.android.ugc.aweme.base.component.C23505g) r3
            com.p683ss.android.ugc.aweme.login.C27965f.m66721a(r0, r1, r2, r6, r3)
            return
        L_0x00bc:
            r5.mo63848a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.feed.p1736ui.masklayer2.p1737a.C31064f.mo63838a(android.view.View):void");
    }
}
