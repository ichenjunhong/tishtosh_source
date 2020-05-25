package com.p683ss.android.ugc.effectmanager;

import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48696a;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48697b;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48701f;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48702g;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48703h;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48704i;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48705j;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48706k;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48707l;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48708m;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48711p;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48712q;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48713r;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48716u;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.ugc.effectmanager.k */
public final class C48903k {

    /* renamed from: a */
    public Map<String, C48702g> f123037a = new HashMap();

    /* renamed from: b */
    public Map<String, C48696a> f123038b = new HashMap();

    /* renamed from: c */
    Map<String, C48704i> f123039c = new HashMap();

    /* renamed from: d */
    public Map<String, C48703h> f123040d;

    /* renamed from: e */
    public Map<String, C48711p> f123041e = new HashMap();

    /* renamed from: f */
    public Map<String, C48706k> f123042f = new HashMap();

    /* renamed from: g */
    public Map<String, C48716u> f123043g = new HashMap();

    /* renamed from: h */
    public Map<String, C48712q> f123044h = new HashMap();

    /* renamed from: i */
    public Map<String, C48708m> f123045i;

    /* renamed from: j */
    public Map<String, C48697b> f123046j;

    /* renamed from: k */
    public Map<String, C48701f> f123047k;

    /* renamed from: l */
    public Map<String, C48707l> f123048l;

    /* renamed from: m */
    public Map<String, C48713r> f123049m = new HashMap();

    /* renamed from: n */
    private Map<String, C48705j> f123050n = new HashMap();

    /* renamed from: o */
    private Map<String, Object> f123051o;

    /* renamed from: a */
    public final void mo96697a() {
        for (String put : this.f123038b.keySet()) {
            this.f123038b.put(put, null);
        }
        for (String put2 : this.f123037a.keySet()) {
            this.f123037a.put(put2, null);
        }
        for (String put3 : this.f123039c.keySet()) {
            this.f123039c.put(put3, null);
        }
        for (String put4 : this.f123050n.keySet()) {
            this.f123050n.put(put4, null);
        }
        for (String put5 : this.f123041e.keySet()) {
            this.f123041e.put(put5, null);
        }
        for (String put6 : this.f123042f.keySet()) {
            this.f123042f.put(put6, null);
        }
        for (String put7 : this.f123044h.keySet()) {
            this.f123044h.put(put7, null);
        }
        for (String put8 : this.f123043g.keySet()) {
            this.f123043g.put(put8, null);
        }
        for (String put9 : this.f123049m.keySet()) {
            this.f123049m.put(put9, null);
        }
        if (this.f123045i != null) {
            this.f123045i.clear();
        }
    }

    /* renamed from: b */
    public final void mo96703b(String str) {
        if (this.f123050n != null) {
            this.f123050n.remove(str);
        }
    }

    /* renamed from: e */
    public final void mo96706e(String str) {
        if (this.f123051o != null) {
            this.f123051o.remove(str);
        }
    }

    /* renamed from: f */
    public final C48697b mo96707f(String str) {
        if (this.f123046j == null) {
            return null;
        }
        return (C48697b) this.f123046j.get(str);
    }

    /* renamed from: a */
    public final C48705j mo96695a(String str) {
        if (this.f123050n == null) {
            this.f123050n = new HashMap();
        }
        return (C48705j) this.f123050n.get(str);
    }

    /* renamed from: c */
    public final C48702g mo96704c(String str) {
        if (this.f123037a == null) {
            this.f123037a = new HashMap();
        }
        return (C48702g) this.f123037a.get(str);
    }

    /* renamed from: d */
    public final Object mo96705d(String str) {
        if (this.f123051o == null) {
            this.f123051o = new HashMap();
        }
        return this.f123051o.get(str);
    }

    /* renamed from: a */
    public final Object mo96696a(String str, Object obj) {
        if (this.f123051o == null) {
            this.f123051o = new HashMap();
        }
        return this.f123051o.put(str, obj);
    }

    /* renamed from: a */
    public final void mo96698a(String str, C48703h hVar) {
        if (this.f123040d == null) {
            this.f123040d = new HashMap();
        }
        this.f123040d.put(str, hVar);
    }

    /* renamed from: a */
    public final void mo96699a(String str, C48704i iVar) {
        if (this.f123050n == null) {
            this.f123050n = new HashMap();
        }
        this.f123039c.put(str, iVar);
    }

    /* renamed from: a */
    public final void mo96700a(String str, C48705j jVar) {
        if (this.f123050n == null) {
            this.f123050n = new HashMap();
        }
        this.f123050n.put(str, jVar);
    }

    /* renamed from: a */
    public final void mo96701a(String str, C48708m mVar) {
        if (this.f123045i == null) {
            this.f123045i = new HashMap();
        }
        this.f123045i.put(str, mVar);
    }

    /* renamed from: a */
    public final void mo96702a(String str, C48712q qVar) {
        if (this.f123044h == null) {
            this.f123044h = new HashMap();
        }
        this.f123044h.put(str, qVar);
    }
}
