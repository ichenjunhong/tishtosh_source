package com.google.p1057b.p1060c;

/* renamed from: com.google.b.c.bg */
final class C17650bg<E> extends C17570ak<E> {

    /* renamed from: a */
    static final C17650bg<Object> f49346a;

    /* renamed from: b */
    final transient Object[] f49347b;

    /* renamed from: c */
    final transient Object[] f49348c;

    /* renamed from: d */
    private final transient int f49349d;

    /* renamed from: e */
    private final transient int f49350e;

    /* renamed from: f */
    private final transient int f49351f;

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo33977a() {
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final boolean mo34027c() {
        return true;
    }

    public final int hashCode() {
        return this.f49350e;
    }

    public final int size() {
        return this.f49351f;
    }

    static {
        C17650bg bgVar = new C17650bg(new Object[0], 0, null, 0, 0);
        f49346a = bgVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final C17530ab<E> mo34098d() {
        return C17530ab.m43055b(this.f49347b, this.f49351f);
    }

    public final C17666bt<E> iterator() {
        return asList().iterator();
    }

    public final boolean contains(Object obj) {
        Object[] objArr = this.f49348c;
        if (obj == null || objArr == null) {
            return false;
        }
        int a = C17724y.m43537a(obj);
        while (true) {
            int i = a & this.f49349d;
            Object obj2 = objArr[i];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            a = i + 1;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final int mo33952a(Object[] objArr, int i) {
        System.arraycopy(this.f49347b, 0, objArr, i, this.f49351f);
        return i + this.f49351f;
    }

    C17650bg(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        this.f49347b = objArr;
        this.f49348c = objArr2;
        this.f49349d = i2;
        this.f49350e = i;
        this.f49351f = i3;
    }
}
