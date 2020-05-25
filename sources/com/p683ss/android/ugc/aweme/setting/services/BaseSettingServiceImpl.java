package com.p683ss.android.ugc.aweme.setting.services;

import android.content.Context;
import android.content.Intent;
import com.p683ss.android.ugc.aweme.app.C23107j;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import com.p683ss.android.ugc.aweme.browserecord.BrowseRecordSettingApi;
import com.p683ss.android.ugc.aweme.browserecord.C24030h;
import com.p683ss.android.ugc.aweme.browserecord.C24030h.C24031a;
import com.p683ss.android.ugc.aweme.common.C26832a;
import com.p683ss.android.ugc.aweme.common.C26851b;
import com.p683ss.android.ugc.aweme.feed.utils.C31216x;
import com.p683ss.android.ugc.aweme.mix.ProfileVideoMixListActivity;
import com.p683ss.android.ugc.aweme.setting.serverpush.p2145a.C41686c;
import com.p683ss.android.ugc.aweme.setting.serverpush.p2146b.C41692a;
import com.p683ss.android.ugc.aweme.setting.serverpush.p2146b.C41693b;
import com.p683ss.android.ugc.aweme.setting.serverpush.p2146b.C41694c;
import com.p683ss.android.ugc.aweme.setting.serverpush.p2146b.C41697d;
import com.p683ss.android.ugc.aweme.setting.serverpush.p2146b.C41700e;
import p064c.p065a.C2201v;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p093k.C2168a;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.setting.services.BaseSettingServiceImpl */
public abstract class BaseSettingServiceImpl implements ISettingService {
    public String getReleaseBuildString() {
        return C23107j.m56674a();
    }

    public boolean isBrowseRecordSwitchOn() {
        if (C24030h.f63763a == 1) {
            return true;
        }
        return false;
    }

    public C26851b<C26832a<BaseResponse>, C41692a> providePrivateSettingChangePresenter() {
        return new C41694c<>();
    }

    public C26851b<C26832a<BaseResponse>, C41692a> providePushSettingChangePresenter() {
        return new C41697d<>();
    }

    public C26851b<C26832a<C41686c>, C41693b> providePushSettingFetchPresenter() {
        return new C41700e<>();
    }

    public C2201v<BaseResponse> getBrowseRecordChangeSwitchToOb(boolean z) {
        C2201v<BaseResponse> d = BrowseRecordSettingApi.f63655a.setSetting("agree_video_store_view", z ? 1 : 0).mo6529b(C2168a.m6521b()).mo6514a(C1667a.m5940a()).mo6540d((C1710e<? super T>) new C24031a<Object>(z));
        C52711k.m112236a((Object) d, "BrowseRecordSettingApi.c…ITCH_ON else SWITCH_OFF }");
        return d;
    }

    public void startProfileVideoMixListActivity(Context context, String str, String str2, String str3) {
        C52711k.m112240b(str3, "enterFrom");
        if (context != null) {
            C52711k.m112240b(context, "context");
            C31216x.m72904a(str, str3);
            Intent intent = new Intent(context, ProfileVideoMixListActivity.class);
            if (str != null) {
                intent.putExtra("user_id", str);
            }
            if (str2 != null) {
                intent.putExtra("sec_user_id", str2);
            }
            context.startActivity(intent);
        }
    }
}
