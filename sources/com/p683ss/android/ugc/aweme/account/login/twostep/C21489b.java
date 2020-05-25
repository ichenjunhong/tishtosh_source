package com.p683ss.android.ugc.aweme.account.login.twostep;

import android.support.p043v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewStub;
import android.widget.TextView;
import com.C2240a;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9413g;
import com.p683ss.android.ugc.aweme.account.login.p1291ui.C21598l.C21600b;
import com.p683ss.android.ugc.aweme.account.login.twostep.C21516g.C21517a;
import com.p683ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi.Api;
import com.p683ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi.C21479a;
import com.p683ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi.C21479a.C21480a;
import com.p683ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi.C21483c;
import com.p683ss.android.ugc.aweme.account.p1307ui.CodeInputView;
import com.p683ss.android.ugc.aweme.account.p1307ui.CodeInputView.C22174a;
import com.p683ss.android.ugc.aweme.account.p1307ui.LoadingCircleView;
import com.p683ss.android.ugc.aweme.account.p1307ui.TimerTextView;
import com.p683ss.android.ugc.aweme.account.util.C22266h;
import com.p683ss.android.ugc.aweme.utils.C47957v;
import com.ss.android.ugc.trill.R;
import java.util.Arrays;
import java.util.Locale;
import org.json.JSONObject;
import p001a.C0011g;
import p001a.C0013i;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.account.login.twostep.b */
public final class C21489b extends C21516g implements C22174a {

    /* renamed from: f */
    public static final boolean f58291f = false;

    /* renamed from: g */
    public static final C21490a f58292g = new C21490a(null);

    /* renamed from: a */
    public TimerTextView f58293a;

    /* renamed from: b */
    public CodeInputView f58294b;

    /* renamed from: c */
    public TextView f58295c;

    /* renamed from: d */
    public View f58296d;

    /* renamed from: e */
    public boolean f58297e;

    /* renamed from: m */
    private LoadingCircleView f58298m;

    /* renamed from: n */
    private TextView f58299n;

    /* renamed from: o */
    private View f58300o;

    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.b$a */
    public static final class C21490a {
        private C21490a() {
        }

        public /* synthetic */ C21490a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.b$b */
    static final class C21491b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C21489b f58301a;

        C21491b(C21489b bVar) {
            this.f58301a = bVar;
        }

