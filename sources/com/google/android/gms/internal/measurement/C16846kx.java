package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.kx */
final class C16846kx implements Cloneable {

    /* renamed from: a */
    C16844kv<?, ?> f47297a;

    /* renamed from: b */
    Object f47298b;

    /* renamed from: c */
    List<C16852lc> f47299c = new ArrayList();

    C16846kx() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final int mo32465a() {
        if (this.f47298b != null) {
            C16844kv<?, ?> kvVar = this.f47297a;
            Object obj = this.f47298b;
            if (!kvVar.f47291c) {
                return kvVar.mo32454a(obj);
            }
            int length = Array.getLength(obj);
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                Object obj2 = Array.get(obj, i2);
                if (obj2 != null) {
                    i += kvVar.mo32454a(obj2);
                }
            }
            return i;
        }
        int i3 = 0;
        for (C16852lc lcVar : this.f47299c) {
            i3 += C16841ks.m40867d(lcVar.f47305a) + 0 + lcVar.f47306b.length;
        }
        return i3;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo32466a(C16841ks ksVar) throws IOException {
        if (this.f47298b != null) {
            C16844kv<?, ?> kvVar = this.f47297a;
            Object obj = this.f47298b;
            if (kvVar.f47291c) {
                int length = Array.getLength(obj);
                for (int i = 0; i < length; i++) {
                    Object obj2 = Array.get(obj, i);
                    if (obj2 != null) {
                        kvVar.mo32456a(obj2, ksVar);
                    }
                }
                return;
            }
            kvVar.mo32456a(obj, ksVar);
            return;
        }
        for (C16852lc lcVar : this.f47299c) {
            ksVar.mo32449c(lcVar.f47305a);
            byte[] bArr = lcVar.f47306b;
            int length2 = bArr.length;
            if (ksVar.f47285a.remaining() >= length2) {
                ksVar.f47285a.put(bArr, 0, length2);
            } else {
                throw new C16842kt(ksVar.f47285a.position(), ksVar.f47285a.limit());
            }
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C16846kx)) {
            return false;
        }
        C16846kx kxVar = (C16846kx) obj;
        if (this.f47298b == null || kxVar.f47298b == null) {
            if (this.f47299c != null && kxVar.f47299c != null) {
                return this.f47299c.equals(kxVar.f47299c);
            }
            try {
                return Arrays.equals(m40893b(), kxVar.m40893b());
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        } else if (this.f47297a != kxVar.f47297a) {
            return false;
        } else {
            if (!this.f47297a.f47289a.isArray()) {
                return this.f47298b.equals(kxVar.f47298b);
            }
            if (this.f47298b instanceof byte[]) {
                return Arrays.equals((byte[]) this.f47298b, (byte[]) kxVar.f47298b);
            }
            if (this.f47298b instanceof int[]) {
                return Arrays.equals((int[]) this.f47298b, (int[]) kxVar.f47298b);
            }
            if (this.f47298b instanceof long[]) {
                return Arrays.equals((long[]) this.f47298b, (long[]) kxVar.f47298b);
            }
            if (this.f47298b instanceof float[]) {
                return Arrays.equals((float[]) this.f47298b, (float[]) kxVar.f47298b);
            }
            if (this.f47298b instanceof double[]) {
                return Arrays.equals((double[]) this.f47298b, (double[]) kxVar.f47298b);
            }
            if (this.f47298b instanceof boolean[]) {
                return Arrays.equals((boolean[]) this.f47298b, (boolean[]) kxVar.f47298b);
            }
            return Arrays.deepEquals((Object[]) this.f47298b, (Object[]) kxVar.f47298b);
        }
    }

    public final int hashCode() {
        try {
            return Arrays.hashCode(m40893b()) + 527;
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: b */
    private final byte[] m40893b() throws IOException {
        byte[] bArr = new byte[mo32465a()];
        mo32466a(C16841ks.m40858a(bArr));
        return bArr;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final C16846kx clone() {
        C16846kx kxVar = new C16846kx();
        try {
            kxVar.f47297a = this.f47297a;
            if (this.f47299c == null) {
                kxVar.f47299c = null;
            } else {
                kxVar.f47299c.addAll(this.f47299c);
            }
            if (this.f47298b != null) {
                if (this.f47298b instanceof C16850la) {
                    kxVar.f47298b = (C16850la) ((C16850la) this.f47298b).clone();
                } else if (this.f47298b instanceof byte[]) {
                    kxVar.f47298b = ((byte[]) this.f47298b).clone();
                } else {
                    int i = 0;
                    if (this.f47298b instanceof byte[][]) {
                        byte[][] bArr = (byte[][]) this.f47298b;
                        byte[][] bArr2 = new byte[bArr.length][];
                        kxVar.f47298b = bArr2;
                        while (i < bArr.length) {
                            bArr2[i] = (byte[]) bArr[i].clone();
                            i++;
                        }
                    } else if (this.f47298b instanceof boolean[]) {
                        kxVar.f47298b = ((boolean[]) this.f47298b).clone();
                    } else if (this.f47298b instanceof int[]) {
                        kxVar.f47298b = ((int[]) this.f47298b).clone();
                    } else if (this.f47298b instanceof long[]) {
                        kxVar.f47298b = ((long[]) this.f47298b).clone();
                    } else if (this.f47298b instanceof float[]) {
                        kxVar.f47298b = ((float[]) this.f47298b).clone();
                    } else if (this.f47298b instanceof double[]) {
                        kxVar.f47298b = ((double[]) this.f47298b).clone();
                    } else if (this.f47298b instanceof C16850la[]) {
                        C16850la[] laVarArr = (C16850la[]) this.f47298b;
                        C16850la[] laVarArr2 = new C16850la[laVarArr.length];
                        kxVar.f47298b = laVarArr2;
                        while (i < laVarArr.length) {
                            laVarArr2[i] = (C16850la) laVarArr[i].clone();
                            i++;
                        }
                    }
                }
            }
            return kxVar;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }
}
