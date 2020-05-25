package android.support.p043v7.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.support.p030v4.view.C1056u;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: android.support.v7.widget.w */
public class C1506w extends C1440au {

    /* renamed from: n */
    private static TimeInterpolator f5401n;

    /* renamed from: a */
    ArrayList<ArrayList<C1352v>> f5402a = new ArrayList<>();

    /* renamed from: b */
    ArrayList<ArrayList<C1516b>> f5403b = new ArrayList<>();

    /* renamed from: c */
    ArrayList<ArrayList<C1515a>> f5404c = new ArrayList<>();

    /* renamed from: d */
    ArrayList<C1352v> f5405d = new ArrayList<>();

    /* renamed from: e */
    ArrayList<C1352v> f5406e = new ArrayList<>();

    /* renamed from: f */
    ArrayList<C1352v> f5407f = new ArrayList<>();

    /* renamed from: g */
    ArrayList<C1352v> f5408g = new ArrayList<>();

    /* renamed from: o */
    private ArrayList<C1352v> f5409o = new ArrayList<>();

    /* renamed from: p */
    private ArrayList<C1352v> f5410p = new ArrayList<>();

    /* renamed from: q */
    private ArrayList<C1516b> f5411q = new ArrayList<>();

    /* renamed from: r */
    private ArrayList<C1515a> f5412r = new ArrayList<>();

    /* renamed from: android.support.v7.widget.w$a */
    static class C1515a {

        /* renamed from: a */
        public C1352v f5441a;

        /* renamed from: b */
        public C1352v f5442b;

        /* renamed from: c */
        public int f5443c;

        /* renamed from: d */
        public int f5444d;

        /* renamed from: e */
        public int f5445e;

        /* renamed from: f */
        public int f5446f;

        public final String toString() {
            StringBuilder sb = new StringBuilder("ChangeInfo{oldHolder=");
            sb.append(this.f5441a);
            sb.append(", newHolder=");
            sb.append(this.f5442b);
            sb.append(", fromX=");
            sb.append(this.f5443c);
            sb.append(", fromY=");
            sb.append(this.f5444d);
            sb.append(", toX=");
            sb.append(this.f5445e);
            sb.append(", toY=");
            sb.append(this.f5446f);
            sb.append('}');
            return sb.toString();
        }

        private C1515a(C1352v vVar, C1352v vVar2) {
            this.f5441a = vVar;
            this.f5442b = vVar2;
        }

        C1515a(C1352v vVar, C1352v vVar2, int i, int i2, int i3, int i4) {
            this(vVar, vVar2);
            this.f5443c = i;
            this.f5444d = i2;
            this.f5445e = i3;
            this.f5446f = i4;
        }
    }

    /* renamed from: android.support.v7.widget.w$b */
    static class C1516b {

        /* renamed from: a */
        public C1352v f5447a;

        /* renamed from: b */
        public int f5448b;

        /* renamed from: c */
        public int f5449c;

        /* renamed from: d */
        public int f5450d;

        /* renamed from: e */
        public int f5451e;

