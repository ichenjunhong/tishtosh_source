package com.p683ss.android.ugc.aweme.lancet;

import android.app.Activity;
import android.content.Context;
import android.os.Build.VERSION;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.ttnet.C13303d;
import com.p683ss.android.common.applog.AppLog;
import com.p683ss.android.ugc.aweme.app.AwemeApplication;
import com.p683ss.android.ugc.aweme.app.C23131p;
import com.p683ss.android.ugc.aweme.app.p1376f.C23088c;
import com.p683ss.android.ugc.aweme.experiment.UseNewAppAlertExperiment;
import com.p683ss.android.ugc.aweme.lego.C35894d;
import com.p683ss.android.ugc.aweme.lego.C35896f;
import com.p683ss.android.ugc.aweme.lego.C35898h;
import com.p683ss.android.ugc.aweme.lego.LegoTask;
import com.p683ss.android.ugc.aweme.setting.C41556av;
import com.p683ss.android.ugc.aweme.setting.C41558aw;
import com.p683ss.android.ugc.aweme.setting.model.RetryPolicyItem;
import com.p683ss.android.ugc.aweme.video.preload.experiment.VideoCacheTTnetPreloadTimeoutExperiment;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.lancet.I18nLancet */
public final class I18nLancet {

    /* renamed from: a */
    public static String f52269a;

    /* renamed from: com.ss.android.ugc.aweme.lancet.I18nLancet$AmeActivityResumeRun */
    public static class AmeActivityResumeRun implements LegoTask {
        private Activity mContext;

        public C35896f process() {
            return C35894d.m81063a(this);
        }

        public C35898h type() {
            return C35898h.BOOT_FINISH;
        }

        public AmeActivityResumeRun(Activity activity) {
            this.mContext = activity;
        }

        public void run(Context context) {
            boolean z;
            if (VERSION.SDK_INT != 18) {
                z = true;
            } else {
                z = false;
            }
            if (z && this.mContext != null) {
                C13303d.m26792a(this.mContext);
            }
            if (C10181b.m20511a().mo18168a(UseNewAppAlertExperiment.class, true, "use_new_app_alert", 31744, 0) == 0) {
                AppLog.activeUser(AwemeApplication.m56199a());
            }
            C41556av a = C41556av.m91389a();
            if (C41558aw.m91394a(C11010c.m22280a())) {
                for (int i = 0; i < a.f105265b.size(); i++) {
                    RetryPolicyItem retryPolicyItem = (RetryPolicyItem) a.f105265b.valueAt(i);
                    int keyAt = a.f105265b.keyAt(i);
                    if (!retryPolicyItem.isLoadSuccess) {
                        if (retryPolicyItem.retryCount == 3) {
                            retryPolicyItem.isLoadSuccess = true;
                            retryPolicyItem.retryCount = 0;
                        } else {
                            if (System.currentTimeMillis() - retryPolicyItem.lastResponseTime > ((long) (VideoCacheTTnetPreloadTimeoutExperiment.DEFAULT >> retryPolicyItem.retryCount))) {
                                retryPolicyItem.retryCount++;
                                C23131p.m57779a("aweme_setting_retry_policy", C23088c.m56631a().mo47824a("group_id", String.valueOf(keyAt)).mo47822a("fetch_url_retry_count", Integer.valueOf(retryPolicyItem.retryCount)).mo47823a("time_interval", Long.valueOf(System.currentTimeMillis() - retryPolicyItem.lastResponseTime)).mo47825b());
                                retryPolicyItem.retryListener.mo85342b();
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public static void m46138a(JSONObject jSONObject, String str, String str2) {
        if (jSONObject.isNull(str)) {
            try {
                jSONObject.put(str, str2);
            } catch (JSONException unused) {
            }
        }
    }
}
