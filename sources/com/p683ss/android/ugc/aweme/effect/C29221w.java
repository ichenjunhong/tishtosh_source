package com.p683ss.android.ugc.aweme.effect;

import android.arch.lifecycle.C0199s;
import android.arch.lifecycle.C0209x;
import android.arch.lifecycle.C0214z;
import android.os.Bundle;
import android.support.p030v4.app.FragmentActivity;
import android.support.p043v7.p051e.C1208c.C1211b;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1340m;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.effect.C29089aa.C29090a;
import com.p683ss.android.ugc.aweme.effect.C29089aa.C29091b;
import com.p683ss.android.ugc.aweme.effect.p1671b.C29126a;
import com.p683ss.android.ugc.aweme.effect.p1675d.C29173a;
import com.p683ss.android.ugc.aweme.effectplatform.C29252f;
import com.p683ss.android.ugc.aweme.port.p2082in.C39567as;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.shortvideo.model.VEEffectSelectOp;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45428bk;
import com.p683ss.android.ugc.aweme.themechange.base.AVDmtHorizontalImageTextLayout;
import com.p683ss.android.ugc.aweme.themechange.base.AVDmtPanelRecyleView;
import com.p683ss.android.ugc.aweme.themechange.base.AVDmtTextView;
import com.p683ss.android.ugc.effectmanager.common.p2440g.C48649d;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.trill.R;
import dmt.p2652av.video.C53026u;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.effect.w */
public final class C29221w extends C29174e {