        C1516b(C1352v vVar, int i, int i2, int i3, int i4) {
            this.f5447a = vVar;
            this.f5448b = i;
            this.f5449c = i2;
            this.f5450d = i3;
            this.f5451e = i4;
        }
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
    public boolean mo4997b() {
        if (!this.f5410p.isEmpty() || !this.f5412r.isEmpty() || !this.f5411q.isEmpty() || !this.f5409o.isEmpty() || !this.f5406e.isEmpty() || !this.f5407f.isEmpty() || !this.f5405d.isEmpty() || !this.f5408g.isEmpty() || !this.f5403b.isEmpty() || !this.f5402a.isEmpty() || !this.f5404c.isEmpty()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void mo4993a() {
        long j;
        long j2;
        boolean z = !this.f5409o.isEmpty();
        boolean z2 = !this.f5411q.isEmpty();
        boolean z3 = !this.f5412r.isEmpty();
        boolean z4 = !this.f5410p.isEmpty();
        if (z || z2 || z4 || z3) {
            Iterator it = this.f5409o.iterator();
            while (it.hasNext()) {
                final C1352v vVar = (C1352v) it.next();
                final View view = vVar.itemView;
                final ViewPropertyAnimator animate = view.animate();
                this.f5407f.add(vVar);
                animate.setDuration(this.f4729j).alpha(0.0f).setListener(new AnimatorListenerAdapter() {
                    public final void onAnimationStart(Animator animator) {
                    }

                    public final void onAnimationEnd(Animator animator) {
                        animate.setListener(null);
                        view.setAlpha(1.0f);
                        C1506w.this.mo5630g(vVar);
                        C1506w.this.f5407f.remove(vVar);
                        C1506w.this.mo5849c();
                    }
                }).start();
            }
            this.f5409o.clear();
            if (z2) {
                final ArrayList arrayList = new ArrayList();
                arrayList.addAll(this.f5411q);
                this.f5403b.add(arrayList);
                this.f5411q.clear();
                C15071 r6 = new Runnable() {
                    public final void run() {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            C1516b bVar = (C1516b) it.next();
                            C1506w wVar = C1506w.this;
                            C1352v vVar = bVar.f5447a;
                            int i = bVar.f5448b;
                            int i2 = bVar.f5449c;
                            int i3 = bVar.f5450d;
                            int i4 = bVar.f5451e;
                            View view = vVar.itemView;
                            int i5 = i3 - i;
                            int i6 = i4 - i2;
                            if (i5 != 0) {
                                view.animate().translationX(0.0f);
                            }
                            if (i6 != 0) {
                                view.animate().translationY(0.0f);
                            }
                            ViewPropertyAnimator animate = view.animate();
                            wVar.f5406e.add(vVar);
                            ViewPropertyAnimator duration = animate.setDuration(wVar.f4730k);
                            C15126 r2 = new AnimatorListenerAdapter(vVar, i5, view, i6, animate) {

                                /* renamed from: a */
                                final /* synthetic */ C1352v f5427a;

                                /* renamed from: b */
                                final /* synthetic */ int f5428b;

                                /* renamed from: c */
                                final /* synthetic */ View f5429c;

                                /* renamed from: d */
                                final /* synthetic */ int f5430d;

                                /* renamed from: e */
                                final /* synthetic */ ViewPropertyAnimator f5431e;

                                public final void onAnimationStart(Animator animator) {
                                }

                                public final void onAnimationCancel(Animator animator) {
                                    if (this.f5428b != 0) {
                                        this.f5429c.setTranslationX(0.0f);
                                    }
                                    if (this.f5430d != 0) {
                                        this.f5429c.setTranslationY(0.0f);
                                    }
                                }

                                public final void onAnimationEnd(Animator animator) {
                                    this.f5431e.setListener(null);
                                    C1506w.this.mo5631h(this.f5427a);
                                    C1506w.this.f5406e.remove(this.f5427a);
                                    C1506w.this.mo5849c();
                                }

                                {
                                    this.f5427a = r2;
                                    this.f5428b = r3;
                                    this.f5429c = r4;
                                    this.f5430d = r5;
                                    this.f5431e = r6;
                                }
                            };
                            duration.setListener(r2).start();
                        }
                        arrayList.clear();
                        C1506w.this.f5403b.remove(arrayList);
                    }
                };
                if (z) {
                    C1056u.m3035a(((C1516b) arrayList.get(0)).f5447a.itemView, (Runnable) r6, this.f4729j);
                } else {
                    r6.run();
                }
            }
            if (z3) {
                final ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(this.f5412r);
                this.f5404c.add(arrayList2);
                this.f5412r.clear();
                C15082 r62 = new Runnable() {
                    public final void run() {
                        View view;
                        Iterator it = arrayList2.iterator();
                        while (it.hasNext()) {
                            C1515a aVar = (C1515a) it.next();
                            C1506w wVar = C1506w.this;
                            C1352v vVar = aVar.f5441a;
                            View view2 = null;
                            if (vVar == null) {
                                view = null;
                            } else {
                                view = vVar.itemView;
                            }
                            C1352v vVar2 = aVar.f5442b;
                            if (vVar2 != null) {
                                view2 = vVar2.itemView;
                            }
                            if (view != null) {
                                ViewPropertyAnimator duration = view.animate().setDuration(wVar.f4731l);
                                wVar.f5408g.add(aVar.f5441a);
                                duration.translationX((float) (aVar.f5445e - aVar.f5443c));
                                duration.translationY((float) (aVar.f5446f - aVar.f5444d));
                                duration.alpha(0.0f).setListener(new AnimatorListenerAdapter(aVar, duration, view) {

                                    /* renamed from: a */
                                    final /* synthetic */ C1515a f5433a;

                                    /* renamed from: b */
                                    final /* synthetic */ ViewPropertyAnimator f5434b;

                                    /* renamed from: c */
                                    final /* synthetic */ View f5435c;

                                    public final void onAnimationStart(Animator animator) {
                                    }

                                    public final void onAnimationEnd(Animator animator) {
                                        this.f5434b.setListener(null);
                                        this.f5435c.setAlpha(1.0f);
                                        this.f5435c.setTranslationX(0.0f);
                                        this.f5435c.setTranslationY(0.0f);
                                        C1506w.this.mo5625a(this.f5433a.f5441a, true);
                                        C1506w.this.f5408g.remove(this.f5433a.f5441a);
                                        C1506w.this.mo5849c();
                                    }

                                    {
                                        this.f5433a = r2;
                                        this.f5434b = r3;
                                        this.f5435c = r4;
                                    }
                                }).start();
                            }
                            if (view2 != null) {
                                ViewPropertyAnimator animate = view2.animate();
                                wVar.f5408g.add(aVar.f5442b);
                                animate.translationX(0.0f).translationY(0.0f).setDuration(wVar.f4731l).alpha(1.0f).setListener(new AnimatorListenerAdapter(aVar, animate, view2) {

                                    /* renamed from: a */
                                    final /* synthetic */ C1515a f5437a;

                                    /* renamed from: b */
                                    final /* synthetic */ ViewPropertyAnimator f5438b;

                                    /* renamed from: c */
                                    final /* synthetic */ View f5439c;

                                    public final void onAnimationStart(Animator animator) {
                                    }

                                    public final void onAnimationEnd(Animator animator) {
                                        this.f5438b.setListener(null);
                                        this.f5439c.setAlpha(1.0f);
                                        this.f5439c.setTranslationX(0.0f);
                                        this.f5439c.setTranslationY(0.0f);
                                        C1506w.this.mo5625a(this.f5437a.f5442b, false);
                                        C1506w.this.f5408g.remove(this.f5437a.f5442b);
                                        C1506w.this.mo5849c();
                                    }

                                    {
                                        this.f5437a = r2;
                                        this.f5438b = r3;
                                        this.f5439c = r4;
                                    }
                                }).start();
                            }
                        }
                        arrayList2.clear();
                        C1506w.this.f5404c.remove(arrayList2);
                    }
                };
                if (z) {
                    C1056u.m3035a(((C1515a) arrayList2.get(0)).f5441a.itemView, (Runnable) r62, this.f4729j);
                } else {
                    r62.run();
                }
            }
            if (z4) {
                final ArrayList arrayList3 = new ArrayList();
                arrayList3.addAll(this.f5410p);
                this.f5402a.add(arrayList3);
                this.f5410p.clear();
                C15093 r5 = new Runnable() {
                    public final void run() {
                        Iterator it = arrayList3.iterator();
                        while (it.hasNext()) {
                            C1352v vVar = (C1352v) it.next();
                            C1506w wVar = C1506w.this;
                            View view = vVar.itemView;
                            ViewPropertyAnimator animate = view.animate();
                            wVar.f5405d.add(vVar);
                            animate.alpha(1.0f).setDuration(wVar.f4728i).setListener(new AnimatorListenerAdapter(vVar, view, animate) {

                                /* renamed from: a */
                                final /* synthetic */ C1352v f5423a;

                                /* renamed from: b */
                                final /* synthetic */ View f5424b;

                                /* renamed from: c */
                                final /* synthetic */ ViewPropertyAnimator f5425c;

                                public final void onAnimationStart(Animator animator) {
                                }

                                public final void onAnimationCancel(Animator animator) {
                                    this.f5424b.setAlpha(1.0f);
                                }

                                public final void onAnimationEnd(Animator animator) {
                                    this.f5425c.setListener(null);
                                    C1506w.this.mo5632i(this.f5423a);
                                    C1506w.this.f5405d.remove(this.f5423a);
                                    C1506w.this.mo5849c();
                                }

                                {
                                    this.f5423a = r2;
                                    this.f5424b = r3;
                                    this.f5425c = r4;
                                }
                            }).start();
                        }
                        arrayList3.clear();
                        C1506w.this.f5402a.remove(arrayList3);
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

    /* renamed from: d */
    public void mo5001d() {
        int size = this.f5411q.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            C1516b bVar = (C1516b) this.f5411q.get(size);
            View view = bVar.f5447a.itemView;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            mo5631h(bVar.f5447a);
            this.f5411q.remove(size);
        }
        for (int size2 = this.f5409o.size() - 1; size2 >= 0; size2--) {
            mo5630g((C1352v) this.f5409o.get(size2));
            this.f5409o.remove(size2);
        }
        int size3 = this.f5410p.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            C1352v vVar = (C1352v) this.f5410p.get(size3);
            vVar.itemView.setAlpha(1.0f);
            mo5632i(vVar);
            this.f5410p.remove(size3);
        }
        for (int size4 = this.f5412r.size() - 1; size4 >= 0; size4--) {
            m5409a((C1515a) this.f5412r.get(size4));
        }
        this.f5412r.clear();
        if (mo4997b()) {
            for (int size5 = this.f5403b.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList = (ArrayList) this.f5403b.get(size5);
                for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                    C1516b bVar2 = (C1516b) arrayList.get(size6);
                    View view2 = bVar2.f5447a.itemView;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    mo5631h(bVar2.f5447a);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.f5403b.remove(arrayList);
                    }
                }
            }
            for (int size7 = this.f5402a.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList2 = (ArrayList) this.f5402a.get(size7);
                for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                    C1352v vVar2 = (C1352v) arrayList2.get(size8);
                    vVar2.itemView.setAlpha(1.0f);
                    mo5632i(vVar2);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.f5402a.remove(arrayList2);
                    }
                }
            }
            for (int size9 = this.f5404c.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList3 = (ArrayList) this.f5404c.get(size9);
                for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                    m5409a((C1515a) arrayList3.get(size10));
                    if (arrayList3.isEmpty()) {
                        this.f5404c.remove(arrayList3);
                    }
                }
            }
            m5410a((List<C1352v>) this.f5407f);
            m5410a((List<C1352v>) this.f5406e);
            m5410a((List<C1352v>) this.f5405d);
            m5410a((List<C1352v>) this.f5408g);
            mo5002e();
        }
    }

