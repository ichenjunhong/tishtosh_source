package com.bytedance.apm.p471b.p473b;

import com.bytedance.apm.C8936b;
import com.bytedance.apm.C8976c;
import com.p683ss.android.ugc.aweme.experiment.ProfileUiInitOptimizeEnterThreshold;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.b.b.b */
public final class C8960b {

    /* renamed from: A */
    long f24360A;

    /* renamed from: a */
    long f24361a;

    /* renamed from: b */
    long f24362b;

    /* renamed from: c */
    public long f24363c;

    /* renamed from: d */
    public long f24364d;

    /* renamed from: e */
    public long f24365e;

    /* renamed from: f */
    public long f24366f;

    /* renamed from: g */
    public long f24367g;

    /* renamed from: h */
    public long f24368h;

    /* renamed from: i */
    public long f24369i;

    /* renamed from: j */
    public long f24370j;

    /* renamed from: k */
    public long f24371k;

    /* renamed from: l */
    public long f24372l;

    /* renamed from: m */
    public boolean f24373m = true;

    /* renamed from: n */
    public String f24374n;

    /* renamed from: o */
    public String f24375o;

    /* renamed from: p */
    long f24376p;

    /* renamed from: q */
    long f24377q;

    /* renamed from: r */
    int f24378r;

    /* renamed from: s */
    int f24379s;

    /* renamed from: t */
    int f24380t;

    /* renamed from: u */
    int f24381u;

    /* renamed from: v */
    long f24382v;

    /* renamed from: w */
    int f24383w;

    /* renamed from: x */
    int f24384x;

    /* renamed from: y */
    int f24385y;

