package android.support.p043v7.p051e;

/* renamed from: android.support.v7.e.b */
public final class C1207b implements C1216d {

    /* renamed from: a */
    final C1216d f3992a;

    /* renamed from: b */
    int f3993b;

    /* renamed from: c */
    int f3994c = -1;

    /* renamed from: d */
    int f3995d = -1;

    /* renamed from: e */
    Object f3996e;

    /* renamed from: a */
    public final void mo3928a() {
        if (this.f3993b != 0) {
            switch (this.f3993b) {
                case 1:
                    this.f3992a.mo164a(this.f3994c, this.f3995d);
                    break;
                case 2:
                    this.f3992a.mo166b(this.f3994c, this.f3995d);
                    break;
                case 3:
                    this.f3992a.mo165a(this.f3994c, this.f3995d, this.f3996e);
                    break;
            }
            this.f3996e = null;
            this.f3993b = 0;
        }
    }

    public C1207b(C1216d dVar) {
        this.f3992a = dVar;
    }

    /* renamed from: c */
    public final void mo167c(int i, int i2) {
        mo3928a();
        this.f3992a.mo167c(i, i2);
    }

    /* renamed from: b */
    public final void mo166b(int i, int i2) {
        if (this.f3993b != 2 || this.f3994c < i || this.f3994c > i + i2) {
            mo3928a();
            this.f3994c = i;
            this.f3995d = i2;
            this.f3993b = 2;
            return;
        }
        this.f3995d += i2;
        this.f3994c = i;
    }

    /* renamed from: a */
    public final void mo164a(int i, int i2) {
        if (this.f3993b != 1 || i < this.f3994c || i > this.f3994c + this.f3995d) {
            mo3928a();
            this.f3994c = i;
            this.f3995d = i2;
            this.f3993b = 1;
            return;
        }
        this.f3995d += i2;
        this.f3994c = Math.min(i, this.f3994c);
    }

    /* renamed from: a */
    public final void mo165a(int i, int i2, Object obj) {
        if (this.f3993b == 3 && i <= this.f3994c + this.f3995d) {
            int i3 = i + i2;
            if (i3 >= this.f3994c && this.f3996e == obj) {
                int i4 = this.f3994c + this.f3995d;
                this.f3994c = Math.min(i, this.f3994c);
                this.f3995d = Math.max(i4, i3) - this.f3994c;
                return;
            }
        }
        mo3928a();
        this.f3994c = i;
        this.f3995d = i2;
        this.f3996e = obj;
        this.f3993b = 3;
    }
}
