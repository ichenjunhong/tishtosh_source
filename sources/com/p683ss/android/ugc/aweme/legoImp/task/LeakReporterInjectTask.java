package com.p683ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import android.os.Build;
import android.os.Build.VERSION;
import android.text.TextUtils;
import com.bytedance.crash.C9610j;
import com.bytedance.crash.p546f.C9585b;
import com.bytedance.crash.p554m.C9672d;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.liko.p771a.C12265a;
import com.bytedance.liko.p771a.C12267c;
import com.bytedance.liko.p771a.C12268d;
import com.p683ss.android.common.applog.TeaAgent;
import com.p683ss.android.monitor.C19524a;
import com.p683ss.android.ugc.aweme.language.C35837h;
import com.p683ss.android.ugc.aweme.lego.C35894d;
import com.p683ss.android.ugc.aweme.lego.C35896f;
import com.p683ss.android.ugc.aweme.lego.C35898h;
import com.p683ss.android.ugc.aweme.lego.LegoTask;
import com.p683ss.android.ugc.aweme.memory.p1947a.C36769a;
import com.p683ss.android.ugc.aweme.memory.p1947a.C36769a.C36770a;
import com.p683ss.android.ugc.aweme.settings.LikoAnalysisConfig;
import java.util.regex.Matcher;
import kotlinx.coroutines.C53225av;
import kotlinx.coroutines.C53256be;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.LeakReporterInjectTask */
public class LeakReporterInjectTask implements LegoTask {
    private final int LOCALTEST_STRATEGY = 9;
    private final int LOCAL_ANALYSIS = 2;
    private final long MIN_CAN_ANALYSIS_MEMORY = 134217728;
    private final int ONLINE_ANALYSIS = 18;
    private final String TAG = "LeakDetector";

    public C35896f process() {
        return C35894d.m81063a(this);
    }

    public C35898h type() {
        return C35898h.BOOT_FINISH;
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void lambda$run$0$LeakReporterInjectTask(String str) {
        if (C9610j.m19136a()) {
            C9585b a = C9585b.m19044a(new StackTraceElement("FdLeakDetector", "report", "FdLeakWarning", 0), str, "FdLeakWarning", Thread.currentThread().getName(), false, "EnsureNotNull");
            a.mo17395a("log_type", (Object) "fdLeak");
            C9672d.m19295a(a);
        }
    }

    public void run(Context context) {
        int i;
        String str;
        boolean equals = TextUtils.equals(C11010c.m22295p(), "local_test");
        if ((!equals || C12267c.m24747a()) && equals) {
            LikoAnalysisConfig d = C19524a.m47807d();
            if (C19524a.m47806c()) {
                i = 18;
            } else {
                i = 2;
            }
            if (equals) {
                i = 9;
            }
            if (i != 2 || Runtime.getRuntime().maxMemory() > 134217728) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("strategy", i);
                    jSONObject.put("aid", C11010c.m22289j());
                    jSONObject.put("channel", C11010c.m22295p());
                    jSONObject.put("device_id", TeaAgent.getServerDeviceId());
                    jSONObject.put("app_version", C11010c.m22288i());
                    jSONObject.put("update_version_code", String.valueOf(C11010c.m22286g()));
                    jSONObject.put("current_update_version_code", String.valueOf(C11010c.m22286g()));
                    jSONObject.put("os_version", VERSION.RELEASE);
                    jSONObject.put("os_api", VERSION.SDK_INT);
                    jSONObject.put("device_model", Build.MODEL);
                    jSONObject.put("device_brand", Build.BRAND);
                    jSONObject.put("device_manufacturer", Build.MANUFACTURER);
                    jSONObject.put("process_name", C11010c.m22280a().getPackageName());
                    jSONObject.put("version_name", C11010c.m22294o());
                    jSONObject.put("version_code", (int) C11010c.m22293n());
                    jSONObject.put("region", C35837h.m80980e());
                    jSONObject.put("oversea", true);
                    JSONArray jSONArray = new JSONArray();
                    jSONArray.put("android.app.Activity");
                    jSONArray.put("android.app.Fragment");
                    jSONArray.put("android.support.v4.app.Fragment");
                    jSONObject.put("detect_leak_classes", jSONArray);
                    jSONObject.put("supportBigObjectAnalysis", d.isSupportBigObjectAnalysis());
                    jSONObject.put("bigObjectFilterSystem", d.isBigObjectFilterSystem());
                    jSONObject.put("bigObjectLatitude", d.getBigObjectLatitude());
                    jSONObject.put("supportObjectInstanceAnalysis", d.isSupportObjectInstanceAnalysis());
                    jSONObject.put("objectInstanceFilterSystem", d.isObjectInstanceFilterSystem());
                    jSONObject.put("objectInstanceLatitude", d.getObjectInstanceLatitude());
                    jSONObject.put("supportBitmapAnalysis", d.isSupportBitmapAnalysis());
                    jSONObject.put("bitmapLatitude", d.getBitmapLatitude());
                    if (equals) {
                        jSONObject.put("bigObjectFilterSystem", false);
                        jSONObject.put("objectInstanceFilterSystem", false);
                    }
                } catch (JSONException unused) {
                }
                C12267c.m24745a(jSONObject);
                if (equals) {
                    C12267c.f32371a = 20;
                    C12268d.f32378a = new C35982i(this);
                    C12265a.m24736a(300);
                    C12265a.m24741b(10);
                    C12265a.m24737a(60000);
                    C12265a.m24738a(true);
                    C36769a aVar = C36769a.f93964e;
                    if (C12267c.m24747a() && TextUtils.isEmpty(C36769a.f93963d) && !TextUtils.isEmpty(C36769a.f93961b)) {
                        Matcher matcher = C36769a.f93960a.matcher(C36769a.f93961b);
                        if (matcher.find()) {
                            str = matcher.group(2);
                        } else {
                            str = null;
                        }
                        if (str != null) {
                            String string = C36769a.f93962c.getString("mapping_url", "");
                            C52711k.m112236a((Object) string, "keva.getString(KEY_MAPPING_URL, \"\")");
                            C36769a.f93963d = string;
                            if (TextUtils.isEmpty(string) || !C52830p.m112456b((CharSequence) C36769a.f93963d, (CharSequence) str, false, 2, (Object) null)) {
                                C36769a.f93963d = "";
                                C53301g.m113291a(C53256be.f131885a, C53225av.m113073a(), null, new C36770a(str, null), 2, null);
                            }
                        }
                    }
                }
            }
        }
    }
}
