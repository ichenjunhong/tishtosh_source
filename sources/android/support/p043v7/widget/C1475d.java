package android.support.p043v7.widget;

import android.support.p030v4.p038f.C0795l.C0796a;
import android.support.p030v4.p038f.C0795l.C0797b;
import android.support.p043v7.widget.RecyclerView.C1352v;
import java.util.ArrayList;
import java.util.List;

/* renamed from: android.support.v7.widget.d */
final class C1475d implements C1421a {

    /* renamed from: a */
    final ArrayList<C1477b> f5314a;

    /* renamed from: b */
    final ArrayList<C1477b> f5315b;

    /* renamed from: c */
    final C1476a f5316c;

    /* renamed from: d */
    Runnable f5317d;

    /* renamed from: e */
    final boolean f5318e;

    /* renamed from: f */
    final C1420aj f5319f;

    /* renamed from: g */
    int f5320g;

    /* renamed from: h */
    private C0796a<C1477b> f5321h;

    /* renamed from: android.support.v7.widget.d$a */
    interface C1476a {
        /* renamed from: a */
        C1352v mo4941a(int i);

        /* renamed from: a */
        void mo4942a(int i, int i2);

        /* renamed from: a */
        void mo4943a(int i, int i2, Object obj);

        /* renamed from: a */
        void mo4944a(C1477b bVar);

        /* renamed from: b */
        void mo4945b(int i, int i2);

        /* renamed from: b */
        void mo4946b(C1477b bVar);

        /* renamed from: c */
        void mo4947c(int i, int i2);

        /* renamed from: d */
        void mo4948d(int i, int i2);
    }

    /* renamed from: android.support.v7.widget.d$b */
    static class C1477b {

        /* renamed from: a */
        int f5322a;

        /* renamed from: b */
        int f5323b;

        /* renamed from: c */
        Object f5324c;

        /* renamed from: d */
        int f5325d;

        public final int hashCode() {
            return (((this.f5322a * 31) + this.f5323b) * 31) + this.f5325d;
        }

        public final String toString() {
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append("[");
            int i = this.f5322a;
            if (i == 4) {
                str = "up";
            } else if (i != 8) {
                switch (i) {
                    case 1:
                        str = "add";
                        break;
                    case 2:
                        str = "rm";
                        break;
                    default:
                        str = "??";
                        break;
                }
            } else {
                str = "mv";
            }
            sb.append(str);
            sb.append(",s:");
            sb.append(this.f5323b);
            sb.append("c:");
            sb.append(this.f5325d);
            sb.append(",p:");
            sb.append(this.f5324c);
            sb.append("]");
            return sb.toString();
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C1477b bVar = (C1477b) obj;
            if (this.f5322a != bVar.f5322a) {
                return false;
            }
            if (this.f5322a == 8 && Math.abs(this.f5325d - this.f5323b) == 1 && this.f5325d == bVar.f5323b && this.f5323b == bVar.f5325d) {
                return true;
            }
            if (this.f5325d != bVar.f5325d || this.f5323b != bVar.f5323b) {
                return false;
            }
            if (this.f5324c != null) {
                if (!this.f5324c.equals(bVar.f5324c)) {
                    return false;
                }
            } else if (bVar.f5324c != null) {
                return false;
            }
            return true;
        }

