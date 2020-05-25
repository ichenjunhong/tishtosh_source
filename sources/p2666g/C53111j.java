package p2666g;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Map;
import java.util.Map.Entry;
import okhttp3.C53500ac;
import okhttp3.C53671s;
import okhttp3.C53679x.C53681b;

/* renamed from: g.j */
abstract class C53111j<T> {

    /* renamed from: g.j$a */
    static final class C53114a<T> extends C53111j<T> {

        /* renamed from: a */
        private final C53095e<T, C53500ac> f131596a;

        C53114a(C53095e<T, C53500ac> eVar) {
            this.f131596a = eVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo110632a(C53131l lVar, T t) {
            if (t != null) {
                try {
                    lVar.f131625c = (C53500ac) this.f131596a.mo110590a(t);
                } catch (IOException e) {
                    StringBuilder sb = new StringBuilder("Unable to convert ");
                    sb.append(t);
                    sb.append(" to RequestBody");
                    throw new RuntimeException(sb.toString(), e);
                }
            } else {
                throw new IllegalArgumentException("Body parameter value must not be null.");
            }
        }
    }

    /* renamed from: g.j$b */
    static final class C53115b<T> extends C53111j<T> {

        /* renamed from: a */
        private final String f131597a;

        /* renamed from: b */
        private final C53095e<T, String> f131598b;

        /* renamed from: c */
        private final boolean f131599c;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo110632a(C53131l lVar, T t) throws IOException {
            if (t != null) {
                String str = (String) this.f131598b.mo110590a(t);
                if (str != null) {
                    lVar.mo110643b(this.f131597a, str, this.f131599c);
                }
            }
        }

        C53115b(String str, C53095e<T, String> eVar, boolean z) {
            this.f131597a = (String) C53139p.m112957a(str, "name == null");
            this.f131598b = eVar;
            this.f131599c = z;
        }
    }

    /* renamed from: g.j$c */
    static final class C53116c<T> extends C53111j<Map<String, T>> {

        /* renamed from: a */
        private final C53095e<T, String> f131600a;

        /* renamed from: b */
        private final boolean f131601b;

        C53116c(C53095e<T, String> eVar, boolean z) {
            this.f131600a = eVar;
            this.f131601b = z;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final /* synthetic */ void mo110632a(C53131l lVar, Object obj) throws IOException {
            Map map = (Map) obj;
            if (map != null) {
                for (Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str != null) {
                        Object value = entry.getValue();
                        if (value != null) {
                            String str2 = (String) this.f131600a.mo110590a(value);
                            if (str2 != null) {
                                lVar.mo110643b(str, str2, this.f131601b);
                            } else {
                                StringBuilder sb = new StringBuilder("Field map value '");
                                sb.append(value);
                                sb.append("' converted to null by ");
                                sb.append(this.f131600a.getClass().getName());
                                sb.append(" for key '");
                                sb.append(str);
                                sb.append("'.");
                                throw new IllegalArgumentException(sb.toString());
                            }
                        } else {
                            StringBuilder sb2 = new StringBuilder("Field map contained null value for key '");
                            sb2.append(str);
                            sb2.append("'.");
                            throw new IllegalArgumentException(sb2.toString());
                        }
                    } else {
                        throw new IllegalArgumentException("Field map contained null key.");
                    }
                }
                return;
            }
            throw new IllegalArgumentException("Field map was null.");
        }
    }

    /* renamed from: g.j$d */
    static final class C53117d<T> extends C53111j<T> {

        /* renamed from: a */
        private final String f131602a;

        /* renamed from: b */
        private final C53095e<T, String> f131603b;

        C53117d(String str, C53095e<T, String> eVar) {
            this.f131602a = (String) C53139p.m112957a(str, "name == null");
            this.f131603b = eVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo110632a(C53131l lVar, T t) throws IOException {
            if (t != null) {
                String str = (String) this.f131603b.mo110590a(t);
                if (str != null) {
                    lVar.mo110640a(this.f131602a, str);
                }
            }
        }
    }

    /* renamed from: g.j$e */
    static final class C53118e<T> extends C53111j<Map<String, T>> {

        /* renamed from: a */
        private final C53095e<T, String> f131604a;

