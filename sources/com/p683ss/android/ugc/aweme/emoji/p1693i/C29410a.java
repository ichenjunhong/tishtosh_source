package com.p683ss.android.ugc.aweme.emoji.p1693i;

import android.os.Build.VERSION;
import android.text.TextUtils;
import android.util.ArrayMap;
import com.p683ss.android.ugc.aweme.emoji.emojichoose.model.C29358c;
import com.p683ss.android.ugc.aweme.emoji.emojichoose.model.ResourcesResponse;
import com.p683ss.android.ugc.aweme.emoji.p1682c.p1683a.C29298a;
import com.p683ss.android.ugc.aweme.emoji.p1687f.C29366a;
import com.p683ss.android.ugc.aweme.emoji.utils.C29476f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import p001a.C0011g;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.emoji.i.a */
public class C29410a implements C29420h {

    /* renamed from: e */
    private static C29410a f77026e;

    /* renamed from: a */
    public LinkedHashMap<C29358c, List<C29366a>> f77027a;

    /* renamed from: b */
    List<C29420h> f77028b = new ArrayList();

    /* renamed from: c */
    private Map<String, String> f77029c;

    /* renamed from: d */
    private Map<String, String> f77030d;

    /* renamed from: b */
    public static boolean m69359b() {
        return C29415f.m69368a().f77049b;
    }

    private C29410a() {
        C29415f a = C29415f.m69368a();
        if (!a.f77038a.contains(this)) {
            a.f77038a.add(this);
        }
    }

    /* renamed from: a */
    public static C29410a m69356a() {
        if (f77026e == null) {
            synchronized (C29410a.class) {
                if (f77026e == null) {
                    f77026e = new C29410a();
                }
            }
        }
        return f77026e;
    }

    /* renamed from: c */
    public static void m69360c() {
        C29415f a = C29415f.m69368a();
        String str = "STICKER";
        C0013i.m18a((Callable<TResult>) new Callable<List<C29358c>>(str) {

            /* renamed from: a */
            final /* synthetic */ String f77052a;

            public final /* synthetic */ Object call() throws Exception {
                List<C29358c> list;
                ResourcesResponse a = C29423k.m69393a(this.f77052a);
                if (a == null) {
                    list = null;
                } else {
                    list = a.getResources();
                }
                if (a == null || a.status_code != 0) {
                    String str = this.f77052a;
                    StringBuilder sb = new StringBuilder("im_resources_");
                    sb.append(str);
                    Object a2 = C29476f.m69556a(sb.toString(), C29358c.class);
                    if (a2 == null) {
                        a2 = new ArrayList();
                    }
                    return a2;
                }
                if (list == null) {
                    list = new ArrayList<>();
                }
                for (C29358c type : list) {
                    type.setType(this.f77052a);
                }
                String str2 = this.f77052a;
                StringBuilder sb2 = new StringBuilder("im_resources_");
                sb2.append(str2);
                C29476f.m69557a(sb2.toString(), list);
                if (list.size() <= 0) {
                    return list;
                }
                C29423k.m69395c(this.f77052a, list);
                return list;
            }

            {
                this.f77052a = r2;
            }
        }, (Executor) C0013i.f24a).mo20a((C0011g<TResult, TContinuationResult>) new C0011g<List<C29358c>, Void>(str) {

            /* renamed from: a */
            final /* synthetic */ String f77050a;

            public final /* synthetic */ Object then(C0013i iVar) throws Exception {
                C29423k.this.mo59481a(this.f77050a, (List) iVar.mo34e());
                return null;
            }

            {
                this.f77050a = r2;
            }
        }, C0013i.f25b);
    }

