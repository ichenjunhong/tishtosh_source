package com.p683ss.android.sdk.p1207a;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.text.TextUtils;
import com.bytedance.common.utility.p525e.C9402b;
import com.p683ss.android.ugc.aweme.C20842a;
import com.p683ss.android.ugc.aweme.keva.C35807d;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.sdk.a.b */
public final class C19718b {

    /* renamed from: c */
    private static volatile C19718b f54288c = new C19718b();

    /* renamed from: a */
    public final C19719c[] f54289a = C19719c.f54292a;

    /* renamed from: b */
    public final C19719c[] f54290b = C19719c.f54293b;

    /* renamed from: d */
    private boolean f54291d;

    /* renamed from: a */
    public static C19718b m48210a() {
        return f54288c;
    }

    private C19718b() {
    }

    /* renamed from: b */
    public final boolean mo41124b() {
        m48211b(C20842a.f56783a);
        for (C19719c cVar : this.f54290b) {
            if (cVar.f54307p) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo41123a(String str) {
        C19719c[] cVarArr;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        m48211b(C20842a.f56783a);
        for (C19719c cVar : this.f54289a) {
            if (cVar.f54307p && !TextUtils.isEmpty(cVar.f54304m) && cVar.f54304m.contains(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void mo41122a(Context context) {
        C19719c[] cVarArr;
        C19719c[] cVarArr2;
        if (context != null) {
            JSONObject jSONObject = new JSONObject();
            for (C19719c cVar : this.f54290b) {
                if (cVar.f54313v > 0) {
                    try {
                        jSONObject.put(cVar.f54304m, cVar.f54313v);
                    } catch (JSONException unused) {
                    }
                }
            }
            StringBuilder sb = new StringBuilder();
            boolean z = true;
            for (C19719c cVar2 : this.f54290b) {
                if (cVar2.f54307p) {
                    if (!z) {
                        sb.append(",");
                    }
                    sb.append(cVar2.f54304m);
                    z = false;
                }
            }
            String sb2 = sb.toString();
            Editor edit = C35807d.m80935a(context, "com.ss.spipe_setting", 0).edit();
            edit.putString("expire_platforms", jSONObject.toString());
            edit.putString("bind_platforms", sb2);
            C9402b.m18594a(edit);
        }
    }

    /* renamed from: b */
    private void m48211b(Context context) {
        JSONObject jSONObject;
        C19719c[] cVarArr;
        C19719c[] cVarArr2;
        if (!this.f54291d && context != null) {
            this.f54291d = true;
            SharedPreferences a = C35807d.m80935a(context, "com.ss.spipe_setting", 0);
            try {
                HashMap hashMap = new HashMap();
                String string = a.getString("expire_platforms", null);
                String string2 = a.getString("bind_platforms", "");
                if (TextUtils.isEmpty(string)) {
                    jSONObject = new JSONObject();
                } else {
                    jSONObject = new JSONObject(string);
                }
                for (C19719c cVar : this.f54290b) {
                    if (!jSONObject.isNull(cVar.f54304m)) {
                        cVar.f54313v = jSONObject.optLong(cVar.f54304m, -1);
                    }
                }
                hashMap.clear();
                if (!TextUtils.isEmpty(string2)) {
                    String[] split = string2.split(",");
                    if (split != null && split.length > 0) {
                        for (String str : split) {
                            hashMap.put(str, str);
                        }
                        for (C19719c cVar2 : this.f54290b) {
                            if (hashMap.containsKey(cVar2.f54304m)) {
                                cVar2.f54307p = true;
                            }
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }
    }
}
