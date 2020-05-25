package com.appsflyer;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import com.p683ss.android.ugc.aweme.experiment.ProfileUiInitOptimizeEnterThreshold;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.appsflyer.i */
final class C2521i implements SensorEventListener {

    /* renamed from: ʽ */
    private double f7823;

    /* renamed from: ˊ */
    private final long[] f7824 = new long[2];

    /* renamed from: ˋ */
    private final String f7825;

    /* renamed from: ˎ */
    private final String f7826;

    /* renamed from: ˏ */
    private final int f7827;

    /* renamed from: ॱ */
    private final float[][] f7828 = new float[2][];

    /* renamed from: ॱॱ */
    private long f7829;

    /* renamed from: ᐝ */
    private final int f7830;

    public final int hashCode() {
        return this.f7830;
    }

    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    /* renamed from: ˊ */
    private void m7383() {
        for (int i = 0; i < 2; i++) {
            this.f7828[i] = null;
        }
        for (int i2 = 0; i2 < 2; i2++) {
            this.f7824[i2] = 0;
        }
        this.f7823 = ProfileUiInitOptimizeEnterThreshold.DEFAULT;
        this.f7829 = 0;
    }

    /* renamed from: ˎ */
    private Map<String, Object> m7385() {
        HashMap hashMap = new HashMap(7);
        hashMap.put("sT", Integer.valueOf(this.f7827));
        hashMap.put("sN", this.f7826);
        hashMap.put("sV", this.f7825);
        float[] fArr = this.f7828[0];
        if (fArr != null) {
            hashMap.put("sVS", m7382(fArr));
        }
        float[] fArr2 = this.f7828[1];
        if (fArr2 != null) {
            hashMap.put("sVE", m7382(fArr2));
        }
        return hashMap;
    }

    /* renamed from: ˊ */
    public final void mo7016(Map<C2521i, Map<String, Object>> map) {
        m7386(map, false);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: ॱ */
    public final void mo7017(Map<C2521i, Map<String, Object>> map) {
        m7386(map, true);
    }

    /* renamed from: ˊ */
    private static List<Float> m7382(float[] fArr) {
        ArrayList arrayList = new ArrayList(fArr.length);
        for (float valueOf : fArr) {
            arrayList.add(Float.valueOf(valueOf));
        }
        return arrayList;
    }

    /* renamed from: ˎ */
    static C2521i m7384(Sensor sensor) {
        return new C2521i(sensor.getType(), sensor.getName(), sensor.getVendor());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2521i)) {
            return false;
        }
        C2521i iVar = (C2521i) obj;
        return m7388(iVar.f7827, iVar.f7826, iVar.f7825);
    }

    public final void onSensorChanged(SensorEvent sensorEvent) {
        boolean z;
        if (!(sensorEvent == null || sensorEvent.values == null)) {
            Sensor sensor = sensorEvent.sensor;
            if (sensor == null || sensor.getName() == null || sensor.getVendor() == null) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                int type = sensorEvent.sensor.getType();
                String name = sensorEvent.sensor.getName();
                String vendor = sensorEvent.sensor.getVendor();
                long j = sensorEvent.timestamp;
                float[] fArr = sensorEvent.values;
                if (m7388(type, name, vendor)) {
                    long currentTimeMillis = System.currentTimeMillis();
                    float[] fArr2 = this.f7828[0];
                    if (fArr2 == null) {
                        this.f7828[0] = Arrays.copyOf(fArr, fArr.length);
                        this.f7824[0] = currentTimeMillis;
                        return;
                    }
                    float[] fArr3 = this.f7828[1];
                    if (fArr3 == null) {
                        float[] copyOf = Arrays.copyOf(fArr, fArr.length);
                        this.f7828[1] = copyOf;
                        this.f7824[1] = currentTimeMillis;
                        this.f7823 = m7387(fArr2, copyOf);
                    } else if (50000000 <= j - this.f7829) {
                        this.f7829 = j;
                        if (Arrays.equals(fArr3, fArr)) {
                            this.f7824[1] = currentTimeMillis;
                            return;
                        }
                        double r0 = m7387(fArr2, fArr);
                        if (r0 > this.f7823) {
                            this.f7828[1] = Arrays.copyOf(fArr, fArr.length);
                            this.f7824[1] = currentTimeMillis;
                            this.f7823 = r0;
                        }
                    }
                }
            }
        }
    }

    /* renamed from: ˏ */
    private static double m7387(float[] fArr, float[] fArr2) {
        int min = Math.min(fArr.length, fArr2.length);
        double d = ProfileUiInitOptimizeEnterThreshold.DEFAULT;
        for (int i = 0; i < min; i++) {
            d += StrictMath.pow((double) (fArr[i] - fArr2[i]), 2.0d);
        }
        return Math.sqrt(d);
    }

    /* renamed from: ˎ */
    private void m7386(Map<C2521i, Map<String, Object>> map, boolean z) {
        boolean z2 = false;
        if (this.f7828[0] != null) {
            z2 = true;
        }
        if (z2) {
            map.put(this, m7385());
            if (z) {
                m7383();
            }
        } else if (!map.containsKey(this)) {
            map.put(this, m7385());
        }
    }

    private C2521i(int i, String str, String str2) {
        this.f7827 = i;
        if (str == null) {
            str = "";
        }
        this.f7826 = str;
        if (str2 == null) {
            str2 = "";
        }
        this.f7825 = str2;
        this.f7830 = ((((i + 31) * 31) + this.f7826.hashCode()) * 31) + this.f7825.hashCode();
    }

    /* renamed from: ˏ */
    private boolean m7388(int i, String str, String str2) {
        if (this.f7827 != i || !this.f7826.equals(str) || !this.f7825.equals(str2)) {
            return false;
        }
        return true;
    }
}
