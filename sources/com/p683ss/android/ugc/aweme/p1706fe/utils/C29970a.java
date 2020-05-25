package com.p683ss.android.ugc.aweme.p1706fe.utils;

import android.app.Activity;
import android.content.Context;
import com.bytedance.common.utility.C9431p;
import com.bytedance.ies.uikit.base.AbsActivity;
import com.p683ss.android.common.util.C18922i;
import com.p683ss.android.newmedia.p1196b.C19543a;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.fe.utils.a */
public final class C29970a {
    /* renamed from: a */
    public static void m70114a(Context context, JSONObject jSONObject) {
        Context context2;
        try {
            if (context instanceof Activity) {
                context2 = (Activity) context;
            } else {
                context2 = null;
            }
            if (context2 != null) {
                if (!(context2 instanceof AbsActivity) || ((AbsActivity) context2).isActive()) {
                    String optString = jSONObject.optString("type");
                    if (!C9431p.m18664a(optString) && optString.indexOf(58) < 0) {
                        StringBuilder sb = new StringBuilder("sslocal://");
                        sb.append(optString);
                        C18922i iVar = new C18922i(sb.toString());
                        m70115a(jSONObject.optJSONObject("args"), iVar);
                        C19543a.m47830a(context2, iVar.mo38774a(), null);
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    private static void m70115a(JSONObject jSONObject, C18922i iVar) throws JSONException {
        if (jSONObject != null && jSONObject.length() > 0) {
            Iterator keys = jSONObject.keys();
            while (keys.hasNext()) {
                String str = (String) keys.next();
                Object obj = jSONObject.get(str);
                if (obj instanceof Integer) {
                    iVar.mo38776a(str, ((Integer) obj).intValue());
                } else if (obj instanceof Long) {
                    iVar.mo38777a(str, ((Long) obj).longValue());
                } else if (obj instanceof Double) {
                    iVar.mo38775a(str, ((Double) obj).doubleValue());
                } else if (obj instanceof String) {
                    iVar.mo38778a(str, (String) obj);
                } else if (obj instanceof JSONObject) {
                    m70115a((JSONObject) obj, iVar);
                }
            }
        }
    }
}
