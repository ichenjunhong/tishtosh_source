package com.bytedance.ies.bullet.p628b.p643i;

import android.net.Uri;
import java.io.File;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NoSuchElementException;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2640a.C52686q;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52731z;
import p2628d.p2650m.C52830p;

/* renamed from: com.bytedance.ies.bullet.b.i.m */
public final class C10392m {

    /* renamed from: com.bytedance.ies.bullet.b.i.m$a */
    public static final class C10393a extends C52712l implements C52682m<Map<?, ?>, String, Boolean> {
        public C10393a() {
            super(2);
        }

        public final Boolean invoke(Map<?, ?> map, String str) {
            C52711k.m112240b(map, "map");
            C52711k.m112240b(str, "key");
            Object obj = map.get(str);
            if (obj != null) {
                if (!(obj instanceof String)) {
                    obj = null;
                }
                String str2 = (String) obj;
                if (str2 != null) {
                    return Boolean.valueOf(C52711k.m112239a((Object) str2, (Object) "1"));
                }
            }
            return null;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.b.i.m$b */
    public static final class C10394b extends C52712l implements C52686q<Map<?, ?>, String, Double, Map<Object, Object>> {
        public C10394b() {
            super(3);
        }

        public final Map<Object, Object> invoke(Map<?, ?> map, String str, Double d) {
            C52711k.m112240b(map, "builder");
            C52711k.m112240b(str, "key");
            Map<Object, Object> f = C52731z.m112270f(map);
            String valueOf = String.valueOf(d.doubleValue());
            if (valueOf != null) {
                f.put(str, valueOf);
            }
            return f;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.b.i.m$c */
    public static final class C10395c extends C52712l implements C52682m<Map<?, ?>, String, String> {
        public C10395c() {
            super(2);
        }

        public final String invoke(Map<?, ?> map, String str) {
            C52711k.m112240b(map, "map");
            C52711k.m112240b(str, "key");
            Object obj = map.get(str);
            if (obj != null) {
                if (!(obj instanceof String)) {
                    obj = null;
                }
                String str2 = (String) obj;
                if (str2 != null) {
                    return str2;
                }
            }
            return null;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.b.i.m$d */
    public static final class C10396d extends C52712l implements C52686q<Map<?, ?>, String, String, Map<Object, Object>> {
        public C10396d() {
            super(3);
        }

        public final Map<Object, Object> invoke(Map<?, ?> map, String str, String str2) {
            C52711k.m112240b(map, "builder");
            C52711k.m112240b(str, "key");
            Map<Object, Object> f = C52731z.m112270f(map);
            String str3 = str2;
            if (str3 != null) {
                f.put(str, str3);
            }
            return f;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.b.i.m$e */
    public static final class C10397e extends C52712l implements C52682m<Map<?, ?>, String, List<? extends String>> {
        public C10397e() {
            super(2);
        }

        public final List<? extends String> invoke(Map<?, ?> map, String str) {
            C52711k.m112240b(map, "map");
            C52711k.m112240b(str, "key");
            Object obj = map.get(str);
            if (obj != null) {
                if (!(obj instanceof String)) {
                    obj = null;
                }
                String str2 = (String) obj;
                if (str2 != null) {
                    return C52830p.m112452b((CharSequence) str2, new String[]{","}, false, 0, 6, (Object) null);
                }
            }
            return null;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.b.i.m$f */
    public static final class C10398f extends C52712l implements C52686q<Map<?, ?>, String, List<? extends String>, Map<Object, Object>> {
        public C10398f() {
            super(3);
        }

        public final Map<Object, Object> invoke(Map<?, ?> map, String str, List<? extends String> list) {
            C52711k.m112240b(map, "builder");
            C52711k.m112240b(str, "key");
            Map<Object, Object> f = C52731z.m112270f(map);
            String a = C52575l.m112120a(list, ",", null, null, 0, null, null, 62, null);
            if (a != null) {
                f.put(str, a);
            }
            return f;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.b.i.m$g */
    public static final class C10399g extends C52712l implements C52682m<Map<?, ?>, String, Uri> {
        public C10399g() {
            super(2);
        }

        public final Uri invoke(Map<?, ?> map, String str) {
            C52711k.m112240b(map, "map");
            C52711k.m112240b(str, "key");
            Object obj = map.get(str);
            if (obj != null) {
                if (!(obj instanceof String)) {
                    obj = null;
                }
                String str2 = (String) obj;
                if (str2 != null) {
                    return Uri.parse(str2);
                }
            }
            return null;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.b.i.m$h */
    public static final class C10400h extends C52712l implements C52686q<Map<?, ?>, String, Uri, Map<Object, Object>> {
        public C10400h() {
            super(3);
        }

        public final Map<Object, Object> invoke(Map<?, ?> map, String str, Uri uri) {
            C52711k.m112240b(map, "builder");
            C52711k.m112240b(str, "key");
            Map<Object, Object> f = C52731z.m112270f(map);
            String valueOf = String.valueOf(uri);
            if (valueOf != null) {
                f.put(str, valueOf);
            }
            return f;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.b.i.m$i */
    public static final class C10401i extends C52712l implements C52682m<Map<?, ?>, String, String> {

        /* renamed from: a */
        final /* synthetic */ String f27814a;

        public C10401i(String str) {
            this.f27814a = str;
            super(2);
        }

        public final String invoke(Map<?, ?> map, String str) {
            C52711k.m112240b(map, "map");
            C52711k.m112240b(str, "<anonymous parameter 1>");
            Object obj = map.get(this.f27814a);
            if (obj != null) {
                if (!(obj instanceof String)) {
                    obj = null;
                }
                String str2 = (String) obj;
                if (str2 != null) {
                    return str2;
                }
            }
            return null;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.b.i.m$j */
    public static final class C10402j extends C52712l implements C52686q<Map<?, ?>, String, String, Map<Object, Object>> {

        /* renamed from: a */
        final /* synthetic */ String f27815a;

        public C10402j(String str) {
            this.f27815a = str;
            super(3);
        }

        public final Map<Object, Object> invoke(Map<?, ?> map, String str, String str2) {
            C52711k.m112240b(map, "builder");
            C52711k.m112240b(str, "<anonymous parameter 1>");
            Map<Object, Object> f = C52731z.m112270f(map);
            String str3 = str2;
            if (str3 != null) {
                f.put(this.f27815a, str3);
            }
            return f;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.b.i.m$k */
    public static final class C10403k extends C52712l implements C52682m<Map<?, ?>, String, String> {

        /* renamed from: a */
        final /* synthetic */ String f27816a;

        public C10403k(String str) {
            this.f27816a = str;
            super(2);
        }

        public final String invoke(Map<?, ?> map, String str) {
            C52711k.m112240b(map, "map");
            C52711k.m112240b(str, "<anonymous parameter 1>");
            Object obj = map.get(this.f27816a);
            if (obj != null) {
                if (!(obj instanceof String)) {
                    obj = null;
                }
                String str2 = (String) obj;
                if (str2 != null) {
                    return str2;
                }
            }
            return null;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.b.i.m$l */
    public static final class C10404l extends C52712l implements C52686q<Map<?, ?>, String, Boolean, Map<Object, Object>> {
        public C10404l() {
            super(3);
        }

        public final Map<Object, Object> invoke(Map<?, ?> map, String str, Boolean bool) {
            String str2;
            C52711k.m112240b(map, "builder");
            C52711k.m112240b(str, "key");
            Map<Object, Object> f = C52731z.m112270f(map);
            if (bool.booleanValue()) {
                str2 = "1";
            } else {
                str2 = "0";
            }
            f.put(str, str2);
            return f;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.b.i.m$m */
    public static final class C10405m extends C52712l implements C52686q<Map<?, ?>, String, String, Map<Object, Object>> {

        /* renamed from: a */
        final /* synthetic */ String f27817a;

        public C10405m(String str) {
            this.f27817a = str;
            super(3);
        }

        public final Map<Object, Object> invoke(Map<?, ?> map, String str, String str2) {
            C52711k.m112240b(map, "builder");
            C52711k.m112240b(str, "<anonymous parameter 1>");
            Map<Object, Object> f = C52731z.m112270f(map);
            String str3 = str2;
            if (str3 != null) {
                f.put(this.f27817a, str3);
            }
            return f;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.b.i.m$n */
    public static final class C10406n extends C52712l implements C52682m<Map<?, ?>, String, List<? extends String>> {

        /* renamed from: a */
        final /* synthetic */ String f27818a;

        public C10406n(String str) {
            this.f27818a = str;
            super(2);
        }

        public final List<? extends String> invoke(Map<?, ?> map, String str) {
            C52711k.m112240b(map, "map");
            C52711k.m112240b(str, "<anonymous parameter 1>");
            Object obj = map.get(this.f27818a);
            if (obj != null) {
                if (!(obj instanceof String)) {
                    obj = null;
                }
                String str2 = (String) obj;
                if (str2 != null) {
                    CharSequence charSequence = str2;
                    String str3 = File.separator;
                    C52711k.m112236a((Object) str3, "File.separator");
                    return C52830p.m112452b(charSequence, new String[]{str3}, false, 0, 6, (Object) null);
                }
            }
            return null;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.b.i.m$o */
    public static final class C10407o extends C52712l implements C52686q<Map<?, ?>, String, List<? extends String>, Map<Object, Object>> {

        /* renamed from: a */
        final /* synthetic */ String f27819a;

        public C10407o(String str) {
            this.f27819a = str;
            super(3);
        }

        public final Map<Object, Object> invoke(Map<?, ?> map, String str, List<? extends String> list) {
            C52711k.m112240b(map, "builder");
            C52711k.m112240b(str, "<anonymous parameter 1>");
            Map<Object, Object> f = C52731z.m112270f(map);
            Iterable iterable = list;
            String str2 = File.separator;
            C52711k.m112236a((Object) str2, "File.separator");
            String a = C52575l.m112120a(iterable, str2, null, null, 0, null, null, 62, null);
            if (a != null) {
                f.put(this.f27819a, a);
            }
            return f;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.b.i.m$p */
    public static final class C10408p extends C52712l implements C52682m<Map<?, ?>, String, Integer> {
        public C10408p() {
            super(2);
        }

        public final Integer invoke(Map<?, ?> map, String str) {
            C52711k.m112240b(map, "map");
            C52711k.m112240b(str, "key");
            Object obj = map.get(str);
            if (obj != null) {
                if (!(obj instanceof String)) {
                    obj = null;
                }
                String str2 = (String) obj;
                if (str2 != null) {
                    return C52830p.m112395c(str2);
                }
            }
            return null;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.b.i.m$q */
    public static final class C10409q extends C52712l implements C52686q<Map<?, ?>, String, Integer, Map<Object, Object>> {
        public C10409q() {
            super(3);
        }

        public final Map<Object, Object> invoke(Map<?, ?> map, String str, Integer num) {
            C52711k.m112240b(map, "builder");
            C52711k.m112240b(str, "key");
            Map<Object, Object> f = C52731z.m112270f(map);
            String valueOf = String.valueOf(num.intValue());
            if (valueOf != null) {
                f.put(str, valueOf);
            }
            return f;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.b.i.m$r */
    public static final class C10410r extends C52712l implements C52682m<Map<?, ?>, String, Long> {
        public C10410r() {
            super(2);
        }

        public final Long invoke(Map<?, ?> map, String str) {
            C52711k.m112240b(map, "map");
            C52711k.m112240b(str, "key");
            Object obj = map.get(str);
            if (obj != null) {
                if (!(obj instanceof String)) {
                    obj = null;
                }
                String str2 = (String) obj;
                if (str2 != null) {
                    return C52830p.m112396d(str2);
                }
            }
            return null;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.b.i.m$s */
    public static final class C10411s extends C52712l implements C52686q<Map<?, ?>, String, Long, Map<Object, Object>> {
        public C10411s() {
            super(3);
        }

        public final Map<Object, Object> invoke(Map<?, ?> map, String str, Long l) {
            C52711k.m112240b(map, "builder");
            C52711k.m112240b(str, "key");
            Map<Object, Object> f = C52731z.m112270f(map);
            String valueOf = String.valueOf(l.longValue());
            if (valueOf != null) {
                f.put(str, valueOf);
            }
            return f;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.b.i.m$t */
    public static final class C10412t extends C52712l implements C52682m<Map<?, ?>, String, Float> {
        public C10412t() {
            super(2);
        }

        public final Float invoke(Map<?, ?> map, String str) {
            C52711k.m112240b(map, "map");
            C52711k.m112240b(str, "key");
            Object obj = map.get(str);
            if (obj != null) {
                if (!(obj instanceof String)) {
                    obj = null;
                }
                String str2 = (String) obj;
                if (str2 != null) {
                    return C52830p.m112391a(str2);
                }
            }
            return null;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.b.i.m$u */
    public static final class C10413u extends C52712l implements C52686q<Map<?, ?>, String, Float, Map<Object, Object>> {
        public C10413u() {
            super(3);
        }

        public final Map<Object, Object> invoke(Map<?, ?> map, String str, Float f) {
            C52711k.m112240b(map, "builder");
            C52711k.m112240b(str, "key");
            Map<Object, Object> f2 = C52731z.m112270f(map);
            String valueOf = String.valueOf(f.floatValue());
            if (valueOf != null) {
                f2.put(str, valueOf);
            }
            return f2;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.b.i.m$v */
    public static final class C10414v extends C52712l implements C52682m<Map<?, ?>, String, Double> {
        public C10414v() {
            super(2);
        }

        public final Double invoke(Map<?, ?> map, String str) {
            C52711k.m112240b(map, "map");
            C52711k.m112240b(str, "key");
            Object obj = map.get(str);
            if (obj != null) {
                if (!(obj instanceof String)) {
                    obj = null;
                }
                String str2 = (String) obj;
                if (str2 != null) {
                    return C52830p.m112392b(str2);
                }
            }
            return null;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.b.i.m$w */
    static final class C10415w extends C52712l implements C52682m<Map<?, ?>, String, String> {

        /* renamed from: a */
        public static final C10415w f27820a = new C10415w();

        C10415w() {
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            Map map = (Map) obj;
            String str = (String) obj2;
            C52711k.m112240b(map, "map");
            C52711k.m112240b(str, "<anonymous parameter 1>");
            Object obj3 = map.get("__PATH__");
            if (obj3 != null) {
                if (!(obj3 instanceof String)) {
                    obj3 = null;
                }
                String str2 = (String) obj3;
                if (str2 != null) {
                    CharSequence charSequence = str2;
                    String str3 = File.separator;
                    C52711k.m112236a((Object) str3, "File.separator");
                    for (String str4 : C52830p.m112452b(charSequence, new String[]{str3}, false, 0, 6, (Object) null)) {
                        if (!C52830p.m112402a(str4)) {
                            return str4;
                        }
                    }
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
            }
            return null;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.b.i.m$x */
    static final class C10416x extends C52712l implements C52686q<Map<?, ?>, String, String, Map<Object, Object>> {

        /* renamed from: a */
        public static final C10416x f27821a = new C10416x();

        C10416x() {
            super(3);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            Map map = (Map) obj;
            String str = (String) obj2;
            String str2 = (String) obj3;
            C52711k.m112240b(map, "builder");
            C52711k.m112240b(str, "<anonymous parameter 1>");
            C52711k.m112240b(str2, "value");
            Map f = C52731z.m112270f(map);
            StringBuilder sb = new StringBuilder();
            CharSequence charSequence = str2;
            String str3 = null;
            if (!(!C52830p.m112402a(charSequence))) {
                str2 = null;
            }
            if (str2 != null) {
                sb.append(File.separator);
                sb.append(C52830p.m112447b(charSequence).toString());
            }
            Object obj4 = map.get("__PATH__");
            if (obj4 != null) {
                if (!(obj4 instanceof String)) {
                    obj4 = null;
                }
                String str4 = (String) obj4;
                if (str4 != null) {
                    String str5 = File.separator;
                    C52711k.m112236a((Object) str5, "File.separator");
                    if (!C52830p.m112411b(str4, str5, false, 2, null)) {
                        str3 = str4;
                    }
                    if (str3 != null) {
                        sb.append(File.separator);
                    }
                    sb.append(str4);
                }
            }
            f.put("__PATH__", String.valueOf(sb));
            return f;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.b.i.m$y */
    static final class C10417y extends C52712l implements C52682m<Map<?, ?>, String, String> {

        /* renamed from: a */
        public static final C10417y f27822a = new C10417y();

        C10417y() {
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            Map map = (Map) obj;
            String str = (String) obj2;
            C52711k.m112240b(map, "map");
            C52711k.m112240b(str, "<anonymous parameter 1>");
            Object obj3 = map.get("__PATH__");
            if (obj3 != null) {
                if (!(obj3 instanceof String)) {
                    obj3 = null;
                }
                String str2 = (String) obj3;
                if (str2 != null) {
                    CharSequence charSequence = str2;
                    String str3 = File.separator;
                    C52711k.m112236a((Object) str3, "File.separator");
                    List b = C52830p.m112452b(charSequence, new String[]{str3}, false, 0, 6, (Object) null);
                    ListIterator listIterator = b.listIterator(b.size());
                    while (listIterator.hasPrevious()) {
                        String str4 = (String) listIterator.previous();
                        if (!C52830p.m112402a(str4)) {
                            return str4;
                        }
                    }
                    throw new NoSuchElementException("List contains no element matching the predicate.");
                }
            }
            return null;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.b.i.m$z */
    static final class C10418z extends C52712l implements C52686q<Map<?, ?>, String, String, Map<Object, Object>> {

        /* renamed from: a */
        public static final C10418z f27823a = new C10418z();

        C10418z() {
            super(3);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            String str;
            Map map = (Map) obj;
            String str2 = (String) obj2;
            String str3 = (String) obj3;
            C52711k.m112240b(map, "builder");
            C52711k.m112240b(str2, "<anonymous parameter 1>");
            C52711k.m112240b(str3, "value");
            Map f = C52731z.m112270f(map);
            StringBuilder sb = new StringBuilder();
            Object obj4 = map.get("__PATH__");
            if (obj4 != null) {
                if (!(obj4 instanceof String)) {
                    obj4 = null;
                }
                String str4 = (String) obj4;
                if (str4 != null) {
                    String str5 = File.separator;
                    C52711k.m112236a((Object) str5, "File.separator");
                    if (!C52830p.m112411b(str4, str5, false, 2, null)) {
                        str = str4;
                    } else {
                        str = null;
                    }
                    if (str != null) {
                        sb.append(File.separator);
                    }
                    sb.append(str4);
                }
            }
            CharSequence charSequence = str3;
            if (!(!C52830p.m112402a(charSequence))) {
                str3 = null;
            }
            if (str3 != null) {
                sb.append(File.separator);
                sb.append(C52830p.m112447b(charSequence).toString());
            }
            f.put("__PATH__", String.valueOf(sb));
            return f;
        }
    }
}
