package android.support.p043v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.support.p030v4.view.p041a.C1008c;
import android.support.p030v4.view.p041a.C1008c.C1011c;
import android.support.p043v7.widget.RecyclerView.C1332i.C1335a;
import android.support.p043v7.widget.RecyclerView.C1343o;
import android.support.p043v7.widget.RecyclerView.C1349s;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.MarginLayoutParams;
import java.util.Arrays;

/* renamed from: android.support.v7.widget.GridLayoutManager */
public class GridLayoutManager extends LinearLayoutManager {

    /* renamed from: a */
    boolean f4520a;

    /* renamed from: b */
    public int f4521b = -1;

    /* renamed from: c */
    int[] f4522c;

    /* renamed from: d */
    View[] f4523d;

    /* renamed from: e */
    final SparseIntArray f4524e = new SparseIntArray();

    /* renamed from: f */
    final SparseIntArray f4525f = new SparseIntArray();

    /* renamed from: g */
    public C1302b f4526g = new C1301a();

    /* renamed from: h */
    final Rect f4527h = new Rect();

    /* renamed from: android.support.v7.widget.GridLayoutManager$LayoutParams */
    public static class LayoutParams extends android.support.p043v7.widget.RecyclerView.LayoutParams {

        /* renamed from: a */
        public int f4528a = -1;

        /* renamed from: b */
        public int f4529b;

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* renamed from: android.support.v7.widget.GridLayoutManager$a */
    public static final class C1301a extends C1302b {
        /* renamed from: a */
        public final int mo4690a(int i) {
            return 1;
        }

        /* renamed from: a */
        public final int mo4691a(int i, int i2) {
            return i % i2;
        }
    }

    /* renamed from: android.support.v7.widget.GridLayoutManager$b */
    public static abstract class C1302b {

        /* renamed from: a */
        final SparseIntArray f4530a = new SparseIntArray();

        /* renamed from: b */
        public boolean f4531b = false;

        /* renamed from: a */
        public abstract int mo4690a(int i);

        /* renamed from: a */
        public final void mo4692a() {
            this.f4530a.clear();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final int mo4693b(int i, int i2) {
            if (!this.f4531b) {
                return mo4691a(i, i2);
            }
            int i3 = this.f4530a.get(i, -1);
            if (i3 != -1) {
                return i3;
            }
            int a = mo4691a(i, i2);
            this.f4530a.put(i, a);
            return a;
        }

        /* renamed from: c */
        public final int mo4694c(int i, int i2) {
            int a = mo4690a(i);
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < i; i5++) {
                int a2 = mo4690a(i5);
                i3 += a2;
                if (i3 == i2) {
                    i4++;
                    i3 = 0;
                } else if (i3 > i2) {
                    i4++;
                    i3 = a2;
                }
            }
            if (i3 + a > i2) {
                return i4 + 1;
            }
            return i4;
        }

