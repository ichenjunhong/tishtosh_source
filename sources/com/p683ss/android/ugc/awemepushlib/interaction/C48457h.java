package com.p683ss.android.ugc.awemepushlib.interaction;

import android.content.Context;
import com.bytedance.common.utility.C9431p;
import com.bytedance.ies.ugc.statisticlogger.C11049a;
import com.p683ss.android.common.applog.AppLog;
import com.p683ss.android.common.p1146d.C18894a;
import com.p683ss.android.newmedia.redbadge.C19592b;
import com.p683ss.android.pushmanager.client.C19688b;
import com.p683ss.android.pushmanager.client.C19697g;
import com.p683ss.android.pushmanager.setting.C19710b;
import com.p683ss.android.ugc.awemepushlib.manager.C48479a;
import com.p683ss.android.ugc.awemepushlib.manager.C48481c;
import com.p683ss.android.ugc.awemepushlib.p2408c.C48432a;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.awemepushlib.interaction.h */
final /* synthetic */ class C48457h implements Runnable {

    /* renamed from: a */
    private final Context f121831a;

    C48457h(Context context) {
        this.f121831a = context;
    }

    public final void run() {
        Context context = this.f121831a;
        C48479a a = C48479a.m104895a();
        if (!C9431p.m18664a(C11049a.m22366b()) && !C9431p.m18664a(C11049a.m22367c())) {
            C19697g.m48105a();
            C19697g.m48106a(context, a.mo95946d());
            C19697g.m48105a();
            C19697g.m48108b(context, a.mo95940a(context));
            C19697g.m48105a();
            C19710b.m48173a().mo41090a(C19710b.m48173a().mo41104n());
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("port", AppLog.getHttpMonitorPort());
                C18894a.m46006a("http_monitor_port_ug", jSONObject);
            } catch (Throwable unused) {
            }
            Map a2 = C48444c.m104835a();
            if (!C48432a.m104796a(a2)) {
                C48432a.m104792a((Runnable) new C48481c(context, a2));
            }
            C19688b.m48089a(context);
            C19592b.m47911a(context).mo40832c();
        }
        System.out.println();
    }
}
