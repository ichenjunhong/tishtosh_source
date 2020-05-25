package com.p683ss.android.ugc.aweme.sdk.iap.utils;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.text.TextUtils;
import com.android.vending.billing.IInAppBillingService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;

/* renamed from: com.ss.android.ugc.aweme.sdk.iap.utils.b */
public final class C41376b {

    /* renamed from: a */
    public boolean f104902a;

    /* renamed from: b */
    String f104903b = "IabHelper";

    /* renamed from: c */
    public boolean f104904c;

    /* renamed from: d */
    public boolean f104905d;

    /* renamed from: e */
    boolean f104906e;

    /* renamed from: f */
    boolean f104907f;

    /* renamed from: g */
    boolean f104908g;

    /* renamed from: h */
    public volatile boolean f104909h;

    /* renamed from: i */
    String f104910i = "";

    /* renamed from: j */
    public Context f104911j;

    /* renamed from: k */
    IInAppBillingService f104912k;

    /* renamed from: l */
    public ServiceConnection f104913l;

    /* renamed from: m */
    int f104914m;

    /* renamed from: n */
    String f104915n;

    /* renamed from: o */
    String f104916o = null;

    /* renamed from: p */
    C41386d f104917p;

    /* renamed from: q */
    private final Object f104918q = new Object();

