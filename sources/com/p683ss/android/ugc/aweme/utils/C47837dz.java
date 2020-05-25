package com.p683ss.android.ugc.aweme.utils;

import android.content.Context;
import android.os.Build.VERSION;
import android.telephony.TelephonyManager;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.utils.dz */
public final class C47837dz {

    /* renamed from: a */
    public static Object f120397a;

    /* renamed from: b */
    public static final C47837dz f120398b = new C47837dz();

    private C47837dz() {
    }

    /* renamed from: a */
    public static final long m103474a(int i) {
        long j;
        if (VERSION.SDK_INT <= 20) {
            return (long) i;
        }
        try {
            Object a = m103475a("android.telephony.SubscriptionManager", "getSubId", (Class<?>[]) new Class[]{Integer.TYPE}, new Object[]{Integer.valueOf(i)});
            if (!(a instanceof long[])) {
                a = null;
            }
            long[] jArr = (long[]) a;
            if (jArr != null) {
                j = jArr[0];
            } else {
                j = -1;
            }
        } catch (Exception unused) {
            j = (long) i;
        }
        return j;
    }

    /* renamed from: b */
    public static final int m103478b(int i) {
        if (VERSION.SDK_INT <= 21) {
            return i;
        }
        try {
            Object a = m103475a("android.telephony.SubscriptionManager", "getSubId", (Class<?>[]) new Class[]{Integer.TYPE}, new Object[]{Integer.valueOf(i)});
            if (!(a instanceof int[])) {
                a = null;
            }
            int[] iArr = (int[]) a;
            if (iArr != null) {
                i = iArr[0];
            } else {
                i = -1;
            }
        } catch (Exception unused) {
        }
        return i;
    }

