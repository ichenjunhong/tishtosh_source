package com.p683ss.android.ugc.aweme.account.login.fragment;

import android.app.Dialog;
import android.os.Bundle;
import android.os.Handler;
import android.support.p030v4.app.C0654k;
import android.support.p030v4.app.C0679r;
import android.support.p030v4.app.Fragment;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.inputmethod.InputMethodManager;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.bytedance.sdk.account.p877l.C13207b;
import com.p683ss.android.ugc.aweme.C23826bi;
import com.p683ss.android.ugc.aweme.account.login.MusLoginManager;
import com.p683ss.android.ugc.aweme.account.login.p1282b.C21108m;
import com.p683ss.android.ugc.aweme.account.login.p1291ui.C21605n;
import com.p683ss.android.ugc.aweme.account.login.p1291ui.C21608p;
import com.p683ss.android.ugc.aweme.account.login.p1291ui.C21608p.C21612a;
import com.p683ss.android.ugc.aweme.account.utils.C22293a;
import com.p683ss.android.ugc.aweme.base.p1414e.C23526a;
import com.p683ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.trill.R;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.account.login.fragment.a */
public abstract class C21168a extends C23526a implements C21108m {

    /* renamed from: j */
    protected static int f57506j;

    /* renamed from: q */
    private static int f57507q;

    /* renamed from: a */
    protected View f57508a;

    /* renamed from: b */
    protected View f57509b;

    /* renamed from: c */
    protected Dialog f57510c;

    /* renamed from: d */
    public C21328n f57511d;

    /* renamed from: e */
    Handler f57512e;

    /* renamed from: k */
    protected int f57513k = 1;

    /* renamed from: l */
    protected String f57514l;

    /* renamed from: m */
    protected String f57515m;

    /* renamed from: n */
    protected String f57516n;

    /* renamed from: o */
    private boolean f57517o;

    /* renamed from: p */
    private C21608p f57518p;

    /* renamed from: r */
    private OnGlobalLayoutListener f57519r;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo45326b(boolean z) {
    }

    /* renamed from: g */
    public final void mo45329g() {
        C22293a.m55177a(getContext());
    }

    /* renamed from: d */
    public final void mo45159d() {
        if (this.f57518p != null) {
            C21608p pVar = this.f57518p;
            pVar.f58594g = false;
            pVar.dismiss();
            this.f57518p = null;
        }
    }

