package com.bytedance.scene.navigation;

import android.app.Activity;
import android.arch.lifecycle.C0176h.C0178b;
import android.arch.lifecycle.C0184k;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import com.bytedance.scene.C12924i;
import com.bytedance.scene.C12967r;
import com.bytedance.scene.C12984w;
import com.bytedance.scene.group.C12918f;
import com.bytedance.scene.navigation.C12942d;
import com.bytedance.scene.p837a.C12828a;
import com.bytedance.scene.p837a.C12837c;
import com.bytedance.scene.p837a.C12837c.C128381;
import com.bytedance.scene.p837a.C12837c.C128403;
import com.bytedance.scene.p837a.C12837c.C128414;
import com.bytedance.scene.p837a.C12837c.C128436;
import com.bytedance.scene.p837a.p839b.C12835a;
import com.bytedance.scene.p840b.C12858e;
import com.bytedance.scene.p840b.C12861f;
import com.bytedance.scene.p841c.C12866a;
import com.bytedance.scene.p841c.C12868b;
import com.bytedance.scene.p841c.C12868b.C12869a;
import com.bytedance.scene.p841c.C12870c;
import com.bytedance.scene.p841c.C12873f;
import com.bytedance.scene.p841c.C12874g;
import com.bytedance.scene.p841c.C12877i;
import com.bytedance.scene.p841c.C12880l;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: com.bytedance.scene.navigation.e */
public final class C12945e {

    /* renamed from: j */
    public static final Runnable f33901j = new Runnable() {
        public final void run() {
        }
    };

    /* renamed from: a */
    public C12942d f33902a;

    /* renamed from: b */
    public final C12962h f33903b = new C12962h();

    /* renamed from: c */
    public C12941c f33904c;

    /* renamed from: d */
    public final ArrayDeque<C12950b> f33905d = new ArrayDeque<>();

    /* renamed from: e */
    public long f33906e = -1;

    /* renamed from: f */
    public final C12949a f33907f = new C12949a();

    /* renamed from: g */
    final List<C12873f<C0184k, C12961g>> f33908g = new ArrayList();

    /* renamed from: h */
    public Set<String> f33909h = new HashSet();

    /* renamed from: i */
    public int f33910i = 0;

    /* renamed from: k */
    public boolean f33911k = false;

    /* renamed from: l */
    private final C12939a f33912l = new C12939a(Looper.getMainLooper());

    /* renamed from: m */
    private int f33913m = 0;

    /* renamed from: com.bytedance.scene.navigation.e$a */
    static class C12949a {

        /* renamed from: a */
        private final List<C12870c> f33917a;

        private C12949a() {
            this.f33917a = new ArrayList();
        }

        /* renamed from: a */
        public final void mo24549a() {
            if (this.f33917a.size() != 0) {
                ArrayList arrayList = new ArrayList(this.f33917a);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    C12870c cVar = (C12870c) it.next();
                    it.remove();
                    cVar.mo24332b();
                }
                this.f33917a.removeAll(arrayList);
            }
        }

        /* renamed from: a */
        public final void mo24550a(C12870c cVar) {
            this.f33917a.add(cVar);
        }

