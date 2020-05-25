package p2663f.p2664a.p2665a;

import java.util.ArrayList;
import java.util.List;

/* renamed from: f.a.a.f */
public final class C53038f implements C53042j {

    /* renamed from: a */
    private final List<Class<?>> f131519a = new ArrayList();

    /* renamed from: b */
    private final List<C53035c<?, ?>> f131520b = new ArrayList();

    /* renamed from: c */
    private final List<C53036d<?>> f131521c = new ArrayList();

    /* renamed from: a */
    public final C53035c<?, ?> mo110581a(int i) {
        return (C53035c) this.f131520b.get(i);
    }

    /* renamed from: b */
    public final C53036d<?> mo110585b(int i) {
        return (C53036d) this.f131521c.get(i);
    }

    /* renamed from: a */
    public final boolean mo110583a(Class<?> cls) {
        boolean z = false;
        while (true) {
            int indexOf = this.f131519a.indexOf(cls);
            if (indexOf == -1) {
                return z;
            }
            this.f131519a.remove(indexOf);
            this.f131520b.remove(indexOf);
            this.f131521c.remove(indexOf);
            z = true;
        }
    }

    /* renamed from: b */
    public final int mo110584b(Class<?> cls) {
        int indexOf = this.f131519a.indexOf(cls);
        if (indexOf != -1) {
            return indexOf;
        }
        for (int i = 0; i < this.f131519a.size(); i++) {
            if (((Class) this.f131519a.get(i)).isAssignableFrom(cls)) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: a */
    public final <T> void mo110582a(Class<? extends T> cls, C53035c<T, ?> cVar, C53036d<T> dVar) {
        this.f131519a.add(cls);
        this.f131520b.add(cVar);
        this.f131521c.add(dVar);
    }
}
