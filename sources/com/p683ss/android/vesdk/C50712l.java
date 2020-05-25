package com.p683ss.android.vesdk;

import com.bef.effectsdk.C2590a;
import com.p683ss.android.vesdk.runtime.VEEffectConfig;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.vesdk.l */
public class C50712l {

    /* renamed from: a */
    public static boolean f127268a;

    /* renamed from: b */
    private static volatile C50712l f127269b;

    /* renamed from: c */
    private final Map<String, C50716c> f127270c = new HashMap();

    /* renamed from: com.ss.android.vesdk.l$a */
    public enum C50714a {
        CONFIG_TYPE_AB,
        CONFIG_TYPE_SETTINGS
    }

    /* renamed from: com.ss.android.vesdk.l$b */
    public enum C50715b {
        BOOLEAN,
        INTEGER,
        LONG,
        FLOAT,
        STRING
    }

    /* renamed from: com.ss.android.vesdk.l$c */
    public static class C50716c {

        /* renamed from: a */
        public C50715b f127274a;

        /* renamed from: b */
        public Object f127275b;

        /* renamed from: c */
        public C50714a f127276c;

        /* renamed from: d */
        public String f127277d;

        /* renamed from: e */
        public boolean f127278e;

        /* renamed from: f */
        AtomicBoolean f127279f = new AtomicBoolean(false);

        public final String toString() {
            if (this.f127275b != null) {
                return this.f127275b.toString();
            }
            return "";
        }

        public C50716c(C50715b bVar, Object obj, C50714a aVar, String str) {
            this.f127275b = obj;
            this.f127274a = bVar;
            this.f127276c = aVar;
            this.f127277d = str;
        }
    }

    /* renamed from: a */
    public static C50712l m109659a() {
        if (f127269b == null) {
            synchronized (C50712l.class) {
                if (f127269b == null) {
                    f127269b = new C50712l();
                }
            }
        }
        return f127269b;
    }

    /* renamed from: b */
    public final Map<String, C50716c> mo99231b() {
        if (f127268a) {
            C50792y.m109913c("VEConfigCenter", "Do preload libs!!!");
        }
        return this.f127270c;
    }

    /* renamed from: c */
    public final int mo99232c() {
        for (Entry entry : this.f127270c.entrySet()) {
            if (((C50716c) entry.getValue()).f127278e) {
                String str = (String) entry.getKey();
                C50716c cVar = (C50716c) entry.getValue();
                if (cVar.f127278e) {
                    switch (cVar.f127274a) {
                        case BOOLEAN:
                            VEEffectConfig.setABConfigValue(str, cVar.f127275b, 0);
                            break;
                        case INTEGER:
                        case LONG:
                            VEEffectConfig.setABConfigValue(str, cVar.f127275b, 1);
                            break;
                        case FLOAT:
                            VEEffectConfig.setABConfigValue(str, cVar.f127275b, 2);
                            break;
                        case STRING:
                            VEEffectConfig.setABConfigValue(str, cVar.f127275b, 3);
                            break;
                    }
                }
            }
        }
        return 0;
    }

    private C50712l() {
        m109658a("wide_camera_id", new C50716c(C50715b.STRING, "-1", C50714a.CONFIG_TYPE_AB, "wide camera device id"));
        m109658a("remove_model_lock", new C50716c(C50715b.BOOLEAN, Boolean.valueOf(false), C50714a.CONFIG_TYPE_AB, "enable remove model lock opt"));
        m109658a("vesdk_input_processor", new C50716c(C50715b.BOOLEAN, Boolean.valueOf(false), C50714a.CONFIG_TYPE_AB, "input direct link to processor"));
        m109658a("mv_use_amazing_engine", new C50716c(C50715b.BOOLEAN, Boolean.valueOf(false), C50714a.CONFIG_TYPE_AB, "enable using amazing engine for mv"));
        m109658a("is_speed_mode_sw", new C50716c(C50715b.BOOLEAN, Boolean.valueOf(false), C50714a.CONFIG_TYPE_AB, "is_speed_mode_sw"));
        m109658a("is_opt_crf_sw", new C50716c(C50715b.BOOLEAN, Boolean.valueOf(false), C50714a.CONFIG_TYPE_AB, "is_opt_crf_sw"));
        m109658a("crossplat_glbase_fbo", new C50716c(C50715b.BOOLEAN, Boolean.valueOf(false), C50714a.CONFIG_TYPE_AB, "enable crossplat glbase fbo"));
        m109658a("vboost_compile", new C50716c(C50715b.BOOLEAN, Boolean.valueOf(false), C50714a.CONFIG_TYPE_AB, "enable vboost compile"));
        m109658a("use_open_gl_three", new C50716c(C50715b.INTEGER, Integer.valueOf(0), C50714a.CONFIG_TYPE_AB, "use GLES3.0"));
        m109658a("use_byte264", new C50716c(C50715b.BOOLEAN, Boolean.valueOf(false), C50714a.CONFIG_TYPE_AB, "use libbyte264"));
        m109658a("aeabtest_v2api", new C50716c(C50715b.BOOLEAN, Boolean.valueOf(false), C50714a.CONFIG_TYPE_AB, "use new audiosdk api"));
        m109658a("frame_rate_strategy", new C50716c(C50715b.INTEGER, Integer.valueOf(0), C50714a.CONFIG_TYPE_AB, "frame rate strategy"));
        m109661d();
    }

    /* renamed from: d */
    private void m109661d() {
        try {
            JSONArray jSONArray = new JSONArray(C2590a.m7541a(""));
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                int i2 = jSONObject.getInt("dataType");
                String string = jSONObject.getString("description");
                C50716c cVar = null;
                String str = "defaultVal";
                switch (i2) {
                    case 0:
                        cVar = new C50716c(C50715b.BOOLEAN, Boolean.valueOf(jSONObject.getBoolean(str)), C50714a.CONFIG_TYPE_AB, string);
                        break;
                    case 1:
                        cVar = new C50716c(C50715b.INTEGER, Integer.valueOf(jSONObject.getInt(str)), C50714a.CONFIG_TYPE_AB, string);
                        break;
                    case 2:
                        cVar = new C50716c(C50715b.FLOAT, Float.valueOf((float) jSONObject.getDouble(str)), C50714a.CONFIG_TYPE_AB, string);
                        break;
                    case 3:
                        cVar = new C50716c(C50715b.STRING, jSONObject.getString(str), C50714a.CONFIG_TYPE_AB, string);
                        break;
                }
                if (cVar != null) {
                    cVar.f127278e = true;
                    m109658a(jSONObject.getString("key"), cVar);
                }
            }
        } catch (JSONException unused) {
        }
    }

    /* renamed from: a */
    public final C50716c mo99229a(String str) {
        return (C50716c) this.f127270c.get(str);
    }

    /* renamed from: a */
    private int m109658a(String str, C50716c cVar) {
        if (this.f127270c.containsKey(str)) {
            return -100;
        }
        m109660b(str, cVar);
        return 0;
    }

    /* renamed from: b */
    private C50716c m109660b(String str, C50716c cVar) {
        return (C50716c) this.f127270c.put(str, cVar);
    }

    /* renamed from: a */
    public final Object mo99230a(String str, Object obj) {
        C50716c cVar = (C50716c) this.f127270c.get(str);
        if (cVar == null) {
            return null;
        }
        Object obj2 = cVar.f127275b;
        if (!cVar.f127279f.get()) {
            cVar.f127275b = obj;
        }
        return obj2;
    }
}