        C53118e(C53095e<T, String> eVar) {
            this.f131604a = eVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final /* synthetic */ void mo110632a(C53131l lVar, Object obj) throws IOException {
            Map map = (Map) obj;
            if (map != null) {
                for (Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str != null) {
                        Object value = entry.getValue();
                        if (value != null) {
                            lVar.mo110640a(str, (String) this.f131604a.mo110590a(value));
                        } else {
                            StringBuilder sb = new StringBuilder("Header map contained null value for key '");
                            sb.append(str);
                            sb.append("'.");
                            throw new IllegalArgumentException(sb.toString());
                        }
                    } else {
                        throw new IllegalArgumentException("Header map contained null key.");
                    }
                }
                return;
            }
            throw new IllegalArgumentException("Header map was null.");
        }
    }

    /* renamed from: g.j$f */
    static final class C53119f<T> extends C53111j<T> {

        /* renamed from: a */
        private final C53671s f131605a;

        /* renamed from: b */
        private final C53095e<T, C53500ac> f131606b;

        C53119f(C53671s sVar, C53095e<T, C53500ac> eVar) {
            this.f131605a = sVar;
            this.f131606b = eVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo110632a(C53131l lVar, T t) {
            if (t != null) {
                try {
                    lVar.mo110642a(this.f131605a, (C53500ac) this.f131606b.mo110590a(t));
                } catch (IOException e) {
                    StringBuilder sb = new StringBuilder("Unable to convert ");
                    sb.append(t);
                    sb.append(" to RequestBody");
                    throw new RuntimeException(sb.toString(), e);
                }
            }
        }
    }

    /* renamed from: g.j$g */
    static final class C53120g<T> extends C53111j<Map<String, T>> {

        /* renamed from: a */
        private final C53095e<T, C53500ac> f131607a;

        /* renamed from: b */
        private final String f131608b;

        C53120g(C53095e<T, C53500ac> eVar, String str) {
            this.f131607a = eVar;
            this.f131608b = str;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final /* synthetic */ void mo110632a(C53131l lVar, Object obj) throws IOException {
            Map map = (Map) obj;
            if (map != null) {
                for (Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str != null) {
                        Object value = entry.getValue();
                        if (value != null) {
                            StringBuilder sb = new StringBuilder("form-data; name=\"");
                            sb.append(str);
                            sb.append("\"");
                            lVar.mo110642a(C53671s.m114150a("Content-Disposition", sb.toString(), "Content-Transfer-Encoding", this.f131608b), (C53500ac) this.f131607a.mo110590a(value));
                        } else {
                            StringBuilder sb2 = new StringBuilder("Part map contained null value for key '");
                            sb2.append(str);
                            sb2.append("'.");
                            throw new IllegalArgumentException(sb2.toString());
                        }
                    } else {
                        throw new IllegalArgumentException("Part map contained null key.");
                    }
                }
                return;
            }
            throw new IllegalArgumentException("Part map was null.");
        }
    }

    /* renamed from: g.j$h */
    static final class C53121h<T> extends C53111j<T> {

        /* renamed from: a */
        private final String f131609a;

        /* renamed from: b */
        private final C53095e<T, String> f131610b;

        /* renamed from: c */
        private final boolean f131611c;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo110632a(C53131l lVar, T t) throws IOException {
            if (t != null) {
                String str = this.f131609a;
                String str2 = (String) this.f131610b.mo110590a(t);
                boolean z = this.f131611c;
                if (lVar.f131623a != null) {
                    String str3 = lVar.f131623a;
                    StringBuilder sb = new StringBuilder("{");
                    sb.append(str);
                    sb.append("}");
                    lVar.f131623a = str3.replace(sb.toString(), C53131l.m112922a(str2, z));
                    return;
                }
                throw new AssertionError();
            }
            StringBuilder sb2 = new StringBuilder("Path parameter \"");
            sb2.append(this.f131609a);
            sb2.append("\" value must not be null.");
            throw new IllegalArgumentException(sb2.toString());
        }

        C53121h(String str, C53095e<T, String> eVar, boolean z) {
            this.f131609a = (String) C53139p.m112957a(str, "name == null");
            this.f131610b = eVar;
            this.f131611c = z;
        }
    }

    /* renamed from: g.j$i */
    static final class C53122i<T> extends C53111j<T> {

        /* renamed from: a */
        private final String f131612a;