        public final void run() {
            JSONObject jSONObject;
            JSONObject jSONObject2 = this.f58301a.f58344h;
            if (jSONObject2 != null) {
                jSONObject = jSONObject2.getJSONObject("data");
            } else {
                jSONObject = null;
            }
            C21489b bVar = this.f58301a;
            String a = C9413g.m18629a(jSONObject, "verify_ticket", "");
            C52711k.m112236a((Object) a, "JsonUtils.queryString(da…rConst.VERIFY_TICKET, \"\")");
            bVar.mo45716d(a);
            if (!TextUtils.isEmpty(this.f58301a.f58346j)) {
                this.f58301a.mo45689b();
            } else {
                this.f58301a.mo45687a(null, "Cannot find verify ticket from JSON data");
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.b$c */
    public static final class C21492c extends C21600b {

        /* renamed from: a */
        final /* synthetic */ C21489b f58302a;

        /* renamed from: a */
        public final void mo45694a() {
            C21489b.m54123a(this.f58302a).setVisibility(0);
            C21489b.m54124b(this.f58302a).setEnabled(false);
        }

        /* renamed from: b */
        public final void mo45695b() {
            C21489b.m54123a(this.f58302a).setVisibility(8);
            C21489b.m54124b(this.f58302a).setEnabled(true);
        }

        C21492c(C21489b bVar) {
            this.f58302a = bVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.b$d */
    static final class C21493d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C21489b f58303a;

        C21493d(C21489b bVar) {
            this.f58303a = bVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f58303a.mo45689b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.b$e */
    static final class C21494e<TTaskResult, TContinuationResult> implements C0011g<C21483c, Object> {

        /* renamed from: a */
        final /* synthetic */ C21489b f58304a;

        C21494e(C21489b bVar) {
            this.f58304a = bVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:19:0x0056  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Object then(p001a.C0013i r5) {
            /*
                r4 = this;
                boolean r0 = com.p683ss.android.ugc.aweme.utils.C47957v.m103770a(r5)
                r1 = 1
                r2 = 0
                if (r0 != 0) goto L_0x0014
                com.ss.android.ugc.aweme.account.login.twostep.b r5 = r4.f58304a
                r5.f58297e = r1
                com.ss.android.ugc.aweme.account.login.twostep.b r5 = r4.f58304a
                java.lang.String r0 = "TwoStepAuthApi.verifyEmailCode bolts Task error"
                r5.mo45687a(r2, r0)
                return r2
            L_0x0014:
                java.lang.String r0 = "it"
                p2628d.p2639f.p2641b.C52711k.m112236a(r5, r0)
                java.lang.Object r5 = r5.mo34e()
                com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi$c r5 = (com.p683ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi.C21483c) r5
                java.lang.String r0 = "success"
                java.lang.String r3 = r5.f58281a
                boolean r0 = p2628d.p2650m.C52830p.m112406a(r0, r3, r1)
                if (r0 == 0) goto L_0x0046
                com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi$c$a r0 = r5.f58282b
                if (r0 == 0) goto L_0x0046
                com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi$c$a r0 = r5.f58282b
                java.lang.String r0 = r0.f58283a
                java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                if (r0 == 0) goto L_0x003a
                goto L_0x0046
            L_0x003a:
                com.ss.android.ugc.aweme.account.login.twostep.b r0 = r4.f58304a
                com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi$c$a r5 = r5.f58282b
                java.lang.String r5 = r5.f58283a
                r0.mo45692c(r5)
                d.x r5 = p2628d.C52860x.f131107a
                return r5
            L_0x0046:
                com.ss.android.ugc.aweme.account.login.twostep.b r0 = r4.f58304a
                r0.f58297e = r1
                if (r5 == 0) goto L_0x0053
                com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi$c$a r0 = r5.f58282b
                if (r0 == 0) goto L_0x0053
                java.lang.Integer r0 = r0.f58285c
                goto L_0x0054
            L_0x0053:
                r0 = r2
            L_0x0054:
                if (r5 == 0) goto L_0x005d
                com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi$c$a r5 = r5.f58282b
                if (r5 == 0) goto L_0x005d
                java.lang.String r5 = r5.f58286d
                goto L_0x005e
            L_0x005d:
                r5 = r2
            L_0x005e:
                com.ss.android.ugc.aweme.account.login.twostep.b r1 = r4.f58304a
                r1.mo45687a(r0, r5)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.account.login.twostep.C21489b.C21494e.then(a.i):java.lang.Object");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.b$f */
    static final class C21495f<TTaskResult, TContinuationResult> implements C0011g<C21479a, Object> {

        /* renamed from: a */
        final /* synthetic */ C21489b f58305a;

        C21495f(C21489b bVar) {
            this.f58305a = bVar;
        }

        public final /* synthetic */ Object then(C0013i iVar) {
            Integer num;
            String str;
            String str2;
            String str3 = null;
            if (C47957v.m103770a(iVar)) {
                C52711k.m112236a((Object) iVar, "it");
                if (!C52830p.m112406a("error", ((C21479a) iVar.mo34e()).f58267a, true)) {
                    if (TextUtils.isEmpty(C21489b.m54125c(this.f58305a).getText())) {
                        TextView c = C21489b.m54125c(this.f58305a);
                        Locale locale = Locale.US;
                        C52711k.m112236a((Object) locale, "Locale.US");
                        AppCompatActivity d = this.f58305a.mo45715d();
                        if (d == null) {
                            C52711k.m112234a();
                        }
                        String string = d.getString(R.string.ag6);
                        C52711k.m112236a((Object) string, "getActivity()!!.getStrin…common_verify_email_text)");
                        Object[] objArr = new Object[1];
                        C21480a aVar = ((C21479a) iVar.mo34e()).f58268b;
                        if (aVar != null) {
                            str3 = aVar.f58269a;
                        }
                        objArr[0] = str3;
                        String a = C2240a.m6773a(locale, string, Arrays.copyOf(objArr, 1));
                        C52711k.m112236a((Object) a, "java.lang.String.format(locale, format, *args)");
                        c.setText(a);
                    }
                    CodeInputView codeInputView = this.f58305a.f58294b;
                    if (codeInputView == null) {
                        C52711k.m112237a("codeInputView");
                    }
                    codeInputView.setEnabled(true);
                    C21489b.m54124b(this.f58305a).setEnabled(false);
                    this.f58305a.mo45691c();
                    return C21489b.m54123a(this.f58305a).mo46336c();
                }
            }
            if (C21489b.f58291f) {
                C52711k.m112236a((Object) iVar, "it");
                if (iVar.mo35f() == null) {
                    C21480a aVar2 = ((C21479a) iVar.mo34e()).f58268b;
                    if (aVar2 != null) {
                        str2 = aVar2.f58271c;
                    } else {
                        str2 = null;
                    }
                    new Exception(str2);
                }
            }
            C21489b bVar = this.f58305a;
            C52711k.m112236a((Object) iVar, "it");
            C21480a aVar3 = ((C21479a) iVar.mo34e()).f58268b;
            if (aVar3 != null) {
                num = aVar3.f58272d;
            } else {
                num = null;
            }
            Exception f = iVar.mo35f();
            if (f != null) {
                String message = f.getMessage();
                if (message != null) {
                    str = message;
                    bVar.mo45687a(num, str);
                    return null;
                }
            }
            C21480a aVar4 = ((C21479a) iVar.mo34e()).f58268b;
            if (aVar4 != null) {
                str = aVar4.f58271c;
            } else {
                str = null;
            }
            bVar.mo45687a(num, str);
            return null;
        }
    }

    /* renamed from: e */
    private final void m54126e() {
        View view = this.f58300o;
        if (view == null) {
            C52711k.m112237a("errorLayout");
        }
        view.setVisibility(8);
        CodeInputView codeInputView = this.f58294b;
        if (codeInputView == null) {
            C52711k.m112237a("codeInputView");
        }
        codeInputView.mo46265d();
    }

    /* renamed from: b */
    public final void mo45689b() {
        TwoStepAuthApi twoStepAuthApi = TwoStepAuthApi.f58265b;
        twoStepAuthApi.mo45660a().sendEmailCode(this.f58346j, Integer.valueOf(6)).mo20a((C0011g<TResult, TContinuationResult>) new C21495f<TResult,TContinuationResult>(this), C0013i.f25b);
    }

    /* renamed from: c */
    public final void mo45691c() {
        LoadingCircleView loadingCircleView = this.f58298m;
        if (loadingCircleView == null) {
            C52711k.m112237a("loadingView");
        }
        loadingCircleView.mo46300b();
        LoadingCircleView loadingCircleView2 = this.f58298m;
        if (loadingCircleView2 == null) {
            C52711k.m112237a("loadingView");
        }
        loadingCircleView2.setVisibility(8);
    }

    /* renamed from: a */
    public final View mo45685a() {
        if (this.f58347k.getLayoutResource() <= 0) {
            this.f58347k.setLayoutResource(R.layout.azl);
        }
        View inflate = this.f58347k.inflate();
        C52711k.m112236a((Object) inflate, "view");
        View findViewById = inflate.findViewById(R.id.a_k);
        C52711k.m112236a((Object) findViewById, "view.findViewById(R.id.e…de_authenticator_loading)");
        this.f58298m = (LoadingCircleView) findViewById;
        View findViewById2 = inflate.findViewById(R.id.a_g);
        C52711k.m112236a((Object) findViewById2, "view.findViewById(R.id.e…_code_authenticator_desc)");
        this.f58295c = (TextView) findViewById2;
        View findViewById3 = inflate.findViewById(R.id.a_j);
        C52711k.m112236a((Object) findViewById3, "view.findViewById(R.id.e…code_authenticator_input)");
        this.f58294b = (CodeInputView) findViewById3;
        View findViewById4 = inflate.findViewById(R.id.a_l);
        C52711k.m112236a((Object) findViewById4, "view.findViewById(R.id.e…ode_authenticator_resend)");
        this.f58296d = findViewById4;
        View findViewById5 = inflate.findViewById(R.id.a_m);
        C52711k.m112236a((Object) findViewById5, "view.findViewById(R.id.e…code_authenticator_timer)");
        this.f58293a = (TimerTextView) findViewById5;
        View findViewById6 = inflate.findViewById(R.id.a_h);
        C52711k.m112236a((Object) findViewById6, "view.findViewById(R.id.e…thenticator_error_layout)");
        this.f58300o = findViewById6;
        View findViewById7 = inflate.findViewById(R.id.a_i);
        C52711k.m112236a((Object) findViewById7, "view.findViewById(R.id.e…authenticator_error_text)");
        this.f58299n = (TextView) findViewById7;
        TimerTextView timerTextView = this.f58293a;
        if (timerTextView == null) {
            C52711k.m112237a("timerText");
        }
        timerTextView.mo46334a(60000, 1000, "s");
        TimerTextView timerTextView2 = this.f58293a;
        if (timerTextView2 == null) {
            C52711k.m112237a("timerText");
        }
        timerTextView2.setCallback(new C21492c(this));
        View view = this.f58296d;
        if (view == null) {
            C52711k.m112237a("resendCodeBtn");
        }
        view.setEnabled(false);
        View view2 = this.f58296d;
        if (view2 == null) {
            C52711k.m112237a("resendCodeBtn");
        }
        view2.setOnClickListener(new C21493d(this));
        CodeInputView codeInputView = this.f58294b;
        if (codeInputView == null) {
            C52711k.m112237a("codeInputView");
        }
        codeInputView.setEnabled(false);
        CodeInputView codeInputView2 = this.f58294b;
        if (codeInputView2 == null) {
            C52711k.m112237a("codeInputView");
        }
        codeInputView2.mo46260a();
        CodeInputView codeInputView3 = this.f58294b;
        if (codeInputView3 == null) {
            C52711k.m112237a("codeInputView");
        }
        codeInputView3.mo46262b();
        CodeInputView codeInputView4 = this.f58294b;
        if (codeInputView4 == null) {
            C52711k.m112237a("codeInputView");
        }
        codeInputView4.setCallback(this);
        if (this.f58344h == null) {
            mo45687a(null, "JSON is empty");
        } else {
            C47957v.m103771b(new C21491b(this));
        }
        return inflate;
    }

    /* renamed from: a */
    public static final /* synthetic */ TimerTextView m54123a(C21489b bVar) {
        TimerTextView timerTextView = bVar.f58293a;
        if (timerTextView == null) {
            C52711k.m112237a("timerText");
        }
        return timerTextView;
    }

    /* renamed from: b */
    public static final /* synthetic */ View m54124b(C21489b bVar) {
        View view = bVar.f58296d;
        if (view == null) {
            C52711k.m112237a("resendCodeBtn");
        }
        return view;
    }

    /* renamed from: c */
    public static final /* synthetic */ TextView m54125c(C21489b bVar) {
        TextView textView = bVar.f58295c;
        if (textView == null) {
            C52711k.m112237a("descriptionText");
        }
        return textView;
    }

    /* renamed from: f */
    private final void m54127f(String str) {
        View view = this.f58300o;
        if (view == null) {
            C52711k.m112237a("errorLayout");
        }
        view.setVisibility(0);
        TextView textView = this.f58299n;
        if (textView == null) {
            C52711k.m112237a("errorText");
        }
        textView.setText(str);
        CodeInputView codeInputView = this.f58294b;
        if (codeInputView == null) {
            C52711k.m112237a("codeInputView");
        }
        codeInputView.mo46264c();
    }

    /* renamed from: b */
    public final void mo45690b(String str) {
        C52711k.m112240b(str, "currentText");
        if (this.f58297e) {
            CodeInputView codeInputView = this.f58294b;
            if (codeInputView == null) {
                C52711k.m112237a("codeInputView");
            }
            codeInputView.setText("");
            this.f58297e = false;
        }
        m54126e();
    }

    /* renamed from: c */
    public final void mo45692c(String str) {
        mo45691c();
        m54126e();
        mo45717e(str);
    }

    /* renamed from: a */
    public final void mo45688a(String str) {
        C52711k.m112240b(str, "codes");
        this.f58297e = false;
        LoadingCircleView loadingCircleView = this.f58298m;
        if (loadingCircleView == null) {
            C52711k.m112237a("loadingView");
        }
        loadingCircleView.setVisibility(0);
        LoadingCircleView loadingCircleView2 = this.f58298m;
        if (loadingCircleView2 == null) {
            C52711k.m112237a("loadingView");
        }
        loadingCircleView2.mo46299a();
        m54126e();
        TwoStepAuthApi twoStepAuthApi = TwoStepAuthApi.f58265b;
        String str2 = this.f58346j;
        C52711k.m112240b(str, "code");
        Api a = twoStepAuthApi.mo45660a();
        Integer valueOf = Integer.valueOf(1);
        String a2 = C22266h.m55115a(null);
        C52711k.m112236a((Object) a2, "CryptoUtils.encryptWithXor(email)");
        String a3 = C22266h.m55115a(str);
        C52711k.m112236a((Object) a3, "CryptoUtils.encryptWithXor(code)");
        a.verifyEmailCode(valueOf, a2, a3, 6, str2).mo20a((C0011g<TResult, TContinuationResult>) new C21494e<TResult,TContinuationResult>(this), C0013i.f25b);
    }

    /* renamed from: a */
    public final void mo45687a(Integer num, String str) {
        mo45691c();
        m54127f(mo45714b(num, str));
    }

    public C21489b(AppCompatActivity appCompatActivity, ViewStub viewStub, C21517a aVar) {
        C52711k.m112240b(appCompatActivity, "activity");
        C52711k.m112240b(viewStub, "stub");
        C52711k.m112240b(aVar, "authCallback");
        super(appCompatActivity, viewStub, aVar);
    }
}
