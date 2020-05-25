package com.p683ss.android.ugc.aweme.account.login.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.C2240a;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.sdk.account.p844a.p845a.C12989a;
import com.bytedance.sdk.account.p844a.p845a.C12990b;
import com.bytedance.sdk.account.p844a.p845a.C12994f;
import com.p683ss.android.ugc.aweme.account.login.MusLoginManager;
import com.p683ss.android.ugc.aweme.account.login.authorize.AuthorizeActivity;
import com.p683ss.android.ugc.aweme.account.login.p1280a.C21045a;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.account.login.fragment.au */
public final class C21224au extends BaseThirdPartyCheckFragment {

    /* renamed from: t */
    public static String f57653t = "oldpassword";

    /* renamed from: u */
    public static String f57654u = "newpassword";

    /* renamed from: v */
    public C21045a f57655v;

    /* renamed from: w */
    private String f57656w;

    /* renamed from: x */
    private String f57657x;

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
            this.f57656w = getArguments().getString(f57653t);
            this.f57657x = getArguments().getString(f57654u);
        }
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
                    C21224au.this.mo45324a(false);
                    if (fVar == null) {
                        C10691a.m21542b(C21224au.this.getContext(), (int) R.string.azb).mo19066a();
                    } else if (fVar.f33998a) {
                        C21224au.this.f57655v.mo45080a(fVar.f34008h);
                        C21224au.this.getActivity().onBackPressed();
                    } else if (fVar.f34000c <= 0 || TextUtils.isEmpty(fVar.f34001d)) {
                        C10691a.m21542b(C21224au.this.getContext(), (int) R.string.azb).mo19066a();
                    } else {
                        C10691a.m21545b(C21224au.this.getContext(), fVar.f34001d).mo19066a();
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
        this.mTvBindDetail.setText(getString(R.string.dxh));
        this.f57493o.start();
        return onCreateView;
    }
}
