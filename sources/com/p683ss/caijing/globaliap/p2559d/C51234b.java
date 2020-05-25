package com.p683ss.caijing.globaliap.p2559d;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.p1067c.p1068a.p1069a.p1070a.p1071a.C17840a;
import com.p683ss.base.p2547b.C51159b;
import com.p683ss.base.p2547b.C51160c;
import com.p683ss.caijing.globaliap.p2556a.C51220c;
import com.p683ss.caijing.globaliap.p2556a.C51220c.C51221a;
import com.p683ss.caijing.globaliap.p2558c.C51226a;
import com.p683ss.caijing.globaliap.p2559d.p2560a.C51229a;
import com.p683ss.caijing.globaliap.p2559d.p2560a.C51229a.C51231a;
import com.p683ss.caijing.globaliap.p2559d.p2560a.C51229a.C51233b;
import com.p683ss.caijing.globaliap.p2561e.C51275b;
import com.p683ss.caijing.globaliap.p2561e.C51276c;
import com.p683ss.caijing.globaliap.p2561e.C51276c.C51277a;
import com.p683ss.caijing.globaliap.p2561e.C51276c.C51278b;
import com.p683ss.caijing.globaliap.p2563f.C51283b;
import com.p683ss.caijing.globaliap.p2563f.C51284c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.caijing.globaliap.d.b */
final class C51234b implements Runnable {

    /* renamed from: a */
    C51229a f127951a = new C51229a();

    /* renamed from: b */
    Context f127952b;
    /* access modifiers changed from: 0000 */

    /* renamed from: c */
    public Handler f127953c;
    /* access modifiers changed from: 0000 */

    /* renamed from: d */
    public String f127954d;

    /* renamed from: e */
    String f127955e;

    /* renamed from: f */
    boolean f127956f;

    /* renamed from: g */
    Runnable f127957g = new Runnable() {
        /* renamed from: a */
        private void m110153a() {
            C51234b.this.f127951a.mo101756a();
            C51234b.this.f127953c.getLooper().quit();
        }

        /* renamed from: b */
        private ArrayList<C51268j> m110154b() {
            int i;
            ArrayList<C51268j> arrayList = new ArrayList<>();
            String str = null;
            do {
                try {
                    Bundle a = C51234b.this.f127951a.mo101755a("inapp", str);
                    Object obj = a.get("RESPONSE_CODE");
                    if (obj == null) {
                        i = 0;
                    } else if (obj instanceof Integer) {
                        i = ((Integer) obj).intValue();
                    } else if (obj instanceof Long) {
                        i = (int) ((Long) obj).longValue();
                    } else {
                        StringBuilder sb = new StringBuilder("Unexpected type for bundle response code: ");
                        sb.append(obj.getClass().getName());
                        throw new RuntimeException(sb.toString());
                    }
                    if (i == 0 && a.containsKey("INAPP_PURCHASE_ITEM_LIST") && a.containsKey("INAPP_PURCHASE_DATA_LIST")) {
                        if (a.containsKey("INAPP_DATA_SIGNATURE_LIST")) {
                            ArrayList stringArrayList = a.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                            ArrayList stringArrayList2 = a.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                            if (stringArrayList != null && stringArrayList2 != null && !stringArrayList.isEmpty() && stringArrayList.size() == stringArrayList2.size()) {
                                for (int i2 = 0; i2 < stringArrayList.size(); i2++) {
                                    try {
                                        arrayList.add(C51266h.m110206a((String) stringArrayList.get(i2), (String) stringArrayList2.get(i2)));
                                    } catch (C51237c unused) {
                                    }
                                }
                            }
                            str = a.getString("INAPP_CONTINUATION_TOKEN");
                        }
                    }
                    return null;
                } catch (RemoteException e) {
                    C17840a.m43754b(e);
                }
            } while (!TextUtils.isEmpty(str));
            return arrayList;
        }

        public final void run() {
            new StringBuilder("mCheckAllPurchasesRunnable run:").append(Thread.currentThread().getName());
            C51284c.m110260a("caijing_iap_consume_task_start_check", new HashMap());
            ArrayList b = m110154b();
            if (b == null || b.isEmpty()) {
                m110153a();
                C51283b.m110245a(0);
                C51265g.m110204a(C51234b.this.f127954d);
                return;
            }
            new StringBuilder("unconsumedPurchaseList length:").append(b.size());
            C51283b.m110245a(b.size());
            Iterator it = b.iterator();
            while (it.hasNext()) {
                C51268j jVar = (C51268j) it.next();
                C51234b bVar = C51234b.this;
                String str = jVar.f128036m;
                String str2 = jVar.f128035l;
                C51220c cVar = new C51220c();
                if (TextUtils.isEmpty(str2)) {
                    str2 = bVar.f127955e;
                }
                cVar.f127922e = str2;
                cVar.f127918a = jVar.f128032i;
                cVar.f127921d = jVar.f128033j;
                cVar.f127924g = jVar.f128029f;
                cVar.f127925h = jVar.f128031h;
                cVar.f127923f = jVar.f128026c;
                cVar.f127920c = jVar.f128025b;
                if (TextUtils.isEmpty(str)) {
                    str = bVar.f127954d;
                }
                cVar.f127919b = str;
                cVar.f127926i = jVar.f128030g;
                try {
                    Map a = cVar.mo101796a();
                    C51277a aVar = new C51277a();
                    C51234b bVar2 = C51234b.this;
                    StringBuilder sb = new StringBuilder("https://");
                    sb.append(C51160c.m110046a(bVar2.f127952b));
                    sb.append("/gateway-u");
                    C51276c cVar2 = aVar.mo101800a(sb.toString()).mo101801a(a).f128048a;
                    try {
                        C51234b bVar3 = C51234b.this;
                        try {
                            String a2 = C51267i.m110212a(cVar.mo101796a());
                            if (!C51159b.m110045c(bVar3.f127952b, "gpay_ords", C51160c.m110047a(jVar.f128026c))) {
                                C51267i.m110215a(bVar3.f127952b, jVar.f128026c, a2);
                            }
                        } catch (JSONException unused) {
                            C51283b.m110255b("save confirm order failed");
                        }
                        boolean a3 = C51234b.m110149a(C51234b.this.f127952b, cVar2.mo101799a(), jVar);
                        if (C51234b.this.f127956f && a3) {
                            int a4 = C51234b.this.f127951a.mo101754a(jVar.f128026c);
                            HashMap hashMap = new HashMap();
                            hashMap.put("result", Integer.valueOf(a4).toString());
                            C51284c.m110260a("caijing_iap_consume_task_consume_result", hashMap);
                        }
                    } catch (C51275b unused2) {
                        C51283b.m110255b("connection exception");
                    } catch (RemoteException unused3) {
                        C51283b.m110255b("remote exception");
                    }
                } catch (JSONException unused4) {
                    C51283b.m110255b("json exception");
                }
            }
            m110153a();
            C51265g.m110204a(C51234b.this.f127954d);
        }
    };

