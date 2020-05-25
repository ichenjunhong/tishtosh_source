package com.p683ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.apm.core.C8989b;
import com.bytedance.apm.impl.DefaultTTNetImpl;
import com.bytedance.apm.internal.ApmDelegate;
import com.bytedance.apm.p478d.C9001b;
import com.bytedance.apm.p478d.C9001b.C9003a;
import com.bytedance.apm.p478d.C9007d.C9009a;
import com.bytedance.apm.p486i.C9051b;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.ies.ugc.statisticlogger.C11063e;
import com.p683ss.android.common.applog.AppLog;
import com.p683ss.android.common.applog.NetUtil;
import com.p683ss.android.common.util.NetworkUtils;
import com.p683ss.android.deviceregister.C19034d;
import com.p683ss.android.deviceregister.C19034d.C19035a;
import com.p683ss.android.ugc.aweme.AccountService;
import com.p683ss.android.ugc.aweme.app.AwemeApplication;
import com.p683ss.android.ugc.aweme.app.C23131p;
import com.p683ss.android.ugc.aweme.base.C23569o;
import com.p683ss.android.ugc.aweme.language.C35837h;
import com.p683ss.android.ugc.aweme.lego.C35857a;
import com.p683ss.android.ugc.aweme.lego.C35894d;
import com.p683ss.android.ugc.aweme.lego.C35896f;
import com.p683ss.android.ugc.aweme.lego.C35898h;
import com.p683ss.android.ugc.aweme.lego.LegoTask;
import com.p683ss.android.ugc.aweme.optimize.C38542b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
import p064c.p065a.p066a.p068b.C1667a;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.MonitorInitTask */
public class MonitorInitTask implements LegoTask {
    private static final String[] API_NPTH_LAUNCH_CRASH = {"https://api2.musical.ly/monitor/collect/c/exception"};
    private static final List<String> DEFAULT_REPORT_URL_LIST;
    private static final AtomicBoolean INITED = new AtomicBoolean(false);

    public C35896f process() {
        return C35894d.m81063a(this);
    }

    public C35898h type() {
        return C35898h.BOOT_FINISH;
    }

    static {
        String str;
        String str2;
        String[] strArr = new String[3];
        if (C35837h.m80977b()) {
            str = "https://mon.tiktokv.com/monitor/collect/";
        } else {
            str = "https://mon.musical.ly/monitor/collect/";
        }
        strArr[0] = str;
        if (C35837h.m80977b()) {
            str2 = "https://mon.musical.ly/monitor/collect/";
        } else {
            str2 = "https://mon.tiktokv.com/monitor/collect/";
        }
        strArr[1] = str2;
        strArr[2] = "https://mon.byteoversea.com/monitor/collect/";
        DEFAULT_REPORT_URL_LIST = new ArrayList(Arrays.asList(strArr));
    }