    /* renamed from: a */
    public boolean mo5626a(C1352v vVar) {
        m5413j(vVar);
        this.f5409o.add(vVar);
        return true;
    }

    /* renamed from: b */
    public boolean mo5629b(C1352v vVar) {
        m5413j(vVar);
        vVar.itemView.setAlpha(0.0f);
        this.f5410p.add(vVar);
        return true;
    }

    /* renamed from: a */
    private void m5409a(C1515a aVar) {
        if (aVar.f5441a != null) {
            m5412a(aVar, aVar.f5441a);
        }
        if (aVar.f5442b != null) {
            m5412a(aVar, aVar.f5442b);
        }
    }

    /* renamed from: j */
    private void m5413j(C1352v vVar) {
        if (f5401n == null) {
            f5401n = new ValueAnimator().getInterpolator();
        }
        vVar.itemView.animate().setInterpolator(f5401n);
        mo4999c(vVar);
    }

    /* renamed from: a */
    private static void m5410a(List<C1352v> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            ((C1352v) list.get(size)).itemView.animate().cancel();
        }
    }

    /* renamed from: c */
    public void mo4999c(C1352v vVar) {
        View view = vVar.itemView;
        view.animate().cancel();
        int size = this.f5411q.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (((C1516b) this.f5411q.get(size)).f5447a == vVar) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                mo5631h(vVar);
                this.f5411q.remove(size);
            }
        }
        m5411a((List<C1515a>) this.f5412r, vVar);
        if (this.f5409o.remove(vVar)) {
            view.setAlpha(1.0f);
            mo5630g(vVar);
        }
        if (this.f5410p.remove(vVar)) {
            view.setAlpha(1.0f);
            mo5632i(vVar);
        }
        for (int size2 = this.f5404c.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList = (ArrayList) this.f5404c.get(size2);
            m5411a((List<C1515a>) arrayList, vVar);
            if (arrayList.isEmpty()) {
                this.f5404c.remove(size2);
            }
        }
        for (int size3 = this.f5403b.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList2 = (ArrayList) this.f5403b.get(size3);
            int size4 = arrayList2.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                } else if (((C1516b) arrayList2.get(size4)).f5447a == vVar) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    mo5631h(vVar);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.f5403b.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = this.f5402a.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList3 = (ArrayList) this.f5402a.get(size5);
            if (arrayList3.remove(vVar)) {
                view.setAlpha(1.0f);
                mo5632i(vVar);
                if (arrayList3.isEmpty()) {
                    this.f5402a.remove(size5);
                }
            }
        }
        this.f5407f.remove(vVar);
        this.f5405d.remove(vVar);
        this.f5408g.remove(vVar);
        this.f5406e.remove(vVar);
        mo5849c();
    }

    /* renamed from: a */
    private void m5411a(List<C1515a> list, C1352v vVar) {
        for (int size = list.size() - 1; size >= 0; size--) {
            C1515a aVar = (C1515a) list.get(size);
            if (m5412a(aVar, vVar) && aVar.f5441a == null && aVar.f5442b == null) {
                list.remove(aVar);
            }
        }
    }

    /* renamed from: a */
    private boolean m5412a(C1515a aVar, C1352v vVar) {
        boolean z = false;
        if (aVar.f5442b == vVar) {
            aVar.f5442b = null;
        } else if (aVar.f5441a != vVar) {
            return false;
        } else {
            aVar.f5441a = null;
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
        View view = vVar.itemView;
        int translationX = i + ((int) vVar.itemView.getTranslationX());
        int translationY = i2 + ((int) vVar.itemView.getTranslationY());
        m5413j(vVar);
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 == 0 && i6 == 0) {
            mo5631h(vVar);
            return false;
        }
        if (i5 != 0) {
            view.setTranslationX((float) (-i5));
        }
        if (i6 != 0) {
            view.setTranslationY((float) (-i6));
        }
        ArrayList<C1516b> arrayList = this.f5411q;
        C1516b bVar = new C1516b(vVar, translationX, translationY, i3, i4);
        arrayList.add(bVar);
        return true;
    }

    /* renamed from: a */
    public boolean mo5628a(C1352v vVar, C1352v vVar2, int i, int i2, int i3, int i4) {
        if (vVar == vVar2) {
            return mo5627a(vVar, i, i2, i3, i4);
        }
        float translationX = vVar.itemView.getTranslationX();
        float translationY = vVar.itemView.getTranslationY();
        float alpha = vVar.itemView.getAlpha();
        m5413j(vVar);
        int i5 = (int) (((float) (i3 - i)) - translationX);
        int i6 = (int) (((float) (i4 - i2)) - translationY);
        vVar.itemView.setTranslationX(translationX);
        vVar.itemView.setTranslationY(translationY);
        vVar.itemView.setAlpha(alpha);
        if (vVar2 != null) {
            m5413j(vVar2);
            vVar2.itemView.setTranslationX((float) (-i5));
            vVar2.itemView.setTranslationY((float) (-i6));
            vVar2.itemView.setAlpha(0.0f);
        }
        ArrayList<C1515a> arrayList = this.f5412r;
        C1515a aVar = new C1515a(vVar, vVar2, i, i2, i3, i4);
        arrayList.add(aVar);
        return true;
    }
}
