package com.p683ss.android.ugc.gamora.editor;

import android.app.Activity;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0198r;
import android.arch.lifecycle.C0199s;
import android.arch.lifecycle.C0209x;
import android.arch.lifecycle.C0214z;
import android.content.Context;
import android.os.Bundle;
import android.support.p030v4.app.C0654k;
import android.support.p030v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.FrameLayout;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
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
import com.bytedance.jedi.arch.internal.C11896i;
import com.bytedance.scene.C12924i;
import com.bytedance.scene.group.C12896b;
import com.p683ss.android.ugc.asve.p1239c.C20346b;
import com.p683ss.android.ugc.asve.p1239c.C20347c;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.C23569o;
import com.p683ss.android.ugc.aweme.base.p1412d.p1413a.C23521a;
import com.p683ss.android.ugc.aweme.base.p1412d.p1413a.C23522b;
import com.p683ss.android.ugc.aweme.comment.model.CommentVideoModel;
import com.p683ss.android.ugc.aweme.comment_sticker.view.CommentStickerView;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.infoSticker.C35556ac;
import com.p683ss.android.ugc.aweme.infoSticker.C35579at;
import com.p683ss.android.ugc.aweme.infoSticker.C35606f.C35607a;
import com.p683ss.android.ugc.aweme.infosticker.InfoStickerModel;
import com.p683ss.android.ugc.aweme.infosticker.StickerItemModel;
import com.p683ss.android.ugc.aweme.p1482bw.p1483a.C24434d;
import com.p683ss.android.ugc.aweme.p1484bx.C24458h;
import com.p683ss.android.ugc.aweme.p1484bx.C24458h.C24459a;
import com.p683ss.android.ugc.aweme.port.p2082in.C39529ab;
import com.p683ss.android.ugc.aweme.port.p2082in.C39529ab.C39539j;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.port.p2082in.C39630m;
import com.p683ss.android.ugc.aweme.property.C40789h.C40790a;
import com.p683ss.android.ugc.aweme.shortvideo.C42437ay;
import com.p683ss.android.ugc.aweme.shortvideo.C42482c;
import com.p683ss.android.ugc.aweme.shortvideo.C43214dh;
import com.p683ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.p683ss.android.ugc.aweme.shortvideo.edit.C43434az;
import com.p683ss.android.ugc.aweme.shortvideo.edit.C43439b;
import com.p683ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.C43487a;
import com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.C43501am;
import com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.C43502an;
import com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.C43507as;
import com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.C43509at;
import com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.InfoStickerViewModel;
import com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.C43577d;
import com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.C43596f;
import com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.commnet.CommentStickerInteractView;
import com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.view.InteractStickerBaseView;
import com.p683ss.android.ugc.aweme.shortvideo.lyric.C43954a;
import com.p683ss.android.ugc.aweme.shortvideo.lyric.LyricEffectViewModel;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.C44548d;
import com.p683ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.p683ss.android.ugc.aweme.story.shootvideo.textfont.C46688i.C46696a;
import com.p683ss.android.ugc.aweme.story.shootvideo.textsticker.gesture.C46722b;
import com.p683ss.android.ugc.aweme.story.shootvideo.textsticker.view.C46757l;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import com.p683ss.android.ugc.gamora.editor.sticker.donation.C49511h;
import com.p683ss.android.ugc.gamora.jedi.C49548a;
import com.p683ss.android.ugc.gamora.jedi.C49548a.C49549a;
import com.p683ss.android.ugc.gamora.jedi.C49555b;
import com.p683ss.android.ugc.gamora.jedi.C49558e;
import com.p683ss.android.ugc.gamora.jedi.C49562i;
import com.p683ss.android.ugc.gamora.p2458b.C48927d;
import com.p683ss.android.ugc.tools.view.widget.C50275d;
import com.ss.android.ugc.trill.R;
import dmt.p2652av.video.C52904aa;
import dmt.p2652av.video.C52907ac;
import dmt.p2652av.video.C53031z;
import dmt.p2652av.video.VEPreviewMusicParams;
import dmt.p2652av.video.VEVideoPublishEditViewModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.C53199ae;
import kotlinx.coroutines.C53200af;
import kotlinx.coroutines.C53207am;
import kotlinx.coroutines.C53225av;
import kotlinx.coroutines.C53263bl;
import kotlinx.coroutines.CoroutineExceptionHandler;
import org.json.JSONArray;
import p064c.p065a.p069b.C1690c;
import p2628d.C52847n;
import p2628d.C52855s;
import p2628d.C52857u;
import p2628d.C52860x;
import p2628d.p2631c.C52599a;
import p2628d.p2631c.C52625c;
import p2628d.p2631c.C52628e;
import p2628d.p2631c.C52628e.C52633c;
import p2628d.p2631c.p2632a.C52601b;
import p2628d.p2631c.p2633b.p2634a.C52618f;
import p2628d.p2631c.p2633b.p2634a.C52624k;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2640a.C52686q;
import p2628d.p2639f.p2640a.C52687r;
import p2628d.p2639f.p2640a.C52688s;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2648k.C52771j;

/* renamed from: com.ss.android.ugc.gamora.editor.bh */
public final class C49256bh extends C12896b implements C35607a, C49548a {

    /* renamed from: S */
    public static final C49257a f123717S = new C49257a(null);

    /* renamed from: A */
    public EditLyricStickerViewModel f123718A;

    /* renamed from: B */
    public LyricEffectViewModel f123719B;

    /* renamed from: C */
    public EditToolbarViewModel f123720C;

    /* renamed from: D */
    public EditStickerViewModel f123721D;

    /* renamed from: E */
    public VEVideoPublishEditViewModel f123722E;

    /* renamed from: F */
    public List<InteractStickerStruct> f123723F = new ArrayList();

    /* renamed from: G */
    public FrameLayout f123724G;

    /* renamed from: H */
    public FrameLayout f123725H;

    /* renamed from: I */
    public FrameLayout f123726I;

    /* renamed from: J */
    public C52907ac f123727J;

    /* renamed from: K */
    public EditStickerPanelViewModel f123728K;

    /* renamed from: L */
    public InfoStickerViewModel f123729L;

    /* renamed from: M */
    public EditMusicViewModel f123730M;

    /* renamed from: N */
    public C49271b f123731N;

    /* renamed from: O */
    public boolean f123732O;

    /* renamed from: P */
    public long f123733P;

    /* renamed from: Q */
    public boolean f123734Q;

    /* renamed from: R */
    public C49389cs f123735R;

    /* renamed from: T */
    private boolean f123736T;

    /* renamed from: U */
    private final C53263bl f123737U = C53270bq.m113187a(null, 1, null);

    /* renamed from: V */
    private final SafeHandler f123738V = new SafeHandler(mo22626h());

    /* renamed from: k */
    public C49527v f123739k;

    /* renamed from: l */
    public C49391cu f123740l;

    /* renamed from: m */
    public C49067aa f123741m;

    /* renamed from: n */
    public C49307bs f123742n;

    /* renamed from: o */
    public C49131aq f123743o;

    /* renamed from: p */
    public C49511h f123744p;

    /* renamed from: q */
    public C49378co f123745q;

    /* renamed from: r */
    public C49388cr f123746r;

    /* renamed from: s */
    public C44548d f123747s;

    /* renamed from: t */
    public C49082af f123748t;

    /* renamed from: u */
    public EditViewModel f123749u;

    /* renamed from: v */
    public EditPoiStickerViewModel f123750v;

    /* renamed from: w */
    public VideoPublishEditModel f123751w;

    /* renamed from: x */
    public EditInfoStickerViewModel f123752x;

    /* renamed from: y */
    public EditTextStickerViewModel f123753y;

    /* renamed from: z */
    public EditVoteStickerViewModel f123754z;

    /* renamed from: com.ss.android.ugc.gamora.editor.bh$a */
    public static final class C49257a {
        private C49257a() {
        }

        public /* synthetic */ C49257a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.bh$aa */
    static final class C49258aa extends C52712l implements C52682m<C11866f, Integer, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C49256bh f123755a;

