package com.p683ss.sys.ces.p2581b;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.p683ss.sys.ces.C51393c;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.sys.ces.b.c */
public final class C51391c implements SensorEventListener {

    /* renamed from: g */
    private static C51391c f128493g;

    /* renamed from: a */
    private SensorManager f128494a;

    /* renamed from: b */
    private int f128495b;

    /* renamed from: c */
    private int f128496c;

    /* renamed from: d */
    private float[] f128497d = new float[3];

    /* renamed from: e */
    private DecimalFormat f128498e = new DecimalFormat("0.0");

    /* renamed from: f */
    private List<String> f128499f = new ArrayList();

    private C51391c(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            this.f128494a = (SensorManager) applicationContext.getSystemService("sensor");
        }
    }

    /* renamed from: a */
    public static C51391c m110527a(Context context) {
        if (f128493g == null) {
            synchronized (C51391c.class) {
                if (f128493g == null) {
                    f128493g = new C51391c(context);
                }
            }
        }
        return f128493g;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0021, code lost:
        return;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized void m110528c() {
        /*
            r4 = this;
            monitor-enter(r4)
            android.hardware.SensorManager r0 = r4.f128494a     // Catch:{ Exception -> 0x0025, all -> 0x0022 }
            if (r0 == 0) goto L_0x0020
            int r0 = r4.f128495b     // Catch:{ Exception -> 0x0025, all -> 0x0022 }
            r1 = 1
            if (r0 != 0) goto L_0x001b
            android.hardware.SensorManager r0 = r4.f128494a     // Catch:{ Exception -> 0x0025, all -> 0x0022 }
            android.hardware.Sensor r0 = r0.getDefaultSensor(r1)     // Catch:{ Exception -> 0x0025, all -> 0x0022 }
            android.hardware.SensorManager r2 = r4.f128494a     // Catch:{ Exception -> 0x0025, all -> 0x0022 }
            r3 = 3
            boolean r0 = r2.registerListener(r4, r0, r3)     // Catch:{ Exception -> 0x0025, all -> 0x0022 }
            if (r0 != 0) goto L_0x001b
            monitor-exit(r4)
            return
        L_0x001b:
            int r0 = r4.f128495b     // Catch:{ Exception -> 0x0025, all -> 0x0022 }
            int r0 = r0 + r1
            r4.f128495b = r0     // Catch:{ Exception -> 0x0025, all -> 0x0022 }
        L_0x0020:
            monitor-exit(r4)
            return
        L_0x0022:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x0025:
            monitor-exit(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.sys.ces.p2581b.C51391c.m110528c():void");
    }

    /* renamed from: d */
    private synchronized void m110529d() {
        try {
            if (this.f128494a != null) {
                this.f128495b--;
                if (this.f128495b == 0) {
                    this.f128494a.unregisterListener(this);
                }
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: e */
    private String m110530e() {
        StringBuilder sb;
        DecimalFormat decimalFormat;
        float f;
        if (C51393c.m110542h() != 1) {
            return null;
        }
        m110528c();
        try {
            synchronized (this) {
                int i = 0;
                while (this.f128496c == 0 && i < 10) {
                    i++;
                    wait(1000);
                }
            }
            sb = new StringBuilder();
            sb.append(this.f128498e.format((double) this.f128497d[0]));
            sb.append(", ");
            sb.append(this.f128498e.format((double) this.f128497d[1]));
            sb.append(", ");
            decimalFormat = this.f128498e;
            f = this.f128497d[2];
        } catch (Exception unused) {
            sb = new StringBuilder();
            sb.append(this.f128498e.format((double) this.f128497d[0]));
            sb.append(", ");
            sb.append(this.f128498e.format((double) this.f128497d[1]));
            sb.append(", ");
            decimalFormat = this.f128498e;
            f = this.f128497d[2];
        } catch (Throwable th) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f128498e.format((double) this.f128497d[0]));
            sb2.append(", ");
            sb2.append(this.f128498e.format((double) this.f128497d[1]));
            sb2.append(", ");
            sb2.append(this.f128498e.format((double) this.f128497d[2]));
            m110529d();
            this.f128496c = 0;
            throw th;
        }
        sb.append(decimalFormat.format((double) f));
        String sb3 = sb.toString();
        m110529d();
        this.f128496c = 0;
        return sb3;
    }

    /* renamed from: a */
    public final void mo102067a() {
        String e = m110530e();
        if (e != null) {
            this.f128499f.add(e);
            try {
                int size = this.f128499f.size();
                if (size > 20) {
                    ArrayList arrayList = new ArrayList(this.f128499f.subList(size - 10, size));
                    this.f128499f.clear();
                    this.f128499f = arrayList;
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: b */
    public final synchronized String mo102068b() {
        String str;
        str = "";
        int size = this.f128499f.size();
        if (size <= 0) {
            return str;
        }
        if (size == 1) {
            return (String) this.f128499f.get(0);
        }
        try {
            List<String> list = this.f128499f;
            int i = size - 10;
            if (i <= 0) {
                i = 0;
            }
            List subList = list.subList(i, size);
            String str2 = str;
            int i2 = 0;
            while (i2 < subList.size()) {
                try {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str2);
                    sb.append((String) subList.get(i2));
                    sb.append("|");
                    i2++;
                    str2 = sb.toString();
                } catch (Throwable unused) {
                    str = str2;
                }
            }
            str = str2.substring(0, str2.length() - 1);
        } catch (Throwable unused2) {
        }
        return str;
    }

    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    public final void onSensorChanged(SensorEvent sensorEvent) {
        this.f128497d = sensorEvent.values;
        this.f128496c = 1;
    }
}