    /* renamed from: com.ss.android.ugc.aweme.sdk.iap.utils.b$a */
    public static class C41383a extends Exception {
        public C41383a(String str) {
            super(str);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sdk.iap.utils.b$b */
    public interface C41384b {
        /* renamed from: a */
        void mo83940a(Purchase purchase, C41389c cVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.sdk.iap.utils.b$c */
    public interface C41385c {
    }

    /* renamed from: com.ss.android.ugc.aweme.sdk.iap.utils.b$d */
    public interface C41386d {
        /* renamed from: a */
        void mo83936a(C41389c cVar, Purchase purchase);
    }

    /* renamed from: com.ss.android.ugc.aweme.sdk.iap.utils.b$e */
    public interface C41387e {
        /* renamed from: a */
        void mo83933a(C41389c cVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.sdk.iap.utils.b$f */
    public interface C41388f {
        /* renamed from: a */
        void mo83935a(C41389c cVar, C41390d dVar);
    }

    /* renamed from: a */
    public final void mo83985a() throws C41383a {
        synchronized (this.f104918q) {
            if (this.f104909h) {
                StringBuilder sb = new StringBuilder("Can't dispose because an async operation (");
                sb.append(this.f104910i);
                sb.append(") is in progress.");
                throw new C41383a(sb.toString());
            }
        }
        this.f104904c = false;
        if (!(this.f104913l == null || this.f104912k == null)) {
            try {
                if (this.f104911j != null) {
                    this.f104911j.unbindService(this.f104913l);
                }
            } catch (Exception unused) {
            }
        }
        this.f104905d = true;
        this.f104911j = null;
        this.f104913l = null;
        this.f104912k = null;
        this.f104917p = null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0124  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo83986a(android.app.Activity r17, java.lang.String r18, java.lang.String r19, java.util.List<java.lang.String> r20, int r21, com.p683ss.android.ugc.aweme.sdk.iap.utils.C41376b.C41386d r22, java.lang.String r23) throws com.p683ss.android.ugc.aweme.sdk.iap.utils.C41376b.C41383a {
        /*
            r16 = this;
            r0 = r16
            r7 = r18
            r8 = r19
            r10 = r21
            r15 = r22
            r16.mo83991b()
            java.lang.String r1 = "launchPurchaseFlow"
            r0.mo83988a(r1)
            java.lang.String r1 = "launchPurchaseFlow"
            r0.m91189b(r1)
            java.lang.String r1 = "subs"
            boolean r1 = r8.equals(r1)
            r14 = 0
            if (r1 == 0) goto L_0x0036
            boolean r1 = r0.f104907f
            if (r1 != 0) goto L_0x0036
            com.ss.android.ugc.aweme.sdk.iap.utils.c r1 = new com.ss.android.ugc.aweme.sdk.iap.utils.c
            r2 = -1009(0xfffffffffffffc0f, float:NaN)
            java.lang.String r3 = "Subscriptions are not available."
            r1.<init>(r2, r3)
            r16.mo83992c()
            if (r15 == 0) goto L_0x0035
            r15.mo83936a(r1, r14)
        L_0x0035:
            return
        L_0x0036:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ SendIntentException -> 0x010b, RemoteException -> 0x00ee, Throwable -> 0x00d1 }
            java.lang.String r2 = "Constructing buy intent for "
            r1.<init>(r2)     // Catch:{ SendIntentException -> 0x010b, RemoteException -> 0x00ee, Throwable -> 0x00d1 }
            r1.append(r7)     // Catch:{ SendIntentException -> 0x010b, RemoteException -> 0x00ee, Throwable -> 0x00d1 }
            java.lang.String r2 = ", item type: "
            r1.append(r2)     // Catch:{ SendIntentException -> 0x010b, RemoteException -> 0x00ee, Throwable -> 0x00d1 }
            r1.append(r8)     // Catch:{ SendIntentException -> 0x010b, RemoteException -> 0x00ee, Throwable -> 0x00d1 }
            com.android.vending.billing.IInAppBillingService r1 = r0.f104912k     // Catch:{ SendIntentException -> 0x010b, RemoteException -> 0x00ee, Throwable -> 0x00d1 }
            r2 = 3
            android.content.Context r3 = r0.f104911j     // Catch:{ SendIntentException -> 0x010b, RemoteException -> 0x00ee, Throwable -> 0x00d1 }
            java.lang.String r3 = r3.getPackageName()     // Catch:{ SendIntentException -> 0x010b, RemoteException -> 0x00ee, Throwable -> 0x00d1 }
            r4 = r18
            r5 = r19
            r6 = r23
            android.os.Bundle r1 = r1.getBuyIntent(r2, r3, r4, r5, r6)     // Catch:{ SendIntentException -> 0x010b, RemoteException -> 0x00ee, Throwable -> 0x00d1 }
            int r2 = r0.m91184a(r1)     // Catch:{ SendIntentException -> 0x010b, RemoteException -> 0x00ee, Throwable -> 0x00d1 }
            if (r2 == 0) goto L_0x007f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ SendIntentException -> 0x010b, RemoteException -> 0x00ee, Throwable -> 0x00d1 }
            java.lang.String r3 = "Unable to buy item, Error response: "
            r1.<init>(r3)     // Catch:{ SendIntentException -> 0x010b, RemoteException -> 0x00ee, Throwable -> 0x00d1 }
            java.lang.String r3 = m91187a(r2)     // Catch:{ SendIntentException -> 0x010b, RemoteException -> 0x00ee, Throwable -> 0x00d1 }
            r1.append(r3)     // Catch:{ SendIntentException -> 0x010b, RemoteException -> 0x00ee, Throwable -> 0x00d1 }
            r16.mo83992c()     // Catch:{ SendIntentException -> 0x010b, RemoteException -> 0x00ee, Throwable -> 0x00d1 }
            com.ss.android.ugc.aweme.sdk.iap.utils.c r1 = new com.ss.android.ugc.aweme.sdk.iap.utils.c     // Catch:{ SendIntentException -> 0x010b, RemoteException -> 0x00ee, Throwable -> 0x00d1 }
            java.lang.String r3 = "Unable to buy item"
            r1.<init>(r2, r3)     // Catch:{ SendIntentException -> 0x010b, RemoteException -> 0x00ee, Throwable -> 0x00d1 }
            if (r15 == 0) goto L_0x007e
            r15.mo83936a(r1, r14)     // Catch:{ SendIntentException -> 0x010b, RemoteException -> 0x00ee, Throwable -> 0x00d1 }
        L_0x007e:
            return
        L_0x007f:
            java.lang.String r2 = "BUY_INTENT"
            android.os.Parcelable r1 = r1.getParcelable(r2)     // Catch:{ SendIntentException -> 0x010b, RemoteException -> 0x00ee, Throwable -> 0x00d1 }
            android.app.PendingIntent r1 = (android.app.PendingIntent) r1     // Catch:{ SendIntentException -> 0x010b, RemoteException -> 0x00ee, Throwable -> 0x00d1 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ SendIntentException -> 0x010b, RemoteException -> 0x00ee, Throwable -> 0x00d1 }
            java.lang.String r3 = "Launching buy intent for "
            r2.<init>(r3)     // Catch:{ SendIntentException -> 0x010b, RemoteException -> 0x00ee, Throwable -> 0x00d1 }
            r2.append(r7)     // Catch:{ SendIntentException -> 0x010b, RemoteException -> 0x00ee, Throwable -> 0x00d1 }
            java.lang.String r3 = ". Request code: "
            r2.append(r3)     // Catch:{ SendIntentException -> 0x010b, RemoteException -> 0x00ee, Throwable -> 0x00d1 }
            r2.append(r10)     // Catch:{ SendIntentException -> 0x010b, RemoteException -> 0x00ee, Throwable -> 0x00d1 }
            r0.f104914m = r10     // Catch:{ SendIntentException -> 0x010b, RemoteException -> 0x00ee, Throwable -> 0x00d1 }
            r0.f104917p = r15     // Catch:{ SendIntentException -> 0x010b, RemoteException -> 0x00ee, Throwable -> 0x00d1 }
            r0.f104915n = r8     // Catch:{ SendIntentException -> 0x010b, RemoteException -> 0x00ee, Throwable -> 0x00d1 }
            android.content.IntentSender r9 = r1.getIntentSender()     // Catch:{ SendIntentException -> 0x010b, RemoteException -> 0x00ee, Throwable -> 0x00d1 }
            android.content.Intent r11 = new android.content.Intent     // Catch:{ SendIntentException -> 0x010b, RemoteException -> 0x00ee, Throwable -> 0x00d1 }
            r11.<init>()     // Catch:{ SendIntentException -> 0x010b, RemoteException -> 0x00ee, Throwable -> 0x00d1 }
            r1 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)     // Catch:{ SendIntentException -> 0x010b, RemoteException -> 0x00ee, Throwable -> 0x00d1 }
            int r12 = r2.intValue()     // Catch:{ SendIntentException -> 0x010b, RemoteException -> 0x00ee, Throwable -> 0x00d1 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)     // Catch:{ SendIntentException -> 0x010b, RemoteException -> 0x00ee, Throwable -> 0x00d1 }
            int r13 = r2.intValue()     // Catch:{ SendIntentException -> 0x010b, RemoteException -> 0x00ee, Throwable -> 0x00d1 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ SendIntentException -> 0x010b, RemoteException -> 0x00ee, Throwable -> 0x00d1 }
            int r1 = r1.intValue()     // Catch:{ SendIntentException -> 0x010b, RemoteException -> 0x00ee, Throwable -> 0x00d1 }
            r8 = r17
            r10 = r21
            r2 = r14
            r14 = r1
            r8.startIntentSenderForResult(r9, r10, r11, r12, r13, r14)     // Catch:{ SendIntentException -> 0x00cf, RemoteException -> 0x00cd, Throwable -> 0x00cb }
            return
        L_0x00cb:
            goto L_0x00d2
        L_0x00cd:
            goto L_0x00ef
        L_0x00cf:
            goto L_0x010c
        L_0x00d1:
            r2 = r14
        L_0x00d2:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "UnknownException while launching purchase flow for sku "
            r1.<init>(r3)
            r1.append(r7)
            r16.mo83992c()
            com.ss.android.ugc.aweme.sdk.iap.utils.c r1 = new com.ss.android.ugc.aweme.sdk.iap.utils.c
            r3 = -1008(0xfffffffffffffc10, float:NaN)
            java.lang.String r4 = "unknown error while starting purchase flow"
            r1.<init>(r3, r4)
            if (r15 == 0) goto L_0x00ed
            r15.mo83936a(r1, r2)
        L_0x00ed:
            return
        L_0x00ee:
            r2 = r14
        L_0x00ef:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "RemoteException while launching purchase flow for sku "
            r1.<init>(r3)
            r1.append(r7)
            r16.mo83992c()
            com.ss.android.ugc.aweme.sdk.iap.utils.c r1 = new com.ss.android.ugc.aweme.sdk.iap.utils.c
            r3 = -6004(0xffffffffffffe88c, float:NaN)
            java.lang.String r4 = "Remote exception while starting purchase flow"
            r1.<init>(r3, r4)
            if (r15 == 0) goto L_0x010a
            r15.mo83936a(r1, r2)
        L_0x010a:
            return
        L_0x010b:
            r2 = r14
        L_0x010c:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "SendIntentException while launching purchase flow for sku "
            r1.<init>(r3)
            r1.append(r7)
            r16.mo83992c()
            com.ss.android.ugc.aweme.sdk.iap.utils.c r1 = new com.ss.android.ugc.aweme.sdk.iap.utils.c
            r3 = -1004(0xfffffffffffffc14, float:NaN)
            java.lang.String r4 = "Failed to send intent."
            r1.<init>(r3, r4)
            if (r15 == 0) goto L_0x0127
            r15.mo83936a(r1, r2)
        L_0x0127:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.sdk.iap.utils.C41376b.mo83986a(android.app.Activity, java.lang.String, java.lang.String, java.util.List, int, com.ss.android.ugc.aweme.sdk.iap.utils.b$d, java.lang.String):void");
    }

    /* renamed from: a */
    public final boolean mo83990a(int i, int i2, Intent intent) {
        int i3;
        if (i != this.f104914m) {
            return false;
        }
        mo83991b();
        mo83988a("handleActivityResult");
        mo83992c();
        if (intent == null) {
            C41389c cVar = new C41389c(-1002, "Null data in IAB result");
            if (this.f104917p != null) {
                this.f104917p.mo83936a(cVar, null);
            }
            return true;
        }
        Object obj = intent.getExtras().get("RESPONSE_CODE");
        if (obj == null) {
            i3 = 0;
        } else if (obj instanceof Integer) {
            i3 = ((Integer) obj).intValue();
        } else if (obj instanceof Long) {
            i3 = (int) ((Long) obj).longValue();
        } else {
            obj.getClass().getName();
            StringBuilder sb = new StringBuilder("Unexpected type for intent response code: ");
            sb.append(obj.getClass().getName());
            throw new RuntimeException(sb.toString());
        }
        String stringExtra = intent.getStringExtra("INAPP_PURCHASE_DATA");
        String stringExtra2 = intent.getStringExtra("INAPP_DATA_SIGNATURE");
        if (i2 == -1 && i3 == 0) {
            new StringBuilder("Purchase data: ").append(stringExtra);
            new StringBuilder("Data signature: ").append(stringExtra2);
            new StringBuilder("Extras: ").append(intent.getExtras());
            new StringBuilder("Expected item type: ").append(this.f104915n);
            if (stringExtra == null || stringExtra2 == null) {
                new StringBuilder("Extras: ").append(intent.getExtras().toString());
                C41389c cVar2 = new C41389c(-1008, "IAB returned null purchaseData or dataSignature");
                if (this.f104917p != null) {
                    this.f104917p.mo83936a(cVar2, null);
                }
                return true;
            }
            try {
                Purchase purchase = new Purchase(this.f104915n, stringExtra, stringExtra2);
                String sku = purchase.getSku();
                if (!C41391e.m91209a(this.f104916o, stringExtra, stringExtra2)) {
                    new StringBuilder("Purchase signature verification FAILED for sku ").append(sku);
                    StringBuilder sb2 = new StringBuilder("Signature verification failed for sku ");
                    sb2.append(sku);
                    C41389c cVar3 = new C41389c(-1003, sb2.toString());
                    if (this.f104917p != null) {
                        this.f104917p.mo83936a(cVar3, purchase);
                    }
                    return true;
                } else if (this.f104917p != null) {
                    this.f104917p.mo83936a(new C41389c(0, "Success"), purchase);
                }
            } catch (JSONException unused) {
                C41389c cVar4 = new C41389c(-1002, "Failed to parse purchase data.");
                if (this.f104917p != null) {
                    this.f104917p.mo83936a(cVar4, null);
                }
                return true;
            }
        } else if (i2 == -1) {
            new StringBuilder("Result code was OK but in-app billing response was not OK: ").append(m91187a(i3));
            if (this.f104917p != null) {
                this.f104917p.mo83936a(new C41389c(i3, "Problem purchashing item."), null);
            }
        } else if (i2 == 0) {
            new StringBuilder("Purchase canceled - Response: ").append(m91187a(i3));
            C41389c cVar5 = new C41389c(-1005, "User canceled.");
            if (this.f104917p != null) {
                this.f104917p.mo83936a(cVar5, null);
            }
        } else {
            StringBuilder sb3 = new StringBuilder("Purchase failed. Result code: ");
            sb3.append(Integer.toString(i2));
            sb3.append(". Response: ");
            sb3.append(m91187a(i3));
            C41389c cVar6 = new C41389c(-1006, "Unknown purchase response.");
            if (this.f104917p != null) {
                this.f104917p.mo83936a(cVar6, null);
            }
        }
        return true;
    }

    /* renamed from: a */
    public final void mo83989a(boolean z, List<String> list, List<String> list2, C41388f fVar) throws C41383a {
        final Handler handler = new Handler();
        mo83991b();
        mo83988a("queryInventory");
        m91189b("refresh inventory");
        final List<String> list3 = list;
        final C41388f fVar2 = fVar;
        C413782 r0 = new Runnable(true, null) {
            public final void run() {
                final C41390d dVar;
                final C41389c cVar = new C41389c(0, "Inventory refresh successful.");
                try {
                    dVar = C41376b.this.mo83984a(true, list3, null);
                } catch (C41375a e) {
                    cVar = e.getResult();
                    dVar = null;
                }
                C41376b.this.mo83992c();
                if (!C41376b.this.f104905d && fVar2 != null) {
                    handler.post(new Runnable() {
                        public final void run() {
                            fVar2.mo83935a(cVar, dVar);
                        }
                    });
                }
            }
        };
        new Thread(r0).start();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo83988a(String str) {
        if (!this.f104904c) {
            StringBuilder sb = new StringBuilder("Illegal state for operation (");
            sb.append(str);
            sb.append("): IAB helper is not set up.");
            StringBuilder sb2 = new StringBuilder("IAB helper is not set up. Can't perform operation: ");
            sb2.append(str);
            throw new IllegalStateException(sb2.toString());
        }
    }

    /* renamed from: b */
    public void mo83991b() {
        if (this.f104905d) {
            throw new IllegalStateException("IabHelper was disposed of, so it cannot be used.");
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:2|3|(2:5|6)|7|8) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x001d */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo83992c() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f104918q
            monitor-enter(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x001f }
            java.lang.String r2 = "Ending async operation: "
            r1.<init>(r2)     // Catch:{ all -> 0x001f }
            java.lang.String r2 = r3.f104910i     // Catch:{ all -> 0x001f }
            r1.append(r2)     // Catch:{ all -> 0x001f }
            java.lang.String r1 = ""
            r3.f104910i = r1     // Catch:{ all -> 0x001f }
            r1 = 0
            r3.f104909h = r1     // Catch:{ all -> 0x001f }
            boolean r1 = r3.f104906e     // Catch:{ all -> 0x001f }
            if (r1 == 0) goto L_0x001d
            r3.mo83985a()     // Catch:{ a -> 0x001d }
        L_0x001d:
            monitor-exit(r0)     // Catch:{ all -> 0x001f }
            return
        L_0x001f:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x001f }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.sdk.iap.utils.C41376b.mo83992c():void");
    }

    /* renamed from: b */
    private void m91189b(String str) throws C41383a {
        synchronized (this.f104918q) {
            if (!this.f104909h) {
                this.f104910i = str;
                this.f104909h = true;
                new StringBuilder("Starting async operation: ").append(str);
            } else {
                StringBuilder sb = new StringBuilder("Can't start async operation (");
                sb.append(str);
                sb.append(") because another async operation (");
                sb.append(this.f104910i);
                sb.append(") is in progress.");
                throw new C41383a(sb.toString());
            }
        }
    }

    /* renamed from: a */
    private int m91184a(Bundle bundle) {
        Object obj = bundle.get("RESPONSE_CODE");
        if (obj == null) {
            return 0;
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        if (obj instanceof Long) {
            return (int) ((Long) obj).longValue();
        }
        obj.getClass().getName();
        StringBuilder sb = new StringBuilder("Unexpected type for bundle response code: ");
        sb.append(obj.getClass().getName());
        throw new RuntimeException(sb.toString());
    }

    /* renamed from: a */
    public static String m91187a(int i) {
        String[] split = "0:OK/1:User Canceled/2:Unknown/3:Billing Unavailable/4:Item unavailable/5:Developer Error/6:Error/7:Item Already Owned/8:Item not owned".split("/");
        String[] split2 = "0:OK/-1001:Remote exception during initialization/-1002:Bad response received/-1003:Purchase signature verification failed/-1004:Send intent failed/-1005:User cancelled/-1006:Unknown purchase response/-1007:Missing token/-1008:Unknown error/-1009:Subscriptions not available/-1010:Invalid consumption attempt".split("/");
        if (i <= -1000) {
            int i2 = -1000 - i;
            if (i2 >= 0 && i2 < split2.length) {
                return split2[i2];
            }
            StringBuilder sb = new StringBuilder();
            sb.append(String.valueOf(i));
            sb.append(":Unknown IAB Helper Error");
            return sb.toString();
        } else if (i >= 0 && i < split.length) {
            return split[i];
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(String.valueOf(i));
            sb2.append(":Unknown");
            return sb2.toString();
        }
    }

    public C41376b(Context context, String str) {
        this.f104911j = context.getApplicationContext();
        this.f104916o = str;
    }

    /* renamed from: a */
    public final void mo83987a(Purchase purchase, C41384b bVar) throws C41383a {
        mo83991b();
        mo83988a("consume");
        ArrayList arrayList = new ArrayList();
        arrayList.add(purchase);
        m91188a((List<Purchase>) arrayList, bVar, (C41385c) null);
    }

    /* renamed from: a */
    private int m91185a(C41390d dVar, String str) throws JSONException, RemoteException {
        new StringBuilder("Querying owned items, item type: ").append(str);
        new StringBuilder("Package name: ").append(this.f104911j.getPackageName());
        String str2 = null;
        boolean z = false;
        while (true) {
            new StringBuilder("Calling getPurchases with continuation token: ").append(str2);
            Bundle purchases = this.f104912k.getPurchases(3, this.f104911j.getPackageName(), str, str2);
            int a = m91184a(purchases);
            new StringBuilder("Owned items response: ").append(String.valueOf(a));
            if (a != 0) {
                new StringBuilder("getPurchases() failed: ").append(m91187a(a));
                return a;
            } else if (purchases.containsKey("INAPP_PURCHASE_ITEM_LIST") && purchases.containsKey("INAPP_PURCHASE_DATA_LIST") && purchases.containsKey("INAPP_DATA_SIGNATURE_LIST")) {
                ArrayList stringArrayList = purchases.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                ArrayList stringArrayList2 = purchases.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                ArrayList stringArrayList3 = purchases.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                boolean z2 = z;
                for (int i = 0; i < stringArrayList2.size(); i++) {
                    String str3 = (String) stringArrayList2.get(i);
                    String str4 = (String) stringArrayList3.get(i);
                    String str5 = (String) stringArrayList.get(i);
                    if (C41391e.m91209a(this.f104916o, str3, str4)) {
                        new StringBuilder("Sku is owned: ").append(str5);
                        Purchase purchase = new Purchase(str, str3, str4);
                        if (TextUtils.isEmpty(purchase.getToken())) {
                            new StringBuilder("Purchase data: ").append(str3);
                        }
                        dVar.mo84004a(purchase);
                    } else {
                        new StringBuilder("   Purchase data: ").append(str3);
                        new StringBuilder("   Signature: ").append(str4);
                        z2 = true;
                    }
                }
                str2 = purchases.getString("INAPP_CONTINUATION_TOKEN");
                new StringBuilder("Continuation token: ").append(str2);
                if (!TextUtils.isEmpty(str2)) {
                    z = z2;
                } else if (z2) {
                    return -1003;
                } else {
                    return 0;
                }
            }
        }
        return -1002;
    }

    /* renamed from: a */
    private void m91188a(List<Purchase> list, C41384b bVar, C41385c cVar) throws C41383a {
        final Handler handler = new Handler();
        m91189b("consume");
        final List<Purchase> list2 = list;
        final C41384b bVar2 = bVar;
        C413803 r0 = new Runnable(null) {
            public final void run() {
                final ArrayList arrayList = new ArrayList();
                for (Purchase purchase : list2) {
                    try {
                        C41376b bVar = C41376b.this;
                        bVar.mo83991b();
                        bVar.mo83988a("consume");
                        if (purchase.getItemType().equals("inapp")) {
                            String token = purchase.getToken();
                            String sku = purchase.getSku();
                            if (token == null || token.equals("")) {
                                StringBuilder sb = new StringBuilder("Can't consume ");
                                sb.append(sku);
                                sb.append(". No token.");
                                StringBuilder sb2 = new StringBuilder("PurchaseInfo is missing token for sku: ");
                                sb2.append(sku);
                                sb2.append(" ");
                                sb2.append(purchase);
                                throw new C41375a(-1007, sb2.toString());
                            }
                            StringBuilder sb3 = new StringBuilder("Consuming sku: ");
                            sb3.append(sku);
                            sb3.append(", token: ");
                            sb3.append(token);
                            int consumePurchase = bVar.f104912k.consumePurchase(3, bVar.f104911j.getPackageName(), token);
                            if (consumePurchase == 0) {
                                new StringBuilder("Successfully consumed sku: ").append(sku);
                                StringBuilder sb4 = new StringBuilder("Successful consume of sku ");
                                sb4.append(purchase.getSku());
                                arrayList.add(new C41389c(0, sb4.toString()));
                            } else {
                                StringBuilder sb5 = new StringBuilder("Error consuming consuming sku ");
                                sb5.append(sku);
                                sb5.append(". ");
                                sb5.append(C41376b.m91187a(consumePurchase));
                                StringBuilder sb6 = new StringBuilder("Error consuming sku ");
                                sb6.append(sku);
                                throw new C41375a(consumePurchase, sb6.toString());
                            }
                        } else {
                            StringBuilder sb7 = new StringBuilder("Items of type '");
                            sb7.append(purchase.getItemType());
                            sb7.append("' can't be consumed.");
                            throw new C41375a(-1010, sb7.toString());
                        }
                    } catch (RemoteException e) {
                        StringBuilder sb8 = new StringBuilder("Remote exception while consuming. PurchaseInfo: ");
                        sb8.append(purchase);
                        throw new C41375a(-6004, sb8.toString(), e);
                    } catch (C41375a e2) {
                        arrayList.add(e2.getResult());
                    }
                }
                C41376b.this.mo83992c();
                if (!C41376b.this.f104905d && bVar2 != null) {
                    handler.post(new Runnable() {
                        public final void run() {
                            bVar2.mo83940a((Purchase) list2.get(0), (C41389c) arrayList.get(0));
                        }
                    });
                }
                if (!C41376b.this.f104905d && null != null) {
                    handler.post(new Runnable() {
                        public final void run() {
                        }
                    });
                }
            }
        };
        new Thread(r0).start();
    }

    /* renamed from: a */
    private int m91186a(String str, C41390d dVar, List<String> list) throws RemoteException, JSONException {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(dVar.mo84003a(str));
        if (list != null) {
            for (String str2 : list) {
                if (!arrayList.contains(str2)) {
                    arrayList.add(str2);
                }
            }
        }
        if (arrayList.size() == 0) {
            return 0;
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size() / 20;
        int size2 = arrayList.size() % 20;
        for (int i = 0; i < size; i++) {
            ArrayList arrayList3 = new ArrayList();
            int i2 = i * 20;
            for (String add : arrayList.subList(i2, i2 + 20)) {
                arrayList3.add(add);
            }
            arrayList2.add(arrayList3);
        }
        if (size2 != 0) {
            ArrayList arrayList4 = new ArrayList();
            int i3 = size * 20;
            for (String add2 : arrayList.subList(i3, size2 + i3)) {
                arrayList4.add(add2);
            }
            arrayList2.add(arrayList4);
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            ArrayList arrayList5 = (ArrayList) it.next();
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("ITEM_ID_LIST", arrayList5);
            Bundle skuDetails = this.f104912k.getSkuDetails(3, this.f104911j.getPackageName(), str, bundle);
            if (!skuDetails.containsKey("DETAILS_LIST")) {
                int a = m91184a(skuDetails);
                if (a == 0) {
                    return -1002;
                }
                new StringBuilder("getSkuDetails() failed: ").append(m91187a(a));
                return a;
            }
            Iterator it2 = skuDetails.getStringArrayList("DETAILS_LIST").iterator();
            while (it2.hasNext()) {
                C41392f fVar = new C41392f(str, (String) it2.next());
                new StringBuilder("Got sku details: ").append(fVar);
                dVar.mo84005a(fVar);
            }
        }
        return 0;
    }

    /* renamed from: a */
    public final C41390d mo83984a(boolean z, List<String> list, List<String> list2) throws C41375a {
        mo83991b();
        mo83988a("queryInventory");
        try {
            C41390d dVar = new C41390d();
            int a = m91185a(dVar, "inapp");
            if (a == 0) {
                if (z) {
                    int a2 = m91186a("inapp", dVar, list);
                    if (a2 != 0) {
                        throw new C41375a(a2, "Error refreshing inventory (querying prices of items).");
                    }
                }
                if (this.f104907f) {
                    int a3 = m91185a(dVar, "subs");
                    if (a3 != 0) {
                        throw new C41375a(a3, "Error refreshing inventory (querying owned subscriptions).");
                    } else if (z) {
                        int a4 = m91186a("subs", dVar, list2);
                        if (a4 != 0) {
                            throw new C41375a(a4, "Error refreshing inventory (querying prices of subscriptions).");
                        }
                    }
                }
                return dVar;
            }
            throw new C41375a(a, "Error refreshing inventory (querying owned items).");
        } catch (RemoteException e) {
            throw new C41375a(-6004, "Remote exception while refreshing inventory.", e);
        } catch (JSONException e2) {
            throw new C41375a(-1002, "Error parsing JSON response while refreshing inventory.", e2);
        } catch (Exception e3) {
            throw new C41375a(-1008, "unknow error", e3);
        }
    }
}
