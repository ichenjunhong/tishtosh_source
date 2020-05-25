package com.p683ss.android.ugc.gamora.recorder.p2467d;

import android.arch.lifecycle.C0184k;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.als.C2763g;
import com.bytedance.als.C2767k;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.jedi.arch.C11787a;
import com.bytedance.jedi.arch.C11788aa;
import com.bytedance.jedi.arch.C11796d;
import com.bytedance.jedi.arch.C11866f;
import com.bytedance.jedi.arch.C11910j;
import com.bytedance.jedi.arch.C11931r;
import com.bytedance.jedi.arch.C11932s;
import com.bytedance.jedi.arch.C11934u;
import com.bytedance.jedi.arch.C11937x;
import com.bytedance.jedi.arch.C11938y;
import com.bytedance.jedi.arch.C11939z;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.scene.C12924i;
import com.bytedance.scene.group.C12896b;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.p2345t.C46776g;
import com.p683ss.android.ugc.aweme.port.p2082in.C39548ah;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.shortvideo.C43225dr;
import com.p683ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.p683ss.android.ugc.aweme.sticker.model.FaceStickerCommerceBean;
import com.p683ss.android.ugc.aweme.tools.C47065j;
import com.p683ss.android.ugc.aweme.utils.C47702b;
import com.p683ss.android.ugc.gamora.jedi.C49548a;
import com.p683ss.android.ugc.gamora.jedi.C49548a.C49549a;
import com.p683ss.android.ugc.gamora.jedi.C49555b;
import com.p683ss.android.ugc.gamora.jedi.C49562i;
import com.ss.android.ugc.trill.R;
import p064c.p065a.p069b.C1690c;
import p2628d.C52857u;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2640a.C52686q;
import p2628d.p2639f.p2640a.C52687r;
import p2628d.p2639f.p2640a.C52688s;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2648k.C52771j;

/* renamed from: com.ss.android.ugc.gamora.recorder.d.c */
public final class C49655c extends C12924i implements C49548a {

    /* renamed from: k */
    public static final C49656a f124541k = new C49656a(null);

    /* renamed from: i */
    public C43225dr f124542i;

    /* renamed from: j */
    public LinearLayout f124543j;

    /* renamed from: l */
    private long f124544l;

    /* renamed from: m */
    private DmtTextView f124545m;

    /* renamed from: n */
    private final C2763g<Boolean> f124546n;

    /* renamed from: com.ss.android.ugc.gamora.recorder.d.c$a */
    public static final class C49656a {
        private C49656a() {
        }

        public /* synthetic */ C49656a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.d.c$b */
    static final class C49657b<T> implements C2767k<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C49655c f124547a;