        C1477b(int i, int i2, int i3, Object obj) {
            this.f5322a = i;
            this.f5323b = i2;
            this.f5325d = i3;
            this.f5324c = obj;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo5745a() {
        m5158a((List<C1477b>) this.f5314a);
        m5158a((List<C1477b>) this.f5315b);
        this.f5320g = 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final boolean mo5751d() {
        if (this.f5314a.size() > 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public final boolean mo5753f() {
        if (this.f5315b.isEmpty() || this.f5314a.isEmpty()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final void mo5750c() {
        int size = this.f5315b.size();
        for (int i = 0; i < size; i++) {
            this.f5316c.mo4946b((C1477b) this.f5315b.get(i));
        }
        m5158a((List<C1477b>) this.f5315b);
        this.f5320g = 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final void mo5752e() {
        mo5750c();
        int size = this.f5314a.size();
        for (int i = 0; i < size; i++) {
            C1477b bVar = (C1477b) this.f5314a.get(i);
            int i2 = bVar.f5322a;
            if (i2 == 4) {
                this.f5316c.mo4946b(bVar);
                this.f5316c.mo4943a(bVar.f5323b, bVar.f5325d, bVar.f5324c);
            } else if (i2 != 8) {
                switch (i2) {
                    case 1:
                        this.f5316c.mo4946b(bVar);
                        this.f5316c.mo4947c(bVar.f5323b, bVar.f5325d);
                        break;
                    case 2:
                        this.f5316c.mo4946b(bVar);
                        this.f5316c.mo4942a(bVar.f5323b, bVar.f5325d);
                        break;
                }
            } else {
                this.f5316c.mo4946b(bVar);
                this.f5316c.mo4948d(bVar.f5323b, bVar.f5325d);
            }
            if (this.f5317d != null) {
                this.f5317d.run();
            }
        }
        m5158a((List<C1477b>) this.f5314a);
        this.f5320g = 0;
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x01bf  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x01c5  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x01ed  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x01f1  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x01fb  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0200  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x0006 A[SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo5748b() {
        /*
            r16 = this;
            r0 = r16
            android.support.v7.widget.aj r1 = r0.f5319f
            java.util.ArrayList<android.support.v7.widget.d$b> r2 = r0.f5314a
        L_0x0006:
            int r3 = r2.size()
            r4 = 1
            int r3 = r3 - r4
            r6 = 0
        L_0x000d:
            r7 = 8
            r8 = -1
            if (r3 < 0) goto L_0x0023
            java.lang.Object r9 = r2.get(r3)
            android.support.v7.widget.d$b r9 = (android.support.p043v7.widget.C1475d.C1477b) r9
            int r9 = r9.f5322a
            if (r9 != r7) goto L_0x001f
            if (r6 == 0) goto L_0x0020
            goto L_0x0024
        L_0x001f:
            r6 = 1
        L_0x0020:
            int r3 = r3 + -1
            goto L_0x000d
        L_0x0023:
            r3 = -1
        L_0x0024:
            r6 = 2
            r9 = 0
            r10 = 4
            if (r3 == r8) goto L_0x0205
            int r7 = r3 + 1
            java.lang.Object r11 = r2.get(r3)
            android.support.v7.widget.d$b r11 = (android.support.p043v7.widget.C1475d.C1477b) r11
            java.lang.Object r12 = r2.get(r7)
            android.support.v7.widget.d$b r12 = (android.support.p043v7.widget.C1475d.C1477b) r12
            int r13 = r12.f5322a
            if (r13 == r10) goto L_0x0193
            switch(r13) {
                case 1: goto L_0x015b;
                case 2: goto L_0x003f;
                default: goto L_0x003e;
            }
        L_0x003e:
            goto L_0x0006
        L_0x003f:
            int r8 = r11.f5323b
            int r10 = r11.f5325d
            if (r8 >= r10) goto L_0x0059
            int r8 = r12.f5323b
            int r10 = r11.f5323b
            if (r8 != r10) goto L_0x0056
            int r8 = r12.f5325d
            int r10 = r11.f5325d
            int r13 = r11.f5323b
            int r10 = r10 - r13
            if (r8 != r10) goto L_0x0056
            r5 = 1
            goto L_0x0057
        L_0x0056:
            r5 = 0
        L_0x0057:
            r8 = 0
            goto L_0x006d
        L_0x0059:
            int r8 = r12.f5323b
            int r10 = r11.f5325d
            int r10 = r10 + r4
            if (r8 != r10) goto L_0x006b
            int r8 = r12.f5325d
            int r10 = r11.f5323b
            int r13 = r11.f5325d
            int r10 = r10 - r13
            if (r8 != r10) goto L_0x006b
            r5 = 1
            goto L_0x006c
        L_0x006b:
            r5 = 0
        L_0x006c:
            r8 = 1
        L_0x006d:
            int r10 = r11.f5325d
            int r13 = r12.f5323b
            if (r10 >= r13) goto L_0x0079
            int r10 = r12.f5323b
            int r10 = r10 - r4
            r12.f5323b = r10
            goto L_0x0099
        L_0x0079:
            int r10 = r11.f5325d
            int r13 = r12.f5323b
            int r14 = r12.f5325d
            int r13 = r13 + r14
            if (r10 >= r13) goto L_0x0099
            int r3 = r12.f5325d
            int r3 = r3 - r4
            r12.f5325d = r3
            r11.f5322a = r6
            r11.f5325d = r4
            int r3 = r12.f5325d
            if (r3 != 0) goto L_0x0006
            r2.remove(r7)
            android.support.v7.widget.aj$a r3 = r1.f5118a
            r3.mo5514a(r12)
            goto L_0x0006
        L_0x0099:
            int r10 = r11.f5323b
            int r13 = r12.f5323b
            if (r10 > r13) goto L_0x00a5
            int r6 = r12.f5323b
            int r6 = r6 + r4
            r12.f5323b = r6
            goto L_0x00c6
        L_0x00a5:
            int r10 = r11.f5323b
            int r13 = r12.f5323b
            int r14 = r12.f5325d
            int r13 = r13 + r14
            if (r10 >= r13) goto L_0x00c6
            int r10 = r12.f5323b
            int r13 = r12.f5325d
            int r10 = r10 + r13
            int r13 = r11.f5323b
            int r10 = r10 - r13
            android.support.v7.widget.aj$a r13 = r1.f5118a
            int r14 = r11.f5323b
            int r14 = r14 + r4
            android.support.v7.widget.d$b r9 = r13.mo5513a(r6, r14, r10, r9)
            int r4 = r11.f5323b
            int r6 = r12.f5323b
            int r4 = r4 - r6
            r12.f5325d = r4
        L_0x00c6:
            if (r5 == 0) goto L_0x00d5
            r2.set(r3, r12)
            r2.remove(r7)
            android.support.v7.widget.aj$a r3 = r1.f5118a
            r3.mo5514a(r11)
            goto L_0x0006
        L_0x00d5:
            if (r8 == 0) goto L_0x010e
            if (r9 == 0) goto L_0x00f3
            int r4 = r11.f5323b
            int r5 = r9.f5323b
            if (r4 <= r5) goto L_0x00e6
            int r4 = r11.f5323b
            int r5 = r9.f5325d
            int r4 = r4 - r5
            r11.f5323b = r4
        L_0x00e6:
            int r4 = r11.f5325d
            int r5 = r9.f5323b
            if (r4 <= r5) goto L_0x00f3
            int r4 = r11.f5325d
            int r5 = r9.f5325d
            int r4 = r4 - r5
            r11.f5325d = r4
        L_0x00f3:
            int r4 = r11.f5323b
            int r5 = r12.f5323b
            if (r4 <= r5) goto L_0x0100
            int r4 = r11.f5323b
            int r5 = r12.f5325d
            int r4 = r4 - r5
            r11.f5323b = r4
        L_0x0100:
            int r4 = r11.f5325d
            int r5 = r12.f5323b
            if (r4 <= r5) goto L_0x0144
            int r4 = r11.f5325d
            int r5 = r12.f5325d
            int r4 = r4 - r5
            r11.f5325d = r4
            goto L_0x0144
        L_0x010e:
            if (r9 == 0) goto L_0x012a
            int r4 = r11.f5323b
            int r5 = r9.f5323b
            if (r4 < r5) goto L_0x011d
            int r4 = r11.f5323b
            int r5 = r9.f5325d
            int r4 = r4 - r5
            r11.f5323b = r4
        L_0x011d:
            int r4 = r11.f5325d
            int r5 = r9.f5323b
            if (r4 < r5) goto L_0x012a
            int r4 = r11.f5325d
            int r5 = r9.f5325d
            int r4 = r4 - r5
            r11.f5325d = r4
        L_0x012a:
            int r4 = r11.f5323b
            int r5 = r12.f5323b
            if (r4 < r5) goto L_0x0137
            int r4 = r11.f5323b
            int r5 = r12.f5325d
            int r4 = r4 - r5
            r11.f5323b = r4
        L_0x0137:
            int r4 = r11.f5325d
            int r5 = r12.f5323b
            if (r4 < r5) goto L_0x0144
            int r4 = r11.f5325d
            int r5 = r12.f5325d
            int r4 = r4 - r5
            r11.f5325d = r4
        L_0x0144:
            r2.set(r3, r12)
            int r4 = r11.f5323b
            int r5 = r11.f5325d
            if (r4 == r5) goto L_0x0151
            r2.set(r7, r11)
            goto L_0x0154
        L_0x0151:
            r2.remove(r7)
        L_0x0154:
            if (r9 == 0) goto L_0x0006
            r2.add(r3, r9)
            goto L_0x0006
        L_0x015b:
            int r4 = r11.f5325d
            int r6 = r12.f5323b
            if (r4 >= r6) goto L_0x0163
            r5 = -1
            goto L_0x0164
        L_0x0163:
            r5 = 0
        L_0x0164:
            int r4 = r11.f5323b
            int r6 = r12.f5323b
            if (r4 >= r6) goto L_0x016c
            int r5 = r5 + 1
        L_0x016c:
            int r4 = r12.f5323b
            int r6 = r11.f5323b
            if (r4 > r6) goto L_0x0179
            int r4 = r11.f5323b
            int r6 = r12.f5325d
            int r4 = r4 + r6
            r11.f5323b = r4
        L_0x0179:
            int r4 = r12.f5323b
            int r6 = r11.f5325d
            if (r4 > r6) goto L_0x0186
            int r4 = r11.f5325d
            int r6 = r12.f5325d
            int r4 = r4 + r6
            r11.f5325d = r4
        L_0x0186:
            int r4 = r12.f5323b
            int r4 = r4 + r5
            r12.f5323b = r4
            r2.set(r3, r12)
            r2.set(r7, r11)
            goto L_0x0006
        L_0x0193:
            int r5 = r11.f5325d
            int r6 = r12.f5323b
            if (r5 >= r6) goto L_0x019f
            int r5 = r12.f5323b
            int r5 = r5 - r4
            r12.f5323b = r5
            goto L_0x01b8
        L_0x019f:
            int r5 = r11.f5325d
            int r6 = r12.f5323b
            int r8 = r12.f5325d
            int r6 = r6 + r8
            if (r5 >= r6) goto L_0x01b8
            int r5 = r12.f5325d
            int r5 = r5 - r4
            r12.f5325d = r5
            android.support.v7.widget.aj$a r5 = r1.f5118a
            int r6 = r11.f5323b
            java.lang.Object r8 = r12.f5324c
            android.support.v7.widget.d$b r5 = r5.mo5513a(r10, r6, r4, r8)
            goto L_0x01b9
        L_0x01b8:
            r5 = r9
        L_0x01b9:
            int r6 = r11.f5323b
            int r8 = r12.f5323b
            if (r6 > r8) goto L_0x01c5
            int r6 = r12.f5323b
            int r6 = r6 + r4
            r12.f5323b = r6
            goto L_0x01e6
        L_0x01c5:
            int r6 = r11.f5323b
            int r8 = r12.f5323b
            int r13 = r12.f5325d
            int r8 = r8 + r13
            if (r6 >= r8) goto L_0x01e6
            int r6 = r12.f5323b
            int r8 = r12.f5325d
            int r6 = r6 + r8
            int r8 = r11.f5323b
            int r6 = r6 - r8
            android.support.v7.widget.aj$a r8 = r1.f5118a
            int r9 = r11.f5323b
            int r9 = r9 + r4
            java.lang.Object r4 = r12.f5324c
            android.support.v7.widget.d$b r9 = r8.mo5513a(r10, r9, r6, r4)
            int r4 = r12.f5325d
            int r4 = r4 - r6
            r12.f5325d = r4
        L_0x01e6:
            r2.set(r7, r11)
            int r4 = r12.f5325d
            if (r4 <= 0) goto L_0x01f1
            r2.set(r3, r12)
            goto L_0x01f9
        L_0x01f1:
            r2.remove(r3)
            android.support.v7.widget.aj$a r4 = r1.f5118a
            r4.mo5514a(r12)
        L_0x01f9:
            if (r5 == 0) goto L_0x01fe
            r2.add(r3, r5)
        L_0x01fe:
            if (r9 == 0) goto L_0x0006
            r2.add(r3, r9)
            goto L_0x0006
        L_0x0205:
            java.util.ArrayList<android.support.v7.widget.d$b> r1 = r0.f5314a
            int r1 = r1.size()
            r2 = 0
        L_0x020c:
            if (r2 >= r1) goto L_0x02e1
            java.util.ArrayList<android.support.v7.widget.d$b> r3 = r0.f5314a
            java.lang.Object r3 = r3.get(r2)
            android.support.v7.widget.d$b r3 = (android.support.p043v7.widget.C1475d.C1477b) r3
            int r11 = r3.f5322a
            if (r11 == r10) goto L_0x0280
            if (r11 == r7) goto L_0x027c
            switch(r11) {
                case 1: goto L_0x0278;
                case 2: goto L_0x0221;
                default: goto L_0x021f;
            }
        L_0x021f:
            goto L_0x02d4
        L_0x0221:
            int r11 = r3.f5323b
            int r12 = r3.f5323b
            int r13 = r3.f5325d
            int r12 = r12 + r13
            int r13 = r3.f5323b
            r14 = 0
            r15 = -1
        L_0x022c:
            if (r13 >= r12) goto L_0x0263
            android.support.v7.widget.d$a r5 = r0.f5316c
            android.support.v7.widget.RecyclerView$v r5 = r5.mo4941a(r13)
            if (r5 != 0) goto L_0x024b
            boolean r5 = r0.m5162d(r13)
            if (r5 == 0) goto L_0x023d
            goto L_0x024b
        L_0x023d:
            if (r15 != r4) goto L_0x0248
            android.support.v7.widget.d$b r5 = r0.mo5513a(r6, r11, r14, r9)
            r0.m5161c(r5)
            r5 = 1
            goto L_0x0249
        L_0x0248:
            r5 = 0
        L_0x0249:
            r15 = 0
            goto L_0x0258
        L_0x024b:
            if (r15 != 0) goto L_0x0256
            android.support.v7.widget.d$b r5 = r0.mo5513a(r6, r11, r14, r9)
            r0.m5160b(r5)
            r5 = 1
            goto L_0x0257
        L_0x0256:
            r5 = 0
        L_0x0257:
            r15 = 1
        L_0x0258:
            if (r5 == 0) goto L_0x025e
            int r13 = r13 - r14
            int r12 = r12 - r14
            r14 = 1
            goto L_0x0261
        L_0x025e:
            int r5 = r14 + 1
            r14 = r5
        L_0x0261:
            int r13 = r13 + r4
            goto L_0x022c
        L_0x0263:
            int r5 = r3.f5325d
            if (r14 == r5) goto L_0x026e
            r0.mo5514a(r3)
            android.support.v7.widget.d$b r3 = r0.mo5513a(r6, r11, r14, r9)
        L_0x026e:
            if (r15 != 0) goto L_0x0274
            r0.m5160b(r3)
            goto L_0x02d4
        L_0x0274:
            r0.m5161c(r3)
            goto L_0x02d4
        L_0x0278:
            r0.m5161c(r3)
            goto L_0x02d4
        L_0x027c:
            r0.m5161c(r3)
            goto L_0x02d4
        L_0x0280:
            int r5 = r3.f5323b
            int r11 = r3.f5323b
            int r12 = r3.f5325d
            int r11 = r11 + r12
            int r12 = r3.f5323b
            r14 = r5
            r5 = 0
            r13 = -1
        L_0x028c:
            if (r12 >= r11) goto L_0x02be
            android.support.v7.widget.d$a r15 = r0.f5316c
            android.support.v7.widget.RecyclerView$v r15 = r15.mo4941a(r12)
            if (r15 != 0) goto L_0x02ac
            boolean r15 = r0.m5162d(r12)
            if (r15 == 0) goto L_0x029d
            goto L_0x02ac
        L_0x029d:
            if (r13 != r4) goto L_0x02aa
            java.lang.Object r13 = r3.f5324c
            android.support.v7.widget.d$b r5 = r0.mo5513a(r10, r14, r5, r13)
            r0.m5161c(r5)
            r14 = r12
            r5 = 0
        L_0x02aa:
            r13 = 0
            goto L_0x02ba
        L_0x02ac:
            if (r13 != 0) goto L_0x02b9
            java.lang.Object r13 = r3.f5324c
            android.support.v7.widget.d$b r5 = r0.mo5513a(r10, r14, r5, r13)
            r0.m5160b(r5)
            r14 = r12
            r5 = 0
        L_0x02b9:
            r13 = 1
        L_0x02ba:
            int r5 = r5 + r4
            int r12 = r12 + 1
            goto L_0x028c
        L_0x02be:
            int r11 = r3.f5325d
            if (r5 == r11) goto L_0x02cb
            java.lang.Object r11 = r3.f5324c
            r0.mo5514a(r3)
            android.support.v7.widget.d$b r3 = r0.mo5513a(r10, r14, r5, r11)
        L_0x02cb:
            if (r13 != 0) goto L_0x02d1
            r0.m5160b(r3)
            goto L_0x02d4
        L_0x02d1:
            r0.m5161c(r3)
        L_0x02d4:
            java.lang.Runnable r3 = r0.f5317d
            if (r3 == 0) goto L_0x02dd
            java.lang.Runnable r3 = r0.f5317d
            r3.run()
        L_0x02dd:
            int r2 = r2 + 1
            goto L_0x020c
        L_0x02e1:
            java.util.ArrayList<android.support.v7.widget.d$b> r1 = r0.f5314a
            r1.clear()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p043v7.widget.C1475d.mo5748b():void");
    }

    C1475d(C1476a aVar) {
        this(aVar, false);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final int mo5747b(int i) {
        return m5159b(i, 0);
    }

    /* renamed from: a */
    private void m5158a(List<C1477b> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            mo5514a((C1477b) list.get(i));
        }
        list.clear();
    }

    /* renamed from: c */
    private void m5161c(C1477b bVar) {
        this.f5315b.add(bVar);
        int i = bVar.f5322a;
        if (i == 4) {
            this.f5316c.mo4943a(bVar.f5323b, bVar.f5325d, bVar.f5324c);
        } else if (i != 8) {
            switch (i) {
                case 1:
                    this.f5316c.mo4947c(bVar.f5323b, bVar.f5325d);
                    return;
                case 2:
                    this.f5316c.mo4945b(bVar.f5323b, bVar.f5325d);
                    return;
                default:
                    StringBuilder sb = new StringBuilder("Unknown update op type for ");
                    sb.append(bVar);
                    throw new IllegalArgumentException(sb.toString());
            }
        } else {
            this.f5316c.mo4948d(bVar.f5323b, bVar.f5325d);
        }
    }

    /* renamed from: d */
    private boolean m5162d(int i) {
        int size = this.f5315b.size();
        for (int i2 = 0; i2 < size; i2++) {
            C1477b bVar = (C1477b) this.f5315b.get(i2);
            if (bVar.f5322a == 8) {
                if (m5159b(bVar.f5325d, i2 + 1) == i) {
                    return true;
                }
            } else if (bVar.f5322a == 1) {
                int i3 = bVar.f5323b + bVar.f5325d;
                for (int i4 = bVar.f5323b; i4 < i3; i4++) {
                    if (m5159b(i4, i2 + 1) == i) {
                        return true;
                    }
                }
                continue;
            } else {
                continue;
            }
        }
        return false;
    }

    /* renamed from: b */
    private void m5160b(C1477b bVar) {
        int i;
        boolean z;
        if (bVar.f5322a == 1 || bVar.f5322a == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int a = m5156a(bVar.f5323b, bVar.f5322a);
        int i2 = bVar.f5323b;
        int i3 = bVar.f5322a;
        if (i3 == 2) {
            i = 0;
        } else if (i3 == 4) {
            i = 1;
        } else {
            StringBuilder sb = new StringBuilder("op should be remove or update.");
            sb.append(bVar);
            throw new IllegalArgumentException(sb.toString());
        }
        int i4 = a;
        int i5 = i2;
        int i6 = 1;
        for (int i7 = 1; i7 < bVar.f5325d; i7++) {
            int a2 = m5156a(bVar.f5323b + (i * i7), bVar.f5322a);
            int i8 = bVar.f5322a;
            if (i8 == 2 ? a2 != i4 : !(i8 == 4 && a2 == i4 + 1)) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                i6++;
            } else {
                C1477b a3 = mo5513a(bVar.f5322a, i4, i6, bVar.f5324c);
                m5157a(a3, i5);
                mo5514a(a3);
                if (bVar.f5322a == 4) {
                    i5 += i6;
                }
                i4 = a2;
                i6 = 1;
            }
        }
        Object obj = bVar.f5324c;
        mo5514a(bVar);
        if (i6 > 0) {
            C1477b a4 = mo5513a(bVar.f5322a, i4, i6, obj);
            m5157a(a4, i5);
            mo5514a(a4);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0047, code lost:
        continue;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo5749c(int r6) {
        /*
            r5 = this;
            java.util.ArrayList<android.support.v7.widget.d$b> r0 = r5.f5314a
            int r0 = r0.size()
            r1 = 0
        L_0x0007:
            if (r1 >= r0) goto L_0x004a
            java.util.ArrayList<android.support.v7.widget.d$b> r2 = r5.f5314a
            java.lang.Object r2 = r2.get(r1)
            android.support.v7.widget.d$b r2 = (android.support.p043v7.widget.C1475d.C1477b) r2
            int r3 = r2.f5322a
            r4 = 8
            if (r3 == r4) goto L_0x0034
            switch(r3) {
                case 1: goto L_0x002c;
                case 2: goto L_0x001b;
                default: goto L_0x001a;
            }
        L_0x001a:
            goto L_0x0047
        L_0x001b:
            int r3 = r2.f5323b
            if (r3 > r6) goto L_0x0047
            int r3 = r2.f5323b
            int r4 = r2.f5325d
            int r3 = r3 + r4
            if (r3 <= r6) goto L_0x0028
            r6 = -1
            return r6
        L_0x0028:
            int r2 = r2.f5325d
            int r6 = r6 - r2
            goto L_0x0047
        L_0x002c:
            int r3 = r2.f5323b
            if (r3 > r6) goto L_0x0047
            int r2 = r2.f5325d
            int r6 = r6 + r2
            goto L_0x0047
        L_0x0034:
            int r3 = r2.f5323b
            if (r3 != r6) goto L_0x003b
            int r6 = r2.f5325d
            goto L_0x0047
        L_0x003b:
            int r3 = r2.f5323b
            if (r3 >= r6) goto L_0x0041
            int r6 = r6 + -1
        L_0x0041:
            int r2 = r2.f5325d
            if (r2 > r6) goto L_0x0047
            int r6 = r6 + 1
        L_0x0047:
            int r1 = r1 + 1
            goto L_0x0007
        L_0x004a:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p043v7.widget.C1475d.mo5749c(int):int");
    }

    /* renamed from: a */
    public final void mo5514a(C1477b bVar) {
        if (!this.f5318e) {
            bVar.f5324c = null;
            this.f5321h.release(bVar);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo5746a(int i) {
        if ((i & this.f5320g) != 0) {
            return true;
        }
        return false;
    }

    private C1475d(C1476a aVar, boolean z) {
        this.f5321h = new C0797b(30);
        this.f5314a = new ArrayList<>();
        this.f5315b = new ArrayList<>();
        this.f5320g = 0;
        this.f5316c = aVar;
        this.f5318e = false;
        this.f5319f = new C1420aj(this);
    }

    /* renamed from: a */
    private void m5157a(C1477b bVar, int i) {
        this.f5316c.mo4944a(bVar);
        int i2 = bVar.f5322a;
        if (i2 == 2) {
            this.f5316c.mo4942a(i, bVar.f5325d);
        } else if (i2 == 4) {
            this.f5316c.mo4943a(i, bVar.f5325d, bVar.f5324c);
        } else {
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        }
    }

    /* renamed from: b */
    private int m5159b(int i, int i2) {
        int size = this.f5315b.size();
        while (i2 < size) {
            C1477b bVar = (C1477b) this.f5315b.get(i2);
            if (bVar.f5322a == 8) {
                if (bVar.f5323b == i) {
                    i = bVar.f5325d;
                } else {
                    if (bVar.f5323b < i) {
                        i--;
                    }
                    if (bVar.f5325d <= i) {
                        i++;
                    }
                }
            } else if (bVar.f5323b > i) {
                continue;
            } else if (bVar.f5322a == 2) {
                if (i < bVar.f5323b + bVar.f5325d) {
                    return -1;
                }
                i -= bVar.f5325d;
            } else if (bVar.f5322a == 1) {
                i += bVar.f5325d;
            }
            i2++;
        }
        return i;
    }

    /* renamed from: a */
    private int m5156a(int i, int i2) {
        int i3;
        int i4;
        for (int size = this.f5315b.size() - 1; size >= 0; size--) {
            C1477b bVar = (C1477b) this.f5315b.get(size);
            if (bVar.f5322a == 8) {
                if (bVar.f5323b < bVar.f5325d) {
                    i4 = bVar.f5323b;
                    i3 = bVar.f5325d;
                } else {
                    i4 = bVar.f5325d;
                    i3 = bVar.f5323b;
                }
                if (i < i4 || i > i3) {
                    if (i < bVar.f5323b) {
                        if (i2 == 1) {
                            bVar.f5323b++;
                            bVar.f5325d++;
                        } else if (i2 == 2) {
                            bVar.f5323b--;
                            bVar.f5325d--;
                        }
                    }
                } else if (i4 == bVar.f5323b) {
                    if (i2 == 1) {
                        bVar.f5325d++;
                    } else if (i2 == 2) {
                        bVar.f5325d--;
                    }
                    i++;
                } else {
                    if (i2 == 1) {
                        bVar.f5323b++;
                    } else if (i2 == 2) {
                        bVar.f5323b--;
                    }
                    i--;
                }
            } else if (bVar.f5323b <= i) {
                if (bVar.f5322a == 1) {
                    i -= bVar.f5325d;
                } else if (bVar.f5322a == 2) {
                    i += bVar.f5325d;
                }
            } else if (i2 == 1) {
                bVar.f5323b++;
            } else if (i2 == 2) {
                bVar.f5323b--;
            }
        }
        for (int size2 = this.f5315b.size() - 1; size2 >= 0; size2--) {
            C1477b bVar2 = (C1477b) this.f5315b.get(size2);
            if (bVar2.f5322a == 8) {
                if (bVar2.f5325d == bVar2.f5323b || bVar2.f5325d < 0) {
                    this.f5315b.remove(size2);
                    mo5514a(bVar2);
                }
            } else if (bVar2.f5325d <= 0) {
                this.f5315b.remove(size2);
                mo5514a(bVar2);
            }
        }
        return i;
    }

    /* renamed from: a */
    public final C1477b mo5513a(int i, int i2, int i3, Object obj) {
        C1477b bVar = (C1477b) this.f5321h.acquire();
        if (bVar == null) {
            return new C1477b(i, i2, i3, obj);
        }
        bVar.f5322a = i;
        bVar.f5323b = i2;
        bVar.f5325d = i3;
        bVar.f5324c = obj;
        return bVar;
    }
}
