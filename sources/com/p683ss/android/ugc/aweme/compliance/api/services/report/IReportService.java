package com.p683ss.android.ugc.aweme.compliance.api.services.report;

import android.app.Activity;
import android.net.Uri.Builder;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.compliance.api.services.report.IReportService */
public interface IReportService {

    /* renamed from: com.ss.android.ugc.aweme.compliance.api.services.report.IReportService$a */
    public interface C27014a {
    }

    String getAwemeReportType(Aweme aweme);

    String getReportEnterMethod(String str);

    void report(Activity activity, Builder builder);

    void reportAd(Activity activity, Builder builder);

    void reportAweme(Activity activity, Aweme aweme, String str, String str2);

    void reportDouPlus(Activity activity, Aweme aweme);

    void reportMobHelper(Map<String, String> map);

    String reportType(Aweme aweme);

    void reportWithCallback(Activity activity, Builder builder, C27014a aVar);

    void sendReportEvent(String str, String str2, String str3, String str4, String str5, String str6, String str7);
}
