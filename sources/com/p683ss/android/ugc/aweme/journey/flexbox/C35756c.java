package com.p683ss.android.ugc.aweme.journey.flexbox;

import android.support.p030v4.view.C1043h;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.MarginLayoutParams;
import com.p683ss.android.ugc.aweme.main.experiment.pneumonia.DynamicTabYellowPointVersion;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.journey.flexbox.c */
class C35756c {

    /* renamed from: c */
    static final /* synthetic */ boolean f91838c = (!C35756c.class.desiredAssertionStatus());

    /* renamed from: a */
    int[] f91839a;

    /* renamed from: b */
    long[] f91840b;

    /* renamed from: d */
    private final C35754a f91841d;

    /* renamed from: e */
    private boolean[] f91842e;

    /* renamed from: f */
    private long[] f91843f;

    /* renamed from: com.ss.android.ugc.aweme.journey.flexbox.c$a */
    static class C35757a {

        /* renamed from: a */
        List<C35755b> f91844a;

        /* renamed from: b */
        int f91845b;

        C35757a() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo74416a() {
            this.f91844a = null;
            this.f91845b = 0;
        }
    }

    /* renamed from: a */
    static int m80856a(long j) {
        return (int) j;
    }

    /* renamed from: b */
    static int m80868b(long j) {
        return (int) (j >> 32);
    }

