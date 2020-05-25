package p2628d.p2639f.p2641b;

import java.util.ArrayList;
import java.util.Collections;

/* renamed from: d.f.b.y */
public final class C52730y {

    /* renamed from: a */
    private final ArrayList<Object> f130986a = new ArrayList<>(5);

    /* renamed from: a */
    public final int mo110329a() {
        return this.f130986a.size();
    }

    /* renamed from: b */
    public final void mo110332b(Object obj) {
        this.f130986a.add(obj);
    }

    public C52730y(int i) {
    }

    /* renamed from: a */
    public final Object[] mo110331a(Object[] objArr) {
        return this.f130986a.toArray(objArr);
    }

    /* renamed from: a */
    public final void mo110330a(Object obj) {
        if (obj != null) {
            if (obj instanceof Object[]) {
                Object[] objArr = (Object[]) obj;
                if (objArr.length > 0) {
                    this.f130986a.ensureCapacity(this.f130986a.size() + objArr.length);
                    Collections.addAll(this.f130986a, objArr);
                }
                return;
            }
            StringBuilder sb = new StringBuilder("Don't know how to spread ");
            sb.append(obj.getClass());
            throw new UnsupportedOperationException(sb.toString());
        }
    }
}