        /* JADX WARNING: Removed duplicated region for block: B:23:0x005a  */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x006c A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x006d A[RETURN] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int mo4691a(int r7, int r8) {
            /*
                r6 = this;
                int r0 = r6.mo4690a(r7)
                r1 = 0
                if (r0 != r8) goto L_0x0008
                return r1
            L_0x0008:
                boolean r2 = r6.f4531b
                if (r2 == 0) goto L_0x0056
                android.util.SparseIntArray r2 = r6.f4530a
                int r2 = r2.size()
                if (r2 <= 0) goto L_0x0056
                android.util.SparseIntArray r2 = r6.f4530a
                int r2 = r2.size()
                int r2 = r2 + -1
                r3 = r2
                r2 = 0
            L_0x001e:
                if (r2 > r3) goto L_0x0032
                int r4 = r2 + r3
                int r4 = r4 >>> 1
                android.util.SparseIntArray r5 = r6.f4530a
                int r5 = r5.keyAt(r4)
                if (r5 >= r7) goto L_0x002f
                int r2 = r4 + 1
                goto L_0x001e
            L_0x002f:
                int r3 = r4 + -1
                goto L_0x001e
            L_0x0032:
                int r2 = r2 + -1
                if (r2 < 0) goto L_0x0045
                android.util.SparseIntArray r3 = r6.f4530a
                int r3 = r3.size()
                if (r2 >= r3) goto L_0x0045
                android.util.SparseIntArray r3 = r6.f4530a
                int r2 = r3.keyAt(r2)
                goto L_0x0046
            L_0x0045:
                r2 = -1
            L_0x0046:
                if (r2 < 0) goto L_0x0056
                android.util.SparseIntArray r3 = r6.f4530a
                int r3 = r3.get(r2)
                int r4 = r6.mo4690a(r2)
                int r3 = r3 + r4
                int r2 = r2 + 1
                goto L_0x0058
            L_0x0056:
                r2 = 0
                r3 = 0
            L_0x0058:
                if (r2 >= r7) goto L_0x0069
                int r4 = r6.mo4690a(r2)
                int r3 = r3 + r4
                if (r3 != r8) goto L_0x0063
                r3 = 0
                goto L_0x0066
            L_0x0063:
                if (r3 <= r8) goto L_0x0066
                r3 = r4
            L_0x0066:
                int r2 = r2 + 1
                goto L_0x0058
            L_0x0069:
                int r0 = r0 + r3
                if (r0 > r8) goto L_0x006d
                return r3
            L_0x006d:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.p043v7.widget.GridLayoutManager.C1302b.mo4691a(int, int):int");
        }
    }

    /* renamed from: a */
    public final void mo4683a(boolean z) {
        if (!z) {
            super.mo4683a(false);
            return;
        }
        throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
    }

    /* renamed from: a */
    public final void mo4676a(C1343o oVar, C1349s sVar, View view, C1008c cVar) {
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof LayoutParams)) {
            super.mo5025a(view, cVar);
            return;
        }
        LayoutParams layoutParams2 = (LayoutParams) layoutParams;
        int a = m4089a(oVar, sVar, layoutParams2.bw_());
        if (this.f4552i == 0) {
            cVar.mo3134a((Object) C1011c.m2925a(layoutParams2.f4528a, layoutParams2.f4529b, a, 1, this.f4521b > 1 && layoutParams2.f4529b == this.f4521b, false));
        } else {
            cVar.mo3134a((Object) C1011c.m2925a(a, 1, layoutParams2.f4528a, layoutParams2.f4529b, this.f4521b > 1 && layoutParams2.f4529b == this.f4521b, false));
        }
    }

    /* renamed from: a */
    public final void mo4677a(C1349s sVar) {
        super.mo4677a(sVar);
        this.f4520a = false;
    }

    /* renamed from: a */
    public final void mo4680a(RecyclerView recyclerView, int i, int i2) {
        this.f4526g.mo4692a();
    }

    /* renamed from: a */
    public final void mo4679a(RecyclerView recyclerView) {
        this.f4526g.mo4692a();
    }

    /* renamed from: a */
    public final void mo4682a(RecyclerView recyclerView, int i, int i2, Object obj) {
        this.f4526g.mo4692a();
    }

    /* renamed from: a */
    public final void mo4681a(RecyclerView recyclerView, int i, int i2, int i3) {
        this.f4526g.mo4692a();
    }

    /* renamed from: a */
    public final android.support.p043v7.widget.RecyclerView.LayoutParams mo4669a(android.view.ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof MarginLayoutParams) {
            return new LayoutParams((MarginLayoutParams) layoutParams);
        }
        return new LayoutParams(layoutParams);
    }

