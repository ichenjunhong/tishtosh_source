package com.p683ss.android.vesdk.runtime;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import com.bef.effectsdk.C2592c;
import com.p683ss.android.ttve.monitor.C20102a.C20103a;
import com.p683ss.android.ttve.monitor.C20104b;
import com.p683ss.android.ttve.monitor.C20110e;
import com.p683ss.android.ttve.monitor.C20112f.C20113a;
import com.p683ss.android.ttve.monitor.C20114g;
import com.p683ss.android.ttve.monitor.IMonitor;
import com.p683ss.android.ttve.nativePort.TEVideoRecorder;
import com.p683ss.android.vesdk.C50659d;
import com.p683ss.android.vesdk.C50701g;
import com.p683ss.android.vesdk.VEListener.C50538b;
import com.p683ss.android.vesdk.VEListener.C50551o;
import com.p683ss.android.vesdk.VEListener.C50556t;
import com.p683ss.android.vesdk.VESize;
import com.p683ss.android.vesdk.p2534d.C50660a;
import com.p683ss.android.vesdk.runtime.cloudconfig.C50769c;
import com.p683ss.android.vesdk.runtime.p2536a.C50762a;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ss.android.vesdk.runtime.VERuntime */
public class VERuntime {

    /* renamed from: a */
    public Context f127473a;

    /* renamed from: b */
    public boolean f127474b;

    /* renamed from: c */
    public boolean f127475c;

    /* renamed from: d */
    public C50772e f127476d;

    /* renamed from: e */
    public C50766c f127477e;

    /* renamed from: f */
    public boolean f127478f;

    /* renamed from: g */
    public VESize f127479g;

    /* renamed from: h */
    public C50701g f127480h;

    /* renamed from: i */
    public boolean f127481i;

    /* renamed from: j */
    public boolean f127482j;

    /* renamed from: k */
    public WeakReference<C50556t> f127483k;

    /* renamed from: l */
    public WeakReference<C50538b> f127484l;

    /* renamed from: m */
    public WeakReference<C50551o> f127485m;

    /* renamed from: n */
    public IMonitor f127486n;

    /* renamed from: o */
    public C20103a f127487o;

    /* renamed from: p */
    public C20113a f127488p;

    /* renamed from: q */
    public C50762a f127489q;

    /* renamed from: r */
    private boolean f127490r;

    /* renamed from: com.ss.android.vesdk.runtime.VERuntime$a */
    enum C50760a {
        INSTANCE;
        

        /* renamed from: b */
        private VERuntime f127497b;

        /* renamed from: a */
        public final VERuntime mo99446a() {
            return this.f127497b;
        }
    }

    public static native void nativeEnableAudioSDKApiV2(boolean z);

    public native void nativeEnableHDH264HWDecoder(boolean z, int i);

    public native void nativeEnableHighFpsH264HWDecoder(boolean z, int i, int i2);

    public native void nativeEnableTT265Decoder(boolean z);

    public native long nativeGetNativeContext();

    /* renamed from: a */
    public static VERuntime m109853a() {
        return C50760a.INSTANCE.mo99446a();
    }

