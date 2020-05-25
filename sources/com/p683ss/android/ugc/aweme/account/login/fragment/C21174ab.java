package com.p683ss.android.ugc.aweme.account.login.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.C2240a;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.sdk.account.p844a.C13011d;
import com.bytedance.sdk.account.p844a.p845a.C12990b;
import com.bytedance.sdk.account.p844a.p845a.C12996h;
import com.bytedance.sdk.account.p859d.C13081d;
import com.bytedance.sdk.account.p861f.p863b.p864a.C13143t;
import com.p683ss.android.ugc.aweme.account.login.p1280a.C21045a;
import com.p683ss.android.ugc.aweme.account.p1260a.p1262b.C20856a;
import com.p683ss.android.ugc.aweme.account.util.C22275o;
import com.p683ss.android.ugc.aweme.account.utils.C22299f;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.account.login.fragment.ab */
public final class C21174ab extends BaseMusSecureSendCodeFragment {

    /* renamed from: y */
    public static String f57527y = "oldpassword";

    /* renamed from: z */
    public static String f57528z = "newpassword";

    /* renamed from: A */
    public C21045a f57529A;

    /* renamed from: B */
    private int f57530B = 22;

    /* renamed from: C */
    private C13011d f57531C;

    /* renamed from: D */
    private String f57532D;

    /* renamed from: E */
    private String f57533E;

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final void mo45308i() {
        if (this.mCountDownView.getRemainTick() <= 0) {
            this.mCountDownView.mo45751a(4);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo45304a() {
        this.mCountDownView.mo45751a(4);
        mo45328f().mo45042a(this.f57530B, this.f57475r, C22299f.m55184a(), this.f57472o);
        C26890h.m65011a("send_sms", new C20856a().mo44776a("send_method", "resend").mo44774a("send_reason", this.f57530B).mo44776a("enter_method", this.f57515m).mo44776a("enter_from", this.f57514l).f56798a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo45306b(String str) {
        this.mBtnLogin.mo45161c();
        this.f57531C.mo24608a(str, this.f57530B, true, (C13143t) new C13143t() {
            public final /* synthetic */ void onNeedSecureCaptcha(C12990b bVar) {
                super.onNeedSecureCaptcha((C12996h) bVar);
                if (C21174ab.this.isViewValid() && C21174ab.this.mBtnLogin != null) {
                    C21174ab.this.mBtnLogin.mo45160a();
                }
            }

            public final /* synthetic */ void onSuccess(C12990b bVar) {
                C12996h hVar = (C12996h) bVar;
                if (C21174ab.this.mBtnLogin != null) {
                    C21174ab.this.mBtnLogin.mo45160a();
                }
                C21174ab.this.f57529A.mo45080a(hVar.f34021h);
                if (C21174ab.this.getActivity() != null) {
                    C21174ab.this.getActivity().onBackPressed();
                }
            }

            public final /* synthetic */ void onError(C12990b bVar, int i) {
                C12996h hVar = (C12996h) bVar;
                if (C21174ab.this.mBtnLogin != null) {
                    C21174ab.this.mBtnLogin.mo45160a();
                }
                C10691a.m21545b(C21174ab.this.getContext(), C22275o.m55130a((C12990b) hVar)).mo19066a();
            }
        });
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() != null) {
            this.f57532D = getArguments().getString(f57527y);
            this.f57533E = getArguments().getString(f57528z);
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        this.f57531C = C13081d.m26312a(getContext());
        this.tipTitle.setText(getString(R.string.c99));
        this.mTvHint.setText(C2240a.m6772a(getString(R.string.c98), new Object[]{this.f57476v}));
        this.mCountDownView.mo45752a(4, this.f57476v);
        return onCreateView;
    }
}
