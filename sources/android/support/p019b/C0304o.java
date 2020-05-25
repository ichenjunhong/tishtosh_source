package android.support.p019b;

import android.support.p019b.C0296m.C0302c;
import android.support.p030v4.p038f.C0777a;
import android.support.p030v4.view.C1056u;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver.OnPreDrawListener;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: android.support.b.o */
public final class C0304o {

    /* renamed from: a */
    static ArrayList<ViewGroup> f752a = new ArrayList<>();

    /* renamed from: b */
    private static C0296m f753b = new C0259b();

    /* renamed from: c */
    private static ThreadLocal<WeakReference<C0777a<ViewGroup, ArrayList<C0296m>>>> f754c = new ThreadLocal<>();

    /* renamed from: android.support.b.o$a */
    static class C0305a implements OnAttachStateChangeListener, OnPreDrawListener {

        /* renamed from: a */
        C0296m f755a;

        /* renamed from: b */
        ViewGroup f756b;

        public final void onViewAttachedToWindow(View view) {
        }

        /* renamed from: a */
        private void m649a() {
            this.f756b.getViewTreeObserver().removeOnPreDrawListener(this);
            this.f756b.removeOnAttachStateChangeListener(this);
        }

        public final boolean onPreDraw() {
            m649a();
            if (!C0304o.f752a.remove(this.f756b)) {
                return true;
            }
            final C0777a a = C0304o.m645a();
            ArrayList arrayList = (ArrayList) a.get(this.f756b);
            ArrayList arrayList2 = null;
            if (arrayList == null) {
                arrayList = new ArrayList();
                a.put(this.f756b, arrayList);
            } else if (arrayList.size() > 0) {
                arrayList2 = new ArrayList(arrayList);
            }
            arrayList.add(this.f755a);
            this.f755a.mo589a((C0302c) new C0303n() {
                /* renamed from: a */
                public final void mo530a(C0296m mVar) {
                    ((ArrayList) a.get(C0305a.this.f756b)).remove(mVar);
                }
            });
            this.f755a.mo597a(this.f756b, false);
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((C0296m) it.next()).mo613e(this.f756b);
                }
            }
            this.f755a.mo595a(this.f756b);
            return true;
        }

        public final void onViewDetachedFromWindow(View view) {
            m649a();
            C0304o.f752a.remove(this.f756b);
            ArrayList arrayList = (ArrayList) C0304o.m645a().get(this.f756b);
            if (arrayList != null && arrayList.size() > 0) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((C0296m) it.next()).mo613e(this.f756b);
                }
            }
            this.f755a.mo598a(true);
        }

        C0305a(C0296m mVar, ViewGroup viewGroup) {
            this.f755a = mVar;
            this.f756b = viewGroup;
        }
    }

    /* renamed from: a */
    static C0777a<ViewGroup, ArrayList<C0296m>> m645a() {
        WeakReference weakReference = (WeakReference) f754c.get();
        if (weakReference != null) {
            C0777a<ViewGroup, ArrayList<C0296m>> aVar = (C0777a) weakReference.get();
            if (aVar != null) {
                return aVar;
            }
        }
        C0777a<ViewGroup, ArrayList<C0296m>> aVar2 = new C0777a<>();
        f754c.set(new WeakReference(aVar2));
        return aVar2;
    }

    /* renamed from: b */
    private static void m647b(ViewGroup viewGroup, C0296m mVar) {
        if (mVar != null && viewGroup != null) {
            C0305a aVar = new C0305a(mVar, viewGroup);
            viewGroup.addOnAttachStateChangeListener(aVar);
            viewGroup.getViewTreeObserver().addOnPreDrawListener(aVar);
        }
    }

    /* renamed from: a */
    public static void m646a(ViewGroup viewGroup, C0296m mVar) {
        if (!f752a.contains(viewGroup) && C1056u.m3079y(viewGroup)) {
            f752a.add(viewGroup);
            if (mVar == null) {
                mVar = f753b;
            }
            C0296m e = mVar.clone();
            m648c(viewGroup, e);
            C0284j.m581a(viewGroup, null);
            m647b(viewGroup, e);
        }
    }

    /* renamed from: c */
    private static void m648c(ViewGroup viewGroup, C0296m mVar) {
        ArrayList arrayList = (ArrayList) m645a().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((C0296m) it.next()).mo611d(viewGroup);
            }
        }
        if (mVar != null) {
            mVar.mo597a(viewGroup, true);
        }
        C0284j a = C0284j.m580a(viewGroup);
        if (a != null && C0284j.m580a(a.f694a) == a && a.f695b != null) {
            a.f695b.run();
        }
    }
}
