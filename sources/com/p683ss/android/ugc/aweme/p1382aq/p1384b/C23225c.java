package com.p683ss.android.ugc.aweme.p1382aq.p1384b;

import android.content.Context;
import com.p683ss.android.common.applog.AppLog;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.aq.b.c */
final /* synthetic */ class C23225c implements Callable {

    /* renamed from: a */
    private final String f61968a;

    /* renamed from: b */
    private final String f61969b;

    /* renamed from: c */
    private final String f61970c;

    /* renamed from: d */
    private final Context f61971d;

    C23225c(String str, String str2, String str3, Context context) {
        this.f61968a = str;
        this.f61969b = str2;
        this.f61970c = str3;
        this.f61971d = context;
    }

    public final Object call() {
        String str = this.f61968a;
        String str2 = this.f61969b;
        String str3 = this.f61970c;
        Context context = this.f61971d;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("event", str);
        jSONObject.put("label", str2);
        jSONObject.put("session_id", str3);
        jSONObject.put("scene", "low_retain");
        jSONObject.put("local_time", System.currentTimeMillis() / 1000);
        AppLog.recordMiscLog(context, "app_perf", jSONObject);
        return null;
    }
}
