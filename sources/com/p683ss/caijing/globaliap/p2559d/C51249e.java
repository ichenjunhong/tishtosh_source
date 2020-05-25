package com.p683ss.caijing.globaliap.p2559d;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import com.android.vending.billing.IInAppBillingService;
import com.android.vending.billing.IInAppBillingService.Stub;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.ss.caijing.globaliap.d.e */
public final class C51249e {

    /* renamed from: a */
    IInAppBillingService f127989a;

    /* renamed from: b */
    C51256b f127990b;

    /* renamed from: c */
    C51261g f127991c;

    /* renamed from: d */
    C51259e f127992d;

    /* renamed from: e */
    C51258d f127993e;

    /* renamed from: f */
    C51260f f127994f;

    /* renamed from: g */
    C51255a f127995g;

    /* renamed from: h */
    C51257c f127996h;

    /* renamed from: i */
    Context f127997i;

    /* renamed from: j */
    volatile boolean f127998j;

    /* renamed from: k */
    volatile boolean f127999k;

    /* renamed from: l */
    volatile boolean f128000l;

    /* renamed from: m */
    volatile boolean f128001m;

    /* renamed from: n */
    volatile boolean f128002n;

    /* renamed from: o */
    volatile boolean f128003o;

    /* renamed from: p */
    volatile boolean f128004p;

    /* renamed from: q */
    C51262h f128005q = new C51262h(this, 0);

