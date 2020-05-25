package com.p683ss.android.ugc.gamora.recorder.p2477k;

import android.app.Activity;
import android.arch.lifecycle.C0184k;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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
import com.p683ss.android.ugc.aweme.base.AmeActivity;
import com.p683ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p683ss.android.ugc.aweme.shortvideo.cutmusic.C43188c;
import com.p683ss.android.ugc.aweme.shortvideo.cutmusic.C43188c.C43189a;
import com.p683ss.android.ugc.aweme.shortvideo.cutmusic.RepeatMusicPlayer;
import com.p683ss.android.ugc.aweme.shortvideo.cutmusic.RepeatMusicPlayer.C43185a;
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

/* renamed from: com.ss.android.ugc.gamora.recorder.k.c */
public final class C49858c extends C12924i implements C43185a, C43189a, C49548a {

    /* renamed from: i */
    public static final C49859a f124939i = new C49859a(null);

    /* renamed from: j */
    private ShortVideoContext f124940j;

    /* renamed from: k */
    private C43188c f124941k;

    /* renamed from: l */
    private RepeatMusicPlayer f124942l;

    /* renamed from: m */
    private String f124943m;

    /* renamed from: n */
    private int f124944n;

    /* renamed from: o */
    private int f124945o;

    /* renamed from: p */
    private final C52671b<Integer, C52860x> f124946p;

    /* renamed from: com.ss.android.ugc.gamora.recorder.k.c$a */
    public static final class C49859a {
        private C49859a() {
        }

