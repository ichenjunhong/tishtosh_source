package com.p683ss.android.ugc.aweme.requesttask.idle;

import android.content.Context;
import android.os.Bundle;
import com.p683ss.android.ugc.aweme.base.C23569o;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.lego.C35894d;
import com.p683ss.android.ugc.aweme.lego.C35896f;
import com.p683ss.android.ugc.aweme.lego.C35898h;
import com.p683ss.android.ugc.aweme.lego.LegoTask;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.requesttask.idle.ReportActivityStatusTask */
public final class ReportActivityStatusTask implements LegoTask {
    private final Bundle savedInstanceState;
    private final String tag;

    public final Bundle getSavedInstanceState() {
        return this.savedInstanceState;
    }

    public final String getTag() {
        return this.tag;
    }

    public final C35896f process() {
        return C35894d.m81063a(this);
    }

    public final C35898h type() {
        return C35898h.SPARSE;
    }

    public final void run(Context context) {
        boolean z;
        String str = this.tag;
        if (this.savedInstanceState != null) {
            z = true;
        } else {
            z = false;
        }
        C41262k kVar = new C41262k(str, z);
        try {
            String str2 = kVar.f104702a;
            StringBuilder sb = new StringBuilder("活动被系统回收 or config change:");
            sb.append(kVar.f104703b);
            C32458a.m75141a(4, str2, sb.toString());
            boolean z2 = kVar.f104703b;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("activity", kVar.f104702a);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(kVar.f104703b);
            jSONObject.put("activity_status", sb2.toString());
            C23569o.m57776a("activity_monitor", z2 ? 1 : 0, jSONObject);
        } catch (Throwable th) {
            C32458a.m75148a(th);
        }
    }

    public ReportActivityStatusTask(String str, Bundle bundle) {
        C52711k.m112240b(str, "tag");
        this.tag = str;
        this.savedInstanceState = bundle;
    }
}
