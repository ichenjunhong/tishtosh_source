package com.p683ss.android.ugc.aweme.effect;

import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0198r;
import android.arch.lifecycle.C0199s;
import android.arch.lifecycle.C0209x;
import android.arch.lifecycle.C0214z;
import android.os.Bundle;
import android.support.p030v4.app.FragmentActivity;
import android.support.p043v7.p051e.C1208c.C1211b;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.view.View;
import com.C2240a;
import com.p683ss.android.ugc.aweme.effect.C29154bn.C29155a;
import com.p683ss.android.ugc.aweme.effect.p1671b.C29126a;
import com.p683ss.android.ugc.aweme.effectplatform.C29252f;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.shortvideo.model.VEEffectSelectOp;
import com.p683ss.android.ugc.aweme.themechange.base.AVDmtHorizontalImageTextLayout;
import com.p683ss.android.ugc.aweme.themechange.base.AVDmtPanelRecyleView;
import com.p683ss.android.ugc.aweme.themechange.base.AVDmtTextView;
import com.p683ss.android.ugc.effectmanager.common.p2440g.C48649d;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.trill.R;
import dmt.p2652av.video.C53024t;
import dmt.p2652av.video.C53026u;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.effect.y */
public final class C29228y extends C29174e {

    /* renamed from: j */
    public static final C29229a f76553j = new C29229a(null);

    /* renamed from: h */
    public EditEffectVideoModel f76554h;

    /* renamed from: i */
    public C29154bn f76555i;

    /* renamed from: k */
    private HashMap f76556k;

    /* renamed from: com.ss.android.ugc.aweme.effect.y$a */
    public static final class C29229a {
        private C29229a() {
        }

        public /* synthetic */ C29229a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.effect.y$b */
    static final class C29230b<T> implements C0199s<C53026u> {

        /* renamed from: a */
        final /* synthetic */ C29228y f76557a;