    /* renamed from: b */
    public void mo99440b() {
        if (this.f127474b) {
            try {
                C50769c.m109875a();
            } catch (Exception unused) {
            }
        }
        new Thread() {
            public final void run() {
                boolean z;
                Object obj;
                boolean z2;
                Object obj2;
                boolean z3;
                Object obj3;
                boolean z4;
                Object obj4;
                System.currentTimeMillis();
                boolean z5 = VERuntime.this.f127474b;
                try {
                    C20104b.m49615a(VERuntime.this.f127473a);
                    boolean z6 = false;
                    if (!((Boolean) C50762a.m109863a().mo99451b("sensor_reported", Boolean.valueOf(false))).booleanValue()) {
                        Context context = VERuntime.this.f127473a;
                        HashMap hashMap = new HashMap();
                        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
                        Sensor defaultSensor = sensorManager.getDefaultSensor(4);
                        String str = "te_sensor_type_gyroscope_exist";
                        if (defaultSensor != null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        hashMap.put(str, Boolean.valueOf(z));
                        String str2 = "te_sensor_type_gyroscope_name";
                        String str3 = null;
                        if (defaultSensor != null) {
                            obj = defaultSensor.getName();
                        } else {
                            obj = null;
                        }
                        hashMap.put(str2, obj);
                        Sensor defaultSensor2 = sensorManager.getDefaultSensor(15);
                        String str4 = "te_sensor_type_game_rotation_vector_exist";
                        if (defaultSensor2 != null) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        hashMap.put(str4, Boolean.valueOf(z2));
                        String str5 = "te_sensor_type_game_rotation_vector_name";
                        if (defaultSensor2 != null) {
                            obj2 = defaultSensor2.getName();
                        } else {
                            obj2 = null;
                        }
                        hashMap.put(str5, obj2);
                        Sensor defaultSensor3 = sensorManager.getDefaultSensor(11);
                        String str6 = "te_sensor_type_rotation_vector_exist";
                        if (defaultSensor3 != null) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        hashMap.put(str6, Boolean.valueOf(z3));
                        String str7 = "te_sensor_type_rotation_vector_name";
                        if (defaultSensor3 != null) {
                            obj3 = defaultSensor3.getName();
                        } else {
                            obj3 = null;
                        }
                        hashMap.put(str7, obj3);
                        Sensor defaultSensor4 = sensorManager.getDefaultSensor(9);
                        String str8 = "te_sensor_type_gravity_exist";
                        if (defaultSensor4 != null) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        hashMap.put(str8, Boolean.valueOf(z4));
                        String str9 = "te_sensor_type_gravity_name";
                        if (defaultSensor4 != null) {
                            obj4 = defaultSensor4.getName();
                        } else {
                            obj4 = null;
                        }
                        hashMap.put(str9, obj4);
                        Sensor defaultSensor5 = sensorManager.getDefaultSensor(1);
                        String str10 = "te_sensor_type_accelerometer_exist";
                        if (defaultSensor5 != null) {
                            z6 = true;
                        }
                        hashMap.put(str10, Boolean.valueOf(z6));
                        String str11 = "te_sensor_type_accelerometer_name";
                        if (defaultSensor5 != null) {
                            str3 = defaultSensor5.getName();
                        }
                        hashMap.put(str11, str3);
                        C20114g.m49653a("iesve_veeditor_sensor_report", "iesve_veeditor_sensor_report", (Map) hashMap);
                        C50762a.m109863a().mo99449a("sensor_reported", Boolean.valueOf(true));
                    }
                } catch (Exception unused) {
                }
                C50660a aVar = new C50660a();
                aVar.mo99062a("iesve_vesdk_init_finish_result", "success");
                aVar.mo99062a("iesve_vesdk_init_finish_reason", TEVideoRecorder.FACE_BEAUTY_NULL);
                C20110e.m49637a("iesve_vesdk_init_finish", 1, aVar);
            }
        }.start();
    }

    private VERuntime() {
        this.f127479g = new VESize(0, 0);
        this.f127482j = false;
        this.f127486n = new IMonitor() {
            public final void monitorLog(String str, JSONObject jSONObject) {
                if (VERuntime.this.f127483k != null && VERuntime.this.f127483k.get() != null) {
                    ((C50556t) VERuntime.this.f127483k.get()).mo43741a(str, jSONObject);
                }
            }
        };
        this.f127487o = new C20103a() {
            /* renamed from: a */
            public final void mo42264a(String str, JSONObject jSONObject, String str2, String str3, String str4) {
                if (VERuntime.this.f127484l != null && VERuntime.this.f127484l.get() != null) {
                    ((C50538b) VERuntime.this.f127484l.get()).mo43742a(str, jSONObject, str2, str3, str4);
                }
            }
        };
        this.f127488p = new C20113a() {
            /* renamed from: a */
            public final void mo42267a(Throwable th) {
                C50551o oVar;
                WeakReference<C50551o> weakReference = VERuntime.this.f127485m;
                if (weakReference == null) {
                    oVar = null;
                } else {
                    oVar = (C50551o) weakReference.get();
                }
                if (oVar != null) {
                    oVar.mo43230a(th);
                }
            }
        };
    }

    /* renamed from: a */
    public final boolean mo99439a(C2592c cVar) {
        C50659d.m109320a(cVar);
        VEEffectConfig.setResourceFinder(cVar);
        this.f127475c = false;
        this.f127490r = true;
        VEEffectConfig.configEffect("", "nexus");
        return true;
    }
}
