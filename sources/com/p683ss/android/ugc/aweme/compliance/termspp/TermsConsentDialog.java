package com.p683ss.android.ugc.aweme.compliance.termspp;

import android.content.Context;
import android.os.Bundle;
import android.support.p030v4.content.C0726c;
import android.support.p043v7.widget.AppCompatCheckBox;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.dmt.p664ui.p669e.C10705c;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.example.p906a.C13482c;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.p1793g.p1794a.C32800a;
import com.p683ss.android.ugc.aweme.policy.notice.p2080b.C39509a;
import com.p683ss.android.ugc.aweme.protection.C40869c;
import com.p683ss.android.ugc.aweme.protection.gradientpunish.C40878a;
import com.p683ss.android.ugc.aweme.protection.model.TermsConsentInfo;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.compliance.termspp.TermsConsentDialog */
public final class TermsConsentDialog extends AmeSSActivity {

    /* renamed from: b */
    public static final C27078a f71436b = new C27078a(null);

    /* renamed from: a */
    public boolean f71437a;

    /* renamed from: c */
    private HashMap f71438c;

    /* renamed from: com.ss.android.ugc.aweme.compliance.termspp.TermsConsentDialog$a */
    public static final class C27078a {
        private C27078a() {
        }

        public /* synthetic */ C27078a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.termspp.TermsConsentDialog$b */
    static final class C27079b implements OnCheckedChangeListener {

        /* renamed from: a */
        final /* synthetic */ TermsConsentDialog f71439a;

        /* renamed from: b */
        final /* synthetic */ AppCompatCheckBox f71440b;

        /* renamed from: c */
        final /* synthetic */ AppCompatCheckBox f71441c;

        /* renamed from: d */
        final /* synthetic */ AppCompatCheckBox f71442d;

