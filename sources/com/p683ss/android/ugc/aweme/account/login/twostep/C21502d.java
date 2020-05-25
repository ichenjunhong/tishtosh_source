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
import com.p683ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi.C21481b;
import com.p683ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi.C21481b.C21482a;
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

/* renamed from: com.ss.android.ugc.aweme.account.login.twostep.d */
public final class C21502d extends C21516g implements C22174a {

    /* renamed from: f */
    public static final boolean f58315f = false;

    /* renamed from: g */
    public static final C21503a f58316g = new C21503a(null);

    /* renamed from: a */
    public TimerTextView f58317a;

    /* renamed from: b */
    public CodeInputView f58318b;

    /* renamed from: c */
    public TextView f58319c;

    /* renamed from: d */
    public View f58320d;

    /* renamed from: e */
    public boolean f58321e;

    /* renamed from: m */
    private LoadingCircleView f58322m;

    /* renamed from: n */
    private TextView f58323n;

    /* renamed from: o */
    private View f58324o;

    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.d$a */
    public static final class C21503a {
        private C21503a() {
        }

        public /* synthetic */ C21503a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.d$b */
    static final class C21504b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C21502d f58325a;

        C21504b(C21502d dVar) {
            this.f58325a = dVar;
        }

        public final void run() {
            JSONObject jSONObject;
            JSONObject jSONObject2 = this.f58325a.f58344h;
            if (jSONObject2 != null) {
                jSONObject = jSONObject2.getJSONObject("data");
            } else {
                jSONObject = null;
            }
            C21502d dVar = this.f58325a;
            String a = C9413g.m18629a(jSONObject, "verify_ticket", "");
            C52711k.m112236a((Object) a, "JsonUtils.queryString(da…rConst.VERIFY_TICKET, \"\")");
            dVar.mo45716d(a);
            if (!TextUtils.isEmpty(this.f58325a.f58346j)) {
                this.f58325a.mo45703b();
            } else {
                this.f58325a.mo45702a(null, "Cannot find verify ticket from JSON data");
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.d$c */
    public static final class C21505c extends C21600b {

        /* renamed from: a */
        final /* synthetic */ C21502d f58326a;

        /* renamed from: a */
        public final void mo45694a() {
            C21502d.m54142a(this.f58326a).setVisibility(0);
            C21502d.m54143b(this.f58326a).setEnabled(false);
        }

        /* renamed from: b */
        public final void mo45695b() {
            C21502d.m54142a(this.f58326a).setVisibility(8);
            C21502d.m54143b(this.f58326a).setEnabled(true);
        }

        C21505c(C21502d dVar) {
            this.f58326a = dVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.d$d */
    static final class C21506d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C21502d f58327a;

        C21506d(C21502d dVar) {
            this.f58327a = dVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f58327a.mo45703b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.d$e */
    static final class C21507e<TTaskResult, TContinuationResult> implements C0011g<C21483c, Object> {

        /* renamed from: a */
        final /* synthetic */ C21502d f58328a;

        C21507e(C21502d dVar) {
            this.f58328a = dVar;
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
                com.ss.android.ugc.aweme.account.login.twostep.d r5 = r4.f58328a
                r5.f58321e = r1
                com.ss.android.ugc.aweme.account.login.twostep.d r5 = r4.f58328a
                java.lang.String r0 = "TwoStepAuthApi.verifySmsCode bolts Task error"
                r5.mo45702a(r2, r0)
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
                com.ss.android.ugc.aweme.account.login.twostep.d r0 = r4.f58328a
                com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi$c$a r5 = r5.f58282b
                java.lang.String r5 = r5.f58283a
                r0.mo45705c(r5)
                d.x r5 = p2628d.C52860x.f131107a
                return r5
            L_0x0046:
                com.ss.android.ugc.aweme.account.login.twostep.d r0 = r4.f58328a
                r0.f58321e = r1
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
                com.ss.android.ugc.aweme.account.login.twostep.d r1 = r4.f58328a
                r1.mo45702a(r0, r5)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.account.login.twostep.C21502d.C21507e.then(a.i):java.lang.Object");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.d$f */
    static final class C21508f<TTaskResult, TContinuationResult> implements C0011g<C21481b, Object> {

        /* renamed from: a */
        final /* synthetic */ C21502d f58329a;

        C21508f(C21502d dVar) {
            this.f58329a = dVar;
        }

        public final /* synthetic */ Object then(C0013i iVar) {
            Integer num;
            String str;
            String str2;
            String str3 = null;
            if (C47957v.m103770a(iVar)) {
                C52711k.m112236a((Object) iVar, "it");
                if (!C52830p.m112406a("error", ((C21481b) iVar.mo34e()).f58273a, true)) {
                    if (TextUtils.isEmpty(C21502d.m54144c(this.f58329a).getText())) {
                        TextView c = C21502d.m54144c(this.f58329a);
                        Locale locale = Locale.US;
                        C52711k.m112236a((Object) locale, "Locale.US");
                        AppCompatActivity d = this.f58329a.mo45715d();
                        if (d == null) {
                            C52711k.m112234a();
                        }
                        String string = d.getString(R.string.agc);
                        C52711k.m112236a((Object) string, "getActivity()!!.getStrin…g.common_verify_sms_text)");
                        Object[] objArr = new Object[1];
                        C21482a aVar = ((C21481b) iVar.mo34e()).f58274b;
                        if (aVar != null) {
                            str3 = aVar.f58275a;
                        }
                        objArr[0] = str3;
                        String a = C2240a.m6773a(locale, string, Arrays.copyOf(objArr, 1));
                        C52711k.m112236a((Object) a, "java.lang.String.format(locale, format, *args)");
                        c.setText(a);
                    }
                    CodeInputView codeInputView = this.f58329a.f58318b;
                    if (codeInputView == null) {
                        C52711k.m112237a("codeInputView");
                    }
                    codeInputView.setEnabled(true);
                    C21502d.m54143b(this.f58329a).setEnabled(false);
                    this.f58329a.mo45704c();
                    return C21502d.m54142a(this.f58329a).mo46336c();
                }
            }
            if (C21502d.f58315f) {
                C52711k.m112236a((Object) iVar, "it");
                if (iVar.mo35f() == null) {
                    C21482a aVar2 = ((C21481b) iVar.mo34e()).f58274b;
                    if (aVar2 != null) {
                        str2 = aVar2.f58278d;
                    } else {
                        str2 = null;
                    }
                    new Exception(str2);
                }
            }
            C21502d dVar = this.f58329a;
            C52711k.m112236a((Object) iVar, "it");
            C21482a aVar3 = ((C21481b) iVar.mo34e()).f58274b;
            if (aVar3 != null) {
                num = aVar3.f58279e;
            } else {
                num = null;
            }
            Exception f = iVar.mo35f();
            if (f != null) {
                String message = f.getMessage();
                if (message != null) {
                    str = message;
                    dVar.mo45702a(num, str);
                    return null;
                }
            }
            C21482a aVar4 = ((C21481b) iVar.mo34e()).f58274b;
            if (aVar4 != null) {
                str = aVar4.f58278d;
            } else {
                str = null;
            }
            dVar.mo45702a(num, str);
            return null;
        }
    }

    /* renamed from: e */
    private final void m54145e() {
        View view = this.f58324o;
        if (view == null) {
            C52711k.m112237a("errorLayout");
        }
        view.setVisibility(8);
        CodeInputView codeInputView = this.f58318b;
        if (codeInputView == null) {
            C52711k.m112237a("codeInputView");
        }
        codeInputView.mo46265d();
    }

    /* renamed from: b */
    public final void mo45703b() {
        TwoStepAuthApi twoStepAuthApi = TwoStepAuthApi.f58265b;
        twoStepAuthApi.mo45660a().sendSmsCode(this.f58346j, Integer.valueOf(22)).mo20a((C0011g<TResult, TContinuationResult>) new C21508f<TResult,TContinuationResult>(this), C0013i.f25b);
    }

    /* renamed from: c */
    public final void mo45704c() {
        LoadingCircleView loadingCircleView = this.f58322m;
        if (loadingCircleView == null) {
            C52711k.m112237a("loadingView");
        }
        loadingCircleView.mo46300b();
        LoadingCircleView loadingCircleView2 = this.f58322m;
        if (loadingCircleView2 == null) {
            C52711k.m112237a("loadingView");
        }
        loadingCircleView2.setVisibility(8);
    }

    /* renamed from: a */
    public final View mo45685a() {
        if (this.f58347k.getLayoutResource() <= 0) {
            this.f58347k.setLayoutResource(R.layout.azn);
        }
        View inflate = this.f58347k.inflate();
        C52711k.m112236a((Object) inflate, "view");
        View findViewById = inflate.findViewById(R.id.cpv);
        C52711k.m112236a((Object) findViewById, "view.findViewById(R.id.s…de_authenticator_loading)");
        this.f58322m = (LoadingCircleView) findViewById;
        View findViewById2 = inflate.findViewById(R.id.cpr);
        C52711k.m112236a((Object) findViewById2, "view.findViewById(R.id.s…_code_authenticator_desc)");
        this.f58319c = (TextView) findViewById2;
        View findViewById3 = inflate.findViewById(R.id.cpu);
        C52711k.m112236a((Object) findViewById3, "view.findViewById(R.id.s…code_authenticator_input)");
        this.f58318b = (CodeInputView) findViewById3;
        View findViewById4 = inflate.findViewById(R.id.cpw);
        C52711k.m112236a((Object) findViewById4, "view.findViewById(R.id.s…ode_authenticator_resend)");
        this.f58320d = findViewById4;
        View findViewById5 = inflate.findViewById(R.id.cpx);
        C52711k.m112236a((Object) findViewById5, "view.findViewById(R.id.s…code_authenticator_timer)");
        this.f58317a = (TimerTextView) findViewById5;
        View findViewById6 = inflate.findViewById(R.id.cps);
        C52711k.m112236a((Object) findViewById6, "view.findViewById(R.id.s…thenticator_error_layout)");
        this.f58324o = findViewById6;
        View findViewById7 = inflate.findViewById(R.id.cpt);
        C52711k.m112236a((Object) findViewById7, "view.findViewById(R.id.s…authenticator_error_text)");
        this.f58323n = (TextView) findViewById7;
        TimerTextView timerTextView = this.f58317a;
        if (timerTextView == null) {
            C52711k.m112237a("timerText");
        }
        timerTextView.mo46334a(60000, 1000, "s");
        TimerTextView timerTextView2 = this.f58317a;
        if (timerTextView2 == null) {
            C52711k.m112237a("timerText");
        }
        timerTextView2.setCallback(new C21505c(this));
        View view = this.f58320d;
        if (view == null) {
            C52711k.m112237a("resendCodeBtn");
        }
        view.setEnabled(false);
        View view2 = this.f58320d;
        if (view2 == null) {
            C52711k.m112237a("resendCodeBtn");
        }
        view2.setOnClickListener(new C21506d(this));
        CodeInputView codeInputView = this.f58318b;
        if (codeInputView == null) {
            C52711k.m112237a("codeInputView");
        }
        codeInputView.setEnabled(false);
        CodeInputView codeInputView2 = this.f58318b;
        if (codeInputView2 == null) {
            C52711k.m112237a("codeInputView");
        }
        codeInputView2.mo46260a();
        CodeInputView codeInputView3 = this.f58318b;
        if (codeInputView3 == null) {
            C52711k.m112237a("codeInputView");
        }
        codeInputView3.mo46262b();
        CodeInputView codeInputView4 = this.f58318b;
        if (codeInputView4 == null) {
            C52711k.m112237a("codeInputView");
        }
        codeInputView4.setCallback(this);
        if (this.f58344h == null) {
            mo45702a(null, "JSON is empty");
        } else {
            C47957v.m103771b(new C21504b(this));
        }
        return inflate;
    }

    /* renamed from: a */
    public static final /* synthetic */ TimerTextView m54142a(C21502d dVar) {
        TimerTextView timerTextView = dVar.f58317a;
        if (timerTextView == null) {
            C52711k.m112237a("timerText");
        }
        return timerTextView;
    }

    /* renamed from: b */
    public static final /* synthetic */ View m54143b(C21502d dVar) {
        View view = dVar.f58320d;
        if (view == null) {
            C52711k.m112237a("resendCodeBtn");
        }
        return view;
    }

    /* renamed from: c */
    public static final /* synthetic */ TextView m54144c(C21502d dVar) {
        TextView textView = dVar.f58319c;
        if (textView == null) {
            C52711k.m112237a("descriptionText");
        }
        return textView;
    }

    /* renamed from: f */
    private final void m54146f(String str) {
        View view = this.f58324o;
        if (view == null) {
            C52711k.m112237a("errorLayout");
        }
        view.setVisibility(0);
        TextView textView = this.f58323n;
        if (textView == null) {
            C52711k.m112237a("errorText");
        }
        textView.setText(str);
        CodeInputView codeInputView = this.f58318b;
        if (codeInputView == null) {
            C52711k.m112237a("codeInputView");
        }
        codeInputView.mo46264c();
    }

    /* renamed from: b */
    public final void mo45690b(String str) {
        C52711k.m112240b(str, "currentText");
        if (this.f58321e) {
            CodeInputView codeInputView = this.f58318b;
            if (codeInputView == null) {
                C52711k.m112237a("codeInputView");
            }
            codeInputView.setText("");
            this.f58321e = false;
        }
        m54145e();
    }

    /* renamed from: c */
    public final void mo45705c(String str) {
        mo45704c();
        m54145e();
        mo45717e(str);
    }

    /* renamed from: a */
    public final void mo45688a(String str) {
        C52711k.m112240b(str, "codes");
        this.f58321e = false;
        LoadingCircleView loadingCircleView = this.f58322m;
        if (loadingCircleView == null) {
            C52711k.m112237a("loadingView");
        }
        loadingCircleView.setVisibility(0);
        LoadingCircleView loadingCircleView2 = this.f58322m;
        if (loadingCircleView2 == null) {
            C52711k.m112237a("loadingView");
        }
        loadingCircleView2.mo46299a();
        m54145e();
        TwoStepAuthApi twoStepAuthApi = TwoStepAuthApi.f58265b;
        String str2 = this.f58346j;
        C52711k.m112240b(str, "code");
        Api a = twoStepAuthApi.mo45660a();
        Integer valueOf = Integer.valueOf(1);
        String a2 = C22266h.m55115a(null);
        String a3 = C22266h.m55115a(str);
        C52711k.m112236a((Object) a3, "CryptoUtils.encryptWithXor(code)");
        a.verifySmsCode(valueOf, a2, a3, 22, str2).mo20a((C0011g<TResult, TContinuationResult>) new C21507e<TResult,TContinuationResult>(this), C0013i.f25b);
    }

    /* renamed from: a */
    public final void mo45702a(Integer num, String str) {
        mo45704c();
        m54146f(mo45714b(num, str));
    }

    public C21502d(AppCompatActivity appCompatActivity, ViewStub viewStub, C21517a aVar) {
        C52711k.m112240b(appCompatActivity, "activity");
        C52711k.m112240b(viewStub, "stub");
        C52711k.m112240b(aVar, "authCallback");
        super(appCompatActivity, viewStub, aVar);
    }
}