    /* renamed from: b */
    private static long m80872b(int i, int i2) {
        return (((long) i) & 4294967295L) | (((long) i2) << 32);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo74408a(C35757a aVar, int i, int i2, int i3, int i4, List<C35755b> list) {
        mo74407a(aVar, i, i2, i3, i4, -1, list);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo74411b(C35757a aVar, int i, int i2, int i3, int i4, List<C35755b> list) {
        mo74407a(aVar, i, i2, i3, 0, i4, list);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo74407a(C35757a aVar, int i, int i2, int i3, int i4, int i5, List<C35755b> list) {
        int i6;
        int i7;
        int i8;
        List<C35755b> list2;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        View view;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        C35755b bVar;
        C35757a aVar2 = aVar;
        int i21 = i;
        int i22 = i2;
        int i23 = i5;
        boolean i24 = this.f91841d.mo74374i();
        int mode = MeasureSpec.getMode(i);
        int size = MeasureSpec.getSize(i);
        List<C35755b> arrayList = list == null ? new ArrayList<>() : list;
        aVar2.f91844a = arrayList;
        boolean z = i23 == -1;
        int a = m80859a(i24);
        int b = m80871b(i24);
        int c = m80876c(i24);
        int d = m80878d(i24);
        C35755b bVar2 = new C35755b();
        int i25 = i4;
        bVar2.f91834o = i25;
        int i26 = b + a;
        bVar2.f91824e = i26;
        int b2 = this.f91841d.mo74368b();
        boolean z2 = z;
        int i27 = 0;
        int i28 = 0;
        int i29 = 0;
        int i30 = DynamicTabYellowPointVersion.DEFAULT;
        while (i6 < b2) {
            View a2 = this.f91841d.mo4672a(i6);
            if (a2 == null) {
                if (m80865a(i6, b2, bVar2)) {
                    m80864a(arrayList, bVar2, i6, i27);
                }
            } else if (a2.getVisibility() == 8) {
                bVar2.f91828i++;
                bVar2.f91827h++;
                if (m80865a(i6, b2, bVar2)) {
                    m80864a(arrayList, bVar2, i6, i27);
                }
            } else {
                FlexItem flexItem = (FlexItem) a2.getLayoutParams();
                int i31 = b2;
                if (flexItem.mo74353e() == 4) {
                    bVar2.f91833n.add(Integer.valueOf(i6));
                }
                int a3 = m80858a(flexItem, i24);
                if (flexItem.mo74359k() != -1.0f && mode == 1073741824) {
                    a3 = Math.round(((float) size) * flexItem.mo74359k());
                }
                if (i24) {
                    int a_ = this.f91841d.mo74367a_(i21, i26 + m80875c(flexItem, true) + m80877d(flexItem, true), a3);
                    i14 = size;
                    i13 = mode;
                    int b3 = this.f91841d.mo74369b(i22, c + d + m80879e(flexItem, true) + m80881f(flexItem, true) + i27, m80870b(flexItem, true));
                    a2.measure(a_, b3);
                    m80860a(i6, a_, b3, a2);
                    i15 = a_;
                } else {
                    i14 = size;
                    i13 = mode;
                    int a_2 = this.f91841d.mo74367a_(i22, c + d + m80879e(flexItem, false) + m80881f(flexItem, false) + i27, m80870b(flexItem, false));
                    int b4 = this.f91841d.mo74369b(i21, m80875c(flexItem, false) + i26 + m80877d(flexItem, false), a3);
                    a2.measure(a_2, b4);
                    m80860a(i6, a_2, b4, a2);
                    i15 = b4;
                }
                this.f91841d.mo74365a(i6, a2);
                m80862a(a2, i6);
                i28 = View.combineMeasuredStates(i28, a2.getMeasuredState());
                int i32 = i27;
                int i33 = i31;
                C35755b bVar3 = bVar2;
                int i34 = i26;
                int i35 = i6;
                View view2 = a2;
                list2 = arrayList;
                int i36 = i35;
                i8 = i14;
                int i37 = i15;
                i7 = i13;
                if (m80866a(a2, i13, i14, bVar2.f91824e, m80877d(flexItem, i24) + m80857a(a2, i24) + m80875c(flexItem, i24), flexItem, i35, i29, arrayList.size())) {
                    if (bVar3.mo74400a() > 0) {
                        if (i36 > 0) {
                            i20 = i36 - 1;
                            bVar = bVar3;
                        } else {
                            bVar = bVar3;
                            i20 = 0;
                        }
                        m80864a(list2, bVar, i20, i32);
                        i19 = bVar.f91826g + i32;
                    } else {
                        i19 = i32;
                    }
                    if (!i24) {
                        i6 = i36;
                        view = view2;
                        int i38 = i37;
                        i11 = i2;
                        if (flexItem.mo74349a() == -1) {
                            C35754a aVar3 = this.f91841d;
                            view.measure(aVar3.mo74367a_(i11, aVar3.mo74394t() + this.f91841d.mo74396v() + flexItem.mo74360l() + flexItem.mo74362n() + i19, flexItem.mo74349a()), i38);
                            m80862a(view, i6);
                        }
                    } else if (flexItem.mo74350b() == -1) {
                        C35754a aVar4 = this.f91841d;
                        i6 = i36;
                        i11 = i2;
                        view = view2;
                        view.measure(i37, aVar4.mo74369b(i11, aVar4.mo74395u() + this.f91841d.mo74397w() + flexItem.mo74361m() + flexItem.mo74363o() + i19, flexItem.mo74350b()));
                        m80862a(view, i6);
                    } else {
                        i6 = i36;
                        view = view2;
                        i11 = i2;
                    }
                    bVar2 = new C35755b();
                    bVar2.f91827h = 1;
                    i10 = i34;
                    bVar2.f91824e = i10;
                    bVar2.f91834o = i6;
                    i32 = i19;
                    i17 = 0;
                    i16 = DynamicTabYellowPointVersion.DEFAULT;
                } else {
                    i6 = i36;
                    bVar2 = bVar3;
                    i10 = i34;
                    view = view2;
                    i11 = i2;
                    bVar2.f91827h++;
                    i17 = i29 + 1;
                    i16 = i30;
                }
                bVar2.f91836q |= flexItem.mo74351c() != 0.0f;
                bVar2.f91837r |= flexItem.mo74352d() != 0.0f;
                if (this.f91839a != null) {
                    this.f91839a[i6] = list2.size();
                }
                bVar2.f91824e += m80857a(view, i24) + m80875c(flexItem, i24) + m80877d(flexItem, i24);
                bVar2.f91829j += flexItem.mo74351c();
                bVar2.f91830k += flexItem.mo74352d();
                this.f91841d.mo74366a(view, i6, i17, bVar2);
                int max = Math.max(i16, m80869b(view, i24) + m80879e(flexItem, i24) + m80881f(flexItem, i24) + this.f91841d.mo74371d_(view));
                bVar2.f91826g = Math.max(bVar2.f91826g, max);
                if (i24) {
                    if (this.f91841d.mo74372g() != 2) {
                        bVar2.f91831l = Math.max(bVar2.f91831l, view.getBaseline() + flexItem.mo74361m());
                    } else {
                        bVar2.f91831l = Math.max(bVar2.f91831l, (view.getMeasuredHeight() - view.getBaseline()) + flexItem.mo74363o());
                    }
                }
                i12 = i33;
                if (m80865a(i6, i12, bVar2)) {
                    m80864a(list2, bVar2, i6, i32);
                    i32 += bVar2.f91826g;
                }
                i9 = i5;
                if (i9 != -1 && list2.size() > 0) {
                    if (((C35755b) list2.get(list2.size() - 1)).f91835p >= i9 && i6 >= i9 && !z2) {
                        i18 = -bVar2.f91826g;
                        z2 = true;
                        if (i18 <= i3 && z2) {
                            break;
                        }
                        i29 = i17;
                        i30 = max;
                        i27 = i18;
                        i25 = i6 + 1;
                        b2 = i12;
                        i22 = i11;
                        i26 = i10;
                        arrayList = list2;
                        mode = i7;
                        C35757a aVar5 = aVar;
                        i21 = i;
                        i23 = i9;
                        size = i8;
                    }
                }
                i18 = i32;
                if (i18 <= i3) {
                }
                i29 = i17;
                i30 = max;
                i27 = i18;
                i25 = i6 + 1;
                b2 = i12;
                i22 = i11;
                i26 = i10;
                arrayList = list2;
                mode = i7;
                C35757a aVar52 = aVar;
                i21 = i;
                i23 = i9;
                size = i8;
            }
            int i39 = i3;
            i8 = size;
            i7 = mode;
            i11 = i22;
            i9 = i23;
            list2 = arrayList;
            i10 = i26;
            i12 = b2;
            i25 = i6 + 1;
            b2 = i12;
            i22 = i11;
            i26 = i10;
            arrayList = list2;
            mode = i7;
            C35757a aVar522 = aVar;
            i21 = i;
            i23 = i9;
            size = i8;
        }
        aVar.f91845b = i28;
    }

    /* renamed from: a */
    private boolean m80866a(View view, int i, int i2, int i3, int i4, FlexItem flexItem, int i5, int i6, int i7) {
        if (this.f91841d.mo74372g() == 0) {
            return false;
        }
        if (flexItem.mo74358j()) {
            return true;
        }
        if (i == 0) {
            return false;
        }
        int k = this.f91841d.mo74376k();
        if (k != -1 && k <= i7 + 1) {
            return false;
        }
        int a = this.f91841d.mo74364a(view, i5, i6);
        if (a > 0) {
            i4 += a;
        }
        if (i2 < i3 + i4) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m80865a(int i, int i2, C35755b bVar) {
        return i == i2 - 1 && bVar.mo74400a() != 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo74403a(int i, int i2) {
        mo74404a(i, i2, 0);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo74404a(int i, int i2, int i3) {
        int i4;
        int i5;
        m80880e(this.f91841d.mo74368b());
        if (i3 < this.f91841d.mo74368b()) {
            int c = this.f91841d.mo74370c();
            switch (this.f91841d.mo74370c()) {
                case 0:
                case 1:
                    int mode = MeasureSpec.getMode(i);
                    int size = MeasureSpec.getSize(i);
                    if (mode != 1073741824) {
                        size = this.f91841d.mo74375j();
                    }
                    i5 = this.f91841d.mo74394t() + this.f91841d.mo74396v();
                    break;
                case 2:
                case 3:
                    int mode2 = MeasureSpec.getMode(i2);
                    i4 = MeasureSpec.getSize(i2);
                    if (mode2 != 1073741824) {
                        i4 = this.f91841d.mo74375j();
                    }
                    i5 = this.f91841d.mo74395u() + this.f91841d.mo74397w();
                    break;
                default:
                    StringBuilder sb = new StringBuilder("Invalid flex direction: ");
                    sb.append(c);
                    throw new IllegalArgumentException(sb.toString());
            }
            int i6 = 0;
            if (this.f91839a != null) {
                i6 = this.f91839a[i3];
            }
            List l = this.f91841d.mo74377l();
            int size2 = l.size();
            for (int i7 = i6; i7 < size2; i7++) {
                C35755b bVar = (C35755b) l.get(i7);
                if (bVar.f91824e < i4 && bVar.f91836q) {
                    m80861a(i, i2, bVar, i4, i5, false);
                } else if (bVar.f91824e > i4 && bVar.f91837r) {
                    m80873b(i, i2, bVar, i4, i5, false);
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo74401a() {
        mo74402a(0);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo74402a(int i) {
        if (i < this.f91841d.mo74368b()) {
            int c = this.f91841d.mo74370c();
            if (this.f91841d.mo74373h() == 4) {
                List l = this.f91841d.mo74377l();
                int size = l.size();
                for (int i2 = this.f91839a != null ? this.f91839a[i] : 0; i2 < size; i2++) {
                    C35755b bVar = (C35755b) l.get(i2);
                    int i3 = bVar.f91827h;
                    for (int i4 = 0; i4 < i3; i4++) {
                        int i5 = bVar.f91834o + i4;
                        if (i4 < this.f91841d.mo74368b()) {
                            View a = this.f91841d.mo4672a(i5);
                            if (!(a == null || a.getVisibility() == 8)) {
                                FlexItem flexItem = (FlexItem) a.getLayoutParams();
                                if (flexItem.mo74353e() == -1 || flexItem.mo74353e() == 4) {
                                    switch (c) {
                                        case 0:
                                        case 1:
                                            m80863a(a, bVar.f91826g, i5);
                                            break;
                                        case 2:
                                        case 3:
                                            m80874b(a, bVar.f91826g, i5);
                                            break;
                                        default:
                                            StringBuilder sb = new StringBuilder("Invalid flex direction: ");
                                            sb.append(c);
                                            throw new IllegalArgumentException(sb.toString());
                                    }
                                }
                            }
                        }
                    }
                }
                return;
            }
            for (C35755b bVar2 : this.f91841d.mo74377l()) {
                Iterator it = bVar2.f91833n.iterator();
                while (true) {
                    if (it.hasNext()) {
                        Integer num = (Integer) it.next();
                        View a2 = this.f91841d.mo4672a(num.intValue());
                        switch (c) {
                            case 0:
                            case 1:
                                m80863a(a2, bVar2.f91826g, num.intValue());
                                break;
                            case 2:
                            case 3:
                                m80874b(a2, bVar2.f91826g, num.intValue());
                                break;
                            default:
                                StringBuilder sb2 = new StringBuilder("Invalid flex direction: ");
                                sb2.append(c);
                                throw new IllegalArgumentException(sb2.toString());
                        }
                    }
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo74405a(View view, C35755b bVar, int i, int i2, int i3, int i4) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int h = this.f91841d.mo74373h();
        if (flexItem.mo74353e() != -1) {
            h = flexItem.mo74353e();
        }
        int i5 = bVar.f91826g;
        switch (h) {
            case 0:
            case 4:
                if (this.f91841d.mo74372g() != 2) {
                    view.layout(i, i2 + flexItem.mo74361m(), i3, i4 + flexItem.mo74361m());
                    return;
                } else {
                    view.layout(i, i2 - flexItem.mo74363o(), i3, i4 - flexItem.mo74363o());
                    return;
                }
            case 1:
                if (this.f91841d.mo74372g() != 2) {
                    int i6 = i2 + i5;
                    view.layout(i, (i6 - view.getMeasuredHeight()) - flexItem.mo74363o(), i3, i6 - flexItem.mo74363o());
                    return;
                }
                view.layout(i, (i2 - i5) + view.getMeasuredHeight() + flexItem.mo74361m(), i3, (i4 - i5) + view.getMeasuredHeight() + flexItem.mo74361m());
                return;
            case 2:
                int measuredHeight = (((i5 - view.getMeasuredHeight()) + flexItem.mo74361m()) - flexItem.mo74363o()) / 2;
                if (this.f91841d.mo74372g() == 2) {
                    int i7 = i2 - measuredHeight;
                    view.layout(i, i7, i3, view.getMeasuredHeight() + i7);
                    break;
                } else {
                    int i8 = i2 + measuredHeight;
                    view.layout(i, i8, i3, view.getMeasuredHeight() + i8);
                    return;
                }
            case 3:
                if (this.f91841d.mo74372g() != 2) {
                    int max = Math.max(bVar.f91831l - view.getBaseline(), flexItem.mo74361m());
                    view.layout(i, i2 + max, i3, i4 + max);
                    return;
                }
                int max2 = Math.max((bVar.f91831l - view.getMeasuredHeight()) + view.getBaseline(), flexItem.mo74363o());
                view.layout(i, i2 - max2, i3, i4 - max2);
                return;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo74406a(View view, C35755b bVar, boolean z, int i, int i2, int i3, int i4) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int h = this.f91841d.mo74373h();
        if (flexItem.mo74353e() != -1) {
            h = flexItem.mo74353e();
        }
        int i5 = bVar.f91826g;
        switch (h) {
            case 0:
            case 3:
            case 4:
                if (!z) {
                    view.layout(i + flexItem.mo74360l(), i2, i3 + flexItem.mo74360l(), i4);
                    return;
                } else {
                    view.layout(i - flexItem.mo74362n(), i2, i3 - flexItem.mo74362n(), i4);
                    return;
                }
            case 1:
                if (!z) {
                    view.layout(((i + i5) - view.getMeasuredWidth()) - flexItem.mo74362n(), i2, ((i3 + i5) - view.getMeasuredWidth()) - flexItem.mo74362n(), i4);
                    return;
                } else {
                    view.layout((i - i5) + view.getMeasuredWidth() + flexItem.mo74360l(), i2, (i3 - i5) + view.getMeasuredWidth() + flexItem.mo74360l(), i4);
                    return;
                }
            case 2:
                MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
                int measuredWidth = (((i5 - view.getMeasuredWidth()) + C1043h.m2978a(marginLayoutParams)) - C1043h.m2980b(marginLayoutParams)) / 2;
                if (z) {
                    view.layout(i - measuredWidth, i2, i3 - measuredWidth, i4);
                    break;
                } else {
                    view.layout(i + measuredWidth, i2, i3 + measuredWidth, i4);
                    return;
                }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo74409a(List<C35755b> list, int i) {
        if (!f91838c && this.f91839a == null) {
            throw new AssertionError();
        } else if (f91838c || this.f91840b != null) {
            int i2 = this.f91839a[i];
            if (i2 == -1) {
                i2 = 0;
            }
            for (int size = list.size() - 1; size >= i2; size--) {
                list.remove(size);
            }
            int length = this.f91839a.length - 1;
            if (i > length) {
                Arrays.fill(this.f91839a, -1);
            } else {
                Arrays.fill(this.f91839a, i, length, -1);
            }
            int length2 = this.f91840b.length - 1;
            if (i > length2) {
                Arrays.fill(this.f91840b, 0);
            } else {
                Arrays.fill(this.f91840b, i, length2, 0);
            }
        } else {
            throw new AssertionError();
        }
    }

    C35756c(C35754a aVar) {
        this.f91841d = aVar;
    }

    /* renamed from: c */
    private int m80876c(boolean z) {
        if (z) {
            return this.f91841d.mo74395u();
        }
        return this.f91841d.mo74398x();
    }

    /* renamed from: d */
    private int m80878d(boolean z) {
        if (z) {
            return this.f91841d.mo74397w();
        }
        return this.f91841d.mo74399y();
    }

    /* renamed from: a */
    private int m80859a(boolean z) {
        if (z) {
            return this.f91841d.mo74398x();
        }
        return this.f91841d.mo74395u();
    }

    /* renamed from: b */
    private int m80871b(boolean z) {
        if (z) {
            return this.f91841d.mo74399y();
        }
        return this.f91841d.mo74397w();
    }

    /* renamed from: e */
    private void m80880e(int i) {
        if (this.f91842e == null) {
            if (i < 10) {
                i = 10;
            }
            this.f91842e = new boolean[i];
        } else if (this.f91842e.length < i) {
            int length = this.f91842e.length * 2;
            if (length >= i) {
                i = length;
            }
            this.f91842e = new boolean[i];
        } else {
            Arrays.fill(this.f91842e, false);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final void mo74412c(int i) {
        if (this.f91840b == null) {
            if (i < 10) {
                i = 10;
            }
            this.f91840b = new long[i];
            return;
        }
        if (this.f91840b.length < i) {
            int length = this.f91840b.length * 2;
            if (length >= i) {
                i = length;
            }
            this.f91840b = Arrays.copyOf(this.f91840b, i);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final void mo74414d(int i) {
        if (this.f91839a == null) {
            if (i < 10) {
                i = 10;
            }
            this.f91839a = new int[i];
            return;
        }
        if (this.f91839a.length < i) {
            int length = this.f91839a.length * 2;
            if (length >= i) {
                i = length;
            }
            this.f91839a = Arrays.copyOf(this.f91839a, i);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo74410b(int i) {
        if (this.f91843f == null) {
            if (i < 10) {
                i = 10;
            }
            this.f91843f = new long[i];
            return;
        }
        if (this.f91843f.length < i) {
            int length = this.f91843f.length * 2;
            if (length >= i) {
                i = length;
            }
            this.f91843f = Arrays.copyOf(this.f91843f, i);
        }
    }

    /* renamed from: a */
    private static int m80857a(View view, boolean z) {
        if (z) {
            return view.getMeasuredWidth();
        }
        return view.getMeasuredHeight();
    }

    /* renamed from: b */
    private static int m80869b(View view, boolean z) {
        if (z) {
            return view.getMeasuredHeight();
        }
        return view.getMeasuredWidth();
    }

    /* renamed from: c */
    private static int m80875c(FlexItem flexItem, boolean z) {
        if (z) {
            return flexItem.mo74360l();
        }
        return flexItem.mo74361m();
    }

    /* renamed from: d */
    private static int m80877d(FlexItem flexItem, boolean z) {
        if (z) {
            return flexItem.mo74362n();
        }
        return flexItem.mo74363o();
    }

    /* renamed from: e */
    private static int m80879e(FlexItem flexItem, boolean z) {
        if (z) {
            return flexItem.mo74361m();
        }
        return flexItem.mo74360l();
    }

    /* renamed from: f */
    private static int m80881f(FlexItem flexItem, boolean z) {
        if (z) {
            return flexItem.mo74363o();
        }
        return flexItem.mo74362n();
    }

    /* renamed from: a */
    private static int m80858a(FlexItem flexItem, boolean z) {
        if (z) {
            return flexItem.mo74349a();
        }
        return flexItem.mo74350b();
    }

    /* renamed from: b */
    private static int m80870b(FlexItem flexItem, boolean z) {
        if (z) {
            return flexItem.mo74350b();
        }
        return flexItem.mo74349a();
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m80862a(android.view.View r7, int r8) {
        /*
            r6 = this;
            android.view.ViewGroup$LayoutParams r0 = r7.getLayoutParams()
            com.ss.android.ugc.aweme.journey.flexbox.FlexItem r0 = (com.p683ss.android.ugc.aweme.journey.flexbox.FlexItem) r0
            int r1 = r7.getMeasuredWidth()
            int r2 = r7.getMeasuredHeight()
            int r3 = r0.mo74354f()
            r4 = 1
            if (r1 >= r3) goto L_0x001b
            int r1 = r0.mo74354f()
        L_0x0019:
            r3 = 1
            goto L_0x0027
        L_0x001b:
            int r3 = r0.mo74356h()
            if (r1 <= r3) goto L_0x0026
            int r1 = r0.mo74356h()
            goto L_0x0019
        L_0x0026:
            r3 = 0
        L_0x0027:
            int r5 = r0.mo74355g()
            if (r2 >= r5) goto L_0x0032
            int r2 = r0.mo74355g()
            goto L_0x003e
        L_0x0032:
            int r5 = r0.mo74357i()
            if (r2 <= r5) goto L_0x003d
            int r2 = r0.mo74357i()
            goto L_0x003e
        L_0x003d:
            r4 = r3
        L_0x003e:
            if (r4 == 0) goto L_0x0055
            r0 = 1073741824(0x40000000, float:2.0)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r0)
            r7.measure(r1, r0)
            r6.m80860a(r8, r1, r0, r7)
            com.ss.android.ugc.aweme.journey.flexbox.a r0 = r6.f91841d
            r0.mo74365a(r8, r7)
        L_0x0055:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.journey.flexbox.C35756c.m80862a(android.view.View, int):void");
    }

    /* renamed from: a */
    private int m80855a(int i, FlexItem flexItem, int i2) {
        C35754a aVar = this.f91841d;
        int a_ = aVar.mo74367a_(i, aVar.mo74394t() + this.f91841d.mo74396v() + flexItem.mo74360l() + flexItem.mo74362n() + i2, flexItem.mo74349a());
        int size = MeasureSpec.getSize(a_);
        if (size > flexItem.mo74356h()) {
            return MeasureSpec.makeMeasureSpec(flexItem.mo74356h(), MeasureSpec.getMode(a_));
        }
        if (size < flexItem.mo74354f()) {
            return MeasureSpec.makeMeasureSpec(flexItem.mo74354f(), MeasureSpec.getMode(a_));
        }
        return a_;
    }

    /* renamed from: b */
    private int m80867b(int i, FlexItem flexItem, int i2) {
        C35754a aVar = this.f91841d;
        int b = aVar.mo74369b(i, aVar.mo74395u() + this.f91841d.mo74397w() + flexItem.mo74361m() + flexItem.mo74363o() + i2, flexItem.mo74350b());
        int size = MeasureSpec.getSize(b);
        if (size > flexItem.mo74357i()) {
            return MeasureSpec.makeMeasureSpec(flexItem.mo74357i(), MeasureSpec.getMode(b));
        }
        if (size < flexItem.mo74355g()) {
            return MeasureSpec.makeMeasureSpec(flexItem.mo74355g(), MeasureSpec.getMode(b));
        }
        return b;
    }

    /* renamed from: b */
    private void m80874b(View view, int i, int i2) {
        int i3;
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int min = Math.min(Math.max(((i - flexItem.mo74360l()) - flexItem.mo74362n()) - this.f91841d.mo74371d_(view), flexItem.mo74354f()), flexItem.mo74356h());
        if (this.f91843f != null) {
            i3 = m80868b(this.f91843f[i2]);
        } else {
            i3 = view.getMeasuredHeight();
        }
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(i3, 1073741824);
        int makeMeasureSpec2 = MeasureSpec.makeMeasureSpec(min, 1073741824);
        view.measure(makeMeasureSpec2, makeMeasureSpec);
        m80860a(i2, makeMeasureSpec2, makeMeasureSpec, view);
        this.f91841d.mo74365a(i2, view);
    }

    /* renamed from: a */
    private void m80863a(View view, int i, int i2) {
        int i3;
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int min = Math.min(Math.max(((i - flexItem.mo74361m()) - flexItem.mo74363o()) - this.f91841d.mo74371d_(view), flexItem.mo74355g()), flexItem.mo74357i());
        if (this.f91843f != null) {
            i3 = m80856a(this.f91843f[i2]);
        } else {
            i3 = view.getMeasuredWidth();
        }
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(i3, 1073741824);
        int makeMeasureSpec2 = MeasureSpec.makeMeasureSpec(min, 1073741824);
        view.measure(makeMeasureSpec, makeMeasureSpec2);
        m80860a(i2, makeMeasureSpec, makeMeasureSpec2, view);
        this.f91841d.mo74365a(i2, view);
    }

    /* renamed from: a */
    private void m80864a(List<C35755b> list, C35755b bVar, int i, int i2) {
        bVar.f91832m = i2;
        bVar.f91835p = i;
        list.add(bVar);
    }

    /* renamed from: a */
    private void m80860a(int i, int i2, int i3, View view) {
        if (this.f91840b != null) {
            this.f91840b[i] = m80872b(i2, i3);
        }
        if (this.f91843f != null) {
            this.f91843f[i] = m80872b(view.getMeasuredWidth(), view.getMeasuredHeight());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final void mo74413c(C35757a aVar, int i, int i2, int i3, int i4, List<C35755b> list) {
        mo74407a(aVar, i2, i, i3, i4, -1, list);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final void mo74415d(C35757a aVar, int i, int i2, int i3, int i4, List<C35755b> list) {
        mo74407a(aVar, i2, i, i3, 0, i4, list);
    }

    /* renamed from: a */
    private void m80861a(int i, int i2, C35755b bVar, int i3, int i4, boolean z) {
        int i5;
        int i6;
        int i7;
        float f;
        int i8;
        int i9;
        float f2;
        C35755b bVar2 = bVar;
        int i10 = i3;
        int i11 = 1;
        boolean z2 = z;
        while (bVar2.f91829j > 0.0f && i10 >= bVar2.f91824e) {
            int i12 = bVar2.f91824e;
            float f3 = ((float) (i10 - bVar2.f91824e)) / bVar2.f91829j;
            bVar2.f91824e = i4 + bVar2.f91825f;
            if (!z2) {
                bVar2.f91826g = DynamicTabYellowPointVersion.DEFAULT;
            }
            int i13 = 0;
            boolean z3 = false;
            float f4 = 0.0f;
            int i14 = 0;
            while (i13 < bVar2.f91827h) {
                int i15 = bVar2.f91834o + i13;
                View a = this.f91841d.mo4672a(i15);
                if (a == null || a.getVisibility() == 8) {
                    int i16 = i2;
                } else {
                    FlexItem flexItem = (FlexItem) a.getLayoutParams();
                    int c = this.f91841d.mo74370c();
                    if (c == 0 || c == i11) {
                        int i17 = i;
                        int measuredWidth = a.getMeasuredWidth();
                        if (this.f91843f != null) {
                            measuredWidth = m80856a(this.f91843f[i15]);
                        }
                        int measuredHeight = a.getMeasuredHeight();
                        if (this.f91843f != null) {
                            measuredHeight = m80868b(this.f91843f[i15]);
                        }
                        if (this.f91842e[i15]) {
                            int i18 = i2;
                        } else if (flexItem.mo74351c() > 0.0f) {
                            float c2 = ((float) measuredWidth) + (flexItem.mo74351c() * f3);
                            if (i13 == bVar2.f91827h - 1) {
                                c2 += f4;
                                f4 = 0.0f;
                            }
                            int round = Math.round(c2);
                            if (round > flexItem.mo74356h()) {
                                round = flexItem.mo74356h();
                                this.f91842e[i15] = true;
                                bVar2.f91829j -= flexItem.mo74351c();
                                z3 = true;
                            } else {
                                f4 += c2 - ((float) round);
                                double d = (double) f4;
                                if (d > 1.0d) {
                                    round++;
                                    Double.isNaN(d);
                                    f = (float) (d - 1.0d);
                                } else if (d < -1.0d) {
                                    round--;
                                    Double.isNaN(d);
                                    f = (float) (d + 1.0d);
                                }
                                f4 = f;
                            }
                            int b = m80867b(i2, flexItem, bVar2.f91832m);
                            int makeMeasureSpec = MeasureSpec.makeMeasureSpec(round, 1073741824);
                            a.measure(makeMeasureSpec, b);
                            i7 = a.getMeasuredWidth();
                            i6 = a.getMeasuredHeight();
                            m80860a(i15, makeMeasureSpec, b, a);
                            this.f91841d.mo74365a(i15, a);
                            i5 = Math.max(i14, this.f91841d.mo74371d_(a) + i6 + flexItem.mo74361m() + flexItem.mo74363o());
                            bVar2.f91824e += i7 + flexItem.mo74360l() + flexItem.mo74362n();
                        } else {
                            int i19 = i2;
                        }
                        i7 = measuredWidth;
                        i6 = measuredHeight;
                        i5 = Math.max(i14, this.f91841d.mo74371d_(a) + i6 + flexItem.mo74361m() + flexItem.mo74363o());
                        bVar2.f91824e += i7 + flexItem.mo74360l() + flexItem.mo74362n();
                    } else {
                        int measuredHeight2 = a.getMeasuredHeight();
                        if (this.f91843f != null) {
                            measuredHeight2 = m80868b(this.f91843f[i15]);
                        }
                        int measuredWidth2 = a.getMeasuredWidth();
                        if (this.f91843f != null) {
                            measuredWidth2 = m80856a(this.f91843f[i15]);
                        }
                        if (this.f91842e[i15] || flexItem.mo74351c() <= 0.0f) {
                            int i20 = i;
                            i8 = measuredHeight2;
                            i9 = measuredWidth2;
                        } else {
                            float c3 = ((float) measuredHeight2) + (flexItem.mo74351c() * f3);
                            if (i13 == bVar2.f91827h - 1) {
                                c3 += f4;
                                f4 = 0.0f;
                            }
                            int round2 = Math.round(c3);
                            if (round2 > flexItem.mo74357i()) {
                                round2 = flexItem.mo74357i();
                                this.f91842e[i15] = true;
                                bVar2.f91829j -= flexItem.mo74351c();
                                z3 = true;
                            } else {
                                f4 += c3 - ((float) round2);
                                double d2 = (double) f4;
                                if (d2 > 1.0d) {
                                    round2++;
                                    Double.isNaN(d2);
                                    f2 = (float) (d2 - 1.0d);
                                } else if (d2 < -1.0d) {
                                    round2--;
                                    Double.isNaN(d2);
                                    f2 = (float) (d2 + 1.0d);
                                }
                                f4 = f2;
                            }
                            int a2 = m80855a(i, flexItem, bVar2.f91832m);
                            int makeMeasureSpec2 = MeasureSpec.makeMeasureSpec(round2, 1073741824);
                            a.measure(a2, makeMeasureSpec2);
                            i9 = a.getMeasuredWidth();
                            i8 = a.getMeasuredHeight();
                            m80860a(i15, a2, makeMeasureSpec2, a);
                            this.f91841d.mo74365a(i15, a);
                        }
                        i5 = Math.max(i14, i9 + flexItem.mo74360l() + flexItem.mo74362n() + this.f91841d.mo74371d_(a));
                        bVar2.f91824e += i8 + flexItem.mo74361m() + flexItem.mo74363o();
                        int i21 = i2;
                    }
                    bVar2.f91826g = Math.max(bVar2.f91826g, i5);
                    i14 = i5;
                }
                i13++;
                int i22 = i3;
                i11 = 1;
            }
            int i23 = i2;
            if (z3 && i12 != bVar2.f91824e) {
                i10 = i3;
                i11 = 1;
                z2 = true;
            } else {
                return;
            }
        }
    }

    /* renamed from: b */
    private void m80873b(int i, int i2, C35755b bVar, int i3, int i4, boolean z) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        C35755b bVar2 = bVar;
        int i10 = i3;
        int i11 = 1;
        boolean z2 = z;
        while (true) {
            int i12 = bVar2.f91824e;
            if (bVar2.f91830k > 0.0f && i10 <= bVar2.f91824e) {
                float f = ((float) (bVar2.f91824e - i10)) / bVar2.f91830k;
                bVar2.f91824e = i4 + bVar2.f91825f;
                if (!z2) {
                    bVar2.f91826g = DynamicTabYellowPointVersion.DEFAULT;
                }
                int i13 = 0;
                boolean z3 = false;
                float f2 = 0.0f;
                int i14 = 0;
                while (i13 < bVar2.f91827h) {
                    int i15 = bVar2.f91834o + i13;
                    View a = this.f91841d.mo4672a(i15);
                    if (a == null || a.getVisibility() == 8) {
                        int i16 = i2;
                    } else {
                        FlexItem flexItem = (FlexItem) a.getLayoutParams();
                        int c = this.f91841d.mo74370c();
                        if (c == 0 || c == i11) {
                            int i17 = i;
                            int measuredWidth = a.getMeasuredWidth();
                            if (this.f91843f != null) {
                                measuredWidth = m80856a(this.f91843f[i15]);
                            }
                            int measuredHeight = a.getMeasuredHeight();
                            if (this.f91843f != null) {
                                measuredHeight = m80868b(this.f91843f[i15]);
                            }
                            if (this.f91842e[i15]) {
                                int i18 = i2;
                            } else if (flexItem.mo74352d() > 0.0f) {
                                float d = ((float) measuredWidth) - (flexItem.mo74352d() * f);
                                if (i13 == bVar2.f91827h - 1) {
                                    d += f2;
                                    f2 = 0.0f;
                                }
                                int round = Math.round(d);
                                if (round < flexItem.mo74354f()) {
                                    round = flexItem.mo74354f();
                                    this.f91842e[i15] = true;
                                    bVar2.f91830k -= flexItem.mo74352d();
                                    z3 = true;
                                } else {
                                    f2 += d - ((float) round);
                                    double d2 = (double) f2;
                                    if (d2 > 1.0d) {
                                        round++;
                                        f2 -= 1.0f;
                                    } else if (d2 < -1.0d) {
                                        round--;
                                        f2 += 1.0f;
                                    }
                                }
                                int b = m80867b(i2, flexItem, bVar2.f91832m);
                                int makeMeasureSpec = MeasureSpec.makeMeasureSpec(round, 1073741824);
                                a.measure(makeMeasureSpec, b);
                                i7 = a.getMeasuredWidth();
                                i6 = a.getMeasuredHeight();
                                m80860a(i15, makeMeasureSpec, b, a);
                                this.f91841d.mo74365a(i15, a);
                                i5 = Math.max(i14, this.f91841d.mo74371d_(a) + i6 + flexItem.mo74361m() + flexItem.mo74363o());
                                bVar2.f91824e += i7 + flexItem.mo74360l() + flexItem.mo74362n();
                            } else {
                                int i19 = i2;
                            }
                            i7 = measuredWidth;
                            i6 = measuredHeight;
                            i5 = Math.max(i14, this.f91841d.mo74371d_(a) + i6 + flexItem.mo74361m() + flexItem.mo74363o());
                            bVar2.f91824e += i7 + flexItem.mo74360l() + flexItem.mo74362n();
                        } else {
                            int measuredHeight2 = a.getMeasuredHeight();
                            if (this.f91843f != null) {
                                measuredHeight2 = m80868b(this.f91843f[i15]);
                            }
                            int measuredWidth2 = a.getMeasuredWidth();
                            if (this.f91843f != null) {
                                measuredWidth2 = m80856a(this.f91843f[i15]);
                            }
                            if (this.f91842e[i15] || flexItem.mo74352d() <= 0.0f) {
                                int i20 = i;
                                i8 = measuredHeight2;
                                i9 = measuredWidth2;
                            } else {
                                float d3 = ((float) measuredHeight2) - (flexItem.mo74352d() * f);
                                if (i13 == bVar2.f91827h - 1) {
                                    d3 += f2;
                                    f2 = 0.0f;
                                }
                                int round2 = Math.round(d3);
                                if (round2 < flexItem.mo74355g()) {
                                    round2 = flexItem.mo74355g();
                                    this.f91842e[i15] = true;
                                    bVar2.f91830k -= flexItem.mo74352d();
                                    z3 = true;
                                } else {
                                    f2 += d3 - ((float) round2);
                                    double d4 = (double) f2;
                                    if (d4 > 1.0d) {
                                        round2++;
                                        f2 -= 1.0f;
                                    } else if (d4 < -1.0d) {
                                        round2--;
                                        f2 += 1.0f;
                                    }
                                }
                                int a2 = m80855a(i, flexItem, bVar2.f91832m);
                                int makeMeasureSpec2 = MeasureSpec.makeMeasureSpec(round2, 1073741824);
                                a.measure(a2, makeMeasureSpec2);
                                i9 = a.getMeasuredWidth();
                                i8 = a.getMeasuredHeight();
                                m80860a(i15, a2, makeMeasureSpec2, a);
                                this.f91841d.mo74365a(i15, a);
                            }
                            i5 = Math.max(i14, i9 + flexItem.mo74360l() + flexItem.mo74362n() + this.f91841d.mo74371d_(a));
                            bVar2.f91824e += i8 + flexItem.mo74361m() + flexItem.mo74363o();
                            int i21 = i2;
                        }
                        bVar2.f91826g = Math.max(bVar2.f91826g, i5);
                        i14 = i5;
                    }
                    i13++;
                    int i22 = i3;
                    i11 = 1;
                }
                int i23 = i2;
                if (z3 && i12 != bVar2.f91824e) {
                    i10 = i3;
                    i11 = 1;
                    z2 = true;
                }
            } else {
                return;
            }
        }
    }
}
