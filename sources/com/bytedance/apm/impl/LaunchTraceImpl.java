package com.bytedance.apm.impl;

import android.text.TextUtils;
import com.bytedance.apm.C8936b;
import com.bytedance.apm.C8976c;
import com.bytedance.apm.agent.tracing.AutoLaunchTraceHelper;
import com.bytedance.apm.p485h.C9045g;
import com.bytedance.apm.p497o.C9149b;
import com.bytedance.apm.p498p.C9171b;
import com.bytedance.apm.p498p.C9177e;
import com.bytedance.apm.p501q.C9192i;
import com.bytedance.services.apm.api.ILaunchTrace;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import leakcanary.internal.LeakCanaryFileProvider;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class LaunchTraceImpl implements ILaunchTrace {
    public void cancelTrace() {
        if (C9171b.f25118a != null) {
            C9171b.f25118a.f25141c.clear();
            C9171b.f25118a = null;
        }
    }

    public void startTrace() {
        C9171b.f25119b = true;
        C9177e eVar = new C9177e("start_trace", "launch_stats");
        C9171b.f25118a = eVar;
        eVar.f25139a = System.currentTimeMillis();
        C8976c.m17746b(eVar.f25139a);
        C8976c.m17746b(System.currentTimeMillis());
    }

    public void endSpan(String str, String str2) {
        if (C9171b.f25118a != null) {
            C9177e eVar = C9171b.f25118a;
            ConcurrentHashMap<String, C9045g> concurrentHashMap = eVar.f25141c;
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("#");
            sb.append(str2);
            C9045g gVar = (C9045g) concurrentHashMap.get(sb.toString());
            if (gVar != null) {
                long currentTimeMillis = System.currentTimeMillis();
                String name = Thread.currentThread().getName();
                gVar.f24696b = currentTimeMillis;
                gVar.f24697c = name;
                ConcurrentHashMap<String, C9045g> concurrentHashMap2 = eVar.f25141c;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append("#");
                sb2.append(str2);
                concurrentHashMap2.put(sb2.toString(), gVar);
            }
        }
    }

    public void startSpan(String str, String str2) {
        if (C9171b.f25118a != null) {
            C9177e eVar = C9171b.f25118a;
            ConcurrentHashMap<String, C9045g> concurrentHashMap = eVar.f25141c;
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("#");
            sb.append(str2);
            if (((C9045g) concurrentHashMap.get(sb.toString())) == null) {
                C9045g gVar = new C9045g(System.currentTimeMillis());
                ConcurrentHashMap<String, C9045g> concurrentHashMap2 = eVar.f25141c;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append("#");
                sb2.append(str2);
                concurrentHashMap2.put(sb2.toString(), gVar);
            }
        }
    }

    public void endTrace(int i, String str, long j) {
        if (C9171b.f25118a != null) {
            C9177e eVar = C9171b.f25118a;
            eVar.f25140b = System.currentTimeMillis();
            long j2 = eVar.f25140b - eVar.f25139a;
            if (j <= 0 || j2 <= j) {
                C9149b.m18170a().mo16524a((Runnable) new Runnable(i, str) {

                    /* renamed from: a */
                    final /* synthetic */ int f25144a;

                    /* renamed from: b */
                    final /* synthetic */ String f25145b;

                    public final void run() {
                        C9177e eVar = C9177e.this;
                        int i = this.f25144a;
                        String str = this.f25145b;
                        long j = C9177e.this.f25140b;
                        JSONArray jSONArray = new JSONArray();
                        try {
                            if (TextUtils.equals(str, AutoLaunchTraceHelper.sLauncherActivityName)) {
                                jSONArray = AutoLaunchTraceHelper.assemblySpan();
                            }
                            if (eVar.f25141c != null && !eVar.f25141c.isEmpty()) {
                                for (Entry entry : eVar.f25141c.entrySet()) {
                                    String str2 = (String) entry.getKey();
                                    C9045g gVar = (C9045g) entry.getValue();
                                    JSONObject jSONObject = new JSONObject();
                                    String[] split = str2.split("#");
                                    if (split.length == 2) {
                                        if ("page_load_trace".equals(eVar.f25142d)) {
                                            jSONObject.put(LeakCanaryFileProvider.f132049i, split[1]);
                                        } else {
                                            jSONObject.put("module_name", split[0]);
                                            jSONObject.put("span_name", split[1]);
                                        }
                                    } else if (split.length == 1) {
                                        jSONObject.put("span_name", split[0]);
                                    }
                                    jSONObject.put("start", gVar.f24695a);
                                    jSONObject.put("end", gVar.f24696b);
                                    jSONObject.put("thread", gVar.f24697c);
                                    jSONArray.put(jSONObject);
                                }
                            }
                        } catch (JSONException unused) {
                        }
                        JSONObject jSONObject2 = new JSONObject();
                        try {
                            jSONObject2.put(LeakCanaryFileProvider.f132049i, eVar.f25143e);
                            jSONObject2.put("page_type", eVar.f25143e);
                            jSONObject2.put("start", eVar.f25139a);
                            jSONObject2.put("end", j);
                            jSONObject2.put("spans", jSONArray);
                            jSONObject2.put("launch_mode", i);
                            jSONObject2.put("collect_from", 2);
                            jSONObject2.put("page_name", str);
                        } catch (JSONException unused2) {
                        }
                        JSONObject jSONObject3 = new JSONObject();
                        try {
                            jSONObject3.put("trace", jSONObject2);
                        } catch (JSONException unused3) {
                        }
                        if (eVar.f25141c != null) {
                            eVar.f25141c.clear();
                        }
                        if (C8976c.m17751g()) {
                            StringBuilder sb = new StringBuilder("reportAsync: ");
                            sb.append(jSONObject3);
                            C9192i.m18257a("AppStartStats", sb.toString());
                        }
                        C8936b.m17660b(eVar.f25142d, null, null, jSONObject3);
                    }

                    {
                        this.f25144a = r2;
                        this.f25145b = r3;
                    }
                });
            }
        }
    }
}
