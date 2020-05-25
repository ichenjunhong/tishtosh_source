package p2628d.p2647j;

import java.util.Iterator;
import p2628d.p2635d.C52643c;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.p2642a.C52695a;

/* renamed from: d.j.a */
public class C52748a implements C52695a, Iterable<Integer> {

    /* renamed from: d */
    public static final C52749a f130994d = new C52749a(null);

    /* renamed from: a */
    public final int f130995a;

    /* renamed from: b */
    public final int f130996b;

    /* renamed from: c */
    public final int f130997c;

    /* renamed from: d.j.a$a */
    public static final class C52749a {
        private C52749a() {
        }

        public /* synthetic */ C52749a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static C52748a m112308a(int i, int i2, int i3) {
            return new C52748a(i, i2, -1);
        }
    }

    public /* synthetic */ Iterator iterator() {
        return new C52750b(this.f130995a, this.f130996b, this.f130997c);
    }

    /* renamed from: a */
    public boolean mo110342a() {
        if (this.f130997c > 0) {
            if (this.f130995a > this.f130996b) {
                return true;
            }
            return false;
        } else if (this.f130995a < this.f130996b) {
            return true;
        } else {
            return false;
        }
    }

    public int hashCode() {
        if (mo110342a()) {
            return -1;
        }
        return (((this.f130995a * 31) + this.f130996b) * 31) + this.f130997c;
    }

    public String toString() {
        StringBuilder sb;
        int i;
        if (this.f130997c > 0) {
            sb = new StringBuilder();
            sb.append(this.f130995a);
            sb.append("..");
            sb.append(this.f130996b);
            sb.append(" step ");
            i = this.f130997c;
        } else {
            sb = new StringBuilder();
            sb.append(this.f130995a);
            sb.append(" downTo ");
            sb.append(this.f130996b);
            sb.append(" step ");
            i = -this.f130997c;
        }
        sb.append(i);
        return sb.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0025, code lost:
        if (r2.f130997c == r3.f130997c) goto L_0x0027;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            boolean r0 = r3 instanceof p2628d.p2647j.C52748a
            if (r0 == 0) goto L_0x0029
            boolean r0 = r2.mo110342a()
            if (r0 == 0) goto L_0x0013
            r0 = r3
            d.j.a r0 = (p2628d.p2647j.C52748a) r0
            boolean r0 = r0.mo110342a()
            if (r0 != 0) goto L_0x0027
        L_0x0013:
            int r0 = r2.f130995a
            d.j.a r3 = (p2628d.p2647j.C52748a) r3
            int r1 = r3.f130995a
            if (r0 != r1) goto L_0x0029
            int r0 = r2.f130996b
            int r1 = r3.f130996b
            if (r0 != r1) goto L_0x0029
            int r0 = r2.f130997c
            int r3 = r3.f130997c
            if (r0 != r3) goto L_0x0029
        L_0x0027:
            r3 = 1
            return r3
        L_0x0029:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p2628d.p2647j.C52748a.equals(java.lang.Object):boolean");
    }

    public C52748a(int i, int i2, int i3) {
        if (i3 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        } else if (i3 != Integer.MIN_VALUE) {
            this.f130995a = i;
            if (i3 > 0) {
                if (i < i2) {
                    i2 -= C52643c.m112187a(i2, i, i3);
                }
            } else if (i3 >= 0) {
                throw new IllegalArgumentException("Step is zero.");
            } else if (i > i2) {
                i2 += C52643c.m112187a(i, i2, -i3);
            }
            this.f130996b = i2;
            this.f130997c = i3;
        } else {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
    }
}
