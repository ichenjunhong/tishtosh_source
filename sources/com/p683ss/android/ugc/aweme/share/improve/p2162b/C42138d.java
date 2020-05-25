package com.p683ss.android.ugc.aweme.share.improve.p2162b;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.p683ss.android.ugc.aweme.IAccountUserService;
import com.p683ss.android.ugc.aweme.account.C20902b;
import com.p683ss.android.ugc.aweme.awemeservice.C23324d;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.base.utils.C23723j;
import com.p683ss.android.ugc.aweme.commercialize.log.C26088l;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26512f;
import com.p683ss.android.ugc.aweme.feed.C30130ag;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.login.C27965f;
import com.p683ss.android.ugc.aweme.p1807im.C33194e;
import com.p683ss.android.ugc.aweme.p1807im.disableim.C33192c;
import com.p683ss.android.ugc.aweme.p1807im.disableim.ImUnder16Manger;
import com.p683ss.android.ugc.aweme.p1807im.service.share.C35475a;
import com.p683ss.android.ugc.aweme.share.improve.p2163c.C42149b;
import com.p683ss.android.ugc.aweme.sharer.C42318f;
import com.p683ss.android.ugc.aweme.sharer.p2172b.C42311c;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.SharePackage;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.share.improve.b.d */
public final class C42138d extends C42140e {

    /* renamed from: c */
    public static final C42139a f106600c = new C42139a(null);

    /* renamed from: a */
    public C35475a f106601a;

    /* renamed from: b */
    public boolean f106602b;

    /* renamed from: d */
    private final boolean f106603d;

    /* renamed from: e */
    private final SharePackage f106604e;

    /* renamed from: f */
    private final String f106605f;

    /* renamed from: g */
    private final int f106606g;

    /* renamed from: com.ss.android.ugc.aweme.share.improve.b.d$a */
    public static final class C42139a {
        private C42139a() {
        }

        public /* synthetic */ C42139a(C52707g gVar) {
            this();
        }
    }

    public C42138d(SharePackage sharePackage) {
        this(sharePackage, null, 0, 6, null);
    }

    /* renamed from: a */
    public final int mo86131a() {
        return R.drawable.cq6;
    }

    /* renamed from: b */
    public final String mo86136b() {
        return "chat_merge";
    }

    /* renamed from: e */
    public final int mo86140e() {
        return R.drawable.atn;
    }

    /* renamed from: c */
    public final String mo86137c() {
        String b = C23723j.m58219b(R.string.di_);
        C52711k.m112236a((Object) b, "ResUtils.getString(R.string.share_to_friend)");
        return b;
    }

    /* renamed from: a */
    public final void mo86139a(RemoteImageView remoteImageView, boolean z) {
        C52711k.m112240b(remoteImageView, "imageView");
        super.mo86139a(remoteImageView, z);
    }

    /* renamed from: a */
    public final boolean mo86132a(Context context, C42318f fVar) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(fVar, C42311c.f106865i);
        if (C33194e.m76277a(false) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo49947a(C42318f fVar, Context context) {
        C52711k.m112240b(fVar, C42311c.f106865i);
        C52711k.m112240b(context, "context");
        IAccountUserService a = C20902b.m53242a();
        C52711k.m112236a((Object) a, "AccountUserProxyService.get()");
        if (!a.isLogin()) {
            C27965f.m66719a(C42149b.m92512a(context), this.f106605f, "click_shareim_button");
            return true;
        } else if (ImUnder16Manger.m76252e()) {
            C33192c.m76259a();
            return true;
        } else if (!this.f106602b) {
            C10691a.m21542b(context, (int) R.string.dd1).mo19066a();
            return true;
        } else {
            Bundle bundle = new Bundle();
            if (C33194e.m76266c()) {
                C35475a aVar = this.f106601a;
                if (aVar != null && aVar.mo73278d() == 1 && this.f106603d) {
                    bundle.putInt("key_share_type", this.f106606g);
                }
            }
            bundle.putParcelable("share_package", this.f106604e);
            C33194e.m76279d().enterChooseContact(context, bundle, null);
            C30130ag.m70700a(mo86136b());
            long j = this.f106604e.f106900i.getLong("ad_id");
            if (j != 0) {
                Aweme rawAdAwemeByAdId = C23324d.m57378a().getRawAdAwemeByAdId(String.valueOf(j));
                if (C26512f.m64061d(rawAdAwemeByAdId)) {
                    C26088l.m63381r(context, rawAdAwemeByAdId);
                }
            }
            return true;
        }
    }

    /* JADX INFO: used method not loaded: com.ss.android.ugc.aweme.im.service.g.f.a(java.lang.String):null, types can be incorrect */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x004d, code lost:
        if (r8.mo72374a(r6.f106604e.f106895d) == 0) goto L_0x0051;
     */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x003f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C42138d(com.p683ss.android.ugc.aweme.sharer.p2173ui.SharePackage r7, java.lang.String r8, int r9) {
        /*
            r6 = this;
            java.lang.String r0 = "sharePackage"
            p2628d.p2639f.p2641b.C52711k.m112240b(r7, r0)
            java.lang.String r0 = "enterFrom"
            p2628d.p2639f.p2641b.C52711k.m112240b(r8, r0)
            r6.<init>()
            r6.f106604e = r7
            r6.f106605f = r8
            r6.f106606g = r9
            com.ss.android.ugc.aweme.im.service.IIMService r7 = com.p683ss.android.ugc.aweme.p1807im.C33194e.m76279d()
            if (r7 == 0) goto L_0x0033
            com.ss.android.ugc.aweme.im.service.g.f r7 = r7.getShareService()
            if (r7 == 0) goto L_0x0033
            com.ss.android.ugc.aweme.im.service.share.b.b r8 = new com.ss.android.ugc.aweme.im.service.share.b.b
            android.content.Context r1 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()
            com.ss.android.ugc.aweme.sharer.ui.SharePackage r2 = r6.f106604e
            r3 = 0
            r4 = 4
            r5 = 0
            r0 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            com.ss.android.ugc.aweme.im.service.share.a r7 = r7.mo72377a(r8)
            goto L_0x0034
        L_0x0033:
            r7 = 0
        L_0x0034:
            r6.f106601a = r7
            r7 = 1
            r6.f106602b = r7
            com.ss.android.ugc.aweme.im.service.IIMService r8 = com.p683ss.android.ugc.aweme.p1807im.C33194e.m76279d()
            if (r8 == 0) goto L_0x0050
            com.ss.android.ugc.aweme.im.service.g.f r8 = r8.getShareService()
            if (r8 == 0) goto L_0x0050
            com.ss.android.ugc.aweme.sharer.ui.SharePackage r9 = r6.f106604e
            java.lang.String r9 = r9.f106895d
            int r8 = r8.mo72374a(r9)
            if (r8 != 0) goto L_0x0050
            goto L_0x0051
        L_0x0050:
            r7 = 0
        L_0x0051:
            r6.f106603d = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.share.improve.p2162b.C42138d.<init>(com.ss.android.ugc.aweme.sharer.ui.SharePackage, java.lang.String, int):void");
    }

    public /* synthetic */ C42138d(SharePackage sharePackage, String str, int i, int i2, C52707g gVar) {
        this(sharePackage, "", -1);
    }
}
