package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Stack;

final class bov implements boz {

    /* renamed from: a */
    private final byte[] f43206a = new byte[8];

    /* renamed from: b */
    private final Stack<box> f43207b = new Stack<>();

    /* renamed from: c */
    private final bpg f43208c = new bpg();

    /* renamed from: d */
    private bpa f43209d;

    /* renamed from: e */
    private int f43210e;

    /* renamed from: f */
    private int f43211f;

    /* renamed from: g */
    private long f43212g;

    bov() {
    }

    /* renamed from: a */
    public final void mo30522a(bpa bpa) {
        this.f43209d = bpa;
    }

    /* renamed from: a */
    public final void mo30521a() {
        this.f43210e = 0;
        this.f43207b.clear();
        this.f43208c.mo30538a();
    }

    /* renamed from: a */
    public final boolean mo30523a(bol bol) throws IOException, InterruptedException {
        String str;
        double d;
        bti.m36701b(this.f43209d != null);
        while (true) {
            if (this.f43207b.isEmpty() || bol.mo30500b() < ((box) this.f43207b.peek()).f43214b) {
                if (this.f43210e == 0) {
                    long a = this.f43208c.mo30537a(bol, true, false, 4);
                    if (a == -2) {
                        bol.mo30498a();
                        while (true) {
                            bol.mo30505c(this.f43206a, 0, 4);
                            int a2 = bpg.m36388a(this.f43206a[0]);
                            if (a2 != -1 && a2 <= 4) {
                                int a3 = (int) bpg.m36389a(this.f43206a, a2, false);
                                if (this.f43209d.mo30530b(a3)) {
                                    bol.mo30501b(a2);
                                    a = (long) a3;
                                }
                            }
                            bol.mo30501b(1);
                        }
                    }
                    if (a == -1) {
                        return false;
                    }
                    this.f43211f = (int) a;
                    this.f43210e = 1;
                }
                if (this.f43210e == 1) {
                    this.f43212g = this.f43208c.mo30537a(bol, false, true, 8);
                    this.f43210e = 2;
                }
                int a4 = this.f43209d.mo30524a(this.f43211f);
                switch (a4) {
                    case 0:
                        bol.mo30501b((int) this.f43212g);
                        this.f43210e = 0;
                    case 1:
                        long b = bol.mo30500b();
                        this.f43207b.add(new box(this.f43211f, this.f43212g + b));
                        this.f43209d.mo30528a(this.f43211f, b, this.f43212g);
                        this.f43210e = 0;
                        return true;
                    case 2:
                        if (this.f43212g <= 8) {
                            this.f43209d.mo30527a(this.f43211f, m36348a(bol, (int) this.f43212g));
                            this.f43210e = 0;
                            return true;
                        }
                        long j = this.f43212g;
                        StringBuilder sb = new StringBuilder(42);
                        sb.append("Invalid integer size: ");
                        sb.append(j);
                        throw new bmk(sb.toString());
                    case 3:
                        if (this.f43212g <= 2147483647L) {
                            bpa bpa = this.f43209d;
                            int i = this.f43211f;
                            int i2 = (int) this.f43212g;
                            if (i2 == 0) {
                                str = "";
                            } else {
                                byte[] bArr = new byte[i2];
                                bol.mo30502b(bArr, 0, i2);
                                str = new String(bArr);
                            }
                            bpa.mo30529a(i, str);
                            this.f43210e = 0;
                            return true;
                        }
                        long j2 = this.f43212g;
                        StringBuilder sb2 = new StringBuilder(41);
                        sb2.append("String element size: ");
                        sb2.append(j2);
                        throw new bmk(sb2.toString());
                    case 4:
                        this.f43209d.mo30526a(this.f43211f, (int) this.f43212g, bol);
                        this.f43210e = 0;
                        return true;
                    case 5:
                        if (this.f43212g == 4 || this.f43212g == 8) {
                            bpa bpa2 = this.f43209d;
                            int i3 = this.f43211f;
                            int i4 = (int) this.f43212g;
                            long a5 = m36348a(bol, i4);
                            if (i4 == 4) {
                                d = (double) Float.intBitsToFloat((int) a5);
                            } else {
                                d = Double.longBitsToDouble(a5);
                            }
                            bpa2.mo30525a(i3, d);
                            this.f43210e = 0;
                            return true;
                        }
                        long j3 = this.f43212g;
                        StringBuilder sb3 = new StringBuilder(40);
                        sb3.append("Invalid float size: ");
                        sb3.append(j3);
                        throw new bmk(sb3.toString());
                    default:
                        StringBuilder sb4 = new StringBuilder(32);
                        sb4.append("Invalid element type ");
                        sb4.append(a4);
                        throw new bmk(sb4.toString());
                }
            } else {
                this.f43209d.mo30531c(((box) this.f43207b.pop()).f43213a);
                return true;
            }
        }
    }

    /* renamed from: a */
    private final long m36348a(bol bol, int i) throws IOException, InterruptedException {
        bol.mo30502b(this.f43206a, 0, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | ((long) (this.f43206a[i2] & 255));
        }
        return j;
    }
}