    /* renamed from: e */
    public final boolean mo59477e() {
        if (this.f77027a == null || this.f77027a.size() == 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo59476d() {
        int i;
        if (this.f77029c != null) {
            this.f77029c.clear();
        }
        if (this.f77030d != null) {
            this.f77030d.clear();
        }
        int i2 = 0;
        if (this.f77027a == null) {
            i = 0;
        } else {
            i = 0;
            for (List size : this.f77027a.values()) {
                i += size.size();
            }
        }
        if (VERSION.SDK_INT >= 19) {
            this.f77029c = new ArrayMap(i);
            this.f77030d = new ArrayMap(i);
        } else {
            this.f77029c = new HashMap(i);
            this.f77030d = new HashMap(i);
        }
        for (List<C29366a> list : this.f77027a.values()) {
            if (list != null) {
                for (C29366a aVar : list) {
                    String a = C29298a.m69086a(aVar);
                    if (TextUtils.isEmpty(a)) {
                        a = aVar.getDisplayName();
                    }
                    String str = (String) this.f77029c.get(a);
                    if (TextUtils.isEmpty(str)) {
                        this.f77029c.put(a, String.valueOf(i2));
                    } else {
                        Map<String, String> map = this.f77029c;
                        StringBuilder sb = new StringBuilder();
                        sb.append(str);
                        sb.append(",");
                        sb.append(i2);
                        map.put(a, sb.toString());
                    }
                    String displayName = aVar.getDisplayName();
                    String str2 = (String) this.f77030d.get(displayName);
                    if (TextUtils.isEmpty(str2)) {
                        this.f77030d.put(displayName, String.valueOf(i2));
                    } else {
                        Map<String, String> map2 = this.f77030d;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(str2);
                        sb2.append(",");
                        sb2.append(i2);
                        map2.put(displayName, sb2.toString());
                    }
                    i2++;
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo59475b(C29420h hVar) {
        this.f77028b.remove(hVar);
    }

    /* renamed from: a */
    private C29366a m69355a(int i) {
        int i2 = 0;
        for (List list : this.f77027a.values()) {
            if (list.size() + i2 > i) {
                return (C29366a) list.get(i - i2);
            }
            i2 += list.size();
        }
        return null;
    }

    /* renamed from: a */
    public final List<C29366a> mo59471a(String str) {
        if (this.f77029c == null || this.f77029c.isEmpty() || TextUtils.isEmpty(str)) {
            return null;
        }
        List<C29366a> a = m69357a(this.f77030d, str);
        if (a == null) {
            a = m69357a(this.f77029c, str);
        }
        return a;
    }

    /* renamed from: a */
    public final void mo59473a(C29420h hVar) {
        if (!this.f77028b.contains(hVar)) {
            this.f77028b.add(hVar);
        }
    }

    /* renamed from: a */
    public final void mo59474a(LinkedHashMap<C29358c, List<C29366a>> linkedHashMap) {
        if (linkedHashMap != null) {
            this.f77027a = linkedHashMap;
        }
        C0013i.m18a((Callable<TResult>) new C29411b<TResult>(this), (Executor) C0013i.f24a).mo20a((C0011g<TResult, TContinuationResult>) new C29412c<TResult,TContinuationResult>(this), C0013i.f25b);
    }

    /* renamed from: a */
    public static boolean m69358a(C29358c cVar, boolean z) {
        return C29415f.m69368a().mo59486b(cVar, true);
    }

    /* renamed from: a */
    private List<C29366a> m69357a(Map<String, String> map, String str) {
        if (map == null) {
            return null;
        }
        String str2 = (String) map.get(str);
        if (str2 == null || TextUtils.isEmpty(str2)) {
            return null;
        }
        String[] split = str2.split(",");
        ArrayList arrayList = new ArrayList();
        for (String parseInt : split) {
            C29366a a = m69355a(Integer.parseInt(parseInt));
            if (a != null) {
                arrayList.add(a);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public final void mo59472a(C29358c cVar, List<C29366a> list) {
        if (list == null || list.size() <= 0) {
            for (C29420h a : this.f77028b) {
                a.mo59472a(cVar, list);
            }
            return;
        }
        this.f77027a.put(cVar, list);
        C0013i.m18a((Callable<TResult>) new C29413d<TResult>(this), (Executor) C0013i.f24a).mo20a((C0011g<TResult, TContinuationResult>) new C29414e<TResult,TContinuationResult>(this, cVar, list), C0013i.f25b);
    }
}
