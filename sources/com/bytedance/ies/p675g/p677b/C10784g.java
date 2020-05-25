package com.bytedance.ies.p675g.p677b;

import com.bytedance.ies.p675g.p677b.C10779d.C10781b;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;

/* renamed from: com.bytedance.ies.g.b.g */
final class C10784g implements C10823a {

    /* renamed from: a */
    public final C10788h f28975a;

    /* renamed from: b */
    public final C10812w f28976b;

    /* renamed from: c */
    public final Set<C10779d> f28977c = new HashSet();

    /* renamed from: d */
    public final C10771a f28978d;

    /* renamed from: e */
    private final Map<String, C10777b> f28979e = new HashMap();

    /* renamed from: f */
    private final Map<String, C10781b> f28980f = new HashMap();

    /* renamed from: g */
    private final List<C10802q> f28981g = new ArrayList();

    /* renamed from: h */
    private final C10799n f28982h;

    /* renamed from: i */
    private final boolean f28983i;

    /* renamed from: j */
    private final boolean f28984j;

    /* renamed from: com.bytedance.ies.g.b.g$a */
    static final class C10787a {

        /* renamed from: a */
        boolean f28990a;

        /* renamed from: b */
        String f28991b;

        private C10787a(boolean z, String str) {
            this.f28990a = z;
            this.f28991b = str;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo19530a() {
        for (C10779d terminateActual : this.f28977c) {
            terminateActual.terminateActual();
        }
        this.f28977c.clear();
        this.f28979e.clear();
        this.f28980f.clear();
        this.f28976b.mo19590a((C10823a) this);
    }

    /* renamed from: b */
    public final void mo19535b() {
        LinkedList<C10802q> linkedList = new LinkedList<>(this.f28981g);
        this.f28981g.clear();
        for (C10802q b : linkedList) {
            this.f28978d.mo19510b(b);
        }
    }

    /* renamed from: a */
    private static Type[] m21860a(Object obj) {
        Type genericSuperclass = obj.getClass().getGenericSuperclass();
        if (genericSuperclass != null) {
            return ((ParameterizedType) genericSuperclass).getActualTypeArguments();
        }
        throw new IllegalStateException("Method is not parameterized?!");
    }

    /* renamed from: a */
    private Object m21859a(String str, C10777b bVar) throws JSONException {
        return this.f28975a.mo19537a(str, m21860a(bVar)[0]);
    }

    /* renamed from: b */
    private boolean m21861b(String str, C10777b bVar) {
        if (this.f28984j) {
            return false;
        }
        return this.f28976b.mo19592a(this.f28983i, str, bVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo19531a(String str, C10778c cVar) {
        cVar.name = str;
        this.f28979e.put(str, cVar);
        new StringBuilder("JsBridge raw method registered: ").append(str);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo19532a(String str, C10781b bVar) {
        this.f28980f.put(str, bVar);
        new StringBuilder("JsBridge stateful method registered: ").append(str);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C10787a mo19529a(final C10802q qVar, C10783f fVar) throws Exception {
        C10777b bVar = (C10777b) this.f28979e.get(qVar.f29017d);
        if (bVar != null) {
            try {
                if (m21861b(fVar.f28973b, bVar)) {
                    if (this.f28982h != null) {
                        this.f28982h.mo19567a(fVar.f28973b, qVar.f29017d, 1);
                    }
                    new StringBuilder("Permission denied, call: ").append(qVar);
                    throw new C10808t(-1);
                } else if (bVar instanceof C10782e) {
                    new StringBuilder("Processing stateless call: ").append(qVar);
                    C10782e eVar = (C10782e) bVar;
                    return new C10787a(true, C10774aa.m21845a(this.f28975a.mo19538a(eVar.invoke(m21859a(qVar.f29018e, (C10777b) eVar), fVar))));
                } else if (bVar instanceof C10778c) {
                    new StringBuilder("Processing raw call: ").append(qVar);
                    ((C10778c) bVar).mo19518a(qVar, new C10810v(qVar.f29017d, new C10811a() {
                        /* renamed from: a */
                        public final void mo19536a(String str) {
                            if (str != null && C10784g.this.f28978d != null) {
                                C10784g.this.f28978d.mo19511b(str, qVar);
                            }
                        }
                    }));
                    return new C10787a(false, C10774aa.m21844a());
                }
            } catch (C10816a unused) {
                new StringBuilder("No remote permission config fetched, call pending: ").append(qVar);
                this.f28981g.add(qVar);
                return new C10787a(false, C10774aa.m21844a());
            }
        }
        C10781b bVar2 = (C10781b) this.f28980f.get(qVar.f29017d);
        if (bVar2 != null) {
            final C10779d a = bVar2.mo10575a();
            a.name = qVar.f29017d;
            if (!m21861b(fVar.f28973b, a)) {
                new StringBuilder("Processing stateful call: ").append(qVar);
                this.f28977c.add(a);
                a.invokeActual(m21859a(qVar.f29018e, (C10777b) a), fVar, new C10780a() {
                    /* renamed from: a */
                    public final void mo19527a(Throwable th) {
                        if (C10784g.this.f28978d != null) {
                            C10784g.this.f28978d.mo19511b(C10774aa.m21846a(th), qVar);
                            C10784g.this.f28977c.remove(a);
                        }
                    }

                    /* renamed from: a */
                    public final void mo19526a(Object obj) {
                        if (C10784g.this.f28978d != null) {
                            C10784g.this.f28978d.mo19511b(C10774aa.m21845a(C10784g.this.f28975a.mo19538a(obj)), qVar);
                            C10784g.this.f28977c.remove(a);
                        }
                    }
                });
                return new C10787a(false, C10774aa.m21844a());
            }
            new StringBuilder("Permission denied, call: ").append(qVar);
            a.onDestroy();
            throw new C10808t(-1);
        }
        if (this.f28982h != null) {
            this.f28982h.mo19567a(fVar.f28973b, qVar.f29017d, 2);
        }
        StringBuilder sb = new StringBuilder("Received call: ");
        sb.append(qVar);
        sb.append(", but not registered.");
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo19533a(String str, C10782e<?, ?> eVar) {
        eVar.name = str;
        this.f28979e.put(str, eVar);
        new StringBuilder("JsBridge stateless method registered: ").append(str);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final <T> void mo19534a(String str, T t) {
        this.f28978d.mo19507a(str, this.f28975a.mo19538a(t));
    }

    C10784g(C10790j jVar, C10771a aVar, C10813x xVar) {
        this.f28978d = aVar;
        this.f28975a = jVar.f28997d;
        this.f28976b = new C10812w(xVar, jVar.f29005l, jVar.f29006m);
        C10812w wVar = this.f28976b;
        if (wVar.f29047a != null) {
            wVar.f29047a.f29070c.add(this);
        }
        this.f28976b.f29048b = jVar.f29009p;
        this.f28982h = jVar.f29002i;
        this.f28983i = jVar.f29001h;
        this.f28984j = jVar.f29008o;
    }
}
