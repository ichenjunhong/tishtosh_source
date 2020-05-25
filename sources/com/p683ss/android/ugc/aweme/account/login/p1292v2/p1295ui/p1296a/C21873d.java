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
import com.p683ss.android.ugc.aweme.account.login.forgetpsw.p1286b.C21145a;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21839d;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1295ui.AccountKeyBoardHelper.C21854a;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1295ui.C21994b;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1295ui.C22000e.C22004c;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1295ui.InputResultIndicator;
import com.p683ss.android.ugc.aweme.account.p1307ui.InputWithIndicator;
import com.p683ss.android.ugc.aweme.account.p1307ui.LoadingButton;
import com.p683ss.android.ugc.aweme.base.p1420ui.C23698l;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.d */
public abstract class C21873d extends C21868b {

    /* renamed from: a */
    private HashMap f59214a;

    /* renamed from: j */
    protected EditText f59215j;

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.d$a */
    public static final class C21874a extends C23698l {

        /* renamed from: a */
        final /* synthetic */ C21873d f59216a;

        C21874a(C21873d dVar) {
            this.f59216a = dVar;
        }

        public final void afterTextChanged(Editable editable) {
            LoadingButton loadingButton = (LoadingButton) this.f59216a.mo44862a((int) R.id.ecn);
            if (loadingButton != null) {
                loadingButton.setEnabled(!TextUtils.isEmpty(this.f59216a.mo46002j().getText()));
            }
            View a = this.f59216a.mo44862a((int) R.id.ecm);
            if (a != null) {
                InputResultIndicator inputResultIndicator = (InputResultIndicator) a.findViewById(R.id.ecz);
                if (inputResultIndicator != null) {
                    inputResultIndicator.mo45986a();
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.d$b */
    static final class C21875b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C21873d f59217a;

        C21875b(C21873d dVar) {
            this.f59217a = dVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f59217a.mo46003u();
        }
    }

    /* renamed from: V_ */
    public void mo44861V_() {
    }

    /* renamed from: a */
    public View mo44862a(int i) {
        if (this.f59214a == null) {
            this.f59214a = new HashMap();
        }
        View view = (View) this.f59214a.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f59214a.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: a */
    public abstract void mo44863a(String str);

    /* renamed from: g */
    public void mo44866g() {
        if (this.f59214a != null) {
            this.f59214a.clear();
        }
    }

    /* renamed from: i */
    public final int mo45585i() {
        return R.layout.b0p;
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo44866g();
    }

    public final void ad_() {
        ((LoadingButton) mo44862a((int) R.id.ecn)).mo46295a();
    }

    /* renamed from: e */
    public final void mo45584e() {
        ((LoadingButton) mo44862a((int) R.id.ecn)).mo46296b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final EditText mo46002j() {
        EditText editText = this.f59215j;
        if (editText == null) {
            C52711k.m112237a("emailInput");
        }
        return editText;
    }

    /* renamed from: W_ */
    public final void mo45995W_() {
        super.mo45995W_();
        RecyclerView recyclerView = (RecyclerView) mo44862a((int) R.id.ecl);
        C52711k.m112236a((Object) recyclerView, "inputEmailDomainHint");
        recyclerView.setVisibility(8);
    }

    /* renamed from: X_ */
    public final void mo45996X_() {
        super.mo45996X_();
        RecyclerView recyclerView = (RecyclerView) mo44862a((int) R.id.ecl);
        C52711k.m112236a((Object) recyclerView, "inputEmailDomainHint");
        recyclerView.setVisibility(0);
    }

    public void onResume() {
        super.onResume();
        if (C21854a.m54534a()) {
            EditText editText = this.f59215j;
            if (editText == null) {
                C52711k.m112237a("emailInput");
            }
            C21994b.m54752a(editText);
            return;
        }
        EditText editText2 = this.f59215j;
        if (editText2 == null) {
            C52711k.m112237a("emailInput");
        }
        editText2.requestFocus();
    }

    /* renamed from: u */
    public final void mo46003u() {
        EditText editText = this.f59215j;
        if (editText == null) {
            C52711k.m112237a("emailInput");
        }
        String obj = editText.getText().toString();
        if (!C21145a.m53660a(obj)) {
            View a = mo44862a((int) R.id.ecm);
            C52711k.m112236a((Object) a, "inputEmailInclude");
            InputResultIndicator inputResultIndicator = (InputResultIndicator) a.findViewById(R.id.ecz);
            String string = getString(R.string.aex);
            C52711k.m112236a((Object) string, "getString(R.string.commo…ration_email_input_error)");
            inputResultIndicator.mo45987a(string);
            mo44861V_();
            return;
        }
        mo44863a(obj);
    }

    /* renamed from: a */
    public final void mo45582a(int i, String str) {
        C52711k.m112240b(str, "message");
        View a = mo44862a((int) R.id.ecm);
        if (a != null) {
            InputResultIndicator inputResultIndicator = (InputResultIndicator) a.findViewById(R.id.ecz);
            if (inputResultIndicator != null) {
                inputResultIndicator.mo45987a(str);
            }
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        C52711k.m112240b(view, "view");
        super.onViewCreated(view, bundle);
        this.f59215j = ((InputWithIndicator) mo44862a((int) R.id.ecy)).getEditText();
        EditText editText = this.f59215j;
        if (editText == null) {
            C52711k.m112237a("emailInput");
        }
        editText.setInputType(32);
        editText.addTextChangedListener(new C21874a(this));
        editText.setNextFocusDownId(editText.getId());
        editText.setHint(getString(R.string.ae6));
        String a = C21839d.f59130a.mo45972a((Fragment) this);
        CharSequence charSequence = a;
        if (!TextUtils.isEmpty(charSequence)) {
            editText.setText(charSequence);
            editText.setSelection(a.length());
        }
        mo45997a((LoadingButton) mo44862a((int) R.id.ecn), new C21875b(this));
        RecyclerView recyclerView = (RecyclerView) mo44862a((int) R.id.ecl);
        C52711k.m112236a((Object) recyclerView, "inputEmailDomainHint");
        EditText editText2 = this.f59215j;
        if (editText2 == null) {
            C52711k.m112237a("emailInput");
        }
        C22004c.m54757a(recyclerView, editText2, mo45966l(), mo45967m());
        mo45971q();
    }
}
