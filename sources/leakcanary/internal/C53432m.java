package leakcanary.internal;

/* renamed from: leakcanary.internal.m */
public enum C53432m {
    LEAKCANARY_LOW("LeakCanary Low Priority", 2),
    LEAKCANARY_RESULT("LeakCanary Result", 3);
    

    /* renamed from: b */
    private final String f132138b;

    /* renamed from: c */
    private final int f132139c;

    public final int getImportance() {
        return this.f132139c;
    }

    public final String getNameStr() {
        return this.f132138b;
    }

    private C53432m(String str, int i) {
        this.f132138b = str;
        this.f132139c = i;
    }
}
