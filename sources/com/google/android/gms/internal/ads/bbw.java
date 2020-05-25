package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

final class bbw implements Cloneable {

    /* renamed from: a */
    private bbu<?, ?> f41789a;

    /* renamed from: b */
    private Object f41790b;

    /* renamed from: c */
    private List<Object> f41791c = new ArrayList();

    bbw() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final int mo30035a() {
        if (this.f41790b == null) {
            Iterator it = this.f41791c.iterator();
            if (!it.hasNext()) {
                return 0;
            }
            it.next();
            throw new NoSuchMethodError();
        }
        throw new NoSuchMethodError();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo30036a(bbr bbr) throws IOException {
        if (this.f41790b == null) {
            Iterator it = this.f41791c.iterator();
            if (it.hasNext()) {
                it.next();
                throw new NoSuchMethodError();
            }
            return;
        }
        throw new NoSuchMethodError();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bbw)) {
            return false;
        }
        bbw bbw = (bbw) obj;
        if (this.f41790b == null || bbw.f41790b == null) {
            if (this.f41791c != null && bbw.f41791c != null) {
                return this.f41791c.equals(bbw.f41791c);
            }
            try {
                return Arrays.equals(m35335b(), bbw.m35335b());
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        } else if (this.f41789a != bbw.f41789a) {
            return false;
        } else {
            if (!this.f41789a.f41784a.isArray()) {
                return this.f41790b.equals(bbw.f41790b);
            }
            if (this.f41790b instanceof byte[]) {
                return Arrays.equals((byte[]) this.f41790b, (byte[]) bbw.f41790b);
            }
            if (this.f41790b instanceof int[]) {
                return Arrays.equals((int[]) this.f41790b, (int[]) bbw.f41790b);
            }
            if (this.f41790b instanceof long[]) {
                return Arrays.equals((long[]) this.f41790b, (long[]) bbw.f41790b);
            }
            if (this.f41790b instanceof float[]) {
                return Arrays.equals((float[]) this.f41790b, (float[]) bbw.f41790b);
            }
            if (this.f41790b instanceof double[]) {
                return Arrays.equals((double[]) this.f41790b, (double[]) bbw.f41790b);
            }
            if (this.f41790b instanceof boolean[]) {
                return Arrays.equals((boolean[]) this.f41790b, (boolean[]) bbw.f41790b);
            }
            return Arrays.deepEquals((Object[]) this.f41790b, (Object[]) bbw.f41790b);
        }
    }

    public final int hashCode() {
        try {
            return Arrays.hashCode(m35335b()) + 527;
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: b */
    private final byte[] m35335b() throws IOException {
        byte[] bArr = new byte[mo30035a()];
        mo30036a(bbr.m35312a(bArr));
        return bArr;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final bbw clone() {
        bbw bbw = new bbw();
        try {
            bbw.f41789a = this.f41789a;
            if (this.f41791c == null) {
                bbw.f41791c = null;
            } else {
                bbw.f41791c.addAll(this.f41791c);
            }
            if (this.f41790b != null) {
                if (this.f41790b instanceof bby) {
                    bbw.f41790b = (bby) ((bby) this.f41790b).clone();
                } else if (this.f41790b instanceof byte[]) {
                    bbw.f41790b = ((byte[]) this.f41790b).clone();
                } else {
                    int i = 0;
                    if (this.f41790b instanceof byte[][]) {
                        byte[][] bArr = (byte[][]) this.f41790b;
                        byte[][] bArr2 = new byte[bArr.length][];
                        bbw.f41790b = bArr2;
                        while (i < bArr.length) {
                            bArr2[i] = (byte[]) bArr[i].clone();
                            i++;
                        }
                    } else if (this.f41790b instanceof boolean[]) {
                        bbw.f41790b = ((boolean[]) this.f41790b).clone();
                    } else if (this.f41790b instanceof int[]) {
                        bbw.f41790b = ((int[]) this.f41790b).clone();
                    } else if (this.f41790b instanceof long[]) {
                        bbw.f41790b = ((long[]) this.f41790b).clone();
                    } else if (this.f41790b instanceof float[]) {
                        bbw.f41790b = ((float[]) this.f41790b).clone();
                    } else if (this.f41790b instanceof double[]) {
                        bbw.f41790b = ((double[]) this.f41790b).clone();
                    } else if (this.f41790b instanceof bby[]) {
                        bby[] bbyArr = (bby[]) this.f41790b;
                        bby[] bbyArr2 = new bby[bbyArr.length];
                        bbw.f41790b = bbyArr2;
                        while (i < bbyArr.length) {
                            bbyArr2[i] = (bby) bbyArr[i].clone();
                            i++;
                        }
                    }
                }
            }
            return bbw;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }
}
