package com.google.firebase.analytics.connector;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.C15464q;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.android.gms.measurement.internal.C17005ay;
import com.google.android.gms.measurement.internal.C17128m;
import com.google.firebase.C17844a;
import com.google.firebase.C17855b;
import com.google.firebase.analytics.connector.internal.C17854b;
import com.google.firebase.p1072a.C17848d;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.firebase.analytics.connector.b */
public class C17850b implements C17849a {

    /* renamed from: a */
    static volatile C17849a f49612a;

    /* renamed from: b */
    final AppMeasurement f49613b;

    /* renamed from: c */
    final Map<String, Object> f49614c = new ConcurrentHashMap();

    private C17850b(AppMeasurement appMeasurement) {
        C15464q.m32123a(appMeasurement);
        this.f49613b = appMeasurement;
    }

    /* renamed from: a */
    public static C17849a m43777a(C17855b bVar, Context context, C17848d dVar) {
        C15464q.m32123a(bVar);
        C15464q.m32123a(context);
        C15464q.m32123a(dVar);
        C15464q.m32123a(context.getApplicationContext());
        if (f49612a == null) {
            synchronized (C17850b.class) {
                if (f49612a == null) {
                    Bundle bundle = new Bundle(1);
                    if (bVar.mo34683e()) {
                        dVar.mo34669a(C17844a.class, C17851c.f49615a, C17852d.f49616a);
                        bundle.putBoolean("dataCollectionDefaultEnabled", bVar.mo34682d());
                    }
                    C17128m mVar = new C17128m(0, 0, true, null, null, null, bundle);
                    f49612a = new C17850b(C17005ay.m41256a(context, mVar).f47969h);
                }
            }
        }
        return f49612a;
    }

    /* renamed from: a */
    public final void mo34674a(String str, String str2, Bundle bundle) {
        boolean z;
        if (C17854b.m43782a(str)) {
            boolean z2 = true;
            if (!C17854b.f49618a.contains(str2)) {
                if (bundle != null) {
                    Iterator it = C17854b.f49619b.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (bundle.containsKey((String) it.next())) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if ("_cmp".equals(str2)) {
                    if (C17854b.m43782a(str) && bundle != null) {
                        Iterator it2 = C17854b.f49619b.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                if (bundle.containsKey((String) it2.next())) {
                                    break;
                                }
                            } else {
                                char c = 65535;
                                int hashCode = str.hashCode();
                                if (hashCode != 101200) {
                                    if (hashCode != 101230) {
                                        if (hashCode == 3142703 && str.equals("fiam")) {
                                            c = 2;
                                        }
                                    } else if (str.equals("fdl")) {
                                        c = 1;
                                    }
                                } else if (str.equals("fcm")) {
                                    c = 0;
                                }
                                switch (c) {
                                    case 0:
                                        bundle.putString("_cis", "fcm_integration");
                                        break;
                                    case 1:
                                        bundle.putString("_cis", "fdl_integration");
                                        break;
                                    case 2:
                                        bundle.putString("_cis", "fiam_integration");
                                        break;
                                }
                            }
                        }
                    }
                    z2 = false;
                }
                if (z2) {
                    this.f49613b.logEventInternal(str, str2, bundle);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0030, code lost:
        if (r5.equals("fiam") == false) goto L_0x0066;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0063, code lost:
        if (r5.equals("frc") == false) goto L_0x0066;
     */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0068 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0069  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo34675a(java.lang.String r5, java.lang.String r6, java.lang.Object r7) {
        /*
            r4 = this;
            boolean r0 = com.google.firebase.analytics.connector.internal.C17854b.m43782a(r5)
            if (r0 != 0) goto L_0x0007
            return
        L_0x0007:
            java.lang.String r0 = "_ce1"
            boolean r0 = r0.equals(r6)
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0055
            java.lang.String r0 = "_ce2"
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L_0x001a
            goto L_0x0055
        L_0x001a:
            java.lang.String r0 = "_ln"
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L_0x0033
            java.lang.String r0 = "fcm"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L_0x0065
            java.lang.String r0 = "fiam"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0066
            goto L_0x0065
        L_0x0033:
            java.util.List<java.lang.String> r0 = com.google.firebase.analytics.connector.internal.C17854b.f49620c
            boolean r0 = r0.contains(r6)
            if (r0 == 0) goto L_0x003c
            goto L_0x0066
        L_0x003c:
            java.util.List<java.lang.String> r0 = com.google.firebase.analytics.connector.internal.C17854b.f49621d
            java.util.Iterator r0 = r0.iterator()
        L_0x0042:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0065
            java.lang.Object r3 = r0.next()
            java.lang.String r3 = (java.lang.String) r3
            boolean r3 = r6.matches(r3)
            if (r3 == 0) goto L_0x0042
            goto L_0x0066
        L_0x0055:
            java.lang.String r0 = "fcm"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L_0x0065
            java.lang.String r0 = "frc"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0066
        L_0x0065:
            r2 = 1
        L_0x0066:
            if (r2 != 0) goto L_0x0069
            return
        L_0x0069:
            com.google.android.gms.measurement.AppMeasurement r0 = r4.f49613b
            r0.mo32790a(r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.analytics.connector.C17850b.mo34675a(java.lang.String, java.lang.String, java.lang.Object):void");
    }
}