        public /* synthetic */ C49859a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: B */
    public final void mo24458B() {
        super.mo24458B();
        m107566F();
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

    /* renamed from: F */
    private final void m107566F() {
        RepeatMusicPlayer repeatMusicPlayer = this.f124942l;
        if (repeatMusicPlayer != null) {
            repeatMusicPlayer.mo87777a();
        }
        this.f124942l = null;
    }

    /* renamed from: p */
    public final void mo24469p() {
        super.mo24469p();
        C43188c cVar = this.f124941k;
        if (cVar != null) {
            cVar.mo87788a();
        }
    }

    public C49858c(C52671b<? super Integer, C52860x> bVar) {
        C52711k.m112240b(bVar, "onCutMusic");
        this.f124946p = bVar;
    }

    /* renamed from: c */
    public final void mo87784c(int i) {
        C43188c cVar = this.f124941k;
        if (cVar != null) {
            cVar.mo87785a(i);
        }
    }

    /* renamed from: i_ */
    public final void mo87795i_(int i) {
        this.f124945o = i;
        this.f124946p.invoke(Integer.valueOf(i));
        m107566F();
    }

    /* renamed from: h_ */
    public final void mo87794h_(int i) {
        String str = this.f124943m;
        if (str == null) {
            C52711k.m112237a("mMusicPath");
        }
        if (!TextUtils.isEmpty(str)) {
            this.f124945o = i;
            m107567a(i, this.f124944n);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00e2  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo24448e(android.os.Bundle r4) {
        /*
            r3 = this;
            super.mo24448e(r4)
            android.app.Activity r4 = r3.f33840g_
            if (r4 == 0) goto L_0x00ea
            android.support.v4.app.FragmentActivity r4 = (android.support.p030v4.app.FragmentActivity) r4
            android.arch.lifecycle.y r4 = android.arch.lifecycle.C0214z.m440a(r4)
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel> r0 = com.p683ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel.class
            android.arch.lifecycle.x r4 = r4.mo359a(r0)
            java.lang.String r0 = "ViewModelProviders.of(ac…extViewModel::class.java)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r4, r0)
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel r4 = (com.p683ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel) r4
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r4 = r4.f107134a
            java.lang.String r0 = "ViewModelProviders.of(ac…s.java).shortVideoContext"
            p2628d.p2639f.p2641b.C52711k.m112236a(r4, r0)
            r3.f124940j = r4
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r4 = r3.f124940j
            if (r4 != 0) goto L_0x002c
            java.lang.String r0 = "shortVideoContext"
            p2628d.p2639f.p2641b.C52711k.m112237a(r0)
        L_0x002c:
            com.ss.android.ugc.aweme.sticker.model.a r4 = r4.f107126s
            if (r4 == 0) goto L_0x004a
            com.ss.android.ugc.aweme.property.l r4 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101151O
            com.ss.android.ugc.aweme.property.l$a r0 = com.p683ss.android.ugc.aweme.property.C40795l.C40796a.LongVideoThreshold
            long r0 = r4.mo83119c(r0)
            int r4 = (int) r0
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r0 = r3.f124940j
            if (r0 != 0) goto L_0x0042
            java.lang.String r1 = "shortVideoContext"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x0042:
            boolean r0 = r0.f107089ao
            if (r0 == 0) goto L_0x0047
            goto L_0x0056
        L_0x0047:
            r4 = 15000(0x3a98, float:2.102E-41)
            goto L_0x0056
        L_0x004a:
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r4 = r3.f124940j
            if (r4 != 0) goto L_0x0053
            java.lang.String r0 = "shortVideoContext"
            p2628d.p2639f.p2641b.C52711k.m112237a(r0)
        L_0x0053:
            long r0 = r4.f107110c
            int r4 = (int) r0
        L_0x0056:
            com.ss.android.ugc.aweme.shortvideo.dh r0 = com.p683ss.android.ugc.aweme.shortvideo.C43214dh.m94817a()
            com.ss.android.ugc.aweme.shortvideo.c r0 = r0.mo50201b()
            if (r0 == 0) goto L_0x0087
            com.ss.android.ugc.aweme.shortvideo.dh r0 = com.p683ss.android.ugc.aweme.shortvideo.C43214dh.m94817a()
            com.ss.android.ugc.aweme.shortvideo.c r0 = r0.mo50201b()
            if (r0 != 0) goto L_0x006d
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x006d:
            int r0 = r0.shootDuration
            if (r0 <= 0) goto L_0x0087
            com.ss.android.ugc.aweme.shortvideo.dh r0 = com.p683ss.android.ugc.aweme.shortvideo.C43214dh.m94817a()
            com.ss.android.ugc.aweme.shortvideo.c r0 = r0.mo50201b()
            if (r0 != 0) goto L_0x007e
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x007e:
            int r0 = r0.shootDuration
            int r4 = java.lang.Math.min(r4, r0)
            r3.f124944n = r4
            goto L_0x0089
        L_0x0087:
            r3.f124944n = r4
        L_0x0089:
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r4 = r3.f124940j
            if (r4 != 0) goto L_0x0092
            java.lang.String r0 = "shortVideoContext"
            p2628d.p2639f.p2641b.C52711k.m112237a(r0)
        L_0x0092:
            int r4 = r4.f107113f
            r3.f124945o = r4
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r4 = r3.f124940j
            if (r4 != 0) goto L_0x009f
            java.lang.String r0 = "shortVideoContext"
            p2628d.p2639f.p2641b.C52711k.m112237a(r0)
        L_0x009f:
            java.lang.String r4 = r4.f107112e
            java.lang.String r0 = "shortVideoContext.mMusicPath"
            p2628d.p2639f.p2641b.C52711k.m112236a(r4, r0)
            r3.f124943m = r4
            com.ss.android.ugc.aweme.shortvideo.cutmusic.a r4 = new com.ss.android.ugc.aweme.shortvideo.cutmusic.a
            android.view.View r0 = r3.f33834b
            if (r0 == 0) goto L_0x00e2
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            r1 = r3
            com.ss.android.ugc.aweme.shortvideo.cutmusic.c$a r1 = (com.p683ss.android.ugc.aweme.shortvideo.cutmusic.C43188c.C43189a) r1
            r4.<init>(r0, r1)
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r0 = r3.f124940j
            if (r0 != 0) goto L_0x00bf
            java.lang.String r1 = "shortVideoContext"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x00bf:
            com.ss.android.ugc.aweme.shortvideo.d r0 = r0.f107070aV
            r4.mo87787a(r0)
            int r0 = r3.f124944n
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r1 = r3.f124940j
            if (r1 != 0) goto L_0x00cf
            java.lang.String r2 = "shortVideoContext"
            p2628d.p2639f.p2641b.C52711k.m112237a(r2)
        L_0x00cf:
            int r1 = r1.f107114g
            int r2 = r3.f124945o
            r4.mo87786a(r0, r1, r2)
            com.ss.android.ugc.aweme.shortvideo.cutmusic.c r4 = (com.p683ss.android.ugc.aweme.shortvideo.cutmusic.C43188c) r4
            r3.f124941k = r4
            int r4 = r3.f124945o
            int r0 = r3.f124944n
            r3.m107567a(r4, r0)
            return
        L_0x00e2:
            d.u r4 = new d.u
            java.lang.String r0 = "null cannot be cast to non-null type android.widget.FrameLayout"
            r4.<init>(r0)
            throw r4
        L_0x00ea:
            d.u r4 = new d.u
            java.lang.String r0 = "null cannot be cast to non-null type android.support.v4.app.FragmentActivity"
            r4.<init>(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.gamora.recorder.p2477k.C49858c.mo24448e(android.os.Bundle):void");
    }

    /* renamed from: a */
    public final <VM1 extends JediViewModel<S1>, S1 extends C11932s, R> R mo22552a(VM1 vm1, C52671b<? super S1, ? extends R> bVar) {
        C52711k.m112240b(vm1, "viewModel1");
        C52711k.m112240b(bVar, "block");
        return C49549a.m106924a(this, vm1, bVar);
    }

    /* renamed from: a */
    private final void m107567a(int i, int i2) {
        String str = this.f124943m;
        if (str == null) {
            C52711k.m112237a("mMusicPath");
        }
        if (!TextUtils.isEmpty(str)) {
            if (this.f124942l == null) {
                Activity activity = this.f33840g_;
                if (activity != null) {
                    AmeActivity ameActivity = (AmeActivity) activity;
                    String str2 = this.f124943m;
                    if (str2 == null) {
                        C52711k.m112237a("mMusicPath");
                    }
                    this.f124942l = new RepeatMusicPlayer(ameActivity, str2, i2);
                } else {
                    throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.base.AmeActivity");
                }
            }
            RepeatMusicPlayer repeatMusicPlayer = this.f124942l;
            if (repeatMusicPlayer == null) {
                C52711k.m112234a();
            }
            repeatMusicPlayer.mo87778a(i);
            RepeatMusicPlayer repeatMusicPlayer2 = this.f124942l;
            if (repeatMusicPlayer2 == null) {
                C52711k.m112234a();
            }
            repeatMusicPlayer2.f109190e = this;
        }
    }

    /* renamed from: a */
    public final View mo24387a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C52711k.m112240b(layoutInflater, "inflater");
        C52711k.m112240b(viewGroup, "container");
        View inflate = layoutInflater.inflate(R.layout.atz, viewGroup, false);
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
