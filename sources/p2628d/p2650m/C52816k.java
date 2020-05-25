package p2628d.p2650m;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import p2628d.p2629a.C52547a;
import p2628d.p2629a.C52562d;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2647j.C52751c;
import p2628d.p2647j.C52753d;
import p2628d.p2649l.C52786h;

/* renamed from: d.m.k */
final class C52816k implements C52815j {

    /* renamed from: a */
    private final C52813h f131062a = new C52818b(this);

    /* renamed from: b */
    private List<String> f131063b;

    /* renamed from: c */
    private final Matcher f131064c;

    /* renamed from: d */
    private final CharSequence f131065d;

    /* renamed from: d.m.k$a */
    public static final class C52817a extends C52562d<String> {

        /* renamed from: b */
        final /* synthetic */ C52816k f131066b;

        /* renamed from: a */
        public final int mo110100a() {
            return this.f131066b.mo110381f().groupCount() + 1;
        }

        C52817a(C52816k kVar) {
            this.f131066b = kVar;
        }

        public final /* bridge */ boolean contains(Object obj) {
            if (!(obj instanceof String)) {
                return false;
            }
            return super.contains((String) obj);
        }

        public final /* synthetic */ Object get(int i) {
            String group = this.f131066b.mo110381f().group(i);
            if (group == null) {
                return "";
            }
            return group;
        }

        public final /* bridge */ int indexOf(Object obj) {
            if (!(obj instanceof String)) {
                return -1;
            }
            return super.indexOf((String) obj);
        }

        public final /* bridge */ int lastIndexOf(Object obj) {
            if (!(obj instanceof String)) {
                return -1;
            }
            return super.lastIndexOf((String) obj);
        }
    }

    /* renamed from: d.m.k$b */
    public static final class C52818b extends C52547a<C52812g> implements C52814i {

        /* renamed from: a */
        final /* synthetic */ C52816k f131067a;

        /* renamed from: d.m.k$b$a */
        static final class C52819a extends C52712l implements C52671b<Integer, C52812g> {

            /* renamed from: a */
            final /* synthetic */ C52818b f131068a;

            C52819a(C52818b bVar) {
                this.f131068a = bVar;
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                return this.f131068a.mo110375a(((Number) obj).intValue());
            }
        }

        public final boolean isEmpty() {
            return false;
        }

        /* renamed from: a */
        public final int mo110100a() {
            return this.f131067a.mo110381f().groupCount() + 1;
        }

        public final Iterator<C52812g> iterator() {
            return C52786h.m112348d(C52575l.m112148k(C52575l.m112095a((Collection<?>) this)), new C52819a(this)).mo110157a();
        }

        C52818b(C52816k kVar) {
            this.f131067a = kVar;
        }

        public final /* bridge */ boolean contains(Object obj) {
            boolean z;
            if (obj != null) {
                z = obj instanceof C52812g;
            } else {
                z = true;
            }
            if (!z) {
                return false;
            }
            return super.contains((C52812g) obj);
        }

        /* renamed from: a */
        public final C52812g mo110375a(int i) {
            MatchResult f = this.f131067a.mo110381f();
            C52751c b = C52753d.m112320b(f.start(i), f.end(i));
            if (b.mo110348b().intValue() < 0) {
                return null;
            }
            String group = this.f131067a.mo110381f().group(i);
            C52711k.m112236a((Object) group, "matchResult.group(index)");
            return new C52812g(group, b);
        }
    }

    /* renamed from: c */
    public final C52813h mo110378c() {
        return this.f131062a;
    }

    /* renamed from: f */
    public final MatchResult mo110381f() {
        return this.f131064c;
    }

    /* renamed from: b */
    public final String mo110377b() {
        String group = mo110381f().group();
        C52711k.m112236a((Object) group, "matchResult.group()");
        return group;
    }

    /* renamed from: a */
    public final C52751c mo110376a() {
        MatchResult f = mo110381f();
        return C52753d.m112320b(f.start(), f.end());
    }

    /* renamed from: d */
    public final List<String> mo110379d() {
        if (this.f131063b == null) {
            this.f131063b = new C52817a(this);
        }
        List<String> list = this.f131063b;
        if (list == null) {
            C52711k.m112234a();
        }
        return list;
    }

    /* renamed from: e */
    public final C52815j mo110380e() {
        int i;
        int end = mo110381f().end();
        if (mo110381f().end() == mo110381f().start()) {
            i = 1;
        } else {
            i = 0;
        }
        int i2 = end + i;
        if (i2 > this.f131065d.length()) {
            return null;
        }
        Matcher matcher = this.f131064c.pattern().matcher(this.f131065d);
        C52711k.m112236a((Object) matcher, "matcher.pattern().matcher(input)");
        return C52826m.m112385a(matcher, i2, this.f131065d);
    }

    public C52816k(Matcher matcher, CharSequence charSequence) {
        C52711k.m112240b(matcher, "matcher");
        C52711k.m112240b(charSequence, "input");
        this.f131064c = matcher;
        this.f131065d = charSequence;
    }
}
