package com.p683ss.android.ugc.aweme.account.login.p1292v2.p1295ui.p1296a;

import android.os.Bundle;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.view.ViewPager.C0997e;
import android.view.View;
import com.bytedance.ies.dmt.p664ui.widget.tablayout.DmtTabLayout;
import com.bytedance.ies.dmt.p664ui.widget.tablayout.DmtTabLayout.C10736b;
import com.bytedance.ies.dmt.p664ui.widget.tablayout.DmtTabLayout.C10742f;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21850i;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1295ui.C21861a;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1295ui.C22016n;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1295ui.C22016n.C22017a;
import com.p683ss.android.ugc.aweme.account.p1260a.p1262b.C20856a;
import com.p683ss.android.ugc.aweme.base.utils.KeyboardUtils;
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

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.r */
public final class C21951r extends C21868b {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f59361a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C21951r.class), "phoneTabFragment", "getPhoneTabFragment()Lcom/ss/android/ugc/aweme/account/login/v2/ui/PhoneEmailTabAdapter$TabFragment;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C21951r.class), "emailTabFragment", "getEmailTabFragment()Lcom/ss/android/ugc/aweme/account/login/v2/ui/PhoneEmailTabAdapter$TabFragment;"))};

    /* renamed from: d */
    public static final C21952a f59362d = new C21952a(null);

    /* renamed from: b */
    public int f59363b = -1;

    /* renamed from: c */
    public boolean f59364c = true;

    /* renamed from: e */
    private C22016n f59365e;

    /* renamed from: j */
    private final C52668f f59366j = C52732g.m112285a(new C21956e(this));

    /* renamed from: k */
    private final C52668f f59367k = C52732g.m112285a(new C21953b(this));

    /* renamed from: p */
    private HashMap f59368p;

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.r$a */
    public static final class C21952a {
        private C21952a() {
        }

        public /* synthetic */ C21952a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.r$b */
    static final class C21953b extends C52712l implements C52670a<C22017a> {

        /* renamed from: a */
        final /* synthetic */ C21951r f59369a;

        C21953b(C21951r rVar) {
            this.f59369a = rVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C21887h hVar = new C21887h();
            hVar.setArguments(new Bundle(this.f59369a.getArguments()));
            Bundle arguments = hVar.getArguments();
            if (arguments == null) {
                C52711k.m112234a();
            }
            arguments.putInt("current_page", C21850i.INPUT_EMAIL_SIGN_UP.getValue());
            Bundle arguments2 = hVar.getArguments();
            if (arguments2 == null) {
                C52711k.m112234a();
            }
            arguments2.remove("next_page");
            Fragment fragment = hVar;
            String string = this.f59369a.getString(R.string.c9u);
            C52711k.m112236a((Object) string, "getString(R.string.mus_email)");
            return new C22017a(fragment, string);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.r$c */
    public static final class C21954c implements C0997e {

        /* renamed from: a */
        final /* synthetic */ C21951r f59370a;

        public final void onPageScrolled(int i, float f, int i2) {
        }

        C21954c(C21951r rVar) {
            this.f59370a = rVar;
        }

        public final void onPageSelected(int i) {
            String str;
            this.f59370a.f59363b = i;
            C21861a aVar = this.f59370a.f59207n;
            if (aVar == null) {
                C52711k.m112234a();
            }
            if (this.f59370a.mo46037j()) {
                str = "phone_sign_up_homepage";
            } else {
                str = "email_sign_up_homepage";
            }
            aVar.f59185g = str;
        }

        public final void onPageScrollStateChanged(int i) {
            String str;
            if (i == 2) {
                if (!this.f59370a.f59364c) {
                    this.f59370a.f59364c = true;
                    return;
                }
                RtlViewPager rtlViewPager = (RtlViewPager) this.f59370a.mo44862a(R.id.eob);
                C52711k.m112236a((Object) rtlViewPager, "phoneEmailSignUpPager");
                if (rtlViewPager.getCurrentItem() != this.f59370a.f59363b) {
                    if (this.f59370a.mo46037j()) {
                        str = "register_switch_phone";
                    } else {
                        str = "register_switch_email";
                    }
                    C26890h.m65011a(str, new C20856a().mo44776a("enter_method", this.f59370a.mo45967m()).mo44776a("enter_type", "slide").f56798a);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.r$d */
    static final class C21955d implements C10736b {

        /* renamed from: a */
        final /* synthetic */ C21951r f59371a;

        C21955d(C21951r rVar) {
            this.f59371a = rVar;
        }

        /* renamed from: a */
        public final void mo19399a(C10742f fVar) {
            String str;
            this.f59371a.f59364c = false;
            C52711k.m112236a((Object) fVar, "it");
            if (fVar.f28860e == 0) {
                str = "register_switch_phone";
            } else {
                str = "register_switch_email";
            }
            C26890h.m65011a(str, new C20856a().mo44776a("enter_method", this.f59371a.mo45967m()).mo44776a("enter_type", "click").f56798a);
            RtlViewPager rtlViewPager = (RtlViewPager) this.f59371a.mo44862a(R.id.eob);
            C52711k.m112236a((Object) rtlViewPager, "phoneEmailSignUpPager");
            rtlViewPager.setCurrentItem(fVar.f28860e);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.r$e */
    static final class C21956e extends C52712l implements C52670a<C22017a> {

        /* renamed from: a */
        final /* synthetic */ C21951r f59372a;

        C21956e(C21951r rVar) {
            this.f59372a = rVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C21967t tVar = new C21967t();
            tVar.setArguments(new Bundle(this.f59372a.getArguments()));
            Bundle arguments = tVar.getArguments();
            if (arguments == null) {
                C52711k.m112234a();
            }
            arguments.putInt("current_page", C21850i.INPUT_PHONE_SIGN_UP.getValue());
            Bundle arguments2 = tVar.getArguments();
            if (arguments2 == null) {
                C52711k.m112234a();
            }
            arguments2.remove("next_page");
            Fragment fragment = tVar;
            String string = this.f59372a.getString(R.string.cbi);
            C52711k.m112236a((Object) string, "getString(R.string.mus_phone)");
            return new C22017a(fragment, string);
        }
    }

    /* renamed from: a */
    public final View mo44862a(int i) {
        if (this.f59368p == null) {
            this.f59368p = new HashMap();
        }
        View view = (View) this.f59368p.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f59368p.put(Integer.valueOf(i), view);
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
        if (this.f59368p != null) {
            this.f59368p.clear();
        }
    }

    /* renamed from: i */
    public final int mo45585i() {
        return R.layout.b0y;
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo44866g();
    }

    /* renamed from: f */
    public final boolean mo44865f() {
        KeyboardUtils.m58184c(getView());
        return super.mo44865f();
    }

    /* renamed from: U_ */
    public final C21861a mo44860U_() {
        C21861a aVar = new C21861a(getString(R.string.adw), null, false, null, null, false, "phone_sign_up_homepage", false, false, 446, null);
        return aVar;
    }

    /* renamed from: j */
    public final boolean mo46037j() {
        RtlViewPager rtlViewPager = (RtlViewPager) mo44862a(R.id.eob);
        C52711k.m112236a((Object) rtlViewPager, "phoneEmailSignUpPager");
        if (rtlViewPager.getCurrentItem() == 0) {
            return true;
        }
        return false;
    }

    public final void onStart() {
        int i;
        super.onStart();
        if (this.f59363b != -1) {
            i = this.f59363b;
        } else {
            Bundle arguments = getArguments();
            if (arguments == null || arguments.getInt("child_page") != C21850i.INPUT_EMAIL_SIGN_UP.getValue()) {
                i = 0;
            } else {
                i = 1;
            }
        }
        if (this.f59363b != i) {
            if (this.f59363b != -1) {
                this.f59364c = false;
            }
            this.f59363b = i;
            RtlViewPager rtlViewPager = (RtlViewPager) mo44862a(R.id.eob);
            C52711k.m112236a((Object) rtlViewPager, "phoneEmailSignUpPager");
            rtlViewPager.setCurrentItem(i);
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C52711k.m112240b(view, "view");
        super.onViewCreated(view, bundle);
        this.f59365e = new C22016n(getChildFragmentManager());
        C22016n nVar = this.f59365e;
        if (nVar == null) {
            C52711k.m112237a("tabAdapter");
        }
        nVar.mo46078a((C22017a) this.f59366j.getValue());
        C22016n nVar2 = this.f59365e;
        if (nVar2 == null) {
            C52711k.m112237a("tabAdapter");
        }
        nVar2.mo46078a((C22017a) this.f59367k.getValue());
        RtlViewPager rtlViewPager = (RtlViewPager) mo44862a(R.id.eob);
        C52711k.m112236a((Object) rtlViewPager, "phoneEmailSignUpPager");
        C22016n nVar3 = this.f59365e;
        if (nVar3 == null) {
            C52711k.m112237a("tabAdapter");
        }
        rtlViewPager.setAdapter(nVar3);
        ((DmtTabLayout) mo44862a(R.id.eoc)).setupWithViewPager((RtlViewPager) mo44862a(R.id.eob));
        ((RtlViewPager) mo44862a(R.id.eob)).addOnPageChangeListener(new C21954c(this));
        ((DmtTabLayout) mo44862a(R.id.eoc)).setOnTabClickListener(new C21955d(this));
    }
}
