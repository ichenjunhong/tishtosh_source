package com.bytedance.apm.p471b.p474c;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.SystemClock;
import com.bytedance.apm.p471b.C8949a;
import com.bytedance.apm.p471b.p472a.C8955d;
import com.bytedance.apm.p471b.p473b.C8956a;
import com.bytedance.apm.p471b.p473b.C8960b;
import com.bytedance.apm.p471b.p474c.p475a.C8963a;
import com.bytedance.apm.p471b.p474c.p475a.C8964b;
import com.bytedance.apm.p480f.C9018b;
import com.bytedance.apm.p480f.C9028d;
import com.bytedance.apm.p480f.p481a.C9014a;
import com.bytedance.apm.p480f.p482b.C9022d;
import com.bytedance.apm.p485h.C9040b;
import com.bytedance.common.utility.p526f.C9409b;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.b.c.d */
public final class C8970d extends C8969c<C8963a> implements C8955d {

    /* renamed from: e */
    private int[] f24413e;

    /* renamed from: f */
    private int f24414f;

    /* renamed from: g */
    private List<Long> f24415g = new ArrayList();

    /* renamed from: h */
    private int f24416h;

    /* renamed from: i */
    private final Object f24417i = new Object();

    /* renamed from: j */
    private final List<Long> f24418j = new ArrayList();

    /* renamed from: a */
    public final String mo16229a() {
        return "android.app.IAlarmManager";
    }

    public C8970d() {
        super("alarm");
    }

    /* renamed from: b */
    public final void mo16248b() {
        super.mo16248b();
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (this.f24417i) {
            this.f24415g.add(Long.valueOf(currentTimeMillis));
        }
    }

    /* renamed from: c */
    public final void mo16249c() {
        super.mo16249c();
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (this.f24417i) {
            this.f24415g.add(Long.valueOf(currentTimeMillis));
        }
    }

