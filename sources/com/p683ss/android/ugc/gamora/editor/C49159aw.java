package com.p683ss.android.ugc.gamora.editor;

import android.app.Activity;
import android.app.Application;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0198r;
import android.arch.lifecycle.C0199s;
import android.arch.lifecycle.C0209x;
import android.arch.lifecycle.C0214z;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.p030v4.app.FragmentActivity;
import android.support.p030v4.content.C0726c;
import android.support.p030v4.p038f.C0781c;
import android.text.TextUtils;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.view.ViewStub;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9414h;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.p666b.C10641a.C10643a;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.dmt.p664ui.widget.DmtLoadingLayout;
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
import com.bytedance.scene.C12930k;
import com.bytedance.scene.group.C12896b;
import com.bytedance.scene.group.ScenePlaceHolderView;
import com.bytedance.scene.ktx.C12932b;
import com.p683ss.android.ttve.model.MVInfoBean;
import com.p683ss.android.ttve.model.MVResourceBean;
import com.p683ss.android.ugc.asve.p1239c.C20347c;
import com.p683ss.android.ugc.asve.p1241e.C20393d;
import com.p683ss.android.ugc.aweme.adaptation.C22452a;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.audiorecord.AudioRecorderParam;
import com.p683ss.android.ugc.aweme.base.activity.C23441t;
import com.p683ss.android.ugc.aweme.base.p1412d.p1413a.C23521a;
import com.p683ss.android.ugc.aweme.base.p1412d.p1413a.C23522b;
import com.p683ss.android.ugc.aweme.comment.model.CommentVideoModel;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.effect.C29206k;
import com.p683ss.android.ugc.aweme.effect.C29218v;
import com.p683ss.android.ugc.aweme.effect.EditEffectVideoModel;
import com.p683ss.android.ugc.aweme.effect.EffectPointModel;
import com.p683ss.android.ugc.aweme.effect.p1679f.C29198a;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.infoSticker.C35579at;
import com.p683ss.android.ugc.aweme.infoSticker.C35606f.C35607a;
import com.p683ss.android.ugc.aweme.infoSticker.C35635v;
import com.p683ss.android.ugc.aweme.infosticker.InfoStickerModel;
import com.p683ss.android.ugc.aweme.infosticker.StickerItemModel;
import com.p683ss.android.ugc.aweme.p1468bu.C24076h;
import com.p683ss.android.ugc.aweme.p1484bx.C24458h;
import com.p683ss.android.ugc.aweme.p1484bx.C24458h.C24459a;
import com.p683ss.android.ugc.aweme.port.p2082in.C39529ab.C39532c;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.port.p2082in.C39630m;
import com.p683ss.android.ugc.aweme.port.p2082in.C39645w.C39646a;
import com.p683ss.android.ugc.aweme.services.video.VEVolumeChangeOp;
import com.p683ss.android.ugc.aweme.sharer.p2172b.C42311c;
import com.p683ss.android.ugc.aweme.shortvideo.C42482c;
import com.p683ss.android.ugc.aweme.shortvideo.C43203d;
import com.p683ss.android.ugc.aweme.shortvideo.C43214dh;
import com.p683ss.android.ugc.aweme.shortvideo.C43303dy;
import com.p683ss.android.ugc.aweme.shortvideo.cutmusic.C43191e;
import com.p683ss.android.ugc.aweme.shortvideo.cutmusic.C43191e.C43193b;
import com.p683ss.android.ugc.aweme.shortvideo.cutmusic.C43191e.C43196c;
import com.p683ss.android.ugc.aweme.shortvideo.edit.C43434az;
import com.p683ss.android.ugc.aweme.shortvideo.edit.C43449bd;
import com.p683ss.android.ugc.aweme.shortvideo.edit.C43477h;
import com.p683ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p683ss.android.ugc.aweme.shortvideo.edit.audioeffect.C43357b;
import com.p683ss.android.ugc.aweme.shortvideo.edit.audioeffect.C43382i;
import com.p683ss.android.ugc.aweme.shortvideo.edit.audiorecord.C43402b;
import com.p683ss.android.ugc.aweme.shortvideo.edit.audiorecord.C43405c;
import com.p683ss.android.ugc.aweme.shortvideo.edit.audiorecord.C43405c.C43421p;
import com.p683ss.android.ugc.aweme.shortvideo.edit.audiorecord.C43405c.C43423r;
import com.p683ss.android.ugc.aweme.shortvideo.edit.audiorecord.C43405c.C43424s;
import com.p683ss.android.ugc.aweme.shortvideo.edit.audiorecord.C43405c.C43427v;
import com.p683ss.android.ugc.aweme.shortvideo.edit.audiorecord.C43429e;
import com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.C43502an;
import com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.C43535i;
import com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.C43577d;
import com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.C43596f;
import com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.controller.C43558a;
import com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.controller.C43569g;
import com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.controller.TextStickerCompileResult;
import com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.poi.C43598a;
import com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.view.InteractStickerBaseView;
import com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.C43619b;
import com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.VotingStickerLayout;
import com.p683ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData;
import com.p683ss.android.ugc.aweme.shortvideo.edit.multiedit.p2198b.C43682b;
import com.p683ss.android.ugc.aweme.shortvideo.edit.multiedit.p2198b.C43683c;
import com.p683ss.android.ugc.aweme.shortvideo.edit.multiedit.p2201e.C43740a;
import com.p683ss.android.ugc.aweme.shortvideo.edit.p2190b.C43440a.C43441a;
import com.p683ss.android.ugc.aweme.shortvideo.edit.p2190b.C43443c;
import com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.p2211a.C44002b;
import com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.p2213c.C44015a;
import com.p683ss.android.ugc.aweme.shortvideo.net.C44332b;
import com.p683ss.android.ugc.aweme.shortvideo.p2208k.C43944p;
import com.p683ss.android.ugc.aweme.shortvideo.p2219p.C44342a;
import com.p683ss.android.ugc.aweme.shortvideo.p2219p.C44342a.C44344b;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.p2230e.C44564a;
import com.p683ss.android.ugc.aweme.shortvideo.subtitle.SubtitleModule.C44810b;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45380af;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45407ay;
import com.p683ss.android.ugc.aweme.shortvideo.view.C45546c;
import com.p683ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.p683ss.android.ugc.aweme.story.shootvideo.textfont.C46679c;
import com.p683ss.android.ugc.aweme.story.shootvideo.textfont.C46688i.C46696a;
import com.p683ss.android.ugc.aweme.story.shootvideo.textrecord.TextStickerData;
import com.p683ss.android.ugc.aweme.story.shootvideo.textsticker.gesture.C46722b;
import com.p683ss.android.ugc.aweme.story.shootvideo.textsticker.view.C46757l;
import com.p683ss.android.ugc.aweme.story.shootvideo.textsticker.view.TextStickerInputLayout;
import com.p683ss.android.ugc.aweme.themechange.base.C46788b;
import com.p683ss.android.ugc.aweme.utils.C47807de;
import com.p683ss.android.ugc.aweme.utils.C47902fv;
import com.p683ss.android.ugc.aweme.video.C48016e;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import com.p683ss.android.ugc.gamora.editor.C49256bh.C49262ae;
import com.p683ss.android.ugc.gamora.editor.C49256bh.C49271b;
import com.p683ss.android.ugc.gamora.editor.C49395cx.C49397b;
import com.p683ss.android.ugc.gamora.editor.p2460b.C49231a;
import com.p683ss.android.ugc.gamora.editor.sticker.donation.C49483c;
import com.p683ss.android.ugc.gamora.editor.sticker.donation.C49511h;
import com.p683ss.android.ugc.gamora.jedi.C49548a;
import com.p683ss.android.ugc.gamora.jedi.C49548a.C49549a;
import com.p683ss.android.ugc.gamora.jedi.C49555b;
import com.p683ss.android.ugc.gamora.jedi.C49562i;
import com.p683ss.android.ugc.gamora.p2458b.C48927d;
import com.p683ss.android.ugc.tools.utils.C50203g;
import com.p683ss.android.vesdk.C50720o.C50743d;
import com.p683ss.android.vesdk.VESize;
import com.ss.android.ugc.trill.R;
import dmt.p2652av.video.C52904aa;
import dmt.p2652av.video.C52904aa.C52905a;
import dmt.p2652av.video.C52967f;
import dmt.p2652av.video.C53026u;
import dmt.p2652av.video.VEVideoPublishEditViewModel;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import leakcanary.internal.LeakCanaryFileProvider;
import org.json.JSONArray;
import org.json.JSONObject;
import p001a.C0011g;
import p001a.C0013i;
import p064c.p065a.C2201v;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p071d.C1711f;
import p064c.p065a.p093k.C2168a;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52847n;
import p2628d.C52857u;
import p2628d.C52860x;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2640a.C52686q;
import p2628d.p2639f.p2640a.C52687r;
import p2628d.p2639f.p2640a.C52688s;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;
import p2628d.p2648k.C52771j;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.gamora.editor.aw */
public final class C49159aw extends C12896b implements C49098ak, C49389cs, C49548a {

    /* renamed from: K */
    public static final C49160a f123494K = new C49160a(null);