    /* renamed from: r */
    private ServiceConnection f128006r = new ServiceConnection() {
        public final void onServiceDisconnected(ComponentName componentName) {
            if (!C51249e.this.f127999k) {
                C51249e.this.f127990b.mo101739b();
                C51249e.this.f127998j = false;
            }
        }

        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (!C51249e.this.f127999k) {
                C51249e.this.f127989a = Stub.asInterface(iBinder);
                C51249e.this.f127990b.mo101738a();
                C51249e.this.f127998j = true;
            }
        }
    };

    /* renamed from: com.ss.caijing.globaliap.d.e$a */
    public interface C51255a {
    }

    /* renamed from: com.ss.caijing.globaliap.d.e$b */
    public interface C51256b {
        /* renamed from: a */
        void mo101738a();

        /* renamed from: b */
        void mo101739b();
    }

    /* renamed from: com.ss.caijing.globaliap.d.e$c */
    public interface C51257c {
        /* renamed from: a */
        void mo101742a(Map<String, Integer> map);
    }

    /* renamed from: com.ss.caijing.globaliap.d.e$d */
    public interface C51258d {
        /* renamed from: a */
        void mo101776a();

        /* renamed from: a */
        void mo101777a(int i);
    }

    /* renamed from: com.ss.caijing.globaliap.d.e$e */
    public interface C51259e {
        /* renamed from: a */
        void mo101771a();

        /* renamed from: a */
        void mo101772a(Bundle bundle);
    }

    /* renamed from: com.ss.caijing.globaliap.d.e$f */
    public interface C51260f {
        /* renamed from: a */
        void mo101778a(int i);

        /* renamed from: a */
        void mo101779a(C51268j jVar);
    }

    /* renamed from: com.ss.caijing.globaliap.d.e$g */
    public interface C51261g {
        /* renamed from: a */
        void mo101740a();

        /* renamed from: a */
        void mo101741a(Bundle bundle);
    }

    /* renamed from: com.ss.caijing.globaliap.d.e$h */
    static class C51262h extends Handler {

        /* renamed from: a */
        private WeakReference<C51249e> f128019a;

        private C51262h(C51249e eVar) {
            this.f128019a = new WeakReference<>(eVar);
        }

        public final void handleMessage(Message message) {
            C51249e eVar = (C51249e) this.f128019a.get();
            if (eVar != null && !eVar.f127999k) {
                switch (message.what) {
                    case 100:
                        if (eVar.f127991c != null) {
                            if (message.arg1 == 0) {
                                eVar.f127991c.mo101741a((Bundle) message.obj);
                                return;
                            }
                            eVar.f127991c.mo101740a();
                            return;
                        }
                        break;
                    case BaseNotice.HASHTAG /*101*/:
                        if (eVar.f127992d != null) {
                            if (message.arg1 == 0) {
                                eVar.f127992d.mo101772a((Bundle) message.obj);
                                return;
                            }
                            eVar.f127992d.mo101771a();
                            return;
                        }
                        break;
                    case 102:
                        if (eVar.f127993e != null) {
                            if (message.arg1 == 0) {
                                eVar.f127993e.mo101777a(message.arg2);
                                return;
                            }
                            eVar.f127993e.mo101776a();
                            return;
                        }
                        break;
                    case 103:
                        int i = message.arg2;
                        if (eVar.f127994f != null) {
                            if (message.arg1 == 0) {
                                eVar.f127994f.mo101779a((C51268j) message.obj);
                                return;
                            }
                            eVar.f127994f.mo101778a(i);
                            return;
                        }
                        break;
                    case 104:
                        if (eVar.f127995g != null && message.arg1 != 0) {
                            return;
                        }
                        return;
                    case 105:
                        if (eVar.f127996h != null) {
                            eVar.f127996h.mo101742a((Map) message.obj);
                            break;
                        }
                        break;
                }
            }
        }

        /* synthetic */ C51262h(C51249e eVar, byte b) {
            this(eVar);
        }
    }

    /* renamed from: com.ss.caijing.globaliap.d.e$i */
    static class C51263i implements Runnable {

        /* renamed from: a */
        private WeakReference<C51249e> f128020a;

        /* renamed from: b */
        private String f128021b;

        /* renamed from: c */
        private String f128022c;

        /* JADX WARNING: Code restructure failed: missing block: B:40:0x00ab, code lost:
            r3 = com.p683ss.caijing.globaliap.p2559d.C51266h.m110206a((java.lang.String) r6.get(r8), (java.lang.String) r7.get(r8));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:41:0x00ad, code lost:
            r5 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
            com.google.p1067c.p1068a.p1069a.p1070a.p1071a.C17840a.m43754b(r5);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:54:0x00d1, code lost:
            r1.sendMessage(m110201a(r1, 21));
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r11 = this;
                java.lang.ref.WeakReference<com.ss.caijing.globaliap.d.e> r0 = r11.f128020a
                java.lang.Object r0 = r0.get()
                com.ss.caijing.globaliap.d.e r0 = (com.p683ss.caijing.globaliap.p2559d.C51249e) r0
                if (r0 == 0) goto L_0x0123
                com.android.vending.billing.IInAppBillingService r1 = r0.f127989a
                if (r1 == 0) goto L_0x0123
                com.ss.caijing.globaliap.d.e$h r1 = r0.f128005q
                if (r1 != 0) goto L_0x0014
                goto L_0x0123
            L_0x0014:
                com.ss.caijing.globaliap.d.e$h r1 = r0.f128005q
                r2 = 0
                r3 = r2
            L_0x0018:
                r4 = 0
                com.android.vending.billing.IInAppBillingService r5 = r0.f127989a     // Catch:{ RemoteException -> 0x00c5 }
                r6 = 3
                android.content.Context r7 = r0.f127997i     // Catch:{ RemoteException -> 0x00c5 }
                java.lang.String r7 = r7.getPackageName()     // Catch:{ RemoteException -> 0x00c5 }
                java.lang.String r8 = r11.f128022c     // Catch:{ RemoteException -> 0x00c5 }
                android.os.Bundle r2 = r5.getPurchases(r6, r7, r8, r2)     // Catch:{ RemoteException -> 0x00c5 }
                java.lang.String r5 = "RESPONSE_CODE"
                java.lang.Object r5 = r2.get(r5)     // Catch:{ RemoteException -> 0x00c5 }
                if (r5 != 0) goto L_0x0032
                r5 = 0
                goto L_0x0048
            L_0x0032:
                boolean r6 = r5 instanceof java.lang.Integer     // Catch:{ RemoteException -> 0x00c5 }
                if (r6 == 0) goto L_0x003d
                java.lang.Integer r5 = (java.lang.Integer) r5     // Catch:{ RemoteException -> 0x00c5 }
                int r5 = r5.intValue()     // Catch:{ RemoteException -> 0x00c5 }
                goto L_0x0048
            L_0x003d:
                boolean r6 = r5 instanceof java.lang.Long     // Catch:{ RemoteException -> 0x00c5 }
                if (r6 == 0) goto L_0x00db
                java.lang.Long r5 = (java.lang.Long) r5     // Catch:{ RemoteException -> 0x00c5 }
                long r5 = r5.longValue()     // Catch:{ RemoteException -> 0x00c5 }
                int r5 = (int) r5     // Catch:{ RemoteException -> 0x00c5 }
            L_0x0048:
                if (r5 == 0) goto L_0x0053
                android.os.Message r2 = m110201a(r1, r5)     // Catch:{ RemoteException -> 0x00c5 }
                r1.sendMessage(r2)     // Catch:{ RemoteException -> 0x00c5 }
                goto L_0x00f7
            L_0x0053:
                java.lang.String r5 = "INAPP_PURCHASE_ITEM_LIST"
                boolean r5 = r2.containsKey(r5)     // Catch:{ RemoteException -> 0x00c5 }
                if (r5 == 0) goto L_0x00d1
                java.lang.String r5 = "INAPP_PURCHASE_DATA_LIST"
                boolean r5 = r2.containsKey(r5)     // Catch:{ RemoteException -> 0x00c5 }
                if (r5 == 0) goto L_0x00d1
                java.lang.String r5 = "INAPP_DATA_SIGNATURE_LIST"
                boolean r5 = r2.containsKey(r5)     // Catch:{ RemoteException -> 0x00c5 }
                if (r5 != 0) goto L_0x006d
                goto L_0x00d1
            L_0x006d:
                java.lang.String r5 = "INAPP_PURCHASE_ITEM_LIST"
                java.util.ArrayList r5 = r2.getStringArrayList(r5)     // Catch:{ RemoteException -> 0x00c5 }
                java.lang.String r6 = "INAPP_PURCHASE_DATA_LIST"
                java.util.ArrayList r6 = r2.getStringArrayList(r6)     // Catch:{ RemoteException -> 0x00c5 }
                java.lang.String r7 = "INAPP_DATA_SIGNATURE_LIST"
                java.util.ArrayList r7 = r2.getStringArrayList(r7)     // Catch:{ RemoteException -> 0x00c5 }
                if (r5 == 0) goto L_0x00c7
                if (r6 == 0) goto L_0x00c7
                if (r7 != 0) goto L_0x0086
                goto L_0x00c7
            L_0x0086:
                r8 = 0
            L_0x0087:
                int r9 = r6.size()     // Catch:{ RemoteException -> 0x00c5 }
                if (r8 >= r9) goto L_0x00b5
                java.lang.Object r9 = r5.get(r8)     // Catch:{ RemoteException -> 0x00c5 }
                java.lang.String r9 = (java.lang.String) r9     // Catch:{ RemoteException -> 0x00c5 }
                java.lang.String r10 = r11.f128021b     // Catch:{ RemoteException -> 0x00c5 }
                boolean r9 = android.text.TextUtils.equals(r9, r10)     // Catch:{ RemoteException -> 0x00c5 }
                if (r9 == 0) goto L_0x00b2
                java.lang.Object r5 = r6.get(r8)     // Catch:{ RemoteException -> 0x00c5 }
                java.lang.String r5 = (java.lang.String) r5     // Catch:{ RemoteException -> 0x00c5 }
                java.lang.Object r6 = r7.get(r8)     // Catch:{ RemoteException -> 0x00c5 }
                java.lang.String r6 = (java.lang.String) r6     // Catch:{ RemoteException -> 0x00c5 }
                com.ss.caijing.globaliap.d.j r5 = com.p683ss.caijing.globaliap.p2559d.C51266h.m110206a(r5, r6)     // Catch:{ c -> 0x00ad }
                r3 = r5
                goto L_0x00b5
            L_0x00ad:
                r5 = move-exception
                com.google.p1067c.p1068a.p1069a.p1070a.p1071a.C17840a.m43754b(r5)     // Catch:{ RemoteException -> 0x00c5 }
                goto L_0x00b5
            L_0x00b2:
                int r8 = r8 + 1
                goto L_0x0087
            L_0x00b5:
                if (r3 == 0) goto L_0x00b8
                goto L_0x00f7
            L_0x00b8:
                java.lang.String r5 = "INAPP_CONTINUATION_TOKEN"
                java.lang.String r2 = r2.getString(r5)     // Catch:{ RemoteException -> 0x00c5 }
                boolean r5 = android.text.TextUtils.isEmpty(r2)
                if (r5 == 0) goto L_0x0018
                goto L_0x00f7
            L_0x00c5:
                goto L_0x00f7
            L_0x00c7:
                r2 = 22
                android.os.Message r2 = m110201a(r1, r2)     // Catch:{ RemoteException -> 0x00c5 }
                r1.sendMessage(r2)     // Catch:{ RemoteException -> 0x00c5 }
                goto L_0x00f7
            L_0x00d1:
                r2 = 21
                android.os.Message r2 = m110201a(r1, r2)     // Catch:{ RemoteException -> 0x00c5 }
                r1.sendMessage(r2)     // Catch:{ RemoteException -> 0x00c5 }
                goto L_0x00f7
            L_0x00db:
                java.lang.RuntimeException r2 = new java.lang.RuntimeException     // Catch:{ RemoteException -> 0x00c5 }
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ RemoteException -> 0x00c5 }
                java.lang.String r7 = "Unexpected type for bundle response code: "
                r6.<init>(r7)     // Catch:{ RemoteException -> 0x00c5 }
                java.lang.Class r5 = r5.getClass()     // Catch:{ RemoteException -> 0x00c5 }
                java.lang.String r5 = r5.getName()     // Catch:{ RemoteException -> 0x00c5 }
                r6.append(r5)     // Catch:{ RemoteException -> 0x00c5 }
                java.lang.String r5 = r6.toString()     // Catch:{ RemoteException -> 0x00c5 }
                r2.<init>(r5)     // Catch:{ RemoteException -> 0x00c5 }
                throw r2     // Catch:{ RemoteException -> 0x00c5 }
            L_0x00f7:
                if (r3 == 0) goto L_0x010b
                android.os.Message r2 = r1.obtainMessage()
                r5 = 103(0x67, float:1.44E-43)
                r2.what = r5
                r2.arg1 = r4
                r2.arg2 = r4
                r2.obj = r3
                r1.sendMessage(r2)
                goto L_0x0120
            L_0x010b:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                java.lang.String r3 = "do not find targetProduct:"
                r2.<init>(r3)
                java.lang.String r3 = r11.f128021b
                r2.append(r3)
                r2 = 23
                android.os.Message r2 = m110201a(r1, r2)
                r1.sendMessage(r2)
            L_0x0120:
                r0.f128003o = r4
                return
            L_0x0123:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.caijing.globaliap.p2559d.C51249e.C51263i.run():void");
        }

        /* renamed from: a */
        private static Message m110201a(Handler handler, int i) {
            Message obtainMessage = handler.obtainMessage();
            obtainMessage.what = 103;
            obtainMessage.arg1 = -1;
            obtainMessage.arg2 = i;
            return obtainMessage;
        }

        private C51263i(String str, String str2, C51249e eVar) {
            this.f128021b = str;
            this.f128022c = str2;
            this.f128020a = new WeakReference<>(eVar);
        }

        /* synthetic */ C51263i(String str, String str2, C51249e eVar, byte b) {
            this(str, str2, eVar);
        }
    }

    /* renamed from: a */
    public final void mo101780a() {
        if (!(this.f127989a == null || this.f127997i == null)) {
            this.f127997i.unbindService(this.f128006r);
        }
        this.f127989a = null;
        this.f127997i = null;
        this.f128006r = null;
        this.f128005q = null;
        this.f127990b = null;
        this.f127991c = null;
        this.f127992d = null;
        this.f127993e = null;
        this.f127994f = null;
        this.f127995g = null;
        this.f127996h = null;
        this.f127999k = true;
    }

    public C51249e(Context context) {
        this.f127997i = context;
    }

    /* renamed from: a */
    public final void mo101781a(C51256b bVar) {
        if (!this.f127999k) {
            this.f127990b = bVar;
            Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
            intent.setPackage("com.android.vending");
            if (!C51264f.m110202a(this.f127997i, intent, this.f128006r, 1)) {
                this.f127990b.mo101739b();
            }
        }
    }

    /* renamed from: a */
    public final synchronized void mo101782a(final String str, C51258d dVar) {
        if (this.f127999k) {
            dVar.mo101776a();
        } else if (this.f128002n) {
            dVar.mo101776a();
        } else {
            this.f127993e = dVar;
            new Thread(new Runnable() {
                public final void run() {
                    boolean z;
                    int i;
                    try {
                        i = C51249e.this.f127989a.consumePurchase(3, C51249e.this.f127997i.getPackageName(), str);
                        z = true;
                    } catch (RemoteException unused) {
                        i = 0;
                        z = false;
                    }
                    if (C51249e.this.f128005q != null) {
                        Message obtainMessage = C51249e.this.f128005q.obtainMessage();
                        obtainMessage.what = 102;
                        if (z) {
                            obtainMessage.arg1 = 0;
                            obtainMessage.arg2 = i;
                        } else {
                            obtainMessage.arg1 = -1;
                        }
                        C51249e.this.f128005q.sendMessage(obtainMessage);
                        C51249e.this.f128002n = false;
                    }
                }
            }).start();
            this.f128002n = true;
        }
    }

    /* renamed from: a */
    public final synchronized void mo101785a(final ArrayList<String> arrayList, C51257c cVar) {
        if (this.f127999k) {
            cVar.mo101742a(null);
        } else if (this.f128004p) {
            cVar.mo101742a(null);
        } else {
            this.f127996h = cVar;
            new Thread(new Runnable() {
                public final void run() {
                    HashMap hashMap = new HashMap();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        String str = (String) it.next();
                        try {
                            hashMap.put(str, Integer.valueOf(C51249e.this.f127989a.consumePurchase(3, C51249e.this.f127997i.getPackageName(), str)));
                        } catch (RemoteException unused) {
                            hashMap.put(str, Integer.valueOf(-1));
                        }
                    }
                    if (C51249e.this.f128005q != null) {
                        Message obtainMessage = C51249e.this.f128005q.obtainMessage();
                        obtainMessage.what = 105;
                        obtainMessage.obj = hashMap;
                        C51249e.this.f128005q.sendMessage(obtainMessage);
                    }
                    C51249e.this.f128004p = false;
                }
            }).start();
            this.f128004p = true;
        }
    }

    /* renamed from: a */
    public final synchronized void mo101783a(String str, String str2, C51260f fVar) {
        if (this.f127999k) {
            fVar.mo101778a(24);
        } else if (this.f128003o) {
            fVar.mo101778a(25);
        } else {
            this.f127994f = fVar;
            new Thread(new C51263i(str, str2, this, 0)).start();
            this.f128003o = true;
        }
    }

    /* renamed from: a */
    public final synchronized void mo101786a(final ArrayList<String> arrayList, final String str, C51261g gVar) {
        if (this.f127999k) {
            gVar.mo101740a();
        } else if (this.f128000l) {
            gVar.mo101740a();
        } else {
            this.f127991c = gVar;
            new Thread(new Runnable() {
                public final void run() {
                    boolean z;
                    Bundle bundle;
                    Bundle bundle2 = new Bundle();
                    bundle2.putStringArrayList("ITEM_ID_LIST", arrayList);
                    try {
                        bundle = C51249e.this.f127989a.getSkuDetails(3, C51249e.this.f127997i.getPackageName(), str, bundle2);
                        z = true;
                    } catch (RemoteException unused) {
                        bundle = null;
                        z = false;
                    }
                    if (C51249e.this.f128005q != null) {
                        Message obtainMessage = C51249e.this.f128005q.obtainMessage();
                        obtainMessage.what = 100;
                        if (z) {
                            obtainMessage.arg1 = 0;
                            obtainMessage.obj = bundle;
                        } else {
                            obtainMessage.arg1 = -1;
                        }
                        C51249e.this.f128005q.sendMessage(obtainMessage);
                    }
                    C51249e.this.f128000l = false;
                }
            }).start();
            this.f128000l = true;
        }
    }

    /* renamed from: a */
    public final synchronized void mo101784a(final String str, final String str2, final String str3, C51259e eVar) {
        if (this.f127999k) {
            eVar.mo101771a();
        } else if (this.f128001m) {
            eVar.mo101771a();
        } else {
            this.f127992d = eVar;
            new Thread(new Runnable() {
                public final void run() {
                    boolean z;
                    Bundle bundle;
                    try {
                        bundle = C51249e.this.f127989a.getBuyIntent(3, C51249e.this.f127997i.getPackageName(), str, str2, str3);
                        z = true;
                    } catch (RemoteException unused) {
                        bundle = null;
                        z = false;
                    }
                    if (C51249e.this.f128005q != null) {
                        Message obtainMessage = C51249e.this.f128005q.obtainMessage();
                        obtainMessage.what = BaseNotice.HASHTAG;
                        if (z) {
                            obtainMessage.arg1 = 0;
                            obtainMessage.obj = bundle;
                        } else {
                            obtainMessage.arg1 = -1;
                        }
                        C51249e.this.f128005q.sendMessage(obtainMessage);
                        C51249e.this.f128001m = false;
                    }
                }
            }).start();
            this.f128001m = true;
        }
    }
}
