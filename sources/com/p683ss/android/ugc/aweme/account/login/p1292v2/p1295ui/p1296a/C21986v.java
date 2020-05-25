package com.p683ss.android.ugc.aweme.account.login.p1292v2.p1295ui.p1296a;

import android.content.Context;
import android.os.Bundle;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.app.FragmentActivity;
import android.support.p030v4.content.C0726c;
import android.support.p043v7.widget.AppCompatCheckBox;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.dmt.p664ui.p669e.C10705c;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.lobby.auth.AuthResult;
import com.example.p906a.C13482c;
import com.p683ss.android.ugc.aweme.account.login.p1284d.C21134a;
import com.p683ss.android.ugc.aweme.account.login.p1284d.C21134a.C21135a;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21829b;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21839d;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21848h;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21850i;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1293a.C21677s;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1295ui.C21861a;
import com.p683ss.android.ugc.aweme.account.login.termsconstent.C21472c;
import com.p683ss.android.ugc.aweme.account.login.termsconstent.C21473d;
import com.p683ss.android.ugc.aweme.account.p1260a.p1262b.C20856a;
import com.p683ss.android.ugc.aweme.account.views.AutoRTLImageView;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.sharer.p2172b.C42311c;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.v */
public final class C21986v extends C21868b {

    /* renamed from: a */
    public String f59426a;

    /* renamed from: b */
    public boolean f59427b;

    /* renamed from: c */
    public boolean f59428c;

    /* renamed from: d */
    public int f59429d;

    /* renamed from: e */
    public boolean f59430e;

    /* renamed from: j */
    public String f59431j = "";

    /* renamed from: k */
    private int f59432k = C21850i.TERMS_CONSENT_SIGN_UP.getValue();

    /* renamed from: p */
    private AuthResult f59433p;

    /* renamed from: q */
    private HashMap f59434q;

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.v$a */
    static final class C21987a implements OnCheckedChangeListener {

        /* renamed from: a */
        final /* synthetic */ C21986v f59435a;

        /* renamed from: b */
        final /* synthetic */ AppCompatCheckBox f59436b;

        /* renamed from: c */
        final /* synthetic */ AppCompatCheckBox f59437c;

        /* renamed from: d */
        final /* synthetic */ AppCompatCheckBox f59438d;

