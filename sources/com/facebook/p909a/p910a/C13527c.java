package com.facebook.p909a.p910a;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.widget.AdapterView;
import com.facebook.C14533n;
import com.facebook.internal.C14277aa;
import com.facebook.internal.C14336o;
import com.facebook.internal.C14338p;
import com.facebook.p909a.p910a.C13512a.C13514a;
import com.facebook.p909a.p910a.C13531d.C13532a;
import com.facebook.p909a.p910a.p911a.C13516a;
import com.facebook.p909a.p910a.p911a.C13519b;
import com.facebook.p909a.p910a.p911a.C13520c;
import com.facebook.p909a.p910a.p911a.C13520c.C13521a;
import com.facebook.p909a.p910a.p911a.C13523e;
import com.taobao.android.dexposed.ClassUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: com.facebook.a.a.c */
public class C13527c {

    /* renamed from: a */
    public static final String f35312a = C13527c.class.getCanonicalName();

    /* renamed from: g */
    private static C13527c f35313g = null;

    /* renamed from: b */
    public final Handler f35314b = new Handler(Looper.getMainLooper());

    /* renamed from: c */
    public Set<Activity> f35315c = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: d */
    public Set<C13530b> f35316d = new HashSet();

    /* renamed from: e */
    public HashSet<String> f35317e = new HashSet<>();

    /* renamed from: f */
    public HashMap<Integer, HashSet<String>> f35318f = new HashMap<>();

    /* renamed from: com.facebook.a.a.c$a */
    public static class C13529a {

        /* renamed from: a */
        public String f35320a;

        /* renamed from: b */
        private WeakReference<View> f35321b;

        /* renamed from: a */
        public final View mo25349a() {
            if (this.f35321b == null) {
                return null;
            }
            return (View) this.f35321b.get();
        }

        public C13529a(View view, String str) {
            this.f35321b = new WeakReference<>(view);
            this.f35320a = str;
        }
    }

    /* renamed from: com.facebook.a.a.c$b */
    protected static class C13530b implements OnGlobalLayoutListener, OnScrollChangedListener, Runnable {

        /* renamed from: a */
        private WeakReference<View> f35322a;

        /* renamed from: b */
        private List<C13516a> f35323b;

        /* renamed from: c */
        private final Handler f35324c;

        /* renamed from: d */
        private HashSet<String> f35325d;

        /* renamed from: e */
        private final String f35326e;

        public final void onGlobalLayout() {
            m27354a();
        }

        public final void onScrollChanged() {
            m27354a();
        }

        /* renamed from: a */
        private void m27354a() {
            if (this.f35323b != null && this.f35322a.get() != null) {
                for (int i = 0; i < this.f35323b.size(); i++) {
                    m27355a((C13516a) this.f35323b.get(i), (View) this.f35322a.get());
                }
            }
        }

        public final void run() {
            C14336o a = C14338p.m29397a(C14533n.m29777k());
            if (a != null && a.f37300l) {
                this.f35323b = C13516a.m27327a(a.f37302n);
                if (this.f35323b != null) {
                    View view = (View) this.f35322a.get();
                    if (view != null) {
                        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                        if (viewTreeObserver.isAlive()) {
                            viewTreeObserver.addOnGlobalLayoutListener(this);
                            viewTreeObserver.addOnScrollChangedListener(this);
                        }
                        m27354a();
                    }
                }
            }
        }

