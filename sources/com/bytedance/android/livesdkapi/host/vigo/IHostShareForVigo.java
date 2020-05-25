package com.bytedance.android.livesdkapi.host.vigo;

import android.app.Activity;
import com.bytedance.android.live.base.C2952b;
import com.bytedance.android.livesdkapi.depend.p439g.C8632a;
import com.bytedance.android.livesdkapi.depend.p439g.C8633b;
import com.bytedance.android.livesdkapi.host.IHostShare.C8769a;
import com.bytedance.android.livesdkapi.host.p451a.C8786i;

public interface IHostShareForVigo extends C2952b, C8786i {
    void getShortUrl(String str, C8769a aVar);

    boolean isShareAvailable(String str, Activity activity);

    void share(Activity activity, C8633b bVar, C8632a aVar);

    void showReportDialog(Activity activity, C8633b bVar, String str);

    void showShareDialog(Activity activity, C8633b bVar, C8632a aVar);
}
