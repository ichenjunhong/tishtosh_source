package com.squareup.p1094a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;

/* renamed from: com.squareup.a.i */
final class C18375i {

    /* renamed from: a */
    final C18378b f50740a = new C18378b();

    /* renamed from: b */
    final Context f50741b;

    /* renamed from: c */
    final ExecutorService f50742c;

    /* renamed from: d */
    final C18382l f50743d;

    /* renamed from: e */
    final Map<String, C18362c> f50744e;

    /* renamed from: f */
    final Map<Object, C18341a> f50745f;

    /* renamed from: g */
    final Map<Object, C18341a> f50746g;

    /* renamed from: h */
    final Set<Object> f50747h;

    /* renamed from: i */
    final Handler f50748i;

    /* renamed from: j */
    final Handler f50749j;

    /* renamed from: k */
    final C18369d f50750k;

    /* renamed from: l */
    final C18346ac f50751l;

    /* renamed from: m */
    final List<C18362c> f50752m;

    /* renamed from: n */
    final C18379c f50753n;

    /* renamed from: o */
    final boolean f50754o;

    /* renamed from: p */
    public boolean f50755p;

    /* renamed from: com.squareup.a.i$a */
    static class C18376a extends Handler {

        /* renamed from: a */
        private final C18375i f50756a;

        public final void handleMessage(final Message message) {
            boolean z;
            boolean z2 = false;
            switch (message.what) {
                case 1:
                    this.f50756a.mo36826a((C18341a) message.obj, true);
                    return;
                case 2:
                    C18341a aVar = (C18341a) message.obj;
                    C18375i iVar = this.f50756a;
                    String str = aVar.f50657i;
                    C18362c cVar = (C18362c) iVar.f50744e.get(str);
                    if (cVar != null) {
                        cVar.mo36807b(aVar);
                        if (cVar.mo36806a()) {
                            iVar.f50744e.remove(str);
                            if (aVar.f50649a.f50806m) {
                                aVar.f50650b.mo36869a();
                            }
                        }
                    }
                    if (iVar.f50747h.contains(aVar.f50658j)) {
                        iVar.f50746g.remove(aVar.mo36784c());
                        if (aVar.f50649a.f50806m) {
                            aVar.f50650b.mo36869a();
                        }
                    }
                    C18341a aVar2 = (C18341a) iVar.f50745f.remove(aVar.mo36784c());
                    if (aVar2 != null && aVar2.f50649a.f50806m) {
                        aVar2.f50650b.mo36869a();
                    }
                    return;
                case 4:
                    C18362c cVar2 = (C18362c) message.obj;
                    C18375i iVar2 = this.f50756a;
                    if ((cVar2.f50716h & C18391r.NO_STORE.f50788a) == 0) {
                        z2 = true;
                    }
                    if (z2) {
                        iVar2.f50750k.mo36817a(cVar2.f50714f, cVar2.f50721m);
                    }
                    iVar2.f50744e.remove(cVar2.f50714f);
                    iVar2.mo36832d(cVar2);
                    if (cVar2.f50710b.f50806m) {
                        C18356aj.m44593a(cVar2);
                    }
                    return;
                case 5:
                    this.f50756a.mo36831c((C18362c) message.obj);
                    return;
                case 6:
                    this.f50756a.mo36828a((C18362c) message.obj, false);
                    return;
                case 7:
                    C18375i iVar3 = this.f50756a;
                    ArrayList arrayList = new ArrayList(iVar3.f50752m);
                    iVar3.f50752m.clear();
                    iVar3.f50749j.sendMessage(iVar3.f50749j.obtainMessage(8, arrayList));
                    C18375i.m44634a((List<C18362c>) arrayList);
                    return;
                case 9:
                    this.f50756a.mo36824a((NetworkInfo) message.obj);
                    return;
                case 10:
                    C18375i iVar4 = this.f50756a;
                    if (message.arg1 == 1) {
                        z2 = true;
                    }
                    iVar4.f50755p = z2;
                    return;
                case 11:
                    Object obj = message.obj;
                    C18375i iVar5 = this.f50756a;
                    if (iVar5.f50747h.add(obj)) {
                        Iterator it = iVar5.f50744e.values().iterator();
                        while (it.hasNext()) {
                            C18362c cVar3 = (C18362c) it.next();
                            boolean z3 = cVar3.f50710b.f50806m;
                            C18341a aVar3 = cVar3.f50719k;
                            List<C18341a> list = cVar3.f50720l;
                            if (list == null || list.isEmpty()) {
                                z = false;
                            } else {
                                z = true;
                            }
                            if (aVar3 != null || z) {
                                if (aVar3 != null && aVar3.f50658j.equals(obj)) {
                                    cVar3.mo36807b(aVar3);
                                    iVar5.f50746g.put(aVar3.mo36784c(), aVar3);
                                    if (z3) {
                                        aVar3.f50650b.mo36869a();
                                        StringBuilder sb = new StringBuilder("because tag '");
                                        sb.append(obj);
                                        sb.append("' was paused");
                                    }
                                }
                                if (z) {
                                    for (int size = list.size() - 1; size >= 0; size--) {
                                        C18341a aVar4 = (C18341a) list.get(size);
                                        if (aVar4.f50658j.equals(obj)) {
                                            cVar3.mo36807b(aVar4);
                                            iVar5.f50746g.put(aVar4.mo36784c(), aVar4);
                                            if (z3) {
                                                aVar4.f50650b.mo36869a();
                                                StringBuilder sb2 = new StringBuilder("because tag '");
                                                sb2.append(obj);
                                                sb2.append("' was paused");
                                            }
                                        }
                                    }
                                }
                                if (cVar3.mo36806a()) {
                                    it.remove();
                                    if (z3) {
                                        C18356aj.m44593a(cVar3);
                                    }
                                }
                            }
                        }
                    }
                    return;
                case 12:
                    this.f50756a.mo36829a(message.obj);
                    return;
                default:
                    C18396v.f50794a.post(new Runnable() {
                        public final void run() {
                            StringBuilder sb = new StringBuilder("Unknown handler message received: ");
                            sb.append(message.what);
                            throw new AssertionError(sb.toString());
                        }
                    });
                    return;
            }
        }

