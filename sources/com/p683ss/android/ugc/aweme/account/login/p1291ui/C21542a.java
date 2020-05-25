package com.p683ss.android.ugc.aweme.account.login.p1291ui;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.Bundle;
import android.support.p030v4.app.C0679r;
import android.support.p030v4.app.Fragment;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.inputmethod.InputMethodManager;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.p683ss.android.mobilelib.present.CommonPresent;
import com.p683ss.android.mobilelib.view.CommonView;
import com.p683ss.android.ugc.aweme.account.login.p1282b.C21108m;
import com.p683ss.android.ugc.aweme.account.login.p1291ui.C21608p.C21612a;
import com.p683ss.android.ugc.aweme.account.p1277j.C21000d;
import com.p683ss.android.ugc.aweme.account.util.C22284v;
import com.p683ss.android.ugc.aweme.base.p1414e.C23526a;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.account.login.ui.a */
public abstract class C21542a<T extends CommonPresent> extends C23526a implements CommonView, C21108m {

    /* renamed from: a */
    private C21608p f58451a;

    /* renamed from: b */
    public View f58452b;

    /* renamed from: c */
    protected T f58453c;

    /* renamed from: d */
    public String f58454d;

    /* renamed from: e */
    public String f58455e;

    /* renamed from: j */
    protected String f58456j;

    /* renamed from: k */
    protected String f58457k;

    /* renamed from: l */
    private boolean f58458l;

    /* renamed from: m */
    private ProgressDialog f58459m;

    /* renamed from: Y_ */
    public final boolean mo45396Y_() {
        return false;
    }

    public void beforeHandleRequest() {
        mo45811f();
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public abstract T mo45812g();

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final LoginOrRegisterActivity mo45813h() {
        return (LoginOrRegisterActivity) getActivity();
    }

    /* renamed from: d */
    public final void mo45159d() {
        if (this.f58451a != null) {
            this.f58451a.dismiss();
            this.f58451a = null;
        }
    }

    /* renamed from: e */
    public final void mo45810e() {
        if (this.f58453c != null) {
            this.f58453c.destroy();
            this.f58453c = null;
        }
    }

    public void onDestroyView() {
        this.f58459m = null;
        mo45810e();
        super.onDestroyView();
    }

    public void afterHandleRequest() {
        if (this.f58459m != null && this.f58459m.isShowing()) {
            this.f58459m.dismiss();
        }
        mo45159d();
    }

    /* renamed from: f */
    public final ProgressDialog mo45811f() {
        if (this.f58459m == null) {
            this.f58459m = C22284v.m55157b(getActivity());
            this.f58459m.setMessage(getString(R.string.c76));
            this.f58459m.setCanceledOnTouchOutside(false);
        }
        if (!this.f58459m.isShowing()) {
            this.f58459m.show();
        }
        return this.f58459m;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo45808a(View view) {
        if (getActivity() != null) {
            ((InputMethodManager) getActivity().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo45809b(final View view) {
        if (!this.f58458l) {
            final OnFocusChangeListener onFocusChangeListener = view.getOnFocusChangeListener();
            view.setOnFocusChangeListener(new OnFocusChangeListener() {
                public final void onFocusChange(View view, boolean z) {
                    view.post(new Runnable() {
                        public final void run() {
                            if (C21542a.this.getActivity() != null && C21542a.this.isViewValid()) {
                                ((InputMethodManager) C21542a.this.getActivity().getSystemService("input_method")).showSoftInput(view, 1);
                            }
                        }
                    });
                    if (onFocusChangeListener != null) {
                        onFocusChangeListener.onFocusChange(view, z);
                    }
                }
            });
            view.post(new Runnable() {
                public final void run() {
                    view.requestFocus();
                }
            });
            this.f58458l = true;
        }
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        try {
            this.f58453c = mo45812g();
        } catch (IllegalStateException unused) {
        }
        if (this.f58452b != null) {
            this.f58452b.setOnClickListener(new OnClickListener() {
                public final void onClick(View view) {
                    ClickInstrumentation.onClick(view);
                    try {
                        C21542a.this.mo45808a(C21542a.this.f58452b);
                        C21542a.this.getActivity().onBackPressed();
                    } catch (Exception unused) {
                    }
                }
            });
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() != null) {
            this.f58454d = getArguments().getString("enter_from");
            this.f58455e = getArguments().getString("enter_method");
            this.f58456j = getArguments().getString("enter_type");
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (view != null) {
            this.f58452b = view.findViewById(R.id.aru);
        }
    }

    public void showCaptchaView(String str, String str2, final int i) {
        C215474 r0 = new C21612a() {
            /* renamed from: a */
            public final void mo45150a() {
                C21542a.this.mo45811f();
                if (C21542a.this.f58453c != null) {
                    C21542a.this.f58453c.refreshCaptcha(i);
                }
            }

            /* renamed from: b */
            public final void mo45151b(String str, int i) {
                C21542a.this.mo45811f();
                if (C21542a.this.f58453c != null) {
                    C21542a.this.f58453c.onCompleteCaptcha(str, i);
                }
            }
        };
        if (getActivity() != null) {
            if (this.f58451a == null) {
                this.f58451a = C21608p.m54320a(str, i, (C21612a) r0);
                C0679r a = getActivity().getSupportFragmentManager().mo2225a();
                a.mo2178a((Fragment) this.f58451a, "captcha");
                a.mo2195c();
            } else if (getActivity().getSupportFragmentManager().mo2224a("captcha") == null) {
                this.f58451a.show(getActivity().getSupportFragmentManager(), "captcha");
                this.f58451a.f58591d = r0;
            }
            this.f58451a.mo45885a(str, str2, i);
        }
    }

    public void showErrorMessage(String str, int i, boolean z) {
        if (getActivity() != null) {
            if (!TextUtils.isEmpty(str)) {
                C10691a.m21545b((Context) getActivity(), str).mo19066a();
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

    /* renamed from: a */
    public final void mo45158a(String str, String str2, int i, C21612a aVar) {
        if (getActivity() != null) {
            C21000d.m53377a(str, String.valueOf(i), str2);
            if (this.f58451a == null) {
                this.f58451a = C21608p.m54320a(str, i, aVar);
                C0679r a = getActivity().getSupportFragmentManager().mo2225a();
                a.mo2178a((Fragment) this.f58451a, "captcha");
                a.mo2195c();
            } else if (getActivity().getSupportFragmentManager().mo2224a("captcha") == null) {
                this.f58451a.show(getActivity().getSupportFragmentManager(), "captcha");
                this.f58451a.f58591d = aVar;
            }
            this.f58451a.mo45885a(str, str2, i);
        }
    }
}