    /* renamed from: c */
    public static final int m103479c(int i) {
        int i2;
        Object obj = f120397a;
        if (obj == null) {
            C52711k.m112237a("obMSimTelephonyManager");
        }
        if (obj == null) {
            return -1;
        }
        try {
            Object obj2 = f120397a;
            if (obj2 == null) {
                C52711k.m112237a("obMSimTelephonyManager");
            }
            Class cls = Class.forName(obj2.getClass().getName());
            Class[] clsArr = new Class[1];
            if (VERSION.SDK_INT == 21) {
                clsArr[0] = Long.TYPE;
            } else {
                clsArr[0] = Integer.TYPE;
            }
            Method method = cls.getMethod("getNetworkType", (Class[]) Arrays.copyOf(clsArr, 1));
            Object[] objArr = new Object[1];
            if (VERSION.SDK_INT == 21) {
                objArr[0] = Long.valueOf(m103474a(i));
            } else {
                objArr[0] = Integer.valueOf(m103478b(i));
            }
            Object obj3 = f120397a;
            if (obj3 == null) {
                C52711k.m112237a("obMSimTelephonyManager");
            }
            Object invoke = method.invoke(obj3, Arrays.copyOf(objArr, 1));
            if (invoke != null) {
                i2 = ((Integer) invoke).intValue();
                return i2;
            }
            throw new C52857u("null cannot be cast to non-null type kotlin.Int");
        } catch (Exception unused) {
            i2 = -1;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0086 A[Catch:{ Exception -> 0x00b6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0091 A[Catch:{ Exception -> 0x00b6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x009d A[Catch:{ Exception -> 0x00b6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00a4 A[Catch:{ Exception -> 0x00b6 }] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m103481d(int r9) {
        /*
            java.lang.Object r0 = f120397a
            if (r0 != 0) goto L_0x0009
            java.lang.String r1 = "obMSimTelephonyManager"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x0009:
            r1 = 0
            if (r0 != 0) goto L_0x000d
            return r1
        L_0x000d:
            java.lang.Object r0 = f120397a     // Catch:{ Exception -> 0x00b6 }
            if (r0 != 0) goto L_0x0016
            java.lang.String r2 = "obMSimTelephonyManager"
            p2628d.p2639f.p2641b.C52711k.m112237a(r2)     // Catch:{ Exception -> 0x00b6 }
        L_0x0016:
            java.lang.Class r0 = r0.getClass()     // Catch:{ Exception -> 0x00b6 }
            java.lang.String r0 = r0.getName()     // Catch:{ Exception -> 0x00b6 }
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ Exception -> 0x00b6 }
            r2 = 1
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch:{ Exception -> 0x00b6 }
            int r4 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x00b6 }
            r5 = 21
            r6 = 0
            if (r4 != r5) goto L_0x0031
            java.lang.Class r4 = java.lang.Long.TYPE     // Catch:{ Exception -> 0x00b6 }
            r3[r6] = r4     // Catch:{ Exception -> 0x00b6 }
            goto L_0x0035
        L_0x0031:
            java.lang.Class r4 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x00b6 }
            r3[r6] = r4     // Catch:{ Exception -> 0x00b6 }
        L_0x0035:
            int r4 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x00b6 }
            if (r4 <= r5) goto L_0x0074
            int r4 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x00b6 }
            r7 = 24
            if (r4 >= r7) goto L_0x0074
            java.lang.String r4 = android.os.Build.BRAND     // Catch:{ Exception -> 0x00b6 }
            java.lang.String r7 = "Build.BRAND"
            p2628d.p2639f.p2641b.C52711k.m112236a(r4, r7)     // Catch:{ Exception -> 0x00b6 }
            if (r4 == 0) goto L_0x006c
            java.lang.String r4 = r4.toLowerCase()     // Catch:{ Exception -> 0x00b6 }
            java.lang.String r7 = "(this as java.lang.String).toLowerCase()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r4, r7)     // Catch:{ Exception -> 0x00b6 }
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4     // Catch:{ Exception -> 0x00b6 }
            java.lang.String r7 = "xiaomi"
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7     // Catch:{ Exception -> 0x00b6 }
            r8 = 2
            boolean r4 = p2628d.p2650m.C52830p.m112456b(r4, r7, r6, r8, r1)     // Catch:{ Exception -> 0x00b6 }
            if (r4 == 0) goto L_0x005f
            goto L_0x0074
        L_0x005f:
            java.lang.String r4 = "getNetworkOperatorForSubscription"
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r2)     // Catch:{ Exception -> 0x00b6 }
            java.lang.Class[] r3 = (java.lang.Class[]) r3     // Catch:{ Exception -> 0x00b6 }
            java.lang.reflect.Method r0 = r0.getMethod(r4, r3)     // Catch:{ Exception -> 0x00b6 }
            goto L_0x0080
        L_0x006c:
            d.u r9 = new d.u     // Catch:{ Exception -> 0x00b6 }
            java.lang.String r0 = "null cannot be cast to non-null type java.lang.String"
            r9.<init>(r0)     // Catch:{ Exception -> 0x00b6 }
            throw r9     // Catch:{ Exception -> 0x00b6 }
        L_0x0074:
            java.lang.String r4 = "getNetworkOperator"
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r2)     // Catch:{ Exception -> 0x00b6 }
            java.lang.Class[] r3 = (java.lang.Class[]) r3     // Catch:{ Exception -> 0x00b6 }
            java.lang.reflect.Method r0 = r0.getMethod(r4, r3)     // Catch:{ Exception -> 0x00b6 }
        L_0x0080:
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x00b6 }
            int r4 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x00b6 }
            if (r4 != r5) goto L_0x0091
            long r4 = m103474a(r9)     // Catch:{ Exception -> 0x00b6 }
            java.lang.Long r9 = java.lang.Long.valueOf(r4)     // Catch:{ Exception -> 0x00b6 }
            r3[r6] = r9     // Catch:{ Exception -> 0x00b6 }
            goto L_0x009b
        L_0x0091:
            int r9 = m103478b(r9)     // Catch:{ Exception -> 0x00b6 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ Exception -> 0x00b6 }
            r3[r6] = r9     // Catch:{ Exception -> 0x00b6 }
        L_0x009b:
            if (r0 != 0) goto L_0x00a0
            p2628d.p2639f.p2641b.C52711k.m112234a()     // Catch:{ Exception -> 0x00b6 }
        L_0x00a0:
            java.lang.Object r9 = f120397a     // Catch:{ Exception -> 0x00b6 }
            if (r9 != 0) goto L_0x00a9
            java.lang.String r4 = "obMSimTelephonyManager"
            p2628d.p2639f.p2641b.C52711k.m112237a(r4)     // Catch:{ Exception -> 0x00b6 }
        L_0x00a9:
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r3, r2)     // Catch:{ Exception -> 0x00b6 }
            java.lang.Object r9 = r0.invoke(r9, r2)     // Catch:{ Exception -> 0x00b6 }
            java.lang.String r9 = r9.toString()     // Catch:{ Exception -> 0x00b6 }
            goto L_0x00b7
        L_0x00b6:
            r9 = r1
        L_0x00b7:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.utils.C47837dz.m103481d(int):java.lang.String");
    }

    /* renamed from: a */
    public static final boolean m103477a(Context context) {
        C52711k.m112240b(context, "context");
        Object systemService = context.getSystemService("phone");
        if (systemService != null) {
            try {
                Object invoke = TelephonyManager.class.getMethod("getDefault", new Class[0]).invoke((TelephonyManager) systemService, new Object[0]);
                if (invoke == null) {
                    return false;
                }
                Object invoke2 = Class.forName(invoke.getClass().getName()).getMethod("isMultiSimEnabled", new Class[]{null}).invoke(invoke, new Object[]{null});
                if (invoke2 != null) {
                    return ((Boolean) invoke2).booleanValue();
                }
                throw new C52857u("null cannot be cast to non-null type kotlin.Boolean");
            } catch (Exception unused) {
                return false;
            }
        } else {
            throw new C52857u("null cannot be cast to non-null type android.telephony.TelephonyManager");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0049, code lost:
        if (r6 == null) goto L_0x004b;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.Map<java.lang.String, java.lang.Integer> m103480c(android.content.Context r6) {
        /*
            r0 = 2
            d.n[] r0 = new p2628d.C52847n[r0]
            java.lang.String r1 = "cellId"
            r2 = -1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            d.n r1 = p2628d.C52856t.m112465a(r1, r3)
            r3 = 0
            r0[r3] = r1
            java.lang.String r1 = "lac"
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            d.n r1 = p2628d.C52856t.m112465a(r1, r3)
            r3 = 1
            r0[r3] = r1
            java.util.Map r0 = p2628d.p2629a.C52550ab.m112056b(r0)
            if (r6 == 0) goto L_0x0116
            boolean r1 = r6 instanceof android.app.Activity
            if (r1 == 0) goto L_0x0116
            int r1 = android.os.Build.VERSION.SDK_INT
            r3 = 18
            if (r1 >= r3) goto L_0x0030
            goto L_0x0116
        L_0x0030:
            java.lang.String r1 = "android.permission.ACCESS_COARSE_LOCATION"
            int r1 = android.support.p030v4.app.C0636b.m2090a(r6, r1)
            if (r1 == 0) goto L_0x0039
            return r0
        L_0x0039:
            java.lang.String r1 = "phone"
            java.lang.Object r6 = r6.getSystemService(r1)
            if (r6 == 0) goto L_0x010e
            android.telephony.TelephonyManager r6 = (android.telephony.TelephonyManager) r6
            if (r6 == 0) goto L_0x004b
            java.util.List r6 = r6.getAllCellInfo()     // Catch:{ Exception -> 0x00fa }
            if (r6 != 0) goto L_0x004c
        L_0x004b:
            r6 = 0
        L_0x004c:
            if (r6 == 0) goto L_0x00fa
            int r1 = r6.size()     // Catch:{ Exception -> 0x00fa }
            if (r1 <= 0) goto L_0x00fa
            java.util.Iterator r6 = r6.iterator()     // Catch:{ Exception -> 0x00fa }
            r1 = -1
            r3 = -1
        L_0x005a:
            boolean r4 = r6.hasNext()     // Catch:{ Exception -> 0x00fa }
            if (r4 == 0) goto L_0x00f8
            java.lang.Object r4 = r6.next()     // Catch:{ Exception -> 0x00fa }
            android.telephony.CellInfo r4 = (android.telephony.CellInfo) r4     // Catch:{ Exception -> 0x00fa }
            java.lang.String r5 = "info"
            p2628d.p2639f.p2641b.C52711k.m112236a(r4, r5)     // Catch:{ Exception -> 0x00fa }
            boolean r5 = r4.isRegistered()     // Catch:{ Exception -> 0x00fa }
            if (r5 != 0) goto L_0x0072
            goto L_0x005a
        L_0x0072:
            boolean r1 = r4 instanceof android.telephony.CellInfoLte     // Catch:{ Exception -> 0x00fa }
            if (r1 == 0) goto L_0x0096
            r1 = r4
            android.telephony.CellInfoLte r1 = (android.telephony.CellInfoLte) r1     // Catch:{ Exception -> 0x00fa }
            android.telephony.CellIdentityLte r1 = r1.getCellIdentity()     // Catch:{ Exception -> 0x00fa }
            java.lang.String r3 = "info.cellIdentity"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r3)     // Catch:{ Exception -> 0x00fa }
            int r1 = r1.getCi()     // Catch:{ Exception -> 0x00fa }
            android.telephony.CellInfoLte r4 = (android.telephony.CellInfoLte) r4     // Catch:{ Exception -> 0x00fa }
            android.telephony.CellIdentityLte r3 = r4.getCellIdentity()     // Catch:{ Exception -> 0x00fa }
            java.lang.String r4 = "info.cellIdentity"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r4)     // Catch:{ Exception -> 0x00fa }
            int r3 = r3.getTac()     // Catch:{ Exception -> 0x00fa }
            goto L_0x00f4
        L_0x0096:
            boolean r1 = r4 instanceof android.telephony.CellInfoCdma     // Catch:{ Exception -> 0x00fa }
            if (r1 == 0) goto L_0x00aa
            android.telephony.CellInfoCdma r4 = (android.telephony.CellInfoCdma) r4     // Catch:{ Exception -> 0x00fa }
            android.telephony.CellIdentityCdma r1 = r4.getCellIdentity()     // Catch:{ Exception -> 0x00fa }
            java.lang.String r4 = "info.cellIdentity"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r4)     // Catch:{ Exception -> 0x00fa }
            int r1 = r1.getBasestationId()     // Catch:{ Exception -> 0x00fa }
            goto L_0x00f4
        L_0x00aa:
            boolean r1 = r4 instanceof android.telephony.CellInfoGsm     // Catch:{ Exception -> 0x00fa }
            if (r1 == 0) goto L_0x00ce
            r1 = r4
            android.telephony.CellInfoGsm r1 = (android.telephony.CellInfoGsm) r1     // Catch:{ Exception -> 0x00fa }
            android.telephony.CellIdentityGsm r1 = r1.getCellIdentity()     // Catch:{ Exception -> 0x00fa }
            java.lang.String r3 = "info.cellIdentity"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r3)     // Catch:{ Exception -> 0x00fa }
            int r1 = r1.getCid()     // Catch:{ Exception -> 0x00fa }
            android.telephony.CellInfoGsm r4 = (android.telephony.CellInfoGsm) r4     // Catch:{ Exception -> 0x00fa }
            android.telephony.CellIdentityGsm r3 = r4.getCellIdentity()     // Catch:{ Exception -> 0x00fa }
            java.lang.String r4 = "info.cellIdentity"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r4)     // Catch:{ Exception -> 0x00fa }
            int r3 = r3.getLac()     // Catch:{ Exception -> 0x00fa }
            goto L_0x00f4
        L_0x00ce:
            boolean r1 = r4 instanceof android.telephony.CellInfoWcdma     // Catch:{ Exception -> 0x00fa }
            if (r1 == 0) goto L_0x00f2
            r1 = r4
            android.telephony.CellInfoWcdma r1 = (android.telephony.CellInfoWcdma) r1     // Catch:{ Exception -> 0x00fa }
            android.telephony.CellIdentityWcdma r1 = r1.getCellIdentity()     // Catch:{ Exception -> 0x00fa }
            java.lang.String r3 = "info.cellIdentity"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r3)     // Catch:{ Exception -> 0x00fa }
            int r1 = r1.getCid()     // Catch:{ Exception -> 0x00fa }
            android.telephony.CellInfoWcdma r4 = (android.telephony.CellInfoWcdma) r4     // Catch:{ Exception -> 0x00fa }
            android.telephony.CellIdentityWcdma r3 = r4.getCellIdentity()     // Catch:{ Exception -> 0x00fa }
            java.lang.String r4 = "info.cellIdentity"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r4)     // Catch:{ Exception -> 0x00fa }
            int r3 = r3.getLac()     // Catch:{ Exception -> 0x00fa }
            goto L_0x00f4
        L_0x00f2:
            r1 = -1
            r3 = -1
        L_0x00f4:
            if (r1 != r2) goto L_0x00f8
            goto L_0x005a
        L_0x00f8:
            r2 = r3
            goto L_0x00fb
        L_0x00fa:
            r1 = -1
        L_0x00fb:
            java.lang.String r6 = "cellId"
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.put(r6, r1)
            java.lang.String r6 = "lac"
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            r0.put(r6, r1)
            return r0
        L_0x010e:
            d.u r6 = new d.u
            java.lang.String r0 = "null cannot be cast to non-null type android.telephony.TelephonyManager"
            r6.<init>(r0)
            throw r6
        L_0x0116:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.utils.C47837dz.m103480c(android.content.Context):java.util.Map");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:114:0x020d, code lost:
        if (m103479c(0) != 0) goto L_0x020f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00a5, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r5, (java.lang.Object) "46006") != false) goto L_0x00a7;
     */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x0243 A[Catch:{ Exception -> 0x02bc }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0244 A[Catch:{ Exception -> 0x02bc }] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0152 A[Catch:{ Exception -> 0x02bc }, RETURN] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo95067b(android.content.Context r12) {
        /*
            r11 = this;
            java.lang.String r0 = "context"
            p2628d.p2639f.p2641b.C52711k.m112240b(r12, r0)
            java.lang.Object r0 = f120397a
            if (r0 != 0) goto L_0x000e
            java.lang.String r1 = "obMSimTelephonyManager"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x000e:
            r1 = 0
            if (r0 != 0) goto L_0x0012
            return r1
        L_0x0012:
            java.lang.String r0 = "phone"
            java.lang.Object r0 = r12.getSystemService(r0)
            if (r0 == 0) goto L_0x0315
            android.telephony.TelephonyManager r0 = (android.telephony.TelephonyManager) r0
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 21
            r4 = 1
            if (r2 < r3) goto L_0x02ca
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x02bc }
            r5 = 26
            r6 = -1
            r7 = 0
            r8 = 2
            if (r2 < r5) goto L_0x015b
            int r2 = r0.getNetworkType()     // Catch:{ Exception -> 0x02bc }
            r5 = 13
            if (r2 != r5) goto L_0x015b
            int r2 = m103479c(r1)     // Catch:{ Exception -> 0x02bc }
            if (r2 != r5) goto L_0x015b
            int r2 = m103479c(r4)     // Catch:{ Exception -> 0x02bc }
            if (r2 != r5) goto L_0x015b
            java.lang.String r2 = "context"
            p2628d.p2639f.p2641b.C52711k.m112240b(r12, r2)     // Catch:{ Exception -> 0x02bc }
            java.lang.String r2 = "connectivity"
            java.lang.Object r12 = r12.getSystemService(r2)     // Catch:{ Exception -> 0x02bc }
            if (r12 == 0) goto L_0x0153
            android.net.ConnectivityManager r12 = (android.net.ConnectivityManager) r12     // Catch:{ Exception -> 0x02bc }
            android.net.NetworkInfo r12 = com.p683ss.android.ugc.aweme.utils.C47839ea.m103483a(r12)     // Catch:{ Exception -> 0x02bc }
            java.lang.String r2 = "networkWorkerInfo"
            p2628d.p2639f.p2641b.C52711k.m112236a(r12, r2)     // Catch:{ Exception -> 0x02bc }
            java.lang.String r12 = r12.getExtraInfo()     // Catch:{ Exception -> 0x02bc }
            java.lang.String r2 = m103481d(r1)     // Catch:{ Exception -> 0x02bc }
            java.lang.String r5 = m103481d(r4)     // Catch:{ Exception -> 0x02bc }
            if (r12 == 0) goto L_0x00aa
            r9 = r12
            java.lang.CharSequence r9 = (java.lang.CharSequence) r9     // Catch:{ Exception -> 0x02bc }
            java.lang.String r10 = "3gnet"
            java.lang.CharSequence r10 = (java.lang.CharSequence) r10     // Catch:{ Exception -> 0x02bc }
            boolean r9 = p2628d.p2650m.C52830p.m112456b(r9, r10, r1, r8, r7)     // Catch:{ Exception -> 0x02bc }
            if (r9 != 0) goto L_0x0080
            r9 = r12
            java.lang.CharSequence r9 = (java.lang.CharSequence) r9     // Catch:{ Exception -> 0x02bc }
            java.lang.String r10 = "3gwap"
            java.lang.CharSequence r10 = (java.lang.CharSequence) r10     // Catch:{ Exception -> 0x02bc }
            boolean r9 = p2628d.p2650m.C52830p.m112456b(r9, r10, r1, r8, r7)     // Catch:{ Exception -> 0x02bc }
            if (r9 == 0) goto L_0x00aa
        L_0x0080:
            if (r2 == 0) goto L_0x0095
            java.lang.String r12 = "46001"
            boolean r12 = p2628d.p2639f.p2641b.C52711k.m112239a(r2, r12)     // Catch:{ Exception -> 0x02bc }
            if (r12 != 0) goto L_0x0092
            java.lang.String r12 = "46006"
            boolean r12 = p2628d.p2639f.p2641b.C52711k.m112239a(r2, r12)     // Catch:{ Exception -> 0x02bc }
            if (r12 == 0) goto L_0x0095
        L_0x0092:
            r12 = 0
            goto L_0x0150
        L_0x0095:
            if (r5 == 0) goto L_0x014f
            java.lang.String r12 = "46001"
            boolean r12 = p2628d.p2639f.p2641b.C52711k.m112239a(r5, r12)     // Catch:{ Exception -> 0x02bc }
            if (r12 != 0) goto L_0x00a7
            java.lang.String r12 = "46006"
            boolean r12 = p2628d.p2639f.p2641b.C52711k.m112239a(r5, r12)     // Catch:{ Exception -> 0x02bc }
            if (r12 == 0) goto L_0x014f
        L_0x00a7:
            r12 = 1
            goto L_0x0150
        L_0x00aa:
            if (r12 == 0) goto L_0x00fc
            r9 = r12
            java.lang.CharSequence r9 = (java.lang.CharSequence) r9     // Catch:{ Exception -> 0x02bc }
            java.lang.String r10 = "cmnet"
            java.lang.CharSequence r10 = (java.lang.CharSequence) r10     // Catch:{ Exception -> 0x02bc }
            boolean r9 = p2628d.p2650m.C52830p.m112456b(r9, r10, r1, r8, r7)     // Catch:{ Exception -> 0x02bc }
            if (r9 != 0) goto L_0x00c6
            r9 = r12
            java.lang.CharSequence r9 = (java.lang.CharSequence) r9     // Catch:{ Exception -> 0x02bc }
            java.lang.String r10 = "cmwap"
            java.lang.CharSequence r10 = (java.lang.CharSequence) r10     // Catch:{ Exception -> 0x02bc }
            boolean r9 = p2628d.p2650m.C52830p.m112456b(r9, r10, r1, r8, r7)     // Catch:{ Exception -> 0x02bc }
            if (r9 == 0) goto L_0x00fc
        L_0x00c6:
            if (r2 == 0) goto L_0x00e1
            java.lang.String r12 = "46000"
            boolean r12 = p2628d.p2639f.p2641b.C52711k.m112239a(r2, r12)     // Catch:{ Exception -> 0x02bc }
            if (r12 != 0) goto L_0x0092
            java.lang.String r12 = "46002"
            boolean r12 = p2628d.p2639f.p2641b.C52711k.m112239a(r2, r12)     // Catch:{ Exception -> 0x02bc }
            if (r12 != 0) goto L_0x0092
            java.lang.String r12 = "46007"
            boolean r12 = p2628d.p2639f.p2641b.C52711k.m112239a(r2, r12)     // Catch:{ Exception -> 0x02bc }
            if (r12 == 0) goto L_0x00e1
            goto L_0x0092
        L_0x00e1:
            if (r5 == 0) goto L_0x014f
            java.lang.String r12 = "46000"
            boolean r12 = p2628d.p2639f.p2641b.C52711k.m112239a(r5, r12)     // Catch:{ Exception -> 0x02bc }
            if (r12 != 0) goto L_0x00a7
            java.lang.String r12 = "46002"
            boolean r12 = p2628d.p2639f.p2641b.C52711k.m112239a(r5, r12)     // Catch:{ Exception -> 0x02bc }
            if (r12 != 0) goto L_0x00a7
            java.lang.String r12 = "46007"
            boolean r12 = p2628d.p2639f.p2641b.C52711k.m112239a(r5, r12)     // Catch:{ Exception -> 0x02bc }
            if (r12 == 0) goto L_0x014f
            goto L_0x00a7
        L_0x00fc:
            if (r12 == 0) goto L_0x014f
            r9 = r12
            java.lang.CharSequence r9 = (java.lang.CharSequence) r9     // Catch:{ Exception -> 0x02bc }
            java.lang.String r10 = "ctnet"
            java.lang.CharSequence r10 = (java.lang.CharSequence) r10     // Catch:{ Exception -> 0x02bc }
            boolean r9 = p2628d.p2650m.C52830p.m112456b(r9, r10, r1, r8, r7)     // Catch:{ Exception -> 0x02bc }
            if (r9 != 0) goto L_0x0117
            java.lang.CharSequence r12 = (java.lang.CharSequence) r12     // Catch:{ Exception -> 0x02bc }
            java.lang.String r9 = "ctwap"
            java.lang.CharSequence r9 = (java.lang.CharSequence) r9     // Catch:{ Exception -> 0x02bc }
            boolean r12 = p2628d.p2650m.C52830p.m112456b(r12, r9, r1, r8, r7)     // Catch:{ Exception -> 0x02bc }
            if (r12 == 0) goto L_0x014f
        L_0x0117:
            if (r2 == 0) goto L_0x0133
            java.lang.String r12 = "46003"
            boolean r12 = p2628d.p2639f.p2641b.C52711k.m112239a(r2, r12)     // Catch:{ Exception -> 0x02bc }
            if (r12 != 0) goto L_0x0092
            java.lang.String r12 = "46005"
            boolean r12 = p2628d.p2639f.p2641b.C52711k.m112239a(r2, r12)     // Catch:{ Exception -> 0x02bc }
            if (r12 != 0) goto L_0x0092
            java.lang.String r12 = "46011"
            boolean r12 = p2628d.p2639f.p2641b.C52711k.m112239a(r2, r12)     // Catch:{ Exception -> 0x02bc }
            if (r12 == 0) goto L_0x0133
            goto L_0x0092
        L_0x0133:
            if (r5 == 0) goto L_0x014f
            java.lang.String r12 = "46003"
            boolean r12 = p2628d.p2639f.p2641b.C52711k.m112239a(r5, r12)     // Catch:{ Exception -> 0x02bc }
            if (r12 != 0) goto L_0x00a7
            java.lang.String r12 = "46005"
            boolean r12 = p2628d.p2639f.p2641b.C52711k.m112239a(r5, r12)     // Catch:{ Exception -> 0x02bc }
            if (r12 != 0) goto L_0x00a7
            java.lang.String r12 = "46011"
            boolean r12 = p2628d.p2639f.p2641b.C52711k.m112239a(r5, r12)     // Catch:{ Exception -> 0x02bc }
            if (r12 == 0) goto L_0x014f
            goto L_0x00a7
        L_0x014f:
            r12 = -1
        L_0x0150:
            if (r12 == r6) goto L_0x015b
            return r12
        L_0x0153:
            d.u r12 = new d.u     // Catch:{ Exception -> 0x02bc }
            java.lang.String r2 = "null cannot be cast to non-null type android.net.ConnectivityManager"
            r12.<init>(r2)     // Catch:{ Exception -> 0x02bc }
            throw r12     // Catch:{ Exception -> 0x02bc }
        L_0x015b:
            java.lang.String r12 = "tm"
            p2628d.p2639f.p2641b.C52711k.m112240b(r0, r12)     // Catch:{ Exception -> 0x02bc }
            java.lang.String r12 = android.os.Build.BRAND     // Catch:{ Exception -> 0x02bc }
            java.lang.String r2 = "Build.BRAND"
            p2628d.p2639f.p2641b.C52711k.m112236a(r12, r2)     // Catch:{ Exception -> 0x02bc }
            if (r12 == 0) goto L_0x02b4
            java.lang.String r12 = r12.toLowerCase()     // Catch:{ Exception -> 0x02bc }
            java.lang.String r2 = "(this as java.lang.String).toLowerCase()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r12, r2)     // Catch:{ Exception -> 0x02bc }
            java.lang.CharSequence r12 = (java.lang.CharSequence) r12     // Catch:{ Exception -> 0x02bc }
            java.lang.String r2 = "huawei"
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2     // Catch:{ Exception -> 0x02bc }
            boolean r12 = p2628d.p2650m.C52830p.m112456b(r12, r2, r1, r8, r7)     // Catch:{ Exception -> 0x02bc }
            if (r12 != 0) goto L_0x0236
            java.lang.String r12 = android.os.Build.BRAND     // Catch:{ Exception -> 0x02bc }
            java.lang.String r2 = "Build.BRAND"
            p2628d.p2639f.p2641b.C52711k.m112236a(r12, r2)     // Catch:{ Exception -> 0x02bc }
            if (r12 == 0) goto L_0x022e
            java.lang.String r12 = r12.toLowerCase()     // Catch:{ Exception -> 0x02bc }
            java.lang.String r2 = "(this as java.lang.String).toLowerCase()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r12, r2)     // Catch:{ Exception -> 0x02bc }
            java.lang.CharSequence r12 = (java.lang.CharSequence) r12     // Catch:{ Exception -> 0x02bc }
            java.lang.String r2 = "xiaomi"
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2     // Catch:{ Exception -> 0x02bc }
            boolean r12 = p2628d.p2650m.C52830p.m112456b(r12, r2, r1, r8, r7)     // Catch:{ Exception -> 0x02bc }
            if (r12 != 0) goto L_0x0236
            java.lang.String r12 = android.os.Build.BRAND     // Catch:{ Exception -> 0x02bc }
            java.lang.String r2 = "Build.BRAND"
            p2628d.p2639f.p2641b.C52711k.m112236a(r12, r2)     // Catch:{ Exception -> 0x02bc }
            if (r12 == 0) goto L_0x0226
            java.lang.String r12 = r12.toLowerCase()     // Catch:{ Exception -> 0x02bc }
            java.lang.String r2 = "(this as java.lang.String).toLowerCase()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r12, r2)     // Catch:{ Exception -> 0x02bc }
            java.lang.CharSequence r12 = (java.lang.CharSequence) r12     // Catch:{ Exception -> 0x02bc }
            java.lang.String r2 = "honor"
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2     // Catch:{ Exception -> 0x02bc }
            boolean r12 = p2628d.p2650m.C52830p.m112456b(r12, r2, r1, r8, r7)     // Catch:{ Exception -> 0x02bc }
            if (r12 == 0) goto L_0x01bc
            goto L_0x0236
        L_0x01bc:
            java.lang.String r12 = android.os.Build.BRAND     // Catch:{ Exception -> 0x02bc }
            java.lang.String r2 = "Build.BRAND"
            p2628d.p2639f.p2641b.C52711k.m112236a(r12, r2)     // Catch:{ Exception -> 0x02bc }
            if (r12 == 0) goto L_0x021e
            java.lang.String r12 = r12.toLowerCase()     // Catch:{ Exception -> 0x02bc }
            java.lang.String r2 = "(this as java.lang.String).toLowerCase()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r12, r2)     // Catch:{ Exception -> 0x02bc }
            java.lang.CharSequence r12 = (java.lang.CharSequence) r12     // Catch:{ Exception -> 0x02bc }
            java.lang.String r2 = "oppo"
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2     // Catch:{ Exception -> 0x02bc }
            boolean r12 = p2628d.p2650m.C52830p.m112456b(r12, r2, r1, r8, r7)     // Catch:{ Exception -> 0x02bc }
            if (r12 != 0) goto L_0x0203
            java.lang.String r12 = android.os.Build.BRAND     // Catch:{ Exception -> 0x02bc }
            java.lang.String r2 = "Build.BRAND"
            p2628d.p2639f.p2641b.C52711k.m112236a(r12, r2)     // Catch:{ Exception -> 0x02bc }
            if (r12 == 0) goto L_0x01fb
            java.lang.String r12 = r12.toLowerCase()     // Catch:{ Exception -> 0x02bc }
            java.lang.String r2 = "(this as java.lang.String).toLowerCase()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r12, r2)     // Catch:{ Exception -> 0x02bc }
            java.lang.CharSequence r12 = (java.lang.CharSequence) r12     // Catch:{ Exception -> 0x02bc }
            java.lang.String r2 = "vivo"
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2     // Catch:{ Exception -> 0x02bc }
            boolean r12 = p2628d.p2650m.C52830p.m112456b(r12, r2, r1, r8, r7)     // Catch:{ Exception -> 0x02bc }
            if (r12 == 0) goto L_0x01f9
            goto L_0x0203
        L_0x01f9:
            r12 = -1
            goto L_0x0241
        L_0x01fb:
            d.u r12 = new d.u     // Catch:{ Exception -> 0x02bc }
            java.lang.String r2 = "null cannot be cast to non-null type java.lang.String"
            r12.<init>(r2)     // Catch:{ Exception -> 0x02bc }
            throw r12     // Catch:{ Exception -> 0x02bc }
        L_0x0203:
            int r12 = r0.getNetworkType()     // Catch:{ Exception -> 0x02bc }
            if (r12 != 0) goto L_0x0211
            int r12 = m103479c(r1)     // Catch:{ Exception -> 0x02bc }
            if (r12 == 0) goto L_0x021c
        L_0x020f:
            r12 = 0
            goto L_0x0241
        L_0x0211:
            int r12 = r0.getNetworkType()     // Catch:{ Exception -> 0x02bc }
            int r2 = m103479c(r1)     // Catch:{ Exception -> 0x02bc }
            if (r12 != r2) goto L_0x021c
            goto L_0x020f
        L_0x021c:
            r12 = 1
            goto L_0x0241
        L_0x021e:
            d.u r12 = new d.u     // Catch:{ Exception -> 0x02bc }
            java.lang.String r2 = "null cannot be cast to non-null type java.lang.String"
            r12.<init>(r2)     // Catch:{ Exception -> 0x02bc }
            throw r12     // Catch:{ Exception -> 0x02bc }
        L_0x0226:
            d.u r12 = new d.u     // Catch:{ Exception -> 0x02bc }
            java.lang.String r2 = "null cannot be cast to non-null type java.lang.String"
            r12.<init>(r2)     // Catch:{ Exception -> 0x02bc }
            throw r12     // Catch:{ Exception -> 0x02bc }
        L_0x022e:
            d.u r12 = new d.u     // Catch:{ Exception -> 0x02bc }
            java.lang.String r2 = "null cannot be cast to non-null type java.lang.String"
            r12.<init>(r2)     // Catch:{ Exception -> 0x02bc }
            throw r12     // Catch:{ Exception -> 0x02bc }
        L_0x0236:
            int r12 = r0.getNetworkType()     // Catch:{ Exception -> 0x02bc }
            int r2 = m103479c(r1)     // Catch:{ Exception -> 0x02bc }
            if (r12 != r2) goto L_0x021c
            goto L_0x020f
        L_0x0241:
            if (r12 == r6) goto L_0x0244
            return r12
        L_0x0244:
            java.lang.Object r12 = f120397a     // Catch:{ Exception -> 0x02bc }
            if (r12 != 0) goto L_0x024d
            java.lang.String r2 = "obMSimTelephonyManager"
            p2628d.p2639f.p2641b.C52711k.m112237a(r2)     // Catch:{ Exception -> 0x02bc }
        L_0x024d:
            java.lang.Class r12 = r12.getClass()     // Catch:{ Exception -> 0x02bc }
            java.lang.String r12 = r12.getName()     // Catch:{ Exception -> 0x02bc }
            java.lang.Class r12 = java.lang.Class.forName(r12)     // Catch:{ Exception -> 0x02bc }
            java.lang.Class[] r2 = new java.lang.Class[r4]     // Catch:{ Exception -> 0x02bc }
            int r5 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x02bc }
            if (r5 != r3) goto L_0x0264
            java.lang.Class r5 = java.lang.Long.TYPE     // Catch:{ Exception -> 0x02bc }
            r2[r1] = r5     // Catch:{ Exception -> 0x02bc }
            goto L_0x0268
        L_0x0264:
            java.lang.Class r5 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x02bc }
            r2[r1] = r5     // Catch:{ Exception -> 0x02bc }
        L_0x0268:
            java.lang.String r5 = "getDataState"
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r4)     // Catch:{ Exception -> 0x02bc }
            java.lang.Class[] r2 = (java.lang.Class[]) r2     // Catch:{ Exception -> 0x02bc }
            java.lang.reflect.Method r12 = r12.getMethod(r5, r2)     // Catch:{ Exception -> 0x02bc }
            java.lang.Object[] r2 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x02bc }
            int r5 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x02bc }
            if (r5 != r3) goto L_0x0285
            long r5 = m103474a(r4)     // Catch:{ Exception -> 0x02bc }
            java.lang.Long r3 = java.lang.Long.valueOf(r5)     // Catch:{ Exception -> 0x02bc }
            r2[r1] = r3     // Catch:{ Exception -> 0x02bc }
            goto L_0x028f
        L_0x0285:
            int r3 = m103478b(r4)     // Catch:{ Exception -> 0x02bc }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ Exception -> 0x02bc }
            r2[r1] = r3     // Catch:{ Exception -> 0x02bc }
        L_0x028f:
            java.lang.Object r3 = f120397a     // Catch:{ Exception -> 0x02bc }
            if (r3 != 0) goto L_0x0298
            java.lang.String r5 = "obMSimTelephonyManager"
            p2628d.p2639f.p2641b.C52711k.m112237a(r5)     // Catch:{ Exception -> 0x02bc }
        L_0x0298:
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r4)     // Catch:{ Exception -> 0x02bc }
            java.lang.Object r12 = r12.invoke(r3, r2)     // Catch:{ Exception -> 0x02bc }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r8)     // Catch:{ Exception -> 0x02bc }
            boolean r12 = p2628d.p2639f.p2641b.C52711k.m112239a(r12, r2)     // Catch:{ Exception -> 0x02bc }
            if (r12 != r4) goto L_0x02ab
            return r4
        L_0x02ab:
            if (r12 != 0) goto L_0x02ae
            return r1
        L_0x02ae:
            d.l r12 = new d.l     // Catch:{ Exception -> 0x02bc }
            r12.<init>()     // Catch:{ Exception -> 0x02bc }
            throw r12     // Catch:{ Exception -> 0x02bc }
        L_0x02b4:
            d.u r12 = new d.u     // Catch:{ Exception -> 0x02bc }
            java.lang.String r2 = "null cannot be cast to non-null type java.lang.String"
            r12.<init>(r2)     // Catch:{ Exception -> 0x02bc }
            throw r12     // Catch:{ Exception -> 0x02bc }
        L_0x02bc:
            int r12 = r0.getNetworkType()
            int r0 = m103479c(r1)
            if (r12 != r0) goto L_0x02c8
            goto L_0x02c9
        L_0x02c8:
            r1 = 1
        L_0x02c9:
            return r1
        L_0x02ca:
            java.lang.Object r12 = f120397a     // Catch:{ Exception -> 0x0307 }
            if (r12 != 0) goto L_0x02d3
            java.lang.String r2 = "obMSimTelephonyManager"
            p2628d.p2639f.p2641b.C52711k.m112237a(r2)     // Catch:{ Exception -> 0x0307 }
        L_0x02d3:
            java.lang.Class r12 = r12.getClass()     // Catch:{ Exception -> 0x0307 }
            java.lang.String r12 = r12.getName()     // Catch:{ Exception -> 0x0307 }
            java.lang.Class r12 = java.lang.Class.forName(r12)     // Catch:{ Exception -> 0x0307 }
            java.lang.String r2 = "getPreferredDataSubscription"
            java.lang.Class[] r3 = new java.lang.Class[r1]     // Catch:{ Exception -> 0x0307 }
            java.lang.reflect.Method r12 = r12.getMethod(r2, r3)     // Catch:{ Exception -> 0x0307 }
            java.lang.Object r2 = f120397a     // Catch:{ Exception -> 0x0307 }
            if (r2 != 0) goto L_0x02f0
            java.lang.String r3 = "obMSimTelephonyManager"
            p2628d.p2639f.p2641b.C52711k.m112237a(r3)     // Catch:{ Exception -> 0x0307 }
        L_0x02f0:
            java.lang.Object[] r3 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x0307 }
            java.lang.Object r12 = r12.invoke(r2, r3)     // Catch:{ Exception -> 0x0307 }
            if (r12 == 0) goto L_0x02ff
            java.lang.Integer r12 = (java.lang.Integer) r12     // Catch:{ Exception -> 0x0307 }
            int r12 = r12.intValue()     // Catch:{ Exception -> 0x0307 }
            return r12
        L_0x02ff:
            d.u r12 = new d.u     // Catch:{ Exception -> 0x0307 }
            java.lang.String r2 = "null cannot be cast to non-null type kotlin.Int"
            r12.<init>(r2)     // Catch:{ Exception -> 0x0307 }
            throw r12     // Catch:{ Exception -> 0x0307 }
        L_0x0307:
            int r12 = r0.getNetworkType()
            int r0 = m103479c(r1)
            if (r12 != r0) goto L_0x0313
            goto L_0x0314
        L_0x0313:
            r1 = 1
        L_0x0314:
            return r1
        L_0x0315:
            d.u r12 = new d.u
            java.lang.String r0 = "null cannot be cast to non-null type android.telephony.TelephonyManager"
            r12.<init>(r0)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.utils.C47837dz.mo95067b(android.content.Context):int");
    }

    /* renamed from: a */
    private static Object m103475a(String str, String str2, Class<?>[] clsArr, Object[] objArr) throws Exception {
        C52711k.m112240b(str, "clazz");
        C52711k.m112240b(str2, "method");
        C52711k.m112240b(clsArr, "parameterType");
        C52711k.m112240b(objArr, "parameters");
        Class cls = Class.forName(str);
        Method declaredMethod = cls.getDeclaredMethod(str2, (Class[]) Arrays.copyOf(clsArr, 1));
        C52711k.m112236a((Object) declaredMethod, "m");
        declaredMethod.setAccessible(true);
        return declaredMethod.invoke(cls, Arrays.copyOf(objArr, 1));
    }

    /* renamed from: a */
    public static final void m103476a(Class<?> cls, String str, Object obj, Object obj2) throws Exception {
        C52711k.m112240b(cls, "clazz");
        C52711k.m112240b(str, "field");
        C52711k.m112240b(obj, "key");
        C52711k.m112240b(obj2, "value");
        Field declaredField = cls.getDeclaredField(str);
        C52711k.m112236a((Object) declaredField, "f");
        declaredField.setAccessible(true);
        declaredField.set(obj, obj2);
    }
}