    /* renamed from: a */
    public final void mo16262a(C8960b bVar, C9040b bVar2) {
        if (this.f24409a.equals(bVar2.f24665d)) {
            if (!bVar2.f24663b) {
                bVar.f24371k += bVar2.f24668g;
                return;
            }
            bVar.f24366f += bVar2.f24668g;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo16245a(long j, long j2) {
        int i = 0;
        this.f24414f = 0;
        this.f24413e = new int[2];
        this.f24418j.add(Long.valueOf(j));
        synchronized (this.f24417i) {
            this.f24418j.addAll(this.f24415g);
            this.f24415g.clear();
        }
        this.f24418j.add(Long.valueOf(j2));
        this.f24416h = 1;
        while (this.f24416h < this.f24418j.size()) {
            super.mo16245a(((Long) this.f24418j.get(this.f24416h - 1)).longValue(), ((Long) this.f24418j.get(this.f24416h)).longValue());
            this.f24416h++;
        }
        if (this.f24413e[0] + this.f24413e[1] != 0) {
            int[] iArr = this.f24413e;
            int size = this.f24418j.size();
            long currentTimeMillis = System.currentTimeMillis();
            if ((!this.f24411c || size % 2 != 0) && (this.f24411c || size % 2 != 1)) {
                C8956a a = C8956a.m17674a();
                long j3 = currentTimeMillis;
                C9040b bVar = new C9040b(true, j3, this.f24409a, (long) iArr[0]);
                a.mo16233a(bVar);
                C8956a a2 = C8956a.m17674a();
                C9040b bVar2 = new C9040b(false, j3, this.f24409a, (long) iArr[1]);
                a2.mo16233a(bVar2);
            } else {
                C8956a a3 = C8956a.m17674a();
                long j4 = currentTimeMillis;
                C9040b bVar3 = new C9040b(false, j4, this.f24409a, (long) iArr[0]);
                a3.mo16233a(bVar3);
                C8956a a4 = C8956a.m17674a();
                C9040b bVar4 = new C9040b(true, j4, this.f24409a, (long) iArr[1]);
                a4.mo16233a(bVar4);
            }
        }
        this.f24418j.clear();
        long currentTimeMillis2 = System.currentTimeMillis();
        double d = (double) this.f24413e[0];
        double d2 = (double) this.f24413e[1];
        Double.isNaN(d);
        Double.isNaN(d2);
        double d3 = d + d2;
        double d4 = (double) (currentTimeMillis2 - this.f24410b);
        Double.isNaN(d4);
        double d5 = (d3 / d4) * 60000.0d * 10.0d;
        double d6 = (double) this.f24414f;
        double d7 = (double) (currentTimeMillis2 - this.f24410b);
        Double.isNaN(d6);
        Double.isNaN(d7);
        double d8 = (d6 / d7) * 60000.0d * 10.0d;
        if (d5 >= 5.0d) {
            i = 49;
        }
        if (d8 >= 10.0d) {
            i |= 50;
        }
        if (i != 0) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("issue_type", i).put("wake_up_count", d5).put("normal_count", d8).put("alarm_maps", this.f24412d);
                C9018b.m17833a(jSONObject, "battery_trace");
                C9014a.m17825a().mo16336a((C9028d) new C9022d("battery_trace", jSONObject));
            } catch (JSONException unused) {
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo16247a(C8964b bVar, long j, long j2) {
        int i;
        C8963a aVar = (C8963a) bVar;
        boolean z = true;
        if (aVar.f24395b > 0) {
            long j3 = aVar.f24397d;
            if (j3 < j) {
                j3 = (aVar.f24395b + j) - ((j - aVar.f24397d) % aVar.f24395b);
            }
            long j4 = aVar.f24398e;
            if (j4 > j2 || aVar.f24398e <= 0) {
                j4 = j2;
            }
            long j5 = j4 - j3;
            if (j5 > 0) {
                i = ((int) (j5 / aVar.f24395b)) + 1;
            } else {
                return;
            }
        } else if (j <= aVar.f24397d && aVar.f24397d <= j2) {
            i = 1;
        } else {
            return;
        }
        if (!(aVar.f24394a == 2 || aVar.f24394a == 0)) {
            z = false;
        }
        if (z) {
            int[] iArr = this.f24413e;
            int i2 = this.f24416h % 2;
            iArr[i2] = iArr[i2] + i;
            return;
        }
        this.f24414f += i;
    }

    /* renamed from: a */
    public final void mo16230a(Object obj, Method method, Object[] objArr) {
        long j;
        String str;
        long j2;
        try {
            String name = method.getName();
            int i = -1;
            if ("set".equals(name)) {
                C8963a aVar = new C8963a();
                int i2 = -1;
                boolean z = false;
                int i3 = 0;
                for (Integer num : objArr) {
                    if ((num instanceof Integer) && !z) {
                        aVar.f24394a = num.intValue();
                        z = true;
                    } else if (num instanceof Long) {
                        if (i3 == 0) {
                            aVar.f24397d = ((Long) num).longValue();
                            if (aVar.f24394a != 1) {
                                if (aVar.f24394a != 0) {
                                    j2 = (aVar.f24397d + System.currentTimeMillis()) - SystemClock.elapsedRealtime();
                                    aVar.f24397d = j2;
                                }
                            }
                            j2 = aVar.f24397d;
                            aVar.f24397d = j2;
                        } else if (i3 == 2) {
                            aVar.f24395b = ((Long) num).longValue();
                        }
                        i3++;
                    } else if (num instanceof PendingIntent) {
                        PendingIntent pendingIntent = (PendingIntent) num;
                        if (VERSION.SDK_INT > 23 || pendingIntent == null) {
                            str = "";
                        } else {
                            str = ((Intent) C9409b.m18609a((Object) pendingIntent).mo17054b("getIntent").f25654a).toString();
                        }
                        aVar.f24396c = str;
                        i2 = pendingIntent.hashCode();
                    }
                }
                if (i2 != -1) {
                    if (aVar.f24395b == 0) {
                        j = aVar.f24397d;
                    } else {
                        j = -1;
                    }
                    aVar.f24398e = j;
                    if (C8949a.m17661a().f24337b) {
                        aVar.f24399f = Thread.currentThread().getName();
                        aVar.f24400g = Thread.currentThread().getStackTrace();
                    }
                    this.f24412d.put(Integer.valueOf(i2), aVar);
                }
                return;
            }
            if ("remove".equals(name)) {
                if (objArr[0] != null && (objArr[0] instanceof PendingIntent)) {
                    i = objArr[0].hashCode();
                }
                C8963a aVar2 = (C8963a) this.f24412d.get(Integer.valueOf(i));
                if (aVar2 != null && aVar2.f24395b > 0) {
                    aVar2.f24398e = System.currentTimeMillis();
                    this.f24412d.put(Integer.valueOf(i), aVar2);
                }
            }
        } catch (Exception unused) {
        }
    }
}
