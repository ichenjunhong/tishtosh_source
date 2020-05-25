package android.arch.p011c.p014b;

import android.arch.p011c.p012a.C0124d;
import android.arch.p011c.p012a.C0125e;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.TreeMap;

/* renamed from: android.arch.c.b.i */
public final class C0150i implements C0124d, C0125e {

    /* renamed from: g */
    static final TreeMap<Integer, C0150i> f375g = new TreeMap<>();

    /* renamed from: a */
    final long[] f376a;

    /* renamed from: b */
    final double[] f377b;

    /* renamed from: c */
    final String[] f378c;

    /* renamed from: d */
    final byte[][] f379d;

    /* renamed from: e */
    final int f380e;

    /* renamed from: f */
    int f381f;

    /* renamed from: h */
    private volatile String f382h;

    /* renamed from: i */
    private final int[] f383i;

    /* renamed from: a */
    public final String mo172a() {
        return this.f382h;
    }

    public final void close() {
    }

    /* renamed from: b */
    public final void mo261b() {
        synchronized (f375g) {
            f375g.put(Integer.valueOf(this.f380e), this);
            if (f375g.size() > 15) {
                int size = f375g.size() - 10;
                Iterator it = f375g.descendingKeySet().iterator();
                while (true) {
                    int i = size - 1;
                    if (size <= 0) {
                        break;
                    }
                    it.next();
                    it.remove();
                    size = i;
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo198a(int i) {
        this.f383i[i] = 1;
    }

    private C0150i(int i) {
        this.f380e = i;
        int i2 = i + 1;
        this.f383i = new int[i2];
        this.f376a = new long[i2];
        this.f377b = new double[i2];
        this.f378c = new String[i2];
        this.f379d = new byte[i2][];
    }

    /* renamed from: a */
    public final void mo173a(C0124d dVar) {
        for (int i = 1; i <= this.f381f; i++) {
            switch (this.f383i[i]) {
                case 1:
                    dVar.mo198a(i);
                    break;
                case 2:
                    dVar.mo200a(i, this.f376a[i]);
                    break;
                case 3:
                    dVar.mo199a(i, this.f377b[i]);
                    break;
                case 4:
                    dVar.mo201a(i, this.f378c[i]);
                    break;
                case 5:
                    dVar.mo202a(i, this.f379d[i]);
                    break;
            }
        }
    }

    /* renamed from: b */
    private void m335b(String str, int i) {
        this.f382h = str;
        this.f381f = i;
    }

    /* renamed from: a */
    public final void mo199a(int i, double d) {
        this.f383i[i] = 3;
        this.f377b[i] = d;
    }

    /* renamed from: a */
    public final void mo200a(int i, long j) {
        this.f383i[i] = 2;
        this.f376a[i] = j;
    }

    /* renamed from: a */
    public static C0150i m334a(String str, int i) {
        synchronized (f375g) {
            Entry ceilingEntry = f375g.ceilingEntry(Integer.valueOf(i));
            if (ceilingEntry != null) {
                f375g.remove(ceilingEntry.getKey());
                C0150i iVar = (C0150i) ceilingEntry.getValue();
                iVar.m335b(str, i);
                return iVar;
            }
            C0150i iVar2 = new C0150i(i);
            iVar2.m335b(str, i);
            return iVar2;
        }
    }

    /* renamed from: a */
    public final void mo201a(int i, String str) {
        this.f383i[i] = 4;
        this.f378c[i] = str;
    }

    /* renamed from: a */
    public final void mo202a(int i, byte[] bArr) {
        this.f383i[i] = 5;
        this.f379d[i] = bArr;
    }
}