    public void run(Context context) {
        String str;
        String str2;
        if (INITED.compareAndSet(false, true)) {
            AwemeApplication a = AwemeApplication.m56199a();
            ApmDelegate a2 = ApmDelegate.m17947a();
            C9003a a3 = C9001b.m17803a();
            a3.f24506e = a2.f24741a;
            if (a2.f24742b != null) {
                a3.f24503b = a2.f24742b.f25136b;
                a3.f24504c = a2.f24742b.f25135a;
                a3.f24507f = a2.f24742b.f25138d;
                a3.f24508g = (long) a2.f24742b.f25137c;
            }
            a2.mo16428a((Context) a, a3.mo16329a());
            C9009a aVar = new C9009a();
            JSONObject headerCopy = AppLog.getHeaderCopy();
            if (headerCopy != null) {
                aVar.mo16333a(headerCopy);
            }
            String[] strArr = new String[3];
            if (C35837h.m80977b()) {
                str = "https://mon.tiktokv.com/monitor/appmonitor/v2/settings";
            } else {
                str = "https://mon.musical.ly/monitor/appmonitor/v2/settings";
            }
            strArr[0] = str;
            if (C35837h.m80977b()) {
                str2 = "https://mon.musical.ly/monitor/appmonitor/v2/settings";
            } else {
                str2 = "https://mon.tiktokv.com/monitor/appmonitor/v2/settings";
            }
            strArr[1] = str2;
            strArr[2] = "https://mon.byteoversea.com/monitor/appmonitor/v2/settings";
            aVar.f24553k = Arrays.asList(strArr);
            aVar.f24560r = Math.min(60, 30);
            aVar.f24555m = Arrays.asList(API_NPTH_LAUNCH_CRASH);
            aVar.f24554l = DEFAULT_REPORT_URL_LIST;
            String str3 = "device_id";
            String str4 = "app_version";
            String str5 = "update_version_code";
            String str6 = "channel";
            aVar.mo16331a("aid", C11010c.m22289j()).mo16332a(str3, AppLog.getServerDeviceId()).mo16332a(str4, C11010c.m22288i()).mo16332a(str5, String.valueOf(C11010c.m22286g())).mo16332a(str6, C11010c.m22295p()).f24561s = new C9051b() {
                /* renamed from: a */
                public final void mo16382a() {
                    C35857a.m81001b().mo74526a(new RheaTraceUploadTask()).mo74527a();
                }
            };
            if (TextUtils.equals(C11010c.m22295p(), "local_test")) {
                aVar.f24562t = new C35984k(context);
            }
            Context a4 = C11010c.m22280a();
            aVar.f24558p = new DefaultTTNetImpl();
            aVar.f24557o = new C8989b() {
                /* renamed from: b */
                public final String mo16302b() {
                    return C11063e.m22389a();
                }

                /* renamed from: a */
                public final Map<String, String> mo16301a() {
                    HashMap hashMap = new HashMap();
                    NetUtil.putCommonParams(hashMap, true);
                    return hashMap;
                }

                /* renamed from: c */
                public final long mo16303c() {
                    String curUserId = AccountService.createIAccountServicebyMonsterPlugin().userService().getCurUserId();
                    if (TextUtils.isEmpty(curUserId)) {
                        return 0;
                    }
                    return Long.valueOf(curUserId).longValue();
                }
            };
            C23569o.m57774a(a4, aVar);
            C19034d.m46317a((C19035a) new C19035a(a4, aVar) {

                /* renamed from: a */
                final /* synthetic */ Context f61551a;

                /* renamed from: b */
                final /* synthetic */ C9009a f61552b;

                public final void onDidLoadLocally(boolean z) {
                }

                public final void onRemoteConfigUpdate(boolean z, boolean z2) {
                }

                {
                    this.f61551a = r1;
                    this.f61552b = r2;
                }

                public final void onDeviceRegistrationInfoChanged(String str, String str2) {
                    if (AppLog.getHeaderCopy() != null) {
                        C23569o.m57774a(this.f61551a, this.f61552b);
                    }
                }
            });
            NetworkUtils.setMonitorProcessHook(C23131p.f61550a);
        }
    }

    static final /* synthetic */ void lambda$run$1$MonitorInitTask(Context context, String str, String str2, JSONObject jSONObject) {
        if (C38542b.m85881a() && TextUtils.equals("page_load", str2)) {
            StringBuilder sb = new StringBuilder();
            try {
                String string = jSONObject.getJSONObject("extra_status").getString("scene");
                String substring = string.substring(string.lastIndexOf(46));
                sb.append("Activity: ");
                sb.append(substring);
                sb.append("\n");
                JSONObject jSONObject2 = jSONObject.getJSONObject("extra_values");
                Iterator keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String str3 = (String) keys.next();
                    sb.append(str3);
                    sb.append(": ");
                    sb.append(jSONObject2.getInt(str3));
                    sb.append("\n");
                }
                sb.deleteCharAt(sb.lastIndexOf("\n"));
            } catch (Exception unused) {
            }
            C1667a.m5940a().mo6139a(new C35985l(context, sb));
        }
    }
}
