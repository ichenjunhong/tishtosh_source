package com.p683ss.android.ugc.gamora.editor;

import android.app.Activity;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0198r;
import android.arch.lifecycle.C0209x;
import android.arch.lifecycle.C0214z;
import android.os.Bundle;
import android.support.p030v4.app.FragmentActivity;
import android.support.p043v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
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
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.activity.C23441t;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.p1482bw.p1483a.C24438g;
import com.p683ss.android.ugc.aweme.p1482bw.p1483a.C24441j;
import com.p683ss.android.ugc.aweme.p1482bw.p1483a.C24442k;
import com.p683ss.android.ugc.aweme.p1482bw.p1483a.C24443l;
import com.p683ss.android.ugc.aweme.port.p2082in.C39529ab.C39532c;
import com.p683ss.android.ugc.aweme.services.video.VEVolumeChangeOp;
import com.p683ss.android.ugc.aweme.shortvideo.C42482c;
import com.p683ss.android.ugc.aweme.shortvideo.edit.C43434az;
import com.p683ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p683ss.android.ugc.aweme.shortvideo.p2208k.C43944p;
import com.p683ss.android.ugc.aweme.shortvideo.p2208k.C43944p.C43948a;
import com.p683ss.android.ugc.aweme.shortvideo.p2219p.C44342a;
import com.p683ss.android.ugc.aweme.shortvideo.p2219p.C44342a.C44344b;
import com.p683ss.android.ugc.aweme.sticker.p2281e.C45870a;
import com.p683ss.android.ugc.gamora.jedi.C49548a;
import com.p683ss.android.ugc.gamora.jedi.C49548a.C49549a;
import com.p683ss.android.ugc.gamora.jedi.C49555b;
import com.p683ss.android.ugc.gamora.jedi.C49562i;
import com.p683ss.android.ugc.gamora.p2458b.C48927d;
import com.ss.android.ugc.trill.R;
import dmt.p2652av.video.C53030y;
import dmt.p2652av.video.VEVideoPublishEditViewModel;
import java.util.ArrayList;
import java.util.List;
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

/* renamed from: com.ss.android.ugc.gamora.editor.am */
public final class C49115am extends C12924i implements C49548a {

