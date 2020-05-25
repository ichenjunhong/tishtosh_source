package com.bytedance.apm.p471b.p473b;

import android.text.TextUtils;
import com.bytedance.apm.C8976c;
import com.bytedance.apm.p471b.C8949a;
import com.bytedance.apm.p471b.p474c.C8975i;
import com.bytedance.apm.p485h.C9040b;
import com.bytedance.apm.p497o.C9149b;
import com.bytedance.apm.p501q.C9190h;
import com.bytedance.frameworks.core.apm.p578a.p580b.C9935a;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.apm.b.b.a */
public final class C8956a {

    /* renamed from: a */
    public volatile boolean f24351a;

    /* renamed from: b */
    public String f24352b;

    /* renamed from: c */
    String f24353c;

    /* renamed from: d */
    public final LinkedList<C9040b> f24354d;

    /* renamed from: e */
    private C9935a f24355e;

    /* renamed from: com.bytedance.apm.b.b.a$a */
    static class C8959a {

        /* renamed from: a */
        public static final C8956a f24359a = new C8956a();
    }

    /* renamed from: a */
    public static C8956a m17674a() {
        return C8959a.f24359a;
    }

    private C8956a() {
        this.f24352b = "";
        this.f24354d = new LinkedList<>();
    }

    /* renamed from: b */
    public final void mo16234b() {
        C9149b.m18170a().mo16524a((Runnable) new Runnable() {
            public final void run() {
                LinkedList linkedList;
                boolean z;
                C8956a aVar = C8956a.this;
                if (C8976c.m17747c()) {
                    C8960b bVar = new C8960b();
                    List a = aVar.mo16231a(true, 0);
                    if (!C9190h.m18253a(a)) {
                        try {
                            z = C8956a.m17675a(bVar, a);
                        } catch (Exception unused) {
                            z = false;
                        }
                        C9040b bVar2 = (C9040b) a.get(a.size() - 1);
                        long j = bVar2.f24662a;
                        long j2 = bVar2.f24664c;
                        if (!z) {
                            if (C8976c.m17751g()) {
                                new String[1][0] = "report main process data failed, clean data and stop calc data of other process";
                            }
                            aVar.mo16232a(j);
                        } else {
                            if (C8976c.m17751g()) {
                                new String[1][0] = "report main process data over, begin handle other process data";
                            }
                            List<C9040b> a2 = aVar.mo16231a(false, j2);
                            HashMap hashMap = new HashMap(4);
                            for (C9040b bVar3 : a2) {
                                String str = bVar3.f24671j;
                                List list = (List) hashMap.get(str);
                                if (list != null) {
                                    list.add(bVar3);
                                } else {
                                    LinkedList linkedList2 = new LinkedList();
                                    linkedList2.add(bVar3);
                                    hashMap.put(str, linkedList2);
                                }
                            }
                            try {
                                for (List a3 : hashMap.values()) {
                                    C8956a.m17675a(bVar, a3);
                                }
                            } catch (Exception unused2) {
                            }
                            bVar.f24366f = (long) bVar.f24378r;
                            bVar.f24363c = (long) bVar.f24381u;
                            bVar.f24364d = (long) bVar.f24379s;
                            bVar.f24367g = bVar.f24382v;
                            bVar.f24365e = (long) bVar.f24380t;
                            bVar.f24361a = bVar.f24376p;
                            bVar.f24371k = (long) bVar.f24383w;
                            bVar.f24368h = (long) bVar.f24386z;
                            bVar.f24369i = (long) bVar.f24384x;
                            bVar.f24372l = bVar.f24360A;
                            bVar.f24370j = (long) bVar.f24385y;
                            bVar.f24362b = bVar.f24377q;
                            bVar.f24373m = false;
                            bVar.f24374n = "all_process";
                            try {
                                bVar.mo16240a(false);
                            } catch (Exception unused3) {
                            }
                            aVar.mo16232a(j);
                        }
                    }
                }
                C8956a.this.f24351a = true;
                synchronized (C8956a.this.f24354d) {
                    linkedList = new LinkedList(C8956a.this.f24354d);
                    C8956a.this.f24354d.clear();
                }
                Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    C8956a.this.mo16233a((C9040b) it.next());
                }
            }
        });
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public C9935a mo16235c() {
        if (this.f24355e == null) {
            this.f24355e = C9935a.m19955f();
        }
        return this.f24355e;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo16232a(long j) {
        try {
            mo16235c().mo17900b(j);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public final void mo16233a(final C9040b bVar) {
        if (bVar != null) {
            if (C8976c.m17751g()) {
                StringBuilder sb = new StringBuilder("record batteryLog: ");
                sb.append(bVar.toString());
                String[] strArr = {sb.toString()};
            }
            C9149b.m18170a().mo16524a((Runnable) new Runnable() {
                public final void run() {
                    C8956a aVar = C8956a.this;
                    C9040b bVar = bVar;
                    if (C8976c.m17751g()) {
                        StringBuilder sb = new StringBuilder("record batteryLog: ");
                        sb.append(bVar.toString());
                        sb.append(" , mReportedInMainProcess: ");
                        sb.append(aVar.f24351a);
                        String[] strArr = {sb.toString()};
                    }
                    if (aVar.f24351a || !C8976c.m17747c()) {
                        if (TextUtils.isEmpty(aVar.f24353c)) {
                            aVar.f24353c = String.valueOf(System.currentTimeMillis());
                        }
                        bVar.f24672k = C8976c.m17747c();
                        bVar.f24671j = C8976c.m17745b();
                        bVar.f24673l = aVar.f24353c;
                        if (TextUtils.isEmpty(bVar.f24667f)) {
                            bVar.f24667f = aVar.f24352b;
                        }
                        try {
                            if (C8976c.m17751g()) {
                                StringBuilder sb2 = new StringBuilder("saveBatteryLog into db: ");
                                sb2.append(bVar);
                                String[] strArr2 = {sb2.toString()};
                            }
                            aVar.mo16235c().mo17898a(bVar);
                        } catch (Exception unused) {
                        }
                    } else {
                        bVar.f24667f = aVar.f24352b;
                        synchronized (aVar.f24354d) {
                            if (aVar.f24354d.size() > 100) {
                                aVar.f24354d.poll();
                            }
                            aVar.f24354d.add(bVar);
                        }
                    }
                }
            });
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public List<C9040b> mo16231a(boolean z, long j) {
        try {
            return mo16235c().mo17899a(z, j);
        } catch (Exception unused) {
            return Collections.emptyList();
        }
    }

    /* renamed from: a */
    static boolean m17675a(C8960b bVar, List<C9040b> list) throws Exception {
        boolean z;
        Map<String, C8975i> map = C8949a.m17661a().f24336a;
        StringBuilder sb = new StringBuilder();
        String str = null;
        for (C9040b bVar2 : list) {
            if (str == null || !str.equals(bVar2.f24673l)) {
                str = bVar2.f24673l;
                sb.append(str);
            }
            if (!"ground_record".equals(bVar2.f24665d)) {
                C8975i iVar = (C8975i) map.get(bVar2.f24665d);
                if (iVar != null) {
                    iVar.mo16262a(bVar, bVar2);
                }
            } else if (bVar2.f24663b) {
                bVar.mo16241b(bVar2.f24668g);
            } else {
                bVar.mo16239a(bVar2.f24668g);
            }
        }
        C9040b bVar3 = (C9040b) list.get(0);
        bVar.f24373m = bVar3.f24672k;
        if (!bVar.f24373m || (bVar.mo16242b() && bVar.mo16243c())) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            bVar.mo16238a();
            if (C8976c.m17751g()) {
                new String[1][0] = "main process front or back duration is not valid, stop report ";
            }
            return false;
        }
        bVar.f24374n = bVar3.f24671j;
        bVar.f24375o = sb.toString();
        return bVar.mo16240a(true);
    }
}
