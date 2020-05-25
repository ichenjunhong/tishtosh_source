package com.p683ss.android.ugc.aweme.account.p1303p;

import android.app.Activity;
import android.os.Bundle;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.app.FragmentActivity;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.ies.dmt.p664ui.widget.util.C10751d;
import com.bytedance.sdk.account.p844a.p845a.C12993e;
import com.bytedance.sdk.account.p861f.p862a.C13109h;
import com.p683ss.android.ugc.aweme.C23826bi;
import com.p683ss.android.ugc.aweme.C27983t;
import com.p683ss.android.ugc.aweme.IAccountService.C20840g;
import com.p683ss.android.ugc.aweme.account.login.p1291ui.C21598l;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21829b;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21839d;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21848h;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21850i;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.base.CommonFlowActivity;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1293a.C21677s;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1295ui.C21861a;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1295ui.C22020p;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1295ui.p1296a.C21873d;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.timer.TimerHolder.C21852a;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.timer.TimerHolder.C21853b;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.services.BaseBindService;
import com.p683ss.android.ugc.aweme.services.BindService;
import com.p683ss.android.ugc.aweme.services.PasswordService;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import org.json.JSONObject;
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

/* renamed from: com.ss.android.ugc.aweme.account.p.a */
public final class C22100a extends C21873d {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f59617a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C22100a.class), "fromChangePwd", "getFromChangePwd()Z")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C22100a.class), "fromProAccount", "getFromProAccount()Z"))};

    /* renamed from: b */
    public static final C52686q<C21829b, String, String, C2193n<C12993e<C13109h>>> f59618b = C22102b.f59623a;

    /* renamed from: c */
    public static final C22101a f59619c = new C22101a(null);

    /* renamed from: d */
    private final C52668f f59620d = C52732g.m112285a(new C22103c(this));

    /* renamed from: e */
    private final C52668f f59621e = C52732g.m112285a(new C22104d(this));

    /* renamed from: k */
    private HashMap f59622k;

    /* renamed from: com.ss.android.ugc.aweme.account.p.a$a */
    public static final class C22101a {
        private C22101a() {
        }

        /* renamed from: a */
        public static C52686q<C21829b, String, String, C2193n<C12993e<C13109h>>> m54911a() {
            return C22100a.f59618b;
        }

        public /* synthetic */ C22101a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.p.a$b */
    static final class C22102b extends C52712l implements C52686q<C21829b, String, String, C2193n<C12993e<C13109h>>> {

        /* renamed from: a */
        public static final C22102b f59623a = new C22102b();

        C22102b() {
            super(3);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            int i;
            C21829b bVar = (C21829b) obj;
            String str = (String) obj2;
            String str2 = (String) obj3;
            C52711k.m112240b(bVar, "fragemnt");
            C52711k.m112240b(str, "data");
            C52711k.m112240b(str2, "sendMethod");
            C21677s sVar = C21677s.f58713a;
            Fragment fragment = bVar;
            C52711k.m112240b(fragment, "fragment");
            Bundle arguments = fragment.getArguments();
            if (arguments == null) {
                C52711k.m112234a();
            }
            if (arguments.getBoolean(PasswordService.FROM_CHANGE_PWD)) {
                i = 11;
            } else {
                i = 6;
            }
            return C21677s.m54399a(sVar, bVar, str, i, str2, (HashMap) null, (String) null, 48, (Object) null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.p.a$c */
    static final class C22103c extends C52712l implements C52670a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C22100a f59624a;

        C22103c(C22100a aVar) {
            this.f59624a = aVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Bundle arguments = this.f59624a.getArguments();
            if (arguments == null) {
                C52711k.m112234a();
            }
            return Boolean.valueOf(arguments.getBoolean(PasswordService.FROM_CHANGE_PWD));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.p.a$d */
    static final class C22104d extends C52712l implements C52670a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C22100a f59625a;

        C22104d(C22100a aVar) {
            this.f59625a = aVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Bundle arguments = this.f59625a.getArguments();
            if (arguments == null) {
                C52711k.m112234a();
            }
            return Boolean.valueOf(arguments.getBoolean(BindService.FROM_PROACCOUNT));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.p.a$e */
    static final class C22105e implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C22100a f59626a;

        C22105e(C22100a aVar) {
            this.f59626a = aVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            if (this.f59626a.mo46206v()) {
                C26890h.onEventV3("verify_email_page_use_new_email");
            }
            Bundle bundle = new Bundle(this.f59626a.getArguments());
            bundle.putInt("next_page", C21850i.INPUT_EMAIL_CHANGE.getValue());
            C21839d.m54505a(bundle, "");
            this.f59626a.mo45961a(bundle);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.p.a$f */
    static final class C22106f<T> implements C1710e<C12993e<C13109h>> {

        /* renamed from: a */
        final /* synthetic */ C22100a f59627a;

        /* renamed from: b */
        final /* synthetic */ String f59628b;

        C22106f(C22100a aVar, String str) {
            this.f59627a = aVar;
            this.f59628b = str;
        }

        public final /* synthetic */ void accept(Object obj) {
            C12993e eVar = (C12993e) obj;
            this.f59627a.mo46205a(this.f59628b, true);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.p.a$g */
    static final class C22107g implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C22100a f59629a;

        C22107g(C22100a aVar) {
            this.f59629a = aVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            if (this.f59629a.mo46206v()) {
                C26890h.onEventV3("verify_email_page_use_phone");
            }
            Bundle arguments = this.f59629a.getArguments();
            if (arguments == null) {
                C52711k.m112234a();
            }
            if (arguments.getInt("last_scene", -1) == C21848h.BIND_PHONE.getValue()) {
                FragmentActivity activity = this.f59629a.getActivity();
                if (activity == null) {
                    C52711k.m112234a();
                }
                activity.finish();
                return;
            }
            BaseBindService l = C23826bi.m58471l();
            Activity activity2 = this.f59629a.getActivity();
            String l2 = this.f59629a.mo45966l();
            FragmentActivity activity3 = this.f59629a.getActivity();
            if (activity3 != null) {
                l.bindMobile(activity2, l2, ((CommonFlowActivity) activity3).mo45577a(), new C20840g(this) {

                    /* renamed from: a */
                    final /* synthetic */ C22107g f59630a;

                    {
                        this.f59630a = r1;
                    }

                    public final void onResult(int i, int i2, Object obj) {
                        if (i2 == 1) {
                            Bundle bundle = new Bundle();
                            bundle.putString("platForm", "phone");
                            if (obj != null) {
                                String optString = new JSONObject(((C27983t) obj).f73411b).optString("ticket", "");
                                C52711k.m112236a((Object) optString, "jsonObject.optString(\"ticket\", \"\")");
                                C21839d.m54512c(bundle, optString);
                                FragmentActivity activity = this.f59630a.f59629a.getActivity();
                                if (!(activity instanceof CommonFlowActivity)) {
                                    activity = null;
                                }
                                CommonFlowActivity commonFlowActivity = (CommonFlowActivity) activity;
                                if (commonFlowActivity != null) {
                                    commonFlowActivity.mo45955c(bundle);
                                }
                            } else {
                                throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.BindMobileFinishData");
                            }
                        }
                    }
                });
                return;
            }
            throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.v2.base.CommonFlowActivity");
        }
    }

    /* renamed from: a */
    public final View mo44862a(int i) {
        if (this.f59622k == null) {
            this.f59622k = new HashMap();
        }
        View view = (View) this.f59622k.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f59622k.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: g */
    public final void mo44866g() {
        if (this.f59622k != null) {
            this.f59622k.clear();
        }
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo44866g();
    }

    /* renamed from: v */
    public final boolean mo46206v() {
        return ((Boolean) this.f59621e.getValue()).booleanValue();
    }

    /* renamed from: U_ */
    public final C21861a mo44860U_() {
        int i;
        int i2;
        C21861a aVar = new C21861a(null, null, false, null, null, false, null, false, false, 511, null);
        if (mo46206v()) {
            i = R.string.hha;
        } else {
            i = R.string.hgp;
        }
        aVar.f59182d = getString(i);
        if (mo46206v()) {
            i2 = R.string.hh_;
        } else {
            i2 = R.string.hgo;
        }
        aVar.f59183e = getString(i2);
        aVar.f59179a = " ";
        aVar.f59186h = false;
        aVar.f59184f = true;
        return aVar;
    }

    /* renamed from: a */
    public final void mo44863a(String str) {
        C52711k.m112240b(str, "data");
        C21853b a = C21852a.m54530a(getActivity(), str, mo45970p());
        if (a != null) {
            C21598l lVar = a.f59142a;
            if (lVar != null && lVar.mo45883e()) {
                mo46205a(str, false);
                return;
            }
        }
        ((C2193n) f59618b.invoke(this, str, "user_click")).mo6496c((C1710e<? super T>) new C22106f<Object>(this, str)).mo6491b();
    }

    /* renamed from: a */
    public final void mo46205a(String str, boolean z) {
        C52711k.m112240b(str, "data");
        Fragment fragment = this;
        C21839d.m54507a(fragment, str);
        C21839d.m54508a(fragment, z);
        Bundle arguments = getArguments();
        if (arguments == null) {
            C52711k.m112234a();
        }
        arguments.putInt("next_page", C21850i.EMAIL_SMS_VERIFY.getValue());
        C52711k.m112236a((Object) arguments, "arguments!!.apply {\n    …S_VERIFY.value)\n        }");
        mo45961a(arguments);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        int i;
        C52711k.m112240b(view, "view");
        super.onViewCreated(view, bundle);
        mo46002j().setEnabled(false);
        mo46002j().setTextColor(getResources().getColor(R.color.avo));
        DmtTextView dmtTextView = (DmtTextView) mo44862a((int) R.id.e1k);
        dmtTextView.setVisibility(0);
        dmtTextView.setFontType(C10751d.f28903b);
        dmtTextView.setOnClickListener(new C22105e(this));
        if (mo46206v()) {
            i = R.string.hh9;
        } else {
            i = R.string.hgl;
        }
        dmtTextView.setText(getString(i));
        if (((Boolean) this.f59620d.getValue()).booleanValue() || mo46206v()) {
            DmtTextView dmtTextView2 = (DmtTextView) mo44862a((int) R.id.e1l);
            C52711k.m112236a((Object) dmtTextView2, "change_step2");
            dmtTextView2.setVisibility(0);
            DmtTextView dmtTextView3 = (DmtTextView) mo44862a((int) R.id.e1l);
            C52711k.m112236a((Object) dmtTextView3, "change_step2");
            C22020p.m54764a(dmtTextView3, new C22107g(this), R.string.hgm, R.string.hgn);
        }
    }
}
