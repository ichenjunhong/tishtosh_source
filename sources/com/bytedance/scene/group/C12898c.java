package com.bytedance.scene.group;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.p030v4.p038f.C0794k;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.scene.C12924i;
import com.bytedance.scene.C12967r;
import com.bytedance.scene.C12984w;
import com.bytedance.scene.navigation.C12942d;
import com.bytedance.scene.p837a.C12834b;
import com.bytedance.scene.p841c.C12868b;
import com.bytedance.scene.p841c.C12877i;
import com.bytedance.scene.p841c.C12879k;
import com.bytedance.scene.p841c.C12880l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.bytedance.scene.group.c */
final class C12898c {

    /* renamed from: e */
    public static final HashMap<C12924i, C12868b> f33760e = new HashMap<>();

    /* renamed from: i */
    private static final Runnable f33761i = new Runnable() {
        public final void run() {
        }
    };

    /* renamed from: a */
    public final C12896b f33762a;

    /* renamed from: b */
    public ViewGroup f33763b;

    /* renamed from: c */
    public final C12895a f33764c = new C12895a();

    /* renamed from: d */
    public final Handler f33765d = new Handler(Looper.getMainLooper());

    /* renamed from: f */
    boolean f33766f = false;

    /* renamed from: g */
    List<C12912d> f33767g = new ArrayList();

    /* renamed from: h */
    private final Set<C0794k<C12924i, String>> f33768h = new HashSet();

    /* renamed from: com.bytedance.scene.group.c$a */
    final class C12907a extends C12909c {

        /* renamed from: a */
        final int f33785a;

        /* renamed from: b */
        final String f33786b;

        /* renamed from: c */
        final C12834b f33787c;

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo24440a(boolean z) {
            super.mo24440a(z);
            if (z) {
            }
        }

        private C12907a(int i, C12924i iVar, String str, C12834b bVar) {
            super(iVar, i, str, C12898c.m25867a(C12984w.RESUMED, C12898c.this.f33762a.f33838f), true, false, false);
            this.f33785a = i;
            this.f33786b = str;
            this.f33787c = bVar;
        }
    }

    /* renamed from: com.bytedance.scene.group.c$b */
    final class C12908b extends C12909c {

        /* renamed from: b */
        private final C12834b f33790b;

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo24440a(boolean z) {
            super.mo24440a(z);
            if (this.f33799i.f33834b != null) {
                C12898c.m25871a(this.f33799i, 8);
                if (z) {
                }
            }
        }

        private C12908b(C12924i iVar, C12834b bVar) {
            super(iVar, -1, null, C12898c.m25867a(C12984w.ACTIVITY_CREATED, C12898c.this.f33762a.f33838f), false, true, false);
            this.f33790b = bVar;
        }
    }

    /* renamed from: com.bytedance.scene.group.c$c */
    abstract class C12909c extends C12912d {

        /* renamed from: e */
        final int f33791e;

        /* renamed from: f */
        final String f33792f;

