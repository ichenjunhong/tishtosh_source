package com.p683ss.android.ugc.aweme.feed.guide;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.support.p030v4.view.C1056u;
import android.support.p043v7.widget.C1440au;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.View;
import android.view.ViewPropertyAnimator;
import com.bytedance.common.utility.C9432q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.feed.guide.k */
public final class C30290k extends C1440au {

    /* renamed from: o */
    private static TimeInterpolator f79125o;

    /* renamed from: a */
    ArrayList<ArrayList<C1352v>> f79126a = new ArrayList<>();

    /* renamed from: b */
    ArrayList<ArrayList<C30301b>> f79127b = new ArrayList<>();

    /* renamed from: c */
    ArrayList<ArrayList<C30300a>> f79128c = new ArrayList<>();

    /* renamed from: d */
    ArrayList<C1352v> f79129d = new ArrayList<>();

    /* renamed from: e */
    ArrayList<C1352v> f79130e = new ArrayList<>();

    /* renamed from: f */
    ArrayList<C1352v> f79131f = new ArrayList<>();

    /* renamed from: g */
    ArrayList<C1352v> f79132g = new ArrayList<>();

    /* renamed from: n */
    public RecyclerView f79133n;

    /* renamed from: p */
    private ArrayList<C1352v> f79134p = new ArrayList<>();

    /* renamed from: q */
    private ArrayList<C1352v> f79135q = new ArrayList<>();

    /* renamed from: r */
    private ArrayList<C30301b> f79136r = new ArrayList<>();

    /* renamed from: s */
    private ArrayList<C30300a> f79137s = new ArrayList<>();

    /* renamed from: com.ss.android.ugc.aweme.feed.guide.k$a */
    static class C30300a {

        /* renamed from: a */
        public C1352v f79164a;

        /* renamed from: b */
        public C1352v f79165b;

        /* renamed from: c */
        public int f79166c;

        /* renamed from: d */
        public int f79167d;

        /* renamed from: e */
        public int f79168e;

        /* renamed from: f */
        public int f79169f;

        public final String toString() {
            StringBuilder sb = new StringBuilder("ChangeInfo{oldHolder=");
            sb.append(this.f79164a);
            sb.append(", newHolder=");
            sb.append(this.f79165b);
            sb.append(", fromX=");
            sb.append(this.f79166c);
            sb.append(", fromY=");
            sb.append(this.f79167d);
            sb.append(", toX=");
            sb.append(this.f79168e);
            sb.append(", toY=");
            sb.append(this.f79169f);
            sb.append('}');
            return sb.toString();
        }

        private C30300a(C1352v vVar, C1352v vVar2) {
            this.f79164a = vVar;
            this.f79165b = vVar2;
        }

