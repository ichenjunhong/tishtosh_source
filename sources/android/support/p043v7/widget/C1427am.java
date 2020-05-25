package android.support.p043v7.widget;

import android.support.p043v7.widget.RecyclerView.C1343o;
import android.support.p043v7.widget.RecyclerView.C1352v;
import com.p683ss.android.ugc.aweme.app.C23131p;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: android.support.v7.widget.am */
final class C1427am {
    /* renamed from: a */
    static C1352v m4955a(C1343o oVar, int i, boolean z, long j) {
        try {
            return oVar.mo5095b(i, z, j);
        } catch (IndexOutOfBoundsException e) {
            JSONObject jSONObject = new JSONObject();
            try {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("error", e.toString());
                jSONObject.put("success", 1);
                jSONObject.put("errorResponse", jSONObject2.toString());
            } catch (JSONException unused) {
            }
            C23131p.m57779a("aweme_profile_recyclerview_crash_log", jSONObject);
            C32458a.m75143a((Exception) e);
            return null;
        }
    }
}