        /* renamed from: b */
        public final void mo24551b(C12870c cVar) {
            this.f33917a.remove(cVar);
        }
    }

    /* renamed from: com.bytedance.scene.navigation.e$b */
    interface C12950b {
        /* renamed from: a */
        void mo24552a(Runnable runnable);
    }

    /* renamed from: com.bytedance.scene.navigation.e$c */
    class C12951c implements C12950b {

        /* renamed from: b */
        private final C12837c f33919b;

        /* renamed from: c */
        private final int f33920c;

        /* renamed from: a */
        public final void mo24552a(Runnable runnable) {
            boolean z;
            boolean z2;
            C12945e.this.mo24545f();
            if (C12945e.this.mo24546g()) {
                if (VERSION.SDK_INT >= 19) {
                    C12945e.this.f33902a.f33834b.cancelPendingInputEvents();
                }
                List c = C12945e.this.f33903b.mo24559c();
                if (this.f33920c > 0) {
                    boolean z3 = true;
                    if (this.f33920c >= c.size()) {
                        if (c.size() > 1) {
                            new C12951c(this.f33919b, c.size() - 1).mo24552a(C12945e.f33901j);
                        }
                        C12945e.this.f33902a.mo24477v().onBackPressed();
                        runnable.run();
                        return;
                    }
                    ArrayList<Record> arrayList = new ArrayList<>();
                    for (int i = 0; i <= this.f33920c - 1; i++) {
                        arrayList.add((Record) c.get((c.size() - 1) - i));
                    }
                    Record record = (Record) c.get((c.size() - this.f33920c) - 1);
                    final Record a = C12945e.this.f33903b.mo24556a();
                    C12924i iVar = a.f33879a;
                    View view = iVar.f33834b;
                    for (Record record2 : arrayList) {
                        C12924i iVar2 = record2.f33879a;
                        C12945e.m26038a(C12945e.this.f33902a, iVar2, C12984w.NONE, null, false, null);
                        C12945e.this.f33903b.mo24557a(record2);
                        if (record2 != a && (iVar2 instanceof C12918f)) {
                            C12945e.this.f33902a.mo24521a((C12918f) iVar2);
                        }
                    }
                    C12924i iVar3 = record.f33879a;
                    if (C12945e.this.f33902a.f33838f.value >= C12984w.STARTED.value) {
                        z = true;
                    } else {
                        z = false;
                    }
                    C12945e.m26038a(C12945e.this.f33902a, iVar3, C12945e.this.f33902a.f33838f, null, false, null);
                    if (a.f33884f != null) {
                        a.f33884f.mo24326a(a.f33883e);
                    }
                    if (record.f33880b) {
                        List c2 = C12945e.this.f33903b.mo24559c();
                        if (c2.size() > 1) {
                            for (int size = c2.size() - 2; size >= 0; size--) {
                                Record record3 = (Record) c2.get(size);
                                C12945e.m26038a(C12945e.this.f33902a, record3.f33879a, C12945e.m26037a(C12945e.this.f33902a.f33838f, C12984w.STARTED), null, false, null);
                                if (!record3.f33880b) {
                                    break;
                                }
                            }
                        }
                    }
                    C12945e eVar = C12945e.this;
                    ActivityStatusRecord activityStatusRecord = record.f33881c;
                    Activity activity = eVar.f33902a.f33840g_;
                    Window window = activity.getWindow();
                    if (VERSION.SDK_INT >= 21) {
                        window.setStatusBarColor(activityStatusRecord.f33867a);
                        window.setNavigationBarColor(activityStatusRecord.f33868b);
                    }
                    window.getDecorView().setSystemUiVisibility(activityStatusRecord.f33869c);
                    window.setSoftInputMode(activityStatusRecord.f33870d);
                    int i2 = window.getAttributes().flags;
                    int i3 = activityStatusRecord.f33871e;
                    int i4 = (i2 & i3) ^ -1;
                    window.addFlags(i3 & i4);
                    window.clearFlags(i2 & i4);
                    activity.setRequestedOrientation(activityStatusRecord.f33872f);
                    C12945e.this.f33904c.mo24516a(a.f33879a, record.f33879a, false);
                    C12837c cVar = null;
                    if (this.f33919b != null) {
                        a.f33879a.getClass();
                        record.f33879a.getClass();
                        cVar = this.f33919b;
                    }
                    if (cVar == null && a.f33882d != null) {
                        a.f33879a.getClass();
                        record.f33879a.getClass();
                        cVar = a.f33882d;
                    }
                    if (cVar == null) {
                        cVar = C12945e.this.f33902a.f33892n;
                    }
                    if (C12945e.this.f33911k || !z || cVar == null) {
                        Runnable runnable2 = runnable;
                        if (a.f33879a instanceof C12918f) {
                            C12945e.this.f33902a.mo24521a((C12918f) a.f33879a);
                        }
                        runnable.run();
                    } else {
                        a.f33879a.getClass();
                        record.f33879a.getClass();
                        FrameLayout frameLayout = C12945e.this.f33902a.f33891m;
                        C12866a.m25783c(frameLayout);
                        cVar.f33614a = frameLayout;
                        final C12870c cVar2 = new C12870c();
                        final Runnable runnable3 = runnable;
                        C129521 r9 = new Runnable() {
                            public final void run() {
                                C12945e.this.f33907f.mo24551b(cVar2);
                                if (a.f33879a instanceof C12918f) {
                                    C12945e.this.f33902a.mo24521a((C12918f) a.f33879a);
                                }
                                runnable3.run();
                            }
                        };
                        C12828a aVar = new C12828a(iVar, view, iVar.f33838f, a.f33880b);
                        C12828a aVar2 = new C12828a(record.f33879a, record.f33879a.f33834b, record.f33879a.f33838f, record.f33880b);
                        C12945e.this.f33907f.mo24550a(cVar2);
                        C12942d dVar = C12945e.this.f33902a;
                        View rootView = C12945e.this.f33902a.f33834b.getRootView();
                        dVar.mo24526a(true);
                        C128414 r6 = new Runnable(dVar, r9) {

                            /* renamed from: a */
                            final /* synthetic */ C12942d f33630a;

                            /* renamed from: b */
                            final /* synthetic */ Runnable f33631b;

                            public final void run() {
                                this.f33630a.mo24526a(false);
                                this.f33631b.run();
                            }

                            {
                                this.f33630a = r2;
                                this.f33631b = r3;
                            }
                        };
                        cVar2.mo24330a(new C12869a(r6) {

                            /* renamed from: a */
                            final /* synthetic */ Runnable f33633a;

                            /* renamed from: a */
                            public final void mo24307a() {
                                this.f33633a.run();
                            }

                            {
                                this.f33633a = r2;
                            }
                        });
                        View view2 = aVar.f33605b;
                        View view3 = aVar2.f33605b;
                        if (view2.getWidth() == 0 || view2.getHeight() == 0) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        if (view3.getWidth() == 0 || view3.getHeight() == 0) {
                            z3 = false;
                        }
                        if (!z2 || !z3) {
                            C12868b c3 = cVar2.mo24333c();
                            C128436 r3 = r9;
                            C12868b bVar = c3;
                            C128436 r92 = new Runnable(z2, view2, c3, aVar, aVar2, r6, cVar2) {

                                /* renamed from: a */
                                final /* synthetic */ boolean f33635a;

                                /* renamed from: b */
                                final /* synthetic */ View f33636b;

                                /* renamed from: c */
                                final /* synthetic */ C12868b f33637c;

                                /* renamed from: d */
                                final /* synthetic */ C12828a f33638d;

                                /* renamed from: e */
                                final /* synthetic */ C12828a f33639e;

                                /* renamed from: f */
                                final /* synthetic */ Runnable f33640f;

                                /* renamed from: g */
                                final /* synthetic */ C12870c f33641g;

                                public final void run() {
                                    if (!this.f33635a) {
                                        C12880l.m25805a(this.f33636b);
                                        this.f33636b.setVisibility(8);
                                    }
                                    if (!this.f33637c.mo24331a()) {
                                        C12837c.this.mo24305b(this.f33638d, this.f33639e, this.f33640f, this.f33641g.mo24333c());
                                    }
                                }

                                {
                                    this.f33635a = r2;
                                    this.f33636b = r3;
                                    this.f33637c = r4;
                                    this.f33638d = r5;
                                    this.f33639e = r6;
                                    this.f33640f = r7;
                                    this.f33641g = r8;
                                }
                            };
                            C12837c.m25750a(rootView, bVar, r3);
                            if (!z2) {
                                cVar.f33614a.addView(view2);
                                view2.setVisibility(0);
                                view2.requestLayout();
                            }
                            if (!z3) {
                                view3.requestLayout();
                            }
                        } else {
                            cVar.mo24305b(aVar, aVar2, r6, cVar2.mo24333c());
                            return;
                        }
                    }
                    return;
                }
                StringBuilder sb = new StringBuilder("popCount can not be ");
                sb.append(this.f33920c);
                sb.append(" stackSize is ");
                sb.append(c.size());
                throw new IllegalArgumentException(sb.toString());
            }
            StringBuilder sb2 = new StringBuilder("Can't pop, current NavigationScene state ");
            sb2.append(C12945e.this.f33902a.f33838f.name);
            throw new IllegalArgumentException(sb2.toString());
        }

        private C12951c(C12837c cVar, int i) {
            this.f33919b = cVar;
            this.f33920c = i;
        }
    }

    /* renamed from: com.bytedance.scene.navigation.e$d */
    class C12953d implements C12950b {

        /* renamed from: b */
        private final C12837c f33926b;

        /* renamed from: a */
        public final void mo24552a(Runnable runnable) {
            new C12951c(this.f33926b, 1).mo24552a(runnable);
        }

        private C12953d(C12837c cVar) {
            this.f33926b = cVar;
        }
    }

    /* renamed from: com.bytedance.scene.navigation.e$e */
    class C12954e implements C12950b {

        /* renamed from: b */
        private final C12858e f33928b;

        /* renamed from: a */
        public final void mo24552a(Runnable runnable) {
            List c = C12945e.this.f33903b.mo24559c();
            C12874g<C12924i> gVar = this.f33928b.f33678b;
            if (gVar != null) {
                int size = c.size() - 1;
                int i = 0;
                while (size >= 0 && !gVar.mo24340a(((Record) c.get(size)).f33879a)) {
                    i++;
                    size--;
                }
                new C12951c(this.f33928b.f33677a, i).mo24552a(runnable);
                return;
            }
            new C12953d(this.f33928b.f33677a).mo24552a(runnable);
        }

        private C12954e(C12858e eVar) {
            this.f33928b = eVar;
        }
    }

    /* renamed from: com.bytedance.scene.navigation.e$f */
    class C12955f implements C12950b {

        /* renamed from: b */
        private final C12924i f33930b;

        /* renamed from: c */
        private final C12861f f33931c;

        /* renamed from: a */
        public final void mo24552a(Runnable runnable) {
            View view;
            C12924i iVar;
            boolean z;
            boolean z2;
            boolean z3;
            C12984w wVar;
            C12945e.this.mo24545f();
            if (C12945e.this.mo24546g()) {
                if (VERSION.SDK_INT >= 19) {
                    C12945e.this.f33902a.f33834b.cancelPendingInputEvents();
                }
                Record a = C12945e.this.f33903b.mo24556a();
                C12837c cVar = null;
                if (a != null) {
                    view = a.f33879a.f33834b;
                } else {
                    view = null;
                }
                if (this.f33930b.f33835c == null) {
                    C12874g<C12924i> gVar = this.f33931c.f33684d;
                    if (gVar != null) {
                        List c = C12945e.this.f33903b.mo24559c();
                        for (int size = c.size() - 1; size >= 0; size--) {
                            Record record = (Record) c.get(size);
                            C12924i iVar2 = record.f33879a;
                            if (gVar.mo24340a(iVar2)) {
                                C12945e.m26038a(C12945e.this.f33902a, iVar2, C12984w.NONE, null, false, null);
                                C12945e.this.f33903b.mo24557a(record);
                            }
                        }
                    }
                    if (a != null && C12945e.this.f33903b.mo24559c().contains(a)) {
                        Activity v = a.f33879a.mo24477v();
                        ActivityStatusRecord activityStatusRecord = new ActivityStatusRecord();
                        Window window = v.getWindow();
                        View decorView = window.getDecorView();
                        if (VERSION.SDK_INT >= 21) {
                            activityStatusRecord.f33867a = window.getStatusBarColor();
                            activityStatusRecord.f33868b = window.getNavigationBarColor();
                        }
                        activityStatusRecord.f33869c = decorView.getSystemUiVisibility();
                        activityStatusRecord.f33870d = window.getAttributes().softInputMode;
                        activityStatusRecord.f33871e = window.getAttributes().flags;
                        activityStatusRecord.f33872f = v.getRequestedOrientation();
                        a.f33881c = activityStatusRecord;
                        C12924i iVar3 = a.f33879a;
                        if (this.f33931c.f33683c) {
                            wVar = C12984w.STARTED;
                        } else {
                            wVar = C12984w.ACTIVITY_CREATED;
                        }
                        C12945e.m26038a(C12945e.this.f33902a, iVar3, C12945e.m26037a(wVar, C12945e.this.f33902a.f33838f), null, false, null);
                        List c2 = C12945e.this.f33903b.mo24559c();
                        if (c2.size() > 1 && !this.f33931c.f33683c && a.f33880b) {
                            for (int size2 = c2.size() - 2; size2 >= 0; size2--) {
                                Record record2 = (Record) c2.get(size2);
                                C12945e.m26038a(C12945e.this.f33902a, record2.f33879a, C12945e.m26037a(C12984w.ACTIVITY_CREATED, C12945e.this.f33902a.f33838f), null, false, null);
                                if (!record2.f33880b) {
                                    break;
                                }
                            }
                        }
                    }
                    C12837c cVar2 = this.f33931c.f33681a;
                    C12924i iVar4 = this.f33930b;
                    boolean z4 = this.f33931c.f33683c;
                    Record record3 = new Record();
                    record3.f33879a = iVar4;
                    record3.f33885g = iVar4.getClass().getName();
                    record3.f33880b = z4;
                    record3.f33882d = cVar2;
                    record3.f33884f = this.f33931c.f33682b;
                    C12945e.this.f33903b.f33947a.add(record3);
                    C12945e.m26038a(C12945e.this.f33902a, this.f33930b, C12945e.this.f33902a.f33838f, null, false, null);
                    C12941c cVar3 = C12945e.this.f33904c;
                    if (a != null) {
                        iVar = a.f33879a;
                    } else {
                        iVar = null;
                    }
                    cVar3.mo24516a(iVar, this.f33930b, true);
                    if (C12945e.this.f33902a.f33838f.value >= C12984w.STARTED.value) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (C12945e.this.f33911k || !z || a == null) {
                        Runnable runnable2 = runnable;
                        runnable.run();
                    } else {
                        C12837c cVar4 = record3.f33882d;
                        if (cVar4 != null) {
                            a.f33879a.getClass();
                            this.f33930b.getClass();
                            cVar = cVar4;
                        }
                        if (cVar == null && cVar2 != null) {
                            a.f33879a.getClass();
                            this.f33930b.getClass();
                            cVar = cVar2;
                        }
                        if (cVar == null) {
                            cVar = C12945e.this.f33902a.f33892n;
                        }
                        if (cVar != null) {
                            a.f33879a.getClass();
                            this.f33930b.getClass();
                            C12924i iVar5 = a.f33879a;
                            C12866a.m25783c(C12945e.this.f33902a.f33890l);
                            cVar.f33614a = C12945e.this.f33902a.f33891m;
                            C12828a aVar = new C12828a(iVar5, view, iVar5.f33838f, a.f33880b);
                            C12828a aVar2 = new C12828a(this.f33930b, this.f33930b.f33834b, this.f33930b.f33838f, record3.f33880b);
                            final C12870c cVar5 = new C12870c();
                            C12945e.this.f33907f.mo24550a(cVar5);
                            C12942d dVar = C12945e.this.f33902a;
                            View rootView = C12945e.this.f33902a.f33834b.getRootView();
                            final Runnable runnable3 = runnable;
                            C129561 r15 = new Runnable() {
                                public final void run() {
                                    C12945e.this.f33907f.mo24551b(cVar5);
                                    runnable3.run();
                                }
                            };
                            dVar.mo24526a(true);
                            View view2 = aVar.f33605b;
                            View view3 = aVar2.f33605b;
                            if (aVar.f33606c.value < C12984w.VIEW_CREATED.value) {
                                if (VERSION.SDK_INT >= 18) {
                                    cVar.f33614a.getOverlay().add(view2);
                                } else {
                                    cVar.f33614a.addView(view2);
                                }
                            }
                            C128381 r5 = r10;
                            C128381 r10 = new Runnable(dVar, aVar, view2, r15) {

                                /* renamed from: a */
                                final /* synthetic */ C12942d f33615a;

                                /* renamed from: b */
                                final /* synthetic */ C12828a f33616b;

                                /* renamed from: c */
                                final /* synthetic */ View f33617c;

                                /* renamed from: d */
                                final /* synthetic */ Runnable f33618d;

                                public final void run() {
                                    this.f33615a.mo24526a(false);
                                    if (this.f33616b.f33606c.value < C12984w.VIEW_CREATED.value) {
                                        if (VERSION.SDK_INT >= 18) {
                                            C12837c.this.f33614a.getOverlay().remove(this.f33617c);
                                        } else {
                                            C12837c.this.f33614a.removeView(this.f33617c);
                                        }
                                    }
                                    this.f33618d.run();
                                }

                                {
                                    this.f33615a = r2;
                                    this.f33616b = r3;
                                    this.f33617c = r4;
                                    this.f33618d = r5;
                                }
                            };
                            cVar5.mo24330a(new C12869a(r5) {

                                /* renamed from: a */
                                final /* synthetic */ Runnable f33620a;

                                /* renamed from: a */
                                public final void mo24307a() {
                                    this.f33620a.run();
                                }

                                {
                                    this.f33620a = r2;
                                }
                            });
                            if (view2.getWidth() == 0 || view2.getHeight() == 0) {
                                z2 = false;
                            } else {
                                z2 = true;
                            }
                            if (view3.getWidth() == 0 || view3.getHeight() == 0) {
                                z3 = false;
                            } else {
                                z3 = true;
                            }
                            if (!z2 || !z3) {
                                C12868b c3 = cVar5.mo24333c();
                                C128403 r2 = r10;
                                C12868b bVar = c3;
                                C128403 r102 = new Runnable(z2, view2, c3, aVar, aVar2, r5, cVar5) {

                                    /* renamed from: a */
                                    final /* synthetic */ boolean f33622a;

                                    /* renamed from: b */
                                    final /* synthetic */ View f33623b;

                                    /* renamed from: c */
                                    final /* synthetic */ C12868b f33624c;

                                    /* renamed from: d */
                                    final /* synthetic */ C12828a f33625d;

                                    /* renamed from: e */
                                    final /* synthetic */ C12828a f33626e;

                                    /* renamed from: f */
                                    final /* synthetic */ Runnable f33627f;

                                    /* renamed from: g */
                                    final /* synthetic */ C12870c f33628g;

                                    public final void run() {
                                        if (!this.f33622a) {
                                            this.f33623b.setVisibility(8);
                                        }
                                        if (!this.f33624c.mo24331a()) {
                                            C12837c.this.mo24304a(this.f33625d, this.f33626e, this.f33627f, this.f33628g.mo24333c());
                                        }
                                    }

                                    {
                                        this.f33622a = r2;
                                        this.f33623b = r3;
                                        this.f33624c = r4;
                                        this.f33625d = r5;
                                        this.f33626e = r6;
                                        this.f33627f = r7;
                                        this.f33628g = r8;
                                    }
                                };
                                C12837c.m25750a(rootView, bVar, r2);
                                if (!z2) {
                                    view2.setVisibility(0);
                                    view2.requestLayout();
                                }
                                if (!z3) {
                                    view3.requestLayout();
                                }
                            } else {
                                cVar.mo24304a(aVar, aVar2, r5, cVar5.mo24333c());
                            }
                        } else {
                            Runnable runnable4 = runnable;
                            runnable.run();
                        }
                    }
                } else if (this.f33930b.f33835c == C12945e.this.f33902a) {
                    runnable.run();
                } else {
                    StringBuilder sb = new StringBuilder("Scene already has a parent, parent ");
                    sb.append(this.f33930b.f33835c);
                    throw new IllegalArgumentException(sb.toString());
                }
            } else {
                StringBuilder sb2 = new StringBuilder("Can't push, current NavigationScene state ");
                sb2.append(C12945e.this.f33902a.f33838f.name);
                throw new IllegalArgumentException(sb2.toString());
            }
        }

        private C12955f(C12924i iVar, C12861f fVar) {
            this.f33930b = iVar;
            this.f33931c = fVar;
        }
    }

    /* renamed from: com.bytedance.scene.navigation.e$g */
    class C12957g implements C12950b {

        /* renamed from: b */
        private final C12924i f33936b;

        /* renamed from: a */
        public final void mo24552a(Runnable runnable) {
            if (C12945e.this.mo24542c() == this.f33936b) {
                new C12953d(null).mo24552a(runnable);
                return;
            }
            List c = C12945e.this.f33903b.mo24559c();
            int size = c.size() - 1;
            while (true) {
                if (size < 0) {
                    break;
                }
                Record record = (Record) c.get(size);
                if (record.f33879a == this.f33936b) {
                    if (size == c.size() - 2) {
                        C12945e.this.mo24545f();
                    }
                    C12984w wVar = this.f33936b.f33838f;
                    C12945e.m26038a(C12945e.this.f33902a, this.f33936b, C12984w.NONE, null, false, null);
                    C12945e.this.f33903b.mo24557a(record);
                    if (size > 0) {
                        C12945e.m26038a(C12945e.this.f33902a, ((Record) c.get(size - 1)).f33879a, wVar, null, false, null);
                    }
                } else {
                    size--;
                }
            }
            runnable.run();
        }

        private C12957g(C12924i iVar) {
            this.f33936b = iVar;
        }
    }

    /* renamed from: com.bytedance.scene.navigation.e$h */
    class C12958h implements C12950b {

        /* renamed from: b */
        private final C12984w f33938b;

        /* renamed from: c */
        private final boolean f33939c;

        /* renamed from: a */
        public final void mo24552a(Runnable runnable) {
            if (C12945e.this.mo24543d() == null) {
                runnable.run();
                return;
            }
            List c = C12945e.this.f33903b.mo24559c();
            if (this.f33939c) {
                List arrayList = new ArrayList(c);
                Collections.reverse(arrayList);
                c = arrayList;
            }
            for (int i = 0; i < c.size(); i++) {
                C12945e.m26038a(C12945e.this.f33902a, ((Record) c.get(i)).f33879a, this.f33938b, null, true, null);
            }
            runnable.run();
        }

        private C12958h(C12984w wVar, boolean z) {
            this.f33938b = wVar;
            this.f33939c = z;
        }
    }

    /* renamed from: com.bytedance.scene.navigation.e$i */
    class C12959i implements C12950b {

        /* renamed from: b */
        private final C12984w f33941b;

        /* renamed from: a */
        public final void mo24552a(Runnable runnable) {
            if (C12945e.this.mo24543d() == null) {
                runnable.run();
                return;
            }
            List c = C12945e.this.f33903b.mo24559c();
            C12984w wVar = this.f33941b;
            for (int size = c.size() - 1; size >= 0; size--) {
                Record record = (Record) c.get(size);
                if (size != c.size() - 1) {
                    C12984w wVar2 = null;
                    if (wVar == C12984w.RESUMED) {
                        wVar2 = C12984w.STARTED;
                    } else if (wVar == C12984w.STARTED) {
                        wVar2 = C12984w.STARTED;
                    } else if (wVar == C12984w.ACTIVITY_CREATED) {
                        wVar2 = C12984w.ACTIVITY_CREATED;
                    } else if (wVar == C12984w.VIEW_CREATED) {
                        wVar2 = C12984w.VIEW_CREATED;
                    }
                    C12945e.m26038a(C12945e.this.f33902a, record.f33879a, wVar2, null, true, runnable);
                    if (!record.f33880b) {
                        break;
                    }
                } else {
                    C12945e.m26038a(C12945e.this.f33902a, record.f33879a, wVar, null, true, runnable);
                    if (!record.f33880b) {
                        break;
                    }
                }
            }
            runnable.run();
        }

        private C12959i(C12984w wVar) {
            this.f33941b = wVar;
        }
    }

    /* renamed from: b */
    public final boolean mo24541b() {
        return this.f33903b.mo24558b();
    }

    /* renamed from: d */
    public final Record mo24543d() {
        return this.f33903b.mo24556a();
    }

    /* renamed from: a */
    public final void mo24534a() {
        mo24537a((C12950b) new C12953d(null));
    }

    /* renamed from: c */
    public final C12924i mo24542c() {
        Record a = this.f33903b.mo24556a();
        if (a != null) {
            return a.f33879a;
        }
        return null;
    }

    /* renamed from: f */
    public final void mo24545f() {
        this.f33907f.mo24549a();
        C12835a.m25749a();
    }

    /* renamed from: g */
    public final boolean mo24546g() {
        if (this.f33902a.f33838f.value >= C12984w.ACTIVITY_CREATED.value) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public final boolean mo24544e() {
        ArrayList arrayList = new ArrayList(this.f33908g);
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C12873f fVar = (C12873f) arrayList.get(size);
            if (((C0184k) fVar.f33705a).getLifecycle().mo323a().isAtLeast(C0178b.RESUMED) && ((C12961g) fVar.f33706b).mo24532a()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final void mo24540b(String str) {
        if (!this.f33909h.remove(str)) {
            throw new C12877i("suppressTag not found");
        } else if (this.f33909h.size() == 0) {
            this.f33913m = 0;
        }
    }

    /* renamed from: a */
    public final String mo24533a(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("_");
        int i = this.f33913m;
        this.f33913m = i + 1;
        sb.append(i);
        String sb2 = sb.toString();
        if (this.f33909h.add(sb2)) {
            return sb2;
        }
        throw new C12877i("suppressTag already exists");
    }

    C12945e(C12942d dVar) {
        this.f33902a = dVar;
        this.f33904c = dVar;
    }

    /* renamed from: a */
    public final void mo24535a(Bundle bundle) {
        bundle.putParcelableArrayList("bd-scene-nav:record_stack", new ArrayList(this.f33903b.f33947a));
        ArrayList arrayList = new ArrayList();
        for (Record record : this.f33903b.mo24559c()) {
            Bundle bundle2 = new Bundle();
            record.f33879a.mo24403c(bundle2);
            arrayList.add(bundle2);
        }
        bundle.putParcelableArrayList("bd-scene-nav:navigation_scene_manager", arrayList);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo24537a(final C12950b bVar) {
        if (!mo24546g()) {
            this.f33905d.addLast(bVar);
            this.f33906e = System.currentTimeMillis();
        } else if (this.f33909h.size() > 0 || this.f33910i > 0) {
            C129461 r0 = new Runnable() {
                public final void run() {
                    C12945e.this.f33910i--;
                    if (C12945e.this.f33909h.size() > 0) {
                        String join = TextUtils.join(",", C12945e.this.f33909h);
                        StringBuilder sb = new StringBuilder("miss endSuppressStackOperation(), mIsNavigationStateChangeInProgress content ");
                        sb.append(join);
                        throw new C12877i(sb.toString());
                    } else if (C12945e.this.mo24546g()) {
                        C12967r.m26079a("NavigationSceneManager#executeOperation");
                        String a = C12945e.this.mo24533a("NavigationManager execute operation by Handler.post()");
                        bVar.mo24552a(C12945e.f33901j);
                        C12945e.this.mo24540b(a);
                        C12967r.m26078a();
                    } else {
                        C12945e.this.f33905d.addLast(bVar);
                        C12945e.this.f33906e = System.currentTimeMillis();
                    }
                }
            };
            this.f33910i++;
            this.f33912l.mo24515a(r0);
        } else {
            C12967r.m26079a("NavigationSceneManager#executeOperation");
            String a = mo24533a("NavigationManager execute operation directly");
            bVar.mo24552a(f33901j);
            mo24540b(a);
            C12967r.m26078a();
        }
    }

    /* renamed from: a */
    public final void mo24538a(C12961g gVar) {
        C12873f fVar;
        int size = this.f33908g.size() - 1;
        while (true) {
            if (size < 0) {
                fVar = null;
                break;
            }
            fVar = (C12873f) this.f33908g.get(size);
            if (fVar.f33706b == gVar) {
                break;
            }
            size--;
        }
        this.f33908g.remove(fVar);
    }

    /* renamed from: a */
    public final void mo24539a(C12984w wVar) {
        String a = mo24533a("NavigationManager dispatchCurrentChildState");
        new C12959i(wVar).mo24552a(f33901j);
        mo24540b(a);
    }

    /* renamed from: a */
    public static C12984w m26037a(C12984w wVar, C12984w wVar2) {
        if (wVar.value > wVar2.value) {
            return wVar2;
        }
        return wVar;
    }

    /* renamed from: a */
    public final void mo24536a(C12924i iVar, C12861f fVar) {
        if (iVar != null) {
            mo24537a((C12950b) new C12955f(iVar, fVar));
            return;
        }
        throw new NullPointerException("scene can't be null");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x009a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00c9, code lost:
        r0 = r6.f33834b;
        r6.mo24418k();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00ce, code lost:
        if (r9 != false) goto L_0x00d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00d0, code lost:
        com.bytedance.scene.p841c.C12880l.m25805a(r0);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m26038a(com.bytedance.scene.navigation.C12942d r5, com.bytedance.scene.C12924i r6, com.bytedance.scene.C12984w r7, android.os.Bundle r8, boolean r9, java.lang.Runnable r10) {
        /*
        L_0x0000:
            com.bytedance.scene.w r0 = r6.f33838f
            if (r0 != r7) goto L_0x000a
            if (r10 == 0) goto L_0x0009
            r10.run()
        L_0x0009:
            return
        L_0x000a:
            int r1 = r0.value
            int r2 = r7.value
            r3 = 8
            if (r1 >= r2) goto L_0x009b
            int[] r1 = com.bytedance.scene.navigation.C12945e.C129483.f33916a
            int r0 = r0.ordinal()
            r0 = r1[r0]
            switch(r0) {
                case 1: goto L_0x003d;
                case 2: goto L_0x0035;
                case 3: goto L_0x0027;
                case 4: goto L_0x001f;
                default: goto L_0x001d;
            }
        L_0x001d:
            goto L_0x009a
        L_0x001f:
            r6.mo24411e()
            m26038a(r5, r6, r7, r8, r9, r10)
            goto L_0x009a
        L_0x0027:
            android.view.View r0 = r6.f33834b
            r1 = 0
            r0.setVisibility(r1)
            r6.mo24397b()
            m26038a(r5, r6, r7, r8, r9, r10)
            goto L_0x00de
        L_0x0035:
            r6.mo24398b(r8)
            m26038a(r5, r6, r7, r8, r9, r10)
            goto L_0x00de
        L_0x003d:
            android.app.Activity r0 = r5.mo24477v()
            r6.mo24390a(r0)
            r6.mo24393a(r5)
            r6.mo24391a(r8)
            android.widget.FrameLayout r0 = r5.f33890l
            r6.mo24392a(r8, r0)
            if (r9 != 0) goto L_0x0091
            android.view.View r1 = r6.f33834b
            android.graphics.drawable.Drawable r1 = r1.getBackground()
            if (r1 != 0) goto L_0x008c
            com.bytedance.scene.navigation.Record r1 = r5.mo24530d(r6)
            boolean r1 = r1.f33880b
            if (r1 != 0) goto L_0x008c
            com.bytedance.scene.navigation.f r1 = r5.f33888j
            boolean r1 = r1.f33945d
            if (r1 == 0) goto L_0x008c
            com.bytedance.scene.navigation.f r1 = r5.f33888j
            int r1 = r1.f33946e
            if (r1 <= 0) goto L_0x007f
            android.view.View r2 = r6.f33834b
            android.content.Context r4 = r6.mo24476u()
            android.content.res.Resources r4 = r4.getResources()
            android.graphics.drawable.Drawable r1 = r4.getDrawable(r1)
            r2.setBackgroundDrawable(r1)
            goto L_0x008c
        L_0x007f:
            android.view.View r1 = r6.f33834b
            android.content.Context r2 = r6.mo24476u()
            android.graphics.drawable.Drawable r2 = com.bytedance.scene.p841c.C12880l.m25800a(r2)
            r1.setBackgroundDrawable(r2)
        L_0x008c:
            android.view.View r1 = r6.f33834b
            r0.addView(r1)
        L_0x0091:
            android.view.View r0 = r6.f33834b
            r0.setVisibility(r3)
            m26038a(r5, r6, r7, r8, r9, r10)
            goto L_0x00de
        L_0x009a:
            return
        L_0x009b:
            int[] r1 = com.bytedance.scene.navigation.C12945e.C129483.f33916a
            int r0 = r0.ordinal()
            r0 = r1[r0]
            switch(r0) {
                case 2: goto L_0x00c9;
                case 3: goto L_0x00bc;
                case 4: goto L_0x00ae;
                case 5: goto L_0x00a7;
                default: goto L_0x00a6;
            }
        L_0x00a6:
            goto L_0x00de
        L_0x00a7:
            r6.mo24416g()
            m26038a(r5, r6, r7, r8, r9, r10)
            return
        L_0x00ae:
            r6.mo24417j()
            if (r9 != 0) goto L_0x00b8
            android.view.View r0 = r6.f33834b
            r0.setVisibility(r3)
        L_0x00b8:
            m26038a(r5, r6, r7, r8, r9, r10)     // Catch:{ Throwable -> 0x00df }
            return
        L_0x00bc:
            com.bytedance.scene.w r0 = com.bytedance.scene.C12984w.VIEW_CREATED
            if (r7 == r0) goto L_0x00c1
            goto L_0x00c9
        L_0x00c1:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "cant switch state ACTIVITY_CREATED to VIEW_CREATED"
            r5.<init>(r6)
            throw r5
        L_0x00c9:
            android.view.View r0 = r6.f33834b
            r6.mo24418k()
            if (r9 != 0) goto L_0x00d3
            com.bytedance.scene.p841c.C12880l.m25805a(r0)
        L_0x00d3:
            r6.mo24419l()
            r6.mo24420m()
            r6.mo24421n()
            goto L_0x0000
        L_0x00de:
            return
        L_0x00df:
            r5 = move-exception
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.scene.navigation.C12945e.m26038a(com.bytedance.scene.navigation.d, com.bytedance.scene.i, com.bytedance.scene.w, android.os.Bundle, boolean, java.lang.Runnable):void");
    }
}
