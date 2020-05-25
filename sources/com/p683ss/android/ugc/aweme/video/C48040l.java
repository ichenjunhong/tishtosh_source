package com.p683ss.android.ugc.aweme.video;

import android.content.Context;
import android.os.Build.VERSION;
import android.telephony.PhoneStateListener;
import android.telephony.SignalStrength;
import android.telephony.TelephonyManager;
import com.p683ss.android.ugc.aweme.experiment.UnReadVideoExperiment;
import com.p683ss.android.ugc.aweme.p1468bu.C24076h;
import com.p683ss.android.ugc.aweme.p1468bu.C24085m;
import com.p683ss.android.ugc.aweme.p1468bu.C24093p;
import com.p683ss.android.ugc.aweme.player.p2053b.C38848a;
import com.p683ss.android.ugc.aweme.utils.C47837dz;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import p001a.C0013i;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52728w;

/* renamed from: com.ss.android.ugc.aweme.video.l */
public final class C48040l extends PhoneStateListener {

    /* renamed from: g */
    public static volatile C48040l f120723g;

    /* renamed from: h */
    public static final C48041a f120724h = new C48041a(null);

    /* renamed from: a */
    public final Context f120725a;

    /* renamed from: b */
    public boolean f120726b;

    /* renamed from: c */
    public TelephonyManager f120727c;

    /* renamed from: d */
    public TelephonyManager f120728d;

    /* renamed from: e */
    public C48042b f120729e;

    /* renamed from: f */
    public C38848a f120730f;

    /* renamed from: i */
    private Object f120731i;

    /* renamed from: j */
    private Method f120732j;

    /* renamed from: k */
    private Method f120733k;

    /* renamed from: l */
    private Method f120734l;

    /* renamed from: m */
    private ExecutorService f120735m;

    /* renamed from: com.ss.android.ugc.aweme.video.l$a */
    public static final class C48041a {
        private C48041a() {
        }

