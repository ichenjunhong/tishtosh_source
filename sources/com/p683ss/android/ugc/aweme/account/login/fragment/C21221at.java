package com.p683ss.android.ugc.aweme.account.login.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.p030v4.app.Fragment;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.C2240a;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.sdk.account.p844a.p845a.C12989a;
import com.bytedance.sdk.account.p844a.p845a.C12990b;
import com.bytedance.sdk.account.p844a.p845a.C12994f;
import com.bytedance.sdk.account.p877l.C13207b;
import com.p683ss.android.account.C18492b.C18493a;
import com.p683ss.android.ugc.aweme.account.login.C21635v;
import com.p683ss.android.ugc.aweme.account.login.MusLoginActivity;
import com.p683ss.android.ugc.aweme.account.login.MusLoginManager;
import com.p683ss.android.ugc.aweme.account.login.authorize.AuthorizeActivity;
import com.p683ss.android.ugc.aweme.account.login.p1280a.C21049e;
import com.p683ss.android.ugc.aweme.account.login.p1280a.C21050f;
import com.p683ss.android.ugc.aweme.account.p1260a.p1262b.C20856a;
import com.p683ss.android.ugc.aweme.account.p1279l.C21023g;
import com.p683ss.android.ugc.aweme.account.util.C22271m;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.ss.android.ugc.trill.R;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.account.login.fragment.at */
public final class C21221at extends BaseThirdPartyCheckFragment {

    /* renamed from: t */
    public String f57645t;

    /* renamed from: u */
    public String f57646u;

    /* renamed from: v */
    public String f57647v;

    /* renamed from: w */
    public String f57648w;

    /* renamed from: x */
    public C21049e f57649x;

    /* renamed from: y */
    public String f57650y;

    /* renamed from: a */
    public final void mo45314a() {
        Intent intent = new Intent(getContext(), AuthorizeActivity.class);
        intent.putExtra("platform", this.f57494p);
        intent.putExtra("is_only_fetch_token", true);
        startActivityForResult(intent, 4321);
        if (this.f57493o != null) {
            this.f57493o.cancel();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo45315a(long j) {
        this.mCountDownFive.setText(C2240a.m6772a(getString(R.string.dxk), new Object[]{Long.valueOf(j / 1000)}));
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() != null) {
            this.f57645t = getArguments().getString("email");
            this.f57646u = getArguments().getString("password");
            this.f57647v = getArguments().getString("logintype");
            this.f57648w = getArguments().getString("countrycodePhone");
            this.f57650y = getArguments().getString("username");
        }
        C26890h.m65011a("account_verification_show", new C20856a().mo44776a("enter_method", this.f57515m).mo44776a("enter_from", this.f57514l).mo44776a("verification_method", "third_party_account").f56798a);
        this.f57649x = new C21050f() {
            /* renamed from: a */
            public final void mo45089a(String str, String str2) {
            }

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
                C21221at.this.mo45324a(false);
                if (!TextUtils.isEmpty(C21221at.this.f57648w)) {
                    String str = C21221at.this.f57648w.split("-")[0];
                    C21168a aVar = (C21168a) C22271m.m55123a(C21227aw.class).mo46372a("country_code", str).mo46372a("phone_number", C21221at.this.f57648w.split("-")[1]).mo46371a("code_type", 2).mo46370a();
                    aVar.mo45323a(C21221at.this.f57511d);
                    C21221at.this.mo45321a((Fragment) aVar, false);
                }
            }

            /* renamed from: a */
            public final void mo45088a(String str) {
                super.mo45088a(str);
                if (C21221at.this.getActivity() != null) {
                    C21221at.this.mo45324a(false);
                }
            }

            /* renamed from: c */
            public final void mo45095c(String str) {
                C21221at.this.mo45324a(false);
                C10691a.m21546b(C21221at.this.getContext(), str, 0).mo19066a();
            }

            /* renamed from: a */
            public final void mo45090a(JSONObject jSONObject) {
                if (C21221at.this.isViewValid() && C21221at.this.getContext() != null) {
                    C21221at.this.mo45324a(false);
                    if (C21221at.this.getActivity() instanceof MusLoginActivity) {
                        ((MusLoginActivity) C21221at.this.getActivity()).f57198a = null;
                    }
                    if (C21221at.this.f57647v.equals("email")) {
                        new C21023g().mo44997b("email").mo44996a("1").mo44990b();
                        C26890h.m65011a("login_success", new C20856a().mo44776a("enter_method", C21635v.f58646a).mo44776a("enter_from", C21635v.f58647b).mo44776a("platform", "email").mo44776a("enter_type", C21221at.this.f57516n).mo44774a("status", 1).mo44774a("_perf_monitor", 1).f56798a);
                    } else if (C21221at.this.f57647v.equals("username")) {
                        C26890h.m65011a("login_success", new C20856a().mo44776a("enter_method", C21221at.this.f57515m).mo44776a("enter_from", C21221at.this.f57514l).mo44776a("enter_type", C21221at.this.f57516n).mo44776a("platform", "handle").mo44774a("status", 1).mo44774a("_perf_monitor", 1).f56798a);
                    }
                    try {
                        new C18493a();
                        C21221at.m53691a(jSONObject.optJSONObject("data"), (C13207b) C18493a.m44735b(jSONObject));
                    } catch (Exception unused) {
                    }
                    if (C21221at.this.f57511d != null) {
                        Bundle bundle = new Bundle(C21221at.this.getArguments());
                        bundle.putString("platform", "mobile");
                        C21221at.this.f57511d.mo45026a(bundle);
                    }
                }
            }

            /* renamed from: a */
            public final void mo45091a(JSONObject jSONObject, int i, String str) {
                if (C21221at.this.isViewValid() && C21221at.this.getContext() != null) {
                    C21221at.this.mo45324a(false);
                    if (C21221at.this.f57647v.equals("email")) {
                        new C21023g().mo44997b("email").mo44996a("0").mo44998c(String.valueOf(i)).mo44999d("/passport/user/login/").mo44990b();
                        C26890h.m65011a("login_failure", new C20856a().mo44776a("platform", "email").mo44776a("enter_method", C21221at.this.f57515m).mo44776a("enter_type", C21221at.this.f57516n).mo44776a("carrier", "").mo44774a("error_code", i).f56798a);
                    } else if (C21221at.this.f57647v.equals("username")) {
                        new C21023g().mo44997b("username").mo44996a("0").mo44998c(String.valueOf(i)).mo44999d("/passport/user/login/").mo44990b();
                        C26890h.m65011a("login_failure", new C20856a().mo44776a("platform", "username").mo44776a("enter_method", C21221at.this.f57515m).mo44776a("enter_type", C21221at.this.f57516n).mo44776a("carrier", "").mo44774a("error_code", i).f56798a);
                    }
                    if (i != 2006 || !TextUtils.isEmpty(str)) {
                        C10691a.m21546b(C21221at.this.getContext(), str, 0).mo19066a();
                    } else {
                        C10691a.m21542b(C21221at.this.getContext(), (int) R.string.c2i).mo19066a();
                    }
                }
            }
        };
    }

