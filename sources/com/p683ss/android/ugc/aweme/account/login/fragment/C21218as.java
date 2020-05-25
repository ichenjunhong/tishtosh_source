package com.p683ss.android.ugc.aweme.account.login.fragment;

import android.os.Bundle;
import android.support.p030v4.app.Fragment;
import android.text.TextUtils;
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
import com.bytedance.sdk.account.p877l.C13207b;
import com.p683ss.android.account.C18492b.C18493a;
import com.p683ss.android.ugc.aweme.account.C22165u;
import com.p683ss.android.ugc.aweme.account.login.C21635v;
import com.p683ss.android.ugc.aweme.account.login.MusLoginActivity;
import com.p683ss.android.ugc.aweme.account.login.p1280a.C21050f;
import com.p683ss.android.ugc.aweme.account.p1260a.p1262b.C20856a;
import com.p683ss.android.ugc.aweme.account.p1279l.C21023g;
import com.p683ss.android.ugc.aweme.account.util.C22271m;
import com.p683ss.android.ugc.aweme.account.util.C22275o;
import com.p683ss.android.ugc.aweme.account.utils.C22299f;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.ss.android.ugc.trill.R;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.account.login.fragment.as */
public final class C21218as extends BaseMusSecureSendCodeFragment {

    /* renamed from: A */
    public String f57635A;

    /* renamed from: B */
    public String f57636B;

    /* renamed from: C */
    public String f57637C;

    /* renamed from: D */
    public C21050f f57638D;

    /* renamed from: E */
    private int f57639E = 22;

    /* renamed from: F */
    private C13011d f57640F;

    /* renamed from: y */
    public String f57641y;