        public C18376a(Looper looper, C18375i iVar) {
            super(looper);
            this.f50756a = iVar;
        }
    }

    /* renamed from: com.squareup.a.i$b */
    static class C18378b extends HandlerThread {
        C18378b() {
            super("Picasso-Dispatcher", 10);
        }
    }

    /* renamed from: com.squareup.a.i$c */
    static class C18379c extends BroadcastReceiver {

        /* renamed from: a */
        final C18375i f50759a;

        C18379c(C18375i iVar) {
            this.f50759a = iVar;
        }

        public final void onReceive(Context context, Intent intent) {
            if (intent != null) {
                String action = intent.getAction();
                if (!"android.intent.action.AIRPLANE_MODE".equals(action)) {
                    if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
                        ConnectivityManager connectivityManager = (ConnectivityManager) C18356aj.m44591a(context, "connectivity");
                        C18375i iVar = this.f50759a;
                        iVar.f50748i.sendMessage(iVar.f50748i.obtainMessage(9, C18380j.m44646a(connectivityManager)));
                    }
                } else if (intent.hasExtra("state")) {
                    C18375i iVar2 = this.f50759a;
                    iVar2.f50748i.sendMessage(iVar2.f50748i.obtainMessage(10, intent.getBooleanExtra("state", false) ? 1 : 0, 0));
                }
            }
        }
    }

    /* renamed from: b */
    private void m44635b(C18341a aVar) {
        Object c = aVar.mo36784c();
        if (c != null) {
            aVar.f50659k = true;
            this.f50745f.put(c, aVar);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo36825a(C18341a aVar) {
        this.f50748i.sendMessage(this.f50748i.obtainMessage(2, aVar));
    }

    /* renamed from: e */
    private void m44636e(C18362c cVar) {
        C18341a aVar = cVar.f50719k;
        if (aVar != null) {
            m44635b(aVar);
        }
        List<C18341a> list = cVar.f50720l;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                m44635b((C18341a) list.get(i));
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo36827a(C18362c cVar) {
        this.f50748i.sendMessageDelayed(this.f50748i.obtainMessage(5, cVar), 500);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo36830b(C18362c cVar) {
        this.f50748i.sendMessage(this.f50748i.obtainMessage(6, cVar));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo36832d(C18362c cVar) {
        if (!cVar.mo36808b()) {
            this.f50752m.add(cVar);
            if (!this.f50748i.hasMessages(7)) {
                this.f50748i.sendEmptyMessageDelayed(7, 200);
            }
        }
    }

    /* renamed from: a */
    static void m44634a(List<C18362c> list) {
        if (!list.isEmpty() && ((C18362c) list.get(0)).f50710b.f50806m) {
            StringBuilder sb = new StringBuilder();
            for (C18362c cVar : list) {
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append(C18356aj.m44593a(cVar));
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo36824a(NetworkInfo networkInfo) {
        if (this.f50742c instanceof C18407x) {
            C18407x xVar = (C18407x) this.f50742c;
            if (networkInfo == null || !networkInfo.isConnectedOrConnecting()) {
                xVar.mo36866a(3);
            } else {
                int type = networkInfo.getType();
                if (!(type == 6 || type == 9)) {
                    switch (type) {
                        case 0:
                            int subtype = networkInfo.getSubtype();
                            switch (subtype) {
                                case 1:
                                case 2:
                                    xVar.mo36866a(1);
                                    break;
                                case 3:
                                case 4:
                                case 5:
                                case 6:
                                    xVar.mo36866a(2);
                                    break;
                                default:
                                    switch (subtype) {
                                        case 12:
                                            break;
                                        case 13:
                                        case 14:
                                        case 15:
                                            xVar.mo36866a(3);
                                            break;
                                        default:
                                            xVar.mo36866a(3);
                                            break;
                                    }
                                    xVar.mo36866a(2);
                                    break;
                            }
                        case 1:
                            break;
                        default:
                            xVar.mo36866a(3);
                            break;
                    }
                }
                xVar.mo36866a(4);
            }
        }
        if (networkInfo != null && networkInfo.isConnected() && !this.f50745f.isEmpty()) {
            Iterator it = this.f50745f.values().iterator();
            while (it.hasNext()) {
                C18341a aVar = (C18341a) it.next();
                it.remove();
                if (aVar.f50649a.f50806m) {
                    aVar.f50650b.mo36869a();
                }
                mo36826a(aVar, false);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final void mo36831c(C18362c cVar) {
        boolean z;
        boolean z2;
        boolean z3;
        if (!cVar.mo36808b()) {
            boolean z4 = false;
            if (this.f50742c.isShutdown()) {
                mo36828a(cVar, false);
                return;
            }
            NetworkInfo networkInfo = null;
            if (this.f50754o) {
                networkInfo = C18381k.m44647a((ConnectivityManager) C18356aj.m44591a(this.f50741b, "connectivity"));
            }
            if (networkInfo == null || !networkInfo.isConnected()) {
                z = false;
            } else {
                z = true;
            }
            boolean z5 = this.f50755p;
            if (cVar.f50726r > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                z3 = false;
            } else {
                cVar.f50726r--;
                z3 = cVar.f50718j.mo36789a(z5, networkInfo);
            }
            boolean b = cVar.f50718j.mo36790b();
            if (!z3) {
                if (this.f50754o && b) {
                    z4 = true;
                }
                mo36828a(cVar, z4);
                if (z4) {
                    m44636e(cVar);
                }
            } else if (!this.f50754o || z) {
                if (cVar.f50710b.f50806m) {
                    C18356aj.m44593a(cVar);
                }
                if (cVar.f50724p instanceof C18394a) {
                    cVar.f50717i |= C18392s.NO_CACHE.f50790a;
                }
                cVar.f50722n = this.f50742c.submit(cVar);
            } else {
                mo36828a(cVar, b);
                if (b) {
                    m44636e(cVar);
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo36829a(Object obj) {
        if (this.f50747h.remove(obj)) {
            ArrayList arrayList = null;
            Iterator it = this.f50746g.values().iterator();
            while (it.hasNext()) {
                C18341a aVar = (C18341a) it.next();
                if (aVar.f50658j.equals(obj)) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(aVar);
                    it.remove();
                }
            }
            if (arrayList != null) {
                this.f50749j.sendMessage(this.f50749j.obtainMessage(13, arrayList));
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo36828a(C18362c cVar, boolean z) {
        String str;
        if (cVar.f50710b.f50806m) {
            C18356aj.m44593a(cVar);
            StringBuilder sb = new StringBuilder("for error");
            if (z) {
                str = " (will replay)";
            } else {
                str = "";
            }
            sb.append(str);
        }
        this.f50744e.remove(cVar.f50714f);
        mo36832d(cVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo36826a(C18341a aVar, boolean z) {
        if (this.f50747h.contains(aVar.f50658j)) {
            this.f50746g.put(aVar.mo36784c(), aVar);
            if (aVar.f50649a.f50806m) {
                aVar.f50650b.mo36869a();
                StringBuilder sb = new StringBuilder("because tag '");
                sb.append(aVar.f50658j);
                sb.append("' is paused");
            }
            return;
        }
        C18362c cVar = (C18362c) this.f50744e.get(aVar.f50657i);
        if (cVar != null) {
            cVar.mo36805a(aVar);
        } else if (this.f50742c.isShutdown()) {
            if (aVar.f50649a.f50806m) {
                aVar.f50650b.mo36869a();
            }
        } else {
            C18362c a = C18362c.m44609a(aVar.f50649a, this, this.f50750k, this.f50751l, aVar);
            a.f50722n = this.f50742c.submit(a);
            this.f50744e.put(aVar.f50657i, a);
            if (z) {
                this.f50745f.remove(aVar.mo36784c());
            }
            if (aVar.f50649a.f50806m) {
                aVar.f50650b.mo36869a();
            }
        }
    }

    C18375i(Context context, ExecutorService executorService, Handler handler, C18382l lVar, C18369d dVar, C18346ac acVar) {
        boolean z;
        this.f50740a.start();
        C18356aj.m44598a(this.f50740a.getLooper());
        this.f50741b = context;
        this.f50742c = executorService;
        this.f50744e = new LinkedHashMap();
        this.f50745f = new WeakHashMap();
        this.f50746g = new WeakHashMap();
        this.f50747h = new HashSet();
        this.f50748i = new C18376a(this.f50740a.getLooper(), this);
        this.f50743d = lVar;
        this.f50749j = handler;
        this.f50750k = dVar;
        this.f50751l = acVar;
        this.f50752m = new ArrayList(4);
        this.f50755p = C18356aj.m44604c(this.f50741b);
        if (context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0) {
            z = true;
        } else {
            z = false;
        }
        this.f50754o = z;
        this.f50753n = new C18379c(this);
        C18379c cVar = this.f50753n;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.AIRPLANE_MODE");
        if (cVar.f50759a.f50754o) {
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        }
        cVar.f50759a.f50741b.registerReceiver(cVar, intentFilter);
    }
}
