package com.bytedance.android.live.broadcast.viewmodel;

import android.arch.lifecycle.C0198r;
import com.bytedance.android.live.broadcast.api.StartLiveBannerApi;
import com.bytedance.android.live.broadcast.p211f.C3395f;
import com.bytedance.android.live.core.rxutils.C4064k;
import com.bytedance.android.live.core.rxutils.RxViewModel;
import com.bytedance.android.livesdk.chatroom.model.C5743c.C5744a;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import p064c.p065a.C1673aa;
import p064c.p065a.p071d.C1710e;

public class StartLiveBannerViewModel extends RxViewModel {

    /* renamed from: a */
    public final C0198r<C5744a> f10378a = new C0198r<>();

    /* renamed from: a */
    public final void mo9027a(String str) {
        if (((Boolean) LiveSettingKeys.LIVE_PAGE_SHOW_BANNER.mo9431a()).booleanValue()) {
            mo9390a(((StartLiveBannerApi) C3395f.m9156f().mo8742c().mo9018a(StartLiveBannerApi.class)).queryStartLiveBanner(str, 2).mo6513a((C1673aa<? super T, ? extends R>) C4064k.m10182a()).mo6505a((C1710e<? super T>) new C3646a<Object>(this), C3647b.f10380a));
        }
    }
}
