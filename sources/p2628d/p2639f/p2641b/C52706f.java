package p2628d.p2639f.p2641b;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import p2628d.C52857u;

/* renamed from: d.f.b.f */
public final class C52706f {

    /* renamed from: a */
    private static final Object[] f130966a = new Object[0];

    /* renamed from: a */
    public static final Object[] m112226a(Collection<?> collection) {
        C52711k.m112240b(collection, "collection");
        int size = collection.size();
        if (size == 0) {
            return f130966a;
        }
        Iterator it = collection.iterator();
        if (!it.hasNext()) {
            return f130966a;
        }
        Object[] objArr = new Object[size];
        int i = 0;
        while (true) {
            int i2 = i + 1;
            objArr[i] = it.next();
            if (i2 >= objArr.length) {
                if (!it.hasNext()) {
                    return objArr;
                }
                int i3 = ((i2 * 3) + 1) >>> 1;
                if (i3 <= i2) {
                    if (i2 < 2147483645) {
                        i3 = 2147483645;
                    } else {
                        throw new OutOfMemoryError();
                    }
                }
                objArr = Arrays.copyOf(objArr, i3);
                C52711k.m112236a((Object) objArr, "Arrays.copyOf(result, newSize)");
            } else if (!it.hasNext()) {
                Object[] copyOf = Arrays.copyOf(objArr, i2);
                C52711k.m112236a((Object) copyOf, "Arrays.copyOf(result, size)");
                return copyOf;
            }
            i = i2;
        }
    }

    /* renamed from: a */
    public static final Object[] m112227a(Collection<?> collection, Object[] objArr) {
        Object[] objArr2;
        C52711k.m112240b(collection, "collection");
        if (objArr != null) {
            int size = collection.size();
            int i = 0;
            if (size == 0) {
                if (objArr.length > 0) {
                    objArr[0] = null;
                }
                return objArr;
            }
            Iterator it = collection.iterator();
            if (!it.hasNext()) {
                if (objArr.length > 0) {
                    objArr[0] = null;
                }
                return objArr;
            }
            if (size <= objArr.length) {
                objArr2 = objArr;
            } else {
                Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), size);
                if (newInstance != null) {
                    objArr2 = (Object[]) newInstance;
                } else {
                    throw new C52857u("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                }
            }
            while (true) {
                int i2 = i + 1;
                objArr2[i] = it.next();
                if (i2 >= objArr2.length) {
                    if (!it.hasNext()) {
                        return objArr2;
                    }
                    int i3 = ((i2 * 3) + 1) >>> 1;
                    if (i3 <= i2) {
                        if (i2 < 2147483645) {
                            i3 = 2147483645;
                        } else {
                            throw new OutOfMemoryError();
                        }
                    }
                    objArr2 = Arrays.copyOf(objArr2, i3);
                    C52711k.m112236a((Object) objArr2, "Arrays.copyOf(result, newSize)");
                } else if (!it.hasNext()) {
                    if (objArr2 == objArr) {
                        objArr[i2] = null;
                        return objArr;
                    }
                    Object[] copyOf = Arrays.copyOf(objArr2, i2);
                    C52711k.m112236a((Object) copyOf, "Arrays.copyOf(result, size)");
                    return copyOf;
                }
                i = i2;
            }
        } else {
            throw new NullPointerException();
        }
    }
}
