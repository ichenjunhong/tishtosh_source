package android.support.p019b;

import android.graphics.Rect;
import android.support.p019b.C0296m.C0301b;
import android.support.p019b.C0296m.C0302c;
import android.support.p030v4.app.C0692v;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* renamed from: android.support.b.e */
public class C0275e extends C0692v {
    /* renamed from: a */
    public final boolean mo570a(Object obj) {
        return obj instanceof C0296m;
    }

    /* renamed from: b */
    public final Object mo571b(Object obj) {
        if (obj != null) {
            return ((C0296m) obj).clone();
        }
        return null;
    }

    /* renamed from: c */
    public final Object mo576c(Object obj) {
        if (obj == null) {
            return null;
        }
        C0308q qVar = new C0308q();
        qVar.mo622a((C0296m) obj);
        return qVar;
    }

    /* renamed from: a */
    private static boolean m551a(C0296m mVar) {
        if (!m1994a((List) mVar.f724f) || !m1994a((List) mVar.f726h) || !m1994a((List) mVar.f727i)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo563a(ViewGroup viewGroup, Object obj) {
        C0304o.m646a(viewGroup, (C0296m) obj);
    }

    /* renamed from: b */
    public final void mo573b(Object obj, View view) {
        if (obj != null) {
            ((C0296m) obj).mo603b(view);
        }
    }

    /* renamed from: c */
    public final void mo577c(Object obj, View view) {
        if (obj != null) {
            ((C0296m) obj).mo606c(view);
        }
    }

    /* renamed from: a */
    public final void mo564a(Object obj, final Rect rect) {
        if (obj != null) {
            ((C0296m) obj).mo593a((C0301b) new C0301b() {
                /* renamed from: a */
                public final Rect mo578a(C0296m mVar) {
                    if (rect == null || rect.isEmpty()) {
                        return null;
                    }
                    return rect;
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo565a(Object obj, View view) {
        if (view != null) {
            C0296m mVar = (C0296m) obj;
            final Rect rect = new Rect();
            m1992a(view, rect);
            mVar.mo593a((C0301b) new C0301b() {
                /* renamed from: a */
                public final Rect mo578a(C0296m mVar) {
                    return rect;
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo568a(Object obj, ArrayList<View> arrayList) {
        C0296m mVar = (C0296m) obj;
        if (mVar != null) {
            int i = 0;
            if (mVar instanceof C0308q) {
                C0308q qVar = (C0308q) mVar;
                int f = qVar.mo626f();
                while (i < f) {
                    mo568a((Object) qVar.mo624c(i), arrayList);
                    i++;
                }
                return;
            }
            if (!m551a(mVar) && m1994a((List) mVar.f725g)) {
                int size = arrayList.size();
                while (i < size) {
                    mVar.mo603b((View) arrayList.get(i));
                    i++;
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo574b(Object obj, final View view, final ArrayList<View> arrayList) {
        ((C0296m) obj).mo589a((C0302c) new C0302c() {
            /* renamed from: b */
            public final void mo531b(C0296m mVar) {
            }

            /* renamed from: c */
            public final void mo532c(C0296m mVar) {
            }

            /* renamed from: d */
            public final void mo533d(C0296m mVar) {
            }

            /* renamed from: a */
            public final void mo530a(C0296m mVar) {
                mVar.mo602b((C0302c) this);
                view.setVisibility(8);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((View) arrayList.get(i)).setVisibility(0);
                }
            }
        });
    }

    /* renamed from: a */
    public final Object mo562a(Object obj, Object obj2, Object obj3) {
        C0308q qVar = new C0308q();
        if (obj != null) {
            qVar.mo622a((C0296m) obj);
        }
        if (obj2 != null) {
            qVar.mo622a((C0296m) obj2);
        }
        if (obj3 != null) {
            qVar.mo622a((C0296m) obj3);
        }
        return qVar;
    }

    /* renamed from: b */
    public final Object mo572b(Object obj, Object obj2, Object obj3) {
        C0296m mVar = (C0296m) obj;
        C0296m mVar2 = (C0296m) obj2;
        C0296m mVar3 = (C0296m) obj3;
        if (mVar != null && mVar2 != null) {
            mVar = new C0308q().mo622a(mVar).mo622a(mVar2).mo621a(1);
        } else if (mVar == null) {
            if (mVar2 != null) {
                mVar = mVar2;
            } else {
                mVar = null;
            }
        }
        if (mVar3 == null) {
            return mVar;
        }
        C0308q qVar = new C0308q();
        if (mVar != null) {
            qVar.mo622a(mVar);
        }
        qVar.mo622a(mVar3);
        return qVar;
    }

    /* renamed from: b */
    public final void mo575b(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        int i;
        C0296m mVar = (C0296m) obj;
        int i2 = 0;
        if (mVar instanceof C0308q) {
            C0308q qVar = (C0308q) mVar;
            int f = qVar.mo626f();
            while (i2 < f) {
                mo575b((Object) qVar.mo624c(i2), arrayList, arrayList2);
                i2++;
            }
            return;
        }
        if (!m551a(mVar)) {
            ArrayList<View> arrayList3 = mVar.f725g;
            if (arrayList3.size() == arrayList.size() && arrayList3.containsAll(arrayList)) {
                if (arrayList2 == null) {
                    i = 0;
                } else {
                    i = arrayList2.size();
                }
                while (i2 < i) {
                    mVar.mo603b((View) arrayList2.get(i2));
                    i2++;
                }
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    mVar.mo606c((View) arrayList.get(size));
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo566a(Object obj, View view, ArrayList<View> arrayList) {
        C0308q qVar = (C0308q) obj;
        ArrayList<View> arrayList2 = qVar.f725g;
        arrayList2.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            m1993a((List<View>) arrayList2, (View) arrayList.get(i));
        }
        arrayList2.add(view);
        arrayList.add(view);
        mo568a((Object) qVar, arrayList);
    }

    /* renamed from: a */
    public final void mo569a(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        C0308q qVar = (C0308q) obj;
        if (qVar != null) {
            qVar.f725g.clear();
            qVar.f725g.addAll(arrayList2);
            mo575b((Object) qVar, arrayList, arrayList2);
        }
    }

    /* renamed from: a */
    public final void mo567a(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        C0296m mVar = (C0296m) obj;
        final Object obj5 = obj2;
        final ArrayList<View> arrayList4 = arrayList;
        final Object obj6 = obj3;
        final ArrayList<View> arrayList5 = arrayList2;
        final Object obj7 = obj4;
        final ArrayList<View> arrayList6 = arrayList3;
        C02783 r1 = new C0302c() {
            /* renamed from: a */
            public final void mo530a(C0296m mVar) {
            }

            /* renamed from: b */
            public final void mo531b(C0296m mVar) {
            }

            /* renamed from: c */
            public final void mo532c(C0296m mVar) {
            }

            /* renamed from: d */
            public final void mo533d(C0296m mVar) {
                if (obj5 != null) {
                    C0275e.this.mo575b(obj5, arrayList4, null);
                }
                if (obj6 != null) {
                    C0275e.this.mo575b(obj6, arrayList5, null);
                }
                if (obj7 != null) {
                    C0275e.this.mo575b(obj7, arrayList6, null);
                }
            }
        };
        mVar.mo589a((C0302c) r1);
    }
}
