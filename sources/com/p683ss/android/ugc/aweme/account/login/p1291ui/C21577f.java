package com.p683ss.android.ugc.aweme.account.login.p1291ui;

import android.content.Context;
import android.os.Bundle;
import android.support.p030v4.app.FragmentActivity;
import android.text.Editable;
import android.text.Selection;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.dmt.p664ui.widget.DmtButton;
import com.bytedance.sdk.account.p844a.p845a.C12993e;
import com.bytedance.sdk.account.p861f.p862a.C13119r;
import com.p683ss.android.common.p1146d.C18898c;
import com.p683ss.android.mobilelib.Validator;
import com.p683ss.android.mobilelib.model.PersistentData;
import com.p683ss.android.mobilelib.view.InputCodePasswordView;
import com.p683ss.android.p1137b.p1138a.p1139a.C18842a;
import com.p683ss.android.ugc.aweme.C23826bi;
import com.p683ss.android.ugc.aweme.account.C22165u;
import com.p683ss.android.ugc.aweme.account.login.C21140f;
import com.p683ss.android.ugc.aweme.account.login.C21379m;
import com.p683ss.android.ugc.aweme.account.login.C21392p;
import com.p683ss.android.ugc.aweme.account.login.p1282b.C21118w;
import com.p683ss.android.ugc.aweme.account.login.p1283c.C21129f;
import com.p683ss.android.ugc.aweme.account.p1260a.p1262b.C20856a;
import com.p683ss.android.ugc.aweme.account.p1279l.C21021e;
import com.p683ss.android.ugc.aweme.account.util.C22281s;
import com.p683ss.android.ugc.aweme.base.p1420ui.C23698l;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.ss.android.ugc.trill.R;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.account.login.ui.f */
public abstract class C21577f extends C21584h<C21129f> implements InputCodePasswordView {

    /* renamed from: G */
    private C21129f f58519G;

    /* renamed from: H */
    private C21118w f58520H;

    /* renamed from: I */
    private OnClickListener f58521I = new C21583g(this);

    /* renamed from: a */
    protected TextView f58522a;

    /* renamed from: q */
    protected EditText f58523q;

    /* renamed from: r */
    protected EditText f58524r;

    /* renamed from: s */
    protected Validator f58525s;

    /* renamed from: t */
    protected TextView f58526t;

    /* renamed from: u */
    protected DmtButton f58527u;

    /* renamed from: v */
    protected String f58528v;

    /* renamed from: w */
    protected String f58529w;

    /* renamed from: x */
    protected boolean f58530x;

    public void onResendSuccess() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public abstract void mo45827r();