    /* renamed from: z */
    int f24386z;

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final boolean mo16242b() {
        if (this.f24361a > 60000) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final boolean mo16243c() {
        if (this.f24362b > 5000) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo16238a() {
        this.f24361a = 0;
        this.f24362b = 0;
        this.f24363c = 0;
        this.f24364d = 0;
        this.f24365e = 0;
        this.f24366f = 0;
        this.f24367g = 0;
        this.f24368h = 0;
        this.f24369i = 0;
        this.f24370j = 0;
        this.f24371k = 0;
        this.f24372l = 0;
        this.f24373m = true;
        this.f24374n = "";
        this.f24375o = "";
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo16239a(long j) {
        this.f24362b += j;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo16241b(long j) {
        this.f24361a += j;
    }

    /* renamed from: a */
    public final boolean mo16240a(boolean z) throws Exception {
        boolean b = m17681b(z);
        if (!b && C8976c.m17751g()) {
            StringBuilder sb = new StringBuilder("stats report failed, processName: ");
            sb.append(this.f24374n);
            String[] strArr = {sb.toString()};
        }
        mo16238a();
        return b;
    }

    /* renamed from: b */
    private boolean m17681b(boolean z) throws Exception {
        JSONObject jSONObject = new JSONObject();
        if (mo16242b()) {
            jSONObject.put("front_alarm", this.f24366f);
            jSONObject.put("front_location_p_time", this.f24364d / 1000);
            jSONObject.put("front_power_p_time", this.f24365e / 1000);
            if (this.f24363c < 0) {
                if (C8976c.m17751g()) {
                    StringBuilder sb = new StringBuilder(" report data invalid, frontCpuMs < 0 : ");
                    sb.append(this.f24363c);
                    String[] strArr = {sb.toString()};
                }
                return false;
            }
            jSONObject.put("front_cpu_active_time_p_time", this.f24363c / 1000);
            if (this.f24367g < 0) {
                if (C8976c.m17751g()) {
                    StringBuilder sb2 = new StringBuilder(" report data invalid, mFrontTrafficBytes < 0 : ");
                    sb2.append(this.f24367g);
                    String[] strArr2 = {sb2.toString()};
                }
                return false;
            }
            if (!z) {
                jSONObject.put("front_traffic_p_capacity", this.f24367g / 1024);
            }
            double d = (double) this.f24366f;
            Double.isNaN(d);
            double d2 = d * 0.002083333383779973d;
            double d3 = (double) this.f24363c;
            Double.isNaN(d3);
            double d4 = d2 + (d3 * 6.944444612599909E-5d);
            double d5 = (double) this.f24364d;
            Double.isNaN(d5);
            double d6 = d4 + (d5 * 7.499999810534064E-6d);
            double d7 = (double) this.f24365e;
            Double.isNaN(d7);
            double d8 = d6 + (d7 * 6.944444521650439E-6d);
            if (!z) {
                double d9 = (double) this.f24367g;
                Double.isNaN(d9);
                d8 += d9 * 5.464481073431671E-4d;
            }
            if (d8 < ProfileUiInitOptimizeEnterThreshold.DEFAULT) {
                if (C8976c.m17751g()) {
                    StringBuilder sb3 = new StringBuilder(" report data invalid, frontScore < 0 : ");
                    sb3.append(d8);
                    String[] strArr3 = {sb3.toString()};
                }
                return false;
            }
            jSONObject.put("front_score", d8);
            jSONObject.put("front_p_time", this.f24361a / 1000);
            float f = 60000.0f / ((float) this.f24361a);
            jSONObject.put("front_alarm_per_min", (double) (((float) this.f24366f) * f));
            jSONObject.put("front_location_per_min_p_time", (double) ((((float) this.f24364d) / 1000.0f) * f));
            jSONObject.put("front_power_per_min_p_time", (double) ((((float) this.f24365e) / 1000.0f) * f));
            jSONObject.put("front_cpu_active_time_per_min_p_time", (double) ((((float) this.f24363c) / 1000.0f) * f));
            if (!z) {
                jSONObject.put("front_traffic_per_min_p_capacity", (double) ((((float) this.f24367g) / 1024.0f) * f));
            }
            double d10 = (double) f;
            Double.isNaN(d10);
            jSONObject.put("front_score_per_min", d8 * d10);
            if (z) {
                this.f24378r = (int) (((long) this.f24378r) + this.f24366f);
                this.f24381u = (int) (((long) this.f24381u) + this.f24363c);
                this.f24379s = (int) (((long) this.f24379s) + this.f24364d);
                this.f24380t = (int) (((long) this.f24380t) + this.f24365e);
                if (this.f24373m) {
                    this.f24382v = this.f24367g;
                }
                if (this.f24373m) {
                    this.f24376p = this.f24361a;
                }
            }
        }
        if (mo16243c()) {
            jSONObject.put("back_alarm", this.f24371k);
            jSONObject.put("back_location_p_time", this.f24369i / 1000);
            jSONObject.put("back_power_p_time", this.f24370j / 1000);
            if (this.f24368h < 0) {
                if (C8976c.m17751g()) {
                    StringBuilder sb4 = new StringBuilder(" report data invalid, mBackCpuMs < 0 : ");
                    sb4.append(this.f24368h);
                    String[] strArr4 = {sb4.toString()};
                }
                return false;
            }
            jSONObject.put("back_cpu_active_time_p_time", this.f24368h / 1000);
            if (this.f24372l < 0) {
                if (C8976c.m17751g()) {
                    StringBuilder sb5 = new StringBuilder(" report data invalid, mBackTrafficBytes < 0 : ");
                    sb5.append(this.f24372l);
                    String[] strArr5 = {sb5.toString()};
                }
                return false;
            }
            if (!z) {
                jSONObject.put("back_traffic_p_capacity", this.f24372l / 1024);
            }
            double d11 = (double) this.f24371k;
            Double.isNaN(d11);
            double d12 = d11 * 0.002083333383779973d;
            double d13 = (double) this.f24368h;
            Double.isNaN(d13);
            double d14 = d12 + (d13 * 6.944444612599909E-5d);
            double d15 = (double) this.f24369i;
            Double.isNaN(d15);
            double d16 = d14 + (d15 * 7.499999810534064E-6d);
            double d17 = (double) this.f24370j;
            Double.isNaN(d17);
            double d18 = d16 + (d17 * 6.944444521650439E-6d);
            if (!z) {
                double d19 = (double) this.f24372l;
                Double.isNaN(d19);
                d18 += d19 * 5.464481073431671E-4d;
            }
            jSONObject.put("back_score", d18);
            jSONObject.put("back_p_time", this.f24362b / 1000);
            float f2 = 60000.0f / ((float) this.f24362b);
            jSONObject.put("back_alarm_per_min", (double) (((float) this.f24371k) * f2));
            jSONObject.put("back_location_per_min_p_time", (double) ((((float) this.f24369i) / 1000.0f) * f2));
            jSONObject.put("back_power_per_min_p_time", (double) ((((float) this.f24370j) / 1000.0f) * f2));
            jSONObject.put("back_cpu_active_time_per_min_p_time", (double) ((((float) this.f24368h) / 1000.0f) * f2));
            if (!z) {
                jSONObject.put("back_traffic_per_min_p_capacity", (double) ((((float) this.f24372l) / 1024.0f) * f2));
            }
            double d20 = (double) f2;
            Double.isNaN(d20);
            jSONObject.put("back_score_per_min", d18 * d20);
            if (z) {
                this.f24383w = (int) (((long) this.f24383w) + this.f24371k);
                this.f24386z = (int) (((long) this.f24386z) + this.f24368h);
                this.f24384x = (int) (((long) this.f24384x) + this.f24369i);
                this.f24385y = (int) (((long) this.f24385y) + this.f24370j);
                if (this.f24373m) {
                    this.f24360A = this.f24372l;
                }
                if (this.f24362b > this.f24377q) {
                    this.f24377q = this.f24362b;
                }
            }
        }
        if (jSONObject.length() <= 0) {
            return false;
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("is_main_process", this.f24373m);
        jSONObject2.put("process_name", this.f24374n);
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("sid", this.f24375o);
        C8936b.m17660b("battery", jSONObject, jSONObject2, jSONObject3);
        if (C8976c.m17751g()) {
            StringBuilder sb6 = new StringBuilder("stats report, processName: ");
            sb6.append(this.f24374n);
            String[] strArr6 = {sb6.toString()};
        }
        return true;
    }
}