    /* renamed from: a */
    public final void mo45316a(Intent intent) {
        if (intent != null) {
            String stringExtra = intent.getStringExtra("access_token");
            String stringExtra2 = intent.getStringExtra("access_token_secret");
            String stringExtra3 = intent.getStringExtra("code");
            mo45324a(true);
            new MusLoginManager().mo45047a(stringExtra, stringExtra2, stringExtra3, "", this.f57494p, "", new C12989a<C12994f>() {
                public final /* synthetic */ void onResponse(C12990b bVar) {
                    C12994f fVar = (C12994f) bVar;
                    if (fVar == null) {
                        C10691a.m21542b(C21221at.this.getContext(), (int) R.string.azb).mo19066a();
                    } else if (fVar.f33998a) {
                        String str = fVar.f34008h;
                        if (C21221at.this.f57647v.equals("email")) {
                            C21221at.this.mo45328f().mo45049b(C21221at.this.f57645t, C21221at.this.f57646u, str, "", C21221at.this.f57649x);
                        } else {
                            if (C21221at.this.f57647v.equals("username")) {
                                C21221at.this.mo45328f().mo45046a(C21221at.this.f57650y, C21221at.this.f57646u, str, "", C21221at.this.f57649x);
                            }
                        }
                    } else if (fVar.f34000c <= 0 || TextUtils.isEmpty(fVar.f34001d)) {
                        C10691a.m21542b(C21221at.this.getContext(), (int) R.string.azb).mo19066a();
                    } else {
                        C10691a.m21545b(C21221at.this.getContext(), fVar.f34001d).mo19066a();
                    }
                }
            });
            return;
        }
        getActivity().onBackPressed();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        this.mBtnConfirm.setText(getString(R.string.dxj));
        this.mTvBindDetail.setText(getString(R.string.dxm));
        this.f57493o.start();
        return onCreateView;
    }

    /* renamed from: a */
    public static C21221at m53759a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        C21221at atVar = new C21221at();
        Bundle bundle = new Bundle();
        bundle.putString("username", str);
        bundle.putString("logintype", str2);
        bundle.putString("platform", str4);
        bundle.putString("email", str5);
        bundle.putString("password", str6);
        bundle.putString("countrycodePhone", str3);
        bundle.putString("enter_from", str7);
        bundle.putString("enter_method", str8);
        atVar.setArguments(bundle);
        return atVar;
    }
}
