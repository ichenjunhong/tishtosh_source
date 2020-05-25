package com.p683ss.android.ugc.aweme.shortvideo.cut.scene;

import android.content.Context;
import android.support.p030v4.app.FragmentActivity;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.bytedance.apm.p501q.C9190h;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.google.p1057b.p1065h.p1066a.C17825i;
import com.p683ss.android.ugc.asve.p1239c.C20347c;
import com.p683ss.android.ugc.aweme.base.C23569o;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.property.C40789h.C40790a;
import com.p683ss.android.ugc.aweme.shortvideo.C42437ay;
import com.p683ss.android.ugc.aweme.shortvideo.C42482c;
import com.p683ss.android.ugc.aweme.shortvideo.C43214dh;
import com.p683ss.android.ugc.aweme.shortvideo.TTUploaderService;
import com.p683ss.android.ugc.aweme.shortvideo.cut.C42669p.C42670a;
import com.p683ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.p683ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C43028e;
import com.p683ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C43028e.C43030b;
import com.p683ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C43036f;
import com.p683ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C43036f.C43038b;
import com.p683ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C43051l;
import com.p683ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C43051l.C43054b;
import com.p683ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C43051l.C43057e;
import com.p683ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C43051l.C43061i;
import com.p683ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C43051l.C43062j;
import com.p683ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C43065m;
import com.p683ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p2183c.C43017a;
import com.p683ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p2183c.C43022f;
import com.p683ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p2183c.C43023g;
import com.p683ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p2183c.C43024h;
import com.p683ss.android.ugc.aweme.shortvideo.cut.videoedit.C43120d;
import com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.C44300e;
import com.p683ss.android.ugc.aweme.shortvideo.p2264x.C45623a;
import com.p683ss.android.ugc.aweme.video.C48016e;
import com.p683ss.android.vesdk.VESize;
import com.ss.android.ugc.trill.R;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import p001a.C0011g;
import p001a.C0013i;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.ax */
public final class C42820ax implements C42874bo {

    /* renamed from: v */
    public static final C42821a f108256v = new C42821a(null);

    /* renamed from: a */
    public C42876bq f108257a;

    /* renamed from: b */
    public C42875bp f108258b;

    /* renamed from: c */
    public final C43051l f108259c = new C43051l();

    /* renamed from: d */
    public C42482c f108260d;

    /* renamed from: e */
    public C43024h f108261e;

    /* renamed from: f */
    public final C43028e f108262f = new C43028e();

    /* renamed from: g */
    public VideoSegment f108263g;

    /* renamed from: h */
    C42482c f108264h;

    /* renamed from: i */
    public String f108265i = "sync_page_recommend";

    /* renamed from: j */
    public boolean f108266j;

    /* renamed from: k */
    public long f108267k;

    /* renamed from: l */
    public C43065m f108268l;

    /* renamed from: m */
    List<C42482c> f108269m;

    /* renamed from: n */
    C43022f f108270n;

    /* renamed from: o */
    public C43120d f108271o;

    /* renamed from: p */
    public int f108272p;

    /* renamed from: q */
    C45623a f108273q;

    /* renamed from: r */
    public CutVideoStickerPointMusicViewModel f108274r;

    /* renamed from: s */
    CutVideoMultiModeViewModel f108275s;

    /* renamed from: t */
    public boolean f108276t;

    /* renamed from: u */
    public boolean f108277u;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.ax$a */
    public static final class C42821a {
        private C42821a() {
        }

        public /* synthetic */ C42821a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.ax$b */
    public static final class C42822b implements C43030b {

        /* renamed from: a */
        final /* synthetic */ C42820ax f108278a;

        /* renamed from: b */
        final /* synthetic */ FragmentActivity f108279b;

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.ax$b$a */
        public static final class C42823a implements C43017a {
            C42823a() {
            }

            /* renamed from: a */
            public final void mo87277a(String str) {
                C43036f.m94304a(str);
                C48016e.m103947c(new File(C43036f.m94303a()).getPath());
            }

            /* renamed from: a */
            public final void mo87278a(Throwable th) {
                C48016e.m103947c(new File(C43036f.m94303a()).getPath());
            }
        }

