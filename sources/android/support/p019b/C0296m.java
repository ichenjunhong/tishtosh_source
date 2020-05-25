package android.support.p019b;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.graphics.Path;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.support.p030v4.p038f.C0777a;
import android.support.p030v4.p038f.C0785g;
import android.support.p030v4.p038f.C0800n;
import android.support.p030v4.view.C1056u;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: android.support.b.m */
public abstract class C0296m implements Cloneable {

    /* renamed from: C */
    private static ThreadLocal<C0777a<Animator, C0300a>> f708C = new ThreadLocal<>();

    /* renamed from: a */
    private static final int[] f709a = {2, 1, 3, 4};

    /* renamed from: p */
    private static final C0281g f710p = new C0281g() {
        /* renamed from: a */
        public final Path mo579a(float f, float f2, float f3, float f4) {
            Path path = new Path();
            path.moveTo(f, f2);
            path.lineTo(f3, f4);
            return path;
        }
    };

    /* renamed from: A */
    private ArrayList<C0312s> f711A;

    /* renamed from: B */
    private ArrayList<C0312s> f712B;

    /* renamed from: D */
    private ViewGroup f713D = null;

    /* renamed from: E */
    private int f714E = 0;

    /* renamed from: F */
    private boolean f715F = false;

    /* renamed from: G */
    private boolean f716G = false;

    /* renamed from: H */
    private ArrayList<C0302c> f717H = null;

    /* renamed from: I */
    private ArrayList<Animator> f718I = new ArrayList<>();

    /* renamed from: J */
    private C0777a<String, String> f719J;

    /* renamed from: b */
    public String f720b = getClass().getName();

    /* renamed from: c */
    public long f721c = -1;

    /* renamed from: d */
    public long f722d = -1;

    /* renamed from: e */
    public TimeInterpolator f723e = null;

    /* renamed from: f */
    public ArrayList<Integer> f724f = new ArrayList<>();

    /* renamed from: g */
    public ArrayList<View> f725g = new ArrayList<>();

    /* renamed from: h */
    public ArrayList<String> f726h = null;

    /* renamed from: i */
    public ArrayList<Class> f727i = null;

    /* renamed from: j */
    C0308q f728j = null;

    /* renamed from: k */
    boolean f729k = false;

    /* renamed from: l */
    ArrayList<Animator> f730l = new ArrayList<>();

    /* renamed from: m */
    public C0307p f731m;

    /* renamed from: n */
    public C0301b f732n;

    /* renamed from: o */
    public C0281g f733o = f710p;

    /* renamed from: q */
    private ArrayList<Integer> f734q = null;

    /* renamed from: r */
    private ArrayList<View> f735r = null;

    /* renamed from: s */
    private ArrayList<Class> f736s = null;

    /* renamed from: t */
    private ArrayList<String> f737t = null;

    /* renamed from: u */
    private ArrayList<Integer> f738u = null;

    /* renamed from: v */
    private ArrayList<View> f739v = null;

    /* renamed from: w */
    private ArrayList<Class> f740w = null;

    /* renamed from: x */
    private C0313t f741x = new C0313t();

    /* renamed from: y */
    private C0313t f742y = new C0313t();

    /* renamed from: z */
    private int[] f743z = f709a;

    /* renamed from: android.support.b.m$a */
    static class C0300a {

        /* renamed from: a */
        View f747a;

        /* renamed from: b */
        String f748b;

        /* renamed from: c */
        C0312s f749c;

        /* renamed from: d */
        C0258an f750d;

        /* renamed from: e */
        C0296m f751e;

        C0300a(View view, String str, C0296m mVar, C0258an anVar, C0312s sVar) {
            this.f747a = view;
            this.f748b = str;
            this.f749c = sVar;
            this.f750d = anVar;
            this.f751e = mVar;
        }
    }

    /* renamed from: android.support.b.m$b */
    public static abstract class C0301b {
        /* renamed from: a */
        public abstract Rect mo578a(C0296m mVar);
    }

