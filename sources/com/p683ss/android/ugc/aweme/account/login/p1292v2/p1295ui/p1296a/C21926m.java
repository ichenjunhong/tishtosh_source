package com.p683ss.android.ugc.aweme.account.login.p1292v2.p1295ui.p1296a;

import android.os.Bundle;
import android.support.p030v4.app.Fragment;
import android.support.p043v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.sdk.account.p844a.p845a.C12993e;
import com.bytedance.sdk.account.p861f.p862a.C13109h;
import com.p683ss.android.ugc.aweme.account.login.forgetpsw.p1286b.C21145a;
import com.p683ss.android.ugc.aweme.account.login.p1291ui.C21598l;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21829b;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21839d;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21848h;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21850i;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1293a.C21677s;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1295ui.AccountKeyBoardHelper.C21854a;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1295ui.C21861a;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1295ui.C21994b;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1295ui.C22000e.C22004c;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1295ui.InputResultIndicator;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.timer.TimerHolder.C21852a;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.timer.TimerHolder.C21853b;
import com.p683ss.android.ugc.aweme.account.p1307ui.InputWithIndicator;
import com.p683ss.android.ugc.aweme.account.p1307ui.LoadingButton;
import com.p683ss.android.ugc.aweme.base.p1420ui.C23698l;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import p064c.p065a.p071d.C1710e;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.m */
public final class C21926m extends C21868b {

    /* renamed from: a */
    public EditText f59317a;

    /* renamed from: b */
    private HashMap f59318b;

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.m$a */
    public static final class C21927a extends C23698l {

        /* renamed from: a */
        final /* synthetic */ C21926m f59319a;

        C21927a(C21926m mVar) {
            this.f59319a = mVar;
        }

