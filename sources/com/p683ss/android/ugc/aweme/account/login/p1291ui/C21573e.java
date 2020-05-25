package com.p683ss.android.ugc.aweme.account.login.p1291ui;

import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.telephony.PhoneNumberFormattingTextWatcher;
import android.text.Editable;
import android.text.Selection;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.mobilelib.present.CommonPresent;
import com.p683ss.android.ugc.aweme.account.login.model.C21386a;
import com.p683ss.android.ugc.aweme.account.login.p1284d.C21134a.C21136b;
import com.p683ss.android.ugc.aweme.account.p1274g.C20975a;
import com.p683ss.android.ugc.aweme.account.p1274g.C20975a.C20976a;
import com.p683ss.android.ugc.aweme.base.p1420ui.C23698l;

/* renamed from: com.ss.android.ugc.aweme.account.login.ui.e */
public abstract class C21573e<T extends CommonPresent> extends C21572d<T> implements C20976a {

    /* renamed from: a */
    private TextWatcher f58510a;

    /* renamed from: m */
    protected View f58511m;

    /* renamed from: n */
    protected TextView f58512n;

    /* renamed from: o */
    public EditText f58513o;

    /* renamed from: p */
    protected View f58514p;

    /* renamed from: q */
    private C23698l f58515q = new C23698l() {
        public final void afterTextChanged(Editable editable) {
            if (C21573e.this.isViewValid()) {
                if (editable.length() > 0) {
                    C21573e.this.f58514p.setVisibility(0);
                } else {
                    C21573e.this.f58514p.setVisibility(8);
                }
                C21573e eVar = C21573e.this;
                eVar.f58509l.setRawInput(editable.toString());
                StringBuilder sb = new StringBuilder();
                int length = editable.length();
                for (int i = 0; i < length; i++) {
                    int digit = Character.digit(editable.charAt(i), 10);
                    if (digit != -1) {
                        sb.append(digit);
                    }
                }
                if (sb.length() == 0) {
                    C21573e.this.mo45839a(0);
                } else {
                    try {
                        C21573e.this.mo45839a(Long.parseLong(sb.toString(), 10));
                    } catch (NumberFormatException unused) {
                    }
                }
                C21573e.this.mo45841k();
                C21573e.this.mo45847a(editable.toString());
            }
        }
    };

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo45847a(String str) {
    }

    public void onDestroyView() {
        super.onDestroyView();
    }

    public void onPause() {
        super.onPause();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo44971a() {
        if (getActivity() != null) {
            getActivity().startActivity(new Intent(getActivity(), CountryListActivity.class));
        }
    }

    public void onResume() {
        super.onResume();
        mo45827r();
        mo46341a(mo45844n(), mo45842l());
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public void mo45849q() {
        if (this.f58511m != null) {
            this.f58511m.setOnClickListener(new OnClickListener() {
                public final void onClick(View view) {
                    ClickInstrumentation.onClick(view);
                    if (C21573e.this.isViewValid()) {
                        C21573e.this.mo44971a();
                    }
                }
            });
        }
        if (this.f58514p != null) {
            this.f58514p.setOnClickListener(new OnClickListener() {
                public final void onClick(View view) {
                    ClickInstrumentation.onClick(view);
                    C21573e.this.f58513o.setText("");
                }
            });
        }
    }

    /* renamed from: r */
    private void mo45827r() {
        if (isViewValid() && this.f58513o != null) {
            if (this.f58510a != null) {
                this.f58513o.removeTextChangedListener(this.f58510a);
            }
            this.f58510a = mo45865c(mo45843m());
            this.f58513o.addTextChangedListener(this.f58510a);
            if (this.f58515q != null) {
                this.f58513o.removeTextChangedListener(this.f58515q);
                this.f58513o.addTextChangedListener(this.f58515q);
            }
        }
    }

    /* renamed from: c */
    private static TextWatcher mo45865c(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (VERSION.SDK_INT >= 21) {
            return new PhoneNumberFormattingTextWatcher(str);
        }
        return new C21136b();
    }

    /* renamed from: a */
    public final void mo44974a(C21386a aVar) {
        if (aVar != null) {
            this.f58509l.setCountryIso(aVar.f58043c);
            mo45838a(aVar.mo45568a());
            mo45827r();
            mo45841k();
            mo46341a(mo45844n(), mo45842l());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Bundle mo45848b(String str) {
        Bundle bundle;
        if (getArguments() == null) {
            bundle = new Bundle();
        } else {
            bundle = new Bundle(getArguments());
        }
        bundle.putString("platform", "mobile");
        if (!TextUtils.isEmpty(str)) {
            bundle.putString("login_path", str);
        }
        return bundle;
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C20975a.m53338a((C20976a) this);
    }

    /* renamed from: a */
    private void mo46341a(int i, String str) {
        if (isViewValid()) {
            if (this.f58512n != null) {
                TextView textView = this.f58512n;
                StringBuilder sb = new StringBuilder("+");
                sb.append(String.valueOf(i));
                textView.setText(sb.toString());
            }
            if (this.f58513o != null) {
                if (str == null) {
                    str = "";
                }
                String str2 = str;
                Editable text = this.f58513o.getText();
                if (text != null) {
                    text.replace(0, text.length(), str2, 0, str2.length());
                    Selection.setSelection(text, text.length());
                }
            }
        }
    }
}