        /* renamed from: b */
        private final C53095e<T, String> f131613b;

        /* renamed from: c */
        private final boolean f131614c;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo110632a(C53131l lVar, T t) throws IOException {
            if (t != null) {
                String str = (String) this.f131613b.mo110590a(t);
                if (str != null) {
                    lVar.mo110641a(this.f131612a, str, this.f131614c);
                }
            }
        }

        C53122i(String str, C53095e<T, String> eVar, boolean z) {
            this.f131612a = (String) C53139p.m112957a(str, "name == null");
            this.f131613b = eVar;
            this.f131614c = z;
        }
    }

    /* renamed from: g.j$j */
    static final class C53123j<T> extends C53111j<Map<String, T>> {

        /* renamed from: a */
        private final C53095e<T, String> f131615a;

        /* renamed from: b */
        private final boolean f131616b;

        C53123j(C53095e<T, String> eVar, boolean z) {
            this.f131615a = eVar;
            this.f131616b = z;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final /* synthetic */ void mo110632a(C53131l lVar, Object obj) throws IOException {
            Map map = (Map) obj;
            if (map != null) {
                for (Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str != null) {
                        Object value = entry.getValue();
                        if (value != null) {
                            String str2 = (String) this.f131615a.mo110590a(value);
                            if (str2 != null) {
                                lVar.mo110641a(str, str2, this.f131616b);
                            } else {
                                StringBuilder sb = new StringBuilder("Query map value '");
                                sb.append(value);
                                sb.append("' converted to null by ");
                                sb.append(this.f131615a.getClass().getName());
                                sb.append(" for key '");
                                sb.append(str);
                                sb.append("'.");
                                throw new IllegalArgumentException(sb.toString());
                            }
                        } else {
                            StringBuilder sb2 = new StringBuilder("Query map contained null value for key '");
                            sb2.append(str);
                            sb2.append("'.");
                            throw new IllegalArgumentException(sb2.toString());
                        }
                    } else {
                        throw new IllegalArgumentException("Query map contained null key.");
                    }
                }
                return;
            }
            throw new IllegalArgumentException("Query map was null.");
        }
    }

    /* renamed from: g.j$k */
    static final class C53124k<T> extends C53111j<T> {

        /* renamed from: a */
        private final C53095e<T, String> f131617a;

        /* renamed from: b */
        private final boolean f131618b;

        C53124k(C53095e<T, String> eVar, boolean z) {
            this.f131617a = eVar;
            this.f131618b = z;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo110632a(C53131l lVar, T t) throws IOException {
            if (t != null) {
                lVar.mo110641a((String) this.f131617a.mo110590a(t), null, this.f131618b);
            }
        }
    }

    /* renamed from: g.j$l */
    static final class C53125l extends C53111j<C53681b> {

        /* renamed from: a */
        static final C53125l f131619a = new C53125l();

        private C53125l() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo110632a(C53131l lVar, Object obj) throws IOException {
            C53681b bVar = (C53681b) obj;
            if (bVar != null) {
                lVar.f131624b.mo111649a(bVar);
            }
        }
    }

    /* renamed from: g.j$m */
    static final class C53126m extends C53111j<Object> {
        C53126m() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo110632a(C53131l lVar, Object obj) {
            C53139p.m112957a(obj, "@Url parameter is null.");
            lVar.f131623a = obj.toString();
        }
    }

    C53111j() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract void mo110632a(C53131l lVar, T t) throws IOException;

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C53111j<Iterable<T>> mo110631a() {
        return new C53111j<Iterable<T>>() {
            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final /* synthetic */ void mo110632a(C53131l lVar, Object obj) throws IOException {
                Iterable<Object> iterable = (Iterable) obj;
                if (iterable != null) {
                    for (Object a : iterable) {
                        C53111j.this.mo110632a(lVar, a);
                    }
                }
            }
        };
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final C53111j<Object> mo110633b() {
        return new C53111j<Object>() {
            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final void mo110632a(C53131l lVar, Object obj) throws IOException {
                if (obj != null) {
                    int length = Array.getLength(obj);
                    for (int i = 0; i < length; i++) {
                        C53111j.this.mo110632a(lVar, Array.get(obj, i));
                    }
                }
            }
        };
    }
}