        /* renamed from: a */
        private static List<View> m27352a(ViewGroup viewGroup) {
            ArrayList arrayList = new ArrayList();
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt.getVisibility() == 0) {
                    arrayList.add(childAt);
                }
            }
            return arrayList;
        }

        /* renamed from: a */
        private void m27355a(C13516a aVar, View view) {
            if (aVar != null && view != null) {
                if (TextUtils.isEmpty(aVar.f35277g) || aVar.f35277g.equals(this.f35326e)) {
                    List a = aVar.mo25342a();
                    if (a.size() <= 25) {
                        for (C13529a a2 : m27353a(aVar, view, a, 0, -1, this.f35326e)) {
                            m27356a(a2, view, aVar);
                        }
                    }
                }
            }
        }

        /* renamed from: b */
        private void m27358b(C13529a aVar, View view, C13516a aVar2) {
            boolean z;
            View a = aVar.mo25349a();
            if (a != null) {
                String str = aVar.f35320a;
                OnClickListener d = C13523e.m27338d(a);
                if (!(d instanceof C13514a) || !((C13514a) d).f35263a) {
                    z = false;
                } else {
                    z = true;
                }
                if (!this.f35325d.contains(str) && !z) {
                    a.setOnClickListener(C13512a.m27325a(aVar2, view, a));
                    this.f35325d.add(str);
                }
            }
        }

        /* renamed from: c */
        private void m27359c(C13529a aVar, View view, C13516a aVar2) {
            boolean z;
            View a = aVar.mo25349a();
            if (a != null) {
                String str = aVar.f35320a;
                OnTouchListener e = C13523e.m27339e(a);
                if (!(e instanceof C13532a) || !((C13532a) e).f35328a) {
                    z = false;
                } else {
                    z = true;
                }
                if (!this.f35325d.contains(str) && !z) {
                    a.setOnTouchListener(C13531d.m27360a(aVar2, view, a));
                    this.f35325d.add(str);
                }
            }
        }

        /* renamed from: a */
        private void m27356a(C13529a aVar, View view, C13516a aVar2) {
            if (aVar2 != null) {
                try {
                    View a = aVar.mo25349a();
                    if (a != null) {
                        View f = C13523e.m27340f(a);
                        if (f != null && C13523e.m27335a(a, f)) {
                            m27359c(aVar, view, aVar2);
                        } else if (!a.getClass().getName().startsWith("com.facebook.react") && !(a instanceof AdapterView)) {
                            m27358b(aVar, view, aVar2);
                        }
                    }
                } catch (Exception unused) {
                }
            }
        }

        /* renamed from: a */
        private static boolean m27357a(View view, C13520c cVar, int i) {
            String str;
            String str2;
            if (cVar.f35287b != -1 && i != cVar.f35287b) {
                return false;
            }
            if (!view.getClass().getCanonicalName().equals(cVar.f35286a)) {
                if (!cVar.f35286a.matches(".*android\\..*")) {
                    return false;
                }
                String[] split = cVar.f35286a.split("\\.");
                if (split.length <= 0) {
                    return false;
                }
                if (!view.getClass().getSimpleName().equals(split[split.length - 1])) {
                    return false;
                }
            }
            if ((cVar.f35293h & C13521a.ID.getValue()) > 0 && cVar.f35288c != view.getId()) {
                return false;
            }
            if ((cVar.f35293h & C13521a.TEXT.getValue()) > 0) {
                String str3 = cVar.f35289d;
                String b = C13523e.m27336b(view);
                String a = C14277aa.m29253a(C14277aa.m29278b(b), "");
                if (!str3.equals(b) && !str3.equals(a)) {
                    return false;
                }
            }
            if ((cVar.f35293h & C13521a.DESCRIPTION.getValue()) > 0) {
                String str4 = cVar.f35291f;
                if (view.getContentDescription() == null) {
                    str2 = "";
                } else {
                    str2 = String.valueOf(view.getContentDescription());
                }
                String a2 = C14277aa.m29253a(C14277aa.m29278b(str2), "");
                if (!str4.equals(str2) && !str4.equals(a2)) {
                    return false;
                }
            }
            if ((cVar.f35293h & C13521a.HINT.getValue()) > 0) {
                String str5 = cVar.f35292g;
                String c = C13523e.m27337c(view);
                String a3 = C14277aa.m29253a(C14277aa.m29278b(c), "");
                if (!str5.equals(c) && !str5.equals(a3)) {
                    return false;
                }
            }
            if ((cVar.f35293h & C13521a.TAG.getValue()) > 0) {
                String str6 = cVar.f35290e;
                if (view.getTag() == null) {
                    str = "";
                } else {
                    str = String.valueOf(view.getTag());
                }
                String a4 = C14277aa.m29253a(C14277aa.m29278b(str), "");
                if (str6.equals(str) || str6.equals(a4)) {
                    return true;
                }
                return false;
            }
            return true;
        }

        public C13530b(View view, Handler handler, HashSet<String> hashSet, String str) {
            this.f35322a = new WeakReference<>(view);
            this.f35324c = handler;
            this.f35325d = hashSet;
            this.f35326e = str;
            this.f35324c.postDelayed(this, 200);
        }

        /* renamed from: a */
        public static List<C13529a> m27353a(C13516a aVar, View view, List<C13520c> list, int i, int i2, String str) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(ClassUtils.PACKAGE_SEPARATOR);
            sb.append(String.valueOf(i2));
            String sb2 = sb.toString();
            ArrayList arrayList = new ArrayList();
            if (view == null) {
                return arrayList;
            }
            if (i >= list.size()) {
                arrayList.add(new C13529a(view, sb2));
            } else {
                C13520c cVar = (C13520c) list.get(i);
                if (cVar.f35286a.equals("..")) {
                    ViewParent parent = view.getParent();
                    if (parent instanceof ViewGroup) {
                        List a = m27352a((ViewGroup) parent);
                        int size = a.size();
                        for (int i3 = 0; i3 < size; i3++) {
                            arrayList.addAll(m27353a(aVar, (View) a.get(i3), list, i + 1, i3, sb2));
                        }
                    }
                    return arrayList;
                } else if (cVar.f35286a.equals(ClassUtils.PACKAGE_SEPARATOR)) {
                    arrayList.add(new C13529a(view, sb2));
                    return arrayList;
                } else if (!m27357a(view, cVar, i2)) {
                    return arrayList;
                } else {
                    if (i == list.size() - 1) {
                        arrayList.add(new C13529a(view, sb2));
                    }
                }
            }
            if (view instanceof ViewGroup) {
                List a2 = m27352a((ViewGroup) view);
                int size2 = a2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    arrayList.addAll(m27353a(aVar, (View) a2.get(i4), list, i + 1, i4, sb2));
                }
            }
            return arrayList;
        }
    }

    /* renamed from: a */
    public static synchronized C13527c m27349a() {
        C13527c cVar;
        synchronized (C13527c.class) {
            if (f35313g == null) {
                f35313g = new C13527c();
            }
            cVar = f35313g;
        }
        return cVar;
    }

    private C13527c() {
    }

    /* renamed from: b */
    public final void mo25347b() {
        for (Activity activity : this.f35315c) {
            if (activity != null) {
                this.f35316d.add(new C13530b(activity.getWindow().getDecorView().getRootView(), this.f35314b, this.f35317e, activity.getClass().getSimpleName()));
            }
        }
    }

    /* renamed from: a */
    public static Bundle m27348a(C13516a aVar, View view, View view2) {
        List list;
        Bundle bundle = new Bundle();
        if (aVar == null) {
            return bundle;
        }
        List<C13519b> b = aVar.mo25343b();
        if (b != null) {
            for (C13519b bVar : b) {
                if (bVar.f35283b == null || bVar.f35283b.length() <= 0) {
                    if (bVar.f35284c.size() > 0) {
                        if (bVar.f35285d.equals("relative")) {
                            list = C13530b.m27353a(aVar, view2, bVar.f35284c, 0, -1, view2.getClass().getSimpleName());
                        } else {
                            list = C13530b.m27353a(aVar, view, bVar.f35284c, 0, -1, view.getClass().getSimpleName());
                        }
                        Iterator it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            C13529a aVar2 = (C13529a) it.next();
                            if (aVar2.mo25349a() != null) {
                                String b2 = C13523e.m27336b(aVar2.mo25349a());
                                if (b2.length() > 0) {
                                    bundle.putString(bVar.f35282a, b2);
                                    break;
                                }
                            }
                        }
                    }
                } else {
                    bundle.putString(bVar.f35282a, bVar.f35283b);
                }
            }
        }
        return bundle;
    }
}
