package android.arch.p010b;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

/* renamed from: android.arch.b.j */
final class C0092j<T> extends AbstractList<T> {

    /* renamed from: a */
    static final List f235a = new ArrayList();

    /* renamed from: b */
    public int f236b;

    /* renamed from: c */
    final ArrayList<List<T>> f237c;

    /* renamed from: d */
    public int f238d;

    /* renamed from: e */
    public int f239e;

    /* renamed from: f */
    public int f240f;

    /* renamed from: g */
    int f241g;

    /* renamed from: h */
    public int f242h;

    /* renamed from: i */
    public int f243i;

    /* renamed from: android.arch.b.j$a */
    interface C0093a {
        /* renamed from: a */
        void mo93a(int i, int i2);

        /* renamed from: a */
        void mo94a(int i, int i2, int i3);

        /* renamed from: b */
        void mo98b(int i);

        /* renamed from: b */
        void mo99b(int i, int i2, int i3);

        /* renamed from: c */
        void mo101c(int i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final int mo146a() {
        return this.f237c.size();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final T mo154d() {
        return ((List) this.f237c.get(0)).get(0);
    }

    public final int size() {
        return this.f236b + this.f240f + this.f238d;
    }

    C0092j() {
        this.f237c = new ArrayList<>();
        this.f238d = 0;
        this.f239e = 0;
        this.f240f = 0;
        this.f241g = 1;
        this.f242h = 0;
        this.f243i = 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final int mo151b() {
        int i = this.f236b;
        int size = this.f237c.size();
        for (int i2 = 0; i2 < size; i2++) {
            List list = (List) this.f237c.get(i2);
            if (list != null && list != f235a) {
                break;
            }
            i += this.f241g;
        }
        return i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final T mo155e() {
        List list = (List) this.f237c.get(this.f237c.size() - 1);
        return list.get(list.size() - 1);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final int mo153c() {
        int i = this.f238d;
        for (int size = this.f237c.size() - 1; size >= 0; size--) {
            List list = (List) this.f237c.get(size);
            if (list != null && list != f235a) {
                break;
            }
            i += this.f241g;
        }
        return i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("leading ");
        sb.append(this.f236b);
        sb.append(", storage ");
        sb.append(this.f240f);
        sb.append(", trailing ");
        sb.append(this.f238d);
        StringBuilder sb2 = new StringBuilder(sb.toString());
        for (int i = 0; i < this.f237c.size(); i++) {
            sb2.append(" ");
            sb2.append(this.f237c.get(i));
        }
        return sb2.toString();
    }

    C0092j(C0092j<T> jVar) {
        this.f236b = jVar.f236b;
        this.f237c = new ArrayList<>(jVar.f237c);
        this.f238d = jVar.f238d;
        this.f239e = jVar.f239e;
        this.f240f = jVar.f240f;
        this.f241g = jVar.f241g;
        this.f242h = jVar.f242h;
        this.f243i = jVar.f243i;
    }

    public final T get(int i) {
        boolean z;
        int i2;
        if (i < 0 || i >= size()) {
            StringBuilder sb = new StringBuilder("Index: ");
            sb.append(i);
            sb.append(", Size: ");
            sb.append(size());
            throw new IndexOutOfBoundsException(sb.toString());
        }
        int i3 = i - this.f236b;
        if (i3 < 0 || i3 >= this.f240f) {
            return null;
        }
        int i4 = 0;
        if (this.f241g > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i2 = i3 / this.f241g;
            i3 %= this.f241g;
        } else {
            int size = this.f237c.size();
            while (i4 < size) {
                int size2 = ((List) this.f237c.get(i4)).size();
                if (size2 > i3) {
                    break;
                }
                i3 -= size2;
                i4++;
            }
            i2 = i4;
        }
        List list = (List) this.f237c.get(i2);
        if (list == null || list.size() == 0) {
            return null;
        }
        return list.get(i3);
    }

    /* renamed from: b */
    public final boolean mo152b(int i, int i2) {
        int i3 = this.f236b / i;
        boolean z = false;
        if (i2 < i3 || i2 >= this.f237c.size() + i3) {
            return false;
        }
        List list = (List) this.f237c.get(i2 - i3);
        if (!(list == null || list == f235a)) {
            z = true;
        }
        return z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo147a(int i, int i2) {
        int i3;
        int i4 = this.f236b / this.f241g;
        if (i < i4) {
            int i5 = 0;
            while (true) {
                i3 = i4 - i;
                if (i5 >= i3) {
                    break;
                }
                this.f237c.add(0, null);
                i5++;
            }
            int i6 = i3 * this.f241g;
            this.f240f += i6;
            this.f236b -= i6;
        } else {
            i = i4;
        }
        if (i2 >= this.f237c.size() + i) {
            int min = Math.min(this.f238d, ((i2 + 1) - (this.f237c.size() + i)) * this.f241g);
            for (int size = this.f237c.size(); size <= i2 - i; size++) {
                this.f237c.add(this.f237c.size(), null);
            }
            this.f240f += min;
            this.f238d -= min;
        }
    }

    /* renamed from: a */
    public final void mo150a(int i, List<T> list, C0093a aVar) {
        boolean z;
        int size = list.size();
        if (size != this.f241g) {
            int size2 = size();
            boolean z2 = false;
            if (i != size2 - (size2 % this.f241g) || size >= this.f241g) {
                z = false;
            } else {
                z = true;
            }
            if (this.f238d == 0 && this.f237c.size() == 1 && size > this.f241g) {
                z2 = true;
            }
            if (!z2 && !z) {
                throw new IllegalArgumentException("page introduces incorrect tiling");
            } else if (z2) {
                this.f241g = size;
            }
        }
        int i2 = i / this.f241g;
        mo147a(i2, i2);
        int i3 = i2 - (this.f236b / this.f241g);
        List list2 = (List) this.f237c.get(i3);
        if (list2 == null || list2 == f235a) {
            this.f237c.set(i3, list);
            if (aVar != null) {
                aVar.mo93a(i, list.size());
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder("Invalid position ");
        sb.append(i);
        sb.append(": data already loaded");
        throw new IllegalArgumentException(sb.toString());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo148a(int i, List<T> list, int i2, int i3) {
        this.f236b = i;
        this.f237c.clear();
        this.f237c.add(list);
        this.f238d = i2;
        this.f239e = i3;
        this.f240f = list.size();
        this.f241g = list.size();
        this.f242h = 0;
        this.f243i = 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo149a(int i, List<T> list, int i2, int i3, int i4, C0093a aVar) {
        int size = (list.size() + (i4 - 1)) / i4;
        int i5 = 0;
        while (i5 < size) {
            int i6 = i5 * i4;
            int i7 = i5 + 1;
            List subList = list.subList(i6, Math.min(list.size(), i7 * i4));
            if (i5 == 0) {
                mo148a(i, subList, (list.size() + i2) - subList.size(), i3);
            } else {
                mo150a(i6 + i, subList, null);
            }
            i5 = i7;
        }
        aVar.mo98b(size());
    }
}