        C29230b(C29228y yVar) {
            this.f76557a = yVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            C53026u uVar = (C53026u) obj;
            if (uVar == null || uVar.f131492f != 3) {
                if (uVar != null && uVar.f131492f == 4) {
                    for (int length = uVar.f131487a.length - 1; length >= 0 && !this.f76557a.f76451f.isEmpty(); length--) {
                        Object obj2 = this.f76557a.f76451f.get(0);
                        C52711k.m112236a(obj2, "mEffectPointModelStack[0]");
                        if (((EffectPointModel) obj2).getIndex() == uVar.f131487a[length]) {
                            C29228y.m68822a(this.f76557a).mo59025a(null);
                            Object remove = this.f76557a.f76451f.remove(0);
                            C52711k.m112236a(remove, "mEffectPointModelStack.removeAt(0)");
                            C29228y.m68823b(this.f76557a).mo58842a().mo59099i().setValue(C53026u.m112764a(((EffectPointModel) remove).getIndex()));
                            return;
                        }
                    }
                } else if (uVar != null && uVar.f131492f == 9) {
                    C29228y.m68822a(this.f76557a).mo59025a(null);
                }
                return;
            }
            this.f76557a.f76451f.clear();
            AVDmtHorizontalImageTextLayout aVDmtHorizontalImageTextLayout = (AVDmtHorizontalImageTextLayout) this.f76557a.mo59056b((int) R.id.d66);
            C52711k.m112236a((Object) aVDmtHorizontalImageTextLayout, "tvDelete");
            aVDmtHorizontalImageTextLayout.setVisibility(8);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.effect.y$c */
    static final class C29231c<T> implements C0199s<Float> {

        /* renamed from: a */
        final /* synthetic */ C29228y f76558a;

        C29231c(C29228y yVar) {
            this.f76558a = yVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Float f = (Float) obj;
            if (f == null || Float.compare(f.floatValue(), 0.0f) <= 0) {
                AVDmtTextView aVDmtTextView = (AVDmtTextView) this.f76558a.mo59056b((int) R.id.d6_);
                C52711k.m112236a((Object) aVDmtTextView, "tvHint");
                aVDmtTextView.setText(this.f76558a.getString(R.string.ns));
                return;
            }
            Locale locale = Locale.getDefault();
            C52711k.m112236a((Object) locale, "Locale.getDefault()");
            String a = C2240a.m6773a(locale, "%.1f", Arrays.copyOf(new Object[]{f}, 1));
            C52711k.m112236a((Object) a, "java.lang.String.format(locale, format, *args)");
            AVDmtTextView aVDmtTextView2 = (AVDmtTextView) this.f76558a.mo59056b((int) R.id.d6_);
            C52711k.m112236a((Object) aVDmtTextView2, "tvHint");
            aVDmtTextView2.setText(this.f76558a.getString(R.string.avx, a));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.effect.y$d */
    static final class C29232d implements C29155a {

        /* renamed from: a */
        final /* synthetic */ C29228y f76559a;

        C29232d(C29228y yVar) {
            this.f76559a = yVar;
        }

        /* renamed from: a */
        public final void mo59026a(EffectModel effectModel, int i, int i2) {
            EffectPointModel effectPointModel;
            EditEffectVideoModel b = C29228y.m68823b(this.f76559a);
            Effect effect = (Effect) this.f76559a.mo59051a().get(i2);
            if (i == 2) {
                if (this.f76559a.f76450e != null) {
                    C29252f a = C29126a.m68614a();
                    if (a != null && a.mo59142a(effect)) {
                        if (!this.f76559a.f76451f.isEmpty()) {
                            Object remove = this.f76559a.f76451f.remove(0);
                            C52711k.m112236a(remove, "mEffectPointModelStack.removeAt(0)");
                            b.mo58842a().mo59099i().setValue(C53026u.m112764a(((EffectPointModel) remove).getIndex()));
                        }
                        AVDmtTextView aVDmtTextView = (AVDmtTextView) this.f76559a.mo59056b((int) R.id.d6_);
                        C52711k.m112236a((Object) aVDmtTextView, "tvHint");
                        aVDmtTextView.setText(this.f76559a.getString(R.string.ns));
                        return;
                    }
                    return;
                }
                return;
            }
            this.f76559a.mo59052a(i2);
            if (this.f76559a.f76450e != null) {
                C29252f a2 = C29126a.m68614a();
                if (a2 != null && a2.mo59142a(effect)) {
                    C0198r g = b.mo58849g();
                    if (this.f76559a.f76451f.isEmpty()) {
                        effectPointModel = null;
                    } else {
                        effectPointModel = (EffectPointModel) this.f76559a.f76451f.remove(0);
                    }
                    g.setValue(VEEffectSelectOp.selectSticker(effectModel, effectPointModel));
                    C0198r h = b.mo58850h();
                    CharSequence charSequence = effectModel.hint;
                    C53024t tVar = new C53024t(0, null);
                    if (charSequence == null) {
                        charSequence = "";
                    }
                    C52711k.m112240b(charSequence, "<set-?>");
                    tVar.f131484a = charSequence;
                    tVar.f131485b = 2000;
                    h.setValue(tVar);
                    AVDmtTextView aVDmtTextView2 = (AVDmtTextView) this.f76559a.mo59056b((int) R.id.d6_);
                    C52711k.m112236a((Object) aVDmtTextView2, "tvHint");
                    aVDmtTextView2.setText(this.f76559a.getString(R.string.ns));
                    ArrayList h2 = b.mo58842a().mo59098h();
                    if (!h2.isEmpty()) {
                        this.f76559a.f76451f.add(h2.get(h2.size() - 1));
                        return;
                    } else {
                        C39629l.m88232a().mo58567E().mo49425a("add effect fail");
                        return;
                    }
                }
            }
            C29126a aVar = this.f76559a.f76450e;
            if (aVar != null) {
                aVar.mo58997a(effect);
            }
        }
    }

    /* renamed from: b */
    public final View mo59056b(int i) {
        if (this.f76556k == null) {
            this.f76556k = new HashMap();
        }
        View view = (View) this.f76556k.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f76556k.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: e */
    public final void mo59059e() {
        if (this.f76556k != null) {
            this.f76556k.clear();
        }
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo59059e();
    }

    /* renamed from: a */
    public static final /* synthetic */ C29154bn m68822a(C29228y yVar) {
        C29154bn bnVar = yVar.f76555i;
        if (bnVar == null) {
            C52711k.m112237a("mEffectAdapter");
        }
        return bnVar;
    }

    /* renamed from: b */
    public static final /* synthetic */ EditEffectVideoModel m68823b(C29228y yVar) {
        EditEffectVideoModel editEffectVideoModel = yVar.f76554h;
        if (editEffectVideoModel == null) {
            C52711k.m112237a("mViewModel");
        }
        return editEffectVideoModel;
    }

    /* renamed from: a */
    public final void mo59013a(Effect effect) {
        C52711k.m112240b(effect, "rawEffect");
        int indexOf = mo59051a().indexOf(effect);
        if (indexOf >= 0) {
            C29154bn bnVar = this.f76555i;
            if (bnVar == null) {
                C52711k.m112237a("mEffectAdapter");
            }
            bnVar.mo58934a(indexOf, 2);
        }
    }

    /* renamed from: a */
    public final void mo59014a(Effect effect, C48649d dVar) {
        if (effect != null) {
            int indexOf = mo59051a().indexOf(effect);
            if (indexOf >= 0) {
                C29154bn bnVar = this.f76555i;
                if (bnVar == null) {
                    C52711k.m112237a("mEffectAdapter");
                }
                bnVar.mo58934a(indexOf, 4);
            }
        }
    }

    /* renamed from: a */
    public final void mo59053a(C1211b bVar, List<? extends EffectModel> list) {
        C52711k.m112240b(bVar, "result");
        C52711k.m112240b(list, "newEffectSource");
        C29154bn bnVar = this.f76555i;
        if (bnVar == null) {
            C52711k.m112237a("mEffectAdapter");
        }
        bVar.mo3931a((C1322a) bnVar);
        mo59054a(list);
        C29154bn bnVar2 = this.f76555i;
        if (bnVar2 == null) {
            C52711k.m112237a("mEffectAdapter");
        }
        bnVar2.mo58935a(this.f76449d);
        C29154bn bnVar3 = this.f76555i;
        if (bnVar3 == null) {
            C52711k.m112237a("mEffectAdapter");
        }
        if ((!bnVar3.f76253c.isEmpty()) && (!this.f76451f.isEmpty())) {
            C29154bn bnVar4 = this.f76555i;
            if (bnVar4 == null) {
                C52711k.m112237a("mEffectAdapter");
            }
            bnVar4.mo59025a((EffectPointModel) this.f76451f.get(0));
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C52711k.m112240b(view, "view");
        super.onViewCreated(view, bundle);
        AVDmtTextView aVDmtTextView = (AVDmtTextView) mo59056b((int) R.id.d6_);
        C52711k.m112236a((Object) aVDmtTextView, "tvHint");
        aVDmtTextView.setText(getString(R.string.ns));
        FragmentActivity activity = getActivity();
        if (activity != null) {
            C0209x a = C0214z.m440a(activity).mo359a(EditEffectVideoModel.class);
            C52711k.m112236a((Object) a, "ViewModelProviders.of(fr…ctVideoModel::class.java)");
            this.f76554h = (EditEffectVideoModel) a;
            EditEffectVideoModel editEffectVideoModel = this.f76554h;
            if (editEffectVideoModel == null) {
                C52711k.m112237a("mViewModel");
            }
            C0184k kVar = this;
            editEffectVideoModel.mo58842a().mo59099i().observe(kVar, new C29230b(this));
            this.f76555i = new C29154bn((AVDmtPanelRecyleView) mo59056b((int) R.id.cal), this.f76450e);
            EditEffectVideoModel editEffectVideoModel2 = this.f76554h;
            if (editEffectVideoModel2 == null) {
                C52711k.m112237a("mViewModel");
            }
            editEffectVideoModel2.mo58847e().observe(kVar, new C29231c(this));
        }
        C29154bn bnVar = this.f76555i;
        if (bnVar == null) {
            C52711k.m112237a("mEffectAdapter");
        }
        bnVar.mo58935a(this.f76449d);
        C29154bn bnVar2 = this.f76555i;
        if (bnVar2 == null) {
            C52711k.m112237a("mEffectAdapter");
        }
        if ((!bnVar2.f76253c.isEmpty()) && (!this.f76451f.isEmpty())) {
            C29154bn bnVar3 = this.f76555i;
            if (bnVar3 == null) {
                C52711k.m112237a("mEffectAdapter");
            }
            bnVar3.mo59025a((EffectPointModel) this.f76451f.get(0));
        }
        C29154bn bnVar4 = this.f76555i;
        if (bnVar4 == null) {
            C52711k.m112237a("mEffectAdapter");
        }
        bnVar4.f76405a = new C29232d(this);
        AVDmtPanelRecyleView aVDmtPanelRecyleView = (AVDmtPanelRecyleView) mo59056b((int) R.id.cal);
        C52711k.m112236a((Object) aVDmtPanelRecyleView, "recyerview");
        C29154bn bnVar5 = this.f76555i;
        if (bnVar5 == null) {
            C52711k.m112237a("mEffectAdapter");
        }
        aVDmtPanelRecyleView.setAdapter(bnVar5);
        AVDmtHorizontalImageTextLayout aVDmtHorizontalImageTextLayout = (AVDmtHorizontalImageTextLayout) mo59056b((int) R.id.d66);
        C52711k.m112236a((Object) aVDmtHorizontalImageTextLayout, "tvDelete");
        aVDmtHorizontalImageTextLayout.setVisibility(8);
        mo59058d();
    }

    /* renamed from: a */
    public final void mo59015a(Effect effect, Effect effect2, boolean z) {
        C52711k.m112240b(effect, "rawEffect");
        int indexOf = mo59051a().indexOf(effect);
        if (indexOf >= 0) {
            C29154bn bnVar = this.f76555i;
            if (bnVar == null) {
                C52711k.m112237a("mEffectAdapter");
            }
            bnVar.mo58934a(indexOf, 3);
        }
    }
}
