package com.bytedance.apm.impl;

import android.text.TextUtils;
import com.bytedance.apm.C8976c;
import com.bytedance.apm.p480f.p483c.C9027a;
import com.bytedance.apm.p485h.C9039a;
import com.bytedance.apm.p485h.C9042d;
import com.bytedance.apm.p493m.C9131b;
import com.bytedance.apm.p501q.C9190h;
import com.bytedance.frameworks.core.apm.C9926a;
import com.bytedance.frameworks.core.apm.C9937b;
import com.bytedance.frameworks.core.apm.p578a.p579a.C9932a;
import com.bytedance.services.apm.api.C13224g;
import com.bytedance.services.apm.api.IMonitorLogManager;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public class MonitorLogManagerImpl implements IMonitorLogManager {
    public List<JSONObject> getRecentUiActionRecords() {
        return C9027a.m17890a().f24627a.f25054a;
    }

    private static C9932a<? extends C9042d> getLogStoreByType(String str) {
        if (TextUtils.equals(str, "api_all")) {
            return C9937b.m19972a().mo17904a(C9039a.class);
        }
        return C9937b.m19972a().mo17904a(C9042d.class);
    }

    public void deleteLegacyLogByIds(String str, String str2) {
        C9932a logStoreByType = getLogStoreByType(str);
        if (logStoreByType != null) {
            logStoreByType.mo17890a(str2);
        }
    }

    private static String packLog(JSONArray jSONArray, long j) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("data", jSONArray);
            JSONObject i = C8976c.m17753i();
            if (i != null) {
                JSONObject a = C9131b.m18119a(new JSONObject(i.toString()), C9926a.m19912a().mo17871a(j));
                a.put("debug_fetch", 1);
                jSONObject.put("header", a);
                return jSONObject.toString();
            }
        } catch (Exception unused) {
        }
        return "";
    }

    public void getLegacyLog(long j, long j2, String str, C13224g gVar) {
        if (gVar != null && !TextUtils.isEmpty(str)) {
            C9932a logStoreByType = getLogStoreByType(str);
            if (logStoreByType != null) {
                List a = logStoreByType.mo17892a(j, j2, str, "0,100");
                if (!C9190h.m18253a(a)) {
                    Iterator it = a.iterator();
                    JSONArray jSONArray = new JSONArray();
                    LinkedList linkedList = new LinkedList();
                    long j3 = -1;
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        try {
                            C9042d dVar = (C9042d) it.next();
                            if (j3 != -1) {
                                if (dVar.f24685j != j3) {
                                    break;
                                }
                            } else {
                                j3 = dVar.f24685j;
                            }
                            jSONArray.put(dVar.f24684i);
                            linkedList.add(Long.valueOf(dVar.f24681f));
                        } catch (Exception unused) {
                        }
                    }
                    packLog(jSONArray, j3);
                    C9190h.m18251a(linkedList, ",");
                }
            }
        }
    }
}
