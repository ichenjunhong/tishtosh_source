package com.bytedance.ies.bullet.p653ui.common.p657d;

import android.graphics.Color;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Bundle;
import com.bytedance.ies.bullet.p628b.p643i.C10387h;
import com.bytedance.ies.bullet.p628b.p643i.C10420o;
import com.bytedance.ies.bullet.p653ui.common.p657d.C10580c.C10581a;
import com.bytedance.ies.bullet.p653ui.common.p657d.C10582d.C10583a;
import java.util.Map;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2640a.C52686q;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52731z;
import p2628d.p2650m.C52830p;

/* renamed from: com.bytedance.ies.bullet.ui.common.d.f */
public final class C10585f {

    /* renamed from: a */
    public static final C10585f f28127a = new C10585f();

    /* renamed from: b */
    private static final C10387h<C10584e> f28128b = new C10420o(C10584e.class);

    /* renamed from: c */
    private static final C10387h<C10582d> f28129c = new C10420o(C10582d.class);

    /* renamed from: d */
    private static final C10387h<C10580c> f28130d = new C10420o(C10580c.class);

    /* renamed from: com.bytedance.ies.bullet.ui.common.d.f$a */
    public static final class C10586a extends C52712l implements C52682m<Bundle, String, C10584e> {
        public C10586a() {
            super(2);
        }

