package com.bytedance.ies.geckoclient;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Pair;
import com.C2240a;
import com.bytedance.common.wschannel.app.C9446a;
import com.bytedance.common.wschannel.model.WsChannelMsg;
import com.bytedance.common.wschannel.p529c.C9458b;
import com.bytedance.common.wschannel.p529c.C9459c;
import com.bytedance.ies.geckoclient.debug.C10931a;
import com.bytedance.ies.geckoclient.debug.C10933c;
import com.bytedance.ies.geckoclient.model.C10956c;
import com.bytedance.ies.geckoclient.model.C10957d;
import com.bytedance.ies.geckoclient.model.C10958e;
import com.bytedance.ies.geckoclient.model.C10959f;
import com.bytedance.ies.geckoclient.model.C10960g;
import com.bytedance.ies.geckoclient.model.C10963j;
import com.bytedance.ies.geckoclient.model.C10967l;
import com.bytedance.ies.geckoclient.p679a.C10865a;
import com.bytedance.ies.geckoclient.p679a.C10868b;
import com.bytedance.ies.geckoclient.p680b.C10877b;
import com.bytedance.ies.geckoclient.p681c.C10879a;
import com.bytedance.ies.geckoclient.p682d.C10881a;
import com.bytedance.ies.geckoclient.p682d.C10882b;
import com.bytedance.ies.geckoclient.p682d.C10883c;
import com.bytedance.ies.geckoclient.p682d.C10884d;
import com.bytedance.ies.geckoclient.p686e.C10934a;
import com.bytedance.ies.geckoclient.p686e.C10939d;
import com.bytedance.ies.geckoclient.p686e.C10943g;
import com.bytedance.ies.geckoclient.p687f.C10945a;
import com.bytedance.p616h.p617a.C10171b;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p683ss.android.ugc.aweme.p1468bu.C24076h;
import com.p683ss.android.ugc.aweme.p1468bu.C24085m;
import com.p683ss.android.ugc.aweme.p1468bu.C24093p;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: com.bytedance.ies.geckoclient.e */
public final class C10885e implements C9446a, C10896f, C10898h, C10899i {

    /* renamed from: l */
    public static Context f29206l;

    /* renamed from: a */
    C10956c f29207a;

    /* renamed from: b */
    public String f29208b;

    /* renamed from: c */
    public String f29209c;

    /* renamed from: d */
    public String f29210d;

    /* renamed from: e */
    public Map<String, C10957d> f29211e;

    /* renamed from: f */
    public List<C10897g> f29212f;

    /* renamed from: g */
    Executor f29213g;

    /* renamed from: h */
    Queue<C10873b> f29214h;

    /* renamed from: i */
    public Handler f29215i;

    /* renamed from: j */
    public C10900j f29216j;

    /* renamed from: k */
    public C10865a f29217k;

    /* renamed from: m */
    public C10881a f29218m;

    /* renamed from: n */
    public C10882b f29219n;

    /* renamed from: o */
    public C10945a f29220o;

    /* renamed from: p */
    public Map<String, String> f29221p;

    /* renamed from: q */
    private Map<String, C10897g> f29222q;

    /* renamed from: r */
    private Map<String, C10879a> f29223r;

    /* renamed from: s */
    private boolean f29224s;

    /* renamed from: t */
    private Queue<String> f29225t;

    /* renamed from: u */
    private final int f29226u;

    /* renamed from: v */
    private final int f29227v;

    /* renamed from: w */
    private final int f29228w;

    /* renamed from: x */
    private final int f29229x;

    /* renamed from: y */
    private C9459c f29230y;

    /* renamed from: com.bytedance.ies.geckoclient.e$a */
    public static class C10895a {

        /* renamed from: a */
        private C10885e f29253a;

        /* renamed from: b */
        private String f29254b;