        C49258aa(C49256bh bhVar) {
            this.f123755a = bhVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            Integer num = (Integer) obj2;
            C52711k.m112240b((C11866f) obj, "$receiver");
            if (num != null) {
                int intValue = num.intValue();
                View b = this.f123755a.mo24464b((int) R.id.daw);
                if (b != null) {
                    LayoutParams layoutParams = b.getLayoutParams();
                    if (layoutParams != null) {
                        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
                        marginLayoutParams.topMargin = intValue;
                        b.setLayoutParams(marginLayoutParams);
                    } else {
                        throw new C52857u("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    }
                }
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.bh$ab */
    static final class C49259ab<T> implements C0199s<Integer> {

        /* renamed from: a */
        final /* synthetic */ C49256bh f123756a;

        C49259ab(C49256bh bhVar) {
            this.f123756a = bhVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Integer num = (Integer) obj;
            if (this.f123756a.f123748t != null) {
                C49082af afVar = this.f123756a.f123748t;
                if (afVar == null) {
                    C52711k.m112234a();
                }
                if (afVar.mo97109K() > 0) {
                    C49067aa aaVar = this.f123756a.f123741m;
                    if (aaVar != null) {
                        C49082af afVar2 = this.f123756a.f123748t;
                        if (afVar2 == null) {
                            C52711k.m112234a();
                        }
                        aaVar.mo97095F().mo88641b(afVar2.mo97109K());
                    }
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.bh$ac */
    static final class C49260ac<T> implements C0199s<Integer> {

        /* renamed from: a */
        final /* synthetic */ C49256bh f123757a;

        C49260ac(C49256bh bhVar) {
            this.f123757a = bhVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Integer num = (Integer) obj;
            if (this.f123757a.f123748t != null) {
                C49082af afVar = this.f123757a.f123748t;
                if (afVar == null) {
                    C52711k.m112234a();
                }
                if (afVar.mo97109K() > 0) {
                    C49067aa aaVar = this.f123757a.f123741m;
                    if (aaVar != null) {
                        C49082af afVar2 = this.f123757a.f123748t;
                        if (afVar2 == null) {
                            C52711k.m112234a();
                        }
                        aaVar.mo97095F().mo88648c(afVar2.mo97109K());
                    }
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.bh$ad */
    static final class C49261ad extends C52712l implements C52682m<C49548a, C52847n<? extends Float, ? extends Long>, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C49256bh f123758a;

        C49261ad(C49256bh bhVar) {
            this.f123758a = bhVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            C52847n nVar = (C52847n) obj2;
            C52711k.m112240b((C49548a) obj, "$receiver");
            C52711k.m112240b(nVar, "it");
            C49142as.m106091a(this.f123758a.mo97249O(), ((Number) nVar.getFirst()).floatValue(), ((Number) nVar.getSecond()).longValue());
            C49142as.m106091a(this.f123758a.mo97248N(), ((Number) nVar.getFirst()).floatValue(), ((Number) nVar.getSecond()).longValue());
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.bh$ae */
    public static final class C49262ae implements C46696a {

        /* renamed from: a */
        final /* synthetic */ C49256bh f123759a;

        /* renamed from: a */
        public final void mo93685a(C46757l lVar) {
            C52711k.m112240b(lVar, "view");
        }

        /* renamed from: b */
        public final void mo93687b(C46757l lVar) {
            C52711k.m112240b(lVar, "view");
        }

        /* renamed from: c */
        public final void mo93688c(C46757l lVar) {
            C52711k.m112240b(lVar, "view");
        }

        C49262ae(C49256bh bhVar) {
            this.f123759a = bhVar;
        }

        /* renamed from: a */
        public final void mo93686a(C46757l lVar, int i, int i2, boolean z, boolean z2, boolean z3) {
            C52711k.m112240b(lVar, "view");
            if (z) {
                if (!z3) {
                    this.f123759a.mo97243I().mo97033a(true, true, true);
                }
                this.f123759a.f123732O = false;
                return;
            }
            if (!this.f123759a.f123732O) {
                this.f123759a.mo97243I().mo97033a(false, true, false);
                EditInfoStickerViewModel editInfoStickerViewModel = this.f123759a.f123752x;
                if (editInfoStickerViewModel == null) {
                    C52711k.m112237a("editInfoStickerViewModel");
                }
                editInfoStickerViewModel.mo96855e();
                EditTextStickerViewModel editTextStickerViewModel = this.f123759a.f123753y;
                if (editTextStickerViewModel == null) {
                    C52711k.m112237a("editTextStickerViewModel");
                }
                editTextStickerViewModel.mo96977e();
                EditPoiStickerViewModel editPoiStickerViewModel = this.f123759a.f123750v;
                if (editPoiStickerViewModel == null) {
                    C52711k.m112237a("editPoiStickerViewModel");
                }
                editPoiStickerViewModel.mo96910e();
                this.f123759a.mo97251Q();
                C49067aa aaVar = this.f123759a.f123741m;
                if (!(aaVar == null || aaVar.mo97095F().f110133B == null)) {
                    aaVar.mo97096G();
                }
            }
            this.f123759a.f123732O = true;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.bh$af */
    static final class C49263af<T> implements C23522b<C46757l> {

        /* renamed from: a */
        final /* synthetic */ C49256bh f123760a;

        C49263af(C49256bh bhVar) {
            this.f123760a = bhVar;
        }

        /* renamed from: a */
        public final /* synthetic */ void mo48682a(Object obj) {
            C46757l lVar = (C46757l) obj;
            this.f123760a.mo97251Q();
            C49067aa aaVar = this.f123760a.f123741m;
            if (aaVar != null) {
                aaVar.mo97099a((C43509at<?>) lVar);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.bh$ag */
    static final class C49264ag<T, U> implements C23521a<C46757l, C46757l> {

        /* renamed from: a */
        final /* synthetic */ C49256bh f123761a;

        C49264ag(C49256bh bhVar) {
            this.f123761a = bhVar;
        }

        /* renamed from: a */
        public final /* synthetic */ void mo48681a(Object obj, Object obj2) {
            C46757l lVar = (C46757l) obj;
            C46757l lVar2 = (C46757l) obj2;
            C49307bs bsVar = this.f123761a.f123742n;
            if (bsVar != null && bsVar.mo97264F().mo93657b()) {
                C49067aa aaVar = this.f123761a.f123741m;
                if (aaVar != null) {
                    aaVar.mo97104b((C43509at<?>) lVar2);
                }
                C49067aa aaVar2 = this.f123761a.f123741m;
                if (aaVar2 != null) {
                    aaVar2.mo97096G();
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.bh$ah */
    public static final class C49265ah extends C52599a implements CoroutineExceptionHandler {
        public final void handleException(C52628e eVar, Throwable th) {
            C52711k.m112240b(eVar, "context");
            C52711k.m112240b(th, "exception");
        }

        public C49265ah(C52633c cVar) {
            super(cVar);
        }
    }

    @C52618f(mo110254b = "EditStickerScene.kt", mo110255c = {840}, mo110256d = "invokeSuspend", mo110257e = "com.ss.android.ugc.gamora.editor.EditStickerScene$onStickerChoose$2")
    /* renamed from: com.ss.android.ugc.gamora.editor.bh$ai */
    static final class C49266ai extends C52624k implements C52682m<C53199ae, C52625c<? super C52860x>, Object> {

        /* renamed from: a */
        Object f123762a;

        /* renamed from: b */
        Object f123763b;

        /* renamed from: c */
        int f123764c;

        /* renamed from: d */
        final /* synthetic */ C49256bh f123765d;

        /* renamed from: e */
        final /* synthetic */ Effect f123766e;

        /* renamed from: f */
        final /* synthetic */ String f123767f;

        /* renamed from: g */
        private C53199ae f123768g;

        @C52618f(mo110254b = "EditStickerScene.kt", mo110255c = {}, mo110256d = "invokeSuspend", mo110257e = "com.ss.android.ugc.gamora.editor.EditStickerScene$onStickerChoose$2$showLyric$1")
        /* renamed from: com.ss.android.ugc.gamora.editor.bh$ai$a */
        static final class C49268a extends C52624k implements C52682m<C53199ae, C52625c<? super Boolean>, Object> {

            /* renamed from: a */
            int f123770a;

            /* renamed from: b */
            private C53199ae f123771b;

            C49268a(C52625c cVar) {
                super(2, cVar);
            }

            public final C52625c<C52860x> create(Object obj, C52625c<?> cVar) {
                C52711k.m112240b(cVar, "completion");
                C49268a aVar = new C49268a(cVar);
                aVar.f123771b = (C53199ae) obj;
                return aVar;
            }

            public final Object invoke(Object obj, Object obj2) {
                return ((C49268a) create(obj, (C52625c) obj2)).invokeSuspend(C52860x.f131107a);
            }

            /* JADX WARNING: Code restructure failed: missing block: B:5:0x001a, code lost:
                if (r0 == null) goto L_0x001c;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object invokeSuspend(java.lang.Object r5) {
                /*
                    r4 = this;
                    int r5 = r4.f123770a
                    if (r5 != 0) goto L_0x0040
                    com.ss.android.ugc.aweme.port.in.ak r5 = com.p683ss.android.ugc.aweme.port.p2082in.C39630m.m88234a()
                    com.ss.android.ugc.aweme.port.in.ab r5 = r5.mo58604b()
                    com.ss.android.ugc.aweme.shortvideo.dh r0 = com.p683ss.android.ugc.aweme.shortvideo.C43214dh.m94817a()
                    com.ss.android.ugc.aweme.shortvideo.c r0 = r0.mo50201b()
                    if (r0 == 0) goto L_0x001c
                    java.lang.String r0 = r0.getMusicId()
                    if (r0 != 0) goto L_0x001e
                L_0x001c:
                    java.lang.String r0 = ""
                L_0x001e:
                    r1 = 10
                    r2 = 0
                    r3 = 1
                    com.ss.android.ugc.aweme.shortvideo.c r5 = r5.mo80567a(r0, r3, r1, r2)
                    if (r5 == 0) goto L_0x002d
                    java.lang.String r5 = r5.getLrcUrl()
                    goto L_0x002e
                L_0x002d:
                    r5 = 0
                L_0x002e:
                    java.lang.CharSequence r5 = (java.lang.CharSequence) r5
                    if (r5 == 0) goto L_0x0038
                    int r5 = r5.length()
                    if (r5 != 0) goto L_0x0039
                L_0x0038:
                    r2 = 1
                L_0x0039:
                    r5 = r2 ^ 1
                    java.lang.Boolean r5 = p2628d.p2631c.p2633b.p2634a.C52614b.m112161a(r5)
                    return r5
                L_0x0040:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r0)
                    throw r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.gamora.editor.C49256bh.C49266ai.C49268a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        C49266ai(C49256bh bhVar, Effect effect, String str, C52625c cVar) {
            this.f123765d = bhVar;
            this.f123766e = effect;
            this.f123767f = str;
            super(2, cVar);
        }

        public final C52625c<C52860x> create(Object obj, C52625c<?> cVar) {
            C52711k.m112240b(cVar, "completion");
            C49266ai aiVar = new C49266ai(this.f123765d, this.f123766e, this.f123767f, cVar);
            aiVar.f123768g = (C53199ae) obj;
            return aiVar;
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C49266ai) create(obj, (C52625c) obj2)).invokeSuspend(C52860x.f131107a);
        }

        public final Object invokeSuspend(Object obj) {
            boolean z;
            Object a = C52601b.m112157a();
            String str = null;
            switch (this.f123764c) {
                case 0:
                    C53199ae aeVar = this.f123768g;
                    C53207am a2 = C53301g.m113292b(aeVar, C53225av.m113075c(), null, new C49268a(null), 2, null);
                    this.f123762a = aeVar;
                    this.f123763b = a2;
                    this.f123764c = 1;
                    obj = a2.mo110779a(this);
                    if (obj == a) {
                        return a;
                    }
                    break;
                case 1:
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            boolean booleanValue = ((Boolean) obj).booleanValue();
            if (!this.f123765d.mo97256V() && C43214dh.m94817a().mo50201b() != null) {
                C42482c b = C43214dh.m94817a().mo50201b();
                if (b == null) {
                    C52711k.m112234a();
                }
                C52711k.m112236a((Object) b, "PublishManager.inst().getCurMusic()!!");
                if (!TextUtils.isEmpty(b.getLrcUrl()) && booleanValue) {
                    C49082af afVar = this.f123765d.f123748t;
                    if (afVar != null) {
                        Effect a3 = afVar.mo89537a(this.f123766e);
                        if (a3 != null) {
                            str = a3.getUnzipPath();
                        }
                    }
                    if (TextUtils.isEmpty(str)) {
                        this.f123765d.mo97246L().f111302c.observe(this.f123765d, new C0199s<C52860x>(this) {

                            /* renamed from: a */
                            final /* synthetic */ C49266ai f123769a;

                            {
                                this.f123769a = r1;
                            }

                            public final /* synthetic */ void onChanged(Object obj) {
                                C52860x xVar = (C52860x) obj;
                                if (C43214dh.m94817a().mo50201b() != null) {
                                    C49256bh bhVar = this.f123769a.f123765d;
                                    C42482c b = C43214dh.m94817a().mo50201b();
                                    if (b == null) {
                                        C52711k.m112234a();
                                    }
                                    C52711k.m112236a((Object) b, "PublishManager.inst().getCurMusic()!!");
                                    bhVar.mo97260a(b, this.f123769a.f123766e, this.f123769a.f123767f, true);
                                }
                                this.f123769a.f123765d.mo97246L().f111302c.removeObservers(this.f123769a.f123765d);
                            }
                        });
                    } else {
                        C49256bh bhVar = this.f123765d;
                        C42482c b2 = C43214dh.m94817a().mo50201b();
                        if (b2 == null) {
                            C52711k.m112234a();
                        }
                        C52711k.m112236a((Object) b2, "PublishManager.inst().getCurMusic()!!");
                        Effect effect = this.f123766e;
                        if (effect == null) {
                            C52711k.m112234a();
                        }
                        bhVar.mo97260a(b2, effect, this.f123767f, true);
                    }
                    this.f123765d.mo97243I().mo97033a(true, false, true);
                    return C52860x.f131107a;
                }
            }
            this.f123765d.f123734Q = true;
            C49256bh bhVar2 = this.f123765d;
            Effect effect2 = this.f123766e;
            String str2 = this.f123767f;
            if (C43214dh.m94817a().mo50201b() != null) {
                C42482c b3 = C43214dh.m94817a().mo50201b();
                if (b3 == null) {
                    C52711k.m112234a();
                }
                C52711k.m112236a((Object) b3, "PublishManager.inst().getCurMusic()!!");
                if (TextUtils.isEmpty(b3.getLrcUrl()) && !this.f123765d.mo97256V()) {
                    z = true;
                    bhVar2.mo97261a(effect2, str2, z, 1);
                    C26890h.m65011a("enter_lyricsticker_song_search", C23089d.m56640a().mo47829a("creation_id", this.f123765d.mo97244J().creationId).mo47829a("shoot_way", this.f123765d.mo97244J().mShootWay).mo47829a("previous_page", "video_edit_page").f61491a);
                    return C52860x.f131107a;
                }
            }
            z = false;
            bhVar2.mo97261a(effect2, str2, z, 1);
            C26890h.m65011a("enter_lyricsticker_song_search", C23089d.m56640a().mo47829a("creation_id", this.f123765d.mo97244J().creationId).mo47829a("shoot_way", this.f123765d.mo97244J().mShootWay).mo47829a("previous_page", "video_edit_page").f61491a);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.bh$aj */
    static final class C49269aj extends C52712l implements C52671b<C24434d, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C49256bh f123772a;

        /* renamed from: b */
        final /* synthetic */ Effect f123773b;

        /* renamed from: c */
        final /* synthetic */ String f123774c;

        /* renamed from: d */
        final /* synthetic */ int f123775d;

        C49269aj(C49256bh bhVar, Effect effect, String str, int i) {
            this.f123772a = bhVar;
            this.f123773b = effect;
            this.f123774c = str;
            this.f123775d = i;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            C24434d dVar = (C24434d) obj;
            C52711k.m112240b(dVar, "result");
            C49256bh bhVar = this.f123772a;
            Effect effect = this.f123773b;
            String str = this.f123774c;
            int i = this.f123775d;
            C42482c cVar = dVar.f64820c;
            if (cVar == null) {
                C52711k.m112234a();
            }
            boolean z = true;
            if (i != 1) {
                z = false;
            }
            bhVar.mo97260a(cVar, effect, str, z);
            C12924i iVar = bhVar.f33835c;
            if (!(iVar instanceof C49159aw)) {
                iVar = null;
            }
            C49159aw awVar = (C49159aw) iVar;
            if (awVar != null) {
                C49390ct T = awVar.mo97173T();
                if (T != null) {
                    T.mo97112a(dVar);
                }
            }
            VideoPublishEditModel videoPublishEditModel = bhVar.f123751w;
            if (videoPublishEditModel == null) {
                C52711k.m112237a("publishEditModel");
            }
            videoPublishEditModel.mMusicOrigin = "edit_page_lyricsticker";
            EditViewModel editViewModel = bhVar.f123749u;
            if (editViewModel == null) {
                C52711k.m112237a("editViewModel");
            }
            editViewModel.mo97033a(true, false, true);
            this.f123772a.mo97245K().mo22530c(C48956b.f123146a);
            this.f123772a.f123734Q = false;
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.bh$ak */
    static final class C49270ak extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C49256bh f123776a;

        /* renamed from: b */
        final /* synthetic */ int f123777b;

        C49270ak(C49256bh bhVar, int i) {
            this.f123776a = bhVar;
            this.f123777b = i;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C49256bh bhVar = this.f123776a;
            int i = this.f123777b;
            C12924i iVar = bhVar.f33835c;
            if (!(iVar instanceof C49159aw)) {
                iVar = null;
            }
            C49159aw awVar = (C49159aw) iVar;
            if (awVar != null) {
                C49390ct T = awVar.mo97173T();
                if (T != null) {
                    T.mo97120d();
                }
            }
            if (i != 2) {
                EditViewModel editViewModel = bhVar.f123749u;
                if (editViewModel == null) {
                    C52711k.m112237a("editViewModel");
                }
                editViewModel.mo97033a(true, false, true);
            } else {
                C49082af afVar = bhVar.f123748t;
                if (afVar != null) {
                    afVar.mo89534F();
                }
            }
            this.f123776a.f123734Q = false;
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.bh$b */
    public interface C49271b {
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.bh$c */
    static final class C49272c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C49256bh f123778a;

        C49272c(C49256bh bhVar) {
            this.f123778a = bhVar;
        }

        public final void run() {
            C49256bh bhVar = this.f123778a;
            VideoPublishEditModel videoPublishEditModel = bhVar.f123751w;
            if (videoPublishEditModel == null) {
                C52711k.m112237a("publishEditModel");
            }
            if (videoPublishEditModel.commentVideoModel != null) {
                EditViewModel editViewModel = bhVar.f123749u;
                if (editViewModel == null) {
                    C52711k.m112237a("editViewModel");
                }
                if (!C52711k.m112239a((Object) (Boolean) editViewModel.mo97043m().getValue(), (Object) Boolean.valueOf(true))) {
                    C49388cr crVar = bhVar.f123746r;
                    if (crVar != null) {
                        VideoPublishEditModel videoPublishEditModel2 = bhVar.f123751w;
                        if (videoPublishEditModel2 == null) {
                            C52711k.m112237a("publishEditModel");
                        }
                        CommentVideoModel commentVideoModel = videoPublishEditModel2.commentVideoModel;
                        C52711k.m112236a((Object) commentVideoModel, "publishEditModel.commentVideoModel");
                        crVar.mo97326a(commentVideoModel);
                    }
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.bh$d */
    public static final class C49273d implements C39539j {

        /* renamed from: a */
        final /* synthetic */ C49256bh f123779a;

        /* renamed from: b */
        final /* synthetic */ C42482c f123780b;

        /* renamed from: c */
        final /* synthetic */ Effect f123781c;

        /* renamed from: d */
        final /* synthetic */ String f123782d;

        /* renamed from: a */
        public final void mo80645a(int i, String str, JSONArray jSONArray) {
            Long l = null;
            if (jSONArray != null && !jSONArray.isNull(0)) {
                this.f123779a.mo97259a(this.f123780b, this.f123781c, this.f123782d, jSONArray);
                if (i == 2) {
                    String str2 = "aweme_type_download_lyric_rate";
                    C42437ay a = C42437ay.m93202a().mo86520a("duration", Long.valueOf(System.currentTimeMillis() - this.f123779a.f123733P));
                    String str3 = "music_id";
                    C42482c cVar = this.f123780b;
                    if (cVar != null) {
                        l = Long.valueOf(cVar.f107429id);
                    }
                    C23569o.m57776a(str2, 0, a.mo86520a(str3, l).mo86522b());
                }
            } else if (i == 2) {
                C10691a.m21542b((Context) this.f123779a.f33840g_, (int) R.string.g0g).mo19066a();
                String str4 = "aweme_type_download_lyric_rate";
                C42437ay a2 = C42437ay.m93202a().mo86520a("duration", Long.valueOf(System.currentTimeMillis() - this.f123779a.f123733P));
                String str5 = "music_id";
                C42482c cVar2 = this.f123780b;
                if (cVar2 != null) {
                    l = Long.valueOf(cVar2.f107429id);
                }
                C23569o.m57776a(str4, 1, a2.mo86520a(str5, l).mo86522b());
            }
        }

        C49273d(C49256bh bhVar, C42482c cVar, Effect effect, String str) {
            this.f123779a = bhVar;
            this.f123780b = cVar;
            this.f123781c = effect;
            this.f123782d = str;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.bh$e */
    static final class C49274e<T> implements C0199s<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C49256bh f123783a;

        /* renamed from: b */
        final /* synthetic */ C42482c f123784b;

        /* renamed from: c */
        final /* synthetic */ String f123785c;

        /* renamed from: d */
        final /* synthetic */ JSONArray f123786d;

        C49274e(C49256bh bhVar, C42482c cVar, String str, JSONArray jSONArray) {
            this.f123783a = bhVar;
            this.f123784b = cVar;
            this.f123785c = str;
            this.f123786d = jSONArray;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Effect effect;
            C52860x xVar = (C52860x) obj;
            C49256bh bhVar = this.f123783a;
            C42482c cVar = this.f123784b;
            C49082af afVar = this.f123783a.f123748t;
            if (afVar != null) {
                effect = afVar.mo89536H();
            } else {
                effect = null;
            }
            bhVar.mo97259a(cVar, effect, this.f123785c, this.f123786d);
            this.f123783a.mo97246L().f111303d.removeObservers(this.f123783a);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.bh$f */
    static final class C49275f<T> implements C0199s<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C49256bh f123787a;

        /* renamed from: b */
        final /* synthetic */ C42482c f123788b;

        /* renamed from: c */
        final /* synthetic */ String f123789c;

        /* renamed from: d */
        final /* synthetic */ JSONArray f123790d;

        C49275f(C49256bh bhVar, C42482c cVar, String str, JSONArray jSONArray) {
            this.f123787a = bhVar;
            this.f123788b = cVar;
            this.f123789c = str;
            this.f123790d = jSONArray;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Effect effect;
            C52860x xVar = (C52860x) obj;
            C49256bh bhVar = this.f123787a;
            C42482c cVar = this.f123788b;
            C49082af afVar = this.f123787a.f123748t;
            if (afVar != null) {
                effect = afVar.mo89536H();
            } else {
                effect = null;
            }
            bhVar.mo97259a(cVar, effect, this.f123789c, this.f123790d);
            this.f123787a.mo97246L().f111302c.removeObservers(this.f123787a);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.bh$g */
    static final class C49276g<T> implements C0199s<C53031z> {

        /* renamed from: a */
        final /* synthetic */ C49256bh f123791a;

        C49276g(C49256bh bhVar) {
            this.f123791a = bhVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            C53031z zVar = (C53031z) obj;
            if (zVar != null) {
                if (zVar.f131509a == 1) {
                    this.f123791a.mo97243I().mo97033a(false, false, false);
                } else {
                    this.f123791a.mo97243I().mo97033a(true, false, true);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.bh$h */
    static final class C49277h<T> implements C0199s<C52904aa> {

        /* renamed from: a */
        final /* synthetic */ C49256bh f123792a;

        C49277h(C49256bh bhVar) {
            this.f123792a = bhVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            C52904aa aaVar = (C52904aa) obj;
            if (aaVar != null) {
                if (aaVar.f131237h == 1) {
                    this.f123792a.mo97243I().mo97033a(false, false, false);
                } else {
                    this.f123792a.mo97243I().mo97033a(true, false, true);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.bh$i */
    static final class C49278i<T> implements C23522b<View> {

        /* renamed from: a */
        final /* synthetic */ C49256bh f123793a;

        C49278i(C49256bh bhVar) {
            this.f123793a = bhVar;
        }

        /* renamed from: a */
        public final /* synthetic */ void mo48682a(Object obj) {
            View view = (View) obj;
            this.f123793a.mo97251Q();
            C49511h hVar = this.f123793a.f123744p;
            if (hVar != null) {
                C52711k.m112236a((Object) view, "view");
                if (hVar.mo97414a(view)) {
                    C49067aa aaVar = this.f123793a.f123741m;
                    if (aaVar != null) {
                        aaVar.mo97099a((C43509at) view);
                    }
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.bh$j */
    static final class C49279j<T, U> implements C23521a<InteractStickerBaseView, InteractStickerBaseView> {

        /* renamed from: a */
        final /* synthetic */ C49256bh f123794a;

        C49279j(C49256bh bhVar) {
            this.f123794a = bhVar;
        }

        /* renamed from: a */
        public final /* synthetic */ void mo48681a(Object obj, Object obj2) {
            InteractStickerBaseView interactStickerBaseView = (InteractStickerBaseView) obj;
            InteractStickerBaseView interactStickerBaseView2 = (InteractStickerBaseView) obj2;
            C49511h hVar = this.f123794a.f123744p;
            if (hVar != null && hVar.mo97403O()) {
                C49511h hVar2 = this.f123794a.f123744p;
                if (hVar2 != null) {
                    C52711k.m112236a((Object) interactStickerBaseView2, "newTopView");
                    if (hVar2.mo97417b((View) interactStickerBaseView2)) {
                        C49067aa aaVar = this.f123794a.f123741m;
                        if (aaVar != null) {
                            View drawView = interactStickerBaseView2.getDrawView();
                            if (drawView != null) {
                                aaVar.mo97104b((C43509at) drawView);
                            } else {
                                throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.infosticker.TimeEditable<*>");
                            }
                        }
                        C49067aa aaVar2 = this.f123794a.f123741m;
                        if (aaVar2 != null) {
                            aaVar2.mo97096G();
                        }
                    }
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.bh$k */
    static final class C49280k<T> implements C23522b<View> {

        /* renamed from: a */
        final /* synthetic */ C49256bh f123795a;

        C49280k(C49256bh bhVar) {
            this.f123795a = bhVar;
        }

        /* renamed from: a */
        public final /* synthetic */ void mo48682a(Object obj) {
            View view = (View) obj;
            this.f123795a.mo97251Q();
            if (view instanceof CommentStickerView) {
                C49067aa aaVar = this.f123795a.f123741m;
                if (aaVar != null) {
                    aaVar.mo97099a((C43509at) view);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.bh$l */
    static final class C49281l<T, U> implements C23521a<InteractStickerBaseView, InteractStickerBaseView> {

        /* renamed from: a */
        final /* synthetic */ C49256bh f123796a;

        C49281l(C49256bh bhVar) {
            this.f123796a = bhVar;
        }

        /* renamed from: a */
        public final /* synthetic */ void mo48681a(Object obj, Object obj2) {
            InteractStickerBaseView interactStickerBaseView = (InteractStickerBaseView) obj;
            InteractStickerBaseView interactStickerBaseView2 = (InteractStickerBaseView) obj2;
            C49388cr crVar = this.f123796a.f123746r;
            if (crVar != null && crVar.mo97322O() && (interactStickerBaseView2 instanceof CommentStickerInteractView)) {
                C49067aa aaVar = this.f123796a.f123741m;
                if (aaVar != null) {
                    View drawView = ((CommentStickerInteractView) interactStickerBaseView2).getDrawView();
                    if (drawView != null) {
                        aaVar.mo97104b((C43509at<?>) (CommentStickerView) drawView);
                    } else {
                        throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.comment_sticker.view.CommentStickerView");
                    }
                }
                C49067aa aaVar2 = this.f123796a.f123741m;
                if (aaVar2 != null) {
                    aaVar2.mo97096G();
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.bh$m */
    public static final class C49282m extends C24459a {

        /* renamed from: a */
        final /* synthetic */ C49256bh f123797a;

        /* renamed from: b */
        public final void mo50221b() {
            String str;
            super.mo50221b();
            this.f123797a.mo97243I().mo97033a(false, false, true);
            C42482c b = C43214dh.m94817a().mo50201b();
            String str2 = "edit_lyricsticker";
            C23089d a = C23089d.m56640a().mo47829a("enter_from", "video_eidt_page").mo47829a("creation_id", this.f123797a.mo97244J().creationId).mo47829a("shoot_way", this.f123797a.mo97244J().mShootWay);
            String str3 = "music_id";
            if (b == null) {
                str = "";
            } else {
                str = b.getMusicId();
            }
            C26890h.m65011a(str2, a.mo47829a(str3, str).f61491a);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:66:0x0113, code lost:
            if (r0 == null) goto L_0x0115;
         */
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo50225d() {
            /*
                r7 = this;
                com.ss.android.ugc.gamora.editor.bh r0 = r7.f123797a
                com.ss.android.ugc.gamora.editor.af r0 = r0.f123748t
                r1 = 0
                if (r0 == 0) goto L_0x0033
                com.ss.android.ugc.gamora.editor.bh r0 = r7.f123797a
                com.ss.android.ugc.gamora.editor.af r0 = r0.f123748t
                if (r0 != 0) goto L_0x0010
                p2628d.p2639f.p2641b.C52711k.m112234a()
            L_0x0010:
                boolean r0 = r0.f111372j
                if (r0 == 0) goto L_0x0033
                com.ss.android.ugc.gamora.editor.bh r0 = r7.f123797a
                com.ss.android.ugc.gamora.editor.af r0 = r0.f123748t
                if (r0 != 0) goto L_0x001d
                p2628d.p2639f.p2641b.C52711k.m112234a()
            L_0x001d:
                r0.f111372j = r1
                com.ss.android.ugc.gamora.editor.bh r0 = r7.f123797a
                com.bytedance.scene.i r0 = r0.f33835c
                boolean r1 = r0 instanceof com.p683ss.android.ugc.gamora.editor.C49159aw
                if (r1 != 0) goto L_0x0028
                r0 = 0
            L_0x0028:
                com.ss.android.ugc.gamora.editor.aw r0 = (com.p683ss.android.ugc.gamora.editor.C49159aw) r0
                if (r0 == 0) goto L_0x0032
                r1 = 1
                r0.mo97193b(r1)
                goto L_0x0120
            L_0x0032:
                return
            L_0x0033:
                com.ss.android.ugc.gamora.editor.bh r0 = r7.f123797a
                com.ss.android.ugc.gamora.editor.af r0 = r0.f123748t
                if (r0 == 0) goto L_0x0052
                com.ss.android.ugc.gamora.editor.bh r0 = r7.f123797a
                com.ss.android.ugc.gamora.editor.af r0 = r0.f123748t
                if (r0 != 0) goto L_0x0042
                p2628d.p2639f.p2641b.C52711k.m112234a()
            L_0x0042:
                boolean r0 = r0.f111373k
                if (r0 == 0) goto L_0x0052
                com.ss.android.ugc.gamora.editor.bh r0 = r7.f123797a
                com.ss.android.ugc.gamora.editor.af r0 = r0.f123748t
                if (r0 != 0) goto L_0x004f
                p2628d.p2639f.p2641b.C52711k.m112234a()
            L_0x004f:
                r0.f111373k = r1
                return
            L_0x0052:
                com.ss.android.ugc.gamora.editor.bh r0 = r7.f123797a
                com.ss.android.ugc.aweme.shortvideo.edit.infosticker.InfoStickerViewModel r0 = r0.f123729L
                if (r0 != 0) goto L_0x005d
                java.lang.String r1 = "mInfoStickerViewModel"
                p2628d.p2639f.p2641b.C52711k.m112237a(r1)
            L_0x005d:
                android.arch.lifecycle.r<java.lang.Boolean> r0 = r0.f109961c
                java.lang.String r1 = "mInfoStickerViewModel.inTimeEditView"
                p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
                java.lang.Object r0 = r0.getValue()
                if (r0 != 0) goto L_0x006d
                p2628d.p2639f.p2641b.C52711k.m112234a()
            L_0x006d:
                java.lang.Boolean r0 = (java.lang.Boolean) r0
                boolean r0 = r0.booleanValue()
                if (r0 != 0) goto L_0x0083
                com.ss.android.ugc.gamora.editor.bh r0 = r7.f123797a
                com.ss.android.ugc.gamora.editor.EditViewModel r1 = r0.mo97243I()
                r2 = 1
                r3 = 0
                r4 = 0
                r5 = 4
                r6 = 0
                r1.mo97033a(r2, r3, r2)
            L_0x0083:
                com.ss.android.ugc.gamora.editor.bh r0 = r7.f123797a
                com.ss.android.ugc.aweme.shortvideo.dh r1 = com.p683ss.android.ugc.aweme.shortvideo.C43214dh.m94817a()
                com.ss.android.ugc.aweme.shortvideo.c r1 = r1.mo50201b()
                java.lang.String r2 = "edit_lyricsticker_complete"
                com.ss.android.ugc.aweme.app.f.d r3 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
                java.lang.String r4 = "creation_id"
                com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r5 = r0.f123751w
                if (r5 != 0) goto L_0x009e
                java.lang.String r6 = "publishEditModel"
                p2628d.p2639f.p2641b.C52711k.m112237a(r6)
            L_0x009e:
                java.lang.String r5 = r5.creationId
                com.ss.android.ugc.aweme.app.f.d r3 = r3.mo47829a(r4, r5)
                java.lang.String r4 = "shoot_way"
                com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r5 = r0.f123751w
                if (r5 != 0) goto L_0x00af
                java.lang.String r6 = "publishEditModel"
                p2628d.p2639f.p2641b.C52711k.m112237a(r6)
            L_0x00af:
                java.lang.String r5 = r5.mShootWay
                com.ss.android.ugc.aweme.app.f.d r3 = r3.mo47829a(r4, r5)
                java.lang.String r4 = "music_id"
                if (r1 != 0) goto L_0x00bc
                java.lang.String r1 = ""
                goto L_0x00c0
            L_0x00bc:
                java.lang.String r1 = r1.getMusicId()
            L_0x00c0:
                com.ss.android.ugc.aweme.app.f.d r1 = r3.mo47829a(r4, r1)
                java.lang.String r3 = "color_id"
                com.ss.android.ugc.gamora.editor.EditLyricStickerViewModel r4 = r0.f123718A
                if (r4 != 0) goto L_0x00cf
                java.lang.String r5 = "editLyricStickerViewModel"
                p2628d.p2639f.p2641b.C52711k.m112237a(r5)
            L_0x00cf:
                android.app.Activity r5 = r0.f33840g_
                if (r5 == 0) goto L_0x0129
                android.support.v4.app.FragmentActivity r5 = (android.support.p030v4.app.FragmentActivity) r5
                android.arch.lifecycle.k r5 = (android.arch.lifecycle.C0184k) r5
                com.bytedance.jedi.arch.s r4 = r4.mo97464a(r5)
                com.ss.android.ugc.gamora.editor.EditLyricStickerState r4 = (com.p683ss.android.ugc.gamora.editor.EditLyricStickerState) r4
                com.ss.android.ugc.gamora.jedi.e r4 = r4.getCurColor()
                if (r4 != 0) goto L_0x00e8
                r4 = -1
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            L_0x00e8:
                com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47828a(r3, r4)
                java.lang.String r3 = "dynamics"
                com.ss.android.ugc.gamora.editor.EditLyricStickerViewModel r4 = r0.f123718A
                if (r4 != 0) goto L_0x00f7
                java.lang.String r5 = "editLyricStickerViewModel"
                p2628d.p2639f.p2641b.C52711k.m112237a(r5)
            L_0x00f7:
                android.app.Activity r0 = r0.f33840g_
                if (r0 == 0) goto L_0x0121
                android.support.v4.app.FragmentActivity r0 = (android.support.p030v4.app.FragmentActivity) r0
                android.arch.lifecycle.k r0 = (android.arch.lifecycle.C0184k) r0
                com.bytedance.jedi.arch.s r0 = r4.mo97464a(r0)
                com.ss.android.ugc.gamora.editor.EditLyricStickerState r0 = (com.p683ss.android.ugc.gamora.editor.EditLyricStickerState) r0
                com.ss.android.ugc.gamora.editor.cw r0 = r0.getCurLyricEffect()
                if (r0 == 0) goto L_0x0115
                com.ss.android.ugc.effectmanager.effect.model.Effect r0 = r0.f123971a
                if (r0 == 0) goto L_0x0115
                java.lang.String r0 = r0.getName()
                if (r0 != 0) goto L_0x0117
            L_0x0115:
                java.lang.String r0 = "经典"
            L_0x0117:
                com.ss.android.ugc.aweme.app.f.d r0 = r1.mo47829a(r3, r0)
                java.util.Map<java.lang.String, java.lang.String> r0 = r0.f61491a
                com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r2, r0)
            L_0x0120:
                return
            L_0x0121:
                d.u r0 = new d.u
                java.lang.String r1 = "null cannot be cast to non-null type android.support.v4.app.FragmentActivity"
                r0.<init>(r1)
                throw r0
            L_0x0129:
                d.u r0 = new d.u
                java.lang.String r1 = "null cannot be cast to non-null type android.support.v4.app.FragmentActivity"
                r0.<init>(r1)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.gamora.editor.C49256bh.C49282m.mo50225d():void");
        }

        C49282m(C49256bh bhVar) {
            this.f123797a = bhVar;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.bh$n */
    static final class C49283n<T> implements C0199s<C49393cv> {

        /* renamed from: a */
        final /* synthetic */ C49256bh f123798a;

        C49283n(C49256bh bhVar) {
            this.f123798a = bhVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            C49393cv cvVar = (C49393cv) obj;
            if (cvVar != null) {
                this.f123798a.mo97261a(cvVar.f123968a, cvVar.f123969b, cvVar.f123970c, 2);
                C26890h.m65011a("enter_lyricsticker_song_search", C23089d.m56640a().mo47829a("creation_id", this.f123798a.mo97244J().creationId).mo47829a("shoot_way", this.f123798a.mo97244J().mShootWay).mo47829a("previous_page", "lyrics_edit_page").f61491a);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.bh$o */
    static final class C49284o<T> implements C0199s<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C49256bh f123799a;

        C49284o(C49256bh bhVar) {
            this.f123799a = bhVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            if (bool != null) {
                if (bool.booleanValue()) {
                    this.f123799a.mo97247M().mo96968g().setValue(Boolean.valueOf(false));
                    C49067aa aaVar = this.f123799a.f123741m;
                    if (aaVar != null) {
                        C49082af afVar = this.f123799a.f123748t;
                        if (afVar == null) {
                            C52711k.m112234a();
                        }
                        aaVar.mo97098a((C43487a) afVar.f123344C, true);
                    }
                    return;
                }
                this.f123799a.mo97247M().mo96968g().setValue(Boolean.valueOf(true));
                C49067aa aaVar2 = this.f123799a.f123741m;
                if (aaVar2 != null) {
                    C49082af afVar2 = this.f123799a.f123748t;
                    if (afVar2 == null) {
                        C52711k.m112234a();
                    }
                    aaVar2.mo97098a((C43487a) afVar2.f123344C, false);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.bh$p */
    static final class C49285p extends C52712l implements C52682m<C49548a, C52860x, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C49256bh f123800a;

        C49285p(C49256bh bhVar) {
            this.f123800a = bhVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i;
            int i2;
            C52860x xVar = (C52860x) obj2;
            C52711k.m112240b((C49548a) obj, "$receiver");
            C52711k.m112240b(xVar, "it");
            C49082af afVar = this.f123800a.f123748t;
            if (afVar == null) {
                C52711k.m112234a();
            }
            if (afVar.f123344C != null) {
                C49082af afVar2 = this.f123800a.f123748t;
                if (afVar2 == null) {
                    C52711k.m112234a();
                }
                C43501am amVar = afVar2.f123344C;
                if (amVar == null) {
                    C52711k.m112234a();
                }
                StickerItemModel stickerItemModel = amVar.f110003d;
                C49082af afVar3 = this.f123800a.f123748t;
                int i3 = 0;
                if (afVar3 != null) {
                    i = afVar3.f123346E;
                } else {
                    i = 0;
                }
                stickerItemModel.mLyricInPoint = i;
                C49082af afVar4 = this.f123800a.f123748t;
                if (afVar4 != null) {
                    i2 = afVar4.f123347F;
                } else {
                    i2 = 0;
                }
                stickerItemModel.mLyricStartTime = i2;
                C49082af afVar5 = this.f123800a.f123748t;
                if (afVar5 != null) {
                    i3 = afVar5.f123348G;
                }
                stickerItemModel.mLyricOutPoint = i3;
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.bh$q */
    public static final class C49286q extends C46722b {
        C49286q() {
        }

        /* renamed from: c */
        public final boolean mo87832c(MotionEvent motionEvent) {
            return super.mo87832c(motionEvent);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.bh$r */
    static final class C49287r extends C52712l implements C52682m<C11866f, C49558e, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C49256bh f123801a;

        C49287r(C49256bh bhVar) {
            this.f123801a = bhVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            String str;
            C49558e eVar = (C49558e) obj2;
            C52711k.m112240b((C11866f) obj, "$receiver");
            if (eVar != null) {
                C49067aa aaVar = this.f123801a.f123741m;
                if (aaVar != null) {
                    C49082af afVar = this.f123801a.f123748t;
                    if (afVar == null) {
                        C52711k.m112234a();
                    }
                    aaVar.mo97095F().mo88642b(afVar.mo97109K(), ((Number) eVar.f124309b).intValue());
                }
                C49082af afVar2 = this.f123801a.f123748t;
                if (afVar2 == null) {
                    C52711k.m112234a();
                }
                if (afVar2.f123344C != null) {
                    C49082af afVar3 = this.f123801a.f123748t;
                    if (afVar3 == null) {
                        C52711k.m112234a();
                    }
                    C43501am amVar = afVar3.f123344C;
                    if (amVar == null) {
                        C52711k.m112234a();
                    }
                    amVar.f110003d.mLyricColor = ((Number) eVar.f124309b).intValue();
                }
                C42482c b = C43214dh.m94817a().mo50201b();
                String str2 = "select_lyricsticker_color";
                C23089d a = C23089d.m56640a().mo47829a("creation_id", this.f123801a.mo97244J().creationId).mo47829a("shoot_way", this.f123801a.mo97244J().mShootWay);
                String str3 = "music_id";
                if (b == null) {
                    str = "";
                } else {
                    str = b.getMusicId();
                }
                C26890h.m65011a(str2, a.mo47829a(str3, str).mo47828a("color_id", (Object) eVar).f61491a);
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.bh$s */
    static final class C49288s extends C52712l implements C52682m<C49548a, C52860x, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C49256bh f123802a;

        C49288s(C49256bh bhVar) {
            this.f123802a = bhVar;
            super(2);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x006d, code lost:
            if (r1 == null) goto L_0x006f;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Object invoke(java.lang.Object r4, java.lang.Object r5) {
            /*
                r3 = this;
                com.ss.android.ugc.gamora.jedi.a r4 = (com.p683ss.android.ugc.gamora.jedi.C49548a) r4
                d.x r5 = (p2628d.C52860x) r5
                java.lang.String r0 = "$receiver"
                p2628d.p2639f.p2641b.C52711k.m112240b(r4, r0)
                java.lang.String r4 = "it"
                p2628d.p2639f.p2641b.C52711k.m112240b(r5, r4)
                com.ss.android.ugc.aweme.shortvideo.dh r4 = com.p683ss.android.ugc.aweme.shortvideo.C43214dh.m94817a()
                com.ss.android.ugc.aweme.shortvideo.c r4 = r4.mo50201b()
                java.lang.String r5 = "select_lyricsticker_clip"
                com.ss.android.ugc.aweme.app.f.d r0 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
                java.lang.String r1 = "creation_id"
                com.ss.android.ugc.gamora.editor.bh r2 = r3.f123802a
                com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r2 = r2.mo97244J()
                java.lang.String r2 = r2.creationId
                com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47829a(r1, r2)
                java.lang.String r1 = "shoot_way"
                com.ss.android.ugc.gamora.editor.bh r2 = r3.f123802a
                com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r2 = r2.mo97244J()
                java.lang.String r2 = r2.mShootWay
                com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47829a(r1, r2)
                java.lang.String r1 = "music_id"
                if (r4 != 0) goto L_0x003f
                java.lang.String r4 = ""
                goto L_0x0043
            L_0x003f:
                java.lang.String r4 = r4.getMusicId()
            L_0x0043:
                com.ss.android.ugc.aweme.app.f.d r4 = r0.mo47829a(r1, r4)
                java.lang.String r0 = "dynamics"
                com.ss.android.ugc.gamora.editor.bh r1 = r3.f123802a
                com.ss.android.ugc.gamora.editor.EditLyricStickerViewModel r1 = r1.mo97245K()
                com.ss.android.ugc.gamora.editor.bh r2 = r3.f123802a
                android.app.Activity r2 = r2.f33840g_
                if (r2 == 0) goto L_0x007d
                android.support.v4.app.FragmentActivity r2 = (android.support.p030v4.app.FragmentActivity) r2
                android.arch.lifecycle.k r2 = (android.arch.lifecycle.C0184k) r2
                com.bytedance.jedi.arch.s r1 = r1.mo97464a(r2)
                com.ss.android.ugc.gamora.editor.EditLyricStickerState r1 = (com.p683ss.android.ugc.gamora.editor.EditLyricStickerState) r1
                com.ss.android.ugc.gamora.editor.cw r1 = r1.getCurLyricEffect()
                if (r1 == 0) goto L_0x006f
                com.ss.android.ugc.effectmanager.effect.model.Effect r1 = r1.f123971a
                if (r1 == 0) goto L_0x006f
                java.lang.String r1 = r1.getName()
                if (r1 != 0) goto L_0x0071
            L_0x006f:
                java.lang.String r1 = "经典"
            L_0x0071:
                com.ss.android.ugc.aweme.app.f.d r4 = r4.mo47829a(r0, r1)
                java.util.Map<java.lang.String, java.lang.String> r4 = r4.f61491a
                com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r5, r4)
                d.x r4 = p2628d.C52860x.f131107a
                return r4
            L_0x007d:
                d.u r4 = new d.u
                java.lang.String r5 = "null cannot be cast to non-null type android.support.v4.app.FragmentActivity"
                r4.<init>(r5)
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.gamora.editor.C49256bh.C49288s.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.bh$t */
    static final class C49289t extends C52712l implements C52682m<C11866f, C49394cw, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C49256bh f123803a;

        C49289t(C49256bh bhVar) {
            this.f123803a = bhVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            Effect effect;
            int i;
            int i2;
            int i3;
            int i4;
            String str;
            C49394cw cwVar = (C49394cw) obj2;
            C52711k.m112240b((C11866f) obj, "$receiver");
            if (cwVar != null) {
                C49256bh bhVar = this.f123803a;
                C42482c b = C43214dh.m94817a().mo50201b();
                if (b == null) {
                    C52711k.m112234a();
                }
                C52711k.m112236a((Object) b, "PublishManager.inst().getCurMusic()!!");
                EditLyricStickerViewModel K = this.f123803a.mo97245K();
                Activity activity = this.f123803a.f33840g_;
                if (activity != null) {
                    C49394cw curLyricEffect = ((EditLyricStickerState) K.mo97464a((FragmentActivity) activity)).getCurLyricEffect();
                    if (curLyricEffect != null) {
                        effect = curLyricEffect.f123971a;
                    } else {
                        effect = null;
                    }
                    bhVar.mo97260a(b, effect, (String) null, false);
                    VEVideoPublishEditViewModel vEVideoPublishEditViewModel = this.f123803a.f123722E;
                    if (vEVideoPublishEditViewModel == null) {
                        C52711k.m112237a("publishEditViewModel");
                    }
                    C0198r u = vEVideoPublishEditViewModel.mo110476u();
                    C52711k.m112236a((Object) u, "publishEditViewModel.lyricAudioTimeLiveData");
                    C49082af afVar = this.f123803a.f123748t;
                    if (afVar != null) {
                        i = afVar.mo97109K();
                    } else {
                        i = -1;
                    }
                    C49082af afVar2 = this.f123803a.f123748t;
                    if (afVar2 != null) {
                        i2 = afVar2.f123346E;
                    } else {
                        i2 = 0;
                    }
                    C49082af afVar3 = this.f123803a.f123748t;
                    if (afVar3 != null) {
                        i3 = afVar3.f123347F;
                    } else {
                        i3 = 0;
                    }
                    C49082af afVar4 = this.f123803a.f123748t;
                    if (afVar4 != null) {
                        i4 = afVar4.f123348G;
                    } else {
                        i4 = 0;
                    }
                    C43954a aVar = new C43954a(i, i2, i3, i4, C39629l.m88232a().mo58583n().mo83103a(C40790a.RearMusicAutoLoop));
                    u.setValue(aVar);
                    C42482c b2 = C43214dh.m94817a().mo50201b();
                    String str2 = "select_lyricsticker_dynamics";
                    C23089d a = C23089d.m56640a().mo47829a("creation_id", this.f123803a.mo97244J().creationId).mo47829a("shoot_way", this.f123803a.mo97244J().mShootWay);
                    String str3 = "music_id";
                    if (b2 == null) {
                        str = "";
                    } else {
                        str = b2.getMusicId();
                    }
                    C23089d a2 = a.mo47829a(str3, str);
                    String str4 = "dynamics";
                    String name = cwVar.f123971a.getName();
                    if (name == null) {
                        name = "";
                    }
                    C26890h.m65011a(str2, a2.mo47829a(str4, name).f61491a);
                } else {
                    throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
                }
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.bh$u */
    static final class C49290u extends C52712l implements C52682m<C49548a, C52860x, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C49256bh f123804a;

        C49290u(C49256bh bhVar) {
            this.f123804a = bhVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            C52860x xVar = (C52860x) obj2;
            C52711k.m112240b((C49548a) obj, "$receiver");
            C52711k.m112240b(xVar, "it");
            C49067aa aaVar = this.f123804a.f123741m;
            if (aaVar != null) {
                C49082af afVar = this.f123804a.f123748t;
                if (afVar == null) {
                    C52711k.m112234a();
                }
                aaVar.mo97106d(afVar.mo97109K());
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.bh$v */
    static final class C49291v<T> implements C0199s<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C49256bh f123805a;

        C49291v(C49256bh bhVar) {
            this.f123805a = bhVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            if (bool != null) {
                C49256bh bhVar = this.f123805a;
                C52711k.m112236a((Object) bool, "it");
                boolean booleanValue = bool.booleanValue();
                C49307bs bsVar = bhVar.f123742n;
                if (bsVar != null && !bsVar.mo97264F().f117797r) {
                    bsVar.mo97276b(booleanValue);
                }
                C49067aa aaVar = bhVar.f123741m;
                if (aaVar != null && !aaVar.mo97095F().mo88662k()) {
                    aaVar.mo97105b(booleanValue);
                }
                C49131aq aqVar = bhVar.f123743o;
                if (aqVar != null) {
                    aqVar.mo97152a(booleanValue);
                }
                C49378co coVar = bhVar.f123745q;
                if (coVar != null) {
                    coVar.mo97312a(booleanValue);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.bh$w */
    static final class C49292w extends C52712l implements C52682m<C49548a, C52855s<? extends Float, ? extends Float, ? extends Float>, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C49256bh f123806a;

        C49292w(C49256bh bhVar) {
            this.f123806a = bhVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            C52855s sVar = (C52855s) obj2;
            C52711k.m112240b((C49548a) obj, "$receiver");
            C52711k.m112240b(sVar, "it");
            C49142as.m106090a(this.f123806a.mo97249O(), ((Number) sVar.getFirst()).floatValue(), ((Number) sVar.getSecond()).floatValue(), ((Number) sVar.getThird()).floatValue());
            C49142as.m106090a(this.f123806a.mo97248N(), ((Number) sVar.getFirst()).floatValue(), ((Number) sVar.getSecond()).floatValue(), ((Number) sVar.getThird()).floatValue());
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.bh$x */
    static final class C49293x extends C52712l implements C52682m<C49548a, C52855s<? extends Float, ? extends Float, ? extends Float>, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C49256bh f123807a;

        C49293x(C49256bh bhVar) {
            this.f123807a = bhVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            C52855s sVar = (C52855s) obj2;
            C52711k.m112240b((C49548a) obj, "$receiver");
            C52711k.m112240b(sVar, "it");
            FrameLayout frameLayout = this.f123807a.f123726I;
            if (frameLayout == null) {
                C52711k.m112237a("commentLayout");
            }
            C49142as.m106090a(frameLayout, ((Number) sVar.getFirst()).floatValue(), ((Number) sVar.getSecond()).floatValue(), ((Number) sVar.getThird()).floatValue());
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.bh$y */
    static final class C49294y<T> implements C0199s<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C49256bh f123808a;

        C49294y(C49256bh bhVar) {
            this.f123808a = bhVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            if (bool != null) {
                C49256bh bhVar = this.f123808a;
                C52711k.m112236a((Object) bool, "it");
                boolean booleanValue = bool.booleanValue();
                C49307bs bsVar = bhVar.f123742n;
                if (bsVar != null && !bsVar.mo97264F().f117798s) {
                    bsVar.mo97276b(booleanValue);
                }
                C49067aa aaVar = bhVar.f123741m;
                if (aaVar != null && !aaVar.mo97095F().mo88663l()) {
                    aaVar.mo97105b(booleanValue);
                }
                C49131aq aqVar = bhVar.f123743o;
                if (aqVar != null) {
                    aqVar.mo97152a(booleanValue);
                }
                C49378co coVar = bhVar.f123745q;
                if (coVar != null) {
                    coVar.mo97312a(booleanValue);
                }
                C49388cr crVar = bhVar.f123746r;
                if (crVar != null) {
                    crVar.mo97331a(booleanValue);
                }
                C49511h hVar = bhVar.f123744p;
                if (hVar != null) {
                    hVar.mo97413a(booleanValue);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.bh$z */
    static final class C49295z<T> implements C0199s<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C49256bh f123809a;

        C49295z(C49256bh bhVar) {
            this.f123809a = bhVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            if (bool != null) {
                C49256bh bhVar = this.f123809a;
                C52711k.m112236a((Object) bool, "it");
                boolean booleanValue = bool.booleanValue();
                C49131aq aqVar = bhVar.f123743o;
                if (aqVar != null) {
                    aqVar.mo97152a(booleanValue);
                }
                C49378co coVar = bhVar.f123745q;
                if (coVar != null) {
                    coVar.mo97312a(booleanValue);
                }
                C49388cr crVar = bhVar.f123746r;
                if (crVar != null) {
                    crVar.mo97331a(booleanValue);
                }
                C49511h hVar = bhVar.f123744p;
                if (hVar != null) {
                    hVar.mo97413a(booleanValue);
                }
                C49307bs bsVar = bhVar.f123742n;
                if (bsVar != null) {
                    bsVar.mo97276b(booleanValue);
                }
                C49067aa aaVar = bhVar.f123741m;
                if (aaVar != null) {
                    aaVar.mo97105b(booleanValue);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo97262a(boolean z) {
        C49388cr crVar = this.f123746r;
        if (crVar != null) {
            crVar.mo97333b(z);
        }
        C49511h hVar = this.f123744p;
        if (hVar != null) {
            hVar.mo97416b(z);
        }
    }

    /* renamed from: a */
    public final void mo74013a(Effect effect, String str) {
        C52711k.m112240b(effect, "effect");
        mo97251Q();
        mo97252R();
        if (this.f123741m != null) {
            C49067aa aaVar = this.f123741m;
            if (aaVar == null) {
                C52711k.m112234a();
            }
            C49378co coVar = this.f123745q;
            boolean z = coVar != null && coVar.mo97306J();
            C49131aq aqVar = this.f123743o;
            if (aaVar.mo97103a(z, aqVar != null && aqVar.mo97146K())) {
                return;
            }
        }
        EditViewModel editViewModel = this.f123749u;
        if (editViewModel == null) {
            C52711k.m112237a("editViewModel");
        }
        C35579at g = editViewModel.mo97037g();
        Activity activity = this.f33840g_;
        if (activity != null) {
            g.mo73976a((FragmentActivity) activity, effect);
            this.f123736T = false;
            if (C35556ac.m80350d(effect)) {
                Activity activity2 = this.f33840g_;
                if (!(activity2 instanceof FragmentActivity)) {
                    activity2 = null;
                }
                FragmentActivity fragmentActivity = (FragmentActivity) activity2;
                if (fragmentActivity != null) {
                    C49511h hVar = this.f123744p;
                    if (hVar != null) {
                        String unzipPath = effect.getUnzipPath();
                        C52711k.m112236a((Object) unzipPath, "effect.unzipPath");
                        hVar.mo97412a(unzipPath);
                    }
                    C49511h hVar2 = this.f123744p;
                    if (hVar2 != null) {
                        String effectId = effect.getEffectId();
                        C52711k.m112236a((Object) effectId, "effect.effectId");
                        hVar2.mo97415b(effectId);
                    }
                    C49511h hVar3 = this.f123744p;
                    if (hVar3 != null) {
                        C0654k supportFragmentManager = fragmentActivity.getSupportFragmentManager();
                        C52711k.m112236a((Object) supportFragmentManager, "supportFragmentManager");
                        hVar3.mo97405a(supportFragmentManager);
                    }
                }
                return;
            } else if (C35556ac.m80347a(effect)) {
                C49131aq aqVar2 = this.f123743o;
                if (aqVar2 != null) {
                    aqVar2.mo97149a(effect);
                } else {
                    return;
                }
            } else if (C35556ac.m80348b(effect)) {
                EditViewModel editViewModel2 = this.f123749u;
                if (editViewModel2 == null) {
                    C52711k.m112237a("editViewModel");
                }
                editViewModel2.mo97032a(false);
                C49378co coVar2 = this.f123745q;
                if (coVar2 != null) {
                    coVar2.mo97307K();
                }
                C49378co coVar3 = this.f123745q;
                if (coVar3 != null) {
                    coVar3.mo97311a(effect.getEffectId());
                }
                VideoPublishEditModel videoPublishEditModel = this.f123751w;
                if (videoPublishEditModel == null) {
                    C52711k.m112237a("publishEditModel");
                }
                if (videoPublishEditModel.infoStickerCategoryParams.getInfoStickerCategoryMap().containsKey(effect.getEffectId())) {
                    C49378co coVar4 = this.f123745q;
                    if (coVar4 != null) {
                        VideoPublishEditModel videoPublishEditModel2 = this.f123751w;
                        if (videoPublishEditModel2 == null) {
                            C52711k.m112237a("publishEditModel");
                        }
                        coVar4.mo97313b((String) videoPublishEditModel2.infoStickerCategoryParams.getInfoStickerCategoryMap().get(effect.getEffectId()));
                    }
                }
                m106300Y();
                return;
            } else if (C35556ac.m80349c(effect)) {
                VideoPublishEditModel videoPublishEditModel3 = this.f123751w;
                if (videoPublishEditModel3 == null) {
                    C52711k.m112237a("publishEditModel");
                }
                if (videoPublishEditModel3.isTimeEffectApply()) {
                    C50275d.m108541c(this.f33840g_, R.string.gb7).mo98174a();
                    return;
                }
                C49082af afVar = this.f123748t;
                if (afVar != null) {
                    afVar.mo89540a(effect, str);
                }
                this.f123736T = true;
                C53301g.m113291a(C53200af.m113027a(C20346b.m50242a().plus(this.f123737U).plus(new C49265ah(CoroutineExceptionHandler.f131765b))), null, null, new C49266ai(this, effect, str, null), 3, null);
                return;
            } else {
                C49067aa aaVar2 = this.f123741m;
                if (aaVar2 != null) {
                    aaVar2.mo97102a(effect.getEffectId(), effect.getUnzipPath(), str, effect.getEffectType());
                    return;
                }
            }
            return;
        }
        throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00c7  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo97261a(com.p683ss.android.ugc.effectmanager.effect.model.Effect r19, java.lang.String r20, boolean r21, int r22) {
        /*
            r18 = this;
            r0 = r18
            r1 = r22
            com.ss.android.ugc.gamora.editor.EditViewModel r2 = r0.f123749u
            if (r2 != 0) goto L_0x000d
            java.lang.String r3 = "editViewModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r3)
        L_0x000d:
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 4
            r7 = 0
            r2.mo97033a(r3, r4, r3)
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r2 = r0.f123751w
            if (r2 != 0) goto L_0x001e
            java.lang.String r3 = "publishEditModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r3)
        L_0x001e:
            java.lang.String r2 = r2.mStickerID
            r3 = 0
            r4 = 0
            if (r2 == 0) goto L_0x0040
            r5 = r2
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            r2 = 1
            java.lang.String[] r6 = new java.lang.String[r2]
            java.lang.String r2 = ","
            r6[r4] = r2
            r7 = 0
            r8 = 0
            r9 = 6
            r10 = 0
            java.util.List r2 = p2628d.p2650m.C52830p.m112452b(r5, r6, r7, r8, r9, r10)
            if (r2 == 0) goto L_0x0040
            java.lang.Object r2 = p2628d.p2629a.C52575l.m112118a(r2, r4)
            java.lang.String r2 = (java.lang.String) r2
            r9 = r2
            goto L_0x0041
        L_0x0040:
            r9 = r3
        L_0x0041:
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r2 = r0.f123751w
            if (r2 != 0) goto L_0x004a
            java.lang.String r5 = "publishEditModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r5)
        L_0x004a:
            java.util.List r2 = r2.challenges
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = com.bytedance.common.utility.p522b.C9376b.m18558a(r2)
            if (r2 != 0) goto L_0x0067
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r2 = r0.f123751w
            if (r2 != 0) goto L_0x005d
            java.lang.String r3 = "publishEditModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r3)
        L_0x005d:
            java.util.List r2 = r2.challenges
            java.lang.Object r2 = r2.get(r4)
            com.ss.android.ugc.aweme.shortvideo.AVChallenge r2 = (com.p683ss.android.ugc.aweme.shortvideo.AVChallenge) r2
            java.lang.String r3 = r2.cid
        L_0x0067:
            r10 = r3
            dmt.av.video.ac r5 = r0.f123727J
            if (r5 != 0) goto L_0x0071
            java.lang.String r2 = "mEnvironment"
            p2628d.p2639f.p2641b.C52711k.m112237a(r2)
        L_0x0071:
            android.app.Activity r2 = r0.f33840g_
            if (r2 == 0) goto L_0x00c7
            android.support.v4.app.FragmentActivity r2 = (android.support.p030v4.app.FragmentActivity) r2
            r6 = r2
            android.app.Activity r6 = (android.app.Activity) r6
            r7 = 110(0x6e, float:1.54E-43)
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r2 = r0.f123751w
            if (r2 != 0) goto L_0x0085
            java.lang.String r3 = "publishEditModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r3)
        L_0x0085:
            java.lang.String r8 = r2.mFirstStickerMusicIdsJson
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r2 = r0.f123751w
            if (r2 != 0) goto L_0x0090
            java.lang.String r3 = "publishEditModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r3)
        L_0x0090:
            boolean r11 = r2.isAllowClearMusic()
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r2 = r0.f123751w
            if (r2 != 0) goto L_0x009d
            java.lang.String r3 = "publishEditModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r3)
        L_0x009d:
            java.lang.String r12 = r2.mShootWay
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r2 = r0.f123751w
            if (r2 != 0) goto L_0x00a8
            java.lang.String r3 = "publishEditModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r3)
        L_0x00a8:
            java.lang.String r13 = r2.creationId
            r14 = 1
            com.ss.android.ugc.gamora.editor.bh$aj r2 = new com.ss.android.ugc.gamora.editor.bh$aj
            r3 = r19
            r4 = r20
            r2.<init>(r0, r3, r4, r1)
            r16 = r2
            d.f.a.b r16 = (p2628d.p2639f.p2640a.C52671b) r16
            com.ss.android.ugc.gamora.editor.bh$ak r2 = new com.ss.android.ugc.gamora.editor.bh$ak
            r2.<init>(r0, r1)
            r17 = r2
            d.f.a.a r17 = (p2628d.p2639f.p2640a.C52670a) r17
            r15 = r21
            r5.mo88374a(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            return
        L_0x00c7:
            d.u r1 = new d.u
            java.lang.String r2 = "null cannot be cast to non-null type android.support.v4.app.FragmentActivity"
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.gamora.editor.C49256bh.mo97261a(com.ss.android.ugc.effectmanager.effect.model.Effect, java.lang.String, boolean, int):void");
    }

    /* renamed from: a */
    public final void mo97260a(C42482c cVar, Effect effect, String str, boolean z) {
        C52711k.m112240b(cVar, "music");
        new C43507as().mo88526b(!z);
        this.f123733P = System.currentTimeMillis();
        if (TextUtils.isEmpty(cVar.getLrcUrl())) {
            C10691a.m21542b((Context) this.f33840g_, (int) R.string.g0g).mo19066a();
            C23569o.m57776a("aweme_type_download_lyric_rate", 1, C42437ay.m93202a().mo86520a("duration", Long.valueOf(System.currentTimeMillis() - this.f123733P)).mo86520a("music_id", Long.valueOf(cVar.f107429id)).mo86521a("lrc_url", "").mo86522b());
            return;
        }
        C39529ab b = C39630m.m88234a().mo58604b();
        String lrcUrl = cVar.getLrcUrl();
        C52711k.m112236a((Object) lrcUrl, "music.lrcUrl");
        b.mo80575a(lrcUrl, cVar.getLrcType(), (C39539j) new C49273d(this, cVar, effect, str));
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:0x01ad  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x01b1  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x01d7  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x015b  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x016b  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x017b  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x018f  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0195  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x019b  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x019f  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x01a4  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x01a8  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo97259a(com.p683ss.android.ugc.aweme.shortvideo.C42482c r11, com.p683ss.android.ugc.effectmanager.effect.model.Effect r12, java.lang.String r13, org.json.JSONArray r14) {
        /*
            r10 = this;
            r0 = 0
            if (r12 != 0) goto L_0x0028
            com.ss.android.ugc.gamora.editor.af r1 = r10.f123748t
            if (r1 == 0) goto L_0x000c
            com.ss.android.ugc.effectmanager.effect.model.Effect r1 = r1.mo89536H()
            goto L_0x000d
        L_0x000c:
            r1 = r0
        L_0x000d:
            if (r1 != 0) goto L_0x0028
            com.ss.android.ugc.aweme.shortvideo.lyric.LyricEffectViewModel r12 = r10.f123719B
            if (r12 != 0) goto L_0x0018
            java.lang.String r0 = "lyricEffectViewModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r0)
        L_0x0018:
            android.arch.lifecycle.r<d.x> r12 = r12.f111303d
            r0 = r10
            android.arch.lifecycle.k r0 = (android.arch.lifecycle.C0184k) r0
            com.ss.android.ugc.gamora.editor.bh$e r1 = new com.ss.android.ugc.gamora.editor.bh$e
            r1.<init>(r10, r11, r13, r14)
            android.arch.lifecycle.s r1 = (android.arch.lifecycle.C0199s) r1
            r12.observe(r0, r1)
            return
        L_0x0028:
            if (r12 != 0) goto L_0x004f
            com.ss.android.ugc.gamora.editor.af r1 = r10.f123748t
            if (r1 == 0) goto L_0x0033
            com.ss.android.ugc.effectmanager.effect.model.Effect r1 = r1.mo89536H()
            goto L_0x0034
        L_0x0033:
            r1 = r0
        L_0x0034:
            if (r1 != 0) goto L_0x004f
            com.ss.android.ugc.aweme.shortvideo.lyric.LyricEffectViewModel r12 = r10.f123719B
            if (r12 != 0) goto L_0x003f
            java.lang.String r0 = "lyricEffectViewModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r0)
        L_0x003f:
            android.arch.lifecycle.r<d.x> r12 = r12.f111302c
            r0 = r10
            android.arch.lifecycle.k r0 = (android.arch.lifecycle.C0184k) r0
            com.ss.android.ugc.gamora.editor.bh$f r1 = new com.ss.android.ugc.gamora.editor.bh$f
            r1.<init>(r10, r11, r13, r14)
            android.arch.lifecycle.s r1 = (android.arch.lifecycle.C0199s) r1
            r12.observe(r0, r1)
            return
        L_0x004f:
            if (r12 != 0) goto L_0x005c
            com.ss.android.ugc.gamora.editor.af r1 = r10.f123748t
            if (r1 == 0) goto L_0x005a
            com.ss.android.ugc.effectmanager.effect.model.Effect r1 = r1.mo89536H()
            goto L_0x005d
        L_0x005a:
            r1 = r0
            goto L_0x005d
        L_0x005c:
            r1 = r12
        L_0x005d:
            com.ss.android.ugc.gamora.editor.af r2 = r10.f123748t
            if (r2 == 0) goto L_0x0064
            r2.mo89540a(r1, r13)
        L_0x0064:
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            java.lang.String r3 = "title"
            java.lang.String r4 = r11.musicName
            org.json.JSONObject r2 = r2.put(r3, r4)
            java.lang.String r3 = "artist"
            java.lang.String r11 = r11.getSinger()
            org.json.JSONObject r11 = r2.put(r3, r11)
            java.lang.String r2 = "musicBy"
            java.lang.String r3 = ""
            org.json.JSONObject r11 = r11.put(r2, r3)
            java.lang.String r2 = "writtenBy"
            java.lang.String r3 = ""
            org.json.JSONObject r11 = r11.put(r2, r3)
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            java.lang.String r3 = "header"
            org.json.JSONObject r11 = r2.put(r3, r11)
            java.lang.String r2 = "content"
            org.json.JSONObject r11 = r11.put(r2, r14)
            if (r1 != 0) goto L_0x00be
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r13 = r10.f123751w
            if (r13 != 0) goto L_0x00a7
            java.lang.String r14 = "publishEditModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r14)
        L_0x00a7:
            com.ss.android.ugc.aweme.infosticker.InfoStickerModel r13 = r13.infoStickerModel
            java.lang.String r14 = "publishEditModel.infoStickerModel"
            p2628d.p2639f.p2641b.C52711k.m112236a(r13, r14)
            com.ss.android.ugc.aweme.infosticker.StickerItemModel r13 = r13.getLyricStickerModel()
            java.lang.String r14 = r13.mLyricFontPath
            java.lang.String r1 = r13.stickerId
            java.lang.String r2 = r13.path
            java.lang.String r13 = r13.extra
            r7 = r13
            r4 = r1
            r5 = r2
            goto L_0x00d9
        L_0x00be:
            com.ss.android.ugc.gamora.editor.af r14 = r10.f123748t
            if (r14 == 0) goto L_0x00cd
            com.ss.android.ugc.effectmanager.effect.model.Effect r14 = r14.mo89537a(r1)
            if (r14 == 0) goto L_0x00cd
            java.lang.String r14 = r14.getUnzipPath()
            goto L_0x00ce
        L_0x00cd:
            r14 = r0
        L_0x00ce:
            java.lang.String r2 = r1.getEffectId()
            java.lang.String r1 = r1.getUnzipPath()
            r7 = r13
            r5 = r1
            r4 = r2
        L_0x00d9:
            boolean r13 = r10.mo97256V()
            if (r13 == 0) goto L_0x00f1
            com.ss.android.ugc.gamora.editor.aa r13 = r10.f123741m
            if (r13 == 0) goto L_0x00f1
            com.ss.android.ugc.gamora.editor.af r1 = r10.f123748t
            if (r1 != 0) goto L_0x00ea
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x00ea:
            int r1 = r1.mo97109K()
            r13.mo97106d(r1)
        L_0x00f1:
            com.ss.android.ugc.gamora.editor.af r13 = r10.f123748t
            if (r13 == 0) goto L_0x0119
            com.ss.android.ugc.gamora.editor.aa r1 = r10.f123741m
            if (r1 != 0) goto L_0x00fc
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x00fc:
            com.ss.android.ugc.gamora.editor.af r2 = r10.f123748t
            if (r2 != 0) goto L_0x0103
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0103:
            int r8 = r2.f123347F
            java.lang.String r9 = r11.toString()
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.i r3 = r1.mo97095F()
            r6 = r14
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.am r1 = r3.mo88618a(r4, r5, r6, r7, r8, r9)
            java.lang.String r2 = "stickerHelper.addLyricSt…, audioStartTime, lyrics)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
            r13.f123344C = r1
        L_0x0119:
            com.ss.android.ugc.gamora.editor.af r13 = r10.f123748t
            if (r13 == 0) goto L_0x011f
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.am r0 = r13.f123344C
        L_0x011f:
            if (r0 != 0) goto L_0x0124
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0124:
            com.ss.android.ugc.aweme.infosticker.StickerItemModel r13 = r0.f110003d
            com.ss.android.ugc.gamora.editor.af r0 = r10.f123748t
            if (r0 == 0) goto L_0x012f
            java.lang.String r1 = r13.stickerId
            r0.mo89541a(r1)
        L_0x012f:
            r0 = -1
            if (r12 == 0) goto L_0x0156
            java.lang.String r12 = r12.getExtra()
            if (r12 == 0) goto L_0x0156
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ Exception -> 0x0148 }
            r1.<init>(r12)     // Catch:{ Exception -> 0x0148 }
            java.lang.String r12 = "LyricsStyleDefaultColor"
            java.lang.String r12 = r1.getString(r12)     // Catch:{ Exception -> 0x0148 }
            int r12 = android.graphics.Color.parseColor(r12)     // Catch:{ Exception -> 0x0148 }
            goto L_0x0157
        L_0x0148:
            r12 = move-exception
            java.lang.String r1 = "dd1997"
            java.lang.String r12 = r12.toString()
            int r12 = android.util.Log.e(r1, r12)
            java.lang.Integer.valueOf(r12)
        L_0x0156:
            r12 = -1
        L_0x0157:
            com.ss.android.ugc.gamora.editor.EditLyricStickerViewModel r1 = r10.f123718A
            if (r1 != 0) goto L_0x0160
            java.lang.String r2 = "editLyricStickerViewModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r2)
        L_0x0160:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r12)
            r1.mo96877b(r2)
            com.ss.android.ugc.gamora.editor.EditLyricStickerViewModel r1 = r10.f123718A
            if (r1 != 0) goto L_0x0170
            java.lang.String r2 = "editLyricStickerViewModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r2)
        L_0x0170:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r12)
            r1.mo96876a(r2)
            dmt.av.video.VEVideoPublishEditViewModel r1 = r10.f123722E
            if (r1 != 0) goto L_0x0180
            java.lang.String r2 = "publishEditViewModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r2)
        L_0x0180:
            android.arch.lifecycle.r r1 = r1.mo110476u()
            java.lang.String r2 = "publishEditViewModel.lyricAudioTimeLiveData"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
            com.ss.android.ugc.aweme.shortvideo.lyric.a r2 = new com.ss.android.ugc.aweme.shortvideo.lyric.a
            com.ss.android.ugc.gamora.editor.af r3 = r10.f123748t
            if (r3 == 0) goto L_0x0195
            int r0 = r3.mo97109K()
            r4 = r0
            goto L_0x0196
        L_0x0195:
            r4 = -1
        L_0x0196:
            com.ss.android.ugc.gamora.editor.af r0 = r10.f123748t
            r3 = 0
            if (r0 == 0) goto L_0x019f
            int r0 = r0.f123346E
            r5 = r0
            goto L_0x01a0
        L_0x019f:
            r5 = 0
        L_0x01a0:
            com.ss.android.ugc.gamora.editor.af r0 = r10.f123748t
            if (r0 == 0) goto L_0x01a8
            int r0 = r0.f123347F
            r6 = r0
            goto L_0x01a9
        L_0x01a8:
            r6 = 0
        L_0x01a9:
            com.ss.android.ugc.gamora.editor.af r0 = r10.f123748t
            if (r0 == 0) goto L_0x01b1
            int r0 = r0.f123348G
            r7 = r0
            goto L_0x01b2
        L_0x01b1:
            r7 = 0
        L_0x01b2:
            com.ss.android.ugc.aweme.port.in.u r0 = com.p683ss.android.ugc.aweme.port.p2082in.C39629l.m88232a()
            com.ss.android.ugc.aweme.property.h r0 = r0.mo58583n()
            com.ss.android.ugc.aweme.property.h$a r3 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.RearMusicAutoLoop
            com.ss.android.ugc.aweme.property.aa$a r3 = (com.p683ss.android.ugc.aweme.property.C40761aa.C40762a) r3
            boolean r8 = r0.mo83103a(r3)
            r3 = r2
            r3.<init>(r4, r5, r6, r7, r8)
            r1.setValue(r2)
            r13.mLyricColor = r12
            java.lang.String r11 = r11.toString()
            r13.mLyricInfo = r11
            r13.mLyricFontPath = r14
            com.ss.android.ugc.gamora.editor.EditLyricStickerViewModel r11 = r10.f123718A
            if (r11 != 0) goto L_0x01dc
            java.lang.String r12 = "editLyricStickerViewModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r12)
        L_0x01dc:
            r11.mo96881h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.gamora.editor.C49256bh.mo97259a(com.ss.android.ugc.aweme.shortvideo.c, com.ss.android.ugc.effectmanager.effect.model.Effect, java.lang.String, org.json.JSONArray):void");
    }

    /* renamed from: c */
    public final C11910j mo86790c() {
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

    /* renamed from: I */
    public final EditViewModel mo97243I() {
        EditViewModel editViewModel = this.f123749u;
        if (editViewModel == null) {
            C52711k.m112237a("editViewModel");
        }
        return editViewModel;
    }

    /* renamed from: J */
    public final VideoPublishEditModel mo97244J() {
        VideoPublishEditModel videoPublishEditModel = this.f123751w;
        if (videoPublishEditModel == null) {
            C52711k.m112237a("publishEditModel");
        }
        return videoPublishEditModel;
    }

    /* renamed from: K */
    public final EditLyricStickerViewModel mo97245K() {
        EditLyricStickerViewModel editLyricStickerViewModel = this.f123718A;
        if (editLyricStickerViewModel == null) {
            C52711k.m112237a("editLyricStickerViewModel");
        }
        return editLyricStickerViewModel;
    }

    /* renamed from: L */
    public final LyricEffectViewModel mo97246L() {
        LyricEffectViewModel lyricEffectViewModel = this.f123719B;
        if (lyricEffectViewModel == null) {
            C52711k.m112237a("lyricEffectViewModel");
        }
        return lyricEffectViewModel;
    }

    /* renamed from: M */
    public final EditStickerViewModel mo97247M() {
        EditStickerViewModel editStickerViewModel = this.f123721D;
        if (editStickerViewModel == null) {
            C52711k.m112237a("stickerViewModel");
        }
        return editStickerViewModel;
    }

    /* renamed from: N */
    public final FrameLayout mo97248N() {
        FrameLayout frameLayout = this.f123724G;
        if (frameLayout == null) {
            C52711k.m112237a("textPoiLayout");
        }
        return frameLayout;
    }

    /* renamed from: O */
    public final FrameLayout mo97249O() {
        FrameLayout frameLayout = this.f123725H;
        if (frameLayout == null) {
            C52711k.m112237a("voteLayout");
        }
        return frameLayout;
    }

    /* renamed from: p */
    public final void mo24469p() {
        super.mo24469p();
        this.f123737U.mo110868m();
    }

    /* renamed from: T */
    public final void mo97254T() {
        C49131aq aqVar = this.f123743o;
        if (aqVar != null) {
            aqVar.mo97145J();
        }
        C49378co coVar = this.f123745q;
        if (coVar != null) {
            coVar.mo97305I();
        }
        C49388cr crVar = this.f123746r;
        if (crVar != null) {
            crVar.mo97318K();
        }
        C49511h hVar = this.f123744p;
        if (hVar != null) {
            hVar.mo97401M();
        }
    }

    /* renamed from: U */
    public final void mo97255U() {
        this.f123738V.removeCallbacksAndMessages(null);
        this.f123738V.postDelayed(new C49272c(this), 100);
    }

    /* renamed from: z */
    public final void mo24481z() {
        super.mo24481z();
        mo97250P();
        C49307bs bsVar = this.f123742n;
        if (bsVar != null) {
            bsVar.mo97265G();
        }
        this.f123732O = false;
    }

    /* renamed from: V */
    public final boolean mo97256V() {
        VideoPublishEditModel videoPublishEditModel = this.f123751w;
        if (videoPublishEditModel == null) {
            C52711k.m112237a("publishEditModel");
        }
        if (videoPublishEditModel.hasInfoStickers()) {
            VideoPublishEditModel videoPublishEditModel2 = this.f123751w;
            if (videoPublishEditModel2 == null) {
                C52711k.m112237a("publishEditModel");
            }
            if (videoPublishEditModel2.infoStickerModel.hasLyricSticker()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: W */
    public final boolean mo97257W() {
        C49131aq aqVar = this.f123743o;
        if (aqVar == null || !aqVar.mo97146K()) {
            C49307bs bsVar = this.f123742n;
            if (bsVar == null || !bsVar.mo97268J()) {
                C49378co coVar = this.f123745q;
                if (coVar == null || !coVar.mo97306J()) {
                    C49388cr crVar = this.f123746r;
                    if (crVar == null || !crVar.mo97319L()) {
                        C49511h hVar = this.f123744p;
                        if (hVar == null || !hVar.mo97397I()) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    public final void cq_() {
        C49378co coVar = this.f123745q;
        if (coVar != null && !coVar.mo97309M() && !this.f123734Q) {
            EditViewModel editViewModel = this.f123749u;
            if (editViewModel == null) {
                C52711k.m112237a("editViewModel");
            }
            editViewModel.mo97033a(true, false, true);
        }
    }

    /* renamed from: Y */
    private final void m106300Y() {
        String str;
        if (this.f123745q != null) {
            String str2 = "poll_edit";
            C23089d a = C23089d.m56640a();
            String str3 = "creation_id";
            VideoPublishEditModel videoPublishEditModel = this.f123751w;
            if (videoPublishEditModel == null) {
                C52711k.m112237a("publishEditModel");
            }
            C23089d a2 = a.mo47829a(str3, videoPublishEditModel.creationId);
            String str4 = "shoot_way";
            VideoPublishEditModel videoPublishEditModel2 = this.f123751w;
            if (videoPublishEditModel2 == null) {
                C52711k.m112237a("publishEditModel");
            }
            C23089d a3 = a2.mo47829a(str4, videoPublishEditModel2.mShootWay);
            String str5 = "content_type";
            VideoPublishEditModel videoPublishEditModel3 = this.f123751w;
            if (videoPublishEditModel3 == null) {
                C52711k.m112237a("publishEditModel");
            }
            C23089d a4 = a3.mo47829a(str5, C43434az.m95202a(videoPublishEditModel3));
            String str6 = "content_source";
            VideoPublishEditModel videoPublishEditModel4 = this.f123751w;
            if (videoPublishEditModel4 == null) {
                C52711k.m112237a("publishEditModel");
            }
            C23089d a5 = a4.mo47829a(str6, C43434az.m95207b(videoPublishEditModel4)).mo47829a("enter_from", "video_edit_page");
            String str7 = "prop_id";
            C49378co coVar = this.f123745q;
            if (coVar != null) {
                str = coVar.mo97308L();
            } else {
                str = null;
            }
            C26890h.m65011a(str2, a5.mo47829a(str7, str).f61491a);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: P */
    public final void mo97250P() {
        VideoPublishEditModel videoPublishEditModel = this.f123751w;
        if (videoPublishEditModel == null) {
            C52711k.m112237a("publishEditModel");
        }
        InfoStickerModel infoStickerModel = videoPublishEditModel.infoStickerModel;
        if (infoStickerModel != null) {
            List<StickerItemModel> list = infoStickerModel.stickers;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    StickerItemModel stickerItemModel = (StickerItemModel) it.next();
                    if (stickerItemModel.type == 1) {
                        C49131aq aqVar = this.f123743o;
                        if (aqVar != null) {
                            String str = stickerItemModel.path;
                            C52711k.m112236a((Object) str, "model.path");
                            aqVar.mo97151a(str);
                            String str2 = stickerItemModel.stickerId;
                            C52711k.m112236a((Object) str2, "model.stickerId");
                            aqVar.mo97153b(str2);
                            it.remove();
                        }
                    }
                    if (stickerItemModel.type == 4) {
                        C49388cr crVar = this.f123746r;
                        if (crVar != null) {
                            String str3 = stickerItemModel.path;
                            C52711k.m112236a((Object) str3, "model.path");
                            crVar.mo97330a(str3);
                            String str4 = stickerItemModel.stickerId;
                            C52711k.m112236a((Object) str4, "model.stickerId");
                            crVar.mo97332b(str4);
                            it.remove();
                        }
                    }
                }
            }
        }
    }

    /* renamed from: Q */
    public final void mo97251Q() {
        if (this.f123741m == null) {
            this.f123741m = new C49067aa();
            C49067aa aaVar = this.f123741m;
            if (aaVar != null) {
                C49527v vVar = this.f123739k;
                if (vVar == null) {
                    C52711k.m112237a("gestureListenerManager");
                }
                aaVar.mo97101a(vVar);
            }
            C49067aa aaVar2 = this.f123741m;
            if (aaVar2 != null) {
                C49391cu cuVar = this.f123740l;
                if (cuVar == null) {
                    C52711k.m112237a("deleteComponent");
                }
                aaVar2.mo97100a(cuVar);
            }
            C49067aa aaVar3 = this.f123741m;
            if (aaVar3 != null) {
                FrameLayout frameLayout = this.f123724G;
                if (frameLayout == null) {
                    C52711k.m112237a("textPoiLayout");
                }
                aaVar3.mo97097a(frameLayout);
            }
            C49067aa aaVar4 = this.f123741m;
            if (aaVar4 == null) {
                C52711k.m112234a();
            }
            mo24389a((int) R.id.ats, (C12924i) aaVar4, "EditInfoStickerScene");
            VEVideoPublishEditViewModel vEVideoPublishEditViewModel = this.f123722E;
            if (vEVideoPublishEditViewModel == null) {
                C52711k.m112237a("publishEditViewModel");
            }
            C0184k kVar = this;
            vEVideoPublishEditViewModel.mo110461f().observe(kVar, new C49276g(this));
            VEVideoPublishEditViewModel vEVideoPublishEditViewModel2 = this.f123722E;
            if (vEVideoPublishEditViewModel2 == null) {
                C52711k.m112237a("publishEditViewModel");
            }
            vEVideoPublishEditViewModel2.mo110462g().observe(kVar, new C49277h(this));
        }
    }

    /* renamed from: X */
    public final void mo97258X() {
        boolean z;
        if (this.f123743o != null) {
            C49131aq aqVar = this.f123743o;
            if (aqVar != null) {
                aqVar.mo97143H();
            }
            z = true;
        } else {
            z = false;
        }
        if (this.f123745q != null) {
            C49378co coVar = this.f123745q;
            if (coVar != null) {
                coVar.mo97303G();
            }
            z = true;
        }
        if (this.f123746r != null) {
            C49388cr crVar = this.f123746r;
            if (crVar != null) {
                crVar.mo97315H();
            }
            VideoPublishEditModel videoPublishEditModel = this.f123751w;
            if (videoPublishEditModel == null) {
                C52711k.m112237a("publishEditModel");
            }
            CommentVideoModel commentVideoModel = videoPublishEditModel.commentVideoModel;
            if (commentVideoModel != null) {
                commentVideoModel.setStartTime(0);
            }
            VideoPublishEditModel videoPublishEditModel2 = this.f123751w;
            if (videoPublishEditModel2 == null) {
                C52711k.m112237a("publishEditModel");
            }
            CommentVideoModel commentVideoModel2 = videoPublishEditModel2.commentVideoModel;
            if (commentVideoModel2 != null) {
                commentVideoModel2.setEndTime(0);
            }
            z = true;
        }
        if (this.f123744p != null) {
            C49511h hVar = this.f123744p;
            if (hVar != null) {
                hVar.mo97399K();
            }
            z = true;
        }
        if (z) {
            mo97253S();
        }
    }

    /* renamed from: S */
    public final void mo97253S() {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        boolean z;
        this.f123723F.clear();
        EditViewModel editViewModel = this.f123749u;
        if (editViewModel == null) {
            C52711k.m112237a("editViewModel");
        }
        C20347c cVar = (C20347c) editViewModel.mo97038h().getValue();
        if (cVar != null) {
            C49131aq aqVar = this.f123743o;
            if (aqVar != null) {
                aqVar.mo97150a(cVar.mo43037b());
            }
            C49378co coVar = this.f123745q;
            if (coVar != null) {
                coVar.mo97310a(cVar.mo43037b());
            }
            C49388cr crVar = this.f123746r;
            if (crVar != null) {
                crVar.mo97329a(cVar.mo43037b());
            }
            C49511h hVar = this.f123744p;
            if (hVar != null) {
                hVar.mo97411a(cVar.mo43037b());
            }
        }
        C49131aq aqVar2 = this.f123743o;
        List list = null;
        if (aqVar2 != null) {
            obj = aqVar2.mo97144I();
        } else {
            obj = null;
        }
        if (obj != null) {
            this.f123723F.add(obj);
        }
        C49378co coVar2 = this.f123745q;
        if (coVar2 != null) {
            obj2 = coVar2.mo97304H();
        } else {
            obj2 = null;
        }
        if (obj2 != null) {
            this.f123723F.add(obj2);
        }
        C49388cr crVar2 = this.f123746r;
        if (crVar2 != null) {
            obj3 = crVar2.mo97316I();
        } else {
            obj3 = null;
        }
        if (obj3 != null) {
            this.f123723F.add(obj3);
        }
        C49511h hVar2 = this.f123744p;
        if (hVar2 != null) {
            obj4 = hVar2.mo97396H();
        } else {
            obj4 = null;
        }
        if (obj4 != null) {
            this.f123723F.add(obj4);
        }
        C49307bs bsVar = this.f123742n;
        if (bsVar != null) {
            list = bsVar.mo97272N();
        }
        Collection collection = list;
        if (collection == null || collection.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            this.f123723F.addAll(collection);
        }
        VideoPublishEditModel videoPublishEditModel = this.f123751w;
        if (videoPublishEditModel == null) {
            C52711k.m112237a("publishEditModel");
        }
        String a = C43577d.m95723a(videoPublishEditModel.getMainBusinessContext(), this.f123723F, C43596f.TRACK_PAGE_EDIT);
        VideoPublishEditModel videoPublishEditModel2 = this.f123751w;
        if (videoPublishEditModel2 == null) {
            C52711k.m112237a("publishEditModel");
        }
        videoPublishEditModel2.setMainBusinessData(a);
    }

    /* renamed from: R */
    public final void mo97252R() {
        VEPreviewMusicParams vEPreviewMusicParams;
        Object obj;
        Object obj2;
        if (this.f123748t == null) {
            this.f123748t = new C49082af();
            C49082af afVar = this.f123748t;
            if (afVar == null) {
                C52711k.m112234a();
            }
            mo24389a((int) R.id.ats, (C12924i) afVar, "LyricScene");
            C49082af afVar2 = this.f123748t;
            Integer num = null;
            if (afVar2 != null) {
                vEPreviewMusicParams = afVar2.f123345D;
            } else {
                vEPreviewMusicParams = null;
            }
            if (vEPreviewMusicParams == null) {
                C49082af afVar3 = this.f123748t;
                if (afVar3 != null) {
                    afVar3.f123346E = 0;
                }
                C49082af afVar4 = this.f123748t;
                if (afVar4 != null) {
                    VideoPublishEditModel videoPublishEditModel = this.f123751w;
                    if (videoPublishEditModel == null) {
                        C52711k.m112237a("publishEditModel");
                    }
                    int i = (int) (videoPublishEditModel.previewStartTime * 1000.0f);
                    VideoPublishEditModel videoPublishEditModel2 = this.f123751w;
                    if (videoPublishEditModel2 == null) {
                        C52711k.m112237a("publishEditModel");
                    }
                    afVar4.f123347F = i + videoPublishEditModel2.mMusicStart;
                }
                C49082af afVar5 = this.f123748t;
                if (afVar5 != null) {
                    VideoPublishEditModel videoPublishEditModel3 = this.f123751w;
                    if (videoPublishEditModel3 == null) {
                        C52711k.m112237a("publishEditModel");
                    }
                    int i2 = (int) (videoPublishEditModel3.previewStartTime * 1000.0f);
                    VideoPublishEditModel videoPublishEditModel4 = this.f123751w;
                    if (videoPublishEditModel4 == null) {
                        C52711k.m112237a("publishEditModel");
                    }
                    int i3 = i2 + videoPublishEditModel4.mMusicEnd;
                    VideoPublishEditModel videoPublishEditModel5 = this.f123751w;
                    if (videoPublishEditModel5 == null) {
                        C52711k.m112237a("publishEditModel");
                    }
                    afVar5.f123348G = i3 - videoPublishEditModel5.mMusicStart;
                }
            }
            StringBuilder sb = new StringBuilder("inPoint=");
            C49082af afVar6 = this.f123748t;
            if (afVar6 != null) {
                obj = Integer.valueOf(afVar6.f123346E);
            } else {
                obj = null;
            }
            sb.append(obj);
            sb.append(",startTime=");
            C49082af afVar7 = this.f123748t;
            if (afVar7 != null) {
                obj2 = Integer.valueOf(afVar7.f123347F);
            } else {
                obj2 = null;
            }
            sb.append(obj2);
            sb.append(",endTime=");
            C49082af afVar8 = this.f123748t;
            if (afVar8 != null) {
                num = Integer.valueOf(afVar8.f123348G);
            }
            sb.append(num);
            C49082af afVar9 = this.f123748t;
            if (afVar9 != null) {
                afVar9.mo89539a((C24458h) new C49282m(this));
            }
            C49082af afVar10 = this.f123748t;
            if (afVar10 != null) {
                Activity activity = this.f33840g_;
                if (activity != null) {
                    afVar10.mo89538a((FragmentActivity) activity);
                } else {
                    throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
                }
            }
            EditLyricStickerViewModel editLyricStickerViewModel = this.f123718A;
            if (editLyricStickerViewModel == null) {
                C52711k.m112237a("editLyricStickerViewModel");
            }
            mo22547a(editLyricStickerViewModel, C49297bj.f123811a, C11896i.m24255a(), new C49287r(this));
            EditLyricStickerViewModel editLyricStickerViewModel2 = this.f123718A;
            if (editLyricStickerViewModel2 == null) {
                C52711k.m112237a("editLyricStickerViewModel");
            }
            mo49444c(editLyricStickerViewModel2, C49298bk.f123812a, new C11934u(), new C49288s(this));
            EditLyricStickerViewModel editLyricStickerViewModel3 = this.f123718A;
            if (editLyricStickerViewModel3 == null) {
                C52711k.m112237a("editLyricStickerViewModel");
            }
            mo22547a(editLyricStickerViewModel3, C49299bl.f123813a, C11896i.m24255a(), new C49289t(this));
            EditLyricStickerViewModel editLyricStickerViewModel4 = this.f123718A;
            if (editLyricStickerViewModel4 == null) {
                C52711k.m112237a("editLyricStickerViewModel");
            }
            mo49444c(editLyricStickerViewModel4, C49300bm.f123814a, new C11934u(), new C49290u(this));
            EditLyricStickerViewModel editLyricStickerViewModel5 = this.f123718A;
            if (editLyricStickerViewModel5 == null) {
                C52711k.m112237a("editLyricStickerViewModel");
            }
            C0184k kVar = this;
            editLyricStickerViewModel5.mo96878e().observe(kVar, new C49283n(this));
            EditLyricStickerViewModel editLyricStickerViewModel6 = this.f123718A;
            if (editLyricStickerViewModel6 == null) {
                C52711k.m112237a("editLyricStickerViewModel");
            }
            editLyricStickerViewModel6.mo96879f().observe(kVar, new C49284o(this));
            EditLyricStickerViewModel editLyricStickerViewModel7 = this.f123718A;
            if (editLyricStickerViewModel7 == null) {
                C52711k.m112237a("editLyricStickerViewModel");
            }
            mo49444c(editLyricStickerViewModel7, C49296bi.f123810a, new C11934u(), new C49285p(this));
            C49527v vVar = this.f123739k;
            if (vVar == null) {
                C52711k.m112237a("gestureListenerManager");
            }
            vVar.mo97455a((C46722b) new C49286q());
        }
    }

    /* renamed from: a */
    public final void mo74012a() {
        EditViewModel editViewModel = this.f123749u;
        if (editViewModel == null) {
            C52711k.m112237a("editViewModel");
        }
        editViewModel.mo97033a(false, false, false);
    }

    /* renamed from: e */
    public final void mo24448e(Bundle bundle) {
        super.mo24448e(bundle);
        Activity activity = this.f33840g_;
        if (activity != null) {
            JediViewModel a = C48927d.m105736a((FragmentActivity) activity).mo96760a(EditPoiStickerViewModel.class);
            C52711k.m112236a((Object) a, "JediViewModelProviders.o…kerViewModel::class.java]");
            this.f123750v = (EditPoiStickerViewModel) a;
            Activity activity2 = this.f33840g_;
            if (activity2 != null) {
                JediViewModel a2 = C48927d.m105736a((FragmentActivity) activity2).mo96760a(EditInfoStickerViewModel.class);
                C52711k.m112236a((Object) a2, "JediViewModelProviders.o…kerViewModel::class.java]");
                this.f123752x = (EditInfoStickerViewModel) a2;
                Activity activity3 = this.f33840g_;
                if (activity3 != null) {
                    JediViewModel a3 = C48927d.m105736a((FragmentActivity) activity3).mo96760a(EditVoteStickerViewModel.class);
                    C52711k.m112236a((Object) a3, "JediViewModelProviders.o…kerViewModel::class.java]");
                    this.f123754z = (EditVoteStickerViewModel) a3;
                    Activity activity4 = this.f33840g_;
                    if (activity4 != null) {
                        JediViewModel a4 = C48927d.m105736a((FragmentActivity) activity4).mo96760a(EditTextStickerViewModel.class);
                        C52711k.m112236a((Object) a4, "JediViewModelProviders.o…kerViewModel::class.java]");
                        this.f123753y = (EditTextStickerViewModel) a4;
                        Activity activity5 = this.f33840g_;
                        if (activity5 != null) {
                            JediViewModel a5 = C48927d.m105736a((FragmentActivity) activity5).mo96760a(EditLyricStickerViewModel.class);
                            C52711k.m112236a((Object) a5, "JediViewModelProviders.o…kerViewModel::class.java]");
                            this.f123718A = (EditLyricStickerViewModel) a5;
                            Activity activity6 = this.f33840g_;
                            if (activity6 != null) {
                                C0209x a6 = C0214z.m440a((FragmentActivity) activity6).mo359a(LyricEffectViewModel.class);
                                C52711k.m112236a((Object) a6, "ViewModelProviders.of(ac…ectViewModel::class.java]");
                                this.f123719B = (LyricEffectViewModel) a6;
                                Activity activity7 = this.f33840g_;
                                if (activity7 != null) {
                                    JediViewModel a7 = C48927d.m105736a((FragmentActivity) activity7).mo96760a(EditToolbarViewModel.class);
                                    C52711k.m112236a((Object) a7, "JediViewModelProviders.o…barViewModel::class.java]");
                                    this.f123720C = (EditToolbarViewModel) a7;
                                    Activity activity8 = this.f33840g_;
                                    if (activity8 != null) {
                                        JediViewModel a8 = C48927d.m105736a((FragmentActivity) activity8).mo96760a(EditStickerViewModel.class);
                                        C52711k.m112236a((Object) a8, "JediViewModelProviders.o…kerViewModel::class.java]");
                                        this.f123721D = (EditStickerViewModel) a8;
                                        Activity activity9 = this.f33840g_;
                                        if (activity9 != null) {
                                            C0209x a9 = C0214z.m440a((FragmentActivity) activity9).mo359a(VEVideoPublishEditViewModel.class);
                                            C52711k.m112236a((Object) a9, "ViewModelProviders.of(ac…ditViewModel::class.java)");
                                            this.f123722E = (VEVideoPublishEditViewModel) a9;
                                            EditViewModel editViewModel = this.f123749u;
                                            if (editViewModel == null) {
                                                C52711k.m112237a("editViewModel");
                                            }
                                            this.f123751w = editViewModel.mo97035e();
                                            this.f123727J = new C43439b();
                                            Activity activity10 = this.f33840g_;
                                            if (activity10 != null) {
                                                JediViewModel a10 = C48927d.m105736a((FragmentActivity) activity10).mo96760a(EditStickerPanelViewModel.class);
                                                C52711k.m112236a((Object) a10, "JediViewModelProviders.o…nelViewModel::class.java)");
                                                this.f123728K = (EditStickerPanelViewModel) a10;
                                                Activity activity11 = this.f33840g_;
                                                if (activity11 != null) {
                                                    C0209x a11 = C0214z.m440a((FragmentActivity) activity11).mo359a(InfoStickerViewModel.class);
                                                    C52711k.m112236a((Object) a11, "ViewModelProviders.of(ac…kerViewModel::class.java)");
                                                    this.f123729L = (InfoStickerViewModel) a11;
                                                    Activity activity12 = this.f33840g_;
                                                    if (activity12 != null) {
                                                        JediViewModel a12 = C48927d.m105736a((FragmentActivity) activity12).mo96760a(EditMusicViewModel.class);
                                                        C52711k.m112236a((Object) a12, "JediViewModelProviders.o…sicViewModel::class.java)");
                                                        this.f123730M = (EditMusicViewModel) a12;
                                                        EditStickerViewModel editStickerViewModel = this.f123721D;
                                                        if (editStickerViewModel == null) {
                                                            C52711k.m112237a("stickerViewModel");
                                                        }
                                                        C0184k kVar = this;
                                                        editStickerViewModel.mo96966e().observe(kVar, new C49291v(this));
                                                        EditStickerViewModel editStickerViewModel2 = this.f123721D;
                                                        if (editStickerViewModel2 == null) {
                                                            C52711k.m112237a("stickerViewModel");
                                                        }
                                                        editStickerViewModel2.mo96967f().observe(kVar, new C49294y(this));
                                                        EditStickerViewModel editStickerViewModel3 = this.f123721D;
                                                        if (editStickerViewModel3 == null) {
                                                            C52711k.m112237a("stickerViewModel");
                                                        }
                                                        editStickerViewModel3.mo96968g().observe(kVar, new C49295z(this));
                                                        EditStickerViewModel editStickerViewModel4 = this.f123721D;
                                                        if (editStickerViewModel4 == null) {
                                                            C52711k.m112237a("stickerViewModel");
                                                        }
                                                        mo22547a(editStickerViewModel4, C49303bp.f123817a, C11896i.m24255a(), new C49258aa(this));
                                                        C43502an.f110024c.observe(kVar, new C49259ab(this));
                                                        C43502an.m95361a().observe(kVar, new C49260ac(this));
                                                        EditStickerViewModel editStickerViewModel5 = this.f123721D;
                                                        if (editStickerViewModel5 == null) {
                                                            C52711k.m112237a("stickerViewModel");
                                                        }
                                                        mo49444c(editStickerViewModel5, C49304bq.f123818a, new C11934u(), new C49261ad(this));
                                                        EditStickerViewModel editStickerViewModel6 = this.f123721D;
                                                        if (editStickerViewModel6 == null) {
                                                            C52711k.m112237a("stickerViewModel");
                                                        }
                                                        mo49444c(editStickerViewModel6, C49301bn.f123815a, new C11934u(), new C49292w(this));
                                                        EditStickerViewModel editStickerViewModel7 = this.f123721D;
                                                        if (editStickerViewModel7 == null) {
                                                            C52711k.m112237a("stickerViewModel");
                                                        }
                                                        mo49444c(editStickerViewModel7, C49302bo.f123816a, new C11934u(), new C49293x(this));
                                                        if (this.f123747s == null) {
                                                            this.f123747s = new C44548d();
                                                            C44548d dVar = this.f123747s;
                                                            if (dVar == null) {
                                                                C52711k.m112234a();
                                                            }
                                                            mo24389a((int) R.id.dgn, (C12924i) dVar, "StickerHintTextScene");
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
                                                }
                                                throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
                                            }
                                            throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
                                        }
                                        throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
                                    }
                                    throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
                                }
                                throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
                            }
                            throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
                        }
                        throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
                    }
                    throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
                }
                throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
            }
            throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
        }
        throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
    }

    /* renamed from: a */
    public final <VM1 extends JediViewModel<S1>, S1 extends C11932s, R> R mo22552a(VM1 vm1, C52671b<? super S1, ? extends R> bVar) {
        C52711k.m112240b(vm1, "viewModel1");
        C52711k.m112240b(bVar, "block");
        return C49549a.m106924a(this, vm1, bVar);
    }

    /* renamed from: a */
    public final void mo24463a(View view, Bundle bundle) {
        C52711k.m112240b(view, "view");
        super.mo24463a(view, bundle);
        Activity activity = this.f33840g_;
        if (activity != null) {
            JediViewModel a = C48927d.m105736a((FragmentActivity) activity).mo96760a(EditViewModel.class);
            C52711k.m112236a((Object) a, "JediViewModelProviders.o…ditViewModel::class.java]");
            this.f123749u = (EditViewModel) a;
            View j_ = mo24467j_(R.id.cz_);
            C52711k.m112236a((Object) j_, "requireViewById(R.id.text_sticker_layout_layer)");
            this.f123724G = (FrameLayout) j_;
            View j_2 = mo24467j_(R.id.cza);
            C52711k.m112236a((Object) j_2, "requireViewById(R.id.tex…ticker_vote_layout_layer)");
            this.f123725H = (FrameLayout) j_2;
            View j_3 = mo24467j_(R.id.ezs);
            C52711k.m112236a((Object) j_3, "requireViewById(R.id.tex…ker_comment_layout_layer)");
            this.f123726I = (FrameLayout) j_3;
            return;
        }
        throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
    }

    /* renamed from: a */
    public final <S extends C11932s> C1690c mo22546a(JediViewModel<S> jediViewModel, C11934u<S> uVar, C52682m<? super C11866f, ? super S, C52860x> mVar) {
        C52711k.m112240b(jediViewModel, "$this$subscribe");
        C52711k.m112240b(uVar, "config");
        C52711k.m112240b(mVar, "subscriber");
        return C49549a.m106919a(this, jediViewModel, uVar, mVar);
    }

    /* renamed from: b */
    public final ViewGroup mo24387a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C52711k.m112240b(layoutInflater, "inflater");
        C52711k.m112240b(viewGroup, "container");
        View inflate = layoutInflater.inflate(R.layout.ae9, viewGroup, false);
        if (inflate != null) {
            return (FrameLayout) inflate;
        }
        throw new C52857u("null cannot be cast to non-null type android.widget.FrameLayout");
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
