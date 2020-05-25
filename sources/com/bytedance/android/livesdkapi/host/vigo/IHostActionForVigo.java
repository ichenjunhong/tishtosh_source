package com.bytedance.android.livesdkapi.host.vigo;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.android.live.base.C2952b;
import com.bytedance.android.livesdkapi.host.IHostAction.C8767a;
import com.bytedance.android.livesdkapi.host.p451a.C8778a;
import java.util.Map;

public interface IHostActionForVigo extends C2952b, C8778a {
    boolean handleSchema(Context context, String str, Bundle bundle);

    void openFeedBack(String str, Context context);

    boolean openHostBrowser(String str, Bundle bundle, Context context);

    boolean openHostBrowser(String str, boolean z, String str2, Context context);

    void openLiveBrowser(String str, Bundle bundle, Context context);

    void openLiveBrowser(String str, String str2, Context context);

    void openSignActivity(Context context, Intent intent);

    void openTaobaoApp(Context context, String str, C8767a aVar);

    void openUserProfilePage(long j, Map<String, String> map);

    void openUserProfilePage(Context context, long j, Bundle bundle);

    void openVideoDetailPage(String str, String str2);

    void switchToLiveTab(int i, String str);

    boolean tryOpenAdByOpenUrl(Context context, long j, String str, String str2);
}