        C49657b(C49655c cVar) {
            this.f124547a = cVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            int i;
            Boolean bool = (Boolean) obj;
            int b = (int) C9432q.m18687b((Context) this.f124547a.f33840g_, 33.0f);
            LayoutParams layoutParams = C49655c.m107153a(this.f124547a).getLayoutParams();
            if (layoutParams != null) {
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                C52711k.m112236a((Object) bool, "it");
                if (bool.booleanValue()) {
                    i = b + ((int) C9432q.m18687b((Context) this.f124547a.f33840g_, 150.0f));
                } else {
                    i = (int) C9432q.m18687b((Context) this.f124547a.f33840g_, 150.0f);
                }
                layoutParams2.bottomMargin = i;
                C49655c.m107153a(this.f124547a).setLayoutParams(layoutParams2);
                return;
            }
            throw new C52857u("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.d.c$c */
    static final class C49658c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C49655c f124548a;

        /* renamed from: b */
        final /* synthetic */ FaceStickerBean f124549b;

        /* renamed from: c */
        final /* synthetic */ C47065j f124550c;

        /* renamed from: d */
        final /* synthetic */ FaceStickerCommerceBean f124551d;

        C49658c(C49655c cVar, FaceStickerBean faceStickerBean, C47065j jVar, FaceStickerCommerceBean faceStickerCommerceBean) {
            this.f124548a = cVar;
            this.f124549b = faceStickerBean;
            this.f124550c = jVar;
            this.f124551d = faceStickerCommerceBean;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C47702b.f120193a.mo94984a("click_transform_link", C23089d.m56640a().mo47827a("prop_id", this.f124549b.getStickerId()).mo47829a("shoot_way", this.f124550c.f118847b).mo47829a("carrier_type", "video_shoot_page").f61491a);
            if (!C39618d.f101173n.mo74194a((Context) C49655c.m107154b(this.f124548a).f33840g_, this.f124551d.f116236b, false)) {
                C39548ah ahVar = C39618d.f101173n;
                Context context = C49655c.m107154b(this.f124548a).f33840g_;
                String str = this.f124551d.f116235a;
                C52711k.m112236a((Object) str, "commerceBean.commerceStickerWebUrl");
                String str2 = "commerce_sticker_tag";
                if (!TextUtils.isEmpty(str)) {
                    str = Uri.parse(str).buildUpon().appendQueryParameter("commerce_enter_from", str2).build().toString();
                }
                C52711k.m112236a((Object) str, "if (!TextUtils.isEmpty(u… else {\n        url\n    }");
                ahVar.mo74193a(context, str, (String) null);
            }
        }
    }

    /* renamed from: a */
    public final void mo97555a(C47065j jVar) {
        C52711k.m112240b(jVar, "commerceGoodsTagEvent");
        FaceStickerBean faceStickerBean = jVar.f118848c;
        if (faceStickerBean == null || !faceStickerBean.shouldShowCommerceStickerTag()) {
            C12924i iVar = this.f33835c;
            if (iVar != null) {
                ((C12896b) iVar).mo24404c((C12924i) this);
                return;
            }
            throw new C52857u("null cannot be cast to non-null type com.bytedance.scene.group.GroupScene");
        }
        C12924i iVar2 = this.f33835c;
        if (iVar2 != null) {
            ((C12896b) iVar2).mo24409d((C12924i) this);
            FaceStickerCommerceBean faceStickerCommerceBean = faceStickerBean.getFaceStickerCommerceBean();
            if (faceStickerCommerceBean == null) {
                C52711k.m112234a();
            }
            C52711k.m112236a((Object) faceStickerCommerceBean, "faceStickerBean.faceStickerCommerceBean!!");
            if (this.f124544l != faceStickerBean.getStickerId()) {
                C47702b.f120193a.mo94984a("show_transform_link", C23089d.m56640a().mo47827a("prop_id", faceStickerBean.getStickerId()).mo47829a("shoot_way", jVar.f118847b).mo47829a("carrier_type", "video_shoot_page").f61491a);
            }
            this.f124544l = faceStickerBean.getStickerId();
            DmtTextView dmtTextView = this.f124545m;
            if (dmtTextView == null) {
                C52711k.m112237a("commerceStickerText");
            }
            dmtTextView.setText(faceStickerCommerceBean.f116237c);
            LinearLayout linearLayout = this.f124543j;
            if (linearLayout == null) {
                C52711k.m112237a("commerceStickerGoods");
            }
            linearLayout.setOnClickListener(new C49658c(this, faceStickerBean, jVar, faceStickerCommerceBean));
            return;
        }
        throw new C52857u("null cannot be cast to non-null type com.bytedance.scene.group.GroupScene");
    }

    /* renamed from: c */
    public final C11910j mo22553c() {
        return C49549a.m106927b(this);
    }

    /* renamed from: d */
    public final C11931r<C11866f> mo22554d() {
        return C49549a.m106934d(this);
    }

    /* renamed from: f */
    public final boolean mo22555f() {
        return C49549a.m106935e(this);
    }

    /* renamed from: h */
    public final C0184k mo22626h() {
        return C49549a.m106918a(this);
    }

    /* renamed from: i */
    public final /* synthetic */ C11796d mo22645i() {
        return C49549a.m106930c(this);
    }

    /* renamed from: a */
    public static final /* synthetic */ LinearLayout m107153a(C49655c cVar) {
        LinearLayout linearLayout = cVar.f124543j;
        if (linearLayout == null) {
            C52711k.m112237a("commerceStickerGoods");
        }
        return linearLayout;
    }

    /* renamed from: b */
    public static final /* synthetic */ C43225dr m107154b(C49655c cVar) {
        C43225dr drVar = cVar.f124542i;
        if (drVar == null) {
            C52711k.m112237a("ownerHost");
        }
        return drVar;
    }

    public C49655c(C2763g<Boolean> gVar) {
        C52711k.m112240b(gVar, "relayoutEvent");
        this.f124546n = gVar;
        FaceStickerBean faceStickerBean = FaceStickerBean.NONE;
        C52711k.m112236a((Object) faceStickerBean, "FaceStickerBean.NONE");
        this.f124544l = faceStickerBean.getStickerId();
    }

    /* renamed from: e */
    public final void mo24448e(Bundle bundle) {
        super.mo24448e(bundle);
        Object a = mo24460E().mo24560a("owner");
        if (a == null) {
            C52711k.m112234a();
        }
        this.f124542i = (C43225dr) a;
        View j_ = mo24467j_(R.id.yb);
        C52711k.m112236a((Object) j_, "requireViewById(R.id.com…rce_sticker_goods_record)");
        this.f124543j = (LinearLayout) j_;
        View j_2 = mo24467j_(R.id.yc);
        C52711k.m112236a((Object) j_2, "requireViewById(R.id.commerce_sticker_goods_text)");
        this.f124545m = (DmtTextView) j_2;
        DmtTextView dmtTextView = this.f124545m;
        if (dmtTextView == null) {
            C52711k.m112237a("commerceStickerText");
        }
        dmtTextView.setFontType(C46776g.f118133a);
        this.f124546n.mo7352a(this, new C49657b(this));
    }

    /* renamed from: a */
    public final <VM1 extends JediViewModel<S1>, S1 extends C11932s, R> R mo22552a(VM1 vm1, C52671b<? super S1, ? extends R> bVar) {
        C52711k.m112240b(vm1, "viewModel1");
        C52711k.m112240b(bVar, "block");
        return C49549a.m106924a(this, vm1, bVar);
    }

    /* renamed from: a */
    public final View mo24387a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C52711k.m112240b(layoutInflater, "inflater");
        C52711k.m112240b(viewGroup, "container");
        View inflate = layoutInflater.inflate(R.layout.atr, viewGroup, false);
        C52711k.m112236a((Object) inflate, "inflater.inflate(R.layou…_scene, container, false)");
        return inflate;
    }

