package com.p683ss.android.ugc.aweme.account.login.p1292v2.p1295ui.p1296a;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.app.FragmentActivity;
import android.text.Editable;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.sdk.account.p844a.p845a.C12993e;
import com.bytedance.sdk.account.p861f.p862a.C13120s;
import com.p683ss.android.ugc.aweme.C23826bi;
import com.p683ss.android.ugc.aweme.account.C22307v;
import com.p683ss.android.ugc.aweme.account.login.C21055ac;
import com.p683ss.android.ugc.aweme.account.login.C21518u;
import com.p683ss.android.ugc.aweme.account.login.model.BaseLoginMethod;
import com.p683ss.android.ugc.aweme.account.login.model.C21386a;
import com.p683ss.android.ugc.aweme.account.login.model.LoginMethodName;
import com.p683ss.android.ugc.aweme.account.login.model.PhoneLoginMethod;
import com.p683ss.android.ugc.aweme.account.login.p1284d.C21134a;
import com.p683ss.android.ugc.aweme.account.login.p1291ui.C21598l;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21829b;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21839d;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21848h;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21850i;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1293a.C21677s;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1295ui.C21861a;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1295ui.C21994b;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1295ui.InputResultIndicator;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.timer.TimerHolder.C21852a;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.timer.TimerHolder.C21853b;
import com.p683ss.android.ugc.aweme.account.login.sms.C21460a;
import com.p683ss.android.ugc.aweme.account.login.view.C22023a;
import com.p683ss.android.ugc.aweme.account.login.view.C22023a.C22024a;
import com.p683ss.android.ugc.aweme.account.login.view.C22023a.C22025b;
import com.p683ss.android.ugc.aweme.account.p1260a.p1262b.C20856a;
import com.p683ss.android.ugc.aweme.account.p1307ui.LoadingButton;
import com.p683ss.android.ugc.aweme.account.p1307ui.PhoneInputView;
import com.p683ss.android.ugc.aweme.account.utils.C22305k;
import com.p683ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.utils.C47700ay;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
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

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.s */
public final class C21957s extends C21868b implements C21055ac {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f59373a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C21957s.class), "phoneHintHelper", "getPhoneHintHelper()Lcom/ss/android/ugc/aweme/account/login/sms/GooglePhoneHintHelper;"))};

    /* renamed from: d */
    public static final C21958a f59374d = new C21958a(null);

    /* renamed from: b */
    public C22023a f59375b;

    /* renamed from: c */
    public boolean f59376c = true;

    /* renamed from: e */
    private boolean f59377e;

    /* renamed from: j */
    private boolean f59378j;

    /* renamed from: k */
    private final C52668f f59379k = C52732g.m112285a(new C21961d(this));

    /* renamed from: p */
    private HashMap f59380p;

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.s$a */
    public static final class C21958a {
        private C21958a() {
        }

        public /* synthetic */ C21958a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static void m54711a(boolean z, String str) {
            C52711k.m112240b(str, "enterMethod");
            C26890h.m65011a("login_click_next_result", new C20856a().mo44776a("platform", "phone").mo44776a("enter_method", str).mo44774a("is_success", z ? 1 : 0).mo44774a("is_register", 0).f56798a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.s$b */
    static final class C21959b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C21957s f59381a;

        C21959b(C21957s sVar) {
            this.f59381a = sVar;
        }

        public final void onClick(View view) {
            String string;
            String string2;
            ClickInstrumentation.onClick(view);
            this.f59381a.f59376c = false;
            C26890h.m65011a("login_click_next", new C20856a().mo44776a("platform", "phone").mo44776a("enter_method", this.f59381a.mo45967m()).f56798a);
            if (!C21134a.m53622b(((PhoneInputView) this.f59381a.mo44862a((int) R.id.eof)).getCountryCodeString(), ((PhoneInputView) this.f59381a.mo44862a((int) R.id.eof)).getPhoneNumberString())) {
                C21958a.m54711a(false, this.f59381a.mo45967m());
                C21957s sVar = this.f59381a;
                String string3 = this.f59381a.getString(R.string.afi);
                C52711k.m112236a((Object) string3, "getString(R.string.commo…ration_phone_input_error)");
                sVar.mo45582a(0, string3);
                return;
            }
            if (!C22305k.m55195a(((PhoneInputView) this.f59381a.mo44862a((int) R.id.eof)).getCountryCodeString()) || this.f59381a.mo45970p() == C21848h.RECOVER_ACCOUNT) {
                this.f59381a.mo46039a(false, false);
            } else {
                C21957s sVar2 = this.f59381a;
                if (sVar2.getActivity() != null) {
                    String countryCodeString = ((PhoneInputView) sVar2.mo44862a((int) R.id.eof)).getCountryCodeString();
                    boolean b = C22305k.m55196b(countryCodeString);
                    if (C22305k.m55196b(countryCodeString)) {
                        string = sVar2.getString(R.string.dd6);
                        C52711k.m112236a((Object) string, "getString(R.string.send_…de_dialog_item_whats_app)");
                        string2 = sVar2.getString(R.string.dd5);
                        C52711k.m112236a((Object) string2, "getString(R.string.send_code_dialog_item_sms)");
                    } else {
                        string = sVar2.getString(R.string.dd5);
                        C52711k.m112236a((Object) string, "getString(R.string.send_code_dialog_item_sms)");
                        string2 = sVar2.getString(R.string.dd6);
                        C52711k.m112236a((Object) string2, "getString(R.string.send_…de_dialog_item_whats_app)");
                    }
                    String str = string;
                    String str2 = string2;
                    String fullPhoneNumber = ((PhoneInputView) sVar2.mo44862a((int) R.id.eof)).getFullPhoneNumber();
                    FragmentActivity activity = sVar2.getActivity();
                    if (activity == null) {
                        C52711k.m112234a();
                    }
                    C52711k.m112236a((Object) activity, "activity!!");
                    Context context = activity;
                    String string4 = sVar2.getString(R.string.dd7);
                    C52711k.m112236a((Object) string4, "getString(R.string.send_code_dialog_title)");
                    String string5 = sVar2.getString(R.string.dd4, fullPhoneNumber);
                    C52711k.m112236a((Object) string5, "getString(R.string.send_…og_desc, phoneNumberText)");
                    C22025b bVar = new C22025b(string4, string5, str, str2, sVar2.mo45968n(), fullPhoneNumber);
                    sVar2.f59375b = new C22023a(context, bVar);
                    C22023a aVar = sVar2.f59375b;
                    if (aVar == null) {
                        C52711k.m112234a();
                    }
                    aVar.f59502a = new C21962e(sVar2);
                    C22023a aVar2 = sVar2.f59375b;
                    if (aVar2 == null) {
                        C52711k.m112234a();
                    }
                    aVar2.f59503b = new C21963f(sVar2, b);
                    C22023a aVar3 = sVar2.f59375b;
                    if (aVar3 == null) {
                        C52711k.m112234a();
                    }
                    aVar3.f59504c = new C21964g(sVar2, b);
                    C47700ay.m103235a(sVar2.f59375b);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.s$c */
    public static final class C21960c extends C22307v {

        /* renamed from: a */
        final /* synthetic */ C21957s f59382a;

        C21960c(C21957s sVar) {
            this.f59382a = sVar;
        }

        public final void afterTextChanged(Editable editable) {
            InputResultIndicator inputResultIndicator = (InputResultIndicator) this.f59382a.mo44862a((int) R.id.eoe);
            if (inputResultIndicator != null) {
                inputResultIndicator.mo45986a();
            }
            LoadingButton loadingButton = (LoadingButton) this.f59382a.mo44862a((int) R.id.eod);
            if (loadingButton != null) {
                boolean z = false;
                if (editable != null) {
                    String obj = editable.toString();
                    if (obj != null && obj.length() > 0) {
                        z = true;
                    }
                }
                loadingButton.setEnabled(z);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.s$d */
    static final class C21961d extends C52712l implements C52670a<C21460a> {

        /* renamed from: a */
        final /* synthetic */ C21957s f59383a;

        C21961d(C21957s sVar) {
            this.f59383a = sVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C21460a(this.f59383a, this.f59383a.mo45967m());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.s$e */
    public static final class C21962e implements C22024a {

        /* renamed from: a */
        final /* synthetic */ C21957s f59384a;

        /* renamed from: a */
        public final void mo45427a() {
            C47700ay.m103236b(this.f59384a.f59375b);
        }

        C21962e(C21957s sVar) {
            this.f59384a = sVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.s$f */
    static final class C21963f implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C21957s f59385a;

        /* renamed from: b */
        final /* synthetic */ boolean f59386b;

        C21963f(C21957s sVar, boolean z) {
            this.f59385a = sVar;
            this.f59386b = z;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f59385a.mo46038a(this.f59386b);
            this.f59385a.mo46039a(this.f59386b, true);
            C47700ay.m103236b(this.f59385a.f59375b);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.s$g */
    static final class C21964g implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C21957s f59387a;

        /* renamed from: b */
        final /* synthetic */ boolean f59388b;

        C21964g(C21957s sVar, boolean z) {
            this.f59387a = sVar;
            this.f59388b = z;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f59387a.mo46038a(!this.f59388b);
            this.f59387a.mo46039a(!this.f59388b, true);
            C47700ay.m103236b(this.f59387a.f59375b);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.s$h */
    static final class C21965h<T> implements C1710e<C12993e<C13120s>> {

        /* renamed from: a */
        final /* synthetic */ C21957s f59389a;

        C21965h(C21957s sVar) {
            this.f59389a = sVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            C12993e eVar = (C12993e) obj;
            C21958a.m54711a(true, this.f59389a.mo45967m());
            this.f59389a.mo46040a(true, true, false);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.s$i */
    static final class C21966i<T> implements C1710e<C12993e<C13120s>> {

        /* renamed from: a */
        final /* synthetic */ C21957s f59390a;

        /* renamed from: b */
        final /* synthetic */ boolean f59391b;

        C21966i(C21957s sVar, boolean z) {
            this.f59390a = sVar;
            this.f59391b = z;
        }

        public final /* synthetic */ void accept(Object obj) {
            C12993e eVar = (C12993e) obj;
            C21958a.m54711a(true, this.f59390a.mo45967m());
            this.f59390a.mo46040a(false, true, this.f59391b);
        }
    }

    /* renamed from: j */
    private final C21460a m54700j() {
        return (C21460a) this.f59379k.getValue();
    }

    /* renamed from: a */
    public final View mo44862a(int i) {
        if (this.f59380p == null) {
            this.f59380p = new HashMap();
        }
        View view = (View) this.f59380p.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f59380p.put(Integer.valueOf(i), view);
        }
        return view;
    }

    public final boolean ai_() {
        return this.f59376c;
    }

    /* renamed from: g */
    public final void mo44866g() {
        if (this.f59380p != null) {
            this.f59380p.clear();
        }
    }

    /* renamed from: i */
    public final int mo45585i() {
        return R.layout.b0z;
    }

    public final void ad_() {
        ((LoadingButton) mo44862a((int) R.id.eod)).mo46295a();
    }

    /* renamed from: e */
    public final void mo45584e() {
        ((LoadingButton) mo44862a((int) R.id.eod)).mo46296b();
    }

    public final void onStop() {
        super.onStop();
        m54700j().mo45643b();
    }

    /* renamed from: U_ */
    public final C21861a mo44860U_() {
        C21861a aVar = new C21861a(null, null, false, null, null, true, null, false, false, 454, null);
        return aVar;
    }

    public final void onDestroyView() {
        super.onDestroyView();
        KeyboardUtils.m58184c(((PhoneInputView) mo44862a((int) R.id.eof)).getEditText());
        mo44866g();
    }

    /* renamed from: u */
    private final void m54701u() {
        if (((PhoneInputView) mo44862a((int) R.id.eof)).getPhoneNumber() <= 0 && !this.f59378j) {
            m54700j().mo45642a(((PhoneInputView) mo44862a((int) R.id.eof)).getEditText());
        }
        this.f59378j = true;
        C21994b.m54752a(((PhoneInputView) mo44862a((int) R.id.eof)).getInputView().getEditText());
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m54700j().mo45640a();
    }

    /* renamed from: a */
    public final void mo46038a(boolean z) {
        String str;
        if (z) {
            str = "phone_verification_click_whatsapp";
        } else {
            str = "phone_verification_click_sms";
        }
        C26890h.m65011a(str, new C20856a().mo44776a("enter_type", mo45968n()).f56798a);
    }

    public final void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        if (z) {
            if (isViewValid()) {
                m54701u();
                return;
            }
            this.f59377e = true;
        }
    }

    /* renamed from: a */
    public final void mo45582a(int i, String str) {
        C52711k.m112240b(str, "message");
        InputResultIndicator inputResultIndicator = (InputResultIndicator) mo44862a((int) R.id.eoe);
        if (inputResultIndicator != null) {
            inputResultIndicator.mo45987a(str);
        }
        LoadingButton loadingButton = (LoadingButton) mo44862a((int) R.id.eod);
        if (loadingButton != null) {
            loadingButton.mo46296b();
        }
    }

    /* renamed from: a */
    public final void mo46039a(boolean z, boolean z2) {
        String str;
        C21853b a = C21852a.m54530a(getActivity(), ((PhoneInputView) mo44862a((int) R.id.eof)).getFullPhoneNumber(), C21848h.LOGIN);
        if (a != null) {
            C21598l lVar = a.f59142a;
            if (lVar != null && lVar.mo45883e()) {
                mo46040a(z, false, false);
                return;
            }
        }
        if (!z || mo45970p() == C21848h.RECOVER_ACCOUNT) {
            C21677s sVar = C21677s.f58713a;
            C21829b bVar = this;
            String a2 = C21134a.m53619a(((PhoneInputView) mo44862a((int) R.id.eof)).getPhoneNumberObject());
            C52711k.m112236a((Object) a2, "PhoneNumberUtil.formatNu…t.getPhoneNumberObject())");
            C21848h hVar = C21848h.LOGIN;
            C21850i iVar = C21850i.PHONE_SMS_LOGIN;
            String str2 = "";
            String str3 = "user_click";
            if (z2) {
                str = "choose_dialog";
            } else {
                str = null;
            }
            sVar.mo45942a(bVar, a2, hVar, iVar, str2, str3, str).mo6496c((C1710e<? super T>) new C21966i<Object>(this, z2)).mo6491b();
            return;
        }
        C21677s sVar2 = C21677s.f58713a;
        C21829b bVar2 = this;
        String a3 = C21134a.m53619a(((PhoneInputView) mo44862a((int) R.id.eof)).getPhoneNumberObject());
        C52711k.m112236a((Object) a3, "PhoneNumberUtil.formatNu…t.getPhoneNumberObject())");
        sVar2.mo45941a(bVar2, a3, C21848h.LOGIN, C21850i.PHONE_SMS_LOGIN, "user_click", "").mo6496c((C1710e<? super T>) new C21965h<Object>(this)).mo6491b();
    }

    public final void onViewCreated(View view, Bundle bundle) {
        boolean z;
        C52711k.m112240b(view, "view");
        super.onViewCreated(view, bundle);
        mo45997a((LoadingButton) mo44862a((int) R.id.eod), new C21959b(this));
        ((PhoneInputView) mo44862a((int) R.id.eof)).getInputView().setTextWatcher(new C21960c(this));
        if (!C23826bi.m58466g() && mo45970p() != C21848h.RECOVER_ACCOUNT) {
            BaseLoginMethod a = C21518u.m54170a(LoginMethodName.DEFAULT);
            if (a instanceof PhoneLoginMethod) {
                PhoneLoginMethod phoneLoginMethod = (PhoneLoginMethod) a;
                if (phoneLoginMethod.getPhoneNumber().getNationalNumber() != 0) {
                    ((PhoneInputView) mo44862a((int) R.id.eof)).setPhoneNumber(String.valueOf(phoneLoginMethod.getPhoneNumber().getNationalNumber()));
                }
                ((PhoneInputView) mo44862a((int) R.id.eof)).setCountry(C21386a.f58040h.mo45572a(phoneLoginMethod.getPhoneNumber()));
            }
        }
        boolean z2 = true;
        if (((PhoneInputView) mo44862a((int) R.id.eof)).getCountryCodeString().length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (((PhoneInputView) mo44862a((int) R.id.eof)).getCountryName().length() != 0) {
                z2 = false;
            }
            if (z2) {
                ((PhoneInputView) mo44862a((int) R.id.eof)).mo46309a();
            }
        }
        if (this.f59377e) {
            m54701u();
            this.f59377e = false;
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        m54700j().mo45641a(i, i2, intent);
    }

    /* renamed from: a */
    public final void mo46040a(boolean z, boolean z2, boolean z3) {
        boolean z4;
        C21839d.m54506a((Fragment) this, ((PhoneInputView) mo44862a((int) R.id.eof)).getPhoneNumberObject());
        Bundle arguments = getArguments();
        if (arguments == null) {
            arguments = new Bundle();
        }
        arguments.putInt("next_page", C21850i.PHONE_SMS_LOGIN.getValue());
        arguments.putInt("current_scene", C21848h.LOGIN.getValue());
        String str = "recover_mobile_code";
        if (mo45970p() == C21848h.RECOVER_ACCOUNT) {
            z4 = true;
        } else {
            z4 = false;
        }
        arguments.putBoolean(str, z4);
        arguments.putBoolean("code_sent", z2);
        arguments.putBoolean("use_whatsapp", z);
        arguments.putBoolean("from_choose_dialog", z3);
        C52711k.m112236a((Object) arguments, "(arguments ?: Bundle()).…omChooseDialog)\n        }");
        mo45961a(arguments);
    }
}
