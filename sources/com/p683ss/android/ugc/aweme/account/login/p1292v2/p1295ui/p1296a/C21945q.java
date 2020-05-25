package com.p683ss.android.ugc.aweme.account.login.p1292v2.p1295ui.p1296a;

import android.os.Bundle;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.view.ViewPager.C0997e;
import android.view.View;
import com.bytedance.ies.dmt.p664ui.widget.tablayout.DmtTabLayout.C10736b;
import com.bytedance.ies.dmt.p664ui.widget.tablayout.DmtTabLayout.C10742f;
import com.p683ss.android.ugc.aweme.account.login.C21055ac;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21848h;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21850i;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1295ui.C21861a;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1295ui.C22016n;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1295ui.C22016n.C22017a;
import com.p683ss.android.ugc.aweme.account.p1260a.p1262b.C20856a;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.views.RtlViewPager;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52857u;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.q */
public final class C21945q extends C21868b {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f59349a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C21945q.class), "phoneTabFragment", "getPhoneTabFragment()Lcom/ss/android/ugc/aweme/account/login/v2/ui/PhoneEmailTabAdapter$TabFragment;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C21945q.class), "emailTabFragment", "getEmailTabFragment()Lcom/ss/android/ugc/aweme/account/login/v2/ui/PhoneEmailTabAdapter$TabFragment;"))};

    /* renamed from: d */
    public static final C21946a f59350d = new C21946a(null);

    /* renamed from: b */
    public int f59351b = -1;

    /* renamed from: c */
    public boolean f59352c = true;

    /* renamed from: e */
    private C22016n f59353e;

    /* renamed from: j */
    private final C52668f f59354j = C52732g.m112285a(new C21950e(this));

    /* renamed from: k */
    private final C52668f f59355k = C52732g.m112285a(new C21947b(this));

    /* renamed from: p */
    private HashMap f59356p;

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.q$a */
    public static final class C21946a {
        private C21946a() {
        }

        public /* synthetic */ C21946a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.q$b */
    static final class C21947b extends C52712l implements C52670a<C22017a> {

        /* renamed from: a */
        final /* synthetic */ C21945q f59357a;

        C21947b(C21945q qVar) {
            this.f59357a = qVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C21883g gVar = new C21883g();
            gVar.setArguments(new Bundle(this.f59357a.getArguments()));
            Bundle arguments = gVar.getArguments();
            if (arguments == null) {
                C52711k.m112234a();
            }
            arguments.putInt("current_page", C21850i.INPUT_EMAIL_LOGIN.getValue());
            Bundle arguments2 = gVar.getArguments();
            if (arguments2 == null) {
                C52711k.m112234a();
            }
            arguments2.remove("next_page");
            Fragment fragment = gVar;
            String string = this.f59357a.getString(R.string.fxg);
            C52711k.m112236a((Object) string, "getString(R.string.common_login_email_input_tab)");
            return new C22017a(fragment, string);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.q$c */
    public static final class C21948c implements C0997e {

        /* renamed from: a */
        final /* synthetic */ C21945q f59358a;

        public final void onPageScrolled(int i, float f, int i2) {
        }

        C21948c(C21945q qVar) {
            this.f59358a = qVar;
        }

        public final void onPageSelected(int i) {
            String str;
            this.f59358a.f59351b = i;
            C21861a aVar = this.f59358a.f59207n;
            if (aVar == null) {
                C52711k.m112234a();
            }
            if (this.f59358a.mo46036u()) {
                str = "phone_login_homepage";
            } else {
                str = "email_login_homepage";
            }
            aVar.f59185g = str;
        }

        public final void onPageScrollStateChanged(int i) {
            String str;
            if (i == 2) {
                if (!this.f59358a.f59352c) {
                    this.f59358a.f59352c = true;
                    return;
                }
                RtlViewPager rtlViewPager = (RtlViewPager) this.f59358a.mo44862a(R.id.eo_);
                C52711k.m112236a((Object) rtlViewPager, "phoneEmailLoginPager");
                if (rtlViewPager.getCurrentItem() != this.f59358a.f59351b) {
                    if (this.f59358a.mo46036u()) {
                        str = "switch_to_phone";
                    } else {
                        str = "switch_to_email";
                    }
                    C26890h.m65011a(str, new C20856a().mo44776a("enter_method", this.f59358a.mo45967m()).mo44776a("enter_type", "slide").f56798a);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.q$d */
    static final class C21949d implements C10736b {

        /* renamed from: a */
        final /* synthetic */ C21945q f59359a;

        C21949d(C21945q qVar) {
            this.f59359a = qVar;
        }

        /* renamed from: a */
        public final void mo19399a(C10742f fVar) {
            String str;
            this.f59359a.f59352c = false;
            C52711k.m112236a((Object) fVar, "it");
            if (fVar.f28860e == 0) {
                str = "switch_to_phone";
            } else {
                str = "switch_to_email";
            }
            C26890h.m65011a(str, new C20856a().mo44776a("enter_method", this.f59359a.mo45967m()).mo44776a("enter_type", "click").f56798a);
            RtlViewPager rtlViewPager = (RtlViewPager) this.f59359a.mo44862a(R.id.eo_);
            C52711k.m112236a((Object) rtlViewPager, "phoneEmailLoginPager");
            rtlViewPager.setCurrentItem(fVar.f28860e);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.q$e */
    static final class C21950e extends C52712l implements C52670a<C22017a> {

        /* renamed from: a */
        final /* synthetic */ C21945q f59360a;

        C21950e(C21945q qVar) {
            this.f59360a = qVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C21957s sVar = new C21957s();
            sVar.setArguments(new Bundle(this.f59360a.getArguments()));
            Bundle arguments = sVar.getArguments();
            if (arguments == null) {
                C52711k.m112234a();
            }
            arguments.putInt("current_page", C21850i.INPUT_PHONE_LOGIN.getValue());
            Bundle arguments2 = sVar.getArguments();
            if (arguments2 == null) {
                C52711k.m112234a();
            }
            arguments2.putInt("current_scene", sVar.mo45970p().getValue());
            Bundle arguments3 = sVar.getArguments();
            if (arguments3 == null) {
                C52711k.m112234a();
            }
            arguments3.remove("next_page");
            Fragment fragment = sVar;
            String string = this.f59360a.getString(R.string.cbi);
            C52711k.m112236a((Object) string, "getString(R.string.mus_phone)");
            return new C22017a(fragment, string);
        }
    }

    /* renamed from: v */
    private final C22017a m54679v() {
        return (C22017a) this.f59354j.getValue();
    }

    /* renamed from: w */
    private final C22017a m54680w() {
        return (C22017a) this.f59355k.getValue();
    }

    /* renamed from: a */
    public final View mo44862a(int i) {
        if (this.f59356p == null) {
            this.f59356p = new HashMap();
        }
        View view = (View) this.f59356p.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f59356p.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: a */
    public final void mo45582a(int i, String str) {
        C52711k.m112240b(str, "message");
    }

    public final void ad_() {
    }

    /* renamed from: e */
    public final void mo45584e() {
    }

    /* renamed from: g */
    public final void mo44866g() {
        if (this.f59356p != null) {
            this.f59356p.clear();
        }
    }

    /* renamed from: i */
    public final int mo45585i() {
        return R.layout.b0x;
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo44866g();
    }

    /* renamed from: j */
    public final boolean mo46035j() {
        C22017a aVar;
        if (this.f59351b == 0) {
            aVar = m54679v();
        } else {
            aVar = m54680w();
        }
        Fragment fragment = aVar.f59492a;
        if (fragment != null) {
            return ((C21055ac) fragment).ai_();
        }
        throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.NeedCancelThisLoginMethod");
    }

    /* renamed from: u */
    public final boolean mo46036u() {
        RtlViewPager rtlViewPager = (RtlViewPager) mo44862a(R.id.eo_);
        C52711k.m112236a((Object) rtlViewPager, "phoneEmailLoginPager");
        if (rtlViewPager.getCurrentItem() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: U_ */
    public final C21861a mo44860U_() {
        boolean z;
        String string = getString(R.string.afb);
        String str = "phone_login_homepage";
        if (mo45970p() != C21848h.RECOVER_ACCOUNT) {
            z = true;
        } else {
            z = false;
        }
        C21861a aVar = new C21861a(string, null, false, null, null, false, str, z, false, 318, null);
        return aVar;
    }

    public final void onStart() {
        int i;
        super.onStart();
        if (this.f59351b != -1) {
            i = this.f59351b;
        } else {
            Bundle arguments = getArguments();
            if (arguments == null || arguments.getInt("child_page") != C21850i.INPUT_EMAIL_LOGIN.getValue()) {
                i = 0;
            } else {
                i = 1;
            }
        }
        if (this.f59351b != i) {
            if (this.f59351b != -1) {
                this.f59352c = false;
            }
            this.f59351b = i;
            RtlViewPager rtlViewPager = (RtlViewPager) mo44862a(R.id.eo_);
            C52711k.m112236a((Object) rtlViewPager, "phoneEmailLoginPager");
            rtlViewPager.setCurrentItem(i);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r3, android.os.Bundle r4) {
        /*
            r2 = this;
            java.lang.String r0 = "view"
            p2628d.p2639f.p2641b.C52711k.m112240b(r3, r0)
            super.onViewCreated(r3, r4)
            com.ss.android.ugc.aweme.account.login.v2.ui.n r3 = new com.ss.android.ugc.aweme.account.login.v2.ui.n
            android.support.v4.app.k r4 = r2.getChildFragmentManager()
            r3.<init>(r4)
            r2.f59353e = r3
            com.ss.android.ugc.aweme.account.login.v2.ui.n r3 = r2.f59353e
            if (r3 != 0) goto L_0x001c
            java.lang.String r4 = "tabAdapter"
            p2628d.p2639f.p2641b.C52711k.m112237a(r4)
        L_0x001c:
            com.ss.android.ugc.aweme.account.login.v2.ui.n$a r4 = r2.m54679v()
            r3.mo46078a(r4)
            com.ss.android.ugc.aweme.account.login.v2.ui.n r3 = r2.f59353e
            if (r3 != 0) goto L_0x002c
            java.lang.String r4 = "tabAdapter"
            p2628d.p2639f.p2641b.C52711k.m112237a(r4)
        L_0x002c:
            com.ss.android.ugc.aweme.account.login.v2.ui.n$a r4 = r2.m54680w()
            r3.mo46078a(r4)
            r3 = 2132021555(0x7f141133, float:1.9681505E38)
            android.view.View r4 = r2.mo44862a(r3)
            com.ss.android.ugc.aweme.views.RtlViewPager r4 = (com.p683ss.android.ugc.aweme.views.RtlViewPager) r4
            java.lang.String r0 = "phoneEmailLoginPager"
            p2628d.p2639f.p2641b.C52711k.m112236a(r4, r0)
            com.ss.android.ugc.aweme.account.login.v2.ui.n r0 = r2.f59353e
            if (r0 != 0) goto L_0x004a
            java.lang.String r1 = "tabAdapter"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x004a:
            android.support.v4.view.PagerAdapter r0 = (android.support.p030v4.view.PagerAdapter) r0
            r4.setAdapter(r0)
            r4 = 2132021556(0x7f141134, float:1.9681507E38)
            android.view.View r0 = r2.mo44862a(r4)
            com.bytedance.ies.dmt.ui.widget.tablayout.DmtTabLayout r0 = (com.bytedance.ies.dmt.p664ui.widget.tablayout.DmtTabLayout) r0
            android.view.View r1 = r2.mo44862a(r3)
            com.ss.android.ugc.aweme.views.RtlViewPager r1 = (com.p683ss.android.ugc.aweme.views.RtlViewPager) r1
            r0.setupWithViewPager(r1)
            android.view.View r3 = r2.mo44862a(r3)
            com.ss.android.ugc.aweme.views.RtlViewPager r3 = (com.p683ss.android.ugc.aweme.views.RtlViewPager) r3
            com.ss.android.ugc.aweme.account.login.v2.ui.a.q$c r0 = new com.ss.android.ugc.aweme.account.login.v2.ui.a.q$c
            r0.<init>(r2)
            android.support.v4.view.ViewPager$e r0 = (android.support.p030v4.view.ViewPager.C0997e) r0
            r3.addOnPageChangeListener(r0)
            android.view.View r3 = r2.mo44862a(r4)
            com.bytedance.ies.dmt.ui.widget.tablayout.DmtTabLayout r3 = (com.bytedance.ies.dmt.p664ui.widget.tablayout.DmtTabLayout) r3
            com.ss.android.ugc.aweme.account.login.v2.ui.a.q$d r0 = new com.ss.android.ugc.aweme.account.login.v2.ui.a.q$d
            r0.<init>(r2)
            com.bytedance.ies.dmt.ui.widget.tablayout.DmtTabLayout$b r0 = (com.bytedance.ies.dmt.p664ui.widget.tablayout.DmtTabLayout.C10736b) r0
            r3.setOnTabClickListener(r0)
            android.view.View r3 = r2.mo44862a(r4)
            com.bytedance.ies.dmt.ui.widget.tablayout.DmtTabLayout r3 = (com.bytedance.ies.dmt.p664ui.widget.tablayout.DmtTabLayout) r3
            r0 = 1
            com.bytedance.ies.dmt.ui.widget.tablayout.DmtTabLayout$f r3 = r3.mo19357b(r0)
            if (r3 == 0) goto L_0x00a9
            com.bytedance.ies.dmt.ui.widget.tablayout.DmtTabLayout$h r3 = r3.f28863h
            if (r3 == 0) goto L_0x00a9
            android.widget.TextView r3 = r3.getTextView()
            if (r3 == 0) goto L_0x00a9
            android.text.TextPaint r3 = r3.getPaint()
            if (r3 == 0) goto L_0x00a9
            com.ss.android.ugc.aweme.account.login.v2.ui.n$a r0 = r2.m54680w()
            java.lang.String r0 = r0.f59493b
            float r3 = r3.measureText(r0)
            goto L_0x00aa
        L_0x00a9:
            r3 = 0
        L_0x00aa:
            android.content.Context r0 = r2.getContext()
            r1 = 1103101952(0x41c00000, float:24.0)
            float r0 = com.bytedance.common.utility.C9432q.m18687b(r0, r1)
            float r3 = r3 + r0
            android.content.Context r0 = r2.getContext()
            int r0 = com.bytedance.common.utility.C9432q.m18670a(r0)
            int r0 = r0 / 2
            float r0 = (float) r0
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 <= 0) goto L_0x00d3
            android.view.View r3 = r2.mo44862a(r4)
            com.bytedance.ies.dmt.ui.widget.tablayout.DmtTabLayout r3 = (com.bytedance.ies.dmt.p664ui.widget.tablayout.DmtTabLayout) r3
            java.lang.String r4 = "phoneEmailLoginTab"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r4)
            r4 = 0
            r3.setTabMode(r4)
        L_0x00d3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.account.login.p1292v2.p1295ui.p1296a.C21945q.onViewCreated(android.view.View, android.os.Bundle):void");
    }
}
