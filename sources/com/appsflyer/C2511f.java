package com.appsflyer;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.Looper;
import android.support.p030v4.content.C0726c;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.appsflyer.f */
final class C2511f {

    /* renamed from: ʻ */
    private static volatile C2511f f7797;

    /* renamed from: ʼ */
    private static final Handler f7798 = new Handler(Looper.getMainLooper());

    /* renamed from: ॱॱ */
    private static final BitSet f7799 = new BitSet(6);

    /* renamed from: ʽ */
    private final Map<C2521i, C2521i> f7800 = new HashMap(f7799.size());

    /* renamed from: ˊ */
    final Runnable f7801 = new C25134();

    /* renamed from: ˋ */
    boolean f7802;

    /* renamed from: ˋॱ */
    private boolean f7803;

    /* renamed from: ˎ */
    final Handler f7804;

    /* renamed from: ˏ */
    final Object f7805 = new Object();

    /* renamed from: ͺ */
    private final SensorManager f7806;

    /* renamed from: ॱ */
    final Runnable f7807 = new C25121();

    /* renamed from: ॱˊ */
    private final Map<C2521i, Map<String, Object>> f7808 = new HashMap(f7799.size());

    /* renamed from: ᐝ */
    final Runnable f7809 = new Runnable() {
        public final void run() {
            synchronized (C2511f.this.f7805) {
                if (C2511f.this.f7802) {
                    C2511f.this.f7804.removeCallbacks(C2511f.this.f7801);
                    C2511f.this.f7804.removeCallbacks(C2511f.this.f7807);
                    C2511f.this.mo7001();
                    C2511f.this.f7802 = false;
                }
            }
        }
    };

    /* renamed from: com.appsflyer.f$1 */
    class C25121 implements Runnable {
        C25121() {
        }

        public final void run() {
            synchronized (C2511f.this.f7805) {
                C2511f.this.mo7001();
                C2511f.this.f7804.postDelayed(C2511f.this.f7801, 1800000);
            }
        }

        C25121() {
        }

        /* renamed from: ˋ */
        static boolean m7369(Context context, String str) {
            int a = C0726c.m2090a(context, str);
            StringBuilder sb = new StringBuilder("is Permission Available: ");
            sb.append(str);
            sb.append("; res: ");
            sb.append(a);
            AFLogger.afRDLog(sb.toString());
            if (a == 0) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.appsflyer.f$4 */
    class C25134 implements Runnable {

        /* renamed from: ˊ */
        private static String f7811;

        /* renamed from: ॱ */
        private static String f7812;

        C25134() {
        }

        public final void run() {
            synchronized (C2511f.this.f7805) {
                C2511f.this.mo7002();
                C2511f.this.f7804.postDelayed(C2511f.this.f7807, 500);
                C2511f.this.f7802 = true;
            }
        }

        C25134() {
        }

        /* renamed from: ˊ */
        static void m7370(String str) {
            f7811 = str;
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < str.length(); i++) {
                if (i == 0 || i == str.length() - 1) {
                    sb.append(str.charAt(i));
                } else {
                    sb.append("*");
                }
            }
            f7812 = sb.toString();
        }

        /* renamed from: ॱ */
        static void m7371(String str) {
            if (f7811 == null) {
                m7370(AppsFlyerProperties.getInstance().getString("AppsFlyerKey"));
            }
            if (f7811 != null && str.contains(f7811)) {
                AFLogger.afInfoLog(str.replace(f7811, f7812));
            }
        }
    }

    static {
        f7799.set(1);
        f7799.set(2);
        f7799.set(4);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: ˏ */
    public final void mo7001() {
        try {
            if (!this.f7800.isEmpty()) {
                for (C2521i iVar : this.f7800.values()) {
                    this.f7806.unregisterListener(iVar);
                    iVar.mo7017(this.f7808);
                }
            }
        } catch (Throwable unused) {
        }
        this.f7803 = false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: ˎ */
    public final List<Map<String, Object>> mo7000() {
        synchronized (this.f7805) {
            if (!this.f7800.isEmpty() && this.f7803) {
                for (C2521i r2 : this.f7800.values()) {
                    r2.mo7016(this.f7808);
                }
            }
            if (this.f7808.isEmpty()) {
                List<Map<String, Object>> emptyList = Collections.emptyList();
                return emptyList;
            }
            ArrayList arrayList = new ArrayList(this.f7808.values());
            return arrayList;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: ॱ */
    public final void mo7002() {
        boolean z;
        try {
            for (Sensor sensor : this.f7806.getSensorList(-1)) {
                int type = sensor.getType();
                if (type < 0 || !f7799.get(type)) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    C2521i r3 = C2521i.m7384(sensor);
                    if (!this.f7800.containsKey(r3)) {
                        this.f7800.put(r3, r3);
                    }
                    this.f7806.registerListener((SensorEventListener) this.f7800.get(r3), sensor, 0);
                }
            }
        } catch (Throwable unused) {
        }
        this.f7803 = true;
    }

    /* renamed from: ॱ */
    static C2511f m7364(Context context) {
        return m7365((SensorManager) context.getApplicationContext().getSystemService("sensor"), f7798);
    }

    private C2511f(SensorManager sensorManager, Handler handler) {
        this.f7806 = sensorManager;
        this.f7804 = handler;
    }

    /* renamed from: ॱ */
    private static C2511f m7365(SensorManager sensorManager, Handler handler) {
        if (f7797 == null) {
            synchronized (C2511f.class) {
                if (f7797 == null) {
                    f7797 = new C2511f(sensorManager, handler);
                }
            }
        }
        return f7797;
    }
}
