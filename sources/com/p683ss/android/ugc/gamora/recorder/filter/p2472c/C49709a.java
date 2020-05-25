package com.p683ss.android.ugc.gamora.recorder.filter.p2472c;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.app.Activity;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0199s;
import android.content.Context;
import android.support.p030v4.view.PagerAdapter;
import android.support.p030v4.view.ViewPager.C1000h;
import android.text.TextUtils;
import com.bytedance.common.utility.C9414h;
import com.google.p1057b.p1058a.C17432q;
import com.p683ss.android.ugc.aweme.filter.C31458f;
import com.p683ss.android.ugc.aweme.filter.C31459g;
import com.p683ss.android.ugc.aweme.filter.C31478p.C31479a;
import com.p683ss.android.ugc.aweme.filter.CircleViewPager;
import com.p683ss.android.ugc.aweme.filter.CircleViewPager.C31366a;
import com.p683ss.android.ugc.aweme.filter.repository.p1746a.C31501n;
import com.p683ss.android.ugc.aweme.shortvideo.p2206j.C43902e;
import com.p683ss.android.ugc.aweme.shortvideo.p2206j.C43902e.C43903a;
import com.p683ss.android.ugc.tools.utils.C50203g;
import com.p683ss.android.ugc.tools.view.widget.C50275d;
import com.ss.android.ugc.trill.R;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52847n;
import p2628d.C52857u;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.gamora.recorder.filter.c.a */
public final class C49709a implements C43902e {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f124669a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C49709a.class), "filterAdapter", "getFilterAdapter()Lcom/ss/android/ugc/aweme/filter/EmptyFilterAdapter;"))};

    /* renamed from: i */
    public static final C49710a f124670i = new C49710a(null);

    /* renamed from: b */
    public boolean f124671b = true;

    /* renamed from: c */
    public C1000h f124672c;

    /* renamed from: d */
    public C52847n<? extends C31459g, Integer> f124673d;

    /* renamed from: e */
    public C43903a f124674e;

    /* renamed from: f */
    public boolean f124675f;

    /* renamed from: g */
    public final Activity f124676g;

    /* renamed from: h */
    public final C31479a f124677h;

    /* renamed from: j */
    private ValueAnimator f124678j;

    /* renamed from: k */
    private final C52668f f124679k = C52732g.m112285a(new C49711b(this));

    /* renamed from: l */
    private final C0184k f124680l;

    /* renamed from: m */
    private final C17432q<JSONObject> f124681m;

    /* renamed from: n */
    private final C31501n f124682n;

    /* renamed from: com.ss.android.ugc.gamora.recorder.filter.c.a$a */
    public static final class C49710a {
        private C49710a() {
        }

        public /* synthetic */ C49710a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.filter.c.a$b */
    static final class C49711b extends C52712l implements C52670a<C31458f> {

        /* renamed from: a */
        final /* synthetic */ C49709a f124683a;

        C49711b(C49709a aVar) {
            this.f124683a = aVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C31458f(this.f124683a.f124676g);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.filter.c.a$c */
    public static final class C49712c extends C1000h {

        /* renamed from: a */
        final /* synthetic */ C49709a f124684a;

        C49712c(C49709a aVar) {
            this.f124684a = aVar;
        }

        public final void onPageSelected(int i) {
            if (i < this.f124684a.mo97596c().mo64353a().size()) {
                C31459g gVar = (C31459g) this.f124684a.mo97596c().mo64353a().get(i);
                C43903a aVar = this.f124684a.f124674e;
                if (aVar != null) {
                    C52711k.m112236a((Object) gVar, "filterBean");
                    aVar.mo89457a(gVar, this.f124684a.mo97596c().f82322b);
                }
                if (i < this.f124684a.mo97596c().getCount() - 1) {
                    this.f124684a.f124671b = false;
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.filter.c.a$d */
    public static final class C49713d implements C31366a {

        /* renamed from: a */
        final /* synthetic */ C49709a f124685a;

        /* renamed from: a */
        public final void mo64255a() {
            if (!this.f124685a.f124671b) {
                C50275d.m108539b((Context) this.f124685a.f124676g, this.f124685a.f124676g.getString(R.string.bvs)).mo98174a();
                this.f124685a.f124671b = true;
            }
        }

        C49713d(C49709a aVar) {
            this.f124685a = aVar;
        }

        /* renamed from: a */
        public final void mo64256a(float f) {
            C43903a aVar = this.f124685a.f124674e;
            if (aVar != null) {
                List<C31459g> list = this.f124685a.mo97596c().f82321a;
                C52711k.m112236a((Object) list, "filterAdapter.liveFilterBeanList");
                aVar.mo89458a(list, this.f124685a.mo97596c().f82322b, f);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.filter.c.a$e */
    static final class C49714e<T> implements C0199s<List<? extends C31459g>> {

        /* renamed from: a */
        final /* synthetic */ C49709a f124686a;

        C49714e(C49709a aVar) {
            this.f124686a = aVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            List list = (List) obj;
            if (list != null) {
                this.f124686a.mo97596c().mo64355a(list, true);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.filter.c.a$f */
    static final class C49715f implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C49709a f124687a;

        C49715f(C49709a aVar) {
            this.f124687a = aVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            CircleViewPager a = this.f124687a.f124677h.mo64373a();
            if (a != null && a.getAdapter() != null) {
                C52711k.m112236a((Object) valueAnimator, "animation");
                Object animatedValue = valueAnimator.getAnimatedValue();
                if (animatedValue != null) {
                    a.mo64249a(((Float) animatedValue).floatValue());
                    return;
                }
                throw new C52857u("null cannot be cast to non-null type kotlin.Float");
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.filter.c.a$g */
    public static final class C49716g extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C49709a f124688a;

        C49716g(C49709a aVar) {
            this.f124688a = aVar;
        }

        public final void onAnimationStart(Animator animator) {
            C52711k.m112240b(animator, "animation");
            this.f124688a.f124675f = true;
        }

        public final void onAnimationEnd(Animator animator) {
            C52711k.m112240b(animator, "animation");
            C52847n<? extends C31459g, Integer> nVar = this.f124688a.f124673d;
            if (nVar != null) {
                CircleViewPager a = this.f124688a.f124677h.mo64373a();
                if (a != null) {
                    if (((Number) nVar.getSecond()).intValue() == a.getCurrentItem()) {
                        C1000h hVar = this.f124688a.f124672c;
                        if (hVar != null) {
                            hVar.onPageSelected(((Number) nVar.getSecond()).intValue());
                        }
                    } else {
                        a.setCurrentItem(((Number) nVar.getSecond()).intValue(), true);
                    }
                }
            }
            this.f124688a.f124675f = false;
        }
    }

    /* renamed from: c */
    public final C31458f mo97596c() {
        return (C31458f) this.f124679k.getValue();
    }

    /* renamed from: a */
    public final boolean mo89454a() {
        return mo97596c().f82322b;
    }

    /* renamed from: b */
    public final void mo89455b() {
        ValueAnimator valueAnimator = this.f124678j;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f124678j = null;
    }

    /* renamed from: a */
    public final void mo89451a(C43903a aVar) {
        this.f124674e = aVar;
    }

    /* renamed from: a */
    public final void mo89448a(int i) {
        CircleViewPager a = this.f124677h.mo64373a();
        if (a != null) {
            a.setStartItem(i);
        }
    }

    /* renamed from: a */
    public final void mo89447a(float f) {
        if (!this.f124675f) {
            CircleViewPager a = this.f124677h.mo64373a();
            if (a != null && a.getAdapter() != null) {
                a.mo64249a(f);
            }
        }
    }

    /* renamed from: b */
    private final Integer m107312b(C31459g gVar) {
        List<C31459g> list;
        if (mo97596c().f82322b) {
            list = mo97596c().mo64353a();
        } else {
            list = mo97596c().f82321a;
        }
        C52711k.m112236a((Object) list, "beanList");
        int i = 0;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (C52711k.m112239a((Object) (C31459g) it.next(), (Object) gVar)) {
                break;
            } else {
                i++;
            }
        }
        if (i < 0) {
            return null;
        }
        return Integer.valueOf(i);
    }

    /* renamed from: a */
    public final C31459g mo89446a(C31459g gVar) {
        C52711k.m112240b(gVar, "curFilter");
        if (mo97596c().f82322b) {
            List<C31459g> list = mo97596c().f82321a;
            C52711k.m112236a((Object) list, "filterAdapter.getLiveFilterBeanList()");
            return m107310a(list, gVar);
        }
        List a = mo97596c().mo64353a();
        C52711k.m112236a((Object) a, "filterAdapter.getFilterBeanList()");
        return m107311b(a, gVar);
    }

    /* renamed from: b */
    public final void mo89456b(int i) {
        PagerAdapter pagerAdapter;
        CircleViewPager a = this.f124677h.mo64373a();
        if (a != null) {
            pagerAdapter = a.getAdapter();
        } else {
            pagerAdapter = null;
        }
        if (pagerAdapter != null) {
            PagerAdapter adapter = a.getAdapter();
            if (adapter != null) {
                ((C31458f) adapter).mo64356a(false);
                a.setCurrentItem(i);
                return;
            }
            throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.filter.EmptyFilterAdapter");
        }
    }

    /* renamed from: a */
    public final void mo89452a(List<? extends C31459g> list) {
        C52711k.m112240b(list, "newFilterRes");
        CircleViewPager a = this.f124677h.mo64373a();
        if (a != null && a.getAdapter() != null && !list.isEmpty()) {
            PagerAdapter adapter = a.getAdapter();
            if (adapter != null) {
                C31458f fVar = (C31458f) adapter;
                fVar.mo64356a(true);
                fVar.mo64354a(list);
                return;
            }
            throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.filter.EmptyFilterAdapter");
        }
    }

    /* renamed from: a */
    private static C31459g m107310a(List<? extends C31459g> list, C31459g gVar) {
        if (C9414h.m18630a(list) || gVar == null) {
            return null;
        }
        for (C31459g gVar2 : list) {
            if (gVar2 != null && TextUtils.equals(gVar2.f82325b, gVar.f82325b)) {
                return gVar2;
            }
        }
        return null;
    }

    /* renamed from: b */
    private static C31459g m107311b(List<? extends C31459g> list, C31459g gVar) {
        if (C9414h.m18630a(list) || gVar == null) {
            return null;
        }
        for (C31459g gVar2 : list) {
            if (gVar2 != null && gVar2.f82324a == gVar.f82324a) {
                return gVar2;
            }
        }
        return null;
    }

    /* renamed from: a */
    public final void mo89449a(C31459g gVar, Integer num) {
        C52711k.m112240b(gVar, "curFilter");
        if (!mo97596c().f82322b) {
            Integer b = m107312b(gVar);
            if (b == null) {
                b = null;
            }
            if (b != null && b.intValue() >= 0) {
                CircleViewPager a = this.f124677h.mo64373a();
                if (a != null) {
                    a.setCurrentItem(b.intValue(), false);
                }
                if (b.intValue() < mo97596c().getCount() - 1) {
                    this.f124671b = false;
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo89453a(List<? extends C31459g> list, int i) {
        C52711k.m112240b(list, "newFilterRes");
        CircleViewPager a = this.f124677h.mo64373a();
        if (a != null && a.getAdapter() != null && !list.isEmpty()) {
            PagerAdapter adapter = a.getAdapter();
            if (adapter != null) {
                C31458f fVar = (C31458f) adapter;
                fVar.mo64356a(true);
                fVar.mo64354a(list);
                StringBuilder sb = new StringBuilder("RecordFilterModuleImpl setLiveFilter currentPos: ");
                sb.append(i);
                C50203g.m108358a(sb.toString());
                if (i == -1) {
                    i = 0;
                }
                a.setCurrentItem(i);
                return;
            }
            throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.filter.EmptyFilterAdapter");
        }
    }

    public C49709a(Activity activity, C0184k kVar, C17432q<JSONObject> qVar, C31479a aVar, C31501n nVar) {
        C52711k.m112240b(activity, "activity");
        C52711k.m112240b(kVar, "owner");
        C52711k.m112240b(qVar, "shootWaySupplier");
        C52711k.m112240b(aVar, "viewPagerSupplier");
        C52711k.m112240b(nVar, "filterSource");
        this.f124676g = activity;
        this.f124680l = kVar;
        this.f124681m = qVar;
        this.f124677h = aVar;
        this.f124682n = nVar;
        C0184k kVar2 = this.f124680l;
        this.f124672c = new C49712c(this);
        CircleViewPager a = this.f124677h.mo64373a();
        if (a != null) {
            a.setAdapter(mo97596c());
            mo97596c().mo64355a(mo97596c().mo64353a(), true);
            C1000h hVar = this.f124672c;
            if (hVar == null) {
                C52711k.m112234a();
            }
            a.removeOnPageChangeListener(hVar);
            C1000h hVar2 = this.f124672c;
            if (hVar2 == null) {
                C52711k.m112234a();
            }
            a.addOnPageChangeListener(hVar2);
            a.setOnScrolledListener(new C49713d(this));
        }
        this.f124682n.mo64418a().observe(kVar2, new C49714e(this));
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0105  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo89450a(com.p683ss.android.ugc.aweme.filter.C31459g r18, java.lang.Integer r19, float r20, float r21, int r22) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r4 = r22
            boolean r5 = r0.f124675f
            if (r5 == 0) goto L_0x000b
            return
        L_0x000b:
            float r5 = java.lang.Math.signum(r21)
            float r6 = java.lang.Math.signum(r20)
            r7 = 1073741824(0x40000000, float:2.0)
            r8 = 1148846080(0x447a0000, float:1000.0)
            r9 = 2
            r11 = 1
            r12 = 0
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 != 0) goto L_0x005a
            if (r1 == 0) goto L_0x0025
            com.ss.android.ugc.aweme.filter.g r5 = r17.mo89446a(r18)
            goto L_0x0026
        L_0x0025:
            r5 = 0
        L_0x0026:
            if (r1 == 0) goto L_0x002d
            java.lang.Integer r1 = r17.m107312b(r18)
            goto L_0x002e
        L_0x002d:
            r1 = 0
        L_0x002e:
            if (r5 == 0) goto L_0x0037
            if (r1 == 0) goto L_0x0037
            d.n r10 = p2628d.C52856t.m112465a(r5, r1)
            goto L_0x0038
        L_0x0037:
            r10 = 0
        L_0x0038:
            r0.f124673d = r10
            float[] r1 = new float[r9]
            r1[r12] = r21
            r5 = 0
            r1[r11] = r5
            android.animation.ValueAnimator r1 = android.animation.ValueAnimator.ofFloat(r1)
            r0.f124678j = r1
            float r1 = (float) r4
            float r3 = java.lang.Math.abs(r21)
            float r1 = r1 * r3
            long r3 = (long) r1
            float r1 = (float) r3
            float r2 = java.lang.Math.abs(r20)
            float r2 = r2 / r8
            float r2 = r2 / r7
            float r1 = r1 / r2
            long r1 = (long) r1
            goto L_0x0121
        L_0x005a:
            com.ss.android.ugc.aweme.filter.f r5 = r17.mo97596c()
            java.util.List r5 = r5.mo64353a()
            boolean r6 = r5.isEmpty()
            r13 = 1065353216(0x3f800000, float:1.0)
            r14 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r6 == 0) goto L_0x0081
            com.ss.android.ugc.aweme.filter.g r1 = com.p683ss.android.ugc.aweme.filter.repository.p1746a.p1747a.C31483a.m73318b()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r12)
            d.n r1 = p2628d.C52856t.m112465a(r1, r5)
            r0.f124673d = r1
            float[] r1 = new float[r9]
            r1[r12] = r21
            r5 = r1
            goto L_0x0107
        L_0x0081:
            if (r1 == 0) goto L_0x00ae
            java.lang.String r6 = "filterBeanList"
            p2628d.p2639f.p2641b.C52711k.m112236a(r5, r6)
            java.util.Iterator r6 = r5.iterator()
            r15 = 0
        L_0x008d:
            boolean r16 = r6.hasNext()
            if (r16 == 0) goto L_0x00a5
            java.lang.Object r16 = r6.next()
            r10 = r16
            com.ss.android.ugc.aweme.filter.g r10 = (com.p683ss.android.ugc.aweme.filter.C31459g) r10
            boolean r10 = p2628d.p2639f.p2641b.C52711k.m112239a(r10, r1)
            if (r10 == 0) goto L_0x00a2
            goto L_0x00a6
        L_0x00a2:
            int r15 = r15 + 1
            goto L_0x008d
        L_0x00a5:
            r15 = -1
        L_0x00a6:
            if (r15 >= 0) goto L_0x00a9
            goto L_0x00ae
        L_0x00a9:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r15)
            goto L_0x00af
        L_0x00ae:
            r10 = 0
        L_0x00af:
            r1 = 925353388(0x3727c5ac, float:1.0E-5)
            int r6 = (r20 > r1 ? 1 : (r20 == r1 ? 0 : -1))
            if (r6 < 0) goto L_0x00c9
            if (r10 == 0) goto L_0x00bd
            int r6 = r10.intValue()
            goto L_0x00be
        L_0x00bd:
            r6 = 0
        L_0x00be:
            int r6 = r6 - r11
            int r10 = r5.size()
            int r10 = r10 - r11
            int r6 = android.support.p030v4.p033b.C0703a.m2034a(r6, r12, r10)
            goto L_0x00e3
        L_0x00c9:
            com.ss.android.ugc.aweme.filter.f r6 = r17.mo97596c()
            java.util.List r6 = r6.mo64353a()
            int r6 = r6.size()
            int r6 = r6 - r11
            if (r10 == 0) goto L_0x00dd
            int r10 = r10.intValue()
            goto L_0x00de
        L_0x00dd:
            r10 = 0
        L_0x00de:
            int r10 = r10 + r11
            int r6 = java.lang.Math.min(r6, r10)
        L_0x00e3:
            java.lang.String r10 = "filterBeanList"
            p2628d.p2639f.p2641b.C52711k.m112236a(r5, r10)
            java.lang.Object r5 = p2628d.p2629a.C52575l.m112118a(r5, r6)
            com.ss.android.ugc.aweme.filter.g r5 = (com.p683ss.android.ugc.aweme.filter.C31459g) r5
            if (r5 == 0) goto L_0x00f9
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            d.n r10 = p2628d.C52856t.m112465a(r5, r6)
            goto L_0x00fa
        L_0x00f9:
            r10 = 0
        L_0x00fa:
            r0.f124673d = r10
            float[] r5 = new float[r9]
            r5[r12] = r21
            int r1 = (r20 > r1 ? 1 : (r20 == r1 ? 0 : -1))
            if (r1 < 0) goto L_0x0105
            goto L_0x0107
        L_0x0105:
            r14 = 1065353216(0x3f800000, float:1.0)
        L_0x0107:
            r5[r11] = r14
            android.animation.ValueAnimator r1 = android.animation.ValueAnimator.ofFloat(r5)
            r0.f124678j = r1
            float r1 = (float) r4
            float r3 = java.lang.Math.abs(r21)
            float r13 = r13 - r3
            float r1 = r1 * r13
            long r3 = (long) r1
            float r1 = (float) r3
            float r2 = java.lang.Math.abs(r20)
            float r2 = r2 / r8
            float r2 = r2 / r7
            float r1 = r1 / r2
            long r1 = (long) r1
        L_0x0121:
            r3 = 400(0x190, double:1.976E-321)
            long r1 = java.lang.Math.min(r1, r3)
            android.animation.ValueAnimator r3 = r0.f124678j
            if (r3 != 0) goto L_0x012e
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x012e:
            android.view.animation.DecelerateInterpolator r4 = new android.view.animation.DecelerateInterpolator
            r4.<init>()
            android.animation.TimeInterpolator r4 = (android.animation.TimeInterpolator) r4
            r3.setInterpolator(r4)
            android.animation.ValueAnimator r3 = r0.f124678j
            if (r3 != 0) goto L_0x013f
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x013f:
            r3.setDuration(r1)
            android.animation.ValueAnimator r1 = r0.f124678j
            if (r1 != 0) goto L_0x0149
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0149:
            com.ss.android.ugc.gamora.recorder.filter.c.a$f r2 = new com.ss.android.ugc.gamora.recorder.filter.c.a$f
            r2.<init>(r0)
            android.animation.ValueAnimator$AnimatorUpdateListener r2 = (android.animation.ValueAnimator.AnimatorUpdateListener) r2
            r1.addUpdateListener(r2)
            android.animation.ValueAnimator r1 = r0.f124678j
            if (r1 != 0) goto L_0x015a
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x015a:
            com.ss.android.ugc.gamora.recorder.filter.c.a$g r2 = new com.ss.android.ugc.gamora.recorder.filter.c.a$g
            r2.<init>(r0)
            android.animation.Animator$AnimatorListener r2 = (android.animation.Animator.AnimatorListener) r2
            r1.addListener(r2)
            android.animation.ValueAnimator r1 = r0.f124678j
            if (r1 != 0) goto L_0x016b
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x016b:
            r1.start()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.gamora.recorder.filter.p2472c.C49709a.mo89450a(com.ss.android.ugc.aweme.filter.g, java.lang.Integer, float, float, int):void");
    }
}
