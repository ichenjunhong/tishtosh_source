package android.support.p043v7.widget;

import android.view.View;

/* renamed from: android.support.v7.widget.bh */
final class C1461bh {

    /* renamed from: a */
    final C1463b f5278a;

    /* renamed from: b */
    C1462a f5279b = new C1462a();

    /* renamed from: android.support.v7.widget.bh$a */
    static class C1462a {

        /* renamed from: a */
        int f5280a;

        /* renamed from: b */
        int f5281b;

        /* renamed from: c */
        int f5282c;

        /* renamed from: d */
        int f5283d;

        /* renamed from: e */
        int f5284e;

        C1462a() {
        }

        /* renamed from: a */
        private static int m5105a(int i, int i2) {
            if (i > i2) {
                return 1;
            }
            return i == i2 ? 2 : 4;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo5709a() {
            this.f5280a = 0;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final boolean mo5712b() {
            if ((this.f5280a & 7) != 0 && (this.f5280a & (m5105a(this.f5283d, this.f5281b) << 0)) == 0) {
                return false;
            }
            if ((this.f5280a & 112) != 0 && (this.f5280a & (m5105a(this.f5283d, this.f5282c) << 4)) == 0) {
                return false;
            }
            if ((this.f5280a & 1792) != 0 && (this.f5280a & (m5105a(this.f5284e, this.f5281b) << 8)) == 0) {
                return false;
            }
            if ((this.f5280a & 28672) == 0 || (this.f5280a & (m5105a(this.f5284e, this.f5282c) << 12)) != 0) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo5710a(int i) {
            this.f5280a = i | this.f5280a;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo5711a(int i, int i2, int i3, int i4) {
            this.f5281b = i;
            this.f5282c = i2;
            this.f5283d = i3;
            this.f5284e = i4;
        }
    }

    /* renamed from: android.support.v7.widget.bh$b */
    interface C1463b {
        /* renamed from: a */
        int mo5070a();

        /* renamed from: a */
        int mo5071a(View view);

        /* renamed from: a */
        View mo5072a(int i);

        /* renamed from: b */
        int mo5073b();

        /* renamed from: b */
        int mo5074b(View view);
    }

    C1461bh(C1463b bVar) {
        this.f5278a = bVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo5708a(View view, int i) {
        this.f5279b.mo5711a(this.f5278a.mo5070a(), this.f5278a.mo5073b(), this.f5278a.mo5071a(view), this.f5278a.mo5074b(view));
        this.f5279b.mo5709a();
        this.f5279b.mo5710a(24579);
        return this.f5279b.mo5712b();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final View mo5707a(int i, int i2, int i3, int i4) {
        int i5;
        int a = this.f5278a.mo5070a();
        int b = this.f5278a.mo5073b();
        if (i2 > i) {
            i5 = 1;
        } else {
            i5 = -1;
        }
        View view = null;
        while (i != i2) {
            View a2 = this.f5278a.mo5072a(i);
            this.f5279b.mo5711a(a, b, this.f5278a.mo5071a(a2), this.f5278a.mo5074b(a2));
            if (i3 != 0) {
                this.f5279b.mo5709a();
                this.f5279b.mo5710a(i3);
                if (this.f5279b.mo5712b()) {
                    return a2;
                }
            }
            if (i4 != 0) {
                this.f5279b.mo5709a();
                this.f5279b.mo5710a(i4);
                if (this.f5279b.mo5712b()) {
                    view = a2;
                }
            }
            i += i5;
        }
        return view;
    }
}