        /* renamed from: a */
        public final C10885e mo19693a() {
            C10902l.m22147a(C10885e.f29206l, "bspatch");
            C10885e eVar = this.f29253a;
            if (eVar.f29219n == null) {
                C10883c.f29200a = new C10883c(new C10884d());
            } else {
                C10883c.f29200a = new C10883c(eVar.f29219n);
            }
            C10885e eVar2 = this.f29253a;
            if (!eVar2.f29211e.isEmpty()) {
                eVar2.f29213g.execute(new C10901k(eVar2.f29216j, eVar2.f29211e, eVar2));
            } else {
                eVar2.mo19667d();
            }
            C10885e eVar3 = this.f29253a;
            ArrayList arrayList = new ArrayList();
            arrayList.add(eVar3.mo19664b());
            eVar3.mo19655a(C10877b.m22046a().f29196a.mo34889b(new C10960g(arrayList, 0, 1)), 100);
            return this.f29253a;
        }

        /* renamed from: a */
        public final C10895a mo19687a(C10882b bVar) {
            this.f29253a.f29219n = bVar;
            return this;
        }

        /* renamed from: a */
        public final C10895a mo19688a(C10945a aVar) {
            this.f29253a.f29220o = aVar;
            return this;
        }

        /* renamed from: a */
        public final C10895a mo19686a(C10865a aVar) {
            this.f29253a.f29217k = aVar;
            if (aVar != null) {
                C10868b bVar = aVar.f29169b;
                Context context = C10885e.f29206l;
                StringBuilder sb = new StringBuilder();
                sb.append(this.f29254b);
                sb.append("_");
                sb.append(this.f29253a.mo19664b());
                bVar.mo19641a(context, aVar, sb.toString(), this.f29253a.f29208b, this.f29253a.f29209c);
            }
            return this;
        }

        /* renamed from: a */
        public final C10895a mo19689a(C10897g gVar) {
            this.f29253a.f29212f.add(gVar);
            return this;
        }

        /* renamed from: a */
        public final C10895a mo19690a(C10957d dVar) {
            this.f29253a.mo19650a(dVar);
            return this;
        }

        /* renamed from: a */
        public final C10895a mo19691a(String str) {
            C10881a aVar = this.f29253a.f29218m;
            if (!str.endsWith("/")) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append("/");
                str = sb.toString();
            }
            aVar.f29198a = str;
            return this;
        }

        /* renamed from: a */
        public final C10895a mo19692a(Map<String, String> map) {
            this.f29253a.f29221p = map;
            return this;
        }

        /* renamed from: a */
        public final C10895a mo19685a(long j, TimeUnit timeUnit) {
            C10884d.f29203b.mo111668b(60, timeUnit).mo111654a(60, timeUnit);
            return this;
        }

        /* renamed from: b */
        public final C10895a mo19694b(long j, TimeUnit timeUnit) {
            C10884d.f29202a.mo111668b(60, timeUnit).mo111654a(60, timeUnit);
            return this;
        }