        public /* synthetic */ C48041a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public final synchronized C48040l mo95308a(Context context) {
            C48040l lVar;
            C52711k.m112240b(context, "context");
            if (C48040l.f120723g == null) {
                synchronized (C52728w.m112245a(C48040l.class)) {
                    if (C48040l.f120723g == null) {
                        C48040l.f120723g = new C48040l(context, null);
                    }
                }
            }
            lVar = C48040l.f120723g;
            if (lVar == null) {
                C52711k.m112234a();
            }
            return lVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.video.l$b */
    public final class C48042b extends PhoneStateListener {
        public final void onSignalStrengthsChanged(SignalStrength signalStrength) {
            C52711k.m112240b(signalStrength, "signalStrength");
            try {
                super.onSignalStrengthsChanged(signalStrength);
                C48040l.this.mo95305a(signalStrength);
            } catch (Exception unused) {
            }
        }

        public C48042b(int i) {
            try {
                if (VERSION.SDK_INT >= 22) {
                    C47837dz.m103476a(PhoneStateListener.class, "mSubId", (Object) this, (Object) Integer.valueOf(C47837dz.m103478b(i)));
                    return;
                }
                if (VERSION.SDK_INT > 19 && VERSION.SDK_INT < 22) {
                    C47837dz.m103476a(PhoneStateListener.class, "mSubId", (Object) this, (Object) Long.valueOf(C47837dz.m103474a(i)));
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.video.l$c */
    static final class C48043c<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ C48040l f120737a;

        /* renamed from: b */
        final /* synthetic */ SignalStrength f120738b;

        C48043c(C48040l lVar, SignalStrength signalStrength) {
            this.f120737a = lVar;
            this.f120738b = signalStrength;
        }

        public final /* synthetic */ Object call() {
            this.f120737a.mo95306b(this.f120738b);
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.video.l$d */
    public static final class C48044d {

        /* renamed from: a */
        final /* synthetic */ C48040l f120739a;

        public C48044d(C48040l lVar) {
            this.f120739a = lVar;
        }

        /* renamed from: a */
        public final void mo95311a(C48040l lVar, int i) {
            C52711k.m112240b(lVar, "phoneSignalService");
            try {
                Field declaredField = Class.forName("android.telephony.PhoneStateListener").getDeclaredField("mSubscription");
                C52711k.m112236a((Object) declaredField, "filed");
                declaredField.setAccessible(true);
                declaredField.setInt(lVar, i);
            } catch (Exception unused) {
            }
            C48040l lVar2 = this.f120739a;
            Object systemService = this.f120739a.f120725a.getSystemService("phone_msim");
            if (systemService != null) {
                lVar2.f120728d = (TelephonyManager) systemService;
                TelephonyManager telephonyManager = this.f120739a.f120728d;
                if (telephonyManager != null) {
                    telephonyManager.listen(lVar, UnReadVideoExperiment.BROWSE_RECORD_LIST);
                    return;
                }
                return;
            }
            throw new C52857u("null cannot be cast to non-null type android.telephony.TelephonyManager");
        }
    }

    /* renamed from: a */
    public static final synchronized C48040l m104041a(Context context) {
        C48040l a;
        synchronized (C48040l.class) {
            a = f120724h.mo95308a(context);
        }
        return a;
    }

    public final void onSignalStrengthsChanged(SignalStrength signalStrength) {
        C52711k.m112240b(signalStrength, "signalStrength");
        try {
            super.onSignalStrengthsChanged(signalStrength);
            mo95305a(signalStrength);
        } catch (Exception unused) {
        }
    }

    private C48040l(Context context) {
        this.f120725a = context;
        Object systemService = context.getSystemService("phone");
        if (systemService != null) {
            try {
                this.f120731i = TelephonyManager.class.getMethod("getDefault", new Class[0]).invoke((TelephonyManager) systemService, new Object[0]);
                Object obj = this.f120731i;
                if (obj == null) {
                    C52711k.m112234a();
                }
                C52711k.m112240b(obj, "obMSimTelephonyManager");
                C47837dz.f120397a = obj;
            } catch (Exception unused) {
            }
        } else {
            throw new C52857u("null cannot be cast to non-null type android.telephony.TelephonyManager");
        }
    }

    /* renamed from: a */
    public final void mo95305a(SignalStrength signalStrength) {
        C52711k.m112240b(signalStrength, "signalStrength");
        if (this.f120735m == null) {
            synchronized (C48040l.class) {
                if (this.f120735m == null) {
                    this.f120735m = C24076h.m58898a(C24085m.m58928a(C24093p.SERIAL).mo49845a("signal_service").mo49847a());
                }
            }
        }
        C0013i.m18a((Callable<TResult>) new C48043c<TResult>(this, signalStrength), (Executor) this.f120735m);
    }

    /* JADX WARNING: Removed duplicated region for block: B:135:0x01ce  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x01d6  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x01df A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x006d  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo95306b(android.telephony.SignalStrength r12) {
        /*
            r11 = this;
            java.lang.String r0 = "signalStrength"
            p2628d.p2639f.p2641b.C52711k.m112240b(r12, r0)
            com.ss.android.ugc.aweme.player.b.a r0 = r11.f120730f
            if (r0 != 0) goto L_0x0010
            com.ss.android.ugc.aweme.player.b.a r0 = new com.ss.android.ugc.aweme.player.b.a
            r0.<init>()
            r11.f120730f = r0
        L_0x0010:
            android.content.Context r0 = r11.f120725a
            java.lang.String r1 = "context"
            p2628d.p2639f.p2641b.C52711k.m112240b(r0, r1)
            boolean r1 = com.p683ss.android.ugc.aweme.utils.C47837dz.m103477a(r0)
            r2 = -1
            if (r1 == 0) goto L_0x002b
            com.ss.android.ugc.aweme.utils.dz r1 = com.p683ss.android.ugc.aweme.utils.C47837dz.f120398b
            int r1 = r1.mo95067b(r0)
            if (r1 == r2) goto L_0x002b
            int r0 = com.p683ss.android.ugc.aweme.utils.C47837dz.m103479c(r1)
            goto L_0x0039
        L_0x002b:
            java.lang.String r1 = "phone"
            java.lang.Object r0 = r0.getSystemService(r1)
            if (r0 == 0) goto L_0x01e0
            android.telephony.TelephonyManager r0 = (android.telephony.TelephonyManager) r0
            int r0 = r0.getNetworkType()
        L_0x0039:
            java.lang.reflect.Method r1 = r11.f120732j
            r3 = 0
            if (r1 != 0) goto L_0x0066
            java.lang.String r1 = "android.telephony.SignalStrength"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ Exception -> 0x0065 }
            if (r1 == 0) goto L_0x0066
            java.lang.String r4 = "getDbm"
            java.lang.Class[] r5 = new java.lang.Class[r3]     // Catch:{ Exception -> 0x0065 }
            java.lang.reflect.Method r4 = r1.getMethod(r4, r5)     // Catch:{ Exception -> 0x0065 }
            r11.f120732j = r4     // Catch:{ Exception -> 0x0065 }
            java.lang.String r4 = "getLteDbm"
            java.lang.Class[] r5 = new java.lang.Class[r3]     // Catch:{ Exception -> 0x0065 }
            java.lang.reflect.Method r4 = r1.getMethod(r4, r5)     // Catch:{ Exception -> 0x0065 }
            r11.f120733k = r4     // Catch:{ Exception -> 0x0065 }
            java.lang.String r4 = "getLteRssnr"
            java.lang.Class[] r5 = new java.lang.Class[r3]     // Catch:{ Exception -> 0x0065 }
            java.lang.reflect.Method r1 = r1.getMethod(r4, r5)     // Catch:{ Exception -> 0x0065 }
            r11.f120734l = r1     // Catch:{ Exception -> 0x0065 }
            goto L_0x0066
        L_0x0065:
        L_0x0066:
            java.lang.reflect.Method r1 = r11.f120732j
            r4 = 65535(0xffff, float:9.1834E-41)
            if (r1 == 0) goto L_0x01ce
            r1 = 13
            r5 = 0
            if (r0 == r1) goto L_0x0099
            r1 = 19
            if (r0 == r1) goto L_0x0099
            r1 = 139(0x8b, float:1.95E-43)
            if (r0 != r1) goto L_0x007b
            goto L_0x0099
        L_0x007b:
            java.lang.reflect.Method r0 = r11.f120732j     // Catch:{ Exception -> 0x01c6 }
            if (r0 == 0) goto L_0x0086
            java.lang.Object[] r1 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x01c6 }
            java.lang.Object r0 = r0.invoke(r12, r1)     // Catch:{ Exception -> 0x01c6 }
            goto L_0x0087
        L_0x0086:
            r0 = r5
        L_0x0087:
            if (r0 == 0) goto L_0x0091
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ Exception -> 0x01c6 }
            int r0 = r0.intValue()     // Catch:{ Exception -> 0x01c6 }
            goto L_0x0151
        L_0x0091:
            d.u r12 = new d.u     // Catch:{ Exception -> 0x01c6 }
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Int"
            r12.<init>(r0)     // Catch:{ Exception -> 0x01c6 }
            throw r12     // Catch:{ Exception -> 0x01c6 }
        L_0x0099:
            java.lang.reflect.Method r0 = r11.f120733k     // Catch:{ Exception -> 0x01c6 }
            if (r0 == 0) goto L_0x00ba
            java.lang.reflect.Method r0 = r11.f120733k     // Catch:{ Exception -> 0x01c6 }
            if (r0 == 0) goto L_0x00a8
            java.lang.Object[] r1 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x01c6 }
            java.lang.Object r0 = r0.invoke(r12, r1)     // Catch:{ Exception -> 0x01c6 }
            goto L_0x00a9
        L_0x00a8:
            r0 = r5
        L_0x00a9:
            if (r0 == 0) goto L_0x00b2
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ Exception -> 0x01c6 }
            int r0 = r0.intValue()     // Catch:{ Exception -> 0x01c6 }
            goto L_0x00bd
        L_0x00b2:
            d.u r12 = new d.u     // Catch:{ Exception -> 0x01c6 }
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Int"
            r12.<init>(r0)     // Catch:{ Exception -> 0x01c6 }
            throw r12     // Catch:{ Exception -> 0x01c6 }
        L_0x00ba:
            r0 = 65535(0xffff, float:9.1834E-41)
        L_0x00bd:
            java.lang.reflect.Method r1 = r11.f120734l     // Catch:{ Exception -> 0x01c5 }
            if (r1 == 0) goto L_0x00de
            java.lang.reflect.Method r1 = r11.f120734l     // Catch:{ Exception -> 0x01c5 }
            if (r1 == 0) goto L_0x00cc
            java.lang.Object[] r6 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x01c5 }
            java.lang.Object r1 = r1.invoke(r12, r6)     // Catch:{ Exception -> 0x01c5 }
            goto L_0x00cd
        L_0x00cc:
            r1 = r5
        L_0x00cd:
            if (r1 == 0) goto L_0x00d6
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ Exception -> 0x01c5 }
            int r1 = r1.intValue()     // Catch:{ Exception -> 0x01c5 }
            goto L_0x00e1
        L_0x00d6:
            d.u r12 = new d.u     // Catch:{ Exception -> 0x01c5 }
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.Int"
            r12.<init>(r1)     // Catch:{ Exception -> 0x01c5 }
            throw r12     // Catch:{ Exception -> 0x01c5 }
        L_0x00de:
            r1 = 65535(0xffff, float:9.1834E-41)
        L_0x00e1:
            java.lang.String r6 = android.os.Build.BRAND     // Catch:{ Exception -> 0x01c2 }
            if (r6 == 0) goto L_0x0136
            java.lang.String r6 = android.os.Build.BRAND     // Catch:{ Exception -> 0x01c2 }
            java.lang.String r7 = "Build.BRAND"
            p2628d.p2639f.p2641b.C52711k.m112236a(r6, r7)     // Catch:{ Exception -> 0x01c2 }
            if (r6 == 0) goto L_0x012e
            java.lang.String r6 = r6.toLowerCase()     // Catch:{ Exception -> 0x01c2 }
            java.lang.String r7 = "(this as java.lang.String).toLowerCase()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r6, r7)     // Catch:{ Exception -> 0x01c2 }
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6     // Catch:{ Exception -> 0x01c2 }
            java.lang.String r7 = "huawei"
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7     // Catch:{ Exception -> 0x01c2 }
            r8 = 2
            boolean r6 = p2628d.p2650m.C52830p.m112456b(r6, r7, r3, r8, r5)     // Catch:{ Exception -> 0x01c2 }
            if (r6 != 0) goto L_0x0136
            java.lang.String r6 = android.os.Build.BRAND     // Catch:{ Exception -> 0x01c2 }
            java.lang.String r7 = "Build.BRAND"
            p2628d.p2639f.p2641b.C52711k.m112236a(r6, r7)     // Catch:{ Exception -> 0x01c2 }
            if (r6 == 0) goto L_0x0126
            java.lang.String r6 = r6.toLowerCase()     // Catch:{ Exception -> 0x01c2 }
            java.lang.String r7 = "(this as java.lang.String).toLowerCase()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r6, r7)     // Catch:{ Exception -> 0x01c2 }
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6     // Catch:{ Exception -> 0x01c2 }
            java.lang.String r7 = "honor"
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7     // Catch:{ Exception -> 0x01c2 }
            boolean r6 = p2628d.p2650m.C52830p.m112456b(r6, r7, r3, r8, r5)     // Catch:{ Exception -> 0x01c2 }
            if (r6 != 0) goto L_0x0136
            int r6 = r1 / 10
            r1 = r6
            goto L_0x0136
        L_0x0126:
            d.u r12 = new d.u     // Catch:{ Exception -> 0x01c2 }
            java.lang.String r3 = "null cannot be cast to non-null type java.lang.String"
            r12.<init>(r3)     // Catch:{ Exception -> 0x01c2 }
            throw r12     // Catch:{ Exception -> 0x01c2 }
        L_0x012e:
            d.u r12 = new d.u     // Catch:{ Exception -> 0x01c2 }
            java.lang.String r3 = "null cannot be cast to non-null type java.lang.String"
            r12.<init>(r3)     // Catch:{ Exception -> 0x01c2 }
            throw r12     // Catch:{ Exception -> 0x01c2 }
        L_0x0136:
            r6 = -20
            r7 = 50
            if (r1 > r7) goto L_0x0141
            if (r1 >= r6) goto L_0x013f
            goto L_0x0141
        L_0x013f:
            r4 = r1
            goto L_0x0151
        L_0x0141:
            int r8 = r1 / 10
            r9 = 1
            if (r6 > r8) goto L_0x014c
            int r6 = r1 / 10
            if (r6 > r7) goto L_0x014c
            r6 = 1
            goto L_0x014d
        L_0x014c:
            r6 = 0
        L_0x014d:
            if (r6 != r9) goto L_0x0151
            int r4 = r1 / 10
        L_0x0151:
            r1 = -120(0xffffffffffffff88, float:NaN)
            if (r0 < r1) goto L_0x015c
            r1 = -44
            if (r0 <= r1) goto L_0x015a
            goto L_0x015c
        L_0x015a:
            r12 = r0
            goto L_0x016e
        L_0x015c:
            java.lang.reflect.Method r1 = r11.f120732j     // Catch:{ Exception -> 0x01be }
            if (r1 == 0) goto L_0x0166
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x01be }
            java.lang.Object r5 = r1.invoke(r12, r3)     // Catch:{ Exception -> 0x01be }
        L_0x0166:
            if (r5 == 0) goto L_0x01b6
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch:{ Exception -> 0x01be }
            int r12 = r5.intValue()     // Catch:{ Exception -> 0x01be }
        L_0x016e:
            android.content.Context r0 = r11.f120725a     // Catch:{ Exception -> 0x01b1 }
            if (r0 != 0) goto L_0x0175
            p2628d.p2639f.p2641b.C52711k.m112234a()     // Catch:{ Exception -> 0x01b1 }
        L_0x0175:
            java.lang.String r1 = "android.permission.ACCESS_COARSE_LOCATION"
            int r0 = android.support.p030v4.app.C0636b.m2090a(r0, r1)     // Catch:{ Exception -> 0x01b1 }
            if (r0 != 0) goto L_0x01d1
            android.content.Context r0 = r11.f120725a     // Catch:{ Exception -> 0x01b1 }
            java.util.Map r0 = com.p683ss.android.ugc.aweme.utils.C47837dz.m103480c(r0)     // Catch:{ Exception -> 0x01b1 }
            java.lang.String r1 = "cellId"
            java.lang.Object r1 = r0.get(r1)     // Catch:{ Exception -> 0x01b1 }
            if (r1 == 0) goto L_0x01a9
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ Exception -> 0x01b1 }
            int r1 = r1.intValue()     // Catch:{ Exception -> 0x01b1 }
            java.lang.String r3 = "lac"
            java.lang.Object r0 = r0.get(r3)     // Catch:{ Exception -> 0x01b2 }
            if (r0 == 0) goto L_0x01a1
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ Exception -> 0x01b2 }
            int r0 = r0.intValue()     // Catch:{ Exception -> 0x01b2 }
            r2 = r0
            goto L_0x01d2
        L_0x01a1:
            d.u r0 = new d.u     // Catch:{ Exception -> 0x01b2 }
            java.lang.String r3 = "null cannot be cast to non-null type kotlin.Int"
            r0.<init>(r3)     // Catch:{ Exception -> 0x01b2 }
            throw r0     // Catch:{ Exception -> 0x01b2 }
        L_0x01a9:
            d.u r0 = new d.u     // Catch:{ Exception -> 0x01b1 }
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.Int"
            r0.<init>(r1)     // Catch:{ Exception -> 0x01b1 }
            throw r0     // Catch:{ Exception -> 0x01b1 }
        L_0x01b1:
            r1 = -1
        L_0x01b2:
            r10 = r4
            r4 = r12
            r12 = r10
            goto L_0x01ca
        L_0x01b6:
            d.u r12 = new d.u     // Catch:{ Exception -> 0x01be }
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.Int"
            r12.<init>(r1)     // Catch:{ Exception -> 0x01be }
            throw r12     // Catch:{ Exception -> 0x01be }
        L_0x01be:
            r12 = r4
            r1 = -1
            r4 = r0
            goto L_0x01ca
        L_0x01c2:
            r4 = r0
            r12 = r1
            goto L_0x01c9
        L_0x01c5:
            r4 = r0
        L_0x01c6:
            r12 = 65535(0xffff, float:9.1834E-41)
        L_0x01c9:
            r1 = -1
        L_0x01ca:
            r10 = r4
            r4 = r12
            r12 = r10
            goto L_0x01d2
        L_0x01ce:
            r12 = 65535(0xffff, float:9.1834E-41)
        L_0x01d1:
            r1 = -1
        L_0x01d2:
            com.ss.android.ugc.aweme.player.b.a r0 = r11.f120730f
            if (r0 == 0) goto L_0x01df
            r0.f98945b = r12
            r0.f98946c = r4
            r0.f98944a = r1
            r0.f98947d = r2
            return
        L_0x01df:
            return
        L_0x01e0:
            d.u r12 = new d.u
            java.lang.String r0 = "null cannot be cast to non-null type android.telephony.TelephonyManager"
            r12.<init>(r0)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.video.C48040l.mo95306b(android.telephony.SignalStrength):void");
    }

    public /* synthetic */ C48040l(Context context, C52707g gVar) {
        this(context);
    }
}