    /* renamed from: k */
    static final /* synthetic */ C52767h[] f123495k = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C49159aw.class), "previewScene", "getPreviewScene()Lcom/ss/android/ugc/gamora/editor/EditPreviewScene;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C49159aw.class), "titleBarScene", "getTitleBarScene()Lcom/ss/android/ugc/gamora/editor/EditTitlebarScene;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C49159aw.class), "bottomBarScene", "getBottomBarScene()Lcom/ss/android/ugc/gamora/editor/EditBottomBarScene;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C49159aw.class), "stickerDeleteScene", "getStickerDeleteScene()Lcom/ss/android/ugc/gamora/editor/EditStickerDeleteScene;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C49159aw.class), "gestureScene", "getGestureScene()Lcom/ss/android/ugc/gamora/editor/EditGestureScene;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C49159aw.class), "filterIndicatorScene", "getFilterIndicatorScene()Lcom/ss/android/ugc/gamora/editor/EditFilterIndicatorScene;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C49159aw.class), "cornerScene", "getCornerScene()Lcom/ss/android/ugc/gamora/editor/EditCornerScene;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C49159aw.class), "audioEffectScene", "getAudioEffectScene()Lcom/ss/android/ugc/aweme/shortvideo/edit/audioeffect/EditAudioEffectScene;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C49159aw.class), "filterScene", "getFilterScene()Lcom/ss/android/ugc/gamora/editor/EditFilterScene;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C49159aw.class), "stickerScene", "getStickerScene()Lcom/ss/android/ugc/gamora/editor/EditStickerScene;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C49159aw.class), "effectComponent", "getEffectComponent()Lcom/ss/android/ugc/aweme/effect/services/IEffectComponent;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C49159aw.class), "autoEnhanceScene", "getAutoEnhanceScene()Lcom/ss/android/ugc/gamora/editor/EditAutoEnhanceScene;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C49159aw.class), "stickerPanelScene", "getStickerPanelScene()Lcom/ss/android/ugc/gamora/editor/EditStickerPanelScene;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C49159aw.class), "volumeScene", "getVolumeScene()Lcom/ss/android/ugc/gamora/editor/EditVolumeScene;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C49159aw.class), "musicCutScene", "getMusicCutScene()Lcom/ss/android/ugc/gamora/editor/EditMusicCutScene;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C49159aw.class), "musicScene", "getMusicScene()Lcom/ss/android/ugc/gamora/editor/EditMusicScene;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C49159aw.class), "audioRecordScene", "getAudioRecordScene()Lcom/ss/android/ugc/aweme/shortvideo/edit/audiorecord/EditAudioRecordScene;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C49159aw.class), "subtitleScene", "getSubtitleScene()Lcom/ss/android/ugc/gamora/editor/EditSubtitleScene;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C49159aw.class), "editDebugInfo", "getEditDebugInfo()Lcom/ss/android/ugc/aweme/shortvideo/edit/EditorDebugInfo;"))};

    /* renamed from: A */
    public EditMusicViewModel f123496A;

    /* renamed from: B */
    public C35579at f123497B;

    /* renamed from: C */
    public DmtLoadingLayout f123498C;

    /* renamed from: D */
    public boolean f123499D;

    /* renamed from: E */
    public C49390ct f123500E;

    /* renamed from: F */
    public final C49527v f123501F = new C49527v();

    /* renamed from: G */
    public C49413cy f123502G;

    /* renamed from: H */
    boolean f123503H;

    /* renamed from: I */
    final C52668f f123504I = C52732g.m112285a(C49211l.f123616a);

    /* renamed from: J */
    StatusViewModel f123505J;

    /* renamed from: L */
    private final C52668f f123506L = C52732g.m112285a(new C49192ay(this));

    /* renamed from: M */
    private final C52668f f123507M = C52732g.m112285a(new C49200bf(this));

    /* renamed from: N */
    private final C52668f f123508N = C52732g.m112285a(new C49204e(this));

    /* renamed from: O */
    private final C52668f f123509O = C52732g.m112285a(new C49196bb(this));

    /* renamed from: P */
    private final C52668f f123510P = C52732g.m112285a(new C49215p(this));

    /* renamed from: Q */
    private final C52668f f123511Q = C52732g.m112285a(new C49213n(this));

    /* renamed from: R */
    private final C52668f f123512R = C52732g.m112285a(new C49210k(this));

    /* renamed from: S */
    private final C52668f f123513S = C52732g.m112285a(new C49194b(this));

    /* renamed from: T */
    private final C52668f f123514T = C52732g.m112285a(new C49214o(this));

    /* renamed from: U */
    private final C52668f f123515U = C52732g.m112285a(new C49198bd(this));

    /* renamed from: V */
    private final C52668f f123516V = C52732g.m112285a(new C49212m(this));

    /* renamed from: W */
    private final C52668f f123517W = C52732g.m112285a(new C49203d(this));

    /* renamed from: X */
    private final C52668f f123518X = C52732g.m112285a(new C49197bc(this));

    /* renamed from: Y */
    private final C52668f f123519Y = C52732g.m112285a(new C49201bg(this));

    /* renamed from: Z */
    private final C52668f f123520Z = C52732g.m112285a(new C49180ao(this));

    /* renamed from: aa */
    private final C52668f f123521aa = C52732g.m112285a(new C49181ap(this));

    /* renamed from: ab */
    private final C52668f f123522ab = C52732g.m112285a(new C49202c(this));

    /* renamed from: ac */
    private final C52668f f123523ac = C52732g.m112285a(new C49199be(this));

    /* renamed from: ad */
    private EditPreviewViewModel f123524ad;

    /* renamed from: ae */
    private EditCornerViewModel f123525ae;

    /* renamed from: af */
    private EditAudioRecordModel f123526af;

    /* renamed from: ag */
    private C43449bd f123527ag;

    /* renamed from: ah */
    private C45546c f123528ah;

    /* renamed from: l */
    public final C43740a f123529l = new C43740a();

    /* renamed from: m */
    public C49395cx f123530m;

    /* renamed from: n */
    public VEVideoPublishEditViewModel f123531n;

    /* renamed from: o */
    public EditViewModel f123532o;

    /* renamed from: p */
    public EditToolbarViewModel f123533p;

    /* renamed from: q */
    public VideoPublishEditModel f123534q;

    /* renamed from: r */
    EditAudioRecordModel f123535r;

    /* renamed from: s */
    public EditLyricStickerViewModel f123536s;

    /* renamed from: t */
    EditStickerPanelViewModel f123537t;

    /* renamed from: u */
    EditAudioEffectViewModel f123538u;

    /* renamed from: v */
    EditFilterViewModel f123539v;

    /* renamed from: w */
    public EditStickerViewModel f123540w;

    /* renamed from: x */
    EditAutoEnhanceViewModel f123541x;

    /* renamed from: y */
    EditSubtitleViewModel f123542y;

    /* renamed from: z */
    public EditMusicCutViewModel f123543z;

    /* renamed from: com.ss.android.ugc.gamora.editor.aw$a */
    public static final class C49160a {
        private C49160a() {
        }

        public /* synthetic */ C49160a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.aw$aa */
    static final class C49161aa extends C52712l implements C52682m<C11866f, Boolean, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C49159aw f123544a;

        C49161aa(C49159aw awVar) {
            this.f123544a = awVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            Boolean bool = (Boolean) obj2;
            C52711k.m112240b((C11866f) obj, "$receiver");
            if (bool != null) {
                bool.booleanValue();
                if (bool.booleanValue()) {
                    this.f123544a.mo24409d((C12924i) this.f123544a.mo97172S());
                } else {
                    this.f123544a.mo24404c((C12924i) this.f123544a.mo97172S());
                }
                C43405c S = this.f123544a.mo97172S();
                boolean booleanValue = bool.booleanValue();
                ViewGroup viewGroup = S.f109738A;
                if (viewGroup == null) {
                    C52711k.m112237a("contentLayout");
                }
                C29218v.m68807a((View) viewGroup, booleanValue, (int) C9432q.m18687b((Context) S.f33840g_, S.f109774k), S.mo24464b((int) R.id.ak3), (C0781c<Void>) new C43427v<Void>(S, booleanValue));
                if (booleanValue) {
                    C26890h.m65011a("click_dub", S.mo88358i().f61491a);
                    VideoPublishEditModel videoPublishEditModel = S.f109783t;
                    if (videoPublishEditModel == null) {
                        C52711k.m112237a("mVideoPublishEditModel");
                    }
                    if (videoPublishEditModel.veAudioRecorderParam != null) {
                        VideoPublishEditModel videoPublishEditModel2 = S.f109783t;
                        if (videoPublishEditModel2 == null) {
                            C52711k.m112237a("mVideoPublishEditModel");
                        }
                        videoPublishEditModel2.veAudioRecorderParam.setNeedDel(true);
                        VEVideoPublishEditViewModel vEVideoPublishEditViewModel = S.f109784u;
                        if (vEVideoPublishEditViewModel == null) {
                            C52711k.m112237a("mVEVideoPublishEditViewModel");
                        }
                        C0198r b = vEVideoPublishEditViewModel.mo110457b();
                        C52711k.m112236a((Object) b, "mVEVideoPublishEditViewM…udioRecorderParamLiveData");
                        VideoPublishEditModel videoPublishEditModel3 = S.f109783t;
                        if (videoPublishEditModel3 == null) {
                            C52711k.m112237a("mVideoPublishEditModel");
                        }
                        b.setValue(videoPublishEditModel3.veAudioRecorderParam);
                    } else {
                        S.f109746I = new AudioRecorderParam();
                    }
                    AudioRecorderParam audioRecorderParam = S.f109746I;
                    VideoPublishEditModel videoPublishEditModel4 = S.f109783t;
                    if (videoPublishEditModel4 == null) {
                        C52711k.m112237a("mVideoPublishEditModel");
                    }
                    audioRecorderParam.copyFrom(videoPublishEditModel4.veAudioRecorderParam);
                    if (S.f109746I.getNeedOriginalSound()) {
                        AudioRecorderParam audioRecorderParam2 = S.f109746I;
                        VideoPublishEditModel videoPublishEditModel5 = S.f109783t;
                        if (videoPublishEditModel5 == null) {
                            C52711k.m112237a("mVideoPublishEditModel");
                        }
                        audioRecorderParam2.setVoiceVolume(videoPublishEditModel5.voiceVolume);
                    }
                    S.f109782s = null;
                    CheckBox checkBox = S.f109744G;
                    if (checkBox == null) {
                        C52711k.m112237a("checkBox");
                    }
                    checkBox.setChecked(S.f109746I.getNeedOriginalSound());
                    S.mo88355d().setValue(Boolean.valueOf(S.f109746I.getNeedOriginalSound()));
                    View view = S.f109788y;
                    if (view == null) {
                        C52711k.m112237a("mPlayView");
                    }
                    view.setVisibility(0);
                    C43421p pVar = S.f109752O;
                    if (pVar != null) {
                        pVar.mo88366a(0.0f, true);
                    }
                    C43402b bVar = S.f109789z;
                    if (bVar == null) {
                        C52711k.m112237a("audioRecordSeekBar");
                    }
                    bVar.setStack(S.f109746I.getMStack());
                    C43402b bVar2 = S.f109789z;
                    if (bVar2 == null) {
                        C52711k.m112237a("audioRecordSeekBar");
                    }
                    if (bVar2 != null) {
                        bVar2.mo88339a(0.0f);
                    }
                    S.mo88353c().setValue(Long.valueOf(0));
                    if (S.f109746I.getMStack().isEmpty()) {
                        View view2 = S.f109742E;
                        if (view2 == null) {
                            C52711k.m112237a("backView");
                        }
                        view2.setVisibility(8);
                    } else {
                        View view3 = S.f109742E;
                        if (view3 == null) {
                            C52711k.m112237a("backView");
                        }
                        view3.setVisibility(0);
                    }
                    C23441t tVar = S.f109778o;
                    if (tVar != null) {
                        tVar.mo48605a(S.f109753P);
                    }
                    Runnable sVar = new C43424s(S);
                    S.f109745H = new C43429e();
                    C0013i.m18a((Callable<TResult>) new C43423r<TResult>(sVar), (Executor) C24076h.m58902c());
                    VideoPublishEditModel videoPublishEditModel6 = S.f109783t;
                    if (videoPublishEditModel6 == null) {
                        C52711k.m112237a("mVideoPublishEditModel");
                    }
                    if (videoPublishEditModel6.veAudioEffectParam != null) {
                        C10691a.m21542b((Context) S.f33840g_, (int) R.string.all).mo19066a();
                    }
                    VEVideoPublishEditViewModel vEVideoPublishEditViewModel2 = S.f109784u;
                    if (vEVideoPublishEditViewModel2 == null) {
                        C52711k.m112237a("mVEVideoPublishEditViewModel");
                    }
                    vEVideoPublishEditViewModel2.mo110462g().setValue(C52905a.m112589a(C52904aa.f131229l, C46788b.f118235d.mo94007a(true, false, false, false, false), ((int) C9432q.m18687b((Context) S.f33840g_, S.f109773j)) + C43303dy.m94972c(S.f33840g_), (int) C9432q.m18687b((Context) S.f33840g_, S.f109774k), S.mo88357h(), C22452a.m55498d(), 0, false, false, false, false, 960, null));
                } else {
                    View view4 = S.f109786w;
                    if (view4 == null) {
                        C52711k.m112237a("mSaveView");
                    }
                    view4.setVisibility(8);
                    View view5 = S.f109787x;
                    if (view5 == null) {
                        C52711k.m112237a("mCancelView");
                    }
                    view5.setVisibility(8);
                    C23441t tVar2 = S.f109778o;
                    if (tVar2 != null) {
                        tVar2.mo48606b(S.f109753P);
                    }
                    S.f109779p.cancel();
                    VEVideoPublishEditViewModel vEVideoPublishEditViewModel3 = S.f109784u;
                    if (vEVideoPublishEditViewModel3 == null) {
                        C52711k.m112237a("mVEVideoPublishEditViewModel");
                    }
                    vEVideoPublishEditViewModel3.mo110462g().setValue(C52905a.m112586a(S.mo24478w().getColor(R.color.ip), ((int) C9432q.m18687b((Context) S.f33840g_, S.f109773j)) + C43303dy.m94972c(S.f33840g_), (int) C9432q.m18687b((Context) S.f33840g_, S.f109774k), S.mo88357h(), C22452a.m55498d(), 0));
                }
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.aw$ab */
    static final class C49162ab extends C52712l implements C52682m<C49548a, Integer, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C49159aw f123545a;

        C49162ab(C49159aw awVar) {
            this.f123545a = awVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            C49548a aVar = (C49548a) obj;
            ((Number) obj2).intValue();
            C52711k.m112240b(aVar, "$receiver");
            C39532c cVar = this.f123545a.mo97171R().mo97138G().f112221f;
            if (cVar != null) {
                cVar.mo80612h();
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.aw$ac */
    static final class C49163ac extends C52712l implements C52682m<C49548a, Integer, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C49159aw f123546a;

        C49163ac(C49159aw awVar) {
            this.f123546a = awVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            C49548a aVar = (C49548a) obj;
            int intValue = ((Number) obj2).intValue();
            C52711k.m112240b(aVar, "$receiver");
            View j_ = this.f123546a.mo24467j_(R.id.b_k);
            C52711k.m112236a((Object) j_, "requireViewById<FrameLayout>(R.id.layout_viewstub)");
            FrameLayout frameLayout = (FrameLayout) j_;
            LayoutParams layoutParams = frameLayout.getLayoutParams();
            if (layoutParams != null) {
                MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
                marginLayoutParams.topMargin = intValue;
                frameLayout.setLayoutParams(marginLayoutParams);
                return C52860x.f131107a;
            }
            throw new C52857u("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.aw$ad */
    static final class C49164ad extends C52712l implements C52682m<C49548a, C52860x, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C49159aw f123547a;

        C49164ad(C49159aw awVar) {
            this.f123547a = awVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            C52860x xVar = (C52860x) obj2;
            C52711k.m112240b((C49548a) obj, "$receiver");
            C52711k.m112240b(xVar, "it");
            C49159aw awVar = this.f123547a;
            C49256bh O = awVar.mo97168O();
            C49231a aVar = awVar.mo97162I().f123465k;
            if (aVar == null) {
                C52711k.m112237a("publishEditScene");
            }
            SurfaceView surfaceView = aVar.f123647m;
            C52711k.m112236a((Object) surfaceView, "publishEditScene.surfaceView");
            LayoutParams layoutParams = surfaceView.getLayoutParams();
            if (layoutParams != null) {
                MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
                int I = awVar.mo97162I().mo97155I();
                int J = awVar.mo97162I().mo97156J();
                C52711k.m112240b(marginLayoutParams, "params");
                C49131aq aqVar = O.f123743o;
                if (aqVar != null) {
                    aqVar.mo97141F().mo88753k();
                }
                C49307bs bsVar = O.f123742n;
                if (bsVar != null) {
                    bsVar.mo97264F().mo93658c();
                }
                C49388cr crVar = O.f123746r;
                if (crVar != null) {
                    crVar.mo97317J();
                }
                C49511h hVar = O.f123744p;
                if (hVar != null) {
                    hVar.mo97400L();
                }
                C49067aa aaVar = O.f123741m;
                if (aaVar != null) {
                    int[] iArr = {marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin};
                    C52711k.m112240b(iArr, "margins");
                    aaVar.mo97095F().mo88621a(I, J, iArr);
                }
                return C52860x.f131107a;
            }
            throw new C52857u("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.aw$ae */
    static final class C49165ae extends C52712l implements C52682m<C49548a, C52860x, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C49159aw f123548a;

        /* renamed from: com.ss.android.ugc.gamora.editor.aw$ae$a */
        static final class C49169a<V> implements Callable<TResult> {

            /* renamed from: a */
            final /* synthetic */ MVInfoBean f123552a;

            /* renamed from: b */
            final /* synthetic */ C49165ae f123553b;

            C49169a(MVInfoBean mVInfoBean, C49165ae aeVar) {
                this.f123552a = mVInfoBean;
                this.f123553b = aeVar;
            }

            public final /* synthetic */ Object call() {
                Iterator it;
                int i;
                int i2;
                Iterator it2;
                int I = this.f123553b.f123548a.mo97162I().mo97155I();
                int J = this.f123553b.f123548a.mo97162I().mo97156J();
                MVInfoBean mVInfoBean = this.f123552a;
                C52711k.m112240b(mVInfoBean, "mvInfo");
                List arrayList = new ArrayList();
                ArrayList<MVResourceBean> arrayList2 = mVInfoBean.resources;
                C52711k.m112236a((Object) arrayList2, "mvInfo.resources");
                Iterator it3 = arrayList2.iterator();
                int i3 = 0;
                boolean z = true;
                while (it3.hasNext()) {
                    Object next = it3.next();
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        C52575l.m112100b();
                    }
                    MVResourceBean mVResourceBean = (MVResourceBean) next;
                    if (C52711k.m112239a((Object) mVResourceBean.type, (Object) "text")) {
                        String str = mVResourceBean.content;
                        C52711k.m112236a((Object) str, C42311c.f106865i);
                        String substring = str.substring(C52830p.m112415a((CharSequence) str, '{', 0, false, 6, (Object) null), str.length());
                        C52711k.m112236a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                        JSONObject jSONObject = new JSONObject(substring);
                        StickerItemModel stickerItemModel = new StickerItemModel(null, null, null, C43502an.m95362b(), false, 0, 0, 2);
                        TextStickerData textStickerData = new TextStickerData("测试文字", 1, -1, 2, "test", null, 0, 0, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, false, 0, null, null, 262112, null);
                        JSONArray optJSONArray = jSONObject.optJSONArray("text_str_ary");
                        ArrayList arrayList3 = new ArrayList();
                        if (optJSONArray != null && optJSONArray.length() > 0) {
                            int length = optJSONArray.length();
                            int i5 = 0;
                            while (i5 < length) {
                                String string = optJSONArray.getString(i5);
                                if (!TextUtils.isEmpty(string)) {
                                    C52711k.m112236a((Object) string, "str");
                                    it2 = it3;
                                    i2 = length;
                                    if (!C52830p.m112413c(string, "\n", false, 2, null)) {
                                        if (i5 < optJSONArray.length() - 1) {
                                            StringBuilder sb = new StringBuilder();
                                            sb.append(string);
                                            sb.append("\n");
                                            string = sb.toString();
                                        }
                                    }
                                    arrayList3.add(string);
                                } else {
                                    it2 = it3;
                                    i2 = length;
                                }
                                i5++;
                                it3 = it2;
                                length = i2;
                            }
                        }
                        it = it3;
                        int size = arrayList3.size();
                        String[] strArr = new String[size];
                        for (int i6 = 0; i6 < size; i6++) {
                            strArr[i6] = "";
                        }
                        arrayList3.toArray(strArr);
                        textStickerData.setTextStrAry(strArr);
                        textStickerData.setFontSize(jSONObject.optInt("font_size", 28));
                        textStickerData.setScale(1.0f);
                        textStickerData.setRotation((float) jSONObject.optDouble("r"));
                        textStickerData.setBgMode(jSONObject.optInt("bg_mode"));
                        String optString = jSONObject.optString("color", "#ffffff");
                        C52711k.m112236a((Object) optString, "jsonObject.optString(\"color\", \"#ffffff\")");
                        String a = C52830p.m112401a(optString, "0x", "#", false, 4, (Object) null);
                        if (C52830p.m112456b((CharSequence) a, (CharSequence) "#", false, 2, (Object) null)) {
                            i = Color.parseColor(a);
                        } else {
                            i = -1;
                        }
                        textStickerData.setColor(i);
                        int optInt = jSONObject.optInt("align");
                        if (optInt == 0) {
                            optInt = 2;
                        } else if (optInt == 2) {
                            optInt = 3;
                        }
                        textStickerData.setAlign(optInt);
                        textStickerData.setX(((float) I) * ((float) jSONObject.optDouble("x")));
                        textStickerData.setY(((float) J) * ((float) jSONObject.optDouble("y")));
                        textStickerData.setEditCenterPoint(new Point((int) textStickerData.getX(), (int) textStickerData.getY()));
                        textStickerData.setStartTime(jSONObject.optInt("mStartTime"));
                        textStickerData.setEndTime(jSONObject.optInt("mEndTime"));
                        textStickerData.setUiStartTime(textStickerData.getStartTime());
                        textStickerData.setUiEndTime(textStickerData.getEndTime());
                        textStickerData.setAutoSelect(z);
                        if (z) {
                            z = false;
                        }
                        String optString2 = jSONObject.optString("font_file_name", "default");
                        C52711k.m112236a((Object) optString2, "jsonObject.optString(\"font_file_name\", \"default\")");
                        textStickerData.setFontType(C52830p.m112401a(optString2, "0x", "#", false, 4, (Object) null));
                        C46679c a2 = C46679c.m101291a();
                        C52711k.m112236a((Object) a2, "TextFontStyleManager.getInstance()");
                        a2.mo93629b();
                        if (!C46679c.m101291a().mo93626a(textStickerData.getFontType())) {
                            textStickerData.setFontType("default");
                        }
                        stickerItemModel.extra = C39629l.m88232a().mo58566D().mo34889b(textStickerData);
                        arrayList.add(stickerItemModel);
                    } else {
                        it = it3;
                    }
                    i3 = i4;
                    it3 = it;
                }
                return arrayList;
            }
        }

        /* renamed from: com.ss.android.ugc.gamora.editor.aw$ae$b */
        static final class C49170b<TTaskResult, TContinuationResult> implements C0011g<List<? extends StickerItemModel>, Void> {

            /* renamed from: a */
            final /* synthetic */ C49165ae f123554a;

            C49170b(C49165ae aeVar) {
                this.f123554a = aeVar;
            }

            public final /* synthetic */ Object then(C0013i iVar) {
                C52711k.m112236a((Object) iVar, "task");
                List<StickerItemModel> list = (List) iVar.mo34e();
                if (list != null) {
                    C49159aw awVar = this.f123554a.f123548a;
                    VideoPublishEditModel videoPublishEditModel = awVar.f123534q;
                    if (videoPublishEditModel == null) {
                        C52711k.m112237a("mModel");
                    }
                    if (!videoPublishEditModel.hasInfoStickers()) {
                        VideoPublishEditModel videoPublishEditModel2 = awVar.f123534q;
                        if (videoPublishEditModel2 == null) {
                            C52711k.m112237a("mModel");
                        }
                        VideoPublishEditModel videoPublishEditModel3 = awVar.f123534q;
                        if (videoPublishEditModel3 == null) {
                            C52711k.m112237a("mModel");
                        }
                        videoPublishEditModel2.infoStickerModel = new InfoStickerModel(videoPublishEditModel3.draftDir());
                    }
                    int i = 1;
                    for (StickerItemModel stickerItemModel : list) {
                        i++;
                        stickerItemModel.layerWeight = i;
                        VideoPublishEditModel videoPublishEditModel4 = awVar.f123534q;
                        if (videoPublishEditModel4 == null) {
                            C52711k.m112237a("mModel");
                        }
                        videoPublishEditModel4.infoStickerModel.stickers.add(stickerItemModel);
                    }
                }
                C49307bs bsVar = this.f123554a.f123548a.mo97168O().f123742n;
                if (bsVar != null) {
                    bsVar.mo97265G();
                }
                return null;
            }
        }

        C49165ae(C49159aw awVar) {
            this.f123548a = awVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            C52860x xVar = (C52860x) obj2;
            C52711k.m112240b((C49548a) obj, "$receiver");
            C52711k.m112240b(xVar, "it");
            C32458a.m75144a("receive prepare done event in edit page");
            this.f123548a.mo97184ab();
            C2201v.m6614b(C49159aw.m106138b(this.f123548a).mo97035e()).mo6514a(C2168a.m6521b()).mo6541d((C1711f<? super T, ? extends R>) C491661.f123549a).mo6514a(C1667a.m5940a()).mo6505a((C1710e<? super T>) new C1710e<Integer>(this) {

                /* renamed from: a */
                final /* synthetic */ C49165ae f123550a;

                {
                    this.f123550a = r1;
                }

                public final /* synthetic */ void accept(Object obj) {
                    Integer num = (Integer) obj;
                    C43477h hVar = (C43477h) this.f123550a.f123548a.f123504I.getValue();
                    Context t = this.f123550a.f123548a.mo24474t();
                    if (t == null) {
                        C52711k.m112234a();
                    }
                    C52711k.m112236a((Object) t, "sceneContext!!");
                    View view = this.f123550a.f123548a.f33834b;
                    C52711k.m112236a((Object) view, "view");
                    ViewParent parent = view.getParent();
                    if (parent != null) {
                        ViewGroup viewGroup = (ViewGroup) parent;
                        C52711k.m112236a((Object) num, "it");
                        num.intValue();
                        C52711k.m112240b(t, "context");
                        C52711k.m112240b(viewGroup, "viewGroup");
                        return;
                    }
                    throw new C52857u("null cannot be cast to non-null type android.view.ViewGroup");
                }
            }, (C1710e<? super Throwable>) C491683.f123551a);
            if (C49159aw.m106124a(this.f123548a).isStatusVideoType() && !C49159aw.m106124a(this.f123548a).mIsFromDraft && C49159aw.m106124a(this.f123548a).statusCreateVideoData.getStatusType() == 2) {
                C20347c cVar = (C20347c) C49159aw.m106138b(this.f123548a).mo97038h().getValue();
                if (cVar != null) {
                    MVInfoBean d = cVar.mo43051d();
                    if (d != null) {
                        C0013i.m16a((Callable<TResult>) new C49169a<TResult>(d, this)).mo20a((C0011g<TResult, TContinuationResult>) new C49170b<TResult,TContinuationResult>(this), C0013i.f25b);
                    }
                }
            }
            if (!C49159aw.m106124a(this.f123548a).mIsFromDraft && !C49159aw.m106124a(this.f123548a).isDuet() && !C49159aw.m106124a(this.f123548a).isReaction()) {
                C49159aw.m106124a(this.f123548a);
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.aw$af */
    static final class C49171af<T> implements C0199s<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C49159aw f123555a;

        C49171af(C49159aw awVar) {
            this.f123555a = awVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            C49159aw awVar = this.f123555a;
            awVar.mo97195d(true);
            awVar.mo97169P().mo59050h();
            EditViewModel editViewModel = awVar.f123532o;
            if (editViewModel == null) {
                C52711k.m112237a("editViewModel");
            }
            editViewModel.mo97033a(true, false, true);
            this.f123555a.mo97191ai();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.aw$ag */
    static final class C49172ag<T> implements C0199s<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C49159aw f123556a;

        C49172ag(C49159aw awVar) {
            this.f123556a = awVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            C49159aw awVar = this.f123556a;
            EditAudioRecordModel editAudioRecordModel = awVar.f123535r;
            if (editAudioRecordModel == null) {
                C52711k.m112237a("mEditAudioRecordModel");
            }
            editAudioRecordModel.mo96771a(Boolean.valueOf(false));
            EditViewModel editViewModel = awVar.f123532o;
            if (editViewModel == null) {
                C52711k.m112237a("editViewModel");
            }
            editViewModel.mo97033a(true, false, true);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.aw$ah */
    static final class C49173ah<T> implements C0199s<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C49159aw f123557a;

        C49173ah(C49159aw awVar) {
            this.f123557a = awVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            C49159aw awVar = this.f123557a;
            awVar.mo97195d(true);
            EditSubtitleViewModel editSubtitleViewModel = awVar.f123542y;
            if (editSubtitleViewModel == null) {
                C52711k.m112237a("subtitleViewModel");
            }
            editSubtitleViewModel.mo96969a().setValue(Boolean.valueOf(false));
            EditViewModel editViewModel = awVar.f123532o;
            if (editViewModel == null) {
                C52711k.m112237a("editViewModel");
            }
            editViewModel.mo97033a(true, false, true);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.aw$ai */
    static final class C49174ai<T> implements C0199s<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C49159aw f123558a;

        C49174ai(C49159aw awVar) {
            this.f123558a = awVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            int i;
            Boolean bool = (Boolean) obj;
            if (bool != null) {
                DmtLoadingLayout dmtLoadingLayout = this.f123558a.f123498C;
                if (dmtLoadingLayout != null) {
                    if (bool.booleanValue()) {
                        i = 0;
                    } else {
                        i = 8;
                    }
                    dmtLoadingLayout.setVisibility(i);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.aw$aj */
    static final class C49175aj<T> implements C0199s<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C49159aw f123559a;

        C49175aj(C49159aw awVar) {
            this.f123559a = awVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            if (bool != null) {
                if (bool.booleanValue()) {
                    C49159aw awVar = this.f123559a;
                    C49395cx cxVar = this.f123559a.f123530m;
                    if (cxVar == null) {
                        C52711k.m112234a();
                    }
                    awVar.mo24409d((C12924i) cxVar);
                } else {
                    C49159aw awVar2 = this.f123559a;
                    C49395cx cxVar2 = this.f123559a.f123530m;
                    if (cxVar2 == null) {
                        C52711k.m112234a();
                    }
                    awVar2.mo24404c((C12924i) cxVar2);
                }
                C49395cx cxVar3 = this.f123559a.f123530m;
                if (cxVar3 != null) {
                    cxVar3.mo97335a(bool.booleanValue());
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.aw$ak */
    static final class C49176ak<T> implements C0199s<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C49159aw f123560a;

        C49176ak(C49159aw awVar) {
            this.f123560a = awVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            if (bool != null) {
                C52711k.m112236a((Object) bool, "it");
                if (bool.booleanValue()) {
                    C49067aa aaVar = this.f123560a.mo97168O().f123741m;
                    if (aaVar != null) {
                        C43535i F = aaVar.mo97095F();
                        if (F != null) {
                            F.mo88626a(C49159aw.m106124a(this.f123560a).infoStickerModel);
                        }
                    }
                } else {
                    C49067aa aaVar2 = this.f123560a.mo97168O().f123741m;
                    if (aaVar2 != null) {
                        C43535i F2 = aaVar2.mo97095F();
                        if (F2 != null) {
                            F2.mo88646b(true, false);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.aw$al */
    public static final class C49177al implements C49397b {

        /* renamed from: a */
        final /* synthetic */ C49159aw f123561a;

        C49177al(C49159aw awVar) {
            this.f123561a = awVar;
        }

        /* renamed from: a */
        public final void mo97199a(boolean z) {
            if (z) {
                C49307bs bsVar = this.f123561a.mo97168O().f123742n;
                if (bsVar != null) {
                    bsVar.mo97275a(false);
                }
            } else {
                C49307bs bsVar2 = this.f123561a.mo97168O().f123742n;
                if (bsVar2 != null) {
                    bsVar2.mo97266H();
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.aw$am */
    public static final class C49178am implements C35607a {

        /* renamed from: a */
        final /* synthetic */ C49159aw f123562a;

        /* renamed from: a */
        public final void mo74012a() {
            this.f123562a.mo97168O().mo74012a();
        }

        public final void cq_() {
            this.f123562a.mo97168O().cq_();
        }

        C49178am(C49159aw awVar) {
            this.f123562a = awVar;
        }

        /* renamed from: a */
        public final void mo74013a(Effect effect, String str) {
            C52711k.m112240b(effect, "effect");
            this.f123562a.mo97168O().mo74013a(effect, str);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.aw$an */
    static final class C49179an extends C52712l implements C52682m<C49548a, Integer, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C49159aw f123563a;

        C49179an(C49159aw awVar) {
            this.f123563a = awVar;
            super(2);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:141:0x02f7, code lost:
            if (r10.mo97051v() != false) goto L_0x02f9;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:156:0x0324, code lost:
            if (r10.mo97025G() != false) goto L_0x0326;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:166:0x0342, code lost:
            if (r10.veAudioRecorderParam.hasRecord() == false) goto L_0x03cd;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:167:0x0346, code lost:
            r10 = r9.f123538u;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:168:0x0348, code lost:
            if (r10 != null) goto L_0x034f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:169:0x034a, code lost:
            p2628d.p2639f.p2641b.C52711k.m112237a("audioEffectViewModel");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:170:0x034f, code lost:
            r10.mo96770a(true);
            r2 = r9.f123532o;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:171:0x0354, code lost:
            if (r2 != null) goto L_0x035b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:172:0x0356, code lost:
            p2628d.p2639f.p2641b.C52711k.m112237a("editViewModel");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:173:0x035b, code lost:
            r2.mo97033a(false, false, false);
            com.p683ss.android.ugc.aweme.shortvideo.edit.C43763r.m96180a("voice", true);
            r9 = r9.f123532o;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:174:0x036a, code lost:
            if (r9 != null) goto L_0x0371;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:175:0x036c, code lost:
            p2628d.p2639f.p2641b.C52711k.m112237a("editViewModel");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:176:0x0371, code lost:
            r9 = r9.mo97035e();
            p2628d.p2639f.p2641b.C52711k.m112240b(r9, "model");
            com.p683ss.android.ugc.aweme.common.C26890h.m65011a("click_voice_modify", com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a().mo47829a("creation_id", r9.creationId).mo47829a("enter_from", "video_edit_page").mo47829a("shoot_way", r9.mShootWay).mo47829a("content_source", com.p683ss.android.ugc.aweme.shortvideo.edit.audioeffect.C43379g.m95124a("content_source", r9)).mo47829a("shoot_entrance", com.p683ss.android.ugc.aweme.shortvideo.edit.audioeffect.C43379g.m95124a("shoot_entrance", r9)).mo47829a("content_type", com.p683ss.android.ugc.aweme.shortvideo.edit.audioeffect.C43379g.m95124a("content_type", r9)).mo47827a("local_time_ms", java.lang.System.currentTimeMillis()).f61491a);
         */
        /* JADX WARNING: Removed duplicated region for block: B:130:0x02c6  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Object invoke(java.lang.Object r9, java.lang.Object r10) {
            /*
                r8 = this;
                com.ss.android.ugc.gamora.jedi.a r9 = (com.p683ss.android.ugc.gamora.jedi.C49548a) r9
                java.lang.Number r10 = (java.lang.Number) r10
                int r10 = r10.intValue()
                java.lang.String r0 = "$receiver"
                p2628d.p2639f.p2641b.C52711k.m112240b(r9, r0)
                com.ss.android.ugc.gamora.editor.aw r9 = r8.f123563a
                com.ss.android.ugc.gamora.editor.EditViewModel r9 = com.p683ss.android.ugc.gamora.editor.C49159aw.m106138b(r9)
                r0 = 0
                r1 = 1
                r2 = 3
                if (r10 == r2) goto L_0x001a
                r2 = 1
                goto L_0x001b
            L_0x001a:
                r2 = 0
            L_0x001b:
                r9.mo97032a(r2)
                switch(r10) {
                    case 1: goto L_0x0537;
                    case 2: goto L_0x04a0;
                    case 3: goto L_0x0499;
                    case 4: goto L_0x045c;
                    case 5: goto L_0x03dd;
                    case 6: goto L_0x02d0;
                    case 7: goto L_0x025c;
                    case 8: goto L_0x0235;
                    case 9: goto L_0x0160;
                    case 10: goto L_0x0115;
                    case 11: goto L_0x010e;
                    case 12: goto L_0x002a;
                    case 13: goto L_0x0023;
                    default: goto L_0x0021;
                }
            L_0x0021:
                goto L_0x0605
            L_0x0023:
                com.ss.android.ugc.gamora.editor.aw r9 = r8.f123563a
                r9.mo97178Y()
                goto L_0x0605
            L_0x002a:
                com.ss.android.ugc.gamora.editor.aw r9 = r8.f123563a
                com.ss.android.ugc.gamora.editor.cx r10 = r9.f123530m
                if (r10 != 0) goto L_0x00e9
                com.ss.android.ugc.gamora.editor.cx r10 = new com.ss.android.ugc.gamora.editor.cx
                r10.<init>()
                r9.f123530m = r10
                android.content.Context r10 = r9.mo24474t()
                if (r10 == 0) goto L_0x0043
                com.bytedance.ies.dmt.ui.widget.DmtLoadingLayout r2 = new com.bytedance.ies.dmt.ui.widget.DmtLoadingLayout
                r2.<init>(r10)
                goto L_0x0044
            L_0x0043:
                r2 = 0
            L_0x0044:
                r9.f123498C = r2
                com.bytedance.ies.dmt.ui.widget.DmtLoadingLayout r10 = r9.f123498C
                if (r10 == 0) goto L_0x004f
                r2 = 8
                r10.setVisibility(r2)
            L_0x004f:
                android.widget.FrameLayout$LayoutParams r10 = new android.widget.FrameLayout$LayoutParams
                r2 = -2
                r10.<init>(r2, r2)
                r2 = 17
                r10.gravity = r2
                android.content.Context r2 = r9.mo24474t()
                if (r2 == 0) goto L_0x006d
                android.content.res.Resources r2 = r2.getResources()
                if (r2 == 0) goto L_0x006d
                r0 = 2131886433(0x7f120161, float:1.9407445E38)
                float r0 = r2.getDimension(r0)
                int r0 = (int) r0
            L_0x006d:
                int r0 = r0 / 2
                r10.bottomMargin = r0
                android.view.View r0 = r9.f33834b
                if (r0 == 0) goto L_0x00e1
                android.view.ViewGroup r0 = (android.view.ViewGroup) r0
                com.bytedance.ies.dmt.ui.widget.DmtLoadingLayout r2 = r9.f123498C
                android.view.View r2 = (android.view.View) r2
                android.view.ViewGroup$LayoutParams r10 = (android.view.ViewGroup.LayoutParams) r10
                r0.addView(r2, r10)
                com.ss.android.ugc.gamora.editor.StatusViewModel r10 = r9.f123505J
                if (r10 != 0) goto L_0x0089
                java.lang.String r0 = "mStatusModel"
                p2628d.p2639f.p2641b.C52711k.m112237a(r0)
            L_0x0089:
                android.arch.lifecycle.r<java.lang.Boolean> r10 = r10.f123269b
                r0 = r9
                android.arch.lifecycle.k r0 = (android.arch.lifecycle.C0184k) r0
                com.ss.android.ugc.gamora.editor.aw$ai r2 = new com.ss.android.ugc.gamora.editor.aw$ai
                r2.<init>(r9)
                android.arch.lifecycle.s r2 = (android.arch.lifecycle.C0199s) r2
                r10.observe(r0, r2)
                r10 = 2132018748(0x7f14063c, float:1.9675811E38)
                com.ss.android.ugc.gamora.editor.cx r2 = r9.f123530m
                if (r2 != 0) goto L_0x00a2
                p2628d.p2639f.p2641b.C52711k.m112234a()
            L_0x00a2:
                com.bytedance.scene.i r2 = (com.bytedance.scene.C12924i) r2
                java.lang.String r3 = "StatusBackgroundScene"
                r9.mo24389a(r10, r2, r3)
                com.ss.android.ugc.gamora.editor.StatusViewModel r10 = r9.f123505J
                if (r10 != 0) goto L_0x00b2
                java.lang.String r2 = "mStatusModel"
                p2628d.p2639f.p2641b.C52711k.m112237a(r2)
            L_0x00b2:
                android.arch.lifecycle.r<java.lang.Boolean> r10 = r10.f123268a
                com.ss.android.ugc.gamora.editor.aw$aj r2 = new com.ss.android.ugc.gamora.editor.aw$aj
                r2.<init>(r9)
                android.arch.lifecycle.s r2 = (android.arch.lifecycle.C0199s) r2
                r10.observe(r0, r2)
                com.ss.android.ugc.gamora.editor.StatusViewModel r10 = r9.f123505J
                if (r10 != 0) goto L_0x00c7
                java.lang.String r2 = "mStatusModel"
                p2628d.p2639f.p2641b.C52711k.m112237a(r2)
            L_0x00c7:
                android.arch.lifecycle.r<java.lang.Boolean> r10 = r10.f123270c
                com.ss.android.ugc.gamora.editor.aw$ak r2 = new com.ss.android.ugc.gamora.editor.aw$ak
                r2.<init>(r9)
                android.arch.lifecycle.s r2 = (android.arch.lifecycle.C0199s) r2
                r10.observe(r0, r2)
                com.ss.android.ugc.gamora.editor.cx r10 = r9.f123530m
                if (r10 == 0) goto L_0x00e9
                com.ss.android.ugc.gamora.editor.aw$al r0 = new com.ss.android.ugc.gamora.editor.aw$al
                r0.<init>(r9)
                com.ss.android.ugc.gamora.editor.cx$b r0 = (com.p683ss.android.ugc.gamora.editor.C49395cx.C49397b) r0
                r10.f123979j = r0
                goto L_0x00e9
            L_0x00e1:
                d.u r9 = new d.u
                java.lang.String r10 = "null cannot be cast to non-null type android.view.ViewGroup"
                r9.<init>(r10)
                throw r9
            L_0x00e9:
                com.ss.android.ugc.gamora.editor.EditViewModel r2 = r9.f123532o
                if (r2 != 0) goto L_0x00f2
                java.lang.String r10 = "editViewModel"
                p2628d.p2639f.p2641b.C52711k.m112237a(r10)
            L_0x00f2:
                r3 = 0
                r4 = 0
                r5 = 0
                r6 = 4
                r7 = 0
                r2.mo97033a(r3, r4, r3)
                com.ss.android.ugc.gamora.editor.StatusViewModel r9 = r9.f123505J
                if (r9 != 0) goto L_0x0103
                java.lang.String r10 = "mStatusModel"
                p2628d.p2639f.p2641b.C52711k.m112237a(r10)
            L_0x0103:
                android.arch.lifecycle.r<java.lang.Boolean> r9 = r9.f123268a
                java.lang.Boolean r10 = java.lang.Boolean.valueOf(r1)
                r9.setValue(r10)
                goto L_0x0605
            L_0x010e:
                com.ss.android.ugc.gamora.editor.aw r9 = r8.f123563a
                r9.mo97194c(r1)
                goto L_0x0605
            L_0x0115:
                com.ss.android.ugc.gamora.editor.aw r9 = r8.f123563a
                com.ss.android.ugc.aweme.port.in.ak r10 = com.p683ss.android.ugc.aweme.port.p2082in.C39630m.m88234a()
                com.ss.android.ugc.aweme.port.in.az r10 = r10.mo58605c()
                android.app.Activity r2 = r9.f33840g_
                if (r2 != 0) goto L_0x0126
                p2628d.p2639f.p2641b.C52711k.m112234a()
            L_0x0126:
                java.lang.String r3 = "activity!!"
                p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)
                android.content.Context r2 = (android.content.Context) r2
                int r10 = r10.mo49440c(r2)
                if (r10 != 0) goto L_0x0138
                r9.mo97183aa()
                goto L_0x0605
            L_0x0138:
                com.ss.android.ugc.aweme.port.in.u r10 = com.p683ss.android.ugc.aweme.port.p2082in.C39629l.m88232a()
                com.ss.android.ugc.aweme.port.in.w r10 = r10.mo58572c()
                android.app.Activity r2 = r9.f33840g_
                if (r2 == 0) goto L_0x0158
                android.support.v4.app.FragmentActivity r2 = (android.support.p030v4.app.FragmentActivity) r2
                com.ss.android.ugc.gamora.editor.aw$f r3 = new com.ss.android.ugc.gamora.editor.aw$f
                r3.<init>(r9)
                com.ss.android.ugc.aweme.port.in.w$a r3 = (com.p683ss.android.ugc.aweme.port.p2082in.C39645w.C39646a) r3
                java.lang.String[] r9 = new java.lang.String[r1]
                java.lang.String r1 = "android.permission.RECORD_AUDIO"
                r9[r0] = r1
                r10.mo49436a(r2, r3, r9)
                goto L_0x0605
            L_0x0158:
                d.u r9 = new d.u
                java.lang.String r10 = "null cannot be cast to non-null type android.support.v4.app.FragmentActivity"
                r9.<init>(r10)
                throw r9
            L_0x0160:
                com.ss.android.ugc.gamora.editor.aw r9 = r8.f123563a
                com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r10 = r9.f123534q
                if (r10 != 0) goto L_0x016b
                java.lang.String r0 = "mModel"
                p2628d.p2639f.p2641b.C52711k.m112237a(r0)
            L_0x016b:
                boolean r10 = r10.autoEnhanceOn
                r10 = r10 ^ r1
                com.ss.android.ugc.gamora.editor.EditToolbarViewModel r0 = r9.f123533p
                if (r0 != 0) goto L_0x0177
                java.lang.String r2 = "toolbarViewModel"
                p2628d.p2639f.p2641b.C52711k.m112237a(r2)
            L_0x0177:
                if (r10 == 0) goto L_0x018f
                android.app.Activity r2 = r9.f33840g_
                if (r2 != 0) goto L_0x0180
                p2628d.p2639f.p2641b.C52711k.m112234a()
            L_0x0180:
                android.content.Context r2 = (android.content.Context) r2
                r3 = 2131951801(0x7f1300b9, float:1.9540027E38)
                android.graphics.drawable.Drawable r2 = android.support.p030v4.content.C0726c.m2091a(r2, r3)
                if (r2 != 0) goto L_0x01a4
                p2628d.p2639f.p2641b.C52711k.m112234a()
                goto L_0x01a4
            L_0x018f:
                android.app.Activity r2 = r9.f33840g_
                if (r2 != 0) goto L_0x0196
                p2628d.p2639f.p2641b.C52711k.m112234a()
            L_0x0196:
                android.content.Context r2 = (android.content.Context) r2
                r3 = 2131951799(0x7f1300b7, float:1.9540023E38)
                android.graphics.drawable.Drawable r2 = android.support.p030v4.content.C0726c.m2091a(r2, r3)
                if (r2 != 0) goto L_0x01a4
                p2628d.p2639f.p2641b.C52711k.m112234a()
            L_0x01a4:
                java.lang.String r3 = "if (toStatus)\n          …c_auto_enhance_off_new)!!"
                p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)
                r0.mo97013b(r2)
                com.ss.android.ugc.gamora.editor.EditAutoEnhanceViewModel r0 = r9.f123541x
                if (r0 != 0) goto L_0x01b5
                java.lang.String r2 = "autoEnhanceViewModel"
                p2628d.p2639f.p2641b.C52711k.m112237a(r2)
            L_0x01b5:
                r0.mo96786a(r10)
                com.ss.android.ugc.gamora.editor.EditToolbarViewModel r10 = r9.f123533p
                if (r10 != 0) goto L_0x01c1
                java.lang.String r0 = "toolbarViewModel"
                p2628d.p2639f.p2641b.C52711k.m112237a(r0)
            L_0x01c1:
                r10.mo97018e()
                com.ss.android.ugc.gamora.editor.EditViewModel r9 = r9.f123532o
                if (r9 != 0) goto L_0x01cd
                java.lang.String r10 = "editViewModel"
                p2628d.p2639f.p2641b.C52711k.m112237a(r10)
            L_0x01cd:
                com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r9 = r9.mo97035e()
                java.lang.String r10 = "model"
                p2628d.p2639f.p2641b.C52711k.m112240b(r9, r10)
                java.lang.String r10 = "click_quality_improve"
                com.ss.android.ugc.aweme.app.f.d r0 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
                java.lang.String r2 = "creation_id"
                java.lang.String r3 = r9.creationId
                com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47829a(r2, r3)
                java.lang.String r2 = "shoot_way"
                java.lang.String r3 = r9.mShootWay
                com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47829a(r2, r3)
                java.lang.String r2 = "content_source"
                com.ss.android.ugc.aweme.shortvideo.model.AVETParameter r3 = r9.getAvetParameter()
                java.lang.String r3 = r3.getContentSource()
                com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47829a(r2, r3)
                java.lang.String r2 = "content_type"
                com.ss.android.ugc.aweme.shortvideo.model.AVETParameter r3 = r9.getAvetParameter()
                java.lang.String r3 = r3.getContentType()
                com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47829a(r2, r3)
                java.lang.String r2 = "enter_from"
                java.lang.String r3 = "video_edit_page"
                com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47829a(r2, r3)
                java.lang.String r2 = "to_status"
                boolean r3 = r9.autoEnhanceOn
                if (r3 == 0) goto L_0x0219
                java.lang.String r3 = "on"
                goto L_0x021b
            L_0x0219:
                java.lang.String r3 = "off"
            L_0x021b:
                com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47829a(r2, r3)
                java.lang.String r2 = "improve_method"
                int r9 = r9.autoEnhanceType
                if (r9 != r1) goto L_0x0228
                java.lang.String r9 = "light"
                goto L_0x022a
            L_0x0228:
                java.lang.String r9 = "hdr"
            L_0x022a:
                com.ss.android.ugc.aweme.app.f.d r9 = r0.mo47829a(r2, r9)
                java.util.Map<java.lang.String, java.lang.String> r9 = r9.f61491a
                com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r10, r9)
                goto L_0x0605
            L_0x0235:
                com.ss.android.ugc.gamora.editor.aw r9 = r8.f123563a
                com.ss.android.ugc.gamora.editor.EditStickerViewModel r10 = r9.f123540w
                if (r10 != 0) goto L_0x0240
                java.lang.String r1 = "stickerViewModel"
                p2628d.p2639f.p2641b.C52711k.m112237a(r1)
            L_0x0240:
                android.arch.lifecycle.r r10 = r10.mo96968g()
                java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
                r10.setValue(r1)
                r9.mo97193b(r0)
                com.ss.android.ugc.gamora.editor.EditToolbarViewModel r9 = r9.f123533p
                if (r9 != 0) goto L_0x0257
                java.lang.String r10 = "toolbarViewModel"
                p2628d.p2639f.p2641b.C52711k.m112237a(r10)
            L_0x0257:
                r9.mo97018e()
                goto L_0x0605
            L_0x025c:
                com.ss.android.ugc.gamora.editor.aw r9 = r8.f123563a
                com.ss.android.ugc.gamora.editor.EditStickerViewModel r10 = r9.f123540w
                if (r10 != 0) goto L_0x0267
                java.lang.String r1 = "stickerViewModel"
                p2628d.p2639f.p2641b.C52711k.m112237a(r1)
            L_0x0267:
                android.arch.lifecycle.r r10 = r10.mo96968g()
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                r10.setValue(r0)
                com.ss.android.ugc.gamora.editor.EditViewModel r10 = r9.f123532o
                if (r10 != 0) goto L_0x027b
                java.lang.String r10 = "editViewModel"
                p2628d.p2639f.p2641b.C52711k.m112237a(r10)
            L_0x027b:
                boolean r10 = com.p683ss.android.ugc.gamora.editor.EditViewModel.m105818D()
                if (r10 == 0) goto L_0x02b2
                com.ss.android.ugc.gamora.editor.EditViewModel r10 = r9.f123532o
                if (r10 != 0) goto L_0x028a
                java.lang.String r0 = "editViewModel"
                p2628d.p2639f.p2641b.C52711k.m112237a(r0)
            L_0x028a:
                boolean r10 = r10.mo97050u()
                if (r10 != 0) goto L_0x02b2
                com.ss.android.ugc.gamora.editor.EditViewModel r10 = r9.f123532o
                if (r10 != 0) goto L_0x0299
                java.lang.String r0 = "editViewModel"
                p2628d.p2639f.p2641b.C52711k.m112237a(r0)
            L_0x0299:
                boolean r10 = r10.mo97051v()
                if (r10 != 0) goto L_0x02b2
                com.ss.android.ugc.gamora.editor.EditViewModel r10 = r9.f123532o
                if (r10 != 0) goto L_0x02a8
                java.lang.String r0 = "editViewModel"
                p2628d.p2639f.p2641b.C52711k.m112237a(r0)
            L_0x02a8:
                boolean r10 = r10.mo97052w()
                if (r10 != 0) goto L_0x02b2
                r9.mo97179Z()
                goto L_0x02c2
            L_0x02b2:
                com.ss.android.ugc.gamora.editor.ck r10 = r9.mo97170Q()
                com.bytedance.scene.i r10 = (com.bytedance.scene.C12924i) r10
                r9.mo24409d(r10)
                com.ss.android.ugc.gamora.editor.ck r10 = r9.mo97170Q()
                r10.mo97301F()
            L_0x02c2:
                com.ss.android.ugc.gamora.editor.EditToolbarViewModel r9 = r9.f123533p
                if (r9 != 0) goto L_0x02cb
                java.lang.String r10 = "toolbarViewModel"
                p2628d.p2639f.p2641b.C52711k.m112237a(r10)
            L_0x02cb:
                r9.mo97018e()
                goto L_0x0605
            L_0x02d0:
                com.ss.android.ugc.gamora.editor.aw r9 = r8.f123563a
                com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.i r10 = r9.mo97166M()
                com.bytedance.scene.i r10 = (com.bytedance.scene.C12924i) r10
                r9.mo24409d(r10)
                com.ss.android.ugc.gamora.editor.EditViewModel r10 = r9.f123532o
                if (r10 != 0) goto L_0x02e4
                java.lang.String r0 = "editViewModel"
                p2628d.p2639f.p2641b.C52711k.m112237a(r0)
            L_0x02e4:
                boolean r10 = r10.mo97049t()
                if (r10 == 0) goto L_0x02f9
                com.ss.android.ugc.gamora.editor.EditViewModel r10 = r9.f123532o
                if (r10 != 0) goto L_0x02f3
                java.lang.String r0 = "editViewModel"
                p2628d.p2639f.p2641b.C52711k.m112237a(r0)
            L_0x02f3:
                boolean r10 = r10.mo97051v()
                if (r10 == 0) goto L_0x0326
            L_0x02f9:
                com.ss.android.ugc.gamora.editor.EditViewModel r10 = r9.f123532o
                if (r10 != 0) goto L_0x0302
                java.lang.String r0 = "editViewModel"
                p2628d.p2639f.p2641b.C52711k.m112237a(r0)
            L_0x0302:
                boolean r10 = r10.mo97053x()
                if (r10 != 0) goto L_0x0326
                com.ss.android.ugc.gamora.editor.EditViewModel r10 = r9.f123532o
                if (r10 != 0) goto L_0x0311
                java.lang.String r0 = "editViewModel"
                p2628d.p2639f.p2641b.C52711k.m112237a(r0)
            L_0x0311:
                boolean r10 = r10.mo97050u()
                if (r10 != 0) goto L_0x0326
                com.ss.android.ugc.gamora.editor.EditViewModel r10 = r9.f123532o
                if (r10 != 0) goto L_0x0320
                java.lang.String r0 = "editViewModel"
                p2628d.p2639f.p2641b.C52711k.m112237a(r0)
            L_0x0320:
                boolean r10 = r10.mo97025G()
                if (r10 == 0) goto L_0x0346
            L_0x0326:
                com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r10 = r9.f123534q
                if (r10 != 0) goto L_0x032f
                java.lang.String r0 = "mModel"
                p2628d.p2639f.p2641b.C52711k.m112237a(r0)
            L_0x032f:
                com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam r10 = r10.veAudioRecorderParam
                if (r10 == 0) goto L_0x03cd
                com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r10 = r9.f123534q
                if (r10 != 0) goto L_0x033c
                java.lang.String r0 = "mModel"
                p2628d.p2639f.p2641b.C52711k.m112237a(r0)
            L_0x033c:
                com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam r10 = r10.veAudioRecorderParam
                boolean r10 = r10.hasRecord()
                if (r10 != 0) goto L_0x0346
                goto L_0x03cd
            L_0x0346:
                com.ss.android.ugc.gamora.editor.EditAudioEffectViewModel r10 = r9.f123538u
                if (r10 != 0) goto L_0x034f
                java.lang.String r0 = "audioEffectViewModel"
                p2628d.p2639f.p2641b.C52711k.m112237a(r0)
            L_0x034f:
                r10.mo96770a(r1)
                com.ss.android.ugc.gamora.editor.EditViewModel r2 = r9.f123532o
                if (r2 != 0) goto L_0x035b
                java.lang.String r10 = "editViewModel"
                p2628d.p2639f.p2641b.C52711k.m112237a(r10)
            L_0x035b:
                r3 = 0
                r4 = 0
                r5 = 0
                r6 = 4
                r7 = 0
                r2.mo97033a(r3, r4, r3)
                java.lang.String r10 = "voice"
                com.p683ss.android.ugc.aweme.shortvideo.edit.C43763r.m96180a(r10, r1)
                com.ss.android.ugc.gamora.editor.EditViewModel r9 = r9.f123532o
                if (r9 != 0) goto L_0x0371
                java.lang.String r10 = "editViewModel"
                p2628d.p2639f.p2641b.C52711k.m112237a(r10)
            L_0x0371:
                com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r9 = r9.mo97035e()
                java.lang.String r10 = "model"
                p2628d.p2639f.p2641b.C52711k.m112240b(r9, r10)
                java.lang.String r10 = "click_voice_modify"
                com.ss.android.ugc.aweme.app.f.d r0 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
                java.lang.String r1 = "creation_id"
                java.lang.String r2 = r9.creationId
                com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47829a(r1, r2)
                java.lang.String r1 = "enter_from"
                java.lang.String r2 = "video_edit_page"
                com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47829a(r1, r2)
                java.lang.String r1 = "shoot_way"
                java.lang.String r2 = r9.mShootWay
                com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47829a(r1, r2)
                java.lang.String r1 = "content_source"
                java.lang.String r2 = "content_source"
                java.lang.String r2 = com.p683ss.android.ugc.aweme.shortvideo.edit.audioeffect.C43379g.m95124a(r2, r9)
                com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47829a(r1, r2)
                java.lang.String r1 = "shoot_entrance"
                java.lang.String r2 = "shoot_entrance"
                java.lang.String r2 = com.p683ss.android.ugc.aweme.shortvideo.edit.audioeffect.C43379g.m95124a(r2, r9)
                com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47829a(r1, r2)
                java.lang.String r1 = "content_type"
                java.lang.String r2 = "content_type"
                java.lang.String r9 = com.p683ss.android.ugc.aweme.shortvideo.edit.audioeffect.C43379g.m95124a(r2, r9)
                com.ss.android.ugc.aweme.app.f.d r9 = r0.mo47829a(r1, r9)
                java.lang.String r0 = "local_time_ms"
                long r1 = java.lang.System.currentTimeMillis()
                com.ss.android.ugc.aweme.app.f.d r9 = r9.mo47827a(r0, r1)
                java.util.Map<java.lang.String, java.lang.String> r9 = r9.f61491a
                com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r10, r9)
                goto L_0x0605
            L_0x03cd:
                android.app.Activity r9 = r9.f33840g_
                android.content.Context r9 = (android.content.Context) r9
                r10 = 2132543525(0x7f1c0825, float:2.0740186E38)
                com.bytedance.ies.dmt.ui.d.a r9 = com.bytedance.ies.dmt.p664ui.p668d.C10691a.m21542b(r9, r10)
                r9.mo19066a()
                goto L_0x0605
            L_0x03dd:
                com.ss.android.ugc.gamora.editor.aw r9 = r8.f123563a
                com.ss.android.ugc.gamora.editor.s r10 = r9.mo97167N()
                com.bytedance.scene.i r10 = (com.bytedance.scene.C12924i) r10
                r9.mo24409d(r10)
                com.ss.android.ugc.gamora.editor.EditFilterViewModel r10 = r9.f123539v
                if (r10 != 0) goto L_0x03f1
                java.lang.String r0 = "filterViewModel"
                p2628d.p2639f.p2641b.C52711k.m112237a(r0)
            L_0x03f1:
                com.ss.android.ugc.gamora.editor.EditFilterViewModel$c r0 = com.p683ss.android.ugc.gamora.editor.EditFilterViewModel.C48945c.f123124a
                d.f.a.b r0 = (p2628d.p2639f.p2640a.C52671b) r0
                r10.mo22530c(r0)
                com.ss.android.ugc.gamora.editor.EditViewModel r1 = r9.f123532o
                if (r1 != 0) goto L_0x0401
                java.lang.String r10 = "editViewModel"
                p2628d.p2639f.p2641b.C52711k.m112237a(r10)
            L_0x0401:
                r2 = 0
                r3 = 0
                r4 = 0
                r5 = 4
                r6 = 0
                r1.mo97033a(r2, r3, r2)
                com.ss.android.ugc.gamora.editor.EditViewModel r9 = r9.f123532o
                if (r9 != 0) goto L_0x0412
                java.lang.String r10 = "editViewModel"
                p2628d.p2639f.p2641b.C52711k.m112237a(r10)
            L_0x0412:
                com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r9 = r9.mo97035e()
                java.lang.String r10 = "model"
                p2628d.p2639f.p2641b.C52711k.m112240b(r9, r10)
                java.lang.String r10 = "click_modify_entrance"
                com.ss.android.ugc.aweme.app.f.d r0 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
                java.lang.String r1 = "creation_id"
                java.lang.String r2 = r9.creationId
                com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47829a(r1, r2)
                java.lang.String r1 = "shoot_way"
                java.lang.String r2 = r9.mShootWay
                com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47829a(r1, r2)
                java.lang.String r1 = "content_type"
                java.lang.String r2 = com.p683ss.android.ugc.aweme.shortvideo.edit.C43434az.m95202a(r9)
                com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47829a(r1, r2)
                java.lang.String r1 = "content_source"
                java.lang.String r9 = com.p683ss.android.ugc.aweme.shortvideo.edit.C43434az.m95207b(r9)
                com.ss.android.ugc.aweme.app.f.d r9 = r0.mo47829a(r1, r9)
                java.lang.String r0 = "enter_from"
                java.lang.String r1 = "video_edit_page"
                com.ss.android.ugc.aweme.app.f.d r9 = r9.mo47829a(r0, r1)
                java.lang.String r0 = "scene_id"
                java.lang.String r1 = "1004"
                com.ss.android.ugc.aweme.app.f.d r9 = r9.mo47829a(r0, r1)
                java.util.Map<java.lang.String, java.lang.String> r9 = r9.f61491a
                com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r10, r9)
                goto L_0x0605
            L_0x045c:
                com.ss.android.ugc.gamora.editor.aw r9 = r8.f123563a
                com.ss.android.ugc.gamora.editor.bh r10 = r9.mo97168O()
                com.ss.android.ugc.gamora.editor.aa r10 = r10.f123741m
                if (r10 != 0) goto L_0x0475
                com.ss.android.ugc.gamora.editor.EditToolbarViewModel r9 = r9.f123533p
                if (r9 != 0) goto L_0x046f
                java.lang.String r10 = "toolbarViewModel"
                p2628d.p2639f.p2641b.C52711k.m112237a(r10)
            L_0x046f:
                r10 = 4
                r9.mo97019e(r10, r0)
                goto L_0x0605
            L_0x0475:
                com.ss.android.ugc.gamora.editor.EditStickerPanelViewModel r10 = r9.f123537t
                if (r10 != 0) goto L_0x047e
                java.lang.String r0 = "stickerPanelViewModel"
                p2628d.p2639f.p2641b.C52711k.m112237a(r0)
            L_0x047e:
                r10.mo96953a(r1)
                com.ss.android.ugc.gamora.editor.EditViewModel r2 = r9.f123532o
                if (r2 != 0) goto L_0x048a
                java.lang.String r9 = "editViewModel"
                p2628d.p2639f.p2641b.C52711k.m112237a(r9)
            L_0x048a:
                r3 = 0
                r4 = 0
                r5 = 0
                r6 = 4
                r7 = 0
                r2.mo97033a(r3, r4, r3)
                java.lang.String r9 = "sticker"
                com.p683ss.android.ugc.aweme.shortvideo.edit.C43763r.m96180a(r9, r1)
                goto L_0x0605
            L_0x0499:
                com.ss.android.ugc.gamora.editor.aw r9 = r8.f123563a
                r9.mo97177X()
                goto L_0x0605
            L_0x04a0:
                com.ss.android.ugc.gamora.editor.aw r9 = r8.f123563a
                r9.mo97195d(r0)
                com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r10 = r9.f123534q
                if (r10 != 0) goto L_0x04ae
                java.lang.String r0 = "mModel"
                p2628d.p2639f.p2641b.C52711k.m112237a(r0)
            L_0x04ae:
                boolean r10 = r10.isMultiVideoEdit()
                if (r10 == 0) goto L_0x04d7
                com.ss.android.ugc.aweme.effect.f.a r10 = r9.mo97169P()
                com.ss.android.ugc.gamora.editor.EditViewModel r0 = r9.f123532o
                if (r0 != 0) goto L_0x04c1
                java.lang.String r2 = "editViewModel"
                p2628d.p2639f.p2641b.C52711k.m112237a(r2)
            L_0x04c1:
                android.arch.lifecycle.r r0 = r0.mo97038h()
                java.lang.Object r0 = r0.getValue()
                if (r0 != 0) goto L_0x04ce
                p2628d.p2639f.p2641b.C52711k.m112234a()
            L_0x04ce:
                com.ss.android.ugc.asve.c.c r0 = (com.p683ss.android.ugc.asve.p1239c.C20347c) r0
                int r0 = r0.mo43071k()
                r10.mo59048d(r0)
            L_0x04d7:
                com.ss.android.ugc.aweme.effect.f.a r10 = r9.mo97169P()
                r10.mo59049f()
                com.ss.android.ugc.gamora.editor.EditViewModel r2 = r9.f123532o
                if (r2 != 0) goto L_0x04e7
                java.lang.String r10 = "editViewModel"
                p2628d.p2639f.p2641b.C52711k.m112237a(r10)
            L_0x04e7:
                r3 = 0
                r4 = 0
                r5 = 0
                r6 = 4
                r7 = 0
                r2.mo97033a(r3, r4, r3)
                java.lang.String r10 = "effect"
                com.p683ss.android.ugc.aweme.shortvideo.edit.C43763r.m96180a(r10, r1)
                com.ss.android.ugc.gamora.editor.EditViewModel r10 = r9.f123532o
                if (r10 != 0) goto L_0x04fd
                java.lang.String r0 = "editViewModel"
                p2628d.p2639f.p2641b.C52711k.m112237a(r0)
            L_0x04fd:
                com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r10 = r10.mo97035e()
                java.lang.String r0 = "model"
                p2628d.p2639f.p2641b.C52711k.m112240b(r10, r0)
                java.lang.String r0 = "click_effect_entrance"
                com.ss.android.ugc.aweme.app.f.d r1 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
                java.lang.String r2 = "creation_id"
                java.lang.String r3 = r10.creationId
                com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47829a(r2, r3)
                java.lang.String r2 = "shoot_way"
                java.lang.String r3 = r10.mShootWay
                com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47829a(r2, r3)
                java.lang.String r2 = "draft_id"
                int r10 = r10.draftId
                com.ss.android.ugc.aweme.app.f.d r10 = r1.mo47826a(r2, r10)
                java.util.Map<java.lang.String, java.lang.String> r10 = r10.f61491a
                com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r0, r10)
                com.ss.android.ugc.gamora.editor.EditToolbarViewModel r9 = r9.f123533p
                if (r9 != 0) goto L_0x0532
                java.lang.String r10 = "toolbarViewModel"
                p2628d.p2639f.p2641b.C52711k.m112237a(r10)
            L_0x0532:
                r9.mo97018e()
                goto L_0x0605
            L_0x0537:
                com.ss.android.ugc.gamora.editor.aw r9 = r8.f123563a
                com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r10 = r9.f123534q
                if (r10 != 0) goto L_0x0542
                java.lang.String r0 = "mModel"
                p2628d.p2639f.p2641b.C52711k.m112237a(r0)
            L_0x0542:
                boolean r10 = r10.isReviewVideo()
                if (r10 == 0) goto L_0x054f
                java.lang.String r9 = "review video does not support changing music"
                com.p683ss.android.ugc.tools.utils.C50203g.m108358a(r9)
                goto L_0x0605
            L_0x054f:
                com.ss.android.ugc.gamora.editor.EditViewModel r10 = r9.f123532o
                if (r10 != 0) goto L_0x0558
                java.lang.String r10 = "editViewModel"
                p2628d.p2639f.p2641b.C52711k.m112237a(r10)
            L_0x0558:
                boolean r10 = com.p683ss.android.ugc.gamora.editor.EditViewModel.m105818D()
                if (r10 == 0) goto L_0x0563
                r9.mo97181a(r1)
                goto L_0x0605
            L_0x0563:
                com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r10 = r9.f123534q
                if (r10 != 0) goto L_0x056c
                java.lang.String r0 = "mModel"
                p2628d.p2639f.p2641b.C52711k.m112237a(r0)
            L_0x056c:
                boolean r10 = r10.isStickPointMode
                if (r10 == 0) goto L_0x0594
                com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r10 = r9.f123534q
                if (r10 != 0) goto L_0x0579
                java.lang.String r0 = "mModel"
                p2628d.p2639f.p2641b.C52711k.m112237a(r0)
            L_0x0579:
                boolean r10 = r10.mIsFromDraft
                if (r10 != 0) goto L_0x0605
                android.app.Activity r10 = r9.f33840g_
                android.content.Context r10 = (android.content.Context) r10
                android.content.res.Resources r9 = r9.mo24478w()
                r0 = 2132549488(0x7f1c1f70, float:2.075228E38)
                java.lang.String r9 = r9.getString(r0)
                com.bytedance.ies.dmt.ui.d.a r9 = com.bytedance.ies.dmt.p664ui.p668d.C10691a.m21537a(r10, r9)
                r9.mo19066a()
                goto L_0x0605
            L_0x0594:
                com.ss.android.ugc.gamora.editor.bh r10 = r9.mo97168O()
                r10.mo97254T()
                com.ss.android.ugc.gamora.editor.EditToolbarViewModel r10 = r9.f123533p
                if (r10 != 0) goto L_0x05a4
                java.lang.String r0 = "toolbarViewModel"
                p2628d.p2639f.p2641b.C52711k.m112237a(r0)
            L_0x05a4:
                r10.mo97018e()
                dmt.av.video.VEVideoPublishEditViewModel r10 = r9.f123531n
                if (r10 != 0) goto L_0x05b0
                java.lang.String r0 = "publishEditViewModel"
                p2628d.p2639f.p2641b.C52711k.m112237a(r0)
            L_0x05b0:
                android.arch.lifecycle.r r10 = r10.mo110466k()
                java.lang.String r0 = "publishEditViewModel.previewControlLiveData"
                p2628d.p2639f.p2641b.C52711k.m112236a(r10, r0)
                dmt.av.video.y r0 = dmt.p2652av.video.C53030y.m112774b()
                r10.setValue(r0)
                com.ss.android.ugc.gamora.editor.ct r10 = r9.f123500E
                if (r10 != 0) goto L_0x05c9
                java.lang.String r0 = "musicController"
                p2628d.p2639f.p2641b.C52711k.m112237a(r0)
            L_0x05c9:
                r10.mo97119c()
                com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r9 = r9.f123534q
                if (r9 != 0) goto L_0x05d5
                java.lang.String r10 = "mModel"
                p2628d.p2639f.p2641b.C52711k.m112237a(r10)
            L_0x05d5:
                java.lang.String r10 = "model"
                p2628d.p2639f.p2641b.C52711k.m112240b(r9, r10)
                java.lang.String r10 = "change_music"
                com.ss.android.ugc.aweme.app.f.d r0 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
                java.lang.String r1 = "creation_id"
                java.lang.String r2 = r9.creationId
                com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47829a(r1, r2)
                java.lang.String r1 = "shoot_way"
                java.lang.String r2 = r9.mShootWay
                com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47829a(r1, r2)
                java.lang.String r1 = "draft_id"
                int r9 = r9.draftId
                com.ss.android.ugc.aweme.app.f.d r9 = r0.mo47826a(r1, r9)
                java.lang.String r0 = "enter_from"
                java.lang.String r1 = "video_edit_page"
                com.ss.android.ugc.aweme.app.f.d r9 = r9.mo47829a(r0, r1)
                java.util.Map<java.lang.String, java.lang.String> r9 = r9.f61491a
                com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r10, r9)
            L_0x0605:
                d.x r9 = p2628d.C52860x.f131107a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.gamora.editor.C49159aw.C49179an.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.aw$ao */
    static final class C49180ao extends C52712l implements C52670a<C49099al> {

        /* renamed from: a */
        final /* synthetic */ C49159aw f123564a;

        C49180ao(C49159aw awVar) {
            this.f123564a = awVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C49099al alVar = new C49099al();
            C49098ak akVar = this.f123564a;
            C52711k.m112240b(akVar, "<set-?>");
            alVar.f123395o = akVar;
            this.f123564a.mo24389a((int) R.id.b_k, (C12924i) alVar, "EditMusicCutScene");
            return alVar;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.aw$ap */
    static final class C49181ap extends C52712l implements C52670a<C49115am> {

        /* renamed from: a */
        final /* synthetic */ C49159aw f123565a;

        C49181ap(C49159aw awVar) {
            this.f123565a = awVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C49115am amVar = new C49115am();
            C49159aw awVar = this.f123565a;
            VideoPublishEditModel videoPublishEditModel = awVar.f123534q;
            if (videoPublishEditModel == null) {
                C52711k.m112237a("mModel");
            }
            C52711k.m112240b(videoPublishEditModel, "model");
            amVar.f123422j = videoPublishEditModel;
            C24458h wVar = new C49222w(awVar);
            C52711k.m112240b(wVar, "transitionListener");
            C44342a G = amVar.mo97138G();
            C52711k.m112240b(wVar, "transitionListener");
            G.f112228m = wVar;
            amVar.f123424l = new C49223x(awVar, amVar);
            this.f123565a.mo24389a((int) R.id.b_k, (C12924i) amVar, "MusicScene");
            return amVar;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.aw$aq */
    public static final class C49182aq implements C44015a {

        /* renamed from: a */
        final /* synthetic */ C49159aw f123566a;

        /* renamed from: b */
        final /* synthetic */ boolean f123567b;

        /* renamed from: c */
        final /* synthetic */ boolean f123568c;

        /* renamed from: d */
        final /* synthetic */ Runnable f123569d;

        public C49182aq(C49159aw awVar, boolean z, boolean z2, Runnable runnable) {
            this.f123566a = awVar;
            this.f123567b = z;
            this.f123568c = z2;
            this.f123569d = runnable;
        }

        /* renamed from: a */
        public final void mo86777a() {
            this.f123566a.mo97182a(false, this.f123567b, this.f123568c, this.f123569d, true);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.aw$ar */
    public static final class C49183ar<TTaskResult, TContinuationResult> implements C0011g<TResult, TContinuationResult> {

        /* renamed from: a */
        final /* synthetic */ C49159aw f123570a;

        /* renamed from: b */
        final /* synthetic */ boolean f123571b;

        /* renamed from: c */
        final /* synthetic */ boolean f123572c;

        /* renamed from: d */
        final /* synthetic */ Runnable f123573d;

        public C49183ar(C49159aw awVar, boolean z, boolean z2, Runnable runnable) {
            this.f123570a = awVar;
            this.f123571b = z;
            this.f123572c = z2;
            this.f123573d = runnable;
        }

        public final /* synthetic */ Object then(C0013i iVar) {
            final List list;
            String sb;
            C20347c ag = this.f123570a.mo97189ag();
            if (ag != null) {
                InfoStickerModel infoStickerModel = C49159aw.m106124a(this.f123570a).infoStickerModel;
                C52711k.m112240b(ag, "mVEEditor");
                list = new ArrayList();
                if (infoStickerModel != null && !C9414h.m18630a(infoStickerModel.stickers)) {
                    for (StickerItemModel stickerItemModel : infoStickerModel.stickers) {
                        if (stickerItemModel != null && !stickerItemModel.isSubtitle() && !stickerItemModel.isSubtitleRule()) {
                            if (C48016e.m103944b(stickerItemModel.path)) {
                                sb = stickerItemModel.path;
                            } else {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append(infoStickerModel.infoStickerDraftDir);
                                sb2.append(File.separator);
                                sb2.append(new File(stickerItemModel.path).getName());
                                sb = sb2.toString();
                            }
                            String str = sb;
                            if (!C48016e.m103944b(str)) {
                                StringBuilder sb3 = new StringBuilder("infoSticker not exist ");
                                sb3.append(stickerItemModel);
                                C32458a.m75148a((Throwable) new Exception(sb3.toString()));
                            } else if (stickerItemModel.isImageStickerLayer) {
                                C52711k.m112236a((Object) str, LeakCanaryFileProvider.f132050j);
                                int b = ag.mo43034b(str, 0.0f, 0.0f, 1.0f, 1.7777778f);
                                StringBuilder sb4 = new StringBuilder("changeInfoSticker id = ");
                                sb4.append(b);
                                C50203g.m108363d(sb4.toString());
                                if (b != -1) {
                                    ag.mo42969a(b, stickerItemModel.currentOffsetX, stickerItemModel.currentOffsetY);
                                    ag.mo43026b(b, stickerItemModel.scale);
                                    ag.mo42968a(b, -stickerItemModel.rotateAngle);
                                    ag.mo43029b(b, stickerItemModel.startTime, stickerItemModel.endTime);
                                    ag.mo43055e(b, stickerItemModel.layerWeight);
                                    list.add(Integer.valueOf(b));
                                }
                            }
                        }
                    }
                }
            } else {
                list = null;
            }
            new C44002b(this.f123570a.mo97189ag(), C49159aw.m106124a(this.f123570a).statusCreateVideoData.getVideoCoverImgPath(), C49159aw.m106124a(this.f123570a).statusCreateVideoData.getVideoCoverStartTime(), new C44015a(this) {

                /* renamed from: a */
                final /* synthetic */ C49183ar f123574a;

                {
                    this.f123574a = r1;
                }

                /* renamed from: a */
                public final void mo86777a() {
                    List<Number> list = list;
                    if (list != null) {
                        for (Number intValue : list) {
                            int intValue2 = intValue.intValue();
                            C20347c ag = this.f123574a.f123570a.mo97189ag();
                            if (ag != null) {
                                ag.mo43058f(intValue2);
                            }
                        }
                    }
                    this.f123574a.f123570a.mo97182a(false, this.f123574a.f123571b, this.f123574a.f123572c, this.f123574a.f123573d, false);
                }
            });
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.aw$as */
    static final class C49185as<T> implements C0199s<Void> {

        /* renamed from: a */
        final /* synthetic */ C49159aw f123576a;

        C49185as(C49159aw awVar) {
            this.f123576a = awVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Void voidR = (Void) obj;
            C32458a.m75144a("receive FirstFrameVisible event in edit page");
            C49159aw awVar = this.f123576a;
            awVar.mo24409d((C12924i) awVar.mo97164K());
            awVar.mo24409d((C12924i) awVar.mo97165L());
            awVar.mo24409d((C12924i) awVar.mo97163J());
            awVar.mo24409d((C12924i) awVar.mo97168O());
            this.f123576a.mo97174U();
            this.f123576a.mo97175V();
            this.f123576a.mo97176W();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.aw$at */
    public static final class C49186at implements Callable<Pair<Integer, C43203d>> {

        /* renamed from: a */
        final /* synthetic */ C49159aw f123577a;

        /* renamed from: b */
        final /* synthetic */ String f123578b;

        /* renamed from: c */
        final /* synthetic */ int f123579c;

        /* renamed from: d */
        final /* synthetic */ int f123580d;

        /* renamed from: e */
        final /* synthetic */ boolean f123581e;

        public final /* synthetic */ Object call() {
            if (C49159aw.m106138b(this.f123577a).mo97038h().getValue() == null) {
                return null;
            }
            Object value = C49159aw.m106138b(this.f123577a).mo97038h().getValue();
            if (value == null) {
                C52711k.m112234a();
            }
            int a = ((C20347c) value).mo42999a(this.f123578b, this.f123579c, this.f123580d);
            Object value2 = C49159aw.m106138b(this.f123577a).mo97038h().getValue();
            if (value2 == null) {
                C52711k.m112234a();
            }
            ((C20347c) value2).mo43085r();
            if (a < 0 || !this.f123581e) {
                return new Pair(Integer.valueOf(a), null);
            }
            return new Pair(Integer.valueOf(a), C43191e.f109217h.mo87803a(this.f123578b, true, null));
        }

        C49186at(C49159aw awVar, String str, int i, int i2, boolean z) {
            this.f123577a = awVar;
            this.f123578b = str;
            this.f123579c = i;
            this.f123580d = i2;
            this.f123581e = z;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.aw$au */
    public static final class C49187au implements C0011g<Pair<Integer, C43203d>, Void> {

        /* renamed from: a */
        final /* synthetic */ C49159aw f123582a;

        /* renamed from: b */
        final /* synthetic */ String f123583b;

        /* renamed from: c */
        final /* synthetic */ boolean f123584c;

        /* renamed from: d */
        final /* synthetic */ int f123585d;

        /* renamed from: e */
        final /* synthetic */ int f123586e;

        /* JADX WARNING: Removed duplicated region for block: B:41:0x00f6  */
        /* JADX WARNING: Removed duplicated region for block: B:44:0x0107  */
        /* JADX WARNING: Removed duplicated region for block: B:59:0x01ba  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Object then(p001a.C0013i r7) {
            /*
                r6 = this;
                com.ss.android.ugc.gamora.editor.aw r0 = r6.f123582a
                r0.mo97190ah()
                r0 = 0
                if (r7 != 0) goto L_0x0009
                return r0
            L_0x0009:
                java.lang.Object r1 = r7.mo34e()
                android.util.Pair r1 = (android.util.Pair) r1
                boolean r2 = r7.mo33d()
                if (r2 != 0) goto L_0x01c2
                boolean r7 = r7.mo31c()
                if (r7 != 0) goto L_0x01c2
                if (r1 == 0) goto L_0x01c2
                java.lang.Object r7 = r1.first
                if (r7 == 0) goto L_0x01c2
                java.lang.Object r7 = r1.first
                java.lang.Number r7 = (java.lang.Number) r7
                int r7 = r7.intValue()
                r2 = 0
                int r7 = p2628d.p2639f.p2641b.C52711k.m112230a(r7, r2)
                if (r7 >= 0) goto L_0x0032
                goto L_0x01c2
            L_0x0032:
                com.ss.android.ugc.gamora.editor.aw r7 = r6.f123582a
                boolean r7 = r7.mo97196e(r2)
                if (r7 == 0) goto L_0x0050
                com.ss.android.ugc.gamora.editor.aw r7 = r6.f123582a
                android.content.Context r7 = r7.mo24473s()
                com.ss.android.ugc.gamora.editor.aw r3 = r6.f123582a
                r4 = 2132546867(0x7f1c1533, float:2.0746964E38)
                java.lang.String r3 = r3.mo24461a(r4)
                com.bytedance.ies.dmt.ui.d.a r7 = com.bytedance.ies.dmt.p664ui.p668d.C10691a.m21537a(r7, r3)
                r7.mo19066a()
            L_0x0050:
                java.lang.Object r7 = r1.second
                com.ss.android.ugc.aweme.shortvideo.d r7 = (com.p683ss.android.ugc.aweme.shortvideo.C43203d) r7
                com.ss.android.ugc.gamora.editor.aw r1 = r6.f123582a
                com.ss.android.ugc.gamora.editor.EditViewModel r1 = com.p683ss.android.ugc.gamora.editor.C49159aw.m106138b(r1)
                android.arch.lifecycle.r r1 = r1.mo97038h()
                java.lang.Object r1 = r1.getValue()
                if (r1 != 0) goto L_0x0065
                return r0
            L_0x0065:
                com.ss.android.ugc.gamora.editor.aw r1 = r6.f123582a
                com.ss.android.ugc.gamora.editor.EditViewModel r1 = com.p683ss.android.ugc.gamora.editor.C49159aw.m106138b(r1)
                android.arch.lifecycle.r r1 = r1.mo97038h()
                java.lang.Object r1 = r1.getValue()
                if (r1 != 0) goto L_0x0078
                p2628d.p2639f.p2641b.C52711k.m112234a()
            L_0x0078:
                com.ss.android.ugc.asve.c.c r1 = (com.p683ss.android.ugc.asve.p1239c.C20347c) r1
                int r1 = r1.mo43071k()
                com.ss.android.ugc.aweme.shortvideo.dh r3 = com.p683ss.android.ugc.aweme.shortvideo.C43214dh.m94817a()
                com.ss.android.ugc.aweme.shortvideo.c r3 = r3.mo50201b()
                if (r3 == 0) goto L_0x00e9
                com.ss.android.ugc.aweme.shortvideo.dh r3 = com.p683ss.android.ugc.aweme.shortvideo.C43214dh.m94817a()
                com.ss.android.ugc.aweme.shortvideo.c r3 = r3.mo50201b()
                if (r3 != 0) goto L_0x0095
                p2628d.p2639f.p2641b.C52711k.m112234a()
            L_0x0095:
                int r3 = r3.getShootDuration()
                if (r3 <= 0) goto L_0x00e9
                java.lang.String r3 = r6.f123583b
                int r3 = com.p683ss.android.ugc.aweme.utils.C47807de.m103443a(r3, r2)
                com.ss.android.ugc.aweme.shortvideo.dh r4 = com.p683ss.android.ugc.aweme.shortvideo.C43214dh.m94817a()
                com.ss.android.ugc.aweme.shortvideo.c r4 = r4.mo50201b()
                if (r4 != 0) goto L_0x00ae
                p2628d.p2639f.p2641b.C52711k.m112234a()
            L_0x00ae:
                int r4 = r4.getShootDuration()
                int r4 = r3 - r4
                int r4 = java.lang.Math.abs(r4)
                r5 = 1000(0x3e8, float:1.401E-42)
                if (r4 < r5) goto L_0x00db
                com.ss.android.ugc.gamora.editor.aw r3 = r6.f123582a
                com.ss.android.ugc.gamora.editor.EditMusicCutViewModel r3 = com.p683ss.android.ugc.gamora.editor.C49159aw.m106140d(r3)
                com.ss.android.ugc.aweme.shortvideo.dh r4 = com.p683ss.android.ugc.aweme.shortvideo.C43214dh.m94817a()
                com.ss.android.ugc.aweme.shortvideo.c r4 = r4.mo50201b()
                if (r4 != 0) goto L_0x00cf
                p2628d.p2639f.p2641b.C52711k.m112234a()
            L_0x00cf:
                int r4 = r4.getShootDuration()
                int r4 = java.lang.Math.min(r1, r4)
                r3.mo96890a(r4)
                goto L_0x00f2
            L_0x00db:
                com.ss.android.ugc.gamora.editor.aw r4 = r6.f123582a
                com.ss.android.ugc.gamora.editor.EditMusicCutViewModel r4 = com.p683ss.android.ugc.gamora.editor.C49159aw.m106140d(r4)
                int r3 = java.lang.Math.min(r1, r3)
                r4.mo96890a(r3)
                goto L_0x00f2
            L_0x00e9:
                com.ss.android.ugc.gamora.editor.aw r3 = r6.f123582a
                com.ss.android.ugc.gamora.editor.EditMusicCutViewModel r3 = com.p683ss.android.ugc.gamora.editor.C49159aw.m106140d(r3)
                r3.mo96890a(r1)
            L_0x00f2:
                boolean r3 = r6.f123584c
                if (r3 == 0) goto L_0x0101
                com.ss.android.ugc.gamora.editor.aw r3 = r6.f123582a
                com.ss.android.ugc.gamora.editor.EditMusicCutViewModel r3 = com.p683ss.android.ugc.gamora.editor.C49159aw.m106140d(r3)
                int r4 = r6.f123585d
                r3.mo96891a(r7, r4, r2)
            L_0x0101:
                com.ss.android.ugc.gamora.editor.aw r7 = r6.f123582a
                android.app.Activity r7 = r7.f33840g_
                if (r7 == 0) goto L_0x01ba
                android.support.v4.app.FragmentActivity r7 = (android.support.p030v4.app.FragmentActivity) r7
                android.arch.lifecycle.y r7 = android.arch.lifecycle.C0214z.m440a(r7)
                java.lang.Class<com.ss.android.ugc.aweme.effect.EditEffectVideoModel> r3 = com.p683ss.android.ugc.aweme.effect.EditEffectVideoModel.class
                android.arch.lifecycle.x r7 = r7.mo359a(r3)
                java.lang.String r3 = "ViewModelProviders.of(ac…ctVideoModel::class.java)"
                p2628d.p2639f.p2641b.C52711k.m112236a(r7, r3)
                com.ss.android.ugc.aweme.effect.EditEffectVideoModel r7 = (com.p683ss.android.ugc.aweme.effect.EditEffectVideoModel) r7
                android.arch.lifecycle.r r7 = r7.mo58846d()
                java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
                r7.setValue(r3)
                com.ss.android.ugc.gamora.editor.aw r7 = r6.f123582a
                com.ss.android.ugc.gamora.editor.EditViewModel r7 = com.p683ss.android.ugc.gamora.editor.C49159aw.m106138b(r7)
                android.arch.lifecycle.r r7 = r7.mo97038h()
                java.lang.Object r7 = r7.getValue()
                com.ss.android.ugc.asve.c.c r7 = (com.p683ss.android.ugc.asve.p1239c.C20347c) r7
                if (r7 == 0) goto L_0x013b
                int r2 = r7.mo42966A()
            L_0x013b:
                com.ss.android.ugc.gamora.editor.aw r7 = r6.f123582a
                android.app.Activity r7 = r7.f33840g_
                if (r7 == 0) goto L_0x01b2
                android.support.v4.app.FragmentActivity r7 = (android.support.p030v4.app.FragmentActivity) r7
                com.ss.android.ugc.gamora.b.c r7 = com.p683ss.android.ugc.gamora.p2458b.C48927d.m105736a(r7)
                java.lang.Class<com.ss.android.ugc.gamora.editor.EditInfoStickerViewModel> r3 = com.p683ss.android.ugc.gamora.editor.EditInfoStickerViewModel.class
                com.bytedance.jedi.arch.JediViewModel r7 = r7.mo96760a(r3)
                java.lang.String r3 = "JediViewModelProviders.o…kerViewModel::class.java)"
                p2628d.p2639f.p2641b.C52711k.m112236a(r7, r3)
                com.ss.android.ugc.gamora.editor.EditInfoStickerViewModel r7 = (com.p683ss.android.ugc.gamora.editor.EditInfoStickerViewModel) r7
                d.n r3 = new d.n
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r3.<init>(r2, r1)
                r7.mo96854a(r3)
                com.ss.android.ugc.gamora.editor.aw r7 = r6.f123582a
                android.arch.lifecycle.h r7 = r7.getLifecycle()
                java.lang.String r1 = "lifecycle"
                p2628d.p2639f.p2641b.C52711k.m112236a(r7, r1)
                android.arch.lifecycle.h$b r7 = r7.mo323a()
                android.arch.lifecycle.h$b r1 = android.arch.lifecycle.C0176h.C0178b.RESUMED
                if (r7 != r1) goto L_0x019c
                com.ss.android.ugc.gamora.editor.aw r7 = r6.f123582a
                dmt.av.video.VEVideoPublishEditViewModel r7 = r7.f123531n
                if (r7 != 0) goto L_0x0182
                java.lang.String r1 = "publishEditViewModel"
                p2628d.p2639f.p2641b.C52711k.m112237a(r1)
            L_0x0182:
                android.arch.lifecycle.r r7 = r7.mo110466k()
                java.lang.String r1 = "publishEditViewModel.previewControlLiveData"
                p2628d.p2639f.p2641b.C52711k.m112236a(r7, r1)
                int r1 = r6.f123586e
                long r1 = (long) r1
                dmt.av.video.y r1 = dmt.p2652av.video.C53030y.m112775b(r1)
                r7.setValue(r1)
                dmt.av.video.y r1 = dmt.p2652av.video.C53030y.m112772a()
                r7.setValue(r1)
            L_0x019c:
                com.ss.android.ugc.gamora.editor.aw r7 = r6.f123582a
                com.ss.android.ugc.gamora.editor.ct r7 = r7.mo97173T()
                com.ss.android.ugc.gamora.editor.aw r1 = r6.f123582a
                com.ss.android.ugc.gamora.editor.EditViewModel r1 = com.p683ss.android.ugc.gamora.editor.C49159aw.m106138b(r1)
                java.lang.String r2 = r6.f123583b
                boolean r1 = r1.mo97034a(r2)
                r7.mo97116a(r1)
                return r0
            L_0x01b2:
                d.u r7 = new d.u
                java.lang.String r0 = "null cannot be cast to non-null type android.support.v4.app.FragmentActivity"
                r7.<init>(r0)
                throw r7
            L_0x01ba:
                d.u r7 = new d.u
                java.lang.String r0 = "null cannot be cast to non-null type android.support.v4.app.FragmentActivity"
                r7.<init>(r0)
                throw r7
            L_0x01c2:
                com.ss.android.ugc.gamora.editor.aw r7 = r6.f123582a
                android.content.Context r7 = r7.mo24473s()
                com.ss.android.ugc.gamora.editor.aw r1 = r6.f123582a
                r2 = 2132546866(0x7f1c1532, float:2.0746962E38)
                java.lang.String r1 = r1.mo24461a(r2)
                com.bytedance.ies.dmt.ui.d.a r7 = com.bytedance.ies.dmt.p664ui.p668d.C10691a.m21545b(r7, r1)
                r7.mo19066a()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.gamora.editor.C49159aw.C49187au.then(a.i):java.lang.Object");
        }

        C49187au(C49159aw awVar, String str, boolean z, int i, int i2) {
            this.f123582a = awVar;
            this.f123583b = str;
            this.f123584c = z;
            this.f123585d = i;
            this.f123586e = i2;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.aw$av */
    static final class C49188av implements C12930k {

        /* renamed from: a */
        final /* synthetic */ C49159aw f123587a;

        C49188av(C49159aw awVar) {
            this.f123587a = awVar;
        }

        /* renamed from: a */
        public final /* synthetic */ C12924i mo24488a(ClassLoader classLoader, String str, Bundle bundle) {
            C52711k.m112240b(classLoader, "<anonymous parameter 0>");
            C52711k.m112240b(str, "<anonymous parameter 1>");
            C49143at atVar = new C49143at();
            C49413cy cyVar = this.f123587a.f123502G;
            if (cyVar == null) {
                C52711k.m112237a("veLifecycleOwner");
            }
            C52711k.m112240b(cyVar, "<set-?>");
            atVar.f123470p = cyVar;
            return atVar;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.aw$aw */
    static final class C49189aw implements C12930k {

        /* renamed from: a */
        final /* synthetic */ C49159aw f123588a;

        C49189aw(C49159aw awVar) {
            this.f123588a = awVar;
        }

        /* renamed from: a */
        public final /* synthetic */ C12924i mo24488a(ClassLoader classLoader, String str, Bundle bundle) {
            C52711k.m112240b(classLoader, "<anonymous parameter 0>");
            C52711k.m112240b(str, "<anonymous parameter 1>");
            C49256bh bhVar = new C49256bh();
            C49527v vVar = this.f123588a.f123501F;
            C52711k.m112240b(vVar, "<set-?>");
            bhVar.f123739k = vVar;
            C49391cu J = this.f123588a.mo97163J();
            C52711k.m112240b(J, "<set-?>");
            bhVar.f123740l = J;
            C49389cs csVar = this.f123588a;
            C52711k.m112240b(csVar, "<set-?>");
            bhVar.f123735R = csVar;
            bhVar.f123731N = new C49271b(this) {

                /* renamed from: a */
                final /* synthetic */ C49189aw f123589a;

                {
                    this.f123589a = r1;
                }
            };
            return bhVar;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.aw$ax */
    static final class C49191ax implements C12930k {

        /* renamed from: a */
        final /* synthetic */ C49159aw f123590a;

        C49191ax(C49159aw awVar) {
            this.f123590a = awVar;
        }

        /* renamed from: a */
        public final /* synthetic */ C12924i mo24488a(ClassLoader classLoader, String str, Bundle bundle) {
            C52711k.m112240b(classLoader, "<anonymous parameter 0>");
            C52711k.m112240b(str, "<anonymous parameter 1>");
            C49528w wVar = new C49528w();
            C49159aw awVar = this.f123590a;
            C49527v vVar = awVar.f123501F;
            C52711k.m112240b(vVar, "<set-?>");
            wVar.f124277o = vVar;
            C49527v vVar2 = wVar.f124277o;
            if (vVar2 == null) {
                C52711k.m112237a("editGestureListenerManager");
            }
            vVar2.mo97459e((C46722b) new C49221v(awVar));
            return wVar;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.aw$ay */
    static final class C49192ay extends C52712l implements C52670a<C49143at> {

        /* renamed from: a */
        final /* synthetic */ C49159aw f123591a;

        C49192ay(C49159aw awVar) {
            this.f123591a = awVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C12924i a = this.f123591a.mo24388a("EditPreviewScene");
            if (a == null) {
                C52711k.m112234a();
            }
            return (C49143at) a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.aw$az */
    public static final class C49193az implements C43196c {

        /* renamed from: a */
        final /* synthetic */ C49159aw f123592a;

        /* renamed from: b */
        final /* synthetic */ int f123593b;

        /* JADX WARNING: Removed duplicated region for block: B:14:0x005e  */
        /* JADX WARNING: Removed duplicated region for block: B:16:0x0065  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo87805a(java.lang.Object r4) {
            /*
                r3 = this;
                com.ss.android.ugc.aweme.shortvideo.dh r0 = com.p683ss.android.ugc.aweme.shortvideo.C43214dh.m94817a()
                com.ss.android.ugc.aweme.shortvideo.c r0 = r0.mo50201b()
                if (r0 == 0) goto L_0x003e
                com.ss.android.ugc.aweme.shortvideo.dh r0 = com.p683ss.android.ugc.aweme.shortvideo.C43214dh.m94817a()
                com.ss.android.ugc.aweme.shortvideo.c r0 = r0.mo50201b()
                if (r0 != 0) goto L_0x0017
                p2628d.p2639f.p2641b.C52711k.m112234a()
            L_0x0017:
                int r0 = r0.getShootDuration()
                if (r0 <= 0) goto L_0x003e
                com.ss.android.ugc.gamora.editor.aw r0 = r3.f123592a
                com.ss.android.ugc.gamora.editor.EditMusicCutViewModel r0 = com.p683ss.android.ugc.gamora.editor.C49159aw.m106140d(r0)
                int r1 = r3.f123593b
                com.ss.android.ugc.aweme.shortvideo.dh r2 = com.p683ss.android.ugc.aweme.shortvideo.C43214dh.m94817a()
                com.ss.android.ugc.aweme.shortvideo.c r2 = r2.mo50201b()
                if (r2 != 0) goto L_0x0032
                p2628d.p2639f.p2641b.C52711k.m112234a()
            L_0x0032:
                int r2 = r2.getShootDuration()
                int r1 = java.lang.Math.min(r1, r2)
                r0.mo96890a(r1)
                goto L_0x0049
            L_0x003e:
                com.ss.android.ugc.gamora.editor.aw r0 = r3.f123592a
                com.ss.android.ugc.gamora.editor.EditMusicCutViewModel r0 = com.p683ss.android.ugc.gamora.editor.C49159aw.m106140d(r0)
                int r1 = r3.f123593b
                r0.mo96890a(r1)
            L_0x0049:
                com.ss.android.ugc.gamora.editor.aw r0 = r3.f123592a
                com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = com.p683ss.android.ugc.gamora.editor.C49159aw.m106124a(r0)
                java.lang.String r0 = r0.mMusicPath
                r1 = 1
                int r0 = com.p683ss.android.ugc.aweme.utils.C47807de.m103443a(r0, r1)
                com.ss.android.ugc.gamora.editor.aw r1 = r3.f123592a
                com.ss.android.ugc.gamora.editor.EditMusicCutViewModel r1 = com.p683ss.android.ugc.gamora.editor.C49159aw.m106140d(r1)
                if (r4 == 0) goto L_0x0065
                com.ss.android.ugc.aweme.shortvideo.d r4 = (com.p683ss.android.ugc.aweme.shortvideo.C43203d) r4
                r2 = 0
                r1.mo96891a(r4, r0, r2)
                return
            L_0x0065:
                d.u r4 = new d.u
                java.lang.String r0 = "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.AVMusicWaveBean"
                r4.<init>(r0)
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.gamora.editor.C49159aw.C49193az.mo87805a(java.lang.Object):void");
        }

        C49193az(C49159aw awVar, int i) {
            this.f123592a = awVar;
            this.f123593b = i;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.aw$b */
    static final class C49194b extends C52712l implements C52670a<C43382i> {

        /* renamed from: a */
        final /* synthetic */ C49159aw f123594a;

        C49194b(C49159aw awVar) {
            this.f123594a = awVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C43382i iVar = new C43382i();
            this.f123594a.mo24389a((int) R.id.b_k, (C12924i) iVar, "EditAudioEffectScene");
            return iVar;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.aw$ba */
    static final class C49195ba implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ OnClickListener f123595a;

        C49195ba(OnClickListener onClickListener) {
            this.f123595a = onClickListener;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            OnClickListener onClickListener = this.f123595a;
            if (onClickListener != null) {
                onClickListener.onClick(dialogInterface, i);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.aw$bb */
    static final class C49196bb extends C52712l implements C52670a<C49250be> {

        /* renamed from: a */
        final /* synthetic */ C49159aw f123596a;

        C49196bb(C49159aw awVar) {
            this.f123596a = awVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C49250be beVar = new C49250be();
            this.f123596a.mo24389a((int) R.id.a9r, (C12924i) beVar, "EditStickerDeleteScene");
            return beVar;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.aw$bc */
    static final class C49197bc extends C52712l implements C52670a<C49252bf> {

        /* renamed from: a */
        final /* synthetic */ C49159aw f123597a;

        C49197bc(C49159aw awVar) {
            this.f123597a = awVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C49252bf bfVar = new C49252bf();
            C35607a amVar = new C49178am(this.f123597a);
            C52711k.m112240b(amVar, "listener");
            bfVar.f123712j = amVar;
            if (bfVar.f123711i != null) {
                C35635v vVar = bfVar.f123711i;
                if (vVar == null) {
                    C52711k.m112237a("stickerModule");
                }
                vVar.mo74044a(amVar);
            }
            this.f123597a.mo24389a((int) R.id.b_k, (C12924i) bfVar, "EditStickerPanelScene");
            return bfVar;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.aw$bd */
    static final class C49198bd extends C52712l implements C52670a<C49256bh> {

        /* renamed from: a */
        final /* synthetic */ C49159aw f123598a;

        C49198bd(C49159aw awVar) {
            this.f123598a = awVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C12924i a = this.f123598a.mo24388a("EditStickerScene");
            if (a == null) {
                C52711k.m112234a();
            }
            return (C49256bh) a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.aw$be */
    static final class C49199be extends C52712l implements C52670a<C49305br> {

        /* renamed from: a */
        final /* synthetic */ C49159aw f123599a;

        C49199be(C49159aw awVar) {
            this.f123599a = awVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C49067aa aaVar = this.f123599a.mo97168O().f123741m;
            if (aaVar == null) {
                C52711k.m112234a();
            }
            C49305br brVar = new C49305br(aaVar.mo97095F());
            this.f123599a.mo24389a((int) R.id.b_k, (C12924i) brVar, "EditSubtitleScene");
            return brVar;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.aw$bf */
    static final class C49200bf extends C52712l implements C52670a<C49321bu> {

        /* renamed from: a */
        final /* synthetic */ C49159aw f123600a;

        C49200bf(C49159aw awVar) {
            this.f123600a = awVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C12924i a = this.f123600a.mo24388a("EditTitleBarScene");
            if (a == null) {
                C52711k.m112234a();
            }
            return (C49321bu) a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.aw$bg */
    static final class C49201bg extends C52712l implements C52670a<C49368ck> {

        /* renamed from: a */
        final /* synthetic */ C49159aw f123601a;

        C49201bg(C49159aw awVar) {
            this.f123601a = awVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C49368ck ckVar = new C49368ck();
            this.f123601a.mo24389a((int) R.id.b_k, (C12924i) ckVar, "EditVolumeScene");
            return ckVar;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.aw$c */
    static final class C49202c extends C52712l implements C52670a<C43405c> {

        /* renamed from: a */
        final /* synthetic */ C49159aw f123602a;

        C49202c(C49159aw awVar) {
            this.f123602a = awVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C43405c cVar = new C43405c();
            this.f123602a.mo24389a((int) R.id.b_k, (C12924i) cVar, "EditAudioRecordScene");
            return cVar;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.aw$d */
    static final class C49203d extends C52712l implements C52670a<C49414d> {

        /* renamed from: a */
        final /* synthetic */ C49159aw f123603a;

        C49203d(C49159aw awVar) {
            this.f123603a = awVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C49414d dVar = new C49414d();
            Activity activity = this.f123603a.f33840g_;
            if (activity != null) {
                JediViewModel a = C48927d.m105736a((FragmentActivity) activity).mo96760a(EditPreviewViewModel.class);
                C52711k.m112236a((Object) a, "JediViewModelProviders.o…iewViewModel::class.java)");
                C0198r<Boolean> i = ((EditPreviewViewModel) a).mo96928i();
                C52711k.m112240b(i, "value");
                dVar.f124021m = i;
                if (dVar.f124020l != null) {
                    C43443c cVar = dVar.f124020l;
                    if (cVar == null) {
                        C52711k.m112237a("mAutoEnhanceController");
                    }
                    C0198r<Boolean> rVar = dVar.f124021m;
                    if (rVar == null) {
                        C52711k.m112237a("lightDetectionDone");
                    }
                    cVar.mo88375a(rVar);
                }
                this.f123603a.mo24389a((int) R.id.b_k, (C12924i) dVar, "EditAutoEnhanceScene");
                return dVar;
            }
            throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.aw$e */
    static final class C49204e extends C52712l implements C52670a<C49421g> {

        /* renamed from: a */
        final /* synthetic */ C49159aw f123604a;

        C49204e(C49159aw awVar) {
            this.f123604a = awVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C12924i a = this.f123604a.mo24388a("EditBottomBarScene");
            if (a == null) {
                C52711k.m112234a();
            }
            return (C49421g) a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.aw$f */
    public static final class C49205f implements C39646a {

        /* renamed from: a */
        final /* synthetic */ C49159aw f123605a;

        C49205f(C49159aw awVar) {
            this.f123605a = awVar;
        }

        /* renamed from: a */
        public final void mo80715a(String[] strArr, int[] iArr) {
            boolean z;
            if (!(strArr == null || iArr == null)) {
                boolean z2 = true;
                if (strArr.length == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    if (iArr.length != 0) {
                        z2 = false;
                    }
                    if (!z2) {
                        if (iArr[0] == 0) {
                            this.f123605a.mo97183aa();
                            return;
                        }
                        Activity activity = this.f123605a.f33840g_;
                        if (activity == null) {
                            C52711k.m112234a();
                        }
                        C10691a.m21542b((Context) activity, (int) R.string.akq).mo19066a();
                        return;
                    }
                }
            }
            Activity activity2 = this.f123605a.f33840g_;
            if (activity2 == null) {
                C52711k.m112234a();
            }
            C10691a.m21542b((Context) activity2, (int) R.string.akq).mo19066a();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.aw$g */
    static final class C49206g implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C49159aw f123606a;

        /* renamed from: b */
        final /* synthetic */ boolean f123607b;

        C49206g(C49159aw awVar, boolean z) {
            this.f123606a = awVar;
            this.f123607b = z;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f123606a.mo97197f(this.f123607b);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.aw$h */
    static final class C49207h<TTaskResult, TContinuationResult> implements C0011g<Void, Void> {

        /* renamed from: a */
        final /* synthetic */ C49159aw f123608a;

        /* renamed from: b */
        final /* synthetic */ boolean f123609b;

        /* renamed from: c */
        final /* synthetic */ boolean f123610c;

        /* renamed from: d */
        final /* synthetic */ boolean f123611d;

        /* renamed from: e */
        final /* synthetic */ Runnable f123612e;

        C49207h(C49159aw awVar, boolean z, boolean z2, boolean z3, Runnable runnable) {
            this.f123608a = awVar;
            this.f123609b = z;
            this.f123610c = z2;
            this.f123611d = z3;
            this.f123612e = runnable;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:93:0x01e1, code lost:
            if (r3 == null) goto L_0x01e3;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Object then(p001a.C0013i r17) {
            /*
                r16 = this;
                r0 = r16
                com.ss.android.ugc.gamora.editor.aw r1 = r0.f123608a
                r1.mo97190ah()
                com.ss.android.ugc.gamora.editor.aw r1 = r0.f123608a
                com.ss.android.ugc.gamora.editor.bh r1 = r1.mo97168O()
                r2 = 0
                r1.mo97262a(r2)
                boolean r1 = r0.f123609b
                if (r1 == 0) goto L_0x0053
                com.ss.android.ugc.gamora.editor.aw r1 = r0.f123608a
                com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r1 = com.p683ss.android.ugc.gamora.editor.C49159aw.m106124a(r1)
                com.ss.android.ugc.aweme.shortvideo.edit.bb r4 = new com.ss.android.ugc.aweme.shortvideo.edit.bb
                java.lang.String r5 = "VEVideoPublishEditActivity"
                r4.<init>(r5)
                com.ss.android.ugc.aweme.draft.model.c r1 = r4.mo88377a(r1)
                java.lang.String r4 = "draft"
                p2628d.p2639f.p2641b.C52711k.m112236a(r1, r4)
                long r4 = java.lang.System.currentTimeMillis()
                r1.f76129G = r4
                com.ss.android.ugc.aweme.port.in.u r4 = com.p683ss.android.ugc.aweme.port.p2082in.C39629l.m88232a()
                com.ss.android.ugc.aweme.port.internal.c r4 = r4.mo58573d()
                r4.mo80730a(r1)
                com.ss.android.ugc.aweme.port.in.u r4 = com.p683ss.android.ugc.aweme.port.p2082in.C39629l.m88232a()
                com.ss.android.ugc.aweme.port.internal.c r4 = r4.mo58573d()
                r4.mo80732a(r1, r2)
                com.ss.android.ugc.gamora.editor.aw r1 = r0.f123608a
                android.app.Activity r1 = r1.f33840g_
                if (r1 == 0) goto L_0x0050
                r1.finish()
            L_0x0050:
                r1 = 0
                goto L_0x03a9
            L_0x0053:
                com.ss.android.ugc.gamora.editor.aw r1 = r0.f123608a
                boolean r4 = r0.f123610c
                boolean r5 = r0.f123611d
                java.lang.Runnable r6 = r0.f123612e
                boolean r7 = r1.f123503H
                r8 = 1
                if (r7 == 0) goto L_0x0088
                java.lang.String r7 = "DoubleGoPublishActivity VEVideoPublishEditActivity"
                com.p683ss.android.ugc.tools.utils.C50203g.m108361b(r7)
                com.bytedance.p502b.p503a.p506b.p508b.C9220a.m18310a(r7)
                com.bytedance.ies.abmock.n r7 = com.bytedance.ies.abmock.C10193n.m20607a()
                java.lang.Class<com.ss.android.ugc.aweme.setting.IsBlockErrorGoPublish> r9 = com.p683ss.android.ugc.aweme.setting.IsBlockErrorGoPublish.class
                java.lang.String r10 = "is_block_error_go_publish"
                com.bytedance.ies.abmock.b r11 = com.bytedance.ies.abmock.C10181b.m20511a()
                com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy r11 = r11.mo18175c()
                java.lang.Boolean r11 = r11.getIsBlockErrorGoPublish()
                boolean r7 = r7.mo18204a(r9, r10, r11, r8)
                if (r7 == 0) goto L_0x0088
                java.lang.String r1 = "BlockErrorGoPublish"
                com.p683ss.android.ugc.tools.utils.C50203g.m108361b(r1)
                goto L_0x0050
            L_0x0088:
                r1.f123503H = r8
                com.ss.android.ugc.aweme.port.in.ak r7 = com.p683ss.android.ugc.aweme.port.p2082in.C39630m.m88234a()
                r7.mo58598B()
                com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r7 = r1.f123534q
                if (r7 != 0) goto L_0x009a
                java.lang.String r9 = "mModel"
                p2628d.p2639f.p2641b.C52711k.m112237a(r9)
            L_0x009a:
                dmt.av.video.VEVideoPublishEditViewModel r9 = r1.f123531n
                if (r9 != 0) goto L_0x00a3
                java.lang.String r10 = "publishEditViewModel"
                p2628d.p2639f.p2641b.C52711k.m112237a(r10)
            L_0x00a3:
                com.ss.android.ugc.asve.c.c r10 = r1.mo97189ag()
                if (r10 == 0) goto L_0x00ae
                float r10 = r10.mo43096z()
                goto L_0x00b0
            L_0x00ae:
                r10 = -1082130432(0xffffffffbf800000, float:-1.0)
            L_0x00b0:
                java.lang.String r11 = "go_publish"
                com.p683ss.android.ugc.aweme.shortvideo.edit.C43434az.m95205a(r7, r9, r10, r11)
                android.app.Activity r7 = r1.mo24477v()
                android.content.Intent r7 = r7.getIntent()
                java.lang.String r9 = "shoot_way"
                r7.getStringExtra(r9)
                android.content.Intent r7 = new android.content.Intent
                r7.<init>()
                android.app.Activity r9 = r1.mo24477v()
                android.content.Intent r9 = r9.getIntent()
                android.os.Bundle r9 = r9.getExtras()
                if (r9 == 0) goto L_0x00d8
                r7.putExtras(r9)
            L_0x00d8:
                com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r9 = r1.f123534q
                if (r9 != 0) goto L_0x00e1
                java.lang.String r10 = "mModel"
                p2628d.p2639f.p2641b.C52711k.m112237a(r10)
            L_0x00e1:
                com.ss.android.ugc.aweme.shortvideo.dh r10 = com.p683ss.android.ugc.aweme.shortvideo.C43214dh.m94817a()
                java.lang.String r11 = "PublishManager.inst()"
                p2628d.p2639f.p2641b.C52711k.m112236a(r10, r11)
                com.ss.android.ugc.aweme.shortvideo.AVChallenge r10 = r10.f109292g
                r9.setMultiEditChallenges(r10)
                com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r9 = r1.f123534q
                if (r9 != 0) goto L_0x00f8
                java.lang.String r10 = "mModel"
                p2628d.p2639f.p2641b.C52711k.m112237a(r10)
            L_0x00f8:
                r9.setMultiEditStickIds()
                com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r9 = r1.f123534q
                if (r9 != 0) goto L_0x0104
                java.lang.String r10 = "mModel"
                p2628d.p2639f.p2641b.C52711k.m112237a(r10)
            L_0x0104:
                r9.setMultiEditBeautyMetadatas()
                com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r9 = r1.f123534q
                if (r9 != 0) goto L_0x0110
                java.lang.String r10 = "mModel"
                p2628d.p2639f.p2641b.C52711k.m112237a(r10)
            L_0x0110:
                r9.setMultiEditCameraLensInfo()
                java.util.ArrayList r9 = new java.util.ArrayList
                r9.<init>()
                com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r10 = r1.f123534q
                if (r10 != 0) goto L_0x0121
                java.lang.String r11 = "mModel"
                p2628d.p2639f.p2641b.C52711k.m112237a(r11)
            L_0x0121:
                java.util.List r10 = r10.challenges
                if (r10 != 0) goto L_0x0148
                com.ss.android.ugc.aweme.infoSticker.at r10 = r1.f123497B
                if (r10 != 0) goto L_0x012e
                java.lang.String r11 = "stickerChallengeManager"
                p2628d.p2639f.p2641b.C52711k.m112237a(r11)
            L_0x012e:
                java.util.Collection r10 = r10.mo73980d()
                boolean r10 = r10.isEmpty()
                if (r10 != 0) goto L_0x0148
                com.ss.android.ugc.aweme.infoSticker.at r10 = r1.f123497B
                if (r10 != 0) goto L_0x0141
                java.lang.String r11 = "stickerChallengeManager"
                p2628d.p2639f.p2641b.C52711k.m112237a(r11)
            L_0x0141:
                java.util.Collection r10 = r10.mo73980d()
                r9.addAll(r10)
            L_0x0148:
                com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r10 = r1.f123534q
                if (r10 != 0) goto L_0x0151
                java.lang.String r11 = "mModel"
                p2628d.p2639f.p2641b.C52711k.m112237a(r11)
            L_0x0151:
                com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioEffectParam r10 = r10.veAudioEffectParam
                if (r10 == 0) goto L_0x015a
                com.ss.android.ugc.aweme.shortvideo.AVChallenge r10 = r10.getChallenge()
                goto L_0x015b
            L_0x015a:
                r10 = 0
            L_0x015b:
                if (r10 == 0) goto L_0x018b
                com.ss.android.ugc.gamora.editor.EditViewModel r11 = r1.f123532o
                if (r11 != 0) goto L_0x0166
                java.lang.String r12 = "editViewModel"
                p2628d.p2639f.p2641b.C52711k.m112237a(r12)
            L_0x0166:
                boolean r11 = r11.mo97022B()
                if (r11 == 0) goto L_0x0188
                com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r11 = r1.f123534q
                if (r11 != 0) goto L_0x0175
                java.lang.String r12 = "mModel"
                p2628d.p2639f.p2641b.C52711k.m112237a(r12)
            L_0x0175:
                boolean r11 = r11.hasNotAudioRecord()
                if (r11 == 0) goto L_0x0188
                com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r11 = r1.f123534q
                if (r11 != 0) goto L_0x0184
                java.lang.String r12 = "mModel"
                p2628d.p2639f.p2641b.C52711k.m112237a(r12)
            L_0x0184:
                com.p683ss.android.ugc.aweme.shortvideo.edit.audioeffect.C43357b.m95081a(r11)
                goto L_0x018b
            L_0x0188:
                r9.add(r10)
            L_0x018b:
                com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r11 = r1.f123534q
                if (r11 != 0) goto L_0x0194
                java.lang.String r12 = "mModel"
                p2628d.p2639f.p2641b.C52711k.m112237a(r12)
            L_0x0194:
                java.util.List r11 = r11.challenges
                if (r11 == 0) goto L_0x0219
                com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r11 = r1.f123534q
                if (r11 != 0) goto L_0x01a1
                java.lang.String r12 = "mModel"
                p2628d.p2639f.p2641b.C52711k.m112237a(r12)
            L_0x01a1:
                java.util.List r11 = r11.challenges
                java.util.Collection r11 = (java.util.Collection) r11
                r9.addAll(r11)
                com.ss.android.ugc.aweme.infoSticker.at r11 = r1.f123497B
                if (r11 != 0) goto L_0x01b1
                java.lang.String r12 = "stickerChallengeManager"
                p2628d.p2639f.p2641b.C52711k.m112237a(r12)
            L_0x01b1:
                com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r12 = r1.f123534q
                if (r12 != 0) goto L_0x01ba
                java.lang.String r13 = "mModel"
                p2628d.p2639f.p2641b.C52711k.m112237a(r13)
            L_0x01ba:
                java.util.List r12 = r12.challenges
                java.lang.String r13 = "mModel.challenges"
                p2628d.p2639f.p2641b.C52711k.m112236a(r12, r13)
                java.lang.Iterable r12 = (java.lang.Iterable) r12
                java.util.ArrayList r13 = new java.util.ArrayList
                r13.<init>()
                java.util.Collection r13 = (java.util.Collection) r13
                java.util.Iterator r12 = r12.iterator()
            L_0x01ce:
                boolean r14 = r12.hasNext()
                if (r14 == 0) goto L_0x01f0
                java.lang.Object r14 = r12.next()
                r15 = r14
                com.ss.android.ugc.aweme.shortvideo.AVChallenge r15 = (com.p683ss.android.ugc.aweme.shortvideo.AVChallenge) r15
                java.lang.String r15 = r15.challengeName
                if (r10 == 0) goto L_0x01e3
                java.lang.String r3 = r10.challengeName
                if (r3 != 0) goto L_0x01e5
            L_0x01e3:
                java.lang.String r3 = ""
            L_0x01e5:
                boolean r3 = p2628d.p2639f.p2641b.C52711k.m112239a(r15, r3)
                r3 = r3 ^ r8
                if (r3 == 0) goto L_0x01ce
                r13.add(r14)
                goto L_0x01ce
            L_0x01f0:
                r3 = r13
                java.util.List r3 = (java.util.List) r3
                r10 = r3
                java.util.Collection r10 = (java.util.Collection) r10
                boolean r10 = r10.isEmpty()
                r10 = r10 ^ r8
                if (r10 == 0) goto L_0x01fe
                goto L_0x01ff
            L_0x01fe:
                r3 = 0
            L_0x01ff:
                if (r3 == 0) goto L_0x0219
                com.ss.android.ugc.aweme.infosticker.StickerChallenge r10 = r11.mo73978b()
                java.util.List r10 = r10.getRecordStickerChallengeList()
                r10.clear()
                com.ss.android.ugc.aweme.infosticker.StickerChallenge r10 = r11.mo73978b()
                java.util.List r10 = r10.getRecordStickerChallengeList()
                java.util.Collection r3 = (java.util.Collection) r3
                r10.addAll(r3)
            L_0x0219:
                com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r3 = r1.f123534q
                if (r3 != 0) goto L_0x0222
                java.lang.String r10 = "mModel"
                p2628d.p2639f.p2641b.C52711k.m112237a(r10)
            L_0x0222:
                com.ss.android.ugc.aweme.infoSticker.at r10 = r1.f123497B
                if (r10 != 0) goto L_0x022b
                java.lang.String r11 = "stickerChallengeManager"
                p2628d.p2639f.p2641b.C52711k.m112237a(r11)
            L_0x022b:
                com.ss.android.ugc.aweme.infosticker.StickerChallenge r10 = r10.mo73978b()
                r3.stickerChallenge = r10
                com.ss.android.ugc.aweme.shortvideo.dh r3 = com.p683ss.android.ugc.aweme.shortvideo.C43214dh.m94817a()
                com.ss.android.ugc.aweme.shortvideo.c r3 = r3.mo50201b()
                if (r3 == 0) goto L_0x0255
                com.ss.android.ugc.aweme.shortvideo.dh r3 = com.p683ss.android.ugc.aweme.shortvideo.C43214dh.m94817a()
                com.ss.android.ugc.aweme.shortvideo.c r3 = r3.mo50201b()
                if (r3 != 0) goto L_0x0248
                p2628d.p2639f.p2641b.C52711k.m112234a()
            L_0x0248:
                com.ss.android.ugc.aweme.shortvideo.AVChallenge r3 = r3.challenge
                if (r3 == 0) goto L_0x0255
                boolean r10 = r9.contains(r3)
                if (r10 != 0) goto L_0x0255
                r9.add(r3)
            L_0x0255:
                com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r3 = r1.f123534q
                if (r3 != 0) goto L_0x025e
                java.lang.String r10 = "mModel"
                p2628d.p2639f.p2641b.C52711k.m112237a(r10)
            L_0x025e:
                com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r3 = com.p683ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel.makeCopy(r3)
                com.ss.android.ugc.aweme.services.IInternalAVService r10 = com.p683ss.android.ugc.aweme.out.AVServiceImpl.createIInternalAVServicebyMonsterPlugin()
                com.ss.android.ugc.aweme.services.IInternalAVService r10 = (com.p683ss.android.ugc.aweme.services.IInternalAVService) r10
                com.ss.android.ugc.aweme.services.settings.IDmtAVSettingsService r10 = r10.dmtSettingsService()
                java.lang.String r11 = "ServiceManager.get().get…ava).dmtSettingsService()"
                p2628d.p2639f.p2641b.C52711k.m112236a(r10, r11)
                boolean r10 = r10.isEnableVideoEditActivityUploadSpeedProbe()
                if (r10 == 0) goto L_0x02c5
                com.ss.android.ugc.aweme.shortvideo.upload.b.b$c r10 = com.p683ss.android.ugc.aweme.shortvideo.upload.p2247b.C45258b.f114465b
                if (r10 == 0) goto L_0x027e
                r10.mo91543b()
            L_0x027e:
                com.ss.android.ugc.aweme.shortvideo.upload.b.b$c r10 = com.p683ss.android.ugc.aweme.shortvideo.upload.p2247b.C45258b.f114465b
                if (r10 == 0) goto L_0x0285
                com.ss.android.ugc.aweme.shortvideo.upload.b.b$b r10 = r10.f114471a
                goto L_0x0286
            L_0x0285:
                r10 = 0
            L_0x0286:
                if (r10 != 0) goto L_0x0289
                goto L_0x02aa
            L_0x0289:
                int[] r11 = com.p683ss.android.ugc.aweme.shortvideo.upload.p2247b.C45283d.f114500a
                int r10 = r10.ordinal()
                r10 = r11[r10]
                switch(r10) {
                    case 1: goto L_0x02a3;
                    case 2: goto L_0x029c;
                    case 3: goto L_0x0295;
                    default: goto L_0x0294;
                }
            L_0x0294:
                goto L_0x02aa
            L_0x0295:
                r10 = -5
                com.ss.android.ugc.aweme.shortvideo.upload.UploadSpeedInfo r10 = com.p683ss.android.ugc.aweme.shortvideo.upload.p2247b.C45258b.C45264e.invoke(r10)
                goto L_0x02b0
            L_0x029c:
                r10 = -6
                com.ss.android.ugc.aweme.shortvideo.upload.UploadSpeedInfo r10 = com.p683ss.android.ugc.aweme.shortvideo.upload.p2247b.C45258b.C45264e.invoke(r10)
                goto L_0x02b0
            L_0x02a3:
                long r10 = com.p683ss.android.ugc.aweme.shortvideo.upload.p2247b.C45258b.f114466c
                com.ss.android.ugc.aweme.shortvideo.upload.UploadSpeedInfo r10 = com.p683ss.android.ugc.aweme.shortvideo.upload.p2247b.C45258b.C45264e.invoke(r10)
                goto L_0x02b0
            L_0x02aa:
                r10 = -4
                com.ss.android.ugc.aweme.shortvideo.upload.UploadSpeedInfo r10 = com.p683ss.android.ugc.aweme.shortvideo.upload.p2247b.C45258b.C45264e.invoke(r10)
            L_0x02b0:
                com.ss.android.ugc.aweme.shortvideo.upload.b.b r11 = com.p683ss.android.ugc.aweme.shortvideo.upload.p2247b.C45258b.f114469f
                java.lang.StringBuilder r11 = new java.lang.StringBuilder
                java.lang.String r12 = "getSpeed:"
                r11.<init>(r12)
                r11.append(r10)
                java.lang.String r11 = r11.toString()
                com.p683ss.android.ugc.aweme.shortvideo.upload.p2247b.C45258b.m98741a(r11, r2)
                r3.uploadSpeedInfo = r10
            L_0x02c5:
                r10 = r3
                com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext r10 = (com.p683ss.android.ugc.aweme.shortvideo.BaseShortVideoContext) r10
                com.ss.android.ugc.aweme.tools.a.b r11 = com.p683ss.android.ugc.aweme.shortvideo.C44309n.m97057a(r10)
                com.ss.android.ugc.aweme.tools.a.a r10 = com.p683ss.android.ugc.aweme.shortvideo.C44309n.m97058b(r10)
                com.ss.android.ugc.aweme.tools.a.e r12 = com.p683ss.android.ugc.aweme.tools.p2346a.C46804e.EDIT
                com.ss.android.ugc.aweme.tools.a.e r13 = com.p683ss.android.ugc.aweme.tools.p2346a.C46804e.PUBLISH
                com.p683ss.android.ugc.aweme.tools.p2346a.C46806g.m101653a(r11, r10, r12, r13)
                java.lang.String r10 = "args"
                if (r3 == 0) goto L_0x03aa
                r11 = r3
                java.io.Serializable r11 = (java.io.Serializable) r11
                r7.putExtra(r10, r11)
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                java.lang.String r11 = "GoPublishActivity from new edit page  newOne = "
                r10.<init>(r11)
                r10.append(r3)
                java.lang.String r3 = r10.toString()
                com.p683ss.android.ugc.aweme.util.C47625i.m103103a(r3)
                java.lang.String r3 = "is_from_sys_share"
                r7.putExtra(r3, r4)
                java.lang.String r3 = "challenge"
                java.io.Serializable r9 = (java.io.Serializable) r9
                r7.putExtra(r3, r9)
                java.lang.String r3 = "enter_record_from_other_platform"
                r7.putExtra(r3, r5)
                android.app.Activity r3 = r1.f33840g_
                if (r3 != 0) goto L_0x030a
                p2628d.p2639f.p2641b.C52711k.m112234a()
            L_0x030a:
                java.lang.String r4 = "activity!!"
                p2628d.p2639f.p2641b.C52711k.m112236a(r3, r4)
                android.content.Intent r3 = r3.getIntent()
                java.lang.String r4 = "extra_enter_from_live"
                boolean r3 = r3.getBooleanExtra(r4, r2)
                java.lang.String r4 = "extra_enter_from_live"
                r7.putExtra(r4, r3)
                java.lang.String r4 = "edit_publish_session_end_together"
                android.app.Activity r9 = r1.f33840g_
                if (r9 != 0) goto L_0x0327
                p2628d.p2639f.p2641b.C52711k.m112234a()
            L_0x0327:
                java.lang.String r10 = "activity!!"
                p2628d.p2639f.p2641b.C52711k.m112236a(r9, r10)
                android.content.Intent r9 = r9.getIntent()
                java.lang.String r10 = "edit_publish_session_end_together"
                boolean r2 = r9.getBooleanExtra(r10, r2)
                r7.putExtra(r4, r2)
                com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r2 = r1.f123534q
                if (r2 != 0) goto L_0x0342
                java.lang.String r4 = "mModel"
                p2628d.p2639f.p2641b.C52711k.m112237a(r4)
            L_0x0342:
                boolean r2 = r2.isReviewVideo()
                if (r2 == 0) goto L_0x0352
                java.lang.String r2 = "review_video_fast_publish"
                boolean r4 = r1.mo97192aj()
                r4 = r4 ^ r8
                r7.putExtra(r2, r4)
            L_0x0352:
                com.ss.android.ugc.gamora.editor.ct r2 = r1.f123500E
                if (r2 != 0) goto L_0x035b
                java.lang.String r4 = "musicController"
                p2628d.p2639f.p2641b.C52711k.m112237a(r4)
            L_0x035b:
                int r2 = r2.mo97117b()
                if (r2 < 0) goto L_0x0366
                java.lang.String r4 = "music_rec_type"
                r7.putExtra(r4, r2)
            L_0x0366:
                r6.run()
                if (r5 == 0) goto L_0x037f
                com.ss.android.ugc.aweme.shortvideo.q.b r2 = com.p683ss.android.ugc.aweme.shortvideo.p2220q.C44403a.m97196a()
                android.app.Activity r1 = r1.mo24477v()
                java.lang.String r3 = "requireActivity()"
                p2628d.p2639f.p2641b.C52711k.m112236a(r1, r3)
                r3 = 1002(0x3ea, float:1.404E-42)
                r2.mo48296a(r1, r7, r3)
                goto L_0x0050
            L_0x037f:
                if (r3 == 0) goto L_0x0395
                com.ss.android.ugc.aweme.shortvideo.q.b r2 = com.p683ss.android.ugc.aweme.shortvideo.p2220q.C44403a.m97196a()
                android.app.Activity r1 = r1.mo24477v()
                java.lang.String r3 = "requireActivity()"
                p2628d.p2639f.p2641b.C52711k.m112236a(r1, r3)
                r3 = 8
                r2.mo48296a(r1, r7, r3)
                goto L_0x0050
            L_0x0395:
                com.ss.android.ugc.aweme.shortvideo.q.b r2 = com.p683ss.android.ugc.aweme.shortvideo.p2220q.C44403a.m97196a()
                android.app.Activity r1 = r1.mo24477v()
                java.lang.String r3 = "requireActivity()"
                p2628d.p2639f.p2641b.C52711k.m112236a(r1, r3)
                android.content.Context r1 = (android.content.Context) r1
                r2.mo48301a(r1, r7)
                goto L_0x0050
            L_0x03a9:
                return r1
            L_0x03aa:
                d.u r1 = new d.u
                java.lang.String r2 = "null cannot be cast to non-null type java.io.Serializable"
                r1.<init>(r2)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.gamora.editor.C49159aw.C49207h.then(a.i):java.lang.Object");
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.aw$i */
    static final class C49208i<TTaskResult, TContinuationResult> implements C0011g<Void, Void> {

        /* renamed from: a */
        final /* synthetic */ C49159aw f123613a;

        C49208i(C49159aw awVar) {
            this.f123613a = awVar;
        }

        public final /* synthetic */ Object then(C0013i iVar) {
            this.f123613a.mo97187ae();
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.aw$j */
    static final class C49209j<TTaskResult, TContinuationResult> implements C0011g<Void, Void> {

        /* renamed from: a */
        final /* synthetic */ C49159aw f123614a;

        C49209j(C49159aw awVar) {
            this.f123614a = awVar;
        }

        public final /* synthetic */ Object then(C0013i iVar) {
            this.f123614a.mo97187ae();
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.aw$k */
    static final class C49210k extends C52712l implements C52670a<C49444m> {

        /* renamed from: a */
        final /* synthetic */ C49159aw f123615a;

        C49210k(C49159aw awVar) {
            this.f123615a = awVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C12924i a = this.f123615a.mo24388a("EditCornerScene");
            if (a == null) {
                C52711k.m112234a();
            }
            return (C49444m) a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.aw$l */
    static final class C49211l extends C52712l implements C52670a<C43477h> {

        /* renamed from: a */
        public static final C49211l f123616a = new C49211l();

        C49211l() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C43477h();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.aw$m */
    static final class C49212m extends C52712l implements C52670a<C29198a> {

        /* renamed from: a */
        final /* synthetic */ C49159aw f123617a;

        C49212m(C49159aw awVar) {
            this.f123617a = awVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C29198a a = C39629l.m88232a().mo58576g().mo59089a();
            Activity activity = this.f123617a.f33840g_;
            if (activity != null) {
                a.mo59045a(new C29206k((FragmentActivity) activity));
                this.f123617a.mo24389a((int) R.id.b_k, a.mo59047d(), "EditEffectScene");
                return a;
            }
            throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.aw$n */
    static final class C49213n extends C52712l implements C52670a<C49452q> {

        /* renamed from: a */
        final /* synthetic */ C49159aw f123618a;

        C49213n(C49159aw awVar) {
            this.f123618a = awVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C12924i a = this.f123618a.mo24388a("EditFilterIndicatorScene");
            if (a == null) {
                C52711k.m112234a();
            }
            return (C49452q) a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.aw$o */
    static final class C49214o extends C52712l implements C52670a<C49457s> {

        /* renamed from: a */
        final /* synthetic */ C49159aw f123619a;

        C49214o(C49159aw awVar) {
            this.f123619a = awVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C49457s sVar = new C49457s();
            this.f123619a.mo24389a((int) R.id.b_k, (C12924i) sVar, "EditFilterScene");
            return sVar;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.aw$p */
    static final class C49215p extends C52712l implements C52670a<C49528w> {

        /* renamed from: a */
        final /* synthetic */ C49159aw f123620a;

        C49215p(C49159aw awVar) {
            this.f123620a = awVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C12924i a = this.f123620a.mo24388a("EditGestureScene");
            if (a == null) {
                C52711k.m112234a();
            }
            return (C49528w) a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.aw$q */
    static final class C49216q<TTaskResult, TContinuationResult> implements C0011g<C43558a, Void> {

        /* renamed from: a */
        final /* synthetic */ C49159aw f123621a;

        C49216q(C49159aw awVar) {
            this.f123621a = awVar;
        }

        public final /* synthetic */ Object then(C0013i iVar) {
            CommentVideoModel commentVideoModel;
            int i;
            int i2;
            C43558a aVar = (C43558a) iVar.mo34e();
            if (aVar != null) {
                C44564a aVar2 = aVar.f110223a;
                if (aVar2 != null) {
                    commentVideoModel = aVar2.f112751a;
                } else {
                    commentVideoModel = null;
                }
                C20347c ag = this.f123621a.mo97189ag();
                if (ag == null) {
                    C52711k.m112234a();
                }
                int k = ag.mo43071k();
                if (commentVideoModel == null || !commentVideoModel.hasTimeData()) {
                    i = k;
                    i2 = 0;
                } else {
                    i2 = commentVideoModel.getStartTime();
                    i = commentVideoModel.getEndTime();
                }
                StickerItemModel stickerItemModel = new StickerItemModel("comment", aVar.stickerPath, "", aVar.index, false, i2, i, 4);
                stickerItemModel.isImageStickerLayer = true;
                this.f123621a.mo97180a(stickerItemModel);
            }
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.aw$r */
    static final class C49217r<TTaskResult, TContinuationResult> implements C0011g<C43569g, Void> {

        /* renamed from: a */
        final /* synthetic */ C49159aw f123622a;

        /* renamed from: b */
        final /* synthetic */ C49131aq f123623b;

        C49217r(C49159aw awVar, C49131aq aqVar) {
            this.f123622a = awVar;
            this.f123623b = aqVar;
        }

        public final /* synthetic */ Object then(C0013i iVar) {
            C43569g gVar = (C43569g) iVar.mo34e();
            if (gVar != null) {
                String str = this.f123623b.mo97141F().f110332a;
                C52711k.m112236a((Object) str, "stickerController.stickerId");
                String str2 = gVar.stickerPath;
                String str3 = "";
                int i = gVar.index;
                C20347c ag = this.f123622a.mo97189ag();
                if (ag == null) {
                    C52711k.m112234a();
                }
                StickerItemModel stickerItemModel = new StickerItemModel(str, str2, str3, i, false, 0, ag.mo43071k(), 1);
                stickerItemModel.isImageStickerLayer = true;
                stickerItemModel.viewHash = gVar.viewHash;
                this.f123622a.mo97180a(stickerItemModel);
            }
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.aw$s */
    static final class C49218s<TTaskResult, TContinuationResult> implements C0011g<Void, Void> {

        /* renamed from: a */
        final /* synthetic */ C49159aw f123624a;

        C49218s(C49159aw awVar) {
            this.f123624a = awVar;
        }

        public final /* synthetic */ Object then(C0013i iVar) {
            this.f123624a.mo97187ae();
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.aw$t */
    static final class C49219t<TTaskResult, TContinuationResult> implements C0011g<List<? extends TextStickerCompileResult>, Void> {

        /* renamed from: a */
        final /* synthetic */ C49159aw f123625a;

        C49219t(C49159aw awVar) {
            this.f123625a = awVar;
        }

        public final /* synthetic */ Object then(C0013i iVar) {
            int i;
            int k;
            for (TextStickerCompileResult textStickerCompileResult : (List) iVar.mo34e()) {
                if (textStickerCompileResult != null) {
                    TextStickerData textStickerData = textStickerCompileResult.textStickerData;
                    String b = C39629l.m88232a().mo58566D().mo34889b(textStickerData);
                    if (textStickerData.hasTimeData()) {
                        i = textStickerData.getStartTime();
                    } else {
                        i = 0;
                    }
                    if (textStickerData.hasTimeData()) {
                        k = textStickerData.getEndTime();
                    } else {
                        C20347c ag = this.f123625a.mo97189ag();
                        if (ag == null) {
                            C52711k.m112234a();
                        }
                        k = ag.mo43071k();
                    }
                    int i2 = k;
                    StringBuilder sb = new StringBuilder("text_sticker_");
                    sb.append(textStickerCompileResult.index);
                    StickerItemModel stickerItemModel = new StickerItemModel(sb.toString(), textStickerCompileResult.stickerPath, b, textStickerCompileResult.index, false, i, i2, 2);
                    stickerItemModel.isImageStickerLayer = true;
                    stickerItemModel.viewHash = textStickerCompileResult.viewHash;
                    this.f123625a.mo97180a(stickerItemModel);
                }
            }
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.aw$u */
    static final class C49220u implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C49159aw f123626a;

        C49220u(C49159aw awVar) {
            this.f123626a = awVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f123626a.mo97177X();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.aw$v */
    public static final class C49221v extends C46722b {

        /* renamed from: a */
        final /* synthetic */ C49159aw f123627a;

        C49221v(C49159aw awVar) {
            this.f123627a = awVar;
        }

        /* renamed from: d */
        public final boolean mo87834d(MotionEvent motionEvent) {
            EditLyricStickerViewModel editLyricStickerViewModel = this.f123627a.f123536s;
            if (editLyricStickerViewModel == null) {
                C52711k.m112237a("mEditLyricStickerViewModel");
            }
            if (!C52711k.m112239a((Object) (Boolean) editLyricStickerViewModel.mo96879f().getValue(), (Object) Boolean.valueOf(true))) {
                return super.mo87834d(motionEvent);
            }
            C49082af afVar = this.f123627a.mo97168O().f123748t;
            if (afVar != null) {
                afVar.mo89535G();
            }
            return true;
        }

        /* renamed from: e */
        public final boolean mo88487e(MotionEvent motionEvent) {
            C49256bh O = this.f123627a.mo97168O();
            C49131aq aqVar = O.f123743o;
            boolean z = false;
            if (aqVar != null && aqVar.mo97142G()) {
                aqVar.mo97145J();
                z = true;
            }
            C49378co coVar = O.f123745q;
            if (coVar != null && coVar.mo97302F().mo88748a()) {
                coVar.mo97305I();
                z = true;
            }
            C49307bs bsVar = O.f123742n;
            if (bsVar != null) {
                return bsVar.mo97269K();
            }
            return z;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.aw$w */
    public static final class C49222w extends C24459a {

        /* renamed from: a */
        final /* synthetic */ C49159aw f123628a;

        /* renamed from: d */
        public final void mo50225d() {
            if (this.f123628a.f123499D) {
                this.f123628a.f123499D = false;
                this.f123628a.mo97193b(false);
                return;
            }
            C49159aw.m106138b(this.f123628a).mo97033a(true, false, true);
            if (!C49159aw.m106138b(this.f123628a).mo97046p() && C49159aw.m106139c(this.f123628a).f123208e.f123883c) {
                C49159aw.m106139c(this.f123628a).mo97012b(1, true);
            }
        }

        C49222w(C49159aw awVar) {
            this.f123628a = awVar;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.aw$x */
    public static final class C49223x implements C44344b {

        /* renamed from: a */
        final /* synthetic */ C49159aw f123629a;

        /* renamed from: b */
        final /* synthetic */ C49115am f123630b;

        /* renamed from: c */
        public final void mo90215c() {
        }

        /* renamed from: b */
        public final void mo90214b() {
            this.f123629a.mo97179Z();
        }

        /* renamed from: a */
        public final void mo90212a() {
            this.f123629a.mo97173T().mo97119c();
        }

        /* renamed from: d */
        public final void mo90216d() {
            if (C49159aw.m106138b(this.f123629a).mo97026H() <= C49159aw.m106124a(this.f123629a).mCurMusicLength) {
                this.f123629a.f123499D = true;
                C49115am amVar = this.f123630b;
                amVar.mo97138G().mo90209c();
                VideoPublishEditModel videoPublishEditModel = amVar.f123422j;
                if (videoPublishEditModel == null) {
                    C52711k.m112237a("mModel");
                }
                amVar.mo97138G();
                int a = C44342a.m97120a();
                C52711k.m112240b(videoPublishEditModel, "model");
                C26890h.m65011a("edit_music", C23089d.m56640a().mo47829a("creation_id", videoPublishEditModel.creationId).mo47829a("content_source", C43434az.m95207b(videoPublishEditModel)).mo47829a("content_type", C43434az.m95202a(videoPublishEditModel)).mo47829a("shoot_way", videoPublishEditModel.mShootWay).mo47829a("music_id", videoPublishEditModel.musicId).mo47826a("music_rec_type", a).mo47829a("enter_from", "video_edit_page").f61491a);
                EditStickerViewModel editStickerViewModel = this.f123629a.f123540w;
                if (editStickerViewModel == null) {
                    C52711k.m112237a("stickerViewModel");
                }
                editStickerViewModel.mo96968g().setValue(Boolean.valueOf(false));
            }
        }

        C49223x(C49159aw awVar, C49115am amVar) {
            this.f123629a = awVar;
            this.f123630b = amVar;
        }

        /* renamed from: a */
        public final void mo90213a(String str, C42482c cVar, boolean z) {
            this.f123629a.mo97173T().mo97114a(str, cVar, z);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.aw$y */
    static final class C49224y<T> implements C0199s<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C49159aw f123631a;

        C49224y(C49159aw awVar) {
            this.f123631a = awVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            C49159aw awVar = this.f123631a;
            if (bool == null) {
                C52711k.m112234a();
            }
            C52711k.m112236a((Object) bool, "it!!");
            boolean booleanValue = bool.booleanValue();
            EditViewModel editViewModel = awVar.f123532o;
            if (editViewModel == null) {
                C52711k.m112237a("editViewModel");
            }
            editViewModel.mo97033a(true, false, true);
            C43740a aVar = awVar.f123529l;
            VideoPublishEditModel videoPublishEditModel = awVar.f123534q;
            if (videoPublishEditModel == null) {
                C52711k.m112237a("mModel");
            }
            aVar.mo89203a(false, false, videoPublishEditModel);
            if (booleanValue) {
                VideoPublishEditModel videoPublishEditModel2 = awVar.f123534q;
                if (videoPublishEditModel2 == null) {
                    C52711k.m112237a("mModel");
                }
                videoPublishEditModel2.setUseMultiEdit();
                VideoPublishEditModel videoPublishEditModel3 = awVar.f123534q;
                if (videoPublishEditModel3 == null) {
                    C52711k.m112237a("mModel");
                }
                videoPublishEditModel3.mVideoCoverStartTm = 0.0f;
                VideoPublishEditModel videoPublishEditModel4 = awVar.f123534q;
                if (videoPublishEditModel4 == null) {
                    C52711k.m112237a("mModel");
                }
                MultiEditVideoRecordData curMultiEditVideoRecordData = videoPublishEditModel4.getCurMultiEditVideoRecordData();
                if (curMultiEditVideoRecordData == null) {
                    C52711k.m112234a();
                }
                int i = curMultiEditVideoRecordData.preVideoDuration;
                C20347c ag = awVar.mo97189ag();
                if (ag == null) {
                    C52711k.m112234a();
                }
                if (i != ag.mo43071k()) {
                    C20347c ag2 = awVar.mo97189ag();
                    if (ag2 == null) {
                        C52711k.m112234a();
                    }
                    int k = ag2.mo43071k();
                    C43193b.m94753a().f109222e = k;
                    C43193b bVar = C43191e.f109217h;
                    VideoPublishEditModel videoPublishEditModel5 = awVar.f123534q;
                    if (videoPublishEditModel5 == null) {
                        C52711k.m112237a("mModel");
                    }
                    bVar.mo87803a(videoPublishEditModel5.mMusicPath, false, new C49193az(awVar, k));
                }
            }
            awVar.mo97191ai();
            C49143at I = awVar.mo97162I();
            VideoPublishEditModel videoPublishEditModel6 = awVar.f123534q;
            if (videoPublishEditModel6 == null) {
                C52711k.m112237a("mModel");
            }
            MultiEditVideoRecordData curMultiEditVideoRecordData2 = videoPublishEditModel6.getCurMultiEditVideoRecordData();
            if (curMultiEditVideoRecordData2 == null) {
                C52711k.m112234a();
            }
            int i2 = curMultiEditVideoRecordData2.musicIndex;
            C49231a aVar2 = I.f123465k;
            if (aVar2 == null) {
                C52711k.m112237a("publishEditScene");
            }
            aVar2.mo97215c().f131179h = i2;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.aw$z */
    static final class C49225z<T> implements C0199s<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C49159aw f123632a;

        C49225z(C49159aw awVar) {
            this.f123632a = awVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            if (C52711k.m112239a((Object) (Boolean) obj, (Object) Boolean.valueOf(false))) {
                this.f123632a.mo97168O().mo97255U();
            }
        }
    }

    /* renamed from: ak */
    private final C49321bu m106126ak() {
        return (C49321bu) this.f123507M.getValue();
    }

    /* renamed from: al */
    private final C49421g m106127al() {
        return (C49421g) this.f123508N.getValue();
    }

    /* renamed from: am */
    private final C49444m m106128am() {
        return (C49444m) this.f123512R.getValue();
    }

    /* renamed from: an */
    private final C49414d m106129an() {
        return (C49414d) this.f123517W.getValue();
    }

    /* renamed from: ao */
    private final C49305br m106130ao() {
        return (C49305br) this.f123523ac.getValue();
    }

    /* renamed from: I */
    public final C49143at mo97162I() {
        return (C49143at) this.f123506L.getValue();
    }

    /* renamed from: J */
    public final C49250be mo97163J() {
        return (C49250be) this.f123509O.getValue();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: K */
    public final C49528w mo97164K() {
        return (C49528w) this.f123510P.getValue();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: L */
    public final C49452q mo97165L() {
        return (C49452q) this.f123511Q.getValue();
    }

    /* renamed from: M */
    public final C43382i mo97166M() {
        return (C43382i) this.f123513S.getValue();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: N */
    public final C49457s mo97167N() {
        return (C49457s) this.f123514T.getValue();
    }

    /* renamed from: O */
    public final C49256bh mo97168O() {
        return (C49256bh) this.f123515U.getValue();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: P */
    public final C29198a mo97169P() {
        return (C29198a) this.f123516V.getValue();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: Q */
    public final C49368ck mo97170Q() {
        return (C49368ck) this.f123519Y.getValue();
    }

    /* renamed from: R */
    public final C49115am mo97171R() {
        return (C49115am) this.f123521aa.getValue();
    }

    /* renamed from: S */
    public final C43405c mo97172S() {
        return (C43405c) this.f123522ab.getValue();
    }

    /* renamed from: V */
    public final void mo97175V() {
        m106133ar();
    }

    /* renamed from: a */
    public final void mo24463a(View view, Bundle bundle) {
        C52711k.m112240b(view, "view");
        super.mo24463a(view, bundle);
        ScenePlaceHolderView scenePlaceHolderView = (ScenePlaceHolderView) mo24467j_(R.id.d1b);
        scenePlaceHolderView.setSceneName(C49321bu.class.getName());
        scenePlaceHolderView.setSceneTag("EditTitleBarScene");
        ScenePlaceHolderView scenePlaceHolderView2 = (ScenePlaceHolderView) mo24467j_(R.id.cha);
        scenePlaceHolderView2.setSceneName(C49421g.class.getName());
        scenePlaceHolderView2.setSceneTag("EditBottomBarScene");
        ScenePlaceHolderView scenePlaceHolderView3 = (ScenePlaceHolderView) mo24467j_(R.id.a9c);
        scenePlaceHolderView3.setSceneName(C49444m.class.getName());
        scenePlaceHolderView3.setSceneTag("EditCornerScene");
        ScenePlaceHolderView scenePlaceHolderView4 = (ScenePlaceHolderView) mo24467j_(R.id.a9d);
        scenePlaceHolderView4.setSceneName(C49452q.class.getName());
        scenePlaceHolderView4.setSceneTag("EditFilterIndicatorScene");
        ScenePlaceHolderView scenePlaceHolderView5 = (ScenePlaceHolderView) mo24467j_(R.id.a9l);
        scenePlaceHolderView5.setSceneName(C49143at.class.getName());
        scenePlaceHolderView5.setSceneTag("EditPreviewScene");
        scenePlaceHolderView5.setSceneComponentFactory(new C49188av(this));
        ScenePlaceHolderView scenePlaceHolderView6 = (ScenePlaceHolderView) mo24467j_(R.id.a9q);
        scenePlaceHolderView6.setSceneName(C49256bh.class.getName());
        scenePlaceHolderView6.setSceneTag("EditStickerScene");
        scenePlaceHolderView6.setSceneComponentFactory(new C49189aw(this));
        ScenePlaceHolderView scenePlaceHolderView7 = (ScenePlaceHolderView) mo24467j_(R.id.dpz);
        scenePlaceHolderView7.setSceneName(C49528w.class.getName());
        scenePlaceHolderView7.setSceneTag("EditGestureScene");
        scenePlaceHolderView7.setSceneComponentFactory(new C49191ax(this));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo97181a(boolean z) {
        VideoPublishEditModel videoPublishEditModel = this.f123534q;
        if (videoPublishEditModel == null) {
            C52711k.m112237a("mModel");
        }
        if (videoPublishEditModel.isStickPointMode) {
            VideoPublishEditModel videoPublishEditModel2 = this.f123534q;
            if (videoPublishEditModel2 == null) {
                C52711k.m112237a("mModel");
            }
            if (!videoPublishEditModel2.mIsFromDraft) {
                C10691a.m21537a((Context) this.f33840g_, mo24478w().getString(R.string.drw)).mo19066a();
            }
            return;
        }
        EditToolbarViewModel editToolbarViewModel = this.f123533p;
        if (editToolbarViewModel == null) {
            C52711k.m112237a("toolbarViewModel");
        }
        editToolbarViewModel.mo97012b(1, false);
        EditViewModel editViewModel = this.f123532o;
        if (editViewModel == null) {
            C52711k.m112237a("editViewModel");
        }
        if (!editViewModel.mo97046p()) {
            EditToolbarViewModel editToolbarViewModel2 = this.f123533p;
            if (editToolbarViewModel2 == null) {
                C52711k.m112237a("toolbarViewModel");
            }
            if (editToolbarViewModel2.f123208e.f123881a) {
                EditToolbarViewModel editToolbarViewModel3 = this.f123533p;
                if (editToolbarViewModel3 == null) {
                    C52711k.m112237a("toolbarViewModel");
                }
                editToolbarViewModel3.f123208e.f123881a = false;
                C39630m.m88234a().mo58604b().mo80576a(true);
            }
        }
        EditViewModel editViewModel2 = this.f123532o;
        if (editViewModel2 == null) {
            C52711k.m112237a("editViewModel");
        }
        if (editViewModel2.mo97046p()) {
            C39630m.m88234a().mo58604b().mo80576a(true);
        }
        m106142h(z);
        EditViewModel editViewModel3 = this.f123532o;
        if (editViewModel3 == null) {
            C52711k.m112237a("editViewModel");
        }
        editViewModel3.mo97033a(false, false, false);
        EditViewModel editViewModel4 = this.f123532o;
        if (editViewModel4 == null) {
            C52711k.m112237a("editViewModel");
        }
        int H = editViewModel4.mo97026H();
        VideoPublishEditModel videoPublishEditModel3 = this.f123534q;
        if (videoPublishEditModel3 == null) {
            C52711k.m112237a("mModel");
        }
        if (H > videoPublishEditModel3.mCurMusicLength) {
            C49390ct ctVar = this.f123500E;
            if (ctVar == null) {
                C52711k.m112237a("musicController");
            }
            ctVar.mo97116a(false);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00db, code lost:
        if (r7 == null) goto L_0x00dd;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo97182a(boolean r21, boolean r22, boolean r23, java.lang.Runnable r24, boolean r25) {
        /*
            r20 = this;
            r6 = r20
            java.lang.String r0 = "successCallback"
            r5 = r24
            p2628d.p2639f.p2641b.C52711k.m112240b(r5, r0)
            java.lang.String r0 = "VEVideoPublishEditActivity compileStickers"
            com.p683ss.android.ugc.tools.utils.C50203g.m108358a(r0)
            com.ss.android.ugc.gamora.editor.bh r0 = r20.mo97168O()
            com.ss.android.ugc.gamora.editor.aa r0 = r0.f123741m
            com.ss.android.ugc.gamora.editor.bh r1 = r20.mo97168O()
            com.ss.android.ugc.gamora.editor.bs r1 = r1.f123742n
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x00a1
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.util.List r8 = r1.mo97270L()
            int r9 = r8.size()
            r10 = 0
        L_0x0031:
            if (r10 >= r9) goto L_0x0082
            java.lang.Object r11 = r8.get(r10)
            com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.l r11 = (com.p683ss.android.ugc.aweme.story.shootvideo.textsticker.view.C46757l) r11
            com.ss.android.ugc.aweme.story.shootvideo.textrecord.TextStickerData r11 = r11.getData()
            if (r11 == 0) goto L_0x007f
            com.ss.android.ugc.aweme.story.shootvideo.textfont.c r12 = com.p683ss.android.ugc.aweme.story.shootvideo.textfont.C46679c.m101291a()
            java.lang.String r11 = r11.getFontType()
            com.ss.android.ugc.aweme.story.shootvideo.textfont.b r11 = r12.mo93627b(r11)
            if (r11 == 0) goto L_0x007f
            java.lang.String r12 = r11.f117744b
            if (r12 != 0) goto L_0x0054
            java.lang.String r12 = ""
            goto L_0x0056
        L_0x0054:
            java.lang.String r12 = r11.f117744b
        L_0x0056:
            r4.append(r12)
            com.ss.android.ugc.effectmanager.effect.model.Effect r12 = r11.f117751i
            if (r12 != 0) goto L_0x0060
            java.lang.String r11 = ""
            goto L_0x006b
        L_0x0060:
            com.ss.android.ugc.effectmanager.effect.model.Effect r11 = r11.f117751i
            java.lang.String r12 = "textFont.effect"
            p2628d.p2639f.p2641b.C52711k.m112236a(r11, r12)
            java.lang.String r11 = r11.getEffectId()
        L_0x006b:
            r7.append(r11)
            int r11 = r8.size()
            int r11 = r11 - r3
            if (r10 == r11) goto L_0x007f
            java.lang.String r11 = ","
            r4.append(r11)
            java.lang.String r11 = ","
            r7.append(r11)
        L_0x007f:
            int r10 = r10 + 1
            goto L_0x0031
        L_0x0082:
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r8 = r6.f123534q
            if (r8 != 0) goto L_0x008b
            java.lang.String r9 = "mModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r9)
        L_0x008b:
            java.lang.String r4 = r4.toString()
            r8.textTypes = r4
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r4 = r6.f123534q
            if (r4 != 0) goto L_0x009a
            java.lang.String r8 = "mModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r8)
        L_0x009a:
            java.lang.String r7 = r7.toString()
            r4.textEffectIds = r7
            goto L_0x00bb
        L_0x00a1:
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r4 = r6.f123534q
            if (r4 != 0) goto L_0x00aa
            java.lang.String r7 = "mModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r7)
        L_0x00aa:
            java.lang.String r7 = ""
            r4.textTypes = r7
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r4 = r6.f123534q
            if (r4 != 0) goto L_0x00b7
            java.lang.String r7 = "mModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r7)
        L_0x00b7:
            java.lang.String r7 = ""
            r4.textEffectIds = r7
        L_0x00bb:
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r4 = r6.f123534q
            if (r4 != 0) goto L_0x00c4
            java.lang.String r7 = "mModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r7)
        L_0x00c4:
            boolean r4 = r4.isStatusVideoType()
            if (r4 == 0) goto L_0x00e2
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r4 = r6.f123534q
            if (r4 != 0) goto L_0x00d3
            java.lang.String r7 = "mModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r7)
        L_0x00d3:
            com.ss.android.ugc.aweme.status.StatusCreateVideoData r4 = r4.statusCreateVideoData
            if (r1 == 0) goto L_0x00dd
            java.lang.String r7 = r1.mo97271M()
            if (r7 != 0) goto L_0x00df
        L_0x00dd:
            java.lang.String r7 = ""
        L_0x00df:
            r4.setUserText(r7)
        L_0x00e2:
            com.ss.android.ugc.gamora.editor.bh r4 = r20.mo97168O()
            com.ss.android.ugc.gamora.editor.aq r4 = r4.f123743o
            com.ss.android.ugc.gamora.editor.bh r7 = r20.mo97168O()
            com.ss.android.ugc.gamora.editor.co r7 = r7.f123745q
            com.ss.android.ugc.gamora.editor.bh r8 = r20.mo97168O()
            com.ss.android.ugc.gamora.editor.cr r8 = r8.f123746r
            com.ss.android.ugc.gamora.editor.bh r9 = r20.mo97168O()
            com.ss.android.ugc.gamora.editor.sticker.donation.h r9 = r9.f123744p
            com.ss.android.ugc.asve.c.c r10 = r20.mo97189ag()
            if (r10 != 0) goto L_0x0103
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0103:
            com.ss.android.ugc.aweme.shortvideo.edit.bd r11 = r6.f123527ag
            if (r11 != 0) goto L_0x010c
            java.lang.String r12 = "mVideoSizeProvider"
            p2628d.p2639f.p2641b.C52711k.m112237a(r12)
        L_0x010c:
            r12 = 6
            com.ss.android.ugc.aweme.shortvideo.edit.m[] r12 = new com.p683ss.android.ugc.aweme.shortvideo.edit.C43658m[r12]
            r13 = 0
            if (r0 == 0) goto L_0x0119
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.i r0 = r0.mo97095F()
            com.ss.android.ugc.aweme.shortvideo.edit.m r0 = (com.p683ss.android.ugc.aweme.shortvideo.edit.C43658m) r0
            goto L_0x011a
        L_0x0119:
            r0 = r13
        L_0x011a:
            r12[r2] = r0
            if (r1 == 0) goto L_0x0125
            com.ss.android.ugc.aweme.story.shootvideo.textfont.i r0 = r1.mo97264F()
            com.ss.android.ugc.aweme.shortvideo.edit.m r0 = (com.p683ss.android.ugc.aweme.shortvideo.edit.C43658m) r0
            goto L_0x0126
        L_0x0125:
            r0 = r13
        L_0x0126:
            r12[r3] = r0
            if (r4 == 0) goto L_0x0131
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.poi.a r0 = r4.mo97141F()
            com.ss.android.ugc.aweme.shortvideo.edit.m r0 = (com.p683ss.android.ugc.aweme.shortvideo.edit.C43658m) r0
            goto L_0x0132
        L_0x0131:
            r0 = r13
        L_0x0132:
            r1 = 2
            r12[r1] = r0
            if (r7 == 0) goto L_0x013e
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.b r0 = r7.mo97302F()
            com.ss.android.ugc.aweme.shortvideo.edit.m r0 = (com.p683ss.android.ugc.aweme.shortvideo.edit.C43658m) r0
            goto L_0x013f
        L_0x013e:
            r0 = r13
        L_0x013f:
            r4 = 3
            r12[r4] = r0
            r0 = 4
            if (r8 == 0) goto L_0x014a
            com.ss.android.ugc.aweme.shortvideo.edit.m r7 = r8.mo97320M()
            goto L_0x014b
        L_0x014a:
            r7 = r13
        L_0x014b:
            r12[r0] = r7
            r0 = 5
            if (r9 == 0) goto L_0x0155
            com.ss.android.ugc.aweme.shortvideo.edit.m r7 = r9.mo97402N()
            goto L_0x0156
        L_0x0155:
            r7 = r13
        L_0x0156:
            r12[r0] = r7
            boolean r0 = com.p683ss.android.ugc.aweme.shortvideo.edit.C43766t.m96200a(r10, r11, r12)
            com.ss.android.ugc.aweme.shortvideo.edit.bd r7 = r6.f123527ag
            if (r7 != 0) goto L_0x0165
            java.lang.String r8 = "mVideoSizeProvider"
            p2628d.p2639f.p2641b.C52711k.m112237a(r8)
        L_0x0165:
            r7.mo88245c(r0)
            long r7 = java.lang.System.currentTimeMillis()
            com.ss.android.ugc.gamora.editor.bh r0 = r20.mo97168O()
            r0.mo97262a(r3)
            com.ss.android.ugc.gamora.editor.bh r0 = r20.mo97168O()
            com.ss.android.ugc.gamora.editor.aq r0 = r0.f123743o
            if (r0 == 0) goto L_0x01ef
            boolean r9 = r0.mo97146K()
            if (r9 == 0) goto L_0x01ef
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.poi.a r9 = r0.mo97141F()
            java.lang.String r15 = r9.mo88756n()
            java.lang.String r9 = "stickerController.stickerPath"
            p2628d.p2639f.p2641b.C52711k.m112236a(r15, r9)
            com.ss.android.ugc.aweme.shortvideo.edit.bd r9 = r6.f123527ag
            if (r9 != 0) goto L_0x0197
            java.lang.String r10 = "mVideoSizeProvider"
            p2628d.p2639f.p2641b.C52711k.m112237a(r10)
        L_0x0197:
            int r16 = r9.mo88379a()
            com.ss.android.ugc.aweme.shortvideo.edit.bd r9 = r6.f123527ag
            if (r9 != 0) goto L_0x01a4
            java.lang.String r10 = "mVideoSizeProvider"
            p2628d.p2639f.p2641b.C52711k.m112237a(r10)
        L_0x01a4:
            int r17 = r9.mo88380b()
            com.ss.android.ugc.asve.c.c r9 = r20.mo97189ag()
            if (r9 != 0) goto L_0x01b1
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x01b1:
            com.ss.android.vesdk.VESize r9 = r9.mo43037b()
            int r9 = r9.width
            com.ss.android.ugc.asve.c.c r10 = r20.mo97189ag()
            if (r10 != 0) goto L_0x01c0
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x01c0:
            com.ss.android.vesdk.VESize r10 = r10.mo43037b()
            int r10 = r10.height
            java.lang.String r11 = "draftDir"
            p2628d.p2639f.p2641b.C52711k.m112240b(r15, r11)
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.poi.a r14 = r0.mo97141F()
            r18 = r9
            r19 = r10
            a.i r9 = r14.mo88749b(r15, r16, r17, r18, r19)
            java.lang.String r10 = "stickerController.compil…idth, disVideoInitHeight)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r9, r10)
            com.ss.android.ugc.gamora.editor.aw$r r10 = new com.ss.android.ugc.gamora.editor.aw$r
            r10.<init>(r6, r0)
            a.g r10 = (p001a.C0011g) r10
            java.util.concurrent.Executor r0 = p001a.C0013i.f25b
            a.i r0 = r9.mo30c(r10, r0)
            java.lang.String r9 = "poiStickerScene!!\n      … Task.UI_THREAD_EXECUTOR)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r9)
            goto L_0x01f8
        L_0x01ef:
            a.i r0 = p001a.C0013i.m14a(r13)
            java.lang.String r9 = "Task.forResult(null)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r9)
        L_0x01f8:
            com.ss.android.ugc.gamora.editor.bh r9 = r20.mo97168O()
            com.ss.android.ugc.gamora.editor.cr r14 = r9.f123746r
            if (r14 == 0) goto L_0x027c
            boolean r9 = r14.mo97319L()
            if (r9 == 0) goto L_0x027c
            com.ss.android.ugc.aweme.services.effectplatform.IEffectPlatformFactory r9 = com.p683ss.android.ugc.aweme.effectplatforn.EffectPlatformFactory.createIEffectPlatformFactorybyMonsterPlugin()
            com.ss.android.ugc.aweme.services.effectplatform.IEffectPlatformFactory r9 = (com.p683ss.android.ugc.aweme.services.effectplatform.IEffectPlatformFactory) r9
            com.ss.android.ugc.aweme.services.effectplatform.EffectPlatformBuilder r10 = new com.ss.android.ugc.aweme.services.effectplatform.EffectPlatformBuilder
            r10.<init>()
            android.content.Context r11 = r20.mo24473s()
            com.ss.android.ugc.aweme.services.effectplatform.EffectPlatformBuilder r10 = r10.setContext(r11)
            java.lang.String r11 = "EffectPlatformBuilder().…(getApplicationContext())"
            p2628d.p2639f.p2641b.C52711k.m112236a(r10, r11)
            com.ss.android.ugc.effectmanager.g$a r9 = r9.createEffectConfigurationBuilder(r10)
            r9.mo96662a()
            java.lang.String r15 = r14.mo97321N()
            com.ss.android.ugc.aweme.shortvideo.edit.bd r9 = r6.f123527ag
            if (r9 != 0) goto L_0x0232
            java.lang.String r10 = "mVideoSizeProvider"
            p2628d.p2639f.p2641b.C52711k.m112237a(r10)
        L_0x0232:
            int r16 = r9.mo88379a()
            com.ss.android.ugc.aweme.shortvideo.edit.bd r9 = r6.f123527ag
            if (r9 != 0) goto L_0x023f
            java.lang.String r10 = "mVideoSizeProvider"
            p2628d.p2639f.p2641b.C52711k.m112237a(r10)
        L_0x023f:
            int r17 = r9.mo88380b()
            com.ss.android.ugc.asve.c.c r9 = r20.mo97189ag()
            if (r9 != 0) goto L_0x024c
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x024c:
            com.ss.android.vesdk.VESize r9 = r9.mo43037b()
            int r9 = r9.width
            com.ss.android.ugc.asve.c.c r10 = r20.mo97189ag()
            if (r10 != 0) goto L_0x025b
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x025b:
            com.ss.android.vesdk.VESize r10 = r10.mo43037b()
            int r10 = r10.height
            r18 = r9
            r19 = r10
            a.i r9 = r14.mo97323a(r15, r16, r17, r18, r19)
            com.ss.android.ugc.gamora.editor.aw$q r10 = new com.ss.android.ugc.gamora.editor.aw$q
            r10.<init>(r6)
            a.g r10 = (p001a.C0011g) r10
            java.util.concurrent.Executor r11 = p001a.C0013i.f25b
            a.i r9 = r9.mo30c(r10, r11)
            java.lang.String r10 = "commentStickerScene\n    … Task.UI_THREAD_EXECUTOR)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r9, r10)
            goto L_0x0285
        L_0x027c:
            a.i r9 = p001a.C0013i.m14a(r13)
            java.lang.String r10 = "Task.forResult(null)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r9, r10)
        L_0x0285:
            com.ss.android.ugc.gamora.editor.bh r10 = r20.mo97168O()
            com.ss.android.ugc.gamora.editor.sticker.donation.h r10 = r10.f123744p
            if (r10 == 0) goto L_0x0292
            a.i r10 = r10.mo97404P()
            goto L_0x0296
        L_0x0292:
            a.i r10 = p001a.C0013i.m14a(r13)
        L_0x0296:
            a.i[] r4 = new p001a.C0013i[r4]
            r4[r2] = r0
            r4[r3] = r9
            r4[r1] = r10
            java.util.List r0 = java.util.Arrays.asList(r4)
            java.util.Collection r0 = (java.util.Collection) r0
            a.i r0 = p001a.C0013i.m21b(r0)
            com.ss.android.ugc.gamora.editor.aw$s r4 = new com.ss.android.ugc.gamora.editor.aw$s
            r4.<init>(r6)
            a.g r4 = (p001a.C0011g) r4
            java.util.concurrent.Executor r9 = p001a.C0013i.f25b
            a.i r0 = r0.mo20a(r4, r9)
            java.lang.String r4 = "Task.whenAll(Arrays.asLi… Task.UI_THREAD_EXECUTOR)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r4)
            if (r25 == 0) goto L_0x02de
            a.i[] r4 = new p001a.C0013i[r1]
            r4[r2] = r0
            a.i r0 = r20.mo97186ad()
            r4[r3] = r0
            java.util.List r0 = java.util.Arrays.asList(r4)
            java.util.Collection r0 = (java.util.Collection) r0
            a.i r0 = p001a.C0013i.m21b(r0)
            com.ss.android.ugc.gamora.editor.aw$i r4 = new com.ss.android.ugc.gamora.editor.aw$i
            r4.<init>(r6)
            a.g r4 = (p001a.C0011g) r4
            java.util.concurrent.Executor r9 = p001a.C0013i.f25b
            a.i r0 = r0.mo20a(r4, r9)
            goto L_0x02f9
        L_0x02de:
            a.i[] r4 = new p001a.C0013i[r3]
            r4[r2] = r0
            java.util.List r0 = java.util.Arrays.asList(r4)
            java.util.Collection r0 = (java.util.Collection) r0
            a.i r0 = p001a.C0013i.m21b(r0)
            com.ss.android.ugc.gamora.editor.aw$j r4 = new com.ss.android.ugc.gamora.editor.aw$j
            r4.<init>(r6)
            a.g r4 = (p001a.C0011g) r4
            java.util.concurrent.Executor r9 = p001a.C0013i.f25b
            a.i r0 = r0.mo20a(r4, r9)
        L_0x02f9:
            boolean r4 = r0.mo26b()
            if (r4 != 0) goto L_0x0324
            r20.m106134as()
            a.i[] r1 = new p001a.C0013i[r1]
            r1[r2] = r0
            r9 = 0
            r11 = 500(0x1f4, double:2.47E-321)
            long r13 = java.lang.System.currentTimeMillis()
            long r13 = r13 - r7
            long r11 = r11 - r13
            long r7 = java.lang.Math.max(r9, r11)
            a.i r0 = p001a.C0013i.m12a(r7)
            r1[r3] = r0
            java.util.List r0 = java.util.Arrays.asList(r1)
            java.util.Collection r0 = (java.util.Collection) r0
            a.i r0 = p001a.C0013i.m21b(r0)
        L_0x0324:
            r7 = r0
            com.ss.android.ugc.gamora.editor.aw$h r8 = new com.ss.android.ugc.gamora.editor.aw$h
            r0 = r8
            r1 = r20
            r2 = r21
            r3 = r22
            r4 = r23
            r5 = r24
            r0.<init>(r1, r2, r3, r4, r5)
            a.g r8 = (p001a.C0011g) r8
            java.util.concurrent.Executor r0 = p001a.C0013i.f25b
            r7.mo20a(r8, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.gamora.editor.C49159aw.mo97182a(boolean, boolean, boolean, java.lang.Runnable, boolean):void");
    }

    /* renamed from: a */
    public final void mo97180a(StickerItemModel stickerItemModel) {
        int i;
        int i2;
        StickerItemModel stickerItemModel2;
        C52711k.m112240b(stickerItemModel, "stickerItemModel");
        if (C48016e.m103944b(stickerItemModel.path)) {
            VideoPublishEditModel videoPublishEditModel = this.f123534q;
            if (videoPublishEditModel == null) {
                C52711k.m112237a("mModel");
            }
            if (!videoPublishEditModel.hasInfoStickers()) {
                VideoPublishEditModel videoPublishEditModel2 = this.f123534q;
                if (videoPublishEditModel2 == null) {
                    C52711k.m112237a("mModel");
                }
                VideoPublishEditModel videoPublishEditModel3 = this.f123534q;
                if (videoPublishEditModel3 == null) {
                    C52711k.m112237a("mModel");
                }
                videoPublishEditModel2.infoStickerModel = new InfoStickerModel(videoPublishEditModel3.draftDir());
            }
            VideoPublishEditModel videoPublishEditModel4 = this.f123534q;
            if (videoPublishEditModel4 == null) {
                C52711k.m112237a("mModel");
            }
            if (videoPublishEditModel4.infoStickerModel.stickers.size() > 0) {
                VideoPublishEditModel videoPublishEditModel5 = this.f123534q;
                if (videoPublishEditModel5 == null) {
                    C52711k.m112237a("mModel");
                }
                i = 1;
                for (StickerItemModel stickerItemModel3 : videoPublishEditModel5.infoStickerModel.stickers) {
                    C52711k.m112236a((Object) stickerItemModel3, "item");
                    if (stickerItemModel3.isInfoSticker() && stickerItemModel3.layerWeight > i) {
                        i = stickerItemModel3.layerWeight;
                    }
                }
            } else {
                i = 1;
            }
            stickerItemModel.layerWeight += i;
            VideoPublishEditModel videoPublishEditModel6 = this.f123534q;
            if (videoPublishEditModel6 == null) {
                C52711k.m112237a("mModel");
            }
            videoPublishEditModel6.infoStickerModel.stickers.add(stickerItemModel);
            VideoPublishEditModel videoPublishEditModel7 = this.f123534q;
            if (videoPublishEditModel7 == null) {
                C52711k.m112237a("mModel");
            }
            StickerItemModel stickerItemModel4 = null;
            if (videoPublishEditModel7.infoStickerModel.stickers.size() > 0) {
                VideoPublishEditModel videoPublishEditModel8 = this.f123534q;
                if (videoPublishEditModel8 == null) {
                    C52711k.m112237a("mModel");
                }
                stickerItemModel2 = null;
                i2 = 1;
                for (StickerItemModel stickerItemModel5 : videoPublishEditModel8.infoStickerModel.stickers) {
                    if (stickerItemModel5.type == 4) {
                        stickerItemModel4 = stickerItemModel5;
                    } else if (stickerItemModel5.type == 7) {
                        stickerItemModel2 = stickerItemModel5;
                    } else if (stickerItemModel5.layerWeight > i2) {
                        i2 = stickerItemModel5.layerWeight;
                    }
                }
            } else {
                stickerItemModel2 = null;
                i2 = 1;
            }
            if (stickerItemModel4 == null || stickerItemModel2 == null) {
                if (stickerItemModel4 != null) {
                    stickerItemModel4.layerWeight = i2 + 1;
                }
                if (stickerItemModel2 != null) {
                    stickerItemModel2.layerWeight = i2 + 1;
                }
            } else {
                StickerItemModel stickerItemModel6 = stickerItemModel4.layerWeight > stickerItemModel2.layerWeight ? stickerItemModel4 : stickerItemModel2;
                if (stickerItemModel4.layerWeight > stickerItemModel2.layerWeight) {
                    stickerItemModel4 = stickerItemModel2;
                }
                stickerItemModel6.layerWeight = i2 + 2;
                stickerItemModel4.layerWeight = i2 + 1;
            }
        }
    }

    /* renamed from: a */
    public final void mo97124a(String str, int i, int i2, int i3, boolean z) {
        C52711k.m112240b(str, LeakCanaryFileProvider.f132050j);
        m106134as();
        C49186at atVar = new C49186at(this, str, i, i2, z);
        C0013i a = C0013i.m16a((Callable<TResult>) atVar);
        C49187au auVar = new C49187au(this, str, z, i3, i);
        a.mo20a((C0011g<TResult, TContinuationResult>) auVar, C0013i.f25b);
    }

    /* renamed from: a */
    public final void mo97123a() {
        mo97181a(false);
    }

    /* renamed from: Z */
    public final void mo97179Z() {
        mo97171R().mo97139H();
    }

    /* renamed from: ae */
    public final void mo97187ae() {
        mo97168O().mo97253S();
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

    /* renamed from: ar */
    private final void m106133ar() {
        if (C43441a.m95215b()) {
            mo24409d((C12924i) m106129an());
        }
    }

    /* renamed from: A */
    public final void mo24457A() {
        super.mo24457A();
        C45380af.m98935a().mo91717b();
    }

    /* renamed from: T */
    public final C49390ct mo97173T() {
        C49390ct ctVar = this.f123500E;
        if (ctVar == null) {
            C52711k.m112237a("musicController");
        }
        return ctVar;
    }

    /* renamed from: U */
    public final void mo97174U() {
        C49390ct ctVar = this.f123500E;
        if (ctVar == null) {
            C52711k.m112237a("musicController");
        }
        ctVar.mo97122f();
        m106132aq();
    }

    /* renamed from: af */
    public final C43449bd mo97188af() {
        C43449bd bdVar = this.f123527ag;
        if (bdVar == null) {
            C52711k.m112237a("mVideoSizeProvider");
        }
        return bdVar;
    }

    /* renamed from: ah */
    public final void mo97190ah() {
        C45546c cVar = this.f123528ah;
        if (cVar != null) {
            cVar.dismiss();
        }
        this.f123528ah = null;
    }

    /* renamed from: ap */
    private final void m106131ap() {
        EditViewModel editViewModel = this.f123532o;
        if (editViewModel == null) {
            C52711k.m112237a("editViewModel");
        }
        mo49444c(editViewModel, C49248bc.f123705a, new C11934u(), new C49179an(this));
    }

    /* renamed from: aq */
    private final void m106132aq() {
        EditViewModel editViewModel = this.f123532o;
        if (editViewModel == null) {
            C52711k.m112237a("editViewModel");
        }
        if (editViewModel.mo97021A()) {
            C43357b.f109622a.mo88292a();
        }
    }

    /* renamed from: ag */
    public final C20347c mo97189ag() {
        EditViewModel editViewModel = this.f123532o;
        if (editViewModel == null) {
            C52711k.m112237a("editViewModel");
        }
        return (C20347c) editViewModel.mo97038h().getValue();
    }

    /* renamed from: as */
    private final void m106134as() {
        if (this.f123528ah == null) {
            C45546c a = C45546c.m99207a(this.f33840g_, mo24478w().getString(R.string.cy3));
            if (a != null) {
                a.setIndeterminate(true);
            } else {
                a = null;
            }
            this.f123528ah = a;
        }
    }

    /* renamed from: au */
    private final void m106136au() {
        EditViewModel editViewModel = this.f123532o;
        if (editViewModel == null) {
            C52711k.m112237a("editViewModel");
        }
        editViewModel.mo97033a(false, false, false);
        m106137av();
        C43740a aVar = this.f123529l;
        VideoPublishEditModel videoPublishEditModel = this.f123534q;
        if (videoPublishEditModel == null) {
            C52711k.m112237a("mModel");
        }
        aVar.mo89202a(videoPublishEditModel);
        mo24409d((C12924i) this.f123529l);
        this.f123529l.mo89204c();
    }

    /* renamed from: aa */
    public final void mo97183aa() {
        EditViewModel editViewModel = this.f123532o;
        if (editViewModel == null) {
            C52711k.m112237a("editViewModel");
        }
        editViewModel.mo97033a(false, false, false);
        EditAudioRecordModel editAudioRecordModel = this.f123535r;
        if (editAudioRecordModel == null) {
            C52711k.m112237a("mEditAudioRecordModel");
        }
        editAudioRecordModel.mo96771a(Boolean.valueOf(true));
    }

    /* renamed from: at */
    private final void m106135at() {
        VideoPublishEditModel videoPublishEditModel = this.f123534q;
        if (videoPublishEditModel == null) {
            C52711k.m112237a("mModel");
        }
        videoPublishEditModel.veAudioEffectParam = null;
        VideoPublishEditModel videoPublishEditModel2 = this.f123534q;
        if (videoPublishEditModel2 == null) {
            C52711k.m112237a("mModel");
        }
        videoPublishEditModel2.veAudioRecorderParam = null;
        VideoPublishEditModel videoPublishEditModel3 = this.f123534q;
        if (videoPublishEditModel3 == null) {
            C52711k.m112237a("mModel");
        }
        videoPublishEditModel3.autoEnhanceOn = false;
        VideoPublishEditModel videoPublishEditModel4 = this.f123534q;
        if (videoPublishEditModel4 == null) {
            C52711k.m112237a("mModel");
        }
        videoPublishEditModel4.mSelectedId = 0;
        VideoPublishEditModel videoPublishEditModel5 = this.f123534q;
        if (videoPublishEditModel5 == null) {
            C52711k.m112237a("mModel");
        }
        videoPublishEditModel5.mTimeEffect = null;
        VideoPublishEditModel videoPublishEditModel6 = this.f123534q;
        if (videoPublishEditModel6 == null) {
            C52711k.m112237a("mModel");
        }
        videoPublishEditModel6.mCurFilterIds = null;
    }

    /* renamed from: Y */
    public final void mo97178Y() {
        String str;
        String str2;
        boolean aj = mo97192aj();
        if (aj) {
            new C10643a(this.f33840g_).mo18899b((int) R.string.gal).mo18900b((int) R.string.gam, (OnClickListener) null).mo18886a((int) R.string.gan, (OnClickListener) new C49195ba(new C49206g(this, aj))).mo18897a().mo18882b().show();
        } else {
            mo97197f(aj);
        }
        C43682b bVar = C43682b.f110613f;
        boolean a = this.f123529l.f110743i.mo89157a();
        String str3 = "click_video_trim";
        C23089d c = C43682b.m95953c();
        String str4 = "is_warn_shown";
        if (aj) {
            str = "1";
        } else {
            str = "0";
        }
        C23089d a2 = c.mo47829a(str4, str);
        String str5 = "segment_type";
        if (a) {
            str2 = "single";
        } else {
            str2 = "multiple";
        }
        C26890h.m65011a(str3, a2.mo47829a(str5, str2).f61491a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x007e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x007f A[RETURN] */
    /* renamed from: ac */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo97185ac() {
        /*
            r5 = this;
            com.ss.android.ugc.gamora.editor.bh r0 = r5.mo97168O()
            com.ss.android.ugc.gamora.editor.bs r0 = r0.f123742n
            if (r0 == 0) goto L_0x000d
            java.lang.String r0 = r0.mo97271M()
            goto L_0x000e
        L_0x000d:
            r0 = 0
        L_0x000e:
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r1 = r5.f123534q
            if (r1 != 0) goto L_0x0017
            java.lang.String r2 = "mModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r2)
        L_0x0017:
            com.ss.android.ugc.aweme.status.StatusCreateVideoData r1 = r1.statusCreateVideoData
            java.lang.String r1 = r1.getTemplateText()
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            r1 = 1
            r0 = r0 ^ r1
            if (r0 != 0) goto L_0x007f
            com.ss.android.ugc.gamora.editor.bh r0 = r5.mo97168O()
            com.ss.android.ugc.gamora.editor.aq r0 = r0.f123743o
            r2 = 0
            if (r0 == 0) goto L_0x0033
            boolean r0 = r0.mo97146K()
            goto L_0x0034
        L_0x0033:
            r0 = 0
        L_0x0034:
            if (r0 != 0) goto L_0x007f
            com.ss.android.ugc.gamora.editor.bh r0 = r5.mo97168O()
            com.ss.android.ugc.gamora.editor.co r0 = r0.f123745q
            if (r0 == 0) goto L_0x0043
            boolean r0 = r0.mo97306J()
            goto L_0x0044
        L_0x0043:
            r0 = 0
        L_0x0044:
            if (r0 != 0) goto L_0x007f
            com.ss.android.ugc.gamora.editor.cx r0 = r5.f123530m
            if (r0 == 0) goto L_0x004d
            boolean r0 = r0.f123990u
            goto L_0x004e
        L_0x004d:
            r0 = 0
        L_0x004e:
            if (r0 != 0) goto L_0x007f
            com.ss.android.ugc.gamora.editor.bh r0 = r5.mo97168O()
            com.ss.android.ugc.gamora.editor.bs r0 = r0.f123742n
            if (r0 == 0) goto L_0x0063
            java.util.List r0 = r0.mo97270L()
            if (r0 == 0) goto L_0x0063
            int r0 = r0.size()
            goto L_0x0064
        L_0x0063:
            r0 = 0
        L_0x0064:
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r3 = r5.f123534q
            if (r3 != 0) goto L_0x006d
            java.lang.String r4 = "mModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r4)
        L_0x006d:
            com.ss.android.ugc.aweme.infosticker.InfoStickerModel r3 = r3.infoStickerModel
            if (r3 == 0) goto L_0x007a
            java.util.List<com.ss.android.ugc.aweme.infosticker.StickerItemModel> r3 = r3.stickers
            if (r3 == 0) goto L_0x007a
            int r3 = r3.size()
            goto L_0x007b
        L_0x007a:
            r3 = 0
        L_0x007b:
            if (r0 >= r3) goto L_0x007e
            goto L_0x007f
        L_0x007e:
            return r2
        L_0x007f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.gamora.editor.C49159aw.mo97185ac():boolean");
    }

    /* renamed from: ai */
    public final void mo97191ai() {
        Activity activity = this.f33840g_;
        if (activity != null) {
            JediViewModel a = C48927d.m105736a((FragmentActivity) activity).mo96760a(EditInfoStickerViewModel.class);
            C52711k.m112236a((Object) a, "JediViewModelProviders.o…kerViewModel::class.java)");
            EditInfoStickerViewModel editInfoStickerViewModel = (EditInfoStickerViewModel) a;
            C20347c ag = mo97189ag();
            if (ag == null) {
                C52711k.m112234a();
            }
            Integer valueOf = Integer.valueOf(ag.mo42966A());
            C20347c ag2 = mo97189ag();
            if (ag2 == null) {
                C52711k.m112234a();
            }
            editInfoStickerViewModel.mo96854a(new C52847n(valueOf, Integer.valueOf(ag2.mo43071k())));
            return;
        }
        throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
    }

    /* renamed from: z */
    public final void mo24481z() {
        super.mo24481z();
        C50203g.m108358a("VEVideoPublishEditActivity onResume EditRootScene");
        boolean z = false;
        this.f123503H = false;
        C45380af.m98935a().mo91715a(this.f33840g_, (ViewGroup) this.f33834b);
        if (this.f123532o == null) {
            C52711k.m112237a("editViewModel");
        }
        if (EditViewModel.m105818D()) {
            C49115am amVar = (C49115am) mo24388a("MusicScene");
            if (amVar != null) {
                z = amVar.mo97140I();
            }
            EditViewModel editViewModel = this.f123532o;
            if (editViewModel == null) {
                C52711k.m112237a("editViewModel");
            }
            if (!editViewModel.mo97046p()) {
                EditToolbarViewModel editToolbarViewModel = this.f123533p;
                if (editToolbarViewModel == null) {
                    C52711k.m112237a("toolbarViewModel");
                }
                if (editToolbarViewModel.f123208e.f123883c && !z) {
                    EditToolbarViewModel editToolbarViewModel2 = this.f123533p;
                    if (editToolbarViewModel2 == null) {
                        C52711k.m112237a("toolbarViewModel");
                    }
                    editToolbarViewModel2.mo97012b(1, true);
                }
            }
        }
    }

    /* renamed from: av */
    private final void m106137av() {
        EditFilterViewModel editFilterViewModel = this.f123539v;
        if (editFilterViewModel == null) {
            C52711k.m112237a("filterViewModel");
        }
        CommentVideoModel commentVideoModel = null;
        editFilterViewModel.mo96828f().setValue(null);
        EditAudioEffectViewModel editAudioEffectViewModel = this.f123538u;
        if (editAudioEffectViewModel == null) {
            C52711k.m112237a("audioEffectViewModel");
        }
        editAudioEffectViewModel.mo96769a(new Object());
        VideoPublishEditModel videoPublishEditModel = this.f123534q;
        if (videoPublishEditModel == null) {
            C52711k.m112237a("mModel");
        }
        if (!videoPublishEditModel.autoEnhanceOn) {
            EditToolbarViewModel editToolbarViewModel = this.f123533p;
            if (editToolbarViewModel == null) {
                C52711k.m112237a("toolbarViewModel");
            }
            Activity activity = this.f33840g_;
            if (activity == null) {
                C52711k.m112234a();
            }
            Drawable a = C0726c.m2091a((Context) activity, (int) R.drawable.e2);
            if (a == null) {
                C52711k.m112234a();
            }
            C52711k.m112236a((Object) a, "ContextCompat.getDrawabl…c_auto_enhance_off_new)!!");
            editToolbarViewModel.mo97013b(a);
            EditAutoEnhanceViewModel editAutoEnhanceViewModel = this.f123541x;
            if (editAutoEnhanceViewModel == null) {
                C52711k.m112237a("autoEnhanceViewModel");
            }
            editAutoEnhanceViewModel.mo96786a(false);
        }
        Activity activity2 = this.f33840g_;
        if (activity2 != null) {
            C0209x a2 = C0214z.m440a((FragmentActivity) activity2).mo359a(EditEffectVideoModel.class);
            C52711k.m112236a((Object) a2, "ViewModelProviders.of(ac…ctVideoModel::class.java)");
            ((EditEffectVideoModel) a2).mo58851i().setValue(null);
            C44810b.m98012a().clear();
            mo97196e(true);
            m106135at();
            EditViewModel editViewModel = this.f123532o;
            if (editViewModel == null) {
                C52711k.m112237a("editViewModel");
            }
            if (editViewModel != null) {
                VideoPublishEditModel e = editViewModel.mo97035e();
                if (e != null) {
                    commentVideoModel = e.commentVideoModel;
                }
            }
            if (commentVideoModel != null) {
                EditViewModel editViewModel2 = this.f123532o;
                if (editViewModel2 == null) {
                    C52711k.m112237a("editViewModel");
                }
                if (editViewModel2 != null) {
                    VideoPublishEditModel e2 = editViewModel2.mo97035e();
                    if (e2 != null) {
                        CommentVideoModel commentVideoModel2 = e2.commentVideoModel;
                        if (commentVideoModel2 != null) {
                            commentVideoModel2.setStartTime(0);
                        }
                    }
                }
                EditViewModel editViewModel3 = this.f123532o;
                if (editViewModel3 == null) {
                    C52711k.m112237a("editViewModel");
                }
                if (editViewModel3 != null) {
                    VideoPublishEditModel e3 = editViewModel3.mo97035e();
                    if (e3 != null) {
                        CommentVideoModel commentVideoModel3 = e3.commentVideoModel;
                        if (commentVideoModel3 != null) {
                            commentVideoModel3.setEndTime(0);
                            return;
                        }
                    }
                }
            }
            return;
        }
        throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
    }

    /* renamed from: X */
    public final void mo97177X() {
        if (mo97168O().f123742n == null) {
            EditToolbarViewModel editToolbarViewModel = this.f123533p;
            if (editToolbarViewModel == null) {
                C52711k.m112237a("toolbarViewModel");
            }
            editToolbarViewModel.mo97019e(3, false);
            return;
        }
        C49256bh O = mo97168O();
        C49131aq aqVar = O.f123743o;
        if (aqVar != null) {
            aqVar.mo97142G();
            EditPoiStickerViewModel editPoiStickerViewModel = O.f123750v;
            if (editPoiStickerViewModel == null) {
                C52711k.m112237a("editPoiStickerViewModel");
            }
            editPoiStickerViewModel.mo96910e();
        }
        C49307bs bsVar = O.f123742n;
        if (bsVar != null) {
            EditViewModel editViewModel = O.f123749u;
            if (editViewModel == null) {
                C52711k.m112237a("editViewModel");
            }
            bsVar.mo97274a((C20347c) editViewModel.mo97038h().getValue());
        }
        C49307bs bsVar2 = O.f123742n;
        if (bsVar2 != null) {
            bsVar2.mo97264F().mo93656b((C46757l) null);
        }
        EditToolbarViewModel editToolbarViewModel2 = O.f123720C;
        if (editToolbarViewModel2 == null) {
            C52711k.m112237a("editToolbarViewModel");
        }
        editToolbarViewModel2.mo97015c(2, false);
        EditViewModel editViewModel2 = this.f123532o;
        if (editViewModel2 == null) {
            C52711k.m112237a("editViewModel");
        }
        VideoPublishEditModel e = editViewModel2.mo97035e();
        C52711k.m112240b(e, "model");
        C26890h.m65011a("click_text_entrance", C23089d.m56640a().mo47829a("creation_id", e.creationId).mo47829a("shoot_way", e.mShootWay).mo47829a("content_type", C43434az.m95202a(e)).mo47829a("content_source", C43434az.m95207b(e)).mo47829a("enter_from", "video_edit_page").f61491a);
    }

    /* renamed from: ad */
    public final C0013i<Void> mo97186ad() {
        C49307bs bsVar = mo97168O().f123742n;
        if (bsVar == null || !bsVar.mo97268J()) {
            C0013i<Void> a = C0013i.m14a(null);
            C52711k.m112236a((Object) a, "Task.forResult(null)");
            return a;
        }
        VideoPublishEditModel videoPublishEditModel = this.f123534q;
        if (videoPublishEditModel == null) {
            C52711k.m112237a("mModel");
        }
        StringBuilder sb = new StringBuilder();
        Application b = C39629l.m88233b();
        C52711k.m112236a((Object) b, "CameraClient.getApplication()");
        sb.append(b.getFilesDir().toString());
        sb.append(File.separator);
        sb.append("effect");
        sb.append(File.separator);
        sb.append("text_stickers");
        sb.append(File.separator);
        sb.append(System.currentTimeMillis());
        sb.append(File.separator);
        String uniqueVideoSessionDir = videoPublishEditModel.uniqueVideoSessionDir(sb.toString());
        C52711k.m112236a((Object) uniqueVideoSessionDir, "draftDir");
        C43449bd bdVar = this.f123527ag;
        if (bdVar == null) {
            C52711k.m112237a("mVideoSizeProvider");
        }
        int a2 = bdVar.mo88379a();
        C43449bd bdVar2 = this.f123527ag;
        if (bdVar2 == null) {
            C52711k.m112237a("mVideoSizeProvider");
        }
        int b2 = bdVar2.mo88380b();
        C20347c ag = mo97189ag();
        if (ag == null) {
            C52711k.m112234a();
        }
        int i = ag.mo43037b().width;
        C20347c ag2 = mo97189ag();
        if (ag2 == null) {
            C52711k.m112234a();
        }
        C0013i<Void> c = bsVar.mo97273a(uniqueVideoSessionDir, a2, b2, i, ag2.mo43037b().height).mo30c(new C49219t(this), C0013i.f25b);
        C52711k.m112236a((Object) c, "textStickerScene\n       … Task.UI_THREAD_EXECUTOR)");
        return c;
    }

    /* renamed from: W */
    public final void mo97176W() {
        EditViewModel editViewModel = this.f123532o;
        if (editViewModel == null) {
            C52711k.m112237a("editViewModel");
        }
        mo49443b(editViewModel, C49226ax.f123633a, new C11934u(), new C49163ac(this));
        EditViewModel editViewModel2 = this.f123532o;
        if (editViewModel2 == null) {
            C52711k.m112237a("editViewModel");
        }
        mo49444c(editViewModel2, C49246ba.f123703a, new C11934u(), new C49164ad(this));
        EditPreviewViewModel editPreviewViewModel = this.f123524ad;
        if (editPreviewViewModel == null) {
            C52711k.m112237a("previewViewModel");
        }
        mo49444c(editPreviewViewModel, C49247bb.f123704a, new C11934u(), new C49165ae(this));
        EditViewModel editViewModel3 = this.f123532o;
        if (editViewModel3 == null) {
            C52711k.m112237a("editViewModel");
        }
        C0184k kVar = this;
        editViewModel3.mo97039i().observe(kVar, new C49171af(this));
        EditViewModel editViewModel4 = this.f123532o;
        if (editViewModel4 == null) {
            C52711k.m112237a("editViewModel");
        }
        editViewModel4.mo97044n().observe(kVar, new C49172ag(this));
        EditViewModel editViewModel5 = this.f123532o;
        if (editViewModel5 == null) {
            C52711k.m112237a("editViewModel");
        }
        editViewModel5.mo97045o().observe(kVar, new C49173ah(this));
        EditViewModel editViewModel6 = this.f123532o;
        if (editViewModel6 == null) {
            C52711k.m112237a("editViewModel");
        }
        editViewModel6.mo97042l().observe(kVar, new C49224y(this));
        EditViewModel editViewModel7 = this.f123532o;
        if (editViewModel7 == null) {
            C52711k.m112237a("editViewModel");
        }
        editViewModel7.mo97043m().observe(kVar, new C49225z(this));
        EditAudioRecordModel editAudioRecordModel = this.f123535r;
        if (editAudioRecordModel == null) {
            C52711k.m112237a("mEditAudioRecordModel");
        }
        mo22547a(editAudioRecordModel, C49227ay.f123634a, C11896i.m24255a(), new C49161aa(this));
        EditLyricStickerViewModel editLyricStickerViewModel = this.f123536s;
        if (editLyricStickerViewModel == null) {
            C52711k.m112237a("mEditLyricStickerViewModel");
        }
        mo49444c(editLyricStickerViewModel, C49228az.f123635a, new C11934u(), new C49162ab(this));
        m106131ap();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002f, code lost:
        if (r0.veAudioRecorderParam.getNeedOriginalSound() == false) goto L_0x0031;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0081  */
    /* renamed from: aj */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo97192aj() {
        /*
            r9 = this;
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r9.f123534q
            if (r0 != 0) goto L_0x0009
            java.lang.String r1 = "mModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x0009:
            com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam r0 = r0.veAudioRecorderParam
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0033
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r9.f123534q
            if (r0 != 0) goto L_0x0018
            java.lang.String r3 = "mModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r3)
        L_0x0018:
            com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam r0 = r0.veAudioRecorderParam
            boolean r0 = r0.hasRecord()
            if (r0 != 0) goto L_0x0031
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r9.f123534q
            if (r0 != 0) goto L_0x0029
            java.lang.String r3 = "mModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r3)
        L_0x0029:
            com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam r0 = r0.veAudioRecorderParam
            boolean r0 = r0.getNeedOriginalSound()
            if (r0 != 0) goto L_0x0033
        L_0x0031:
            r0 = 1
            goto L_0x0034
        L_0x0033:
            r0 = 0
        L_0x0034:
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r3 = r9.f123534q
            if (r3 != 0) goto L_0x003d
            java.lang.String r4 = "mModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r4)
        L_0x003d:
            com.ss.android.ugc.aweme.infosticker.InfoStickerModel r3 = r3.infoStickerModel
            if (r3 != 0) goto L_0x0043
            r3 = 0
            goto L_0x0052
        L_0x0043:
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r3 = r9.f123534q
            if (r3 != 0) goto L_0x004c
            java.lang.String r4 = "mModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r4)
        L_0x004c:
            com.ss.android.ugc.aweme.infosticker.InfoStickerModel r3 = r3.infoStickerModel
            boolean r3 = r3.hasLyricSticker()
        L_0x0052:
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r4 = r9.f123534q
            if (r4 != 0) goto L_0x005b
            java.lang.String r5 = "mModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r5)
        L_0x005b:
            com.ss.android.ugc.aweme.effect.EffectPointModel r4 = r4.mTimeEffect
            if (r4 == 0) goto L_0x007e
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r4 = r9.f123534q
            if (r4 != 0) goto L_0x0068
            java.lang.String r5 = "mModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r5)
        L_0x0068:
            com.ss.android.ugc.aweme.effect.EffectPointModel r4 = r4.mTimeEffect
            java.lang.String r5 = "mModel.mTimeEffect"
            p2628d.p2639f.p2641b.C52711k.m112236a(r4, r5)
            java.lang.String r4 = r4.getKey()
            java.lang.String r5 = "0"
            boolean r4 = p2628d.p2639f.p2641b.C52711k.m112239a(r4, r5)
            r4 = r4 ^ r2
            if (r4 == 0) goto L_0x007e
            r4 = 1
            goto L_0x007f
        L_0x007e:
            r4 = 0
        L_0x007f:
            if (r4 != 0) goto L_0x012a
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r4 = r9.f123534q
            if (r4 != 0) goto L_0x008a
            java.lang.String r5 = "mModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r5)
        L_0x008a:
            java.util.ArrayList<com.ss.android.ugc.aweme.effect.EffectPointModel> r4 = r4.mEffectList
            if (r4 == 0) goto L_0x00c1
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Collection r5 = (java.util.Collection) r5
            java.util.Iterator r4 = r4.iterator()
        L_0x009b:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x00be
            java.lang.Object r6 = r4.next()
            r7 = r6
            com.ss.android.ugc.aweme.effect.EffectPointModel r7 = (com.p683ss.android.ugc.aweme.effect.EffectPointModel) r7
            java.lang.String r8 = "it"
            p2628d.p2639f.p2641b.C52711k.m112236a(r7, r8)
            java.lang.String r7 = r7.getKey()
            java.lang.String r8 = "0"
            boolean r7 = p2628d.p2639f.p2641b.C52711k.m112239a(r7, r8)
            r7 = r7 ^ r2
            if (r7 == 0) goto L_0x009b
            r5.add(r6)
            goto L_0x009b
        L_0x00be:
            java.util.List r5 = (java.util.List) r5
            goto L_0x00c2
        L_0x00c1:
            r5 = 0
        L_0x00c2:
            boolean r4 = com.bytedance.common.utility.C9414h.m18631b(r5)
            if (r4 != 0) goto L_0x012a
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r4 = r9.f123534q
            if (r4 != 0) goto L_0x00d1
            java.lang.String r5 = "mModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r5)
        L_0x00d1:
            boolean r4 = r4.hasInfoStickers()
            if (r4 != 0) goto L_0x012a
            com.ss.android.ugc.gamora.editor.bh r4 = r9.mo97168O()
            boolean r4 = r4.mo97257W()
            if (r4 != 0) goto L_0x012a
            if (r0 != 0) goto L_0x012a
            if (r3 != 0) goto L_0x012a
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r9.f123534q
            if (r0 != 0) goto L_0x00ee
            java.lang.String r3 = "mModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r3)
        L_0x00ee:
            int r0 = r0.mSelectedId
            if (r0 != 0) goto L_0x012a
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r9.f123534q
            if (r0 != 0) goto L_0x00fb
            java.lang.String r3 = "mModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r3)
        L_0x00fb:
            com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioEffectParam r0 = r0.veAudioEffectParam
            if (r0 != 0) goto L_0x012a
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r9.f123534q
            if (r0 != 0) goto L_0x0108
            java.lang.String r3 = "mModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r3)
        L_0x0108:
            boolean r0 = r0.autoEnhanceOn
            if (r0 != 0) goto L_0x012a
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r9.f123534q
            if (r0 != 0) goto L_0x0115
            java.lang.String r3 = "mModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r3)
        L_0x0115:
            com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam r0 = r0.veAudioRecorderParam
            if (r0 != 0) goto L_0x012a
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r9.f123534q
            if (r0 != 0) goto L_0x0122
            java.lang.String r3 = "mModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r3)
        L_0x0122:
            boolean r0 = r0.hasSubtitle()
            if (r0 == 0) goto L_0x0129
            goto L_0x012a
        L_0x0129:
            return r1
        L_0x012a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.gamora.editor.C49159aw.mo97192aj():boolean");
    }

    /* renamed from: ab */
    public final void mo97184ab() {
        boolean z;
        boolean z2;
        C50203g.m108358a("VEVideoPublishEditActivity initAllStickerModules");
        mo97168O().mo97251Q();
        if (this.f123532o == null) {
            C52711k.m112237a("editViewModel");
        }
        if (EditViewModel.m105819E()) {
            mo24409d((C12924i) (C49252bf) this.f123518X.getValue());
            C49256bh O = mo97168O();
            if (O.f123743o == null) {
                O.f123743o = new C49131aq();
                C49131aq aqVar = O.f123743o;
                if (aqVar != null) {
                    C49527v vVar = O.f123739k;
                    if (vVar == null) {
                        C52711k.m112237a("gestureListenerManager");
                    }
                    C52711k.m112240b(vVar, "<set-?>");
                    aqVar.f123445j = vVar;
                }
                C49131aq aqVar2 = O.f123743o;
                if (aqVar2 != null) {
                    C49391cu cuVar = O.f123740l;
                    if (cuVar == null) {
                        C52711k.m112237a("deleteComponent");
                    }
                    C52711k.m112240b(cuVar, "deleteComponent");
                    aqVar2.mo97141F().f110229f = cuVar;
                }
                C49131aq aqVar3 = O.f123743o;
                if (aqVar3 == null) {
                    C52711k.m112234a();
                }
                O.mo24389a((int) R.id.cz_, (C12924i) aqVar3, "EditPoiStickerScene");
            }
            if (O.f123744p == null) {
                O.f123744p = new C49483c();
                C49511h hVar = O.f123744p;
                if (hVar != null) {
                    C49527v vVar2 = O.f123739k;
                    if (vVar2 == null) {
                        C52711k.m112237a("gestureListenerManager");
                    }
                    hVar.mo97410a(vVar2);
                }
                C49511h hVar2 = O.f123744p;
                if (hVar2 != null) {
                    C49391cu cuVar2 = O.f123740l;
                    if (cuVar2 == null) {
                        C52711k.m112237a("deleteComponent");
                    }
                    hVar2.mo97409a(cuVar2);
                }
                C49511h hVar3 = O.f123744p;
                if (hVar3 != null) {
                    C49389cs csVar = O.f123735R;
                    if (csVar == null) {
                        C52711k.m112237a("compileCallback");
                    }
                    hVar3.mo97408a(csVar);
                }
                C49511h hVar4 = O.f123744p;
                if (!(hVar4 instanceof C12924i)) {
                    hVar4 = null;
                }
                C12924i iVar = (C12924i) hVar4;
                if (iVar != null) {
                    O.mo24389a((int) R.id.ezs, iVar, "EditDonationStickerScene");
                }
                C49511h hVar5 = O.f123744p;
                if (hVar5 != null) {
                    hVar5.mo97407a((C23522b<View>) new C49278i<View>(O));
                }
                C49511h hVar6 = O.f123744p;
                if (hVar6 != null) {
                    hVar6.mo97406a((C23521a<InteractStickerBaseView, InteractStickerBaseView>) new C49279j<InteractStickerBaseView,InteractStickerBaseView>(O));
                }
            }
            if (O.f123745q == null) {
                O.f123745q = new C49378co();
                C49378co coVar = O.f123745q;
                if (coVar != null) {
                    C49527v vVar3 = O.f123739k;
                    if (vVar3 == null) {
                        C52711k.m112237a("gestureListenerManager");
                    }
                    C52711k.m112240b(vVar3, "<set-?>");
                    coVar.f123947j = vVar3;
                }
                C49378co coVar2 = O.f123745q;
                if (coVar2 != null) {
                    C49391cu cuVar3 = O.f123740l;
                    if (cuVar3 == null) {
                        C52711k.m112237a("deleteComponent");
                    }
                    C52711k.m112240b(cuVar3, "deleteComponent");
                    coVar2.mo97302F().f110229f = cuVar3;
                }
                C49378co coVar3 = O.f123745q;
                if (coVar3 != null) {
                    View j_ = O.mo24467j_(R.id.b_l);
                    C52711k.m112236a((Object) j_, "requireViewById(R.id.layout_vote_display)");
                    VotingStickerLayout votingStickerLayout = (VotingStickerLayout) j_;
                    C52711k.m112240b(votingStickerLayout, "<set-?>");
                    coVar3.f123948k = votingStickerLayout;
                }
                C49378co coVar4 = O.f123745q;
                if (coVar4 == null) {
                    C52711k.m112234a();
                }
                O.mo24389a((int) R.id.cza, (C12924i) coVar4, "EditVoteStickerScene");
            }
            if (O.f123746r == null) {
                O.f123746r = new C49431k();
                C49388cr crVar = O.f123746r;
                if (crVar != null) {
                    C49527v vVar4 = O.f123739k;
                    if (vVar4 == null) {
                        C52711k.m112237a("gestureListenerManager");
                    }
                    crVar.mo97328a(vVar4);
                }
                C49388cr crVar2 = O.f123746r;
                if (crVar2 != null) {
                    C49391cu cuVar4 = O.f123740l;
                    if (cuVar4 == null) {
                        C52711k.m112237a("deleteComponent");
                    }
                    crVar2.mo97327a(cuVar4);
                }
                if (O.f123746r instanceof C12924i) {
                    C49388cr crVar3 = O.f123746r;
                    if (crVar3 != null) {
                        O.mo24389a((int) R.id.ezs, (C12924i) crVar3, "EditCommentStickerScene");
                    } else {
                        throw new C52857u("null cannot be cast to non-null type com.bytedance.scene.Scene");
                    }
                }
                C49388cr crVar4 = O.f123746r;
                if (crVar4 != null) {
                    crVar4.mo97325a((C23522b<View>) new C49280k<View>(O));
                }
                C49388cr crVar5 = O.f123746r;
                if (crVar5 != null) {
                    crVar5.mo97324a((C23521a<InteractStickerBaseView, InteractStickerBaseView>) new C49281l<InteractStickerBaseView,InteractStickerBaseView>(O));
                }
            }
            O.mo97250P();
            C49131aq aqVar4 = O.f123743o;
            if (aqVar4 != null) {
                C43598a F = aqVar4.mo97141F();
                EditViewModel editViewModel = aqVar4.f123446k;
                if (editViewModel == null) {
                    C52711k.m112237a("editViewModel");
                }
                F.mo88744a((C20347c) editViewModel.mo97038h().getValue());
                EditViewModel editViewModel2 = aqVar4.f123446k;
                if (editViewModel2 == null) {
                    C52711k.m112237a("editViewModel");
                }
                List a = C43577d.m95726a(editViewModel2.mo97035e().getMainBusinessContext(), 0, C43596f.TRACK_PAGE_EDIT);
                Collection collection = a;
                if (collection == null || collection.isEmpty()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z2) {
                    Object obj = a.get(0);
                    C52711k.m112236a(obj, "poiStickerStructs[0]");
                    if (((InteractStickerStruct) obj).getPoiStruct() != null) {
                        aqVar4.mo97141F().mo88746a((InteractStickerStruct) a.get(0));
                    }
                }
            }
            C49378co coVar5 = O.f123745q;
            if (coVar5 != null) {
                EditViewModel editViewModel3 = coVar5.f123949l;
                if (editViewModel3 == null) {
                    C52711k.m112237a("editViewModel");
                }
                List a2 = C43577d.m95726a(editViewModel3.mo97035e().getMainBusinessContext(), 1, C43596f.TRACK_PAGE_EDIT);
                C43619b F2 = coVar5.mo97302F();
                EditViewModel editViewModel4 = coVar5.f123949l;
                if (editViewModel4 == null) {
                    C52711k.m112237a("editViewModel");
                }
                F2.mo88744a((C20347c) editViewModel4.mo97038h().getValue());
                Collection collection2 = a2;
                if (collection2 == null || collection2.isEmpty()) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    Object obj2 = a2.get(0);
                    C52711k.m112236a(obj2, "voteStickerStructs[0]");
                    if (((InteractStickerStruct) obj2).getVoteStruct() != null) {
                        coVar5.mo97302F().mo88746a((InteractStickerStruct) a2.get(0));
                    }
                }
            }
            C49388cr crVar6 = O.f123746r;
            if (crVar6 != null) {
                crVar6.mo97314G();
            }
            C49511h hVar7 = O.f123744p;
            if (hVar7 != null) {
                hVar7.mo97398J();
            }
            VideoPublishEditModel videoPublishEditModel = O.f123751w;
            if (videoPublishEditModel == null) {
                C52711k.m112237a("publishEditModel");
            }
            if (!videoPublishEditModel.mIsFromDraft) {
                O.mo97255U();
            }
            mo97168O().mo97252R();
        }
        if (this.f123532o == null) {
            C52711k.m112237a("editViewModel");
        }
        if (EditViewModel.m105822s()) {
            C49256bh O2 = mo97168O();
            if (O2.f123742n == null) {
                C49307bs bsVar = new C49307bs();
                C49527v vVar5 = O2.f123739k;
                if (vVar5 == null) {
                    C52711k.m112237a("gestureListenerManager");
                }
                C52711k.m112240b(vVar5, "<set-?>");
                bsVar.f123822j = vVar5;
                C49391cu cuVar5 = O2.f123740l;
                if (cuVar5 == null) {
                    C52711k.m112237a("deleteComponent");
                }
                C52711k.m112240b(cuVar5, "deleteComponent");
                bsVar.mo97264F().f117785f = cuVar5;
                O2.f123742n = bsVar;
                C49307bs bsVar2 = O2.f123742n;
                if (bsVar2 != null) {
                    View inflate = ((ViewStub) O2.mo24467j_(R.id.drv)).inflate();
                    if (inflate != null) {
                        TextStickerInputLayout textStickerInputLayout = (TextStickerInputLayout) inflate;
                        C52711k.m112240b(textStickerInputLayout, "<set-?>");
                        bsVar2.f123823k = textStickerInputLayout;
                    } else {
                        throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.TextStickerInputLayout");
                    }
                }
                C49307bs bsVar3 = O2.f123742n;
                if (bsVar3 != null) {
                    TextStickerInputLayout textStickerInputLayout2 = bsVar3.f123823k;
                    if (textStickerInputLayout2 == null) {
                        C52711k.m112237a("textStickerInputLayout");
                    }
                    if (textStickerInputLayout2 != null) {
                        VideoPublishEditModel videoPublishEditModel2 = O2.f123751w;
                        if (videoPublishEditModel2 == null) {
                            C52711k.m112237a("publishEditModel");
                        }
                        textStickerInputLayout2.setAVETParameter(videoPublishEditModel2.getAvetParameter());
                    }
                }
                C49307bs bsVar4 = O2.f123742n;
                if (bsVar4 == null) {
                    C52711k.m112234a();
                }
                O2.mo24389a((int) R.id.cz_, (C12924i) bsVar4, "EditTextStickerScene");
                C49307bs bsVar5 = O2.f123742n;
                if (bsVar5 != null) {
                    C46696a aeVar = new C49262ae(O2);
                    C52711k.m112240b(aeVar, "listener");
                    bsVar5.mo97264F().f117784e = aeVar;
                }
                C49307bs bsVar6 = O2.f123742n;
                if (bsVar6 != null) {
                    C23522b<C46757l> afVar = new C49263af<>(O2);
                    C52711k.m112240b(afVar, "onTimeClickListener");
                    bsVar6.mo97264F().f117796q = afVar;
                }
                C49307bs bsVar7 = O2.f123742n;
                if (bsVar7 != null) {
                    C23521a<C46757l, C46757l> agVar = new C49264ag<>(O2);
                    C52711k.m112240b(agVar, "onChangeIndexToTopListener");
                    bsVar7.mo97264F().f117769A = agVar;
                }
            }
            VideoPublishEditModel videoPublishEditModel3 = this.f123534q;
            if (videoPublishEditModel3 == null) {
                C52711k.m112237a("mModel");
            }
            if (videoPublishEditModel3.isStatusVideoType()) {
                VideoPublishEditModel videoPublishEditModel4 = this.f123534q;
                if (videoPublishEditModel4 == null) {
                    C52711k.m112237a("mModel");
                }
                if (!videoPublishEditModel4.mIsFromDraft) {
                    VideoPublishEditModel videoPublishEditModel5 = this.f123534q;
                    if (videoPublishEditModel5 == null) {
                        C52711k.m112237a("mModel");
                    }
                    if (videoPublishEditModel5.statusCreateVideoData.getStatusType() == 1) {
                        C49307bs bsVar8 = mo97168O().f123742n;
                        if (bsVar8 != null) {
                            View.OnClickListener uVar = new C49220u(this);
                            C52711k.m112240b(uVar, "listener");
                            LayoutInflater from = LayoutInflater.from(bsVar8.f33840g_);
                            FrameLayout frameLayout = bsVar8.f123828p;
                            if (frameLayout == null) {
                                C52711k.m112237a("parentLayout");
                            }
                            from.inflate(R.layout.axr, frameLayout, true);
                            FrameLayout frameLayout2 = bsVar8.f123828p;
                            if (frameLayout2 == null) {
                                C52711k.m112237a("parentLayout");
                            }
                            bsVar8.f123829q = frameLayout2.findViewById(R.id.f2j);
                            View view = bsVar8.f123829q;
                            if (view == null) {
                                C52711k.m112234a();
                            }
                            view.setOnClickListener(uVar);
                        }
                    }
                }
            }
        }
        EditToolbarViewModel editToolbarViewModel = this.f123533p;
        if (editToolbarViewModel == null) {
            C52711k.m112237a("toolbarViewModel");
        }
        editToolbarViewModel.mo97019e(4, true);
        EditToolbarViewModel editToolbarViewModel2 = this.f123533p;
        if (editToolbarViewModel2 == null) {
            C52711k.m112237a("toolbarViewModel");
        }
        editToolbarViewModel2.mo97019e(3, true);
        EditToolbarViewModel editToolbarViewModel3 = this.f123533p;
        if (editToolbarViewModel3 == null) {
            C52711k.m112237a("toolbarViewModel");
        }
        editToolbarViewModel3.mo97019e(11, true);
        EditViewModel editViewModel5 = this.f123532o;
        if (editViewModel5 == null) {
            C52711k.m112237a("editViewModel");
        }
        if (editViewModel5.mo97030L()) {
            VideoPublishEditModel videoPublishEditModel6 = this.f123534q;
            if (videoPublishEditModel6 == null) {
                C52711k.m112237a("mModel");
            }
            if (videoPublishEditModel6.isRetakeVideo()) {
                m106143i(false);
            }
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ VideoPublishEditModel m106124a(C49159aw awVar) {
        VideoPublishEditModel videoPublishEditModel = awVar.f123534q;
        if (videoPublishEditModel == null) {
            C52711k.m112237a("mModel");
        }
        return videoPublishEditModel;
    }

    /* renamed from: b */
    public static final /* synthetic */ EditViewModel m106138b(C49159aw awVar) {
        EditViewModel editViewModel = awVar.f123532o;
        if (editViewModel == null) {
            C52711k.m112237a("editViewModel");
        }
        return editViewModel;
    }

    /* renamed from: c */
    public static final /* synthetic */ EditToolbarViewModel m106139c(C49159aw awVar) {
        EditToolbarViewModel editToolbarViewModel = awVar.f123533p;
        if (editToolbarViewModel == null) {
            C52711k.m112237a("toolbarViewModel");
        }
        return editToolbarViewModel;
    }

    /* renamed from: d */
    public static final /* synthetic */ EditMusicCutViewModel m106140d(C49159aw awVar) {
        EditMusicCutViewModel editMusicCutViewModel = awVar.f123543z;
        if (editMusicCutViewModel == null) {
            C52711k.m112237a("musicCutVideoModel");
        }
        return editMusicCutViewModel;
    }

    /* renamed from: i */
    private final void m106143i(boolean z) {
        C43740a aVar = this.f123529l;
        VideoPublishEditModel videoPublishEditModel = this.f123534q;
        if (videoPublishEditModel == null) {
            C52711k.m112237a("mModel");
        }
        aVar.mo89203a(z, true, videoPublishEditModel);
        VideoPublishEditModel videoPublishEditModel2 = this.f123534q;
        if (videoPublishEditModel2 == null) {
            C52711k.m112237a("mModel");
        }
        MultiEditVideoRecordData curMultiEditVideoRecordData = videoPublishEditModel2.getCurMultiEditVideoRecordData();
        if (curMultiEditVideoRecordData == null) {
            C52711k.m112234a();
        }
        C20347c ag = mo97189ag();
        if (ag == null) {
            C52711k.m112234a();
        }
        curMultiEditVideoRecordData.preVideoDuration = ag.mo43071k();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final void mo97195d(boolean z) {
        EditCornerViewModel editCornerViewModel = this.f123525ae;
        if (editCornerViewModel == null) {
            C52711k.m112237a("cornerViewModel");
        }
        editCornerViewModel.mo96810a(z);
    }

    /* renamed from: f */
    public final void mo97197f(boolean z) {
        m106136au();
        m106143i(z);
        int I = mo97162I().mo97155I();
        int J = mo97162I().mo97156J();
        if (mo97189ag() != null) {
            C20347c ag = mo97189ag();
            if (ag == null) {
                C52711k.m112234a();
            }
            VESize a = ag.mo43012a(I, J);
            if (a.width > 0 && a.height > 0) {
                C43683c.m95958a(I, J, a.width, a.height);
            }
        }
    }

    /* renamed from: b */
    public final void mo97193b(boolean z) {
        EditViewModel editViewModel = this.f123532o;
        if (editViewModel == null) {
            C52711k.m112237a("editViewModel");
        }
        int H = editViewModel.mo97026H();
        VideoPublishEditModel videoPublishEditModel = this.f123534q;
        if (videoPublishEditModel == null) {
            C52711k.m112237a("mModel");
        }
        if (H <= videoPublishEditModel.mCurMusicLength) {
            m106141g(z);
        }
    }

    /* renamed from: h */
    private final void m106142h(boolean z) {
        C49115am R = mo97171R();
        EditViewModel editViewModel = this.f123532o;
        if (editViewModel == null) {
            C52711k.m112237a("editViewModel");
        }
        C20347c cVar = (C20347c) editViewModel.mo97038h().getValue();
        if (R.mo97138G().f112232q == null) {
            R.mo97138G().f112232q = cVar;
        }
        C49115am R2 = mo97171R();
        R2.mo97138G().mo90208b();
        R2.mo97137F().mo89502b();
        VideoPublishEditModel videoPublishEditModel = R2.f123422j;
        if (videoPublishEditModel == null) {
            C52711k.m112237a("mModel");
        }
        if (videoPublishEditModel.mMusicPath != null) {
            C43944p F = R2.mo97137F();
            VideoPublishEditModel videoPublishEditModel2 = R2.f123422j;
            if (videoPublishEditModel2 == null) {
                C52711k.m112237a("mModel");
            }
            F.mo89498a((int) (videoPublishEditModel2.musicVolume * 100.0f));
            R2.mo97137F().mo89505c(true);
        }
        if (z) {
            VideoPublishEditModel videoPublishEditModel3 = R2.f123422j;
            if (videoPublishEditModel3 == null) {
                C52711k.m112237a("mModel");
            }
            C52711k.m112240b(videoPublishEditModel3, "model");
            C26890h.m65011a("click_music_entrance", C23089d.m56640a().mo47829a("creation_id", videoPublishEditModel3.creationId).mo47829a("content_source", C43434az.m95207b(videoPublishEditModel3)).mo47829a("content_type", C43434az.m95202a(videoPublishEditModel3)).mo47829a("shoot_way", videoPublishEditModel3.mShootWay).mo47829a("enter_from", "video_edit_page").f61491a);
        }
    }

    /* renamed from: c */
    public final void mo97194c(boolean z) {
        if (mo97168O().f123741m == null) {
            EditToolbarViewModel editToolbarViewModel = this.f123533p;
            if (editToolbarViewModel == null) {
                C52711k.m112237a("toolbarViewModel");
            }
            editToolbarViewModel.mo97019e(11, false);
            return;
        }
        mo97195d(false);
        mo24409d((C12924i) m106130ao());
        String str = "main_reclick";
        if (m106130ao().mo90873P()) {
            str = "main_first";
            if (!C44332b.m97107a(this.f33840g_)) {
                C10691a.m21545b(mo24473s(), mo24461a((int) R.string.n_)).mo19066a();
                return;
            }
        }
        VEVideoPublishEditViewModel vEVideoPublishEditViewModel = this.f123531n;
        if (vEVideoPublishEditViewModel == null) {
            C52711k.m112237a("publishEditViewModel");
        }
        C0198r r = vEVideoPublishEditViewModel.mo110473r();
        C52711k.m112236a((Object) r, "publishEditViewModel.inTimeEditView");
        r.setValue(Boolean.valueOf(true));
        EditSubtitleViewModel editSubtitleViewModel = this.f123542y;
        if (editSubtitleViewModel == null) {
            C52711k.m112237a("subtitleViewModel");
        }
        editSubtitleViewModel.mo96969a().setValue(Boolean.valueOf(true));
        EditToolbarViewModel editToolbarViewModel2 = this.f123533p;
        if (editToolbarViewModel2 == null) {
            C52711k.m112237a("toolbarViewModel");
        }
        editToolbarViewModel2.mo97018e();
        if (!z) {
            str = "menu";
        }
        EditViewModel editViewModel = this.f123532o;
        if (editViewModel == null) {
            C52711k.m112237a("editViewModel");
        }
        C43434az.m95206a(editViewModel.mo97035e(), str);
    }

    /* renamed from: g */
    private final void m106141g(boolean z) {
        C49099al alVar = (C49099al) this.f123520Z.getValue();
        EditViewModel editViewModel = alVar.f123405y;
        if (editViewModel == null) {
            C52711k.m112237a("mEditViewModel");
        }
        VideoPublishEditModel e = editViewModel.mo97035e();
        if (e.mMusicPath != null && !e.isStickPointMode) {
            EditViewModel editViewModel2 = alVar.f123405y;
            if (editViewModel2 == null) {
                C52711k.m112237a("mEditViewModel");
            }
            editViewModel2.mo97033a(false, false, false);
            if (e.hasOriginalSound()) {
                VEVideoPublishEditViewModel vEVideoPublishEditViewModel = alVar.f123375A;
                if (vEVideoPublishEditViewModel == null) {
                    C52711k.m112237a("publishEditViewModel");
                }
                C0198r m = vEVideoPublishEditViewModel.mo110468m();
                C52711k.m112236a((Object) m, "publishEditViewModel.volumeChangeOpLiveData");
                m.setValue(VEVolumeChangeOp.ofVoice(0.0f));
            }
            if (C43214dh.m94817a().mo50201b() != null) {
                C42482c b = C43214dh.m94817a().mo50201b();
                if (b == null) {
                    C52711k.m112234a();
                }
                if (b.getShootDuration() > 0) {
                    int a = C47807de.m103443a(e.mMusicPath, false);
                    C42482c b2 = C43214dh.m94817a().mo50201b();
                    if (b2 == null) {
                        C52711k.m112234a();
                    }
                    if (Math.abs(a - b2.getShootDuration()) >= 1000) {
                        EditMusicCutViewModel editMusicCutViewModel = alVar.f123376B;
                        if (editMusicCutViewModel == null) {
                            C52711k.m112237a("musicCutViewModel");
                        }
                        C42482c b3 = C43214dh.m94817a().mo50201b();
                        if (b3 == null) {
                            C52711k.m112234a();
                        }
                        int shootDuration = b3.getShootDuration();
                        EditViewModel editViewModel3 = alVar.f123405y;
                        if (editViewModel3 == null) {
                            C52711k.m112237a("mEditViewModel");
                        }
                        editMusicCutViewModel.mo96890a(Math.min(shootDuration, editViewModel3.mo97026H()));
                    } else {
                        EditMusicCutViewModel editMusicCutViewModel2 = alVar.f123376B;
                        if (editMusicCutViewModel2 == null) {
                            C52711k.m112237a("musicCutViewModel");
                        }
                        EditViewModel editViewModel4 = alVar.f123405y;
                        if (editViewModel4 == null) {
                            C52711k.m112237a("mEditViewModel");
                        }
                        editMusicCutViewModel2.mo96890a(Math.min(a, editViewModel4.mo97026H()));
                    }
                }
            }
            alVar.f123399s = C39630m.m88234a().mo58604b().mo80578b(e.mMusicPath);
            TextView textView = alVar.f123392l;
            if (textView == null) {
                C52711k.m112237a("mTextViewTotalTime");
            }
            textView.setText(C47902fv.m103621a(alVar.f123399s));
            alVar.f123397q = e.mMusicStart;
            alVar.f123398r = alVar.f123397q;
            C12932b.m25977a(alVar, new C49103d(alVar));
            if (!alVar.f123381G) {
                alVar.mo97128a(true);
            }
            alVar.f123404x = z;
            EditViewModel editViewModel5 = alVar.f123405y;
            if (editViewModel5 == null) {
                C52711k.m112237a("mEditViewModel");
            }
            Object value = editViewModel5.mo97038h().getValue();
            if (value == null) {
                C52711k.m112234a();
            }
            int a2 = ((C20347c) value).mo42984a(0, C50743d.EDITOR_SEEK_FLAG_LastSeek, alVar.f123379E);
            if (a2 != 0) {
                StringBuilder sb = new StringBuilder("cutMusic seek error: ");
                sb.append(a2);
                C45407ay.m98971b(sb.toString());
            }
            C23441t tVar = alVar.f123402v;
            if (tVar != null) {
                tVar.mo48605a(alVar.f123380F);
            }
        }
    }

    /* renamed from: e */
    public final boolean mo97196e(boolean z) {
        boolean z2;
        VideoPublishEditModel videoPublishEditModel = this.f123534q;
        if (videoPublishEditModel == null) {
            C52711k.m112237a("mModel");
        }
        if (videoPublishEditModel.mTimeEffect == null) {
            VideoPublishEditModel videoPublishEditModel2 = this.f123534q;
            if (videoPublishEditModel2 == null) {
                C52711k.m112237a("mModel");
            }
            if (C9414h.m18630a(videoPublishEditModel2.mEffectList)) {
                VideoPublishEditModel videoPublishEditModel3 = this.f123534q;
                if (videoPublishEditModel3 == null) {
                    C52711k.m112237a("mModel");
                }
                if (!videoPublishEditModel3.hasInfoStickers() && !mo97168O().mo97257W()) {
                    return false;
                }
            }
        }
        C49256bh O = mo97168O();
        if (O.f123743o != null) {
            C49131aq aqVar = O.f123743o;
            if (aqVar != null) {
                aqVar.mo97143H();
            }
            z2 = true;
        } else {
            z2 = false;
        }
        if (O.f123745q != null) {
            C49378co coVar = O.f123745q;
            if (coVar != null) {
                coVar.mo97303G();
            }
            z2 = true;
        }
        if (O.f123746r != null) {
            C49388cr crVar = O.f123746r;
            if (crVar != null) {
                crVar.mo97315H();
            }
            z2 = true;
        }
        if (O.f123744p != null) {
            C49511h hVar = O.f123744p;
            if (hVar != null) {
                hVar.mo97399K();
            }
            z2 = true;
        }
        if (z2) {
            O.mo97253S();
        }
        if (O.f123742n != null) {
            C49307bs bsVar = O.f123742n;
            if (bsVar != null) {
                bsVar.mo97264F().mo93663f();
            }
        }
        C49256bh O2 = mo97168O();
        if (O2.f123741m != null) {
            C49067aa aaVar = O2.f123741m;
            if (aaVar != null) {
                aaVar.mo97095F().mo88653d(z);
            }
        }
        VEVideoPublishEditViewModel vEVideoPublishEditViewModel = this.f123531n;
        if (vEVideoPublishEditViewModel == null) {
            C52711k.m112237a("publishEditViewModel");
        }
        ArrayList<EffectPointModel> arrayList = vEVideoPublishEditViewModel.f131145a;
        C52711k.m112236a((Object) arrayList, "publishEditViewModel.getEffectPointModelStack()");
        VEVideoPublishEditViewModel vEVideoPublishEditViewModel2 = this.f123531n;
        if (vEVideoPublishEditViewModel2 == null) {
            C52711k.m112237a("publishEditViewModel");
        }
        C52967f j = vEVideoPublishEditViewModel2.mo110465j();
        C52711k.m112236a((Object) j, "publishEditViewModel.getFilterEffectOpLiveData()");
        if (!C9414h.m18630a(arrayList)) {
            int[] iArr = new int[arrayList.size()];
            int length = iArr.length;
            for (int i = 0; i < length; i++) {
                iArr[i] = ((EffectPointModel) arrayList.get(i)).getIndex();
            }
            j.setValue(C53026u.m112769b(iArr));
        }
        VideoPublishEditModel videoPublishEditModel4 = this.f123534q;
        if (videoPublishEditModel4 == null) {
            C52711k.m112237a("mModel");
        }
        if (!C9414h.m18630a(videoPublishEditModel4.mEffectList)) {
            VideoPublishEditModel videoPublishEditModel5 = this.f123534q;
            if (videoPublishEditModel5 == null) {
                C52711k.m112237a("mModel");
            }
            videoPublishEditModel5.mEffectList.clear();
        }
        return true;
    }

    /* renamed from: e */
    public final void mo24448e(Bundle bundle) {
        C49390ct ctVar;
        super.mo24448e(bundle);
        if (!C20393d.m50598a()) {
            mo24409d((C12924i) mo97162I());
            mo24409d((C12924i) mo97163J());
            mo24409d((C12924i) m106126ak());
            mo24409d((C12924i) m106127al());
            mo24409d((C12924i) mo97164K());
            mo24409d((C12924i) mo97165L());
            mo24409d((C12924i) m106128am());
            mo24409d((C12924i) mo97168O());
            mo24409d((C12924i) mo97166M());
            mo24409d((C12924i) mo97167N());
        } else {
            mo24409d((C12924i) mo97162I());
            mo24409d((C12924i) m106126ak());
            mo24409d((C12924i) m106127al());
            mo24409d((C12924i) m106128am());
        }
        Activity activity = this.f33840g_;
        if (activity != null) {
            JediViewModel a = C48927d.m105736a((FragmentActivity) activity).mo96760a(EditViewModel.class);
            C52711k.m112236a((Object) a, "JediViewModelProviders.o…ditViewModel::class.java)");
            this.f123532o = (EditViewModel) a;
            Activity activity2 = this.f33840g_;
            if (activity2 != null) {
                JediViewModel a2 = C48927d.m105736a((FragmentActivity) activity2).mo96760a(EditPreviewViewModel.class);
                C52711k.m112236a((Object) a2, "JediViewModelProviders.o…iewViewModel::class.java)");
                this.f123524ad = (EditPreviewViewModel) a2;
                Activity activity3 = this.f33840g_;
                if (activity3 != null) {
                    JediViewModel a3 = C48927d.m105736a((FragmentActivity) activity3).mo96760a(EditToolbarViewModel.class);
                    C52711k.m112236a((Object) a3, "JediViewModelProviders.o…barViewModel::class.java)");
                    this.f123533p = (EditToolbarViewModel) a3;
                    Activity activity4 = this.f33840g_;
                    if (activity4 != null) {
                        C0209x a4 = C0214z.m440a((FragmentActivity) activity4).mo359a(VEVideoPublishEditViewModel.class);
                        C52711k.m112236a((Object) a4, "ViewModelProviders.of(ac…ditViewModel::class.java)");
                        this.f123531n = (VEVideoPublishEditViewModel) a4;
                        Activity activity5 = this.f33840g_;
                        if (activity5 != null) {
                            JediViewModel a5 = C48927d.m105736a((FragmentActivity) activity5).mo96760a(EditAudioRecordModel.class);
                            C52711k.m112236a((Object) a5, "JediViewModelProviders.o…oRecordModel::class.java)");
                            this.f123535r = (EditAudioRecordModel) a5;
                            Activity activity6 = this.f33840g_;
                            if (activity6 != null) {
                                JediViewModel a6 = C48927d.m105736a((FragmentActivity) activity6).mo96760a(EditLyricStickerViewModel.class);
                                C52711k.m112236a((Object) a6, "JediViewModelProviders.o…kerViewModel::class.java)");
                                this.f123536s = (EditLyricStickerViewModel) a6;
                                Activity activity7 = this.f33840g_;
                                if (activity7 != null) {
                                    JediViewModel a7 = C48927d.m105736a((FragmentActivity) activity7).mo96760a(EditCornerViewModel.class);
                                    C52711k.m112236a((Object) a7, "JediViewModelProviders.o…nerViewModel::class.java)");
                                    this.f123525ae = (EditCornerViewModel) a7;
                                    Activity activity8 = this.f33840g_;
                                    if (activity8 != null) {
                                        JediViewModel a8 = C48927d.m105736a((FragmentActivity) activity8).mo96760a(EditStickerPanelViewModel.class);
                                        C52711k.m112236a((Object) a8, "JediViewModelProviders.o…nelViewModel::class.java)");
                                        this.f123537t = (EditStickerPanelViewModel) a8;
                                        Activity activity9 = this.f33840g_;
                                        if (activity9 != null) {
                                            JediViewModel a9 = C48927d.m105736a((FragmentActivity) activity9).mo96760a(EditAudioEffectViewModel.class);
                                            C52711k.m112236a((Object) a9, "JediViewModelProviders.o…ectViewModel::class.java)");
                                            this.f123538u = (EditAudioEffectViewModel) a9;
                                            Activity activity10 = this.f33840g_;
                                            if (activity10 != null) {
                                                JediViewModel a10 = C48927d.m105736a((FragmentActivity) activity10).mo96760a(EditFilterViewModel.class);
                                                C52711k.m112236a((Object) a10, "JediViewModelProviders.o…terViewModel::class.java)");
                                                this.f123539v = (EditFilterViewModel) a10;
                                                Activity activity11 = this.f33840g_;
                                                if (activity11 != null) {
                                                    JediViewModel a11 = C48927d.m105736a((FragmentActivity) activity11).mo96760a(EditStickerViewModel.class);
                                                    C52711k.m112236a((Object) a11, "JediViewModelProviders.o…kerViewModel::class.java)");
                                                    this.f123540w = (EditStickerViewModel) a11;
                                                    Activity activity12 = this.f33840g_;
                                                    if (activity12 != null) {
                                                        JediViewModel a12 = C48927d.m105736a((FragmentActivity) activity12).mo96760a(EditAutoEnhanceViewModel.class);
                                                        C52711k.m112236a((Object) a12, "JediViewModelProviders.o…nceViewModel::class.java)");
                                                        this.f123541x = (EditAutoEnhanceViewModel) a12;
                                                        Activity activity13 = this.f33840g_;
                                                        if (activity13 != null) {
                                                            JediViewModel a13 = C48927d.m105736a((FragmentActivity) activity13).mo96760a(EditAudioRecordModel.class);
                                                            C52711k.m112236a((Object) a13, "JediViewModelProviders.o…oRecordModel::class.java)");
                                                            this.f123526af = (EditAudioRecordModel) a13;
                                                            Activity activity14 = this.f33840g_;
                                                            if (activity14 != null) {
                                                                C0209x a14 = C0214z.m440a((FragmentActivity) activity14).mo359a(EditSubtitleViewModel.class);
                                                                C52711k.m112236a((Object) a14, "ViewModelProviders.of(ac…tleViewModel::class.java)");
                                                                this.f123542y = (EditSubtitleViewModel) a14;
                                                                Activity activity15 = this.f33840g_;
                                                                if (activity15 != null) {
                                                                    JediViewModel a15 = C48927d.m105736a((FragmentActivity) activity15).mo96760a(EditMusicCutViewModel.class);
                                                                    C52711k.m112236a((Object) a15, "JediViewModelProviders.o…CutViewModel::class.java)");
                                                                    this.f123543z = (EditMusicCutViewModel) a15;
                                                                    Activity activity16 = this.f33840g_;
                                                                    if (activity16 != null) {
                                                                        JediViewModel a16 = C48927d.m105736a((FragmentActivity) activity16).mo96760a(EditMusicViewModel.class);
                                                                        C52711k.m112236a((Object) a16, "JediViewModelProviders.o…sicViewModel::class.java)");
                                                                        this.f123496A = (EditMusicViewModel) a16;
                                                                        Activity activity17 = this.f33840g_;
                                                                        if (activity17 != null) {
                                                                            C0209x a17 = C0214z.m440a((FragmentActivity) activity17).mo359a(StatusViewModel.class);
                                                                            C52711k.m112236a((Object) a17, "ViewModelProviders.of(ac…tusViewModel::class.java)");
                                                                            this.f123505J = (StatusViewModel) a17;
                                                                            EditViewModel editViewModel = this.f123532o;
                                                                            if (editViewModel == null) {
                                                                                C52711k.m112237a("editViewModel");
                                                                            }
                                                                            this.f123534q = editViewModel.mo97035e();
                                                                            EditViewModel editViewModel2 = this.f123532o;
                                                                            if (editViewModel2 == null) {
                                                                                C52711k.m112237a("editViewModel");
                                                                            }
                                                                            this.f123527ag = editViewModel2.mo97036f();
                                                                            if (this.f123532o == null) {
                                                                                C52711k.m112237a("editViewModel");
                                                                            }
                                                                            if (EditViewModel.m105818D()) {
                                                                                Activity activity18 = this.f33840g_;
                                                                                if (activity18 != null) {
                                                                                    ctVar = new C49229b((FragmentActivity) activity18, this);
                                                                                } else {
                                                                                    throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
                                                                                }
                                                                            } else {
                                                                                Activity activity19 = this.f33840g_;
                                                                                if (activity19 != null) {
                                                                                    ctVar = new C49093aj((FragmentActivity) activity19, this);
                                                                                } else {
                                                                                    throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
                                                                                }
                                                                            }
                                                                            this.f123500E = ctVar;
                                                                            EditViewModel editViewModel3 = this.f123532o;
                                                                            if (editViewModel3 == null) {
                                                                                C52711k.m112237a("editViewModel");
                                                                            }
                                                                            if (editViewModel3.mo97030L()) {
                                                                                mo24389a((int) R.id.b_k, (C12924i) this.f123529l, "MultiEditVideoScene");
                                                                                VideoPublishEditModel videoPublishEditModel = this.f123534q;
                                                                                if (videoPublishEditModel == null) {
                                                                                    C52711k.m112237a("mModel");
                                                                                }
                                                                                if (videoPublishEditModel.isRetakeVideo()) {
                                                                                    m106136au();
                                                                                }
                                                                            }
                                                                            if (!C20393d.m50598a()) {
                                                                                mo97174U();
                                                                                mo97175V();
                                                                                mo97176W();
                                                                                return;
                                                                            }
                                                                            EditPreviewViewModel editPreviewViewModel = this.f123524ad;
                                                                            if (editPreviewViewModel == null) {
                                                                                C52711k.m112237a("previewViewModel");
                                                                            }
                                                                            editPreviewViewModel.mo96924e().observe(this, new C49185as(this));
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

    /* renamed from: b */
    public final ViewGroup mo24387a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C52711k.m112240b(layoutInflater, "inflater");
        C52711k.m112240b(viewGroup, "container");
        View inflate = layoutInflater.inflate(R.layout.ae8, viewGroup, false);
        if (inflate != null) {
            return (ViewGroup) inflate;
        }
        throw new C52857u("null cannot be cast to non-null type android.view.ViewGroup");
    }

    /* renamed from: a */
    public final <S extends C11932s> C1690c mo22546a(JediViewModel<S> jediViewModel, C11934u<S> uVar, C52682m<? super C11866f, ? super S, C52860x> mVar) {
        C52711k.m112240b(jediViewModel, "$this$subscribe");
        C52711k.m112240b(uVar, "config");
        C52711k.m112240b(mVar, "subscriber");
        return C49549a.m106919a(this, jediViewModel, uVar, mVar);
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

    /* renamed from: b */
    public final <S extends C11932s, A> void mo49443b(JediViewModel<S> jediViewModel, C52771j<S, ? extends A> jVar, C11934u<C11937x<A>> uVar, C52682m<? super C49548a, ? super A, C52860x> mVar) {
        C52711k.m112240b(jediViewModel, "$this$selectNonNullSubscribe");
        C52711k.m112240b(jVar, "prop1");
        C52711k.m112240b(uVar, "config");
        C52711k.m112240b(mVar, "subscriber");
        C49549a.m106925a(this, jediViewModel, jVar, uVar, mVar);
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