    /* renamed from: i */
    static final /* synthetic */ C52767h[] f123420i = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C49115am.class), "mVolumeHelper", "getMVolumeHelper()Lcom/ss/android/ugc/aweme/shortvideo/helper/VolumeHelper;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C49115am.class), "musicView", "getMusicView()Lcom/ss/android/ugc/aweme/shortvideo/music/MusicView;"))};

    /* renamed from: m */
    public static final C49116a f123421m = new C49116a(null);

    /* renamed from: j */
    public VideoPublishEditModel f123422j;

    /* renamed from: k */
    public VEVideoPublishEditViewModel f123423k;

    /* renamed from: l */
    public C44344b f123424l;

    /* renamed from: n */
    private final C52668f f123425n = C52732g.m112285a(C49118c.f123430a);

    /* renamed from: o */
    private final C52668f f123426o = C52732g.m112285a(C49119d.f123431a);

    /* renamed from: p */
    private EditVolumeViewModel f123427p;

    /* renamed from: q */
    private EditMusicViewModel f123428q;

    /* renamed from: com.ss.android.ugc.gamora.editor.am$a */
    public static final class C49116a {
        private C49116a() {
        }

        public /* synthetic */ C49116a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.am$b */
    static final class C49117b implements C43948a {

        /* renamed from: a */
        final /* synthetic */ C49115am f123429a;

        C49117b(C49115am amVar) {
            this.f123429a = amVar;
        }

        /* renamed from: a */
        public final void mo89514a(float f, float f2) {
            if ((C49115am.m106009a(this.f123429a).isFastImport || C49115am.m106009a(this.f123429a).isCutSameVideoType() || C49115am.m106009a(this.f123429a).hasOriginalSound()) && !C49115am.m106009a(this.f123429a).isMuted) {
                C0198r m = C49115am.m106010b(this.f123429a).mo110468m();
                C52711k.m112236a((Object) m, "mViewModel.volumeChangeOpLiveData");
                m.setValue(VEVolumeChangeOp.ofVoice(f));
                if (C49115am.m106009a(this.f123429a).mMusicPath != null) {
                    C0198r m2 = C49115am.m106010b(this.f123429a).mo110468m();
                    C52711k.m112236a((Object) m2, "mViewModel.volumeChangeOpLiveData");
                    m2.setValue(VEVolumeChangeOp.ofMusic(f2));
                }
            } else {
                C49115am.m106010b(this.f123429a).mo110468m().setValue(VEVolumeChangeOp.ofMusic(f2));
            }
            C49115am.m106009a(this.f123429a).voiceVolume = f;
            C49115am.m106009a(this.f123429a).musicVolume = f2;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.am$c */
    static final class C49118c extends C52712l implements C52670a<C43944p> {

        /* renamed from: a */
        public static final C49118c f123430a = new C49118c();

        C49118c() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C43944p();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.am$d */
    static final class C49119d extends C52712l implements C52670a<C44342a> {

        /* renamed from: a */
        public static final C49119d f123431a = new C49119d();

        C49119d() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C44342a();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.am$e */
    static final class C49120e extends C52712l implements C52682m<C49548a, Boolean, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C49115am f123432a;

        C49120e(C49115am amVar) {
            this.f123432a = amVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            C49548a aVar = (C49548a) obj;
            boolean booleanValue = ((Boolean) obj2).booleanValue();
            C52711k.m112240b(aVar, "$receiver");
            this.f123432a.mo97138G().f112223h = booleanValue;
            C39532c cVar = this.f123432a.mo97138G().f112221f;
            if (cVar != null) {
                cVar.mo80606b(booleanValue);
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.am$f */
    static final class C49121f extends C52712l implements C52682m<C49548a, Integer, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C49115am f123433a;

        C49121f(C49115am amVar) {
            this.f123433a = amVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            C49548a aVar = (C49548a) obj;
            int intValue = ((Number) obj2).intValue();
            C52711k.m112240b(aVar, "$receiver");
            C39532c cVar = this.f123433a.mo97138G().f112221f;
            if (cVar != null) {
                cVar.mo80595a(intValue);
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.am$g */
    static final class C49122g extends C52712l implements C52682m<C49548a, C42482c, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C49115am f123434a;

        C49122g(C49115am amVar) {
            this.f123434a = amVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            C42482c cVar = (C42482c) obj2;
            C52711k.m112240b((C49548a) obj, "$receiver");
            C52711k.m112240b(cVar, "it");
            this.f123434a.mo97138G().f112233r = cVar;
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.am$h */
    public static final class C49123h implements C24441j {

        /* renamed from: a */
        final /* synthetic */ C49115am f123435a;

        C49123h(C49115am amVar) {
            this.f123435a = amVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x001b, code lost:
            if (r8 == null) goto L_0x001d;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo50207a(android.view.View r8, int r9) {
            /*
                r7 = this;
                java.lang.String r0 = "view"
                p2628d.p2639f.p2641b.C52711k.m112240b(r8, r0)
                com.ss.android.ugc.gamora.editor.am r8 = r7.f123435a
                com.ss.android.ugc.aweme.shortvideo.p.a r8 = r8.mo97138G()
                com.ss.android.ugc.aweme.shortvideo.c r8 = r8.mo90206a(r9)
                com.ss.android.ugc.gamora.editor.am r0 = r7.f123435a
                com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = com.p683ss.android.ugc.gamora.editor.C49115am.m106009a(r0)
                if (r8 == 0) goto L_0x001d
                java.lang.String r8 = r8.getMusicId()
                if (r8 != 0) goto L_0x001f
            L_0x001d:
                java.lang.String r8 = ""
            L_0x001f:
                int r9 = r9 + 1
                com.ss.android.ugc.gamora.editor.am r1 = r7.f123435a
                r1.mo97138G()
                int r1 = com.p683ss.android.ugc.aweme.shortvideo.p2219p.C44342a.m97120a()
                com.ss.android.ugc.gamora.editor.am r2 = r7.f123435a
                com.ss.android.ugc.aweme.shortvideo.p.a r2 = r2.mo97138G()
                int r2 = r2.mo90210d()
                if (r2 != 0) goto L_0x0039
                java.lang.String r2 = "recommend"
                goto L_0x003b
            L_0x0039:
                java.lang.String r2 = "favorite"
            L_0x003b:
                java.lang.String r3 = "model"
                p2628d.p2639f.p2641b.C52711k.m112240b(r0, r3)
                java.lang.String r3 = "musicId"
                p2628d.p2639f.p2641b.C52711k.m112240b(r8, r3)
                java.lang.String r3 = "select_music"
                com.ss.android.ugc.aweme.app.f.d r4 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
                java.lang.String r5 = "creation_id"
                java.lang.String r6 = r0.creationId
                com.ss.android.ugc.aweme.app.f.d r4 = r4.mo47829a(r5, r6)
                java.lang.String r5 = "content_source"
                java.lang.String r6 = com.p683ss.android.ugc.aweme.shortvideo.edit.C43434az.m95207b(r0)
                com.ss.android.ugc.aweme.app.f.d r4 = r4.mo47829a(r5, r6)
                java.lang.String r5 = "content_type"
                java.lang.String r6 = com.p683ss.android.ugc.aweme.shortvideo.edit.C43434az.m95202a(r0)
                com.ss.android.ugc.aweme.app.f.d r4 = r4.mo47829a(r5, r6)
                java.lang.String r5 = "shoot_way"
                java.lang.String r0 = r0.mShootWay
                com.ss.android.ugc.aweme.app.f.d r0 = r4.mo47829a(r5, r0)
                java.lang.String r4 = "enter_from"
                java.lang.String r5 = "video_edit_page"
                com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47829a(r4, r5)
                java.lang.String r4 = "music_id"
                com.ss.android.ugc.aweme.app.f.d r8 = r0.mo47829a(r4, r8)
                java.lang.String r0 = "music_show_rank"
                com.ss.android.ugc.aweme.app.f.d r8 = r8.mo47826a(r0, r9)
                java.lang.String r0 = "music_rec_type"
                com.ss.android.ugc.aweme.app.f.d r8 = r8.mo47826a(r0, r1)
                java.lang.String r0 = "tab_name"
                com.ss.android.ugc.aweme.app.f.d r8 = r8.mo47829a(r0, r2)
                java.util.Map<java.lang.String, java.lang.String> r8 = r8.f61491a
                com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r3, r8)
                com.ss.android.ugc.gamora.editor.am r8 = r7.f123435a
                com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r8 = com.p683ss.android.ugc.gamora.editor.C49115am.m106009a(r8)
                r8.mMusicShowRank = r9
                com.ss.android.ugc.gamora.editor.am r8 = r7.f123435a
                com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r8 = com.p683ss.android.ugc.gamora.editor.C49115am.m106009a(r8)
                com.ss.android.ugc.gamora.editor.am r9 = r7.f123435a
                r9.mo97138G()
                int r9 = com.p683ss.android.ugc.aweme.shortvideo.p2219p.C44342a.m97120a()
                r8.mMusicRecType = r9
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.gamora.editor.C49115am.C49123h.mo50207a(android.view.View, int):void");
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.am$i */
    public static final class C49124i implements C24442k {

        /* renamed from: a */
        final /* synthetic */ C49115am f123436a;

        C49124i(C49115am amVar) {
            this.f123436a = amVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x0016, code lost:
            if (r8 == null) goto L_0x0018;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo50208a(int r8) {
            /*
                r7 = this;
                com.ss.android.ugc.gamora.editor.am r0 = r7.f123436a
                com.ss.android.ugc.aweme.shortvideo.p.a r0 = r0.mo97138G()
                com.ss.android.ugc.aweme.shortvideo.c r8 = r0.mo90206a(r8)
                com.ss.android.ugc.gamora.editor.am r0 = r7.f123436a
                com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = com.p683ss.android.ugc.gamora.editor.C49115am.m106009a(r0)
                if (r8 == 0) goto L_0x0018
                java.lang.String r8 = r8.getMusicId()
                if (r8 != 0) goto L_0x001a
            L_0x0018:
                java.lang.String r8 = ""
            L_0x001a:
                com.ss.android.ugc.gamora.editor.am r1 = r7.f123436a
                r1.mo97138G()
                int r1 = com.p683ss.android.ugc.aweme.shortvideo.p2219p.C44342a.m97120a()
                com.ss.android.ugc.gamora.editor.am r2 = r7.f123436a
                com.ss.android.ugc.aweme.shortvideo.p.a r2 = r2.mo97138G()
                int r2 = r2.mo90210d()
                if (r2 != 0) goto L_0x0032
                java.lang.String r2 = "recommend"
                goto L_0x0034
            L_0x0032:
                java.lang.String r2 = "favorite"
            L_0x0034:
                java.lang.String r3 = "model"
                p2628d.p2639f.p2641b.C52711k.m112240b(r0, r3)
                java.lang.String r3 = "music_show"
                com.ss.android.ugc.aweme.app.f.d r4 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
                java.lang.String r5 = "creation_id"
                java.lang.String r6 = r0.creationId
                com.ss.android.ugc.aweme.app.f.d r4 = r4.mo47829a(r5, r6)
                java.lang.String r5 = "content_source"
                java.lang.String r6 = com.p683ss.android.ugc.aweme.shortvideo.edit.C43434az.m95207b(r0)
                com.ss.android.ugc.aweme.app.f.d r4 = r4.mo47829a(r5, r6)
                java.lang.String r5 = "content_type"
                java.lang.String r6 = com.p683ss.android.ugc.aweme.shortvideo.edit.C43434az.m95202a(r0)
                com.ss.android.ugc.aweme.app.f.d r4 = r4.mo47829a(r5, r6)
                java.lang.String r5 = "shoot_way"
                java.lang.String r0 = r0.mShootWay
                com.ss.android.ugc.aweme.app.f.d r0 = r4.mo47829a(r5, r0)
                java.lang.String r4 = "enter_from"
                java.lang.String r5 = "video_edit_page"
                com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47829a(r4, r5)
                java.lang.String r4 = "music_id"
                com.ss.android.ugc.aweme.app.f.d r8 = r0.mo47829a(r4, r8)
                java.lang.String r0 = "music_rec_type"
                com.ss.android.ugc.aweme.app.f.d r8 = r8.mo47826a(r0, r1)
                java.lang.String r0 = "tab_name"
                com.ss.android.ugc.aweme.app.f.d r8 = r8.mo47829a(r0, r2)
                java.util.Map<java.lang.String, java.lang.String> r8 = r8.f61491a
                com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r3, r8)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.gamora.editor.C49115am.C49124i.mo50208a(int):void");
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.am$j */
    public static final class C49125j implements C44344b {

        /* renamed from: a */
        final /* synthetic */ C49115am f123437a;

        /* renamed from: d */
        public final void mo90216d() {
            C44344b bVar = this.f123437a.f123424l;
            if (bVar != null) {
                bVar.mo90216d();
            }
        }

        /* renamed from: a */
        public final void mo90212a() {
            C0198r k = C49115am.m106010b(this.f123437a).mo110466k();
            C52711k.m112236a((Object) k, "mViewModel.previewControlLiveData");
            k.setValue(C53030y.m112774b());
            C44344b bVar = this.f123437a.f123424l;
            if (bVar != null) {
                bVar.mo90212a();
            }
            VideoPublishEditModel a = C49115am.m106009a(this.f123437a);
            C52711k.m112240b(a, "model");
            C23089d a2 = C23089d.m56640a().mo47829a("creation_id", a.creationId).mo47829a("content_source", C43434az.m95207b(a)).mo47829a("content_type", C43434az.m95202a(a)).mo47829a("shoot_way", a.mShootWay).mo47829a("enter_from", "video_edit_page");
            if (C45870a.m99714a()) {
                a2.mo47829a("is_commercial", "1");
            }
            C26890h.m65011a("change_music", a2.f61491a);
        }

        /* renamed from: b */
        public final void mo90214b() {
            C44344b bVar = this.f123437a.f123424l;
            if (bVar != null) {
                bVar.mo90214b();
            }
            VideoPublishEditModel a = C49115am.m106009a(this.f123437a);
            String a2 = this.f123437a.mo24461a((int) R.string.ow);
            C52711k.m112240b(a, "model");
            C26890h.m65011a("click_music_tab", C23089d.m56640a().mo47829a("creation_id", a.creationId).mo47829a("content_source", C43434az.m95207b(a)).mo47829a("content_type", C43434az.m95202a(a)).mo47829a("shoot_way", a.mShootWay).mo47829a("enter_from", "video_edit_page").mo47829a("tab_name", a2).f61491a);
        }

        /* renamed from: c */
        public final void mo90215c() {
            C44344b bVar = this.f123437a.f123424l;
            if (bVar != null) {
                bVar.mo90215c();
            }
            VideoPublishEditModel a = C49115am.m106009a(this.f123437a);
            String a2 = this.f123437a.mo24461a((int) R.string.o0);
            C52711k.m112240b(a, "model");
            C26890h.m65011a("click_music_tab", C23089d.m56640a().mo47829a("creation_id", a.creationId).mo47829a("content_source", C43434az.m95207b(a)).mo47829a("content_type", C43434az.m95202a(a)).mo47829a("shoot_way", a.mShootWay).mo47829a("enter_from", "video_edit_page").mo47829a("tab_name", a2).f61491a);
        }

        C49125j(C49115am amVar) {
            this.f123437a = amVar;
        }

        /* renamed from: a */
        public final void mo90213a(String str, C42482c cVar, boolean z) {
            C44344b bVar = this.f123437a.f123424l;
            if (bVar != null) {
                bVar.mo90213a(str, cVar, z);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.am$k */
    public static final class C49126k implements C24438g {

        /* renamed from: a */
        final /* synthetic */ C49115am f123438a;

        /* renamed from: a */
        public final void mo50202a() {
            VideoPublishEditModel a = C49115am.m106009a(this.f123438a);
            C52711k.m112240b(a, "model");
            C26890h.m65011a("music_loading", C23089d.m56640a().mo47829a("enter_from", "video_edit_page").mo47829a("shoot_way", a.mShootWay).mo47829a("content_source", C43434az.m95207b(a)).mo47829a("content_type", C43434az.m95202a(a)).f61491a);
        }

        C49126k(C49115am amVar) {
            this.f123438a = amVar;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.am$l */
    public static final class C49127l implements C24443l {

        /* renamed from: a */
        final /* synthetic */ C49115am f123439a;

        C49127l(C49115am amVar) {
            this.f123439a = amVar;
        }

        /* renamed from: a */
        public final void mo50209a(boolean z) {
            String str;
            VideoPublishEditModel a = C49115am.m106009a(this.f123439a);
            if (z) {
                str = "recommend";
            } else {
                str = "favorite";
            }
            C52711k.m112240b(a, "model");
            C26890h.m65011a("enter_music_tab", C23089d.m56640a().mo47829a("enter_from", "video_edit_page").mo47829a("shoot_way", a.mShootWay).mo47829a("content_source", C43434az.m95207b(a)).mo47829a("content_type", C43434az.m95202a(a)).mo47829a("creation_id", a.creationId).mo47829a("tab_name", str).f61491a);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: F */
    public final C43944p mo97137F() {
        return (C43944p) this.f123425n.getValue();
    }

    /* renamed from: G */
    public final C44342a mo97138G() {
        return (C44342a) this.f123426o.getValue();
    }

    /* renamed from: I */
    public final boolean mo97140I() {
        return mo97138G().f112225j;
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

    /* renamed from: q */
    public final void mo24470q() {
        super.mo24470q();
        C39532c cVar = mo97138G().f112221f;
        if (cVar != null) {
            cVar.mo80608c();
        }
    }

    /* renamed from: A */
    public final void mo24457A() {
        super.mo24457A();
        if (mo97138G().f112225j) {
            C39532c cVar = mo97138G().f112221f;
            if (cVar != null) {
                cVar.mo80594a();
            }
            C39532c cVar2 = mo97138G().f112221f;
            if (cVar2 != null) {
                cVar2.mo80610e();
            }
        }
    }

    /* renamed from: z */
    public final void mo24481z() {
        super.mo24481z();
        if (mo97138G().f112225j) {
            C39532c cVar = mo97138G().f112221f;
            if (cVar != null) {
                cVar.mo80605b();
            }
            C39532c cVar2 = mo97138G().f112221f;
            if (cVar2 != null) {
                cVar2.mo80611f();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00f3, code lost:
        if (r0.hasOriginalSound() != false) goto L_0x00f5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0146  */
    /* renamed from: H */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo97139H() {
        /*
            r5 = this;
            com.ss.android.ugc.aweme.shortvideo.k.p r0 = r5.mo97137F()
            boolean r0 = r0.f111272f
            if (r0 != 0) goto L_0x00c8
            com.ss.android.ugc.aweme.shortvideo.k.p r0 = r5.mo97137F()
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r1 = r5.f123422j
            if (r1 != 0) goto L_0x0015
            java.lang.String r2 = "mModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r2)
        L_0x0015:
            boolean r1 = r1.isMuted
            r0.mo89501a(r1)
            com.ss.android.ugc.aweme.shortvideo.k.p r0 = r5.mo97137F()
            com.ss.android.ugc.aweme.shortvideo.p.a r1 = r5.mo97138G()
            android.view.ViewGroup r1 = r1.f112229n
            android.view.View r1 = (android.view.View) r1
            r0.f111267a = r1
            com.ss.android.ugc.aweme.shortvideo.k.p r0 = r5.mo97137F()
            android.app.Activity r1 = r5.f33840g_
            if (r1 == 0) goto L_0x00c0
            android.support.v4.app.FragmentActivity r1 = (android.support.p030v4.app.FragmentActivity) r1
            android.app.Activity r2 = r5.f33840g_
            if (r2 == 0) goto L_0x00b8
            com.ss.android.ugc.aweme.base.activity.t r2 = (com.p683ss.android.ugc.aweme.base.activity.C23441t) r2
            r0.mo89500a(r1, r2)
            com.ss.android.ugc.aweme.shortvideo.k.p r0 = r5.mo97137F()
            r0.mo89499a()
            com.ss.android.ugc.aweme.shortvideo.k.p r0 = r5.mo97137F()
            com.ss.android.ugc.gamora.editor.am$b r1 = new com.ss.android.ugc.gamora.editor.am$b
            r1.<init>(r5)
            com.ss.android.ugc.aweme.shortvideo.k.p$a r1 = (com.p683ss.android.ugc.aweme.shortvideo.p2208k.C43944p.C43948a) r1
            r0.f111273g = r1
            com.ss.android.ugc.gamora.editor.EditVolumeViewModel r0 = r5.f123427p
            if (r0 != 0) goto L_0x0058
            java.lang.String r1 = "mEditVolumeViewModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x0058:
            r1 = 2132541612(0x7f1c00ac, float:2.0736306E38)
            java.lang.String r1 = r5.mo24461a(r1)
            java.lang.String r2 = "getString(R.string.accompany)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
            r0.mo97067a(r1)
            com.ss.android.ugc.gamora.editor.EditVolumeViewModel r0 = r5.f123427p
            if (r0 != 0) goto L_0x0070
            java.lang.String r1 = "mEditVolumeViewModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x0070:
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r1 = r5.f123422j
            if (r1 != 0) goto L_0x0079
            java.lang.String r2 = "mModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r2)
        L_0x0079:
            boolean r1 = r1.isReaction()
            if (r1 == 0) goto L_0x008c
            r1 = 2132548221(0x7f1c1a7d, float:2.074971E38)
            java.lang.String r1 = r5.mo24461a(r1)
            java.lang.String r2 = "getString(R.string.reaction_man_voice)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
            goto L_0x00b4
        L_0x008c:
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r1 = r5.f123422j
            if (r1 != 0) goto L_0x0095
            java.lang.String r2 = "mModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r2)
        L_0x0095:
            boolean r1 = r1.isStitchMode()
            if (r1 == 0) goto L_0x00a8
            r1 = 2132544337(0x7f1c0b51, float:2.0741833E38)
            java.lang.String r1 = r5.mo24461a(r1)
            java.lang.String r2 = "getString(R.string.edit_stitch_your_audio)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
            goto L_0x00b4
        L_0x00a8:
            r1 = 2132546412(0x7f1c136c, float:2.0746041E38)
            java.lang.String r1 = r5.mo24461a(r1)
            java.lang.String r2 = "getString(R.string.man_voice)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
        L_0x00b4:
            r0.mo97068b(r1)
            goto L_0x00c8
        L_0x00b8:
            d.u r0 = new d.u
            java.lang.String r1 = "null cannot be cast to non-null type com.ss.android.ugc.aweme.base.activity.ListenableActivityRegistry"
            r0.<init>(r1)
            throw r0
        L_0x00c0:
            d.u r0 = new d.u
            java.lang.String r1 = "null cannot be cast to non-null type android.support.v4.app.FragmentActivity"
            r0.<init>(r1)
            throw r0
        L_0x00c8:
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r5.f123422j
            if (r0 != 0) goto L_0x00d1
            java.lang.String r1 = "mModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x00d1:
            boolean r0 = r0.isFastImport
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x00f5
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r5.f123422j
            if (r0 != 0) goto L_0x00e0
            java.lang.String r3 = "mModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r3)
        L_0x00e0:
            boolean r0 = r0.isCutSameVideoType()
            if (r0 != 0) goto L_0x00f5
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r5.f123422j
            if (r0 != 0) goto L_0x00ef
            java.lang.String r3 = "mModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r3)
        L_0x00ef:
            boolean r0 = r0.hasOriginalSound()
            if (r0 == 0) goto L_0x0102
        L_0x00f5:
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r5.f123422j
            if (r0 != 0) goto L_0x00fe
            java.lang.String r3 = "mModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r3)
        L_0x00fe:
            boolean r0 = r0.isMuted
            if (r0 == 0) goto L_0x010e
        L_0x0102:
            com.ss.android.ugc.aweme.shortvideo.k.p r0 = r5.mo97137F()
            com.ss.android.ugc.aweme.shortvideo.k.p r0 = r0.mo89505c(r2)
            r0.mo89504b(r1)
            goto L_0x0127
        L_0x010e:
            com.ss.android.ugc.aweme.shortvideo.k.p r0 = r5.mo97137F()
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r3 = r5.f123422j
            if (r3 != 0) goto L_0x011b
            java.lang.String r4 = "mModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r4)
        L_0x011b:
            java.lang.String r3 = r3.mMusicPath
            if (r3 == 0) goto L_0x0120
            r1 = 1
        L_0x0120:
            com.ss.android.ugc.aweme.shortvideo.k.p r0 = r0.mo89505c(r1)
            r0.mo89504b(r2)
        L_0x0127:
            com.ss.android.ugc.aweme.shortvideo.k.p r0 = r5.mo97137F()
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r1 = r5.f123422j
            if (r1 != 0) goto L_0x0134
            java.lang.String r2 = "mModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r2)
        L_0x0134:
            float r1 = r1.musicVolume
            r2 = 1120403456(0x42c80000, float:100.0)
            float r1 = r1 * r2
            int r1 = (int) r1
            r0.mo89498a(r1)
            com.ss.android.ugc.aweme.shortvideo.k.p r0 = r5.mo97137F()
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r1 = r5.f123422j
            if (r1 != 0) goto L_0x014b
            java.lang.String r3 = "mModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r3)
        L_0x014b:
            float r1 = r1.voiceVolume
            float r1 = r1 * r2
            int r1 = (int) r1
            r0.mo89503b(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.gamora.editor.C49115am.mo97139H():void");
    }

    /* renamed from: a */
    public static final /* synthetic */ VideoPublishEditModel m106009a(C49115am amVar) {
        VideoPublishEditModel videoPublishEditModel = amVar.f123422j;
        if (videoPublishEditModel == null) {
            C52711k.m112237a("mModel");
        }
        return videoPublishEditModel;
    }

    /* renamed from: b */
    public static final /* synthetic */ VEVideoPublishEditViewModel m106010b(C49115am amVar) {
        VEVideoPublishEditViewModel vEVideoPublishEditViewModel = amVar.f123423k;
        if (vEVideoPublishEditViewModel == null) {
            C52711k.m112237a("mViewModel");
        }
        return vEVideoPublishEditViewModel;
    }

    /* renamed from: e */
    public final void mo24448e(Bundle bundle) {
        super.mo24448e(bundle);
        Activity activity = this.f33840g_;
        if (activity != null) {
            C0209x a = C0214z.m440a((FragmentActivity) activity).mo359a(VEVideoPublishEditViewModel.class);
            C52711k.m112236a((Object) a, "ViewModelProviders.of(ac…ditViewModel::class.java)");
            this.f123423k = (VEVideoPublishEditViewModel) a;
            Activity activity2 = this.f33840g_;
            if (activity2 != null) {
                JediViewModel a2 = C48927d.m105736a((FragmentActivity) activity2).mo96760a(EditVolumeViewModel.class);
                C52711k.m112236a((Object) a2, "JediViewModelProviders.o…umeViewModel::class.java)");
                this.f123427p = (EditVolumeViewModel) a2;
                Activity activity3 = this.f33840g_;
                if (activity3 != null) {
                    JediViewModel a3 = C48927d.m105736a((FragmentActivity) activity3).mo96760a(EditMusicViewModel.class);
                    C52711k.m112236a((Object) a3, "JediViewModelProviders.o…sicViewModel::class.java)");
                    this.f123428q = (EditMusicViewModel) a3;
                    VideoPublishEditModel videoPublishEditModel = this.f123422j;
                    if (videoPublishEditModel == null) {
                        C52711k.m112237a("mModel");
                    }
                    if (videoPublishEditModel.isMvThemeVideoType()) {
                        mo97138G().mo90207a(videoPublishEditModel.mvCreateVideoData.musicIds);
                        mo97138G().f112226k = videoPublishEditModel.mIsFromDraft;
                    } else if (videoPublishEditModel.isStatusVideoType()) {
                        mo97138G().mo90207a((List<String>) new ArrayList<String>(videoPublishEditModel.statusCreateVideoData.getMusicIds()));
                        mo97138G().f112226k = videoPublishEditModel.mIsFromDraft;
                    }
                    EditMusicViewModel editMusicViewModel = this.f123428q;
                    if (editMusicViewModel == null) {
                        C52711k.m112237a("musicViewModel");
                    }
                    mo49443b(editMusicViewModel, C49128an.f123440a, new C11934u(), new C49120e(this));
                    EditMusicViewModel editMusicViewModel2 = this.f123428q;
                    if (editMusicViewModel2 == null) {
                        C52711k.m112237a("musicViewModel");
                    }
                    mo49444c(editMusicViewModel2, C49129ao.f123441a, new C11934u(), new C49121f(this));
                    EditMusicViewModel editMusicViewModel3 = this.f123428q;
                    if (editMusicViewModel3 == null) {
                        C52711k.m112237a("musicViewModel");
                    }
                    mo49443b(editMusicViewModel3, C49130ap.f123442a, new C11934u(), new C49122g(this));
                    mo97138G().f112231p = new C49123h(this);
                    mo97138G().f112230o = new C49124i(this);
                    mo97138G().f112224i = new C49125j(this);
                    mo97138G().f112220e = new C49126k(this);
                    mo97138G().f112222g = new C49127l(this);
                    return;
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
    public final <S extends C11932s> C1690c mo22546a(JediViewModel<S> jediViewModel, C11934u<S> uVar, C52682m<? super C11866f, ? super S, C52860x> mVar) {
        C52711k.m112240b(jediViewModel, "$this$subscribe");
        C52711k.m112240b(uVar, "config");
        C52711k.m112240b(mVar, "subscriber");
        return C49549a.m106919a(this, jediViewModel, uVar, mVar);
    }

    /* renamed from: a */
    public final View mo24387a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C52711k.m112240b(layoutInflater, "inflater");
        C52711k.m112240b(viewGroup, "container");
        C44342a G = mo97138G();
        Activity activity = this.f33840g_;
        if (activity != null) {
            AppCompatActivity appCompatActivity = (AppCompatActivity) activity;
            C52711k.m112240b(appCompatActivity, "<set-?>");
            G.f112216a = appCompatActivity;
            C44342a G2 = mo97138G();
            Activity activity2 = this.f33840g_;
            if (!(activity2 instanceof C23441t)) {
                activity2 = null;
            }
            G2.f112218c = (C23441t) activity2;
            C44342a G3 = mo97138G();
            View inflate = layoutInflater.inflate(R.layout.ae5, viewGroup, false);
            if (inflate != null) {
                G3.f112217b = (FrameLayout) inflate;
                FrameLayout frameLayout = mo97138G().f112217b;
                if (frameLayout == null) {
                    C52711k.m112234a();
                }
                return frameLayout;
            }
            throw new C52857u("null cannot be cast to non-null type android.widget.FrameLayout");
        }
        throw new C52857u("null cannot be cast to non-null type android.support.v7.app.AppCompatActivity");
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
