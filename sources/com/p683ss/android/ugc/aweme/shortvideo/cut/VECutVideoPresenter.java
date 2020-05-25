package com.p683ss.android.ugc.aweme.shortvideo.cut;

import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0183j;
import android.arch.lifecycle.C0198r;
import android.arch.lifecycle.C0199s;
import android.arch.lifecycle.C0200t;
import android.arch.lifecycle.C0209x;
import android.arch.lifecycle.C0214z;
import android.content.Context;
import android.p002a.p003a.p004a.C0030a;
import android.p002a.p003a.p004a.C0037d;
import android.p002a.p003a.p004a.C0039f;
import android.support.p030v4.app.FragmentActivity;
import android.support.p030v4.p038f.C0794k;
import com.bytedance.ies.C10174a;
import com.p683ss.android.ugc.asve.p1239c.C20347c;
import com.p683ss.android.ugc.asve.p1239c.C20349e;
import com.p683ss.android.ugc.asve.p1239c.C20350f;
import com.p683ss.android.ugc.aweme.base.C23569o;
import com.p683ss.android.ugc.aweme.global.config.settings.C32816h;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.property.C40789h.C40790a;
import com.p683ss.android.ugc.aweme.shortvideo.C42447bc;
import com.p683ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import com.p683ss.android.ugc.aweme.shortvideo.cut.model.CutVideoContext;
import com.p683ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.p683ss.android.ugc.aweme.shortvideo.cut.scene.C42837b;
import com.p683ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C43036f;
import com.p683ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C43066n;
import com.p683ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p2181a.C42991d;
import com.p683ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel;
import com.p683ss.android.ugc.aweme.shortvideo.cut.viewmodel.C43168a;
import com.p683ss.android.ugc.aweme.shortvideo.cut.viewmodel.VEVideoCutterViewModel;
import com.p683ss.android.ugc.aweme.shortvideo.edit.model.C43668b;
import com.p683ss.android.ugc.aweme.shortvideo.edit.model.C43672e;
import com.p683ss.android.ugc.aweme.shortvideo.edit.model.C43674g;
import com.p683ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.p683ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.p683ss.android.ugc.aweme.shortvideo.edit.model.VideoCutInfo;
import com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.C44300e;
import com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.C44307g;
import com.p683ss.android.ugc.aweme.shortvideo.p2178c.C42484b;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45407ay;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45465y;
import com.p683ss.android.ugc.aweme.themechange.base.C46788b;
import com.p683ss.android.ugc.aweme.tools.p2348b.C46812a;
import com.p683ss.android.ugc.aweme.tools.p2348b.C46813b;
import com.p683ss.android.vesdk.C50633an;
import com.p683ss.android.vesdk.C50711k;
import com.p683ss.android.vesdk.C50720o.C50742c;
import com.p683ss.android.vesdk.C50720o.C50743d;
import com.p683ss.android.vesdk.C50720o.C50749j;
import com.p683ss.android.vesdk.VEListener.C50552p;
import com.p683ss.android.vesdk.VEUtils;
import com.p683ss.android.vesdk.filterparam.VEBaseFilterParam;
import com.p683ss.android.vesdk.filterparam.VEImageTransformFilterParam;
import dmt.p2652av.video.C52884a;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import p001a.C0011g;
import p001a.C0013i;
import p064c.p065a.C2204x;
import p064c.p065a.C2205y;
import p064c.p065a.p071d.C1710e;
import p2628d.C52847n;
import p2628d.C52856t;
import p2628d.C52857u;
import p2628d.C52860x;
import p2628d.p2629a.C52550ab;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoPresenter */
public final class VECutVideoPresenter implements C0183j {

    /* renamed from: a */
    public int f107687a;

    /* renamed from: b */
    public boolean f107688b;

    /* renamed from: c */
    public long f107689c;

    /* renamed from: d */
    public boolean f107690d;

    /* renamed from: e */
    public boolean f107691e;

    /* renamed from: f */
    public float f107692f;

    /* renamed from: g */
    public int f107693g;

    /* renamed from: h */
    public boolean f107694h;

    /* renamed from: i */
    public C42650i f107695i;

    /* renamed from: j */
    public C42484b f107696j;

    /* renamed from: k */
    public C50711k f107697k;

    /* renamed from: l */
    public VEVideoCutterViewModel f107698l;

    /* renamed from: m */
    public VideoEditViewModel f107699m;

    /* renamed from: n */
    public C43066n f107700n;

    /* renamed from: o */
    public C44307g f107701o;

    /* renamed from: p */
    public C50552p f107702p;

    /* renamed from: q */
    public final C42655m f107703q;

    /* renamed from: r */
    public boolean f107704r;

    /* renamed from: s */
    private CutMultiVideoViewModel f107705s;

    /* renamed from: t */
    private final boolean f107706t;

    /* renamed from: u */
    private boolean f107707u;

    /* renamed from: v */
    private final String f107708v;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoPresenter$a */
    static final class C42576a<T> implements C0199s<C43168a> {

        /* renamed from: a */
        final /* synthetic */ VECutVideoPresenter f107709a;

