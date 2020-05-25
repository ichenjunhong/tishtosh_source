package com.p683ss.android.ugc.aweme.report.p2113a;

import com.bytedance.apm.C8936b;
import java.util.Map.Entry;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.report.a.c */
final /* synthetic */ class C41206c implements Runnable {

    /* renamed from: a */
    private final C41202a f104646a;

    C41206c(C41202a aVar) {
        this.f104646a = aVar;
    }

    public final void run() {
        C41202a aVar = this.f104646a;
        StringBuilder sb = new StringBuilder();
        for (Entry entry : aVar.f104641a.entrySet()) {
            sb.append(entry.getKey());
            sb.append(" ");
            sb.append(entry.getValue());
            sb.append("\n");
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("coverage_count", sb.toString());
            C8936b.m17655a("code_coverage", jSONObject);
        } catch (JSONException unused) {
        }
        aVar.f104641a.clear();
    }
}
