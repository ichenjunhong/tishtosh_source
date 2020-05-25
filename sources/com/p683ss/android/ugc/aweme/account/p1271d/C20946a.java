package com.p683ss.android.ugc.aweme.account.p1271d;

import android.app.Activity;
import android.os.Bundle;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
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
import com.p683ss.android.ugc.aweme.account.p1260a.p1262b.C20856a;
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

/* renamed from: com.ss.android.ugc.aweme.account.d.a */
public final class C20946a extends C21873d {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f57040a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C20946a.class), "fromProAccount", "getFromProAccount()Z"))};

    /* renamed from: b */
    public static final int f57041b = 7;

    /* renamed from: c */
    public static final C52686q<C21829b, String, String, C2193n<C12993e<C13109h>>> f57042c = C20948b.f57046a;

    /* renamed from: d */
    public static final C20947a f57043d = new C20947a(null);

    /* renamed from: e */
    private final C52668f f57044e = C52732g.m112285a(new C20949c(this));

    /* renamed from: k */
    private HashMap f57045k;

    /* renamed from: com.ss.android.ugc.aweme.account.d.a$a */
    public static final class C20947a {
        private C20947a() {
        }

        public /* synthetic */ C20947a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.d.a$b */
    static final class C20948b extends C52712l implements C52686q<C21829b, String, String, C2193n<C12993e<C13109h>>> {

        /* renamed from: a */
        public static final C20948b f57046a = new C20948b();

        C20948b() {
            super(3);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            HashMap hashMap;
            C21829b bVar = (C21829b) obj;
            String str = (String) obj2;
            String str2 = (String) obj3;
            C52711k.m112240b(bVar, "fragemnt");
            C52711k.m112240b(str, "data");
            C52711k.m112240b(str2, "sendMethod");
            String e = C21839d.m54514e(bVar);
            if (!TextUtils.isEmpty(e)) {
                HashMap hashMap2 = new HashMap();
                hashMap2.put("ticket", e);
                hashMap = hashMap2;
            } else {
                hashMap = null;
            }
            return C21677s.m54399a(C21677s.f58713a, bVar, str, C20946a.f57041b, str2, hashMap, (String) null, 32, (Object) null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.d.a$c */
    static final class C20949c extends C52712l implements C52670a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C20946a f57047a;

        C20949c(C20946a aVar) {
            this.f57047a = aVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Bundle arguments = this.f57047a.getArguments();
            if (arguments == null) {
                C52711k.m112234a();
            }
            return Boolean.valueOf(arguments.getBoolean(BindService.FROM_PROACCOUNT));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.d.a$d */
    static final class C20950d<T> implements C1710e<C12993e<C13109h>> {

        /* renamed from: a */
        final /* synthetic */ C20946a f57048a;

        C20950d(C20946a aVar) {
            this.f57048a = aVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            C12993e eVar = (C12993e) obj;
            this.f57048a.mo44960a(true);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.d.a$e */
    static final class C20951e implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C20946a f57049a;

        C20951e(C20946a aVar) {
            this.f57049a = aVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            if (this.f57049a.ae_()) {
                C26890h.onEventV3("Enter_new_email_page_use_phone");
            }
            Bundle arguments = this.f57049a.getArguments();
            if (arguments == null) {
                C52711k.m112234a();
            }
            if (arguments.getInt("last_scene", -1) == C21848h.BIND_PHONE.getValue()) {
                FragmentActivity activity = this.f57049a.getActivity();
                if (activity == null) {
                    C52711k.m112234a();
                }
                activity.finish();
                return;
            }
            BaseBindService l = C23826bi.m58471l();
            Activity activity2 = this.f57049a.getActivity();
            String l2 = this.f57049a.mo45966l();
            FragmentActivity activity3 = this.f57049a.getActivity();
            if (activity3 != null) {
                l.bindMobile(activity2, l2, ((CommonFlowActivity) activity3).mo45577a(), new C20840g(this) {

                    /* renamed from: a */
                    final /* synthetic */ C20951e f57050a;

                    {
                        this.f57050a = r1;
                    }

                    public final void onResult(int i, int i2, Object obj) {
                        if (i2 == 1) {
                            Bundle bundle = new Bundle();
                            bundle.putString("platForm", "phone");
                            if (obj != null) {
                                String optString = new JSONObject(((C27983t) obj).f73411b).optString("ticket", "");
                                C52711k.m112236a((Object) optString, "jsonObject.optString(\"ticket\", \"\")");
                                C21839d.m54512c(bundle, optString);
                                FragmentActivity activity = this.f57050a.f57049a.getActivity();
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
        if (this.f57045k == null) {
            this.f57045k = new HashMap();
        }
        View view = (View) this.f57045k.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f57045k.put(Integer.valueOf(i), view);
        }
        return view;
    }

    public final boolean ae_() {
        return ((Boolean) this.f57044e.getValue()).booleanValue();
    }

    /* renamed from: g */
    public final void mo44866g() {
        if (this.f57045k != null) {
            this.f57045k.clear();
        }
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo44866g();
    }

    /* renamed from: V_ */
    public final void mo44861V_() {
        if (ae_()) {
            C26890h.m65011a("input_wrong_email", new C20856a().mo44776a("page", "Input Email Captcha").mo44776a("error_code", "1").f56798a);
        }
    }

    /* renamed from: U_ */
    public final C21861a mo44860U_() {
        int i;
        int i2;
        C21861a aVar = new C21861a(null, null, false, null, null, false, null, false, false, 511, null);
        if (ae_()) {
            i = R.string.hh8;
        } else {
            i = R.string.hgl;
        }
        aVar.f59182d = getString(i);
        if (ae_()) {
            i2 = R.string.hh7;
        } else {
            i2 = R.string.hgj;
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
        C21839d.m54507a((Fragment) this, str);
        C21853b a = C21852a.m54530a(getActivity(), str, mo45970p());
        if (a != null) {
            C21598l lVar = a.f59142a;
            if (lVar != null && lVar.mo45883e()) {
                mo44960a(false);
                return;
            }
        }
        ((C2193n) f57042c.invoke(this, str, "user_click")).mo6496c((C1710e<? super T>) new C20950d<Object>(this)).mo6491b();
    }

    /* renamed from: a */
    public final void mo44960a(boolean z) {
        C21839d.m54508a((Fragment) this, z);
        Bundle arguments = getArguments();
        if (arguments == null) {
            C52711k.m112234a();
        }
        arguments.putInt("next_page", C21850i.EMAIL_SMS_CHANGE.getValue());
        C52711k.m112236a((Object) arguments, "arguments!!.apply {\n    …S_CHANGE.value)\n        }");
        mo45961a(arguments);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C52711k.m112240b(view, "view");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments == null) {
            C52711k.m112234a();
        }
        if (arguments.getBoolean(PasswordService.FROM_CHANGE_PWD) || ae_()) {
            DmtTextView dmtTextView = (DmtTextView) mo44862a((int) R.id.e1k);
            C52711k.m112236a((Object) dmtTextView, "change_step1");
            dmtTextView.setVisibility(0);
            ((DmtTextView) mo44862a((int) R.id.e1k)).setTextColor(getResources().getColor(R.color.ji));
            DmtTextView dmtTextView2 = (DmtTextView) mo44862a((int) R.id.e1k);
            C52711k.m112236a((Object) dmtTextView2, "change_step1");
            C22020p.m54764a(dmtTextView2, new C20951e(this), R.string.hgm, R.string.hgn);
        }
    }
}