        /* renamed from: a */
        public final void mo87275a() {
            if (this.f108278a.f108259c.mo87434b()) {
                this.f108278a.f108276t = true;
            }
            this.f108278a.f108259c.mo87435c();
            this.f108278a.f108267k = System.currentTimeMillis();
        }

        C42822b(C42820ax axVar, FragmentActivity fragmentActivity) {
            this.f108278a = axVar;
            this.f108279b = fragmentActivity;
        }

        /* renamed from: a */
        public final void mo87276a(boolean z, boolean z2, boolean z3) {
            if (z) {
                C43051l lVar = this.f108278a.f108259c;
                if (lVar.f108673a != null && lVar.mo87432a()) {
                    C20347c cVar = lVar.f108673a;
                    if (cVar == null) {
                        C52711k.m112234a();
                    }
                    if (cVar.mo43094x() == 0) {
                        lVar.mo87428a(5, -1);
                    }
                }
                C10691a.m21537a((Context) this.f108279b, this.f108279b.getResources().getString(R.string.ds7)).mo19066a();
                this.f108278a.f108266j = true;
            } else if (this.f108278a.f108276t) {
                this.f108278a.f108259c.mo87437d();
                this.f108278a.f108276t = false;
            }
            if (z3) {
                C20347c cVar2 = this.f108278a.f108259c.f108673a;
                C43017a aVar = new C42823a();
                if (cVar2 == null || !C43036f.m94311d()) {
                    aVar.mo87278a((Throwable) null);
                } else {
                    C17825i.m43740a(new TTUploaderService(0).mo86428a(null), new C43038b(cVar2, aVar), C0013i.f24a);
                }
            }
            boolean z4 = !z;
            C23569o.m57776a("stickpoint_smart", z4 ? 1 : 0, C42437ay.m93202a().mo86520a("cast_time", Long.valueOf((System.currentTimeMillis() - this.f108278a.f108267k) / 1000)).mo86519a("cancel", Integer.valueOf(z2 ? 1 : 0)).mo86522b());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.ax$c */
    public static final class C42824c implements C43054b {

        /* renamed from: a */
        final /* synthetic */ C42820ax f108280a;

        /* renamed from: a */
        public final boolean mo87280a() {
            return this.f108280a.mo87270f();
        }

        /* renamed from: b */
        public final List<VideoSegment> mo87281b() {
            C43024h hVar = this.f108280a.f108261e;
            if (hVar == null) {
                C52711k.m112234a();
            }
            return hVar.mo87217c();
        }

        C42824c(C42820ax axVar) {
            this.f108280a = axVar;
        }

        /* renamed from: a */
        public final void mo87279a(int i) {
            if (!(i == 5 || this.f108280a.f108261e == null || C43051l.m94347a(i))) {
                C43024h hVar = this.f108280a.f108261e;
                if (hVar == null) {
                    C52711k.m112234a();
                }
                hVar.mo87216b();
            }
            if (!(i == 7 || i == 6)) {
                this.f108280a.mo87258a().mo87521f();
            }
            C42875bp bpVar = this.f108280a.f108258b;
            if (bpVar == null) {
                C52711k.m112237a("stickPointVideoSegController");
            }
            bpVar.mo87324c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.ax$d */
    public static final class C42825d implements C43022f {

        /* renamed from: a */
        final /* synthetic */ C42820ax f108281a;

        /* renamed from: b */
        public final VESize mo87284b() {
            C20347c cVar = this.f108281a.f108259c.f108673a;
            if (cVar != null) {
                return cVar.mo43037b();
            }
            return null;
        }

        /* renamed from: a */
        public final int mo87282a() {
            if (this.f108281a.f108263g == null) {
                return 0;
            }
            VideoSegment videoSegment = this.f108281a.f108263g;
            if (videoSegment == null) {
                C52711k.m112234a();
            }
            return videoSegment.f107912k;
        }

        C42825d(C42820ax axVar) {
            this.f108281a = axVar;
        }

        /* renamed from: a */
        public final void mo87283a(float f, float f2, float f3, int i, int i2) {
            C20347c cVar = this.f108281a.f108259c.f108673a;
            if (cVar != null) {
                cVar.mo43014a(f, f2, f3, 0, i2);
            }
            C42820ax.m93929a(this.f108281a).f108708a = f;
            C42820ax.m93929a(this.f108281a).f108709b = f2;
            C42820ax.m93929a(this.f108281a).f108710c = 0;
            C42820ax.m93929a(this.f108281a).f108711d = i2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.ax$e */
    public static final class C42826e implements C43023g {

        /* renamed from: a */
        final /* synthetic */ C42820ax f108282a;

        /* renamed from: a */
        public final void mo87073a() {
        }

        C42826e(C42820ax axVar) {
            this.f108282a = axVar;
        }

        /* renamed from: a */
        public final void mo87074a(int i) {
            if (!this.f108282a.mo87270f() || this.f108282a.f108260d == null) {
                this.f108282a.f108259c.mo87438e();
                if (this.f108282a.mo87270f()) {
                    this.f108282a.f108259c.mo87429a(0);
                } else {
                    this.f108282a.f108259c.mo87429a((long) this.f108282a.f108272p);
                }
            } else {
                CutVideoStickerPointMusicViewModel cutVideoStickerPointMusicViewModel = this.f108282a.f108274r;
                if (cutVideoStickerPointMusicViewModel == null) {
                    C52711k.m112237a("musicViewModel");
                }
                cutVideoStickerPointMusicViewModel.mo87153a(false);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.ax$f */
    public static final class C42827f implements C43023g {
        C42827f() {
        }

        /* renamed from: a */
        public final void mo87073a() {
        }

        /* renamed from: a */
        public final void mo87074a(int i) {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.ax$g */
    public static final class C42828g implements C43023g {

        /* renamed from: a */
        final /* synthetic */ C42820ax f108283a;

        /* renamed from: a */
        public final void mo87073a() {
            this.f108283a.f108259c.mo87429a(0);
            this.f108283a.mo87263a(false, false);
        }

        C42828g(C42820ax axVar) {
            this.f108283a = axVar;
        }

        /* renamed from: a */
        public final void mo87074a(int i) {
            boolean z;
            C42820ax axVar = this.f108283a;
            if (i >= 0) {
                z = true;
            } else {
                z = false;
            }
            axVar.mo87263a(z, false);
        }
    }

    /* renamed from: d */
    public final void mo87268d() {
        C43214dh.m94817a().mo50200a(this.f108264h);
    }

    /* renamed from: e */
    public final void mo87269e() {
        this.f108259c.mo87431a((C43023g) new C42828g(this), false);
    }

    /* renamed from: f */
    public final boolean mo87270f() {
        CutVideoMultiModeViewModel cutVideoMultiModeViewModel = this.f108275s;
        if (cutVideoMultiModeViewModel == null) {
            C52711k.m112237a("multiModeViewModel");
        }
        return cutVideoMultiModeViewModel.mo87096e();
    }

    /* renamed from: g */
    public final C43065m mo87271g() {
        C43065m mVar = this.f108268l;
        if (mVar == null) {
            C52711k.m112237a("stickPointVideoRotateData");
        }
        return mVar;
    }

    /* renamed from: h */
    public final C42482c mo87272h() {
        C42876bq bqVar = this.f108257a;
        if (bqVar == null) {
            C52711k.m112237a("musicViewController");
        }
        return bqVar.mo87285a();
    }

    /* renamed from: i */
    public final void mo87273i() {
        this.f108272p = this.f108259c.mo87439f();
    }

    /* renamed from: j */
    public final C42875bp mo87274j() {
        C42875bp bpVar = this.f108258b;
        if (bpVar == null) {
            C52711k.m112237a("stickPointVideoSegController");
        }
        return bpVar;
    }

    /* renamed from: a */
    public final C43120d mo87258a() {
        C43120d dVar = this.f108271o;
        if (dVar == null) {
            C52711k.m112237a("videoEditView");
        }
        return dVar;
    }

    /* renamed from: b */
    public final List<VideoSegment> mo87264b() {
        if (this.f108261e != null) {
            C43024h hVar = this.f108261e;
            if (hVar == null) {
                C52711k.m112234a();
            }
            if (!C9190h.m18253a(hVar.mo87217c())) {
                ArrayList arrayList = new ArrayList();
                C43024h hVar2 = this.f108261e;
                if (hVar2 == null) {
                    C52711k.m112234a();
                }
                for (VideoSegment videoSegment : hVar2.mo87217c()) {
                    if (!videoSegment.f107911j && !videoSegment.f107919r && !this.f108262f.mo87408a(videoSegment)) {
                        String a = videoSegment.mo86941a(false);
                        C52711k.m112236a((Object) a, "videoSegment.getPath(false)");
                        if (!C44300e.m97039a(a)) {
                            arrayList.add(videoSegment);
                        }
                    }
                }
                return arrayList;
            }
        }
        return null;
    }

    /* renamed from: c */
    public final List<VideoSegment> mo87267c() {
        if (this.f108261e != null) {
            C43024h hVar = this.f108261e;
            if (hVar == null) {
                C52711k.m112234a();
            }
            if (!C9190h.m18253a(hVar.mo87217c())) {
                ArrayList arrayList = new ArrayList();
                C43024h hVar2 = this.f108261e;
                if (hVar2 == null) {
                    C52711k.m112234a();
                }
                for (VideoSegment videoSegment : hVar2.mo87217c()) {
                    if (!videoSegment.f107911j) {
                        arrayList.add(videoSegment);
                    }
                }
                return arrayList;
            }
        }
        return null;
    }

    /* renamed from: a */
    public static final /* synthetic */ C43065m m93929a(C42820ax axVar) {
        C43065m mVar = axVar.f108268l;
        if (mVar == null) {
            C52711k.m112237a("stickPointVideoRotateData");
        }
        return mVar;
    }

    /* renamed from: b */
    public final void mo87265b(boolean z) {
        if (C39629l.m88232a().mo58583n().mo83104b(C40790a.EnableImportAvSync) == 512) {
            this.f108259c.mo87436c(0);
        }
        if (!C43036f.m94313g() && this.f108269m != null) {
            C42876bq bqVar = this.f108257a;
            if (bqVar == null) {
                C52711k.m112237a("musicViewController");
            }
            bqVar.mo87289a(this.f108269m);
            this.f108269m = null;
        }
    }

    /* renamed from: a */
    public final void mo87262a(boolean z) {
        C42875bp bpVar = this.f108258b;
        if (bpVar == null) {
            C52711k.m112237a("stickPointVideoSegController");
        }
        bpVar.mo87323b(false);
        if (C39629l.m88232a().mo58583n().mo83104b(C40790a.EnableImportAvSync) == 512) {
            this.f108259c.mo87436c(1);
        }
        C43051l lVar = this.f108259c;
        if (C44300e.m97041c()) {
            C43054b bVar = lVar.f108676d;
            if (bVar != null) {
                List<VideoSegment> b = bVar.mo87281b();
                if (b != null) {
                    for (VideoSegment videoSegment : b) {
                        String a = videoSegment.mo86941a(false);
                        C52711k.m112236a((Object) a, "it.getPath(false)");
                        if (C44300e.m97039a(a)) {
                            videoSegment.f107904c = 3000;
                        }
                    }
                }
            }
        }
        this.f108259c.mo87438e();
        C43024h hVar = this.f108261e;
        if (hVar != null) {
            hVar.mo87215a(false, true);
        }
    }

    /* renamed from: a */
    public final void mo87261a(int i, VideoSegment videoSegment) {
        this.f108259c.f108678f = i;
        this.f108263g = videoSegment;
        if (mo87270f()) {
            this.f108259c.mo87438e();
        }
    }

    /* renamed from: b */
    public final void mo87266b(boolean z, boolean z2) {
        if (z) {
            C43051l lVar = this.f108259c;
            VideoSegment videoSegment = this.f108263g;
            if (videoSegment == null) {
                Integer.valueOf(-201);
            } else {
                C20347c cVar = lVar.f108673a;
                if (cVar != null) {
                    Integer.valueOf(cVar.mo42981a(videoSegment.f107902a, C42670a.m93643a(videoSegment.f107912k)));
                }
            }
        }
        if (mo87270f()) {
            C43024h hVar = this.f108261e;
            if (hVar != null) {
                hVar.mo87216b();
            }
            C43051l lVar2 = this.f108259c;
            C43023g fVar = new C42827f();
            lVar2.mo87440g();
            int i = 7;
            if (z2) {
                i = 4;
            } else if (z) {
                i = 6;
            }
            if (z2) {
                lVar2.mo87431a((C43023g) new C43057e(lVar2, fVar, i), true);
            } else if (z) {
                C43054b bVar = lVar2.f108676d;
                if (bVar == null) {
                    C52711k.m112234a();
                }
                List<VideoSegment> b = bVar.mo87281b();
                if (!C9190h.m18253a(b)) {
                    ArrayList arrayList = new ArrayList();
                    for (VideoSegment videoSegment2 : b) {
                        if (videoSegment2.f107917p != null) {
                            arrayList.add(videoSegment2.f107917p.clone());
                        }
                    }
                    if (lVar2.f108674b != null) {
                        Map map = lVar2.f108675c;
                        C42482c cVar2 = lVar2.f108674b;
                        if (cVar2 == null) {
                            C52711k.m112234a();
                        }
                        String musicId = cVar2.getMusicId();
                        C52711k.m112236a((Object) musicId, "curSelectMusicModel!!.musicId");
                        map.put(musicId, arrayList);
                    }
                }
                lVar2.mo87430a(lVar2.f108674b, i, fVar);
            } else {
                lVar2.mo87430a(lVar2.f108674b, i, fVar);
            }
        }
        this.f108263g = null;
    }

    /* renamed from: a */
    public final void mo87263a(boolean z, boolean z2) {
        C42875bp bpVar = this.f108258b;
        if (bpVar == null) {
            C52711k.m112237a("stickPointVideoSegController");
        }
        bpVar.mo87323b(true);
        if (this.f108260d != null) {
            CutVideoStickerPointMusicViewModel cutVideoStickerPointMusicViewModel = this.f108274r;
            if (cutVideoStickerPointMusicViewModel == null) {
                C52711k.m112237a("musicViewModel");
            }
            cutVideoStickerPointMusicViewModel.mo87153a(false);
        } else {
            CutVideoStickerPointMusicViewModel cutVideoStickerPointMusicViewModel2 = this.f108274r;
            if (cutVideoStickerPointMusicViewModel2 == null) {
                C52711k.m112237a("musicViewModel");
            }
            cutVideoStickerPointMusicViewModel2.mo87154b(false);
            this.f108259c.mo87429a(0);
        }
        C43024h hVar = this.f108261e;
        if (hVar != null) {
            hVar.mo87215a(true, z);
        }
    }

    /* renamed from: a */
    public final void mo87260a(int i, int i2, C43023g gVar) {
        C52711k.m112240b(gVar, "listener");
        if (mo87270f()) {
            C43051l lVar = this.f108259c;
            if (i == i2 && gVar != null) {
                gVar.mo87073a();
            } else if (lVar.f108673a != null && lVar.mo87432a()) {
                C0013i.m16a((Callable<TResult>) new C43061i<TResult>(lVar, i, i2)).mo20a((C0011g<TResult, TContinuationResult>) new C43062j<TResult,TContinuationResult>(lVar, gVar, i2), C0013i.f25b);
            }
        }
    }

    /* renamed from: a */
    public final void mo87259a(float f, float f2, float f3, boolean z) {
        Integer num;
        float[] fArr;
        float f4;
        C43022f fVar = this.f108270n;
        if (fVar != null) {
            VESize b = fVar.mo87284b();
            if (b != null) {
                int i = b.height;
                int i2 = b.width;
                C43022f fVar2 = this.f108270n;
                if (fVar2 != null) {
                    num = Integer.valueOf(fVar2.mo87282a());
                } else {
                    num = null;
                }
                if (num == null) {
                    C52711k.m112234a();
                }
                int intValue = num.intValue();
                if (i2 == 0 || i == 0) {
                    fArr = new float[]{1.0f, 1.0f};
                } else {
                    fArr = intValue % NormalGiftView.ALPHA_180 == 90 ? new float[]{f / ((float) i), f3 / ((float) i2)} : new float[]{f / ((float) i2), f3 / ((float) i)};
                }
                float min = Math.min(fArr[0], fArr[1]);
                if (z) {
                    f4 = (f2 - f3) / 2.0f;
                } else {
                    f4 = (((float) i) - f3) / 2.0f;
                }
                C43022f fVar3 = this.f108270n;
                if (fVar3 != null) {
                    fVar3.mo87283a(min, min, (float) intValue, 0, (int) f4);
                }
            }
        }
    }
}