        public final void afterTextChanged(Editable editable) {
            LoadingButton loadingButton = (LoadingButton) this.f59319a.mo44862a(R.id.ecn);
            if (loadingButton != null) {
                EditText editText = this.f59319a.f59317a;
                if (editText == null) {
                    C52711k.m112237a("emailInput");
                }
                loadingButton.setEnabled(!TextUtils.isEmpty(editText.getText()));
            }
            View a = this.f59319a.mo44862a(R.id.ecm);
            if (a != null) {
                InputResultIndicator inputResultIndicator = (InputResultIndicator) a.findViewById(R.id.ecz);
                if (inputResultIndicator != null) {
                    inputResultIndicator.mo45986a();
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.m$b */
    static final class C21928b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C21926m f59320a;

        C21928b(C21926m mVar) {
            this.f59320a = mVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C21926m mVar = this.f59320a;
            EditText editText = mVar.f59317a;
            if (editText == null) {
                C52711k.m112237a("emailInput");
            }
            String obj = editText.getText().toString();
            C21853b a = C21852a.m54530a(mVar.getActivity(), obj, mVar.mo45970p());
            if (a != null) {
                C21598l lVar = a.f59142a;
                if (lVar != null && lVar.mo45883e()) {
                    mVar.mo46028a(obj, false);
                    return;
                }
            }
            if (!C21145a.m53660a(obj)) {
                View a2 = mVar.mo44862a(R.id.ecm);
                C52711k.m112236a((Object) a2, "inputEmailInclude");
                InputResultIndicator inputResultIndicator = (InputResultIndicator) a2.findViewById(R.id.ecz);
                String string = mVar.getString(R.string.aex);
                C52711k.m112236a((Object) string, "getString(R.string.commo…ration_email_input_error)");
                inputResultIndicator.mo45987a(string);
                return;
            }
            C21677s.m54399a(C21677s.f58713a, (C21829b) mVar, obj, 4, "user_click", (HashMap) null, (String) null, 48, (Object) null).mo6496c((C1710e<? super T>) new C21929c<Object>(mVar, obj)).mo6491b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.m$c */
    static final class C21929c<T> implements C1710e<C12993e<C13109h>> {

        /* renamed from: a */
        final /* synthetic */ C21926m f59321a;

        /* renamed from: b */
        final /* synthetic */ String f59322b;

        C21929c(C21926m mVar, String str) {
            this.f59321a = mVar;
            this.f59322b = str;
        }

        public final /* synthetic */ void accept(Object obj) {
            C12993e eVar = (C12993e) obj;
            this.f59321a.mo46028a(this.f59322b, true);
        }
    }

    /* renamed from: a */
    public final View mo44862a(int i) {
        if (this.f59318b == null) {
            this.f59318b = new HashMap();
        }
        View view = (View) this.f59318b.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f59318b.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: g */
    public final void mo44866g() {
        if (this.f59318b != null) {
            this.f59318b.clear();
        }
    }

    /* renamed from: i */
    public final int mo45585i() {
        return R.layout.b0u;
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo44866g();
    }

    public final void ad_() {
        ((LoadingButton) mo44862a(R.id.ecn)).mo46295a();
    }

    /* renamed from: e */
    public final void mo45584e() {
        ((LoadingButton) mo44862a(R.id.ecn)).mo46296b();
    }

    /* renamed from: W_ */
    public final void mo45995W_() {
        super.mo45995W_();
        RecyclerView recyclerView = (RecyclerView) mo44862a(R.id.ecl);
        if (recyclerView != null) {
            recyclerView.setVisibility(8);
        }
    }

    /* renamed from: X_ */
    public final void mo45996X_() {
        super.mo45996X_();
        RecyclerView recyclerView = (RecyclerView) mo44862a(R.id.ecl);
        if (recyclerView != null) {
            recyclerView.setVisibility(0);
        }
    }

    /* renamed from: U_ */
    public final C21861a mo44860U_() {
        boolean z;
        String string = getString(R.string.c_g);
        String string2 = getString(R.string.ae7);
        String string3 = getString(R.string.aef);
        String str = "reset_email_input";
        if (mo45970p() != C21848h.RECOVER_ACCOUNT) {
            z = true;
        } else {
            z = false;
        }
        C21861a aVar = new C21861a(string3, null, false, string, string2, true, str, z, true, 6, null);
        return aVar;
    }

    public final void onResume() {
        super.onResume();
        if (C21854a.m54534a()) {
            EditText editText = this.f59317a;
            if (editText == null) {
                C52711k.m112237a("emailInput");
            }
            C21994b.m54752a(editText);
            return;
        }
        EditText editText2 = this.f59317a;
        if (editText2 == null) {
            C52711k.m112237a("emailInput");
        }
        editText2.requestFocus();
    }

    /* renamed from: a */
    public final void mo45582a(int i, String str) {
        C52711k.m112240b(str, "message");
        View a = mo44862a(R.id.ecm);
        if (a != null) {
            InputResultIndicator inputResultIndicator = (InputResultIndicator) a.findViewById(R.id.ecz);
            if (inputResultIndicator != null) {
                inputResultIndicator.mo45987a(str);
            }
        }
    }

    /* renamed from: a */
    public final void mo46028a(String str, boolean z) {
        Bundle arguments = getArguments();
        if (arguments == null) {
            arguments = new Bundle();
        }
        C21839d.m54507a((Fragment) this, str);
        arguments.putBoolean("code_sent", z);
        arguments.putInt("next_page", C21850i.EMAIL_SMS_FIND_PASSWORD.getValue());
        C52711k.m112236a((Object) arguments, "(arguments ?: Bundle()).…PASSWORD.value)\n        }");
        mo45961a(arguments);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C52711k.m112240b(view, "view");
        super.onViewCreated(view, bundle);
        this.f59317a = ((InputWithIndicator) mo44862a(R.id.ecy)).getEditText();
        EditText editText = this.f59317a;
        if (editText == null) {
            C52711k.m112237a("emailInput");
        }
        editText.setInputType(32);
        editText.addTextChangedListener(new C21927a(this));
        editText.setNextFocusDownId(editText.getId());
        editText.setHint(getString(R.string.ae6));
        String a = C21839d.f59130a.mo45972a((Fragment) this);
        CharSequence charSequence = a;
        if (!TextUtils.isEmpty(charSequence)) {
            editText.setText(charSequence);
            editText.setSelection(a.length());
        }
        mo45997a((LoadingButton) mo44862a(R.id.ecn), new C21928b(this));
        RecyclerView recyclerView = (RecyclerView) mo44862a(R.id.ecl);
        C52711k.m112236a((Object) recyclerView, "inputEmailDomainHint");
        EditText editText2 = this.f59317a;
        if (editText2 == null) {
            C52711k.m112237a("emailInput");
        }
        C22004c.m54757a(recyclerView, editText2, mo45966l(), mo45967m());
        mo45971q();
    }
}
