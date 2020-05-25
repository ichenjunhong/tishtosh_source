package com.p683ss.android.ugc.aweme.shortvideo.duet;

import android.arch.lifecycle.C0209x;
import android.arch.lifecycle.C0214z;
import android.arch.lifecycle.LiveData;
import android.support.p030v4.app.FragmentActivity;
import com.p683ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p683ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.duet.y */
public final class C43299y implements C43295w {

    /* renamed from: a */
    private final FragmentActivity f109478a;

    /* renamed from: a */
    public final LiveData<Boolean> mo87953a() {
        LiveData<Boolean> g = m94956c().mo86398g();
        C52711k.m112236a((Object) g, "viewModel().isNativeInit");
        return g;
    }

    /* renamed from: b */
    public final ShortVideoContext mo87954b() {
        ShortVideoContext shortVideoContext = m94956c().f107134a;
        C52711k.m112236a((Object) shortVideoContext, "viewModel().shortVideoContext");
        return shortVideoContext;
    }

    /* renamed from: c */
    private final ShortVideoContextViewModel m94956c() {
        C0209x a = C0214z.m440a(this.f109478a).mo359a(ShortVideoContextViewModel.class);
        C52711k.m112236a((Object) a, "ViewModelProviders.of(ac…extViewModel::class.java)");
        return (ShortVideoContextViewModel) a;
    }

    public C43299y(FragmentActivity fragmentActivity) {
        C52711k.m112240b(fragmentActivity, "activity");
        this.f109478a = fragmentActivity;
    }
}
