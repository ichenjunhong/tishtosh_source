package com.p683ss.android.ugc.aweme.account.login.p1292v2.p1295ui.p1296a;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.app.FragmentActivity;
import android.text.Editable;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.sdk.account.p844a.p845a.C12993e;
import com.bytedance.sdk.account.p861f.p862a.C13120s;
import com.p683ss.android.ugc.aweme.account.C22307v;
import com.p683ss.android.ugc.aweme.account.base.p1268a.C20917a;
import com.p683ss.android.ugc.aweme.account.login.C21057ae;
import com.p683ss.android.ugc.aweme.account.login.p1284d.C21134a;
import com.p683ss.android.ugc.aweme.account.login.p1291ui.C21598l;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21829b;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21839d;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21848h;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21850i;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1293a.C21677s;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1295ui.AccountKeyBoardHelper.C21854a;
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

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.t */
public final class C21967t extends C21868b {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f59392a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C21967t.class), "phoneHintHelper", "getPhoneHintHelper()Lcom/ss/android/ugc/aweme/account/login/sms/GooglePhoneHintHelper;"))};

    /* renamed from: c */
    public static final C21968a f59393c = new C21968a(null);

    /* renamed from: b */
    public C22023a f59394b;

    /* renamed from: d */
    private boolean f59395d;

    /* renamed from: e */
    private final C52668f f59396e = C52732g.m112285a(new C21973f(this));

    /* renamed from: j */
    private HashMap f59397j;

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.t$a */
    public static final class C21968a {
        private C21968a() {
        }

        public /* synthetic */ C21968a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static void m54723a(Integer num, String str) {
            int i;
            C52711k.m112240b(str, "enterMethod");
            C20856a a = new C20856a().mo44776a("platform", "phone").mo44776a("enter_method", str);
            String str2 = "is_success";
            if (num != null && num.intValue() == 0) {
                i = 1;
            } else {
                i = 0;
            }
            C20856a a2 = a.mo44774a(str2, i).mo44774a("is_register", 1);
            if (num == null) {
                a2.mo44776a("error_code", "");
            } else {
                a2.mo44774a("error_code", num.intValue());
            }
            C26890h.m65011a("register_click_next_result", a2.f56798a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.t$b */
    public static final class C21969b extends C22307v {

        /* renamed from: a */
        final /* synthetic */ C21967t f59398a;

        C21969b(C21967t tVar) {
            this.f59398a = tVar;
        }

        public final void afterTextChanged(Editable editable) {
            InputResultIndicator inputResultIndicator = (InputResultIndicator) this.f59398a.mo44862a((int) R.id.eoi);
            if (inputResultIndicator != null) {
                inputResultIndicator.mo45986a();
            }
            LoadingButton loadingButton = (LoadingButton) this.f59398a.mo44862a((int) R.id.eog);
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

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.t$c */
    static final class C21970c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C21967t f59399a;

        C21970c(C21967t tVar) {
            this.f59399a = tVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C47700ay.m103235a(C20917a.m53262a(this.f59399a.getActivity()));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.t$d */
    static final class C21971d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C21967t f59400a;

        C21971d(C21967t tVar) {
            this.f59400a = tVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C47700ay.m103235a(C20917a.m53263b(this.f59400a.getActivity()));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.t$e */
    static final class C21972e implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C21967t f59401a;

        C21972e(C21967t tVar) {
            this.f59401a = tVar;
        }

        public final void onClick(View view) {
            String string;
            String string2;
            ClickInstrumentation.onClick(view);
            C26890h.m65011a("register_click_next", new C20856a().mo44776a("platform", "phone").mo44776a("enter_method", this.f59401a.mo45967m()).f56798a);
            if (!C21134a.m53622b(((PhoneInputView) this.f59401a.mo44862a((int) R.id.eoj)).getCountryCodeString(), ((PhoneInputView) this.f59401a.mo44862a((int) R.id.eoj)).getPhoneNumberString())) {
                C21968a.m54723a(null, this.f59401a.mo45967m());
                C21967t tVar = this.f59401a;
                String string3 = this.f59401a.getString(R.string.afi);
                C52711k.m112236a((Object) string3, "getString(R.string.commo…ration_phone_input_error)");
                tVar.mo45582a(0, string3);
                return;
            }
            if (C22305k.m55195a(((PhoneInputView) this.f59401a.mo44862a((int) R.id.eoj)).getCountryCodeString())) {
                C21967t tVar2 = this.f59401a;
                if (tVar2.getActivity() != null) {
                    String countryCodeString = ((PhoneInputView) tVar2.mo44862a((int) R.id.eoj)).getCountryCodeString();
                    boolean b = C22305k.m55196b(countryCodeString);
                    if (C22305k.m55196b(countryCodeString)) {
                        string = tVar2.getString(R.string.dd6);
                        C52711k.m112236a((Object) string, "getString(R.string.send_…de_dialog_item_whats_app)");
                        string2 = tVar2.getString(R.string.dd5);
                        C52711k.m112236a((Object) string2, "getString(R.string.send_code_dialog_item_sms)");
                    } else {
                        string = tVar2.getString(R.string.dd5);
                        C52711k.m112236a((Object) string, "getString(R.string.send_code_dialog_item_sms)");
                        string2 = tVar2.getString(R.string.dd6);
                        C52711k.m112236a((Object) string2, "getString(R.string.send_…de_dialog_item_whats_app)");
                    }
                    String str = string;
                    String str2 = string2;
                    String fullPhoneNumber = ((PhoneInputView) tVar2.mo44862a((int) R.id.eoj)).getFullPhoneNumber();
                    FragmentActivity activity = tVar2.getActivity();
                    if (activity == null) {
                        C52711k.m112234a();
                    }
                    C52711k.m112236a((Object) activity, "activity!!");
                    Context context = activity;
                    String string4 = tVar2.getString(R.string.dd7);
                    C52711k.m112236a((Object) string4, "getString(R.string.send_code_dialog_title)");
                    String string5 = tVar2.getString(R.string.dd4, fullPhoneNumber);
                    C52711k.m112236a((Object) string5, "getString(R.string.send_…og_desc, phoneNumberText)");
                    C22025b bVar = new C22025b(string4, string5, str, str2, tVar2.mo45968n(), fullPhoneNumber);
                    tVar2.f59394b = new C22023a(context, bVar);
                    C22023a aVar = tVar2.f59394b;
                    if (aVar == null) {
                        C52711k.m112234a();
                    }
                    aVar.f59502a = new C21974g(tVar2);
                    C22023a aVar2 = tVar2.f59394b;
                    if (aVar2 == null) {
                        C52711k.m112234a();
                    }
                    aVar2.f59503b = new C21975h(tVar2, b);
                    C22023a aVar3 = tVar2.f59394b;
                    if (aVar3 == null) {
                        C52711k.m112234a();
                    }
                    aVar3.f59504c = new C21976i(tVar2, b);
                    C47700ay.m103235a(tVar2.f59394b);
                }
            } else {
                this.f59401a.mo46045a(false, false);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.t$f */
    static final class C21973f extends C52712l implements C52670a<C21460a> {

        /* renamed from: a */
        final /* synthetic */ C21967t f59402a;

        C21973f(C21967t tVar) {
            this.f59402a = tVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C21460a(this.f59402a, this.f59402a.mo45967m());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.t$g */
    public static final class C21974g implements C22024a {

        /* renamed from: a */
        final /* synthetic */ C21967t f59403a;

        /* renamed from: a */
        public final void mo45427a() {
            C47700ay.m103236b(this.f59403a.f59394b);
        }

        C21974g(C21967t tVar) {
            this.f59403a = tVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.t$h */
    static final class C21975h implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C21967t f59404a;

        /* renamed from: b */
        final /* synthetic */ boolean f59405b;

        C21975h(C21967t tVar, boolean z) {
            this.f59404a = tVar;
            this.f59405b = z;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f59404a.mo46044a(this.f59405b);
            this.f59404a.mo46045a(this.f59405b, true);
            C47700ay.m103236b(this.f59404a.f59394b);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.t$i */
    static final class C21976i implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C21967t f59406a;

        /* renamed from: b */
        final /* synthetic */ boolean f59407b;

        C21976i(C21967t tVar, boolean z) {
            this.f59406a = tVar;
            this.f59407b = z;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f59406a.mo46044a(!this.f59407b);
            this.f59406a.mo46045a(!this.f59407b, true);
            C47700ay.m103236b(this.f59406a.f59394b);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.t$j */
    static final class C21977j<T> implements C1710e<C12993e<C13120s>> {

        /* renamed from: a */
        final /* synthetic */ C21967t f59408a;

        C21977j(C21967t tVar) {
            this.f59408a = tVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            C12993e eVar = (C12993e) obj;
            C21968a.m54723a(Integer.valueOf(0), this.f59408a.mo45967m());
            this.f59408a.mo46046b(true, true);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.t$k */
    static final class C21978k<T> implements C1710e<C12993e<C13120s>> {

        /* renamed from: a */
        final /* synthetic */ C21967t f59409a;

        C21978k(C21967t tVar) {
            this.f59409a = tVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            C12993e eVar = (C12993e) obj;
            C21968a.m54723a(Integer.valueOf(0), this.f59409a.mo45967m());
            this.f59409a.mo46046b(false, true);
        }
    }

    /* renamed from: j */
    private final C21460a m54713j() {
        return (C21460a) this.f59396e.getValue();
    }

    /* renamed from: a */
    public final View mo44862a(int i) {
        if (this.f59397j == null) {
            this.f59397j = new HashMap();
        }
        View view = (View) this.f59397j.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f59397j.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: g */
    public final void mo44866g() {
        if (this.f59397j != null) {
            this.f59397j.clear();
        }
    }

    /* renamed from: i */
    public final int mo45585i() {
        return R.layout.b10;
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo44866g();
    }

    public final void ad_() {
        LoadingButton loadingButton = (LoadingButton) mo44862a((int) R.id.eog);
        if (loadingButton != null) {
            loadingButton.mo46295a();
        }
    }

    /* renamed from: e */
    public final void mo45584e() {
        ((LoadingButton) mo44862a((int) R.id.eog)).mo46296b();
    }

    public final void onStop() {
        super.onStop();
        m54713j().mo45643b();
    }

    /* renamed from: U_ */
    public final C21861a mo44860U_() {
        C21861a aVar = new C21861a(null, null, false, null, null, false, null, false, true, NormalGiftView.ALPHA_255, null);
        return aVar;
    }

    public final void onStart() {
        super.onStart();
        if (C21854a.m54534a()) {
            C21994b.m54752a(((PhoneInputView) mo44862a((int) R.id.eoj)).getInputView().getEditText());
        } else {
            ((PhoneInputView) mo44862a((int) R.id.eoj)).getInputView().getEditText().requestFocus();
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m54713j().mo45640a();
    }

    /* renamed from: a */
    public final void mo46044a(boolean z) {
        String str;
        if (z) {
            str = "phone_verification_click_whatsapp";
        } else {
            str = "phone_verification_click_sms";
        }
        C26890h.m65011a(str, new C20856a().mo44776a("enter_type", mo45968n()).f56798a);
    }

    /* renamed from: a */
    public final void mo45582a(int i, String str) {
        C52711k.m112240b(str, "message");
        InputResultIndicator inputResultIndicator = (InputResultIndicator) mo44862a((int) R.id.eoi);
        if (inputResultIndicator != null) {
            inputResultIndicator.mo45987a(str);
        }
    }

    /* renamed from: b */
    public final void mo46046b(boolean z, boolean z2) {
        C21839d.m54506a((Fragment) this, ((PhoneInputView) mo44862a((int) R.id.eoj)).getPhoneNumberObject());
        Bundle arguments = getArguments();
        if (arguments == null) {
            arguments = new Bundle();
        }
        arguments.putInt("next_page", C21850i.PHONE_SMS_SIGN_UP.getValue());
        arguments.putInt("current_scene", C21848h.SIGN_UP.getValue());
        arguments.putBoolean("code_sent", z2);
        arguments.putBoolean("use_whatsapp", z);
        C52711k.m112236a((Object) arguments, "(arguments ?: Bundle()).…P, useWhatsApp)\n        }");
        mo45961a(arguments);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C52711k.m112240b(view, "view");
        super.onViewCreated(view, bundle);
        ((PhoneInputView) mo44862a((int) R.id.eoj)).getInputView().setTextWatcher(new C21969b(this));
        C21057ae.m53524a(getContext(), (DmtTextView) mo44862a((int) R.id.eoh), new C21970c(this), new C21971d(this), true);
        ((PhoneInputView) mo44862a((int) R.id.eoj)).mo46309a();
        if (!this.f59395d) {
            m54713j().mo45642a(((PhoneInputView) mo44862a((int) R.id.eoj)).getEditText());
            this.f59395d = true;
        }
        mo45997a((LoadingButton) mo44862a((int) R.id.eog), new C21972e(this));
    }

    /* renamed from: a */
    public final void mo46045a(boolean z, boolean z2) {
        String str;
        C21853b a = C21852a.m54530a(getActivity(), ((PhoneInputView) mo44862a((int) R.id.eoj)).getFullPhoneNumber(), C21848h.LOGIN);
        if (a != null) {
            C21598l lVar = a.f59142a;
            if (lVar != null && lVar.mo45883e()) {
                mo46046b(z, false);
                return;
            }
        }
        if (z) {
            C21677s sVar = C21677s.f58713a;
            C21829b bVar = this;
            String a2 = C21134a.m53619a(((PhoneInputView) mo44862a((int) R.id.eoj)).getPhoneNumberObject());
            C52711k.m112236a((Object) a2, "PhoneNumberUtil.formatNu…t.getPhoneNumberObject())");
            sVar.mo45941a(bVar, a2, C21848h.SIGN_UP, C21850i.PHONE_SMS_SIGN_UP, "user_click", "").mo6496c((C1710e<? super T>) new C21977j<Object>(this)).mo6491b();
            return;
        }
        C21677s sVar2 = C21677s.f58713a;
        C21829b bVar2 = this;
        String a3 = C21134a.m53619a(((PhoneInputView) mo44862a((int) R.id.eoj)).getPhoneNumberObject());
        C52711k.m112236a((Object) a3, "PhoneNumberUtil.formatNu…t.getPhoneNumberObject())");
        C21848h hVar = C21848h.SIGN_UP;
        C21850i iVar = C21850i.PHONE_SMS_SIGN_UP;
        String str2 = "";
        String str3 = "user_click";
        if (z2) {
            str = "choose_dialog";
        } else {
            str = null;
        }
        sVar2.mo45942a(bVar2, a3, hVar, iVar, str2, str3, str).mo6496c((C1710e<? super T>) new C21978k<Object>(this)).mo6491b();
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        m54713j().mo45641a(i, i2, intent);
    }
}