        public final C10584e invoke(Bundle bundle, String str) {
            C10584e eVar;
            C52711k.m112240b(bundle, "bundle");
            C52711k.m112240b(str, "key");
            C10584e eVar2 = null;
            if (bundle.containsKey(str)) {
                String string = bundle.getString(str);
                if (string == null) {
                    return null;
                }
                try {
                    if (!C52830p.m112456b((CharSequence) string, (CharSequence) "#", false, 2, (Object) null)) {
                        StringBuilder sb = new StringBuilder("#");
                        sb.append(string);
                        eVar = new C10584e(Color.parseColor(sb.toString()));
                    } else {
                        eVar = new C10584e(Color.parseColor(string));
                    }
                    eVar2 = eVar;
                } catch (Exception unused) {
                    eVar2 = new C10584e(-2);
                }
            }
            return eVar2;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.ui.common.d.f$b */
    public static final class C10587b extends C52712l implements C52686q<Bundle, String, C10584e, Bundle> {
        public C10587b() {
            super(3);
        }

        public final Bundle invoke(Bundle bundle, String str, C10584e eVar) {
            C52711k.m112240b(bundle, "builder");
            C52711k.m112240b(str, "key");
            bundle.putString(str, String.valueOf(eVar.f28126a));
            return bundle;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.ui.common.d.f$c */
    public static final class C10588c extends C52712l implements C52682m<Bundle, String, C10582d> {
        public C10588c() {
            super(2);
        }

        public final C10582d invoke(Bundle bundle, String str) {
            C52711k.m112240b(bundle, "bundle");
            C52711k.m112240b(str, "key");
            C10582d dVar = null;
            if (bundle.containsKey(str)) {
                Integer c = C52830p.m112395c(str);
                if (c == null) {
                    return null;
                }
                dVar = C10583a.m21364a(c.intValue());
            }
            return dVar;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.ui.common.d.f$d */
    public static final class C10589d extends C52712l implements C52686q<Bundle, String, C10582d, Bundle> {
        public C10589d() {
            super(3);
        }

        public final Bundle invoke(Bundle bundle, String str, C10582d dVar) {
            C52711k.m112240b(bundle, "builder");
            C52711k.m112240b(str, "key");
            bundle.putString(str, String.valueOf(dVar.getVALUE()));
            return bundle;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.ui.common.d.f$e */
    public static final class C10590e extends C52712l implements C52682m<Bundle, String, C10580c> {
        public C10590e() {
            super(2);
        }

        public final C10580c invoke(Bundle bundle, String str) {
            C52711k.m112240b(bundle, "bundle");
            C52711k.m112240b(str, "key");
            C10580c cVar = null;
            if (bundle.containsKey(str)) {
                Integer c = C52830p.m112395c(str);
                if (c == null) {
                    return null;
                }
                cVar = C10581a.m21363a(c.intValue());
            }
            return cVar;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.ui.common.d.f$f */
    public static final class C10591f extends C52712l implements C52686q<Bundle, String, C10580c, Bundle> {
        public C10591f() {
            super(3);
        }

        public final Bundle invoke(Bundle bundle, String str, C10580c cVar) {
            C52711k.m112240b(bundle, "builder");
            C52711k.m112240b(str, "key");
            bundle.putString(str, String.valueOf(cVar.getVALUE()));
            return bundle;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.ui.common.d.f$g */
    public static final class C10592g extends C52712l implements C52682m<Map<?, ?>, String, C10584e> {
        public C10592g() {
            super(2);
        }

        public final C10584e invoke(Map<?, ?> map, String str) {
            C10584e eVar;
            C52711k.m112240b(map, "map");
            C52711k.m112240b(str, "key");
            Object obj = map.get(str);
            if (obj != null) {
                if (!(obj instanceof String)) {
                    obj = null;
                }
                String str2 = (String) obj;
                if (str2 != null) {
                    C10584e eVar2 = new C10584e(-2);
                    try {
                        if (!C52830p.m112456b((CharSequence) str2, (CharSequence) "#", false, 2, (Object) null)) {
                            StringBuilder sb = new StringBuilder("#");
                            sb.append(str2);
                            eVar = new C10584e(Color.parseColor(sb.toString()));
                        } else {
                            eVar = new C10584e(Color.parseColor(str2));
                        }
                        eVar2 = eVar;
                    } catch (Exception unused) {
                    }
                    return eVar2;
                }
            }
            return null;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.ui.common.d.f$h */
    public static final class C10593h extends C52712l implements C52686q<Map<?, ?>, String, C10584e, Map<Object, Object>> {
        public C10593h() {
            super(3);
        }

        public final Map<Object, Object> invoke(Map<?, ?> map, String str, C10584e eVar) {
            C52711k.m112240b(map, "builder");
            C52711k.m112240b(str, "key");
            Map<Object, Object> f = C52731z.m112270f(map);
            String valueOf = String.valueOf(eVar.f28126a);
            if (valueOf != null) {
                f.put(str, valueOf);
            }
            return f;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.ui.common.d.f$i */
    public static final class C10594i extends C52712l implements C52682m<Map<?, ?>, String, C10582d> {
        public C10594i() {
            super(2);
        }

        public final C10582d invoke(Map<?, ?> map, String str) {
            C52711k.m112240b(map, "map");
            C52711k.m112240b(str, "key");
            Object obj = map.get(str);
            C10582d dVar = null;
            if (obj != null) {
                if (!(obj instanceof String)) {
                    obj = null;
                }
                String str2 = (String) obj;
                if (str2 != null) {
                    Integer c = C52830p.m112395c(str2);
                    if (c == null) {
                        return null;
                    }
                    dVar = C10583a.m21364a(c.intValue());
                }
            }
            return dVar;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.ui.common.d.f$j */
    public static final class C10595j extends C52712l implements C52686q<Map<?, ?>, String, C10582d, Map<Object, Object>> {
        public C10595j() {
            super(3);
        }

        public final Map<Object, Object> invoke(Map<?, ?> map, String str, C10582d dVar) {
            C52711k.m112240b(map, "builder");
            C52711k.m112240b(str, "key");
            Map<Object, Object> f = C52731z.m112270f(map);
            String valueOf = String.valueOf(dVar.getVALUE());
            if (valueOf != null) {
                f.put(str, valueOf);
            }
            return f;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.ui.common.d.f$k */
    public static final class C10596k extends C52712l implements C52682m<Map<?, ?>, String, C10580c> {
        public C10596k() {
            super(2);
        }

        public final C10580c invoke(Map<?, ?> map, String str) {
            C52711k.m112240b(map, "map");
            C52711k.m112240b(str, "key");
            Object obj = map.get(str);
            C10580c cVar = null;
            if (obj != null) {
                if (!(obj instanceof String)) {
                    obj = null;
                }
                String str2 = (String) obj;
                if (str2 != null) {
                    Integer c = C52830p.m112395c(str2);
                    if (c == null) {
                        return null;
                    }
                    cVar = C10581a.m21363a(c.intValue());
                }
            }
            return cVar;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.ui.common.d.f$l */
    public static final class C10597l extends C52712l implements C52686q<Map<?, ?>, String, C10580c, Map<Object, Object>> {
        public C10597l() {
            super(3);
        }

        public final Map<Object, Object> invoke(Map<?, ?> map, String str, C10580c cVar) {
            C52711k.m112240b(map, "builder");
            C52711k.m112240b(str, "key");
            Map<Object, Object> f = C52731z.m112270f(map);
            String valueOf = String.valueOf(cVar.getVALUE());
            if (valueOf != null) {
                f.put(str, valueOf);
            }
            return f;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.ui.common.d.f$m */
    public static final class C10598m extends C52712l implements C52682m<Uri, String, C10584e> {
        public C10598m() {
            super(2);
        }

        public final C10584e invoke(Uri uri, String str) {
            C10584e eVar;
            C52711k.m112240b(uri, "uri");
            C52711k.m112240b(str, "key");
            String queryParameter = uri.getQueryParameter(str);
            if (queryParameter == null) {
                return null;
            }
            C10584e eVar2 = new C10584e(-2);
            try {
                if (!C52830p.m112456b((CharSequence) queryParameter, (CharSequence) "#", false, 2, (Object) null)) {
                    StringBuilder sb = new StringBuilder("#");
                    sb.append(queryParameter);
                    eVar = new C10584e(Color.parseColor(sb.toString()));
                } else {
                    eVar = new C10584e(Color.parseColor(queryParameter));
                }
                eVar2 = eVar;
            } catch (Exception unused) {
            }
            return eVar2;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.ui.common.d.f$n */
    public static final class C10599n extends C52712l implements C52686q<Builder, String, C10584e, Builder> {
        public C10599n() {
            super(3);
        }

        public final Builder invoke(Builder builder, String str, C10584e eVar) {
            C52711k.m112240b(builder, "builder");
            C52711k.m112240b(str, "key");
            String valueOf = String.valueOf(eVar.f28126a);
            if (valueOf != null) {
                builder.appendQueryParameter(str, valueOf);
            }
            return builder;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.ui.common.d.f$o */
    public static final class C10600o extends C52712l implements C52682m<Uri, String, C10582d> {
        public C10600o() {
            super(2);
        }

        public final C10582d invoke(Uri uri, String str) {
            C52711k.m112240b(uri, "uri");
            C52711k.m112240b(str, "key");
            String queryParameter = uri.getQueryParameter(str);
            C10582d dVar = null;
            if (queryParameter != null) {
                Integer c = C52830p.m112395c(queryParameter);
                if (c == null) {
                    return null;
                }
                dVar = C10583a.m21364a(c.intValue());
            }
            return dVar;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.ui.common.d.f$p */
    public static final class C10601p extends C52712l implements C52686q<Builder, String, C10582d, Builder> {
        public C10601p() {
            super(3);
        }

        public final Builder invoke(Builder builder, String str, C10582d dVar) {
            C52711k.m112240b(builder, "builder");
            C52711k.m112240b(str, "key");
            String valueOf = String.valueOf(dVar.getVALUE());
            if (valueOf != null) {
                builder.appendQueryParameter(str, valueOf);
            }
            return builder;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.ui.common.d.f$q */
    public static final class C10602q extends C52712l implements C52682m<Uri, String, C10580c> {
        public C10602q() {
            super(2);
        }

        public final C10580c invoke(Uri uri, String str) {
            C52711k.m112240b(uri, "uri");
            C52711k.m112240b(str, "key");
            String queryParameter = uri.getQueryParameter(str);
            C10580c cVar = null;
            if (queryParameter != null) {
                Integer c = C52830p.m112395c(queryParameter);
                if (c == null) {
                    return null;
                }
                cVar = C10581a.m21363a(c.intValue());
            }
            return cVar;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.ui.common.d.f$r */
    public static final class C10603r extends C52712l implements C52686q<Builder, String, C10580c, Builder> {
        public C10603r() {
            super(3);
        }

        public final Builder invoke(Builder builder, String str, C10580c cVar) {
            C52711k.m112240b(builder, "builder");
            C52711k.m112240b(str, "key");
            String valueOf = String.valueOf(cVar.getVALUE());
            if (valueOf != null) {
                builder.appendQueryParameter(str, valueOf);
            }
            return builder;
        }
    }

    private C10585f() {
    }

    /* renamed from: a */
    public static C10387h<C10584e> m21365a() {
        return f28128b;
    }

    static {
        C10387h<C10584e> hVar = f28128b;
        hVar.mo18462a(Uri.class, (C52682m<? super R, ? super String, ? extends T>) new C10598m<Object,Object,Object>());
        hVar.mo18463a(Builder.class, (C52686q<? super R, ? super String, ? super T, ? extends R>) new C10599n<Object,Object,Object,Object>());
        C10387h<C10582d> hVar2 = f28129c;
        hVar2.mo18462a(Uri.class, (C52682m<? super R, ? super String, ? extends T>) new C10600o<Object,Object,Object>());
        hVar2.mo18463a(Builder.class, (C52686q<? super R, ? super String, ? super T, ? extends R>) new C10601p<Object,Object,Object,Object>());
        C10387h<C10580c> hVar3 = f28130d;
        hVar3.mo18462a(Uri.class, (C52682m<? super R, ? super String, ? extends T>) new C10602q<Object,Object,Object>());
        hVar3.mo18463a(Builder.class, (C52686q<? super R, ? super String, ? super T, ? extends R>) new C10603r<Object,Object,Object,Object>());
        C10387h<C10584e> hVar4 = f28128b;
        hVar4.mo18462a(Bundle.class, (C52682m<? super R, ? super String, ? extends T>) new C10586a<Object,Object,Object>());
        hVar4.mo18463a(Bundle.class, (C52686q<? super R, ? super String, ? super T, ? extends R>) new C10587b<Object,Object,Object,Object>());
        C10387h<C10582d> hVar5 = f28129c;
        hVar5.mo18462a(Bundle.class, (C52682m<? super R, ? super String, ? extends T>) new C10588c<Object,Object,Object>());
        hVar5.mo18463a(Bundle.class, (C52686q<? super R, ? super String, ? super T, ? extends R>) new C10589d<Object,Object,Object,Object>());
        C10387h<C10580c> hVar6 = f28130d;
        hVar6.mo18462a(Bundle.class, (C52682m<? super R, ? super String, ? extends T>) new C10590e<Object,Object,Object>());
        hVar6.mo18463a(Bundle.class, (C52686q<? super R, ? super String, ? super T, ? extends R>) new C10591f<Object,Object,Object,Object>());
        C10387h<C10584e> hVar7 = f28128b;
        hVar7.mo18462a(Map.class, (C52682m<? super R, ? super String, ? extends T>) new C10592g<Object,Object,Object>());
        hVar7.mo18463a(Map.class, (C52686q<? super R, ? super String, ? super T, ? extends R>) new C10593h<Object,Object,Object,Object>());
        C10387h<C10582d> hVar8 = f28129c;
        hVar8.mo18462a(Map.class, (C52682m<? super R, ? super String, ? extends T>) new C10594i<Object,Object,Object>());
        hVar8.mo18463a(Map.class, (C52686q<? super R, ? super String, ? super T, ? extends R>) new C10595j<Object,Object,Object,Object>());
        C10387h<C10580c> hVar9 = f28130d;
        hVar9.mo18462a(Map.class, (C52682m<? super R, ? super String, ? extends T>) new C10596k<Object,Object,Object>());
        hVar9.mo18463a(Map.class, (C52686q<? super R, ? super String, ? super T, ? extends R>) new C10597l<Object,Object,Object,Object>());
    }
}
