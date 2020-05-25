package com.p683ss.android.ugc.aweme.account.login.recover;

import android.os.Bundle;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.view.ViewPager.C0997e;
import android.view.View;
import com.bytedance.ies.dmt.p664ui.widget.tablayout.DmtTabLayout.C10736b;
import com.bytedance.ies.dmt.p664ui.widget.tablayout.DmtTabLayout.C10742f;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21850i;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1295ui.C21861a;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1295ui.C22016n;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1295ui.C22016n.C22017a;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1295ui.p1296a.C21868b;
import com.p683ss.android.ugc.aweme.account.p1260a.p1262b.C20856a;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.views.RtlViewPager;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.account.login.recover.b */
public final class C21428b extends C21868b {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f58117a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C21428b.class), "phoneTabFragment", "getPhoneTabFragment()Lcom/ss/android/ugc/aweme/account/login/v2/ui/PhoneEmailTabAdapter$TabFragment;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C21428b.class), "emailTabFragment", "getEmailTabFragment()Lcom/ss/android/ugc/aweme/account/login/v2/ui/PhoneEmailTabAdapter$TabFragment;"))};

    /* renamed from: d */
    public static final C21429a f58118d = new C21429a(null);

    /* renamed from: b */
    public int f58119b = -1;

    /* renamed from: c */
    public boolean f58120c = true;

    /* renamed from: e */
    private C22016n f58121e;

    /* renamed from: j */
    private final C52668f f58122j = C52732g.m112285a(new C21433e(this));

    /* renamed from: k */
    private final C52668f f58123k = C52732g.m112285a(new C21430b(this));

    /* renamed from: p */
    private HashMap f58124p;

    /* renamed from: com.ss.android.ugc.aweme.account.login.recover.b$a */
    public static final class C21429a {
        private C21429a() {
        }

        public /* synthetic */ C21429a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.recover.b$b */
    static final class C21430b extends C52712l implements C52670a<C22017a> {

        /* renamed from: a */
        final /* synthetic */ C21428b f58125a;

        C21430b(C21428b bVar) {
            this.f58125a = bVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C21403a aVar = new C21403a();
            aVar.setArguments(new Bundle(this.f58125a.getArguments()));
            Bundle arguments = aVar.getArguments();
            if (arguments == null) {
                C52711k.m112234a();
            }
            arguments.putInt("current_page", C21850i.INPUT_EMAIL_LOGIN.getValue());
            Bundle arguments2 = aVar.getArguments();
            if (arguments2 == null) {
                C52711k.m112234a();
            }
            arguments2.remove("next_page");
            Fragment fragment = aVar;
            String string = this.f58125a.getString(R.string.fxg);
            C52711k.m112236a((Object) string, "getString(R.string.common_login_email_input_tab)");
            return new C22017a(fragment, string);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.recover.b$c */
    public static final class C21431c implements C0997e {

        /* renamed from: a */
        final /* synthetic */ C21428b f58126a;

        public final void onPageScrolled(int i, float f, int i2) {
        }

        C21431c(C21428b bVar) {
            this.f58126a = bVar;
        }

        public final void onPageSelected(int i) {
            String str;
            this.f58126a.f58119b = i;
            C21861a aVar = this.f58126a.f59207n;
            if (aVar == null) {
                C52711k.m112234a();
            }
            if (this.f58126a.mo45603j()) {
                str = "phone_login_homepage";
            } else {
                str = "email_login_homepage";
            }
            aVar.f59185g = str;
        }

        public final void onPageScrollStateChanged(int i) {
            String str;
            if (i == 2) {
                if (!this.f58126a.f58120c) {
                    this.f58126a.f58120c = true;
                    return;
                }
                RtlViewPager rtlViewPager = (RtlViewPager) this.f58126a.mo44862a(R.id.eo_);
                C52711k.m112236a((Object) rtlViewPager, "phoneEmailLoginPager");
                if (rtlViewPager.getCurrentItem() != this.f58126a.f58119b) {
                    if (this.f58126a.mo45603j()) {
                        str = "switch_to_phone";
                    } else {
                        str = "switch_to_email";
                    }
                    C26890h.m65011a(str, new C20856a().mo44776a("enter_method", this.f58126a.mo45967m()).mo44776a("enter_type", "slide").f56798a);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.recover.b$d */
    static final class C21432d implements C10736b {

        /* renamed from: a */
        final /* synthetic */ C21428b f58127a;

        C21432d(C21428b bVar) {
            this.f58127a = bVar;
        }

        /* renamed from: a */
        public final void mo19399a(C10742f fVar) {
            String str;
            this.f58127a.f58120c = false;
            C52711k.m112236a((Object) fVar, "it");
            if (fVar.f28860e == 0) {
                str = "switch_to_phone";
            } else {
                str = "switch_to_email";
            }
            C26890h.m65011a(str, new C20856a().mo44776a("enter_method", this.f58127a.mo45967m()).mo44776a("enter_type", "click").f56798a);
            RtlViewPager rtlViewPager = (RtlViewPager) this.f58127a.mo44862a(R.id.eo_);
            C52711k.m112236a((Object) rtlViewPager, "phoneEmailLoginPager");
            rtlViewPager.setCurrentItem(fVar.f28860e);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.recover.b$e */
    static final class C21433e extends C52712l implements C52670a<C22017a> {

        /* renamed from: a */
        final /* synthetic */ C21428b f58128a;

        C21433e(C21428b bVar) {
            this.f58128a = bVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C21434c cVar = new C21434c();
            cVar.setArguments(new Bundle(this.f58128a.getArguments()));
            Bundle arguments = cVar.getArguments();
            if (arguments == null) {
                C52711k.m112234a();
            }
            arguments.putInt("current_page", C21850i.INPUT_PHONE_LOGIN.getValue());
            Bundle arguments2 = cVar.getArguments();
            if (arguments2 == null) {
                C52711k.m112234a();
            }
            arguments2.remove("next_page");
            Fragment fragment = cVar;
            String string = this.f58128a.getString(R.string.cbi);
            C52711k.m112236a((Object) string, "getString(R.string.mus_phone)");
            return new C22017a(fragment, string);
        }
    }

    /* renamed from: u */
    private final C22017a m54054u() {
        return (C22017a) this.f58123k.getValue();
    }

    /* renamed from: a */
    public final View mo44862a(int i) {
        if (this.f58124p == null) {
            this.f58124p = new HashMap();
        }
        View view = (View) this.f58124p.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f58124p.put(Integer.valueOf(i), view);
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
        if (this.f58124p != null) {
            this.f58124p.clear();
        }
    }

    /* renamed from: i */
    public final int mo45585i() {
        return R.layout.az1;
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo44866g();
    }

    /* renamed from: U_ */
    public final C21861a mo44860U_() {
        C21861a aVar = new C21861a(getString(R.string.h8s), null, false, null, null, false, "phone_login_homepage", false, false, 318, null);
        return aVar;
    }

    /* renamed from: j */
    public final boolean mo45603j() {
        RtlViewPager rtlViewPager = (RtlViewPager) mo44862a(R.id.eo_);
        C52711k.m112236a((Object) rtlViewPager, "phoneEmailLoginPager");
        if (rtlViewPager.getCurrentItem() == 0) {
            return true;
        }
        return false;
    }

    public final void onStart() {
        int i;
        super.onStart();
        if (this.f58119b != -1) {
            i = this.f58119b;
        } else {
            Bundle arguments = getArguments();
            if (arguments == null || arguments.getInt("child_page") != C21850i.INPUT_EMAIL_LOGIN.getValue()) {
                i = 0;
            } else {
                i = 1;
            }
        }
        if (this.f58119b != i) {
            if (this.f58119b != -1) {
                this.f58120c = false;
            }
            this.f58119b = i;
            RtlViewPager rtlViewPager = (RtlViewPager) mo44862a(R.id.eo_);
            C52711k.m112236a((Object) rtlViewPager, "phoneEmailLoginPager");
            rtlViewPager.setCurrentItem(i);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x00d6  */
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
            r2.f58121e = r3
            com.ss.android.ugc.aweme.account.login.v2.ui.n r3 = r2.f58121e
            if (r3 != 0) goto L_0x001c
            java.lang.String r4 = "tabAdapter"
            p2628d.p2639f.p2641b.C52711k.m112237a(r4)
        L_0x001c:
            d.f r4 = r2.f58122j
            java.lang.Object r4 = r4.getValue()
            com.ss.android.ugc.aweme.account.login.v2.ui.n$a r4 = (com.p683ss.android.ugc.aweme.account.login.p1292v2.p1295ui.C22016n.C22017a) r4
            r3.mo46078a(r4)
            com.ss.android.ugc.aweme.account.login.v2.ui.n r3 = r2.f58121e
            if (r3 != 0) goto L_0x0030
            java.lang.String r4 = "tabAdapter"
            p2628d.p2639f.p2641b.C52711k.m112237a(r4)
        L_0x0030:
            com.ss.android.ugc.aweme.account.login.v2.ui.n$a r4 = r2.m54054u()
            r3.mo46078a(r4)
            r3 = 2132021555(0x7f141133, float:1.9681505E38)
            android.view.View r4 = r2.mo44862a(r3)
            com.ss.android.ugc.aweme.views.RtlViewPager r4 = (com.p683ss.android.ugc.aweme.views.RtlViewPager) r4
            java.lang.String r0 = "phoneEmailLoginPager"
            p2628d.p2639f.p2641b.C52711k.m112236a(r4, r0)
            com.ss.android.ugc.aweme.account.login.v2.ui.n r0 = r2.f58121e
            if (r0 != 0) goto L_0x004e
            java.lang.String r1 = "tabAdapter"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x004e:
            android.support.v4.view.PagerAdapter r0 = (android.support.p030v4.view.PagerAdapter) r0
            r4.setAdapter(r0)
            r4 = 2132021556(0x7f141134, float:1.9681507E38)
            android.view.View r0 = r2.mo44862a(r4)
            com.bytedance.ies.dmt.ui.widget.tablayout.DmtTabLayout r0 = (com.bytedance.ies.dmt.p664ui.widget.tablayout.DmtTabLayout) r0
            android.view.View r1 = r2.mo44862a(r3)
            com.ss.android.ugc.aweme.views.RtlViewPager r1 = (com.p683ss.android.ugc.aweme.views.RtlViewPager) r1
            r0.setupWithViewPager(r1)
            android.view.View r0 = r2.mo44862a(r3)
            com.ss.android.ugc.aweme.views.RtlViewPager r0 = (com.p683ss.android.ugc.aweme.views.RtlViewPager) r0
            com.ss.android.ugc.aweme.account.login.recover.b$c r1 = new com.ss.android.ugc.aweme.account.login.recover.b$c
            r1.<init>(r2)
            android.support.v4.view.ViewPager$e r1 = (android.support.p030v4.view.ViewPager.C0997e) r1
            r0.addOnPageChangeListener(r1)
            android.view.View r0 = r2.mo44862a(r4)
            com.bytedance.ies.dmt.ui.widget.tablayout.DmtTabLayout r0 = (com.bytedance.ies.dmt.p664ui.widget.tablayout.DmtTabLayout) r0
            com.ss.android.ugc.aweme.account.login.recover.b$d r1 = new com.ss.android.ugc.aweme.account.login.recover.b$d
            r1.<init>(r2)
            com.bytedance.ies.dmt.ui.widget.tablayout.DmtTabLayout$b r1 = (com.bytedance.ies.dmt.p664ui.widget.tablayout.DmtTabLayout.C10736b) r1
            r0.setOnTabClickListener(r1)
            android.view.View r3 = r2.mo44862a(r3)
            com.ss.android.ugc.aweme.views.RtlViewPager r3 = (com.p683ss.android.ugc.aweme.views.RtlViewPager) r3
            java.lang.String r0 = "phoneEmailLoginPager"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r0)
            r0 = 1
            r3.setCurrentItem(r0)
            android.view.View r3 = r2.mo44862a(r4)
            com.bytedance.ies.dmt.ui.widget.tablayout.DmtTabLayout r3 = (com.bytedance.ies.dmt.p664ui.widget.tablayout.DmtTabLayout) r3
            com.bytedance.ies.dmt.ui.widget.tablayout.DmtTabLayout$f r3 = r3.mo19357b(r0)
            if (r3 == 0) goto L_0x00bb
            com.bytedance.ies.dmt.ui.widget.tablayout.DmtTabLayout$h r3 = r3.f28863h
            if (r3 == 0) goto L_0x00bb
            android.widget.TextView r3 = r3.getTextView()
            if (r3 == 0) goto L_0x00bb
            android.text.TextPaint r3 = r3.getPaint()
            if (r3 == 0) goto L_0x00bb
            com.ss.android.ugc.aweme.account.login.v2.ui.n$a r0 = r2.m54054u()
            java.lang.String r0 = r0.f59493b
            float r3 = r3.measureText(r0)
            goto L_0x00bc
        L_0x00bb:
            r3 = 0
        L_0x00bc:
            android.content.Context r0 = r2.getContext()
            r1 = 1103101952(0x41c00000, float:24.0)
            float r0 = com.bytedance.common.utility.C9432q.m18687b(r0, r1)
            float r3 = r3 + r0
            android.content.Context r0 = r2.getContext()
            int r0 = com.bytedance.common.utility.C9432q.m18670a(r0)
            int r0 = r0 / 2
            float r0 = (float) r0
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 <= 0) goto L_0x00e5
            android.view.View r3 = r2.mo44862a(r4)
            com.bytedance.ies.dmt.ui.widget.tablayout.DmtTabLayout r3 = (com.bytedance.ies.dmt.p664ui.widget.tablayout.DmtTabLayout) r3
            java.lang.String r4 = "phoneEmailLoginTab"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r4)
            r4 = 0
            r3.setTabMode(r4)
        L_0x00e5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.account.login.recover.C21428b.onViewCreated(android.view.View, android.os.Bundle):void");
    }
}
