package p2628d.p2647j;

import java.util.NoSuchElementException;
import p2628d.p2629a.C52549aa;

/* renamed from: d.j.b */
public final class C52750b extends C52549aa {

    /* renamed from: a */
    public final int f130998a;

    /* renamed from: b */
    private final int f130999b;

    /* renamed from: c */
    private boolean f131000c;

    /* renamed from: d */
    private int f131001d;

    public final boolean hasNext() {
        return this.f131000c;
    }

    /* renamed from: a */
    public final int mo110114a() {
        int i = this.f131001d;
        if (i != this.f130999b) {
            this.f131001d += this.f130998a;
        } else if (this.f131000c) {
            this.f131000c = false;
        } else {
            throw new NoSuchElementException();
        }
        return i;
    }

    public C52750b(int i, int i2, int i3) {
        this.f130998a = i3;
        this.f130999b = i2;
        boolean z = false;
        if (this.f130998a <= 0 ? i >= i2 : i <= i2) {
            z = true;
        }
        this.f131000c = z;
        if (!this.f131000c) {
            i = this.f130999b;
        }
        this.f131001d = i;
    }
}