        public C10895a(String str, Context context, String str2, String str3, String str4, String str5, int i) {
            this.f29254b = str2;
            C10885e eVar = new C10885e(str, str2, context, new C10956c(str3, str4, str5, i));
            this.f29253a = eVar;
        }
    }

    /* renamed from: c */
    public static Context m22079c() {
        return f29206l;
    }

    /* renamed from: a */
    public final boolean mo19663a(String str, int i, C10879a aVar) {
        return m22076a(str, i, aVar, null);
    }

    /* renamed from: a */
    public final void mo19657a(String str, C10897g gVar) {
        this.f29222q.remove(str);
        this.f29223r.remove(str);
        this.f29212f.remove(gVar);
    }

    /* renamed from: a */
    public final void mo19662a(String... strArr) {
        m22073a(null, strArr);
    }

    /* renamed from: a */
    public final List<C10957d> mo19652a() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f29211e.values());
        return arrayList;
    }

    /* renamed from: a */
    public final void mo19656a(final String str, C10934a<Boolean> aVar) {
        this.f29213g.execute(new Runnable(null) {
            public final void run() {
                final boolean a = C10885e.this.f29216j.mo19700a(C10885e.this.f29209c, str);
                if (a && C10885e.this.f29211e != null && C10885e.this.f29211e.containsKey(str)) {
                    ((C10957d) C10885e.this.f29211e.get(str)).f29401a = 0;
                }
                C10885e.this.f29215i.post(new Runnable() {
                    public final void run() {
                        if (null != null) {
                            Boolean.valueOf(a);
                        }
                    }
                });
            }
        });
    }

    /* renamed from: a */
    public final void mo19658a(final List<C10957d> list, final List<C10963j> list2, boolean z) {
        new StringBuilder("on check update done:").append(list2.size());
        Iterator it = list.iterator();
        while (true) {
            int i = 0;
            if (it.hasNext()) {
                String str = ((C10957d) it.next()).f29403c;
                if (list2.size() == 0) {
                    if (this.f29223r.containsKey(str)) {
                        ((C10879a) this.f29223r.get(str)).mo19645a();
                        mo19657a(str, (C10897g) this.f29222q.get(str));
                    }
                    return;
                }
                for (C10963j jVar : list2) {
                    if (TextUtils.equals(str, jVar.f29436b)) {
                        i = 1;
                    }
                }
                if (i == 0 && this.f29223r.containsKey(str)) {
                    ((C10879a) this.f29223r.get(str)).mo19645a();
                    mo19657a(str, (C10897g) this.f29222q.get(str));
                }
            } else {
                ArrayList arrayList = new ArrayList();
                while (i < list2.size()) {
                    C10963j jVar2 = (C10963j) list2.get(i);
                    C10957d dVar = (C10957d) this.f29211e.get(jVar2.f29436b);
                    if (dVar != null) {
                        dVar.f29410j = jVar2;
                        if (jVar2 != null) {
                            dVar.f29407g = jVar2.f29437c;
                        }
                    }
                    if (jVar2.mo19774a() != null) {
                        if (jVar2.mo19776c().f29433b) {
                            this.f29216j.mo19700a(this.f29209c, jVar2.f29436b);
                        }
                        C10906p pVar = new C10906p(this.f29218m, dVar, this.f29209c, z, this);
                        arrayList.add(pVar);
                    }
                    i++;
                }
                this.f29213g.execute(new C10907q(this.f29218m, arrayList, this));
                this.f29215i.post(new Runnable() {
                    public final void run() {
                        if (!C10885e.m22077a(C10885e.this.f29212f)) {
                            for (C10897g a : C10885e.this.f29212f) {
                                a.mo19674a(list, list2);
                            }
                        }
                    }
                });
                return;
            }
        }
    }

    /* renamed from: a */
    public final void mo19654a(final Exception exc) {
        this.f29215i.post(new Runnable() {
            public final void run() {
                if (!C10885e.m22077a(C10885e.this.f29212f)) {
                    ArrayList arrayList = new ArrayList(C10885e.this.f29211e.values());
                    for (C10897g a : C10885e.this.f29212f) {
                        a.mo19673a((List<C10957d>) arrayList, exc);
                    }
                }
            }
        });
    }

    /* renamed from: a */
    public final void mo19659a(boolean z, int i, C10957d dVar) {
        this.f29216j.mo19695a(i, dVar);
        if (i == 1 && !m22077a(this.f29212f)) {
            for (C10897g a : this.f29212f) {
                a.mo19672a(dVar, z);
            }
        }
    }

    /* renamed from: a */
    public final void mo19660a(boolean z, int i, C10957d dVar, C10963j jVar) {
        Message obtain = Message.obtain();
        dVar.f29411k = null;
        obtain.obj = dVar;
        if (z) {
            obtain.arg2 = jVar.mo19775b().f29444a;
        } else {
            obtain.arg2 = jVar.mo19774a().f29444a;
        }
        if (i != 5) {
            switch (i) {
                case 1:
                    obtain.what = 2;
                    if (z) {
                        obtain.arg1 = 100;
                    } else {
                        obtain.arg1 = 0;
                    }
                    this.f29215i.sendMessage(obtain);
                    return;
                case 2:
                    break;
            }
        }
        if (z) {
            obtain.arg1 = 102;
        } else {
            obtain.arg1 = 2;
        }
        obtain.what = 3;
        this.f29215i.sendMessage(obtain);
    }

    /* renamed from: a */
    public final void mo19661a(boolean z, int i, C10957d dVar, C10963j jVar, Exception exc, int i2) {
        Message obtain = Message.obtain();
        if (z) {
            obtain.arg2 = jVar.mo19775b().f29444a;
        } else {
            if (jVar.mo19776c().f29432a) {
                this.f29216j.mo19700a(this.f29209c, jVar.f29436b);
            }
            obtain.arg2 = jVar.mo19774a().f29444a;
        }
        switch (i) {
            case 1:
                obtain.what = 2;
                if (z) {
                    obtain.arg1 = BaseNotice.HASHTAG;
                } else {
                    obtain.arg1 = 1;
                }
                dVar.f29411k = exc;
                dVar.f29412l = i2;
                obtain.obj = dVar;
                this.f29215i.sendMessage(obtain);
                return;
            case 2:
                obtain.what = 3;
                if (z) {
                    obtain.arg1 = 103;
                } else {
                    obtain.arg1 = 3;
                }
                dVar.f29411k = exc;
                dVar.f29412l = i2;
                obtain.obj = dVar;
                this.f29215i.sendMessage(obtain);
                break;
        }
    }

    /* renamed from: a */
    public final void mo19653a(C10967l lVar) {
        int i = lVar.f29452a;
        boolean z = true;
        if (!(i == 2 || i == 1)) {
            z = false;
        }
        if (z) {
            final C10959f b = m22078b(lVar);
            this.f29213g.execute(new Runnable() {
                public final void run() {
                    try {
                        C10881a aVar = C10885e.this.f29218m;
                        C10959f fVar = b;
                        if (fVar != null && !TextUtils.isEmpty(aVar.f29198a)) {
                            StringBuilder sb = new StringBuilder("https://");
                            sb.append(aVar.f29198a);
                            sb.append(C2240a.m6772a("gecko/server/push_task/%s/stats", new Object[]{Long.valueOf(fVar.f29418a)}));
                            String sb2 = sb.toString();
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(Pair.create("msg_type", "2"));
                            arrayList.add(Pair.create("device_id", aVar.f29199b.f29399c));
                            arrayList.add(Pair.create("os", "0"));
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(fVar.f29421d);
                            arrayList.add(Pair.create("status", sb3.toString()));
                            arrayList.add(Pair.create("app_version", aVar.f29199b.f29398b));
                            arrayList.add(Pair.create("sdk_version", fVar.f29424g));
                            arrayList.add(Pair.create("device_model", fVar.f29425h));
                            C10883c.m22066a().f29201b.mo19648a(sb2, (List<Pair<String, String>>) arrayList);
                        }
                    } catch (Exception unused) {
                    }
                }
            });
            mo19655a(C10877b.m22046a().f29196a.mo34889b(b), 1000);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo19655a(String str, int i) {
        if (this.f29220o == null || !this.f29220o.mo19735a()) {
            if (this.f29225t.size() < 10) {
                this.f29225t.add(str);
            }
            return;
        }
        this.f29220o.mo19734a(str, i);
    }

    /* renamed from: a */
    public final void mo17111a(C9458b bVar, JSONObject jSONObject) {
        if (this.f29230y != bVar.f25742b && bVar.f25742b == C9459c.CONNECTED) {
            mo19669e();
        }
    }

    /* renamed from: a */
    public final void mo17112a(WsChannelMsg wsChannelMsg) {
        int b = this.f29220o.mo19737b();
        if (wsChannelMsg != null && wsChannelMsg.f25958k == b && C10943g.m22212a(wsChannelMsg.f25951d)) {
            mo19653a(new C10967l(wsChannelMsg.f25952e, new String(wsChannelMsg.mo17289a())));
        }
    }

    /* renamed from: b */
    public final String mo19664b() {
        return this.f29207a.f29397a;
    }

    /* renamed from: d */
    public final void mo19667d() {
        this.f29224s = true;
        Message obtain = Message.obtain();
        obtain.what = 0;
        this.f29215i.sendMessage(obtain);
    }

    /* renamed from: e */
    public final void mo19669e() {
        while (this.f29225t.size() > 0 && this.f29220o != null && this.f29220o.mo19735a()) {
            mo19655a((String) this.f29225t.poll(), 1000);
        }
    }

    /* renamed from: d */
    public final boolean mo19668d(String str) {
        if (this.f29220o == null || this.f29220o.mo19736a(str)) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static boolean m22080c(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (!str.endsWith("/")) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("/");
            str = sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append("gecko_activate_done");
        return new File(sb2.toString()).exists();
    }

    /* renamed from: b */
    public final void mo19665b(C10957d dVar) {
        if (dVar != null) {
            new StringBuilder("update done:").append(dVar.f29403c);
            if (dVar.f29409i) {
                this.f29216j.mo19701b(dVar);
            } else {
                this.f29216j.mo19696a(dVar);
            }
            if (this.f29217k != null) {
                this.f29217k.f29169b.mo19642a(dVar.f29403c);
            }
        }
    }

    /* renamed from: e */
    private static void m22081e(String str) {
        File file = new File(str);
        if (!file.exists() && !file.mkdirs()) {
            StringBuilder sb = new StringBuilder("invalid gecko dir:");
            sb.append(str);
            sb.append(", can't create directory at this path");
            throw new IllegalArgumentException(sb.toString());
        } else if (!file.isDirectory()) {
            StringBuilder sb2 = new StringBuilder("invalid gecko dir:");
            sb2.append(str);
            sb2.append(" is not a directory");
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    /* renamed from: b */
    public final boolean mo19666b(String str) {
        C10957d dVar = (C10957d) this.f29211e.get(str);
        if (dVar == null) {
            return false;
        }
        String str2 = dVar.f29404d;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f29209c);
        sb.append(str2);
        return new File(sb.toString()).exists();
    }

    /* renamed from: b */
    private C10959f m22078b(C10967l lVar) {
        C10959f fVar = new C10959f(null);
        fVar.f29421d = 1000;
        try {
            C10958e eVar = (C10958e) C10877b.m22046a().f29196a.mo34884a(lVar.f29453b, C10958e.class);
            if (eVar == null) {
                return fVar;
            }
            fVar.f29418a = eVar.f29417e;
            fVar.f29426i = 2;
            fVar.f29419b = this.f29207a.f29399c;
            fVar.f29420c = 0;
            fVar.f29422e = this.f29207a.f29398b;
            fVar.f29424g = String.valueOf(C10939d.m22200c(f29206l));
            fVar.f29425h = C10939d.m22197a();
            List<String> list = eVar.f29414b;
            if (list == null || list.size() == 0) {
                return fVar;
            }
            switch (lVar.f29452a) {
                case 1:
                    if (list.size() != 1 || !"*".equals(list.get(0))) {
                        m22075a(true, (String[]) list.toArray(new String[0]));
                    } else {
                        m22075a(true, new String[0]);
                    }
                    fVar.f29421d = 1000;
                    break;
                case 2:
                    for (final String str : eVar.f29414b) {
                        this.f29213g.execute(new Runnable() {
                            public final void run() {
                                C10885e eVar = C10885e.this;
                                eVar.f29216j.mo19700a(eVar.f29209c, str);
                            }
                        });
                    }
                    fVar.f29421d = 1000;
                    break;
            }
            return fVar;
        } catch (Exception unused) {
            return fVar;
        }
    }

    /* renamed from: a */
    public static boolean m22077a(List<?> list) {
        if (list == null || list.size() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final C10885e mo19650a(C10957d dVar) {
        return m22072a(dVar, false);
    }

    /* renamed from: a */
    public final C10957d mo19651a(String str) {
        return (C10957d) this.f29211e.get(str);
    }

    /* renamed from: a */
    private void m22073a(Map<String, Object> map, String... strArr) {
        m22074a(false, map, strArr);
    }

    /* renamed from: a */
    private void m22075a(boolean z, String... strArr) {
        m22074a(true, null, strArr);
    }

    /* renamed from: a */
    private C10885e m22072a(C10957d dVar, boolean z) {
        if (dVar != null && !this.f29211e.containsKey(dVar.f29403c)) {
            this.f29211e.put(dVar.f29403c, dVar);
        }
        return this;
    }

    /* renamed from: a */
    private void m22074a(boolean z, Map<String, Object> map, String... strArr) {
        String[] strArr2 = strArr;
        ArrayList arrayList = new ArrayList();
        if (strArr2 == null || strArr2.length == 0) {
            for (Entry entry : this.f29211e.entrySet()) {
                if (entry.getValue() != null) {
                    arrayList.add(entry.getValue());
                }
            }
        } else {
            for (int i = 0; i < strArr2.length; i++) {
                if (this.f29211e.get(strArr2[i]) != null) {
                    arrayList.add(this.f29211e.get(strArr2[i]));
                }
            }
        }
        if (arrayList.size() != 0) {
            C10873b bVar = new C10873b(f29206l, this, this.f29218m, arrayList, this.f29216j, this.f29207a, z, this, this.f29210d, this.f29209c, this.f29221p, map);
            if (!this.f29224s) {
                this.f29214h.add(bVar);
            } else {
                this.f29213g.execute(bVar);
            }
        }
    }

    /* renamed from: a */
    private boolean m22076a(final String str, int i, final C10879a aVar, Map<String, Object> map) {
        if (this.f29222q.containsKey(str)) {
            aVar.mo19646a("", null);
            return false;
        }
        if (!this.f29211e.containsKey(str)) {
            mo19650a(new C10957d(str));
        }
        final C108861 r8 = new C10897g() {
            /* renamed from: a */
            public final void mo19670a(int i, C10957d dVar) {
            }

            /* renamed from: a */
            public final void mo19672a(C10957d dVar, boolean z) {
            }

            /* renamed from: a */
            public final void mo19674a(List<C10957d> list, List<C10963j> list2) {
            }

            /* renamed from: b */
            public final void mo19675b(int i, C10957d dVar) {
                aVar.mo19645a();
                C10885e.this.mo19657a(str, (C10897g) this);
            }

            /* renamed from: a */
            public final void mo19673a(List<C10957d> list, Exception exc) {
                aVar.mo19646a("onCheckServerVersionFail", exc);
                C10885e.this.mo19657a(str, (C10897g) this);
            }

            /* renamed from: a */
            public final void mo19671a(int i, C10957d dVar, Exception exc) {
                aVar.mo19646a("onDownloadPackageFail", exc);
                C10885e.this.mo19657a(str, (C10897g) this);
            }

            /* renamed from: b */
            public final void mo19676b(int i, C10957d dVar, Exception exc) {
                aVar.mo19646a("onActivatePackageFail", exc);
                C10885e.this.mo19657a(str, (C10897g) this);
            }
        };
        this.f29212f.add(r8);
        this.f29222q.put(str, r8);
        this.f29223r.put(str, aVar);
        m22073a(null, str);
        if (i > 0 && i <= 10000) {
            this.f29215i.postDelayed(new Runnable() {
                public final void run() {
                    if (C10885e.this.f29212f.contains(r8)) {
                        aVar.mo19646a("timeout", null);
                        C10885e.this.mo19657a(str, r8);
                    }
                }
            }, (long) i);
        }
        return true;
    }

    private C10885e(String str, String str2, Context context, C10956c cVar) {
        this.f29211e = new ConcurrentHashMap();
        this.f29212f = new CopyOnWriteArrayList();
        this.f29222q = new HashMap();
        this.f29213g = (ScheduledExecutorService) C24076h.m58898a(C24085m.m58928a(C24093p.SCHEDULED).mo49844a(3).mo49847a());
        this.f29223r = new HashMap();
        this.f29214h = new LinkedBlockingQueue();
        this.f29225t = new LinkedBlockingQueue();
        this.f29226u = 0;
        this.f29227v = 2;
        this.f29228w = 3;
        this.f29229x = 4;
        this.f29230y = null;
        this.f29207a = cVar;
        if (!TextUtils.isEmpty(str)) {
            String str3 = cVar.f29397a;
            this.f29208b = str;
            if (this.f29208b.charAt(this.f29208b.length() - 1) != '/') {
                StringBuilder sb = new StringBuilder();
                sb.append(this.f29208b);
                sb.append('/');
                this.f29208b = sb.toString();
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f29208b);
            sb2.append(str3);
            sb2.append('/');
            this.f29209c = sb2.toString();
            m22081e(this.f29209c);
            StringBuilder sb3 = new StringBuilder();
            sb3.append(this.f29209c);
            sb3.append(".inactive/");
            this.f29210d = sb3.toString();
            m22081e(this.f29210d);
            this.f29215i = new Handler(Looper.getMainLooper()) {
                public final void handleMessage(Message message) {
                    C10885e eVar = C10885e.this;
                    int i = message.what;
                    if (i != 0) {
                        switch (i) {
                            case 2:
                                C10957d dVar = (C10957d) message.obj;
                                Exception exc = dVar.f29411k;
                                dVar.f29411k = null;
                                if (!C10885e.m22077a(eVar.f29212f) && !C10885e.m22077a(eVar.f29212f)) {
                                    for (C10897g gVar : eVar.f29212f) {
                                        if (message.obj instanceof C10957d) {
                                            if (exc != null) {
                                                gVar.mo19671a(message.arg2, dVar, exc);
                                            } else {
                                                gVar.mo19670a(message.arg2, dVar);
                                            }
                                        }
                                    }
                                    return;
                                }
                            case 3:
                                C10957d dVar2 = (C10957d) message.obj;
                                Exception exc2 = dVar2.f29411k;
                                dVar2.f29411k = null;
                                if (!C10885e.m22077a(eVar.f29212f) && (message.obj instanceof C10957d)) {
                                    C10957d dVar3 = (C10957d) message.obj;
                                    for (C10897g gVar2 : eVar.f29212f) {
                                        if (exc2 != null) {
                                            gVar2.mo19676b(message.arg2, dVar3, exc2);
                                        } else {
                                            gVar2.mo19675b(message.arg2, dVar3);
                                        }
                                    }
                                    break;
                                }
                        }
                    } else {
                        if (!eVar.f29214h.isEmpty()) {
                            while (eVar.f29214h.peek() != null) {
                                eVar.f29213g.execute((Runnable) eVar.f29214h.poll());
                            }
                        }
                        if (!C10885e.m22077a(eVar.f29212f)) {
                            Iterator it = eVar.f29212f.iterator();
                            while (it.hasNext()) {
                                it.next();
                                eVar.mo19652a();
                            }
                        }
                    }
                }
            };
            this.f29218m = new C10881a(cVar);
            f29206l = context;
            C10171b a = C10171b.m20499a(context);
            StringBuilder sb4 = new StringBuilder();
            sb4.append(str2);
            sb4.append("_");
            sb4.append(mo19664b());
            String sb5 = sb4.toString();
            String str4 = this.f29208b;
            String str5 = this.f29209c;
            a.f27503a = sb5;
            a.f27505c = str5;
            a.f27504b = str4;
            StringBuilder sb6 = new StringBuilder("create table if not exists ");
            sb6.append(sb5);
            sb6.append(" (id integer primary key autoincrement,channel");
            sb6.append(" text,version");
            sb6.append(" integer,update_when_launch");
            sb6.append(" integer,zip");
            sb6.append(" text,package_dir");
            sb6.append(" text,patch_zip");
            sb6.append(" text,update_done");
            sb6.append(" integer,update_zip");
            sb6.append(" text,update_zip_dir");
            sb6.append(" text,extra");
            sb6.append(" text,package_type");
            sb6.append(" integer)");
            a.f27506d = sb6.toString();
            a.getWritableDatabase().execSQL(a.f27506d);
            StringBuilder sb7 = new StringBuilder();
            sb7.append(str2);
            sb7.append("_");
            sb7.append(mo19664b());
            this.f29216j = new C10900j(context, sb7.toString(), this.f29208b, this.f29209c);
            if (C10931a.m22189a()) {
                synchronized (C10933c.f29344a) {
                    if (!C10933c.f29344a.contains(this)) {
                        C10933c.f29344a.add(this);
                    }
                }
                return;
            }
            return;
        }
        StringBuilder sb8 = new StringBuilder("invalid gecko dir:");
        sb8.append(str);
        throw new IllegalArgumentException(sb8.toString());
    }

    /* renamed from: a */
    public static C10895a m22071a(Context context, String str, String str2, String str3, String str4, String str5, int i) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            throw new IllegalArgumentException("empty access key or app version");
        }
        C10895a aVar = new C10895a(str4, context, str5, str, str2, str3, i);
        return aVar;
    }
}
