package com.p683ss.android.ttve.common;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ttve.common.k */
public final class C20083k {

    /* renamed from: a */
    public List<Integer> f55211a = new ArrayList();

    /* renamed from: b */
    private int f55212b = -1;

    /* renamed from: c */
    private int f55213c = -1;

    /* renamed from: d */
    private List<Integer> f55214d = new ArrayList();

    /* renamed from: a */
    public final void mo42186a() {
        this.f55212b = -1;
        this.f55213c = -1;
        this.f55211a.clear();
        this.f55214d.clear();
    }

    /* renamed from: a */
    public final int mo42185a(int i, int i2) {
        if (i2 < 0) {
            return i2;
        }
        if (this.f55212b == -1) {
            this.f55212b = i2;
        }
        if (this.f55211a.size() > 0) {
            i2 = ((Integer) this.f55211a.get(this.f55211a.size() - 1)).intValue() + 1;
        }
        this.f55211a.add(Integer.valueOf(i2));
        return i2;
    }

    /* renamed from: b */
    public final int mo42187b(int i, int i2) {
        int i3 = 0;
        switch (i) {
            case 1:
                if (i2 >= this.f55212b && this.f55212b != -1) {
                    while (i3 < this.f55211a.size()) {
                        if (i2 == ((Integer) this.f55211a.get(i3)).intValue()) {
                            return i3 + this.f55212b;
                        }
                        i3++;
                    }
                    break;
                } else {
                    return i2;
                }
                break;
            case 2:
                if (i2 >= this.f55213c && this.f55213c != -1) {
                    while (i3 < this.f55214d.size()) {
                        if (i2 == ((Integer) this.f55214d.get(i3)).intValue()) {
                            return i3 + this.f55213c;
                        }
                        i3++;
                    }
                    break;
                } else {
                    return i2;
                }
                break;
        }
        return i2;
    }
}
