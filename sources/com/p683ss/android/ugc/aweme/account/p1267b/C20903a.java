package com.p683ss.android.ugc.aweme.account.p1267b;

import android.app.Activity;
import android.os.Bundle;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.app.FragmentActivity;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.sdk.account.p844a.p845a.C12993e;
import com.bytedance.sdk.account.p861f.p862a.C13109h;
import com.p683ss.android.ugc.aweme.C23826bi;
import com.p683ss.android.ugc.aweme.IAccountService.C20840g;
import com.p683ss.android.ugc.aweme.account.login.p1291ui.C21598l;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21829b;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21839d;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21850i;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.base.CommonFlowActivity;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1293a.C21677s;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1295ui.C21861a;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1295ui.C22020p;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1295ui.p1296a.C21873d;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.timer.TimerHolder.C21852a;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.timer.TimerHolder.C21853b;
import com.p683ss.android.ugc.aweme.account.p1260a.p1262b.C20856a;
import com.p683ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.services.BaseBindService;
import com.p683ss.android.ugc.aweme.services.BindService;
import com.p683ss.android.ugc.aweme.services.PasswordService;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import p064c.p065a.C2193n;
import p064c.p065a.p071d.C1710e;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52857u;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52686q;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.account.b.a */
public final class C20903a extends C21873d {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f56880a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C20903a.class), "fromProAccount", "getFromProAccount()Z"))};

    /* renamed from: b */
    public static final int f56881b = 8;

    /* renamed from: c */
    public static final C52686q<C21829b, String, String, C2193n<C12993e<C13109h>>> f56882c = C20905b.f56887a;

    /* renamed from: d */
    public static final String f56883d = f56883d;

    /* renamed from: e */
    public static final C20904a f56884e = new C20904a(null);

    /* renamed from: k */
    private final C52668f f56885k = C52732g.m112285a(new C20906c(this));

    /* renamed from: p */
    private HashMap f56886p;

    /* renamed from: com.ss.android.ugc.aweme.account.b.a$a */
    public static final class C20904a {
        private C20904a() {
        }

        /* renamed from: a */
        public static String m53251a() {
            return C20903a.f56883d;
        }

        public /* synthetic */ C20904a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.b.a$b */
    static final class C20905b extends C52712l implements C52686q<C21829b, String, String, C2193n<C12993e<C13109h>>> {

        /* renamed from: a */
        public static final C20905b f56887a = new C20905b();

        C20905b() {
            super(3);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            C21829b bVar = (C21829b) obj;
            String str = (String) obj2;
            String str2 = (String) obj3;
            C52711k.m112240b(bVar, "fragemnt");
            C52711k.m112240b(str, "data");
            C52711k.m112240b(str2, "sendMethod");
            return C21677s.m54399a(C21677s.f58713a, bVar, str, C20903a.f56881b, str2, (HashMap) null, (String) null, 48, (Object) null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.b.a$c */
    static final class C20906c extends C52712l implements C52670a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C20903a f56888a;

        C20906c(C20903a aVar) {
            this.f56888a = aVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Bundle arguments = this.f56888a.getArguments();
            if (arguments == null) {
                C52711k.m112234a();
            }
            return Boolean.valueOf(arguments.getBoolean(BindService.FROM_PROACCOUNT));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.b.a$d */
    static final class C20907d<T> implements C1710e<C12993e<C13109h>> {

        /* renamed from: a */
        final /* synthetic */ C20903a f56889a;

        /* renamed from: b */
        final /* synthetic */ String f56890b;

        C20907d(C20903a aVar, String str) {
            this.f56889a = aVar;
            this.f56890b = str;
        }

        public final /* synthetic */ void accept(Object obj) {
            C12993e eVar = (C12993e) obj;
            this.f56889a.mo44864a(this.f56890b, true);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.b.a$e */
    static final class C20908e implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C20903a f56891a;

        C20908e(C20903a aVar) {
            this.f56891a = aVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            if (this.f56891a.mo44859T_()) {
                C26890h.onEventV3("set_up_by_phone");
            }
            Bundle arguments = this.f56891a.getArguments();
            if (arguments == null) {
                C52711k.m112234a();
            }
            if (arguments.getInt("last_scene", -1) != -1) {
                FragmentActivity activity = this.f56891a.getActivity();
                if (activity == null) {
                    C52711k.m112234a();
                }
                activity.finish();
                return;
            }
            BaseBindService l = C23826bi.m58471l();
            Activity activity2 = this.f56891a.getActivity();
            String l2 = this.f56891a.mo45966l();
            FragmentActivity activity3 = this.f56891a.getActivity();
            if (activity3 != null) {
                l.bindMobile(activity2, l2, ((CommonFlowActivity) activity3).mo45577a(), new C20840g(this) {

                    /* renamed from: a */
                    final /* synthetic */ C20908e f56892a;

                    {
                        this.f56892a = r1;
                    }

                    public final void onResult(int i, int i2, Object obj) {
                        if (i2 == 1) {
                            FragmentActivity activity = this.f56892a.f56891a.getActivity();
                            if (!(activity instanceof CommonFlowActivity)) {
                                activity = null;
                            }
                            CommonFlowActivity commonFlowActivity = (CommonFlowActivity) activity;
                            if (commonFlowActivity != null) {
                                commonFlowActivity.mo45955c(null);
                            }
                        }
                    }
                });
                return;
            }
            throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.v2.base.CommonFlowActivity");
        }
    }

    /* renamed from: T_ */
    public final boolean mo44859T_() {
        return ((Boolean) this.f56885k.getValue()).booleanValue();
    }

    /* renamed from: a */
    public final View mo44862a(int i) {
        if (this.f56886p == null) {
            this.f56886p = new HashMap();
        }
        View view = (View) this.f56886p.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f56886p.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: g */
    public final void mo44866g() {
        if (this.f56886p != null) {
            this.f56886p.clear();
        }
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo44866g();
    }

    /* renamed from: f */
    public final boolean mo44865f() {
        KeyboardUtils.m58184c(mo46002j());
        C20915c.m53258a(mo45966l());
        return super.mo44865f();
    }

    /* renamed from: U_ */
    public final C21861a mo44860U_() {
        int i;
        C21861a aVar = new C21861a(null, null, false, null, null, false, null, false, false, 511, null);
        aVar.f59182d = getString(R.string.hgp);
        if (mo44859T_()) {
            i = R.string.hh4;
        } else {
            i = R.string.hgo;
        }
        aVar.f59183e = getString(i);
        aVar.f59179a = " ";
        aVar.f59186h = false;
        aVar.f59184f = true;
        return aVar;
    }

    /* renamed from: V_ */
    public final void mo44861V_() {
        if (mo44859T_()) {
            C26890h.m65011a("input_wrong_email", new C20856a().mo44776a("page", "Input Email Captcha").mo44776a("error_code", "1").f56798a);
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C20915c.m53259a(mo45966l(), "email");
    }

    /* renamed from: a */
    public final void mo44863a(String str) {
        C52711k.m112240b(str, "data");
        C21853b a = C21852a.m54530a(getActivity(), str, mo45970p());
        if (a != null) {
            C21598l lVar = a.f59142a;
            if (lVar != null && lVar.mo45883e()) {
                mo44864a(str, false);
                return;
            }
        }
        ((C2193n) f56882c.invoke(this, str, "user_click")).mo6496c((C1710e<? super T>) new C20907d<Object>(this, str)).mo6491b();
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C52711k.m112240b(view, "view");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments == null) {
            C52711k.m112234a();
        }
        if (!arguments.getBoolean(PasswordService.FROM_CHANGE_PWD) && !mo44859T_()) {
            Bundle arguments2 = getArguments();
            if (arguments2 == null) {
                C52711k.m112234a();
            }
            if (!arguments2.getBoolean("needUsePhone")) {
                return;
            }
        }
        DmtTextView dmtTextView = (DmtTextView) mo44862a((int) R.id.e1k);
        C52711k.m112236a((Object) dmtTextView, "change_step1");
        dmtTextView.setVisibility(0);
        ((DmtTextView) mo44862a((int) R.id.e1k)).setTextColor(getResources().getColor(R.color.ji));
        DmtTextView dmtTextView2 = (DmtTextView) mo44862a((int) R.id.e1k);
        C52711k.m112236a((Object) dmtTextView2, "change_step1");
        C22020p.m54764a(dmtTextView2, new C20908e(this), R.string.hgm, R.string.hgn);
    }

    /* renamed from: a */
    public final void mo44864a(String str, boolean z) {
        C52711k.m112240b(str, "data");
        Fragment fragment = this;
        C21839d.m54507a(fragment, str);
        C21839d.m54508a(fragment, z);
        Bundle arguments = getArguments();
        if (arguments == null) {
            C52711k.m112234a();
        }
        arguments.putInt("next_page", C21850i.EMAIL_SMS_BIND.getValue());
        C52711k.m112236a((Object) arguments, "arguments!!.apply {\n    …SMS_BIND.value)\n        }");
        mo45961a(arguments);
    }
}
