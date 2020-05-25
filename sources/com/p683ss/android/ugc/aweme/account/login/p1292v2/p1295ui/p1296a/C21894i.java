package com.p683ss.android.ugc.aweme.account.login.p1292v2.p1295ui.p1296a;

import android.arch.lifecycle.C0195p;
import android.arch.lifecycle.C0198r;
import android.arch.lifecycle.C0199s;
import android.arch.lifecycle.C0214z;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.p030v4.app.FragmentActivity;
import android.support.p030v4.p038f.C0777a;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import com.C2240a;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.p666b.C10641a.C10643a;
import com.bytedance.ies.dmt.p664ui.p669e.C10705c;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.sdk.account.p844a.p845a.C12993e;
import com.bytedance.sdk.account.p844a.p845a.C12996h;
import com.bytedance.sdk.account.p844a.p848d.C13012a;
import com.bytedance.sdk.account.p861f.p862a.C13103b;
import com.bytedance.sdk.account.p861f.p862a.C13104c;
import com.bytedance.sdk.account.p861f.p862a.C13108g;
import com.bytedance.sdk.account.p861f.p862a.C13109h;
import com.bytedance.sdk.account.p861f.p862a.C13115n;
import com.bytedance.sdk.account.p861f.p862a.C13116o;
import com.bytedance.sdk.account.p861f.p862a.C13120s;
import com.bytedance.sdk.account.p877l.C13207b;
import com.p683ss.android.account.p1102b.C18494a;
import com.p683ss.android.ugc.aweme.C23826bi;
import com.p683ss.android.ugc.aweme.C27983t;
import com.p683ss.android.ugc.aweme.account.login.p1291ui.C21598l;
import com.p683ss.android.ugc.aweme.account.login.p1291ui.C21598l.C21600b;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.base.ActionResultModel;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21829b;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21848h;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21850i;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1293a.C21677s;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1293a.C21677s.C21680aa;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1293a.C21677s.C21682ab;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1293a.C21677s.C21683ac;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1293a.C21677s.C21706as;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1293a.C21677s.C21708at;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1293a.C21677s.C21709au;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1293a.C21677s.C21710av;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1293a.C21677s.C21712aw;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1293a.C21677s.C21713ax;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1293a.C21677s.C21714ay;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1293a.C21677s.C21716az;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1293a.C21677s.C21718ba;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1293a.C21677s.C21743bt;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1293a.C21677s.C21745bu;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1293a.C21677s.C21746bv;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1293a.C21677s.C21770cm;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1293a.C21677s.C21772cn;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1293a.C21677s.C21773co;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1293a.C21677s.C21774d;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1293a.C21677s.C21776e;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1293a.C21677s.C21777f;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1293a.C21677s.C21780h;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1293a.C21677s.C21782i;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1293a.C21677s.C21783j;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1293a.C21677s.C21792q;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1293a.C21677s.C21794r;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1293a.C21677s.C21795s;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1293a.C21805t;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1293a.C21806u;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1293a.p1294a.C21639a;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1295ui.C21861a;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1295ui.C21994b;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1295ui.InputResultIndicator;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.timer.TimerHolder.C21852a;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.timer.TimerHolder.C21853b;
import com.p683ss.android.ugc.aweme.account.login.recover.C21444f.C21446b;
import com.p683ss.android.ugc.aweme.account.login.sms.C21464e;
import com.p683ss.android.ugc.aweme.account.loginsetting.C22044a;
import com.p683ss.android.ugc.aweme.account.loginsetting.C22049e;
import com.p683ss.android.ugc.aweme.account.p1260a.p1262b.C20856a;
import com.p683ss.android.ugc.aweme.account.p1274g.C20975a;
import com.p683ss.android.ugc.aweme.account.p1307ui.CodeInputView;
import com.p683ss.android.ugc.aweme.account.p1307ui.CodeInputView.C22174a;
import com.p683ss.android.ugc.aweme.account.p1307ui.LoadingCircleView;
import com.p683ss.android.ugc.aweme.account.p1307ui.TimerTextView;
import com.p683ss.android.ugc.aweme.account.views.C22311a;
import com.p683ss.android.ugc.aweme.account.views.C22313c;
import com.p683ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.p1793g.p1794a.C32800a;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.services.BindService;
import com.p683ss.android.ugc.aweme.services.PasswordService;
import com.ss.android.ugc.trill.R;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import p064c.p065a.C2193n;
import p064c.p065a.C2197r;
import p064c.p065a.p071d.C1710e;
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

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.i */
public final class C21894i extends C21868b implements OnClickListener, C22174a {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f59250a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C21894i.class), "fromProAccount", "getFromProAccount()Z"))};

    /* renamed from: d */
    public static final C21895a f59251d = new C21895a(null);

    /* renamed from: A */
    private boolean f59252A;

    /* renamed from: B */
    private final C52668f f59253B = C52732g.m112285a(new C21897c(this));

    /* renamed from: C */
    private final C21917w f59254C = new C21917w(this);

    /* renamed from: D */
    private HashMap f59255D;

    /* renamed from: b */
    public boolean f59256b;

    /* renamed from: c */
    public boolean f59257c;

    /* renamed from: e */
    private boolean f59258e;

    /* renamed from: j */
    private boolean f59259j;

    /* renamed from: k */
    private String f59260k = "";

    /* renamed from: p */
    private String f59261p = "";

    /* renamed from: q */
    private int f59262q;

    /* renamed from: r */
    private C21853b f59263r;

    /* renamed from: s */
    private C21598l f59264s;

    /* renamed from: t */
    private boolean f59265t;

    /* renamed from: u */
    private C21464e f59266u;

    /* renamed from: v */
    private boolean f59267v;

    /* renamed from: w */
    private boolean f59268w;

    /* renamed from: x */
    private String f59269x = "";

    /* renamed from: y */
    private String f59270y = "";

    /* renamed from: z */
    private C21446b f59271z;

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.i$a */
    public static final class C21895a {
        private C21895a() {
        }

        public /* synthetic */ C21895a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.i$b */
    public static final class C21896b implements C22044a {

        /* renamed from: a */
        final /* synthetic */ C21894i f59272a;

        C21896b(C21894i iVar) {
            this.f59272a = iVar;
        }

        /* renamed from: a */
        public final void mo45313a(boolean z) {
            String str;
            StringBuilder sb = new StringBuilder("Voice code ");
            if (z) {
                str = "enabled";
            } else {
                str = "disabled";
            }
            sb.append(str);
            this.f59272a.f59256b = z;
            C21852a.m54531a(this.f59272a.getActivity(), this.f59272a.mo45970p(), this.f59272a.mo46015w(), z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.i$c */
    static final class C21897c extends C52712l implements C52670a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C21894i f59273a;

        C21897c(C21894i iVar) {
            this.f59273a = iVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Bundle arguments = this.f59273a.getArguments();
            if (arguments == null) {
                C52711k.m112234a();
            }
            return Boolean.valueOf(arguments.getBoolean(BindService.FROM_PROACCOUNT, false));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.i$d */
    static final class C21898d<T> implements C1710e<C13116o> {

        /* renamed from: a */
        final /* synthetic */ C21894i f59274a;

        C21898d(C21894i iVar) {
            this.f59274a = iVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            C13116o oVar = (C13116o) obj;
            if (oVar.f34302e != null) {
                C21639a aVar = C21639a.f58654a;
                C21829b bVar = this.f59274a;
                C21848h p = this.f59274a.mo45970p();
                C21850i k = this.f59274a.mo45965k();
                C13207b bVar2 = oVar.f34302e;
                C52711k.m112236a((Object) bVar2, "it.mUserInfo");
                aVar.mo45904a(bVar, p, k, null, bVar2);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.i$e */
    static final class C21899e<T> implements C1710e<C13115n> {

        /* renamed from: a */
        final /* synthetic */ C21894i f59275a;

        C21899e(C21894i iVar) {
            this.f59275a = iVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            C13115n nVar = (C13115n) obj;
            if (nVar.f34297e != null) {
                C21639a aVar = C21639a.f58654a;
                C21829b bVar = this.f59275a;
                C21848h p = this.f59275a.mo45970p();
                C21850i k = this.f59275a.mo45965k();
                C13207b bVar2 = nVar.f34297e;
                C52711k.m112236a((Object) bVar2, "it.mUserInfo");
                aVar.mo45904a(bVar, p, k, null, bVar2);
            }
            C20975a.m53337a(13);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.i$f */
    static final class C21900f<T> implements C1710e<C13108g> {

        /* renamed from: a */
        final /* synthetic */ C21894i f59276a;

        C21900f(C21894i iVar) {
            this.f59276a = iVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            C13108g gVar = (C13108g) obj;
            if (gVar.f34263f != null) {
                C21639a aVar = C21639a.f58654a;
                C21829b bVar = this.f59276a;
                C21848h p = this.f59276a.mo45970p();
                C21850i k = this.f59276a.mo45965k();
                C13207b bVar2 = gVar.f34263f;
                C52711k.m112236a((Object) bVar2, "it.mUserInfo");
                aVar.mo45904a(bVar, p, k, null, bVar2);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.i$g */
    static final class C21901g<T> implements C1710e<C13012a> {

        /* renamed from: a */
        final /* synthetic */ C21894i f59277a;

        C21901g(C21894i iVar) {
            this.f59277a = iVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            C13012a aVar = (C13012a) obj;
            C21894i iVar = this.f59277a;
            Bundle arguments = this.f59277a.getArguments();
            if (arguments == null) {
                arguments = new Bundle();
            }
            arguments.putInt("next_page", C21850i.RESET_PASSWORD_FOR_PHONE.getValue());
            arguments.putString("ticket", aVar.f34024h);
            C52711k.m112236a((Object) arguments, "(arguments ?: Bundle()).…                        }");
            iVar.mo45961a(arguments);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.i$h */
    static final class C21902h<T> implements C1710e<C13012a> {

        /* renamed from: a */
        final /* synthetic */ C21894i f59278a;

        C21902h(C21894i iVar) {
            this.f59278a = iVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            C13012a aVar = (C13012a) obj;
            C21894i iVar = this.f59278a;
            Bundle arguments = this.f59278a.getArguments();
            if (arguments == null) {
                arguments = new Bundle();
            }
            arguments.putInt("next_page", C21850i.RESET_PASSWORD_FOR_EMAIL.getValue());
            arguments.putString("ticket", aVar.f34024h);
            C52711k.m112236a((Object) arguments, "(arguments ?: Bundle()).…                        }");
            iVar.mo45961a(arguments);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.i$i */
    static final class C21903i<T> implements C1710e<C12993e<C13103b>> {

        /* renamed from: a */
        final /* synthetic */ C21894i f59279a;

        C21903i(C21894i iVar) {
            this.f59279a = iVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            String str;
            C12993e eVar = (C12993e) obj;
            if (this.f59279a.mo46011j()) {
                C26890h.m65011a("set_up_proAccount", new C20856a().mo44776a("page", "Input Phone Captcha").mo44776a("method", "set_by_phone").mo44775a("duration", System.currentTimeMillis() - this.f59279a.f59117m).f56798a);
            }
            C21829b bVar = this.f59279a;
            C13103b bVar2 = (C13103b) eVar.f34007h;
            C52711k.m112240b(bVar, "fragment");
            FragmentActivity activity = bVar.getActivity();
            if (activity != null) {
                C0195p<Bundle> pVar = ((ActionResultModel) C0214z.m440a(activity).mo359a(ActionResultModel.class)).f59092c;
                Bundle arguments = bVar.getArguments();
                if (arguments == null) {
                    arguments = new Bundle();
                }
                User i = C23826bi.m58468i();
                if (!(i == null || bVar2 == null)) {
                    C13207b bVar3 = bVar2.f34239f;
                    C52711k.m112236a((Object) bVar3, "mobileObj.mUserInfo");
                    C18494a aVar = (C18494a) bVar3.f34475c.get("mobile");
                    if (aVar != null) {
                        str = aVar.f50951e;
                    } else {
                        str = "";
                    }
                    i.setPhoneBinded(true);
                    i.setBindPhone(str);
                    C13207b b = bVar2.mo24646b();
                    C52711k.m112236a((Object) b, "mobileObj.userInfo");
                    if (b.f34473a > 0) {
                        C23826bi.m58449a().updateUserInfo(bVar2.f34239f);
                    }
                    if (str == null) {
                        C52711k.m112234a();
                    }
                    C13207b bVar4 = bVar2.f34239f;
                    C52711k.m112236a((Object) bVar4, "mobileObj.mUserInfo");
                    String jSONObject = bVar4.f34481i.toString();
                    C52711k.m112236a((Object) jSONObject, "mobileObj.mUserInfo.rawData.toString()");
                    C23826bi.m58451a(7, 1, (Object) new C27983t(str, jSONObject));
                }
                pVar.postValue(arguments);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.i$j */
    static final class C21904j<T> implements C1710e<C12996h> {

        /* renamed from: a */
        final /* synthetic */ C21894i f59280a;

        C21904j(C21894i iVar) {
            this.f59280a = iVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            C12996h hVar = (C12996h) obj;
            C21894i iVar = this.f59280a;
            Bundle arguments = this.f59280a.getArguments();
            if (arguments == null) {
                arguments = new Bundle();
            }
            arguments.putInt("next_page", C21850i.INPUT_PHONE_MODIFY.getValue());
            C52711k.m112236a((Object) hVar, "it");
            arguments.putString("ticket", hVar.f34021h);
            C52711k.m112236a((Object) arguments, "(arguments ?: Bundle()).…                        }");
            iVar.mo45961a(arguments);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.i$k */
    static final class C21905k<T> implements C1710e<C12993e<C13104c>> {

        /* renamed from: a */
        final /* synthetic */ C21894i f59281a;

        C21905k(C21894i iVar) {
            this.f59281a = iVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            C21639a.m54352a(this.f59281a, (C13104c) ((C12993e) obj).f34007h);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.i$l */
    static final class C21906l<T> implements C0199s<String> {

        /* renamed from: a */
        final /* synthetic */ C21894i f59282a;

        C21906l(C21894i iVar) {
            this.f59282a = iVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            ((CodeInputView) this.f59282a.mo44862a((int) R.id.ecj)).setTextAndAutoCheck((String) obj);
            this.f59282a.mo46017y();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.i$m */
    static final class C21907m<T> implements C1710e<C12993e<C13120s>> {

        /* renamed from: a */
        final /* synthetic */ C21894i f59283a;

        C21907m(C21894i iVar) {
            this.f59283a = iVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            C12993e eVar = (C12993e) obj;
            TimerTextView timerTextView = (TimerTextView) this.f59283a.mo44862a((int) R.id.eci);
            C52711k.m112236a((Object) timerTextView, "inputCodeTimerView");
            timerTextView.setVisibility(0);
            this.f59283a.mo46016x();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.i$n */
    static final class C21908n<T> implements C1710e<C12993e<C13120s>> {

        /* renamed from: a */
        final /* synthetic */ C21894i f59284a;

        C21908n(C21894i iVar) {
            this.f59284a = iVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            C12993e eVar = (C12993e) obj;
            CodeInputView codeInputView = (CodeInputView) this.f59284a.mo44862a((int) R.id.ecj);
            C52711k.m112236a((Object) codeInputView, "inputCodeView");
            codeInputView.setEnabled(true);
            TimerTextView timerTextView = (TimerTextView) this.f59284a.mo44862a((int) R.id.eci);
            C52711k.m112236a((Object) timerTextView, "inputCodeTimerView");
            timerTextView.setVisibility(0);
            this.f59284a.mo46016x();
            CodeInputView codeInputView2 = (CodeInputView) this.f59284a.mo44862a((int) R.id.ecj);
            C52711k.m112236a((Object) codeInputView2, "inputCodeView");
            C21994b.m54752a(codeInputView2);
            this.f59284a.f59257c = true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.i$o */
    public static final class C21909o extends C22313c {

        /* renamed from: a */
        final /* synthetic */ C21894i f59285a;

        public final void onClick(View view) {
            C52711k.m112240b(view, "view");
            if (!C32800a.m75679a(view) && this.f59285a.mo45998s()) {
                this.f59285a.onClick(view);
            }
        }

        C21909o(C21894i iVar, int i, int i2) {
            this.f59285a = iVar;
            super(i, i2);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.i$p */
    static final class C21910p<T> implements C1710e<C12993e<C13120s>> {

        /* renamed from: a */
        final /* synthetic */ C21894i f59286a;

        C21910p(C21894i iVar) {
            this.f59286a = iVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            C12993e eVar = (C12993e) obj;
            this.f59286a.mo46016x();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.i$q */
    static final class C21911q<T> implements C1710e<C12993e<C13120s>> {

        /* renamed from: a */
        final /* synthetic */ C21894i f59287a;

        C21911q(C21894i iVar) {
            this.f59287a = iVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            C12993e eVar = (C12993e) obj;
            this.f59287a.mo46016x();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.i$r */
    static final class C21912r<T> implements C1710e<C12993e<C13120s>> {

        /* renamed from: a */
        final /* synthetic */ C21894i f59288a;

        C21912r(C21894i iVar) {
            this.f59288a = iVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            C12993e eVar = (C12993e) obj;
            this.f59288a.mo46016x();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.i$s */
    static final class C21913s<T> implements C1710e<C12993e<C13109h>> {

        /* renamed from: a */
        final /* synthetic */ C21894i f59289a;

        C21913s(C21894i iVar) {
            this.f59289a = iVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            C12993e eVar = (C12993e) obj;
            this.f59289a.mo46016x();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.i$t */
    static final class C21914t<T> implements C1710e<C12993e<C13120s>> {

        /* renamed from: a */
        final /* synthetic */ C21894i f59290a;

        C21914t(C21894i iVar) {
            this.f59290a = iVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            C12993e eVar = (C12993e) obj;
            this.f59290a.mo46016x();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.i$u */
    static final class C21915u<T> implements C1710e<C12993e<C13109h>> {

        /* renamed from: a */
        final /* synthetic */ C21894i f59291a;

        C21915u(C21894i iVar) {
            this.f59291a = iVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            C12993e eVar = (C12993e) obj;
            this.f59291a.mo46016x();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.i$v */
    static final class C21916v<T> implements C1710e<C12993e<C13120s>> {

        /* renamed from: a */
        final /* synthetic */ C21894i f59292a;

        C21916v(C21894i iVar) {
            this.f59292a = iVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            C12993e eVar = (C12993e) obj;
            this.f59292a.mo46016x();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.i$w */
    public static final class C21917w extends C21600b {

        /* renamed from: a */
        final /* synthetic */ C21894i f59293a;

        /* renamed from: a */
        public final void mo45694a() {
            this.f59293a.mo46013u();
        }

        /* renamed from: b */
        public final void mo45695b() {
            if (this.f59293a.isViewValid()) {
                this.f59293a.mo46014v();
            }
        }

        C21917w(C21894i iVar) {
            this.f59293a = iVar;
        }

        /* renamed from: a */
        public final void mo45869a(long j) {
            if (this.f59293a.isViewValid()) {
                this.f59293a.mo46010a(j, true);
            }
        }
    }

    /* renamed from: a */
    public final View mo44862a(int i) {
        if (this.f59255D == null) {
            this.f59255D = new HashMap();
        }
        View view = (View) this.f59255D.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f59255D.put(Integer.valueOf(i), view);
        }
        return view;
    }

    public final void ad_() {
        m54610z();
    }

    /* renamed from: g */
    public final void mo44866g() {
        if (this.f59255D != null) {
            this.f59255D.clear();
        }
    }

    /* renamed from: i */
    public final int mo45585i() {
        return R.layout.b0t;
    }

    /* renamed from: j */
    public final boolean mo46011j() {
        return ((Boolean) this.f59253B.getValue()).booleanValue();
    }

    public final void onResume() {
        super.onResume();
    }

    /* renamed from: w */
    public final String mo46015w() {
        if (TextUtils.isEmpty(this.f59261p)) {
            return this.f59260k;
        }
        return this.f59261p;
    }

    /* renamed from: z */
    private final void m54610z() {
        LoadingCircleView loadingCircleView = (LoadingCircleView) mo44862a((int) R.id.ece);
        C52711k.m112236a((Object) loadingCircleView, "inputCodeLoadingView");
        loadingCircleView.setVisibility(0);
        ((LoadingCircleView) mo44862a((int) R.id.ece)).mo46299a();
    }

    public final void onDestroyView() {
        C21464e eVar = this.f59266u;
        if (eVar != null) {
            eVar.mo45649c();
        }
        super.onDestroyView();
        KeyboardUtils.m58184c((CodeInputView) mo44862a((int) R.id.ecj));
        mo44866g();
    }

    public final void onStart() {
        super.onStart();
        CodeInputView codeInputView = (CodeInputView) mo44862a((int) R.id.ecj);
        C52711k.m112236a((Object) codeInputView, "inputCodeView");
        C21994b.m54752a(codeInputView);
    }

    /* renamed from: y */
    public final void mo46017y() {
        C26890h.m65011a("auto_fill_sms_verification", new C20856a().mo44776a("enter_method", mo45967m()).f56798a);
    }

    /* renamed from: e */
    public final void mo45584e() {
        CodeInputView codeInputView = (CodeInputView) mo44862a((int) R.id.ecj);
        C52711k.m112236a((Object) codeInputView, "inputCodeView");
        codeInputView.setEnabled(true);
        LoadingCircleView loadingCircleView = (LoadingCircleView) mo44862a((int) R.id.ece);
        C52711k.m112236a((Object) loadingCircleView, "inputCodeLoadingView");
        loadingCircleView.setVisibility(8);
        ((LoadingCircleView) mo44862a((int) R.id.ece)).mo46300b();
    }

    /* renamed from: f */
    public final boolean mo44865f() {
        if (mo46011j()) {
            C26890h.m65011a("back", C20856a.m53173a().mo44776a("enter_from", "Input Phone Captcha").mo44775a("duration", System.currentTimeMillis() - this.f59117m).f56798a);
        }
        return super.mo44865f();
    }

    /* renamed from: u */
    public final void mo46013u() {
        TimerTextView timerTextView = (TimerTextView) mo44862a((int) R.id.eci);
        C52711k.m112236a((Object) timerTextView, "inputCodeTimerView");
        if (timerTextView.getVisibility() != 0) {
            TimerTextView timerTextView2 = (TimerTextView) mo44862a((int) R.id.eci);
            C52711k.m112236a((Object) timerTextView2, "inputCodeTimerView");
            timerTextView2.setVisibility(0);
        }
        DmtTextView dmtTextView = (DmtTextView) mo44862a((int) R.id.ecf);
        C52711k.m112236a((Object) dmtTextView, "inputCodeResendBtn");
        dmtTextView.setEnabled(false);
    }

    /* renamed from: v */
    public final void mo46014v() {
        TimerTextView timerTextView = (TimerTextView) mo44862a((int) R.id.eci);
        C52711k.m112236a((Object) timerTextView, "inputCodeTimerView");
        if (timerTextView.getVisibility() != 8) {
            TimerTextView timerTextView2 = (TimerTextView) mo44862a((int) R.id.eci);
            C52711k.m112236a((Object) timerTextView2, "inputCodeTimerView");
            timerTextView2.setVisibility(8);
        }
        DmtTextView dmtTextView = (DmtTextView) mo44862a((int) R.id.ecf);
        C52711k.m112236a((Object) dmtTextView, "inputCodeResendBtn");
        dmtTextView.setEnabled(true);
    }

    /* renamed from: x */
    public final void mo46016x() {
        DmtTextView dmtTextView = (DmtTextView) mo44862a((int) R.id.ecf);
        C52711k.m112236a((Object) dmtTextView, "inputCodeResendBtn");
        dmtTextView.setEnabled(false);
        ((TimerTextView) mo44862a((int) R.id.eci)).setCallback(this.f59254C);
        C21852a.m54532a(getActivity(), mo46015w(), new C21853b(((TimerTextView) mo44862a((int) R.id.eci)).mo46336c(), null, 2, null), mo45970p());
    }

    /* renamed from: U_ */
    public final C21861a mo44860U_() {
        String str;
        String str2;
        String str3;
        boolean z;
        String string;
        String a;
        String str4;
        String str5 = "";
        int i = C21918j.f59294a[mo45965k().ordinal()];
        int i2 = R.string.afq;
        boolean z2 = true;
        switch (i) {
            case 1:
                if (!this.f59258e) {
                    i2 = R.string.agb;
                }
                string = getString(i2);
                C52711k.m112236a((Object) string, "getString(if (useWhatsAp…btitle\n                })");
                Locale locale = Locale.US;
                C52711k.m112236a((Object) locale, "Locale.US");
                String string2 = getString(R.string.afo);
                C52711k.m112236a((Object) string2, "getString(R.string.commo…istration_phone_sms_text)");
                a = C2240a.m6773a(locale, string2, Arrays.copyOf(new Object[]{this.f59260k}, 1));
                C52711k.m112236a((Object) a, "java.lang.String.format(locale, format, *args)");
                if (!this.f59258e) {
                    str4 = "phone_sign_up_sms_verification_page";
                    break;
                } else {
                    str4 = "phone_sign_up_whatsapp_verification_page";
                    break;
                }
            case 2:
                string = getString(R.string.ag5);
                C52711k.m112236a((Object) string, "getString(R.string.common_verify_email_subtitle)");
                Locale locale2 = Locale.US;
                C52711k.m112236a((Object) locale2, "Locale.US");
                String string3 = getString(R.string.ag6);
                C52711k.m112236a((Object) string3, "getString(R.string.common_verify_email_text)");
                a = C2240a.m6773a(locale2, string3, Arrays.copyOf(new Object[]{this.f59261p}, 1));
                C52711k.m112236a((Object) a, "java.lang.String.format(locale, format, *args)");
                str4 = "email_sign_up_verification_page";
                break;
            case 3:
                string = getString(R.string.agb);
                C52711k.m112236a((Object) string, "getString(R.string.common_verify_sms_subtitle)");
                Locale locale3 = Locale.US;
                C52711k.m112236a((Object) locale3, "Locale.US");
                String string4 = getString(R.string.afo);
                C52711k.m112236a((Object) string4, "getString(R.string.commo…istration_phone_sms_text)");
                a = C2240a.m6773a(locale3, string4, Arrays.copyOf(new Object[]{this.f59260k}, 1));
                C52711k.m112236a((Object) a, "java.lang.String.format(locale, format, *args)");
                str4 = "reset_sms_code_input";
                break;
            case 4:
                string = getString(R.string.ag5);
                C52711k.m112236a((Object) string, "getString(R.string.common_verify_email_subtitle)");
                Locale locale4 = Locale.US;
                C52711k.m112236a((Object) locale4, "Locale.US");
                String string5 = getString(R.string.ag6);
                C52711k.m112236a((Object) string5, "getString(R.string.common_verify_email_text)");
                a = C2240a.m6773a(locale4, string5, Arrays.copyOf(new Object[]{this.f59261p}, 1));
                C52711k.m112236a((Object) a, "java.lang.String.format(locale, format, *args)");
                str4 = "reset_email_code_input";
                break;
            case 5:
                if (!this.f59258e) {
                    i2 = R.string.agb;
                }
                string = getString(i2);
                C52711k.m112236a((Object) string, "getString(if (useWhatsAp…btitle\n                })");
                mo45970p();
                C21848h hVar = C21848h.RECOVER_ACCOUNT;
                Locale locale5 = Locale.US;
                C52711k.m112236a((Object) locale5, "Locale.US");
                String string6 = getString(R.string.afo);
                C52711k.m112236a((Object) string6, "getString(R.string.commo…istration_phone_sms_text)");
                a = C2240a.m6773a(locale5, string6, Arrays.copyOf(new Object[]{this.f59260k}, 1));
                C52711k.m112236a((Object) a, "java.lang.String.format(locale, format, *args)");
                if (!this.f59258e) {
                    str4 = "phone_login_sms_verification_page";
                    break;
                } else {
                    str4 = "phone_login_whatsapp_verification_page";
                    break;
                }
            case 6:
            case 7:
            case 8:
                String string7 = getString(R.string.agb);
                C52711k.m112236a((Object) string7, "getString(R.string.common_verify_sms_subtitle)");
                Locale locale6 = Locale.US;
                C52711k.m112236a((Object) locale6, "Locale.US");
                String string8 = getString(R.string.afo);
                C52711k.m112236a((Object) string8, "getString(R.string.commo…istration_phone_sms_text)");
                String a2 = C2240a.m6773a(locale6, string8, Arrays.copyOf(new Object[]{this.f59260k}, 1));
                C52711k.m112236a((Object) a2, "java.lang.String.format(locale, format, *args)");
                str = str5;
                str3 = string7;
                str2 = a2;
                z2 = false;
                break;
            default:
                StringBuilder sb = new StringBuilder("Unknown step ");
                sb.append(mo45965k());
                sb.append(" during getCommonUiParam()");
                throw new IllegalStateException(sb.toString());
        }
        str = str4;
        str3 = string;
        str2 = a;
        if (mo45970p() == C21848h.RECOVER_ACCOUNT || this.f59252A) {
            z = false;
        } else {
            z = z2;
        }
        C21861a aVar = new C21861a(" ", null, false, str3, str2, false, str, z, false, 294, null);
        return aVar;
    }

    /* renamed from: b */
    public final void mo45690b(String str) {
        C52711k.m112240b(str, "currentText");
        if (isViewValid()) {
            if (this.f59268w) {
                ((CodeInputView) mo44862a((int) R.id.ecj)).setText("");
                this.f59268w = false;
            }
            ((InputResultIndicator) mo44862a((int) R.id.ecc)).mo45986a();
            ((CodeInputView) mo44862a((int) R.id.ecj)).mo46265d();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x008c, code lost:
        if (r4 == null) goto L_0x008e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00a6, code lost:
        if (r4 == null) goto L_0x00a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00b8, code lost:
        if (r4 == null) goto L_0x00ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00df, code lost:
        if (r4 != false) goto L_0x00fc;
     */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x011c  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x012c  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0135  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0141  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0155  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x015f  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0179  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0190  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r4) {
        /*
            r3 = this;
            super.onCreate(r4)
            com.ss.android.ugc.aweme.account.login.v2.base.i r4 = r3.mo45965k()
            int[] r0 = com.p683ss.android.ugc.aweme.account.login.p1292v2.p1295ui.p1296a.C21918j.f59295b
            int r4 = r4.ordinal()
            r4 = r0[r4]
            switch(r4) {
                case 1: goto L_0x004c;
                case 2: goto L_0x004c;
                case 3: goto L_0x004c;
                case 4: goto L_0x004c;
                case 5: goto L_0x004c;
                case 6: goto L_0x0040;
                case 7: goto L_0x0040;
                case 8: goto L_0x002c;
                default: goto L_0x0012;
            }
        L_0x0012:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Unknown step "
            r0.<init>(r1)
            com.ss.android.ugc.aweme.account.login.v2.base.i r1 = r3.mo45965k()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r4.<init>(r0)
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            throw r4
        L_0x002c:
            com.ss.android.ugc.aweme.profile.model.User r4 = com.p683ss.android.ugc.aweme.C23826bi.m58468i()
            java.lang.String r0 = "ModuleStore.getCurUser()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r4, r0)
            java.lang.String r4 = r4.getBindPhone()
            if (r4 != 0) goto L_0x003d
            java.lang.String r4 = ""
        L_0x003d:
            r3.f59260k = r4
            goto L_0x0092
        L_0x0040:
            com.ss.android.ugc.aweme.account.login.v2.base.d r4 = com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21839d.f59130a
            r0 = r3
            android.support.v4.app.Fragment r0 = (android.support.p030v4.app.Fragment) r0
            java.lang.String r4 = r4.mo45972a(r0)
            r3.f59261p = r4
            goto L_0x0092
        L_0x004c:
            com.ss.android.ugc.aweme.account.login.v2.base.d r4 = com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21839d.f59130a
            r0 = r3
            android.support.v4.app.Fragment r0 = (android.support.p030v4.app.Fragment) r0
            com.ss.android.ugc.aweme.account.login.d.a$a r4 = r4.mo45973b(r0)
            java.lang.String r4 = com.p683ss.android.ugc.aweme.account.login.p1284d.C21134a.m53619a(r4)
            java.lang.String r0 = "PhoneNumberUtil.formatNu…ataHelper.getPhone(this))"
            p2628d.p2639f.p2641b.C52711k.m112236a(r4, r0)
            r3.f59260k = r4
            java.lang.String r4 = r3.f59260k
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 == 0) goto L_0x0092
            com.ss.android.ugc.aweme.account.login.v2.base.h r4 = r3.mo45970p()
            com.ss.android.ugc.aweme.account.login.v2.base.h r0 = com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21848h.RECOVER_ACCOUNT
            if (r4 != r0) goto L_0x0092
            android.os.Bundle r4 = r3.getArguments()
            if (r4 == 0) goto L_0x007f
            java.lang.String r0 = "recover_account_data"
            java.io.Serializable r4 = r4.getSerializable(r0)
            goto L_0x0080
        L_0x007f:
            r4 = 0
        L_0x0080:
            com.ss.android.ugc.aweme.account.login.recover.f$b r4 = (com.p683ss.android.ugc.aweme.account.login.recover.C21444f.C21446b) r4
            r3.f59271z = r4
            com.ss.android.ugc.aweme.account.login.recover.f$b r4 = r3.f59271z
            if (r4 == 0) goto L_0x008e
            java.lang.String r4 = r4.getMobile()
            if (r4 != 0) goto L_0x0090
        L_0x008e:
            java.lang.String r4 = ""
        L_0x0090:
            r3.f59260k = r4
        L_0x0092:
            com.ss.android.ugc.aweme.account.login.v2.base.h r4 = r3.mo45970p()
            com.ss.android.ugc.aweme.account.login.v2.base.h r0 = com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21848h.MODIFY_PHONE
            if (r4 != r0) goto L_0x00be
            android.os.Bundle r4 = r3.getArguments()
            if (r4 == 0) goto L_0x00a8
            java.lang.String r0 = "ticket"
            java.lang.String r4 = r4.getString(r0)
            if (r4 != 0) goto L_0x00aa
        L_0x00a8:
            java.lang.String r4 = ""
        L_0x00aa:
            r3.f59269x = r4
            android.os.Bundle r4 = r3.getArguments()
            if (r4 == 0) goto L_0x00ba
            java.lang.String r0 = "mUnusableMobileTicket"
            java.lang.String r4 = r4.getString(r0)
            if (r4 != 0) goto L_0x00bc
        L_0x00ba:
            java.lang.String r4 = ""
        L_0x00bc:
            r3.f59270y = r4
        L_0x00be:
            java.lang.String r4 = r3.f59260k
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            r0 = 0
            if (r4 == 0) goto L_0x00fc
            com.ss.android.ugc.aweme.account.login.v2.base.h r4 = r3.mo45970p()
            com.ss.android.ugc.aweme.account.login.v2.base.h r1 = com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21848h.RECOVER_ACCOUNT
            r2 = 1
            if (r4 != r1) goto L_0x00e2
            java.lang.String r4 = r3.f59261p
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            int r4 = r4.length()
            if (r4 != 0) goto L_0x00de
            r4 = 1
            goto L_0x00df
        L_0x00de:
            r4 = 0
        L_0x00df:
            if (r4 == 0) goto L_0x00e2
            goto L_0x00fc
        L_0x00e2:
            java.lang.String r4 = r3.f59261p
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            int r4 = r4.length()
            if (r4 <= 0) goto L_0x00ed
            goto L_0x00ee
        L_0x00ed:
            r2 = 0
        L_0x00ee:
            if (r2 == 0) goto L_0x00f2
            r4 = 6
            goto L_0x00fd
        L_0x00f2:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "InputCodeFragment needs either a phone or an email"
            r4.<init>(r0)
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            throw r4
        L_0x00fc:
            r4 = 4
        L_0x00fd:
            r3.f59262q = r4
            android.os.Bundle r4 = r3.getArguments()
            if (r4 == 0) goto L_0x010c
            java.lang.String r1 = "use_whatsapp"
            boolean r4 = r4.getBoolean(r1, r0)
            goto L_0x010d
        L_0x010c:
            r4 = 0
        L_0x010d:
            r3.f59258e = r4
            android.os.Bundle r4 = r3.getArguments()
            if (r4 == 0) goto L_0x011c
            java.lang.String r1 = "bind_secure"
            boolean r4 = r4.getBoolean(r1, r0)
            goto L_0x011d
        L_0x011c:
            r4 = 0
        L_0x011d:
            r3.f59265t = r4
            android.os.Bundle r4 = r3.getArguments()
            if (r4 == 0) goto L_0x012c
            java.lang.String r1 = "from_choose_dialog"
            boolean r4 = r4.getBoolean(r1, r0)
            goto L_0x012d
        L_0x012c:
            r4 = 0
        L_0x012d:
            r3.f59259j = r4
            android.os.Bundle r4 = r3.getArguments()
            if (r4 == 0) goto L_0x013b
            java.lang.String r1 = "recover_mobile_code"
            boolean r0 = r4.getBoolean(r1, r0)
        L_0x013b:
            r3.f59252A = r0
            com.ss.android.ugc.aweme.account.login.sms.e r4 = r3.f59266u
            if (r4 != 0) goto L_0x0151
            com.ss.android.ugc.aweme.account.login.sms.e r4 = new com.ss.android.ugc.aweme.account.login.sms.e
            android.content.Context r0 = r3.getContext()
            if (r0 != 0) goto L_0x014c
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x014c:
            r4.<init>(r0)
            r3.f59266u = r4
        L_0x0151:
            com.ss.android.ugc.aweme.account.login.sms.e r4 = r3.f59266u
            if (r4 != 0) goto L_0x0158
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0158:
            r4.mo45648b()
            com.ss.android.ugc.aweme.account.login.sms.e r4 = r3.f59266u
            if (r4 != 0) goto L_0x0162
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0162:
            r4.mo45647a()
            com.ss.android.ugc.aweme.account.login.v2.base.i r4 = r3.mo45965k()
            com.ss.android.ugc.aweme.account.login.v2.base.i r0 = com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21850i.PHONE_SMS_LOGIN
            if (r4 == r0) goto L_0x0175
            com.ss.android.ugc.aweme.account.login.v2.base.i r4 = r3.mo45965k()
            com.ss.android.ugc.aweme.account.login.v2.base.i r0 = com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21850i.PHONE_SMS_SIGN_UP
            if (r4 != r0) goto L_0x01b0
        L_0x0175:
            boolean r4 = r3.f59258e
            if (r4 == 0) goto L_0x0190
            java.lang.String r4 = "phone_login_enter_whatsapp_code"
            com.ss.android.ugc.aweme.account.a.b.a r0 = new com.ss.android.ugc.aweme.account.a.b.a
            r0.<init>()
            java.lang.String r1 = "enter_type"
            java.lang.String r2 = r3.mo45968n()
            com.ss.android.ugc.aweme.account.a.b.a r0 = r0.mo44776a(r1, r2)
            java.util.Map<java.lang.String, java.lang.String> r0 = r0.f56798a
            com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r4, r0)
            return
        L_0x0190:
            java.lang.String r4 = "phone_login_enter_sms"
            com.ss.android.ugc.aweme.account.a.b.a r0 = new com.ss.android.ugc.aweme.account.a.b.a
            r0.<init>()
            java.lang.String r1 = "enter_type"
            java.lang.String r2 = r3.mo45968n()
            com.ss.android.ugc.aweme.account.a.b.a r0 = r0.mo44776a(r1, r2)
            java.lang.String r1 = "enter_method"
            java.lang.String r2 = r3.mo45967m()
            com.ss.android.ugc.aweme.account.a.b.a r0 = r0.mo44776a(r1, r2)
            java.util.Map<java.lang.String, java.lang.String> r0 = r0.f56798a
            com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r4, r0)
        L_0x01b0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.account.login.p1292v2.p1295ui.p1296a.C21894i.onCreate(android.os.Bundle):void");
    }

    /* renamed from: a */
    public final void mo45688a(String str) {
        boolean z;
        String str2;
        int i;
        C52711k.m112240b(str, "codes");
        CodeInputView codeInputView = (CodeInputView) mo44862a((int) R.id.ecj);
        C52711k.m112236a((Object) codeInputView, "inputCodeView");
        codeInputView.setEnabled(false);
        this.f59268w = false;
        m54610z();
        switch (C21918j.f59297d[mo45965k().ordinal()]) {
            case 1:
            case 2:
                if (mo45970p() == C21848h.RECOVER_ACCOUNT) {
                    C21829b bVar = this;
                    C21446b bVar2 = this.f59271z;
                    if (bVar2 != null) {
                        str2 = bVar2.getTicket();
                    } else {
                        str2 = null;
                    }
                    String str3 = str2;
                    C21848h p = mo45970p();
                    C21850i k = mo45965k();
                    C52711k.m112240b(bVar, "fragment");
                    C52711k.m112240b(str, "codes");
                    C52711k.m112240b(p, "scene");
                    C52711k.m112240b(k, "step");
                    C21710av avVar = new C21710av(p, k, bVar, str3, str);
                    C2193n a = C2193n.m6558a((C2197r<T>) avVar).mo6496c((C1710e<? super T>) new C21712aw<Object>(bVar)).mo6486a((C1710e<? super Throwable>) C21713ax.f58811a);
                    C52711k.m112236a((Object) a, "Maybe.create<QuickLoginQ…etailErrorMsg)\n\n        }");
                    C21806u.m54453a(bVar, a).mo6496c((C1710e<? super T>) new C21898d<Object>(this)).mo6491b();
                    return;
                }
                C21829b bVar3 = this;
                String str4 = this.f59260k;
                C21848h p2 = mo45970p();
                C21850i k2 = mo45965k();
                boolean z2 = this.f59258e;
                C52711k.m112240b(bVar3, "fragment");
                C52711k.m112240b(str4, "phoneNumber");
                C52711k.m112240b(str, "codes");
                C52711k.m112240b(p2, "scene");
                C52711k.m112240b(k2, "step");
                if (p2 == C21848h.SIGN_UP) {
                    z = true;
                } else {
                    z = false;
                }
                C21706as asVar = new C21706as(p2, bVar3, k2, str4, str);
                C2193n a2 = C2193n.m6558a((C2197r<T>) asVar).mo6496c((C1710e<? super T>) new C21708at<Object>(z, z2, bVar3)).mo6486a((C1710e<? super Throwable>) new C21709au<Object>(z, z2, bVar3));
                C52711k.m112236a((Object) a2, "Maybe.create<QuickLoginO…TION, fragment)\n        }");
                C21806u.m54453a(bVar3, a2).mo6496c((C1710e<? super T>) new C21899e<Object>(this)).mo6491b();
                return;
            case 3:
                C21829b bVar4 = this;
                String str5 = this.f59261p;
                C21848h p3 = mo45970p();
                C21850i k3 = mo45965k();
                C52711k.m112240b(bVar4, "fragment");
                C52711k.m112240b(str5, "email");
                C52711k.m112240b(str, "codes");
                C52711k.m112240b(p3, "scene");
                C52711k.m112240b(k3, "step");
                C21770cm cmVar = new C21770cm(bVar4, p3, k3, str5, str);
                C2193n a3 = C2193n.m6558a((C2197r<T>) cmVar).mo6496c((C1710e<? super T>) new C21772cn<Object>(bVar4)).mo6486a((C1710e<? super Throwable>) new C21773co<Object>(bVar4));
                C52711k.m112236a((Object) a3, "Maybe.create<EmailRegist…MAIL, fragment)\n        }");
                C21806u.m54453a(bVar4, a3).mo6496c((C1710e<? super T>) new C21900f<Object>(this)).mo6491b();
                return;
            case 4:
                C21677s sVar = C21677s.f58713a;
                C21829b bVar5 = this;
                String str6 = this.f59260k;
                C21848h p4 = mo45970p();
                C21850i k4 = mo45965k();
                C52711k.m112240b(bVar5, "fragment");
                C52711k.m112240b(str6, "phoneNumber");
                C52711k.m112240b(str, "codes");
                C52711k.m112240b(p4, "scene");
                C52711k.m112240b(k4, "step");
                switch (C21805t.f59064b[p4.ordinal()]) {
                    case 1:
                    case 2:
                        i = 4;
                        break;
                    default:
                        i = 13;
                        break;
                }
                C21792q qVar = new C21792q(p4, k4, bVar5, str6, str, i);
                C2193n a4 = C2193n.m6558a((C2197r<T>) qVar).mo6496c((C1710e<? super T>) new C21794r<Object>(bVar5)).mo6486a((C1710e<? super Throwable>) new C21795s<Object>(bVar5));
                C52711k.m112236a((Object) a4, "Maybe.create<CheckCodeRe…)\n            }\n        }");
                C21806u.m54453a(bVar5, a4).mo6496c((C1710e<? super T>) new C21901g<Object>(this)).mo6491b();
                return;
            case 5:
                C21829b bVar6 = this;
                String str7 = this.f59261p;
                C21848h p5 = mo45970p();
                C21850i k5 = mo45965k();
                C52711k.m112240b(bVar6, "fragment");
                C52711k.m112240b(str7, "email");
                C52711k.m112240b(str, "codes");
                C52711k.m112240b(p5, "scene");
                C52711k.m112240b(k5, "step");
                C21680aa aaVar = new C21680aa(p5, k5, bVar6, str7, str);
                C2193n a5 = C2193n.m6558a((C2197r<T>) aaVar).mo6496c((C1710e<? super T>) new C21682ab<Object>(bVar6)).mo6486a((C1710e<? super Throwable>) new C21683ac<Object>(bVar6));
                C52711k.m112236a((Object) a5, "Maybe.create<CheckCodeRe…nt.enterMethod)\n        }");
                C21806u.m54453a(bVar6, a5).mo6496c((C1710e<? super T>) new C21902h<Object>(this)).mo6491b();
                return;
            case 6:
                C21829b bVar7 = this;
                String str8 = this.f59260k;
                C21848h p6 = mo45970p();
                C21850i k6 = mo45965k();
                Bundle arguments = getArguments();
                if (arguments == null) {
                    C52711k.m112234a();
                }
                boolean z3 = arguments.getBoolean(PasswordService.FROM_CHANGE_PWD, false);
                C52711k.m112240b(bVar7, "fragment");
                C52711k.m112240b(str8, "phoneNumber");
                C52711k.m112240b(p6, "scene");
                C52711k.m112240b(k6, "step");
                C52711k.m112240b(str, "codes");
                C21774d dVar = new C21774d(bVar7, p6, k6, z3, str8, str);
                C2193n a6 = C2193n.m6558a((C2197r<T>) dVar).mo6496c((C1710e<? super T>) new C21776e<Object>(bVar7, str8)).mo6486a((C1710e<? super Throwable>) new C21777f<Object>(bVar7, str8));
                C52711k.m112236a((Object) a6, "Maybe.create<MobileApiRe…g, phoneNumber)\n        }");
                C21806u.m54453a(bVar7, a6).mo6496c((C1710e<? super T>) new C21903i<Object>(this)).mo6491b();
                return;
            case 7:
                C21677s sVar2 = C21677s.f58713a;
                C21829b bVar8 = this;
                C21848h p7 = mo45970p();
                C21850i k7 = mo45965k();
                C52711k.m112240b(bVar8, "fragment");
                C52711k.m112240b(p7, "scene");
                C52711k.m112240b(k7, "step");
                C52711k.m112240b(str, "codes");
                C21714ay ayVar = new C21714ay(p7, k7, bVar8, str, C21677s.m54397a(k7));
                C2193n a7 = C2193n.m6558a((C2197r<T>) ayVar).mo6496c((C1710e<? super T>) new C21716az<Object>(bVar8)).mo6486a((C1710e<? super Throwable>) new C21718ba<Object>(bVar8));
                C52711k.m112236a((Object) a7, "Maybe.create<ValidateCod…ND_PHONE_CLICK)\n        }");
                C21806u.m54453a(bVar8, a7).mo6496c((C1710e<? super T>) new C21904j<Object>(this)).mo6491b();
                return;
            case 8:
                C21829b bVar9 = this;
                String str9 = this.f59260k;
                C21848h p8 = mo45970p();
                C21850i k8 = mo45965k();
                String str10 = this.f59269x;
                String str11 = this.f59270y;
                C52711k.m112240b(bVar9, "fragment");
                C52711k.m112240b(p8, "scene");
                C52711k.m112240b(k8, "step");
                C52711k.m112240b(str, "codes");
                C52711k.m112240b(str10, "ticket");
                C52711k.m112240b(str11, "mUnusableMobileTicket");
                C0777a aVar = new C0777a();
                aVar.put("unusable_mobile_ticket", str11);
                C21780h hVar = new C21780h(p8, k8, bVar9, str9, str, str10, aVar);
                C2193n a8 = C2193n.m6558a((C2197r<T>) hVar).mo6496c((C1710e<? super T>) new C21782i<Object>(bVar9)).mo6486a((C1710e<? super Throwable>) new C21783j<Object>(bVar9));
                C52711k.m112236a((Object) a8, "Maybe.create<MobileApiRe…ND_PHONE_CLICK)\n        }");
                C21806u.m54453a(bVar9, a8).mo6496c((C1710e<? super T>) new C21905k<Object>(this)).mo6491b();
                return;
            default:
                StringBuilder sb = new StringBuilder("Unknown step [");
                sb.append(mo45965k());
                sb.append("] when trying to validate codes");
                throw new IllegalStateException(sb.toString());
        }
    }

    public final void onClick(View view) {
        Integer num;
        String str;
        String str2;
        ClickInstrumentation.onClick(view);
        String str3 = null;
        if (view != null) {
            num = Integer.valueOf(view.getId());
        } else {
            num = null;
        }
        if (num != null && num.intValue() == R.id.ecf) {
            if (mo46011j()) {
                C26890h.onEventV3("resend_code_phone");
            }
            switch (C21918j.f59296c[mo45965k().ordinal()]) {
                case 1:
                case 2:
                    if (mo45970p() != C21848h.RECOVER_ACCOUNT) {
                        if (!this.f59258e) {
                            C21677s sVar = C21677s.f58713a;
                            C21829b bVar = this;
                            String str4 = this.f59260k;
                            C21848h p = mo45970p();
                            C21850i k = mo45965k();
                            String str5 = "";
                            String str6 = "resend";
                            if (this.f59259j) {
                                str3 = "choose_dialog";
                            }
                            sVar.mo45942a(bVar, str4, p, k, str5, str6, str3).mo6496c((C1710e<? super T>) new C21912r<Object>(this)).mo6491b();
                            break;
                        } else {
                            C21677s.f58713a.mo45941a((C21829b) this, this.f59260k, mo45970p(), mo45965k(), "resend", "").mo6496c((C1710e<? super T>) new C21911q<Object>(this)).mo6491b();
                            return;
                        }
                    } else {
                        C21677s sVar2 = C21677s.f58713a;
                        C21829b bVar2 = this;
                        C21446b bVar3 = this.f59271z;
                        if (bVar3 != null) {
                            str = bVar3.getTicket();
                        } else {
                            str = null;
                        }
                        C21848h hVar = C21848h.RECOVER_ACCOUNT;
                        C21850i iVar = C21850i.PHONE_SMS_LOGIN;
                        String str7 = "";
                        if (this.f59259j) {
                            str2 = "user_click";
                        } else {
                            str2 = "auto_system";
                        }
                        String str8 = str2;
                        if (this.f59259j) {
                            str3 = "choose_dialog";
                        }
                        sVar2.mo45945c(bVar2, str, hVar, iVar, str7, str8, str3).mo6496c((C1710e<? super T>) new C21910p<Object>(this)).mo6491b();
                        break;
                    }
                case 3:
                    C21829b bVar4 = this;
                    String str9 = this.f59261p;
                    String str10 = "resend";
                    Bundle arguments = getArguments();
                    if (arguments != null) {
                        str3 = arguments.getString("password");
                    }
                    C21677s.m54405a(bVar4, str9, 1, str10, null, str3).mo6496c((C1710e<? super T>) new C21913s<Object>(this)).mo6491b();
                    break;
                case 4:
                    C21677s.f58713a.mo45943a((C21829b) this, this.f59260k, mo45965k(), "resend").mo6496c((C1710e<? super T>) new C21914t<Object>(this)).mo6491b();
                    break;
                case 5:
                    C21677s.m54399a(C21677s.f58713a, (C21829b) this, this.f59261p, 4, "resend", (HashMap) null, (String) null, 32, (Object) null).mo6496c((C1710e<? super T>) new C21915u<Object>(this)).mo6491b();
                    break;
                case 6:
                case 7:
                case 8:
                    C21677s.f58713a.mo45944b(this, this.f59260k, mo45970p(), mo45965k(), this.f59269x, this.f59270y, "resend").mo6496c((C1710e<? super T>) new C21916v<Object>(this)).mo6491b();
                    break;
                default:
                    StringBuilder sb = new StringBuilder("Unknown step [");
                    sb.append(mo45965k());
                    sb.append("] when trying to send codes");
                    throw new IllegalStateException(sb.toString());
            }
        } else if (num != null && num.intValue() == R.id.eck) {
            if (this.f59256b && !TextUtils.isEmpty(this.f59260k)) {
                this.f59267v = true;
                if (mo45970p() == C21848h.RECOVER_ACCOUNT) {
                    C21677s sVar3 = C21677s.f58713a;
                    C21829b bVar5 = this;
                    C21446b bVar6 = this.f59271z;
                    if (bVar6 != null) {
                        str3 = bVar6.getTicket();
                    }
                    String str11 = str3;
                    C21848h p2 = mo45970p();
                    C21850i k2 = mo45965k();
                    String str12 = "user_click";
                    C52711k.m112240b(bVar5, "fragment");
                    C52711k.m112240b(p2, "scene");
                    C52711k.m112240b(k2, "step");
                    C52711k.m112240b(str12, "sendMethod");
                    int a = C21677s.m54397a(k2);
                    C21743bt btVar = new C21743bt(a, str12, p2, k2, bVar5, str11);
                    C2193n c = C2193n.m6558a((C2197r<T>) btVar).mo6486a((C1710e<? super Throwable>) new C21745bu<Object>(a, str12)).mo6496c((C1710e<? super T>) new C21746bv<Object>(a, str12));
                    C52711k.m112236a((Object) c, "Maybe.create(MaybeOnSubs…ce\",null, null)\n        }");
                    C21806u.m54453a(bVar5, c);
                } else {
                    C21677s sVar4 = C21677s.f58713a;
                    C21829b bVar7 = this;
                    String str13 = this.f59260k;
                    if (str13 == null) {
                        C52711k.m112234a();
                    }
                    sVar4.mo45940a(bVar7, str13, mo45970p(), mo45965k(), "user_click").mo6491b();
                }
            }
        } else if (num != null && num.intValue() == R.id.ech) {
            C26890h.m65011a("switch_to_password", new C20856a().mo44776a("enter_method", mo45967m()).f56798a);
            Bundle arguments2 = getArguments();
            if (arguments2 == null) {
                arguments2 = new Bundle();
            }
            arguments2.putInt("next_page", C21850i.PHONE_PASSWORD_LOGIN.getValue());
            arguments2.putInt("current_scene", mo45970p().getValue());
            arguments2.putBoolean("recover_mobile_code", this.f59252A);
            arguments2.putSerializable("recover_account_data", this.f59271z);
            C52711k.m112236a((Object) arguments2, "(arguments ?: Bundle()).…rModel)\n                }");
            mo45961a(arguments2);
        }
    }

    /* renamed from: a */
    public final void mo45582a(int i, String str) {
        String str2;
        C52711k.m112240b(str, "message");
        if (!this.f59267v || i != 1206) {
            this.f59268w = true;
            CodeInputView codeInputView = (CodeInputView) mo44862a((int) R.id.ecj);
            C52711k.m112236a((Object) codeInputView, "inputCodeView");
            codeInputView.setEnabled(true);
            ((CodeInputView) mo44862a((int) R.id.ecj)).mo46264c();
            ((InputResultIndicator) mo44862a((int) R.id.ecc)).mo45987a(str);
            return;
        }
        this.f59267v = false;
        C10643a aVar = new C10643a(getContext());
        Context context = getContext();
        if (context != null) {
            str2 = context.getString(R.string.fy0);
        } else {
            str2 = null;
        }
        aVar.mo18892a(str2).mo18886a((int) R.string.ahm, (DialogInterface.OnClickListener) null).mo18897a().mo18883c().setCancelable(false);
    }

    /* renamed from: a */
    public final void mo46010a(long j, boolean z) {
        if (this.f59256b && j <= 50000) {
            DmtTextView dmtTextView = (DmtTextView) mo44862a((int) R.id.eck);
            C52711k.m112236a((Object) dmtTextView, "inputCodeVoiceLayout");
            if (dmtTextView.getVisibility() != 0) {
                DmtTextView dmtTextView2 = (DmtTextView) mo44862a((int) R.id.eck);
                C52711k.m112236a((Object) dmtTextView2, "inputCodeVoiceLayout");
                dmtTextView2.setVisibility(0);
            }
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C21598l lVar;
        long j;
        String str;
        String str2;
        boolean z;
        Boolean bool;
        Boolean bool2;
        boolean z2;
        C52711k.m112240b(view, "view");
        super.onViewCreated(view, bundle);
        this.f59263r = C21852a.m54530a(getActivity(), mo46015w(), mo45970p());
        C21853b bVar = this.f59263r;
        String str3 = null;
        if (bVar != null) {
            lVar = bVar.f59142a;
        } else {
            lVar = null;
        }
        this.f59264s = lVar;
        if (mo45965k() == C21850i.PHONE_SMS_LOGIN && !this.f59265t) {
            DmtTextView dmtTextView = (DmtTextView) mo44862a((int) R.id.ech);
            C52711k.m112236a((Object) dmtTextView, "inputCodeSwitchPasswordBtn");
            dmtTextView.setVisibility(0);
        }
        TimerTextView timerTextView = (TimerTextView) mo44862a((int) R.id.eci);
        C21598l lVar2 = this.f59264s;
        if (lVar2 != null) {
            j = lVar2.mo45881c();
        } else {
            j = 60000;
        }
        timerTextView.mo46333a(j, 60000, 1000, "s");
        CodeInputView codeInputView = (CodeInputView) mo44862a((int) R.id.ecj);
        C52711k.m112236a((Object) codeInputView, "inputCodeView");
        codeInputView.setEnabled(true);
        ((CodeInputView) mo44862a((int) R.id.ecj)).mo46260a();
        ((CodeInputView) mo44862a((int) R.id.ecj)).mo46262b();
        ((CodeInputView) mo44862a((int) R.id.ecj)).setCallback(this);
        ((CodeInputView) mo44862a((int) R.id.ecj)).setInputLength(this.f59262q);
        C10705c.m21579a((DmtTextView) mo44862a((int) R.id.ecf));
        C10705c.m21579a((DmtTextView) mo44862a((int) R.id.ech));
        OnClickListener onClickListener = this;
        mo45997a((DmtTextView) mo44862a((int) R.id.ecf), onClickListener);
        String string = getString(R.string.fxz);
        C52711k.m112236a((Object) string, "getString(R.string.commo…ation_phone_voice_button)");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(getString(R.string.fy2, string));
        spannableStringBuilder.setSpan(new C21909o(this, getResources().getColor(R.color.ja), getResources().getColor(R.color.ja)), spannableStringBuilder.length() - string.length(), spannableStringBuilder.length(), 34);
        DmtTextView dmtTextView2 = (DmtTextView) mo44862a((int) R.id.eck);
        C52711k.m112236a((Object) dmtTextView2, "inputCodeVoiceLayout");
        dmtTextView2.setText(spannableStringBuilder);
        DmtTextView dmtTextView3 = (DmtTextView) mo44862a((int) R.id.eck);
        C52711k.m112236a((Object) dmtTextView3, "inputCodeVoiceLayout");
        dmtTextView3.setMovementMethod(C22311a.m55214a());
        ((DmtTextView) mo44862a((int) R.id.ech)).setOnClickListener(onClickListener);
        if (!(mo45965k() == C21850i.EMAIL_SMS_SIGN_UP || mo45965k() == C21850i.EMAIL_SMS_FIND_PASSWORD)) {
            C21464e eVar = this.f59266u;
            if (eVar == null) {
                C52711k.m112234a();
            }
            C0198r<String> rVar = eVar.f58231b;
            C52711k.m112236a((Object) rVar, "mSmsVerifier!!.smsLiveData");
            CharSequence charSequence = (String) rVar.getValue();
            if (!TextUtils.isEmpty(charSequence)) {
                ((CodeInputView) mo44862a((int) R.id.ecj)).setTextAndAutoCheck(charSequence);
                C21464e eVar2 = this.f59266u;
                if (eVar2 == null) {
                    C52711k.m112234a();
                }
                C0198r<String> rVar2 = eVar2.f58231b;
                C52711k.m112236a((Object) rVar2, "mSmsVerifier!!.smsLiveData");
                rVar2.setValue("");
                mo46017y();
            } else {
                C21464e eVar3 = this.f59266u;
                if (eVar3 == null) {
                    C52711k.m112234a();
                }
                eVar3.f58231b.observe(this, new C21906l(this));
            }
        }
        if (mo45965k() != C21850i.PHONE_SMS_VERIFY) {
            StringBuilder sb = new StringBuilder("Code sent: ");
            Bundle arguments = getArguments();
            if (arguments == null || !arguments.getBoolean("code_sent")) {
                z = false;
            } else {
                z = true;
            }
            sb.append(z);
            Bundle arguments2 = getArguments();
            if (arguments2 == null || !arguments2.getBoolean("code_sent")) {
                C21853b bVar2 = this.f59263r;
                if (bVar2 != null) {
                    bool = bVar2.f59143b;
                } else {
                    bool = null;
                }
                if (bool != null) {
                    C21853b bVar3 = this.f59263r;
                    if (bVar3 != null) {
                        bool2 = bVar3.f59143b;
                    } else {
                        bool2 = null;
                    }
                    if (bool2 == null) {
                        C52711k.m112234a();
                    }
                    this.f59256b = bool2.booleanValue();
                    C21598l lVar3 = this.f59264s;
                    if (lVar3 == null) {
                        C52711k.m112234a();
                    }
                    mo46010a(lVar3.mo45881c(), false);
                }
                if (this.f59264s != null) {
                    C21598l lVar4 = this.f59264s;
                    if (lVar4 == null) {
                        C52711k.m112234a();
                    }
                    if (lVar4.mo45883e()) {
                        ((TimerTextView) mo44862a((int) R.id.eci)).setCallback(this.f59254C);
                        TimerTextView timerTextView2 = (TimerTextView) mo44862a((int) R.id.eci);
                        C21598l lVar5 = this.f59264s;
                        if (lVar5 == null) {
                            C52711k.m112234a();
                        }
                        timerTextView2.mo46335a(lVar5);
                        mo46013u();
                    }
                }
                mo46014v();
            } else {
                Bundle arguments3 = getArguments();
                if (arguments3 != null) {
                    arguments3.remove("code_sent");
                }
                mo46016x();
                if (mo45965k() == C21850i.PHONE_SMS_SIGN_UP || mo45965k() == C21850i.PHONE_SMS_LOGIN) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!TextUtils.isEmpty(this.f59260k) && z2) {
                    C22049e.m54782a(this.f59260k, new C21896b(this));
                }
            }
        } else if (this.f59264s == null) {
            TimerTextView timerTextView3 = (TimerTextView) mo44862a((int) R.id.eci);
            C52711k.m112236a((Object) timerTextView3, "inputCodeTimerView");
            timerTextView3.setVisibility(8);
            C21677s.f58713a.mo45944b(this, "", mo45970p(), mo45965k(), "", this.f59270y, "user_click").mo6496c((C1710e<? super T>) new C21907m<Object>(this)).mo6491b();
        } else {
            C21598l lVar6 = this.f59264s;
            if (lVar6 == null) {
                C52711k.m112234a();
            }
            if (lVar6.mo45883e()) {
                ((TimerTextView) mo44862a((int) R.id.eci)).setCallback(this.f59254C);
                TimerTextView timerTextView4 = (TimerTextView) mo44862a((int) R.id.eci);
                C21598l lVar7 = this.f59264s;
                if (lVar7 == null) {
                    C52711k.m112234a();
                }
                timerTextView4.mo46335a(lVar7);
                mo46013u();
            } else {
                C21598l lVar8 = this.f59264s;
                if (lVar8 == null) {
                    C52711k.m112234a();
                }
                if (lVar8.mo45882d()) {
                    mo46014v();
                }
            }
        }
        if (mo45970p() == C21848h.RECOVER_ACCOUNT && mo45965k() == C21850i.PHONE_SMS_LOGIN) {
            C21853b a = C21852a.m54530a(getActivity(), mo46015w(), mo45970p());
            if (a != null) {
                C21598l lVar9 = a.f59142a;
                if (lVar9 != null && lVar9.mo45883e()) {
                    return;
                }
            }
            CodeInputView codeInputView2 = (CodeInputView) mo44862a((int) R.id.ecj);
            C52711k.m112236a((Object) codeInputView2, "inputCodeView");
            codeInputView2.setEnabled(false);
            TimerTextView timerTextView5 = (TimerTextView) mo44862a((int) R.id.eci);
            C52711k.m112236a((Object) timerTextView5, "inputCodeTimerView");
            timerTextView5.setVisibility(8);
            C21677s sVar = C21677s.f58713a;
            C21829b bVar4 = this;
            C21446b bVar5 = this.f59271z;
            if (bVar5 != null) {
                str = bVar5.getTicket();
            } else {
                str = null;
            }
            C21848h hVar = C21848h.RECOVER_ACCOUNT;
            C21850i iVar = C21850i.PHONE_SMS_LOGIN;
            String str4 = "";
            if (this.f59259j) {
                str2 = "user_click";
            } else {
                str2 = "auto_system";
            }
            String str5 = str2;
            if (this.f59259j) {
                str3 = "choose_dialog";
            }
            sVar.mo45945c(bVar4, str, hVar, iVar, str4, str5, str3).mo6496c((C1710e<? super T>) new C21908n<Object>(this)).mo6491b();
        }
        mo45971q();
    }
}
