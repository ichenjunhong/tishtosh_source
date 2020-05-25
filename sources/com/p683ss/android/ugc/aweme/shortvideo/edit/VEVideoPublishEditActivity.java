package com.p683ss.android.ugc.aweme.shortvideo.edit;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0183j;
import android.arch.lifecycle.C0199s;
import android.arch.lifecycle.C0200t;
import android.arch.lifecycle.C0214z;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.app.FragmentActivity;
import android.text.TextUtils;
import android.transition.AutoTransition;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.common.utility.C9414h;
import com.bytedance.common.utility.C9431p;
import com.bytedance.ies.dmt.p664ui.p666b.C10641a.C10643a;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.dmt.p664ui.p669e.C10703a;
import com.bytedance.jedi.arch.C11934u;
import com.bytedance.scene.C12827a;
import com.bytedance.scene.C12853b;
import com.bytedance.scene.C12882d;
import com.bytedance.scene.C12887e.C128881;
import com.bytedance.scene.C12887e.C12889a;
import com.bytedance.scene.C12890f;
import com.bytedance.scene.C12921h;
import com.bytedance.scene.C12924i;
import com.bytedance.scene.C12930k;
import com.bytedance.scene.C12963o;
import com.bytedance.scene.C12973u;
import com.bytedance.scene.group.C12896b;
import com.bytedance.scene.p840b.C12855b;
import com.bytedance.scene.p841c.C12873f;
import com.bytedance.scene.p841c.C12875h;
import com.bytedance.scene.p841c.C12879k;
import com.bytedance.scene.p841c.C12880l;
import com.p683ss.android.p1137b.p1138a.p1139a.C18842a;
import com.p683ss.android.ttve.model.MVInfoBean;
import com.p683ss.android.ugc.asve.p1239c.C20347c;
import com.p683ss.android.ugc.asve.p1241e.C20393d;
import com.p683ss.android.ugc.aweme.IAccountService.C20834a;
import com.p683ss.android.ugc.aweme.adaptation.BaseScreenAdaptActivity;
import com.p683ss.android.ugc.aweme.adaptation.C22452a;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.activity.C23422a;
import com.p683ss.android.ugc.aweme.base.activity.C23441t;
import com.p683ss.android.ugc.aweme.base.utils.C23715d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.C26916m;
import com.p683ss.android.ugc.aweme.effect.p1673c.p1674a.C29164a;
import com.p683ss.android.ugc.aweme.filter.C31405ah;
import com.p683ss.android.ugc.aweme.filter.C31406ai;
import com.p683ss.android.ugc.aweme.filter.C31459g;
import com.p683ss.android.ugc.aweme.filter.C31460h;
import com.p683ss.android.ugc.aweme.filter.C31475n;
import com.p683ss.android.ugc.aweme.filter.p1743b.C31427a;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.framework.p1782c.C32462a;
import com.p683ss.android.ugc.aweme.greenscreen.C32893h;
import com.p683ss.android.ugc.aweme.infoSticker.C35556ac;
import com.p683ss.android.ugc.aweme.infoSticker.C35579at;
import com.p683ss.android.ugc.aweme.infoSticker.C35587c;
import com.p683ss.android.ugc.aweme.infoSticker.C35618o;
import com.p683ss.android.ugc.aweme.infosticker.StickerItemModel;
import com.p683ss.android.ugc.aweme.music.mediachoose.helper.MediaModel;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p683ss.android.ugc.aweme.out.AVServiceImpl;
import com.p683ss.android.ugc.aweme.p1382aq.C23208an;
import com.p683ss.android.ugc.aweme.p1388at.C23289b;
import com.p683ss.android.ugc.aweme.p1482bw.p1483a.C24437f;
import com.p683ss.android.ugc.aweme.p1482bw.p1483a.C24440i;
import com.p683ss.android.ugc.aweme.p1482bw.p1483a.C24444m;
import com.p683ss.android.ugc.aweme.port.p2082in.C39588bb.C39590b;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.port.p2082in.C39630m;
import com.p683ss.android.ugc.aweme.property.C40789h.C40790a;
import com.p683ss.android.ugc.aweme.services.video.VEVolumeChangeOp;
import com.p683ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.p683ss.android.ugc.aweme.shortvideo.C42482c;
import com.p683ss.android.ugc.aweme.shortvideo.C43214dh;
import com.p683ss.android.ugc.aweme.shortvideo.C43303dy;
import com.p683ss.android.ugc.aweme.shortvideo.C43307ea;
import com.p683ss.android.ugc.aweme.shortvideo.C43308eb;
import com.p683ss.android.ugc.aweme.shortvideo.C43855fx;
import com.p683ss.android.ugc.aweme.shortvideo.cut.C42628e;
import com.p683ss.android.ugc.aweme.shortvideo.edit.C43763r.C43764a;
import com.p683ss.android.ugc.aweme.shortvideo.edit.audioeffect.C43368e;
import com.p683ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.p683ss.android.ugc.aweme.shortvideo.edit.model.VideoFileInfo;
import com.p683ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoStatusRecordData;
import com.p683ss.android.ugc.aweme.shortvideo.edit.multiedit.p2198b.C43684d;
import com.p683ss.android.ugc.aweme.shortvideo.edit.multiedit.p2200d.C43699d;
import com.p683ss.android.ugc.aweme.shortvideo.edit.multiedit.p2200d.C43699d.C43700a;
import com.p683ss.android.ugc.aweme.shortvideo.edit.multiedit.p2201e.C43740a;
import com.p683ss.android.ugc.aweme.shortvideo.edit.p2188a.C43323a;
import com.p683ss.android.ugc.aweme.shortvideo.edit.p2188a.C43324b;
import com.p683ss.android.ugc.aweme.shortvideo.model.RecordScene;
import com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.p2211a.C44002b;
import com.p683ss.android.ugc.aweme.shortvideo.p2205i.C43886a;
import com.p683ss.android.ugc.aweme.shortvideo.p2205i.C43889c;
import com.p683ss.android.ugc.aweme.shortvideo.p2205i.C43892f;
import com.p683ss.android.ugc.aweme.shortvideo.p2205i.C43894h;
import com.p683ss.android.ugc.aweme.shortvideo.p2220q.C44403a;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.AudioFocusManager;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.C45205n;
import com.p683ss.android.ugc.aweme.shortvideo.publish.C44364a;
import com.p683ss.android.ugc.aweme.shortvideo.stitch.StitchParams;
import com.p683ss.android.ugc.aweme.shortvideo.subtitle.SubtitleModule;
import com.p683ss.android.ugc.aweme.shortvideo.subtitle.SubtitleModule.C44810b;
import com.p683ss.android.ugc.aweme.shortvideo.upload.p2247b.C45253a;
import com.p683ss.android.ugc.aweme.shortvideo.upload.p2247b.C45253a.C45255b;
import com.p683ss.android.ugc.aweme.shortvideo.upload.p2247b.C45253a.C45256c;
import com.p683ss.android.ugc.aweme.shortvideo.upload.p2247b.C45253a.C45257d;
import com.p683ss.android.ugc.aweme.shortvideo.upload.p2247b.C45258b;
import com.p683ss.android.ugc.aweme.shortvideo.upload.p2247b.C45258b.C45261c;
import com.p683ss.android.ugc.aweme.shortvideo.upload.p2247b.C45258b.C45261c.C45262a;
import com.p683ss.android.ugc.aweme.shortvideo.upload.p2247b.C45258b.C45268g;
import com.p683ss.android.ugc.aweme.shortvideo.upload.p2247b.C45258b.C45274h;
import com.p683ss.android.ugc.aweme.shortvideo.upload.p2247b.C45258b.C45278i;
import com.p683ss.android.ugc.aweme.shortvideo.upload.p2247b.C45258b.C45279j;
import com.p683ss.android.ugc.aweme.shortvideo.upload.p2247b.C45282c;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45380af;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45392al;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45407ay;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45412b;
import com.p683ss.android.ugc.aweme.status.StatusCreateVideoData;
import com.p683ss.android.ugc.aweme.sticker.types.p2321ar.backgroundvideo.C46448b;
import com.p683ss.android.ugc.aweme.sticker.types.p2321ar.pixelloop.C46476a;
import com.p683ss.android.ugc.aweme.story.shootvideo.textfont.C46679c;
import com.p683ss.android.ugc.aweme.tools.C46797a;
import com.p683ss.android.ugc.aweme.video.C48016e;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import com.p683ss.android.ugc.gamora.editor.C49159aw;
import com.p683ss.android.ugc.gamora.editor.C49159aw.C49182aq;
import com.p683ss.android.ugc.gamora.editor.C49159aw.C49183ar;
import com.p683ss.android.ugc.gamora.editor.C49249bd;
import com.p683ss.android.ugc.gamora.editor.C49361cg;
import com.p683ss.android.ugc.gamora.editor.C49361cg.C49362a;
import com.p683ss.android.ugc.gamora.editor.C49361cg.C49363b;
import com.p683ss.android.ugc.gamora.editor.C49361cg.C49364c;
import com.p683ss.android.ugc.gamora.editor.C49365ch;
import com.p683ss.android.ugc.gamora.editor.C49366ci;
import com.p683ss.android.ugc.gamora.editor.C49367cj;
import com.p683ss.android.ugc.gamora.editor.C49395cx;
import com.p683ss.android.ugc.gamora.editor.C49413cy;
import com.p683ss.android.ugc.gamora.editor.EditCornerViewModel;
import com.p683ss.android.ugc.gamora.editor.EditFilterViewModel;
import com.p683ss.android.ugc.gamora.editor.EditGestureViewModel;
import com.p683ss.android.ugc.gamora.editor.EditLyricStickerViewModel;
import com.p683ss.android.ugc.gamora.editor.EditMusicViewModel;
import com.p683ss.android.ugc.gamora.editor.EditPreviewViewModel;
import com.p683ss.android.ugc.gamora.editor.EditStickerViewModel;
import com.p683ss.android.ugc.gamora.editor.EditStickerViewModel.C48984b;
import com.p683ss.android.ugc.gamora.editor.EditTextStickerViewModel;
import com.p683ss.android.ugc.gamora.editor.EditToolbarViewModel;
import com.p683ss.android.ugc.gamora.editor.EditToolbarViewModel.C48999g;
import com.p683ss.android.ugc.gamora.editor.EditToolbarViewModel.C49004l;
import com.p683ss.android.ugc.gamora.editor.EditViewModel;
import com.p683ss.android.ugc.gamora.editor.EditViewModel.C49021l;
import com.p683ss.android.ugc.gamora.editor.EditViewModel.C49024o;
import com.p683ss.android.ugc.gamora.editor.p2460b.C49231a;
import com.p683ss.android.ugc.gamora.editor.p2460b.C49231a.C49241a;
import com.p683ss.android.ugc.gamora.p2458b.C48927d;
import com.p683ss.android.ugc.gamora.recorder.p2481o.C49917c;
import com.p683ss.android.ugc.gamora.recorder.p2481o.C49923d;
import com.p683ss.android.ugc.gamora.recorder.p2481o.C49925e;
import com.p683ss.android.ugc.tools.utils.C50200d;
import com.p683ss.android.vesdk.C50711k;
import com.p683ss.android.vesdk.VEListener.VEInfoStickerBufferListener;
import com.ss.android.ugc.trill.R;
import dmt.p2652av.video.C52906ab;
import dmt.p2652av.video.C52977l;
import dmt.p2652av.video.C53027v;
import dmt.p2652av.video.CompileProbeViewModel;
import dmt.p2652av.video.VEVideoPublishEditViewModel;
import java.io.File;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import leakcanary.internal.LeakCanaryFileProvider;
import org.greenrobot.eventbus.C53755c;
import org.greenrobot.eventbus.C53771m;
import org.greenrobot.eventbus.ThreadMode;
import p001a.C0011g;
import p001a.C0013i;
import p064c.p065a.C2201v;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p071d.C1711f;
import p064c.p065a.p093k.C2168a;
import p2628d.C52860x;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52722v.C52727e;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.VEVideoPublishEditActivity */
public class VEVideoPublishEditActivity extends BaseScreenAdaptActivity implements C23441t, C35618o, C45205n, C49241a {

