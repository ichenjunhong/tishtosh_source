package com.p683ss.android.ugc.aweme.account.login.p1292v2.p1295ui.p1296a;

import android.app.Activity;
import android.os.Bundle;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.app.FragmentActivity;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.sdk.account.p844a.p845a.C12993e;
import com.bytedance.sdk.account.p861f.p862a.C13120s;
import com.p683ss.android.ugc.aweme.C23826bi;
import com.p683ss.android.ugc.aweme.IAccountService.C20840g;
import com.p683ss.android.ugc.aweme.account.login.p1284d.C21134a;
import com.p683ss.android.ugc.aweme.account.login.p1284d.C21134a.C21135a;
import com.p683ss.android.ugc.aweme.account.login.p1291ui.C21598l;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21829b;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21839d;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21848h;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21850i;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1293a.C21677s;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1295ui.C21861a;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1295ui.C21994b;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1295ui.C22020p;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1295ui.InputResultIndicator;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.timer.TimerHolder.C21852a;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.timer.TimerHolder.C21853b;
import com.p683ss.android.ugc.aweme.account.p1260a.p1262b.C20856a;
import com.p683ss.android.ugc.aweme.account.p1267b.C20915c;
import com.p683ss.android.ugc.aweme.account.p1307ui.BindOrModifyPhoneActivity;
import com.p683ss.android.ugc.aweme.account.p1307ui.LoadingButton;
import com.p683ss.android.ugc.aweme.account.p1307ui.PhoneInputView;
import com.p683ss.android.ugc.aweme.base.p1420ui.C23698l;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.services.BaseBindService;
import com.p683ss.android.ugc.aweme.services.BindService;
import com.p683ss.android.ugc.aweme.services.PasswordService;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import p064c.p065a.p071d.C1710e;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52857u;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.o */
public final class C21934o extends C21868b {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f59330a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C21934o.class), "fromProAccount", "getFromProAccount()Z"))};

    /* renamed from: e */
    public static final C21935a f59331e = new C21935a(null);

    /* renamed from: b */
    String f59332b = "";

    /* renamed from: c */
    String f59333c = "";

    /* renamed from: d */
    public long f59334d = System.currentTimeMillis();

    /* renamed from: j */
    private final C52668f f59335j = C52732g.m112285a(new C21936b(this));

    /* renamed from: k */
    private HashMap f59336k;

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.o$a */
    public static final class C21935a {
        private C21935a() {
        }

        public /* synthetic */ C21935a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.o$b */
    static final class C21936b extends C52712l implements C52670a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C21934o f59337a;

        C21936b(C21934o oVar) {
            this.f59337a = oVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Bundle arguments = this.f59337a.getArguments();
            if (arguments == null) {
                C52711k.m112234a();
            }
            return Boolean.valueOf(arguments.getBoolean(BindService.FROM_PROACCOUNT, false));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.o$c */
    public static final class C21937c extends C23698l {

        /* renamed from: a */
        final /* synthetic */ EditText f59338a;

        /* renamed from: b */
        final /* synthetic */ C21934o f59339b;

        public final void afterTextChanged(Editable editable) {
            LoadingButton loadingButton = (LoadingButton) this.f59339b.mo44862a((int) R.id.ecs);
            if (loadingButton != null) {
                loadingButton.setEnabled(!TextUtils.isEmpty(this.f59338a.getText()));
            }
            InputResultIndicator inputResultIndicator = (InputResultIndicator) this.f59339b.mo44862a((int) R.id.ect);
            if (inputResultIndicator != null) {
                inputResultIndicator.mo45986a();
            }
        }

        C21937c(EditText editText, C21934o oVar) {
            this.f59338a = editText;
            this.f59339b = oVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.o$d */
    static final class C21938d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C21934o f59340a;

        C21938d(C21934o oVar) {
            this.f59340a = oVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            if (this.f59340a.mo46032j()) {
                C26890h.onEventV3("set_up_by_email");
            }
            Bundle arguments = this.f59340a.getArguments();
            if (arguments == null) {
                C52711k.m112234a();
            }
            if (arguments.getInt("last_scene", -1) != -1) {
                FragmentActivity activity = this.f59340a.getActivity();
                if (activity == null) {
                    C52711k.m112234a();
                }
                activity.finish();
                return;
            }
            BaseBindService l = C23826bi.m58471l();
            Activity activity2 = this.f59340a.getActivity();
            String l2 = this.f59340a.mo45966l();
            FragmentActivity activity3 = this.f59340a.getActivity();
            if (activity3 != null) {
                l.bindEmail(activity2, l2, (Bundle) ((BindOrModifyPhoneActivity) activity3).f59815d.getValue(), new C20840g(this) {

                    /* renamed from: a */
                    final /* synthetic */ C21938d f59341a;

                    {
                        this.f59341a = r1;
                    }

                    public final void onResult(int i, int i2, Object obj) {
                        if (i2 == 1) {
                            FragmentActivity activity = this.f59341a.f59340a.getActivity();
                            if (activity != null) {
                                BindOrModifyPhoneActivity bindOrModifyPhoneActivity = (BindOrModifyPhoneActivity) activity;
                                if (obj != null) {
                                    Bundle bundle = (Bundle) obj;
                                    C52711k.m112240b(bundle, "data");
                                    bindOrModifyPhoneActivity.f59813b = true;
                                    bindOrModifyPhoneActivity.f59814c = bundle;
                                    bindOrModifyPhoneActivity.finish();
                                    return;
                                }
                                throw new C52857u("null cannot be cast to non-null type android.os.Bundle");
                            }
                            throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.account.ui.BindOrModifyPhoneActivity");
                        }
                    }
                });
                return;
            }
            throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.account.ui.BindOrModifyPhoneActivity");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.o$e */
    static final class C21940e implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C21934o f59342a;

        C21940e(C21934o oVar) {
            this.f59342a = oVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C21934o oVar = this.f59342a;
            if (!C21134a.m53622b(((PhoneInputView) oVar.mo44862a((int) R.id.ecu)).getCountryCodeString(), ((PhoneInputView) oVar.mo44862a((int) R.id.ecu)).getPhoneNumberString())) {
                String string = oVar.getString(R.string.afi);
                C52711k.m112236a((Object) string, "getString(R.string.commo…ration_phone_input_error)");
                oVar.mo45582a(0, string);
                if (oVar.mo46032j()) {
                    C26890h.m65011a("input_wrong_phone", new C20856a().mo44776a("page", "Set up by Phone").mo44776a("error_code", "1").f56798a);
                }
                return;
            }
            C21853b a = C21852a.m54530a(oVar.getActivity(), ((PhoneInputView) oVar.mo44862a((int) R.id.ecu)).getFullPhoneNumber(), oVar.mo45970p());
            if (a != null) {
                C21598l lVar = a.f59142a;
                if (lVar != null && lVar.mo45883e()) {
                    oVar.mo46031a(false);
                    return;
                }
            }
            String a2 = C21134a.m53619a(((PhoneInputView) oVar.mo44862a((int) R.id.ecu)).getPhoneNumberObject());
            C52711k.m112236a((Object) a2, "PhoneNumberUtil.formatNu…w.getPhoneNumberObject())");
            switch (C21944p.f59346a[oVar.mo45965k().ordinal()]) {
                case 1:
                    C21677s.f58713a.mo45943a((C21829b) oVar, a2, oVar.mo45965k(), "user_click").mo6496c((C1710e<? super T>) new C21941f<Object>(oVar)).mo6491b();
                    return;
                case 2:
                    C21677s.f58713a.mo45944b(oVar, C21134a.m53619a(((PhoneInputView) oVar.mo44862a((int) R.id.ecu)).getPhoneNumberObject()), oVar.mo45970p(), oVar.mo45965k(), "", "", "user_click").mo6496c((C1710e<? super T>) new C21942g<Object>(oVar)).mo6491b();
                    return;
                case 3:
                    C21677s.f58713a.mo45944b(oVar, C21134a.m53619a(((PhoneInputView) oVar.mo44862a((int) R.id.ecu)).getPhoneNumberObject()), oVar.mo45970p(), oVar.mo45965k(), oVar.f59332b, oVar.f59333c, "user_click").mo6496c((C1710e<? super T>) new C21943h<Object>(oVar)).mo6491b();
                    break;
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.o$f */
    static final class C21941f<T> implements C1710e<C12993e<C13120s>> {

        /* renamed from: a */
        final /* synthetic */ C21934o f59343a;

        C21941f(C21934o oVar) {
            this.f59343a = oVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            C12993e eVar = (C12993e) obj;
            this.f59343a.mo46031a(true);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.o$g */
    static final class C21942g<T> implements C1710e<C12993e<C13120s>> {

        /* renamed from: a */
        final /* synthetic */ C21934o f59344a;

        C21942g(C21934o oVar) {
            this.f59344a = oVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            C12993e eVar = (C12993e) obj;
            if (this.f59344a.mo46032j()) {
                C26890h.m65011a("click_next_for_proAccount", new C20856a().mo44774a("is_success", 1).mo44776a("method", "phone").mo44776a("page", "Set up by Phone").mo44775a("duration", System.currentTimeMillis() - this.f59344a.f59334d).f56798a);
            }
            this.f59344a.mo46031a(true);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.o$h */
    static final class C21943h<T> implements C1710e<C12993e<C13120s>> {

        /* renamed from: a */
        final /* synthetic */ C21934o f59345a;

        C21943h(C21934o oVar) {
            this.f59345a = oVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            C12993e eVar = (C12993e) obj;
            this.f59345a.mo46031a(true);
        }
    }

    /* renamed from: a */
    public final View mo44862a(int i) {
        if (this.f59336k == null) {
            this.f59336k = new HashMap();
        }
        View view = (View) this.f59336k.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f59336k.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: g */
    public final void mo44866g() {
        if (this.f59336k != null) {
            this.f59336k.clear();
        }
    }

    /* renamed from: i */
    public final int mo45585i() {
        return R.layout.b0w;
    }

    /* renamed from: j */
    public final boolean mo46032j() {
        return ((Boolean) this.f59335j.getValue()).booleanValue();
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo44866g();
    }

    public final void ad_() {
        LoadingButton loadingButton = (LoadingButton) mo44862a((int) R.id.ecs);
        if (loadingButton != null) {
            loadingButton.mo46295a();
        }
    }

    /* renamed from: e */
    public final void mo45584e() {
        LoadingButton loadingButton = (LoadingButton) mo44862a((int) R.id.ecs);
        if (loadingButton != null) {
            loadingButton.mo46296b();
        }
    }

    public final void onResume() {
        super.onResume();
        C21994b.m54752a(((PhoneInputView) mo44862a((int) R.id.ecu)).getEditText());
        this.f59334d = System.currentTimeMillis();
    }

    /* renamed from: f */
    public final boolean mo44865f() {
        if (mo46032j()) {
            C26890h.m65011a("back", C20856a.m53173a().mo44776a("enter_from", "Set up by Phone").mo44775a("duration", System.currentTimeMillis() - this.f59117m).f56798a);
        }
        if (mo45970p() == C21848h.BIND_PHONE) {
            C20915c.m53258a(mo45966l());
        }
        return super.mo44865f();
    }

    /* renamed from: U_ */
    public final C21861a mo44860U_() {
        String str;
        String str2;
        String str3;
        String str4;
        boolean z;
        boolean z2;
        String string;
        String str5;
        String string2;
        String str6;
        String str7;
        String str8 = "";
        switch (C21944p.f59348c[mo45965k().ordinal()]) {
            case 1:
                String string3 = getString(R.string.aed);
                C52711k.m112236a((Object) string3, "getString(R.string.commo…_reset_phone_input_title)");
                String string4 = getString(R.string.aec);
                C52711k.m112236a((Object) string4, "getString(R.string.commo…n_reset_phone_input_text)");
                String string5 = getString(R.string.aef);
                C52711k.m112236a((Object) string5, "getString(R.string.common_login_reset_title)");
                z = true;
                str = "reset_phone_input";
                str3 = string3;
                str2 = string4;
                str4 = string5;
                break;
            case 2:
                if (mo46032j()) {
                    string = getString(R.string.cvy);
                    str5 = "getString(R.string.preaccount_phone_number_title)";
                } else {
                    string = getString(R.string.hft);
                    str5 = "getString(R.string.setting_bind_phone_input_title)";
                }
                C52711k.m112236a((Object) string, str5);
                if (mo46032j()) {
                    string2 = getString(R.string.bd1);
                    str6 = "getString(R.string.i18n_preaccount_bind_phone)";
                } else {
                    string2 = getString(R.string.hfs);
                    str6 = "getString(R.string.setting_bind_phone_input_text)";
                }
                C52711k.m112236a((Object) string2, str6);
                str7 = " ";
                break;
            case 3:
                string = getString(R.string.hfq);
                C52711k.m112236a((Object) string, "getString(R.string.setti…phone_change_input_title)");
                string2 = getString(R.string.hfo);
                C52711k.m112236a((Object) string2, "getString(R.string.setti…hone_change_input_text_1)");
                str7 = " ";
                DmtTextView dmtTextView = (DmtTextView) mo44862a((int) R.id.ecr);
                C52711k.m112236a((Object) dmtTextView, "inputPhoneDesc");
                dmtTextView.setVisibility(0);
                break;
            default:
                StringBuilder sb = new StringBuilder("Unknown step ");
                sb.append(mo45965k());
                sb.append(" during getCommonUiParam()");
                throw new IllegalStateException(sb.toString());
        }
        str = str8;
        str3 = string;
        str2 = string2;
        str4 = str7;
        z = false;
        if (mo45970p() == C21848h.RECOVER_ACCOUNT) {
            z2 = false;
        } else {
            z2 = z;
        }
        C21861a aVar = new C21861a(str4, null, false, str3, str2, false, str, z2, false, 294, null);
        return aVar;
    }

    /* renamed from: a */
    public final void mo46031a(boolean z) {
        C21839d.m54506a((Fragment) this, ((PhoneInputView) mo44862a((int) R.id.ecu)).getPhoneNumberObject());
        Bundle arguments = getArguments();
        if (arguments == null) {
            arguments = new Bundle();
        }
        arguments.putBoolean("code_sent", z);
        switch (C21944p.f59347b[mo45965k().ordinal()]) {
            case 1:
                arguments.putInt("next_page", C21850i.PHONE_SMS_FIND_PASSWORD.getValue());
                break;
            case 2:
                arguments.putInt("next_page", C21850i.PHONE_SMS_BIND.getValue());
                break;
            case 3:
                arguments.putInt("next_page", C21850i.PHONE_SMS_MODIFY.getValue());
                break;
        }
        C52711k.m112236a((Object) arguments, "(arguments ?: Bundle()).…)\n            }\n        }");
        mo45961a(arguments);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0029, code lost:
        if (r2 == null) goto L_0x002b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0017, code lost:
        if (r2 == null) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r2) {
        /*
            r1 = this;
            super.onCreate(r2)
            com.ss.android.ugc.aweme.account.login.v2.base.h r2 = r1.mo45970p()
            com.ss.android.ugc.aweme.account.login.v2.base.h r0 = com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21848h.MODIFY_PHONE
            if (r2 != r0) goto L_0x0030
            android.os.Bundle r2 = r1.getArguments()
            if (r2 == 0) goto L_0x0019
            java.lang.String r0 = "ticket"
            java.lang.String r2 = r2.getString(r0)
            if (r2 != 0) goto L_0x001b
        L_0x0019:
            java.lang.String r2 = ""
        L_0x001b:
            r1.f59332b = r2
            android.os.Bundle r2 = r1.getArguments()
            if (r2 == 0) goto L_0x002b
            java.lang.String r0 = "mUnusableMobileTicket"
            java.lang.String r2 = r2.getString(r0)
            if (r2 != 0) goto L_0x002d
        L_0x002b:
            java.lang.String r2 = ""
        L_0x002d:
            r1.f59333c = r2
            return
        L_0x0030:
            com.ss.android.ugc.aweme.account.login.v2.base.h r2 = r1.mo45970p()
            com.ss.android.ugc.aweme.account.login.v2.base.h r0 = com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21848h.BIND_PHONE
            if (r2 != r0) goto L_0x0041
            java.lang.String r2 = r1.mo45966l()
            java.lang.String r0 = "mobile"
            com.p683ss.android.ugc.aweme.account.p1267b.C20915c.m53259a(r2, r0)
        L_0x0041:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.account.login.p1292v2.p1295ui.p1296a.C21934o.onCreate(android.os.Bundle):void");
    }

    /* renamed from: a */
    public final void mo45582a(int i, String str) {
        C52711k.m112240b(str, "message");
        InputResultIndicator inputResultIndicator = (InputResultIndicator) mo44862a((int) R.id.ect);
        if (inputResultIndicator != null) {
            inputResultIndicator.mo45987a(str);
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C52711k.m112240b(view, "view");
        super.onViewCreated(view, bundle);
        PhoneInputView phoneInputView = (PhoneInputView) mo44862a((int) R.id.ecu);
        EditText editText = phoneInputView.getEditText();
        editText.setInputType(3);
        editText.addTextChangedListener(new C21937c(editText, this));
        editText.setHint(getString(R.string.cbk));
        C21135a b = C21839d.f59130a.mo45973b((Fragment) this);
        if (b != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(b.getCountryCode());
            phoneInputView.setCountryCode(sb.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append(b.getCountryIso());
            phoneInputView.setCountryName(sb2.toString());
            StringBuilder sb3 = new StringBuilder();
            sb3.append(b.getNationalNumber());
            phoneInputView.setPhoneNumber(sb3.toString());
        } else {
            phoneInputView.mo46309a();
        }
        Bundle arguments = getArguments();
        if (arguments == null) {
            C52711k.m112234a();
        }
        if (arguments.getBoolean(PasswordService.FROM_CHANGE_PWD, false) || mo46032j()) {
            DmtTextView dmtTextView = (DmtTextView) mo44862a((int) R.id.e1k);
            C52711k.m112236a((Object) dmtTextView, "change_step1");
            dmtTextView.setVisibility(0);
            DmtTextView dmtTextView2 = (DmtTextView) mo44862a((int) R.id.e1k);
            C52711k.m112236a((Object) dmtTextView2, "change_step1");
            C22020p.m54764a(dmtTextView2, new C21938d(this), R.string.hgq, R.string.hgr);
        }
        mo45997a((LoadingButton) mo44862a((int) R.id.ecs), new C21940e(this));
        mo45971q();
    }
}