        /* renamed from: g */
        final C12984w f33793g;

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo24440a(boolean z) {
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void mo24442b(boolean z) {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo24441a(Runnable runnable) {
            C12868b bVar = (C12868b) C12898c.f33760e.get(this.f33799i);
            if (bVar != null) {
                bVar.mo24332b();
                if (C12898c.f33760e.get(this.f33799i) != null) {
                    throw new C12877i("CancellationSignal cancel callback should remove target Scene from CancellationSignal map");
                }
            }
            if (!C12898c.this.mo24432f(this.f33799i)) {
                if (this.f33799i.f33838f == C12984w.NONE) {
                    C12880l.m25801a(this.f33792f, "tag can't be null");
                    C12895a aVar = C12898c.this.f33764c;
                    int i = this.f33791e;
                    C12924i iVar = this.f33799i;
                    String str = this.f33792f;
                    GroupRecord groupRecord = new GroupRecord();
                    groupRecord.f33741a = i;
                    groupRecord.f33742b = (C12924i) C12880l.m25801a(iVar, "scene can't be null");
                    groupRecord.f33743c = (String) C12880l.m25801a(str, "tag can't be null");
                    groupRecord.f33746f = (String) C12880l.m25801a(iVar.getClass().getName(), "Scene class name is null");
                    aVar.f33753a.add(groupRecord);
                    aVar.f33754b.put(groupRecord.f33742b, groupRecord);
                    aVar.f33755c.put(groupRecord.f33743c, groupRecord);
                } else {
                    StringBuilder sb = new StringBuilder("Scene state is ");
                    sb.append(this.f33799i.f33838f.name);
                    sb.append(" but it is not added to record list");
                    throw new C12877i(sb.toString());
                }
            }
            if (this.f33801k) {
                C12898c.this.f33764c.mo24380a(this.f33799i).f33744d = false;
            }
            boolean z = true;
            if (this.f33802l) {
                C12898c.this.f33764c.mo24380a(this.f33799i).f33744d = true;
            }
            if (this.f33799i.f33838f == this.f33793g) {
                z = false;
            }
            mo24442b(z);
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            C12898c.this.mo24427b(this.f33799i);
            C12898c.m25869a(C12898c.this.f33762a, this.f33799i, this.f33793g, this.f33803m, new Runnable() {
                public final void run() {
                    C12898c.this.mo24429c(C12909c.this.f33799i);
                    atomicBoolean.set(true);
                }
            });
            if (atomicBoolean.get()) {
                if (this.f33803m) {
                    C12895a aVar2 = C12898c.this.f33764c;
                    GroupRecord a = C12898c.this.f33764c.mo24380a(this.f33799i);
                    aVar2.f33753a.remove(a);
                    aVar2.f33754b.remove(a.f33742b);
                    aVar2.f33755c.remove(a.f33743c);
                }
                mo24440a(z);
                runnable.run();
                return;
            }
            final C12917e eVar = new C12917e("MoveStateOperation");
            C12898c.this.f33765d.post(new Runnable() {
                public final void run() {
                    throw eVar;
                }
            });
            throw eVar;
        }

        C12909c(C12924i iVar, int i, String str, C12984w wVar, boolean z, boolean z2, boolean z3) {
            super(iVar, wVar, z, z2, z3);
            if (!z || !z2) {
                this.f33791e = i;
                this.f33792f = str;
                this.f33793g = wVar;
                return;
            }
            throw new IllegalArgumentException("cant forceShow with forceHide");
        }
    }

    /* renamed from: com.bytedance.scene.group.c$d */
    abstract class C12912d {

        /* renamed from: i */
        final C12924i f33799i;

        /* renamed from: j */
        final C12984w f33800j;

        /* renamed from: k */
        final boolean f33801k;

        /* renamed from: l */
        final boolean f33802l;

        /* renamed from: m */
        final boolean f33803m;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract void mo24441a(Runnable runnable);

        C12912d(C12924i iVar, C12984w wVar, boolean z, boolean z2, boolean z3) {
            this.f33799i = iVar;
            this.f33800j = wVar;
            this.f33801k = z;
            this.f33802l = z2;
            this.f33803m = z3;
        }
    }

    /* renamed from: com.bytedance.scene.group.c$e */
    final class C12913e extends C12909c {

        /* renamed from: a */
        public final View f33805a;

        /* renamed from: b */
        public final ViewGroup f33806b;

        /* renamed from: c */
        public int f33807c;

        /* renamed from: o */
        private final C12834b f33809o;

        /* renamed from: p */
        private final boolean f33810p;

        /* renamed from: q */
        private boolean f33811q;

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public final void mo24442b(boolean z) {
            super.mo24442b(z);
            if (!z || this.f33810p) {
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo24440a(boolean z) {
            super.mo24440a(z);
            if (z && this.f33811q) {
                this.f33807c = this.f33805a.getVisibility();
                this.f33805a.setVisibility(0);
            }
        }

        private C12913e(C12924i iVar, C12834b bVar) {
            boolean z;
            super(iVar, -1, null, C12984w.NONE, false, false, true);
            this.f33809o = bVar;
            if (iVar.f33834b == null || iVar.f33834b.getParent() == null) {
                z = false;
            } else {
                z = true;
            }
            this.f33810p = z;
            if (this.f33810p) {
                this.f33805a = iVar.f33834b;
                this.f33806b = (ViewGroup) this.f33805a.getParent();
                return;
            }
            this.f33805a = null;
            this.f33806b = null;
        }
    }

    /* renamed from: com.bytedance.scene.group.c$f */
    final class C12914f extends C12909c {

        /* renamed from: b */
        private final C12834b f33813b;

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo24440a(boolean z) {
            super.mo24440a(z);
            if (!z || this.f33799i.f33834b != null) {
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public final void mo24442b(boolean z) {
            super.mo24442b(z);
            if (this.f33799i.f33834b != null) {
                C12898c.m25871a(this.f33799i, 0);
            }
        }

        private C12914f(C12924i iVar, C12834b bVar) {
            super(iVar, -1, null, C12898c.m25867a(C12984w.RESUMED, C12898c.this.f33762a.f33838f), true, false, false);
            this.f33813b = bVar;
        }
    }

    /* renamed from: com.bytedance.scene.group.c$g */
    final class C12915g extends C12909c {
        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo24440a(boolean z) {
            super.mo24440a(z);
            if (this.f33799i.f33834b != null && this.f33802l) {
                C12898c.m25871a(this.f33799i, 8);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public final void mo24442b(boolean z) {
            super.mo24442b(z);
            if (this.f33799i.f33834b != null && this.f33801k) {
                C12898c.m25871a(this.f33799i, 0);
            }
        }

        C12915g(C12924i iVar, int i, String str, C12984w wVar, boolean z, boolean z2, boolean z3) {
            super(iVar, i, str, wVar, z, z2, z3);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo24426a(C12984w wVar) {
        List a = m25868a();
        for (int i = 0; i <= a.size() - 1; i++) {
            final C12924i iVar = (C12924i) a.get(i);
            if (mo24432f(iVar)) {
                final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                mo24427b(iVar);
                m25869a(this.f33762a, iVar, wVar, false, new Runnable() {
                    public final void run() {
                        C12898c.this.mo24429c(iVar);
                        atomicBoolean.set(true);
                    }
                });
                if (!atomicBoolean.get()) {
                    final C12917e eVar = new C12917e("dispatchChildrenState");
                    this.f33765d.post(new Runnable() {
                        public final void run() {
                            throw eVar;
                        }
                    });
                    throw eVar;
                }
            }
        }
    }

    /* renamed from: b */
    private List<GroupRecord> m25872b() {
        return this.f33764c.mo24383b();
    }

    /* renamed from: a */
    private List<C12924i> m25868a() {
        return this.f33764c.mo24382a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final GroupRecord mo24430d(C12924i iVar) {
        return this.f33764c.mo24380a(iVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final int mo24431e(C12924i iVar) {
        return this.f33764c.mo24380a(iVar).f33741a;
    }

    /* renamed from: a */
    static C12907a m25866a(List<C12912d> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            C12912d dVar = (C12912d) list.get(size);
            if (dVar instanceof C12907a) {
                return (C12907a) dVar;
            }
        }
        return null;
    }

    /* renamed from: f */
    public final boolean mo24432f(C12924i iVar) {
        List b = m25872b();
        for (int i = 0; i < b.size(); i++) {
            if (((GroupRecord) b.get(i)).f33742b == iVar) {
                return true;
            }
        }
        return false;
    }

    C12898c(C12896b bVar) {
        this.f33762a = bVar;
    }

    /* renamed from: a */
    static void m25870a(C12912d dVar) {
        C12967r.m26079a("GroupSceneManager#executeOperation");
        dVar.mo24441a(f33761i);
        C12967r.m26078a();
    }

    /* renamed from: b */
    public final void mo24427b(C12924i iVar) {
        String str;
        C12879k.m25799a();
        for (C0794k kVar : this.f33768h) {
            if (kVar.f2711a == iVar) {
                StringBuilder sb = new StringBuilder("Target scene ");
                sb.append(iVar.getClass().getCanonicalName());
                sb.append(" is already tracked");
                throw new C12877i(sb.toString());
            }
        }
        C12942d dVar = this.f33762a.f33837e;
        if (dVar != null) {
            str = dVar.f33889k.mo24533a(iVar.toString());
        } else {
            str = null;
        }
        this.f33768h.add(C0794k.m2265a(iVar, str));
    }

    /* renamed from: c */
    public final void mo24429c(C12924i iVar) {
        C0794k kVar;
        C12879k.m25799a();
        Iterator it = this.f33768h.iterator();
        while (true) {
            if (!it.hasNext()) {
                kVar = null;
                break;
            }
            kVar = (C0794k) it.next();
            if (kVar.f2711a == iVar) {
                break;
            }
        }
        if (kVar != null) {
            if (((String) kVar.f2712b) != null) {
                String str = (String) kVar.f2712b;
                this.f33762a.f33837e.f33889k.mo24540b(str);
            }
            this.f33768h.remove(kVar);
            return;
        }
        StringBuilder sb = new StringBuilder("Target scene ");
        sb.append(iVar.getClass().getCanonicalName());
        sb.append(" is not tracked");
        throw new C12877i(sb.toString());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final GroupRecord mo24423a(String str) {
        return this.f33764c.mo24381a(str);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo24428b(C12984w wVar) {
        List b = m25872b();
        for (int i = 0; i <= b.size() - 1; i++) {
            GroupRecord groupRecord = (GroupRecord) b.get(i);
            if (!groupRecord.f33744d) {
                final C12924i iVar = groupRecord.f33742b;
                if (mo24432f(iVar)) {
                    final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                    mo24427b(iVar);
                    m25869a(this.f33762a, groupRecord.f33742b, wVar, false, new Runnable() {
                        public final void run() {
                            C12898c.this.mo24429c(iVar);
                            atomicBoolean.set(true);
                        }
                    });
                    if (!atomicBoolean.get()) {
                        final C12917e eVar = new C12917e("dispatchVisibleChildrenState");
                        this.f33765d.post(new Runnable() {
                            public final void run() {
                                throw eVar;
                            }
                        });
                        throw eVar;
                    }
                } else {
                    continue;
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo24424a(Bundle bundle) {
        bundle.putParcelableArrayList("bd-scene-nav:group_stack", new ArrayList(this.f33764c.f33753a));
        ArrayList arrayList = new ArrayList();
        List a = m25868a();
        for (int i = 0; i <= a.size() - 1; i++) {
            C12924i iVar = (C12924i) a.get(i);
            Bundle bundle2 = new Bundle();
            iVar.mo24403c(bundle2);
            arrayList.add(bundle2);
        }
        bundle.putParcelableArrayList("bd-scene-nav:group_scene_manager", arrayList);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo24425a(C12924i iVar) {
        C12879k.m25799a();
        for (C0794k kVar : this.f33768h) {
            if (kVar.f2711a == iVar) {
                StringBuilder sb = new StringBuilder("Cant add/remove/show/hide ");
                sb.append(iVar.getClass().getCanonicalName());
                sb.append(" before it finish previous add/remove/show/hide operation or in its lifecycle method");
                throw new IllegalStateException(sb.toString());
            }
        }
    }

    /* renamed from: a */
    public static C12984w m25867a(C12984w wVar, C12984w wVar2) {
        if (wVar.value < wVar2.value) {
            return wVar;
        }
        return wVar2;
    }

    /* renamed from: a */
    public static void m25871a(C12924i iVar, int i) {
        View view = iVar.f33834b;
        if (view.getVisibility() != i) {
            view.setVisibility(i);
        }
    }

    /* renamed from: a */
    public static void m25869a(C12896b bVar, C12924i iVar, C12984w wVar, boolean z, Runnable runnable) {
        C12984w wVar2 = iVar.f33838f;
        if (wVar2 == wVar) {
            if (runnable != null) {
                runnable.run();
            }
        } else if (wVar2.value < wVar.value) {
            switch (wVar2) {
                case NONE:
                    iVar.mo24390a(bVar.mo24477v());
                    iVar.mo24393a((C12924i) bVar);
                    GroupRecord d = bVar.f33757i.mo24430d(iVar);
                    Bundle bundle = d.f33747g;
                    iVar.mo24391a(bundle);
                    ViewGroup d2 = bVar.mo24407d(bVar.f33757i.mo24431e(iVar));
                    iVar.mo24392a(bundle, d2);
                    d2.addView(iVar.f33834b);
                    if (d.f33744d) {
                        m25871a(iVar, 8);
                    }
                    m25869a(bVar, iVar, wVar, z, runnable);
                    return;
                case VIEW_CREATED:
                    GroupRecord d3 = bVar.f33757i.mo24430d(iVar);
                    iVar.mo24398b(d3.f33747g);
                    d3.f33747g = null;
                    m25869a(bVar, iVar, wVar, z, runnable);
                    return;
                case ACTIVITY_CREATED:
                    iVar.mo24397b();
                    m25869a(bVar, iVar, wVar, z, runnable);
                    return;
                case STARTED:
                    iVar.mo24411e();
                    m25869a(bVar, iVar, wVar, z, runnable);
                    return;
                case RESUMED:
                    throw new C12916d("should not enter RESUMED");
                default:
                    StringBuilder sb = new StringBuilder("should not enter ");
                    sb.append(wVar2.getName());
                    throw new C12916d(sb.toString());
            }
        } else {
            switch (wVar2) {
                case NONE:
                    throw new C12916d("should not enter NONE");
                case VIEW_CREATED:
                    break;
                case ACTIVITY_CREATED:
                    if (wVar == C12984w.VIEW_CREATED) {
                        throw new IllegalArgumentException("cant switch state ACTIVITY_CREATED to VIEW_CREATED");
                    }
                    break;
                case STARTED:
                    iVar.mo24417j();
                    m25869a(bVar, iVar, wVar, z, runnable);
                    return;
                case RESUMED:
                    iVar.mo24416g();
                    m25869a(bVar, iVar, wVar, z, runnable);
                    return;
                default:
                    StringBuilder sb2 = new StringBuilder("should not enter ");
                    sb2.append(wVar2.getName());
                    throw new C12916d(sb2.toString());
            }
            View view = iVar.f33834b;
            iVar.mo24418k();
            if (z) {
                C12880l.m25805a(view);
            }
            iVar.mo24419l();
            iVar.mo24420m();
            iVar.mo24421n();
            m25869a(bVar, iVar, wVar, z, runnable);
        }
    }
}