    /* renamed from: h */
    static final /* synthetic */ C52767h[] f76538h = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C29221w.class), "mAutoApplyRecorder", "getMAutoApplyRecorder()Ljava/util/Set;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C29221w.class), "positionList", "getPositionList()Ljava/util/List;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C29221w.class), "effectList", "getEffectList()Ljava/util/List;"))};

    /* renamed from: m */
    public static final C29222a f76539m = new C29222a(null);

    /* renamed from: i */
    public C29089aa f76540i;

    /* renamed from: j */
    public EditEffectVideoModel f76541j;

    /* renamed from: k */
    public boolean f76542k;

    /* renamed from: l */
    public C29173a f76543l;

    /* renamed from: n */
    private boolean f76544n;

    /* renamed from: o */
    private final C52668f f76545o = C52732g.m112306a(new LinkedHashSet());

    /* renamed from: p */
    private final C52668f f76546p = C52732g.m112306a(new ArrayList());

    /* renamed from: q */
    private final C52668f f76547q = C52732g.m112306a(new ArrayList());

    /* renamed from: r */
    private HashMap f76548r;

    /* renamed from: com.ss.android.ugc.aweme.effect.w$a */
    public static final class C29222a {
        private C29222a() {
        }

        public /* synthetic */ C29222a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.effect.w$b */
    static final class C29223b<T> implements C0199s<C53026u> {

        /* renamed from: a */
        final /* synthetic */ C29221w f76549a;

        C29223b(C29221w wVar) {
            this.f76549a = wVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            C53026u uVar = (C53026u) obj;
            if (uVar == null || uVar.f131492f != 3) {
                if (uVar != null && uVar.f131492f == 4) {
                    for (int length = uVar.f131487a.length - 1; length >= 0; length--) {
                        if (this.f76549a.f76451f.isEmpty()) {
                            AVDmtHorizontalImageTextLayout aVDmtHorizontalImageTextLayout = (AVDmtHorizontalImageTextLayout) this.f76549a.mo59056b((int) R.id.d66);
                            C52711k.m112236a((Object) aVDmtHorizontalImageTextLayout, "tvDelete");
                            aVDmtHorizontalImageTextLayout.setVisibility(8);
                            return;
                        }
                        int i = uVar.f131487a[length];
                        int size = this.f76549a.f76451f.size() - 1;
                        while (true) {
                            if (size < 0) {
                                break;
                            }
                            Object obj2 = this.f76549a.f76451f.get(size);
                            C52711k.m112236a(obj2, "mEffectPointModelStack[j]");
                            if (((EffectPointModel) obj2).getIndex() == i) {
                                this.f76549a.f76451f.remove(size);
                                break;
                            }
                            size--;
                        }
                    }
                }
                return;
            }
            this.f76549a.f76451f.clear();
            AVDmtHorizontalImageTextLayout aVDmtHorizontalImageTextLayout2 = (AVDmtHorizontalImageTextLayout) this.f76549a.mo59056b((int) R.id.d66);
            C52711k.m112236a((Object) aVDmtHorizontalImageTextLayout2, "tvDelete");
            aVDmtHorizontalImageTextLayout2.setVisibility(8);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.effect.w$c */
    static final class C29224c implements C29090a {

        /* renamed from: a */
        final /* synthetic */ C29221w f76550a;

        C29224c(C29221w wVar) {
            this.f76550a = wVar;
        }

        /* renamed from: a */
        public final void mo58936a(int i, int i2, EffectModel effectModel) {
            String str;
            EditEffectVideoModel a = C29221w.m68809a(this.f76550a);
            ArrayList h = a.mo58842a().mo59098h();
            Effect effect = (Effect) this.f76550a.mo59051a().get(i2);
            if (5 == i) {
                this.f76550a.mo59052a(i2);
                if (this.f76550a.f76450e != null) {
                    C29252f a2 = C29126a.m68614a();
                    if (a2 != null && a2.mo59142a(effect)) {
                        a.mo58849g().setValue(VEEffectSelectOp.selectTrans(effectModel));
                        AVDmtHorizontalImageTextLayout aVDmtHorizontalImageTextLayout = (AVDmtHorizontalImageTextLayout) this.f76550a.mo59056b((int) R.id.d66);
                        C52711k.m112236a((Object) aVDmtHorizontalImageTextLayout, "tvDelete");
                        aVDmtHorizontalImageTextLayout.setVisibility(0);
                        if (!h.isEmpty()) {
                            this.f76550a.f76451f.add(h.get(h.size() - 1));
                        } else {
                            C39629l.m88232a().mo58567E().mo49425a("add effect fail");
                        }
                        C29221w.m68810b(this.f76550a).mo58934a(i2, 3);
                    }
                }
                C29126a aVar = this.f76550a.f76450e;
                if (aVar != null) {
                    aVar.mo58997a(effect);
                }
            } else if (i == 0) {
                this.f76550a.mo59052a(i2);
                if (this.f76550a.f76450e != null) {
                    C29252f a3 = C29126a.m68614a();
                    if (a3 != null && a3.mo59142a(effect)) {
                        if (TextUtils.isEmpty(effectModel.resDir)) {
                            C39567as E = C39629l.m88232a().mo58567E();
                            StringBuilder sb = new StringBuilder("applyFilter_resdir_null:");
                            if (effectModel.key != null) {
                                str = effectModel.key;
                            } else {
                                str = "";
                            }
                            sb.append(str);
                            E.mo49432b(sb.toString());
                        }
                        this.f76550a.mo59115a(Integer.valueOf(i), effectModel);
                        C29221w.m68810b(this.f76550a).mo58934a(i2, 3);
                    }
                }
                C29126a aVar2 = this.f76550a.f76450e;
                if (aVar2 != null) {
                    aVar2.mo58997a(effect);
                }
            } else if (1 == i && this.f76550a.f76450e != null) {
                C29252f a4 = C29126a.m68614a();
                if (a4 != null && a4.mo59142a(effect)) {
                    a.mo58849g().setValue(VEEffectSelectOp.selectFilter(i, effectModel));
                    AVDmtHorizontalImageTextLayout aVDmtHorizontalImageTextLayout2 = (AVDmtHorizontalImageTextLayout) this.f76550a.mo59056b((int) R.id.d66);
                    C52711k.m112236a((Object) aVDmtHorizontalImageTextLayout2, "tvDelete");
                    aVDmtHorizontalImageTextLayout2.setVisibility(0);
                }
            }
            C29173a aVar3 = this.f76550a.f76543l;
            if (aVar3 == null) {
                C52711k.m112237a("mTouchStateHolder");
            }
            C52711k.m112236a((Object) effectModel, "model");
            C52711k.m112240b(effectModel, "model");
            aVar3.f76442a = i;
            aVar3.f76443b = i2;
            aVar3.f76444c = effectModel;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.effect.w$d */
    public static final class C29225d extends C1340m {

        /* renamed from: a */
        final /* synthetic */ C29221w f76551a;

        C29225d(C29221w wVar) {
            this.f76551a = wVar;
        }

        public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
            boolean z;
            C52711k.m112240b(recyclerView, "recyclerView");
            super.onScrollStateChanged(recyclerView, i);
            C29221w wVar = this.f76551a;
            if (i == 0) {
                z = true;
            } else {
                z = false;
            }
            wVar.f76542k = z;
            this.f76551a.mo59116a(this.f76551a.f76542k);
        }

        public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
            C52711k.m112240b(recyclerView, "recyclerView");
            super.onScrolled(recyclerView, i, i2);
            this.f76551a.mo59116a(this.f76551a.f76542k);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.effect.w$e */
    static final class C29226e implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C29221w f76552a;

        C29226e(C29221w wVar) {
            this.f76552a = wVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            if (!this.f76552a.f76451f.isEmpty()) {
                C29221w.m68809a(this.f76552a).mo58842a().mo59099i().setValue(C53026u.m112768b(((EffectPointModel) C52575l.m112142g((List<? extends T>) this.f76552a.f76451f)).getIndex()));
                this.f76552a.f76451f.remove(this.f76552a.f76451f.size() - 1);
                if (this.f76552a.f76451f.isEmpty()) {
                    AVDmtHorizontalImageTextLayout aVDmtHorizontalImageTextLayout = (AVDmtHorizontalImageTextLayout) this.f76552a.mo59056b((int) R.id.d66);
                    C52711k.m112236a((Object) aVDmtHorizontalImageTextLayout, "tvDelete");
                    aVDmtHorizontalImageTextLayout.setVisibility(8);
                }
            }
        }
    }

    /* renamed from: f */
    private final Set<Effect> m68811f() {
        return (Set) this.f76545o.getValue();
    }

    /* renamed from: b */
    public final View mo59056b(int i) {
        if (this.f76548r == null) {
            this.f76548r = new HashMap();
        }
        View view = (View) this.f76548r.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f76548r.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: e */
    public final void mo59059e() {
        if (this.f76548r != null) {
            this.f76548r.clear();
        }
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo59059e();
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.f76544n = true;
    }

    /* renamed from: a */
    public static final /* synthetic */ EditEffectVideoModel m68809a(C29221w wVar) {
        EditEffectVideoModel editEffectVideoModel = wVar.f76541j;
        if (editEffectVideoModel == null) {
            C52711k.m112237a("mViewModel");
        }
        return editEffectVideoModel;
    }

    /* renamed from: b */
    public static final /* synthetic */ C29089aa m68810b(C29221w wVar) {
        C29089aa aaVar = wVar.f76540i;
        if (aaVar == null) {
            C52711k.m112237a("mEffectAdapter");
        }
        return aaVar;
    }

    /* renamed from: a */
    public final void mo59013a(Effect effect) {
        C52711k.m112240b(effect, "rawEffect");
        int indexOf = mo59051a().indexOf(effect);
        if (indexOf >= 0) {
            C29089aa aaVar = this.f76540i;
            if (aaVar == null) {
                C52711k.m112237a("mEffectAdapter");
            }
            aaVar.mo58934a(indexOf, 2);
        }
    }

    public final void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        if (this.f76544n) {
            if (z) {
                mo59116a(true);
                return;
            }
            mo59116a(false);
        }
    }

    /* renamed from: a */
    public final void mo59116a(boolean z) {
        C1352v vVar;
        int j = mo59055b().mo4749j();
        int l = mo59055b().mo4751l();
        if (j <= l) {
            while (true) {
                AVDmtPanelRecyleView aVDmtPanelRecyleView = (AVDmtPanelRecyleView) mo59056b((int) R.id.cal);
                if (aVDmtPanelRecyleView != null) {
                    vVar = aVDmtPanelRecyleView.mo4847f(j);
                } else {
                    vVar = null;
                }
                if (vVar instanceof C29091b) {
                    ((C29091b) vVar).mo58938a(z);
                }
                if (j != l) {
                    j++;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo59053a(C1211b bVar, List<? extends EffectModel> list) {
        C52711k.m112240b(bVar, "result");
        C52711k.m112240b(list, "newEffectSource");
        C29089aa aaVar = this.f76540i;
        if (aaVar == null) {
            C52711k.m112237a("mEffectAdapter");
        }
        bVar.mo3931a((C1322a) aaVar);
        mo59054a(list);
        C29089aa aaVar2 = this.f76540i;
        if (aaVar2 == null) {
            C52711k.m112237a("mEffectAdapter");
        }
        aaVar2.mo58935a(this.f76449d);
    }

    /* renamed from: a */
    public final void mo59014a(Effect effect, C48649d dVar) {
        if (effect != null) {
            int indexOf = mo59051a().indexOf(effect);
            if (indexOf >= 0) {
                C29089aa aaVar = this.f76540i;
                if (aaVar == null) {
                    C52711k.m112237a("mEffectAdapter");
                }
                aaVar.mo58934a(indexOf, 4);
            }
        }
    }

    /* renamed from: a */
    public final void mo59115a(Integer num, EffectModel effectModel) {
        if (num != null) {
            num.intValue();
            if (effectModel != null) {
                EditEffectVideoModel editEffectVideoModel = this.f76541j;
                if (editEffectVideoModel == null) {
                    C52711k.m112237a("mViewModel");
                }
                editEffectVideoModel.mo58849g().setValue(VEEffectSelectOp.selectFilter(num.intValue(), effectModel));
                EditEffectVideoModel editEffectVideoModel2 = this.f76541j;
                if (editEffectVideoModel2 == null) {
                    C52711k.m112237a("mViewModel");
                }
                ArrayList h = editEffectVideoModel2.mo58842a().mo59098h();
                if (!h.isEmpty()) {
                    this.f76451f.add(h.get(h.size() - 1));
                } else {
                    C39629l.m88232a().mo58567E().mo49425a("add effect failed");
                }
            }
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        int i;
        C52711k.m112240b(view, "view");
        super.onViewCreated(view, bundle);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            C0209x a = C0214z.m440a(activity).mo359a(EditEffectVideoModel.class);
            C52711k.m112236a((Object) a, "ViewModelProviders.of(ac…ctVideoModel::class.java)");
            this.f76541j = (EditEffectVideoModel) a;
            EditEffectVideoModel editEffectVideoModel = this.f76541j;
            if (editEffectVideoModel == null) {
                C52711k.m112237a("mViewModel");
            }
            editEffectVideoModel.mo58842a().mo59099i().observe(this, new C29223b(this));
        }
        this.f76543l = new C29173a();
        this.f76540i = new C29089aa((AVDmtPanelRecyleView) mo59056b((int) R.id.cal), this.f76450e);
        C29089aa aaVar = this.f76540i;
        if (aaVar == null) {
            C52711k.m112237a("mEffectAdapter");
        }
        aaVar.mo58935a(this.f76449d);
        C29089aa aaVar2 = this.f76540i;
        if (aaVar2 == null) {
            C52711k.m112237a("mEffectAdapter");
        }
        aaVar2.f76255a = new C29224c(this);
        AVDmtPanelRecyleView aVDmtPanelRecyleView = (AVDmtPanelRecyleView) mo59056b((int) R.id.cal);
        C52711k.m112236a((Object) aVDmtPanelRecyleView, "recyerview");
        C29089aa aaVar3 = this.f76540i;
        if (aaVar3 == null) {
            C52711k.m112237a("mEffectAdapter");
        }
        aVDmtPanelRecyleView.setAdapter(aaVar3);
        ((AVDmtPanelRecyleView) mo59056b((int) R.id.cal)).mo4801a((C1340m) new C29225d(this));
        String str = this.f76446a;
        if (str == null) {
            C52711k.m112237a("mCategory");
        }
        if (C29207l.m68792a(str)) {
            AVDmtTextView aVDmtTextView = (AVDmtTextView) mo59056b((int) R.id.d6_);
            C52711k.m112236a((Object) aVDmtTextView, "tvHint");
            aVDmtTextView.setText(getString(R.string.awj));
        }
        C45428bk.m99000a((AVDmtHorizontalImageTextLayout) mo59056b((int) R.id.d66), 0.5f);
        AVDmtHorizontalImageTextLayout aVDmtHorizontalImageTextLayout = (AVDmtHorizontalImageTextLayout) mo59056b((int) R.id.d66);
        C52711k.m112236a((Object) aVDmtHorizontalImageTextLayout, "tvDelete");
        if (this.f76451f.isEmpty()) {
            i = 8;
        } else {
            i = 0;
        }
        aVDmtHorizontalImageTextLayout.setVisibility(i);
        ((AVDmtHorizontalImageTextLayout) mo59056b((int) R.id.d66)).setOnClickListener(new C29226e(this));
        mo59058d();
    }

    /* renamed from: a */
    public final void mo59015a(Effect effect, Effect effect2, boolean z) {
        boolean z2;
        C52711k.m112240b(effect, "rawEffect");
        C39629l.m88232a().mo58588s();
        int indexOf = mo59051a().indexOf(effect);
        if (indexOf >= 0) {
            C29089aa aaVar = this.f76540i;
            if (aaVar == null) {
                C52711k.m112237a("mEffectAdapter");
            }
            aaVar.mo58934a(indexOf, 3);
            C29173a aVar = this.f76543l;
            if (aVar == null) {
                C52711k.m112237a("mTouchStateHolder");
            }
            if (indexOf == aVar.f76443b && aVar.f76442a == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2 && !m68811f().contains(effect)) {
                C29173a aVar2 = this.f76543l;
                if (aVar2 == null) {
                    C52711k.m112237a("mTouchStateHolder");
                }
                Integer valueOf = Integer.valueOf(aVar2.f76442a);
                C29173a aVar3 = this.f76543l;
                if (aVar3 == null) {
                    C52711k.m112237a("mTouchStateHolder");
                }
                mo59115a(valueOf, aVar3.f76444c);
                if (this.f76543l == null) {
                    C52711k.m112237a("mTouchStateHolder");
                }
                m68811f().add(effect);
                C39629l.m88232a().mo58588s();
            }
        }
    }
}