        C30300a(C1352v vVar, C1352v vVar2, int i, int i2, int i3, int i4) {
            this(vVar, vVar2);
            this.f79166c = i;
            this.f79167d = i2;
            this.f79168e = i3;
            this.f79169f = i4;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.guide.k$b */
    static class C30301b {

        /* renamed from: a */
        public C1352v f79170a;

        /* renamed from: b */
        public int f79171b;

        /* renamed from: c */
        public int f79172c;

        /* renamed from: d */
        public int f79173d;

        /* renamed from: e */
        public int f79174e;

        C30301b(C1352v vVar, int i, int i2, int i3, int i4) {
            this.f79170a = vVar;
            this.f79171b = i;
            this.f79172c = i2;
            this.f79173d = i3;
            this.f79174e = i4;
        }
    }

    /* renamed from: a */
    public final boolean mo5628a(C1352v vVar, C1352v vVar2, int i, int i2, int i3, int i4) {
        if (vVar == vVar2) {
            return mo5627a(vVar, i, i2, i3, i4);
        }
        float translationX = vVar.itemView.getTranslationX();
        float translationY = vVar.itemView.getTranslationY();
        float alpha = vVar.itemView.getAlpha();
        m71215j(vVar);
        int i5 = (int) (((float) (i3 - i)) - translationX);
        int i6 = (int) (((float) (i4 - i2)) - translationY);
        vVar.itemView.setTranslationX(translationX);
        vVar.itemView.setTranslationY(translationY);
        vVar.itemView.setAlpha(alpha);
        if (vVar2 != null) {
            m71215j(vVar2);
            vVar2.itemView.setTranslationX((float) (-i5));
            vVar2.itemView.setTranslationY((float) (-i6));
            vVar2.itemView.setAlpha(0.0f);
        }
        ArrayList<C30300a> arrayList = this.f79137s;
        C30300a aVar = new C30300a(vVar, vVar2, i, i2, i3, i4);
        arrayList.add(aVar);
        return true;
    }

    /* renamed from: a */
    public final boolean mo4996a(C1352v vVar, List<Object> list) {
        return !list.isEmpty() || super.mo4996a(vVar, list);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final void mo5849c() {
        if (!mo4997b()) {
            mo5002e();
        }
    }

    /* renamed from: b */
    public final boolean mo4997b() {
        if (!this.f79135q.isEmpty() || !this.f79137s.isEmpty() || !this.f79136r.isEmpty() || !this.f79134p.isEmpty() || !this.f79130e.isEmpty() || !this.f79131f.isEmpty() || !this.f79129d.isEmpty() || !this.f79132g.isEmpty() || !this.f79127b.isEmpty() || !this.f79126a.isEmpty() || !this.f79128c.isEmpty()) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final void mo5001d() {
        int size = this.f79136r.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            C30301b bVar = (C30301b) this.f79136r.get(size);
            View view = bVar.f79170a.itemView;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            mo5631h(bVar.f79170a);
            this.f79136r.remove(size);
        }
        for (int size2 = this.f79134p.size() - 1; size2 >= 0; size2--) {
            mo5630g((C1352v) this.f79134p.get(size2));
            this.f79134p.remove(size2);
        }
        int size3 = this.f79135q.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            C1352v vVar = (C1352v) this.f79135q.get(size3);
            vVar.itemView.setAlpha(1.0f);
            mo5632i(vVar);
            this.f79135q.remove(size3);
        }
        for (int size4 = this.f79137s.size() - 1; size4 >= 0; size4--) {
            m71211a((C30300a) this.f79137s.get(size4));
        }
        this.f79137s.clear();
        if (mo4997b()) {
            for (int size5 = this.f79127b.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList = (ArrayList) this.f79127b.get(size5);
                for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                    C30301b bVar2 = (C30301b) arrayList.get(size6);
                    View view2 = bVar2.f79170a.itemView;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    mo5631h(bVar2.f79170a);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.f79127b.remove(arrayList);
                    }
                }
            }
            for (int size7 = this.f79126a.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList2 = (ArrayList) this.f79126a.get(size7);
                for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                    C1352v vVar2 = (C1352v) arrayList2.get(size8);
                    vVar2.itemView.setAlpha(1.0f);
                    mo5632i(vVar2);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.f79126a.remove(arrayList2);
                    }
                }
            }
            for (int size9 = this.f79128c.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList3 = (ArrayList) this.f79128c.get(size9);
                for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                    m71211a((C30300a) arrayList3.get(size10));
                    if (arrayList3.isEmpty()) {
                        this.f79128c.remove(arrayList3);
                    }
                }
            }
            m71212a((List<C1352v>) this.f79131f);
            m71212a((List<C1352v>) this.f79130e);
            m71212a((List<C1352v>) this.f79129d);
            m71212a((List<C1352v>) this.f79132g);
            mo5002e();
        }
    }

    /* renamed from: a */
    public final void mo4993a() {
        long j;
        long j2;
        boolean z = !this.f79134p.isEmpty();
        boolean z2 = !this.f79136r.isEmpty();
        boolean z3 = !this.f79137s.isEmpty();
        boolean z4 = !this.f79135q.isEmpty();
        if (z || z2 || z4 || z3) {
            Iterator it = this.f79134p.iterator();
            while (it.hasNext()) {
                final C1352v vVar = (C1352v) it.next();
                this.f79131f.add(vVar);
                final ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
                ofFloat.setDuration(300);
                ofFloat.addUpdateListener(new AnimatorUpdateListener() {
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        View view = vVar.itemView;
                        Float f = (Float) valueAnimator.getAnimatedValue();
                        view.setAlpha(1.0f - f.floatValue());
                        view.setScaleX(1.0f - (f.floatValue() * 0.5f));
                        view.setScaleY(1.0f - (f.floatValue() * 0.5f));
                    }
                });
                ofFloat.addListener(new AnimatorListenerAdapter() {
                    public final void onAnimationStart(Animator animator) {
                    }

                    public final void onAnimationEnd(Animator animator) {
                        ofFloat.removeAllListeners();
                        C30290k.this.mo5630g(vVar);
                        C30290k.this.f79131f.remove(vVar);
                        C30290k.this.mo5849c();
                    }
                });
                ofFloat.start();
            }
            this.f79134p.clear();
            if (z2) {
                final ArrayList arrayList = new ArrayList();
                arrayList.addAll(this.f79136r);
                this.f79127b.add(arrayList);
                this.f79136r.clear();
                C302911 r6 = new Runnable() {
                    public final void run() {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            C30301b bVar = (C30301b) it.next();
                            C30290k kVar = C30290k.this;
                            C1352v vVar = bVar.f79170a;
                            int i = bVar.f79171b;
                            int i2 = bVar.f79172c;
                            int i3 = bVar.f79173d;
                            int i4 = bVar.f79174e;
                            kVar.f79130e.add(vVar);
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
                            float translationX = vVar.itemView.getTranslationX();
                            ofFloat.setDuration(400);
                            ofFloat.addUpdateListener(new C30302l(kVar, vVar, translationX));
                            ofFloat.addListener(new AnimatorListenerAdapter(vVar, ofFloat) {

                                /* renamed from: a */
                                final /* synthetic */ C1352v f79153a;

                                /* renamed from: b */
                                final /* synthetic */ ValueAnimator f79154b;

                                public final void onAnimationStart(Animator animator) {
                                }

                                public final void onAnimationEnd(Animator animator) {
                                    this.f79154b.removeAllListeners();
                                    C30290k.this.mo5631h(this.f79153a);
                                    C30290k.this.f79130e.remove(this.f79153a);
                                    C30290k.this.mo5849c();
                                }

                                {
                                    this.f79153a = r2;
                                    this.f79154b = r3;
                                }
                            });
                            ofFloat.setStartDelay(100);
                            ofFloat.start();
                        }
                        arrayList.clear();
                        C30290k.this.f79127b.remove(arrayList);
                    }
                };
                if (z) {
                    C1056u.m3035a(((C30301b) arrayList.get(0)).f79170a.itemView, (Runnable) r6, this.f4729j);
                } else {
                    r6.run();
                }
            }
            if (z3) {
                final ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(this.f79137s);
                this.f79128c.add(arrayList2);
                this.f79137s.clear();
                C302922 r62 = new Runnable() {
                    public final void run() {
                        View view;
                        Iterator it = arrayList2.iterator();
                        while (it.hasNext()) {
                            C30300a aVar = (C30300a) it.next();
                            C30290k kVar = C30290k.this;
                            C1352v vVar = aVar.f79164a;
                            View view2 = null;
                            if (vVar == null) {
                                view = null;
                            } else {
                                view = vVar.itemView;
                            }
                            C1352v vVar2 = aVar.f79165b;
                            if (vVar2 != null) {
                                view2 = vVar2.itemView;
                            }
                            if (view != null) {
                                ViewPropertyAnimator duration = view.animate().setDuration(kVar.f4731l);
                                kVar.f79132g.add(aVar.f79164a);
                                duration.translationX((float) (aVar.f79168e - aVar.f79166c));
                                duration.translationY((float) (aVar.f79169f - aVar.f79167d));
                                duration.alpha(0.0f).setListener(new AnimatorListenerAdapter(aVar, duration, view) {

                                    /* renamed from: a */
                                    final /* synthetic */ C30300a f79156a;

                                    /* renamed from: b */
                                    final /* synthetic */ ViewPropertyAnimator f79157b;

                                    /* renamed from: c */
                                    final /* synthetic */ View f79158c;

                                    public final void onAnimationStart(Animator animator) {
                                    }

                                    public final void onAnimationEnd(Animator animator) {
                                        this.f79157b.setListener(null);
                                        this.f79158c.setAlpha(1.0f);
                                        this.f79158c.setTranslationX(0.0f);
                                        this.f79158c.setTranslationY(0.0f);
                                        C30290k.this.mo5625a(this.f79156a.f79164a, true);
                                        C30290k.this.f79132g.remove(this.f79156a.f79164a);
                                        C30290k.this.mo5849c();
                                    }

                                    {
                                        this.f79156a = r2;
                                        this.f79157b = r3;
                                        this.f79158c = r4;
                                    }
                                }).start();
                            }
                            if (view2 != null) {
                                ViewPropertyAnimator animate = view2.animate();
                                kVar.f79132g.add(aVar.f79165b);
                                animate.translationX(0.0f).translationY(0.0f).setDuration(kVar.f4731l).alpha(1.0f).setListener(new AnimatorListenerAdapter(aVar, animate, view2) {

                                    /* renamed from: a */
                                    final /* synthetic */ C30300a f79160a;

                                    /* renamed from: b */
                                    final /* synthetic */ ViewPropertyAnimator f79161b;

                                    /* renamed from: c */
                                    final /* synthetic */ View f79162c;

                                    public final void onAnimationStart(Animator animator) {
                                    }

                                    public final void onAnimationEnd(Animator animator) {
                                        this.f79161b.setListener(null);
                                        this.f79162c.setAlpha(1.0f);
                                        this.f79162c.setTranslationX(0.0f);
                                        this.f79162c.setTranslationY(0.0f);
                                        C30290k.this.mo5625a(this.f79160a.f79165b, false);
                                        C30290k.this.f79132g.remove(this.f79160a.f79165b);
                                        C30290k.this.mo5849c();
                                    }

                                    {
                                        this.f79160a = r2;
                                        this.f79161b = r3;
                                        this.f79162c = r4;
                                    }
                                }).start();
                            }
                        }
                        arrayList2.clear();
                        C30290k.this.f79128c.remove(arrayList2);
                    }
                };
                if (z) {
                    C1056u.m3035a(((C30300a) arrayList2.get(0)).f79164a.itemView, (Runnable) r62, this.f4729j);
                } else {
                    r62.run();
                }
            }
            if (z4) {
                final ArrayList arrayList3 = new ArrayList();
                arrayList3.addAll(this.f79135q);
                this.f79126a.add(arrayList3);
                this.f79135q.clear();
                C302933 r5 = new Runnable() {
                    public final void run() {
                        Iterator it = arrayList3.iterator();
                        while (it.hasNext()) {
                            C1352v vVar = (C1352v) it.next();
                            C30290k kVar = C30290k.this;
                            View view = vVar.itemView;
                            ViewPropertyAnimator animate = view.animate();
                            kVar.f79129d.add(vVar);
                            animate.translationX(0.0f).setDuration(300).setListener(new AnimatorListenerAdapter(vVar, view, animate) {

                                /* renamed from: a */
                                final /* synthetic */ C1352v f79149a;

                                /* renamed from: b */
                                final /* synthetic */ View f79150b;

                                /* renamed from: c */
                                final /* synthetic */ ViewPropertyAnimator f79151c;

                                public final void onAnimationStart(Animator animator) {
                                }

                                public final void onAnimationCancel(Animator animator) {
                                    this.f79150b.setTranslationX(0.0f);
                                }

                                public final void onAnimationEnd(Animator animator) {
                                    this.f79151c.setListener(null);
                                    C30290k.this.mo5632i(this.f79149a);
                                    C30290k.this.f79129d.remove(this.f79149a);
                                    C30290k.this.mo5849c();
                                }

                                {
                                    this.f79149a = r2;
                                    this.f79150b = r3;
                                    this.f79151c = r4;
                                }
                            }).start();
                        }
                        arrayList3.clear();
                        C30290k.this.f79126a.remove(arrayList3);
                    }
                };
                if (z || z2 || z3) {
                    long j3 = 0;
                    if (z) {
                        j = this.f4729j;
                    } else {
                        j = 0;
                    }
                    if (z2) {
                        j2 = this.f4730k;
                    } else {
                        j2 = 0;
                    }
                    if (z3) {
                        j3 = this.f4731l;
                    }
                    C1056u.m3035a(((C1352v) arrayList3.get(0)).itemView, (Runnable) r5, j + Math.max(j2, j3));
                    return;
                }
                r5.run();
            }
        }
    }

    /* renamed from: a */
    public final boolean mo5626a(C1352v vVar) {
        m71215j(vVar);
        this.f79134p.add(vVar);
        return true;
    }

    /* renamed from: j */
    private void m71215j(C1352v vVar) {
        if (f79125o == null) {
            f79125o = new ValueAnimator().getInterpolator();
        }
        vVar.itemView.animate().setInterpolator(f79125o);
        mo4999c(vVar);
    }

    /* renamed from: a */
    private void m71211a(C30300a aVar) {
        if (aVar.f79164a != null) {
            m71214a(aVar, aVar.f79164a);
        }
        if (aVar.f79165b != null) {
            m71214a(aVar, aVar.f79165b);
        }
    }

    /* renamed from: b */
    public final boolean mo5629b(C1352v vVar) {
        m71215j(vVar);
        vVar.itemView.setAlpha(0.34f);
        if (vVar.getAdapterPosition() > ((GalleryLayoutManager) this.f79133n.getLayoutManager()).f79080b) {
            vVar.itemView.setTranslationX((float) this.f79133n.getWidth());
        } else {
            vVar.itemView.setTranslationX((float) (-this.f79133n.getWidth()));
        }
        this.f79135q.add(vVar);
        return true;
    }

    public C30290k(RecyclerView recyclerView) {
        this.f79133n = recyclerView;
    }

    /* renamed from: a */
    private static void m71212a(List<C1352v> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            ((C1352v) list.get(size)).itemView.animate().cancel();
        }
    }

    /* renamed from: c */
    public final void mo4999c(C1352v vVar) {
        View view = vVar.itemView;
        view.animate().cancel();
        int size = this.f79136r.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (((C30301b) this.f79136r.get(size)).f79170a == vVar) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                mo5631h(vVar);
                this.f79136r.remove(size);
            }
        }
        m71213a((List<C30300a>) this.f79137s, vVar);
        if (this.f79134p.remove(vVar)) {
            view.setAlpha(1.0f);
            mo5630g(vVar);
        }
        if (this.f79135q.remove(vVar)) {
            view.setAlpha(1.0f);
            mo5632i(vVar);
        }
        for (int size2 = this.f79128c.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList = (ArrayList) this.f79128c.get(size2);
            m71213a((List<C30300a>) arrayList, vVar);
            if (arrayList.isEmpty()) {
                this.f79128c.remove(size2);
            }
        }
        for (int size3 = this.f79127b.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList2 = (ArrayList) this.f79127b.get(size3);
            int size4 = arrayList2.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                } else if (((C30301b) arrayList2.get(size4)).f79170a == vVar) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    mo5631h(vVar);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.f79127b.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = this.f79126a.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList3 = (ArrayList) this.f79126a.get(size5);
            if (arrayList3.remove(vVar)) {
                view.setAlpha(1.0f);
                mo5632i(vVar);
                if (arrayList3.isEmpty()) {
                    this.f79126a.remove(size5);
                }
            }
        }
        this.f79131f.remove(vVar);
        this.f79129d.remove(vVar);
        this.f79132g.remove(vVar);
        this.f79130e.remove(vVar);
        mo5849c();
    }

    /* renamed from: a */
    static float m71210a(C1352v vVar, float f) {
        if (vVar.itemView.getContext() != null) {
            return C9432q.m18687b(vVar.itemView.getContext(), f);
        }
        return 12.0f;
    }

    /* renamed from: a */
    private void m71213a(List<C30300a> list, C1352v vVar) {
        for (int size = list.size() - 1; size >= 0; size--) {
            C30300a aVar = (C30300a) list.get(size);
            if (m71214a(aVar, vVar) && aVar.f79164a == null && aVar.f79165b == null) {
                list.remove(aVar);
            }
        }
    }

    /* renamed from: a */
    private boolean m71214a(C30300a aVar, C1352v vVar) {
        boolean z = false;
        if (aVar.f79165b == vVar) {
            aVar.f79165b = null;
        } else if (aVar.f79164a != vVar) {
            return false;
        } else {
            aVar.f79164a = null;
            z = true;
        }
        vVar.itemView.setAlpha(1.0f);
        vVar.itemView.setTranslationX(0.0f);
        vVar.itemView.setTranslationY(0.0f);
        mo5625a(vVar, z);
        return true;
    }

    /* renamed from: a */
    public final boolean mo5627a(C1352v vVar, int i, int i2, int i3, int i4) {
        int i5 = i - i3;
        vVar.itemView.setTranslationX((float) i5);
        vVar.itemView.setAlpha(0.34f);
        vVar.itemView.setScaleX(0.9f);
        vVar.itemView.setScaleY(0.9f);
        vVar.itemView.setTranslationY(m71210a(vVar, 12.0f));
        if (Math.abs(i5) >= vVar.itemView.getWidth() / 2) {
            ArrayList<C30301b> arrayList = this.f79136r;
            C30301b bVar = new C30301b(vVar, i, i2, i3, i4);
            arrayList.add(bVar);
        }
        return true;
    }
}
