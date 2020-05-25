package com.p683ss.android.ugc.aweme.account.login.fragment;

import android.os.Bundle;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.app.FragmentActivity;
import android.support.p043v7.widget.AppCompatCheckBox;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.dmt.p664ui.p669e.C10705c;
import com.bytedance.lobby.auth.AuthResult;
import com.example.p906a.C13482c;
import com.p683ss.android.ugc.aweme.account.login.p1291ui.LoginButton;
import com.p683ss.android.ugc.aweme.account.login.termsconstent.C21472c;
import com.p683ss.android.ugc.aweme.account.login.termsconstent.C21473d;
import com.p683ss.android.ugc.aweme.account.p1260a.p1262b.C20856a;
import com.p683ss.android.ugc.aweme.account.util.C22271m;
import com.p683ss.android.ugc.aweme.account.views.AutoRTLImageView;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.sharer.p2172b.C42311c;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.account.login.fragment.bt */
public final class C21290bt extends C21168a {

    /* renamed from: o */
    public int f57807o = 1;

    /* renamed from: p */
    public boolean f57808p;

    /* renamed from: q */
    public String f57809q = "";

    /* renamed from: r */
    public boolean f57810r;

    /* renamed from: s */
    public String f57811s = "";

    /* renamed from: t */
    public String f57812t = "";

    /* renamed from: u */
    public String f57813u = "";

    /* renamed from: v */
    public boolean f57814v;

    /* renamed from: w */
    public boolean f57815w;

    /* renamed from: x */
    private AuthResult f57816x;

    /* renamed from: y */
    private String f57817y = "";

    /* renamed from: z */
    private HashMap f57818z;

    /* renamed from: com.ss.android.ugc.aweme.account.login.fragment.bt$a */
    static final class C21291a implements OnCheckedChangeListener {

        /* renamed from: a */
        final /* synthetic */ C21290bt f57819a;

        /* renamed from: b */
        final /* synthetic */ AppCompatCheckBox f57820b;

        /* renamed from: c */
        final /* synthetic */ AppCompatCheckBox f57821c;

        /* renamed from: d */
        final /* synthetic */ AppCompatCheckBox f57822d;