    /* renamed from: a */
    public final <S extends C11932s> C1690c mo22546a(JediViewModel<S> jediViewModel, C11934u<S> uVar, C52682m<? super C11866f, ? super S, C52860x> mVar) {
        C52711k.m112240b(jediViewModel, "$this$subscribe");
        C52711k.m112240b(uVar, "config");
        C52711k.m112240b(mVar, "subscriber");
        return C49549a.m106919a(this, jediViewModel, uVar, mVar);
    }

    /* renamed from: b */
    public final <S extends C11932s, A> void mo49443b(JediViewModel<S> jediViewModel, C52771j<S, ? extends A> jVar, C11934u<C11937x<A>> uVar, C52682m<? super C49548a, ? super A, C52860x> mVar) {
        C52711k.m112240b(jediViewModel, "$this$selectNonNullSubscribe");
        C52711k.m112240b(jVar, "prop1");
        C52711k.m112240b(uVar, "config");
        C52711k.m112240b(mVar, "subscriber");
        C49549a.m106925a(this, jediViewModel, jVar, uVar, mVar);
    }

    /* renamed from: c */
    public final <S extends C11932s, A> void mo49444c(JediViewModel<S> jediViewModel, C52771j<S, ? extends C49555b<? extends A>> jVar, C11934u<C11937x<C49555b<A>>> uVar, C52682m<? super C49548a, ? super A, C52860x> mVar) {
        C52711k.m112240b(jediViewModel, "$this$subscribeEvent");
        C52711k.m112240b(jVar, "prop1");
        C52711k.m112240b(uVar, "config");
        C52711k.m112240b(mVar, "subscriber");
        C49549a.m106928b(this, jediViewModel, jVar, uVar, mVar);
    }

    /* renamed from: d */
    public final <S extends C11932s, A> void mo49445d(JediViewModel<S> jediViewModel, C52771j<S, ? extends C49562i<? extends A>> jVar, C11934u<C11937x<C49562i<A>>> uVar, C52682m<? super C49548a, ? super A, C52860x> mVar) {
        C52711k.m112240b(jediViewModel, "$this$subscribeMultiEvent");
        C52711k.m112240b(jVar, "prop1");
        C52711k.m112240b(uVar, "config");
        C52711k.m112240b(mVar, "subscriber");
        C49549a.m106931c(this, jediViewModel, jVar, uVar, mVar);
    }