    /* renamed from: b */
    public static String f109536b = "VEVideoPublishEditActivity";

    /* renamed from: A */
    private boolean f109537A;

    /* renamed from: B */
    private C35579at f109538B = new C35579at(this);

    /* renamed from: C */
    private C43449bd f109539C;

    /* renamed from: D */
    private List<C23422a> f109540D = new ArrayList();

    /* renamed from: E */
    private C49249bd f109541E;

    /* renamed from: F */
    private C43323a f109542F = new C43323a();

    /* renamed from: G */
    private C31405ah f109543G;

    /* renamed from: H */
    private Boolean f109544H;

    /* renamed from: I */
    private C49413cy f109545I = new C49413cy();

    /* renamed from: J */
    private C20834a f109546J = C43772y.f110842a;

    /* renamed from: K */
    private C31459g f109547K = null;

    /* renamed from: c */
    protected ViewGroup f109548c;

    /* renamed from: d */
    protected C42482c f109549d;

    /* renamed from: e */
    protected boolean f109550e;

    /* renamed from: f */
    public boolean f109551f;

    /* renamed from: g */
    protected boolean f109552g;

    /* renamed from: h */
    protected VEVideoPublishEditViewModel f109553h;

    /* renamed from: i */
    protected VideoPublishEditModel f109554i;

    /* renamed from: j */
    boolean f109555j;

    /* renamed from: k */
    protected EditPreviewViewModel f109556k;

    /* renamed from: l */
    protected EditViewModel f109557l;

    /* renamed from: m */
    protected C49361cg f109558m;

    /* renamed from: n */
    protected EditToolbarViewModel f109559n;

    /* renamed from: o */
    protected EditTextStickerViewModel f109560o;

    /* renamed from: p */
    protected EditStickerViewModel f109561p;

    /* renamed from: q */
    protected EditCornerViewModel f109562q;

    /* renamed from: r */
    protected EditGestureViewModel f109563r;

    /* renamed from: s */
    protected EditFilterViewModel f109564s;

    /* renamed from: t */
    protected EditLyricStickerViewModel f109565t;

    /* renamed from: u */
    protected EditMusicViewModel f109566u;

    /* renamed from: v */
    protected CompileProbeViewModel f109567v;

    /* renamed from: w */
    public C49159aw f109568w;

    /* renamed from: x */
    boolean f109569x = true;

    /* renamed from: y */
    public View f109570y;

    /* renamed from: z */
    private int f109571z;

