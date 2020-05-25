package com.bytedance.android.p140a.p151b.p155c;

import android.os.SystemClock;
import com.bytedance.android.p140a.p141a.p148g.C2795b;
import com.bytedance.android.p140a.p141a.p150i.C2799a;
import com.bytedance.android.p140a.p151b.p152a.C2809a;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.a.b.c.a */
public final class C2823a extends C2795b {

    /* renamed from: a */
    public C2825a f8421a;

    /* renamed from: b */
    public long f8422b;

    /* renamed from: c */
    public boolean f8423c;

    /* renamed from: d */
    public int f8424d;

    /* renamed from: e */
    public List<String> f8425e;

    /* renamed from: f */
    public List<String> f8426f;

    /* renamed from: g */
    public List<String> f8427g;

    /* renamed from: i */
    public C2809a f8428i;

    /* renamed from: com.bytedance.android.a.b.c.a$a */
    public static final class C2825a {

        /* renamed from: a */
        public boolean f8429a = true;

        /* renamed from: b */
        public int f8430b;

        /* renamed from: c */
        public C2809a f8431c;
    }

    private C2823a(C2825a aVar) {
        this.f8425e = m8024a(true);
        this.f8426f = m8024a(false);
        this.f8427g = new ArrayList();
        this.f8421a = aVar;
        this.f8388h = aVar.f8429a;
        this.f8424d = aVar.f8430b;
        this.f8428i = aVar.f8431c;
        this.f8422b = SystemClock.uptimeMillis();
    }

    /* renamed from: a */
    private static List<String> m8024a(boolean z) {
        ArrayList arrayList = new ArrayList();
        if (z) {
            arrayList.add("__TS__");
            arrayList.add("{TS}");
        } else {
            arrayList.add("__TS__");
            arrayList.add("{TS}");
            arrayList.add("__MAC__");
            arrayList.add("{MAC}");
            arrayList.add("__MAC1__");
            arrayList.add("{MAC1}");
            arrayList.add("__ANDROIDID__");
            arrayList.add("{ANDROIDID}");
            arrayList.add("__ANDROIDID1__");
            arrayList.add("{ANDROIDID1}");
            arrayList.add("__IMEI__");
            arrayList.add("{IMEI}");
            arrayList.add("__AAID__");
            arrayList.add("{AAID}");
            arrayList.add("__OPENUDID__");
            arrayList.add("{OPENUDID}");
            arrayList.add("__OS__");
            arrayList.add("{OS}");
            arrayList.add("__IP__");
            arrayList.add("{IP}");
            arrayList.add("__LBS__");
            arrayList.add("{LBS}");
            arrayList.add("__GEO__");
            arrayList.add("{GEO}");
            arrayList.add("__UA__");
            arrayList.add("{UA}");
            arrayList.add("__OAID__");
            arrayList.add("{OAID}");
            arrayList.add("__OAID_MD5__");
            arrayList.add("{OAID_MD5}");
            arrayList.add("__UOO__");
            arrayList.add("{UOO}");
            arrayList.add("__DEVICE_ID__");
            arrayList.add("{DEVICE_ID}");
            arrayList.add("__OS_STR__");
            arrayList.add("{OS_STR}");
        }
        return arrayList;
    }

    /* renamed from: a */
    public final void mo7397a(JSONObject jSONObject) {
        super.mo7397a(jSONObject);
        if (jSONObject != null) {
            try {
                this.f8423c = jSONObject.optBoolean("store_when_offline", false);
                this.f8424d = jSONObject.optInt("android_store_impl", 0);
                ArrayList arrayList = new ArrayList();
                arrayList.add("__IDFA__");
                arrayList.add("{IDFA}");
                arrayList.add("__UDID__");
                arrayList.add("{UDID}");
                if (this.f8425e == null) {
                    this.f8425e = new ArrayList();
                }
                this.f8425e.clear();
                JSONArray optJSONArray = jSONObject.optJSONArray("macro_standard");
                if (optJSONArray != null) {
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        Object obj = optJSONArray.get(i);
                        if (obj instanceof String) {
                            this.f8425e.add((String) obj);
                        }
                    }
                    this.f8425e.removeAll(arrayList);
                } else {
                    this.f8425e.addAll(m8024a(true));
                }
                if (this.f8426f == null) {
                    this.f8426f = new ArrayList();
                }
                this.f8426f.clear();
                JSONArray optJSONArray2 = jSONObject.optJSONArray("macro_non_standard");
                if (optJSONArray2 != null) {
                    for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                        Object obj2 = optJSONArray2.get(i2);
                        if (obj2 instanceof String) {
                            this.f8426f.add((String) obj2);
                        }
                    }
                    this.f8426f.removeAll(arrayList);
                } else {
                    this.f8426f.addAll(m8024a(false));
                }
                if (this.f8427g == null) {
                    this.f8427g = new ArrayList();
                }
                this.f8427g.clear();
                JSONArray optJSONArray3 = jSONObject.optJSONArray("macro_blacklist");
                if (optJSONArray3 != null) {
                    for (int i3 = 0; i3 < optJSONArray3.length(); i3++) {
                        Object obj3 = optJSONArray3.get(i3);
                        if (obj3 instanceof String) {
                            this.f8427g.add((String) obj3);
                        }
                    }
                }
            } catch (Throwable th) {
                C2799a.m7954a();
                th.getMessage();
            }
            this.f8422b = SystemClock.uptimeMillis();
        }
    }
}