        C21291a(C21290bt btVar, AppCompatCheckBox appCompatCheckBox, AppCompatCheckBox appCompatCheckBox2, AppCompatCheckBox appCompatCheckBox3) {
            this.f57819a = btVar;
            this.f57820b = appCompatCheckBox;
            this.f57821c = appCompatCheckBox2;
            this.f57822d = appCompatCheckBox3;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            boolean z2;
            this.f57820b.setChecked(z);
            this.f57821c.setChecked(z);
            C21290bt btVar = this.f57819a;
            if (!this.f57822d.isChecked() || !this.f57820b.isChecked() || !this.f57821c.isChecked()) {
                z2 = false;
            } else {
                z2 = true;
            }
            btVar.f57810r = z2;
            this.f57819a.mo45431c(this.f57819a.f57810r);
            this.f57819a.mo45430a("total", z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.fragment.bt$b */
    static final class C21292b implements OnCheckedChangeListener {

        /* renamed from: a */
        final /* synthetic */ C21290bt f57823a;

        /* renamed from: b */
        final /* synthetic */ AppCompatCheckBox f57824b;

        /* renamed from: c */
        final /* synthetic */ AppCompatCheckBox f57825c;

        /* renamed from: d */
        final /* synthetic */ AppCompatCheckBox f57826d;

        C21292b(C21290bt btVar, AppCompatCheckBox appCompatCheckBox, AppCompatCheckBox appCompatCheckBox2, AppCompatCheckBox appCompatCheckBox3) {
            this.f57823a = btVar;
            this.f57824b = appCompatCheckBox;
            this.f57825c = appCompatCheckBox2;
            this.f57826d = appCompatCheckBox3;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            boolean z2;
            boolean isChecked = this.f57824b.isChecked();
            AppCompatCheckBox appCompatCheckBox = this.f57825c;
            boolean z3 = true;
            if (!z || !this.f57824b.isChecked()) {
                z2 = false;
            } else {
                z2 = true;
            }
            appCompatCheckBox.setChecked(z2);
            this.f57824b.setChecked(isChecked);
            C21290bt btVar = this.f57823a;
            if (!this.f57825c.isChecked() || !this.f57826d.isChecked() || !this.f57824b.isChecked()) {
                z3 = false;
            }
            btVar.f57810r = z3;
            this.f57823a.mo45431c(this.f57823a.f57810r);
            this.f57823a.mo45430a("single", z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.fragment.bt$c */
    static final class C21293c implements OnCheckedChangeListener {

        /* renamed from: a */
        final /* synthetic */ C21290bt f57827a;

        /* renamed from: b */
        final /* synthetic */ AppCompatCheckBox f57828b;

        /* renamed from: c */
        final /* synthetic */ AppCompatCheckBox f57829c;

        /* renamed from: d */
        final /* synthetic */ AppCompatCheckBox f57830d;

        C21293c(C21290bt btVar, AppCompatCheckBox appCompatCheckBox, AppCompatCheckBox appCompatCheckBox2, AppCompatCheckBox appCompatCheckBox3) {
            this.f57827a = btVar;
            this.f57828b = appCompatCheckBox;
            this.f57829c = appCompatCheckBox2;
            this.f57830d = appCompatCheckBox3;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            boolean z2;
            boolean isChecked = this.f57828b.isChecked();
            AppCompatCheckBox appCompatCheckBox = this.f57829c;
            boolean z3 = true;
            if (!z || !this.f57828b.isChecked()) {
                z2 = false;
            } else {
                z2 = true;
            }
            appCompatCheckBox.setChecked(z2);
            this.f57828b.setChecked(isChecked);
            C21290bt btVar = this.f57827a;
            if (!this.f57829c.isChecked() || !this.f57828b.isChecked() || !this.f57830d.isChecked()) {
                z3 = false;
            }
            btVar.f57810r = z3;
            this.f57827a.mo45431c(this.f57827a.f57810r);
            this.f57827a.mo45430a("single", z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.fragment.bt$d */
    static final class C21294d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C21290bt f57831a;

        C21294d(C21290bt btVar) {
            this.f57831a = btVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            try {
                FragmentActivity activity = this.f57831a.getActivity();
                if (activity != null) {
                    activity.onBackPressed();
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.fragment.bt$e */
    static final class C21295e implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C21290bt f57832a;

        C21295e(C21290bt btVar) {
            this.f57832a = btVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            if (!this.f57832a.f57810r) {
                C10691a.m21542b(this.f57832a.getContext(), (int) R.string.fy7).mo19066a();
                return;
            }
            if (this.f57832a.f57808p) {
                if (!C21297bv.m53883a(this.f57832a.getContext())) {
                    C10691a.m21542b(this.f57832a.getContext(), (int) R.string.cg1).mo19066a();
                    return;
                }
                FragmentActivity activity = this.f57832a.getActivity();
                if (activity == null) {
                    C52711k.m112234a();
                }
                activity.setResult(-1);
                FragmentActivity activity2 = this.f57832a.getActivity();
                if (activity2 == null) {
                    C52711k.m112234a();
                }
                activity2.finish();
            } else if (this.f57832a.f57807o == 1) {
                Fragment a = C22271m.m55124a(C21226av.class, this.f57832a.getArguments()).mo46370a();
                if (a != null) {
                    C21168a aVar = (C21168a) a;
                    aVar.mo45323a(this.f57832a.f57511d);
                    this.f57832a.mo45321a((Fragment) aVar, false);
                } else {
                    throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.fragment.BaseMusLoginFragment");
                }
            } else {
                Fragment a2 = C22271m.m55124a(C21227aw.class, this.f57832a.getArguments()).mo46372a("country_code_alpha_2", this.f57832a.f57811s).mo46372a("country_code", this.f57832a.f57812t).mo46372a("phone_number", this.f57832a.f57813u).mo46373a("NEW_PHONE_USER", true).mo46373a("use_whatsapp_code", this.f57832a.f57814v).mo46373a("reset_ticker", this.f57832a.f57815w).mo46370a();
                if (a2 != null) {
                    C21168a aVar2 = (C21168a) a2;
                    aVar2.mo45323a(this.f57832a.f57511d);
                    this.f57832a.mo45321a((Fragment) aVar2, false);
                } else {
                    throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.fragment.BaseMusLoginFragment");
                }
            }
            C26890h.m65011a("register_terms_click_next", new C20856a().mo44776a("enter_from", this.f57832a.f57514l).mo44776a("enter_method", this.f57832a.f57515m).mo44776a("platform", this.f57832a.f57809q).f56798a);
        }
    }

    /* renamed from: b */
    private View m53879b(int i) {
        if (this.f57818z == null) {
            this.f57818z = new HashMap();
        }
        View view = (View) this.f57818z.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f57818z.put(Integer.valueOf(i), view);
        }
        return view;
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        if (this.f57818z != null) {
            this.f57818z.clear();
        }
    }

    /* renamed from: c */
    public final void mo45431c(boolean z) {
        if (z) {
            ((LoginButton) m53879b(R.id.e0y)).setLoginBackgroundRes(R.drawable.ch2);
        } else {
            ((LoginButton) m53879b(R.id.e0y)).setLoginBackgroundRes(R.drawable.ch3);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004c, code lost:
        if (r0 == null) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x005a, code lost:
        if (r0 == null) goto L_0x005c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0068, code lost:
        if (r0 == null) goto L_0x006a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0076, code lost:
        if (r0 == null) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0027, code lost:
        if (r4 == null) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r4) {
        /*
            r3 = this;
            super.onCreate(r4)
            android.os.Bundle r4 = r3.getArguments()
            android.support.v4.app.FragmentActivity r0 = r3.getActivity()
            boolean r0 = r0 instanceof com.p683ss.android.ugc.aweme.account.login.termsconstent.TermsConsentActivity
            r3.f57808p = r0
            boolean r0 = r3.f57808p
            if (r0 == 0) goto L_0x002e
            if (r4 == 0) goto L_0x001e
            java.lang.String r0 = "key_auth_result"
            android.os.Parcelable r4 = r4.getParcelable(r0)
            com.bytedance.lobby.auth.AuthResult r4 = (com.bytedance.lobby.auth.AuthResult) r4
            goto L_0x001f
        L_0x001e:
            r4 = 0
        L_0x001f:
            r3.f57816x = r4
            com.bytedance.lobby.auth.AuthResult r4 = r3.f57816x
            if (r4 == 0) goto L_0x0029
            java.lang.String r4 = r4.f32456d
            if (r4 != 0) goto L_0x002b
        L_0x0029:
            java.lang.String r4 = ""
        L_0x002b:
            r3.f57809q = r4
            goto L_0x0093
        L_0x002e:
            r0 = 1
            if (r4 == 0) goto L_0x0037
            java.lang.String r1 = "init_page"
            int r0 = r4.getInt(r1, r0)
        L_0x0037:
            r3.f57807o = r0
            int r0 = r3.f57807o
            if (r0 != 0) goto L_0x0040
            java.lang.String r0 = "sms_verification"
            goto L_0x0042
        L_0x0040:
            java.lang.String r0 = "phone"
        L_0x0042:
            r3.f57809q = r0
            if (r4 == 0) goto L_0x004e
            java.lang.String r0 = "country_code_alpha_2"
            java.lang.String r0 = r4.getString(r0)
            if (r0 != 0) goto L_0x0050
        L_0x004e:
            java.lang.String r0 = ""
        L_0x0050:
            r3.f57811s = r0
            if (r4 == 0) goto L_0x005c
            java.lang.String r0 = "country_code"
            java.lang.String r0 = r4.getString(r0)
            if (r0 != 0) goto L_0x005e
        L_0x005c:
            java.lang.String r0 = ""
        L_0x005e:
            r3.f57812t = r0
            if (r4 == 0) goto L_0x006a
            java.lang.String r0 = "phone_number"
            java.lang.String r0 = r4.getString(r0)
            if (r0 != 0) goto L_0x006c
        L_0x006a:
            java.lang.String r0 = ""
        L_0x006c:
            r3.f57813u = r0
            if (r4 == 0) goto L_0x0078
            java.lang.String r0 = "sms_code_key"
            java.lang.String r0 = r4.getString(r0)
            if (r0 != 0) goto L_0x007a
        L_0x0078:
            java.lang.String r0 = ""
        L_0x007a:
            r3.f57817y = r0
            r0 = 0
            if (r4 == 0) goto L_0x0086
            java.lang.String r1 = "use_whatsapp_code"
            boolean r1 = r4.getBoolean(r1, r0)
            goto L_0x0087
        L_0x0086:
            r1 = 0
        L_0x0087:
            r3.f57814v = r1
            if (r4 == 0) goto L_0x0091
            java.lang.String r1 = "reset_ticker"
            boolean r0 = r4.getBoolean(r1, r0)
        L_0x0091:
            r3.f57815w = r0
        L_0x0093:
            java.lang.String r4 = "register_terms_show"
            com.ss.android.ugc.aweme.account.a.b.a r0 = new com.ss.android.ugc.aweme.account.a.b.a
            r0.<init>()
            java.lang.String r1 = "enter_from"
            java.lang.String r2 = r3.f57514l
            com.ss.android.ugc.aweme.account.a.b.a r0 = r0.mo44776a(r1, r2)
            java.lang.String r1 = "enter_method"
            java.lang.String r2 = r3.f57515m
            com.ss.android.ugc.aweme.account.a.b.a r0 = r0.mo44776a(r1, r2)
            java.lang.String r1 = "platform"
            java.lang.String r2 = r3.f57809q
            com.ss.android.ugc.aweme.account.a.b.a r0 = r0.mo44776a(r1, r2)
            java.util.Map<java.lang.String, java.lang.String> r0 = r0.f56798a
            com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.account.login.fragment.C21290bt.onCreate(android.os.Bundle):void");
    }

    /* renamed from: a */
    public final void mo45430a(String str, boolean z) {
        int i;
        String str2 = "register_terms_click";
        C20856a a = new C20856a().mo44776a("enter_from", this.f57514l).mo44776a("enter_method", this.f57515m).mo44776a("platform", this.f57809q).mo44776a(C42311c.f106865i, str);
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
        AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) m53879b(R.id.e1c);
        C52711k.m112236a((Object) appCompatCheckBox, "cb_terms_pp_select_all");
        AppCompatCheckBox appCompatCheckBox2 = (AppCompatCheckBox) m53879b(R.id.e1e);
        C52711k.m112236a((Object) appCompatCheckBox2, "cb_terms_pp_select_terms");
        AppCompatCheckBox appCompatCheckBox3 = (AppCompatCheckBox) m53879b(R.id.e1d);
        C52711k.m112236a((Object) appCompatCheckBox3, "cb_terms_pp_select_pp");
        appCompatCheckBox.setOnCheckedChangeListener(new C21291a(this, appCompatCheckBox2, appCompatCheckBox3, appCompatCheckBox));
        appCompatCheckBox2.setOnCheckedChangeListener(new C21292b(this, appCompatCheckBox3, appCompatCheckBox, appCompatCheckBox2));
        appCompatCheckBox3.setOnCheckedChangeListener(new C21293c(this, appCompatCheckBox2, appCompatCheckBox, appCompatCheckBox3));
        String b = C21472c.m54112b();
        String c = C21472c.m54113c();
        WebView webView = (WebView) m53879b(R.id.f8d);
        C52711k.m112236a((Object) webView, "wv_terms");
        webView.setWebViewClient(C13482c.m27232a(new C21473d(getActivity())));
        WebView webView2 = (WebView) m53879b(R.id.f8d);
        C52711k.m112236a((Object) webView2, "wv_terms");
        webView2.setWebChromeClient(new WebChromeClient());
        WebView webView3 = (WebView) m53879b(R.id.f8d);
        C52711k.m112236a((Object) webView3, "wv_terms");
        WebSettings settings = webView3.getSettings();
        C52711k.m112236a((Object) settings, "wv_terms.settings");
        settings.setJavaScriptEnabled(true);
        WebView webView4 = (WebView) m53879b(R.id.f8d);
        C52711k.m112236a((Object) webView4, "wv_terms");
        WebSettings settings2 = webView4.getSettings();
        C52711k.m112236a((Object) settings2, "wv_terms.settings");
        settings2.setDomStorageEnabled(true);
        C21296bu.m53882a((WebView) m53879b(R.id.f8d), b);
        WebView webView5 = (WebView) m53879b(R.id.f8c);
        C52711k.m112236a((Object) webView5, "wv_pp");
        webView5.setWebViewClient(C13482c.m27232a(new C21473d(getActivity())));
        WebView webView6 = (WebView) m53879b(R.id.f8c);
        C52711k.m112236a((Object) webView6, "wv_pp");
        webView6.setWebChromeClient(new WebChromeClient());
        WebView webView7 = (WebView) m53879b(R.id.f8c);
        C52711k.m112236a((Object) webView7, "wv_pp");
        WebSettings settings3 = webView7.getSettings();
        C52711k.m112236a((Object) settings3, "wv_pp.settings");
        settings3.setJavaScriptEnabled(true);
        WebView webView8 = (WebView) m53879b(R.id.f8c);
        C52711k.m112236a((Object) webView8, "wv_pp");
        WebSettings settings4 = webView8.getSettings();
        C52711k.m112236a((Object) settings4, "wv_pp.settings");
        settings4.setDomStorageEnabled(true);
        C21296bu.m53882a((WebView) m53879b(R.id.f8c), c);
        C10705c.m21579a((AutoRTLImageView) m53879b(R.id.eg3));
        ((AutoRTLImageView) m53879b(R.id.eg3)).setOnClickListener(new C21294d(this));
        mo45431c(this.f57810r);
        ((LoginButton) m53879b(R.id.e0y)).setLoadingBackground(R.drawable.ch1);
        ((LoginButton) m53879b(R.id.e0y)).setOnClickListener(new C21295e(this));
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C52711k.m112240b(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.az5, viewGroup, false);
    }
}
