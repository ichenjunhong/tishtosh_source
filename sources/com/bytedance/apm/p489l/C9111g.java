package com.bytedance.apm.p489l;

import com.bytedance.apm.p501q.C9185g;
import com.bytedance.news.common.service.manager.C12401c;
import com.bytedance.services.slardar.config.C13226a;
import com.bytedance.services.slardar.config.IConfigManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.l.g */
public final class C9111g implements C13226a {

    /* renamed from: a */
    private final Map<String, Boolean> f24919a;

    /* renamed from: b */
    private final Map<String, Boolean> f24920b;

    /* renamed from: c */
    private List<String> f24921c;

    /* renamed from: d */
    private List<String> f24922d;

    /* renamed from: e */
    private Map<String, String> f24923e;

    /* renamed from: f */
    private volatile JSONObject f24924f;

    /* renamed from: com.bytedance.apm.l.g$a */
    static class C9113a {

        /* renamed from: a */
        public static final C9111g f24925a = new C9111g();
    }

    /* renamed from: a */
    public static C9111g m18066a() {
        return C9113a.f24925a;
    }

    /* renamed from: e */
    public final void mo16224e() {
    }

    private C9111g() {
        this.f24919a = new ConcurrentHashMap();
        this.f24920b = new ConcurrentHashMap();
        this.f24923e = new HashMap();
        this.f24921c = new LinkedList();
        this.f24921c.addAll(Arrays.asList(new String[]{"battery", "smooth", "cpu", "disk", "memory", "thread", "fd", "page_load", "page_load_trace", "start", "start_trace", "traffic", "ui"}));
        this.f24922d = new ArrayList();
        this.f24922d.add("enable_upload");
        this.f24922d.add("drop_enable_upload");
        this.f24922d.add("serious_block_enable_upload");
        this.f24922d.add("block_enable_upload");
        this.f24922d.add("slow_method_enable_upload");
        this.f24923e.put("enable_upload", "fps");
        this.f24923e.put("drop_enable_upload", "fps_drop");
        this.f24923e.put("block_enable_upload", "block_monitor");
        this.f24923e.put("slow_method_enable_upload", "drop_frame_stack");
        this.f24923e.put("serious_block_enable_upload", "serious_block_monitor");
        ((IConfigManager) C12401c.m24975a(IConfigManager.class)).registerConfigListener(this);
    }

    /* renamed from: a */
    public final boolean mo16477a(String str) {
        Boolean bool = (Boolean) this.f24919a.get(str);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* renamed from: b */
    public final boolean mo16479b(String str) {
        Boolean bool = (Boolean) this.f24920b.get(str);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* renamed from: a */
    private void m18067a(JSONObject jSONObject) {
        if (jSONObject != null) {
            for (String str : this.f24922d) {
                try {
                    Map<String, Boolean> map = this.f24920b;
                    Object obj = this.f24923e.get(str);
                    boolean z = false;
                    if (jSONObject.optInt(str, 0) == 1) {
                        z = true;
                    }
                    map.put(obj, Boolean.valueOf(z));
                } catch (Exception unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public final boolean mo16478a(String str, String str2) {
        boolean z;
        Boolean bool = (Boolean) this.f24920b.get(str);
        if (this.f24924f == null || this.f24924f.optInt(str2) != 1) {
            z = false;
        } else {
            z = true;
        }
        if ((bool == null || !bool.booleanValue()) && !z) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo16270a(JSONObject jSONObject, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        if (jSONObject != null) {
            JSONObject optJSONObject = jSONObject.optJSONObject("performance_modules");
            if (optJSONObject != null) {
                for (String str : this.f24921c) {
                    JSONObject optJSONObject2 = optJSONObject.optJSONObject(str);
                    if ("smooth".equals(str)) {
                        m18067a(optJSONObject2);
                    } else {
                        if ("memory".equals(str) && optJSONObject2 != null) {
                            Map<String, Boolean> map = this.f24920b;
                            String str2 = "memory_object_monitor";
                            if (optJSONObject2.optInt("memory_object_monitor", 0) == 1) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            map.put(str2, Boolean.valueOf(z5));
                        }
                        if ("battery".equals(str) && optJSONObject2 != null) {
                            Map<String, Boolean> map2 = this.f24920b;
                            String str3 = "temperature";
                            if (optJSONObject2.optInt("temperature_enable_upload", 0) == 1) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            map2.put(str3, Boolean.valueOf(z3));
                            Map<String, Boolean> map3 = this.f24920b;
                            String str4 = "battery_trace";
                            if (optJSONObject2.optInt("exception_enable_upload", 0) == 1) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            map3.put(str4, Boolean.valueOf(z4));
                        }
                        if ("cpu".equals(str) && optJSONObject2 != null) {
                            Map<String, Boolean> map4 = this.f24920b;
                            String str5 = "cpu_trace";
                            if (optJSONObject2.optInt("exception", 0) == 1) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            map4.put(str5, Boolean.valueOf(z2));
                        }
                        if (optJSONObject2 == null || optJSONObject2.optInt("enable_upload", 0) != 1) {
                            this.f24919a.put(str, Boolean.valueOf(false));
                        } else {
                            this.f24919a.put(str, Boolean.valueOf(true));
                        }
                    }
                }
                this.f24924f = C9185g.m18234a(optJSONObject, "smooth", "scene_enable_upload");
            }
        }
    }
}
