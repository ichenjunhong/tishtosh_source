package com.p683ss.ttvideoengine.setting;

import android.content.Context;
import com.bytedance.p836s.C12821a;
import com.bytedance.p836s.C12824b;
import com.bytedance.p836s.C12825c;
import com.p683ss.ttvideoengine.utils.TTVideoEngineLog;
import java.util.HashMap;
import org.json.JSONException;

/* renamed from: com.ss.ttvideoengine.setting.TTVideoEngineSettingManager */
public class TTVideoEngineSettingManager implements C12824b {
    public static String TAG = "TTVideo";
    private static TTVideoEngineSettingManager instance;
    private C12821a fetchSettingManager = C12821a.m25725a(this.mContext);
    private Context mContext;
    public TTVideoEngineSettingModel settingModel;
    private C12825c settingsManager;

    public void loadFetchConfig(HashMap<String, Object> hashMap) {
        HashMap<String, Object> hashMap2 = new HashMap<>();
        hashMap2.put(C12821a.f33564b, hashMap);
        this.fetchSettingManager.f33568c = hashMap2;
    }

    public void oNotify(int i) {
        if (i == 0) {
            this.settingModel.tryUpdateSetting(this.settingsManager.f33579b);
        }
    }

    public static synchronized TTVideoEngineSettingManager getInstance(Context context) {
        TTVideoEngineSettingManager tTVideoEngineSettingManager;
        synchronized (TTVideoEngineSettingManager.class) {
            if (instance == null) {
                instance = new TTVideoEngineSettingManager(context);
            }
            tTVideoEngineSettingManager = instance;
        }
        return tTVideoEngineSettingManager;
    }

    private TTVideoEngineSettingManager(Context context) {
        this.mContext = context;
        try {
            this.settingModel = new TTVideoEngineSettingModel(this.mContext);
            this.settingsManager = C12825c.m25728a(this.mContext);
            this.settingsManager.f33584h = false;
            C12825c cVar = this.settingsManager;
            cVar.f33582f.writeLock().lock();
            cVar.f33583g.add(this);
            cVar.f33582f.writeLock().unlock();
        } catch (JSONException e) {
            TTVideoEngineLog.m110645d(e);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0066  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void startFetchSettingisForce(boolean r13) {
        /*
            r12 = this;
            com.bytedance.s.a r0 = r12.fetchSettingManager
            r1 = 0
            r0.f33571f = r1
            com.bytedance.s.a r0 = r12.fetchSettingManager
            r0.f33569d = r1
            if (r13 == 0) goto L_0x000f
            r0.mo24288a()
            return
        L_0x000f:
            long r1 = java.lang.System.currentTimeMillis()
            android.content.Context r13 = r0.f33570e
            android.content.Context r13 = r13.getApplicationContext()
            java.lang.String r3 = com.bytedance.p836s.C12821a.f33563a
            android.content.SharedPreferences r13 = com.bytedance.p836s.C12826d.m25730a(r13)
            r4 = 0
            long r6 = r13.getLong(r3, r4)
            r8 = 86400(0x15180, double:4.26873E-319)
            android.content.Context r13 = r0.f33570e     // Catch:{ JSONException -> 0x0055 }
            com.bytedance.p836s.C12825c.m25728a(r13)     // Catch:{ JSONException -> 0x0055 }
            android.content.Context r13 = r0.f33570e     // Catch:{ JSONException -> 0x0055 }
            android.content.Context r13 = r13.getApplicationContext()     // Catch:{ JSONException -> 0x0055 }
            java.lang.String r3 = com.bytedance.p836s.C12821a.f33565g     // Catch:{ JSONException -> 0x0055 }
            java.lang.String r13 = com.bytedance.p836s.C12826d.m25732a(r13, r3)     // Catch:{ JSONException -> 0x0055 }
            if (r13 == 0) goto L_0x0055
            boolean r3 = r13.isEmpty()     // Catch:{ JSONException -> 0x0055 }
            if (r3 != 0) goto L_0x0055
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0055 }
            r3.<init>(r13)     // Catch:{ JSONException -> 0x0055 }
            java.lang.String r13 = com.bytedance.p836s.C12821a.f33566h     // Catch:{ JSONException -> 0x0055 }
            boolean r13 = r3.isNull(r13)     // Catch:{ JSONException -> 0x0055 }
            if (r13 != 0) goto L_0x0055
            java.lang.String r13 = com.bytedance.p836s.C12821a.f33566h     // Catch:{ JSONException -> 0x0055 }
            long r10 = r3.getLong(r13)     // Catch:{ JSONException -> 0x0055 }
            goto L_0x0056
        L_0x0055:
            r10 = r8
        L_0x0056:
            int r13 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r13 >= 0) goto L_0x005b
            goto L_0x005c
        L_0x005b:
            r8 = r10
        L_0x005c:
            r13 = 0
            long r1 = r1 - r6
            r3 = 1000(0x3e8, double:4.94E-321)
            long r8 = r8 * r3
            int r13 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r13 <= 0) goto L_0x0069
            r0.mo24288a()
        L_0x0069:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.ttvideoengine.setting.TTVideoEngineSettingManager.startFetchSettingisForce(boolean):void");
    }
}