    /* renamed from: z */
    public String f57642z;

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final void mo45308i() {
        if (this.mCountDownView.getRemainTick() <= 0) {
            this.mCountDownView.mo45751a(3);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo45304a() {
        this.mCountDownView.mo45751a(3);
        mo45328f().mo45042a(this.f57639E, this.f57475r, C22299f.m55184a(), this.f57472o);
        C26890h.m65011a("send_sms", new C20856a().mo44776a("send_method", "resend").mo44774a("send_reason", this.f57639E).mo44776a("enter_method", this.f57515m).mo44776a("enter_from", this.f57514l).f56798a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo45306b(String str) {
        this.mBtnLogin.mo45161c();
        this.f57640F.mo24607a(str, this.f57639E, true, 0, this.f57475r, (C13143t) new C13143t() {
            public final /* synthetic */ void onNeedSecureCaptcha(C12990b bVar) {
                super.onNeedSecureCaptcha((C12996h) bVar);
                if (C21218as.this.isViewValid() && C21218as.this.mBtnLogin != null) {
                    C21218as.this.mBtnLogin.mo45160a();
                }
            }

            public final /* synthetic */ void onSuccess(C12990b bVar) {
                C12996h hVar = (C12996h) bVar;
                if (C21218as.this.mBtnLogin != null) {
                    C21218as.this.mBtnLogin.mo45160a();
                }
                if (C21218as.this.f57637C.equals("email")) {
                    C21218as.this.mo45328f().mo45049b(C21218as.this.f57641y, C21218as.this.f57642z, hVar.f34021h, "", C21218as.this.f57638D);
                    return;
                }
                if (C21218as.this.f57637C.equals("username")) {
                    C21218as.this.mo45328f().mo45046a(C21218as.this.f57636B, C21218as.this.f57642z, hVar.f34021h, "", C21218as.this.f57638D);
                }
            }

            public final /* synthetic */ void onError(C12990b bVar, int i) {
                C12996h hVar = (C12996h) bVar;
                if (C21218as.this.mBtnLogin != null) {
                    C21218as.this.mBtnLogin.mo45160a();
                }
                C10691a.m21545b(C21218as.this.getContext(), C22275o.m55130a((C12990b) hVar)).mo19066a();
            }
        });
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() != null) {
            this.f57641y = getArguments().getString("email");
            this.f57642z = getArguments().getString("password");
            this.f57637C = getArguments().getString("logintype");
            this.f57635A = getArguments().getString("countrycodePhone");
            this.f57636B = getArguments().getString("username");
        }
        C26890h.m65011a("account_verification_show", new C20856a().mo44776a("enter_method", this.f57515m).mo44776a("enter_from", this.f57514l).mo44776a("verification_method", "sms").f56798a);
        this.f57638D = new C21050f() {
            /* renamed from: a */
            public final void mo45092a(JSONObject jSONObject, String str, String str2) {
            }

            /* renamed from: b */
            public final void mo45093b(String str) {
            }

            /* renamed from: b */
            public final void mo45094b(String str, String str2) {
            }

            /* renamed from: a */
            public final void mo45087a() {
                if (C21218as.this.mBtnLogin != null) {
                    C21218as.this.mBtnLogin.mo45160a();
                }
                if (!TextUtils.isEmpty(C21218as.this.f57635A)) {
                    String str = C21218as.this.f57635A.split("-")[0];
                    C21168a aVar = (C21168a) C22271m.m55123a(C21227aw.class).mo46372a("country_code", str).mo46372a("phone_number", C21218as.this.f57635A.split("-")[1]).mo46371a("code_type", 2).mo46370a();
                    aVar.mo45323a(C21218as.this.f57511d);
                    C21218as.this.mo45321a((Fragment) aVar, false);
                }
            }

            /* renamed from: c */
            public final void mo45095c(String str) {
                C10691a.m21546b(C21218as.this.getContext(), str, 0).mo19066a();
            }

            /* renamed from: a */
            public final void mo45088a(String str) {
                super.mo45088a(str);
                if (C21218as.this.mBtnLogin != null) {
                    C21218as.this.mBtnLogin.mo45160a();
                }
            }

            /* renamed from: a */
            public final void mo45090a(JSONObject jSONObject) {
                if (C21218as.this.isViewValid() && C21218as.this.getContext() != null) {
                    C21218as.this.mo45324a(false);
                    if (C21218as.this.getActivity() instanceof MusLoginActivity) {
                        ((MusLoginActivity) C21218as.this.getActivity()).f57198a = null;
                    }
                    if (C21218as.this.f57637C.equals("email")) {
                        new C21023g().mo44997b("email").mo44996a("1").mo44990b();
                        C26890h.m65011a("login_success", new C20856a().mo44776a("enter_method", C21635v.f58646a).mo44776a("enter_from", C21635v.f58647b).mo44776a("platform", "email").mo44776a("enter_type", C21218as.this.f57516n).mo44774a("status", 1).mo44774a("_perf_monitor", 1).f56798a);
                    } else if (C21218as.this.f57637C.equals("username")) {
                        C26890h.m65011a("login_success", new C20856a().mo44776a("enter_method", C21218as.this.f57515m).mo44776a("enter_from", C21218as.this.f57514l).mo44776a("enter_type", C21218as.this.f57516n).mo44776a("platform", "handle").mo44774a("status", 1).mo44774a("_perf_monitor", 1).f56798a);
                    }
                    try {
                        new C18493a();
                        C21218as.m53691a(jSONObject.optJSONObject("data"), (C13207b) C18493a.m44735b(jSONObject));
                    } catch (Exception unused) {
                    }
                    if (C21218as.this.f57511d != null) {
                        Bundle bundle = new Bundle(C21218as.this.getArguments());
                        bundle.putString("platform", "mobile");
                        C21218as.this.f57511d.mo45026a(bundle);
                    }
                }
            }

            /* renamed from: a */
            public final void mo45089a(String str, String str2) {
                if (C21218as.this.isViewValid() && C21218as.this.getContext() != null) {
                    if (C21218as.this.mBtnLogin != null) {
                        C21218as.this.mBtnLogin.mo45160a();
                    }
                    C21218as.this.mo45158a(str, str2, C22165u.f59767g, C21218as.this.f57477w);
                }
            }

            /* renamed from: a */
            public final void mo45091a(JSONObject jSONObject, int i, String str) {
                if (C21218as.this.isViewValid() && C21218as.this.getContext() != null) {
                    if (C21218as.this.mBtnLogin != null) {
                        C21218as.this.mBtnLogin.mo45160a();
                    }
                    if (C21218as.this.f57637C.equals("email")) {
                        new C21023g().mo44997b("email").mo44996a("0").mo44998c(String.valueOf(i)).mo44999d("/passport/user/login/").mo44990b();
                        C26890h.m65011a("login_failure", new C20856a().mo44776a("platform", "email").mo44776a("enter_method", C21218as.this.f57515m).mo44776a("enter_type", C21218as.this.f57516n).mo44776a("carrier", "").mo44774a("error_code", i).f56798a);
                    } else if (C21218as.this.f57637C.equals("username")) {
                        new C21023g().mo44997b("username").mo44996a("0").mo44998c(String.valueOf(i)).mo44999d("/passport/user/login/").mo44990b();
                        C26890h.m65011a("login_failure", new C20856a().mo44776a("platform", "username").mo44776a("enter_method", C21218as.this.f57515m).mo44776a("enter_type", C21218as.this.f57516n).mo44776a("carrier", "").mo44774a("error_code", i).f56798a);
                    }
                    C10691a.m21546b(C21218as.this.getContext(), str, 0).mo19066a();
                }
            }
        };
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        this.f57640F = C13081d.m26312a(getContext());
        this.tipTitle.setText(getString(R.string.cd1));
        this.mTvHint.setText(C2240a.m6772a(getString(R.string.cd0), new Object[]{this.f57476v}));
        this.mCountDownView.mo45752a(3, this.f57476v);
        return onCreateView;
    }

    /* renamed from: a */
    public static C21218as m53746a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        C21218as asVar = new C21218as();
        Bundle bundle = new Bundle();
        bundle.putString("logintype", str2);
        bundle.putString("username", str);
        bundle.putString("countrycodePhone", str3);
        bundle.putString(f57469s, str5);
        bundle.putString(f57471u, str4);
        bundle.putString("email", str6);
        bundle.putString("password", str7);
        bundle.putString("enter_from", str8);
        bundle.putString("enter_method", str9);
        asVar.setArguments(bundle);
        return asVar;
    }
}
