package com.p683ss.android.ugc.aweme.shortvideo.cut.scene;

import android.app.Activity;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0199s;
import android.arch.lifecycle.C0209x;
import android.arch.lifecycle.C0214z;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.support.p030v4.app.FragmentActivity;
import android.support.p030v4.p038f.C0794k;
import android.view.LayoutInflater;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.apm.p501q.C9190h;
import com.bytedance.ies.dmt.p664ui.p666b.C10641a.C10643a;
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
import com.bytedance.scene.C12924i;
import com.google.p1057b.p1058a.C17429o;
import com.p683ss.android.ugc.C27991b;
import com.p683ss.android.ugc.asve.p1239c.C20347c;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.C26916m;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.port.p2082in.C39630m;
import com.p683ss.android.ugc.aweme.property.C40789h.C40790a;
import com.p683ss.android.ugc.aweme.services.story.IAVStoryProxyService;
import com.p683ss.android.ugc.aweme.shortvideo.C42482c;
import com.p683ss.android.ugc.aweme.shortvideo.C43307ea;
import com.p683ss.android.ugc.aweme.shortvideo.ImportVideoInfo;
import com.p683ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import com.p683ss.android.ugc.aweme.shortvideo.cut.C42655m;
import com.p683ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import com.p683ss.android.ugc.aweme.shortvideo.cut.VECutVideoPresenter;
import com.p683ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.p683ss.android.ugc.aweme.shortvideo.cut.scene.C42820ax.C42826e;
import com.p683ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C43028e;
import com.p683ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C43036f;
import com.p683ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C43047h;
import com.p683ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C43051l;
import com.p683ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p2183c.C43023g;
import com.p683ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p2183c.C43024h;
import com.p683ss.android.ugc.aweme.shortvideo.cut.videoedit.C43120d;
import com.p683ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel;
import com.p683ss.android.ugc.aweme.shortvideo.cut.videoeditv2.VEVideoEditViewV2;
import com.p683ss.android.ugc.aweme.shortvideo.edit.C43757n;
import com.p683ss.android.ugc.aweme.shortvideo.edit.LivePublishModel;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45407ay;
import com.p683ss.android.ugc.aweme.shortvideo.view.C45547d;
import com.p683ss.android.ugc.aweme.themechange.base.C46788b;
import com.p683ss.android.ugc.aweme.utils.C47700ay;
import com.p683ss.android.ugc.aweme.utils.C47702b;
import com.p683ss.android.ugc.gamora.jedi.C49548a;
import com.p683ss.android.ugc.gamora.jedi.C49548a.C49549a;
import com.p683ss.android.ugc.gamora.jedi.C49555b;
import com.p683ss.android.ugc.gamora.jedi.C49562i;
import com.p683ss.android.ugc.gamora.p2458b.C48924a;
import com.p683ss.android.ugc.gamora.p2458b.C48927d;
import com.p683ss.android.ugc.p1235a.C20302a;
import com.p683ss.android.ugc.p1235a.C20310d;
import com.p683ss.android.ugc.tools.utils.C50200d;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import p064c.p065a.p069b.C1690c;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52857u;
import p2628d.C52860x;
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

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.ao */
public final class C42781ao extends C48924a implements C42655m, C42873bn, C49548a {

    /* renamed from: A */
    public static final C42782a f108180A = new C42782a(null);

