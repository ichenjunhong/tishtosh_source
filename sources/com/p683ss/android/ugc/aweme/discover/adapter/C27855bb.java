package com.p683ss.android.ugc.aweme.discover.adapter;

import android.content.Context;
import android.support.p030v4.app.C0654k;
import android.support.p030v4.app.Fragment;
import android.view.ViewGroup;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.abmock.C10193n;
import com.p683ss.android.ugc.aweme.discover.abtest.DynamicSearchTabTitle;
import com.p683ss.android.ugc.aweme.discover.abtest.modules.SearchTabTitle;
import com.p683ss.android.ugc.aweme.discover.p1659ui.C28550bj;
import com.p683ss.android.ugc.aweme.discover.p1659ui.C28570bk;
import com.p683ss.android.ugc.aweme.discover.p1659ui.C28608ca;
import com.p683ss.android.ugc.aweme.p1402b.C23343a;
import com.p683ss.android.ugc.aweme.p1402b.C23346d;
import com.p683ss.android.ugc.aweme.search.model.C41440e;
import com.p683ss.android.ugc.aweme.search.performance.C41457i;
import com.p683ss.android.ugc.aweme.search.performance.C41460j;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.bb */
public final class C27855bb<T extends Fragment> extends C27935z<T> {

    /* renamed from: a */
    public T f73183a;

    /* renamed from: d */
    private Context f73184d;

    /* renamed from: e */
    private C41440e f73185e;

    /* renamed from: f */
    private SearchTabTitle f73186f;