    public void onDestroy() {
        super.onDestroy();
        if (this.f57512e != null) {
            this.f57512e.removeCallbacksAndMessages(null);
            this.f57512e = null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo45327e() {
        if (getActivity() != null) {
            try {
                KeyboardUtils.m58184c(this.f57508a);
                getActivity().onBackPressed();
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: f */
    public final MusLoginManager mo45328f() {
        if (this.f57511d == null) {
            return new MusLoginManager();
        }
        return this.f57511d.mo45023a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final String mo45330h() {
        if (getArguments() != null) {
            return getArguments().getString("ENTER_REASON");
        }
        return null;
    }

    public void onStart() {
        super.onStart();
        if (getView() != null) {
            getView().getViewTreeObserver().addOnGlobalLayoutListener(this.f57519r);
        }
    }

    public void onStop() {
        super.onStop();
        if (getView() != null && getView().getViewTreeObserver() != null && getView().getViewTreeObserver().isAlive() && this.f57519r != null) {
            getView().getViewTreeObserver().removeOnGlobalLayoutListener(this.f57519r);
        }
    }

    /* renamed from: a */
    public void mo45323a(C21328n nVar) {
        this.f57511d = nVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo45322a(final View view) {
        if (!this.f57517o) {
            final OnFocusChangeListener onFocusChangeListener = view.getOnFocusChangeListener();
            view.setOnFocusChangeListener(new OnFocusChangeListener() {
                public final void onFocusChange(View view, boolean z) {
                    view.post(new Runnable() {
                        public final void run() {
                            if (C21168a.this.getActivity() != null && C21168a.this.isViewValid()) {
                                ((InputMethodManager) C21168a.this.getActivity().getSystemService("input_method")).showSoftInput(view, 1);
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
            this.f57517o = true;
        }
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (this.f57508a != null) {
            this.f57508a.setOnClickListener(new OnClickListener() {
                public final void onClick(View view) {
                    ClickInstrumentation.onClick(view);
                    C21168a.this.mo45327e();
                }
            });
        }
        if (this.f57509b != null) {
            this.f57509b.setOnClickListener(new C21299d(this));
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (this.f57511d == getActivity()) {
            bundle.putBoolean("iticklistener_value_equal_activity", true);
        }
    }

    public void onViewStateRestored(Bundle bundle) {
        super.onViewStateRestored(bundle);
        if (bundle != null && bundle.getBoolean("iticklistener_value_equal_activity", false)) {
            this.f57511d = (C21328n) getActivity();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo45320a(int i) {
        if (isViewValid() && getContext() != null) {
            if (i > f57507q) {
                if (this.f57513k != 0) {
                    this.f57513k = 0;
                    mo45326b(true);
                }
            } else if (this.f57513k != 1) {
                this.f57513k = 1;
                mo45326b(false);
            }
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f57512e = new Handler();
        f57507q = (int) C9432q.m18687b(getContext(), 150.0f);
        f57506j = (int) C9432q.m18687b(getContext(), 20.0f);
        if (getArguments() != null) {
            this.f57514l = getArguments().getString("enter_from");
            this.f57515m = getArguments().getString("enter_method");
            this.f57516n = getArguments().getString("enter_type");
        }
    }

    /* renamed from: a */
    public void mo45324a(boolean z) {
        if (getContext() != null) {
            if (this.f57510c == null) {
                this.f57510c = new C21605n(getContext());
            }
            if (!z || this.f57510c.isShowing()) {
                if (!z && this.f57510c.isShowing()) {
                    this.f57510c.dismiss();
                }
                return;
            }
            this.f57510c.show();
        }
    }

    /* renamed from: a */
    public static void m53691a(JSONObject jSONObject, C13207b bVar) {
        C23826bi.m58455a(bVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo45325b(Fragment fragment, boolean z) {
        if (getActivity() != null && (getActivity() instanceof C21328n)) {
            if (this.f57511d == null) {
                this.f57511d = (C21328n) getActivity();
            }
            this.f57511d.mo45035c(fragment, false);
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (view != null) {
            this.f57508a = view.findViewById(R.id.ay9);
            this.f57509b = view.findViewById(R.id.dkt);
            view.setOnClickListener(new C21256b(view));
            this.f57519r = new C21298c(this, view);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo45321a(Fragment fragment, boolean z) {
        if (getActivity() != null && (getActivity() instanceof C21328n)) {
            if (this.f57511d == null) {
                this.f57511d = (C21328n) getActivity();
            }
            this.f57511d.mo45027a(fragment, z);
        }
    }

    /* renamed from: a */
    public final void mo45158a(String str, String str2, int i, C21612a aVar) {
        if (getActivity() != null) {
            getActivity().getSupportFragmentManager().mo2234b();
            if (this.f57518p == null) {
                this.f57518p = C21608p.m54320a(str, i, aVar);
                C0679r a = getActivity().getSupportFragmentManager().mo2225a();
                a.mo2178a((Fragment) this.f57518p, "captcha");
                a.mo2195c();
            } else if (getActivity().getSupportFragmentManager().mo2224a("captcha") == null && !this.f57518p.isAdded()) {
                C21608p pVar = this.f57518p;
                C0654k supportFragmentManager = getActivity().getSupportFragmentManager();
                String str3 = "captcha";
                if (!pVar.f58594g) {
                    pVar.f58594g = true;
                    pVar.show(supportFragmentManager, str3);
                }
                this.f57518p.f58591d = aVar;
            }
            this.f57518p.mo45885a(str, str2, i);
        }
    }
}
