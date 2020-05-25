package android.support.p043v7.widget;

import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import java.util.ArrayList;
import java.util.List;

/* renamed from: android.support.v7.widget.t */
final class C1501t {

    /* renamed from: a */
    final C1503b f5396a;

    /* renamed from: b */
    final C1502a f5397b = new C1502a();

    /* renamed from: c */
    final List<View> f5398c = new ArrayList();

    /* renamed from: android.support.v7.widget.t$a */
    static class C1502a {

        /* renamed from: a */
        long f5399a;

        /* renamed from: b */
        C1502a f5400b;

        C1502a() {
        }

        /* renamed from: b */
        private void m5353b() {
            if (this.f5400b == null) {
                this.f5400b = new C1502a();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo5841a() {
            C1502a aVar = this;
            while (true) {
                aVar.f5399a = 0;
                if (aVar.f5400b != null) {
                    aVar = aVar.f5400b;
                } else {
                    return;
                }
            }
        }

        public final String toString() {
            if (this.f5400b == null) {
                return Long.toBinaryString(this.f5399a);
            }
            StringBuilder sb = new StringBuilder();
            sb.append(this.f5400b.toString());
            sb.append("xx");
            sb.append(Long.toBinaryString(this.f5399a));
            return sb.toString();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo5842a(int i) {
            if (i >= 64) {
                m5353b();
                this.f5400b.mo5842a(i - 64);
                return;
            }
            this.f5399a |= 1 << i;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final void mo5844b(int i) {
            if (i < 64) {
                this.f5399a &= (1 << i) ^ -1;
            } else if (this.f5400b != null) {
                this.f5400b.mo5844b(i - 64);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public final boolean mo5845c(int i) {
            C1502a aVar = this;
            while (i >= 64) {
                aVar.m5353b();
                aVar = aVar.f5400b;
                i -= 64;
            }
            if ((aVar.f5399a & (1 << i)) != 0) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public final int mo5847e(int i) {
            if (this.f5400b == null) {
                if (i >= 64) {
                    return Long.bitCount(this.f5399a);
                }
                return Long.bitCount(this.f5399a & ((1 << i) - 1));
            } else if (i < 64) {
                return Long.bitCount(this.f5399a & ((1 << i) - 1));
            } else {
                return this.f5400b.mo5847e(i - 64) + Long.bitCount(this.f5399a);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public final boolean mo5846d(int i) {
            boolean z;
            C1502a aVar = this;
            while (i >= 64) {
                aVar.m5353b();
                aVar = aVar.f5400b;
                i -= 64;
            }
            long j = 1 << i;
            if ((aVar.f5399a & j) != 0) {
                z = true;
            } else {
                z = false;
            }
            aVar.f5399a &= j ^ -1;
            long j2 = j - 1;
            aVar.f5399a = (aVar.f5399a & j2) | Long.rotateRight((j2 ^ -1) & aVar.f5399a, 1);
            if (aVar.f5400b != null) {
                if (aVar.f5400b.mo5845c(0)) {
                    aVar.mo5842a(63);
                }
                aVar.f5400b.mo5846d(0);
            }
            return z;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo5843a(int i, boolean z) {
            boolean z2;
            boolean z3 = z;
            C1502a aVar = this;
            while (i < 64) {
                if ((aVar.f5399a & Long.MIN_VALUE) != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                long j = (1 << i) - 1;
                aVar.f5399a = (aVar.f5399a & j) | (((j ^ -1) & aVar.f5399a) << 1);
                if (z3) {
                    aVar.mo5842a(i);
                } else {
                    aVar.mo5844b(i);
                }
                if (z2 || aVar.f5400b != null) {
                    aVar.m5353b();
                    aVar = aVar.f5400b;
                    z3 = z2;
                    i = 0;
                } else {
                    return;
                }
            }
            aVar.m5353b();
            aVar.f5400b.mo5843a(i - 64, z3);
        }
    }

    /* renamed from: android.support.v7.widget.t$b */
    interface C1503b {
        /* renamed from: a */
        int mo4930a();

        /* renamed from: a */
        int mo4931a(View view);

        /* renamed from: a */
        void mo4932a(int i);

        /* renamed from: a */
        void mo4933a(View view, int i);

        /* renamed from: a */
        void mo4934a(View view, int i, LayoutParams layoutParams);

        /* renamed from: b */
        C1352v mo4935b(View view);

        /* renamed from: b */
        View mo4936b(int i);

        /* renamed from: b */
        void mo4937b();

        /* renamed from: c */
        void mo4938c(int i);

        /* renamed from: c */
        void mo4939c(View view);

        /* renamed from: d */
        void mo4940d(View view);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final int mo5833b() {
        return this.f5396a.mo4930a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final int mo5828a() {
        return this.f5396a.mo4930a() - this.f5398c.size();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f5397b.toString());
        sb.append(", hidden list:");
        sb.append(this.f5398c.size());
        return sb.toString();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final View mo5837c(int i) {
        return this.f5396a.mo4936b(i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final boolean mo5839d(View view) {
        return this.f5398c.contains(view);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final View mo5834b(int i) {
        return this.f5396a.mo4936b(m5340e(i));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final void mo5838d(int i) {
        int e = m5340e(i);
        this.f5397b.mo5846d(e);
        this.f5396a.mo4938c(e);
    }

    C1501t(C1503b bVar) {
        this.f5396a = bVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo5829a(int i) {
        int e = m5340e(i);
        View b = this.f5396a.mo4936b(e);
        if (b != null) {
            if (this.f5397b.mo5846d(e)) {
                mo5835b(b);
            }
            this.f5396a.mo4932a(e);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo5835b(View view) {
        if (!this.f5398c.remove(view)) {
            return false;
        }
        this.f5396a.mo4940d(view);
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final int mo5836c(View view) {
        int a = this.f5396a.mo4931a(view);
        if (a != -1 && !this.f5397b.mo5845c(a)) {
            return a - this.f5397b.mo5847e(a);
        }
        return -1;
    }

    /* renamed from: e */
    private int m5340e(int i) {
        if (i < 0) {
            return -1;
        }
        int a = this.f5396a.mo4930a();
        int i2 = i;
        while (i2 < a) {
            int e = i - (i2 - this.f5397b.mo5847e(i2));
            if (e == 0) {
                while (this.f5397b.mo5845c(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += e;
        }
        return -1;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5830a(View view) {
        this.f5398c.add(view);
        this.f5396a.mo4939c(view);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo5832a(View view, int i, boolean z) {
        int i2;
        if (i < 0) {
            i2 = this.f5396a.mo4930a();
        } else {
            i2 = m5340e(i);
        }
        this.f5397b.mo5843a(i2, z);
        if (z) {
            mo5830a(view);
        }
        this.f5396a.mo4933a(view, i2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo5831a(View view, int i, LayoutParams layoutParams, boolean z) {
        int i2;
        if (i < 0) {
            i2 = this.f5396a.mo4930a();
        } else {
            i2 = m5340e(i);
        }
        this.f5397b.mo5843a(i2, z);
        if (z) {
            mo5830a(view);
        }
        this.f5396a.mo4934a(view, i2, layoutParams);
    }
}