    /* renamed from: a */
    public final C27855bb mo56277a(C41440e eVar) {
        this.f73185e = eVar;
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final Fragment mo56278c(int i) {
        if (i == C28608ca.f75134b && (this.f73184d instanceof C23346d)) {
            C23346d dVar = (C23346d) this.f73184d;
            C52711k.m112240b(dVar, "inflaterOwner");
            if (C41457i.f105090b.mo84198b()) {
                C23343a.m57406a().post(new C41460j(dVar));
            }
        }
        C28550bj a = C28570bk.m67782a(this.f73185e, i);
        a.f74966r = i;
        return a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0053 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0054  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.CharSequence getPageTitle(int r8) {
        /*
            r7 = this;
            com.ss.android.ugc.aweme.discover.abtest.modules.SearchTabTitle r0 = r7.f73186f
            if (r0 == 0) goto L_0x004c
            int r0 = com.p683ss.android.ugc.aweme.discover.p1659ui.C28608ca.f75134b
            if (r8 != r0) goto L_0x000d
            com.ss.android.ugc.aweme.discover.abtest.modules.SearchTabTitle r0 = r7.f73186f
            java.lang.String r0 = r0.general
            goto L_0x004d
        L_0x000d:
            int r0 = com.p683ss.android.ugc.aweme.discover.p1659ui.C28608ca.f75136d
            if (r8 != r0) goto L_0x0016
            com.ss.android.ugc.aweme.discover.abtest.modules.SearchTabTitle r0 = r7.f73186f
            java.lang.String r0 = r0.user
            goto L_0x004d
        L_0x0016:
            int r0 = com.p683ss.android.ugc.aweme.discover.p1659ui.C28608ca.f75138f
            if (r8 != r0) goto L_0x001f
            com.ss.android.ugc.aweme.discover.abtest.modules.SearchTabTitle r0 = r7.f73186f
            java.lang.String r0 = r0.music
            goto L_0x004d
        L_0x001f:
            int r0 = com.p683ss.android.ugc.aweme.discover.p1659ui.C28608ca.f75139g
            if (r8 != r0) goto L_0x0028
            com.ss.android.ugc.aweme.discover.abtest.modules.SearchTabTitle r0 = r7.f73186f
            java.lang.String r0 = r0.challenge
            goto L_0x004d
        L_0x0028:
            int r0 = com.p683ss.android.ugc.aweme.discover.p1659ui.C28608ca.f75135c
            if (r8 != r0) goto L_0x0031
            com.ss.android.ugc.aweme.discover.abtest.modules.SearchTabTitle r0 = r7.f73186f
            java.lang.String r0 = r0.video
            goto L_0x004d
        L_0x0031:
            int r0 = com.p683ss.android.ugc.aweme.discover.p1659ui.C28608ca.f75137e
            if (r8 != r0) goto L_0x003a
            com.ss.android.ugc.aweme.discover.abtest.modules.SearchTabTitle r0 = r7.f73186f
            java.lang.String r0 = r0.poi
            goto L_0x004d
        L_0x003a:
            int r0 = com.p683ss.android.ugc.aweme.discover.p1659ui.C28608ca.f75140h
            if (r8 != r0) goto L_0x0043
            com.ss.android.ugc.aweme.discover.abtest.modules.SearchTabTitle r0 = r7.f73186f
            java.lang.String r0 = r0.commodity
            goto L_0x004d
        L_0x0043:
            int r0 = com.p683ss.android.ugc.aweme.discover.p1659ui.C28608ca.f75141i
            if (r8 != r0) goto L_0x004c
            com.ss.android.ugc.aweme.discover.abtest.modules.SearchTabTitle r0 = r7.f73186f
            java.lang.String r0 = r0.live
            goto L_0x004d
        L_0x004c:
            r0 = 0
        L_0x004d:
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L_0x0054
            return r0
        L_0x0054:
            int r0 = com.p683ss.android.ugc.aweme.discover.p1659ui.C28608ca.f75134b
            if (r8 != r0) goto L_0x0062
            android.content.Context r8 = r7.f73184d
            r0 = 2132546539(0x7f1c13eb, float:2.0746299E38)
            java.lang.String r8 = r8.getString(r0)
            return r8
        L_0x0062:
            int r0 = com.p683ss.android.ugc.aweme.discover.p1659ui.C28608ca.f75136d
            if (r8 != r0) goto L_0x0070
            android.content.Context r8 = r7.f73184d
            r0 = 2132551722(0x7f1c282a, float:2.0756811E38)
            java.lang.String r8 = r8.getString(r0)
            return r8
        L_0x0070:
            int r0 = com.p683ss.android.ugc.aweme.discover.p1659ui.C28608ca.f75138f
            if (r8 != r0) goto L_0x007e
            android.content.Context r8 = r7.f73184d
            r0 = 2132546806(0x7f1c14f6, float:2.074684E38)
            java.lang.String r8 = r8.getString(r0)
            return r8
        L_0x007e:
            int r0 = com.p683ss.android.ugc.aweme.discover.p1659ui.C28608ca.f75139g
            if (r8 != r0) goto L_0x008c
            android.content.Context r8 = r7.f73184d
            r0 = 2132542605(0x7f1c048d, float:2.073832E38)
            java.lang.String r8 = r8.getString(r0)
            return r8
        L_0x008c:
            int r0 = com.p683ss.android.ugc.aweme.discover.p1659ui.C28608ca.f75135c
            if (r8 != r0) goto L_0x009e
            android.content.Context r8 = r7.f73184d
            r0 = 2132548651(0x7f1c1c2b, float:2.0750582E38)
            java.lang.String r8 = r8.getString(r0)
            java.lang.String r8 = r8.toUpperCase()
            return r8
        L_0x009e:
            int r0 = com.p683ss.android.ugc.aweme.discover.p1659ui.C28608ca.f75137e
            if (r8 != r0) goto L_0x00ac
            android.content.Context r8 = r7.f73184d
            r0 = 2132548731(0x7f1c1c7b, float:2.0750745E38)
            java.lang.String r8 = r8.getString(r0)
            return r8
        L_0x00ac:
            int r0 = com.p683ss.android.ugc.aweme.discover.p1659ui.C28608ca.f75140h
            if (r8 != r0) goto L_0x00d7
            com.bytedance.ies.abmock.b r1 = com.bytedance.ies.abmock.C10181b.m20511a()
            java.lang.Class<com.ss.android.ugc.aweme.discover.abtest.SearchCommodityAB> r2 = com.p683ss.android.ugc.aweme.discover.abtest.SearchCommodityAB.class
            r3 = 1
            java.lang.String r4 = "merchandise_search_style"
            r5 = 31744(0x7c00, float:4.4483E-41)
            r6 = 0
            int r8 = r1.mo18168a(r2, r3, r4, r5, r6)
            r0 = 1
            if (r8 != r0) goto L_0x00cd
            android.content.Context r8 = r7.f73184d
            r0 = 2132544260(0x7f1c0b04, float:2.0741676E38)
            java.lang.String r8 = r8.getString(r0)
            return r8
        L_0x00cd:
            android.content.Context r8 = r7.f73184d
            r0 = 2132548659(0x7f1c1c33, float:2.0750599E38)
            java.lang.String r8 = r8.getString(r0)
            return r8
        L_0x00d7:
            int r0 = com.p683ss.android.ugc.aweme.discover.p1659ui.C28608ca.f75141i
            if (r8 != r0) goto L_0x00e5
            android.content.Context r8 = r7.f73184d
            r0 = 2132548686(0x7f1c1c4e, float:2.0750653E38)
            java.lang.String r8 = r8.getString(r0)
            return r8
        L_0x00e5:
            java.lang.CharSequence r8 = super.getPageTitle(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.discover.adapter.C27855bb.getPageTitle(int):java.lang.CharSequence");
    }

    public final void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
        this.f73183a = (Fragment) obj;
        super.setPrimaryItem(viewGroup, i, obj);
    }

    public C27855bb(C0654k kVar, Context context, int i) {
        super(kVar, i);
        this.f73184d = context;
        try {
            this.f73186f = (SearchTabTitle) C10193n.m20607a().mo18202a(DynamicSearchTabTitle.class, "dynamic_search_result_tab_title", C10181b.m20511a().mo18175c().getDynamicSearchResultTabTitle(), "com.ss.android.ugc.aweme.discover.abtest.modules.SearchTabTitle", SearchTabTitle.class);
        } catch (Throwable unused) {
            this.f73186f = null;
        }
    }
}