    /* renamed from: u */
    public final String mo45858u() {
        return this.f58528v;
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final int mo45859v() {
        return 1;
    }

    /* renamed from: w */
    public final int mo45860w() {
        return C22165u.f59765e;
    }

    public void onResendFail() {
        if (isViewValid()) {
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final C21129f mo45812g() {
        if ((this.f58519G == null || !this.f58519G.isValid()) && getActivity() != null) {
            this.f58519G = new C21129f(getActivity(), this);
        }
        return this.f58519G;
    }

    /* renamed from: t */
    public final void mo45857t() {
        if (isViewValid() && getActivity() != null) {
            C10691a.m21542b((Context) getActivity(), (int) R.string.cn_).mo19066a();
        }
    }

    /* renamed from: s */
    public final void mo45856s() {
        if (this.f58527u != null) {
            if (this.f58524r == null || TextUtils.isEmpty(this.f58524r.getText()) || this.f58524r.getText().toString().length() < 8 || this.f58523q == null || TextUtils.isEmpty(this.f58523q.getText())) {
                this.f58527u.setEnabled(false);
            } else {
                this.f58527u.setEnabled(true);
            }
            if (!TextUtils.isEmpty(this.f58523q.getText()) && this.f58523q.getText().length() == 4) {
                this.f58524r.requestFocus();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo45854b(int i) {
        if (isViewValid()) {
            this.f58523q.requestFocus();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f58528v = arguments.getString("phone_number");
            this.f58530x = arguments.getBoolean("bundle_need_back");
            this.f58529w = arguments.getString("mask_phone_number");
            return;
        }
        this.f58528v = PersistentData.inst().getLastLoginMobile();
    }

    /* renamed from: a */
    public final void mo45852a(EditText editText, int i) {
        Editable text = editText.getText();
        int length = text.length();
        if (length > 20) {
            mo45857t();
            if (this.f58527u != null) {
                this.f58527u.setEnabled(false);
            }
            int selectionEnd = Selection.getSelectionEnd(text);
            editText.setText(text.toString().substring(0, 20));
            Editable text2 = editText.getText();
            if (selectionEnd > text2.length()) {
                selectionEnd = text2.length();
            }
            Selection.setSelection(text2, selectionEnd);
            return;
        }
        if (this.f58527u != null) {
            if (length < 8) {
                this.f58527u.setEnabled(false);
                return;
            }
            this.f58527u.setEnabled(true);
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        view.findViewById(R.id.aru).setOnClickListener(this.f58521I);
        this.f58522a = (TextView) view.findViewById(R.id.aov);
        this.f58523q = (EditText) view.findViewById(R.id.a9x);
        this.f58524r = (EditText) view.findViewById(R.id.a9j);
        this.f58527u = (DmtButton) view.findViewById(R.id.ol);
        this.f58526t = (TextView) view.findViewById(R.id.dl0);
        this.f58527u.setEnabled(false);
        mo45809b(this.f58523q);
        this.f58523q.addTextChangedListener(new C23698l() {
            public final void afterTextChanged(Editable editable) {
                C21577f.this.mo45856s();
            }
        });
        this.f58524r.addTextChangedListener(new C23698l() {
            public final void afterTextChanged(Editable editable) {
                C21577f.this.mo45856s();
                C21577f.this.mo45852a(C21577f.this.f58524r, 20);
            }
        });
        this.f58525s = Validator.with(getActivity()).notEmpty(this.f58523q, R.string.ayy).notEmpty(this.f58524r, R.string.az_);
        this.f58527u.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                if (C21577f.this.f58525s.check()) {
                    C21577f.this.mo45808a(C21577f.this.f58524r);
                    int length = C21577f.this.f58524r.getText().toString().length();
                    if (length < 8 || length > 20) {
                        C21577f.this.mo45857t();
                        return;
                    }
                    C21577f.this.mo45827r();
                }
            }
        });
        if (this.f58524r == null || TextUtils.isEmpty(this.f58524r.getText()) || this.f58524r.getText().toString().length() < 8 || this.f58523q == null || TextUtils.isEmpty(this.f58523q.getText())) {
            this.f58527u.setEnabled(false);
        } else {
            this.f58527u.setEnabled(true);
        }
        this.f58520H = new C21118w(this) {
            /* renamed from: a */
            public final void mo45168a(C12993e<C13119r> eVar) {
                JSONObject jSONObject;
                C21379m mVar;
                C26890h.m65011a("login_failure", new C20856a().mo44776a("enter_method", C21577f.this.f58455e).mo44776a("platform", "sms_verification").mo44776a("enter_type", C21577f.this.f58456j).mo44776a("carrier", "").mo44774a("error_code", eVar.f34000c).f56798a);
                C21577f.this.afterHandleRequest();
                C18898c.m46009a(C21577f.this.getContext(), "login", "reset_password_next_error");
                C23826bi.m58451a(8, 3, (Object) eVar.f34001d);
                if (eVar.f34000c == 1075) {
                    FragmentActivity activity = C21577f.this.getActivity();
                    int i = eVar.f34000c;
                    if (eVar.f34007h != null) {
                        jSONObject = ((C13119r) eVar.f34007h).f34279l;
                    } else {
                        jSONObject = null;
                    }
                    if (C21577f.this.getActivity() instanceof C21379m) {
                        mVar = (C21379m) C21577f.this.getActivity();
                    } else {
                        mVar = null;
                    }
                    C21140f fVar = new C21140f(activity, i, jSONObject, null, mVar, C21577f.this.mo45848b(null));
                    C21392p.m54014a(fVar);
                    return;
                }
                if (!TextUtils.isEmpty(eVar.f34001d)) {
                    C22281s.m55136a(C21577f.this.getContext(), eVar.f34001d, eVar.f34000c);
                }
            }

            public final void onSuccess(C12993e<C13119r> eVar) {
                if (C21577f.this.isViewValid() && C21577f.this.getContext() != null && eVar.f34007h != null && ((C13119r) eVar.f34007h).f34313e != null) {
                    C21577f.this.afterHandleRequest();
                    PersistentData.inst().saveLastLoginMobile(C21577f.this.getContext(), ((C13119r) eVar.f34007h).f34309a);
                    C18898c.m46009a(C21577f.this.getContext(), "login", "reset_password_next");
                    C10691a.m21533a(C21577f.this.getContext(), (int) R.string.zs).mo19066a();
                    C23826bi.m58455a(((C13119r) eVar.f34007h).f34313e);
                    C26890h.m65011a("login_success", new C20856a().mo44776a("enter_method", C21577f.this.f58455e).mo44776a("enter_from", C21577f.this.f58454d).mo44776a("enter_type", C21577f.this.f58456j).mo44776a("platform", "sms_verification").mo44774a("status", 1).mo44774a("_perf_monitor", 1).f56798a);
                    if (C21577f.this.getActivity() != null) {
                        ((C21379m) C21577f.this.getActivity()).mo45026a(C21577f.this.mo45848b(null));
                    }
                    C23826bi.m58451a(1, 1, (Object) ((C13119r) eVar.f34007h).f34309a);
                }
            }
        };
        C18842a.m45933a(new Runnable() {
            public final void run() {
                C26890h.m65005a((Context) C21577f.this.getActivity(), "resend_click", "verification_code", C23826bi.m58463d(), 0);
            }
        }, 500);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo45853a(String str, String str2, String str3) {
        if (isViewValid() && this.f58519G != null) {
            C26890h.m65011a("login_submit", new C20856a().mo44776a("enter_method", this.f58455e).mo44776a("enter_from", this.f58454d).mo44776a("enter_type", this.f58456j).mo44776a("platform", "sms_verification").mo44776a("group_id", C21021e.m53409a(getArguments())).mo44776a("log_pb", C21021e.m53412b(getArguments())).f56798a);
            this.f58519G.mo45243a(this.f58528v, str, str2, null, this.f58520H);
        }
    }
}
