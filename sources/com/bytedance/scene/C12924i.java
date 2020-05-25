package com.bytedance.scene;

import android.app.Activity;
import android.arch.lifecycle.C0159aa;
import android.arch.lifecycle.C0160ab;
import android.arch.lifecycle.C0176h;
import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0176h.C0178b;
import android.arch.lifecycle.C0183j;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0185l;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.p030v4.view.C1056u;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.scene.C12969t.C12971a;
import com.bytedance.scene.C12969t.C12972b;
import com.bytedance.scene.navigation.C12942d;
import com.bytedance.scene.p841c.C12877i;
import com.bytedance.scene.p841c.C12881m;
import com.bytedance.scene.p842d.C12886d;
import com.p683ss.android.ugc.aweme.experiment.UnReadVideoExperiment;
import com.p683ss.android.ugc.aweme.video.preload.model.PreloadTask;
import com.ss.android.ugc.trill.R;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.scene.i */
public abstract class C12924i implements C0160ab, C0184k {

    /* renamed from: b */
    public View f33834b;

    /* renamed from: c */
    public C12924i f33835c;

    /* renamed from: d */
    public C12971a f33836d = C12969t.f33964a;

    /* renamed from: e */
    public C12942d f33837e;

    /* renamed from: f */
    public C12984w f33838f = C12984w.NONE;

    /* renamed from: g */
    public Bundle f33839g;

    /* renamed from: g_ */
    public Activity f33840g_;

    /* renamed from: h */
    public int f33841h;

    /* renamed from: i */
    private Context f33842i;

    /* renamed from: j */
    private LayoutInflater f33843j;

    /* renamed from: k */
    private C12969t f33844k;

    /* renamed from: l */
    private final StringBuilder f33845l = new StringBuilder(this.f33838f.name);

    /* renamed from: m */
    private final Handler f33846m = new Handler(Looper.getMainLooper());

    /* renamed from: n */
    private final List<Runnable> f33847n = new ArrayList();

    /* renamed from: o */
    private boolean f33848o = false;

    /* renamed from: p */
    private boolean f33849p = false;

    /* renamed from: q */
    private final C12927a f33850q = new C12927a(new C0185l(this));

    /* renamed from: com.bytedance.scene.i$a */
    static class C12927a extends C0176h {

        /* renamed from: a */
        final C0185l f33853a;

        /* renamed from: b */
        final List<C0183j> f33854b;

        /* renamed from: a */
        public final C0178b mo323a() {
            return this.f33853a.mo323a();
        }

        private C12927a(C0185l lVar) {
            this.f33854b = new ArrayList();
            this.f33853a = lVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo24482a(C0177a aVar) {
            this.f33853a.mo332a(aVar);
        }

        /* renamed from: b */
        public final void mo325b(C0183j jVar) {
            this.f33854b.remove(jVar);
            this.f33853a.mo325b(jVar);
        }

        /* renamed from: a */
        public final void mo324a(C0183j jVar) {
            this.f33854b.add(jVar);
            this.f33853a.mo324a(jVar);
        }
    }

    /* renamed from: com.bytedance.scene.i$b */
    static class C12928b implements C12972b {

        /* renamed from: a */
        public C0159aa f33855a;

        /* renamed from: a */
        public final void mo24483a() {
            this.f33855a.mo301a();
        }

        private C12928b(C0159aa aaVar) {
            this.f33855a = aaVar;
        }
    }

    /* renamed from: A */
    public void mo24457A() {
        this.f33848o = true;
    }

    /* renamed from: a */
    public abstract View mo24387a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle);

    public final C0176h getLifecycle() {
        return this.f33850q;
    }

    /* renamed from: o */
    public void mo24468o() {
        this.f33848o = true;
    }

    /* renamed from: p */
    public void mo24469p() {
        this.f33848o = true;
    }

    /* renamed from: q */
    public void mo24470q() {
        this.f33848o = true;
    }

    /* renamed from: y */
    public void mo24480y() {
        this.f33848o = true;
    }

    /* renamed from: a */
    public void mo24395a(C12924i iVar, boolean z) {
        C12924i iVar2 = this.f33835c;
        if (iVar2 != null) {
            iVar2.mo24395a(iVar, iVar == this);
        }
    }

