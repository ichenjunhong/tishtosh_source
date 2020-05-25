package com.p683ss.android.ugc.aweme.setting.services;

import android.content.Context;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import com.p683ss.android.ugc.aweme.common.C26832a;
import com.p683ss.android.ugc.aweme.common.C26851b;
import com.p683ss.android.ugc.aweme.setting.serverpush.p2145a.C41686c;
import com.p683ss.android.ugc.aweme.setting.serverpush.p2146b.C41692a;
import com.p683ss.android.ugc.aweme.setting.serverpush.p2146b.C41693b;
import p064c.p065a.C2201v;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.setting.services.b */
public final class C41713b implements ISettingService {

    /* renamed from: a */
    public static final C41713b f105569a = new C41713b();

    /* renamed from: b */
    private final /* synthetic */ ISettingService f105570b;

    public final C2201v<BaseResponse> getBrowseRecordChangeSwitchToOb(boolean z) {
        return this.f105570b.getBrowseRecordChangeSwitchToOb(z);
    }

    public final String getReleaseBuildString() {
        return this.f105570b.getReleaseBuildString();
    }

    public final boolean isBrowseRecordSwitchOn() {
        return this.f105570b.isBrowseRecordSwitchOn();
    }

    public final boolean needShowRedDotOnMyProfileMore() {
        return this.f105570b.needShowRedDotOnMyProfileMore();
    }

    public final C26851b<C26832a<BaseResponse>, C41692a> providePrivateSettingChangePresenter() {
        return this.f105570b.providePrivateSettingChangePresenter();
    }

    public final C26851b<C26832a<BaseResponse>, C41692a> providePushSettingChangePresenter() {
        return this.f105570b.providePushSettingChangePresenter();
    }

    public final C26851b<C26832a<C41686c>, C41693b> providePushSettingFetchPresenter() {
        return this.f105570b.providePushSettingFetchPresenter();
    }

    public final void startProfileVideoMixListActivity(Context context, String str, String str2, String str3) {
        C52711k.m112240b(str3, "enterFrom");
        this.f105570b.startProfileVideoMixListActivity(context, str, str2, str3);
    }

    private C41713b() {
        ISettingService createISettingServicebyMonsterPlugin = SettingServiceImpl.createISettingServicebyMonsterPlugin();
        C52711k.m112236a((Object) createISettingServicebyMonsterPlugin, "ServiceManager.get().get…ttingService::class.java)");
        this.f105570b = createISettingServicebyMonsterPlugin;
    }
}