    /* renamed from: a */
    public final <S extends C11932s, A> C1690c mo22547a(JediViewModel<S> jediViewModel, C52771j<S, ? extends A> jVar, C11934u<C11937x<A>> uVar, C52682m<? super C11866f, ? super A, C52860x> mVar) {
        C52711k.m112240b(jediViewModel, "$this$selectSubscribe");
        C52711k.m112240b(jVar, "prop1");
        C52711k.m112240b(uVar, "config");
        C52711k.m112240b(mVar, "subscriber");
        return C49549a.m106933d(this, jediViewModel, jVar, uVar, mVar);
    }

    /* renamed from: a */
    public final <S extends C11932s, A, B> C1690c mo22549a(JediViewModel<S> jediViewModel, C52771j<S, ? extends A> jVar, C52771j<S, ? extends B> jVar2, C11934u<C11938y<A, B>> uVar, C52686q<? super C11866f, ? super A, ? super B, C52860x> qVar) {
        C52711k.m112240b(jediViewModel, "$this$selectSubscribe");
        C52711k.m112240b(jVar, "prop1");
        C52711k.m112240b(jVar2, "prop2");
        C52711k.m112240b(uVar, "config");
        C52711k.m112240b(qVar, "subscriber");
        return C49549a.m106921a(this, jediViewModel, jVar, jVar2, uVar, qVar);
    }

    /* renamed from: a */
    public final <S extends C11932s, T> C1690c mo22548a(JediViewModel<S> jediViewModel, C52771j<S, ? extends C11787a<? extends T>> jVar, C11934u<C11937x<C11787a<T>>> uVar, C52682m<? super C11866f, ? super Throwable, C52860x> mVar, C52671b<? super C11866f, C52860x> bVar, C52682m<? super C11866f, ? super T, C52860x> mVar2) {
        C52711k.m112240b(jediViewModel, "$this$asyncSubscribe");
        C52711k.m112240b(jVar, "prop");
        C52711k.m112240b(uVar, "config");
        return C49549a.m106920a((C49548a) this, jediViewModel, jVar, uVar, mVar, bVar, mVar2);
    }

    /* renamed from: a */
    public final <S extends C11932s, A, B, C> C1690c mo22550a(JediViewModel<S> jediViewModel, C52771j<S, ? extends A> jVar, C52771j<S, ? extends B> jVar2, C52771j<S, ? extends C> jVar3, C11934u<C11939z<A, B, C>> uVar, C52687r<? super C11866f, ? super A, ? super B, ? super C, C52860x> rVar) {
        C52711k.m112240b(jediViewModel, "$this$selectSubscribe");
        C52711k.m112240b(jVar, "prop1");
        C52711k.m112240b(jVar2, "prop2");
        C52711k.m112240b(jVar3, "prop3");
        C52711k.m112240b(uVar, "config");
        C52711k.m112240b(rVar, "subscriber");
        return C49549a.m106922a((C49548a) this, jediViewModel, jVar, jVar2, jVar3, uVar, rVar);
    }

    /* renamed from: a */
    public final <S extends C11932s, A, B, C, D> C1690c mo22551a(JediViewModel<S> jediViewModel, C52771j<S, ? extends A> jVar, C52771j<S, ? extends B> jVar2, C52771j<S, ? extends C> jVar3, C52771j<S, ? extends D> jVar4, C11934u<C11788aa<A, B, C, D>> uVar, C52688s<? super C11866f, ? super A, ? super B, ? super C, ? super D, C52860x> sVar) {
        C52711k.m112240b(jediViewModel, "$this$selectSubscribe");
        C52711k.m112240b(jVar, "prop1");
        C52711k.m112240b(jVar2, "prop2");
        C52711k.m112240b(jVar3, "prop3");
        C52711k.m112240b(jVar4, "prop4");
        C52711k.m112240b(uVar, "config");
        C52711k.m112240b(sVar, "subscriber");
        return C49549a.m106923a(this, jediViewModel, jVar, jVar2, jVar3, jVar4, uVar, sVar);
    }
}