    /* renamed from: B */
    public void mo24458B() {
        this.f33848o = true;
        mo24459D();
    }

    public final int hashCode() {
        return super.hashCode();
    }

    /* renamed from: m */
    public void mo24420m() {
        this.f33835c = null;
        this.f33837e = null;
    }

    /* renamed from: C */
    public boolean mo24445C() {
        if (this.f33838f.value >= C12984w.STARTED.value) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final void mo24459D() {
        boolean C = mo24445C();
        if (C != this.f33849p) {
            this.f33849p = C;
        }
    }

    /* renamed from: E */
    public final C12969t mo24460E() {
        if (this.f33844k != null) {
            return this.f33844k;
        }
        throw new IllegalStateException("Scope is not created, you can't call before onCreate");
    }

    /* renamed from: r_ */
    public final View mo24472r_() {
        View view = this.f33834b;
        if (view != null) {
            return view;
        }
        throw new IllegalStateException("requireView() should not be called before onCreateView() or after onDestroyView()");
    }

    /* renamed from: s */
    public final Context mo24473s() {
        if (this.f33840g_ == null) {
            return null;
        }
        return this.f33840g_.getApplicationContext();
    }

    /* renamed from: w */
    public final Resources mo24478w() {
        return mo24477v().getResources();
    }

    /* access modifiers changed from: protected */
    /* renamed from: q_ */
    public final LayoutInflater mo24471q_() {
        if (this.f33843j == null) {
            if (this.f33840g_ != null) {
                this.f33843j = new C12936n(mo24477v(), this);
            } else {
                throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Scene is attached to the Activity.");
            }
        }
        return this.f33843j;
    }

    /* renamed from: u */
    public final Context mo24476u() {
        Context t = mo24474t();
        if (t != null) {
            return t;
        }
        StringBuilder sb = new StringBuilder("Scene ");
        sb.append(this);
        sb.append(" not attached to an activity.");
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: v */
    public final Activity mo24477v() {
        Activity activity = this.f33840g_;
        if (activity != null) {
            return activity;
        }
        StringBuilder sb = new StringBuilder("Scene ");
        sb.append(this);
        sb.append(" not attached to an activity.");
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: b */
    public void mo24397b() {
        this.f33848o = false;
        mo24480y();
        if (this.f33848o) {
            mo24395a(this, false);
            m25915a(C12984w.STARTED);
            mo24459D();
            this.f33850q.mo24482a(C0177a.ON_START);
            return;
        }
        StringBuilder sb = new StringBuilder("Scene ");
        sb.append(this);
        sb.append(" did not call through to super.onStart()");
        throw new C12985x(sb.toString());
    }

    /* renamed from: e */
    public void mo24411e() {
        this.f33848o = false;
        mo24481z();
        if (this.f33848o) {
            mo24401b(this, false);
            m25915a(C12984w.RESUMED);
            this.f33850q.mo24482a(C0177a.ON_RESUME);
            return;
        }
        StringBuilder sb = new StringBuilder("Scene ");
        sb.append(this);
        sb.append(" did not call through to super.onResume()");
        throw new C12985x(sb.toString());
    }

    /* renamed from: g */
    public void mo24416g() {
        this.f33850q.mo24482a(C0177a.ON_PAUSE);
        m25915a(C12984w.STARTED);
        this.f33848o = false;
        mo24457A();
        if (this.f33848o) {
            mo24410d(this, false);
            return;
        }
        StringBuilder sb = new StringBuilder("Scene ");
        sb.append(this);
        sb.append(" did not call through to super.onPause()");
        throw new C12985x(sb.toString());
    }

    public final C0159aa getViewModelStore() {
        C12969t E = mo24460E();
        if (E.f33968d.containsKey(C12928b.class)) {
            return ((C12928b) E.mo24560a(C12928b.class)).f33855a;
        }
        C0159aa aaVar = new C0159aa();
        E.mo24561a(C12928b.class, new C12928b(aaVar));
        return aaVar;
    }

    /* renamed from: j */
    public void mo24417j() {
        this.f33850q.mo24482a(C0177a.ON_STOP);
        m25915a(C12984w.ACTIVITY_CREATED);
        this.f33848o = false;
        mo24458B();
        if (this.f33848o) {
            mo24406c(this, false);
            return;
        }
        StringBuilder sb = new StringBuilder("Scene ");
        sb.append(this);
        sb.append(" did not call through to super.onStop()");
        throw new C12985x(sb.toString());
    }

    /* renamed from: l */
    public void mo24419l() {
        this.f33848o = false;
        mo24470q();
        if (this.f33848o) {
            mo24415f(this, false);
            return;
        }
        StringBuilder sb = new StringBuilder("Scene ");
        sb.append(this);
        sb.append(" did not call through to super.onDestroy()");
        throw new C12985x(sb.toString());
    }

    /* renamed from: n */
    public void mo24421n() {
        Activity activity = this.f33840g_;
        this.f33840g_ = null;
        this.f33842i = null;
        this.f33848o = false;
        this.f33848o = true;
        if (this.f33848o) {
            if (!activity.isChangingConfigurations()) {
                this.f33844k.mo24562b();
            }
            this.f33844k = null;
            this.f33847n.clear();
            return;
        }
        StringBuilder sb = new StringBuilder("Scene ");
        sb.append(this);
        sb.append(" did not call through to super.onDetach()");
        throw new C12985x(sb.toString());
    }

    /* renamed from: t */
    public final Context mo24474t() {
        Context context;
        if (this.f33840g_ == null) {
            return null;
        }
        if (this.f33842i == null) {
            if (this.f33840g_ != null) {
                if (this.f33841h > 0) {
                    context = new C12886d(this.f33840g_, this.f33841h) {
                        public final Object getSystemService(String str) {
                            if ("scene".equals(str)) {
                                return C12924i.this;
                            }
                            if (!"layout_inflater".equals(str) || C12924i.this.f33840g_ == null) {
                                return super.getSystemService(str);
                            }
                            return C12924i.this.mo24471q_();
                        }
                    };
                } else {
                    context = new C12886d(this.f33840g_, this.f33840g_.getTheme()) {
                        public final Object getSystemService(String str) {
                            if ("scene".equals(str)) {
                                return C12924i.this;
                            }
                            if (!"layout_inflater".equals(str) || C12924i.this.f33840g_ == null) {
                                return super.getSystemService(str);
                            }
                            return C12924i.this.mo24471q_();
                        }
                    };
                }
                this.f33842i = context;
            } else {
                throw new IllegalStateException("onGetContextThemeWrapper() cannot be executed until the Scene is attached to the Activity.");
            }
        }
        return this.f33842i;
    }

    /* renamed from: z */
    public void mo24481z() {
        this.f33848o = true;
        if (this.f33847n.size() > 0) {
            ArrayList<Runnable> arrayList = new ArrayList<>(this.f33847n);
            for (Runnable run : arrayList) {
                run.run();
            }
            this.f33847n.removeAll(arrayList);
        }
    }

    /* renamed from: k */
    public void mo24418k() {
        if (VERSION.SDK_INT >= 16) {
            View view = this.f33834b;
            if (C12881m.f33708a == 0) {
                C12881m.m25807a();
            }
            if (C12881m.f33708a == 1) {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (viewGroup != null) {
                    try {
                        C12881m.f33709b.invoke(viewGroup, new Object[]{view});
                    } catch (IllegalAccessException | InvocationTargetException unused) {
                    }
                }
            }
        }
        this.f33850q.mo24482a(C0177a.ON_DESTROY);
        m25915a(C12984w.NONE);
        this.f33848o = false;
        mo24469p();
        if (this.f33848o) {
            mo24412e(this, false);
            if (VERSION.SDK_INT >= 19) {
                this.f33834b.cancelPendingInputEvents();
            }
            this.f33834b = null;
            this.f33843j = null;
            return;
        }
        StringBuilder sb = new StringBuilder("Scene ");
        sb.append(this);
        sb.append(" did not call through to super.onDestroyView()");
        throw new C12985x(sb.toString());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        String simpleName = getClass().getSimpleName();
        if (simpleName == null || simpleName.length() <= 0) {
            simpleName = getClass().getName();
            int lastIndexOf = simpleName.lastIndexOf(46);
            if (lastIndexOf > 0) {
                simpleName = simpleName.substring(lastIndexOf + 1);
            }
        }
        sb.append(simpleName);
        sb.append('{');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: x */
    public final C12942d mo24479x() {
        C12942d dVar = this.f33837e;
        if (dVar != null) {
            return dVar;
        }
        if (mo24473s() == null) {
            StringBuilder sb = new StringBuilder("Scene ");
            sb.append(this);
            sb.append(" is not attached to any Scene");
            throw new IllegalStateException(sb.toString());
        } else if (this instanceof C12942d) {
            StringBuilder sb2 = new StringBuilder("Scene ");
            sb2.append(this);
            sb2.append(" is root Scene");
            throw new IllegalStateException(sb2.toString());
        } else {
            throw new IllegalStateException("The root of the Scene hierarchy is not NavigationScene");
        }
    }

    /* renamed from: d */
    public void mo24408d(Bundle bundle) {
        this.f33848o = true;
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    /* renamed from: a */
    public final String mo24461a(int i) {
        return mo24478w().getString(i);
    }

    /* renamed from: b */
    public final <T extends View> T mo24464b(int i) {
        View view = this.f33834b;
        if (view == null) {
            return null;
        }
        return view.findViewById(i);
    }

    /* renamed from: a */
    public void mo24393a(C12924i iVar) {
        if (iVar != null) {
            this.f33835c = iVar;
            if (this.f33835c instanceof C12942d) {
                this.f33837e = (C12942d) this.f33835c;
            } else {
                this.f33837e = this.f33835c.f33837e;
            }
        }
        this.f33848o = false;
        mo24468o();
        if (!this.f33848o) {
            StringBuilder sb = new StringBuilder("Scene ");
            sb.append(this);
            sb.append(" did not call through to super.onAttach()");
            throw new C12985x(sb.toString());
        }
    }

    /* renamed from: c */
    public void mo24403c(Bundle bundle) {
        this.f33848o = false;
        mo24414f(bundle);
        if (!this.f33848o) {
            StringBuilder sb = new StringBuilder("Scene ");
            sb.append(this);
            sb.append(" did not call through to super.onSaveInstanceState()");
            throw new C12985x(sb.toString());
        }
    }

    /* renamed from: a */
    private void m25915a(C12984w wVar) {
        C12984w wVar2 = this.f33838f;
        if (wVar.value > wVar2.value) {
            if (wVar.value - wVar2.value != 1) {
                StringBuilder sb = new StringBuilder("Cant setState from ");
                sb.append(wVar2.name);
                sb.append(" to ");
                sb.append(wVar.name);
                throw new C12877i(sb.toString());
            }
        } else if (wVar.value < wVar2.value && !((wVar2 == C12984w.ACTIVITY_CREATED && wVar == C12984w.NONE) || wVar.value - wVar2.value == -1)) {
            StringBuilder sb2 = new StringBuilder("Cant setState from ");
            sb2.append(wVar2.name);
            sb2.append(" to ");
            sb2.append(wVar.name);
            throw new C12877i(sb2.toString());
        }
        this.f33838f = wVar;
        StringBuilder sb3 = this.f33845l;
        StringBuilder sb4 = new StringBuilder(" - ");
        sb4.append(wVar.name);
        sb3.append(sb4.toString());
    }

    /* renamed from: b */
    public void mo24398b(Bundle bundle) {
        this.f33848o = false;
        mo24448e(bundle);
        if (this.f33848o) {
            mo24400b(this, bundle, false);
            if (bundle != null) {
                this.f33848o = false;
                this.f33848o = true;
                SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("bd-scene:views");
                if (sparseParcelableArray != null) {
                    this.f33834b.restoreHierarchyState(sparseParcelableArray);
                }
                int i = bundle.getInt("bd-scene:focusedViewId", -1);
                if (i != -1) {
                    View findViewById = this.f33834b.findViewById(i);
                    if (findViewById != null) {
                        findViewById.requestFocus();
                    }
                }
                if (!this.f33848o) {
                    StringBuilder sb = new StringBuilder("Scene ");
                    sb.append(this);
                    sb.append(" did not call through to super.onViewStateRestored()");
                    throw new C12985x(sb.toString());
                }
            }
            m25915a(C12984w.ACTIVITY_CREATED);
            this.f33850q.mo24482a(C0177a.ON_CREATE);
            return;
        }
        StringBuilder sb2 = new StringBuilder("Scene ");
        sb2.append(this);
        sb2.append(" did not call through to super.onActivityCreated()");
        throw new C12985x(sb2.toString());
    }

    /* renamed from: e */
    public void mo24448e(Bundle bundle) {
        View decorView = mo24477v().getWindow().getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        if ((systemUiVisibility & PreloadTask.BYTE_UNIT_NUMBER) != 0) {
            C1056u.m3072r(decorView);
        } else if ((systemUiVisibility & UnReadVideoExperiment.LIKE_USER_LIST) != 0) {
            C1056u.m3072r(decorView);
        }
        this.f33848o = true;
    }

    /* renamed from: f */
    public void mo24414f(Bundle bundle) {
        this.f33848o = true;
        if (this.f33839g != null) {
            bundle.putBoolean("bd-scene-nav:scene_argument_has", true);
            bundle.putBundle("bd-scene-nav:scene_argument", this.f33839g);
        } else {
            bundle.putBoolean("bd-scene-nav:scene_argument_has", false);
        }
        bundle.putString("scope_key", this.f33844k.f33966b);
        SparseArray sparseArray = new SparseArray();
        this.f33834b.saveHierarchyState(sparseArray);
        bundle.putSparseParcelableArray("bd-scene:views", sparseArray);
        View findFocus = this.f33834b.findFocus();
        if (!(findFocus == null || findFocus.getId() == -1)) {
            bundle.putInt("bd-scene:focusedViewId", findFocus.getId());
        }
        mo24405c(this, bundle, false);
    }

    /* renamed from: j_ */
    public final <T extends View> T mo24467j_(int i) {
        T findViewById = mo24472r_().findViewById(i);
        if (findViewById != null) {
            return findViewById;
        }
        try {
            String resourceName = mo24478w().getResourceName(i);
            StringBuilder sb = new StringBuilder(" ");
            sb.append(resourceName);
            sb.append(" view not found");
            throw new IllegalArgumentException(sb.toString());
        } catch (NotFoundException unused) {
            StringBuilder sb2 = new StringBuilder(" ");
            sb2.append(i);
            sb2.append(" view not found");
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    /* renamed from: a */
    public void mo24390a(Activity activity) {
        this.f33840g_ = activity;
        if (this.f33850q.mo323a() != C0178b.INITIALIZED) {
            C12927a aVar = this.f33850q;
            for (C0183j b : aVar.f33854b) {
                aVar.f33853a.mo325b(b);
            }
            aVar.f33853a.mo333a(C0178b.INITIALIZED);
            for (C0183j a : aVar.f33854b) {
                aVar.f33853a.mo324a(a);
            }
        }
    }

    /* renamed from: a */
    public void mo24391a(Bundle bundle) {
        if (this.f33835c == null) {
            this.f33844k = this.f33836d.mo24563a();
        } else {
            C12969t E = this.f33835c.mo24460E();
            String str = null;
            if (bundle != null) {
                str = bundle.getString("scope_key");
            }
            if (TextUtils.isEmpty(str)) {
                str = C12969t.m26082a();
            }
            C12969t tVar = (C12969t) E.f33967c.get(str);
            if (tVar == null) {
                tVar = new C12969t(E, str);
                E.f33967c.put(str, tVar);
            }
            this.f33844k = tVar;
        }
        if (bundle != null && bundle.getBoolean("bd-scene-nav:scene_argument_has")) {
            Bundle bundle2 = bundle.getBundle("bd-scene-nav:scene_argument");
            if (bundle2 != null) {
                bundle2.setClassLoader(getClass().getClassLoader());
                this.f33839g = bundle2;
            } else {
                throw new IllegalStateException("can't get Scene arguments from savedInstanceState");
            }
        }
        this.f33848o = false;
        mo24408d(bundle);
        if (this.f33848o) {
            mo24394a(this, bundle, false);
            return;
        }
        StringBuilder sb = new StringBuilder("Scene ");
        sb.append(this);
        sb.append(" did not call through to super.onCreate()");
        throw new C12985x(sb.toString());
    }

    /* renamed from: a */
    public void mo24463a(View view, Bundle bundle) {
        this.f33848o = true;
    }

    /* renamed from: d */
    public void mo24410d(C12924i iVar, boolean z) {
        boolean z2;
        C12924i iVar2 = this.f33835c;
        if (iVar2 != null) {
            if (iVar == this) {
                z2 = true;
            } else {
                z2 = false;
            }
            iVar2.mo24410d(iVar, z2);
        }
    }

    /* renamed from: e */
    public void mo24412e(C12924i iVar, boolean z) {
        boolean z2;
        C12924i iVar2 = this.f33835c;
        if (iVar2 != null) {
            if (iVar == this) {
                z2 = true;
            } else {
                z2 = false;
            }
            iVar2.mo24412e(iVar, z2);
        }
    }

    /* renamed from: f */
    public void mo24415f(C12924i iVar, boolean z) {
        boolean z2;
        C12924i iVar2 = this.f33835c;
        if (iVar2 != null) {
            if (iVar == this) {
                z2 = true;
            } else {
                z2 = false;
            }
            iVar2.mo24415f(iVar, z2);
        }
    }

    /* renamed from: a */
    public final String mo24462a(int i, Object... objArr) {
        return mo24478w().getString(i, objArr);
    }

    /* renamed from: c */
    public void mo24406c(C12924i iVar, boolean z) {
        boolean z2;
        C12924i iVar2 = this.f33835c;
        if (iVar2 != null) {
            if (iVar == this) {
                z2 = true;
            } else {
                z2 = false;
            }
            iVar2.mo24406c(iVar, z2);
        }
    }

    /* renamed from: b */
    public void mo24401b(C12924i iVar, boolean z) {
        boolean z2;
        C12924i iVar2 = this.f33835c;
        if (iVar2 != null) {
            if (iVar == this) {
                z2 = true;
            } else {
                z2 = false;
            }
            iVar2.mo24401b(iVar, z2);
        }
    }

    /* renamed from: a */
    public void mo24392a(Bundle bundle, ViewGroup viewGroup) {
        if (this.f33834b == null) {
            View a = mo24387a(mo24471q_(), viewGroup, bundle);
            if (a == null) {
                throw new IllegalArgumentException("onCreateView cant return null");
            } else if (a.getParent() == null) {
                a.getId();
                Context u = mo24476u();
                Context context = a.getContext();
                if (context == u || this.f33841h == 0 || context.getSystemService("scene") == this) {
                    a.setTag(R.id.e1_, this);
                    a.setSaveFromParentEnabled(false);
                    this.f33834b = a;
                    this.f33848o = false;
                    mo24463a(this.f33834b, bundle);
                    if (this.f33848o) {
                        m25915a(C12984w.VIEW_CREATED);
                        return;
                    }
                    StringBuilder sb = new StringBuilder("Scene ");
                    sb.append(this);
                    sb.append(" did not call through to super.onViewCreated()");
                    throw new C12985x(sb.toString());
                }
                throw new IllegalArgumentException("Scene view's context is incorrect, you should create view with getLayoutInflater() or requireSceneContext() instead");
            } else {
                throw new IllegalArgumentException("onCreateView returned view already has a parent. You must call removeView() on the view's parent first.");
            }
        } else {
            throw new IllegalArgumentException("Scene already call onCreateView");
        }
    }

    /* renamed from: c */
    public void mo24405c(C12924i iVar, Bundle bundle, boolean z) {
        boolean z2;
        C12924i iVar2 = this.f33835c;
        if (iVar2 != null) {
            if (iVar == this) {
                z2 = true;
            } else {
                z2 = false;
            }
            iVar2.mo24405c(iVar, bundle, z2);
        }
    }

    /* renamed from: b */
    public void mo24400b(C12924i iVar, Bundle bundle, boolean z) {
        boolean z2;
        C12924i iVar2 = this.f33835c;
        if (iVar2 != null) {
            if (iVar == this) {
                z2 = true;
            } else {
                z2 = false;
            }
            iVar2.mo24400b(iVar, bundle, z2);
        }
    }

    /* renamed from: a */
    public void mo24394a(C12924i iVar, Bundle bundle, boolean z) {
        boolean z2;
        C12924i iVar2 = this.f33835c;
        if (iVar2 != null) {
            if (iVar == this) {
                z2 = true;
            } else {
                z2 = false;
            }
            iVar2.mo24394a(iVar, bundle, z2);
        }
    }
}
