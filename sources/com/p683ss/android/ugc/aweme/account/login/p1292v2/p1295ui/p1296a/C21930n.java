package com.p683ss.android.ugc.aweme.account.login.p1292v2.p1295ui.p1296a;

import android.app.Activity;
import android.os.Bundle;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.app.FragmentActivity;
import android.text.Editable;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.account.login.p1284d.C21134a;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21829b;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21839d;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21848h;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1293a.C21677s;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1295ui.C21861a;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1295ui.C21994b;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1295ui.C21997d;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1295ui.InputResultIndicator;
import com.p683ss.android.ugc.aweme.account.login.recover.C21444f.C21446b;
import com.p683ss.android.ugc.aweme.account.p1260a.p1262b.C20856a;
import com.p683ss.android.ugc.aweme.account.p1307ui.InputWithIndicator;
import com.p683ss.android.ugc.aweme.account.p1307ui.LoadingButton;
import com.p683ss.android.ugc.aweme.base.p1420ui.C23698l;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.ss.android.ugc.trill.R;
import java.io.Serializable;
import java.util.HashMap;
import p064c.p065a.p071d.C1710e;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.n */
public final class C21930n extends C21868b {

    /* renamed from: a */
    public EditText f59323a;

    /* renamed from: b */
    public C21446b f59324b;

    /* renamed from: c */
    private boolean f59325c;

    /* renamed from: d */
    private HashMap f59326d;

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.n$a */
    public static final class C21931a extends C23698l {

        /* renamed from: a */
        final /* synthetic */ C21930n f59327a;

        C21931a(C21930n nVar) {
            this.f59327a = nVar;
        }

        public final void afterTextChanged(Editable editable) {
            LoadingButton loadingButton = (LoadingButton) this.f59327a.mo44862a((int) R.id.ecq);
            if (loadingButton != null) {
                loadingButton.setEnabled(!C21994b.m54753b(C21930n.m54663a(this.f59327a)));
            }
            InputResultIndicator inputResultIndicator = (InputResultIndicator) this.f59327a.mo44862a((int) R.id.ecz);
            if (inputResultIndicator != null) {
                inputResultIndicator.mo45986a();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.n$b */
    static final class C21932b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C21930n f59328a;

        C21932b(C21930n nVar) {
            this.f59328a = nVar;
        }

        public final void onClick(View view) {
            String str;
            ClickInstrumentation.onClick(view);
            if (this.f59328a.mo45970p() == C21848h.RECOVER_ACCOUNT) {
                C21829b bVar = this.f59328a;
                String str2 = "";
                String obj = C21930n.m54663a(this.f59328a).getText().toString();
                String str3 = "phone";
                C21446b bVar2 = this.f59328a.f59324b;
                if (bVar2 != null) {
                    str = bVar2.getTicket();
                } else {
                    str = null;
                }
                C21677s.m54409a(bVar, str2, obj, str3, str).mo6496c((C1710e<? super T>) C219331.f59329a).mo6491b();
                return;
            }
            C21829b bVar3 = this.f59328a;
            String a = C21134a.m53619a(C21839d.f59130a.mo45973b((Fragment) this.f59328a));
            C52711k.m112236a((Object) a, "PhoneNumberUtil.formatNu…ataHelper.getPhone(this))");
            C21677s.m54408a(bVar3, a, C21930n.m54663a(this.f59328a).getText().toString(), "phone").mo6491b();
        }
    }

    /* renamed from: a */
    public final View mo44862a(int i) {
        if (this.f59326d == null) {
            this.f59326d = new HashMap();
        }
        View view = (View) this.f59326d.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f59326d.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: g */
    public final void mo44866g() {
        if (this.f59326d != null) {
            this.f59326d.clear();
        }
    }

    /* renamed from: i */
    public final int mo45585i() {
        return R.layout.b0v;
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo44866g();
    }

    public final void ad_() {
        ((LoadingButton) mo44862a((int) R.id.ecq)).mo46295a();
    }

    /* renamed from: e */
    public final void mo45584e() {
        ((LoadingButton) mo44862a((int) R.id.ecq)).mo46296b();
    }

    public final void onResume() {
        super.onResume();
        EditText editText = this.f59323a;
        if (editText == null) {
            C52711k.m112237a("passwordInput");
        }
        C21994b.m54752a(editText);
    }

    /* renamed from: U_ */
    public final C21861a mo44860U_() {
        boolean z;
        if (this.f59325c || mo45970p() == C21848h.RECOVER_ACCOUNT) {
            z = false;
        } else {
            z = true;
        }
        C21861a aVar = new C21861a(" ", null, false, getString(R.string.ae1), " ", false, "phone_login_enter_password_page", z, false, 294, null);
        return aVar;
    }

    /* renamed from: a */
    public static final /* synthetic */ EditText m54663a(C21930n nVar) {
        EditText editText = nVar.f59323a;
        if (editText == null) {
            C52711k.m112237a("passwordInput");
        }
        return editText;
    }

    public final void onCreate(Bundle bundle) {
        Serializable serializable;
        super.onCreate(bundle);
        C26890h.m65011a("phone_login_enter_password", new C20856a().mo44776a("enter_method", mo45967m()).mo44776a("enter_type", mo45968n()).f56798a);
        Bundle arguments = getArguments();
        boolean z = false;
        if (arguments != null) {
            z = arguments.getBoolean("recover_mobile_code", false);
        }
        this.f59325c = z;
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            serializable = arguments2.getSerializable("recover_account_data");
        } else {
            serializable = null;
        }
        this.f59324b = (C21446b) serializable;
    }

    /* renamed from: a */
    public final void mo45582a(int i, String str) {
        C52711k.m112240b(str, "message");
        InputResultIndicator inputResultIndicator = (InputResultIndicator) mo44862a((int) R.id.ecz);
        if (inputResultIndicator != null) {
            inputResultIndicator.mo45987a(str);
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        boolean z;
        C52711k.m112240b(view, "view");
        super.onViewCreated(view, bundle);
        this.f59323a = ((InputWithIndicator) mo44862a((int) R.id.ecy)).getEditText();
        EditText editText = this.f59323a;
        if (editText == null) {
            C52711k.m112237a("passwordInput");
        }
        editText.setHint(getString(R.string.cc3));
        editText.addTextChangedListener(new C21931a(this));
        View a = mo44862a((int) R.id.eco);
        C52711k.m112236a((Object) a, "inputPasswordForgot");
        FragmentActivity activity = getActivity();
        if (activity == null) {
            C52711k.m112234a();
        }
        C52711k.m112236a((Object) activity, "activity!!");
        Activity activity2 = activity;
        C21829b bVar = this;
        C21861a aVar = this.f59207n;
        if (aVar == null) {
            C52711k.m112234a();
        }
        String str = aVar.f59185g;
        if (str == null) {
            C52711k.m112234a();
        }
        if (mo45970p() == C21848h.RECOVER_ACCOUNT) {
            z = true;
        } else {
            z = false;
        }
        C21997d.m54755a(a, activity2, bVar, str, z);
        mo45997a((LoadingButton) mo44862a((int) R.id.ecq), new C21932b(this));
    }
}
