package com.p683ss.android.ugc.aweme.sticker.types.p2320a;

import android.arch.lifecycle.C0198r;
import android.support.p043v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import com.p683ss.android.ugc.asve.recorder.effect.C20489b;
import com.p683ss.android.ugc.asve.recorder.effect.composer.C20501c;
import com.p683ss.android.ugc.asve.recorder.effect.composer.ComposerInfo;
import com.p683ss.android.ugc.aweme.sticker.p2301k.C46059g;
import com.p683ss.android.ugc.aweme.sticker.panel.C46256q;
import com.p683ss.android.ugc.aweme.sticker.panel.C46256q.C46257a;
import com.p683ss.android.ugc.aweme.sticker.presenter.C46354l;
import com.p683ss.android.ugc.aweme.sticker.presenter.handler.C46306b;
import com.p683ss.android.ugc.aweme.sticker.presenter.handler.p2312c.C46315a;
import com.p683ss.android.ugc.aweme.sticker.presenter.handler.p2312c.C46316b;
import com.p683ss.android.ugc.aweme.themechange.base.AVDmtImageTextView;
import com.p683ss.android.ugc.effectmanager.common.p2440g.C48649d;
import com.p683ss.android.ugc.effectmanager.effect.model.ComposerHelper;
import com.p683ss.android.ugc.effectmanager.effect.model.ComposerNode;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48705j;
import com.p683ss.android.vesdk.C50630ak;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52757k;
import p2628d.C52857u;
import p2628d.C52860x;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2641b.C52706f;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2639f.p2641b.p2642a.C52698d;
import p2628d.p2648k.C52761d;
import p2628d.p2648k.C52767h;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.sticker.types.a.a */
public final class C46421a extends C46306b implements C46256q {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f117105a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C46421a.class), "effectSdkVersion", "getEffectSdkVersion()Ljava/lang/String;"))};

    /* renamed from: b */
    public final List<ComposerNode> f117106b = new ArrayList();

    /* renamed from: c */
    public final List<ComposerNode> f117107c = new C46426d(this);

    /* renamed from: d */
    public final C0198r<List<ComposerNode>> f117108d;

    /* renamed from: e */
    public C52668f<? extends C46428b> f117109e;

    /* renamed from: f */
    public final AppCompatActivity f117110f;

    /* renamed from: g */
    public final C46354l f117111g;

    /* renamed from: h */
    public final C20489b f117112h;

    /* renamed from: i */
    private Effect f117113i;

    /* renamed from: j */
    private final C52668f f117114j;

    /* renamed from: com.ss.android.ugc.aweme.sticker.types.a.a$a */
    public static final class C46422a implements C48705j {

        /* renamed from: a */
        final /* synthetic */ C46421a f117115a;

        /* renamed from: b */
        final /* synthetic */ ComposerNode f117116b;

        /* renamed from: a */
        public final void mo8643a(Effect effect) {
        }

        /* renamed from: a */
        public final void mo8644a(Effect effect, C48649d dVar) {
            C52711k.m112240b(dVar, "e");
        }

        /* renamed from: a */
        public final /* synthetic */ void mo8638a(Object obj) {
            Effect effect = (Effect) obj;
            this.f117115a.f117107c.add(this.f117116b);
            C20489b bVar = this.f117115a.f117112h;
            Iterable<ComposerNode> iterable = this.f117115a.f117107c;
            Collection arrayList = new ArrayList(C52575l.m112104a(iterable, 10));
            for (ComposerNode composerNode : iterable) {
                Effect effect2 = composerNode.effect;
                C52711k.m112236a((Object) effect2, "it.effect");
                String unzipPath = effect2.getUnzipPath();
                if (unzipPath == null) {
                    C52711k.m112234a();
                }
                Effect effect3 = composerNode.effect;
                C52711k.m112236a((Object) effect3, "it.effect");
                String extra = effect3.getExtra();
                if (extra == null) {
                    extra = "";
                }
                ComposerInfo composerInfo = new ComposerInfo(unzipPath, extra, null, 4, null);
                arrayList.add(composerInfo);
            }
            bVar.mo43514d((List) arrayList, 20000);
            C20501c e = this.f117115a.f117112h.mo43518e();
            if (effect == null) {
                C52711k.m112234a();
            }
            String unzipPath2 = effect.getUnzipPath();
            if (unzipPath2 == null) {
                C52711k.m112234a();
            }
            String str = this.f117116b.tag_name;
            C52711k.m112236a((Object) str, "node.tag_name");
            e.mo43553a(unzipPath2, str, this.f117116b.default_value / 100.0f).mo43557a();
            C52668f<? extends C46428b> fVar = this.f117115a.f117109e;
            if (fVar != null) {
                C46428b bVar2 = (C46428b) fVar.getValue();
                if (bVar2 != null) {
                    bVar2.mo93165a(this.f117116b, new C46427e(this.f117115a, this.f117116b));
                }
            }
        }

        C46422a(C46421a aVar, ComposerNode composerNode) {
            this.f117115a = aVar;
            this.f117116b = composerNode;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.types.a.a$b */
    static final class C46423b extends C52712l implements C52670a<String> {

        /* renamed from: a */
        public static final C46423b f117117a = new C46423b();

        C46423b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return C50630ak.m109168b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.types.a.a$c */
    static final class C46424c extends C52712l implements C52670a<C46429c> {

        /* renamed from: a */
        final /* synthetic */ C46421a f117118a;

        /* renamed from: b */
        final /* synthetic */ View f117119b;

        C46424c(C46421a aVar, View view) {
            this.f117118a = aVar;
            this.f117119b = view;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            AppCompatActivity appCompatActivity = this.f117118a.f117110f;
            C46354l lVar = this.f117118a.f117111g;
            View view = this.f117119b;
            if (view != null) {
                C46429c cVar = new C46429c(appCompatActivity, lVar, (ViewGroup) view, this.f117118a.f117108d, new C52682m<AVDmtImageTextView, ComposerNode, C52860x>(this.f117118a) {
                    public final String getName() {
                        return "doOnClick";
                    }

                    public final C52761d getOwner() {
                        return C52728w.m112245a(C46421a.class);
                    }

                    public final String getSignature() {
                        return "doOnClick(Lcom/ss/android/ugc/aweme/themechange/base/AVDmtImageTextView;Lcom/ss/android/ugc/effectmanager/effect/model/ComposerNode;)V";
                    }

                    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
                        ComposerNode composerNode = (ComposerNode) obj2;
                        C52711k.m112240b((AVDmtImageTextView) obj, "p1");
                        C52711k.m112240b(composerNode, "p2");
                        C46421a aVar = (C46421a) this.receiver;
                        if (aVar.f117107c.contains(composerNode)) {
                            aVar.f117107c.remove(composerNode);
                            C20489b bVar = aVar.f117112h;
                            Iterable<ComposerNode> iterable = aVar.f117107c;
                            Collection arrayList = new ArrayList(C52575l.m112104a(iterable, 10));
                            for (ComposerNode composerNode2 : iterable) {
                                Effect effect = composerNode2.effect;
                                C52711k.m112236a((Object) effect, "it.effect");
                                String unzipPath = effect.getUnzipPath();
                                if (unzipPath == null) {
                                    C52711k.m112234a();
                                }
                                Effect effect2 = composerNode2.effect;
                                C52711k.m112236a((Object) effect2, "it.effect");
                                String extra = effect2.getExtra();
                                if (extra == null) {
                                    extra = "";
                                }
                                ComposerInfo composerInfo = new ComposerInfo(unzipPath, extra, null, 4, null);
                                arrayList.add(composerInfo);
                            }
                            bVar.mo43514d((List) arrayList, 20000);
                        } else if (C52830p.m112406a(composerNode.UI_name, "clear", true)) {
                            aVar.mo93140b();
                            aVar.f117112h.mo43487b();
                        } else {
                            aVar.f117111g.mo92978a(composerNode.effect, (C48705j) new C46422a(aVar, composerNode));
                        }
                        return C52860x.f131107a;
                    }
                });
                return cVar;
            }
            throw new C52857u("null cannot be cast to non-null type android.view.ViewGroup");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.types.a.a$d */
    public static final class C46426d implements C52698d, List<ComposerNode> {

        /* renamed from: a */
        final /* synthetic */ C46421a f117120a;

        /* renamed from: b */
        private final /* synthetic */ List f117121b;

        public final boolean addAll(int i, Collection<? extends ComposerNode> collection) {
            C52711k.m112240b(collection, "elements");
            return this.f117121b.addAll(i, collection);
        }

        public final boolean addAll(Collection<? extends ComposerNode> collection) {
            C52711k.m112240b(collection, "elements");
            return this.f117121b.addAll(collection);
        }

        public final boolean containsAll(Collection<? extends Object> collection) {
            C52711k.m112240b(collection, "elements");
            return this.f117121b.containsAll(collection);
        }

        public final boolean isEmpty() {
            return this.f117121b.isEmpty();
        }

        public final Iterator<ComposerNode> iterator() {
            return this.f117121b.iterator();
        }

        public final ListIterator<ComposerNode> listIterator() {
            return this.f117121b.listIterator();
        }

        public final ListIterator<ComposerNode> listIterator(int i) {
            return this.f117121b.listIterator(i);
        }

        public final boolean removeAll(Collection<? extends Object> collection) {
            C52711k.m112240b(collection, "elements");
            return this.f117121b.removeAll(collection);
        }

        public final boolean retainAll(Collection<? extends Object> collection) {
            C52711k.m112240b(collection, "elements");
            return this.f117121b.retainAll(collection);
        }

        public final List<ComposerNode> subList(int i, int i2) {
            return this.f117121b.subList(i, i2);
        }

        public final Object[] toArray() {
            return C52706f.m112226a(this);
        }

        public final <T> T[] toArray(T[] tArr) {
            return C52706f.m112227a(this, tArr);
        }

        public final /* bridge */ int size() {
            return this.f117121b.size();
        }

        public final void clear() {
            this.f117120a.f117106b.clear();
            this.f117120a.f117108d.setValue(this);
        }

        C46426d(C46421a aVar) {
            this.f117120a = aVar;
            this.f117121b = aVar.f117106b;
        }

        public final /* synthetic */ Object get(int i) {
            Object obj = this.f117121b.get(i);
            C52711k.m112236a(obj, "get(...)");
            return (ComposerNode) obj;
        }

        public final /* synthetic */ Object remove(int i) {
            Object remove = this.f117121b.remove(i);
            C52711k.m112236a(remove, "removeAt(...)");
            return (ComposerNode) remove;
        }

        public final /* synthetic */ boolean add(Object obj) {
            ComposerNode composerNode = (ComposerNode) obj;
            C52711k.m112240b(composerNode, "element");
            boolean add = this.f117120a.f117106b.add(composerNode);
            this.f117120a.f117108d.setValue(this);
            return add;
        }

        public final boolean contains(Object obj) {
            if (!(obj instanceof ComposerNode)) {
                return false;
            }
            ComposerNode composerNode = (ComposerNode) obj;
            C52711k.m112240b(composerNode, "element");
            return this.f117121b.contains(composerNode);
        }

        public final int indexOf(Object obj) {
            if (!(obj instanceof ComposerNode)) {
                return -1;
            }
            ComposerNode composerNode = (ComposerNode) obj;
            C52711k.m112240b(composerNode, "element");
            return this.f117121b.indexOf(composerNode);
        }

        public final int lastIndexOf(Object obj) {
            if (!(obj instanceof ComposerNode)) {
                return -1;
            }
            ComposerNode composerNode = (ComposerNode) obj;
            C52711k.m112240b(composerNode, "element");
            return this.f117121b.lastIndexOf(composerNode);
        }

        public final boolean remove(Object obj) {
            if (!(obj instanceof ComposerNode)) {
                return false;
            }
            ComposerNode composerNode = (ComposerNode) obj;
            C52711k.m112240b(composerNode, "element");
            boolean remove = this.f117120a.f117106b.remove(composerNode);
            this.f117120a.f117108d.setValue(this);
            return remove;
        }

        public final /* synthetic */ void add(int i, Object obj) {
            ComposerNode composerNode = (ComposerNode) obj;
            C52711k.m112240b(composerNode, "element");
            this.f117121b.add(i, composerNode);
        }

        public final /* synthetic */ Object set(int i, Object obj) {
            ComposerNode composerNode = (ComposerNode) obj;
            C52711k.m112240b(composerNode, "element");
            Object obj2 = this.f117121b.set(i, composerNode);
            C52711k.m112236a(obj2, "set(...)");
            return (ComposerNode) obj2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.types.a.a$e */
    static final class C46427e extends C52712l implements C52671b<Integer, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C46421a f117122a;

        /* renamed from: b */
        final /* synthetic */ ComposerNode f117123b;

        C46427e(C46421a aVar, ComposerNode composerNode) {
            this.f117122a = aVar;
            this.f117123b = composerNode;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            int intValue = ((Number) obj).intValue();
            C20501c e = this.f117122a.f117112h.mo43518e();
            Effect effect = this.f117123b.effect;
            C52711k.m112236a((Object) effect, "composerNode.effect");
            String unzipPath = effect.getUnzipPath();
            C52711k.m112236a((Object) unzipPath, "composerNode.effect.unzipPath");
            String str = this.f117123b.tag_name;
            C52711k.m112236a((Object) str, "composerNode.tag_name");
            e.mo43553a(unzipPath, str, ((float) intValue) / 100.0f).mo43557a();
            return C52860x.f131107a;
        }
    }

    /* renamed from: a */
    public final void mo92780a(C46257a aVar) {
        C52711k.m112240b(aVar, "state");
    }

    /* renamed from: b */
    public final void mo92781b(C46257a aVar) {
        C52711k.m112240b(aVar, "state");
    }

    public final void cl_() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo93140b() {
        C52668f<? extends C46428b> fVar = this.f117109e;
        if (fVar != null && fVar.isInitialized()) {
            C52668f<? extends C46428b> fVar2 = this.f117109e;
            if (fVar2 != null) {
                C46428b bVar = (C46428b) fVar2.getValue();
                if (bVar != null) {
                    bVar.mo93168c();
                }
            }
        }
        this.f117107c.clear();
    }

    /* renamed from: a */
    public final void mo93028a() {
        C52668f<? extends C46428b> fVar = this.f117109e;
        if (fVar != null && fVar.isInitialized()) {
            C52668f<? extends C46428b> fVar2 = this.f117109e;
            if (fVar2 != null) {
                C46428b bVar = (C46428b) fVar2.getValue();
                if (bVar != null) {
                    bVar.mo93167b();
                }
            }
        }
        mo93140b();
        this.f117113i = null;
    }

    /* renamed from: a */
    public final boolean mo93030a(C46315a aVar) {
        C52711k.m112240b(aVar, "session");
        return C46059g.m100101y(aVar.f116852a);
    }

    /* renamed from: a */
    public final void mo92779a(View view) {
        C52711k.m112240b(view, "stickerView");
        if (this.f117109e == null) {
            this.f117109e = C52732g.m112286a(C52757k.NONE, new C46424c(this, view));
        }
    }

    /* renamed from: a */
    public final void mo93029a(C46316b bVar, C46315a aVar) {
        C52711k.m112240b(bVar, "result");
        C52711k.m112240b(aVar, "session");
        C52668f<? extends C46428b> fVar = this.f117109e;
        if (fVar != null) {
            C46428b bVar2 = (C46428b) fVar.getValue();
            if (bVar2 != null) {
                bVar2.mo93166a();
            }
        }
        Effect effect = aVar.f116852a;
        ComposerNode parseComposerMaterial = ComposerHelper.parseComposerMaterial(effect.getUnzipPath(), (String) this.f117114j.getValue(), new File(effect.getUnzipPath()).getParent());
        C52668f<? extends C46428b> fVar2 = this.f117109e;
        if (fVar2 != null) {
            C46428b bVar3 = (C46428b) fVar2.getValue();
            if (bVar3 != null) {
                bVar3.mo93164a(parseComposerMaterial);
            }
        }
        this.f117113i = effect;
    }

    public C46421a(AppCompatActivity appCompatActivity, C46354l lVar, C20489b bVar) {
        C52711k.m112240b(appCompatActivity, "activity");
        C52711k.m112240b(lVar, "stickerDataManager");
        C52711k.m112240b(bVar, "effectController");
        this.f117110f = appCompatActivity;
        this.f117111g = lVar;
        this.f117112h = bVar;
        C0198r<List<ComposerNode>> rVar = new C0198r<>();
        rVar.setValue(this.f117107c);
        this.f117108d = rVar;
        this.f117114j = C52732g.m112285a(C46423b.f117117a);
    }
}
