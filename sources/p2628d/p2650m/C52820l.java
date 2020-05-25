package p2628d.p2650m;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p2628d.p2629a.C52575l;
import p2628d.p2629a.C52583s;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52710j;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2647j.C52753d;
import p2628d.p2648k.C52761d;
import p2628d.p2649l.C52783f;
import p2628d.p2649l.C52785g;
import p2628d.p2650m.C52826m.C52827a;

/* renamed from: d.m.l */
public final class C52820l implements Serializable {
    public static final C52821a Companion = new C52821a(null);

    /* renamed from: a */
    private Set<? extends C52828n> f131069a;

    /* renamed from: b */
    private final Pattern f131070b;

    /* renamed from: d.m.l$a */
    public static final class C52821a {
        private C52821a() {
        }

        /* renamed from: a */
        public static int m112383a(int i) {
            return (i & 2) != 0 ? i | 64 : i;
        }

        public /* synthetic */ C52821a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: d.m.l$b */
    static final class C52822b implements Serializable {

        /* renamed from: a */
        public static final C52823a f131071a = new C52823a(null);
        private static final long serialVersionUID = 0;

        /* renamed from: b */
        private final String f131072b;

        /* renamed from: c */
        private final int f131073c;

        /* renamed from: d.m.l$b$a */
        public static final class C52823a {
            private C52823a() {
            }

            public /* synthetic */ C52823a(C52707g gVar) {
                this();
            }
        }

        private final Object readResolve() {
            Pattern compile = Pattern.compile(this.f131072b, this.f131073c);
            C52711k.m112236a((Object) compile, "Pattern.compile(pattern, flags)");
            return new C52820l(compile);
        }

        public C52822b(String str, int i) {
            C52711k.m112240b(str, "pattern");
            this.f131072b = str;
            this.f131073c = i;
        }
    }

    /* renamed from: d.m.l$c */
    static final class C52824c extends C52712l implements C52670a<C52815j> {

        /* renamed from: a */
        final /* synthetic */ C52820l f131074a;

        /* renamed from: b */
        final /* synthetic */ CharSequence f131075b;

        /* renamed from: c */
        final /* synthetic */ int f131076c;

        C52824c(C52820l lVar, CharSequence charSequence, int i) {
            this.f131074a = lVar;
            this.f131075b = charSequence;
            this.f131076c = i;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return this.f131074a.find(this.f131075b, this.f131076c);
        }
    }

    /* renamed from: d.m.l$d */
    static final /* synthetic */ class C52825d extends C52710j implements C52671b<C52815j, C52815j> {

        /* renamed from: a */
        public static final C52825d f131077a = new C52825d();

        C52825d() {
            super(1);
        }

        public final String getName() {
            return "next";
        }

        public final C52761d getOwner() {
            return C52728w.m112245a(C52815j.class);
        }

        public final String getSignature() {
            return "next()Lkotlin/text/MatchResult;";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            C52815j jVar = (C52815j) obj;
            C52711k.m112240b(jVar, "p1");
            return jVar.mo110380e();
        }
    }

    public final Pattern toPattern() {
        return this.f131070b;
    }

    public final String getPattern() {
        String pattern = this.f131070b.pattern();
        C52711k.m112236a((Object) pattern, "nativePattern.pattern()");
        return pattern;
    }

    public final String toString() {
        String pattern = this.f131070b.toString();
        C52711k.m112236a((Object) pattern, "nativePattern.toString()");
        return pattern;
    }

    private final Object writeReplace() {
        String pattern = this.f131070b.pattern();
        C52711k.m112236a((Object) pattern, "nativePattern.pattern()");
        return new C52822b(pattern, this.f131070b.flags());
    }

    public final Set<C52828n> getOptions() {
        Set<? extends C52828n> set = this.f131069a;
        if (set != null) {
            return set;
        }
        int flags = this.f131070b.flags();
        EnumSet allOf = EnumSet.allOf(C52828n.class);
        Iterable iterable = allOf;
        C52671b aVar = new C52827a(flags);
        C52711k.m112240b(iterable, "$this$retainAll");
        C52711k.m112240b(aVar, "predicate");
        C52583s.m112107a(iterable, aVar, false);
        Set<? extends C52828n> unmodifiableSet = Collections.unmodifiableSet(allOf);
        C52711k.m112236a((Object) unmodifiableSet, "Collections.unmodifiable…mask == it.value }\n    })");
        this.f131069a = unmodifiableSet;
        return unmodifiableSet;
    }

    public C52820l(Pattern pattern) {
        C52711k.m112240b(pattern, "nativePattern");
        this.f131070b = pattern;
    }

    public final boolean containsMatchIn(CharSequence charSequence) {
        C52711k.m112240b(charSequence, "input");
        return this.f131070b.matcher(charSequence).find();
    }

    public final boolean matches(CharSequence charSequence) {
        C52711k.m112240b(charSequence, "input");
        return this.f131070b.matcher(charSequence).matches();
    }

    public C52820l(String str) {
        C52711k.m112240b(str, "pattern");
        Pattern compile = Pattern.compile(str);
        C52711k.m112236a((Object) compile, "Pattern.compile(pattern)");
        this(compile);
    }

