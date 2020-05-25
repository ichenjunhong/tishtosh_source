package com.p683ss.android.ugc.aweme.account.login.p1291ui;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.C2240a;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.sdk.account.p844a.C13011d;
import com.bytedance.sdk.account.p844a.p845a.C12990b;
import com.bytedance.sdk.account.p844a.p846b.C13001b;
import com.bytedance.sdk.account.p844a.p848d.C13013b;
import com.bytedance.sdk.account.p859d.C13081d;
import com.p683ss.android.ugc.aweme.C23826bi;
import com.p683ss.android.ugc.aweme.account.C22165u;
import com.p683ss.android.ugc.aweme.account.login.fragment.C21328n;
import com.p683ss.android.ugc.aweme.account.login.loginlog.C21378a;
import com.p683ss.android.ugc.aweme.account.p1260a.p1262b.C20856a;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.account.login.ui.y */
public class C21632y extends C21577f {

    /* renamed from: G */
    public View f58638G;

    /* renamed from: H */
    public TextView f58639H;

    /* renamed from: I */
    private MusCountDownView f58640I;

    /* renamed from: J */
    private TextView f58641J;

    /* renamed from: K */
    private C13011d f58642K;

    public void onResume() {
        super.onResume();
        if (this.f58640I != null) {
            this.f58640I.mo45754b(1);
        }
    }

    public void afterHandleRequest() {
        super.afterHandleRequest();
        if (isViewValid() && this.f58527u != null) {
            ((LoginButton) this.f58527u).mo45160a();
        }
    }

    public void beforeHandleRequest() {
        if (isViewValid() && this.f58527u != null) {
            ((LoginButton) this.f58527u).mo45161c();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final void mo45827r() {
        final String trim = this.f58524r.getText().toString().trim();
        this.f58642K.mo24609a(trim, (C13001b) new C13001b() {
            public final /* synthetic */ void onSuccess(C12990b bVar) {
                C13013b bVar2 = (C13013b) bVar;
                C26890h.m65011a("set_password_response", new C20856a().mo44776a("platform", "phone").mo44776a("enter_from", "reset_password").mo44774a("is_success", 1).f56798a);
                C21632y.this.f58639H.setVisibility(8);
                C21632y.this.f58638G.setVisibility(8);
                C21632y.this.mo45853a(C21632y.this.f58523q.getText().toString(), trim, null);
            }

            public final /* synthetic */ void onError(C12990b bVar, int i) {
                C13013b bVar2 = (C13013b) bVar;
                C26890h.m65011a("set_password_response", new C20856a().mo44776a("platform", "phone").mo44776a("enter_from", "reset_password").mo44774a("is_success", 0).mo44774a("error_code", i).f56798a);
                C21632y.this.f58639H.setVisibility(0);
                C21632y.this.f58639H.setText(R.string.cn9);
            }
        });
    }

    /* renamed from: A */
    private void m54338A() {
        if (mo45812g() != null) {
            C21378a.m53998a().mo45512a("", "", false, "register", "", "注册重发验证码");
            C26890h.m65005a((Context) getActivity(), "resend_click", "verification_code", C23826bi.m58463d(), 0);
            mo45812g().mo45237a(this.f58528v, null, this.f58543F);
        }
        mo45854b(2);
        this.f58640I.mo45751a(1);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ void mo45901c(View view) {
        m54338A();
        C26890h.m65011a("send_sms", new C20856a().mo44776a("send_method", "user_click").mo44774a("send_reason", C22165u.f59764d).mo44776a("enter_method", this.f58455e).mo44776a("enter_from", this.f58454d).f56798a);
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f58642K = C13081d.m26312a(getContext());
        this.f58640I = (MusCountDownView) view.findViewById(R.id.cpz);
        this.f58539B = (TextView) view.findViewById(R.id.aki);
        this.f58638G = view.findViewById(R.id.dvj);
        this.f58641J = (TextView) view.findViewById(R.id.dvi);
        this.f58639H = (TextView) view.findViewById(R.id.dvq);
        super.mo45849q();
        this.f58522a.setText(C2240a.m6772a(getString(R.string.b3_), new Object[]{this.f58528v}));
        if (this.f58527u instanceof LoginButton) {
            LoginButton loginButton = (LoginButton) this.f58527u;
            loginButton.setLoginBackgroundRes(R.drawable.cgq);
            loginButton.setAutoMirrored(false);
            loginButton.setLoadingBackground(R.drawable.ch1);
        }
        this.f58640I.setTickListener((C21328n) getActivity());
        this.f58640I.setOnClickListener(new C21634z(this));
        this.f58640I.mo45752a(1, mo45858u());
        m54338A();
        C26890h.m65011a("send_sms", new C20856a().mo44776a("send_method", "auto_system").mo44774a("send_reason", C22165u.f59764d).mo44776a("enter_method", this.f58455e).mo44776a("enter_from", this.f58454d).f56798a);
        C26890h.m65011a("set_password_show", new C20856a().mo44776a("platform", "phone").mo44776a("enter_from", "reset_password").f56798a);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.az4, viewGroup, false);
    }

    public void showErrorMessage(String str, int i, boolean z) {
        if (isViewValid()) {
            if (!TextUtils.isEmpty(str)) {
                this.f58638G.setVisibility(0);
                this.f58641J.setText(str);
            } else if (i == -12) {
                C10691a.m21542b((Context) getActivity(), (int) R.string.az7).mo19066a();
            } else if (i == -21) {
                C10691a.m21542b((Context) getActivity(), (int) R.string.azd).mo19066a();
            } else {
                C10691a.m21542b((Context) getActivity(), (int) R.string.azh).mo19066a();
            }
            if (!z) {
                mo45159d();
            }
        }
    }
}
