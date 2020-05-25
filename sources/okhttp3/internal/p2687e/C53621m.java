package okhttp3.internal.p2687e;

/* renamed from: okhttp3.internal.e.m */
public final class C53621m {

    /* renamed from: a */
    int f132975a;

    /* renamed from: b */
    final int[] f132976b = new int[10];

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final int mo111487a() {
        if ((this.f132975a & 2) != 0) {
            return this.f132976b[1];
        }
        return -1;
    }

    /* renamed from: b */
    public final int mo111490b() {
        if ((this.f132975a & 128) != 0) {
            return this.f132976b[7];
        }
        return 65535;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final int mo111491b(int i) {
        return this.f132976b[i];
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo111489a(int i) {
        if (((1 << i) & this.f132975a) != 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C53621m mo111488a(int i, int i2) {
        if (i < 0 || i >= this.f132976b.length) {
            return this;
        }
        this.f132975a = (1 << i) | this.f132975a;
        this.f132976b[i] = i2;
        return this;
    }
}