        C42576a(VECutVideoPresenter vECutVideoPresenter) {
            this.f107709a = vECutVideoPresenter;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Integer num;
            C43168a aVar = (C43168a) obj;
            if (aVar != null) {
                num = Integer.valueOf(aVar.f109120c);
            } else {
                num = null;
            }
            if (num != null && num.intValue() == 1) {
                C42650i iVar = this.f107709a.f107695i;
                if (iVar != null) {
                    iVar.mo86921a(aVar.f109121d);
                }
            } else if (num != null && num.intValue() == 2) {
                C42650i iVar2 = this.f107709a.f107695i;
                if (iVar2 != null) {
                    iVar2.mo86923b(aVar.f109121d);
                }
            } else if (num != null && num.intValue() == 3) {
                C42650i iVar3 = this.f107709a.f107695i;
                if (iVar3 != null) {
                    iVar3.mo86920a(aVar.f109119b, aVar.f109118a);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoPresenter$b */
    static final class C42577b<V> implements Callable<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C52670a f107710a;

        C42577b(C52670a aVar) {
            this.f107710a = aVar;
        }

        public final /* synthetic */ Object call() {
            this.f107710a.invoke();
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoPresenter$c */
    static final class C42578c<TTaskResult, TContinuationResult> implements C0011g<TResult, TContinuationResult> {

        /* renamed from: a */
        final /* synthetic */ VECutVideoPresenter f107711a;

        /* renamed from: b */
        final /* synthetic */ long f107712b;

        /* renamed from: c */
        final /* synthetic */ boolean f107713c;

        /* renamed from: d */
        final /* synthetic */ Workspace f107714d;

        /* renamed from: e */
        final /* synthetic */ C42837b f107715e;

        C42578c(VECutVideoPresenter vECutVideoPresenter, long j, boolean z, Workspace workspace, C42837b bVar) {
            this.f107711a = vECutVideoPresenter;
            this.f107712b = j;
            this.f107713c = z;
            this.f107714d = workspace;
            this.f107715e = bVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:10:0x0075  */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x010d  */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x0117  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Object then(p001a.C0013i r23) {
            /*
                r22 = this;
                r0 = r22
                long r1 = java.lang.System.currentTimeMillis()
                long r3 = r0.f107712b
                long r1 = r1 - r3
                if (r23 == 0) goto L_0x0019
                java.lang.Object r3 = r23.mo34e()
                java.lang.Integer r3 = (java.lang.Integer) r3
                if (r3 == 0) goto L_0x0019
                int r3 = r3.intValue()
                r10 = r3
                goto L_0x001d
            L_0x0019:
                r3 = 30
                r10 = 30
            L_0x001d:
                boolean r3 = r0.f107713c
                if (r3 != 0) goto L_0x0075
                com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoPresenter r3 = r0.f107711a
                com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel r3 = com.p683ss.android.ugc.aweme.shortvideo.cut.VECutVideoPresenter.m93496b(r3)
                java.util.List r5 = r3.mo87634l()
                java.lang.String r3 = "videoEditViewModel.originVideoList"
                p2628d.p2639f.p2641b.C52711k.m112236a(r5, r3)
                com.ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace r3 = r0.f107714d
                java.lang.String r4 = "segments"
                p2628d.p2639f.p2641b.C52711k.m112240b(r5, r4)
                java.lang.String r4 = "workspace"
                p2628d.p2639f.p2641b.C52711k.m112240b(r3, r4)
                com.ss.android.ugc.aweme.shortvideo.cut.c r20 = new com.ss.android.ugc.aweme.shortvideo.cut.c
                java.io.File r4 = r3.mo86455c()
                java.lang.String r6 = "workspace.concatVideoFile"
                p2628d.p2639f.p2641b.C52711k.m112236a(r4, r6)
                java.lang.String r6 = r4.getPath()
                java.lang.String r4 = "workspace.concatVideoFile.path"
                p2628d.p2639f.p2641b.C52711k.m112236a(r6, r4)
                java.io.File r3 = r3.mo86456d()
                java.lang.String r4 = "workspace.concatAudioFile"
                p2628d.p2639f.p2641b.C52711k.m112236a(r3, r4)
                java.lang.String r7 = r3.getPath()
                r8 = -1
                r9 = -1
                r11 = 0
                r12 = 0
                r13 = 0
                r14 = 0
                r15 = 0
                r16 = 0
                r17 = 0
                r18 = 8128(0x1fc0, float:1.139E-41)
                r19 = 0
                r4 = r20
                r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            L_0x0071:
                r3 = r20
                goto L_0x0107
            L_0x0075:
                com.ss.android.ugc.aweme.shortvideo.cut.d r3 = com.p683ss.android.ugc.aweme.shortvideo.cut.C42627d.f107836a
                com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoPresenter r3 = r0.f107711a
                com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel r3 = com.p683ss.android.ugc.aweme.shortvideo.cut.VECutVideoPresenter.m93496b(r3)
                java.util.List r5 = r3.mo87634l()
                java.lang.String r3 = "videoEditViewModel.originVideoList"
                p2628d.p2639f.p2641b.C52711k.m112236a(r5, r3)
                com.ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace r3 = r0.f107714d
                com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoPresenter r4 = r0.f107711a
                float r4 = r4.f107692f
                java.lang.String r6 = "segments"
                p2628d.p2639f.p2641b.C52711k.m112240b(r5, r6)
                java.lang.String r6 = "workspace"
                p2628d.p2639f.p2641b.C52711k.m112240b(r3, r6)
                r6 = 0
                java.lang.Object r7 = r5.get(r6)
                com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment r7 = (com.p683ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment) r7
                int r7 = r7.f107908g
                java.lang.Object r6 = r5.get(r6)
                com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment r6 = (com.p683ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment) r6
                int r6 = r6.f107909h
                int r4 = (int) r4
                r8 = 90
                if (r4 == r8) goto L_0x00bd
                r8 = 180(0xb4, float:2.52E-43)
                if (r4 == r8) goto L_0x00ba
                r8 = 270(0x10e, float:3.78E-43)
                if (r4 == r8) goto L_0x00b7
                com.ss.android.vesdk.c r4 = com.p683ss.android.vesdk.C50657c.ROTATE_NONE
                goto L_0x00bf
            L_0x00b7:
                com.ss.android.vesdk.c r4 = com.p683ss.android.vesdk.C50657c.ROTATE_270
                goto L_0x00bf
            L_0x00ba:
                com.ss.android.vesdk.c r4 = com.p683ss.android.vesdk.C50657c.ROTATE_180
                goto L_0x00bf
            L_0x00bd:
                com.ss.android.vesdk.c r4 = com.p683ss.android.vesdk.C50657c.ROTATE_90
            L_0x00bf:
                com.ss.android.vesdk.c r8 = com.p683ss.android.vesdk.C50657c.ROTATE_90
                if (r4 == r8) goto L_0x00c7
                com.ss.android.vesdk.c r8 = com.p683ss.android.vesdk.C50657c.ROTATE_270
                if (r4 != r8) goto L_0x00cc
            L_0x00c7:
                r21 = r7
                r7 = r6
                r6 = r21
            L_0x00cc:
                int r6 = r6 * 480
                int r9 = r6 / r7
                com.ss.android.ugc.aweme.shortvideo.cut.c r20 = new com.ss.android.ugc.aweme.shortvideo.cut.c
                java.io.File r4 = r3.mo86467n()
                java.lang.String r6 = "workspace.newBackgroundVideoFile"
                p2628d.p2639f.p2641b.C52711k.m112236a(r4, r6)
                java.lang.String r6 = r4.getPath()
                java.lang.String r4 = "workspace.newBackgroundVideoFile.path"
                p2628d.p2639f.p2641b.C52711k.m112236a(r6, r4)
                java.io.File r3 = r3.mo86468o()
                java.lang.String r4 = "workspace.newBackgroundAudioFile"
                p2628d.p2639f.p2641b.C52711k.m112236a(r3, r4)
                java.lang.String r7 = r3.getPath()
                r8 = 480(0x1e0, float:6.73E-43)
                r11 = 0
                r12 = 0
                r13 = 0
                r14 = 0
                r15 = 0
                r16 = 2
                r17 = 0
                r18 = 6080(0x17c0, float:8.52E-42)
                r19 = 0
                r4 = r20
                r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
                goto L_0x0071
            L_0x0107:
                com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoPresenter r4 = r0.f107711a
                com.ss.android.ugc.aweme.shortvideo.c.b r4 = r4.f107696j
                if (r4 == 0) goto L_0x0111
                r5 = 1
                r4.mo43053d(r5)
            L_0x0111:
                com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoPresenter r4 = r0.f107711a
                com.ss.android.ugc.aweme.shortvideo.c.b r4 = r4.f107696j
                if (r4 == 0) goto L_0x011b
                r5 = -1
                r4.mo43046c(r5)
            L_0x011b:
                com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoPresenter r4 = r0.f107711a
                android.a.a.a.f r5 = android.p002a.p003a.p004a.C0039f.BEGIN
                r4.mo86811a(r5)
                com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoPresenter r4 = r0.f107711a
                com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.n r4 = r4.f107700n
                com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoPresenter$c$1 r5 = new com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoPresenter$c$1
                r5.<init>(r0, r1, r3)
                com.ss.android.vesdk.VEListener$k r5 = (com.p683ss.android.vesdk.VEListener.C50547k) r5
                r4.mo87445a(r3, r5)
                d.x r1 = p2628d.C52860x.f131107a
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.cut.VECutVideoPresenter.C42578c.then(a.i):java.lang.Object");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoPresenter$d */
    public static final class C42583d<TTaskResult, TContinuationResult> implements C0011g<TResult, TContinuationResult> {

        /* renamed from: a */
        final /* synthetic */ VECutVideoPresenter f107727a;

        /* renamed from: b */
        final /* synthetic */ long f107728b;

        /* renamed from: c */
        final /* synthetic */ String f107729c;

        /* renamed from: d */
        final /* synthetic */ C42837b f107730d;

        public C42583d(VECutVideoPresenter vECutVideoPresenter, long j, String str, C42837b bVar) {
            this.f107727a = vECutVideoPresenter;
            this.f107728b = j;
            this.f107729c = str;
            this.f107730d = bVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:11:0x005e  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0055  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Object then(p001a.C0013i r22) {
            /*
                r21 = this;
                r0 = r21
                long r1 = java.lang.System.currentTimeMillis()
                long r3 = r0.f107728b
                long r1 = r1 - r3
                com.ss.android.ugc.aweme.shortvideo.cut.c r15 = new com.ss.android.ugc.aweme.shortvideo.cut.c
                com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoPresenter r3 = r0.f107727a
                com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel r3 = com.p683ss.android.ugc.aweme.shortvideo.cut.VECutVideoPresenter.m93496b(r3)
                java.util.List r4 = r3.mo87634l()
                java.lang.String r3 = "videoEditViewModel.originVideoList"
                p2628d.p2639f.p2641b.C52711k.m112236a(r4, r3)
                java.lang.String r5 = r0.f107729c
                if (r22 == 0) goto L_0x002c
                java.lang.Object r3 = r22.mo34e()
                java.lang.Integer r3 = (java.lang.Integer) r3
                if (r3 == 0) goto L_0x002c
                int r3 = r3.intValue()
                r9 = r3
                goto L_0x0030
            L_0x002c:
                r3 = 30
                r9 = 30
            L_0x0030:
                r10 = 0
                r11 = 0
                r12 = 0
                r13 = 0
                r14 = 0
                r16 = 0
                r17 = 0
                r18 = 8128(0x1fc0, float:1.139E-41)
                r19 = 0
                r6 = 0
                r7 = -1
                r8 = -1
                r3 = r15
                r20 = r15
                r15 = r16
                r16 = r17
                r17 = r18
                r18 = r19
                r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
                com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoPresenter r3 = r0.f107727a
                com.ss.android.ugc.aweme.shortvideo.c.b r3 = r3.f107696j
                r4 = 1
                if (r3 == 0) goto L_0x0058
                r3.mo43053d(r4)
            L_0x0058:
                com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoPresenter r3 = r0.f107727a
                com.ss.android.ugc.aweme.shortvideo.c.b r3 = r3.f107696j
                if (r3 == 0) goto L_0x0062
                r5 = -1
                r3.mo43046c(r5)
            L_0x0062:
                com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoPresenter r3 = r0.f107727a
                android.a.a.a.f r5 = android.p002a.p003a.p004a.C0039f.BEGIN
                r3.mo86811a(r5)
                java.lang.String r3 = "encoding_video"
                java.lang.String r5 = "cut_video"
                dmt.p2652av.video.C52884a.m112519a(r4, r3, r5)
                com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoPresenter r3 = r0.f107727a
                com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.n r3 = r3.f107700n
                com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoPresenter$d$1 r4 = new com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoPresenter$d$1
                r5 = r20
                r4.<init>(r0, r1, r5)
                com.ss.android.vesdk.VEListener$k r4 = (com.p683ss.android.vesdk.VEListener.C50547k) r4
                r3.mo87445a(r5, r4)
                d.x r1 = p2628d.C52860x.f131107a
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.cut.VECutVideoPresenter.C42583d.then(a.i):java.lang.Object");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoPresenter$e */
    public static final class C42588e<T> implements C2205y<T> {

        /* renamed from: a */
        final /* synthetic */ C42629f f107742a;

        /* renamed from: b */
        final /* synthetic */ String f107743b;

        /* renamed from: c */
        final /* synthetic */ int f107744c;

        /* renamed from: d */
        final /* synthetic */ String f107745d;

        /* renamed from: e */
        final /* synthetic */ int f107746e;

        /* renamed from: f */
        final /* synthetic */ int f107747f;

        public C42588e(C42629f fVar, String str, int i, String str2, int i2, int i3) {
            this.f107742a = fVar;
            this.f107743b = str;
            this.f107744c = i;
            this.f107745d = str2;
            this.f107746e = i2;
            this.f107747f = i3;
        }

        public final void subscribe(C2204x<Integer> xVar) {
            C52711k.m112240b(xVar, "emitter");
            if (xVar.isDisposed()) {
                xVar.mo6274a((Throwable) new IllegalStateException("The job is disposed."));
            }
            xVar.mo6282a(Integer.valueOf(VEUtils.findAudioSegmentStartTimeInOrigin(this.f107743b, this.f107744c, this.f107745d, this.f107746e, this.f107747f)));
            xVar.mo6273a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoPresenter$f */
    public static final class C42589f<T> implements C1710e<Integer> {

        /* renamed from: a */
        final /* synthetic */ C42629f f107748a;

        public C42589f(C42629f fVar) {
            this.f107748a = fVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            Integer num = (Integer) obj;
            C42629f fVar = this.f107748a;
            C52711k.m112236a((Object) num, "it");
            fVar.mo86893a(num.intValue());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoPresenter$g */
    public static final class C42590g<T> implements C1710e<Throwable> {

        /* renamed from: a */
        final /* synthetic */ C42629f f107749a;

        public C42590g(C42629f fVar) {
            this.f107749a = fVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            this.f107749a.mo86894a((Exception) new IllegalStateException("The job is disposed."));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoPresenter$h */
    static final class C42591h extends C52712l implements C52671b<List<? extends VideoSegment>, C52860x> {

        /* renamed from: a */
        public static final C42591h f107750a = new C42591h();

        C42591h() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m93512a((List) obj);
            return C52860x.f131107a;
        }

        /* renamed from: a */
        public static void m93512a(List<? extends VideoSegment> list) {
            Object obj;
            Integer num;
            Object obj2;
            Integer num2;
            Integer num3;
            C52711k.m112240b(list, "segments");
            String str = "video_height";
            Iterable iterable = list;
            Iterator it = iterable.iterator();
            Object obj3 = null;
            if (!it.hasNext()) {
                obj = null;
            } else {
                obj = it.next();
                if (it.hasNext()) {
                    int i = ((VideoSegment) obj).f107909h;
                    do {
                        Object next = it.next();
                        int i2 = ((VideoSegment) next).f107909h;
                        if (i < i2) {
                            obj = next;
                            i = i2;
                        }
                    } while (it.hasNext());
                }
            }
            VideoSegment videoSegment = (VideoSegment) obj;
            if (videoSegment != null) {
                num = Integer.valueOf(videoSegment.f107909h);
            } else {
                num = Integer.valueOf(0);
            }
            C52884a.m112519a(1, str, num);
            String str2 = "video_width";
            Iterator it2 = iterable.iterator();
            if (!it2.hasNext()) {
                obj2 = null;
            } else {
                obj2 = it2.next();
                if (it2.hasNext()) {
                    int i3 = ((VideoSegment) obj2).f107908g;
                    do {
                        Object next2 = it2.next();
                        int i4 = ((VideoSegment) next2).f107908g;
                        if (i3 < i4) {
                            obj2 = next2;
                            i3 = i4;
                        }
                    } while (it2.hasNext());
                }
            }
            VideoSegment videoSegment2 = (VideoSegment) obj2;
            if (videoSegment2 != null) {
                num2 = Integer.valueOf(videoSegment2.f107908g);
            } else {
                num2 = Integer.valueOf(0);
            }
            C52884a.m112519a(1, str2, num2);
            String str3 = "video_fps";
            Iterator it3 = iterable.iterator();
            if (it3.hasNext()) {
                obj3 = it3.next();
                if (it3.hasNext()) {
                    int b = ((VideoSegment) obj3).mo86945b();
                    do {
                        Object next3 = it3.next();
                        int b2 = ((VideoSegment) next3).mo86945b();
                        if (b < b2) {
                            obj3 = next3;
                            b = b2;
                        }
                    } while (it3.hasNext());
                }
            }
            VideoSegment videoSegment3 = (VideoSegment) obj3;
            if (videoSegment3 != null) {
                num3 = Integer.valueOf(videoSegment3.mo86945b());
            } else {
                num3 = Integer.valueOf(0);
            }
            C52884a.m112519a(1, str3, num3);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoPresenter$i */
    static final class C42592i extends C52712l implements C52671b<long[], List<? extends VideoSegment>> {

        /* renamed from: a */
        final /* synthetic */ VECutVideoPresenter f107751a;

        C42592i(VECutVideoPresenter vECutVideoPresenter) {
            this.f107751a = vECutVideoPresenter;
            super(1);
        }

        /* renamed from: a */
        public final List<VideoSegment> invoke(long[] jArr) {
            long[] jArr2 = jArr;
            C52711k.m112240b(jArr2, "targetBoundary");
            if (this.f107751a.f107703q.bT_() == 0 || (C43036f.f108637b.mo87419f() && this.f107751a.f107690d)) {
                jArr2[0] = -1;
                jArr2[1] = -1;
                List l = VECutVideoPresenter.m93496b(this.f107751a).mo87634l();
                C52711k.m112236a((Object) l, "videoEditViewModel.originVideoList");
                Iterable iterable = l;
                Collection arrayList = new ArrayList();
                for (Object next : iterable) {
                    if (!((VideoSegment) next).f107911j) {
                        arrayList.add(next);
                    }
                }
                return (List) arrayList;
            }
            List<VideoSegment> arrayList2 = new ArrayList<>();
            C0794k bR_ = this.f107751a.f107703q.bR_();
            Long l2 = (Long) bR_.f2711a;
            if (l2 == null) {
                l2 = Long.valueOf(0);
            }
            C52711k.m112236a((Object) l2, "boundary.first ?: 0");
            long longValue = l2.longValue();
            Long l3 = (Long) bR_.f2712b;
            if (l3 == null) {
                l3 = Long.valueOf(this.f107751a.f107703q.bQ_());
            }
            C52711k.m112236a((Object) l3, "boundary.second ?: viewProvider.maxDuration()");
            long longValue2 = l3.longValue();
            List l4 = VECutVideoPresenter.m93496b(this.f107751a).mo87634l();
            C52711k.m112236a((Object) l4, "videoEditViewModel.originVideoList");
            Iterable iterable2 = l4;
            Collection arrayList3 = new ArrayList();
            for (Object next2 : iterable2) {
                if (!((VideoSegment) next2).f107911j) {
                    arrayList3.add(next2);
                }
            }
            List list = (List) arrayList3;
            int size = list.size();
            long j = 0;
            long j2 = 0;
            for (int i = 0; i < size && j <= longValue2; i++) {
                VideoSegment videoSegment = (VideoSegment) list.get(i);
                C52711k.m112236a((Object) videoSegment, "segment");
                j += videoSegment.mo86953g() - videoSegment.mo86952f();
                if (longValue > j) {
                    j2 += videoSegment.mo86953g() - videoSegment.mo86952f();
                } else {
                    arrayList2.add(videoSegment);
                }
            }
            long j3 = longValue - j2;
            if (j3 < 0) {
                j3 = 0;
            }
            jArr2[0] = j3;
            jArr2[1] = j - longValue2;
            return arrayList2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoPresenter$j */
    static final class C42593j<V> implements Callable<TResult> {

        /* renamed from: a */
        final /* synthetic */ VECutVideoPresenter f107752a;

        C42593j(VECutVideoPresenter vECutVideoPresenter) {
            this.f107752a = vECutVideoPresenter;
        }

        public final /* synthetic */ Object call() {
            List<VideoSegment> l = VECutVideoPresenter.m93496b(this.f107752a).mo87634l();
            int i = 0;
            if (l != null) {
                if (!(!l.isEmpty())) {
                    l = null;
                }
                if (l != null) {
                    for (VideoSegment videoSegment : l) {
                        if (videoSegment != null && !videoSegment.f107911j && videoSegment.mo86945b() > i) {
                            i = videoSegment.mo86945b();
                        }
                    }
                }
            }
            int a = C42447bc.m93239a();
            if (a > 0) {
                if (i > a) {
                    i = a;
                }
            } else if (51 <= i && 74 >= i) {
                i /= 2;
            } else if (i >= 75) {
                i /= 3;
            }
            return Integer.valueOf(i);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoPresenter$k */
    static final class C42594k implements C50711k {

        /* renamed from: a */
        final /* synthetic */ VECutVideoPresenter f107753a;

        C42594k(VECutVideoPresenter vECutVideoPresenter) {
            this.f107753a = vECutVideoPresenter;
        }

        public final void onCallback(int i, int i2, float f, String str) {
            if (i == 4101) {
                VECutVideoPresenter.m93494a((C52670a<C52860x>) new C52670a<C52860x>(this) {

                    /* renamed from: a */
                    final /* synthetic */ C42594k f107754a;

                    {
                        this.f107754a = r1;
                    }

                    public final /* synthetic */ Object invoke() {
                        if (this.f107754a.f107753a.f107704r) {
                            VECutVideoPresenter.m93490a(this.f107754a.f107753a).mo87731a(new C43168a(1, false));
                        } else {
                            VECutVideoPresenter.m93490a(this.f107754a.f107753a).mo87731a(new C43168a(2, false));
                        }
                        return C52860x.f131107a;
                    }
                });
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoPresenter$l */
    static final class C42596l implements C50552p {

        /* renamed from: a */
        final /* synthetic */ VECutVideoPresenter f107755a;

        C42596l(VECutVideoPresenter vECutVideoPresenter) {
            this.f107755a = vECutVideoPresenter;
        }

        /* renamed from: a */
        public final void mo43097a() {
            VECutVideoPresenter.m93494a((C52670a<C52860x>) new C52670a<C52860x>(this) {

                /* renamed from: a */
                final /* synthetic */ C42596l f107756a;

                {
                    this.f107756a = r1;
                }

                public final /* synthetic */ Object invoke() {
                    if (this.f107756a.f107755a.f107688b) {
                        this.f107756a.f107755a.f107703q.bW_();
                        this.f107756a.f107755a.f107688b = false;
                    }
                    return C52860x.f131107a;
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoPresenter$m */
    static final class C42598m extends C52712l implements C52670a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ VECutVideoPresenter f107757a;

        C42598m(VECutVideoPresenter vECutVideoPresenter) {
            this.f107757a = vECutVideoPresenter;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Boolean.valueOf(mo86828a());
        }

        /* renamed from: a */
        public final boolean mo86828a() {
            List l = VECutVideoPresenter.m93496b(this.f107757a).mo87634l();
            C52711k.m112236a((Object) l, "videoEditViewModel.originVideoList");
            Iterable iterable = l;
            Collection arrayList = new ArrayList();
            for (Object next : iterable) {
                if (true ^ ((VideoSegment) next).f107911j) {
                    arrayList.add(next);
                }
            }
            List list = (List) arrayList;
            int size = list.size();
            int i = 0;
            while (i < size) {
                VideoSegment videoSegment = (VideoSegment) list.get(i);
                String a = videoSegment.mo86941a(false);
                C52711k.m112236a((Object) a, "segment.getPath(false)");
                if (C44300e.m97039a(a)) {
                    this.f107757a.f107687a = -11009;
                    return false;
                }
                int min = Math.min(videoSegment.f107908g, videoSegment.f107909h);
                int max = Math.max(videoSegment.f107908g, videoSegment.f107909h);
                try {
                    C45465y yVar = C45465y.f114888a;
                    C52711k.m112236a((Object) videoSegment, "segment");
                    C52847n a2 = yVar.mo91749a(min, max, (int) (((float) videoSegment.mo86945b()) * videoSegment.mo86954h()));
                    this.f107757a.f107687a = ((Number) a2.getFirst()).intValue();
                    if (this.f107757a.f107687a != 0) {
                        return false;
                    }
                    i++;
                } catch (Exception e) {
                    C45407ay.m98971b(e.getMessage());
                }
            }
            return true;
        }
    }

    /* renamed from: a */
    public final void mo86812a(FragmentActivity fragmentActivity) {
        C52711k.m112240b(fragmentActivity, "activity");
        C0209x a = C0214z.m440a(fragmentActivity).mo359a(CutMultiVideoViewModel.class);
        C52711k.m112236a((Object) a, "ViewModelProviders.of(ac…deoViewModel::class.java]");
        this.f107705s = (CutMultiVideoViewModel) a;
        C0209x a2 = C0214z.m440a(fragmentActivity).mo359a(VEVideoCutterViewModel.class);
        C52711k.m112236a((Object) a2, "ViewModelProviders.of(ac…terViewModel::class.java]");
        this.f107698l = (VEVideoCutterViewModel) a2;
        C0209x a3 = C0214z.m440a(fragmentActivity).mo359a(VideoEditViewModel.class);
        C52711k.m112236a((Object) a3, "ViewModelProviders.of(ac…ditViewModel::class.java]");
        this.f107699m = (VideoEditViewModel) a3;
        this.f107707u = C52711k.m112239a((Object) "from_chat", (Object) fragmentActivity.getIntent().getStringExtra("enter_from"));
        this.f107703q.bP_().getLifecycle().mo324a(this);
        VEVideoCutterViewModel vEVideoCutterViewModel = this.f107698l;
        if (vEVideoCutterViewModel == null) {
            C52711k.m112237a("veVideoCutterViewModel");
        }
        vEVideoCutterViewModel.mo87730a().observe(this.f107703q.bP_(), new C42576a(this));
    }

    /* renamed from: a */
    public final void mo86816a(List<? extends VideoSegment> list, int i) {
        C0794k bR_ = this.f107703q.bR_();
        Long l = (Long) bR_.f2711a;
        if (l == null) {
            l = Long.valueOf(0);
        }
        C52711k.m112236a((Object) l, "boundary.first ?: 0");
        long longValue = l.longValue();
        Long l2 = (Long) bR_.f2712b;
        if (l2 == null) {
            l2 = Long.valueOf(this.f107703q.bQ_());
        }
        C52711k.m112236a((Object) l2, "boundary.second ?: viewProvider.maxDuration()");
        this.f107700n.mo87446a(list, i, longValue, l2.longValue());
    }

    /* renamed from: a */
    public final void mo86817a(List<? extends VideoSegment> list, boolean z) {
        C43066n nVar = this.f107700n;
        if (nVar.f108714c) {
            C42648h hVar = nVar.f108713b;
            if (hVar != null) {
                hVar.mo86913a(list, z);
            }
        } else {
            C42648h hVar2 = nVar.f108712a;
            if (hVar2 != null) {
                hVar2.mo86913a(list, z);
            }
        }
        this.f107701o.mo90198a(list);
    }

    /* renamed from: a */
    public final void mo86813a(C0794k<Long, Long> kVar) {
        long j;
        C52711k.m112240b(kVar, "boundary");
        long bQ_ = this.f107703q.bQ_();
        if (kVar.f2711a != null) {
            F f = kVar.f2711a;
            if (f == null) {
                C52711k.m112234a();
            }
            j = ((Number) f).longValue();
        } else {
            j = 0;
        }
        if (kVar.f2712b != null) {
            S s = kVar.f2712b;
            if (s == null) {
                C52711k.m112234a();
            }
            bQ_ = ((Number) s).longValue();
        }
        C43066n nVar = this.f107700n;
        int i = (int) j;
        int i2 = (int) bQ_;
        if (nVar.f108714c) {
            C42648h hVar = nVar.f108713b;
            if (hVar != null) {
                hVar.mo86918b(i, i2);
            }
        } else {
            C42648h hVar2 = nVar.f108712a;
            if (hVar2 != null) {
                hVar2.mo86918b(i, i2);
            }
        }
    }

    /* renamed from: a */
    public final void mo86811a(C0039f fVar) {
        if (this.f107706t) {
            C0037d.m58b().mo52a(C0030a.f85g, fVar);
        }
    }

    /* renamed from: a */
    public final void mo86814a(Workspace workspace, boolean z, boolean z2, C42837b bVar, boolean z3) {
        boolean z4;
        C52711k.m112240b(workspace, "workspace");
        C52711k.m112240b(bVar, "listener");
        if (!this.f107694h) {
            C45407ay.m98968a("VECutVideo,return compile because of editor not init");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        C42484b bVar2 = this.f107696j;
        VideoEditViewModel videoEditViewModel = this.f107699m;
        if (videoEditViewModel == null) {
            C52711k.m112237a("videoEditViewModel");
        }
        List l = videoEditViewModel.mo87634l();
        C52711k.m112236a((Object) l, "videoEditViewModel.originVideoList");
        C52711k.m112240b(l, "segments");
        C42650i iVar = this.f107695i;
        this.f107691e = iVar != null ? iVar.mo86927d() : false;
        VEVideoCutterViewModel vEVideoCutterViewModel = this.f107698l;
        if (vEVideoCutterViewModel == null) {
            C52711k.m112237a("veVideoCutterViewModel");
        }
        vEVideoCutterViewModel.mo87731a(new C43168a(2, true));
        C42650i iVar2 = this.f107695i;
        this.f107689c = iVar2 != null ? iVar2.mo86919a() : 0;
        C42598m mVar = new C42598m(this);
        if (z2) {
            this.f107687a = -11008;
        } else if (!z) {
            if (C39629l.m88232a().mo58583n().mo83103a(C40790a.EnableVEFastImport)) {
                if (this.f107703q.bT_() == 0) {
                    z4 = mVar.mo86828a();
                } else if (C39629l.m88232a().mo58583n().mo83103a(C40790a.EnableMultiFastImport)) {
                    z4 = mVar.mo86828a();
                } else {
                    this.f107687a = -11007;
                }
                if (z4 || z3) {
                    bVar.mo86846a(false);
                    C45407ay.m98968a("VECutVideo,using normalImport strategy");
                    C0013i e = mo86823e();
                    C42578c cVar = new C42578c(this, currentTimeMillis, z, workspace, bVar);
                    e.mo19a((C0011g<TResult, TContinuationResult>) cVar);
                }
                bVar.mo86846a(true);
                C45407ay.m98968a("VECutVideo,using fastImport strategy");
                bVar.onCompileDone();
                if (mo86821d()) {
                    C42484b bVar3 = this.f107696j;
                    if (bVar3 != null) {
                        bVar3.f55837d.mo99383j();
                    }
                    C42484b bVar4 = this.f107696j;
                    if (bVar4 != null) {
                        bVar4.f55837d.mo99386l();
                    }
                    this.f107694h = false;
                    return;
                }
                destroy();
                return;
            }
            this.f107687a = -2;
        }
        z4 = false;
        if (z4) {
        }
        bVar.mo86846a(false);
        C45407ay.m98968a("VECutVideo,using normalImport strategy");
        C0013i e2 = mo86823e();
        C42578c cVar2 = new C42578c(this, currentTimeMillis, z, workspace, bVar);
        e2.mo19a((C0011g<TResult, TContinuationResult>) cVar2);
    }

    /* renamed from: a */
    public final boolean mo86818a(VideoSegment videoSegment) {
        boolean z = false;
        if (videoSegment != null) {
            int i = videoSegment.f107908g;
            int i2 = videoSegment.f107909h;
            int b = videoSegment.mo86945b();
            if (i > i2) {
                int i3 = i2;
                i2 = i;
                i = i3;
            }
            if ((i >= 1080 || i2 >= 1920) && (i > 1080 || i2 > 1920 || b >= 35)) {
                return false;
            }
            z = true;
        }
        return z;
    }

    /* renamed from: a */
    public final void mo86815a(VideoSegment videoSegment, long j, long j2) {
        C44307g gVar = this.f107701o;
        if (C44300e.m97041c() && gVar.f112172a != null && videoSegment != null) {
            gVar.mo90197a();
            if (gVar.f112173b) {
                String a = videoSegment.mo86941a(false);
                C52711k.m112236a((Object) a, "videoSegment.getPath(false)");
                if (C44300e.m97039a(a)) {
                    VEImageTransformFilterParam a2 = C44307g.m97050a(videoSegment.f107920s);
                    if (a2 != null) {
                        C20347c cVar = gVar.f112172a;
                        if (cVar == null) {
                            C52711k.m112234a();
                        }
                        VEBaseFilterParam vEBaseFilterParam = a2;
                        int a3 = cVar.mo42975a(0, 0, vEBaseFilterParam, (int) j, (int) j2);
                        C20347c cVar2 = gVar.f112172a;
                        if (cVar2 == null) {
                            C52711k.m112234a();
                        }
                        cVar2.mo42982a(a3, vEBaseFilterParam);
                        gVar.f112174c.add(Integer.valueOf(a3));
                    }
                }
            }
        }
    }

    /* renamed from: c */
    public final boolean mo86820c() {
        C42650i iVar = this.f107695i;
        if (iVar != null) {
            return iVar.mo86922b();
        }
        return false;
    }

    /* renamed from: b */
    public final long mo86819b() {
        C42650i iVar = this.f107695i;
        if (iVar != null) {
            return iVar.mo86919a();
        }
        return 0;
    }

    /* renamed from: e */
    public final C0013i<Integer> mo86823e() {
        C0013i<Integer> a = C0013i.m16a((Callable<TResult>) new C42593j<TResult>(this));
        C52711k.m112236a((Object) a, "Task.callInBackground {\n…}\n            }\n        }");
        return a;
    }

    /* renamed from: d */
    public final boolean mo86821d() {
        try {
            IESSettingsProxy b = C32816h.m75716b();
            C52711k.m112236a((Object) b, "SettingsReader.get()");
            Boolean enableReuseEditorForFastimport = b.getEnableReuseEditorForFastimport();
            C52711k.m112236a((Object) enableReuseEditorForFastimport, "SettingsReader.get().ena…eReuseEditorForFastimport");
            if (!enableReuseEditorForFastimport.booleanValue() || this.f107703q.bT_() != 0 || this.f107707u) {
                return false;
            }
            return true;
        } catch (C10174a unused) {
            return false;
        }
    }

    @C0200t(mo345a = C0177a.ON_DESTROY)
    public final void destroy() {
        if (this.f107694h) {
            this.f107694h = false;
            C42484b bVar = this.f107696j;
            if (bVar != null) {
                bVar.mo43082p();
            }
            this.f107703q.bV_();
            if (this.f107695i != null) {
                if (this.f107695i == null) {
                    C52711k.m112234a();
                }
                this.f107695i = null;
            }
        }
    }

    /* renamed from: a */
    public final long mo86808a() {
        C42650i iVar = this.f107695i;
        if (iVar != null) {
            return iVar.mo86924c();
        }
        return 0;
    }

    @C0200t(mo345a = C0177a.ON_RESUME)
    public final void performInit() {
        int i;
        boolean z;
        int i2;
        boolean z2 = true;
        if (!this.f107694h) {
            VideoEditViewModel videoEditViewModel = this.f107699m;
            if (videoEditViewModel == null) {
                C52711k.m112237a("videoEditViewModel");
            }
            C0198r<CutVideoContext> rVar = videoEditViewModel.f108926u;
            C52711k.m112236a((Object) rVar, "videoEditViewModel.cutVideoContext");
            if (rVar.getValue() == null) {
                C45407ay.m98971b("VECutVideoPresenter,init error because of null cutVideoContext");
            } else {
                VideoEditViewModel videoEditViewModel2 = this.f107699m;
                if (videoEditViewModel2 == null) {
                    C52711k.m112237a("videoEditViewModel");
                }
                List l = videoEditViewModel2.mo87634l();
                if (l != null) {
                    i = l.size();
                } else {
                    i = 0;
                }
                if (i != 0) {
                    this.f107694h = true;
                    C42484b bVar = new C42484b(this.f107708v, this.f107703q.bU_());
                    VECutVideoPresenter vECutVideoPresenter = this;
                    if (vECutVideoPresenter.f107697k == null) {
                        this.f107697k = new C42594k(this);
                    }
                    C50711k kVar = this.f107697k;
                    if (kVar == null) {
                        C52711k.m112237a("infoCallback");
                    }
                    bVar.mo43039b(kVar);
                    bVar.mo42995a(C50742c.SCALE_MODE_CENTER_INSIDE);
                    bVar.mo43019a(true);
                    if (vECutVideoPresenter.f107702p == null) {
                        this.f107702p = new C42596l(this);
                    }
                    C50552p pVar = this.f107702p;
                    if (pVar == null) {
                        C52711k.m112237a("firstFrameListener");
                    }
                    bVar.mo43016a(pVar);
                    this.f107696j = bVar;
                    List arrayList = new ArrayList();
                    int[] iArr = new int[i];
                    int[] iArr2 = new int[i];
                    float[] fArr = new float[i];
                    int[] iArr3 = new int[i];
                    m93495a(l, arrayList, iArr, iArr2, fArr, iArr3);
                    Collection collection = arrayList;
                    Object[] array = collection.toArray(new String[0]);
                    if (array != null) {
                        C50633an anVar = new C50633an((String[]) array);
                        C42484b bVar2 = this.f107696j;
                        if (bVar2 == null) {
                            C52711k.m112234a();
                        }
                        C42669p pVar2 = new C42669p(bVar2, anVar);
                        C42484b bVar3 = this.f107696j;
                        if (bVar3 == null) {
                            C52711k.m112234a();
                        }
                        C42991d dVar = new C42991d(bVar3, anVar);
                        this.f107700n.f108712a = pVar2;
                        this.f107700n.f108713b = dVar;
                        this.f107701o.f112172a = this.f107696j;
                        Context a = this.f107703q.mo86847a();
                        C42484b bVar4 = this.f107696j;
                        if (bVar4 == null) {
                            C52711k.m112234a();
                        }
                        C42671q qVar = new C42671q(a, bVar4, this.f107703q.bU_(), this.f107703q.bP_(), this.f107704r);
                        this.f107695i = qVar;
                        C42484b bVar5 = this.f107696j;
                        if (bVar5 != null) {
                            if (!C43036f.f108637b.mo87419f() || arrayList.size() <= 1) {
                                z = false;
                            } else {
                                z = true;
                            }
                            if (z) {
                                Object[] array2 = collection.toArray(new String[0]);
                                if (array2 != null) {
                                    i2 = bVar5.mo42990a(new C20350f((String[]) array2, C50749j.VIDEO_OUT_RATIO_ORIGINAL));
                                } else {
                                    throw new C52857u("null cannot be cast to non-null type kotlin.Array<T>");
                                }
                            } else {
                                Object[] array3 = collection.toArray(new String[0]);
                                if (array3 != null) {
                                    C20349e eVar = new C20349e((String[]) array3);
                                    eVar.mo43100a(C50749j.VIDEO_OUT_RATIO_ORIGINAL);
                                    eVar.f55846a = iArr;
                                    eVar.f55847b = iArr2;
                                    eVar.f55852g = fArr;
                                    i2 = bVar5.mo42990a(eVar);
                                } else {
                                    throw new C52857u("null cannot be cast to non-null type kotlin.Array<T>");
                                }
                            }
                            if (i2 == 0) {
                                List list = l;
                                C46813b.m101660a(anVar, l, iArr, iArr2, fArr, iArr3);
                                C42484b bVar6 = this.f107696j;
                                if (bVar6 != null) {
                                    bVar6.mo42993a(anVar);
                                }
                                this.f107701o.mo90198a(list);
                                bVar5.mo43038b(this.f107693g);
                                int a2 = C42447bc.m93239a();
                                if (a2 <= 0) {
                                    a2 = 30;
                                }
                                bVar5.mo43067i(a2);
                                bVar5.mo43021a(0, 1, 0.5f);
                                if (C39629l.m88232a().mo58583n().mo83104b(C40790a.EnableImportAvSync) != 512) {
                                    bVar5.mo43046c(1);
                                } else if (!z || !this.f107690d) {
                                    bVar5.mo43046c(1);
                                } else {
                                    bVar5.mo43046c(0);
                                }
                                bVar5.mo43052d(C39629l.m88232a().mo58579j().getVideoWidth(), C39629l.m88232a().mo58579j().getVideoHeight());
                                bVar5.mo43040b(C39629l.m88232a().mo58583n().mo83103a(C40790a.EnableSlimVECutProcessor));
                                bVar5.mo43077n();
                                C0794k bR_ = this.f107703q.bR_();
                                Long l2 = (Long) bR_.f2711a;
                                if (l2 == null) {
                                    l2 = Long.valueOf(0);
                                }
                                C52711k.m112236a((Object) l2, "boundary.first ?: 0");
                                long longValue = l2.longValue();
                                Long l3 = (Long) bR_.f2712b;
                                if (l3 == null) {
                                    l3 = Long.valueOf(this.f107703q.bQ_());
                                }
                                C52711k.m112236a((Object) l3, "boundary.second ?: viewProvider.maxDuration()");
                                bVar5.mo43028b((int) longValue, (int) l3.longValue());
                                if (list != null && (!list.isEmpty())) {
                                    VideoSegment videoSegment = (VideoSegment) list.get(0);
                                    if (this.f107703q.bT_() == 0 && videoSegment.f107912k > 0) {
                                        this.f107700n.mo87447a((float) videoSegment.f107912k, videoSegment.f107913l, videoSegment.f107914m, 0, 0);
                                    }
                                }
                                if (this.f107691e) {
                                    C42650i iVar = this.f107695i;
                                    if (iVar != null) {
                                        iVar.mo86925c(this.f107691e);
                                    }
                                    this.f107691e = false;
                                }
                                if (!z || !this.f107690d) {
                                    C42650i iVar2 = this.f107695i;
                                    if (iVar2 != null) {
                                        iVar2.mo86920a(this.f107689c, C50743d.EDITOR_SEEK_FLAG_LastSeek);
                                    }
                                }
                                this.f107703q.mo86848a(this.f107696j);
                            }
                        }
                    } else {
                        throw new C52857u("null cannot be cast to non-null type kotlin.Array<T>");
                    }
                }
            }
            z2 = false;
        }
        if (!z2) {
            this.f107703q.bS_();
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ VEVideoCutterViewModel m93490a(VECutVideoPresenter vECutVideoPresenter) {
        VEVideoCutterViewModel vEVideoCutterViewModel = vECutVideoPresenter.f107698l;
        if (vEVideoCutterViewModel == null) {
            C52711k.m112237a("veVideoCutterViewModel");
        }
        return vEVideoCutterViewModel;
    }

    /* renamed from: b */
    public static final /* synthetic */ VideoEditViewModel m93496b(VECutVideoPresenter vECutVideoPresenter) {
        VideoEditViewModel videoEditViewModel = vECutVideoPresenter.f107699m;
        if (videoEditViewModel == null) {
            C52711k.m112237a("videoEditViewModel");
        }
        return videoEditViewModel;
    }

    /* renamed from: a */
    public static void m93494a(C52670a<C52860x> aVar) {
        C0013i.m18a((Callable<TResult>) new C42577b<TResult>(aVar), C0013i.f25b);
    }

    /* renamed from: a */
    public final void mo86810a(int i) {
        VideoEditViewModel videoEditViewModel = this.f107699m;
        if (videoEditViewModel == null) {
            C52711k.m112237a("videoEditViewModel");
        }
        VideoSegment e = videoEditViewModel.mo87626e(i);
        if (e != null) {
            C43066n nVar = this.f107700n;
            if (e != null) {
                if (nVar.f108714c) {
                    C42648h hVar = nVar.f108713b;
                    if (hVar != null) {
                        hVar.mo86909a(i, e);
                    }
                } else {
                    C42648h hVar2 = nVar.f108712a;
                    if (hVar2 != null) {
                        hVar2.mo86909a(i, e);
                    }
                }
            }
            C44307g gVar = this.f107701o;
            if (!(!C44300e.m97041c() || gVar.f112172a == null || e == null)) {
                gVar.mo90197a();
                if (gVar.f112173b) {
                    String a = e.mo86941a(false);
                    C52711k.m112236a((Object) a, "videoSegment.getPath(false)");
                    if (C44300e.m97039a(a)) {
                        VEImageTransformFilterParam a2 = C44307g.m97050a(e.f107920s);
                        if (a2 != null) {
                            C20347c cVar = gVar.f112172a;
                            if (cVar == null) {
                                C52711k.m112234a();
                            }
                            VEBaseFilterParam vEBaseFilterParam = a2;
                            int a3 = cVar.mo42975a(0, 0, vEBaseFilterParam, (int) e.mo86952f(), (int) (e.mo86953g() - e.mo86952f()));
                            C20347c cVar2 = gVar.f112172a;
                            if (cVar2 == null) {
                                C52711k.m112234a();
                            }
                            cVar2.mo42982a(a3, vEBaseFilterParam);
                            gVar.f112174c.add(Integer.valueOf(a3));
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final EditPreviewInfo mo86809a(boolean z, Workspace workspace) {
        C42592i iVar = new C42592i(this);
        if (z) {
            this.f107703q.bX_();
            List arrayList = new ArrayList();
            long[] jArr = new long[2];
            List a = iVar.invoke(jArr);
            C42591h.m93512a(a);
            Iterable<VideoSegment> iterable = a;
            Collection arrayList2 = new ArrayList(C52575l.m112104a(iterable, 10));
            for (VideoSegment a2 : iterable) {
                arrayList2.add(C43668b.m95932a(a2));
            }
            List list = (List) arrayList2;
            if (!(!list.isEmpty())) {
                list = null;
            }
            if (list != null) {
                arrayList.addAll(list);
            }
            long[] jArr2 = {jArr[0], jArr[1]};
            long j = jArr2[0];
            long j2 = jArr2[1];
            if (j >= 0) {
                VideoCutInfo videoCutInfo = ((EditVideoSegment) arrayList.get(0)).getVideoCutInfo();
                if (videoCutInfo != null) {
                    EditVideoSegment editVideoSegment = (EditVideoSegment) arrayList.get(0);
                    VideoCutInfo videoCutInfo2 = new VideoCutInfo(videoCutInfo.getStart() + j, videoCutInfo.getEnd(), videoCutInfo.getSpeed(), videoCutInfo.getRotate());
                    arrayList.set(0, EditVideoSegment.copy$default(editVideoSegment, null, null, null, videoCutInfo2, 7, null));
                }
            }
            if (j2 >= 0) {
                VideoCutInfo videoCutInfo3 = ((EditVideoSegment) arrayList.get(arrayList.size() - 1)).getVideoCutInfo();
                if (videoCutInfo3 != null) {
                    int size = arrayList.size() - 1;
                    EditVideoSegment editVideoSegment2 = (EditVideoSegment) arrayList.get(arrayList.size() - 1);
                    VideoCutInfo videoCutInfo4 = new VideoCutInfo(videoCutInfo3.getStart(), videoCutInfo3.getEnd() - j2, videoCutInfo3.getSpeed(), videoCutInfo3.getRotate());
                    arrayList.set(size, EditVideoSegment.copy$default(editVideoSegment2, null, null, null, videoCutInfo4, 7, null));
                }
            }
            C43672e eVar = new C43672e(C39629l.m88232a().mo58579j().getVideoWidth(), C39629l.m88232a().mo58579j().getVideoHeight(), 0, 0, 12, null);
            return eVar.mo89102a(arrayList);
        }
        C43674g gVar = new C43674g(0, 0, 0, 0, 15, null);
        File c = workspace.mo86455c();
        C52711k.m112236a((Object) c, "workspace.concatVideoFile");
        String path = c.getPath();
        C52711k.m112236a((Object) path, "workspace.concatVideoFile.path");
        File d = workspace.mo86456d();
        C52711k.m112236a((Object) d, "workspace.concatAudioFile");
        String path2 = d.getPath();
        File c2 = workspace.mo86455c();
        C52711k.m112236a((Object) c2, "workspace.concatVideoFile");
        return gVar.mo89103a(new EditVideoSegment(path, path2, C43668b.m95933a(c2.getPath())));
    }

    public VECutVideoPresenter(String str, C42655m mVar, boolean z) {
        C52711k.m112240b(str, "workspace");
        C52711k.m112240b(mVar, "viewProvider");
        this.f107708v = str;
        this.f107703q = mVar;
        this.f107704r = z;
        this.f107687a = -1;
        this.f107688b = true;
        this.f107690d = C43036f.m94313g();
        this.f107693g = C46788b.f118235d.mo94007a(true, false, false, false, false);
        this.f107700n = new C43066n();
        this.f107701o = new C44307g();
        this.f107706t = C39629l.m88232a().mo58583n().mo83103a(C40790a.EnableVboostOpt);
    }

    public /* synthetic */ VECutVideoPresenter(String str, C42655m mVar, boolean z, int i, C52707g gVar) {
        this(str, mVar, true);
    }

    /* renamed from: a */
    public static void m93491a(int i, long j, long j2, C42626c cVar, int i2, String str) {
        C23569o.m57776a("av_ve_import_compile", i, C46812a.m101655a(C52550ab.m112050a(C52856t.m112465a("fps_time", String.valueOf(j)), C52856t.m112465a("compile_time", String.valueOf(j2)), C52856t.m112465a("is_hard_encode", String.valueOf(cVar.f107829g)), C52856t.m112465a("fps", String.valueOf(cVar.f107828f)), C52856t.m112465a("errorCode", String.valueOf(i2)), C52856t.m112465a("error_message", str))));
    }

    /* renamed from: a */
    private final void m93495a(List<? extends VideoSegment> list, List<String> list2, int[] iArr, int[] iArr2, float[] fArr, int[] iArr3) {
        if (list != null) {
            if (!(!list.isEmpty())) {
                list = null;
            }
            if (list != null) {
                int i = 0;
                for (Object next : list) {
                    int i2 = i + 1;
                    if (i < 0) {
                        C52575l.m112100b();
                    }
                    VideoSegment videoSegment = (VideoSegment) next;
                    String a = videoSegment.mo86941a(false);
                    C52711k.m112236a((Object) a, "videoSegment.getPath(false)");
                    list2.add(a);
                    iArr[i] = (int) videoSegment.mo86952f();
                    iArr2[i] = (int) videoSegment.mo86953g();
                    fArr[i] = videoSegment.mo86954h();
                    iArr3[i] = videoSegment.f107912k;
                    i = i2;
                }
                if (this.f107703q.bT_() == 0) {
                    iArr[0] = 0;
                    iArr2[0] = (int) ((VideoSegment) list.get(0)).f107904c;
                    iArr3[0] = 0;
                }
            }
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m93492a(VECutVideoPresenter vECutVideoPresenter, int i, float f, boolean z, float f2, float f3, int i2, int i3, int i4, Object obj) {
        boolean z2;
        float f4;
        int i5;
        VECutVideoPresenter vECutVideoPresenter2 = vECutVideoPresenter;
        float f5 = f;
        if ((i4 & 4) != 0) {
            z2 = true;
        } else {
            z2 = z;
        }
        float f6 = 1.0f;
        if ((i4 & 8) != 0) {
            f4 = 1.0f;
        } else {
            f4 = f2;
        }
        if ((i4 & 16) == 0) {
            f6 = f3;
        }
        int i6 = 0;
        if ((i4 & 32) != 0) {
            i5 = 0;
        } else {
            i5 = i2;
        }
        if ((i4 & 64) == 0) {
            i6 = i3;
        }
        vECutVideoPresenter2.f107692f = f5;
        if (z2) {
            vECutVideoPresenter2.f107700n.mo87447a(f, f4, f6, i5, i6);
            return;
        }
        C43066n nVar = vECutVideoPresenter2.f107700n;
        if (nVar.f108712a != null) {
            C42648h hVar = nVar.f108712a;
            if (hVar == null) {
                C52711k.m112234a();
            }
            int i7 = i;
            hVar.mo86916a(i, f);
        }
    }
}
