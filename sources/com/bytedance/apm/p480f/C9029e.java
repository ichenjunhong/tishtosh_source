package com.bytedance.apm.p480f;

import android.app.Activity;
import android.os.Environment;
import android.text.TextUtils;
import com.bytedance.apm.C8976c;
import com.bytedance.apm.p485h.C9039a;
import com.bytedance.apm.p485h.C9042d;
import com.bytedance.apm.p488k.C9074a;
import com.bytedance.apm.p488k.C9079d;
import com.bytedance.apm.p497o.C9149b;
import com.bytedance.apm.p497o.C9149b.C9153b;
import com.bytedance.apm.p501q.C9190h;
import com.bytedance.frameworks.core.apm.C9937b;
import com.bytedance.frameworks.core.apm.C9941c;
import com.bytedance.frameworks.core.apm.C9941c.C9943a;
import com.bytedance.services.apm.api.C13220c;
import com.bytedance.services.slardar.config.C13226a;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.f.e */
public final class C9029e implements C9153b, C9943a, C13220c, C13226a {

    /* renamed from: a */
    public volatile boolean f24628a;

    /* renamed from: b */
    public boolean f24629b;

    /* renamed from: c */
    public long f24630c;

    /* renamed from: d */
    boolean f24631d;

    /* renamed from: e */
    private final LinkedList<C9042d> f24632e;

    /* renamed from: f */
    private long f24633f;

    /* renamed from: g */
    private long f24634g;

    /* renamed from: h */
    private int f24635h;

    /* renamed from: i */
    private int f24636i;

    /* renamed from: j */
    private long f24637j;

    /* renamed from: com.bytedance.apm.f.e$a */
    static final class C9031a {

        /* renamed from: a */
        public static final C9029e f24639a = new C9029e();
    }

    /* renamed from: a */
    public static C9029e m17898a() {
        return C9031a.f24639a;
    }

    /* renamed from: b */
    public final int mo16361b() {
        return this.f24635h;
    }

    /* renamed from: b */
    public final void mo16221b(Activity activity) {
    }

    /* renamed from: c */
    public final int mo16362c() {
        return this.f24636i;
    }

    /* renamed from: c */
    public final void mo16273c(Activity activity) {
    }

    /* renamed from: d */
    public final void mo16274d(Activity activity) {
    }

    private C9029e() {
        this.f24632e = new LinkedList<>();
        this.f24631d = true;
    }

    /* renamed from: e */
    public final void mo16224e() {
        C9941c.f27026b = this;
        C9149b.m18170a().mo16523a((C9153b) this);
    }

    /* renamed from: b */
    static void m17901b(C9042d dVar) {
        C9937b.m19972a().mo17905a(dVar);
    }

    /* renamed from: a */
    public final void mo16218a(Activity activity) {
        C9149b.m18170a().mo16524a((Runnable) new Runnable() {
            public final void run() {
                C9029e.this.mo16360a(true);
            }
        });
    }

    /* renamed from: a */
    private static void m17900a(ArrayList<? extends C9042d> arrayList) {
        int size = arrayList.size() / 2;
        ArrayList arrayList2 = new ArrayList(size);
        ArrayList arrayList3 = new ArrayList(size);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C9042d dVar = (C9042d) it.next();
            if (dVar != null) {
                if (TextUtils.equals("api_all", dVar.f24682g)) {
                    arrayList3.add((C9039a) dVar);
                } else {
                    arrayList2.add(dVar);
                }
            }
        }
        if (!C9190h.m18253a((List<?>) arrayList2)) {
            C9937b.m19972a().f27020b.mo17895b(arrayList2);
            if (C8976c.m17751g()) {
                m17899a("savedb_default", arrayList2);
            }
        }
        if (!C9190h.m18253a((List<?>) arrayList3)) {
            C9937b.m19972a().f27021c.mo17895b(arrayList3);
            if (C8976c.m17751g()) {
                m17899a("savedb_api", arrayList3);
            }
        }
    }

    /* renamed from: a */
    public final void mo16358a(long j) {
        mo16360a(false);
        if (this.f24631d && j - this.f24637j >= 1200000) {
            this.f24637j = j;
            if (Environment.getDataDirectory().getFreeSpace() < this.f24634g * 1024 * 1024) {
                this.f24631d = false;
                C9937b a = C9937b.m19972a();
                Date date = new Date();
                Calendar instance = Calendar.getInstance();
                instance.setTime(date);
                instance.add(5, -5);
                instance.set(11, 23);
                instance.set(12, 59);
                instance.set(13, 59);
                long timeInMillis = instance.getTimeInMillis();
                a.f27020b.mo17879a(timeInMillis);
                a.f27021c.mo17879a(timeInMillis);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo16359a(C9042d dVar) {
        synchronized (this.f24632e) {
            if (this.f24632e.size() >= 2000) {
                this.f24632e.poll();
                new String[1][0] = " buffer log too many, lost happen";
            }
            this.f24632e.add(dVar);
        }
    }

    /* renamed from: a */
    public final void mo16360a(boolean z) {
        ArrayList arrayList;
        long currentTimeMillis = System.currentTimeMillis();
        if (this.f24629b || currentTimeMillis - this.f24630c >= 60000) {
            int size = this.f24632e.size();
            if (size != 0) {
                if (z || size >= 5 || currentTimeMillis - this.f24633f > 120000) {
                    this.f24633f = currentTimeMillis;
                    synchronized (this.f24632e) {
                        arrayList = new ArrayList(this.f24632e);
                        this.f24632e.clear();
                    }
                    try {
                        m17900a(arrayList);
                    } catch (OutOfMemoryError unused) {
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private static void m17899a(String str, ArrayList<? extends C9042d> arrayList) {
        JSONArray jSONArray = new JSONArray();
        for (int i = 0; i < arrayList.size(); i++) {
            jSONArray.put(((C9042d) arrayList.get(i)).f24684i);
        }
        C9079d.m17981a(C9074a.f24801i, str, jSONArray.toString());
    }

    /* renamed from: a */
    public final void mo16270a(JSONObject jSONObject, boolean z) {
        JSONObject optJSONObject = jSONObject.optJSONObject("general");
        if (optJSONObject != null) {
            JSONObject optJSONObject2 = optJSONObject.optJSONObject("slardar_api_settings");
            if (optJSONObject2 != null) {
                JSONObject optJSONObject3 = optJSONObject2.optJSONObject("report_setting");
                if (optJSONObject3 != null) {
                    this.f24631d = optJSONObject3.optBoolean("local_monitor_switch", true);
                    this.f24634g = optJSONObject3.optLong("local_monitor_min_free_disk_mb", 150);
                }
            }
            JSONObject optJSONObject4 = optJSONObject.optJSONObject("cleanup");
            if (optJSONObject4 != null) {
                this.f24635h = optJSONObject4.optInt("log_reserve_days", 5);
                this.f24636i = optJSONObject4.optInt("log_max_size_mb", 80);
            }
        }
    }
}
