package com.bytedance.scene.group;

import android.app.Activity;
import android.content.res.Resources.NotFoundException;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import com.C2240a;
import com.bytedance.scene.C12924i;
import com.bytedance.scene.C12930k;
import com.bytedance.scene.C12966q;
import com.bytedance.scene.C12984w;
import com.bytedance.scene.p837a.C12834b;
import com.bytedance.scene.p840b.C12856c;
import com.bytedance.scene.p841c.C12873f;
import com.bytedance.scene.p841c.C12875h;
import com.bytedance.scene.p841c.C12877i;
import com.bytedance.scene.p841c.C12879k;
import com.bytedance.scene.p841c.C12880l;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.bytedance.scene.group.b */
public abstract class C12896b extends C12924i implements C12966q {

    /* renamed from: l */
    private static final C12834b f33756l = new C12834b() {
    };

    /* renamed from: i */
    public final C12898c f33757i = new C12898c(this);

    /* renamed from: j */
    public final List<C12873f<C12856c, Boolean>> f33758j = new ArrayList();

    /* renamed from: k */
    private boolean f33759k = true;

    /* access modifiers changed from: protected */
    /* renamed from: H */
    public void mo24386H() {
    }

    /* renamed from: b */
    public abstract ViewGroup mo24387a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle);

    public final void bY_() {
        this.f33759k = false;
    }

    /* renamed from: l */
    public final void mo24419l() {
        super.mo24419l();
    }

    /* renamed from: m */
    public final void mo24420m() {
        super.mo24420m();
    }

    /* renamed from: n */
    public final void mo24421n() {
        super.mo24421n();
    }

    /* renamed from: r */
    public final boolean mo24422r() {
        return this.f33759k;
    }

    /* renamed from: a */
    public final void mo24395a(C12924i iVar, boolean z) {
        if (iVar != this) {
            for (C12873f fVar : new ArrayList(this.f33758j)) {
                if (z || ((Boolean) fVar.f33706b).booleanValue()) {
                    ((C12856c) fVar.f33705a).mo24318a(iVar);
                }
            }
        }
        super.mo24395a(iVar, z);
    }

    /* renamed from: b */
    public final void mo24397b() {
        super.mo24397b();
        m25826b(C12984w.STARTED);
    }

    /* renamed from: e */
    public final void mo24411e() {
        super.mo24411e();
        m25826b(C12984w.RESUMED);
    }

    /* renamed from: g */
    public final void mo24416g() {
        m25826b(C12984w.STARTED);
        super.mo24416g();
    }

    /* renamed from: j */
    public final void mo24417j() {
        m25826b(C12984w.ACTIVITY_CREATED);
        super.mo24417j();
    }

    /* renamed from: k */
    public final void mo24418k() {
        m25824a(C12984w.NONE);
        super.mo24418k();
    }

    /* renamed from: F */
    public final void mo24384F() {
        C12898c cVar = this.f33757i;
        if (!cVar.f33766f) {
            cVar.f33766f = true;
            return;
        }
        throw new IllegalStateException("you must call commitTransaction before another beginTransaction");
    }

    /* renamed from: G */
    public final void mo24385G() {
        C12898c cVar = this.f33757i;
        if (cVar.f33766f) {
            if (cVar.f33767g.size() > 0) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (C12912d dVar : cVar.f33767g) {
                    List list = (List) linkedHashMap.get(dVar.f33799i);
                    if (list == null) {
                        list = new ArrayList();
                        linkedHashMap.put(dVar.f33799i, list);
                    }
                    list.add(dVar);
                }
                for (C12924i iVar : linkedHashMap.keySet()) {
                    List list2 = (List) linkedHashMap.get(iVar);
                    C12984w wVar = iVar.f33838f;
                    C12984w wVar2 = ((C12912d) list2.get(list2.size() - 1)).f33800j;
                    boolean z = ((C12912d) list2.get(list2.size() - 1)).f33801k;
                    boolean z2 = ((C12912d) list2.get(list2.size() - 1)).f33802l;
                    boolean z3 = ((C12912d) list2.get(list2.size() - 1)).f33803m;
                    if (wVar != wVar2 || z || z2 || z3) {
                        if (wVar == C12984w.NONE) {
                            C12907a a = C12898c.m25866a(list2);
                            if (a == null) {
                                throw new IllegalStateException("you must add Scene first");
                            } else if (cVar.mo24423a(a.f33786b) == null) {
                                C12915g gVar = new C12915g(iVar, a.f33785a, a.f33786b, wVar2, z, z2, z3);
                                C12898c.m25870a((C12912d) gVar);
                            } else {
                                StringBuilder sb = new StringBuilder("already have a Scene with tag ");
                                sb.append(a.f33786b);
                                throw new IllegalStateException(sb.toString());
                            }
                        } else {
                            C12915g gVar2 = new C12915g(iVar, -1, null, wVar2, z, z2, z3);
                            C12898c.m25870a((C12912d) gVar2);
                        }
                    }
                }
                cVar.f33767g.clear();
            }
            cVar.f33766f = false;
            return;
        }
        throw new IllegalStateException("you must call beginTransaction before commitTransaction");
    }

    /* renamed from: c */
    private void mo86790c() {
        ArrayList arrayList = new ArrayList();
        m25825a((List<ScenePlaceHolderView>) arrayList, (ViewGroup) mo24472r_());
        if (arrayList.size() != 0) {
            if (!mo24422r()) {
                SparseArray sparseArray = new SparseArray();
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    ScenePlaceHolderView scenePlaceHolderView = (ScenePlaceHolderView) arrayList.get(i);
                    ViewGroup viewGroup = (ViewGroup) scenePlaceHolderView.getParent();
                    int id = viewGroup.getId();
                    if (id != -1) {
                        if (sparseArray.get(id) == null) {
                            sparseArray.put(id, viewGroup);
                        } else if (sparseArray.get(id) != viewGroup) {
                            StringBuilder sb = new StringBuilder("ScenePlaceHolderView' parent ViewGroup should have unique id, the duplicate id is ");
                            sb.append(C12880l.m25802a(mo24476u(), id));
                            throw new IllegalArgumentException(sb.toString());
                        }
                        LayoutParams layoutParams = scenePlaceHolderView.getLayoutParams();
                        String sceneName = scenePlaceHolderView.getSceneName();
                        String sceneTag = scenePlaceHolderView.getSceneTag();
                        Bundle arguments = scenePlaceHolderView.getArguments();
                        C12924i iVar = null;
                        C12930k sceneComponentFactory = scenePlaceHolderView.getSceneComponentFactory();
                        if (sceneComponentFactory != null) {
                            iVar = sceneComponentFactory.mo24488a(mo24476u().getClassLoader(), sceneName, arguments);
                        }
                        if (iVar == null) {
                            iVar = C12875h.m25795a(mo24476u(), sceneName, arguments);
                        }
                        int indexOfChild = viewGroup.indexOfChild(scenePlaceHolderView);
                        viewGroup.removeView(scenePlaceHolderView);
                        if (scenePlaceHolderView.getVisibility() == 0) {
                            mo24389a(id, iVar, sceneTag);
                        } else if (scenePlaceHolderView.getVisibility() == 8) {
                            mo24384F();
                            mo24389a(id, iVar, sceneTag);
                            mo24404c(iVar);
                            mo24385G();
                        } else {
                            throw new IllegalStateException("ScenePlaceHolderView's visibility can't be View.INVISIBLE, use View.VISIBLE or View.GONE instead");
                        }
                        View r_ = iVar.mo24472r_();
                        if (scenePlaceHolderView.getId() != -1) {
                            if (r_.getId() == -1) {
                                r_.setId(scenePlaceHolderView.getId());
                            } else if (scenePlaceHolderView.getId() != r_.getId()) {
                                throw new IllegalStateException(C2240a.m6772a("ScenePlaceHolderView's id %s is different from Scene root view's id %s", new Object[]{C12880l.m25802a(mo24476u(), scenePlaceHolderView.getId()), C12880l.m25802a(mo24476u(), r_.getId())}));
                            }
                        }
                        viewGroup.removeView(r_);
                        viewGroup.addView(r_, indexOfChild, layoutParams);
                        i++;
                    } else {
                        throw new IllegalArgumentException("ScenePlaceHolderView parent id can't be View.NO_ID");
                    }
                }
                return;
            }
            throw new IllegalStateException("ScenePlaceHolderView can only be used when support restore is disabled");
        }
    }

    /* renamed from: a */
    public final void mo24390a(Activity activity) {
        super.mo24390a(activity);
    }

    /* renamed from: c */
    public final void mo24403c(Bundle bundle) {
        super.mo24403c(bundle);
    }

    /* renamed from: a */
    private void m25824a(C12984w wVar) {
        this.f33757i.mo24426a(wVar);
    }

    /* renamed from: b */
    private void m25826b(C12984w wVar) {
        this.f33757i.mo24428b(wVar);
    }

    /* renamed from: a */
    public final <T extends C12924i> T mo24388a(String str) {
        C12879k.m25799a();
        if (str == null) {
            return null;
        }
        GroupRecord a = this.f33757i.mo24423a(str);
        if (a != null) {
            return a.f33742b;
        }
        return null;
    }

    /* renamed from: b */
    public final void mo24398b(Bundle bundle) {
        super.mo24398b(bundle);
        m25824a(C12984w.ACTIVITY_CREATED);
        mo24386H();
    }

    /* renamed from: e */
    public final boolean mo24413e(C12924i iVar) {
        GroupRecord d = this.f33757i.mo24430d(iVar);
        if (d != null && !d.f33744d) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final void mo24399b(C12924i iVar) {
        C12834b bVar = f33756l;
        C12879k.m25799a();
        C12898c cVar = this.f33757i;
        cVar.mo24425a(iVar);
        if (cVar.f33766f || cVar.f33764c.mo24380a(iVar) != null) {
            C12913e eVar = new C12913e(iVar, bVar);
            if (cVar.f33766f) {
                cVar.f33767g.add(eVar);
            } else {
                C12898c.m25870a((C12912d) eVar);
            }
        } else {
            throw new IllegalStateException("Target scene is not find");
        }
    }

    /* renamed from: c */
    public final void mo24404c(C12924i iVar) {
        C12834b bVar = f33756l;
        C12879k.m25799a();
        C12898c cVar = this.f33757i;
        cVar.mo24425a(iVar);
        if (cVar.f33766f || cVar.f33764c.mo24380a(iVar) != null) {
            C12908b bVar2 = new C12908b(iVar, bVar);
            if (cVar.f33766f) {
                cVar.f33767g.add(bVar2);
            } else {
                C12898c.m25870a((C12912d) bVar2);
            }
        } else {
            throw new IllegalStateException("Target scene is not find");
        }
    }

    /* renamed from: d */
    public final void mo24409d(C12924i iVar) {
        C12834b bVar = f33756l;
        C12879k.m25799a();
        C12898c cVar = this.f33757i;
        cVar.mo24425a(iVar);
        if (cVar.f33766f || cVar.f33764c.mo24380a(iVar) != null) {
            C12914f fVar = new C12914f(iVar, bVar);
            if (cVar.f33766f) {
                cVar.f33767g.add(fVar);
            } else {
                C12898c.m25870a((C12912d) fVar);
            }
        } else {
            throw new IllegalStateException("Target scene is not find");
        }
    }

    /* renamed from: f */
    public void mo24414f(Bundle bundle) {
        super.mo24414f(bundle);
        if (!bundle.containsKey("bd-scene-group:support_restore")) {
            bundle.putBoolean("bd-scene-group:support_restore", mo24422r());
            if (mo24422r()) {
                this.f33757i.mo24424a(bundle);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("outState already contains key bd-scene-group:support_restore");
    }

    /* renamed from: a */
    public final void mo24391a(Bundle bundle) {
        super.mo24391a(bundle);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final ViewGroup mo24407d(int i) {
        ViewGroup viewGroup = (ViewGroup) this.f33834b.findViewById(i);
        if (viewGroup != null) {
            ViewGroup viewGroup2 = viewGroup;
            while (viewGroup2 != null && viewGroup2 != this.f33834b) {
                C12924i iVar = (C12924i) viewGroup2.getTag(R.id.e1_);
                if (iVar == null) {
                    viewGroup2 = (ViewGroup) viewGroup2.getParent();
                } else {
                    throw new IllegalArgumentException(C2240a.m6772a("cant add Scene to child Scene %s view hierarchy ", new Object[]{iVar.toString()}));
                }
            }
            return viewGroup;
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

    /* renamed from: d */
    public void mo24408d(Bundle bundle) {
        super.mo24408d(bundle);
        if (bundle != null) {
            if (!bundle.getBoolean("bd-scene-group:support_restore", mo24422r())) {
                bY_();
            }
            if (mo24422r()) {
                C12898c cVar = this.f33757i;
                Activity v = mo24477v();
                C12895a aVar = cVar.f33764c;
                if (aVar.f33753a == null || aVar.f33753a.size() <= 0) {
                    aVar.f33753a = new ArrayList(bundle.getParcelableArrayList("bd-scene-nav:group_stack"));
                    for (GroupRecord groupRecord : aVar.f33753a) {
                        groupRecord.f33742b = C12875h.m25795a(v, groupRecord.f33746f, null);
                        aVar.f33754b.put(groupRecord.f33742b, groupRecord);
                        aVar.f33755c.put(groupRecord.f33743c, groupRecord);
                    }
                    List b = cVar.f33764c.mo24383b();
                    if (b.size() != 0) {
                        ArrayList parcelableArrayList = bundle.getParcelableArrayList("bd-scene-nav:group_scene_manager");
                        int i = 0;
                        while (i <= b.size() - 1) {
                            GroupRecord groupRecord2 = (GroupRecord) b.get(i);
                            C12924i iVar = groupRecord2.f33742b;
                            groupRecord2.f33747g = (Bundle) parcelableArrayList.get(i);
                            if (cVar.mo24432f(iVar)) {
                                AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                                cVar.mo24427b(iVar);
                                C12898c.m25869a(cVar.f33762a, iVar, cVar.f33762a.f33838f, false, new Runnable(iVar, atomicBoolean) {

                                    /* renamed from: a */
                                    final /* synthetic */ C12924i f33779a;

                                    /* renamed from: b */
                                    final /* synthetic */ AtomicBoolean f33780b;

                                    public final void run() {
                                        C12898c.this.mo24429c(this.f33779a);
                                        this.f33780b.set(true);
                                    }

                                    {
                                        this.f33779a = r2;
                                        this.f33780b = r3;
                                    }
                                });
                                if (atomicBoolean.get()) {
                                    i++;
                                } else {
                                    C12917e eVar = new C12917e("restoreFromBundle");
                                    cVar.f33765d.post(new Runnable(eVar) {

                                        /* renamed from: a */
                                        final /* synthetic */ RuntimeException f33782a;

                                        public final void run() {
                                            throw this.f33782a;
                                        }

                                        {
                                            this.f33782a = r2;
                                        }
                                    });
                                    throw eVar;
                                }
                            } else {
                                throw new C12877i("Scene is not found");
                            }
                        }
                        return;
                    }
                    return;
                }
                throw new IllegalStateException("mSceneList size is not zero, Scene is added before restore");
            }
        }
    }

    /* renamed from: a */
    public final void mo24393a(C12924i iVar) {
        super.mo24393a(iVar);
        if (iVar == null) {
            return;
        }
        if (iVar instanceof C12966q) {
            if (!((C12966q) iVar).mo24422r()) {
                bY_();
            }
            return;
        }
        StringBuilder sb = new StringBuilder("unknown parent Scene type ");
        sb.append(iVar.getClass());
        throw new C12877i(sb.toString());
    }

    /* renamed from: a */
    private static void m25825a(List<ScenePlaceHolderView> list, ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        if (childCount != 0) {
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt instanceof ScenePlaceHolderView) {
                    list.add((ScenePlaceHolderView) childAt);
                } else if (childAt instanceof ViewGroup) {
                    m25825a(list, (ViewGroup) childAt);
                }
            }
        }
    }

    /* renamed from: e */
    public final void mo24412e(C12924i iVar, boolean z) {
        if (iVar != this) {
            for (C12873f fVar : new ArrayList(this.f33758j)) {
                if (!z) {
                    ((Boolean) fVar.f33706b).booleanValue();
                }
            }
        }
        super.mo24412e(iVar, z);
    }

    /* renamed from: f */
    public final void mo24415f(C12924i iVar, boolean z) {
        if (iVar != this) {
            for (C12873f fVar : new ArrayList(this.f33758j)) {
                if (z || ((Boolean) fVar.f33706b).booleanValue()) {
                    ((C12856c) fVar.f33705a).mo24320b(iVar);
                }
            }
        }
        super.mo24415f(iVar, z);
    }

    /* renamed from: a */
    public final void mo24392a(Bundle bundle, ViewGroup viewGroup) {
        super.mo24392a(bundle, viewGroup);
        if (this.f33834b instanceof ViewGroup) {
            this.f33757i.f33763b = (ViewGroup) this.f33834b;
            m25824a(C12984w.VIEW_CREATED);
            mo86790c();
            return;
        }
        throw new IllegalArgumentException("GroupScene onCreateView view must be ViewGroup");
    }

    /* renamed from: b */
    public final void mo24401b(C12924i iVar, boolean z) {
        if (iVar != this) {
            for (C12873f fVar : new ArrayList(this.f33758j)) {
                if (!z) {
                    ((Boolean) fVar.f33706b).booleanValue();
                }
            }
        }
        super.mo24401b(iVar, z);
    }

    /* renamed from: c */
    public final void mo24406c(C12924i iVar, boolean z) {
        if (iVar != this) {
            for (C12873f fVar : new ArrayList(this.f33758j)) {
                if (!z) {
                    ((Boolean) fVar.f33706b).booleanValue();
                }
            }
        }
        super.mo24406c(iVar, z);
    }

    /* renamed from: d */
    public final void mo24410d(C12924i iVar, boolean z) {
        if (iVar != this) {
            for (C12873f fVar : new ArrayList(this.f33758j)) {
                if (!z) {
                    ((Boolean) fVar.f33706b).booleanValue();
                }
            }
        }
        super.mo24410d(iVar, z);
    }

    /* renamed from: b */
    public final void mo24400b(C12924i iVar, Bundle bundle, boolean z) {
        if (iVar != this) {
            for (C12873f fVar : new ArrayList(this.f33758j)) {
                if (z || ((Boolean) fVar.f33706b).booleanValue()) {
                    ((C12856c) fVar.f33705a).mo24319a(iVar, bundle);
                }
            }
        }
        super.mo24400b(iVar, bundle, z);
    }

    /* renamed from: c */
    public final void mo24405c(C12924i iVar, Bundle bundle, boolean z) {
        if (iVar != this) {
            for (C12873f fVar : new ArrayList(this.f33758j)) {
                if (!z) {
                    ((Boolean) fVar.f33706b).booleanValue();
                }
            }
        }
        super.mo24405c(iVar, bundle, z);
    }

    /* renamed from: a */
    public final void mo24389a(int i, C12924i iVar, String str) {
        boolean z;
        String str2;
        C12834b bVar = f33756l;
        C12879k.m25799a();
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("tag can't be empty");
        } else if (iVar != this) {
            if (this.f33757i.mo24430d(iVar) != null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                int e = this.f33757i.mo24431e(iVar);
                if (e == i) {
                    String str3 = this.f33757i.f33764c.mo24380a(iVar).f33743c;
                    if (!str3.equals(str)) {
                        StringBuilder sb = new StringBuilder("Scene is already added, tag ");
                        sb.append(str3);
                        throw new IllegalArgumentException(sb.toString());
                    }
                } else {
                    try {
                        str2 = mo24478w().getResourceName(e);
                    } catch (NotFoundException unused) {
                        str2 = String.valueOf(e);
                    }
                    StringBuilder sb2 = new StringBuilder("Scene is already added to another container, viewId ");
                    sb2.append(str2);
                    throw new IllegalArgumentException(sb2.toString());
                }
            } else {
                C12924i a = mo24388a(str);
                if (a != null) {
                    StringBuilder sb3 = new StringBuilder("already have a Scene ");
                    sb3.append(a.toString());
                    sb3.append(" with tag ");
                    sb3.append(str);
                    throw new IllegalArgumentException(sb3.toString());
                }
            }
            if (iVar.f33835c != null && iVar.f33835c != this) {
                StringBuilder sb4 = new StringBuilder("Scene already has a parent, parent ");
                sb4.append(iVar.f33835c);
                throw new IllegalArgumentException(sb4.toString());
            } else if (!mo24422r() || C12875h.m25797a(iVar)) {
                C12898c cVar = this.f33757i;
                cVar.mo24425a(iVar);
                C12907a aVar = new C12907a(i, iVar, str, bVar);
                if (cVar.f33766f) {
                    cVar.f33767g.add(aVar);
                } else {
                    C12898c.m25870a((C12912d) aVar);
                }
            } else {
                StringBuilder sb5 = new StringBuilder("Scene ");
                sb5.append(iVar.getClass().getName());
                sb5.append(" must be a public class or public static class, and have only one parameterless constructor to be properly recreated from instance state.");
                throw new IllegalArgumentException(sb5.toString());
            }
        } else {
            throw new IllegalArgumentException("GroupScene can't be added to itself");
        }
    }

    /* renamed from: a */
    public final void mo24394a(C12924i iVar, Bundle bundle, boolean z) {
        if (iVar != this) {
            for (C12873f fVar : new ArrayList(this.f33758j)) {
                if (!z) {
                    ((Boolean) fVar.f33706b).booleanValue();
                }
            }
        }
        super.mo24394a(iVar, bundle, z);
    }
}
