package com.p683ss.android.ugc.aweme.setting.services;

import android.content.Context;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import com.p683ss.android.ugc.aweme.common.C26832a;
import com.p683ss.android.ugc.aweme.common.C26851b;
import com.p683ss.android.ugc.aweme.setting.serverpush.p2145a.C41686c;
import com.p683ss.android.ugc.aweme.setting.serverpush.p2146b.C41692a;
import com.p683ss.android.ugc.aweme.setting.serverpush.p2146b.C41693b;
import p064c.p065a.C2201v;

/* renamed from: com.ss.android.ugc.aweme.setting.services.ISettingService */
public interface ISettingService {
    C2201v<BaseResponse> getBrowseRecordChangeSwitchToOb(boolean z);

    String getReleaseBuildString();

    boolean isBrowseRecordSwitchOn();

    boolean needShowRedDotOnMyProfileMore();

    C26851b<C26832a<BaseResponse>, C41692a> providePrivateSettingChangePresenter();

    C26851b<C26832a<BaseResponse>, C41692a> providePushSettingChangePresenter();

    C26851b<C26832a<C41686c>, C41693b> providePushSettingFetchPresenter();

    void startProfileVideoMixListActivity(Context context, String str, String str2, String str3);
}
