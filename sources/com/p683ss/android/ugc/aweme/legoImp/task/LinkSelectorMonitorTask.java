package com.p683ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import com.google.p1067c.p1068a.p1069a.p1070a.p1071a.C17840a;
import com.p683ss.android.linkselector.LinkSelector;
import com.p683ss.android.linkselector.p1177c.C19203a;
import com.p683ss.android.linkselector.p1177c.C19204b;
import com.p683ss.android.linkselector.p1177c.C19205c;
import com.p683ss.android.ugc.aweme.app.C23131p;
import com.p683ss.android.ugc.aweme.lego.C35894d;
import com.p683ss.android.ugc.aweme.lego.C35896f;
import com.p683ss.android.ugc.aweme.lego.C35898h;
import com.p683ss.android.ugc.aweme.lego.LegoTask;
import java.io.PrintWriter;
import java.io.StringWriter;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.LinkSelectorMonitorTask */
public class LinkSelectorMonitorTask implements LegoTask {
    public C35896f process() {
        return C35894d.m81063a(this);
    }

    public C35898h type() {
        return C35898h.BOOT_FINISH;
    }

    public void run(Context context) {
        LinkSelector.m46790a().f52904e = new C19203a() {
            /* renamed from: a */
            public final void mo39197a(C19204b bVar) {
                String str;
                if (bVar.f52922a == 0 && (bVar.f52923b instanceof C19205c)) {
                    C19205c cVar = (C19205c) bVar.f52923b;
                    if (!cVar.f52931h) {
                        C23131p.m57781b(cVar.f52927d, cVar.f52928e, cVar.f52924a, null, cVar.f52929f, cVar.f52926c, null);
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("duration", cVar.f52927d);
                            jSONObject.put("sendTime", cVar.f52928e);
                            jSONObject.put("url", cVar.f52924a);
                            jSONObject.put("traceCode", cVar.f52929f);
                            jSONObject.put("status", cVar.f52926c);
                            String str2 = "exception";
                            Exception exc = cVar.f52930g;
                            if (exc == null) {
                                str = "";
                            } else {
                                StringWriter stringWriter = new StringWriter();
                                C17840a.m43751a((Throwable) exc, new PrintWriter(stringWriter));
                                str = stringWriter.toString();
                            }
                            jSONObject.put(str2, str);
                        } catch (JSONException unused) {
                        }
                        C23131p.m57779a("link_selector_e", jSONObject);
                    }
                    C23131p.m57773a(cVar.f52927d, cVar.f52928e, cVar.f52924a, null, cVar.f52929f, cVar.f52926c, null);
                }
            }
        };
    }
}
