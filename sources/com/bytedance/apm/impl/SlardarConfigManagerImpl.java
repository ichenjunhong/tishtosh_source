package com.bytedance.apm.impl;

import android.text.TextUtils;
import com.bytedance.apm.C8976c;
import com.bytedance.apm.core.C8990c;
import com.bytedance.apm.core.C8991d;
import com.bytedance.apm.p493m.C9139c;
import com.bytedance.apm.p501q.C9190h;
import com.bytedance.services.slardar.config.C13226a;
import com.bytedance.services.slardar.config.C13227b;
import com.bytedance.services.slardar.config.IConfigManager;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

public class SlardarConfigManagerImpl implements IConfigManager {
    private C9055b mSlardarConfigFetcher = new C9055b();

    public JSONObject getConfig() {
        return this.mSlardarConfigFetcher.f24731i;
    }

    public boolean isConfigReady() {
        return this.mSlardarConfigFetcher.f24723a;
    }

    public String queryConfig() {
        return this.mSlardarConfigFetcher.mo16420a();
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void fetchConfig() {
        /*
            r8 = this;
            com.bytedance.apm.impl.b r0 = r8.mSlardarConfigFetcher
            java.lang.String r1 = r0.mo16420a()
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            r3 = 0
            r4 = 1
            if (r2 != 0) goto L_0x003c
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ Exception -> 0x0036 }
            r2.<init>(r1)     // Catch:{ Exception -> 0x0036 }
            r0.f24732j = r4     // Catch:{ Exception -> 0x0036 }
            android.content.SharedPreferences r1 = r0.f24729g     // Catch:{ Exception -> 0x0036 }
            java.lang.String r5 = "setting_version"
            int r1 = r1.getInt(r5, r3)     // Catch:{ Exception -> 0x0036 }
            r5 = 3
            if (r1 != r5) goto L_0x003c
            android.content.SharedPreferences r1 = r0.f24729g     // Catch:{ Exception -> 0x0036 }
            java.lang.String r5 = "monitor_configure_refresh_time"
            r6 = 0
            long r5 = r1.getLong(r5, r6)     // Catch:{ Exception -> 0x0036 }
            r0.f24733k = r5     // Catch:{ Exception -> 0x0036 }
            r0.mo16422a(r2)     // Catch:{ Exception -> 0x0036 }
            r0.mo16423a(r2, r4)     // Catch:{ Exception -> 0x0036 }
            r0.mo16425b()     // Catch:{ Exception -> 0x0036 }
            goto L_0x003d
        L_0x0036:
            java.lang.String[] r1 = new java.lang.String[r4]
            java.lang.String r2 = "配置信息读取失败"
            r1[r3] = r2
        L_0x003c:
            r3 = 1
        L_0x003d:
            boolean r1 = com.bytedance.apm.C8976c.m17747c()
            if (r1 == 0) goto L_0x0058
            long r1 = r0.f24733k
            long r5 = java.lang.System.currentTimeMillis()
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x004e
            r3 = 1
        L_0x004e:
            r0.mo16424a(r3)
            com.bytedance.apm.o.b r1 = com.bytedance.apm.p497o.C9149b.m18170a()
            r1.mo16523a(r0)
        L_0x0058:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.apm.impl.SlardarConfigManagerImpl.fetchConfig():void");
    }

    public JSONObject getConfigJSON(String str) {
        return this.mSlardarConfigFetcher.mo16421a(str);
    }

    public void unregisterConfigListener(C13226a aVar) {
        C9055b bVar = this.mSlardarConfigFetcher;
        if (aVar != null && bVar.f24734l != null) {
            bVar.f24734l.remove(aVar);
        }
    }

    public void unregisterResponseConfigListener(C13227b bVar) {
        C9139c a = C9139c.m18134a();
        if (bVar != null && a.f25022d != null) {
            a.f25022d.remove(bVar);
        }
    }

    public boolean getMetricTypeSwitch(String str) {
        C9055b bVar = this.mSlardarConfigFetcher;
        if (bVar.f24726d == null || TextUtils.isEmpty(str) || bVar.f24726d.optInt(str) != 1) {
            return false;
        }
        return true;
    }

    public boolean getServiceSwitch(String str) {
        C9055b bVar = this.mSlardarConfigFetcher;
        if (bVar.f24727e == null || TextUtils.isEmpty(str) || bVar.f24727e.optInt(str) != 1) {
            return false;
        }
        return true;
    }

    public boolean getSwitch(String str) {
        C9055b bVar = this.mSlardarConfigFetcher;
        if (TextUtils.isEmpty(str) || bVar.f24731i == null) {
            return false;
        }
        return bVar.f24731i.optBoolean(str);
    }

    public void registerResponseConfigListener(C13227b bVar) {
        C9139c a = C9139c.m18134a();
        if (bVar != null) {
            if (a.f25022d == null) {
                a.f25022d = new CopyOnWriteArrayList();
            }
            if (!a.f25022d.contains(bVar)) {
                a.f25022d.add(bVar);
            }
        }
    }

    public boolean getLogTypeSwitch(String str) {
        C9055b bVar = this.mSlardarConfigFetcher;
        if (bVar.f24725c == null || TextUtils.isEmpty(str)) {
            return false;
        }
        if (TextUtils.equals(str, "block_monitor")) {
            str = "caton_monitor";
        }
        if (TextUtils.equals(str, "core_exception_monitor")) {
            return bVar.f24724b;
        }
        if (bVar.f24725c.optInt(str) == 1) {
            return true;
        }
        return false;
    }

    public void registerConfigListener(C13226a aVar) {
        C9055b bVar = this.mSlardarConfigFetcher;
        if (aVar != null) {
            if (bVar.f24734l == null) {
                bVar.f24734l = new CopyOnWriteArrayList();
            }
            if (!bVar.f24734l.contains(aVar)) {
                bVar.f24734l.add(aVar);
            }
            if (bVar.f24723a) {
                aVar.mo16270a(bVar.f24731i, bVar.f24732j);
                aVar.mo16224e();
            }
        }
    }

    public int getConfigInt(String str, int i) {
        C9055b bVar = this.mSlardarConfigFetcher;
        if (TextUtils.isEmpty(str) || bVar.f24731i == null) {
            return i;
        }
        return bVar.f24731i.optInt(str, i);
    }

    public void initParams(C8990c cVar, List<String> list) {
        C9055b bVar = this.mSlardarConfigFetcher;
        bVar.f24729g = C8991d.m17797a(C8976c.m17736a(), "monitor_config");
        bVar.f24730h = cVar;
        if (!C9190h.m18253a(list)) {
            bVar.f24728f = C9055b.m17932a(list);
        }
    }

    public void forceUpdateFromRemote(C8990c cVar, List<String> list) {
        C9055b bVar = this.mSlardarConfigFetcher;
        if (bVar.f24729g == null) {
            bVar.f24729g = C8991d.m17797a(C8976c.m17736a(), "monitor_config");
        }
        if (cVar != null) {
            bVar.f24730h = cVar;
        }
        if (!C9190h.m18253a(list)) {
            bVar.f24728f = new ArrayList(list);
        }
        bVar.mo16424a(true);
    }
}