        C21987a(C21986v vVar, AppCompatCheckBox appCompatCheckBox, AppCompatCheckBox appCompatCheckBox2, AppCompatCheckBox appCompatCheckBox3) {
            this.f59435a = vVar;
            this.f59436b = appCompatCheckBox;
            this.f59437c = appCompatCheckBox2;
            this.f59438d = appCompatCheckBox3;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            boolean z2;
            this.f59436b.setChecked(z);
            this.f59437c.setChecked(z);
            C21986v vVar = this.f59435a;
            if (!this.f59438d.isChecked() || !this.f59436b.isChecked() || !this.f59437c.isChecked()) {
                z2 = false;
            } else {
                z2 = true;
            }
            vVar.f59430e = z2;
            this.f59435a.mo46058a(this.f59435a.f59430e);
            this.f59435a.mo46057a("total", z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.v$b */
    static final class C21988b implements OnCheckedChangeListener {

        /* renamed from: a */
        final /* synthetic */ C21986v f59439a;

        /* renamed from: b */
        final /* synthetic */ AppCompatCheckBox f59440b;

        /* renamed from: c */
        final /* synthetic */ AppCompatCheckBox f59441c;

        /* renamed from: d */
        final /* synthetic */ AppCompatCheckBox f59442d;

        C21988b(C21986v vVar, AppCompatCheckBox appCompatCheckBox, AppCompatCheckBox appCompatCheckBox2, AppCompatCheckBox appCompatCheckBox3) {
            this.f59439a = vVar;
            this.f59440b = appCompatCheckBox;
            this.f59441c = appCompatCheckBox2;
            this.f59442d = appCompatCheckBox3;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            boolean z2;
            boolean isChecked = this.f59440b.isChecked();
            AppCompatCheckBox appCompatCheckBox = this.f59441c;
            boolean z3 = true;
            if (!z || !this.f59440b.isChecked()) {
                z2 = false;
            } else {
                z2 = true;
            }
            appCompatCheckBox.setChecked(z2);
            this.f59440b.setChecked(isChecked);
            C21986v vVar = this.f59439a;
            if (!this.f59441c.isChecked() || !this.f59442d.isChecked() || !this.f59440b.isChecked()) {
                z3 = false;
            }
            vVar.f59430e = z3;
            this.f59439a.mo46058a(this.f59439a.f59430e);
            this.f59439a.mo46057a("single", z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.v$c */
    static final class C21989c implements OnCheckedChangeListener {

        /* renamed from: a */
        final /* synthetic */ C21986v f59443a;

        /* renamed from: b */
        final /* synthetic */ AppCompatCheckBox f59444b;

        /* renamed from: c */
        final /* synthetic */ AppCompatCheckBox f59445c;

        /* renamed from: d */
        final /* synthetic */ AppCompatCheckBox f59446d;

        C21989c(C21986v vVar, AppCompatCheckBox appCompatCheckBox, AppCompatCheckBox appCompatCheckBox2, AppCompatCheckBox appCompatCheckBox3) {
            this.f59443a = vVar;
            this.f59444b = appCompatCheckBox;
            this.f59445c = appCompatCheckBox2;
            this.f59446d = appCompatCheckBox3;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            boolean z2;
            boolean isChecked = this.f59444b.isChecked();
            AppCompatCheckBox appCompatCheckBox = this.f59445c;
            boolean z3 = true;
            if (!z || !this.f59444b.isChecked()) {
                z2 = false;
            } else {
                z2 = true;
            }
            appCompatCheckBox.setChecked(z2);
            this.f59444b.setChecked(isChecked);
            C21986v vVar = this.f59443a;
            if (!this.f59445c.isChecked() || !this.f59444b.isChecked() || !this.f59446d.isChecked()) {
                z3 = false;
            }
            vVar.f59430e = z3;
            this.f59443a.mo46058a(this.f59443a.f59430e);
            this.f59443a.mo46057a("single", z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.v$d */
    static final class C21990d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C21986v f59447a;

        C21990d(C21986v vVar) {
            this.f59447a = vVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            if (!this.f59447a.f59427b || this.f59447a.f59428c) {
                try {
                    FragmentActivity activity = this.f59447a.getActivity();
                    if (activity != null) {
                        activity.onBackPressed();
                    }
                } catch (Exception unused) {
                }
            } else {
                this.f59447a.f59429d = 0;
                this.f59447a.mo46059j();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.v$e */
    static final class C21991e implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C21986v f59448a;

        C21991e(C21986v vVar) {
            this.f59448a = vVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            if (!this.f59448a.f59430e) {
                C10691a.m21542b(this.f59448a.getContext(), (int) R.string.fy7).mo19066a();
                return;
            }
            if (this.f59448a.f59427b) {
                if (!C21993x.m54751a(this.f59448a.getContext())) {
                    C10691a.m21542b(this.f59448a.getContext(), (int) R.string.cg1).mo19066a();
                    return;
                } else {
                    this.f59448a.f59429d = -1;
                    this.f59448a.mo46059j();
                }
            } else if (this.f59448a.mo45965k() == C21850i.TERMS_CONSENT_SIGN_UP) {
                C21986v vVar = this.f59448a;
                Bundle arguments = this.f59448a.getArguments();
                if (arguments == null) {
                    C52711k.m112234a();
                }
                arguments.putInt("next_page", C21850i.PHONE_EMAIL_SIGN_UP.getValue());
                C52711k.m112236a((Object) arguments, "arguments!!.apply {\n    …ue)\n                    }");
                vVar.mo45961a(arguments);
            } else if (this.f59448a.mo45965k() == C21850i.TERMS_CONSENT_NEW_PHONE_USER) {
                C21135a b = C21839d.f59130a.mo45973b((Fragment) this.f59448a);
                C21829b bVar = this.f59448a;
                String a = C21134a.m53619a(b);
                C52711k.m112236a((Object) a, "PhoneNumberUtil.formatNumber(phoneNumber)");
                C21677s.m54407a(bVar, a, this.f59448a.f59431j, C21848h.SIGN_UP, this.f59448a.mo45965k()).mo6491b();
            }
            C26890h.m65011a("register_terms_click_next", new C20856a().mo44776a("enter_from", this.f59448a.mo45966l()).mo44776a("enter_method", this.f59448a.mo45967m()).mo44776a("platform", this.f59448a.f59426a).f56798a);
        }
    }

    /* renamed from: U_ */
    public final C21861a mo44860U_() {
        return null;
    }

    /* renamed from: a */
    public final View mo44862a(int i) {
        if (this.f59434q == null) {
            this.f59434q = new HashMap();
        }
        View view = (View) this.f59434q.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f59434q.put(Integer.valueOf(i), view);
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
        if (this.f59434q != null) {
            this.f59434q.clear();
        }
    }

    /* renamed from: i */
    public final int mo45585i() {
        return R.layout.b12;
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo44866g();
    }

    /* renamed from: f */
    public final boolean mo44865f() {
        if (!this.f59427b || this.f59428c) {
            return super.mo44865f();
        }
        this.f59429d = 0;
        mo46059j();
        return true;
    }

    /* renamed from: j */
    public final void mo46059j() {
        Bundle arguments = getArguments();
        if (arguments == null) {
            arguments = new Bundle();
        }
        C52711k.m112236a((Object) arguments, "arguments ?: Bundle()");
        arguments.putInt("next_page", C21850i.FINISH.getValue());
        arguments.putInt("result_code", this.f59429d);
        arguments.putInt("current_page", C21850i.TERMS_CONSENT_SIGN_UP_THIRD_PARTY.getValue());
        mo45961a(arguments);
    }

    /* renamed from: a */
    public final void mo46058a(boolean z) {
        if (z) {
            DmtTextView dmtTextView = (DmtTextView) mo44862a((int) R.id.e0y);
            Context context = getContext();
            if (context == null) {
                C52711k.m112234a();
            }
            dmtTextView.setTextColor(C0726c.m2098c(context, R.color.aso));
            DmtTextView dmtTextView2 = (DmtTextView) mo44862a((int) R.id.e0y);
            C52711k.m112236a((Object) dmtTextView2, "btn_terms_pp_next");
            Context context2 = getContext();
            if (context2 == null) {
                C52711k.m112234a();
            }
            dmtTextView2.setBackground(C0726c.m2091a(context2, (int) R.drawable.cek));
            C10705c.m21580a((DmtTextView) mo44862a((int) R.id.e0y), 0.5f);
            return;
        }
        DmtTextView dmtTextView3 = (DmtTextView) mo44862a((int) R.id.e0y);
        Context context3 = getContext();
        if (context3 == null) {
            C52711k.m112234a();
        }
        dmtTextView3.setTextColor(C0726c.m2098c(context3, R.color.avo));
        DmtTextView dmtTextView4 = (DmtTextView) mo44862a((int) R.id.e0y);
        C52711k.m112236a((Object) dmtTextView4, "btn_terms_pp_next");
        Context context4 = getContext();
        if (context4 == null) {
            C52711k.m112234a();
        }
        dmtTextView4.setBackground(C0726c.m2091a(context4, (int) R.drawable.ch_));
        C10705c.m21580a((DmtTextView) mo44862a((int) R.id.e0y), 1.0f);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002e, code lost:
        if (r0 == null) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0069, code lost:
        if (r6 == null) goto L_0x006b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r6) {
        /*
            r5 = this;
            super.onCreate(r6)
            android.os.Bundle r6 = r5.getArguments()
            com.ss.android.ugc.aweme.account.login.v2.base.i r0 = r5.mo45965k()
            com.ss.android.ugc.aweme.account.login.v2.base.i r1 = com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21850i.TERMS_CONSENT_SIGN_UP_THIRD_PARTY
            r2 = 0
            r3 = 1
            if (r0 != r1) goto L_0x0013
            r0 = 1
            goto L_0x0014
        L_0x0013:
            r0 = 0
        L_0x0014:
            r5.f59427b = r0
            boolean r0 = r5.f59427b
            if (r0 == 0) goto L_0x0055
            if (r6 == 0) goto L_0x0025
            java.lang.String r0 = "key_auth_result"
            android.os.Parcelable r0 = r6.getParcelable(r0)
            com.bytedance.lobby.auth.AuthResult r0 = (com.bytedance.lobby.auth.AuthResult) r0
            goto L_0x0026
        L_0x0025:
            r0 = 0
        L_0x0026:
            r5.f59433p = r0
            com.bytedance.lobby.auth.AuthResult r0 = r5.f59433p
            if (r0 == 0) goto L_0x0030
            java.lang.String r0 = r0.f32456d
            if (r0 != 0) goto L_0x0032
        L_0x0030:
            java.lang.String r0 = ""
        L_0x0032:
            r5.f59426a = r0
            com.ss.android.ugc.aweme.account.login.v2.base.i r0 = com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21850i.THIRD_PARTY_AGE_GATE
            int r0 = r0.getValue()
            if (r6 == 0) goto L_0x0049
            java.lang.String r1 = "previous_page"
            com.ss.android.ugc.aweme.account.login.v2.base.i r4 = com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21850i.NONE
            int r4 = r4.getValue()
            int r6 = r6.getInt(r1, r4)
            goto L_0x004f
        L_0x0049:
            com.ss.android.ugc.aweme.account.login.v2.base.i r6 = com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21850i.NONE
            int r6 = r6.getValue()
        L_0x004f:
            if (r0 != r6) goto L_0x0052
            r2 = 1
        L_0x0052:
            r5.f59428c = r2
            goto L_0x0080
        L_0x0055:
            com.ss.android.ugc.aweme.account.login.v2.base.i r0 = r5.mo45965k()
            int r0 = r0.getValue()
            r5.f59432k = r0
            if (r6 == 0) goto L_0x006b
            java.lang.String r0 = "sms_code_key"
            java.lang.String r1 = ""
            java.lang.String r6 = r6.getString(r0, r1)
            if (r6 != 0) goto L_0x006d
        L_0x006b:
            java.lang.String r6 = ""
        L_0x006d:
            r5.f59431j = r6
            int r6 = r5.f59432k
            com.ss.android.ugc.aweme.account.login.v2.base.i r0 = com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21850i.TERMS_CONSENT_NEW_PHONE_USER
            int r0 = r0.getValue()
            if (r6 != r0) goto L_0x007c
            java.lang.String r6 = "sms_verification"
            goto L_0x007e
        L_0x007c:
            java.lang.String r6 = "phone"
        L_0x007e:
            r5.f59426a = r6
        L_0x0080:
            java.lang.String r6 = "register_terms_show"
            com.ss.android.ugc.aweme.account.a.b.a r0 = new com.ss.android.ugc.aweme.account.a.b.a
            r0.<init>()
            java.lang.String r1 = "enter_from"
            java.lang.String r2 = r5.mo45966l()
            com.ss.android.ugc.aweme.account.a.b.a r0 = r0.mo44776a(r1, r2)
            java.lang.String r1 = "enter_method"
            java.lang.String r2 = r5.mo45967m()
            com.ss.android.ugc.aweme.account.a.b.a r0 = r0.mo44776a(r1, r2)
            java.lang.String r1 = "platform"
            java.lang.String r2 = r5.f59426a
            com.ss.android.ugc.aweme.account.a.b.a r0 = r0.mo44776a(r1, r2)
            java.util.Map<java.lang.String, java.lang.String> r0 = r0.f56798a
            com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r6, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.account.login.p1292v2.p1295ui.p1296a.C21986v.onCreate(android.os.Bundle):void");
    }

    /* renamed from: a */
    public final void mo46057a(String str, boolean z) {
        int i;
        String str2 = "register_terms_click";
        C20856a a = new C20856a().mo44776a("enter_from", mo45966l()).mo44776a("enter_method", mo45967m()).mo44776a("platform", this.f59426a).mo44776a(C42311c.f106865i, str);
        String str3 = "click_type";
        if (z) {
            i = 1;
        } else {
            i = 2;
        }
        C26890h.m65011a(str2, a.mo44774a(str3, i).f56798a);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C52711k.m112240b(view, "view");
        super.onViewCreated(view, bundle);
        AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) mo44862a((int) R.id.e1c);
        C52711k.m112236a((Object) appCompatCheckBox, "cb_terms_pp_select_all");
        AppCompatCheckBox appCompatCheckBox2 = (AppCompatCheckBox) mo44862a((int) R.id.e1e);
        C52711k.m112236a((Object) appCompatCheckBox2, "cb_terms_pp_select_terms");
        AppCompatCheckBox appCompatCheckBox3 = (AppCompatCheckBox) mo44862a((int) R.id.e1d);
        C52711k.m112236a((Object) appCompatCheckBox3, "cb_terms_pp_select_pp");
        appCompatCheckBox.setOnCheckedChangeListener(new C21987a(this, appCompatCheckBox2, appCompatCheckBox3, appCompatCheckBox));
        appCompatCheckBox2.setOnCheckedChangeListener(new C21988b(this, appCompatCheckBox3, appCompatCheckBox, appCompatCheckBox2));
        appCompatCheckBox3.setOnCheckedChangeListener(new C21989c(this, appCompatCheckBox2, appCompatCheckBox, appCompatCheckBox3));
        String b = C21472c.m54112b();
        String c = C21472c.m54113c();
        WebView webView = (WebView) mo44862a((int) R.id.f8d);
        C52711k.m112236a((Object) webView, "wv_terms");
        webView.setWebViewClient(C13482c.m27232a(new C21473d(getActivity())));
        WebView webView2 = (WebView) mo44862a((int) R.id.f8d);
        C52711k.m112236a((Object) webView2, "wv_terms");
        webView2.setWebChromeClient(new WebChromeClient());
        WebView webView3 = (WebView) mo44862a((int) R.id.f8d);
        C52711k.m112236a((Object) webView3, "wv_terms");
        WebSettings settings = webView3.getSettings();
        C52711k.m112236a((Object) settings, "wv_terms.settings");
        settings.setJavaScriptEnabled(true);
        WebView webView4 = (WebView) mo44862a((int) R.id.f8d);
        C52711k.m112236a((Object) webView4, "wv_terms");
        WebSettings settings2 = webView4.getSettings();
        C52711k.m112236a((Object) settings2, "wv_terms.settings");
        settings2.setDomStorageEnabled(true);
        C21992w.m54750a((WebView) mo44862a((int) R.id.f8d), b);
        WebView webView5 = (WebView) mo44862a((int) R.id.f8c);
        C52711k.m112236a((Object) webView5, "wv_pp");
        webView5.setWebViewClient(C13482c.m27232a(new C21473d(getActivity())));
        WebView webView6 = (WebView) mo44862a((int) R.id.f8c);
        C52711k.m112236a((Object) webView6, "wv_pp");
        webView6.setWebChromeClient(new WebChromeClient());
        WebView webView7 = (WebView) mo44862a((int) R.id.f8c);
        C52711k.m112236a((Object) webView7, "wv_pp");
        WebSettings settings3 = webView7.getSettings();
        C52711k.m112236a((Object) settings3, "wv_pp.settings");
        settings3.setJavaScriptEnabled(true);
        WebView webView8 = (WebView) mo44862a((int) R.id.f8c);
        C52711k.m112236a((Object) webView8, "wv_pp");
        WebSettings settings4 = webView8.getSettings();
        C52711k.m112236a((Object) settings4, "wv_pp.settings");
        settings4.setDomStorageEnabled(true);
        C21992w.m54750a((WebView) mo44862a((int) R.id.f8c), c);
        C10705c.m21579a((AutoRTLImageView) mo44862a((int) R.id.eg3));
        mo45997a((AutoRTLImageView) mo44862a((int) R.id.eg3), new C21990d(this));
        mo46058a(this.f59430e);
        mo45997a((DmtTextView) mo44862a((int) R.id.e0y), new C21991e(this));
    }
}