    /* renamed from: h */
    private C51233b f127958h = new C51233b() {
        /* renamed from: b */
        public final void mo101763b() {
            new StringBuilder("bind failed:").append(Thread.currentThread().getName());
            C51283b.m110254a(false);
            C51265g.m110204a(C51234b.this.f127954d);
        }

        /* renamed from: a */
        public final void mo101762a() {
            new StringBuilder("bind success:").append(Thread.currentThread().getName());
            if (C51234b.this.f127953c != null) {
                C51234b.this.f127953c.post(C51234b.this.f127957g);
            } else {
                C51265g.m110204a(C51234b.this.f127954d);
            }
            C51283b.m110254a(true);
        }
    };

    public final void run() {
        new StringBuilder("GooglePayConsumeTask run:").append(Thread.currentThread().getName());
        Looper.prepare();
        this.f127953c = new Handler(Looper.myLooper());
        C51284c.m110260a("caijing_iap_consume_task_start", new HashMap());
        C51229a aVar = this.f127951a;
        Context context = this.f127952b;
        C51233b bVar = this.f127958h;
        if (aVar.mo101757b()) {
            bVar.mo101762a();
        } else {
            aVar.f127940b = false;
            aVar.f127945g = bVar;
            aVar.f127942d = context.getApplicationContext();
            aVar.f127943e.execute(new C51231a(aVar, 0));
        }
        Looper.loop();
    }

    /* renamed from: a */
    static boolean m110149a(Context context, C51278b bVar, C51268j jVar) {
        boolean z;
        if (bVar.f128049a == 200) {
            try {
                JSONObject jSONObject = new JSONObject(bVar.f128050b);
                new C51220c();
                C51221a a = C51220c.m110130a(jSONObject);
                if (a.mo101747a()) {
                    C51267i.m110216a(context, jVar.f128026c);
                    try {
                        C51283b.m110257b(jVar.f128035l, true, false);
                        z = true;
                    } catch (JSONException unused) {
                        z = true;
                    }
                } else {
                    C51283b.m110257b(jVar.f128035l, false, false);
                    z = false;
                }
                try {
                    if (!a.mo101748b()) {
                        return z;
                    }
                    C51226a.m110139a(jVar.f128028e, jVar.f128027d);
                    C51283b.m110251a(jVar.f128035l, false, "GooglePayConsumeTask");
                    return false;
                } catch (JSONException unused2) {
                }
            } catch (JSONException unused3) {
            }
        }
        z = false;
        C51283b.m110257b(jVar.f128035l, false, true);
        return z;
    }

    C51234b(Context context, String str, String str2, boolean z) {
        this.f127952b = context.getApplicationContext();
        this.f127955e = str;
        this.f127954d = str2;
        this.f127956f = z;
        if (!C51265g.f128023a.contains(str2)) {
            C51265g.f128023a.add(str2);
        }
        C51283b.m110249a(C51160c.m110046a(context), "consume_task");
    }
}