    /* renamed from: o */
    static final /* synthetic */ C52767h[] f108181o = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C42781ao.class), "previewScene", "getPreviewScene()Lcom/ss/android/ugc/aweme/shortvideo/cut/scene/CutVideoPreviewScene;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C42781ao.class), "titleBarScene", "getTitleBarScene()Lcom/ss/android/ugc/aweme/shortvideo/cut/scene/CutVideoTitleBarScene;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C42781ao.class), "singleBottomScene", "getSingleBottomScene()Lcom/ss/android/ugc/aweme/shortvideo/cut/scene/CutVideoSingleBottomScene;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C42781ao.class), "multiBottomScene", "getMultiBottomScene()Lcom/ss/android/ugc/aweme/shortvideo/cut/scene/CutVideoMultiBottomScene;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C42781ao.class), "speedScene", "getSpeedScene()Lcom/ss/android/ugc/aweme/shortvideo/cut/scene/CutVideoSpeedScene;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C42781ao.class), "presenter", "getPresenter()Lcom/ss/android/ugc/aweme/shortvideo/cut/VECutVideoPresenter;"))};

    /* renamed from: z */
    public static long f108182z = -1;

    /* renamed from: B */
    private final C52668f f108183B = C52732g.m112285a(new C42792k(this));

    /* renamed from: C */
    private final C52668f f108184C = C52732g.m112285a(new C42795n(this));

    /* renamed from: D */
    private final C52668f f108185D = C52732g.m112285a(new C42793l(this));

    /* renamed from: E */
    private final C52668f f108186E = C52732g.m112285a(new C42790i(this));

    /* renamed from: F */
    private final C52668f f108187F = C52732g.m112285a(new C42794m(this));

    /* renamed from: G */
    private final C52668f f108188G = C52732g.m112285a(new C42791j(this));

    /* renamed from: H */
    private CutMultiVideoViewModel f108189H;

    /* renamed from: I */
    private long f108190I = C43307ea.m94995a();

    /* renamed from: J */
    private final int f108191J = 3600000;

    /* renamed from: p */
    public CutVideoViewModel f108192p;

    /* renamed from: q */
    public VideoEditViewModel f108193q;

    /* renamed from: r */
    public CutVideoTitleBarViewModel f108194r;

    /* renamed from: s */
    CutVideoBottomBarViewModel f108195s;

    /* renamed from: t */
    CutVideoListViewModel f108196t;

    /* renamed from: u */
    CutVideoEditViewModel f108197u;

    /* renamed from: v */
    public CutVideoPreviewViewModel f108198v;

    /* renamed from: w */
    public long f108199w;

    /* renamed from: x */
    public final ArrayList<ImportVideoInfo> f108200x = new ArrayList<>();

    /* renamed from: y */
    public boolean f108201y;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.ao$a */
    public static final class C42782a {
        private C42782a() {
        }

        public /* synthetic */ C42782a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.ao$b */
    static final class C42783b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C42781ao f108202a;

        C42783b(C42781ao aoVar) {
            this.f108202a = aoVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f108202a.mo87241N();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.ao$c */
    static final class C42784c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C42781ao f108203a;

        C42784c(C42781ao aoVar) {
            this.f108203a = aoVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            if (this.f108203a.mo87245R() instanceof VEVideoEditViewV2) {
                VECutVideoPresenter L = this.f108203a.mo87239L();
                C0794k playBoundary = this.f108203a.mo87245R().getPlayBoundary();
                C52711k.m112236a((Object) playBoundary, "getVideoEditView().playBoundary");
                L.mo86813a(playBoundary);
            }
            this.f108203a.mo87248b(false);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.ao$d */
    public static final class C42785d implements C42837b {

        /* renamed from: a */
        public C45547d f108204a;

        /* renamed from: b */
        final /* synthetic */ C42781ao f108205b;

        /* renamed from: c */
        final /* synthetic */ boolean f108206c;

        /* renamed from: d */
        final /* synthetic */ C17429o f108207d;

        /* JADX WARNING: Removed duplicated region for block: B:18:0x005c  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x006d  */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x007a  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onCompileDone() {
            /*
                r11 = this;
                com.ss.android.ugc.aweme.shortvideo.cut.scene.ao r0 = r11.f108205b
                com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoTitleBarViewModel r0 = com.p683ss.android.ugc.aweme.shortvideo.cut.scene.C42781ao.m93846b(r0)
                r1 = 1
                r0.mo87173d(r1)
                com.ss.android.ugc.aweme.shortvideo.view.d r0 = r11.f108204a
                android.app.Dialog r0 = (android.app.Dialog) r0
                com.p683ss.android.ugc.aweme.utils.C47700ay.m103236b(r0)
                com.ss.android.ugc.aweme.shortvideo.cut.scene.ao r0 = r11.f108205b
                com.ss.android.ugc.aweme.shortvideo.cut.scene.ao r2 = r11.f108205b
                boolean r2 = r2.f108201y
                boolean r3 = r11.f108206c
                com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoViewModel r4 = r0.f108192p
                if (r4 != 0) goto L_0x0022
                java.lang.String r5 = "cutVideoViewModel"
                p2628d.p2639f.p2641b.C52711k.m112237a(r5)
            L_0x0022:
                com.ss.android.ugc.aweme.shortvideo.cut.scene.ad r4 = r4.mo87177f()
                boolean r5 = r4.f108072o
                r6 = -1
                r7 = 0
                r8 = 0
                if (r5 == 0) goto L_0x0098
                android.app.Activity r2 = r0.f33840g_
                if (r2 == 0) goto L_0x02f4
                com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoViewModel r3 = r0.f108192p
                if (r3 != 0) goto L_0x003a
                java.lang.String r4 = "cutVideoViewModel"
                p2628d.p2639f.p2641b.C52711k.m112237a(r4)
            L_0x003a:
                com.ss.android.ugc.aweme.shortvideo.cut.scene.ad r3 = r3.mo87177f()
                com.ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace r3 = r3.f108068k
                android.content.Intent r4 = new android.content.Intent
                r4.<init>()
                java.lang.String r5 = "videoPath"
                if (r3 == 0) goto L_0x0054
                java.io.File r9 = r3.mo86469p()
                if (r9 == 0) goto L_0x0054
                java.lang.String r9 = r9.getPath()
                goto L_0x0055
            L_0x0054:
                r9 = r7
            L_0x0055:
                r4.putExtra(r5, r9)
                java.lang.String r5 = "audioPath"
                if (r3 == 0) goto L_0x0066
                java.io.File r3 = r3.mo86470q()
                if (r3 == 0) goto L_0x0066
                java.lang.String r7 = r3.getPath()
            L_0x0066:
                r4.putExtra(r5, r7)
                com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel r3 = r0.f108193q
                if (r3 != 0) goto L_0x0072
                java.lang.String r5 = "videoEditViewModel"
                p2628d.p2639f.p2641b.C52711k.m112237a(r5)
            L_0x0072:
                java.util.List r3 = r3.mo87634l()
                com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoListViewModel r0 = r0.f108196t
                if (r0 != 0) goto L_0x007f
                java.lang.String r5 = "videoListViewModel"
                p2628d.p2639f.p2641b.C52711k.m112237a(r5)
            L_0x007f:
                int r0 = r0.f108002f
                java.lang.Object r0 = r3.get(r0)
                com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment r0 = (com.p683ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment) r0
                java.lang.String r3 = "videoOriginPath"
                java.lang.String r0 = r0.mo86941a(r8)
                r4.putExtra(r3, r0)
                r2.setResult(r6, r4)
                r2.finish()
                goto L_0x02f4
            L_0x0098:
                android.app.Activity r5 = r0.mo24477v()
                java.lang.String r9 = "requireActivity()"
                p2628d.p2639f.p2641b.C52711k.m112236a(r5, r9)
                android.content.Intent r5 = r5.getIntent()
                android.content.Intent r2 = r0.mo87246a(r5, r2, r4)
                if (r3 != 0) goto L_0x0245
                boolean r3 = r0.mo87240M()
                if (r3 == 0) goto L_0x0245
                java.lang.String r3 = "draft_to_cut_model"
                java.io.Serializable r3 = r5.getSerializableExtra(r3)
                if (r3 == 0) goto L_0x023d
                com.ss.android.ugc.aweme.shortvideo.cut.e r3 = (com.p683ss.android.ugc.aweme.shortvideo.cut.C42628e) r3
                java.lang.String r4 = "video_title"
                java.lang.String r5 = r3.getTitle()
                r2.putExtra(r4, r5)
                java.lang.String r4 = "struct_list"
                java.util.List r5 = r3.getStructList()
                java.io.Serializable r5 = (java.io.Serializable) r5
                r2.putExtra(r4, r5)
                java.lang.String r4 = "is_rivate"
                int r5 = r3.isPrivate()
                r2.putExtra(r4, r5)
                java.lang.String r4 = "poi_struct_in_tools_line"
                java.lang.String r5 = r3.getPoiId()
                r2.putExtra(r4, r5)
                java.lang.String r4 = "challenge"
                java.util.List r5 = r3.getChallenges()
                java.io.Serializable r5 = (java.io.Serializable) r5
                r2.putExtra(r4, r5)
                java.lang.String r4 = "default_select_sticker_poi"
                com.ss.android.ugc.aweme.draft.model.e r5 = r3.getDefaultSelectStickerPoi()
                java.io.Serializable r5 = (java.io.Serializable) r5
                r2.putExtra(r4, r5)
                java.lang.String r4 = "videoCoverStartTm"
                r2.putExtra(r4, r8)
                java.lang.String r4 = "sticker_challenge"
                com.ss.android.ugc.aweme.infosticker.StickerChallenge r5 = r3.getStickerChallenge()
                android.os.Parcelable r5 = (android.os.Parcelable) r5
                r2.putExtra(r4, r5)
                java.lang.String r4 = "comment_setting"
                int r5 = r3.getCommentSetting()
                r2.putExtra(r4, r5)
                java.lang.String r4 = "commerce_data"
                java.lang.String r5 = r3.getCommerceData()
                r2.putExtra(r4, r5)
                java.lang.String r4 = "download_setting"
                int r5 = r3.getAllowDownloadSetting()
                r2.putExtra(r4, r5)
                java.lang.String r4 = "video_category"
                com.ss.android.ugc.aweme.draft.model.VideoCategoryParam r3 = r3.getVideoCategory()
                android.os.Parcelable r3 = (android.os.Parcelable) r3
                r2.putExtra(r4, r3)
                com.ss.android.ugc.aweme.shortvideo.edit.bb r3 = new com.ss.android.ugc.aweme.shortvideo.edit.bb
                java.lang.String r4 = "CutVideoRootScene"
                r3.<init>(r4)
                com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r4 = r3.mo88378a(r2)
                com.ss.android.ugc.aweme.port.in.u r5 = com.p683ss.android.ugc.aweme.port.p2082in.C39629l.m88232a()
                com.ss.android.ugc.aweme.port.internal.c r5 = r5.mo58573d()
                int r5 = r5.mo80733b()
                r4.setNewVersion(r5)
                java.lang.String r5 = "extra_edit_preview_info"
                android.os.Parcelable r2 = r2.getParcelableExtra(r5)
                com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo r2 = (com.p683ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo) r2
                if (r2 == 0) goto L_0x020f
                java.util.List r5 = r2.getVideoList()
                java.lang.Object r5 = r5.get(r8)
                com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment r5 = (com.p683ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment) r5
                com.ss.android.ugc.aweme.shortvideo.edit.model.VideoFileInfo r5 = r5.getVideoFileInfo()
                int r5 = r5.getHeight()
                r4.mOutVideoHeight = r5
                java.util.List r5 = r2.getVideoList()
                java.lang.Object r5 = r5.get(r8)
                com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment r5 = (com.p683ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment) r5
                com.ss.android.ugc.aweme.shortvideo.edit.model.VideoFileInfo r5 = r5.getVideoFileInfo()
                int r5 = r5.getWidth()
                r4.mOutVideoWidth = r5
                int r5 = r4.mOutVideoHeight
                r4.mVideoCanvasHeight = r5
                int r5 = r4.mOutVideoWidth
                r4.mVideoCanvasWidth = r5
                java.util.List r5 = r2.getVideoList()
                java.lang.Object r5 = r5.get(r8)
                com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment r5 = (com.p683ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment) r5
                com.ss.android.ugc.aweme.shortvideo.edit.model.VideoCutInfo r5 = r5.getVideoCutInfo()
                if (r5 == 0) goto L_0x020f
                java.lang.String r5 = "editModel"
                p2628d.p2639f.p2641b.C52711k.m112236a(r4, r5)
                java.util.List r5 = r2.getVideoList()
                java.lang.Object r5 = r5.get(r8)
                com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment r5 = (com.p683ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment) r5
                com.ss.android.ugc.aweme.shortvideo.edit.model.VideoCutInfo r5 = r5.getVideoCutInfo()
                if (r5 != 0) goto L_0x01a9
                p2628d.p2639f.p2641b.C52711k.m112234a()
            L_0x01a9:
                long r5 = r5.getEnd()
                java.util.List r7 = r2.getVideoList()
                java.lang.Object r7 = r7.get(r8)
                com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment r7 = (com.p683ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment) r7
                com.ss.android.ugc.aweme.shortvideo.edit.model.VideoCutInfo r7 = r7.getVideoCutInfo()
                if (r7 != 0) goto L_0x01c0
                p2628d.p2639f.p2641b.C52711k.m112234a()
            L_0x01c0:
                long r9 = r7.getStart()
                long r5 = r5 - r9
                float r5 = (float) r5
                java.util.List r6 = r2.getVideoList()
                java.lang.Object r6 = r6.get(r8)
                com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment r6 = (com.p683ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment) r6
                com.ss.android.ugc.aweme.shortvideo.edit.model.VideoCutInfo r6 = r6.getVideoCutInfo()
                if (r6 != 0) goto L_0x01d9
                p2628d.p2639f.p2641b.C52711k.m112234a()
            L_0x01d9:
                float r6 = r6.getSpeed()
                float r5 = r5 / r6
                int r5 = (int) r5
                r4.setVideoLength(r5)
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                java.lang.String r6 = "previewVideoLength: "
                r5.<init>(r6)
                int r6 = r4.getVideoLength()
                r5.append(r6)
                java.lang.String r6 = ",speed="
                r5.append(r6)
                java.util.List r2 = r2.getVideoList()
                java.lang.Object r2 = r2.get(r8)
                com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment r2 = (com.p683ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment) r2
                com.ss.android.ugc.aweme.shortvideo.edit.model.VideoCutInfo r2 = r2.getVideoCutInfo()
                if (r2 != 0) goto L_0x0208
                p2628d.p2639f.p2641b.C52711k.m112234a()
            L_0x0208:
                float r2 = r2.getSpeed()
                r5.append(r2)
            L_0x020f:
                com.ss.android.ugc.aweme.draft.model.c r2 = r3.mo88377a(r4)
                java.lang.String r3 = "draft"
                p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)
                long r3 = java.lang.System.currentTimeMillis()
                r2.f76129G = r3
                com.ss.android.ugc.aweme.port.in.u r3 = com.p683ss.android.ugc.aweme.port.p2082in.C39629l.m88232a()
                com.ss.android.ugc.aweme.port.internal.c r3 = r3.mo58573d()
                r3.mo80730a(r2)
                com.ss.android.ugc.aweme.port.in.u r3 = com.p683ss.android.ugc.aweme.port.p2082in.C39629l.m88232a()
                com.ss.android.ugc.aweme.port.internal.c r3 = r3.mo58573d()
                r3.mo80732a(r2, r8)
                r2 = -1
                com.p683ss.android.ugc.aweme.shortvideo.cut.scene.C42781ao.f108182z = r2
                r0.mo87241N()
                goto L_0x02f4
            L_0x023d:
                d.u r0 = new d.u
                java.lang.String r1 = "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.cut.DraftToCutModel"
                r0.<init>(r1)
                throw r0
            L_0x0245:
                com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoViewModel r3 = r0.f108192p
                if (r3 != 0) goto L_0x024e
                java.lang.String r4 = "cutVideoViewModel"
                p2628d.p2639f.p2641b.C52711k.m112237a(r4)
            L_0x024e:
                boolean r3 = r3.mo87180i()
                if (r3 != 0) goto L_0x02b3
                if (r5 == 0) goto L_0x025d
                java.lang.String r3 = "enter_from"
                java.lang.String r3 = r5.getStringExtra(r3)
                goto L_0x025e
            L_0x025d:
                r3 = r7
            L_0x025e:
                java.lang.CharSequence r3 = (java.lang.CharSequence) r3
                java.lang.String r4 = "from_chat"
                java.lang.CharSequence r4 = (java.lang.CharSequence) r4
                boolean r3 = android.text.TextUtils.equals(r3, r4)
                if (r3 == 0) goto L_0x026b
                goto L_0x02b3
            L_0x026b:
                com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoViewModel r3 = r0.f108192p
                if (r3 != 0) goto L_0x0274
                java.lang.String r4 = "cutVideoViewModel"
                p2628d.p2639f.p2641b.C52711k.m112237a(r4)
            L_0x0274:
                boolean r3 = r3.mo87186o()
                if (r3 == 0) goto L_0x0289
                java.lang.String r3 = "extra_request_code"
                r4 = 8
                r2.putExtra(r3, r4)
                android.app.Activity r0 = r0.mo24477v()
                com.p683ss.android.ugc.aweme.shortvideo.edit.VEVideoPublishEditActivity.m95010a(r0, r2, r1)
                goto L_0x02f4
            L_0x0289:
                java.lang.String r3 = "shoot_mode"
                int r3 = r2.getIntExtra(r3, r6)
                boolean r3 = com.p683ss.android.ugc.aweme.story.shootvideo.C46668c.m101263a(r3)
                if (r3 == 0) goto L_0x02a9
                com.ss.android.ugc.aweme.services.story.IAVStoryProxyService r3 = com.p683ss.android.ugc.aweme.shortvideo.cut.scene.C42781ao.m93839S()
                if (r3 == 0) goto L_0x02f4
                com.ss.android.ugc.aweme.services.story.IAVStoryProxyService r3 = com.p683ss.android.ugc.aweme.shortvideo.cut.scene.C42781ao.m93839S()
                com.ss.android.ugc.aweme.services.story.IAVStoryProxyService r3 = (com.p683ss.android.ugc.aweme.services.story.IAVStoryProxyService) r3
                android.app.Activity r0 = r0.mo24477v()
                r3.startStoryEditActivity(r0, r2)
                goto L_0x02f4
            L_0x02a9:
                android.app.Activity r0 = r0.mo24477v()
                android.content.Context r0 = (android.content.Context) r0
                com.p683ss.android.ugc.aweme.shortvideo.edit.VEVideoPublishEditActivity.m95011a(r0, r2, r1)
                goto L_0x02f4
            L_0x02b3:
                if (r5 == 0) goto L_0x02bb
                java.lang.String r3 = "enter_from"
                java.lang.String r7 = r5.getStringExtra(r3)
            L_0x02bb:
                java.lang.CharSequence r7 = (java.lang.CharSequence) r7
                java.lang.String r3 = "from_chat"
                java.lang.CharSequence r3 = (java.lang.CharSequence) r3
                boolean r3 = android.text.TextUtils.equals(r7, r3)
                if (r3 == 0) goto L_0x02cd
                java.lang.String r3 = "extra_request_code"
                r4 = 4
                r2.putExtra(r3, r4)
            L_0x02cd:
                java.lang.String r3 = "shoot_mode"
                int r3 = r2.getIntExtra(r3, r6)
                boolean r3 = com.p683ss.android.ugc.aweme.story.shootvideo.C46668c.m101263a(r3)
                if (r3 == 0) goto L_0x02ed
                com.ss.android.ugc.aweme.services.story.IAVStoryProxyService r3 = com.p683ss.android.ugc.aweme.shortvideo.cut.scene.C42781ao.m93839S()
                if (r3 == 0) goto L_0x02f4
                com.ss.android.ugc.aweme.services.story.IAVStoryProxyService r3 = com.p683ss.android.ugc.aweme.shortvideo.cut.scene.C42781ao.m93839S()
                com.ss.android.ugc.aweme.services.story.IAVStoryProxyService r3 = (com.p683ss.android.ugc.aweme.services.story.IAVStoryProxyService) r3
                android.app.Activity r0 = r0.mo24477v()
                r3.startStoryEditActivity(r0, r2)
                goto L_0x02f4
            L_0x02ed:
                android.app.Activity r0 = r0.mo24477v()
                com.p683ss.android.ugc.aweme.shortvideo.edit.VEVideoPublishEditActivity.m95010a(r0, r2, r1)
            L_0x02f4:
                com.google.b.a.o r0 = r11.f108207d
                java.lang.String r2 = "stopwatch"
                p2628d.p2639f.p2641b.C52711k.m112236a(r0, r2)
                boolean r0 = r0.f48964a
                if (r0 == 0) goto L_0x0341
                com.google.b.a.o r0 = r11.f108207d
                r0.mo33756d()
                java.util.Locale r0 = java.util.Locale.US
                java.lang.String r2 = "Locale.US"
                p2628d.p2639f.p2641b.C52711k.m112236a(r0, r2)
                java.lang.String r2 = "%d"
                java.lang.Object[] r3 = new java.lang.Object[r1]
                com.google.b.a.o r4 = r11.f108207d
                java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.MILLISECONDS
                long r4 = r4.mo33754a(r5)
                java.lang.Long r4 = java.lang.Long.valueOf(r4)
                r3[r8] = r4
                java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r1)
                java.lang.String r0 = com.C2240a.m6773a(r0, r2, r3)
                java.lang.String r2 = "java.lang.String.format(locale, format, *args)"
                p2628d.p2639f.p2641b.C52711k.m112236a(r0, r2)
                java.lang.String r2 = "import_transcoding_end"
                com.ss.android.ugc.aweme.app.f.d r3 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
                java.lang.String r4 = "status"
                com.ss.android.ugc.aweme.app.f.d r1 = r3.mo47826a(r4, r1)
                java.lang.String r3 = "duration"
                com.ss.android.ugc.aweme.app.f.d r0 = r1.mo47829a(r3, r0)
                java.util.Map<java.lang.String, java.lang.String> r0 = r0.f61491a
                com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r2, r0)
            L_0x0341:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.cut.scene.C42781ao.C42785d.onCompileDone():void");
        }

        public final void onCompileProgress(float f) {
            C45547d dVar = this.f108204a;
            if (dVar != null) {
                if (!dVar.isShowing()) {
                    dVar = null;
                }
                if (dVar != null) {
                    dVar.setProgress((int) (f * 100.0f));
                }
            }
        }

        /* renamed from: a */
        public final void mo86846a(boolean z) {
            this.f108205b.f108201y = z;
            if (!z) {
                this.f108204a = C45547d.m99208b(this.f108205b.f33840g_, this.f108205b.mo24478w().getString(R.string.dj9));
                C45547d dVar = this.f108204a;
                if (dVar != null) {
                    dVar.setIndeterminate(false);
                }
            }
        }

        C42785d(C42781ao aoVar, boolean z, C17429o oVar) {
            this.f108205b = aoVar;
            this.f108206c = z;
            this.f108207d = oVar;
        }

        public final void onCompileError(int i, int i2, float f, String str) {
            C42781ao.m93846b(this.f108205b).mo87173d(true);
            C47700ay.m103236b(this.f108204a);
            Context context = this.f108205b.f33840g_;
            StringBuilder sb = new StringBuilder("合成失败 ");
            sb.append(i);
            C10691a.m21545b(context, sb.toString()).mo19066a();
            if (!this.f108206c && this.f108205b.mo87240M()) {
                C42781ao.f108182z = -1;
                this.f108205b.mo87241N();
            }
            C26890h.m65011a("import_transcoding_end", C23089d.m56640a().mo47826a("status", 0).f61491a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.ao$e */
    static final class C42786e extends C52712l implements C52682m<C49548a, C52860x, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C42781ao f108208a;

        C42786e(C42781ao aoVar) {
            this.f108208a = aoVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            C52860x xVar = (C52860x) obj2;
            C52711k.m112240b((C49548a) obj, "$receiver");
            C52711k.m112240b(xVar, "it");
            C42781ao aoVar = this.f108208a;
            if (aoVar.mo87240M()) {
                new C10643a(aoVar.mo86847a()).mo18899b((int) R.string.oo).mo18903b(aoVar.mo24461a((int) R.string.wf), (OnClickListener) new C42783b(aoVar)).mo18893a(aoVar.mo24461a((int) R.string.vo), (OnClickListener) new C42784c(aoVar)).mo18897a().mo18882b();
            } else {
                CutVideoViewModel cutVideoViewModel = aoVar.f108192p;
                if (cutVideoViewModel == null) {
                    C52711k.m112237a("cutVideoViewModel");
                }
                C26916m mVar = cutVideoViewModel.mo87177f().f108069l;
                if (C39630m.m88234a().mo58610h().mo74172a(mVar)) {
                    C39630m.m88234a().mo58610h().mo74169a(aoVar.f33840g_, mVar, "Sharing canceled", 20013);
                }
                aoVar.mo87241N();
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.ao$f */
    static final class C42787f extends C52712l implements C52682m<C49548a, C52860x, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C42781ao f108209a;

        C42787f(C42781ao aoVar) {
            this.f108209a = aoVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i;
            String str;
            int i2;
            String str2;
            C52860x xVar = (C52860x) obj2;
            C52711k.m112240b((C49548a) obj, "$receiver");
            C52711k.m112240b(xVar, "it");
            CutVideoViewModel cutVideoViewModel = this.f108209a.f108192p;
            if (cutVideoViewModel == null) {
                C52711k.m112237a("cutVideoViewModel");
            }
            long j = 0;
            if (cutVideoViewModel.mo87178g()) {
                C42735ae K = this.f108209a.mo87238K();
                C42820ax axVar = K.f108097p;
                if (axVar != null) {
                    axVar.mo87273i();
                }
                C42820ax axVar2 = K.f108097p;
                if (axVar2 != null) {
                    C43047h hVar = C43047h.f108667g;
                    C42482c h = axVar2.mo87272h();
                    List<VideoSegment> c = axVar2.mo87267c();
                    boolean z = axVar2.f108266j;
                    boolean f = axVar2.mo87270f();
                    String str3 = axVar2.f108265i;
                    C52711k.m112240b(str3, "musicFrom");
                    if (h != null && !C9190h.m18253a(c)) {
                        if (c == null) {
                            C52711k.m112234a();
                        }
                        int i3 = 0;
                        for (VideoSegment videoSegment : c) {
                            j += videoSegment.f107904c;
                            if (videoSegment.mo86944a()) {
                                i3++;
                            }
                        }
                        String str4 = "edit_upload_next";
                        C23089d a = C43047h.m94328a().mo47829a("music_id", h.getMusicId()).mo47829a("music_selected_from", str3);
                        String str5 = "sync_mode";
                        if (f) {
                            str = "sync_on";
                        } else {
                            str = "sync_off";
                        }
                        C23089d a2 = a.mo47829a(str5, str).mo47827a("content_duration_ms", j).mo47826a("video_cnt", c.size() - i3).mo47826a("pic_cnt", i3);
                        String str6 = "is_multi_content";
                        if (c.size() > 1) {
                            i2 = 1;
                        } else {
                            i2 = 0;
                        }
                        C23089d a3 = a2.mo47826a(str6, i2);
                        String str7 = "smart_sync";
                        if (z) {
                            str2 = "on";
                        } else {
                            str2 = "off";
                        }
                        C26890h.m65011a(str4, a3.mo47829a(str7, str2).f61491a);
                    }
                    axVar2.mo87273i();
                }
            } else {
                C43047h hVar2 = C43047h.f108667g;
                List<VideoSegment> l = C42781ao.m93845a(this.f108209a).mo87634l();
                if (!C9190h.m18253a(l)) {
                    if (l == null) {
                        C52711k.m112234a();
                    }
                    int i4 = 0;
                    for (VideoSegment videoSegment2 : l) {
                        j += videoSegment2.f107904c;
                        if (videoSegment2.mo86944a()) {
                            i4++;
                        }
                    }
                    String str8 = "edit_upload_next";
                    C23089d a4 = C43047h.m94328a().mo47827a("content_duration_ms", j).mo47826a("video_cnt", l.size() - i4).mo47826a("pic_cnt", i4);
                    String str9 = "is_multi_content";
                    if (l.size() > 1) {
                        i = 1;
                    } else {
                        i = 0;
                    }
                    C26890h.m65011a(str8, a4.mo47826a(str9, i).f61491a);
                }
            }
            C42781ao.m93846b(this.f108209a).mo87173d(false);
            this.f108209a.f108199w = System.currentTimeMillis();
            if (this.f108209a.mo87245R() instanceof VEVideoEditViewV2) {
                VECutVideoPresenter L = this.f108209a.mo87239L();
                C0794k playBoundary = this.f108209a.mo87245R().getPlayBoundary();
                C52711k.m112236a((Object) playBoundary, "getVideoEditView().playBoundary");
                L.mo86813a(playBoundary);
            }
            this.f108209a.mo87248b(true);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.ao$g */
    static final class C42788g<T> implements C0199s<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C42781ao f108210a;

        C42788g(C42781ao aoVar) {
            this.f108210a = aoVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            if (bool != null) {
                C42781ao aoVar = this.f108210a;
                C52711k.m112236a((Object) bool, "it");
                boolean booleanValue = bool.booleanValue();
                CutVideoEditViewModel cutVideoEditViewModel = aoVar.f108197u;
                if (cutVideoEditViewModel == null) {
                    C52711k.m112237a("cutVideoEditViewModel");
                }
                cutVideoEditViewModel.mo87038a(!booleanValue);
                CutVideoTitleBarViewModel cutVideoTitleBarViewModel = aoVar.f108194r;
                if (cutVideoTitleBarViewModel == null) {
                    C52711k.m112237a("titleBarViewModel");
                }
                cutVideoTitleBarViewModel.mo87173d(!booleanValue);
                CutVideoTitleBarViewModel cutVideoTitleBarViewModel2 = aoVar.f108194r;
                if (cutVideoTitleBarViewModel2 == null) {
                    C52711k.m112237a("titleBarViewModel");
                }
                cutVideoTitleBarViewModel2.mo87172c(!booleanValue);
                CutVideoPreviewViewModel cutVideoPreviewViewModel = aoVar.f108198v;
                if (cutVideoPreviewViewModel == null) {
                    C52711k.m112237a("previewViewModel");
                }
                cutVideoPreviewViewModel.mo87113a(!booleanValue);
                CutVideoBottomBarViewModel cutVideoBottomBarViewModel = aoVar.f108195s;
                if (cutVideoBottomBarViewModel == null) {
                    C52711k.m112237a("bottomBarViewModel");
                }
                cutVideoBottomBarViewModel.mo22530c(new C42680e(!booleanValue));
                CutVideoBottomBarViewModel cutVideoBottomBarViewModel2 = aoVar.f108195s;
                if (cutVideoBottomBarViewModel2 == null) {
                    C52711k.m112237a("bottomBarViewModel");
                }
                cutVideoBottomBarViewModel2.mo22530c(new C42683h(!booleanValue));
                CutVideoViewModel cutVideoViewModel = aoVar.f108192p;
                if (cutVideoViewModel == null) {
                    C52711k.m112237a("cutVideoViewModel");
                }
                if (cutVideoViewModel.mo87178g()) {
                    aoVar.mo87238K().mo87195N().f108484X = booleanValue;
                    CutVideoBottomBarViewModel cutVideoBottomBarViewModel3 = aoVar.f108195s;
                    if (cutVideoBottomBarViewModel3 == null) {
                        C52711k.m112237a("bottomBarViewModel");
                    }
                    cutVideoBottomBarViewModel3.mo22530c(new C42678c(!booleanValue));
                    CutVideoListViewModel cutVideoListViewModel = aoVar.f108196t;
                    if (cutVideoListViewModel == null) {
                        C52711k.m112237a("videoListViewModel");
                    }
                    cutVideoListViewModel.mo22530c(new C42697f(!booleanValue));
                    CutVideoListViewModel cutVideoListViewModel2 = aoVar.f108196t;
                    if (cutVideoListViewModel2 == null) {
                        C52711k.m112237a("videoListViewModel");
                    }
                    cutVideoListViewModel2.mo22530c(new C42698g(!booleanValue));
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.ao$h */
    static final class C42789h<V> implements Callable<TResult> {

        /* renamed from: a */
        final /* synthetic */ C42781ao f108211a;

        C42789h(C42781ao aoVar) {
            this.f108211a = aoVar;
        }

        public final /* synthetic */ Object call() {
            C42789h hVar = this;
            List<VideoSegment> l = C42781ao.m93845a(hVar.f108211a).mo87634l();
            if (l == null) {
                return null;
            }
            for (VideoSegment videoSegment : l) {
                ArrayList<ImportVideoInfo> arrayList = hVar.f108211a.f108200x;
                int i = videoSegment.f107908g;
                int i2 = videoSegment.f107909h;
                C52711k.m112236a((Object) videoSegment, "segment");
                ImportVideoInfo importVideoInfo = r4;
                ImportVideoInfo importVideoInfo2 = new ImportVideoInfo(i, i2, videoSegment.mo86948d(), videoSegment.mo86947c(), videoSegment.mo86950e(), videoSegment.f107904c, videoSegment.mo86953g() - videoSegment.mo86952f(), videoSegment.f107925x, videoSegment.f107926y);
                arrayList.add(importVideoInfo);
                hVar = this;
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.ao$i */
    static final class C42790i extends C52712l implements C52670a<C42735ae> {

        /* renamed from: a */
        final /* synthetic */ C42781ao f108212a;

        C42790i(C42781ao aoVar) {
            this.f108212a = aoVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C42735ae aeVar = new C42735ae();
            VECutVideoPresenter L = this.f108212a.mo87239L();
            C52711k.m112240b(L, "<set-?>");
            aeVar.f108098q = L;
            C42873bn bnVar = this.f108212a;
            C52711k.m112240b(bnVar, "<set-?>");
            aeVar.f108099r = bnVar;
            this.f108212a.mo24389a((int) R.id.e4f, (C12924i) aeVar, "CutVideoMultiBottomScene");
            return aeVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.ao$j */
    static final class C42791j extends C52712l implements C52670a<VECutVideoPresenter> {

        /* renamed from: a */
        final /* synthetic */ C42781ao f108213a;

        C42791j(C42781ao aoVar) {
            this.f108213a = aoVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            String b = Workspace.m93095b();
            C52711k.m112236a((Object) b, "Workspace.getImportDir()");
            VECutVideoPresenter vECutVideoPresenter = new VECutVideoPresenter(b, this.f108213a, false, 4, null);
            return vECutVideoPresenter;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.ao$k */
    static final class C42792k extends C52712l implements C52670a<C42762ai> {

        /* renamed from: a */
        final /* synthetic */ C42781ao f108214a;

        C42792k(C42781ao aoVar) {
            this.f108214a = aoVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C42762ai aiVar = new C42762ai();
            aiVar.mo87233a(this.f108214a.mo87239L());
            this.f108214a.mo24389a((int) R.id.e4f, (C12924i) aiVar, "CutVideoPreviewScene");
            return aiVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.ao$l */
    static final class C42793l extends C52712l implements C52670a<C42798ar> {

        /* renamed from: a */
        final /* synthetic */ C42781ao f108215a;

        C42793l(C42781ao aoVar) {
            this.f108215a = aoVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C42798ar arVar = new C42798ar();
            VECutVideoPresenter L = this.f108215a.mo87239L();
            C52711k.m112240b(L, "<set-?>");
            arVar.f108222p = L;
            C42873bn bnVar = this.f108215a;
            C52711k.m112240b(bnVar, "<set-?>");
            arVar.f108223q = bnVar;
            this.f108215a.mo24389a((int) R.id.e4f, (C12924i) arVar, "CutVideoSingleBottomScene");
            return arVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.ao$m */
    static final class C42794m extends C52712l implements C52670a<C42810at> {

        /* renamed from: a */
        final /* synthetic */ C42781ao f108216a;

        C42794m(C42781ao aoVar) {
            this.f108216a = aoVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C42810at atVar = new C42810at();
            C42873bn bnVar = this.f108216a;
            C52711k.m112240b(bnVar, "<set-?>");
            atVar.f108242i = bnVar;
            this.f108216a.mo24389a((int) R.id.e4f, (C12924i) atVar, "CutVideoSpeedScene");
            return atVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.ao$n */
    static final class C42795n extends C52712l implements C52670a<C42858bh> {

        /* renamed from: a */
        final /* synthetic */ C42781ao f108217a;

        C42795n(C42781ao aoVar) {
            this.f108217a = aoVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C42858bh bhVar = new C42858bh();
            this.f108217a.mo24389a((int) R.id.e4f, (C12924i) bhVar, "CutVideoTitleBarScene");
            return bhVar;
        }
    }

    /* renamed from: T */
    private final C42762ai m93840T() {
        return (C42762ai) this.f108183B.getValue();
    }

    /* renamed from: U */
    private final C42810at m93841U() {
        return (C42810at) this.f108187F.getValue();
    }

    /* renamed from: J */
    public final C42798ar mo87237J() {
        return (C42798ar) this.f108185D.getValue();
    }

    /* renamed from: K */
    public final C42735ae mo87238K() {
        return (C42735ae) this.f108186E.getValue();
    }

    /* renamed from: L */
    public final VECutVideoPresenter mo87239L() {
        return (VECutVideoPresenter) this.f108188G.getValue();
    }

    public final C0184k bP_() {
        return this;
    }

    public final void bS_() {
        m93842V();
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
            JediViewModel a = C48927d.m105736a((FragmentActivity) activity).mo96760a(CutVideoViewModel.class);
            C52711k.m112236a((Object) a, "JediViewModelProviders.o…deoViewModel::class.java)");
            this.f108192p = (CutVideoViewModel) a;
            mo24409d((C12924i) m93840T());
            mo24409d((C12924i) (C42858bh) this.f108184C.getValue());
            CutVideoViewModel cutVideoViewModel = this.f108192p;
            if (cutVideoViewModel == null) {
                C52711k.m112237a("cutVideoViewModel");
            }
            if (cutVideoViewModel.mo87178g()) {
                mo24409d((C12924i) mo87238K());
                mo24409d((C12924i) m93841U());
                mo87239L().f107693g = C46788b.f118235d.mo94007a(true, false, false, false, false);
                return;
            }
            mo24409d((C12924i) mo87237J());
            mo24409d((C12924i) m93841U());
            return;
        }
        throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
    }

    /* renamed from: a */
    public final void mo86848a(C20347c cVar) {
        CutVideoViewModel cutVideoViewModel = this.f108192p;
        if (cutVideoViewModel == null) {
            C52711k.m112237a("cutVideoViewModel");
        }
        if (cutVideoViewModel.mo87178g()) {
            C42735ae K = mo87238K();
            C42820ax axVar = K.f108097p;
            if (axVar != null) {
                axVar.f108259c.f108673a = cVar;
                axVar.f108262f.f108618a = cVar;
                C43028e eVar = axVar.f108262f;
                axVar.mo87264b();
                C42875bp bpVar = axVar.f108258b;
                if (bpVar == null) {
                    C52711k.m112237a("stickPointVideoSegController");
                }
                bpVar.mo87323b(axVar.mo87270f());
                C43024h hVar = axVar.f108261e;
                if (hVar != null) {
                    hVar.mo87215a(axVar.mo87270f(), false);
                }
                axVar.f108259c.mo87431a((C43023g) new C42826e(axVar), false);
                if (C43036f.m94313g()) {
                    C43047h.f108667g.mo87424a(axVar.mo87267c());
                } else {
                    C43047h.f108667g.mo87427b(axVar.mo87267c());
                }
            }
            CutVideoPreviewViewModel cutVideoPreviewViewModel = K.f108103v;
            if (cutVideoPreviewViewModel == null) {
                C52711k.m112237a("previewViewModel");
            }
            cutVideoPreviewViewModel.mo87114e();
        }
    }

    /* renamed from: a */
    public final void mo87247a(C42874bo boVar) {
        C52711k.m112240b(boVar, "controller");
        m93840T().f108146i = boVar;
    }

    public final void bX_() {
        mo87245R().mo87554b();
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

    /* renamed from: O */
    public final int mo87242O() {
        return m93840T().mo87230H();
    }

    /* renamed from: P */
    public final int mo87243P() {
        return m93840T().mo87231I();
    }

    /* renamed from: Q */
    public final int mo87244Q() {
        return m93840T().mo87232J();
    }

    public final long bQ_() {
        return mo87245R().getMaxCutDuration();
    }

    public final C0794k<Long, Long> bR_() {
        C0794k<Long, Long> playBoundary = mo87245R().getPlayBoundary();
        C52711k.m112236a((Object) playBoundary, "getVideoEditView().playBoundary");
        return playBoundary;
    }

    public final int bT_() {
        CutVideoEditViewModel cutVideoEditViewModel = this.f108197u;
        if (cutVideoEditViewModel == null) {
            C52711k.m112237a("cutVideoEditViewModel");
        }
        return cutVideoEditViewModel.f107992e;
    }

    public final SurfaceView bU_() {
        return m93840T().mo87229G();
    }

    /* renamed from: W */
    private final boolean m93843W() {
        CutVideoViewModel cutVideoViewModel = this.f108192p;
        if (cutVideoViewModel == null) {
            C52711k.m112237a("cutVideoViewModel");
        }
        if (!cutVideoViewModel.mo87178g() || !mo87238K().mo87201T()) {
            return false;
        }
        return true;
    }

    /* renamed from: X */
    private final C42482c m93844X() {
        CutVideoViewModel cutVideoViewModel = this.f108192p;
        if (cutVideoViewModel == null) {
            C52711k.m112237a("cutVideoViewModel");
        }
        if (!cutVideoViewModel.mo87178g()) {
            return null;
        }
        return mo87238K().mo87203V();
    }

    /* renamed from: N */
    public final void mo87241N() {
        CutVideoViewModel cutVideoViewModel = this.f108192p;
        if (cutVideoViewModel == null) {
            C52711k.m112237a("cutVideoViewModel");
        }
        if (cutVideoViewModel.mo87178g()) {
            mo87238K().mo87199R();
        } else {
            m93842V();
        }
    }

    /* renamed from: a */
    public final Context mo86847a() {
        Activity activity = this.f33840g_;
        if (activity != null) {
            return (FragmentActivity) activity;
        }
        throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
    }

    /* renamed from: o */
    public final void mo24468o() {
        super.mo24468o();
        VECutVideoPresenter L = mo87239L();
        Activity v = mo24477v();
        if (v != null) {
            L.mo86812a((FragmentActivity) v);
            return;
        }
        throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
    }

    /* renamed from: S */
    public static IAVStoryProxyService m93839S() {
        Object a = C27991b.m66756a(IAVStoryProxyService.class);
        if (a != null) {
            return (IAVStoryProxyService) a;
        }
        return (IAVStoryProxyService) C20302a.m50070a(IAVStoryProxyService.class).mo42947a(new C20310d()).mo42946a().mo42948b();
    }

    /* renamed from: R */
    public final C43120d mo87245R() {
        CutVideoViewModel cutVideoViewModel = this.f108192p;
        if (cutVideoViewModel == null) {
            C52711k.m112237a("cutVideoViewModel");
        }
        if (cutVideoViewModel.mo87178g()) {
            return mo87238K().mo87204W();
        }
        return mo87237J().mo87255M();
    }

    public final void bV_() {
        CutVideoViewModel cutVideoViewModel = this.f108192p;
        if (cutVideoViewModel == null) {
            C52711k.m112237a("cutVideoViewModel");
        }
        if (cutVideoViewModel.mo87178g()) {
            C42820ax axVar = mo87238K().f108097p;
            if (axVar != null) {
                C43051l lVar = axVar.f108259c;
                lVar.f108677e = -1;
                lVar.f108678f = -1;
                C42875bp bpVar = axVar.f108258b;
                if (bpVar == null) {
                    C52711k.m112237a("stickPointVideoSegController");
                }
                bpVar.mo87323b(false);
            }
        }
    }

    /* renamed from: V */
    private final void m93842V() {
        CutVideoViewModel cutVideoViewModel = this.f108192p;
        if (cutVideoViewModel == null) {
            C52711k.m112237a("cutVideoViewModel");
        }
        if (cutVideoViewModel.mo87185n()) {
            C43757n nVar = new C43757n();
            nVar.setCode(Integer.valueOf(1));
            nVar.setType("highlight");
            nVar.setStatus("back");
            Intent intent = new Intent();
            intent.putExtra("live_highlight_responce", nVar);
            Activity activity = this.f33840g_;
            if (activity != null) {
                activity.setResult(9, intent);
            }
        }
        Activity activity2 = this.f33840g_;
        if (activity2 != null) {
            activity2.finish();
        }
    }

    /* renamed from: M */
    public final boolean mo87240M() {
        String str;
        if (C39629l.m88232a().mo58583n().mo83103a(C40790a.EnableLivePublishBackToCut)) {
            CutVideoViewModel cutVideoViewModel = this.f108192p;
            if (cutVideoViewModel == null) {
                C52711k.m112237a("cutVideoViewModel");
            }
            if (cutVideoViewModel.mo87187p()) {
                CutVideoViewModel cutVideoViewModel2 = this.f108192p;
                if (cutVideoViewModel2 == null) {
                    C52711k.m112237a("cutVideoViewModel");
                }
                LivePublishModel livePublishModel = cutVideoViewModel2.mo87177f().f108076s;
                if (livePublishModel != null) {
                    str = livePublishModel.getFilePath();
                } else {
                    str = null;
                }
                if (C50200d.m108346a(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void bW_() {
        CutVideoViewModel cutVideoViewModel = this.f108192p;
        if (cutVideoViewModel == null) {
            C52711k.m112237a("cutVideoViewModel");
        }
        if (cutVideoViewModel.mo87178g()) {
            mo87238K().mo87194M().mo87346H();
        } else {
            mo87237J().mo87254L().mo87346H();
        }
        C47702b bVar = C47702b.f120193a;
        String str = "tool_performance_video_clip_first_frame";
        C23089d a = C23089d.m56640a().mo47829a("type", "1");
        String str2 = "count";
        CutVideoViewModel cutVideoViewModel2 = this.f108192p;
        if (cutVideoViewModel2 == null) {
            C52711k.m112237a("cutVideoViewModel");
        }
        C23089d a2 = a.mo47826a(str2, cutVideoViewModel2.mo87177f().f108058a.size());
        String str3 = "duration";
        long currentTimeMillis = System.currentTimeMillis();
        CutVideoViewModel cutVideoViewModel3 = this.f108192p;
        if (cutVideoViewModel3 == null) {
            C52711k.m112237a("cutVideoViewModel");
        }
        bVar.mo94984a(str, a2.mo47827a(str3, currentTimeMillis - cutVideoViewModel3.mo87177f().f108080w).f61491a);
    }

    /* renamed from: a */
    public static final /* synthetic */ VideoEditViewModel m93845a(C42781ao aoVar) {
        VideoEditViewModel videoEditViewModel = aoVar.f108193q;
        if (videoEditViewModel == null) {
            C52711k.m112237a("videoEditViewModel");
        }
        return videoEditViewModel;
    }

    /* renamed from: b */
    public static final /* synthetic */ CutVideoTitleBarViewModel m93846b(C42781ao aoVar) {
        CutVideoTitleBarViewModel cutVideoTitleBarViewModel = aoVar.f108194r;
        if (cutVideoTitleBarViewModel == null) {
            C52711k.m112237a("titleBarViewModel");
        }
        return cutVideoTitleBarViewModel;
    }

    /* renamed from: b */
    public final void mo87248b(boolean z) {
        Activity activity = this.f33840g_;
        if (activity != null && activity.isFinishing()) {
            return;
        }
        if (mo87239L().mo86808a() + 5 < this.f108190I) {
            C10691a.m21545b(this.f33840g_, mo24462a((int) R.string.fb5, Long.valueOf(this.f108190I / 1000))).mo19066a();
            CutVideoTitleBarViewModel cutVideoTitleBarViewModel = this.f108194r;
            if (cutVideoTitleBarViewModel == null) {
                C52711k.m112237a("titleBarViewModel");
            }
            cutVideoTitleBarViewModel.mo87173d(true);
        } else if (mo87239L().mo86808a() > ((long) this.f108191J)) {
            StringBuilder sb = new StringBuilder("compile failed,duration=");
            sb.append(mo87239L().mo86808a());
            sb.append(",maxEncodeDuration=");
            sb.append(this.f108191J);
            C45407ay.m98968a(sb.toString());
            C10691a.m21542b((Context) this.f33840g_, (int) R.string.c89).mo19066a();
            CutVideoTitleBarViewModel cutVideoTitleBarViewModel2 = this.f108194r;
            if (cutVideoTitleBarViewModel2 == null) {
                C52711k.m112237a("titleBarViewModel");
            }
            cutVideoTitleBarViewModel2.mo87173d(true);
        } else {
            C26890h.m65011a("import_transcoding_start", Collections.emptyMap());
            C17429o b = C17429o.m42675b();
            CutVideoEditViewModel cutVideoEditViewModel = this.f108197u;
            if (cutVideoEditViewModel == null) {
                C52711k.m112237a("cutVideoEditViewModel");
            }
            if (cutVideoEditViewModel.f107992e != 1) {
                CutVideoListViewModel cutVideoListViewModel = this.f108196t;
                if (cutVideoListViewModel == null) {
                    C52711k.m112237a("videoListViewModel");
                }
                int i = cutVideoListViewModel.f108002f;
                VECutVideoPresenter L = mo87239L();
                VideoEditViewModel videoEditViewModel = this.f108193q;
                if (videoEditViewModel == null) {
                    C52711k.m112237a("videoEditViewModel");
                }
                VECutVideoPresenter.m93492a(L, i, (float) ((VideoSegment) videoEditViewModel.mo87633k().get(i)).f107912k, false, 0.0f, 0.0f, 0, 0, 120, null);
            }
            VECutVideoPresenter L2 = mo87239L();
            CutVideoViewModel cutVideoViewModel = this.f108192p;
            if (cutVideoViewModel == null) {
                C52711k.m112237a("cutVideoViewModel");
            }
            Workspace workspace = cutVideoViewModel.mo87177f().f108068k;
            if (workspace == null) {
                C52711k.m112234a();
            }
            CutVideoViewModel cutVideoViewModel2 = this.f108192p;
            if (cutVideoViewModel2 == null) {
                C52711k.m112237a("cutVideoViewModel");
            }
            boolean z2 = cutVideoViewModel2.mo87177f().f108072o;
            CutVideoViewModel cutVideoViewModel3 = this.f108192p;
            if (cutVideoViewModel3 == null) {
                C52711k.m112237a("cutVideoViewModel");
            }
            L2.mo86814a(workspace, z2, cutVideoViewModel3.mo87181j(), new C42785d(this, z, b), false);
        }
    }

    /* renamed from: e */
    public final void mo24448e(Bundle bundle) {
        super.mo24448e(bundle);
        Activity activity = this.f33840g_;
        if (activity != null) {
            C0209x a = C0214z.m440a((FragmentActivity) activity).mo359a(VideoEditViewModel.class);
            C52711k.m112236a((Object) a, "ViewModelProviders.of(ac…ditViewModel::class.java)");
            this.f108193q = (VideoEditViewModel) a;
            Activity activity2 = this.f33840g_;
            if (activity2 != null) {
                C0209x a2 = C0214z.m440a((FragmentActivity) activity2).mo359a(CutMultiVideoViewModel.class);
                C52711k.m112236a((Object) a2, "ViewModelProviders.of(ac…deoViewModel::class.java]");
                this.f108189H = (CutMultiVideoViewModel) a2;
                Activity activity3 = this.f33840g_;
                if (activity3 != null) {
                    JediViewModel a3 = C48927d.m105736a((FragmentActivity) activity3).mo96760a(CutVideoTitleBarViewModel.class);
                    C52711k.m112236a((Object) a3, "JediViewModelProviders.o…BarViewModel::class.java)");
                    this.f108194r = (CutVideoTitleBarViewModel) a3;
                    Activity activity4 = this.f33840g_;
                    if (activity4 != null) {
                        JediViewModel a4 = C48927d.m105736a((FragmentActivity) activity4).mo96760a(CutVideoBottomBarViewModel.class);
                        C52711k.m112236a((Object) a4, "JediViewModelProviders.o…BarViewModel::class.java)");
                        this.f108195s = (CutVideoBottomBarViewModel) a4;
                        Activity activity5 = this.f33840g_;
                        if (activity5 != null) {
                            JediViewModel a5 = C48927d.m105736a((FragmentActivity) activity5).mo96760a(CutVideoListViewModel.class);
                            C52711k.m112236a((Object) a5, "JediViewModelProviders.o…istViewModel::class.java)");
                            this.f108196t = (CutVideoListViewModel) a5;
                            Activity activity6 = this.f33840g_;
                            if (activity6 != null) {
                                JediViewModel a6 = C48927d.m105736a((FragmentActivity) activity6).mo96760a(CutVideoEditViewModel.class);
                                C52711k.m112236a((Object) a6, "JediViewModelProviders.o…ditViewModel::class.java)");
                                this.f108197u = (CutVideoEditViewModel) a6;
                                Activity activity7 = this.f33840g_;
                                if (activity7 != null) {
                                    JediViewModel a7 = C48927d.m105736a((FragmentActivity) activity7).mo96760a(CutVideoPreviewViewModel.class);
                                    C52711k.m112236a((Object) a7, "JediViewModelProviders.o…iewViewModel::class.java)");
                                    this.f108198v = (CutVideoPreviewViewModel) a7;
                                    CutVideoViewModel cutVideoViewModel = this.f108192p;
                                    if (cutVideoViewModel == null) {
                                        C52711k.m112237a("cutVideoViewModel");
                                    }
                                    mo49444c(cutVideoViewModel, C42796ap.f108218a, new C11934u(), new C42786e(this));
                                    CutVideoViewModel cutVideoViewModel2 = this.f108192p;
                                    if (cutVideoViewModel2 == null) {
                                        C52711k.m112237a("cutVideoViewModel");
                                    }
                                    mo49444c(cutVideoViewModel2, C42797aq.f108219a, new C11934u(), new C42787f(this));
                                    VideoEditViewModel videoEditViewModel = this.f108193q;
                                    if (videoEditViewModel == null) {
                                        C52711k.m112237a("videoEditViewModel");
                                    }
                                    videoEditViewModel.f108924s.observe(this, new C42788g(this));
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
        View inflate = layoutInflater.inflate(R.layout.bqz, viewGroup, false);
        if (inflate != null) {
            return (FrameLayout) inflate;
        }
        throw new C52857u("null cannot be cast to non-null type android.widget.FrameLayout");
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x03c3, code lost:
        if (r13 == null) goto L_0x04ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:305:0x0617, code lost:
        if (r1 == null) goto L_0x0619;
     */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x021d  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0237  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0247  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0253  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x025f  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x027f  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0286  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x028e  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x029a  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x02a9  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x02b0  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x02b8  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x02bf  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x02d5  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x02e5  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x02fc  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x0340  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x0350  */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x03b2  */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x03d3  */
    /* JADX WARNING: Removed duplicated region for block: B:208:0x0407  */
    /* JADX WARNING: Removed duplicated region for block: B:241:0x04c1  */
    /* JADX WARNING: Removed duplicated region for block: B:244:0x04d0  */
    /* JADX WARNING: Removed duplicated region for block: B:245:0x04d5  */
    /* JADX WARNING: Removed duplicated region for block: B:248:0x04dd  */
    /* JADX WARNING: Removed duplicated region for block: B:253:0x04f9  */
    /* JADX WARNING: Removed duplicated region for block: B:256:0x0506  */
    /* JADX WARNING: Removed duplicated region for block: B:259:0x0511  */
    /* JADX WARNING: Removed duplicated region for block: B:274:0x0577  */
    /* JADX WARNING: Removed duplicated region for block: B:277:0x0582  */
    /* JADX WARNING: Removed duplicated region for block: B:292:0x05e3  */
    /* JADX WARNING: Removed duplicated region for block: B:295:0x05f8  */
    /* JADX WARNING: Removed duplicated region for block: B:302:0x060f  */
    /* JADX WARNING: Removed duplicated region for block: B:310:0x0643  */
    /* JADX WARNING: Removed duplicated region for block: B:313:0x064e  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.content.Intent mo87246a(android.content.Intent r18, boolean r19, com.p683ss.android.ugc.aweme.shortvideo.cut.scene.C42734ad r20) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            com.ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace r4 = r3.f108068k
            r5 = 0
            if (r1 == 0) goto L_0x0014
            java.lang.String r6 = "from_music_detail"
            boolean r6 = r1.getBooleanExtra(r6, r5)
            goto L_0x0015
        L_0x0014:
            r6 = 0
        L_0x0015:
            r7 = 0
            if (r6 != 0) goto L_0x0024
            if (r4 == 0) goto L_0x001d
            r4.mo86459f()
        L_0x001d:
            com.ss.android.ugc.aweme.shortvideo.dh r6 = com.p683ss.android.ugc.aweme.shortvideo.C43214dh.m94817a()
            r6.mo50200a(r7)
        L_0x0024:
            java.util.ArrayList<com.ss.android.ugc.aweme.shortvideo.ImportVideoInfo> r6 = r0.f108200x
            r6.clear()
            com.ss.android.ugc.aweme.shortvideo.cut.scene.ao$h r6 = new com.ss.android.ugc.aweme.shortvideo.cut.scene.ao$h
            r6.<init>(r0)
            java.util.concurrent.Callable r6 = (java.util.concurrent.Callable) r6
            p001a.C0013i.m16a(r6)
            if (r1 == 0) goto L_0x003c
            java.lang.String r6 = "shoot_way"
            java.lang.String r6 = r1.getStringExtra(r6)
            goto L_0x003d
        L_0x003c:
            r6 = r7
        L_0x003d:
            if (r1 == 0) goto L_0x0047
            java.lang.String r8 = "creation_id"
            java.lang.String r8 = r1.getStringExtra(r8)
            r11 = r8
            goto L_0x0048
        L_0x0047:
            r11 = r7
        L_0x0048:
            if (r1 == 0) goto L_0x0051
            java.lang.String r8 = "cc_vid"
            java.lang.String r8 = r1.getStringExtra(r8)
            goto L_0x0052
        L_0x0051:
            r8 = r7
        L_0x0052:
            if (r1 == 0) goto L_0x005b
            java.lang.String r9 = "task_id"
            java.lang.String r9 = r1.getStringExtra(r9)
            goto L_0x005c
        L_0x005b:
            r9 = r7
        L_0x005c:
            if (r1 == 0) goto L_0x0065
            java.lang.String r10 = "challenge_names"
            java.util.ArrayList r10 = r1.getStringArrayListExtra(r10)
            goto L_0x0066
        L_0x0065:
            r10 = r7
        L_0x0066:
            if (r1 == 0) goto L_0x006f
            java.lang.String r12 = "task_mentioned_users"
            java.io.Serializable r12 = r1.getSerializableExtra(r12)
            goto L_0x0070
        L_0x006f:
            r12 = r7
        L_0x0070:
            java.util.List r12 = (java.util.List) r12
            if (r1 == 0) goto L_0x007b
            java.lang.String r13 = "comment_video_model"
            java.io.Serializable r13 = r1.getSerializableExtra(r13)
            goto L_0x007c
        L_0x007b:
            r13 = r7
        L_0x007c:
            boolean r14 = r13 instanceof com.p683ss.android.ugc.aweme.comment.model.CommentVideoModel
            if (r14 != 0) goto L_0x0081
            r13 = r7
        L_0x0081:
            com.ss.android.ugc.aweme.comment.model.CommentVideoModel r13 = (com.p683ss.android.ugc.aweme.comment.model.CommentVideoModel) r13
            boolean r14 = r17.m93843W()
            if (r14 == 0) goto L_0x00a1
            com.ss.android.ugc.aweme.shortvideo.c r14 = r17.m93844X()
            java.lang.String r14 = com.p683ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C43036f.m94308c(r14)
            boolean r15 = com.p683ss.android.ugc.aweme.video.C48016e.m103944b(r14)
            if (r15 == 0) goto L_0x00a1
            if (r4 == 0) goto L_0x00a1
            java.io.File r15 = new java.io.File
            r15.<init>(r14)
            r4.mo86453a(r15)
        L_0x00a1:
            com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoPresenter r14 = r17.mo87239L()
            android.content.Intent r15 = new android.content.Intent
            r15.<init>()
            java.lang.String r7 = "workspace"
            r5 = r4
            android.os.Parcelable r5 = (android.os.Parcelable) r5
            r15.putExtra(r7, r5)
            if (r4 == 0) goto L_0x00ca
            java.lang.String r5 = "extra_edit_preview_info"
            com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo r4 = r14.mo86809a(r2, r4)
            if (r4 == 0) goto L_0x00c2
            android.os.Parcelable r4 = (android.os.Parcelable) r4
            r15.putExtra(r5, r4)
            goto L_0x00ca
        L_0x00c2:
            d.u r1 = new d.u
            java.lang.String r2 = "null cannot be cast to non-null type android.os.Parcelable"
            r1.<init>(r2)
            throw r1
        L_0x00ca:
            java.lang.String r4 = "extra_av_is_fast_import"
            r15.putExtra(r4, r2)
            java.lang.String r4 = "extra_fast_import_error_code"
            int r5 = r14.f107687a
            r15.putExtra(r4, r5)
            java.lang.String r4 = "extra_av_enable_fast_import_resolution"
            com.ss.android.ugc.aweme.shortvideo.cut.r$a r5 = com.p683ss.android.ugc.aweme.shortvideo.cut.C42673r.f107974a
            java.lang.String r5 = r5.mo86990a()
            r15.putExtra(r4, r5)
            boolean r4 = r14.mo86821d()
            if (r4 == 0) goto L_0x010b
            if (r2 == 0) goto L_0x010b
            com.ss.android.ugc.aweme.shortvideo.c.b r2 = r14.f107696j
            if (r2 == 0) goto L_0x00f4
            com.ss.android.vesdk.o r2 = r2.f55837d
            long r4 = r2.mo99357c()
            goto L_0x00f6
        L_0x00f4:
            r4 = -1
        L_0x00f6:
            f108182z = r4
            java.lang.String r2 = "extra_editor_model"
            com.ss.android.ugc.aweme.shortvideo.c.b r4 = r14.f107696j
            if (r4 == 0) goto L_0x0105
            com.ss.android.vesdk.o r4 = r4.f55837d
            com.ss.android.vesdk.VEEditorModel r7 = r4.mo99377h()
            goto L_0x0106
        L_0x0105:
            r7 = 0
        L_0x0106:
            android.os.Parcelable r7 = (android.os.Parcelable) r7
            r15.putExtra(r2, r7)
        L_0x010b:
            java.lang.String r2 = "extra_stick_point_type"
            int r4 = r3.f108070m
            r15.putExtra(r2, r4)
            java.lang.String r2 = "extra_start_enter_edit_page"
            long r4 = r0.f108199w
            r15.putExtra(r2, r4)
            java.lang.String r2 = "extra_import_compile_cost_time"
            long r4 = java.lang.System.currentTimeMillis()
            r16 = r8
            long r7 = r0.f108199w
            long r4 = r4 - r7
            r15.putExtra(r2, r4)
            java.lang.String r2 = "send_to_user_head"
            if (r1 == 0) goto L_0x0132
            java.lang.String r4 = "send_to_user_head"
            java.io.Serializable r7 = r1.getSerializableExtra(r4)
            goto L_0x0133
        L_0x0132:
            r7 = 0
        L_0x0133:
            r15.putExtra(r2, r7)
            java.lang.String r2 = "extra_is_change_speed"
            com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel r4 = r0.f108193q
            if (r4 != 0) goto L_0x0141
            java.lang.String r5 = "videoEditViewModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r5)
        L_0x0141:
            boolean r4 = r4.mo87636n()
            r15.putExtra(r2, r4)
            java.lang.String r2 = "enter_from"
            if (r1 == 0) goto L_0x0153
            java.lang.String r4 = "enter_from"
            java.lang.String r7 = r1.getStringExtra(r4)
            goto L_0x0154
        L_0x0153:
            r7 = 0
        L_0x0154:
            r15.putExtra(r2, r7)
            if (r1 == 0) goto L_0x0160
            java.lang.String r2 = "enter_from"
            java.lang.String r7 = r1.getStringExtra(r2)
            goto L_0x0161
        L_0x0160:
            r7 = 0
        L_0x0161:
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            java.lang.String r2 = "douplus"
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            boolean r2 = android.text.TextUtils.equals(r7, r2)
            if (r2 == 0) goto L_0x017c
            java.lang.String r2 = "extra_mention_user_model"
            if (r1 == 0) goto L_0x0178
            java.lang.String r4 = "extra_mention_user_model"
            java.io.Serializable r7 = r1.getSerializableExtra(r4)
            goto L_0x0179
        L_0x0178:
            r7 = 0
        L_0x0179:
            r15.putExtra(r2, r7)
        L_0x017c:
            java.lang.String r2 = "dir"
            java.lang.String r4 = com.p683ss.android.ugc.aweme.shortvideo.C43307ea.f109491d
            r15.putExtra(r2, r4)
            java.lang.String r2 = "shoot_way"
            r15.putExtra(r2, r6)
            java.lang.String r2 = "comment_video_model"
            r4 = r13
            java.io.Serializable r4 = (java.io.Serializable) r4
            r15.putExtra(r2, r4)
            java.lang.String r2 = "task_id"
            r15.putExtra(r2, r9)
            java.lang.String r2 = "content_source"
            java.lang.String r4 = "upload"
            r15.putExtra(r2, r4)
            java.lang.String r2 = "content_type"
            boolean r4 = r17.m93843W()
            java.lang.String r4 = com.p683ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C43047h.m94330a(r4)
            r15.putExtra(r2, r4)
            java.lang.String r2 = "enable_music_path_check"
            r4 = 0
            r15.putExtra(r2, r4)
            java.lang.String r2 = "fromMultiCut"
            com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoViewModel r4 = r0.f108192p
            if (r4 != 0) goto L_0x01ba
            java.lang.String r5 = "cutVideoViewModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r5)
        L_0x01ba:
            boolean r4 = r4.mo87178g()
            r15.putExtra(r2, r4)
            java.lang.String r2 = "fromCut"
            r5 = 1
            r15.putExtra(r2, r5)
            java.lang.String r2 = "origin"
            r4 = 0
            r15.putExtra(r2, r4)
            java.lang.String r2 = "creation_id"
            r15.putExtra(r2, r11)
            java.lang.String r2 = "cc_vid"
            r7 = r16
            r15.putExtra(r2, r7)
            java.lang.String r2 = "poi_struct_in_tools_line"
            if (r1 == 0) goto L_0x01e4
            java.lang.String r4 = "poi_struct_in_tools_line"
            java.lang.String r7 = r1.getStringExtra(r4)
            goto L_0x01e5
        L_0x01e4:
            r7 = 0
        L_0x01e5:
            r15.putExtra(r2, r7)
            java.lang.String r2 = "back_to_main_after_publish"
            com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoViewModel r4 = r0.f108192p
            if (r4 != 0) goto L_0x01f3
            java.lang.String r6 = "cutVideoViewModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r6)
        L_0x01f3:
            com.ss.android.ugc.aweme.shortvideo.cut.scene.ad r6 = r4.f108052d
            if (r6 != 0) goto L_0x01fc
            java.lang.String r7 = "cutVideoModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r7)
        L_0x01fc:
            com.ss.android.ugc.aweme.shortvideo.edit.o r6 = r6.f108065h
            if (r6 != 0) goto L_0x0215
            com.ss.android.ugc.aweme.shortvideo.cut.scene.ad r4 = r4.f108052d
            if (r4 != 0) goto L_0x0209
            java.lang.String r6 = "cutVideoModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r6)
        L_0x0209:
            java.lang.String r4 = r4.f108064g
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 == 0) goto L_0x0215
            r4 = 1
            goto L_0x0216
        L_0x0215:
            r4 = 0
        L_0x0216:
            r15.putExtra(r2, r4)
            java.util.ArrayList<com.ss.android.ugc.aweme.shortvideo.AVChallenge> r2 = r3.f108063f
            if (r2 == 0) goto L_0x0231
            java.lang.String r2 = "challenge"
            java.util.ArrayList<com.ss.android.ugc.aweme.shortvideo.AVChallenge> r4 = r3.f108063f
            if (r4 == 0) goto L_0x0229
            java.io.Serializable r4 = (java.io.Serializable) r4
            r15.putExtra(r2, r4)
            goto L_0x0231
        L_0x0229:
            d.u r1 = new d.u
            java.lang.String r2 = "null cannot be cast to non-null type java.io.Serializable"
            r1.<init>(r2)
            throw r1
        L_0x0231:
            java.lang.String r2 = "enter_record_from_other_platform"
            com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoViewModel r4 = r0.f108192p
            if (r4 != 0) goto L_0x023c
            java.lang.String r6 = "cutVideoViewModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r6)
        L_0x023c:
            boolean r4 = r4.mo87180i()
            r15.putExtra(r2, r4)
            java.lang.String r2 = "edit_publish_session_end_together"
            if (r1 == 0) goto L_0x0253
            java.lang.String r4 = "edit_publish_session_end_together"
            r6 = 0
            boolean r4 = r1.getBooleanExtra(r4, r6)
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r4)
            goto L_0x0254
        L_0x0253:
            r7 = 0
        L_0x0254:
            java.io.Serializable r7 = (java.io.Serializable) r7
            r15.putExtra(r2, r7)
            java.lang.String r2 = "upload_video_type"
            com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoViewModel r4 = r0.f108192p
            if (r4 != 0) goto L_0x0264
            java.lang.String r6 = "cutVideoViewModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r6)
        L_0x0264:
            boolean r4 = r4.mo87178g()
            r15.putExtra(r2, r4)
            java.lang.String r2 = "micro_app_id"
            java.lang.String r4 = r3.f108064g
            r15.putExtra(r2, r4)
            java.lang.String r2 = "micro_app_info"
            com.ss.android.ugc.aweme.shortvideo.edit.o r4 = r3.f108065h
            java.io.Serializable r4 = (java.io.Serializable) r4
            r15.putExtra(r2, r4)
            java.lang.String r2 = "av_et_parameter"
            if (r1 == 0) goto L_0x0286
            java.lang.String r4 = "av_et_parameter"
            java.io.Serializable r7 = r1.getSerializableExtra(r4)
            goto L_0x0287
        L_0x0286:
            r7 = 0
        L_0x0287:
            r15.putExtra(r2, r7)
            java.lang.String r2 = "shoot_mode"
            if (r1 == 0) goto L_0x029a
            java.lang.String r4 = "shoot_mode"
            r6 = -1
            int r4 = r1.getIntExtra(r4, r6)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r4)
            goto L_0x029b
        L_0x029a:
            r7 = 0
        L_0x029b:
            java.io.Serializable r7 = (java.io.Serializable) r7
            r15.putExtra(r2, r7)
            java.lang.String r2 = "story_mediaType"
            r15.putExtra(r2, r5)
            java.lang.String r2 = "extra_share_context"
            if (r1 == 0) goto L_0x02b0
            java.lang.String r4 = "extra_share_context"
            java.io.Serializable r7 = r1.getSerializableExtra(r4)
            goto L_0x02b1
        L_0x02b0:
            r7 = 0
        L_0x02b1:
            r15.putExtra(r2, r7)
            java.lang.String r2 = "extra_share_app_name"
            if (r1 == 0) goto L_0x02bf
            java.lang.String r4 = "extra_share_app_name"
            java.lang.String r7 = r1.getStringExtra(r4)
            goto L_0x02c0
        L_0x02bf:
            r7 = 0
        L_0x02c0:
            r15.putExtra(r2, r7)
            java.lang.String r2 = "music_origin"
            java.lang.String r4 = r3.f108075r
            r15.putExtra(r2, r4)
            java.util.ArrayList<com.ss.android.ugc.aweme.shortvideo.ImportVideoInfo> r2 = r0.f108200x
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            r2 = r2 ^ r5
            if (r2 == 0) goto L_0x02dc
            java.lang.String r2 = "extra_import_video_info_list"
            java.util.ArrayList<com.ss.android.ugc.aweme.shortvideo.ImportVideoInfo> r4 = r0.f108200x
            r15.putParcelableArrayListExtra(r2, r4)
        L_0x02dc:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel r4 = r0.f108193q
            if (r4 != 0) goto L_0x02ea
            java.lang.String r6 = "videoEditViewModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r6)
        L_0x02ea:
            java.util.List r4 = r4.mo87634l()
            java.lang.String r6 = "videoEditViewModel.originVideoList"
            p2628d.p2639f.p2641b.C52711k.m112236a(r4, r6)
            java.util.Collection r4 = (java.util.Collection) r4
            boolean r4 = r4.isEmpty()
            r4 = r4 ^ r5
            if (r4 == 0) goto L_0x0340
            com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel r4 = r0.f108193q
            if (r4 != 0) goto L_0x0305
            java.lang.String r6 = "videoEditViewModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r6)
        L_0x0305:
            java.util.List r4 = r4.mo87634l()
            if (r4 == 0) goto L_0x032c
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.Iterator r4 = r4.iterator()
            r6 = 0
        L_0x0312:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L_0x032d
            java.lang.Object r7 = r4.next()
            com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment r7 = (com.p683ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment) r7
            java.lang.String r8 = "segment"
            p2628d.p2639f.p2641b.C52711k.m112236a(r7, r8)
            boolean r7 = r7.mo86944a()
            if (r7 == 0) goto L_0x0312
            int r6 = r6 + 1
            goto L_0x0312
        L_0x032c:
            r6 = 0
        L_0x032d:
            com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel r4 = r0.f108193q
            if (r4 != 0) goto L_0x0336
            java.lang.String r7 = "videoEditViewModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r7)
        L_0x0336:
            java.util.List r4 = r4.mo87634l()
            int r4 = r4.size()
            int r4 = r4 - r6
            goto L_0x0342
        L_0x0340:
            r4 = 0
            r6 = 0
        L_0x0342:
            java.lang.String r7 = "extra_photo_count"
            r15.putExtra(r7, r6)
            java.lang.String r6 = "extra_video_count"
            r15.putExtra(r6, r4)
            com.ss.android.ugc.aweme.shortvideo.edit.o r7 = r3.f108065h
            if (r7 == 0) goto L_0x03a1
            java.lang.String r4 = r7.getExtra()
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            r4 = r4 ^ r5
            if (r4 == 0) goto L_0x035e
            goto L_0x035f
        L_0x035e:
            r7 = 0
        L_0x035f:
            if (r7 == 0) goto L_0x03a1
            com.ss.android.ugc.aweme.port.in.u r4 = com.p683ss.android.ugc.aweme.port.p2082in.C39629l.m88232a()
            com.google.gson.f r4 = r4.mo58566D()
            java.lang.String r6 = r7.getExtra()
            java.lang.Class<com.tt.appbrandimpl.d> r7 = com.p2615tt.appbrandimpl.C51928d.class
            java.lang.Object r4 = r4.mo34884a(r6, r7)
            com.tt.appbrandimpl.d r4 = (com.p2615tt.appbrandimpl.C51928d) r4
            if (r4 == 0) goto L_0x03a1
            java.util.List<java.lang.String> r6 = r4.f129606a
            java.util.Collection r6 = (java.util.Collection) r6
            boolean r6 = com.bytedance.common.utility.p522b.C9376b.m18558a(r6)
            if (r6 != 0) goto L_0x03a1
            java.util.List<java.lang.String> r4 = r4.f129606a
            java.util.Iterator r4 = r4.iterator()
        L_0x0387:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x03a1
            java.lang.Object r6 = r4.next()
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r7 = "#"
            r2.append(r7)
            r2.append(r6)
            java.lang.String r6 = " "
            r2.append(r6)
            goto L_0x0387
        L_0x03a1:
            r4 = r10
            java.util.Collection r4 = (java.util.Collection) r4
            if (r4 == 0) goto L_0x03af
            boolean r6 = r4.isEmpty()
            if (r6 == 0) goto L_0x03ad
            goto L_0x03af
        L_0x03ad:
            r6 = 0
            goto L_0x03b0
        L_0x03af:
            r6 = 1
        L_0x03b0:
            if (r6 == 0) goto L_0x03c5
            r6 = r12
            java.util.Collection r6 = (java.util.Collection) r6
            if (r6 == 0) goto L_0x03c0
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L_0x03be
            goto L_0x03c0
        L_0x03be:
            r6 = 0
            goto L_0x03c1
        L_0x03c0:
            r6 = 1
        L_0x03c1:
            if (r6 == 0) goto L_0x03c5
            if (r13 == 0) goto L_0x04ed
        L_0x03c5:
            if (r4 == 0) goto L_0x03d0
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L_0x03ce
            goto L_0x03d0
        L_0x03ce:
            r4 = 0
            goto L_0x03d1
        L_0x03d0:
            r4 = 1
        L_0x03d1:
            if (r4 != 0) goto L_0x03f1
            java.util.Iterator r4 = r10.iterator()
        L_0x03d7:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x03f1
            java.lang.Object r6 = r4.next()
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r7 = "#"
            r2.append(r7)
            r2.append(r6)
            java.lang.String r6 = " "
            r2.append(r6)
            goto L_0x03d7
        L_0x03f1:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r6 = r12
            java.util.Collection r6 = (java.util.Collection) r6
            if (r6 == 0) goto L_0x0404
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L_0x0402
            goto L_0x0404
        L_0x0402:
            r6 = 0
            goto L_0x0405
        L_0x0404:
            r6 = 1
        L_0x0405:
            if (r6 != 0) goto L_0x047c
            java.util.Iterator r6 = r12.iterator()
        L_0x040b:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x047c
            java.lang.Object r7 = r6.next()
            com.ss.android.ugc.aweme.discover.model.TaskMentionedUser r7 = (com.p683ss.android.ugc.aweme.discover.model.TaskMentionedUser) r7
            java.lang.String r8 = r7.getNickname()
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
            if (r8 == 0) goto L_0x0428
            int r8 = r8.length()
            if (r8 != 0) goto L_0x0426
            goto L_0x0428
        L_0x0426:
            r8 = 0
            goto L_0x0429
        L_0x0428:
            r8 = 1
        L_0x0429:
            if (r8 != 0) goto L_0x040b
            java.lang.String r8 = r7.getUserId()
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
            if (r8 == 0) goto L_0x043c
            int r8 = r8.length()
            if (r8 != 0) goto L_0x043a
            goto L_0x043c
        L_0x043a:
            r8 = 0
            goto L_0x043d
        L_0x043c:
            r8 = 1
        L_0x043d:
            if (r8 != 0) goto L_0x040b
            java.lang.String r8 = "@"
            r2.append(r8)
            java.lang.String r8 = r7.getNickname()
            r2.append(r8)
            java.lang.String r8 = " "
            r2.append(r8)
            java.lang.String r8 = r7.getNickname()
            if (r8 != 0) goto L_0x0458
            java.lang.String r8 = ""
        L_0x0458:
            int r8 = r2.indexOf(r8)
            int r8 = r8 - r5
            int r9 = r8 + 1
            java.lang.String r10 = r7.getNickname()
            if (r10 == 0) goto L_0x046a
            int r10 = r10.length()
            goto L_0x046b
        L_0x046a:
            r10 = 0
        L_0x046b:
            int r9 = r9 + r10
            java.lang.String r7 = r7.getUserId()
            if (r7 != 0) goto L_0x0474
            java.lang.String r7 = "0"
        L_0x0474:
            com.ss.android.ugc.aweme.shortvideo.model.AVTextExtraStruct r7 = com.p683ss.android.ugc.aweme.shortvideo.model.AVTextExtraStructHelper.createAtStruct(r8, r9, r7)
            r4.add(r7)
            goto L_0x040b
        L_0x047c:
            if (r13 == 0) goto L_0x04e6
            java.lang.String r6 = r13.getUserName()
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            boolean r6 = android.text.TextUtils.isEmpty(r6)
            if (r6 != 0) goto L_0x04e6
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "@"
            r6.<init>(r7)
            java.lang.String r7 = r13.getUserName()
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            android.view.View r7 = r0.f33834b
            java.lang.String r8 = "view"
            p2628d.p2639f.p2641b.C52711k.m112236a(r7, r8)
            android.content.Context r7 = r7.getContext()
            r8 = 2132543056(0x7f1c0650, float:2.0739234E38)
            java.lang.Object[] r9 = new java.lang.Object[r5]
            r10 = 0
            r9[r10] = r6
            java.lang.String r6 = r7.getString(r8, r9)
            r2.append(r6)
            java.lang.String r6 = " "
            r2.append(r6)
            java.lang.String r6 = r13.getUserName()
            if (r6 != 0) goto L_0x04c3
            java.lang.String r6 = ""
        L_0x04c3:
            int r6 = r2.indexOf(r6)
            int r6 = r6 - r5
            int r7 = r6 + 1
            java.lang.String r8 = r13.getUserName()
            if (r8 == 0) goto L_0x04d5
            int r8 = r8.length()
            goto L_0x04d6
        L_0x04d5:
            r8 = 0
        L_0x04d6:
            int r7 = r7 + r8
            java.lang.String r8 = r13.getUserId()
            if (r8 != 0) goto L_0x04df
            java.lang.String r8 = "0"
        L_0x04df:
            com.ss.android.ugc.aweme.shortvideo.model.AVTextExtraStruct r6 = com.p683ss.android.ugc.aweme.shortvideo.model.AVTextExtraStructHelper.createCommentStruct(r6, r7, r8)
            r4.add(r6)
        L_0x04e6:
            java.lang.String r6 = "struct_list"
            java.io.Serializable r4 = (java.io.Serializable) r4
            r15.putExtra(r6, r4)
        L_0x04ed:
            java.lang.String r4 = r2.toString()
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L_0x0502
            java.lang.String r4 = "video_title"
            java.lang.String r2 = r2.toString()
            r15.putExtra(r4, r2)
        L_0x0502:
            com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel r2 = r0.f108193q
            if (r2 != 0) goto L_0x050b
            java.lang.String r4 = "videoEditViewModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r4)
        L_0x050b:
            java.util.List r2 = r2.mo87633k()
            if (r2 == 0) goto L_0x056c
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.util.Iterator r2 = r2.iterator()
        L_0x051a:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L_0x053b
            java.lang.Object r6 = r2.next()
            com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment r6 = (com.p683ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment) r6
            java.lang.String r7 = r6.f107916o
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            boolean r7 = android.text.TextUtils.isEmpty(r7)
            if (r7 != 0) goto L_0x051a
            java.lang.String r6 = r6.f107916o
            r4.append(r6)
            java.lang.String r6 = ","
            r4.append(r6)
            goto L_0x051a
        L_0x053b:
            java.lang.String r2 = r4.toString()
            java.lang.String r4 = "sb.toString()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r4)
            r4 = r2
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L_0x056c
            java.lang.String r4 = "md5"
            int r6 = r2.length()
            int r6 = r6 - r5
            if (r2 == 0) goto L_0x0564
            r7 = 0
            java.lang.String r2 = r2.substring(r7, r6)
            java.lang.String r6 = "(this as java.lang.Strin…ing(startIndex, endIndex)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r6)
            r15.putExtra(r4, r2)
            goto L_0x056c
        L_0x0564:
            d.u r1 = new d.u
            java.lang.String r2 = "null cannot be cast to non-null type java.lang.String"
            r1.<init>(r2)
            throw r1
        L_0x056c:
            com.ss.android.ugc.aweme.tools.a.e r2 = com.p683ss.android.ugc.aweme.tools.p2346a.C46804e.CUT
            com.ss.android.ugc.aweme.tools.a.e r4 = com.p683ss.android.ugc.aweme.tools.p2346a.C46804e.EDIT
            com.p683ss.android.ugc.aweme.tools.p2346a.C46806g.m101650a(r1, r15, r2, r4)
            com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel r1 = r0.f108193q
            if (r1 != 0) goto L_0x057c
            java.lang.String r2 = "videoEditViewModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r2)
        L_0x057c:
            java.util.List r1 = r1.mo87633k()
            if (r1 == 0) goto L_0x05dd
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x058b:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x05ac
            java.lang.Object r4 = r1.next()
            com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment r4 = (com.p683ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment) r4
            java.lang.String r6 = r4.f107915n
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            boolean r6 = android.text.TextUtils.isEmpty(r6)
            if (r6 != 0) goto L_0x058b
            java.lang.String r4 = r4.f107915n
            r2.append(r4)
            java.lang.String r4 = ";"
            r2.append(r4)
            goto L_0x058b
        L_0x05ac:
            java.lang.String r1 = r2.toString()
            java.lang.String r2 = "sb.toString()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
            r2 = r1
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x05dd
            java.lang.String r2 = "poi_data_in_tools_line"
            int r4 = r1.length()
            int r4 = r4 - r5
            if (r1 == 0) goto L_0x05d5
            r5 = 0
            java.lang.String r1 = r1.substring(r5, r4)
            java.lang.String r4 = "(this as java.lang.Strin…ing(startIndex, endIndex)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r4)
            r15.putExtra(r2, r1)
            goto L_0x05dd
        L_0x05d5:
            d.u r1 = new d.u
            java.lang.String r2 = "null cannot be cast to non-null type java.lang.String"
            r1.<init>(r2)
            throw r1
        L_0x05dd:
            boolean r1 = r17.m93843W()
            if (r1 == 0) goto L_0x05ee
            com.ss.android.ugc.aweme.shortvideo.dh r1 = com.p683ss.android.ugc.aweme.shortvideo.C43214dh.m94817a()
            com.ss.android.ugc.aweme.shortvideo.c r2 = r17.m93844X()
            r1.mo50200a(r2)
        L_0x05ee:
            java.lang.String r1 = "extra_edit_preview_info"
            android.os.Parcelable r1 = r15.getParcelableExtra(r1)
            com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo r1 = (com.p683ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo) r1
            if (r1 == 0) goto L_0x060c
            java.util.List r1 = r1.getVideoList()
            if (r1 == 0) goto L_0x060c
            java.lang.Object r1 = p2628d.p2629a.C52575l.m112140f(r1)
            com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment r1 = (com.p683ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment) r1
            if (r1 == 0) goto L_0x060c
            java.lang.String r7 = r1.getVideoPath()
            r10 = r7
            goto L_0x060d
        L_0x060c:
            r10 = 0
        L_0x060d:
            if (r10 == 0) goto L_0x0636
            com.ss.android.ugc.aweme.shortvideo.edit.o r1 = r3.f108065h
            if (r1 == 0) goto L_0x0619
            java.lang.String r1 = r1.getAppId()
            if (r1 != 0) goto L_0x061b
        L_0x0619:
            java.lang.String r1 = r3.f108064g
        L_0x061b:
            r3.f108064g = r1
            com.ss.android.ugc.aweme.port.in.ak r1 = com.p683ss.android.ugc.aweme.port.p2082in.C39630m.m88234a()
            com.ss.android.ugc.aweme.port.in.ab r1 = r1.mo58604b()
            com.ss.android.ugc.aweme.port.in.ab$b r9 = r1.mo80585g()
            java.lang.String r12 = r3.f108064g
            com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoPresenter r1 = r17.mo87239L()
            long r13 = r1.mo86808a()
            r9.mo80592a(r10, r11, r12, r13)
        L_0x0636:
            java.lang.String r1 = "extra_stickpoint_mode"
            boolean r2 = r17.m93843W()
            r15.putExtra(r1, r2)
            com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoViewModel r1 = r0.f108192p
            if (r1 != 0) goto L_0x0648
            java.lang.String r2 = "cutVideoViewModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r2)
        L_0x0648:
            boolean r1 = r1.mo87184m()
            if (r1 == 0) goto L_0x069f
            java.lang.String r1 = "live_publish_model"
            com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoViewModel r2 = r0.f108192p
            if (r2 != 0) goto L_0x0659
            java.lang.String r3 = "cutVideoViewModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r3)
        L_0x0659:
            com.ss.android.ugc.aweme.shortvideo.cut.scene.ad r2 = r2.mo87177f()
            com.ss.android.ugc.aweme.shortvideo.edit.LivePublishModel r2 = r2.f108076s
            if (r2 == 0) goto L_0x0697
            java.io.Serializable r2 = (java.io.Serializable) r2
            r15.putExtra(r1, r2)
            java.lang.String r1 = "extra_enter_from_live"
            com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoViewModel r2 = r0.f108192p
            if (r2 != 0) goto L_0x0671
            java.lang.String r3 = "cutVideoViewModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r3)
        L_0x0671:
            boolean r2 = r2.mo87186o()
            r15.putExtra(r1, r2)
            com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoViewModel r1 = r0.f108192p
            if (r1 != 0) goto L_0x0681
            java.lang.String r2 = "cutVideoViewModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r2)
        L_0x0681:
            boolean r1 = r1.mo87185n()
            if (r1 == 0) goto L_0x068f
            java.lang.String r1 = "content_type"
            java.lang.String r2 = "live_highlight"
            r15.putExtra(r1, r2)
            goto L_0x069f
        L_0x068f:
            java.lang.String r1 = "content_type"
            java.lang.String r2 = "live_record"
            r15.putExtra(r1, r2)
            goto L_0x069f
        L_0x0697:
            d.u r1 = new d.u
            java.lang.String r2 = "null cannot be cast to non-null type java.io.Serializable"
            r1.<init>(r2)
            throw r1
        L_0x069f:
            boolean r1 = com.p683ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C43036f.m94311d()
            if (r1 == 0) goto L_0x06ba
            boolean r1 = r17.m93843W()
            if (r1 == 0) goto L_0x06ba
            java.lang.String r1 = "key_stick_point_data"
            com.ss.android.ugc.aweme.shortvideo.cut.scene.ae r2 = r17.mo87238K()
            com.ss.android.ugc.aweme.shortvideo.x.a r2 = r2.mo87202U()
            java.io.Serializable r2 = (java.io.Serializable) r2
            r15.putExtra(r1, r2)
        L_0x06ba:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.cut.scene.C42781ao.mo87246a(android.content.Intent, boolean, com.ss.android.ugc.aweme.shortvideo.cut.scene.ad):android.content.Intent");
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