    public boolean isRegisterEventBus() {
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo88085a(String str, String str2) {
        this.f109554i.mUploadPath = str;
        C44364a.m97156a().put(str2, str);
        if (TextUtils.isEmpty(this.f109554i.commerceData) && this.f109554i.microAppModel == null) {
            runOnUiThread(new C43342ar(this));
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x014b  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x015f  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0182  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x01f4  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void mo88082a(p2628d.C52855s r10) {
        /*
            r9 = this;
            java.lang.Object r0 = r10.getFirst()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            java.lang.Object r1 = r10.getSecond()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            java.lang.Object r10 = r10.getThird()
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r1 != 0) goto L_0x006d
            dmt.av.video.VEVideoPublishEditViewModel r1 = r9.f109553h
            android.arch.lifecycle.r r1 = r1.mo110473r()
            java.lang.Object r1 = r1.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x0040
            com.ss.android.ugc.gamora.editor.EditStickerViewModel r1 = r9.f109561p
            android.arch.lifecycle.r r1 = r1.mo96966e()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r10)
            r1.setValue(r2)
            goto L_0x006d
        L_0x0040:
            dmt.av.video.VEVideoPublishEditViewModel r1 = r9.f109553h
            android.arch.lifecycle.r r1 = r1.mo110474s()
            java.lang.Object r1 = r1.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x0060
            com.ss.android.ugc.gamora.editor.EditStickerViewModel r1 = r9.f109561p
            android.arch.lifecycle.r r1 = r1.mo96967f()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r10)
            r1.setValue(r2)
            goto L_0x006d
        L_0x0060:
            com.ss.android.ugc.gamora.editor.EditStickerViewModel r1 = r9.f109561p
            android.arch.lifecycle.r r1 = r1.mo96968g()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r10)
            r1.setValue(r2)
        L_0x006d:
            if (r0 != 0) goto L_0x0077
            r9.m95021p()
            com.ss.android.ugc.gamora.editor.EditTextStickerViewModel r1 = r9.f109560o
            r1.mo96977e()
        L_0x0077:
            com.ss.android.ugc.gamora.editor.EditGestureViewModel r1 = r9.f109563r
            com.ss.android.ugc.gamora.editor.EditGestureViewModel$c r2 = new com.ss.android.ugc.gamora.editor.EditGestureViewModel$c
            r2.<init>(r10)
            d.f.a.b r2 = (p2628d.p2639f.p2640a.C52671b) r2
            r1.mo22530c(r2)
            com.ss.android.ugc.gamora.editor.EditViewModel r10 = r9.f109557l
            boolean r10 = r10.mo97049t()
            com.ss.android.ugc.gamora.editor.EditViewModel r1 = r9.f109557l
            boolean r1 = r1.mo97051v()
            com.ss.android.ugc.gamora.editor.EditViewModel r2 = r9.f109557l
            boolean r2 = r2.mo97050u()
            com.ss.android.ugc.gamora.editor.EditViewModel r3 = r9.f109557l
            boolean r3 = r3.mo97052w()
            com.ss.android.ugc.gamora.editor.EditToolbarViewModel r4 = r9.f109559n
            android.arch.lifecycle.r r4 = r4.mo97020f()
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r0)
            r4.setValue(r5)
            com.ss.android.ugc.gamora.editor.EditToolbarViewModel r4 = r9.f109559n
            r4.mo97018e()
            com.ss.android.ugc.gamora.editor.EditToolbarViewModel r4 = r9.f109559n
            com.ss.android.ugc.gamora.editor.EditToolbarViewModel$e r5 = new com.ss.android.ugc.gamora.editor.EditToolbarViewModel$e
            r5.<init>(r0)
            d.f.a.b r5 = (p2628d.p2639f.p2640a.C52671b) r5
            r4.mo22530c(r5)
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r4 = r9.f109554i
            boolean r4 = r4.isMvThemeVideoType()
            r5 = 1
            r6 = 0
            if (r4 != 0) goto L_0x00f4
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r4 = r9.f109554i
            boolean r4 = r4.isStickPointMode
            if (r4 != 0) goto L_0x00f4
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r4 = r9.f109554i
            boolean r4 = r4.isReviewVideo()
            if (r4 != 0) goto L_0x00f4
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r4 = r9.f109554i
            boolean r4 = r4.publishFromLive()
            if (r4 != 0) goto L_0x00f4
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r4 = r9.f109554i
            boolean r4 = r4.isCutSameVideoType()
            if (r4 == 0) goto L_0x00e2
            goto L_0x00f4
        L_0x00e2:
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r4 = r9.f109554i
            boolean r4 = r4.mIsFromDraft
            if (r4 == 0) goto L_0x00fa
            com.ss.android.ugc.gamora.editor.EditToolbarViewModel r4 = r9.f109559n
            if (r0 == 0) goto L_0x00f6
            if (r10 != 0) goto L_0x00f6
            if (r2 != 0) goto L_0x00f6
            if (r3 != 0) goto L_0x00f6
            r7 = 1
            goto L_0x00f7
        L_0x00f4:
            com.ss.android.ugc.gamora.editor.EditToolbarViewModel r4 = r9.f109559n
        L_0x00f6:
            r7 = 0
        L_0x00f7:
            r4.mo97010a(r7)
        L_0x00fa:
            boolean r4 = com.p683ss.android.ugc.gamora.editor.EditViewModel.m105818D()
            if (r4 == 0) goto L_0x0110
            com.ss.android.ugc.gamora.editor.EditMusicViewModel r4 = r9.f109566u
            com.ss.android.ugc.gamora.editor.EditViewModel r7 = r9.f109557l
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r8 = r9.f109554i
            java.lang.String r8 = r8.mMusicPath
            boolean r7 = r7.mo97034a(r8)
            r4.mo96902a(r7)
            goto L_0x0142
        L_0x0110:
            com.ss.android.ugc.gamora.editor.EditToolbarViewModel r4 = r9.f109559n
            com.ss.android.ugc.gamora.editor.EditViewModel r7 = r9.f109557l
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r8 = r9.f109554i
            java.lang.String r8 = r8.mMusicPath
            boolean r7 = r7.mo97034a(r8)
            r8 = 8
            r4.mo97008a(r8, r7)
            com.ss.android.ugc.gamora.editor.EditToolbarViewModel r4 = r9.f109559n
            if (r0 == 0) goto L_0x012d
            if (r10 != 0) goto L_0x012d
            if (r2 != 0) goto L_0x012d
            if (r3 != 0) goto L_0x012d
            r7 = 1
            goto L_0x012e
        L_0x012d:
            r7 = 0
        L_0x012e:
            r4.mo97019e(r8, r7)
            com.ss.android.ugc.gamora.editor.EditViewModel r4 = r9.f109557l
            int r4 = r4.mo97026H()
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r7 = r9.f109554i
            int r7 = r7.mCurMusicLength
            if (r4 <= r7) goto L_0x0142
            com.ss.android.ugc.gamora.editor.EditToolbarViewModel r4 = r9.f109559n
            r4.mo97017d(r8, r6)
        L_0x0142:
            com.ss.android.ugc.gamora.editor.EditViewModel r4 = r9.f109557l
            boolean r4 = r4.mo97021A()
            r7 = 6
            if (r4 == 0) goto L_0x0157
            com.ss.android.ugc.gamora.editor.EditToolbarViewModel r4 = r9.f109559n
            if (r0 == 0) goto L_0x0153
            if (r3 != 0) goto L_0x0153
            r8 = 1
            goto L_0x0154
        L_0x0153:
            r8 = 0
        L_0x0154:
            r4.mo97019e(r7, r8)
        L_0x0157:
            com.ss.android.ugc.gamora.editor.EditViewModel r4 = r9.f109557l
            boolean r4 = r4.mo97022B()
            if (r4 == 0) goto L_0x017a
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r4 = r9.f109554i
            com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam r4 = r4.veAudioRecorderParam
            if (r4 == 0) goto L_0x0175
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r4 = r9.f109554i
            com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam r4 = r4.veAudioRecorderParam
            boolean r4 = r4.hasRecord()
            if (r4 == 0) goto L_0x0175
            com.ss.android.ugc.gamora.editor.EditToolbarViewModel r4 = r9.f109559n
            r4.mo97017d(r7, r5)
            goto L_0x017a
        L_0x0175:
            com.ss.android.ugc.gamora.editor.EditToolbarViewModel r4 = r9.f109559n
            r4.mo97017d(r7, r6)
        L_0x017a:
            com.ss.android.ugc.gamora.editor.EditViewModel r4 = r9.f109557l
            boolean r4 = r4.mo97055z()
            if (r4 == 0) goto L_0x0187
            com.ss.android.ugc.gamora.editor.EditToolbarViewModel r4 = r9.f109559n
            r4.mo97017d(r5, r6)
        L_0x0187:
            com.ss.android.ugc.gamora.editor.EditToolbarViewModel r4 = r9.f109559n
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r7 = r9.f109554i
            boolean r7 = r7.isStickPointMode
            r7 = r7 ^ r5
            r8 = 7
            r4.mo97008a(r8, r7)
            com.ss.android.ugc.gamora.editor.EditToolbarViewModel r4 = r9.f109559n
            if (r0 == 0) goto L_0x019c
            if (r10 == 0) goto L_0x019a
            if (r1 == 0) goto L_0x019c
        L_0x019a:
            r1 = 1
            goto L_0x019d
        L_0x019c:
            r1 = 0
        L_0x019d:
            r4.mo97019e(r8, r1)
            com.ss.android.ugc.gamora.editor.EditToolbarViewModel r1 = r9.f109559n
            r4 = 9
            if (r0 == 0) goto L_0x01b0
            boolean r7 = com.p683ss.android.ugc.aweme.shortvideo.edit.p2190b.C43440a.C43441a.m95215b()
            if (r7 == 0) goto L_0x01b0
            if (r3 != 0) goto L_0x01b0
            r7 = 1
            goto L_0x01b1
        L_0x01b0:
            r7 = 0
        L_0x01b1:
            r1.mo97019e(r4, r7)
            com.ss.android.ugc.gamora.editor.EditToolbarViewModel r1 = r9.f109559n
            r4 = 11
            if (r0 == 0) goto L_0x01c6
            com.ss.android.ugc.gamora.editor.EditViewModel r7 = r9.f109557l
            boolean r7 = r7.mo97024F()
            if (r7 == 0) goto L_0x01c6
            if (r3 != 0) goto L_0x01c6
            r7 = 1
            goto L_0x01c7
        L_0x01c6:
            r7 = 0
        L_0x01c7:
            r1.mo97019e(r4, r7)
            com.ss.android.ugc.gamora.editor.EditToolbarViewModel r1 = r9.f109559n
            r4 = 5
            r1.mo97019e(r4, r0)
            com.ss.android.ugc.gamora.editor.EditToolbarViewModel r1 = r9.f109559n
            com.ss.android.ugc.gamora.editor.EditToolbarViewModel$j r4 = new com.ss.android.ugc.gamora.editor.EditToolbarViewModel$j
            r4.<init>(r0)
            d.f.a.b r4 = (p2628d.p2639f.p2640a.C52671b) r4
            r1.mo22530c(r4)
            com.ss.android.ugc.gamora.editor.EditToolbarViewModel r1 = r9.f109559n
            if (r0 == 0) goto L_0x01e8
            if (r10 != 0) goto L_0x01e8
            if (r2 != 0) goto L_0x01e8
            if (r3 != 0) goto L_0x01e8
            r10 = 1
            goto L_0x01e9
        L_0x01e8:
            r10 = 0
        L_0x01e9:
            r1.mo97019e(r5, r10)
            com.ss.android.ugc.gamora.editor.EditToolbarViewModel r10 = r9.f109559n
            r1 = 2
            r10.mo97019e(r1, r0)
            if (r0 != 0) goto L_0x01f9
            com.ss.android.ugc.gamora.editor.EditToolbarViewModel r10 = r9.f109559n
            r10.mo97015c(r1, r6)
        L_0x01f9:
            com.ss.android.ugc.gamora.editor.EditToolbarViewModel r10 = r9.f109559n
            r1 = 4
            if (r0 == 0) goto L_0x0206
            boolean r2 = com.p683ss.android.ugc.gamora.editor.EditViewModel.m105819E()
            if (r2 == 0) goto L_0x0206
            r2 = 1
            goto L_0x0207
        L_0x0206:
            r2 = 0
        L_0x0207:
            r10.mo97019e(r1, r2)
            com.ss.android.ugc.gamora.editor.EditToolbarViewModel r10 = r9.f109559n
            r1 = 3
            if (r0 == 0) goto L_0x0216
            boolean r2 = com.p683ss.android.ugc.gamora.editor.EditViewModel.m105822s()
            if (r2 == 0) goto L_0x0216
            goto L_0x0217
        L_0x0216:
            r5 = 0
        L_0x0217:
            r10.mo97019e(r1, r5)
            com.ss.android.ugc.gamora.editor.EditToolbarViewModel r10 = r9.f109559n
            r1 = 12
            r10.mo97019e(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.edit.VEVideoPublishEditActivity.mo88082a(d.s):void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo88083a(C52860x xVar) throws Exception {
        m95021p();
        this.f109567v.mo110430a().mo97080a();
        C49159aw awVar = this.f109568w;
        boolean z = this.f109550e;
        boolean z2 = this.f109537A;
        C43341aq aqVar = new C43341aq(this);
        C52711k.m112240b(aqVar, "successCallback");
        VideoPublishEditModel videoPublishEditModel = awVar.f123534q;
        if (videoPublishEditModel == null) {
            C52711k.m112237a("mModel");
        }
        if (videoPublishEditModel.isMvThemeVideoType()) {
            VideoPublishEditModel videoPublishEditModel2 = awVar.f123534q;
            if (videoPublishEditModel2 == null) {
                C52711k.m112237a("mModel");
            }
            if (TextUtils.isEmpty(videoPublishEditModel2.mvCreateVideoData.videoCoverImgPath)) {
                VideoPublishEditModel videoPublishEditModel3 = awVar.f123534q;
                if (videoPublishEditModel3 == null) {
                    C52711k.m112237a("mModel");
                }
                videoPublishEditModel3.mvCreateVideoData.videoCoverImgPath = C39630m.m88234a().mo58606d().mo80661a().mo80663a();
            }
            C20347c ag = awVar.mo97189ag();
            VideoPublishEditModel videoPublishEditModel4 = awVar.f123534q;
            if (videoPublishEditModel4 == null) {
                C52711k.m112237a("mModel");
            }
            String str = videoPublishEditModel4.mvCreateVideoData.videoCoverImgPath;
            VideoPublishEditModel videoPublishEditModel5 = awVar.f123534q;
            if (videoPublishEditModel5 == null) {
                C52711k.m112237a("mModel");
            }
            new C44002b(ag, str, videoPublishEditModel5.mvCreateVideoData.videoCoverStartTime, new C49182aq(awVar, z, z2, aqVar));
            return;
        }
        VideoPublishEditModel videoPublishEditModel6 = awVar.f123534q;
        if (videoPublishEditModel6 == null) {
            C52711k.m112237a("mModel");
        }
        if (videoPublishEditModel6.isStatusVideoType()) {
            VideoPublishEditModel videoPublishEditModel7 = awVar.f123534q;
            if (videoPublishEditModel7 == null) {
                C52711k.m112237a("mModel");
            }
            if (TextUtils.isEmpty(videoPublishEditModel7.statusCreateVideoData.getVideoCoverImgPath())) {
                VideoPublishEditModel videoPublishEditModel8 = awVar.f123534q;
                if (videoPublishEditModel8 == null) {
                    C52711k.m112237a("mModel");
                }
                videoPublishEditModel8.statusCreateVideoData.setVideoCoverImgPath(C39630m.m88234a().mo58606d().mo80661a().mo80663a());
            }
            C0013i ad = awVar.mo97186ad();
            if (ad != null) {
                ad.mo19a((C0011g<TResult, TContinuationResult>) new C49183ar<TResult,TContinuationResult>(awVar, z, z2, aqVar));
            }
        } else {
            awVar.mo97182a(false, z, z2, (Runnable) aqVar, true);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo88084a(Boolean bool) {
        if (bool != null && bool.booleanValue()) {
            this.f109553h.mo110458c().setValue(C52977l.m112704a(true, this.f109554i.isReviewVideo(), this.f109554i.veAudioEffectParam));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo88086a(Void voidR) {
        C32458a.m75144a("receive prepare done event in edit page presist");
        if (mo78592d() != null && this.f109554i.infoStickerModel != null) {
            C44810b.m98014a(this.f109554i.infoStickerModel, (AbstractMap<Integer, StickerItemModel>) SubtitleModule.m97952aa());
            SubtitleModule.m97950a(mo78592d(), C39629l.m88233b(), this.f109554i, SubtitleModule.m97952aa());
        }
    }

    /* renamed from: a */
    public final void mo46739a(boolean z) {
        this.f109562q.mo96809a(z ? C43303dy.m94972c(this) : 0);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo88081a(AVChallenge aVChallenge) {
        if (aVChallenge != null) {
            if (this.f109554i.challenges == null) {
                this.f109554i.challenges = new ArrayList();
            }
            this.f109554i.challenges.add(aVChallenge);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo88080a(C31427a aVar) {
        if (aVar != null) {
            C31459g gVar = aVar.f82286b;
            if (this.f109547K == null) {
                this.f109547K = gVar;
                return;
            }
            C20347c d = mo78592d();
            if (!(gVar == null || this.f109547K.f82324a == gVar.f82324a || d == null)) {
                C31405ah ahVar = this.f109543G;
                d.getClass();
                C26890h.m65011a("adjust_filter_complete", C23089d.m56640a().mo47829a("enter_from", "video_edit_page").mo47829a("creation_id", this.f109554i.creationId).mo47829a("shoot_way", this.f109554i.mShootWay).mo47826a("draft_id", this.f109554i.draftId).mo47826a("filter_id", gVar.f82324a).mo47829a("filter_name", gVar.f82325b).mo47828a("value", (Object) Float.valueOf(C31460h.m73279a(gVar, ahVar, (C31406ai) new C43337am(d)))).f61491a);
                this.f109547K = gVar;
            }
        }
    }

    /* renamed from: a */
    public final boolean mo78676a() {
        return this.f109552g;
    }

    /* renamed from: a */
    public final boolean mo74028a(Effect effect) {
        if (!C39629l.m88232a().mo58583n().mo83103a(C40790a.EnableDonationSticker)) {
            return C35556ac.m80350d(effect);
        }
        return false;
    }

    /* renamed from: c */
    public final boolean mo46742c() {
        return this.f109569x;
    }

    /* renamed from: p */
    private void m95021p() {
        this.f109568w.mo97168O().mo97254T();
    }

    /* renamed from: d */
    public final C20347c mo78592d() {
        return (C20347c) this.f109557l.mo97038h().getValue();
    }

    public Resources getResources() {
        C45392al.m98950a(this, this.mFirstResumed);
        return super.getResources();
    }

    public int getStatusBarColor() {
        return getResources().getColor(R.color.arz);
    }

    public void onStop() {
        this.f109545I.mo97343a(C0177a.ON_STOP);
        super.onStop();
    }

    /* renamed from: l */
    private boolean m95017l() {
        if (this.f109554i.veAudioRecorderParam == null || (!this.f109554i.veAudioRecorderParam.hasRecord() && this.f109554i.veAudioRecorderParam.getNeedOriginalSound())) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final void mo46740b() {
        C22452a.m55494a(this.f109570y, this.f109539C.mo88379a(), this.f109539C.mo88380b());
        this.f109557l.mo22530c(C49024o.INSTANCE);
    }

    /* renamed from: e */
    public final boolean mo88092e() {
        if (!this.f109555j || (this.f109554i.isMvThemeVideoType() && !C39629l.m88232a().mo58583n().mo83103a(C40790a.EnableEditPageMVMemoryOpt))) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public final Map mo88096g() {
        HashMap hashMap = new HashMap();
        if (this.f109554i != null) {
            hashMap.put("creation_id", this.f109554i.creationId);
        }
        return hashMap;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public final /* synthetic */ void mo88098i() {
        VideoPublishEditModel videoPublishEditModel = this.f109554i;
        C39630m.m88234a().mo58597A().mo74189a(this, videoPublishEditModel.mUploadPath, new C43324b(videoPublishEditModel));
    }

    /* renamed from: k */
    private void m95016k() {
        new C10643a(this).mo18899b((int) R.string.oo).mo18903b(getString(R.string.wf), (OnClickListener) new C43331ag(this)).mo18893a(getString(R.string.buu), (OnClickListener) new C43332ah(this)).mo18897a().mo18882b();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public void mo88093f() {
        if (getIntent().hasExtra("extra_share_context")) {
            C26916m mVar = (C26916m) getIntent().getSerializableExtra("extra_share_context");
            if (mVar != null && C39630m.m88234a().mo58610h().mo74172a(mVar) && mVar.mTargetSceneType == 1) {
                C39630m.m88234a().mo58610h().mo74169a(this, mVar, "Sharing canceled", 20013);
            }
        }
    }

    public void finish() {
        m95014c(false);
        if (this.f109554i.commerceData != null) {
            C53755c.m114319a().mo112960d(new C43892f(this.f109554i.commerceData));
        }
        overridePendingTransition(0, R.anim.r);
        super.finish();
    }

    public void onPause() {
        this.f109545I.mo97343a(C0177a.ON_PAUSE);
        C45261c cVar = C45258b.f114465b;
        if (cVar != null) {
            cVar.mo91543b();
        }
        super.onPause();
        C10703a.m21575a(false);
        C45412b.m98979a().pause(this, "video_edit", this.f109554i.mShootWay, this.f109554i.creationId);
    }

    /* renamed from: m */
    private boolean m95018m() {
        boolean z;
        if (this.f109554i.isStatusVideoType()) {
            z = this.f109568w.mo97185ac();
        } else if (this.f109568w.mo97168O().mo97257W() || this.f109554i.hasInfoStickers()) {
            z = true;
        } else {
            z = false;
        }
        if (!C9414h.m18631b(this.f109554i.mEffectList) && this.f109554i.mTimeEffect == null && !m95017l() && !this.f109554i.isChangeMultiEditData() && !z) {
            return true;
        }
        new C10643a(this).mo18885a((int) R.string.d8r).mo18899b((int) R.string.d8q).mo18900b((int) R.string.wf, (OnClickListener) null).mo18886a((int) R.string.aig, (OnClickListener) new C43333ai(this)).mo18897a().mo18882b().show();
        return false;
    }

    /* renamed from: n */
    private void m95019n() {
        this.f109568w.mo97168O().mo97258X();
        C43214dh.m94817a().mo50200a(this.f109549d);
        if (this.f109554i.mIsFromDraft) {
            this.f109554i.mMusicPath = this.f109568w.f123500E.mo97121e();
            if (!this.f109554i.mUseMusicBeforeEdit) {
                this.f109554i.mWorkspace.mo86459f();
                C43214dh.m94817a().mo50200a((C42482c) null);
            }
            if (!this.f109551f) {
                C10691a.m21548c(getApplicationContext(), (int) R.string.b2i).mo19066a();
                return;
            }
            if (!C48016e.m103944b(this.f109554i.mStickerPath)) {
                this.f109554i.mStickerPath = null;
                this.f109554i.mStickerID = "";
            }
            Intent a = mo88075a(this.f109554i);
            if (a != null) {
                mo88078a(a, this.f109554i);
            }
        } else if (this.f109554i.hasRetake()) {
            Intent intent = new Intent();
            m95012a(intent, this.f109554i.multiEditVideoRecordData);
            C43214dh.m94817a().mo50200a(this.f109554i.getOriginalRecordMusic());
            C44403a.m97196a().mo48304b(this, intent);
            finish();
        } else if (this.f109554i.isCutSameVideoType()) {
            setResult(-1, C39630m.m88234a().mo58606d().mo80661a().mo80662a(this.f109554i.cutSameEditData));
            finish();
        } else {
            C43434az.m95209c(this.f109554i);
            C43214dh.m94817a().mo87857g();
            C43214dh.m94817a().mo87851a((Collection<AVChallenge>) this.f109554i.challenges);
            C43214dh.m94817a().mo87853c();
            C43214dh.m94817a().mo87854d();
            mo88093f();
            finish();
        }
    }

    /* renamed from: o */
    private void m95020o() {
        this.f109568w.mo97168O().mo97258X();
        C43214dh.m94817a().mo50200a((C42482c) null);
        Intent intent = new Intent();
        intent.putExtra("edit_publish_session_end_together", true);
        intent.putExtra("file_path", this.f109554i.livePublishModel.getFilePath());
        intent.putExtra("shoot_way", this.f109554i.mShootWay);
        intent.putExtra("content_type", C43855fx.m96289b(this.f109554i));
        intent.putExtra("creation_id", this.f109554i.creationId);
        intent.putExtra("live_publish_model", this.f109554i.livePublishModel);
        intent.putExtra("draft_to_cut", true);
        C42628e eVar = new C42628e();
        eVar.setTitle(this.f109554i.title);
        eVar.setStructList(this.f109554i.structList);
        eVar.setPrivate(this.f109554i.isPrivate);
        eVar.setPoiId(this.f109554i.poiId);
        eVar.setChallenges(this.f109554i.challenges);
        eVar.setDefaultSelectStickerPoi(this.f109554i.defaultSelectStickerPoi);
        eVar.setStickerChallenge(this.f109554i.stickerChallenge);
        eVar.setCommentSetting(this.f109554i.commentSetting);
        eVar.setPublishData(this.f109554i.commerceData);
        eVar.setDownloadSetting(this.f109554i.allowDownloadSetting);
        eVar.setCommerceData(this.f109554i.commerceData);
        eVar.setAllowDownloadSetting(this.f109554i.allowDownloadSetting);
        eVar.setVideoCategory(this.f109554i.videoCategory);
        intent.putExtra("draft_to_cut_model", eVar);
        C44403a.m97196a().mo48302a((Context) this, intent, -1);
        C43214dh.m94817a().mo87857g();
        C43214dh.m94817a().mo87851a((Collection<AVChallenge>) this.f109554i.challenges);
        C43214dh.m94817a().mo87853c();
        C43214dh.m94817a().mo87854d();
        finish();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public final /* synthetic */ void mo88097h() {
        MultiEditVideoStatusRecordData multiEditVideoStatusRecordData;
        C48016e.m103942b(new File(C43307ea.f109492e));
        C48016e.m103938a(this.f109554i.uniqueVideoSessionDir(C43307ea.f109502o), C43307ea.f109492e, false);
        if (this.f109554i.isMultiVideoEdit()) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f109554i.uniqueVideoSessionDir(C43307ea.f109493f));
            sb.append(File.separator);
            String sb2 = sb.toString();
            String str = C43307ea.f109492e;
            VideoPublishEditModel videoPublishEditModel = this.f109554i;
            C43338an anVar = new C43338an(this);
            C52711k.m112240b(sb2, "srcDir");
            C52711k.m112240b(str, "dstDir");
            C52711k.m112240b(anVar, "callBack");
            if (videoPublishEditModel != null) {
                multiEditVideoStatusRecordData = videoPublishEditModel.multiEditVideoRecordData;
            } else {
                multiEditVideoStatusRecordData = null;
            }
            if (multiEditVideoStatusRecordData != null) {
                C43684d.m95973a(sb2, str, false, videoPublishEditModel.multiEditVideoRecordData, anVar);
            }
        } else {
            C48016e.m103943b(this.f109554i.uniqueVideoSessionDir(C43307ea.f109493f), C43307ea.f109492e);
            C18842a.m45934b(new C43339ao(this));
        }
        if (this.f109554i.containBackgroundVideo) {
            VideoPublishEditModel videoPublishEditModel2 = this.f109554i;
            C52711k.m112240b(videoPublishEditModel2, "publishModel");
            String a = C46448b.m100834a(videoPublishEditModel2);
            String str2 = C43308eb.f109495h;
            C48016e.m103954e(str2);
            C48016e.m103943b(a, str2);
        }
        if (this.f109554i.mShootMode == 13) {
            String str3 = this.f109554i.greenScreenDefaultImage;
            String draftDir = this.f109554i.draftDir();
            C52711k.m112240b(draftDir, "draftDir");
            if (!TextUtils.isEmpty(str3)) {
                String a2 = C32893h.m75782a(str3, draftDir);
                String a3 = C32893h.m75781a(str3);
                if (!C48016e.m103944b(a3) && C48016e.m103944b(a2)) {
                    C48016e.m103948c(a2, a3);
                }
            }
        }
    }

    public void onDestroy() {
        this.f109545I.mo97343a(C0177a.ON_DESTROY);
        super.onDestroy();
        C39629l.m88232a().mo58593x().mo74281b(this.f109546J);
        C39630m.m88234a().mo58604b().mo80563a((C24437f) null);
        C39630m.m88234a().mo58604b().mo80585g().mo80593b();
        C39630m.m88234a().mo58621s().mo74231a((C39590b) null, (FragmentActivity) null, true);
        m95014c(false);
        C46679c.m101291a();
        if (!(!C39629l.m88232a().mo58583n().mo83103a(C40790a.EnableSubtitleRecognition) || this.f109557l == null || mo78592d() == null)) {
            C20347c d = mo78592d();
            C52711k.m112240b(d, "veEditor");
            d.mo42991a((VEInfoStickerBufferListener) null);
        }
        if (this.f109557l != null && EditViewModel.m105818D()) {
            C39630m.m88234a().mo58604b().mo80585g().mo80588a((C24440i) null);
            C39630m.m88234a().mo58604b().mo80585g().mo80589a((C24444m) null);
        }
        C45412b.m98979a().leave(this, "video_edit");
    }

    public void onResume() {
        boolean z;
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.edit.VEVideoPublishEditActivity", "onResume", true);
        C45407ay.m98968a("VEVideoPublishEditActivity onResume");
        if (C45392al.m98951b(this)) {
            ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.edit.VEVideoPublishEditActivity", "onResume", false);
            return;
        }
        this.f109545I.mo97343a(C0177a.ON_RESUME);
        super.onResume();
        C10703a.m21575a(true);
        C45412b.m98979a().step("av_video_edit", "onResume");
        this.f109555j = false;
        this.f109569x = true;
        if (AVServiceImpl.createIInternalAVServicebyMonsterPlugin().avSettingsService().isEnableVideoEditActivityUploadSpeedProbe() && (C32462a.m75159a(this) || (C32462a.m75160b(this) && C39630m.m88234a().mo58613k().mo74311a()))) {
            Context applicationContext = getApplicationContext();
            C52711k.m112240b(applicationContext, "applicationContext");
            C52727e eVar = new C52727e();
            eVar.element = null;
            new C45279j(new C45274h(eVar, new C45268g(applicationContext)), new C45278i(eVar)).invoke();
            C45261c cVar = C45258b.f114465b;
            if (cVar != null) {
                C45262a aVar = new C45262a(cVar);
                switch (C45282c.f114497a[cVar.f114471a.ordinal()]) {
                    case 2:
                        C45253a aVar2 = cVar.f114472b;
                        int a = C45261c.m98745a();
                        long currentTimeMillis = System.currentTimeMillis();
                        C45255b bVar = new C45255b(aVar2, a, currentTimeMillis);
                        C45256c cVar2 = new C45256c(aVar2, currentTimeMillis);
                        new C45257d(aVar2, currentTimeMillis, a);
                        if (bVar.invoke()) {
                            z = cVar2.invoke();
                        } else {
                            z = false;
                        }
                        if (z) {
                            aVar.invoke();
                            break;
                        }
                        break;
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        aVar.invoke();
                        break;
                }
            }
        }
        C45392al.m98949a(this);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.edit.VEVideoPublishEditActivity", "onResume", false);
    }

    public void onStart() {
        this.f109545I.mo97343a(C0177a.ON_START);
        super.onStart();
        if (!TextUtils.isEmpty(this.f109554i.mMusicPath) && this.f109554i.mCurMusicLength <= 0) {
            this.f109554i.mCurMusicLength = C39630m.m88234a().mo58604b().mo80578b(this.f109554i.mMusicPath);
        }
        VideoPublishEditModel videoPublishEditModel = this.f109554i;
        C52711k.m112240b(videoPublishEditModel, "model");
        C45380af a = C45380af.m98935a();
        C52711k.m112236a((Object) a, "MemoryUtil.getInstance()");
        C45380af a2 = C45380af.m98935a();
        C52711k.m112236a((Object) a2, "MemoryUtil.getInstance()");
        C45380af a3 = C45380af.m98935a();
        C52711k.m112236a((Object) a3, "MemoryUtil.getInstance()");
        C45380af a4 = C45380af.m98935a();
        C52711k.m112236a((Object) a4, "MemoryUtil.getInstance()");
        C26890h.m65011a("av_memory_log", C23089d.m56640a().mo47829a("creation_id", videoPublishEditModel.creationId).mo47829a("enter_from", "video_edit_page").mo47827a("dalvikPss", a.f114754d).mo47827a("nativePss", a2.f114755e).mo47827a("otherPss", a3.f114757g).mo47827a("totalPss", a4.f114756f).f61491a);
    }

    /* renamed from: j */
    private boolean m95015j() {
        float f;
        C43769w wVar;
        this.f109567v.mo110430a().mo97080a();
        C43368e eVar = this.f109568w.mo97166M().f109678p;
        if (eVar != null) {
            eVar.mo88299a();
        }
        VideoPublishEditModel videoPublishEditModel = this.f109554i;
        VEVideoPublishEditViewModel vEVideoPublishEditViewModel = this.f109553h;
        if (mo78592d() != null) {
            f = mo78592d().mo43096z();
        } else {
            f = -1.0f;
        }
        C43434az.m95205a(videoPublishEditModel, vEVideoPublishEditViewModel, f, "exit_edit");
        if (this.f109554i.recordMode != 1 && (!C9431p.m18664a(this.f109554i.getDuetFrom()) || this.f109557l.mo97050u())) {
            mo88093f();
            if (this.f109554i.mIsFromDraft) {
                finish();
                return true;
            }
            if (m95018m()) {
                m95019n();
            }
            return false;
        } else if (this.f109554i.recordMode == 1) {
            if (this.f109554i.mIsFromDraft) {
                C43769w a = C43769w.m96207a(Integer.valueOf(R.string.d39), Integer.valueOf(R.string.wf), Integer.valueOf(R.string.b8q));
                m95009a(((Integer) a.f110833a).intValue(), ((Integer) a.f110834b).intValue(), ((Integer) a.f110835c).intValue());
                return false;
            }
            new C10643a(this).mo18885a((int) R.string.po).mo18899b((int) R.string.pn).mo18900b((int) R.string.wf, (OnClickListener) new C43329ae(this)).mo18886a((int) R.string.pd, (OnClickListener) new C43330af(this)).mo18897a().mo18882b();
            return false;
        } else if (this.f109554i.isCutSameVideoType()) {
            if (this.f109554i.mIsFromDraft) {
                m95016k();
            } else if (m95018m()) {
                m95019n();
            }
            return false;
        } else if (this.f109554i.mOrigin != 0 || !this.f109554i.mIsFromDraft) {
            if ((this.f109554i.isMvThemeVideoType() || this.f109554i.isStatusVideoType()) && this.f109554i.mIsFromDraft) {
                m95016k();
                return false;
            } else if (this.f109554i.mFromCut || this.f109554i.mOrigin == 0 || this.f109554i.mFromMultiCut) {
                if (this.f109554i.mIsFromDraft && (this.f109554i.mFromMultiCut || this.f109554i.mFromCut)) {
                    wVar = C43769w.m96207a(Integer.valueOf(R.string.d39), Integer.valueOf(R.string.wf), Integer.valueOf(R.string.b8q));
                } else if (this.f109554i.mFromMultiCut || this.f109554i.mFromCut) {
                    wVar = C43769w.m96207a(Integer.valueOf(R.string.fcc), Integer.valueOf(R.string.wf), Integer.valueOf(R.string.b8q));
                } else {
                    wVar = C43769w.m96207a(Integer.valueOf(R.string.fca), Integer.valueOf(R.string.wf), Integer.valueOf(R.string.b8q));
                }
                m95009a(((Integer) wVar.f110833a).intValue(), ((Integer) wVar.f110834b).intValue(), ((Integer) wVar.f110835c).intValue());
                return false;
            } else {
                if (m95018m()) {
                    m95019n();
                }
                return false;
            }
        } else if (!C39629l.m88232a().mo58583n().mo83103a(C40790a.EnableLivePublishBackToCut) || !this.f109554i.publishFromLive() || !C50200d.m108346a(this.f109554i.livePublishModel.getFilePath())) {
            m95016k();
            return false;
        } else {
            if (this.f109568w == null || !this.f109568w.mo97192aj()) {
                m95020o();
            } else {
                new C10643a(this).mo18899b((int) R.string.d39).mo18900b((int) R.string.wf, (OnClickListener) null).mo18886a((int) R.string.b8q, (OnClickListener) new C43334aj(this)).mo18897a().mo18882b();
            }
            return false;
        }
    }

    /* renamed from: c */
    private void m95014c(boolean z) {
        this.f109552g = z;
    }

    @C53771m(mo112975a = ThreadMode.MAIN)
    public void onEvent(C43889c cVar) {
        finish();
    }

    /* renamed from: a */
    public final void mo48605a(C23422a aVar) {
        this.f109540D.add(aVar);
    }

    /* renamed from: b */
    public final void mo48606b(C23422a aVar) {
        this.f109540D.remove(aVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo88088b(C52860x xVar) throws Exception {
        m95015j();
    }

    /* renamed from: b */
    private static RecordScene m95013b(VideoPublishEditModel videoPublishEditModel) {
        RecordScene audioTrack = new RecordScene().musicPath(videoPublishEditModel.mMusicPath).musicStart(videoPublishEditModel.mMusicStart).faceBeauty(videoPublishEditModel.mFaceBeauty).videoSegment(videoPublishEditModel.mVideoSegmentsDesc).hardEncode(videoPublishEditModel.mHardEncode).mp4Path(videoPublishEditModel.videoPath()).maxDuration(videoPublishEditModel.maxDuration).audioTrack(videoPublishEditModel.audioTrack);
        C43214dh.m94817a().f109294i = audioTrack;
        return audioTrack;
    }

    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        if (!C20393d.f55920a) {
            C20393d.f55921b = C39629l.m88232a().mo58583n().mo83103a(C40790a.EditorSceneLazyInit);
            StringBuilder sb = new StringBuilder("ASVEPerformance EditorSceneLazyInit : ");
            sb.append(C20393d.m50598a());
            C45407ay.m98973d(sb.toString());
        }
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.edit.VEVideoPublishEditActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
        if (z) {
            if (!this.f109557l.mo97046p()) {
                this.f109541E.mo89272a();
                return;
            }
            HashSet hashSet = null;
            if (this.f109554i.isReviewVideo() && !this.f109554i.mIsFromDraft) {
                hashSet = new HashSet();
                hashSet.add("music");
            }
            C43763r.m96178a((C43764a) this.f109541E, (Set<String>) hashSet);
        }
    }

    /* renamed from: b */
    public final void mo46741b(boolean z) {
        int c = C22452a.m55497c();
        EditCornerViewModel editCornerViewModel = this.f109562q;
        if (!z) {
            c = 0;
        }
        editCornerViewModel.mo96811b(c);
    }

    /* renamed from: a */
    public final Intent mo88075a(VideoPublishEditModel videoPublishEditModel) {
        if (m95013b(videoPublishEditModel).isSegmentsNotValid()) {
            m95009a((int) R.string.fca, (int) R.string.wf, (int) R.string.b8q);
            return null;
        }
        Intent intent = new Intent();
        C44403a.m97196a().mo48295a((Activity) this, intent);
        intent.putExtra("draft_to_edit_from", this.f109571z);
        intent.putExtra("shoot_way", videoPublishEditModel.mShootWay);
        if (videoPublishEditModel.veCherEffectParam != null) {
            intent.putExtra("extra_ve_cher_effect_param", videoPublishEditModel.veCherEffectParam);
        }
        intent.putExtra("restore", 1);
        intent.putExtra("workspace", videoPublishEditModel.mWorkspace);
        intent.putExtra("translation_type", 3);
        intent.putExtra("video_edit_model", videoPublishEditModel);
        intent.putExtra(LeakCanaryFileProvider.f132050j, videoPublishEditModel.mMusicPath);
        intent.putExtra("creation_id", videoPublishEditModel.creationId);
        intent.putExtra("draft_id", videoPublishEditModel.draftId);
        C23208an.m56934a("video_post_page");
        videoPublishEditModel.removeChallengeFromTitleAndStruct(this.f109538B.mo73979c());
        if (!(videoPublishEditModel.veAudioEffectParam == null || videoPublishEditModel.veAudioEffectParam.getChallenge() == null)) {
            videoPublishEditModel.removeAudioEffectChallengeFromTitleAndStruct(videoPublishEditModel.veAudioEffectParam.getChallenge());
        }
        intent.putExtra("video_title", videoPublishEditModel.title);
        intent.putExtra("video_title_chain", videoPublishEditModel.chain);
        intent.putExtra("disable_delete_title_chain", videoPublishEditModel.disableDeleteChain);
        intent.putExtra("struct_list", (Serializable) videoPublishEditModel.structList);
        intent.putExtra("is_rivate", videoPublishEditModel.isPrivate);
        intent.putExtra("comment_setting", videoPublishEditModel.commentSetting);
        intent.putExtra("download_setting", videoPublishEditModel.allowDownloadSetting);
        if (videoPublishEditModel.isStitchMode()) {
            intent.putExtra("stitch_params", videoPublishEditModel.getStitchParams());
        }
        if (videoPublishEditModel.hasRetake() || (videoPublishEditModel.multiEditVideoRecordData != null && videoPublishEditModel.multiEditVideoRecordData.isSupportMultiEdit)) {
            m95012a(intent, videoPublishEditModel.multiEditVideoRecordData);
        }
        return intent;
    }

    @C53771m(mo112975a = ThreadMode.MAIN)
    public void onEvent(C43894h hVar) {
        this.f109554i.title = hVar.f111166a;
        this.f109554i.structList = hVar.f111169d;
        this.f109554i.isPrivate = hVar.f111170e;
        this.f109554i.poiId = hVar.f111171f;
        this.f109554i.challenges = hVar.f111173h;
        this.f109554i.commentSetting = hVar.f111174i;
        this.f109554i.defaultSelectStickerPoi = hVar.f111172g;
        this.f109554i.compileProbeResult = hVar.f111177l;
        this.f109554i.commerceData = hVar.f111178m;
        this.f109554i.allowDownloadSetting = hVar.f111179n;
        this.f109554i.microAppId = null;
        this.f109554i.microAppModel = null;
        this.f109554i.videoCategory = hVar.f111180o;
        this.f109554i.chain = hVar.f111167b;
        this.f109554i.disableDeleteChain = hVar.f111168c;
        C43886a aVar = hVar.f111175j;
        VideoPublishEditModel videoPublishEditModel = this.f109554i;
        C52711k.m112240b(videoPublishEditModel, "model");
        if (videoPublishEditModel.isMvThemeVideoType() && videoPublishEditModel.mvCreateVideoData != null) {
            C23289b bVar = videoPublishEditModel.mvCreateVideoData;
            bVar.videoCoverStartTime = aVar.f111143a;
            bVar.videoCoverImgPath = aVar.f111144b;
        } else if (!videoPublishEditModel.isStatusVideoType() || videoPublishEditModel.statusCreateVideoData == null) {
            videoPublishEditModel.mVideoCoverStartTm = ((float) aVar.f111143a) / 1000.0f;
        } else {
            StatusCreateVideoData statusCreateVideoData = videoPublishEditModel.statusCreateVideoData;
            statusCreateVideoData.setVideoCoverStartTime(aVar.f111143a);
            statusCreateVideoData.setVideoCoverImgPath(aVar.f111144b);
        }
    }

    /* renamed from: a */
    public final void mo88076a(int i) {
        this.f109548c.setBackgroundColor(i);
        this.f109556k.mo96922a(i);
    }

    public void onCreate(Bundle bundle) {
        C12896b bVar;
        C12896b bVar2;
        C12882d dVar;
        C12973u uVar;
        C12890f fVar;
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.edit.VEVideoPublishEditActivity", "onCreate", true);
        C45412b.m98979a().enter(this, "video_edit");
        this.f109545I.mo97343a(C0177a.ON_CREATE);
        super.onCreate(bundle);
        C10703a.m21575a(true);
        C45412b.m98979a().step("av_video_edit", "onCreate");
        if (VERSION.SDK_INT >= 21) {
            getWindow().setSharedElementReenterTransition(new AutoTransition());
            getWindow().setSharedElementExitTransition(new AutoTransition());
        }
        setContentView((int) R.layout.et);
        m95014c(true);
        if (getIntent() == null) {
            finish();
        }
        this.f109544H = Boolean.valueOf(C39629l.m88232a().mo58583n().mo83103a(C40790a.EnableFilterIntensityJust));
        this.f109553h = (VEVideoPublishEditViewModel) C0214z.m440a((FragmentActivity) this).mo359a(VEVideoPublishEditViewModel.class);
        Intent intent = getIntent();
        this.f109554i = new C43447bb("VEVideoPublishEditActivity").mo88378a(intent);
        this.f109554i.setNewVersion(C39629l.m88232a().mo58573d().mo80733b());
        this.f109554i.setStickPointType(intent.getIntExtra("extra_stick_point_type", 0));
        this.f109550e = intent.getBooleanExtra("is_from_sys_share", false);
        this.f109571z = intent.getIntExtra("draft_to_edit_from", 0);
        this.f109553h.mo110456a(C39629l.m88232a().mo58584o().mo64333c().mo64346b(this.f109554i.getFilterIndex()), true);
        C42482c b = C43214dh.m94817a().mo50201b();
        this.f109549d = b;
        if (b != null) {
            this.f109554i.musicId = b.getMusicId();
            this.f109554i.previewStartTime = b.getPreviewStartTime();
            this.f109554i.isCommerceMusic = b.isCommerceMusic();
            this.f109554i.isOriginalSound = b.isOriginalSound();
            this.f109554i.mId3Album = b.getAlbum();
            this.f109554i.mId3Title = b.getName();
            this.f109554i.mId3Author = b.getSinger();
            this.f109554i.mMusicType = C39630m.m88234a().mo58604b().mo80577a(b.getMusicType());
        }
        if (this.f109554i.mIsFromDraft) {
            this.f109551f = false;
            C46797a.m101642a().execute(new C43325aa(this));
        }
        C12890f fVar2 = null;
        if (this.f109554i.recordMode == 1 && !this.f109554i.mIsFromDraft) {
            this.f109554i.mMusicPath = null;
        }
        this.f109554i.pic2VideoSource = intent.getStringExtra("picture_source");
        this.f109554i.setStickPointType(intent.getIntExtra("extra_stick_point_type", 0));
        String stringExtra = intent.getStringExtra("extra_festival_external_challenge_id");
        if (!TextUtils.isEmpty(stringExtra)) {
            new C35587c(this, stringExtra).mo73988a(new C43326ab(this));
        }
        C43447bb.m95229b(this.f109554i);
        if (intent.hasExtra("stitch_params")) {
            this.f109554i.stitchParams = (StitchParams) intent.getParcelableExtra("stitch_params");
        }
        this.f109554i = this.f109554i;
        if (!this.f109554i.isPreviewInfoValid()) {
            C45407ay.m98971b("VideoEditPage finish because of null EditPreviewInfo");
            finish();
            ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.edit.VEVideoPublishEditActivity", "onCreate", false);
            return;
        }
        if (this.f109554i.isMvThemeVideoType()) {
            f109536b = "MV";
        } else {
            f109536b = "VEVideoPublishEditActivity";
        }
        this.f109556k = (EditPreviewViewModel) C48927d.m105736a(this).mo96760a(EditPreviewViewModel.class);
        this.f109557l = (EditViewModel) C48927d.m105736a(this).mo96760a(EditViewModel.class);
        EditViewModel editViewModel = this.f109557l;
        VideoPublishEditModel videoPublishEditModel = this.f109554i;
        C52711k.m112240b(videoPublishEditModel, "<set-?>");
        editViewModel.f123232e = videoPublishEditModel;
        EditViewModel editViewModel2 = this.f109557l;
        C35579at atVar = this.f109538B;
        C52711k.m112240b(atVar, "<set-?>");
        editViewModel2.f123234g = atVar;
        this.f109543G = C31475n.m73310a(f109536b);
        this.f109557l.mo97028J().setValue(this.f109543G);
        this.f109559n = (EditToolbarViewModel) C48927d.m105736a(this).mo96760a(EditToolbarViewModel.class);
        this.f109560o = (EditTextStickerViewModel) C48927d.m105736a(this).mo96760a(EditTextStickerViewModel.class);
        this.f109561p = (EditStickerViewModel) C48927d.m105736a(this).mo96760a(EditStickerViewModel.class);
        this.f109562q = (EditCornerViewModel) C48927d.m105736a(this).mo96760a(EditCornerViewModel.class);
        this.f109563r = (EditGestureViewModel) C48927d.m105736a(this).mo96760a(EditGestureViewModel.class);
        this.f109564s = (EditFilterViewModel) C48927d.m105736a(this).mo96760a(EditFilterViewModel.class);
        this.f109565t = (EditLyricStickerViewModel) C48927d.m105736a(this).mo96760a(EditLyricStickerViewModel.class);
        this.f109566u = (EditMusicViewModel) C48927d.m105736a(this).mo96760a(EditMusicViewModel.class);
        this.f109567v = (CompileProbeViewModel) C0214z.m440a((FragmentActivity) this).mo359a(CompileProbeViewModel.class);
        this.f109558m = new C49361cg(getLifecycle());
        this.f109541E = new C49249bd(this.f109557l, this.f109559n);
        this.f109539C = C43451be.m95243a(this.f109554i, false);
        this.f109557l.f123233f = this.f109539C;
        StringBuilder sb = new StringBuilder("VEVideoPublishEditActivity filter_id_list:");
        sb.append(this.f109554i.mCurFilterIds);
        sb.append(" prop_list:");
        sb.append(this.f109554i.mStickerID);
        sb.append(" effect_list:");
        sb.append(this.f109554i.getEditEffectList());
        sb.append(" info_sticker_list:");
        sb.append(this.f109554i.getInfoStickerList());
        C45407ay.m98973d(sb.toString());
        this.f109537A = getIntent().getBooleanExtra("enter_record_from_other_platform", false);
        if (this.f109554i.mEffectList != null) {
            C53027v.m112770a(this.f109554i.mEffectList, this.f109553h.mo110465j());
        }
        C39629l.m88232a().mo58586q();
        this.f109557l.mo97040j().observe(this, new C43343as(this));
        this.f109557l.mo97038h().observe(this, new C43344at(this));
        C49361cg cgVar = this.f109558m;
        EditViewModel editViewModel3 = this.f109557l;
        C43345au auVar = new C43345au(this);
        C52711k.m112240b(editViewModel3, "viewModel");
        C52711k.m112240b(auVar, "callback");
        cgVar.mo49444c(editViewModel3, C49366ci.INSTANCE, new C11934u(), new C49363b(auVar));
        C49361cg cgVar2 = this.f109558m;
        EditViewModel editViewModel4 = this.f109557l;
        C43430av avVar = new C43430av(this);
        C52711k.m112240b(editViewModel4, "viewModel");
        C52711k.m112240b(avVar, "callback");
        cgVar2.mo49444c(editViewModel4, C49367cj.INSTANCE, new C11934u(), new C49364c(avVar));
        C49361cg cgVar3 = this.f109558m;
        EditViewModel editViewModel5 = this.f109557l;
        C43431aw awVar = new C43431aw(this);
        C52711k.m112240b(editViewModel5, "viewModel");
        C52711k.m112240b(awVar, "callback");
        cgVar3.mo49444c(editViewModel5, C49365ch.INSTANCE, new C11934u(), new C49362a(awVar));
        this.f109553h.mo110470o().observe(this, new C43432ax(this));
        this.f109556k.mo96927h().observe(this, new C43433ay(this));
        this.f109568w = new C49159aw();
        this.f109568w.f123502G = this.f109545I;
        C49159aw awVar2 = this.f109568w;
        C35579at atVar2 = this.f109538B;
        C52711k.m112240b(atVar2, "stickerChallengeManager");
        awVar2.f123497B = atVar2;
        C12889a aVar = new C12889a(this, C49159aw.class);
        aVar.f33726d = R.id.cdt;
        aVar.f33728f = new C43773z(this);
        aVar.f33727e = false;
        Activity activity = aVar.f33723a;
        int i = aVar.f33726d;
        Class<? extends C12896b> cls = aVar.f33724b;
        Bundle bundle2 = aVar.f33725c;
        C12930k kVar = aVar.f33728f;
        boolean z = aVar.f33727e;
        String str = aVar.f33729g;
        boolean z2 = aVar.f33730h;
        C12879k.m25799a();
        if (str != null) {
            C12921h.m25906a(activity, str);
            if (kVar != null) {
                bVar = (C12896b) kVar.mo24488a(activity.getClass().getClassLoader(), cls.getName(), bundle2);
            } else {
                bVar = null;
            }
            if (bVar == null) {
                bVar2 = (C12896b) C12875h.m25796a(cls, bundle2);
            } else {
                bVar2 = bVar;
            }
            if (!C12880l.m25806a(activity)) {
                dVar = new C12853b(bVar2);
            } else {
                FragmentManager fragmentManager = activity.getFragmentManager();
                C12890f fVar3 = (C12890f) fragmentManager.findFragmentByTag(str);
                if (fVar3 == null || z) {
                    fVar2 = fVar3;
                } else {
                    FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
                    beginTransaction.remove(fVar3);
                    C12880l.m25804a(fragmentManager, beginTransaction, z2);
                }
                C12827a aVar2 = new C12827a(activity);
                if (fVar2 != null) {
                    C12973u a = C12973u.m26089a(activity, str, false, z2);
                    C12963o oVar = new C12963o(i, aVar2, bVar2, a, z);
                    fVar2.f33732b = oVar;
                    fVar = fVar2;
                    uVar = a;
                } else {
                    C12890f a2 = C12890f.m25812a(z);
                    FragmentTransaction beginTransaction2 = fragmentManager.beginTransaction();
                    beginTransaction2.add(i, a2, str);
                    C12973u a3 = C12973u.m26089a(activity, str, !z, z2);
                    C12963o oVar2 = r10;
                    C12963o oVar3 = new C12963o(i, aVar2, bVar2, a3, z);
                    a2.f33732b = oVar2;
                    C12880l.m25804a(fragmentManager, beginTransaction2, z2);
                    fVar = a2;
                    uVar = a3;
                }
                C128881 r7 = new C12882d(bVar2, activity, fVar, uVar, z2) {

                    /* renamed from: a */
                    boolean f33717a;

                    /* renamed from: b */
                    final /* synthetic */ C12896b f33718b;

                    /* renamed from: c */
                    final /* synthetic */ Activity f33719c;

                    /* renamed from: d */
                    final /* synthetic */ C12890f f33720d;

                    /* renamed from: e */
                    final /* synthetic */ C12973u f33721e;

                    /* renamed from: f */
                    final /* synthetic */ boolean f33722f;

                    /* renamed from: a */
                    public final C12896b mo24317a() {
                        if (this.f33717a) {
                            return null;
                        }
                        return this.f33718b;
                    }

                    {
                        this.f33718b = r1;
                        this.f33719c = r2;
                        this.f33720d = r3;
                        this.f33721e = r4;
                        this.f33722f = r5;
                    }
                };
                dVar = r7;
            }
            this.f109548c = (ViewGroup) findViewById(R.id.cdt);
            C12896b a4 = dVar.mo24317a();
            C433181 r2 = new C12855b() {

                /* renamed from: a */
                boolean f109572a;

                /* renamed from: a */
                public final void mo24318a(final C12924i iVar) {
                    super.mo24318a(iVar);
                    if (iVar instanceof C49231a) {
                        iVar.getLifecycle().mo324a(new C0183j() {
                            @C0200t(mo345a = C0177a.ON_START)
                            public void onStart() {
                                iVar.getLifecycle().mo325b(this);
                                C43740a aVar = VEVideoPublishEditActivity.this.f109568w.f123529l;
                                C20347c d = VEVideoPublishEditActivity.this.mo78592d();
                                C43699d dVar = aVar.f110743i.f110692h;
                                dVar.f110646a = d;
                                if (d != null) {
                                    d.mo43039b((C50711k) new C43700a(dVar));
                                }
                                if (!C433181.this.f109572a) {
                                    if (VEVideoPublishEditActivity.this.f109554i.mIsFromDraft && VEVideoPublishEditActivity.this.f109554i.mTimeEffect != null && VEVideoPublishEditActivity.this.f109554i.mTimeEffect.getKey().equals("1")) {
                                        C20347c d2 = VEVideoPublishEditActivity.this.mo78592d();
                                        if (d2 != null) {
                                            if (!VEVideoPublishEditActivity.this.f109554i.isFastImport) {
                                                d2.mo43036b(VEVideoPublishEditActivity.this.f109554i.getPreviewInfo().getReverseVideoArray());
                                            } else {
                                                d2.mo43010a(VEVideoPublishEditActivity.this.f109554i.getPreviewInfo().getReverseVideoArray(), VEVideoPublishEditActivity.this.f109554i.getPreviewInfo().getReverseAudioArray());
                                                d2.mo43020a(VEVideoPublishEditActivity.this.f109554i.getPreviewInfo().getTempVideoArray());
                                            }
                                            d2.mo43043c(true);
                                            if (VEVideoPublishEditActivity.this.f109554i.isFastImport) {
                                                VEVideoPublishEditActivity.this.f109553h.mo110468m().setValue(VEVolumeChangeOp.ofVoice(VEVideoPublishEditActivity.this.f109554i.voiceVolume));
                                            }
                                            d2.mo43085r();
                                        }
                                    }
                                    C433181.this.f109572a = true;
                                }
                            }
                        });
                    }
                }

                /* renamed from: a */
                public final void mo24319a(C12924i iVar, Bundle bundle) {
                    super.mo24319a(iVar, bundle);
                    if (iVar instanceof C49231a) {
                        VEVideoPublishEditActivity.this.f109570y = iVar.f33834b;
                        VEVideoPublishEditActivity.this.cb_();
                        VEVideoPublishEditActivity.this.f109557l.mo97038h().observe(iVar, new C0199s<C20347c>() {
                            public final /* synthetic */ void onChanged(Object obj) {
                                C20347c cVar = (C20347c) obj;
                                if (cVar != null) {
                                    C52906ab a = C29164a.m68668a(cVar.mo43071k(), VEVideoPublishEditActivity.this.f109554i);
                                    if (a != null) {
                                        VEVideoPublishEditActivity.this.f109553h.mo110467l().setValue(a);
                                    }
                                    VEVideoPublishEditActivity.this.f109557l.mo97038h().removeObserver(this);
                                }
                            }
                        });
                    }
                }
            };
            C12879k.m25799a();
            a4.f33758j.add(C12873f.m25792a(r2, Boolean.valueOf(true)));
            mo88076a(getResources().getColor(R.color.dj));
            if (this.f109554i.mIsFromDraft && this.f109554i.getNewVersion() != C39629l.m88232a().mo58573d().mo80733b()) {
                C45407ay.m98972c("enter ve_edit_page with old version draft");
            }
            VideoPublishEditModel videoPublishEditModel2 = this.f109554i;
            Intent intent2 = getIntent();
            C52711k.m112240b(videoPublishEditModel2, "model");
            C2201v.m6614b(videoPublishEditModel2).mo6514a(C2168a.m6521b()).mo6541d((C1711f<? super T, ? extends R>) new C43437c<Object,Object>(videoPublishEditModel2)).mo6545f((C1710e<? super T>) new C43438d<Object>(videoPublishEditModel2, intent2));
            getLifecycle().mo324a(AudioFocusManager.m98132a(this));
            if (C43214dh.m94817a().mo50201b() != null) {
                this.f109554i.mCurMusicLength = C43214dh.m94817a().mo50201b().getPresenterDuration();
            }
            if (EditViewModel.m105818D()) {
                C39630m.m88234a().mo58604b().mo80585g().mo80589a((C24444m) new C43335ak(this));
            }
            if (this.f109557l.mo97024F() && this.f109554i.hasSubtitle()) {
                this.f109554i.mSubtitleMusicChangeChecker.getData(this.f109554i);
            }
            if (this.f109544H.booleanValue()) {
                this.f109553h.mo110464i().observe(this, new C43327ac(this));
            }
            C39629l.m88232a().mo58593x().mo74278a(this.f109546J);
            ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.edit.VEVideoPublishEditActivity", "onCreate", false);
            return;
        }
        throw new IllegalArgumentException("tag cant be null");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo88079a(C20347c cVar) {
        if (cVar != null) {
            this.f109554i.setVideoLength(cVar.mo43071k());
            if (this.f109554i.isMvThemeVideoType()) {
                MVInfoBean d = cVar.mo43051d();
                if (d.width > 0 && d.height > 0) {
                    EditVideoSegment editVideoSegment = (EditVideoSegment) this.f109554i.getPreviewInfo().getVideoList().get(0);
                    List videoList = this.f109554i.getPreviewInfo().getVideoList();
                    String videoPath = editVideoSegment.getVideoPath();
                    String audioPath = editVideoSegment.getAudioPath();
                    VideoFileInfo videoFileInfo = new VideoFileInfo(d.width, d.height, (long) cVar.mo43071k(), 30, 0);
                    videoList.set(0, editVideoSegment.copy(videoPath, audioPath, videoFileInfo));
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo88077a(DialogInterface dialogInterface, int i) {
        m95020o();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo88087b(DialogInterface dialogInterface, int i) {
        m95019n();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ void mo88089c(DialogInterface dialogInterface, int i) {
        this.f109568w.mo97182a(true, this.f109550e, this.f109537A, (Runnable) new C43336al(this), true);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final /* synthetic */ void mo88091e(DialogInterface dialogInterface, int i) {
        if (this.f109554i.recordMode == 1) {
            VideoPublishEditModel videoPublishEditModel = this.f109554i;
            C52711k.m112240b(videoPublishEditModel, "model");
            C26890h.m65011a("back_to_shoot_confirm", new C23089d().mo47829a("to_status", "cancel").mo47829a("prop_id", videoPublishEditModel.mStickerID).mo47829a("shoot_way", videoPublishEditModel.mShootWay).mo47829a("creation_id", videoPublishEditModel.creationId).f61491a);
        }
    }

    /* renamed from: a */
    private void m95012a(Intent intent, MultiEditVideoStatusRecordData multiEditVideoStatusRecordData) {
        intent.putParcelableArrayListExtra("original_segments", multiEditVideoStatusRecordData.originalSegments);
        intent.putExtra("original_music_start", multiEditVideoStatusRecordData.originalMusicStart);
        intent.putExtra("retake_shoot_mode", 2);
        if (this.f109554i.isStitchMode()) {
            intent.putExtra("stitch_params", this.f109554i.getStitchParams());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final /* synthetic */ void mo88090d(DialogInterface dialogInterface, int i) {
        if (this.f109554i.recordMode == 1) {
            VideoPublishEditModel videoPublishEditModel = this.f109554i;
            C52711k.m112240b(videoPublishEditModel, "model");
            C26890h.m65011a("back_to_shoot_confirm", new C23089d().mo47829a("to_status", "confirm").mo47829a("prop_id", videoPublishEditModel.mStickerID).mo47829a("shoot_way", videoPublishEditModel.mShootWay).mo47829a("creation_id", videoPublishEditModel.creationId).f61491a);
        }
        mo88093f();
        finish();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public final /* synthetic */ void mo88094f(DialogInterface dialogInterface, int i) {
        C39629l.m88232a().mo58580k().mo80686a();
        C43214dh.m94817a().mo50200a(this.f109549d);
        C43214dh.m94817a().mo87855e();
        mo88093f();
        finish();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        for (C23422a onKeyDown : this.f109540D) {
            if (onKeyDown.onKeyDown(i, keyEvent)) {
                return true;
            }
        }
        if (i != 4) {
            return super.onKeyDown(i, keyEvent);
        }
        Fragment a = getSupportFragmentManager().mo2222a((int) R.id.cdt);
        if (a != null) {
            getSupportFragmentManager().mo2225a().mo2177a(a).mo2189b();
            return true;
        }
        m95015j();
        return true;
    }

    /* renamed from: a */
    public final void mo46737a(int i, int i2) {
        this.f109559n.mo22530c(new C49004l(i));
        this.f109557l.mo22530c(new C49021l(i));
        this.f109561p.mo22530c(new C48984b(Integer.valueOf(i)));
        this.f109559n.mo22530c(new C48999g(i2));
    }

    /* renamed from: a */
    public final void mo88078a(Intent intent, VideoPublishEditModel videoPublishEditModel) {
        startActivity(intent);
        C43214dh.m94817a().mo87857g();
        C43214dh.m94817a().mo87851a((Collection<AVChallenge>) videoPublishEditModel.challenges);
        C43214dh.m94817a().mo87853c();
        C43214dh.m94817a().mo87854d();
        finish();
    }

    /* renamed from: a */
    public static void m95011a(Context context, Intent intent, int i) {
        intent.setClass(context, VEVideoPublishEditActivity.class);
        context.startActivity(intent);
    }

    /* renamed from: a */
    private void m95009a(int i, int i2, int i3) {
        new C10643a(this).mo18899b(i).mo18900b(i2, (OnClickListener) null).mo18886a(i3, (OnClickListener) new C43328ad(this)).mo18897a().mo18882b();
    }

    /* renamed from: a */
    public static void m95010a(Activity activity, Intent intent, int i) {
        intent.setClass(activity, VEVideoPublishEditActivity.class);
        activity.startActivityForResult(intent, intent.getIntExtra("extra_request_code", BaseNotice.CHECK_PROFILE));
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (this.f109568w.f123530m != null) {
            C49395cx cxVar = this.f109568w.f123530m;
            if (i == C46476a.m100890a() && intent != null && i2 == -1) {
                ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("key_choose_media_data");
                C52711k.m112236a((Object) parcelableArrayListExtra, "selectMediaList");
                if (!parcelableArrayListExtra.isEmpty()) {
                    MediaModel mediaModel = (MediaModel) parcelableArrayListExtra.get(0);
                    C52711k.m112236a((Object) mediaModel, "mediaModel");
                    String str = mediaModel.f95383b;
                    C52711k.m112236a((Object) str, "imgPath");
                    cxVar.mo97334a(new C49923d(str));
                    C49925e eVar = cxVar.f123980k;
                    if (eVar == null) {
                        C52711k.m112237a("panelManager");
                    }
                    C49917c cVar = eVar.f125102f;
                    if (cVar != null && !TextUtils.isEmpty(str) && !C23715d.m58202a((Collection<T>) cVar.f125083e)) {
                        Iterator it = cVar.f125083e.iterator();
                        int i3 = 0;
                        while (true) {
                            if (!it.hasNext()) {
                                cVar.mo97726b();
                                break;
                            }
                            Object next = it.next();
                            int i4 = i3 + 1;
                            if (i3 < 0) {
                                C52575l.m112100b();
                            }
                            if (C52830p.m112407a(((C49923d) next).f125095a, str, false, 2, null)) {
                                cVar.mo97725a(i4);
                                break;
                            }
                            i3 = i4;
                        }
                    }
                }
            }
        }
        if (i == 1002) {
            Intent intent2 = new Intent();
            if (!(intent == null || intent.getExtras() == null)) {
                String string = intent.getExtras().getString("publish result");
                StringBuilder sb = new StringBuilder("PublishEditActivity success");
                sb.append(string);
                intent2.putExtra("edit result", sb.toString());
                intent2.putExtras(intent.getExtras());
            }
            setResult(i2, intent2);
            if (i2 == -1) {
                finish();
            }
            return;
        }
        if (i == 8 && i2 == 9) {
            Intent intent3 = new Intent();
            if (!(intent == null || intent.getExtras() == null)) {
                intent3.putExtras(intent.getExtras());
            }
            setResult(i2, intent3);
            finish();
        }
    }
}