    public final C52815j matchEntire(CharSequence charSequence) {
        C52711k.m112240b(charSequence, "input");
        Matcher matcher = this.f131070b.matcher(charSequence);
        C52711k.m112236a((Object) matcher, "nativePattern.matcher(input)");
        if (!matcher.matches()) {
            return null;
        }
        return new C52816k(matcher, charSequence);
    }

    public final C52815j find(CharSequence charSequence, int i) {
        C52711k.m112240b(charSequence, "input");
        Matcher matcher = this.f131070b.matcher(charSequence);
        C52711k.m112236a((Object) matcher, "nativePattern.matcher(input)");
        return C52826m.m112385a(matcher, i, charSequence);
    }

    public final String replace(CharSequence charSequence, String str) {
        C52711k.m112240b(charSequence, "input");
        C52711k.m112240b(str, "replacement");
        String replaceAll = this.f131070b.matcher(charSequence).replaceAll(str);
        C52711k.m112236a((Object) replaceAll, "nativePattern.matcher(in…).replaceAll(replacement)");
        return replaceAll;
    }

    public final String replaceFirst(CharSequence charSequence, String str) {
        C52711k.m112240b(charSequence, "input");
        C52711k.m112240b(str, "replacement");
        String replaceFirst = this.f131070b.matcher(charSequence).replaceFirst(str);
        C52711k.m112236a((Object) replaceFirst, "nativePattern.matcher(in…replaceFirst(replacement)");
        return replaceFirst;
    }

    public C52820l(String str, C52828n nVar) {
        C52711k.m112240b(str, "pattern");
        C52711k.m112240b(nVar, "option");
        Pattern compile = Pattern.compile(str, C52821a.m112383a(nVar.getValue()));
        C52711k.m112236a((Object) compile, "Pattern.compile(pattern,…nicodeCase(option.value))");
        this(compile);
    }

    public final C52785g<C52815j> findAll(CharSequence charSequence, int i) {
        C52711k.m112240b(charSequence, "input");
        C52670a cVar = new C52824c(this, charSequence, i);
        C52671b bVar = C52825d.f131077a;
        C52711k.m112240b(cVar, "seedFunction");
        C52711k.m112240b(bVar, "nextFunction");
        return new C52783f<>(cVar, bVar);
    }

    public C52820l(String str, Set<? extends C52828n> set) {
        C52711k.m112240b(str, "pattern");
        C52711k.m112240b(set, "options");
        Pattern compile = Pattern.compile(str, C52821a.m112383a(C52826m.m112384a(set)));
        C52711k.m112236a((Object) compile, "Pattern.compile(pattern,…odeCase(options.toInt()))");
        this(compile);
    }

    public final String replace(CharSequence charSequence, C52671b<? super C52815j, ? extends CharSequence> bVar) {
        C52711k.m112240b(charSequence, "input");
        C52711k.m112240b(bVar, "transform");
        int i = 0;
        C52815j find$default = find$default(this, charSequence, 0, 2, null);
        if (find$default == null) {
            return charSequence.toString();
        }
        int length = charSequence.length();
        StringBuilder sb = new StringBuilder(length);
        do {
            if (find$default == null) {
                C52711k.m112234a();
            }
            sb.append(charSequence, i, find$default.mo110376a().mo110348b().intValue());
            sb.append((CharSequence) bVar.invoke(find$default));
            i = find$default.mo110376a().mo110349c().intValue() + 1;
            find$default = find$default.mo110380e();
            if (i >= length) {
                break;
            }
        } while (find$default != null);
        if (i < length) {
            sb.append(charSequence, i, length);
        }
        String sb2 = sb.toString();
        C52711k.m112236a((Object) sb2, "sb.toString()");
        return sb2;
    }

    public final List<String> split(CharSequence charSequence, int i) {
        boolean z;
        C52711k.m112240b(charSequence, "input");
        int i2 = 0;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            Matcher matcher = this.f131070b.matcher(charSequence);
            if (!matcher.find() || i == 1) {
                return C52575l.m112092a(charSequence.toString());
            }
            int i3 = 10;
            if (i > 0) {
                i3 = C52753d.m112322d(i, 10);
            }
            ArrayList arrayList = new ArrayList(i3);
            int i4 = i - 1;
            do {
                arrayList.add(charSequence.subSequence(i2, matcher.start()).toString());
                i2 = matcher.end();
                if (i4 >= 0 && arrayList.size() == i4) {
                    break;
                }
            } while (matcher.find());
            arrayList.add(charSequence.subSequence(i2, charSequence.length()).toString());
            return arrayList;
        }
        StringBuilder sb = new StringBuilder("Limit must be non-negative, but was ");
        sb.append(i);
        sb.append('.');
        throw new IllegalArgumentException(sb.toString().toString());
    }

    public static /* synthetic */ C52815j find$default(C52820l lVar, CharSequence charSequence, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return lVar.find(charSequence, i);
    }

    public static /* synthetic */ C52785g findAll$default(C52820l lVar, CharSequence charSequence, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return lVar.findAll(charSequence, i);
    }

    public static /* synthetic */ List split$default(C52820l lVar, CharSequence charSequence, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return lVar.split(charSequence, i);
    }
}
