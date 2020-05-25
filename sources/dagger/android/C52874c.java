package dagger.android;

import com.C2240a;
import dagger.android.C52871b.C52873b;
import dagger.p2651a.C52864a;
import dagger.p2651a.C52869f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import javax.p2677a.C53188a;

/* renamed from: dagger.android.c */
public final class C52874c<T> implements C52871b<T> {

    /* renamed from: a */
    private final Map<String, C53188a<C52873b<?>>> f131118a;

    /* renamed from: dagger.android.c$a */
    public static final class C52875a extends RuntimeException {
        C52875a(String str, ClassCastException classCastException) {
            super(str, classCastException);
        }
    }

    /* renamed from: a */
    public final void mo56093a(T t) {
        if (!m112481b(t)) {
            throw new IllegalArgumentException(m112482c(t));
        }
    }

    /* renamed from: b */
    private boolean m112481b(T t) {
        C53188a aVar = (C53188a) this.f131118a.get(t.getClass().getName());
        if (aVar == null) {
            return false;
        }
        C52873b bVar = (C52873b) aVar.get();
        try {
            ((C52871b) C52869f.m112472a(bVar.mo56094a(t), "%s.create(I) should not return null.", bVar.getClass())).mo56093a(t);
            return true;
        } catch (ClassCastException e) {
            throw new C52875a(C2240a.m6772a("%s does not implement AndroidInjector.Factory<%s>", new Object[]{bVar.getClass().getCanonicalName(), t.getClass().getCanonicalName()}), e);
        }
    }

    /* renamed from: c */
    private String m112482c(T t) {
        ArrayList arrayList = new ArrayList();
        for (Class cls = t.getClass(); cls != null; cls = cls.getSuperclass()) {
            if (this.f131118a.containsKey(cls.getCanonicalName())) {
                arrayList.add(cls.getCanonicalName());
            }
        }
        if (arrayList.isEmpty()) {
            return C2240a.m6772a("No injector factory bound for Class<%s>", new Object[]{t.getClass().getCanonicalName()});
        }
        return C2240a.m6772a("No injector factory bound for Class<%1$s>. Injector factories were bound for supertypes of %1$s: %2$s. Did you mean to bind an injector factory for the subtype?", new Object[]{t.getClass().getCanonicalName(), arrayList});
    }

    /* renamed from: a */
    private static <C, V> Map<String, C53188a<C52873b<?>>> m112480a(Map<Class<? extends C>, V> map, Map<String, V> map2) {
        if (map.isEmpty()) {
            return map2;
        }
        LinkedHashMap a = C52864a.m112466a(map.size() + map2.size());
        a.putAll(map2);
        for (Entry entry : map.entrySet()) {
            a.put(((Class) entry.getKey()).getName(), entry.getValue());
        }
        return Collections.unmodifiableMap(a);
    }

    public C52874c(Map<Class<?>, C53188a<C52873b<?>>> map, Map<String, C53188a<C52873b<?>>> map2, Map<Class<? extends T>, C53188a<C52873b<? extends T>>> map3, Map<String, C53188a<C52873b<? extends T>>> map4) {
        Map<String, C53188a<C52873b<?>>> a = m112480a(map, map2);
        Map<String, C53188a<C52873b<?>>> a2 = m112480a(map3, map4);
        if (a.isEmpty()) {
            a = a2;
        } else if (!a2.isEmpty()) {
            Map<String, C53188a<C52873b<?>>> a3 = C52864a.m112466a(a.size() + a2.size());
            a3.putAll(a);
            a3.putAll(a2);
            a = a3;
        }
        this.f131118a = a;
    }
}
