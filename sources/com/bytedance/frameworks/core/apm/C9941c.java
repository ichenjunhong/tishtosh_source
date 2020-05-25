package com.bytedance.frameworks.core.apm;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.apm.C8976c;
import com.bytedance.news.common.service.manager.C12401c;
import com.bytedance.services.apm.api.IApmAgent;
import com.p683ss.android.ugc.aweme.account.task.FbUploadTokenTime;
import java.io.File;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.frameworks.core.apm.c */
public final class C9941c {

    /* renamed from: a */
    public static final Map<String, HashSet<C9944d>> f27025a = new HashMap();

    /* renamed from: b */
    public static C9943a f27026b = new C9943a() {
        /* renamed from: b */
        public final int mo16361b() {
            return 5;
        }

        /* renamed from: c */
        public final int mo16362c() {
            return 80;
        }
    };

    /* renamed from: c */
    private static long f27027c = -1;

    /* renamed from: com.bytedance.frameworks.core.apm.c$a */
    public interface C9943a {
        /* renamed from: b */
        int mo16361b();

        /* renamed from: c */
        int mo16362c();
    }

    /* renamed from: a */
    public static void m19976a() {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - f27027c >= 3600000) {
            JSONObject jSONObject = new JSONObject();
            Iterator it = f27025a.entrySet().iterator();
            while (it.hasNext()) {
                Entry entry = (Entry) it.next();
                if (!TextUtils.isEmpty((CharSequence) entry.getKey())) {
                    File file = new File((String) entry.getKey());
                    if (file.exists()) {
                        HashSet hashSet = (HashSet) entry.getValue();
                        long length = file.length();
                        long c = ((long) f27026b.mo16362c()) * 1024 * 1024;
                        int b = f27026b.mo16361b();
                        try {
                            jSONObject.put("before_size", length);
                            Iterator it2 = hashSet.iterator();
                            while (it2.hasNext()) {
                                C9944d dVar = (C9944d) it2.next();
                                StringBuilder sb = new StringBuilder("before_count_");
                                sb.append(dVar.mo17877a());
                                jSONObject.put(sb.toString(), dVar.mo17881b());
                            }
                        } catch (JSONException unused) {
                        }
                        Iterator it3 = hashSet.iterator();
                        while (it3.hasNext()) {
                            JSONObject jSONObject2 = jSONObject;
                            Iterator it4 = it;
                            ((C9944d) it3.next()).mo17879a(currentTimeMillis - (((long) b) * FbUploadTokenTime.group0));
                            jSONObject = jSONObject2;
                            it = it4;
                        }
                        JSONObject jSONObject3 = jSONObject;
                        Iterator it5 = it;
                        if (length > c) {
                            do {
                                b--;
                                Iterator it6 = hashSet.iterator();
                                while (it6.hasNext()) {
                                    ((C9944d) it6.next()).mo17879a(currentTimeMillis - (((long) b) * FbUploadTokenTime.group0));
                                }
                                length = file.length();
                                if (length < c) {
                                    break;
                                }
                            } while (b > 1);
                        }
                        JSONObject jSONObject4 = jSONObject3;
                        try {
                            jSONObject4.put("after_size", length);
                            Iterator it7 = hashSet.iterator();
                            while (it7.hasNext()) {
                                C9944d dVar2 = (C9944d) it7.next();
                                StringBuilder sb2 = new StringBuilder("after_count_");
                                sb2.append(dVar2.mo17877a());
                                jSONObject4.put(sb2.toString(), dVar2.mo17881b());
                            }
                        } catch (JSONException unused2) {
                        }
                        jSONObject = jSONObject4;
                        it = it5;
                    }
                }
            }
            JSONObject jSONObject5 = jSONObject;
            IApmAgent iApmAgent = (IApmAgent) C12401c.m24975a(IApmAgent.class);
            if (iApmAgent != null) {
                iApmAgent.monitorEvent("apm_db_size", null, jSONObject5, null);
            }
            m19977a("special_monitor_v2");
            m19977a("default_ss_local_monitor");
            m19977a("ss_local_monitor");
            m19977a("ss_app_monitor");
            f27027c = currentTimeMillis;
        }
    }

    /* renamed from: a */
    private static void m19977a(String str) {
        try {
            Context a = C8976c.m17736a();
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(".db");
            File databasePath = a.getDatabasePath(sb.toString());
            if (databasePath.exists()) {
                databasePath.delete();
            }
        } catch (Exception unused) {
        }
    }
}
