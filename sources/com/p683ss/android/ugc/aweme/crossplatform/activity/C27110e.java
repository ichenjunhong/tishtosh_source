package com.p683ss.android.ugc.aweme.crossplatform.activity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.uikit.base.C11079a;
import com.p683ss.android.ugc.aweme.crossplatform.base.C27146a;
import com.p683ss.android.ugc.aweme.crossplatform.business.IMixActivityContainerProvider;
import com.p683ss.android.ugc.aweme.crossplatform.business.MixActivityContainerProvider;
import com.p683ss.android.ugc.aweme.crossplatform.p1615c.p1616a.C27182a;
import com.p683ss.android.ugc.aweme.crossplatform.p1615c.p1616a.C27182a.C27183a;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.activity.e */
public final class C27110e extends C11079a {

    /* renamed from: a */
    public MixActivityContainer f71520a;

    /* renamed from: b */
    public Runnable f71521b;

    /* renamed from: c */
    private C27182a f71522c;

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        arguments.putBoolean("webview_progress_bar", C27146a.m65494a(arguments));
        this.f71522c = C27183a.m65605a(arguments);
        C27182a aVar = this.f71522c;
        IMixActivityContainerProvider createIMixActivityContainerProviderbyMonsterPlugin = MixActivityContainerProvider.createIMixActivityContainerProviderbyMonsterPlugin();
        if (createIMixActivityContainerProviderbyMonsterPlugin != null) {
            this.f71520a = createIMixActivityContainerProviderbyMonsterPlugin.createMixActivityContainer(getActivity(), aVar);
        }
        if (this.f71520a == null) {
            this.f71520a = new MixActivityContainer(getActivity(), aVar);
        }
        this.f71520a.f71489c = getArguments();
        this.f71520a.mo55368a(this.f71521b);
        getLifecycle().mo324a(this.f71520a);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f71520a.mo55375k();
        super.onViewCreated(view, bundle);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.b7x, viewGroup, false);
    }
}
