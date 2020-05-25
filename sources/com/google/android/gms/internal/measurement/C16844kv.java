package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C16843ku;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.kv */
public final class C16844kv<M extends C16843ku<M>, T> {

    /* renamed from: a */
    protected final Class<T> f47289a;

    /* renamed from: b */
    public final int f47290b;

    /* renamed from: c */
    protected final boolean f47291c;

    /* renamed from: d */
    private final int f47292d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16844kv)) {
            return false;
        }
        C16844kv kvVar = (C16844kv) obj;
        return this.f47292d == kvVar.f47292d && this.f47289a == kvVar.f47289a && this.f47290b == kvVar.f47290b && this.f47291c == kvVar.f47291c;
    }

    public final int hashCode() {
        return ((((((this.f47292d + 1147) * 31) + this.f47289a.hashCode()) * 31) + this.f47290b) * 31) + (this.f47291c ? 1 : 0);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final T mo32455a(List<C16852lc> list) {
        if (list == null) {
            return null;
        }
        if (this.f47291c) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                C16852lc lcVar = (C16852lc) list.get(i);
                if (lcVar.f47306b.length != 0) {
                    arrayList.add(m40885a(C16839kq.m40831a(lcVar.f47306b)));
                }
            }
            int size = arrayList.size();
            if (size == 0) {
                return null;
            }
            T cast = this.f47289a.cast(Array.newInstance(this.f47289a.getComponentType(), size));
            for (int i2 = 0; i2 < size; i2++) {
                Array.set(cast, i2, arrayList.get(i2));
            }
            return cast;
        } else if (list.isEmpty()) {
            return null;
        } else {
            return this.f47289a.cast(m40885a(C16839kq.m40831a(((C16852lc) list.get(list.size() - 1)).f47306b)));
        }
    }

    /* renamed from: a */
    private final Object m40885a(C16839kq kqVar) {
        Class<T> componentType = this.f47291c ? this.f47289a.getComponentType() : this.f47289a;
        try {
            switch (this.f47292d) {
                case 10:
                    C16850la laVar = (C16850la) componentType.newInstance();
                    int i = this.f47290b >>> 3;
                    if (kqVar.f47265c < kqVar.f47266d) {
                        kqVar.f47265c++;
                        laVar.mo31923a(kqVar);
                        kqVar.mo32423a((i << 3) | 4);
                        kqVar.f47265c--;
                        return laVar;
                    }
                    throw C16848kz.m40907d();
                case 11:
                    C16850la laVar2 = (C16850la) componentType.newInstance();
                    kqVar.mo32425a(laVar2);
                    return laVar2;
                default:
                    int i2 = this.f47292d;
                    StringBuilder sb = new StringBuilder(24);
                    sb.append("Unknown type ");
                    sb.append(i2);
                    throw new IllegalArgumentException(sb.toString());
            }
        } catch (InstantiationException e) {
            String valueOf = String.valueOf(componentType);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 33);
            sb2.append("Error creating instance of class ");
            sb2.append(valueOf);
            throw new IllegalArgumentException(sb2.toString(), e);
        } catch (IllegalAccessException e2) {
            String valueOf2 = String.valueOf(componentType);
            StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf2).length() + 33);
            sb3.append("Error creating instance of class ");
            sb3.append(valueOf2);
            throw new IllegalArgumentException(sb3.toString(), e2);
        } catch (IOException e3) {
            throw new IllegalArgumentException("Error reading extension field", e3);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo32456a(Object obj, C16841ks ksVar) {
        try {
            ksVar.mo32449c(this.f47290b);
            switch (this.f47292d) {
                case 10:
                    int i = this.f47290b >>> 3;
                    ((C16850la) obj).mo31924a(ksVar);
                    ksVar.mo32450c(i, 4);
                    return;
                case 11:
                    ksVar.mo32447a((C16850la) obj);
                    return;
                default:
                    int i2 = this.f47292d;
                    StringBuilder sb = new StringBuilder(24);
                    sb.append("Unknown type ");
                    sb.append(i2);
                    throw new IllegalArgumentException(sb.toString());
            }
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo32454a(Object obj) {
        int i = this.f47290b >>> 3;
        switch (this.f47292d) {
            case 10:
                return (C16841ks.m40861b(i) << 1) + ((C16850la) obj).mo32479e();
            case 11:
                return C16841ks.m40863b(i, (C16850la) obj);
            default:
                int i2 = this.f47292d;
                StringBuilder sb = new StringBuilder(24);
                sb.append("Unknown type ");
                sb.append(i2);
                throw new IllegalArgumentException(sb.toString());
        }
    }
}