    /* renamed from: a */
    public final void mo4673a(Rect rect, int i, int i2) {
        int i3;
        int i4;
        if (this.f4522c == null) {
            super.mo4673a(rect, i, i2);
        }
        int t = mo5063t() + mo5065v();
        int u = mo5064u() + mo5066w();
        if (this.f4552i == 1) {
            i4 = m4405a(i2, rect.height() + u, mo5015C());
            i3 = m4405a(i, this.f4522c[this.f4522c.length - 1] + t, mo5014B());
        } else {
            i3 = m4405a(i, rect.width() + t, mo5014B());
            i4 = m4405a(i2, this.f4522c[this.f4522c.length - 1] + u, mo5015C());
        }
        mo5046d(i3, i4);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo4674a(C1343o oVar, C1349s sVar, C1304a aVar, int i) {
        super.mo4674a(oVar, sVar, aVar, i);
        m4087F();
        if (sVar.mo5115a() > 0 && !sVar.f4798g) {
            boolean z = i == 1;
            int b = m4094b(oVar, sVar, aVar.f4568b);
            if (z) {
                while (b > 0 && aVar.f4568b > 0) {
                    aVar.f4568b--;
                    b = m4094b(oVar, sVar, aVar.f4568b);
                }
            } else {
                int a = sVar.mo5115a() - 1;
                int i2 = aVar.f4568b;
                while (i2 < a) {
                    int i3 = i2 + 1;
                    int b2 = m4094b(oVar, sVar, i3);
                    if (b2 <= b) {
                        break;
                    }
                    i2 = i3;
                    b = b2;
                }
                aVar.f4568b = i2;
            }
        }
        m4088G();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final View mo4670a(C1343o oVar, C1349s sVar, int i, int i2, int i3) {
        mo4748h();
        int b = this.f4553j.mo5518b();
        int c = this.f4553j.mo5520c();
        int i4 = i2 > i ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i != i2) {
            View g = mo5050g(i);
            int c2 = m4418c(g);
            if (c2 >= 0 && c2 < i3 && m4094b(oVar, sVar, c2) == 0) {
                if (((android.support.p043v7.widget.RecyclerView.LayoutParams) g.getLayoutParams()).bu_()) {
                    if (view2 == null) {
                        view2 = g;
                    }
                } else if (this.f4553j.mo5516a(g) < c && this.f4553j.mo5519b(g) >= b) {
                    return g;
                } else {
                    if (view == null) {
                        view = g;
                    }
                }
            }
            i += i4;
        }
        return view != null ? view : view2;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo4678a(C1349s sVar, C1306c cVar, C1335a aVar) {
        int i = this.f4521b;
        for (int i2 = 0; i2 < this.f4521b && cVar.mo4767a(sVar) && i > 0; i2++) {
            int i3 = cVar.f4579d;
            aVar.mo5075a(i3, Math.max(0, cVar.f4582g));
            i -= this.f4526g.mo4690a(i3);
            cVar.f4579d += cVar.f4580e;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo4675a(C1343o oVar, C1349s sVar, C1306c cVar, C1305b bVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z;
        C1343o oVar2 = oVar;
        C1349s sVar2 = sVar;
        C1306c cVar2 = cVar;
        C1305b bVar2 = bVar;
        int h = this.f4553j.mo5529h();
        boolean z2 = h != 1073741824;
        int i7 = mo5062s() > 0 ? this.f4522c[this.f4521b] : 0;
        if (z2) {
            m4087F();
        }
        boolean z3 = cVar2.f4580e == 1;
        int i8 = this.f4521b;
        if (!z3) {
            i8 = m4094b(oVar2, sVar2, cVar2.f4579d) + m4095c(oVar2, sVar2, cVar2.f4579d);
        }
        int i9 = 0;
        int i10 = 0;
        while (i10 < this.f4521b && cVar2.mo4767a(sVar2) && i8 > 0) {
            int i11 = cVar2.f4579d;
            int c = m4095c(oVar2, sVar2, i11);
            if (c <= this.f4521b) {
                i8 -= c;
                if (i8 < 0) {
                    break;
                }
                View a = cVar2.mo4765a(oVar2);
                if (a == null) {
                    break;
                }
                i9 += c;
                this.f4523d[i10] = a;
                i10++;
            } else {
                StringBuilder sb = new StringBuilder("Item at position ");
                sb.append(i11);
                sb.append(" requires ");
                sb.append(c);
                sb.append(" spans but GridLayoutManager has only ");
                sb.append(this.f4521b);
                sb.append(" spans.");
                throw new IllegalArgumentException(sb.toString());
            }
        }
        if (i10 == 0) {
            bVar2.f4573b = true;
            return;
        }
        float f = 0.0f;
        int i12 = i10;
        m4090a(oVar, sVar, i10, i9, z3);
        int i13 = 0;
        for (int i14 = 0; i14 < i12; i14++) {
            View view = this.f4523d[i14];
            if (cVar2.f4586k != null) {
                z = false;
                if (z3) {
                    mo5023a(view);
                } else {
                    mo5024a(view, 0);
                }
            } else if (z3) {
                mo5037b(view);
                z = false;
            } else {
                z = false;
                mo5038b(view, 0);
            }
            mo5039b(view, this.f4527h);
            m4092a(view, h, z);
            int e = this.f4553j.mo5525e(view);
            if (e > i13) {
                i13 = e;
            }
            float f2 = (((float) this.f4553j.mo5527f(view)) * 1.0f) / ((float) ((LayoutParams) view.getLayoutParams()).f4529b);
            if (f2 > f) {
                f = f2;
            }
        }
        if (z2) {
            m4097k(Math.max(Math.round(f * ((float) this.f4521b)), i7));
            i13 = 0;
            for (int i15 = 0; i15 < i12; i15++) {
                View view2 = this.f4523d[i15];
                m4092a(view2, 1073741824, true);
                int e2 = this.f4553j.mo5525e(view2);
                if (e2 > i13) {
                    i13 = e2;
                }
            }
        }
        for (int i16 = 0; i16 < i12; i16++) {
            View view3 = this.f4523d[i16];
            if (this.f4553j.mo5525e(view3) != i13) {
                LayoutParams layoutParams = (LayoutParams) view3.getLayoutParams();
                Rect rect = layoutParams.f4722d;
                int i17 = rect.top + rect.bottom + layoutParams.topMargin + layoutParams.bottomMargin;
                int i18 = rect.left + rect.right + layoutParams.leftMargin + layoutParams.rightMargin;
                int e3 = m4096e(layoutParams.f4528a, layoutParams.f4529b);
                if (this.f4552i == 1) {
                    i6 = m4406a(e3, 1073741824, i18, layoutParams.width, false);
                    i5 = MeasureSpec.makeMeasureSpec(i13 - i17, 1073741824);
                } else {
                    int makeMeasureSpec = MeasureSpec.makeMeasureSpec(i13 - i18, 1073741824);
                    i5 = m4406a(e3, 1073741824, i17, layoutParams.height, false);
                    i6 = makeMeasureSpec;
                }
                m4091a(view3, i6, i5, true);
            }
        }
        bVar2.f4572a = i13;
        if (this.f4552i == 1) {
            if (cVar2.f4581f == -1) {
                int i19 = cVar2.f4577b;
                i = i19;
                i2 = i19 - i13;
            } else {
                int i20 = cVar2.f4577b;
                i2 = i20;
                i = i13 + i20;
            }
            i4 = 0;
            i3 = 0;
        } else if (cVar2.f4581f == -1) {
            int i21 = cVar2.f4577b;
            i2 = 0;
            i = 0;
            int i22 = i21 - i13;
            i3 = i21;
            i4 = i22;
        } else {
            i4 = cVar2.f4577b;
            i3 = i13 + i4;
            i2 = 0;
            i = 0;
        }
        for (int i23 = 0; i23 < i12; i23++) {
            View view4 = this.f4523d[i23];
            LayoutParams layoutParams2 = (LayoutParams) view4.getLayoutParams();
            if (this.f4552i != 1) {
                i2 = mo5064u() + this.f4522c[layoutParams2.f4528a];
                i = this.f4553j.mo5527f(view4) + i2;
            } else if (mo4747g()) {
                int t = mo5063t() + this.f4522c[this.f4521b - layoutParams2.f4528a];
                i3 = t;
                i4 = t - this.f4553j.mo5527f(view4);
            } else {
                i4 = mo5063t() + this.f4522c[layoutParams2.f4528a];
                i3 = this.f4553j.mo5527f(view4) + i4;
            }
            m4416b(view4, i4, i2, i3, i);
            if (layoutParams2.bu_() || layoutParams2.bv_()) {
                bVar2.f4574c = true;
            }
            bVar2.f4575d = view4.hasFocusable() | bVar2.f4575d;
        }
        Arrays.fill(this.f4523d, null);
    }

    /* renamed from: a */
    public final void mo4672a(int i) {
        if (i != this.f4521b) {
            this.f4520a = true;
            if (i > 0) {
                this.f4521b = i;
                this.f4526g.mo4692a();
                mo5057n();
                return;
            }
            StringBuilder sb = new StringBuilder("Span count should be at least 1. Provided ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00d6, code lost:
        if (r13 == (r2 > r8)) goto L_0x00b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00f3, code lost:
        if (r13 == r14) goto L_0x00b9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0102  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View mo4671a(android.view.View r26, int r27, android.support.p043v7.widget.RecyclerView.C1343o r28, android.support.p043v7.widget.RecyclerView.C1349s r29) {
        /*
            r25 = this;
            r0 = r25
            r1 = r28
            r2 = r29
            android.view.View r3 = r25.mo5045d(r26)
            r4 = 0
            if (r3 != 0) goto L_0x000e
            return r4
        L_0x000e:
            android.view.ViewGroup$LayoutParams r5 = r3.getLayoutParams()
            android.support.v7.widget.GridLayoutManager$LayoutParams r5 = (android.support.p043v7.widget.GridLayoutManager.LayoutParams) r5
            int r6 = r5.f4528a
            int r7 = r5.f4528a
            int r5 = r5.f4529b
            int r7 = r7 + r5
            android.view.View r5 = super.mo4671a(r26, r27, r28, r29)
            if (r5 != 0) goto L_0x0022
            return r4
        L_0x0022:
            r5 = r27
            int r5 = r0.mo4743f(r5)
            r9 = 1
            if (r5 != r9) goto L_0x002d
            r5 = 1
            goto L_0x002e
        L_0x002d:
            r5 = 0
        L_0x002e:
            boolean r10 = r0.f4555l
            if (r5 == r10) goto L_0x0034
            r5 = 1
            goto L_0x0035
        L_0x0034:
            r5 = 0
        L_0x0035:
            r10 = -1
            if (r5 == 0) goto L_0x0040
            int r5 = r25.mo5062s()
            int r5 = r5 - r9
            r11 = -1
            r12 = -1
            goto L_0x0047
        L_0x0040:
            int r5 = r25.mo5062s()
            r11 = r5
            r5 = 0
            r12 = 1
        L_0x0047:
            int r13 = r0.f4552i
            if (r13 != r9) goto L_0x0053
            boolean r13 = r25.mo4747g()
            if (r13 == 0) goto L_0x0053
            r13 = 1
            goto L_0x0054
        L_0x0053:
            r13 = 0
        L_0x0054:
            int r14 = r0.m4089a(r1, r2, r5)
            r10 = r4
            r8 = -1
            r15 = 0
            r17 = 0
            r18 = -1
        L_0x005f:
            if (r5 == r11) goto L_0x0140
            int r9 = r0.m4089a(r1, r2, r5)
            android.view.View r1 = r0.mo5050g(r5)
            if (r1 == r3) goto L_0x0140
            boolean r20 = r1.hasFocusable()
            if (r20 == 0) goto L_0x0085
            if (r9 == r14) goto L_0x0085
            if (r4 == 0) goto L_0x0077
            goto L_0x0140
        L_0x0077:
            r21 = r3
            r23 = r8
            r22 = r11
            r24 = r14
            r8 = r17
            r11 = r18
            goto L_0x012c
        L_0x0085:
            android.view.ViewGroup$LayoutParams r9 = r1.getLayoutParams()
            android.support.v7.widget.GridLayoutManager$LayoutParams r9 = (android.support.p043v7.widget.GridLayoutManager.LayoutParams) r9
            int r2 = r9.f4528a
            r21 = r3
            int r3 = r9.f4528a
            r22 = r11
            int r11 = r9.f4529b
            int r3 = r3 + r11
            boolean r11 = r1.hasFocusable()
            if (r11 == 0) goto L_0x00a1
            if (r2 != r6) goto L_0x00a1
            if (r3 != r7) goto L_0x00a1
            return r1
        L_0x00a1:
            boolean r11 = r1.hasFocusable()
            if (r11 == 0) goto L_0x00a9
            if (r4 == 0) goto L_0x00b1
        L_0x00a9:
            boolean r11 = r1.hasFocusable()
            if (r11 != 0) goto L_0x00bc
            if (r10 != 0) goto L_0x00bc
        L_0x00b1:
            r23 = r8
            r24 = r14
            r8 = r17
        L_0x00b7:
            r11 = r18
        L_0x00b9:
            r19 = 1
            goto L_0x0100
        L_0x00bc:
            int r11 = java.lang.Math.max(r2, r6)
            int r20 = java.lang.Math.min(r3, r7)
            int r11 = r20 - r11
            boolean r20 = r1.hasFocusable()
            if (r20 == 0) goto L_0x00d9
            if (r11 <= r15) goto L_0x00cf
            goto L_0x00b1
        L_0x00cf:
            if (r11 != r15) goto L_0x00f6
            if (r2 <= r8) goto L_0x00d5
            r11 = 1
            goto L_0x00d6
        L_0x00d5:
            r11 = 0
        L_0x00d6:
            if (r13 != r11) goto L_0x00f6
            goto L_0x00b1
        L_0x00d9:
            if (r4 != 0) goto L_0x00f6
            r23 = r8
            r24 = r14
            r8 = 1
            r14 = 0
            boolean r16 = r0.mo5030a(r1, r14, r8)
            if (r16 == 0) goto L_0x00fa
            r8 = r17
            if (r11 <= r8) goto L_0x00ec
            goto L_0x00b7
        L_0x00ec:
            if (r11 != r8) goto L_0x00fc
            r11 = r18
            if (r2 <= r11) goto L_0x00f3
            r14 = 1
        L_0x00f3:
            if (r13 != r14) goto L_0x00fe
            goto L_0x00b9
        L_0x00f6:
            r23 = r8
            r24 = r14
        L_0x00fa:
            r8 = r17
        L_0x00fc:
            r11 = r18
        L_0x00fe:
            r19 = 0
        L_0x0100:
            if (r19 == 0) goto L_0x012c
            boolean r14 = r1.hasFocusable()
            if (r14 == 0) goto L_0x011b
            int r4 = r9.f4528a
            int r3 = java.lang.Math.min(r3, r7)
            int r2 = java.lang.Math.max(r2, r6)
            int r3 = r3 - r2
            r15 = r3
            r17 = r8
            r18 = r11
            r8 = r4
            r4 = r1
            goto L_0x0132
        L_0x011b:
            int r8 = r9.f4528a
            int r3 = java.lang.Math.min(r3, r7)
            int r2 = java.lang.Math.max(r2, r6)
            int r3 = r3 - r2
            r10 = r1
            r17 = r3
            r18 = r8
            goto L_0x0130
        L_0x012c:
            r17 = r8
            r18 = r11
        L_0x0130:
            r8 = r23
        L_0x0132:
            int r5 = r5 + r12
            r3 = r21
            r11 = r22
            r14 = r24
            r1 = r28
            r2 = r29
            r9 = 1
            goto L_0x005f
        L_0x0140:
            if (r4 == 0) goto L_0x0143
            return r4
        L_0x0143:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p043v7.widget.GridLayoutManager.mo4671a(android.view.View, int, android.support.v7.widget.RecyclerView$o, android.support.v7.widget.RecyclerView$s):android.view.View");
    }

    public final boolean bs_() {
        if (this.f4561r != null || this.f4520a) {
            return false;
        }
        return true;
    }

    /* renamed from: G */
    private void m4088G() {
        if (this.f4523d == null || this.f4523d.length != this.f4521b) {
            this.f4523d = new View[this.f4521b];
        }
    }

    /* renamed from: F */
    private void m4087F() {
        int i;
        if (this.f4552i == 1) {
            i = (this.f4745I - mo5065v()) - mo5063t();
        } else {
            i = (this.f4746J - mo5066w()) - mo5064u();
        }
        m4097k(i);
    }

    /* renamed from: a */
    public final android.support.p043v7.widget.RecyclerView.LayoutParams mo4667a() {
        if (this.f4552i == 0) {
            return new LayoutParams(-2, -1);
        }
        return new LayoutParams(-1, -2);
    }

    /* renamed from: a */
    public final boolean mo4684a(android.support.p043v7.widget.RecyclerView.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    /* renamed from: k */
    private void m4097k(int i) {
        this.f4522c = m4093a(this.f4522c, this.f4521b, i);
    }

    /* renamed from: a */
    public final android.support.p043v7.widget.RecyclerView.LayoutParams mo4668a(Context context, AttributeSet attributeSet) {
        return new LayoutParams(context, attributeSet);
    }

    /* renamed from: b */
    public final int mo4686b(C1343o oVar, C1349s sVar) {
        if (this.f4552i == 1) {
            return this.f4521b;
        }
        if (sVar.mo5115a() <= 0) {
            return 0;
        }
        return m4089a(oVar, sVar, sVar.mo5115a() - 1) + 1;
    }

    public GridLayoutManager(Context context, int i) {
        super(context);
        mo4672a(i);
    }

    /* renamed from: e */
    private int m4096e(int i, int i2) {
        if (this.f4552i != 1 || !mo4747g()) {
            return this.f4522c[i2 + i] - this.f4522c[i];
        }
        return this.f4522c[this.f4521b - i] - this.f4522c[(this.f4521b - i) - i2];
    }

    /* renamed from: c */
    public void mo4689c(C1343o oVar, C1349s sVar) {
        if (sVar.f4798g) {
            int s = mo5062s();
            for (int i = 0; i < s; i++) {
                LayoutParams layoutParams = (LayoutParams) mo5050g(i).getLayoutParams();
                int bw_ = layoutParams.bw_();
                this.f4524e.put(bw_, layoutParams.f4529b);
                this.f4525f.put(bw_, layoutParams.f4528a);
            }
        }
        super.mo4689c(oVar, sVar);
        this.f4524e.clear();
        this.f4525f.clear();
    }

    /* renamed from: a */
    public final int mo4666a(C1343o oVar, C1349s sVar) {
        if (this.f4552i == 0) {
            return this.f4521b;
        }
        if (sVar.mo5115a() <= 0) {
            return 0;
        }
        return m4089a(oVar, sVar, sVar.mo5115a() - 1) + 1;
    }

    /* renamed from: b */
    public final void mo4687b(RecyclerView recyclerView, int i, int i2) {
        this.f4526g.mo4692a();
    }

    /* renamed from: a */
    public int mo4665a(int i, C1343o oVar, C1349s sVar) {
        m4087F();
        m4088G();
        return super.mo4665a(i, oVar, sVar);
    }

    /* renamed from: b */
    public int mo4685b(int i, C1343o oVar, C1349s sVar) {
        m4087F();
        m4088G();
        return super.mo4685b(i, oVar, sVar);
    }

    /* renamed from: a */
    private int m4089a(C1343o oVar, C1349s sVar, int i) {
        if (!sVar.f4798g) {
            return this.f4526g.mo4694c(i, this.f4521b);
        }
        int a = oVar.mo5089a(i);
        if (a == -1) {
            return 0;
        }
        return this.f4526g.mo4694c(a, this.f4521b);
    }

    /* renamed from: b */
    private int m4094b(C1343o oVar, C1349s sVar, int i) {
        if (!sVar.f4798g) {
            return this.f4526g.mo4693b(i, this.f4521b);
        }
        int i2 = this.f4525f.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int a = oVar.mo5089a(i);
        if (a == -1) {
            return 0;
        }
        return this.f4526g.mo4693b(a, this.f4521b);
    }

    /* renamed from: c */
    private int m4095c(C1343o oVar, C1349s sVar, int i) {
        if (!sVar.f4798g) {
            return this.f4526g.mo4690a(i);
        }
        int i2 = this.f4524e.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int a = oVar.mo5089a(i);
        if (a == -1) {
            return 1;
        }
        return this.f4526g.mo4690a(a);
    }

    /* renamed from: a */
    private void m4092a(View view, int i, boolean z) {
        int i2;
        int i3;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        Rect rect = layoutParams.f4722d;
        int i4 = rect.top + rect.bottom + layoutParams.topMargin + layoutParams.bottomMargin;
        int i5 = rect.left + rect.right + layoutParams.leftMargin + layoutParams.rightMargin;
        int e = m4096e(layoutParams.f4528a, layoutParams.f4529b);
        if (this.f4552i == 1) {
            i2 = m4406a(e, i, i5, layoutParams.width, false);
            i3 = m4406a(this.f4553j.mo5524e(), this.f4744H, i4, layoutParams.height, true);
        } else {
            int a = m4406a(e, i, i4, layoutParams.height, false);
            int a2 = m4406a(this.f4553j.mo5524e(), this.f4743G, i5, layoutParams.width, true);
            i3 = a;
            i2 = a2;
        }
        m4091a(view, i2, i3, z);
    }

    /* renamed from: a */
    private static int[] m4093a(int[] iArr, int i, int i2) {
        int i3;
        if (!(iArr != null && iArr.length == i + 1 && iArr[iArr.length - 1] == i2)) {
            iArr = new int[(i + 1)];
        }
        int i4 = 0;
        iArr[0] = 0;
        int i5 = i2 / i;
        int i6 = i2 % i;
        int i7 = 0;
        for (int i8 = 1; i8 <= i; i8++) {
            i4 += i6;
            if (i4 <= 0 || i - i4 >= i6) {
                i3 = i5;
            } else {
                i3 = i5 + 1;
                i4 -= i;
            }
            i7 += i3;
            iArr[i8] = i7;
        }
        return iArr;
    }

    public GridLayoutManager(Context context, int i, int i2, boolean z) {
        super(context, i2, z);
        mo4672a(i);
    }

    /* renamed from: a */
    private void m4091a(View view, int i, int i2, boolean z) {
        boolean z2;
        android.support.p043v7.widget.RecyclerView.LayoutParams layoutParams = (android.support.p043v7.widget.RecyclerView.LayoutParams) view.getLayoutParams();
        if (z) {
            z2 = mo5029a(view, i, i2, layoutParams);
        } else {
            z2 = mo5040b(view, i, i2, layoutParams);
        }
        if (z2) {
            view.measure(i, i2);
        }
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        mo4672a(m4407a(context, attributeSet, i, i2).f4758b);
    }

    /* renamed from: a */
    private void m4090a(C1343o oVar, C1349s sVar, int i, int i2, boolean z) {
        int i3;
        int i4;
        int i5 = -1;
        int i6 = 0;
        if (z) {
            i5 = i;
            i4 = 0;
            i3 = 1;
        } else {
            i4 = i - 1;
            i3 = -1;
        }
        while (i4 != i5) {
            View view = this.f4523d[i4];
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            layoutParams.f4529b = m4095c(oVar, sVar, m4418c(view));
            layoutParams.f4528a = i6;
            i6 += layoutParams.f4529b;
            i4 += i3;
        }
    }
}