    /* renamed from: android.support.b.m$c */
    public interface C0302c {
        /* renamed from: a */
        void mo530a(C0296m mVar);

        /* renamed from: b */
        void mo531b(C0296m mVar);

        /* renamed from: c */
        void mo532c(C0296m mVar);

        /* renamed from: d */
        void mo533d(C0296m mVar);
    }

    /* renamed from: a */
    public Animator mo522a(ViewGroup viewGroup, C0312s sVar, C0312s sVar2) {
        return null;
    }

    /* renamed from: a */
    public abstract void mo524a(C0312s sVar);

    /* renamed from: a */
    public String[] mo526a() {
        return null;
    }

    /* renamed from: b */
    public abstract void mo528b(C0312s sVar);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo596a(ViewGroup viewGroup, C0313t tVar, C0313t tVar2, ArrayList<C0312s> arrayList, ArrayList<C0312s> arrayList2) {
        int i;
        int i2;
        View view;
        Animator animator;
        C0312s sVar;
        Animator animator2;
        C0312s sVar2;
        ViewGroup viewGroup2 = viewGroup;
        C0777a f = mo626f();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        long j = Long.MAX_VALUE;
        int i3 = 0;
        while (i3 < size) {
            C0312s sVar3 = (C0312s) arrayList.get(i3);
            C0312s sVar4 = (C0312s) arrayList2.get(i3);
            if (sVar3 != null && !sVar3.f772c.contains(this)) {
                sVar3 = null;
            }
            if (sVar4 != null && !sVar4.f772c.contains(this)) {
                sVar4 = null;
            }
            if (!(sVar3 == null && sVar4 == null)) {
                if (sVar3 == null || sVar4 == null || mo525a(sVar3, sVar4)) {
                    Animator a = mo522a(viewGroup2, sVar3, sVar4);
                    if (a != null) {
                        if (sVar4 != null) {
                            view = sVar4.f771b;
                            String[] a2 = mo526a();
                            if (view != null && a2 != null && a2.length > 0) {
                                sVar2 = new C0312s();
                                sVar2.f771b = view;
                                animator2 = a;
                                i2 = size;
                                C0312s sVar5 = (C0312s) tVar2.f773a.get(view);
                                if (sVar5 != null) {
                                    int i4 = 0;
                                    while (i4 < a2.length) {
                                        int i5 = i3;
                                        C0312s sVar6 = sVar5;
                                        sVar2.f770a.put(a2[i4], sVar5.f770a.get(a2[i4]));
                                        i4++;
                                        i3 = i5;
                                        sVar5 = sVar6;
                                        ArrayList<C0312s> arrayList3 = arrayList2;
                                    }
                                }
                                i = i3;
                                int size2 = f.size();
                                int i6 = 0;
                                while (true) {
                                    if (i6 >= size2) {
                                        break;
                                    }
                                    C0300a aVar = (C0300a) f.get((Animator) f.mo2576b(i6));
                                    if (aVar.f749c != null && aVar.f747a == view && aVar.f748b.equals(this.f720b) && aVar.f749c.equals(sVar2)) {
                                        sVar = sVar2;
                                        animator = null;
                                        break;
                                    }
                                    i6++;
                                }
                            } else {
                                animator2 = a;
                                i2 = size;
                                i = i3;
                                sVar2 = null;
                            }
                            sVar = sVar2;
                            animator = animator2;
                        } else {
                            Animator animator3 = a;
                            i2 = size;
                            i = i3;
                            view = sVar3.f771b;
                            animator = animator3;
                            sVar = null;
                        }
                        if (animator != null) {
                            if (this.f731m != null) {
                                long a3 = this.f731m.mo583a(viewGroup2, this, sVar3, sVar4);
                                sparseIntArray.put(this.f718I.size(), (int) a3);
                                j = Math.min(a3, j);
                            }
                            long j2 = j;
                            C0300a aVar2 = new C0300a(view, this.f720b, this, C0244ae.m502b(viewGroup), sVar);
                            f.put(animator, aVar2);
                            this.f718I.add(animator);
                            j = j2;
                        }
                        i3 = i + 1;
                        size = i2;
                    }
                }
            }
            i2 = size;
            i = i3;
            i3 = i + 1;
            size = i2;
        }
        if (j != 0) {
            for (int i7 = 0; i7 < sparseIntArray.size(); i7++) {
                Animator animator4 = (Animator) this.f718I.get(sparseIntArray.keyAt(i7));
                animator4.setStartDelay((((long) sparseIntArray.valueAt(i7)) - j) + animator4.getStartDelay());
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo599a(View view) {
        int id = view.getId();
        if (this.f734q != null && this.f734q.contains(Integer.valueOf(id))) {
            return false;
        }
        if (this.f735r != null && this.f735r.contains(view)) {
            return false;
        }
        if (this.f736s != null) {
            int size = this.f736s.size();
            for (int i = 0; i < size; i++) {
                if (((Class) this.f736s.get(i)).isInstance(view)) {
                    return false;
                }
            }
        }
        if (this.f737t != null && C1056u.m3070p(view) != null && this.f737t.contains(C1056u.m3070p(view))) {
            return false;
        }
        if ((this.f724f.size() == 0 && this.f725g.size() == 0 && ((this.f727i == null || this.f727i.isEmpty()) && (this.f726h == null || this.f726h.isEmpty()))) || this.f724f.contains(Integer.valueOf(id)) || this.f725g.contains(view)) {
            return true;
        }
        if (this.f726h != null && this.f726h.contains(C1056u.m3070p(view))) {
            return true;
        }
        if (this.f727i != null) {
            for (int i2 = 0; i2 < this.f727i.size(); i2++) {
                if (((Class) this.f727i.get(i2)).isInstance(view)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo597a(ViewGroup viewGroup, boolean z) {
        mo598a(z);
        if ((this.f724f.size() > 0 || this.f725g.size() > 0) && ((this.f726h == null || this.f726h.isEmpty()) && (this.f727i == null || this.f727i.isEmpty()))) {
            for (int i = 0; i < this.f724f.size(); i++) {
                View findViewById = viewGroup.findViewById(((Integer) this.f724f.get(i)).intValue());
                if (findViewById != null) {
                    C0312s sVar = new C0312s();
                    sVar.f771b = findViewById;
                    if (z) {
                        mo524a(sVar);
                    } else {
                        mo528b(sVar);
                    }
                    sVar.f772c.add(this);
                    mo608c(sVar);
                    if (z) {
                        m600a(this.f741x, findViewById, sVar);
                    } else {
                        m600a(this.f742y, findViewById, sVar);
                    }
                }
            }
            for (int i2 = 0; i2 < this.f725g.size(); i2++) {
                View view = (View) this.f725g.get(i2);
                C0312s sVar2 = new C0312s();
                sVar2.f771b = view;
                if (z) {
                    mo524a(sVar2);
                } else {
                    mo528b(sVar2);
                }
                sVar2.f772c.add(this);
                mo608c(sVar2);
                if (z) {
                    m600a(this.f741x, view, sVar2);
                } else {
                    m600a(this.f742y, view, sVar2);
                }
            }
        } else {
            m602c(viewGroup, z);
        }
        if (!z && this.f719J != null) {
            int size = this.f719J.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i3 = 0; i3 < size; i3++) {
                arrayList.add(this.f741x.f776d.remove((String) this.f719J.mo2576b(i3)));
            }
            for (int i4 = 0; i4 < size; i4++) {
                View view2 = (View) arrayList.get(i4);
                if (view2 != null) {
                    this.f741x.f776d.put((String) this.f719J.mo2577c(i4), view2);
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo598a(boolean z) {
        if (z) {
            this.f741x.f773a.clear();
            this.f741x.f774b.clear();
            this.f741x.f775c.mo2495c();
            return;
        }
        this.f742y.f773a.clear();
        this.f742y.f774b.clear();
        this.f742y.f775c.mo2495c();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo595a(ViewGroup viewGroup) {
        this.f711A = new ArrayList<>();
        this.f712B = new ArrayList<>();
        m599a(this.f741x, this.f742y);
        C0777a f = mo626f();
        int size = f.size();
        C0258an b = C0244ae.m502b(viewGroup);
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = (Animator) f.mo2576b(i);
            if (animator != null) {
                C0300a aVar = (C0300a) f.get(animator);
                if (!(aVar == null || aVar.f747a == null || !b.equals(aVar.f750d))) {
                    C0312s sVar = aVar.f749c;
                    View view = aVar.f747a;
                    C0312s a = mo590a(view, true);
                    C0312s b2 = mo604b(view, true);
                    if (!(a == null && b2 == null) && aVar.f751e.mo525a(sVar, b2)) {
                        if (animator.isRunning() || animator.isStarted()) {
                            animator.cancel();
                        } else {
                            f.remove(animator);
                        }
                    }
                }
            }
        }
        mo596a(viewGroup, this.f741x, this.f742y, this.f711A, this.f712B);
        mo605b();
    }

    /* renamed from: a */
    public boolean mo525a(C0312s sVar, C0312s sVar2) {
        if (!(sVar == null || sVar2 == null)) {
            String[] a = mo526a();
            if (a != null) {
                for (String a2 : a) {
                    if (m601a(sVar, sVar2, a2)) {
                        return true;
                    }
                }
            } else {
                for (String a3 : sVar.f770a.keySet()) {
                    if (m601a(sVar, sVar2, a3)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public void mo593a(C0301b bVar) {
        this.f732n = bVar;
    }

    /* renamed from: a */
    public void mo594a(C0307p pVar) {
        this.f731m = pVar;
    }

    public String toString() {
        return mo591a("");
    }

    /* renamed from: f */
    private static C0777a<Animator, C0300a> mo626f() {
        C0777a<Animator, C0300a> aVar = (C0777a) f708C.get();
        if (aVar != null) {
            return aVar;
        }
        C0777a<Animator, C0300a> aVar2 = new C0777a<>();
        f708C.set(aVar2);
        return aVar2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo607c() {
        if (this.f714E == 0) {
            if (this.f717H != null && this.f717H.size() > 0) {
                ArrayList arrayList = (ArrayList) this.f717H.clone();
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((C0302c) arrayList.get(i)).mo533d(this);
                }
            }
            this.f716G = false;
        }
        this.f714E++;
    }

    /* renamed from: e */
    public C0296m clone() {
        try {
            C0296m mVar = (C0296m) super.clone();
            mVar.f718I = new ArrayList<>();
            mVar.f741x = new C0313t();
            mVar.f742y = new C0313t();
            mVar.f711A = null;
            mVar.f712B = null;
            return mVar;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo605b() {
        mo607c();
        final C0777a f = mo626f();
        Iterator it = this.f718I.iterator();
        while (it.hasNext()) {
            Animator animator = (Animator) it.next();
            if (f.containsKey(animator)) {
                mo607c();
                if (animator != null) {
                    animator.addListener(new AnimatorListenerAdapter() {
                        public final void onAnimationStart(Animator animator) {
                            C0296m.this.f730l.add(animator);
                        }

                        public final void onAnimationEnd(Animator animator) {
                            f.remove(animator);
                            C0296m.this.f730l.remove(animator);
                        }
                    });
                    if (animator == null) {
                        mo610d();
                    } else {
                        if (this.f722d >= 0) {
                            animator.setDuration(this.f722d);
                        }
                        if (this.f721c >= 0) {
                            animator.setStartDelay(this.f721c);
                        }
                        if (this.f723e != null) {
                            animator.setInterpolator(this.f723e);
                        }
                        animator.addListener(new AnimatorListenerAdapter() {
                            public final void onAnimationEnd(Animator animator) {
                                C0296m.this.mo610d();
                                animator.removeListener(this);
                            }
                        });
                        animator.start();
                    }
                }
            }
        }
        this.f718I.clear();
        mo610d();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo610d() {
        this.f714E--;
        if (this.f714E == 0) {
            if (this.f717H != null && this.f717H.size() > 0) {
                ArrayList arrayList = (ArrayList) this.f717H.clone();
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((C0302c) arrayList.get(i)).mo530a(this);
                }
            }
            for (int i2 = 0; i2 < this.f741x.f775c.mo2490b(); i2++) {
                View view = (View) this.f741x.f775c.mo2494c(i2);
                if (view != null) {
                    C1056u.m3037a(view, false);
                }
            }
            for (int i3 = 0; i3 < this.f742y.f775c.mo2490b(); i3++) {
                View view2 = (View) this.f742y.f775c.mo2494c(i3);
                if (view2 != null) {
                    C1056u.m3037a(view2, false);
                }
            }
            this.f716G = true;
        }
    }

    /* renamed from: b */
    public C0296m mo601b(long j) {
        this.f721c = j;
        return this;
    }

    /* renamed from: a */
    public C0296m mo587a(long j) {
        this.f722d = j;
        return this;
    }

    /* renamed from: b */
    public C0296m mo603b(View view) {
        this.f725g.add(view);
        return this;
    }

    /* renamed from: c */
    public C0296m mo606c(View view) {
        this.f725g.remove(view);
        return this;
    }

    /* renamed from: a */
    public C0296m mo588a(TimeInterpolator timeInterpolator) {
        this.f723e = timeInterpolator;
        return this;
    }

    /* renamed from: b */
    public C0296m mo600b(int i) {
        if (i != 0) {
            this.f724f.add(Integer.valueOf(i));
        }
        return this;
    }

    /* renamed from: b */
    public C0296m mo602b(C0302c cVar) {
        if (this.f717H == null) {
            return this;
        }
        this.f717H.remove(cVar);
        if (this.f717H.size() == 0) {
            this.f717H = null;
        }
        return this;
    }

    /* renamed from: a */
    public C0296m mo589a(C0302c cVar) {
        if (this.f717H == null) {
            this.f717H = new ArrayList<>();
        }
        this.f717H.add(cVar);
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo608c(C0312s sVar) {
        if (this.f731m != null && !sVar.f770a.isEmpty()) {
            String[] a = this.f731m.mo539a();
            if (a != null) {
                boolean z = false;
                int i = 0;
                while (true) {
                    if (i >= a.length) {
                        z = true;
                        break;
                    } else if (!sVar.f770a.containsKey(a[i])) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (!z) {
                    this.f731m.mo538a(sVar);
                }
            }
        }
    }

    /* renamed from: d */
    public void mo611d(View view) {
        int i;
        if (!this.f716G) {
            C0777a f = mo626f();
            int size = f.size();
            C0258an b = C0244ae.m502b(view);
            int i2 = size - 1;
            while (true) {
                i = 0;
                if (i2 < 0) {
                    break;
                }
                C0300a aVar = (C0300a) f.mo2577c(i2);
                if (aVar.f747a != null && b.equals(aVar.f750d)) {
                    Animator animator = (Animator) f.mo2576b(i2);
                    if (VERSION.SDK_INT >= 19) {
                        animator.pause();
                    } else {
                        ArrayList listeners = animator.getListeners();
                        if (listeners != null) {
                            int size2 = listeners.size();
                            while (i < size2) {
                                AnimatorListener animatorListener = (AnimatorListener) listeners.get(i);
                                if (animatorListener instanceof C0238a) {
                                    ((C0238a) animatorListener).onAnimationPause(animator);
                                }
                                i++;
                            }
                        }
                    }
                }
                i2--;
            }
            if (this.f717H != null && this.f717H.size() > 0) {
                ArrayList arrayList = (ArrayList) this.f717H.clone();
                int size3 = arrayList.size();
                while (i < size3) {
                    ((C0302c) arrayList.get(i)).mo531b(this);
                    i++;
                }
            }
            this.f715F = true;
        }
    }

    /* renamed from: e */
    public void mo613e(View view) {
        if (this.f715F) {
            if (!this.f716G) {
                C0777a f = mo626f();
                int size = f.size();
                C0258an b = C0244ae.m502b(view);
                for (int i = size - 1; i >= 0; i--) {
                    C0300a aVar = (C0300a) f.mo2577c(i);
                    if (aVar.f747a != null && b.equals(aVar.f750d)) {
                        Animator animator = (Animator) f.mo2576b(i);
                        if (VERSION.SDK_INT >= 19) {
                            animator.resume();
                        } else {
                            ArrayList listeners = animator.getListeners();
                            if (listeners != null) {
                                int size2 = listeners.size();
                                for (int i2 = 0; i2 < size2; i2++) {
                                    AnimatorListener animatorListener = (AnimatorListener) listeners.get(i2);
                                    if (animatorListener instanceof C0238a) {
                                        ((C0238a) animatorListener).onAnimationResume(animator);
                                    }
                                }
                            }
                        }
                    }
                }
                if (this.f717H != null && this.f717H.size() > 0) {
                    ArrayList arrayList = (ArrayList) this.f717H.clone();
                    int size3 = arrayList.size();
                    for (int i3 = 0; i3 < size3; i3++) {
                        ((C0302c) arrayList.get(i3)).mo532c(this);
                    }
                }
            }
            this.f715F = false;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public String mo591a(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(getClass().getSimpleName());
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(": ");
        String sb2 = sb.toString();
        if (this.f722d != -1) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(sb2);
            sb3.append("dur(");
            sb3.append(this.f722d);
            sb3.append(") ");
            sb2 = sb3.toString();
        }
        if (this.f721c != -1) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(sb2);
            sb4.append("dly(");
            sb4.append(this.f721c);
            sb4.append(") ");
            sb2 = sb4.toString();
        }
        if (this.f723e != null) {
            StringBuilder sb5 = new StringBuilder();
            sb5.append(sb2);
            sb5.append("interp(");
            sb5.append(this.f723e);
            sb5.append(") ");
            sb2 = sb5.toString();
        }
        if (this.f724f.size() <= 0 && this.f725g.size() <= 0) {
            return sb2;
        }
        StringBuilder sb6 = new StringBuilder();
        sb6.append(sb2);
        sb6.append("tgts(");
        String sb7 = sb6.toString();
        if (this.f724f.size() > 0) {
            String str2 = sb7;
            for (int i = 0; i < this.f724f.size(); i++) {
                if (i > 0) {
                    StringBuilder sb8 = new StringBuilder();
                    sb8.append(str2);
                    sb8.append(", ");
                    str2 = sb8.toString();
                }
                StringBuilder sb9 = new StringBuilder();
                sb9.append(str2);
                sb9.append(this.f724f.get(i));
                str2 = sb9.toString();
            }
            sb7 = str2;
        }
        if (this.f725g.size() > 0) {
            for (int i2 = 0; i2 < this.f725g.size(); i2++) {
                if (i2 > 0) {
                    StringBuilder sb10 = new StringBuilder();
                    sb10.append(sb7);
                    sb10.append(", ");
                    sb7 = sb10.toString();
                }
                StringBuilder sb11 = new StringBuilder();
                sb11.append(sb7);
                sb11.append(this.f725g.get(i2));
                sb7 = sb11.toString();
            }
        }
        StringBuilder sb12 = new StringBuilder();
        sb12.append(sb7);
        sb12.append(")");
        return sb12.toString();
    }

    /* renamed from: a */
    public void mo592a(C0281g gVar) {
        if (gVar == null) {
            this.f733o = f710p;
        } else {
            this.f733o = gVar;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final C0312s mo604b(View view, boolean z) {
        ArrayList<C0312s> arrayList;
        ArrayList<C0312s> arrayList2;
        C0296m mVar = this;
        while (mVar.f728j != null) {
            mVar = mVar.f728j;
        }
        if (z) {
            arrayList = mVar.f711A;
        } else {
            arrayList = mVar.f712B;
        }
        C0312s sVar = null;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i = -1;
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            C0312s sVar2 = (C0312s) arrayList.get(i2);
            if (sVar2 == null) {
                return null;
            }
            if (sVar2.f771b == view) {
                i = i2;
                break;
            }
            i2++;
        }
        if (i >= 0) {
            if (z) {
                arrayList2 = mVar.f712B;
            } else {
                arrayList2 = mVar.f711A;
            }
            sVar = (C0312s) arrayList2.get(i);
        }
        return sVar;
    }

    /* renamed from: c */
    private void m602c(View view, boolean z) {
        if (view != null) {
            int id = view.getId();
            if (this.f734q != null && this.f734q.contains(Integer.valueOf(id))) {
                return;
            }
            if (this.f735r == null || !this.f735r.contains(view)) {
                if (this.f736s != null) {
                    int size = this.f736s.size();
                    int i = 0;
                    while (i < size) {
                        if (!((Class) this.f736s.get(i)).isInstance(view)) {
                            i++;
                        } else {
                            return;
                        }
                    }
                }
                if (view.getParent() instanceof ViewGroup) {
                    C0312s sVar = new C0312s();
                    sVar.f771b = view;
                    if (z) {
                        mo524a(sVar);
                    } else {
                        mo528b(sVar);
                    }
                    sVar.f772c.add(this);
                    mo608c(sVar);
                    if (z) {
                        m600a(this.f741x, view, sVar);
                    } else {
                        m600a(this.f742y, view, sVar);
                    }
                }
                if ((view instanceof ViewGroup) && (this.f738u == null || !this.f738u.contains(Integer.valueOf(id)))) {
                    if (this.f739v == null || !this.f739v.contains(view)) {
                        if (this.f740w != null) {
                            int size2 = this.f740w.size();
                            int i2 = 0;
                            while (i2 < size2) {
                                if (!((Class) this.f740w.get(i2)).isInstance(view)) {
                                    i2++;
                                } else {
                                    return;
                                }
                            }
                        }
                        ViewGroup viewGroup = (ViewGroup) view;
                        for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                            m602c(viewGroup.getChildAt(i3), z);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final C0312s mo590a(View view, boolean z) {
        C0313t tVar;
        C0296m mVar = this;
        while (mVar.f728j != null) {
            mVar = mVar.f728j;
        }
        if (z) {
            tVar = mVar.f741x;
        } else {
            tVar = mVar.f742y;
        }
        return (C0312s) tVar.f773a.get(view);
    }

    /* renamed from: a */
    private void m599a(C0313t tVar, C0313t tVar2) {
        C0777a aVar = new C0777a((C0800n) tVar.f773a);
        C0777a aVar2 = new C0777a((C0800n) tVar2.f773a);
        for (int i : this.f743z) {
            switch (i) {
                case 1:
                    for (int size = aVar.size() - 1; size >= 0; size--) {
                        View view = (View) aVar.mo2576b(size);
                        if (view != null && mo599a(view)) {
                            C0312s sVar = (C0312s) aVar2.remove(view);
                            if (!(sVar == null || sVar.f771b == null || !mo599a(sVar.f771b))) {
                                this.f711A.add((C0312s) aVar.mo2581d(size));
                                this.f712B.add(sVar);
                            }
                        }
                    }
                    break;
                case 2:
                    C0777a<String, View> aVar3 = tVar.f776d;
                    C0777a<String, View> aVar4 = tVar2.f776d;
                    int size2 = aVar3.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        View view2 = (View) aVar3.mo2577c(i2);
                        if (view2 != null && mo599a(view2)) {
                            View view3 = (View) aVar4.get(aVar3.mo2576b(i2));
                            if (view3 != null && mo599a(view3)) {
                                C0312s sVar2 = (C0312s) aVar.get(view2);
                                C0312s sVar3 = (C0312s) aVar2.get(view3);
                                if (!(sVar2 == null || sVar3 == null)) {
                                    this.f711A.add(sVar2);
                                    this.f712B.add(sVar3);
                                    aVar.remove(view2);
                                    aVar2.remove(view3);
                                }
                            }
                        }
                    }
                    break;
                case 3:
                    SparseArray<View> sparseArray = tVar.f774b;
                    SparseArray<View> sparseArray2 = tVar2.f774b;
                    int size3 = sparseArray.size();
                    for (int i3 = 0; i3 < size3; i3++) {
                        View view4 = (View) sparseArray.valueAt(i3);
                        if (view4 != null && mo599a(view4)) {
                            View view5 = (View) sparseArray2.get(sparseArray.keyAt(i3));
                            if (view5 != null && mo599a(view5)) {
                                C0312s sVar4 = (C0312s) aVar.get(view4);
                                C0312s sVar5 = (C0312s) aVar2.get(view5);
                                if (!(sVar4 == null || sVar5 == null)) {
                                    this.f711A.add(sVar4);
                                    this.f712B.add(sVar5);
                                    aVar.remove(view4);
                                    aVar2.remove(view5);
                                }
                            }
                        }
                    }
                    break;
                case 4:
                    C0785g<View> gVar = tVar.f775c;
                    C0785g<View> gVar2 = tVar2.f775c;
                    int b = gVar.mo2490b();
                    for (int i4 = 0; i4 < b; i4++) {
                        View view6 = (View) gVar.mo2494c(i4);
                        if (view6 != null && mo599a(view6)) {
                            View view7 = (View) gVar2.mo2487a(gVar.mo2491b(i4));
                            if (view7 != null && mo599a(view7)) {
                                C0312s sVar6 = (C0312s) aVar.get(view6);
                                C0312s sVar7 = (C0312s) aVar2.get(view7);
                                if (!(sVar6 == null || sVar7 == null)) {
                                    this.f711A.add(sVar6);
                                    this.f712B.add(sVar7);
                                    aVar.remove(view6);
                                    aVar2.remove(view7);
                                }
                            }
                        }
                    }
                    break;
            }
        }
        for (int i5 = 0; i5 < aVar.size(); i5++) {
            C0312s sVar8 = (C0312s) aVar.mo2577c(i5);
            if (mo599a(sVar8.f771b)) {
                this.f711A.add(sVar8);
                this.f712B.add(null);
            }
        }
        for (int i6 = 0; i6 < aVar2.size(); i6++) {
            C0312s sVar9 = (C0312s) aVar2.mo2577c(i6);
            if (mo599a(sVar9.f771b)) {
                this.f712B.add(sVar9);
                this.f711A.add(null);
            }
        }
    }

    /* renamed from: a */
    private static boolean m601a(C0312s sVar, C0312s sVar2, String str) {
        Object obj = sVar.f770a.get(str);
        Object obj2 = sVar2.f770a.get(str);
        if ((obj != null || obj2 != null) && (obj == null || obj2 == null || !obj.equals(obj2))) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static void m600a(C0313t tVar, View view, C0312s sVar) {
        tVar.f773a.put(view, sVar);
        int id = view.getId();
        if (id >= 0) {
            if (tVar.f774b.indexOfKey(id) >= 0) {
                tVar.f774b.put(id, null);
            } else {
                tVar.f774b.put(id, view);
            }
        }
        String p = C1056u.m3070p(view);
        if (p != null) {
            if (tVar.f776d.containsKey(p)) {
                tVar.f776d.put(p, null);
            } else {
                tVar.f776d.put(p, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (tVar.f775c.mo2499d(itemIdAtPosition) >= 0) {
                    View view2 = (View) tVar.f775c.mo2487a(itemIdAtPosition);
                    if (view2 != null) {
                        C1056u.m3037a(view2, false);
                        tVar.f775c.mo2493b(itemIdAtPosition, null);
                    }
                    return;
                }
                C1056u.m3037a(view, true);
                tVar.f775c.mo2493b(itemIdAtPosition, view);
            }
        }
    }
}