        C27079b(TermsConsentDialog termsConsentDialog, AppCompatCheckBox appCompatCheckBox, AppCompatCheckBox appCompatCheckBox2, AppCompatCheckBox appCompatCheckBox3) {
            this.f71439a = termsConsentDialog;
            this.f71440b = appCompatCheckBox;
            this.f71441c = appCompatCheckBox2;
            this.f71442d = appCompatCheckBox3;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            boolean z2;
            this.f71440b.setChecked(z);
            this.f71441c.setChecked(z);
            TermsConsentDialog termsConsentDialog = this.f71439a;
            if (!this.f71442d.isChecked() || !this.f71440b.isChecked() || !this.f71441c.isChecked()) {
                z2 = false;
            } else {
                z2 = true;
            }
            termsConsentDialog.f71437a = z2;
            this.f71439a.mo55315a(this.f71439a.f71437a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.termspp.TermsConsentDialog$c */
    static final class C27080c implements OnCheckedChangeListener {

        /* renamed from: a */
        final /* synthetic */ TermsConsentDialog f71443a;

        /* renamed from: b */
        final /* synthetic */ AppCompatCheckBox f71444b;

        /* renamed from: c */
        final /* synthetic */ AppCompatCheckBox f71445c;

        /* renamed from: d */
        final /* synthetic */ AppCompatCheckBox f71446d;

        C27080c(TermsConsentDialog termsConsentDialog, AppCompatCheckBox appCompatCheckBox, AppCompatCheckBox appCompatCheckBox2, AppCompatCheckBox appCompatCheckBox3) {
            this.f71443a = termsConsentDialog;
            this.f71444b = appCompatCheckBox;
            this.f71445c = appCompatCheckBox2;
            this.f71446d = appCompatCheckBox3;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            boolean z2;
            boolean isChecked = this.f71444b.isChecked();
            AppCompatCheckBox appCompatCheckBox = this.f71445c;
            boolean z3 = true;
            if (!z || !this.f71444b.isChecked()) {
                z2 = false;
            } else {
                z2 = true;
            }
            appCompatCheckBox.setChecked(z2);
            this.f71444b.setChecked(isChecked);
            TermsConsentDialog termsConsentDialog = this.f71443a;
            if (!this.f71445c.isChecked() || !this.f71446d.isChecked() || !this.f71444b.isChecked()) {
                z3 = false;
            }
            termsConsentDialog.f71437a = z3;
            this.f71443a.mo55315a(this.f71443a.f71437a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.termspp.TermsConsentDialog$d */
    static final class C27081d implements OnCheckedChangeListener {

        /* renamed from: a */
        final /* synthetic */ TermsConsentDialog f71447a;

        /* renamed from: b */
        final /* synthetic */ AppCompatCheckBox f71448b;

        /* renamed from: c */
        final /* synthetic */ AppCompatCheckBox f71449c;

        /* renamed from: d */
        final /* synthetic */ AppCompatCheckBox f71450d;

        C27081d(TermsConsentDialog termsConsentDialog, AppCompatCheckBox appCompatCheckBox, AppCompatCheckBox appCompatCheckBox2, AppCompatCheckBox appCompatCheckBox3) {
            this.f71447a = termsConsentDialog;
            this.f71448b = appCompatCheckBox;
            this.f71449c = appCompatCheckBox2;
            this.f71450d = appCompatCheckBox3;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            boolean z2;
            boolean isChecked = this.f71448b.isChecked();
            AppCompatCheckBox appCompatCheckBox = this.f71449c;
            boolean z3 = true;
            if (!z || !this.f71448b.isChecked()) {
                z2 = false;
            } else {
                z2 = true;
            }
            appCompatCheckBox.setChecked(z2);
            this.f71448b.setChecked(isChecked);
            TermsConsentDialog termsConsentDialog = this.f71447a;
            if (!this.f71449c.isChecked() || !this.f71448b.isChecked() || !this.f71450d.isChecked()) {
                z3 = false;
            }
            termsConsentDialog.f71437a = z3;
            this.f71447a.mo55315a(this.f71447a.f71437a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.termspp.TermsConsentDialog$e */
    static final class C27082e implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TermsConsentDialog f71451a;

        C27082e(TermsConsentDialog termsConsentDialog) {
            this.f71451a = termsConsentDialog;
        }

        public final void onClick(View view) {
            String str;
            ClickInstrumentation.onClick(view);
            if (!C32800a.m75679a(view)) {
                if (this.f71451a.f71437a) {
                    C39509a aVar = new C39509a();
                    TermsConsentInfo x = C40869c.m90393x();
                    if (x != null) {
                        str = x.getBusiness();
                    } else {
                        str = null;
                    }
                    aVar.mo80541a(str, null, null, null, null);
                    TermsConsentDialog.m65315a("qa_kr_terms_dialog_confirm_click");
                    this.f71451a.finish();
                    C40878a.m90441a();
                    return;
                }
                C10691a.m21548c((Context) this.f71451a, (int) R.string.fy7).mo19066a();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.termspp.TermsConsentDialog$f */
    static final class C27083f implements OnTouchListener {

        /* renamed from: a */
        public static final C27083f f71452a = new C27083f();

        C27083f() {
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            if (view != null) {
                ((WebView) view).requestDisallowInterceptTouchEvent(true);
                return false;
            }
            throw new C52857u("null cannot be cast to non-null type android.webkit.WebView");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.termspp.TermsConsentDialog$g */
    static final class C27084g implements OnTouchListener {

        /* renamed from: a */
        public static final C27084g f71453a = new C27084g();

        C27084g() {
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            if (view != null) {
                ((WebView) view).requestDisallowInterceptTouchEvent(true);
                return false;
            }
            throw new C52857u("null cannot be cast to non-null type android.webkit.WebView");
        }
    }

    /* renamed from: a */
    private View m65314a(int i) {
        if (this.f71438c == null) {
            this.f71438c = new HashMap();
        }
        View view = (View) this.f71438c.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f71438c.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final void onBackPressed() {
    }

    public final void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.compliance.termspp.TermsConsentDialog", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.compliance.termspp.TermsConsentDialog", "onResume", false);
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.compliance.termspp.TermsConsentDialog", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: a */
    public static void m65315a(String str) {
        C26890h.m65011a(str, C23089d.m56640a().f61491a);
    }

    /* renamed from: a */
    public final void mo55315a(boolean z) {
        if (z) {
            Context context = this;
            ((DmtTextView) m65314a((int) R.id.e0y)).setTextColor(C0726c.m2098c(context, R.color.auk));
            DmtTextView dmtTextView = (DmtTextView) m65314a((int) R.id.e0y);
            C52711k.m112236a((Object) dmtTextView, "btn_terms_pp_next");
            dmtTextView.setBackground(C0726c.m2091a(context, (int) R.drawable.p3));
            C10705c.m21580a((DmtTextView) m65314a((int) R.id.e0y), 0.5f);
            return;
        }
        Context context2 = this;
        ((DmtTextView) m65314a((int) R.id.e0y)).setTextColor(C0726c.m2098c(context2, R.color.avo));
        DmtTextView dmtTextView2 = (DmtTextView) m65314a((int) R.id.e0y);
        C52711k.m112236a((Object) dmtTextView2, "btn_terms_pp_next");
        dmtTextView2.setBackground(C0726c.m2091a(context2, (int) R.drawable.coc));
        C10705c.m21580a((DmtTextView) m65314a((int) R.id.e0y), 1.0f);
    }

    public final void onCreate(Bundle bundle) {
        CharSequence charSequence;
        CharSequence charSequence2;
        CharSequence charSequence3;
        CharSequence charSequence4;
        CharSequence charSequence5;
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.compliance.termspp.TermsConsentDialog", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.b9f);
        DmtTextView dmtTextView = (DmtTextView) m65314a((int) R.id.f50);
        C52711k.m112236a((Object) dmtTextView, "tv_terms_pp_title");
        TermsConsentInfo x = C40869c.m90393x();
        String str = null;
        if (x != null) {
            charSequence = x.getTitle();
        } else {
            charSequence = null;
        }
        dmtTextView.setText(charSequence);
        DmtTextView dmtTextView2 = (DmtTextView) m65314a((int) R.id.f4z);
        C52711k.m112236a((Object) dmtTextView2, "tv_terms_pp_desc");
        TermsConsentInfo x2 = C40869c.m90393x();
        if (x2 != null) {
            charSequence2 = x2.getDescription();
        } else {
            charSequence2 = null;
        }
        dmtTextView2.setText(charSequence2);
        DmtTextView dmtTextView3 = (DmtTextView) m65314a((int) R.id.f4w);
        C52711k.m112236a((Object) dmtTextView3, "tv_terms_pp_checkbox_all");
        TermsConsentInfo x3 = C40869c.m90393x();
        if (x3 != null) {
            charSequence3 = x3.getCheckboxAll();
        } else {
            charSequence3 = null;
        }
        dmtTextView3.setText(charSequence3);
        DmtTextView dmtTextView4 = (DmtTextView) m65314a((int) R.id.f4y);
        C52711k.m112236a((Object) dmtTextView4, "tv_terms_pp_checkbox_terms");
        TermsConsentInfo x4 = C40869c.m90393x();
        if (x4 != null) {
            charSequence4 = x4.getCheckboxTerms();
        } else {
            charSequence4 = null;
        }
        dmtTextView4.setText(charSequence4);
        DmtTextView dmtTextView5 = (DmtTextView) m65314a((int) R.id.f4x);
        C52711k.m112236a((Object) dmtTextView5, "tv_terms_pp_checkbox_pp");
        TermsConsentInfo x5 = C40869c.m90393x();
        if (x5 != null) {
            charSequence5 = x5.getCheckboxPP();
        } else {
            charSequence5 = null;
        }
        dmtTextView5.setText(charSequence5);
        DmtTextView dmtTextView6 = (DmtTextView) m65314a((int) R.id.e0y);
        C52711k.m112236a((Object) dmtTextView6, "btn_terms_pp_next");
        TermsConsentInfo x6 = C40869c.m90393x();
        if (x6 != null) {
            str = x6.getButton();
        }
        dmtTextView6.setText(str);
        AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) m65314a((int) R.id.e1c);
        C52711k.m112236a((Object) appCompatCheckBox, "cb_terms_pp_select_all");
        AppCompatCheckBox appCompatCheckBox2 = (AppCompatCheckBox) m65314a((int) R.id.e1e);
        C52711k.m112236a((Object) appCompatCheckBox2, "cb_terms_pp_select_terms");
        AppCompatCheckBox appCompatCheckBox3 = (AppCompatCheckBox) m65314a((int) R.id.e1d);
        C52711k.m112236a((Object) appCompatCheckBox3, "cb_terms_pp_select_pp");
        appCompatCheckBox.setOnCheckedChangeListener(new C27079b(this, appCompatCheckBox2, appCompatCheckBox3, appCompatCheckBox));
        appCompatCheckBox2.setOnCheckedChangeListener(new C27080c(this, appCompatCheckBox3, appCompatCheckBox, appCompatCheckBox2));
        appCompatCheckBox3.setOnCheckedChangeListener(new C27081d(this, appCompatCheckBox2, appCompatCheckBox, appCompatCheckBox3));
        String v = C40869c.m90391v();
        String w = C40869c.m90392w();
        if (!TextUtils.isEmpty(v)) {
            WebView webView = (WebView) m65314a((int) R.id.f8d);
            C52711k.m112236a((Object) webView, "wv_terms");
            webView.setWebViewClient(C13482c.m27232a(new C27087c(this)));
            WebView webView2 = (WebView) m65314a((int) R.id.f8d);
            C52711k.m112236a((Object) webView2, "wv_terms");
            webView2.setWebChromeClient(new WebChromeClient());
            WebView webView3 = (WebView) m65314a((int) R.id.f8d);
            C52711k.m112236a((Object) webView3, "wv_terms");
            WebSettings settings = webView3.getSettings();
            C52711k.m112236a((Object) settings, "wv_terms.settings");
            settings.setJavaScriptEnabled(true);
            WebView webView4 = (WebView) m65314a((int) R.id.f8d);
            C52711k.m112236a((Object) webView4, "wv_terms");
            WebSettings settings2 = webView4.getSettings();
            C52711k.m112236a((Object) settings2, "wv_terms.settings");
            settings2.setDomStorageEnabled(true);
            C27085a.m65317a((WebView) m65314a((int) R.id.f8d), v);
            ((WebView) m65314a((int) R.id.f8d)).setOnTouchListener(C27083f.f71452a);
        }
        if (!TextUtils.isEmpty(w)) {
            WebView webView5 = (WebView) m65314a((int) R.id.f8c);
            C52711k.m112236a((Object) webView5, "wv_pp");
            webView5.setWebViewClient(C13482c.m27232a(new C27087c(this)));
            WebView webView6 = (WebView) m65314a((int) R.id.f8c);
            C52711k.m112236a((Object) webView6, "wv_pp");
            webView6.setWebChromeClient(new WebChromeClient());
            WebView webView7 = (WebView) m65314a((int) R.id.f8c);
            C52711k.m112236a((Object) webView7, "wv_pp");
            WebSettings settings3 = webView7.getSettings();
            C52711k.m112236a((Object) settings3, "wv_pp.settings");
            settings3.setJavaScriptEnabled(true);
            WebView webView8 = (WebView) m65314a((int) R.id.f8c);
            C52711k.m112236a((Object) webView8, "wv_pp");
            WebSettings settings4 = webView8.getSettings();
            C52711k.m112236a((Object) settings4, "wv_pp.settings");
            settings4.setDomStorageEnabled(true);
            C27085a.m65317a((WebView) m65314a((int) R.id.f8c), w);
            ((WebView) m65314a((int) R.id.f8c)).setOnTouchListener(C27084g.f71453a);
        }
        ((DmtTextView) m65314a((int) R.id.e0y)).setOnClickListener(new C27082e(this));
        m65315a("qa_kr_terms_dialog_show");
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.compliance.termspp.TermsConsentDialog", "onCreate", false);
    }
}
