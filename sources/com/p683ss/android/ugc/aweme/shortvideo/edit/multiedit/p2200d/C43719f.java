package com.p683ss.android.ugc.aweme.shortvideo.edit.multiedit.p2200d;

import android.content.Intent;
import android.support.p030v4.app.FragmentActivity;
import android.support.p030v4.p038f.C0794k;
import android.util.Pair;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.p501q.C9190h;
import com.p683ss.android.ugc.asve.p1239c.C20347c;
import com.p683ss.android.ugc.aweme.base.activity.C23422a;
import com.p683ss.android.ugc.aweme.base.activity.C23441t;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.music.mediachoose.helper.MediaModel;
import com.p683ss.android.ugc.aweme.shortvideo.C42482c;
import com.p683ss.android.ugc.aweme.shortvideo.RetakeVideoContext;
import com.p683ss.android.ugc.aweme.shortvideo.cut.C42652k;
import com.p683ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import com.p683ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.p683ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel;
import com.p683ss.android.ugc.aweme.shortvideo.cut.viewmodel.C43168a;
import com.p683ss.android.ugc.aweme.shortvideo.cut.viewmodel.VEVideoCutterViewModel;
import com.p683ss.android.ugc.aweme.shortvideo.edit.VEVideoPublishEditActivity;
import com.p683ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p683ss.android.ugc.aweme.shortvideo.edit.multiedit.data.C43738a;
import com.p683ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData;
import com.p683ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoSegmentRecordData;
import com.p683ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoStatusRecordData;
import com.p683ss.android.ugc.aweme.shortvideo.edit.multiedit.p2198b.C43678a;
import com.p683ss.android.ugc.aweme.shortvideo.edit.multiedit.p2198b.C43682b;
import com.p683ss.android.ugc.aweme.shortvideo.edit.multiedit.p2198b.C43684d;
import com.p683ss.android.ugc.aweme.shortvideo.edit.multiedit.p2199c.C43689a;
import com.p683ss.android.ugc.aweme.shortvideo.edit.multiedit.p2199c.C43690b;
import com.p683ss.android.ugc.aweme.shortvideo.edit.multiedit.p2199c.C43691c;
import com.p683ss.android.ugc.aweme.shortvideo.edit.multiedit.p2199c.C43692d;
import com.p683ss.android.ugc.aweme.shortvideo.edit.multiedit.p2200d.C43731g.C43733b;
import com.p683ss.android.ugc.aweme.shortvideo.edit.multiedit.view.C43744a;
import com.p683ss.android.ugc.aweme.shortvideo.edit.multiedit.view.C43746c;
import com.p683ss.android.ugc.aweme.shortvideo.edit.multiedit.view.C43756d;
import com.p683ss.android.ugc.aweme.shortvideo.p2220q.C44403a;
import com.p683ss.android.ugc.aweme.shortvideo.p2220q.C44404b;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.TimeSpeedModelExtension;
import com.p683ss.android.ugc.gamora.editor.EditViewModel;
import com.p683ss.android.vesdk.C50720o.C50743d;
import com.p683ss.android.vesdk.VERecordData;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import p2628d.C52857u;
import p2628d.C52860x;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52722v.C52723a;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.d.f */
public final class C43719f implements OnClickListener {

    /* renamed from: A */
    public C43698c f110678A = new C43698c();

    /* renamed from: B */
    public C23441t f110679B;

    /* renamed from: C */
    private ArrayList<MediaModel> f110680C = new ArrayList<>();

    /* renamed from: D */
    private ArrayList<VideoSegment> f110681D = new ArrayList<>();

    /* renamed from: E */
    private boolean f110682E;

    /* renamed from: F */
    private final C23422a f110683F = new C43726g(this);

    /* renamed from: G */
    private C43689a f110684G;

    /* renamed from: a */
    public CutMultiVideoViewModel f110685a;

    /* renamed from: b */
    public VideoEditViewModel f110686b;

    /* renamed from: c */
    public VEVideoCutterViewModel f110687c;

    /* renamed from: d */
    public EditViewModel f110688d;

    /* renamed from: e */
    public FragmentActivity f110689e;

    /* renamed from: f */
    public View f110690f;

    /* renamed from: g */
    public C43744a f110691g;

    /* renamed from: h */
    public C43699d f110692h = new C43699d();

    /* renamed from: i */
    public C43731g f110693i = new C43731g();

    /* renamed from: j */
    public C43701e f110694j = new C43701e();

    /* renamed from: k */
    public int f110695k;

    /* renamed from: l */
    public boolean f110696l;

    /* renamed from: m */
    public VideoPublishEditModel f110697m;

    /* renamed from: n */
    public MultiEditVideoRecordData f110698n;

    /* renamed from: o */
    public MultiEditVideoRecordData f110699o;

    /* renamed from: p */
    public MultiEditVideoRecordData f110700p;

    /* renamed from: q */
    public MultiEditVideoRecordData f110701q;

    /* renamed from: r */
    public C42482c f110702r;

    /* renamed from: s */
    public int f110703s;

    /* renamed from: t */
    public ArrayList<TimeSpeedModelExtension> f110704t;

    /* renamed from: u */
    public ArrayList<TimeSpeedModelExtension> f110705u;

    /* renamed from: v */
    public ArrayList<TimeSpeedModelExtension> f110706v;

    /* renamed from: w */
    public ArrayList<TimeSpeedModelExtension> f110707w;

    /* renamed from: x */
    public boolean f110708x;

    /* renamed from: y */
    public int f110709y = 1;

    /* renamed from: z */
    public int f110710z;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.d.f$a */
    static final class C43720a extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C43719f f110711a;

        C43720a(C43719f fVar) {
            this.f110711a = fVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            this.f110711a.mo89166h();
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.d.f$b */
    static final class C43721b extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C43719f f110712a;

        C43721b(C43719f fVar) {
            this.f110712a = fVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            this.f110712a.mo89163e();
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.d.f$c */
    public static final class C43722c implements C43691c {

        /* renamed from: a */
        final /* synthetic */ C43719f f110713a;

        /* renamed from: a */
        public final void mo89120a() {
            this.f110713a.f110693i.mo89172a(C43719f.m96021d(this.f110713a), this.f110713a.f110695k, false, true);
        }

        /* renamed from: b */
        public final void mo89125b() {
            this.f110713a.f110693i.mo89172a(C43719f.m96021d(this.f110713a), this.f110713a.f110695k, false, false);
        }

        /* renamed from: c */
        public final void mo89126c() {
            this.f110713a.f110693i.mo89172a(C43719f.m96021d(this.f110713a), this.f110713a.f110695k, true, false);
        }

        /* renamed from: d */
        public final void mo89127d() {
            if (!C43719f.m96022e(this.f110713a).multiEditVideoRecordData.isMultiEditRetake || C43719f.m96022e(this.f110713a).multiEditVideoRecordData.segmentSizeChange) {
                C43731g gVar = this.f110713a.f110693i;
                FragmentActivity d = C43719f.m96021d(this.f110713a);
                VideoSegment videoSegment = (VideoSegment) C43719f.m96020c(this.f110713a).mo87634l().get(this.f110713a.f110695k);
                int i = this.f110713a.f110695k;
                gVar.mo89174a(videoSegment);
                C43744a aVar = gVar.f110723a;
                if (aVar == null) {
                    C52711k.m112237a("viewManager");
                }
                aVar.mo89208a(d, i, new C43733b(gVar));
                C43692d dVar = gVar.f110724b;
                if (dVar == null) {
                    C52711k.m112237a("statusChangeListener");
                }
                dVar.mo89128a();
                return;
            }
            this.f110713a.f110693i.mo89173a(C43719f.m96021d(this.f110713a), (VideoSegment) C43719f.m96020c(this.f110713a).mo87634l().get(this.f110713a.f110695k), this.f110713a.f110695k);
        }

        public C43722c(C43719f fVar) {
            this.f110713a = fVar;
        }

        /* renamed from: a */
        public final void mo89124a(Integer num) {
            int i;
            C43719f fVar = this.f110713a;
            if (num != null) {
                i = num.intValue();
            } else {
                i = 1;
            }
            fVar.f110709y = i;
        }

        /* renamed from: a */
        public final void mo89123a(C0794k<Integer, Integer> kVar) {
            if (kVar != null && this.f110713a.f110709y != 2) {
                C43744a b = C43719f.m96019b(this.f110713a);
                F f = kVar.f2711a;
                if (f == null) {
                    C52711k.m112234a();
                }
                C52711k.m112236a((Object) f, "pair.first!!");
                int intValue = ((Number) f).intValue();
                S s = kVar.f2712b;
                if (s == null) {
                    C52711k.m112234a();
                }
                C52711k.m112236a((Object) s, "pair.second!!");
                b.mo89207a(intValue, ((Number) s).intValue());
            }
        }

        /* renamed from: a */
        public final void mo89121a(int i, int i2) {
            this.f110713a.mo89155a(i, i2);
        }

        /* renamed from: a */
        public final void mo89122a(long j, long j2) {
            if (this.f110713a.mo89157a()) {
                if (this.f110713a.f110710z == 0) {
                    this.f110713a.f110710z = (int) (this.f110713a.f110678A.f110636b - this.f110713a.f110678A.f110635a);
                }
                int i = (int) (j2 - j);
                C43682b.f110613f.mo89109a(false, true, 0, this.f110713a.f110710z, i);
                this.f110713a.f110710z = i;
            } else if (this.f110713a.f110709y == 1) {
                if (this.f110713a.f110710z == 0) {
                    this.f110713a.f110710z = (int) (this.f110713a.f110678A.f110636b - this.f110713a.f110678A.f110635a);
                }
                int i2 = (int) (j2 - j);
                C43682b.f110613f.mo89109a(false, false, 0, this.f110713a.f110710z, i2);
                this.f110713a.f110710z = i2;
            } else {
                if (this.f110713a.f110710z == 0) {
                    C43719f fVar = this.f110713a;
                    Object obj = C43719f.m96020c(this.f110713a).mo87634l().get(this.f110713a.f110695k);
                    C52711k.m112236a(obj, "videoEditViewModel.origi…deoList[currentEditIndex]");
                    long g = ((VideoSegment) obj).mo86953g();
                    Object obj2 = C43719f.m96020c(this.f110713a).mo87634l().get(this.f110713a.f110695k);
                    C52711k.m112236a(obj2, "videoEditViewModel.origi…deoList[currentEditIndex]");
                    fVar.f110710z = (int) (g - ((VideoSegment) obj2).mo86952f());
                }
                int i3 = (int) (j2 - j);
                C43682b.f110613f.mo89109a(true, false, this.f110713a.f110695k, this.f110713a.f110710z, i3);
                this.f110713a.f110710z = i3;
            }
            if (this.f110713a.f110709y == 1) {
                this.f110713a.f110678A.f110635a = j;
                this.f110713a.f110678A.f110636b = j2;
                C0794k d = C43719f.m96019b(this.f110713a).mo89225d();
                C43698c cVar = this.f110713a.f110678A;
                F f = d.f2711a;
                if (f == null) {
                    C52711k.m112234a();
                }
                cVar.f110637c = ((Number) f).floatValue();
                C43698c cVar2 = this.f110713a.f110678A;
                S s = d.f2712b;
                if (s == null) {
                    C52711k.m112234a();
                }
                cVar2.f110638d = ((Number) s).floatValue();
                this.f110713a.f110692h.mo89141a(C43719f.m96018a(this.f110713a), (int) j, (int) j2);
                return;
            }
            this.f110713a.f110692h.mo89142a(C43719f.m96018a(this.f110713a), this.f110713a.f110678A.f110644j, (int) j, (int) (j2 - j));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.d.f$d */
    public static final class C43723d implements C43692d {

        /* renamed from: a */
        final /* synthetic */ C43719f f110714a;

        /* renamed from: b */
        public final void mo89130b() {
            this.f110714a.f110708x = false;
        }

        /* renamed from: a */
        public final void mo89128a() {
            if (!this.f110714a.f110678A.f110641g) {
                this.f110714a.mo89162d();
            }
        }

        public C43723d(C43719f fVar) {
            this.f110714a = fVar;
        }

        /* renamed from: a */
        public final void mo89129a(boolean z, boolean z2) {
            Pair pair;
            C43719f fVar = this.f110714a;
            fVar.f110710z = 0;
            VideoEditViewModel videoEditViewModel = fVar.f110686b;
            if (videoEditViewModel == null) {
                C52711k.m112237a("videoEditViewModel");
            }
            VideoSegment videoSegment = (VideoSegment) videoEditViewModel.mo87634l().get(fVar.f110695k);
            if (z || z2) {
                fVar.f110678A.mo89135a();
                C43698c cVar = fVar.f110678A;
                MultiEditVideoRecordData multiEditVideoRecordData = fVar.f110698n;
                if (multiEditVideoRecordData == null) {
                    C52711k.m112237a("curRecordData");
                }
                cVar.mo89137b(multiEditVideoRecordData);
            } else if (fVar.f110678A.f110641g) {
                fVar.mo89161c(true);
            }
            fVar.mo89167i();
            if (z2) {
                MultiEditVideoRecordData multiEditVideoRecordData2 = fVar.f110698n;
                if (multiEditVideoRecordData2 == null) {
                    C52711k.m112237a("curRecordData");
                }
                multiEditVideoRecordData2.segmentDataList.remove(fVar.f110695k);
                VideoEditViewModel videoEditViewModel2 = fVar.f110686b;
                if (videoEditViewModel2 == null) {
                    C52711k.m112237a("videoEditViewModel");
                }
                videoEditViewModel2.mo87634l().remove(videoSegment);
                C43744a aVar = fVar.f110691g;
                if (aVar == null) {
                    C52711k.m112237a("viewManager");
                }
                aVar.mo89221b(videoSegment);
                C43744a aVar2 = fVar.f110691g;
                if (aVar2 == null) {
                    C52711k.m112237a("viewManager");
                }
                aVar2.mo89218a(false);
                int i = fVar.f110695k;
                ArrayList<TimeSpeedModelExtension> arrayList = fVar.f110706v;
                if (arrayList == null) {
                    C52711k.m112237a("editSegments");
                }
                if (i < arrayList.size()) {
                    ArrayList<TimeSpeedModelExtension> arrayList2 = fVar.f110706v;
                    if (arrayList2 == null) {
                        C52711k.m112237a("editSegments");
                    }
                    arrayList2.remove(fVar.f110695k);
                }
                C43682b bVar = C43682b.f110613f;
                C26890h.m65011a("delete_video_section", C43682b.m95953c().mo47829a("order", String.valueOf(fVar.f110695k + 1)).f61491a);
                MultiEditVideoRecordData multiEditVideoRecordData3 = fVar.f110698n;
                if (multiEditVideoRecordData3 == null) {
                    C52711k.m112237a("curRecordData");
                }
                MultiEditVideoRecordData multiEditVideoRecordData4 = fVar.f110700p;
                if (multiEditVideoRecordData4 == null) {
                    C52711k.m112237a("originRecordData");
                }
                fVar.f110700p = C43684d.m95970a(multiEditVideoRecordData3, multiEditVideoRecordData4);
                MultiEditVideoRecordData multiEditVideoRecordData5 = fVar.f110700p;
                if (multiEditVideoRecordData5 == null) {
                    C52711k.m112237a("originRecordData");
                }
                multiEditVideoRecordData5.resetTimeData();
            } else if (z) {
                MultiEditVideoRecordData multiEditVideoRecordData6 = fVar.f110698n;
                if (multiEditVideoRecordData6 == null) {
                    C52711k.m112237a("curRecordData");
                }
                List<MultiEditVideoSegmentRecordData> list = multiEditVideoRecordData6.segmentDataList;
                C52711k.m112236a((Object) list, "curRecordData.segmentDataList");
                int i2 = 0;
                for (MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData : list) {
                    if (C52711k.m112239a((Object) multiEditVideoSegmentRecordData.videoPath, (Object) videoSegment.mo86941a(false))) {
                        C52711k.m112236a((Object) videoSegment, "videoSegment");
                        multiEditVideoSegmentRecordData.startTime = videoSegment.mo86952f();
                        multiEditVideoSegmentRecordData.endTime = videoSegment.mo86953g();
                        i2 = (int) (videoSegment.mo86953g() - videoSegment.mo86952f());
                    }
                }
                C43682b bVar2 = C43682b.f110613f;
                C26890h.m65011a("confirm_video_trim", C43682b.m95953c().mo47829a("from_video_length", String.valueOf(fVar.f110678A.f110645k)).mo47829a("to_video_length", String.valueOf(i2)).f61491a);
            }
            if (z || z2) {
                MultiEditVideoRecordData multiEditVideoRecordData7 = fVar.f110698n;
                if (multiEditVideoRecordData7 == null) {
                    C52711k.m112237a("curRecordData");
                }
                Pair playInOutTime = multiEditVideoRecordData7.getPlayInOutTime();
                C52711k.m112236a((Object) playInOutTime, "curRecordData.playInOutTime");
                pair = playInOutTime;
            } else {
                MultiEditVideoRecordData multiEditVideoRecordData8 = fVar.f110698n;
                if (multiEditVideoRecordData8 == null) {
                    C52711k.m112237a("curRecordData");
                }
                Integer num = (Integer) multiEditVideoRecordData8.getPlayInOutTime().second;
                if (fVar.f110678A.f110636b > 0) {
                    num = Integer.valueOf((int) fVar.f110678A.f110636b);
                }
                pair = new Pair(Integer.valueOf((int) fVar.f110678A.f110635a), num);
            }
            fVar.f110694j.mo89150a(true);
            C43699d dVar = fVar.f110692h;
            MultiEditVideoRecordData multiEditVideoRecordData9 = fVar.f110698n;
            if (multiEditVideoRecordData9 == null) {
                C52711k.m112237a("curRecordData");
            }
            dVar.mo89143a(multiEditVideoRecordData9, videoSegment, pair, z, z2);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.d.f$e */
    public static final class C43724e implements C43689a {

        /* renamed from: a */
        final /* synthetic */ C43719f f110715a;

        /* renamed from: b */
        public final void mo89117b() {
            this.f110715a.f110694j.mo89149a();
        }

        /* renamed from: a */
        public final void mo89116a() {
            C43701e eVar = this.f110715a.f110694j;
            eVar.f110658j.post(eVar.f110660l);
        }

        /* renamed from: c */
        public final void mo89118c() {
            if (!this.f110715a.f110678A.f110639e) {
                this.f110715a.f110692h.mo89138a();
                this.f110715a.f110692h.f110647b = null;
                return;
            }
            if (!C43719f.m96019b(this.f110715a).mo89223b()) {
                this.f110715a.f110692h.mo89138a();
            }
        }

        C43724e(C43719f fVar) {
            this.f110715a = fVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.d.f$f */
    public static final class C43725f implements C43690b {

        /* renamed from: a */
        final /* synthetic */ C43719f f110716a;

        C43725f(C43719f fVar) {
            this.f110716a = fVar;
        }

        /* renamed from: a */
        public final void mo89119a(int i) {
            C43682b bVar = C43682b.f110613f;
            C26890h.m65011a("select_video_section", C43682b.m95953c().mo47829a("order", String.valueOf(i + 1)).f61491a);
            this.f110716a.mo89154a(i);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.d.f$g */
    static final class C43726g implements C23422a {

        /* renamed from: a */
        final /* synthetic */ C43719f f110717a;

        C43726g(C43719f fVar) {
            this.f110717a = fVar;
        }

        public final boolean onKeyDown(int i, KeyEvent keyEvent) {
            if (i != 4 || !this.f110717a.f110678A.f110639e) {
                return false;
            }
            if (this.f110717a.f110709y == 1) {
                this.f110717a.mo89164f();
            } else {
                this.f110717a.mo89165g();
            }
            return true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.d.f$h */
    static final class C43727h extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C43719f f110718a;

        C43727h(C43719f fVar) {
            this.f110718a = fVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            VideoSegment videoSegment = (VideoSegment) C43719f.m96020c(this.f110718a).mo87634l().get(this.f110718a.f110695k);
            CutMultiVideoViewModel cutMultiVideoViewModel = this.f110718a.f110685a;
            if (cutMultiVideoViewModel == null) {
                C52711k.m112237a("cutMultiVideoViewModel");
            }
            cutMultiVideoViewModel.mo86799a(videoSegment);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.d.f$i */
    static final class C43728i implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C43719f f110719a;

        C43728i(C43719f fVar) {
            this.f110719a = fVar;
        }

        public final void run() {
            this.f110719a.f110692h.mo89145b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.d.f$j */
    static final class C43729j implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C43719f f110720a;

        C43729j(C43719f fVar) {
            this.f110720a = fVar;
        }

        public final void run() {
            C43699d dVar = this.f110720a.f110692h;
            MultiEditVideoRecordData a = C43719f.m96018a(this.f110720a);
            MultiEditVideoRecordData multiEditVideoRecordData = this.f110720a.f110700p;
            if (multiEditVideoRecordData == null) {
                C52711k.m112237a("originRecordData");
            }
            dVar.mo89144a(a, multiEditVideoRecordData);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.d.f$k */
    static final class C43730k implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C43719f f110721a;

        /* renamed from: b */
        final /* synthetic */ C52723a f110722b;

        C43730k(C43719f fVar, C52723a aVar) {
            this.f110721a = fVar;
            this.f110722b = aVar;
        }

        public final void run() {
            this.f110721a.f110694j.mo89150a(this.f110722b.element);
        }
    }

    /* renamed from: a */
    public final boolean mo89157a() {
        return this.f110678A.f110640f;
    }

    /* renamed from: e */
    public final void mo89163e() {
        if (!this.f110708x) {
            this.f110708x = true;
            C42652k.m93586b();
            CutMultiVideoViewModel cutMultiVideoViewModel = this.f110685a;
            if (cutMultiVideoViewModel == null) {
                C52711k.m112237a("cutMultiVideoViewModel");
            }
            cutMultiVideoViewModel.mo86803c();
        }
    }

    /* renamed from: h */
    public final void mo89166h() {
        C43699d dVar = this.f110692h;
        MultiEditVideoRecordData multiEditVideoRecordData = this.f110699o;
        if (multiEditVideoRecordData == null) {
            C52711k.m112237a("restoreRecordData");
        }
        dVar.mo89140a(multiEditVideoRecordData);
        EditViewModel editViewModel = this.f110688d;
        if (editViewModel == null) {
            C52711k.m112237a("editViewModel");
        }
        editViewModel.mo97042l().setValue(Boolean.valueOf(false));
        mo89161c(false);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public final void mo89167i() {
        this.f110678A.f110642h = false;
        this.f110678A.f110641g = false;
        VideoPublishEditModel videoPublishEditModel = this.f110697m;
        if (videoPublishEditModel == null) {
            C52711k.m112237a("model");
        }
        videoPublishEditModel.multiEditVideoRecordData.isMultiEditRetake = false;
        VideoPublishEditModel videoPublishEditModel2 = this.f110697m;
        if (videoPublishEditModel2 == null) {
            C52711k.m112237a("model");
        }
        videoPublishEditModel2.multiEditVideoRecordData.segmentSizeChange = false;
        VideoPublishEditModel videoPublishEditModel3 = this.f110697m;
        if (videoPublishEditModel3 == null) {
            C52711k.m112237a("model");
        }
        videoPublishEditModel3.multiEditVideoRecordData.currentEditIndex = -1;
    }

    /* renamed from: f */
    public final void mo89164f() {
        boolean z;
        MultiEditVideoRecordData multiEditVideoRecordData = this.f110699o;
        if (multiEditVideoRecordData == null) {
            C52711k.m112237a("restoreRecordData");
        }
        if (multiEditVideoRecordData.startTime != this.f110678A.f110635a) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            MultiEditVideoRecordData multiEditVideoRecordData2 = this.f110699o;
            if (multiEditVideoRecordData2 == null) {
                C52711k.m112237a("restoreRecordData");
            }
            if (multiEditVideoRecordData2.endTime != this.f110678A.f110636b) {
                z = true;
            } else {
                z = false;
            }
        }
        if (!z) {
            MultiEditVideoRecordData multiEditVideoRecordData3 = this.f110698n;
            if (multiEditVideoRecordData3 == null) {
                C52711k.m112237a("curRecordData");
            }
            MultiEditVideoRecordData multiEditVideoRecordData4 = this.f110699o;
            if (multiEditVideoRecordData4 == null) {
                C52711k.m112237a("restoreRecordData");
            }
            z = !multiEditVideoRecordData3.isEqual(multiEditVideoRecordData4);
        }
        if (z) {
            FragmentActivity fragmentActivity = this.f110689e;
            if (fragmentActivity == null) {
                C52711k.m112237a("activity");
            }
            C43678a.m95952b(fragmentActivity, new C43720a(this));
        } else {
            mo89166h();
        }
        this.f110701q = null;
        mo89167i();
        C43682b.f110613f.mo89110b();
    }

    /* renamed from: g */
    public final void mo89165g() {
        C43744a aVar = this.f110691g;
        if (aVar == null) {
            C52711k.m112237a("viewManager");
        }
        boolean e = aVar.mo89226e();
        if (!e && this.f110682E && this.f110701q != null) {
            MultiEditVideoRecordData multiEditVideoRecordData = this.f110701q;
            if (multiEditVideoRecordData == null) {
                C52711k.m112234a();
            }
            String str = ((MultiEditVideoSegmentRecordData) multiEditVideoRecordData.segmentDataList.get(this.f110695k)).videoPath;
            MultiEditVideoRecordData multiEditVideoRecordData2 = this.f110698n;
            if (multiEditVideoRecordData2 == null) {
                C52711k.m112237a("curRecordData");
            }
            e = !C52711k.m112239a((Object) ((MultiEditVideoSegmentRecordData) multiEditVideoRecordData2.segmentDataList.get(this.f110695k)).videoPath, (Object) str);
        }
        if (e) {
            FragmentActivity fragmentActivity = this.f110689e;
            if (fragmentActivity == null) {
                C52711k.m112237a("activity");
            }
            C43678a.m95951a(fragmentActivity, new C43721b(this));
        } else {
            mo89163e();
        }
        C43682b.f110613f.mo89108a();
        this.f110682E = false;
    }

    /* renamed from: j */
    private final void m96023j() {
        this.f110678A.mo89135a();
        C43698c cVar = this.f110678A;
        MultiEditVideoRecordData multiEditVideoRecordData = this.f110698n;
        if (multiEditVideoRecordData == null) {
            C52711k.m112237a("curRecordData");
        }
        cVar.mo89137b(multiEditVideoRecordData);
        int i = this.f110695k;
        RetakeVideoContext retakeVideoContext = new RetakeVideoContext();
        MultiEditVideoRecordData multiEditVideoRecordData2 = this.f110698n;
        if (multiEditVideoRecordData2 == null) {
            C52711k.m112237a("curRecordData");
        }
        retakeVideoContext.f107015d = C43738a.m96063a(multiEditVideoRecordData2);
        retakeVideoContext.f107014c = i;
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            MultiEditVideoRecordData multiEditVideoRecordData3 = this.f110698n;
            if (multiEditVideoRecordData3 == null) {
                C52711k.m112237a("curRecordData");
            }
            j += ((MultiEditVideoSegmentRecordData) multiEditVideoRecordData3.segmentDataList.get(i2)).videoLength;
        }
        retakeVideoContext.f107013b = j / 1000;
        MultiEditVideoRecordData multiEditVideoRecordData4 = this.f110698n;
        if (multiEditVideoRecordData4 == null) {
            C52711k.m112237a("curRecordData");
        }
        retakeVideoContext.f107012a = ((MultiEditVideoSegmentRecordData) multiEditVideoRecordData4.segmentDataList.get(i)).videoLength / 1000;
        StringBuilder sb = new StringBuilder();
        MultiEditVideoRecordData multiEditVideoRecordData5 = this.f110698n;
        if (multiEditVideoRecordData5 == null) {
            C52711k.m112237a("curRecordData");
        }
        sb.append(multiEditVideoRecordData5.curRecordingDir);
        sb.append(File.separator);
        sb.append("new");
        String sb2 = sb.toString();
        C52711k.m112240b(sb2, "<set-?>");
        retakeVideoContext.f107017f = sb2;
        MultiEditVideoStatusRecordData multiEditVideoStatusRecordData = new MultiEditVideoStatusRecordData();
        MultiEditVideoRecordData multiEditVideoRecordData6 = this.f110698n;
        if (multiEditVideoRecordData6 == null) {
            C52711k.m112237a("curRecordData");
        }
        multiEditVideoRecordData6.hasRetake = true;
        multiEditVideoStatusRecordData.currentEditIndex = this.f110695k;
        ArrayList<TimeSpeedModelExtension> arrayList = this.f110704t;
        if (arrayList == null) {
            C52711k.m112237a("originalRecordSegments");
        }
        multiEditVideoStatusRecordData.originalSegments = arrayList;
        ArrayList<TimeSpeedModelExtension> arrayList2 = this.f110705u;
        if (arrayList2 == null) {
            C52711k.m112237a("restoreRecordSegments");
        }
        multiEditVideoStatusRecordData.restoreSegments = arrayList2;
        ArrayList<TimeSpeedModelExtension> arrayList3 = this.f110707w;
        if (arrayList3 == null) {
            C52711k.m112237a("singleRestoreSegments");
        }
        multiEditVideoStatusRecordData.singleRestoreSegments = arrayList3;
        ArrayList<TimeSpeedModelExtension> arrayList4 = this.f110706v;
        if (arrayList4 == null) {
            C52711k.m112237a("editSegments");
        }
        multiEditVideoStatusRecordData.editSegments = arrayList4;
        MultiEditVideoRecordData multiEditVideoRecordData7 = this.f110698n;
        if (multiEditVideoRecordData7 == null) {
            C52711k.m112237a("curRecordData");
        }
        multiEditVideoStatusRecordData.curMultiEditVideoRecordData = multiEditVideoRecordData7;
        MultiEditVideoRecordData multiEditVideoRecordData8 = this.f110700p;
        if (multiEditVideoRecordData8 == null) {
            C52711k.m112237a("originRecordData");
        }
        multiEditVideoStatusRecordData.originMultiEditRecordData = multiEditVideoRecordData8;
        MultiEditVideoRecordData multiEditVideoRecordData9 = this.f110699o;
        if (multiEditVideoRecordData9 == null) {
            C52711k.m112237a("restoreRecordData");
        }
        multiEditVideoStatusRecordData.restoreMultiEditVideoRecordData = multiEditVideoRecordData9;
        MultiEditVideoRecordData multiEditVideoRecordData10 = this.f110698n;
        if (multiEditVideoRecordData10 == null) {
            C52711k.m112237a("curRecordData");
        }
        multiEditVideoStatusRecordData.singleRestoreMultiEditRecordData = C43684d.m95970a(multiEditVideoRecordData10, null);
        multiEditVideoStatusRecordData.recordMusic = this.f110702r;
        multiEditVideoStatusRecordData.originalMusicStart = this.f110703s;
        retakeVideoContext.f107016e = multiEditVideoStatusRecordData;
        VideoPublishEditModel videoPublishEditModel = this.f110697m;
        if (videoPublishEditModel == null) {
            C52711k.m112237a("model");
        }
        if (videoPublishEditModel.isStitchMode()) {
            VideoPublishEditModel videoPublishEditModel2 = this.f110697m;
            if (videoPublishEditModel2 == null) {
                C52711k.m112237a("model");
            }
            retakeVideoContext.f107018g = videoPublishEditModel2.stitchParams;
        }
        VideoPublishEditModel videoPublishEditModel3 = this.f110697m;
        if (videoPublishEditModel3 == null) {
            C52711k.m112237a("model");
        }
        if (videoPublishEditModel3.mIsFromDraft) {
            FragmentActivity fragmentActivity = this.f110689e;
            if (fragmentActivity == null) {
                C52711k.m112237a("activity");
            }
            if (fragmentActivity instanceof VEVideoPublishEditActivity) {
                FragmentActivity fragmentActivity2 = this.f110689e;
                if (fragmentActivity2 == null) {
                    C52711k.m112237a("activity");
                }
                if (fragmentActivity2 != null) {
                    VEVideoPublishEditActivity vEVideoPublishEditActivity = (VEVideoPublishEditActivity) fragmentActivity2;
                    VideoPublishEditModel videoPublishEditModel4 = this.f110697m;
                    if (videoPublishEditModel4 == null) {
                        C52711k.m112237a("model");
                    }
                    Intent a = vEVideoPublishEditActivity.mo88075a(videoPublishEditModel4);
                    if (a != null) {
                        a.putExtra("retake_video", retakeVideoContext);
                        a.putExtra("retake_shoot_mode", 1);
                        VideoPublishEditModel videoPublishEditModel5 = this.f110697m;
                        if (videoPublishEditModel5 == null) {
                            C52711k.m112237a("model");
                        }
                        vEVideoPublishEditActivity.mo88078a(a, videoPublishEditModel5);
                    } else {
                        return;
                    }
                } else {
                    throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.VEVideoPublishEditActivity");
                }
            } else {
                return;
            }
        } else {
            Intent intent = new Intent();
            intent.putExtra("retake_video", retakeVideoContext);
            intent.putExtra("retake_shoot_mode", 1);
            C44404b a2 = C44403a.m97196a();
            FragmentActivity fragmentActivity3 = this.f110689e;
            if (fragmentActivity3 == null) {
                C52711k.m112237a("activity");
            }
            a2.mo48304b(fragmentActivity3, intent);
        }
        C43682b bVar = C43682b.f110613f;
        C26890h.m65011a("reshoot_video_section", C43682b.m95953c().mo47829a("order", String.valueOf(this.f110695k + 1)).f61491a);
    }

    /* renamed from: b */
    public final void mo89158b() {
        C43744a cVar;
        if (this.f110678A.f110640f) {
            cVar = new C43756d();
        } else {
            cVar = new C43746c();
        }
        this.f110691g = cVar;
        C43744a aVar = this.f110691g;
        if (aVar == null) {
            C52711k.m112237a("viewManager");
        }
        FragmentActivity fragmentActivity = this.f110689e;
        if (fragmentActivity == null) {
            C52711k.m112237a("activity");
        }
        View view = this.f110690f;
        if (view == null) {
            C52711k.m112237a("rootView");
        }
        aVar.mo89210a(fragmentActivity, view);
        C43744a aVar2 = this.f110691g;
        if (aVar2 == null) {
            C52711k.m112237a("viewManager");
        }
        FragmentActivity fragmentActivity2 = this.f110689e;
        if (fragmentActivity2 == null) {
            C52711k.m112237a("activity");
        }
        CutMultiVideoViewModel cutMultiVideoViewModel = this.f110685a;
        if (cutMultiVideoViewModel == null) {
            C52711k.m112237a("cutMultiVideoViewModel");
        }
        aVar2.mo89211a(fragmentActivity2, cutMultiVideoViewModel, (List<? extends MediaModel>) this.f110680C, !mo89157a());
        int i = 0;
        for (Object next : this.f110681D) {
            int i2 = i + 1;
            if (i < 0) {
                C52575l.m112100b();
            }
            VideoSegment videoSegment = (VideoSegment) next;
            VideoEditViewModel videoEditViewModel = this.f110686b;
            if (videoEditViewModel == null) {
                C52711k.m112237a("videoEditViewModel");
            }
            Object obj = videoEditViewModel.mo87634l().get(i);
            C52711k.m112236a(obj, "videoEditViewModel.originVideoList[index]");
            ((VideoSegment) obj).mo86943a(videoSegment.mo86952f());
            VideoEditViewModel videoEditViewModel2 = this.f110686b;
            if (videoEditViewModel2 == null) {
                C52711k.m112237a("videoEditViewModel");
            }
            Object obj2 = videoEditViewModel2.mo87634l().get(i);
            C52711k.m112236a(obj2, "videoEditViewModel.originVideoList[index]");
            ((VideoSegment) obj2).mo86946b(videoSegment.mo86953g());
            i = i2;
        }
        C43744a aVar3 = this.f110691g;
        if (aVar3 == null) {
            C52711k.m112237a("viewManager");
        }
        FragmentActivity fragmentActivity3 = this.f110689e;
        if (fragmentActivity3 == null) {
            C52711k.m112237a("activity");
        }
        VideoEditViewModel videoEditViewModel3 = this.f110686b;
        if (videoEditViewModel3 == null) {
            C52711k.m112237a("videoEditViewModel");
        }
        CutMultiVideoViewModel cutMultiVideoViewModel2 = this.f110685a;
        if (cutMultiVideoViewModel2 == null) {
            C52711k.m112237a("cutMultiVideoViewModel");
        }
        VideoEditViewModel videoEditViewModel4 = this.f110686b;
        if (videoEditViewModel4 == null) {
            C52711k.m112237a("videoEditViewModel");
        }
        aVar3.mo89212a(fragmentActivity3, videoEditViewModel3, cutMultiVideoViewModel2, videoEditViewModel4.mo87634l());
        C43744a aVar4 = this.f110691g;
        if (aVar4 == null) {
            C52711k.m112237a("viewManager");
        }
        aVar4.mo89216a((C43690b) new C43725f(this));
        C43744a aVar5 = this.f110691g;
        if (aVar5 == null) {
            C52711k.m112237a("viewManager");
        }
        aVar5.mo89214a((OnClickListener) this);
        if (this.f110678A.f110637c > 0.0f && this.f110678A.f110638d > 0.0f) {
            C0794k kVar = new C0794k(Float.valueOf(this.f110678A.f110637c), Float.valueOf(this.f110678A.f110638d));
            C43744a aVar6 = this.f110691g;
            if (aVar6 == null) {
                C52711k.m112237a("viewManager");
            }
            aVar6.mo89220b(kVar);
        }
        C43744a aVar7 = this.f110691g;
        if (aVar7 == null) {
            C52711k.m112237a("viewManager");
        }
        aVar7.mo89224c();
    }

    /* renamed from: c */
    public final void mo89160c() {
        MultiEditVideoRecordData multiEditVideoRecordData = this.f110698n;
        if (multiEditVideoRecordData == null) {
            C52711k.m112237a("curRecordData");
        }
        if (!C9190h.m18253a(multiEditVideoRecordData.segmentDataList)) {
            this.f110680C.clear();
            MultiEditVideoRecordData multiEditVideoRecordData2 = this.f110698n;
            if (multiEditVideoRecordData2 == null) {
                C52711k.m112237a("curRecordData");
            }
            for (MultiEditVideoSegmentRecordData convertModel : multiEditVideoRecordData2.segmentDataList) {
                this.f110680C.add(convertModel.convertModel());
            }
            VideoEditViewModel videoEditViewModel = this.f110686b;
            if (videoEditViewModel == null) {
                C52711k.m112237a("videoEditViewModel");
            }
            videoEditViewModel.mo87612a((List<MediaModel>) this.f110680C);
            VideoEditViewModel videoEditViewModel2 = this.f110686b;
            if (videoEditViewModel2 == null) {
                C52711k.m112237a("videoEditViewModel");
            }
            List l = videoEditViewModel2.mo87634l();
            this.f110681D.clear();
            MultiEditVideoRecordData multiEditVideoRecordData3 = this.f110698n;
            if (multiEditVideoRecordData3 == null) {
                C52711k.m112237a("curRecordData");
            }
            List<MultiEditVideoSegmentRecordData> list = multiEditVideoRecordData3.segmentDataList;
            C52711k.m112236a((Object) list, "curRecordData.segmentDataList");
            boolean z = false;
            int i = 0;
            for (Object next : list) {
                int i2 = i + 1;
                if (i < 0) {
                    C52575l.m112100b();
                }
                MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData = (MultiEditVideoSegmentRecordData) next;
                VideoSegment videoSegment = new VideoSegment((MediaModel) this.f110680C.get(i));
                videoSegment.f107902a = i;
                videoSegment.mo86943a(multiEditVideoSegmentRecordData.startTime);
                if (multiEditVideoSegmentRecordData.endTime <= 0) {
                    Object obj = this.f110680C.get(i);
                    C52711k.m112236a(obj, "mediaModelList[index]");
                    multiEditVideoSegmentRecordData.endTime = ((MediaModel) obj).f95386e;
                }
                videoSegment.mo86946b(multiEditVideoSegmentRecordData.endTime);
                this.f110681D.add(videoSegment);
                Object obj2 = l.get(i);
                C52711k.m112236a(obj2, "updateVideoList[index]");
                ((VideoSegment) obj2).mo86943a(multiEditVideoSegmentRecordData.startTime);
                Object obj3 = l.get(i);
                C52711k.m112236a(obj3, "updateVideoList[index]");
                ((VideoSegment) obj3).mo86946b(multiEditVideoSegmentRecordData.endTime);
                i = i2;
            }
            C43698c cVar = this.f110678A;
            MultiEditVideoRecordData multiEditVideoRecordData4 = this.f110698n;
            if (multiEditVideoRecordData4 == null) {
                C52711k.m112237a("curRecordData");
            }
            if (multiEditVideoRecordData4.segmentDataList.size() == 1) {
                MultiEditVideoRecordData multiEditVideoRecordData5 = this.f110698n;
                if (multiEditVideoRecordData5 == null) {
                    C52711k.m112237a("curRecordData");
                }
                if (multiEditVideoRecordData5.isSingleVideo) {
                    z = true;
                }
            }
            cVar.f110640f = z;
        }
    }

    /* renamed from: d */
    public final void mo89162d() {
        this.f110678A.f110644j = 0;
        VideoEditViewModel videoEditViewModel = this.f110686b;
        if (videoEditViewModel == null) {
            C52711k.m112237a("videoEditViewModel");
        }
        VideoSegment videoSegment = (VideoSegment) videoEditViewModel.mo87634l().get(this.f110695k);
        VideoEditViewModel videoEditViewModel2 = this.f110686b;
        if (videoEditViewModel2 == null) {
            C52711k.m112237a("videoEditViewModel");
        }
        List l = videoEditViewModel2.mo87634l();
        C52711k.m112236a((Object) l, "videoEditViewModel.originVideoList");
        int i = 0;
        for (Object next : l) {
            int i2 = i + 1;
            if (i < 0) {
                C52575l.m112100b();
            }
            VideoSegment videoSegment2 = (VideoSegment) next;
            if (i < this.f110695k) {
                C43698c cVar = this.f110678A;
                int i3 = cVar.f110644j;
                C52711k.m112236a((Object) videoSegment2, "videoSegment");
                cVar.f110644j = i3 + ((int) (videoSegment2.mo86953g() - videoSegment2.mo86952f()));
            }
            i = i2;
        }
        C43698c cVar2 = this.f110678A;
        C52711k.m112236a((Object) videoSegment, "videoSegment");
        cVar2.f110645k = (int) (videoSegment.mo86953g() - videoSegment.mo86952f());
        C43699d dVar = this.f110692h;
        MultiEditVideoRecordData multiEditVideoRecordData = this.f110698n;
        if (multiEditVideoRecordData == null) {
            C52711k.m112237a("curRecordData");
        }
        int i4 = this.f110695k;
        int i5 = this.f110678A.f110644j;
        if (videoSegment != null && multiEditVideoRecordData != null && !C9190h.m18253a(multiEditVideoRecordData.segmentDataList)) {
            MultiEditVideoRecordData a = C43684d.m95970a(multiEditVideoRecordData, null);
            a.resetTimeData();
            MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData = (MultiEditVideoSegmentRecordData) a.segmentDataList.get(i4);
            a.segmentDataList.clear();
            a.segmentDataList.add(multiEditVideoSegmentRecordData);
            long g = videoSegment.mo86953g() - videoSegment.mo86952f();
            C20347c cVar3 = dVar.f110646a;
            if (cVar3 != null) {
                cVar3.mo43080o();
            }
            C20347c cVar4 = dVar.f110646a;
            if (cVar4 != null) {
                cVar4.mo42992a(C43738a.m96063a(a), false);
            }
            if (multiEditVideoRecordData.isPlaySingleSegmentMusic()) {
                dVar.mo89146b(multiEditVideoRecordData);
                dVar.mo89142a(multiEditVideoRecordData, i5, 0, (int) g);
            }
            C20347c cVar5 = dVar.f110646a;
            if (cVar5 != null) {
                cVar5.mo43019a(true);
            }
            dVar.mo89147c();
            C20347c cVar6 = dVar.f110646a;
            if (cVar6 != null) {
                cVar6.mo43077n();
            }
            dVar.mo89148d();
            C20347c cVar7 = dVar.f110646a;
            if (cVar7 != null) {
                cVar7.mo43028b((int) videoSegment.mo86952f(), (int) videoSegment.mo86953g());
            }
            C20347c cVar8 = dVar.f110646a;
            if (cVar8 != null) {
                cVar8.mo42983a((int) videoSegment.mo86952f(), C50743d.EDITOR_SEEK_FLAG_LastSeek);
            }
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ MultiEditVideoRecordData m96018a(C43719f fVar) {
        MultiEditVideoRecordData multiEditVideoRecordData = fVar.f110698n;
        if (multiEditVideoRecordData == null) {
            C52711k.m112237a("curRecordData");
        }
        return multiEditVideoRecordData;
    }

    /* renamed from: b */
    public static final /* synthetic */ C43744a m96019b(C43719f fVar) {
        C43744a aVar = fVar.f110691g;
        if (aVar == null) {
            C52711k.m112237a("viewManager");
        }
        return aVar;
    }

    /* renamed from: c */
    public static final /* synthetic */ VideoEditViewModel m96020c(C43719f fVar) {
        VideoEditViewModel videoEditViewModel = fVar.f110686b;
        if (videoEditViewModel == null) {
            C52711k.m112237a("videoEditViewModel");
        }
        return videoEditViewModel;
    }

    /* renamed from: d */
    public static final /* synthetic */ FragmentActivity m96021d(C43719f fVar) {
        FragmentActivity fragmentActivity = fVar.f110689e;
        if (fragmentActivity == null) {
            C52711k.m112237a("activity");
        }
        return fragmentActivity;
    }

    /* renamed from: e */
    public static final /* synthetic */ VideoPublishEditModel m96022e(C43719f fVar) {
        VideoPublishEditModel videoPublishEditModel = fVar.f110697m;
        if (videoPublishEditModel == null) {
            C52711k.m112237a("model");
        }
        return videoPublishEditModel;
    }

    /* renamed from: a */
    public final void mo89154a(int i) {
        this.f110695k = i;
        if (this.f110695k >= 0) {
            CutMultiVideoViewModel cutMultiVideoViewModel = this.f110685a;
            if (cutMultiVideoViewModel == null) {
                C52711k.m112237a("cutMultiVideoViewModel");
            }
            cutMultiVideoViewModel.mo86797a(this.f110695k, this.f110695k);
        }
    }

    /* renamed from: b */
    public final void mo89159b(boolean z) {
        if (z) {
            this.f110692h.mo89145b();
            return;
        }
        if (this.f110691g != null) {
            C43744a aVar = this.f110691g;
            if (aVar == null) {
                C52711k.m112237a("viewManager");
            }
            if (!aVar.mo89223b()) {
                this.f110692h.mo89138a();
                return;
            }
        }
        if (this.f110678A.f110640f) {
            View view = this.f110690f;
            if (view == null) {
                C52711k.m112237a("rootView");
            }
            view.postDelayed(new C43728i(this), 100);
        }
    }

    /* renamed from: a */
    public final void mo89156a(boolean z) {
        boolean z2;
        if (this.f110696l) {
            this.f110678A.f110639e = z;
            C43744a aVar = this.f110691g;
            if (aVar == null) {
                C52711k.m112237a("viewManager");
            }
            aVar.mo89222b(z);
            this.f110684G = new C43724e(this);
            this.f110692h.f110647b = this.f110684G;
            if (z) {
                if (mo89157a()) {
                    View view = this.f110690f;
                    if (view == null) {
                        C52711k.m112237a("rootView");
                    }
                    view.postDelayed(new C43729j(this), 10);
                } else if (!this.f110678A.f110641g) {
                    C43699d dVar = this.f110692h;
                    MultiEditVideoRecordData multiEditVideoRecordData = this.f110698n;
                    if (multiEditVideoRecordData == null) {
                        C52711k.m112237a("curRecordData");
                    }
                    MultiEditVideoRecordData multiEditVideoRecordData2 = this.f110698n;
                    if (multiEditVideoRecordData2 == null) {
                        C52711k.m112237a("curRecordData");
                    }
                    dVar.mo89144a(multiEditVideoRecordData, multiEditVideoRecordData2);
                } else if (!this.f110678A.f110642h) {
                    this.f110709y = 2;
                    C43744a aVar2 = this.f110691g;
                    if (aVar2 == null) {
                        C52711k.m112237a("viewManager");
                    }
                    aVar2.mo89228g();
                }
                if (!this.f110678A.f110641g) {
                    MultiEditVideoRecordData multiEditVideoRecordData3 = this.f110698n;
                    if (multiEditVideoRecordData3 == null) {
                        C52711k.m112237a("curRecordData");
                    }
                    MultiEditVideoRecordData multiEditVideoRecordData4 = this.f110699o;
                    if (multiEditVideoRecordData4 == null) {
                        C52711k.m112237a("restoreRecordData");
                    }
                    C43684d.m95970a(multiEditVideoRecordData3, multiEditVideoRecordData4);
                }
                C23441t tVar = this.f110679B;
                if (tVar != null) {
                    tVar.mo48605a(this.f110683F);
                }
                this.f110692h.f110647b = this.f110684G;
                C43744a aVar3 = this.f110691g;
                if (aVar3 == null) {
                    C52711k.m112237a("viewManager");
                }
                aVar3.mo89218a(true);
                VEVideoCutterViewModel vEVideoCutterViewModel = this.f110687c;
                if (vEVideoCutterViewModel == null) {
                    C52711k.m112237a("veVideoCutterViewModel");
                }
                vEVideoCutterViewModel.mo87731a(new C43168a(2, false));
                EditViewModel editViewModel = this.f110688d;
                if (editViewModel == null) {
                    C52711k.m112237a("editViewModel");
                }
                editViewModel.mo97043m().setValue(Boolean.valueOf(true));
            } else {
                C23441t tVar2 = this.f110679B;
                if (tVar2 != null) {
                    tVar2.mo48606b(this.f110683F);
                }
                this.f110694j.mo89149a();
                EditViewModel editViewModel2 = this.f110688d;
                if (editViewModel2 == null) {
                    C52711k.m112237a("editViewModel");
                }
                editViewModel2.mo97043m().setValue(Boolean.valueOf(false));
            }
            this.f110694j.f110657i = z;
            if (!this.f110678A.f110641g || this.f110678A.f110642h) {
                z2 = false;
            } else {
                z2 = true;
            }
            this.f110682E = z2;
            C52723a aVar4 = new C52723a();
            aVar4.element = false;
            if (this.f110682E) {
                aVar4.element = true;
            }
            if (!this.f110678A.f110641g) {
                aVar4.element = true;
            }
            View view2 = this.f110690f;
            if (view2 == null) {
                C52711k.m112237a("rootView");
            }
            view2.postDelayed(new C43730k(this, aVar4), 100);
            if (this.f110678A.f110642h) {
                mo89167i();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x011e  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo89161c(boolean r7) {
        /*
            r6 = this;
            com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData r0 = r6.f110698n
            if (r0 != 0) goto L_0x0009
            java.lang.String r1 = "curRecordData"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x0009:
            boolean r0 = r0.hasRetake
            if (r7 == 0) goto L_0x0023
            com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData r1 = r6.f110701q
            if (r1 == 0) goto L_0x0023
            com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData r1 = r6.f110701q
            com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData r2 = r6.f110698n
            if (r2 != 0) goto L_0x001c
            java.lang.String r3 = "curRecordData"
            p2628d.p2639f.p2641b.C52711k.m112237a(r3)
        L_0x001c:
            com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData r1 = com.p683ss.android.ugc.aweme.shortvideo.edit.multiedit.p2198b.C43684d.m95970a(r1, r2)
            r6.f110698n = r1
            goto L_0x003b
        L_0x0023:
            com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData r1 = r6.f110699o
            if (r1 != 0) goto L_0x002c
            java.lang.String r2 = "restoreRecordData"
            p2628d.p2639f.p2641b.C52711k.m112237a(r2)
        L_0x002c:
            com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData r2 = r6.f110698n
            if (r2 != 0) goto L_0x0035
            java.lang.String r3 = "curRecordData"
            p2628d.p2639f.p2641b.C52711k.m112237a(r3)
        L_0x0035:
            com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData r1 = com.p683ss.android.ugc.aweme.shortvideo.edit.multiedit.p2198b.C43684d.m95970a(r1, r2)
            r6.f110698n = r1
        L_0x003b:
            com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData r1 = r6.f110698n
            if (r1 != 0) goto L_0x0044
            java.lang.String r2 = "curRecordData"
            p2628d.p2639f.p2641b.C52711k.m112237a(r2)
        L_0x0044:
            r1.hasRetake = r0
            if (r7 == 0) goto L_0x006c
            java.util.ArrayList<com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension> r7 = r6.f110707w
            if (r7 != 0) goto L_0x0051
            java.lang.String r0 = "singleRestoreSegments"
            p2628d.p2639f.p2641b.C52711k.m112237a(r0)
        L_0x0051:
            java.util.List r7 = (java.util.List) r7
            boolean r7 = com.bytedance.apm.p501q.C9190h.m18253a(r7)
            if (r7 != 0) goto L_0x006c
            java.util.ArrayList r7 = new java.util.ArrayList
            java.util.ArrayList<com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension> r0 = r6.f110707w
            if (r0 != 0) goto L_0x0064
            java.lang.String r1 = "singleRestoreSegments"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x0064:
            java.util.Collection r0 = (java.util.Collection) r0
            r7.<init>(r0)
            r6.f110706v = r7
            goto L_0x007e
        L_0x006c:
            java.util.ArrayList r7 = new java.util.ArrayList
            java.util.ArrayList<com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension> r0 = r6.f110705u
            if (r0 != 0) goto L_0x0077
            java.lang.String r1 = "restoreRecordSegments"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x0077:
            java.util.Collection r0 = (java.util.Collection) r0
            r7.<init>(r0)
            r6.f110706v = r7
        L_0x007e:
            com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData r7 = r6.f110698n
            if (r7 != 0) goto L_0x0087
            java.lang.String r0 = "curRecordData"
            p2628d.p2639f.p2641b.C52711k.m112237a(r0)
        L_0x0087:
            r0 = 0
            com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData r7 = com.p683ss.android.ugc.aweme.shortvideo.edit.multiedit.p2198b.C43684d.m95970a(r7, r0)
            r6.f110700p = r7
            com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData r7 = r6.f110700p
            if (r7 != 0) goto L_0x0097
            java.lang.String r0 = "originRecordData"
            p2628d.p2639f.p2641b.C52711k.m112237a(r0)
        L_0x0097:
            r7.resetTimeData()
            com.ss.android.ugc.aweme.shortvideo.edit.multiedit.d.c r7 = r6.f110678A
            com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData r0 = r6.f110698n
            if (r0 != 0) goto L_0x00a5
            java.lang.String r1 = "curRecordData"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x00a5:
            r7.mo89136a(r0)
            r6.mo89160c()
            com.ss.android.ugc.aweme.shortvideo.edit.multiedit.view.a r7 = r6.f110691g
            if (r7 != 0) goto L_0x00b4
            java.lang.String r0 = "viewManager"
            p2628d.p2639f.p2641b.C52711k.m112237a(r0)
        L_0x00b4:
            com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel r0 = r6.f110686b
            if (r0 != 0) goto L_0x00bd
            java.lang.String r1 = "videoEditViewModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x00bd:
            java.util.List r0 = r0.mo87634l()
            r7.mo89217a(r0)
            com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel r7 = r6.f110686b
            if (r7 != 0) goto L_0x00cd
            java.lang.String r0 = "videoEditViewModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r0)
        L_0x00cd:
            java.util.ArrayList<com.ss.android.ugc.aweme.music.mediachoose.helper.MediaModel> r0 = r6.f110680C
            java.util.List r0 = (java.util.List) r0
            r7.mo87612a(r0)
            android.support.v4.f.k r7 = new android.support.v4.f.k
            com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData r0 = r6.f110699o
            if (r0 != 0) goto L_0x00df
            java.lang.String r1 = "restoreRecordData"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x00df:
            float r0 = r0.leftSlideX
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData r1 = r6.f110699o
            if (r1 != 0) goto L_0x00ee
            java.lang.String r2 = "restoreRecordData"
            p2628d.p2639f.p2641b.C52711k.m112237a(r2)
        L_0x00ee:
            float r1 = r1.rightSlideX
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            r7.<init>(r0, r1)
            com.ss.android.ugc.aweme.shortvideo.edit.multiedit.view.a r0 = r6.f110691g
            if (r0 != 0) goto L_0x0100
            java.lang.String r1 = "viewManager"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x0100:
            r0.mo89213a(r7)
            com.ss.android.ugc.aweme.shortvideo.edit.multiedit.view.a r7 = r6.f110691g
            if (r7 != 0) goto L_0x010c
            java.lang.String r0 = "viewManager"
            p2628d.p2639f.p2641b.C52711k.m112237a(r0)
        L_0x010c:
            r7.mo89224c()
            java.util.ArrayList<com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment> r7 = r6.f110681D
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            r0 = 0
            java.util.Iterator r7 = r7.iterator()
        L_0x0118:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L_0x016b
            java.lang.Object r1 = r7.next()
            int r2 = r0 + 1
            if (r0 >= 0) goto L_0x0129
            p2628d.p2629a.C52575l.m112100b()
        L_0x0129:
            com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment r1 = (com.p683ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment) r1
            com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel r3 = r6.f110686b
            if (r3 != 0) goto L_0x0134
            java.lang.String r4 = "videoEditViewModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r4)
        L_0x0134:
            java.util.List r3 = r3.mo87634l()
            java.lang.Object r3 = r3.get(r0)
            java.lang.String r4 = "videoEditViewModel.originVideoList[index]"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r4)
            com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment r3 = (com.p683ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment) r3
            long r4 = r1.mo86952f()
            r3.mo86943a(r4)
            com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel r3 = r6.f110686b
            if (r3 != 0) goto L_0x0153
            java.lang.String r4 = "videoEditViewModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r4)
        L_0x0153:
            java.util.List r3 = r3.mo87634l()
            java.lang.Object r0 = r3.get(r0)
            java.lang.String r3 = "videoEditViewModel.originVideoList[index]"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r3)
            com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment r0 = (com.p683ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment) r0
            long r3 = r1.mo86953g()
            r0.mo86946b(r3)
            r0 = r2
            goto L_0x0118
        L_0x016b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.edit.multiedit.p2200d.C43719f.mo89161c(boolean):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:199:0x04e5  */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x0506  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r19) {
        /*
            r18 = this;
            r0 = r18
            com.bytedance.apm.agent.instrumentation.ClickInstrumentation.onClick(r19)
            java.lang.String r1 = "v"
            r2 = r19
            p2628d.p2639f.p2641b.C52711k.m112240b(r2, r1)
            int r1 = r19.getId()
            r2 = 0
            r3 = 1
            r4 = 2132019906(0x7f140ac2, float:1.967816E38)
            if (r1 != r4) goto L_0x0033
            boolean r1 = r0.f110708x
            if (r1 == 0) goto L_0x001c
            return
        L_0x001c:
            r0.f110708x = r3
            com.p683ss.android.ugc.aweme.shortvideo.cut.C42652k.m93587c()
            com.ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel r1 = r0.f110685a
            if (r1 != 0) goto L_0x002a
            java.lang.String r3 = "cutMultiVideoViewModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r3)
        L_0x002a:
            r1.mo86804d()
            r18.mo89167i()
            r0.f110682E = r2
            return
        L_0x0033:
            r4 = 2132019899(0x7f140abb, float:1.9678146E38)
            if (r1 != r4) goto L_0x003c
            r18.mo89165g()
            return
        L_0x003c:
            r4 = 2132019900(0x7f140abc, float:1.9678148E38)
            r5 = 0
            if (r1 != r4) goto L_0x00fd
            com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel r1 = r0.f110686b
            if (r1 != 0) goto L_0x004b
            java.lang.String r4 = "videoEditViewModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r4)
        L_0x004b:
            java.util.List r1 = r1.mo87634l()
            int r1 = r1.size()
            if (r1 != r3) goto L_0x006b
            android.support.v4.app.FragmentActivity r1 = r0.f110689e
            if (r1 != 0) goto L_0x005e
            java.lang.String r2 = "activity"
            p2628d.p2639f.p2641b.C52711k.m112237a(r2)
        L_0x005e:
            android.content.Context r1 = (android.content.Context) r1
            r2 = 2132544280(0x7f1c0b18, float:2.0741717E38)
            com.bytedance.ies.dmt.ui.d.a r1 = com.bytedance.ies.dmt.p664ui.p668d.C10691a.m21548c(r1, r2)
            r1.mo19066a()
            return
        L_0x006b:
            android.support.v4.app.FragmentActivity r1 = r0.f110689e
            if (r1 != 0) goto L_0x0074
            java.lang.String r4 = "activity"
            p2628d.p2639f.p2641b.C52711k.m112237a(r4)
        L_0x0074:
            android.content.res.Resources r1 = r1.getResources()
            r4 = 2132544278(0x7f1c0b16, float:2.0741713E38)
            java.lang.Object[] r3 = new java.lang.Object[r3]
            com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel r6 = r0.f110686b
            if (r6 != 0) goto L_0x0086
            java.lang.String r7 = "videoEditViewModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r7)
        L_0x0086:
            java.util.List r6 = r6.mo87634l()
            int r7 = r0.f110695k
            java.lang.Object r6 = r6.get(r7)
            com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment r6 = (com.p683ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment) r6
            long r6 = r6.f107904c
            float r6 = (float) r6
            r7 = 1148846080(0x447a0000, float:1000.0)
            float r6 = r6 / r7
            java.lang.Float r6 = java.lang.Float.valueOf(r6)
            r3[r2] = r6
            java.lang.String r1 = r1.getString(r4, r3)
            android.support.v4.app.FragmentActivity r2 = r0.f110689e
            if (r2 != 0) goto L_0x00ab
            java.lang.String r3 = "activity"
            p2628d.p2639f.p2641b.C52711k.m112237a(r3)
        L_0x00ab:
            android.app.Activity r2 = (android.app.Activity) r2
            java.lang.String r3 = "duration"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r3)
            com.ss.android.ugc.aweme.shortvideo.edit.multiedit.d.f$h r3 = new com.ss.android.ugc.aweme.shortvideo.edit.multiedit.d.f$h
            r3.<init>(r0)
            d.f.a.a r3 = (p2628d.p2639f.p2640a.C52670a) r3
            java.lang.String r4 = "duration"
            p2628d.p2639f.p2641b.C52711k.m112240b(r1, r4)
            java.lang.String r4 = "confirm2Delete"
            p2628d.p2639f.p2641b.C52711k.m112240b(r3, r4)
            if (r2 == 0) goto L_0x00f8
            boolean r4 = r2.isFinishing()
            if (r4 == 0) goto L_0x00cc
            goto L_0x00f8
        L_0x00cc:
            com.bytedance.ies.dmt.ui.b.a$a r4 = new com.bytedance.ies.dmt.ui.b.a$a
            android.content.Context r2 = (android.content.Context) r2
            r4.<init>(r2)
            com.bytedance.ies.dmt.ui.b.a$a r2 = r4.mo18902b(r1)
            r4 = 2132546591(0x7f1c141f, float:2.0746404E38)
            com.bytedance.ies.dmt.ui.b.a$a r2 = r2.mo18900b(r4, r5)
            r4 = 2132544277(0x7f1c0b15, float:2.074171E38)
            com.ss.android.ugc.aweme.shortvideo.edit.multiedit.b.a$a r5 = new com.ss.android.ugc.aweme.shortvideo.edit.multiedit.b.a$a
            r5.<init>(r1, r3)
            android.content.DialogInterface$OnClickListener r5 = (android.content.DialogInterface.OnClickListener) r5
            com.bytedance.ies.dmt.ui.b.a$a r1 = r2.mo18886a(r4, r5)
            com.bytedance.ies.dmt.ui.b.a r1 = r1.mo18897a()
            android.app.Dialog r1 = r1.mo18882b()
            r1.show()
            return
        L_0x00f8:
            r3.invoke()
            goto L_0x052e
        L_0x00fd:
            r4 = 2132024062(0x7f141afe, float:1.968659E38)
            if (r1 != r4) goto L_0x04bd
            com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel r1 = r0.f110686b
            if (r1 != 0) goto L_0x010b
            java.lang.String r4 = "videoEditViewModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r4)
        L_0x010b:
            java.util.List r1 = r1.mo87634l()
            boolean r1 = com.bytedance.apm.p501q.C9190h.m18253a(r1)
            if (r1 != 0) goto L_0x052e
            com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData r1 = r0.f110698n
            if (r1 != 0) goto L_0x011e
            java.lang.String r4 = "curRecordData"
            p2628d.p2639f.p2641b.C52711k.m112237a(r4)
        L_0x011e:
            java.util.List<com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoSegmentRecordData> r1 = r1.segmentDataList
            boolean r1 = com.bytedance.apm.p501q.C9190h.m18253a(r1)
            if (r1 == 0) goto L_0x0128
            goto L_0x052e
        L_0x0128:
            boolean r1 = r18.mo89157a()
            if (r1 != 0) goto L_0x019e
            com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel r1 = r0.f110686b
            if (r1 != 0) goto L_0x0137
            java.lang.String r4 = "videoEditViewModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r4)
        L_0x0137:
            java.util.List r1 = r1.mo87634l()
            java.lang.String r4 = "videoEditViewModel.originVideoList"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r4)
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
        L_0x0146:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x019e
            java.lang.Object r4 = r1.next()
            com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment r4 = (com.p683ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment) r4
            com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData r6 = r0.f110698n
            if (r6 != 0) goto L_0x015b
            java.lang.String r7 = "curRecordData"
            p2628d.p2639f.p2641b.C52711k.m112237a(r7)
        L_0x015b:
            java.util.List<com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoSegmentRecordData> r6 = r6.segmentDataList
            java.lang.String r7 = "curRecordData.segmentDataList"
            p2628d.p2639f.p2641b.C52711k.m112236a(r6, r7)
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r6 = r6.iterator()
        L_0x0168:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x0146
            java.lang.Object r7 = r6.next()
            com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoSegmentRecordData r7 = (com.p683ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoSegmentRecordData) r7
            java.lang.String r8 = r4.mo86941a(r2)
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
            boolean r8 = android.text.TextUtils.isEmpty(r8)
            if (r8 != 0) goto L_0x0168
            java.lang.String r8 = r4.mo86941a(r2)
            java.lang.String r9 = r7.videoPath
            boolean r8 = p2628d.p2639f.p2641b.C52711k.m112239a(r8, r9)
            if (r8 == 0) goto L_0x0168
            java.lang.String r8 = "videoSegment"
            p2628d.p2639f.p2641b.C52711k.m112236a(r4, r8)
            long r8 = r4.mo86952f()
            r7.startTime = r8
            long r8 = r4.mo86953g()
            r7.endTime = r8
            goto L_0x0168
        L_0x019e:
            com.ss.android.ugc.aweme.shortvideo.edit.multiedit.d.c r1 = r0.f110678A
            com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData r4 = r0.f110698n
            if (r4 != 0) goto L_0x01a9
            java.lang.String r6 = "curRecordData"
            p2628d.p2639f.p2641b.C52711k.m112237a(r6)
        L_0x01a9:
            r1.mo89137b(r4)
            com.ss.android.ugc.aweme.shortvideo.edit.multiedit.b.b r1 = com.p683ss.android.ugc.aweme.shortvideo.edit.multiedit.p2198b.C43682b.f110613f
            com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData r1 = r0.f110698n
            if (r1 != 0) goto L_0x01b7
            java.lang.String r4 = "curRecordData"
            p2628d.p2639f.p2641b.C52711k.m112237a(r4)
        L_0x01b7:
            com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData r4 = r0.f110699o
            if (r4 != 0) goto L_0x01c0
            java.lang.String r6 = "restoreRecordData"
            p2628d.p2639f.p2641b.C52711k.m112237a(r6)
        L_0x01c0:
            if (r1 == 0) goto L_0x0441
            if (r4 != 0) goto L_0x01c6
            goto L_0x0441
        L_0x01c6:
            java.util.List<com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoSegmentRecordData> r6 = r1.segmentDataList
            boolean r6 = com.bytedance.apm.p501q.C9190h.m18253a(r6)
            if (r6 != 0) goto L_0x0441
            java.util.List<com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoSegmentRecordData> r6 = r4.segmentDataList
            boolean r6 = com.bytedance.apm.p501q.C9190h.m18253a(r6)
            if (r6 == 0) goto L_0x01d8
            goto L_0x0441
        L_0x01d8:
            android.util.Pair r6 = r4.getPlayInOutTime()
            if (r6 == 0) goto L_0x0441
            java.util.List<com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoSegmentRecordData> r7 = r4.segmentDataList
            java.lang.String r8 = "restoreRecordData.segmentDataList"
            p2628d.p2639f.p2641b.C52711k.m112236a(r7, r8)
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.Iterator r7 = r7.iterator()
            r10 = 0
        L_0x01ed:
            boolean r12 = r7.hasNext()
            if (r12 == 0) goto L_0x0200
            java.lang.Object r12 = r7.next()
            com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoSegmentRecordData r12 = (com.p683ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoSegmentRecordData) r12
            long r13 = r12.endTime
            long r8 = r12.startTime
            long r13 = r13 - r8
            long r10 = r10 + r13
            goto L_0x01ed
        L_0x0200:
            java.lang.Object r7 = r6.second
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            java.lang.Object r8 = r6.first
            java.lang.String r9 = "restoreTimeSec.first"
            p2628d.p2639f.p2641b.C52711k.m112236a(r8, r9)
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            int r7 = r7 - r8
            long r7 = (long) r7
            long r7 = java.lang.Math.min(r10, r7)
            java.util.List<com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoSegmentRecordData> r4 = r4.segmentDataList
            java.util.Iterator r4 = r4.iterator()
            r9 = 0
            r11 = 0
        L_0x0224:
            boolean r12 = r4.hasNext()
            if (r12 == 0) goto L_0x02f3
            java.lang.Object r12 = r4.next()
            com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoSegmentRecordData r12 = (com.p683ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoSegmentRecordData) r12
            long r13 = r12.endTime
            long r2 = r12.startTime
            long r13 = r13 - r2
            long r2 = r9 + r13
            java.lang.Object r12 = r6.first
            java.lang.String r13 = "restoreTimeSec.first"
            p2628d.p2639f.p2641b.C52711k.m112236a(r12, r13)
            java.lang.Number r12 = (java.lang.Number) r12
            long r12 = r12.longValue()
            int r14 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r14 < 0) goto L_0x025d
            java.lang.Object r12 = r6.second
            java.lang.String r13 = "restoreTimeSec.second"
            p2628d.p2639f.p2641b.C52711k.m112236a(r12, r13)
            java.lang.Number r12 = (java.lang.Number) r12
            long r12 = r12.longValue()
            int r14 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r14 > 0) goto L_0x025d
            int r11 = r11 + 1
            goto L_0x02ee
        L_0x025d:
            java.lang.Object r12 = r6.first
            java.lang.String r13 = "restoreTimeSec.first"
            p2628d.p2639f.p2641b.C52711k.m112236a(r12, r13)
            java.lang.Number r12 = (java.lang.Number) r12
            long r12 = r12.longValue()
            int r14 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r14 < 0) goto L_0x0293
            java.lang.Object r12 = r6.second
            java.lang.String r13 = "restoreTimeSec.second"
            p2628d.p2639f.p2641b.C52711k.m112236a(r12, r13)
            java.lang.Number r12 = (java.lang.Number) r12
            long r12 = r12.longValue()
            int r14 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r14 > 0) goto L_0x0293
            java.lang.Object r12 = r6.second
            java.lang.String r13 = "restoreTimeSec.second"
            p2628d.p2639f.p2641b.C52711k.m112236a(r12, r13)
            java.lang.Number r12 = (java.lang.Number) r12
            long r12 = r12.longValue()
            int r14 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r14 < 0) goto L_0x0293
            int r11 = r11 + 1
            goto L_0x02f3
        L_0x0293:
            java.lang.Object r12 = r6.first
            java.lang.String r13 = "restoreTimeSec.first"
            p2628d.p2639f.p2641b.C52711k.m112236a(r12, r13)
            java.lang.Number r12 = (java.lang.Number) r12
            long r12 = r12.longValue()
            int r14 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r14 > 0) goto L_0x02c9
            java.lang.Object r12 = r6.first
            java.lang.String r13 = "restoreTimeSec.first"
            p2628d.p2639f.p2641b.C52711k.m112236a(r12, r13)
            java.lang.Number r12 = (java.lang.Number) r12
            long r12 = r12.longValue()
            int r14 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r14 < 0) goto L_0x02c9
            java.lang.Object r12 = r6.second
            java.lang.String r13 = "restoreTimeSec.second"
            p2628d.p2639f.p2641b.C52711k.m112236a(r12, r13)
            java.lang.Number r12 = (java.lang.Number) r12
            long r12 = r12.longValue()
            int r14 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r14 > 0) goto L_0x02c9
            int r11 = r11 + 1
            goto L_0x02ee
        L_0x02c9:
            java.lang.Object r12 = r6.first
            java.lang.String r13 = "restoreTimeSec.first"
            p2628d.p2639f.p2641b.C52711k.m112236a(r12, r13)
            java.lang.Number r12 = (java.lang.Number) r12
            long r12 = r12.longValue()
            int r14 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r14 > 0) goto L_0x02ee
            java.lang.Object r9 = r6.second
            java.lang.String r10 = "restoreTimeSec.second"
            p2628d.p2639f.p2641b.C52711k.m112236a(r9, r10)
            java.lang.Number r9 = (java.lang.Number) r9
            long r9 = r9.longValue()
            int r12 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r12 < 0) goto L_0x02ee
            int r11 = r11 + 1
            goto L_0x02f3
        L_0x02ee:
            r9 = r2
            r2 = 0
            r3 = 1
            goto L_0x0224
        L_0x02f3:
            android.util.Pair r2 = r1.getPlayInOutTime()
            if (r2 == 0) goto L_0x0441
            java.util.List<com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoSegmentRecordData> r3 = r1.segmentDataList
            java.lang.String r4 = "curRecordData.segmentDataList"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r4)
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.Iterator r3 = r3.iterator()
            r9 = 0
        L_0x0308:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x031c
            java.lang.Object r4 = r3.next()
            com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoSegmentRecordData r4 = (com.p683ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoSegmentRecordData) r4
            long r12 = r4.endTime
            long r5 = r4.startTime
            long r12 = r12 - r5
            long r9 = r9 + r12
            r5 = 0
            goto L_0x0308
        L_0x031c:
            java.lang.Object r3 = r2.second
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            java.lang.Object r4 = r2.first
            java.lang.String r5 = "curTimeSec.first"
            p2628d.p2639f.p2641b.C52711k.m112236a(r4, r5)
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            int r3 = r3 - r4
            long r3 = (long) r3
            long r3 = java.lang.Math.min(r9, r3)
            java.util.List<com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoSegmentRecordData> r1 = r1.segmentDataList
            java.util.Iterator r1 = r1.iterator()
            r15 = 0
            r17 = 0
        L_0x0341:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L_0x040e
            java.lang.Object r5 = r1.next()
            com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoSegmentRecordData r5 = (com.p683ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoSegmentRecordData) r5
            long r9 = r5.endTime
            long r5 = r5.startTime
            long r9 = r9 - r5
            long r5 = r15 + r9
            java.lang.Object r9 = r2.first
            java.lang.String r10 = "curTimeSec.first"
            p2628d.p2639f.p2641b.C52711k.m112236a(r9, r10)
            java.lang.Number r9 = (java.lang.Number) r9
            long r9 = r9.longValue()
            int r12 = (r15 > r9 ? 1 : (r15 == r9 ? 0 : -1))
            if (r12 < 0) goto L_0x037a
            java.lang.Object r9 = r2.second
            java.lang.String r10 = "curTimeSec.second"
            p2628d.p2639f.p2641b.C52711k.m112236a(r9, r10)
            java.lang.Number r9 = (java.lang.Number) r9
            long r9 = r9.longValue()
            int r12 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r12 > 0) goto L_0x037a
            int r17 = r17 + 1
            goto L_0x040b
        L_0x037a:
            java.lang.Object r9 = r2.first
            java.lang.String r10 = "curTimeSec.first"
            p2628d.p2639f.p2641b.C52711k.m112236a(r9, r10)
            java.lang.Number r9 = (java.lang.Number) r9
            long r9 = r9.longValue()
            int r12 = (r15 > r9 ? 1 : (r15 == r9 ? 0 : -1))
            if (r12 < 0) goto L_0x03b0
            java.lang.Object r9 = r2.second
            java.lang.String r10 = "curTimeSec.second"
            p2628d.p2639f.p2641b.C52711k.m112236a(r9, r10)
            java.lang.Number r9 = (java.lang.Number) r9
            long r9 = r9.longValue()
            int r12 = (r15 > r9 ? 1 : (r15 == r9 ? 0 : -1))
            if (r12 > 0) goto L_0x03b0
            java.lang.Object r9 = r2.second
            java.lang.String r10 = "curTimeSec.second"
            p2628d.p2639f.p2641b.C52711k.m112236a(r9, r10)
            java.lang.Number r9 = (java.lang.Number) r9
            long r9 = r9.longValue()
            int r12 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r12 < 0) goto L_0x03b0
            int r17 = r17 + 1
            goto L_0x040e
        L_0x03b0:
            java.lang.Object r9 = r2.first
            java.lang.String r10 = "curTimeSec.first"
            p2628d.p2639f.p2641b.C52711k.m112236a(r9, r10)
            java.lang.Number r9 = (java.lang.Number) r9
            long r9 = r9.longValue()
            int r12 = (r15 > r9 ? 1 : (r15 == r9 ? 0 : -1))
            if (r12 > 0) goto L_0x03e6
            java.lang.Object r9 = r2.first
            java.lang.String r10 = "curTimeSec.first"
            p2628d.p2639f.p2641b.C52711k.m112236a(r9, r10)
            java.lang.Number r9 = (java.lang.Number) r9
            long r9 = r9.longValue()
            int r12 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r12 < 0) goto L_0x03e6
            java.lang.Object r9 = r2.second
            java.lang.String r10 = "curTimeSec.second"
            p2628d.p2639f.p2641b.C52711k.m112236a(r9, r10)
            java.lang.Number r9 = (java.lang.Number) r9
            long r9 = r9.longValue()
            int r12 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r12 > 0) goto L_0x03e6
            int r17 = r17 + 1
            goto L_0x040b
        L_0x03e6:
            java.lang.Object r9 = r2.first
            java.lang.String r10 = "curTimeSec.first"
            p2628d.p2639f.p2641b.C52711k.m112236a(r9, r10)
            java.lang.Number r9 = (java.lang.Number) r9
            long r9 = r9.longValue()
            int r12 = (r15 > r9 ? 1 : (r15 == r9 ? 0 : -1))
            if (r12 > 0) goto L_0x040b
            java.lang.Object r9 = r2.second
            java.lang.String r10 = "curTimeSec.second"
            p2628d.p2639f.p2641b.C52711k.m112236a(r9, r10)
            java.lang.Number r9 = (java.lang.Number) r9
            long r9 = r9.longValue()
            int r12 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r12 < 0) goto L_0x040b
            int r17 = r17 + 1
            goto L_0x040e
        L_0x040b:
            r15 = r5
            goto L_0x0341
        L_0x040e:
            java.lang.String r1 = "save_video_trim"
            com.ss.android.ugc.aweme.app.f.d r2 = com.p683ss.android.ugc.aweme.shortvideo.edit.multiedit.p2198b.C43682b.m95953c()
            java.lang.String r5 = "from_video_length"
            java.lang.String r6 = java.lang.String.valueOf(r7)
            com.ss.android.ugc.aweme.app.f.d r2 = r2.mo47829a(r5, r6)
            java.lang.String r5 = "to_video_length"
            java.lang.String r3 = java.lang.String.valueOf(r3)
            com.ss.android.ugc.aweme.app.f.d r2 = r2.mo47829a(r5, r3)
            java.lang.String r3 = "from_video_segments"
            java.lang.String r4 = java.lang.String.valueOf(r11)
            com.ss.android.ugc.aweme.app.f.d r2 = r2.mo47829a(r3, r4)
            java.lang.String r3 = "to_video_segments"
            java.lang.String r4 = java.lang.String.valueOf(r17)
            com.ss.android.ugc.aweme.app.f.d r2 = r2.mo47829a(r3, r4)
            java.util.Map<java.lang.String, java.lang.String> r2 = r2.f61491a
            com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r1, r2)
        L_0x0441:
            com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData r1 = r0.f110698n
            if (r1 != 0) goto L_0x044a
            java.lang.String r2 = "curRecordData"
            p2628d.p2639f.p2641b.C52711k.m112237a(r2)
        L_0x044a:
            com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData r2 = r0.f110699o
            if (r2 != 0) goto L_0x0453
            java.lang.String r3 = "restoreRecordData"
            p2628d.p2639f.p2641b.C52711k.m112237a(r3)
        L_0x0453:
            com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData r1 = com.p683ss.android.ugc.aweme.shortvideo.edit.multiedit.p2198b.C43684d.m95970a(r1, r2)
            r0.f110699o = r1
            com.ss.android.ugc.aweme.shortvideo.edit.multiedit.d.d r1 = r0.f110692h
            com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData r2 = r0.f110698n
            if (r2 != 0) goto L_0x0464
            java.lang.String r3 = "curRecordData"
            p2628d.p2639f.p2641b.C52711k.m112237a(r3)
        L_0x0464:
            r1.mo89140a(r2)
            com.ss.android.ugc.gamora.editor.EditViewModel r1 = r0.f110688d
            if (r1 != 0) goto L_0x0470
            java.lang.String r2 = "editViewModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r2)
        L_0x0470:
            android.arch.lifecycle.r r1 = r1.mo97042l()
            r2 = 1
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r1.setValue(r2)
            r1 = 0
            r0.f110701q = r1
            r18.mo89167i()
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r1 = r0.f110697m
            if (r1 != 0) goto L_0x048b
            java.lang.String r2 = "model"
            p2628d.p2639f.p2641b.C52711k.m112237a(r2)
        L_0x048b:
            com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoStatusRecordData r1 = r1.multiEditVideoRecordData
            java.util.ArrayList r2 = new java.util.ArrayList
            java.util.ArrayList<com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension> r3 = r0.f110706v
            if (r3 != 0) goto L_0x0498
            java.lang.String r4 = "editSegments"
            p2628d.p2639f.p2641b.C52711k.m112237a(r4)
        L_0x0498:
            java.util.Collection r3 = (java.util.Collection) r3
            r2.<init>(r3)
            r1.editSegments = r2
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r1 = r0.f110697m
            if (r1 != 0) goto L_0x04a8
            java.lang.String r2 = "model"
            p2628d.p2639f.p2641b.C52711k.m112237a(r2)
        L_0x04a8:
            com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoStatusRecordData r1 = r1.multiEditVideoRecordData
            java.util.ArrayList r2 = new java.util.ArrayList
            java.util.ArrayList<com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension> r3 = r0.f110706v
            if (r3 != 0) goto L_0x04b5
            java.lang.String r4 = "editSegments"
            p2628d.p2639f.p2641b.C52711k.m112237a(r4)
        L_0x04b5:
            java.util.Collection r3 = (java.util.Collection) r3
            r2.<init>(r3)
            r1.restoreSegments = r2
            return
        L_0x04bd:
            r2 = 2132023679(0x7f14197f, float:1.9685813E38)
            if (r1 != r2) goto L_0x04c6
            r18.mo89164f()
            return
        L_0x04c6:
            r2 = 2132018322(0x7f140492, float:1.9674947E38)
            if (r1 != r2) goto L_0x0526
            com.ss.android.ugc.aweme.shortvideo.edit.multiedit.d.d r1 = r0.f110692h
            com.ss.android.ugc.asve.c.c r2 = r1.f110646a
            if (r2 == 0) goto L_0x04e2
            com.ss.android.ugc.asve.c.c r1 = r1.f110646a
            if (r1 != 0) goto L_0x04d8
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x04d8:
            com.ss.android.vesdk.o$h r1 = r1.mo43063g()
            com.ss.android.vesdk.o$h r2 = com.p683ss.android.vesdk.C50720o.C50747h.STARTED
            if (r1 != r2) goto L_0x04e2
            r1 = 1
            goto L_0x04e3
        L_0x04e2:
            r1 = 0
        L_0x04e3:
            if (r1 == 0) goto L_0x0506
            com.ss.android.ugc.aweme.shortvideo.edit.multiedit.view.a r1 = r0.f110691g
            if (r1 != 0) goto L_0x04ee
            java.lang.String r2 = "viewManager"
            p2628d.p2639f.p2641b.C52711k.m112237a(r2)
        L_0x04ee:
            r2 = 1
            r1.mo89218a(r2)
            com.ss.android.ugc.aweme.shortvideo.cut.viewmodel.VEVideoCutterViewModel r1 = r0.f110687c
            if (r1 != 0) goto L_0x04fb
            java.lang.String r2 = "veVideoCutterViewModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r2)
        L_0x04fb:
            com.ss.android.ugc.aweme.shortvideo.cut.viewmodel.a r2 = new com.ss.android.ugc.aweme.shortvideo.cut.viewmodel.a
            r3 = 2
            r4 = 0
            r2.<init>(r3, r4)
            r1.mo87731a(r2)
            return
        L_0x0506:
            r4 = 0
            com.ss.android.ugc.aweme.shortvideo.edit.multiedit.view.a r1 = r0.f110691g
            if (r1 != 0) goto L_0x0510
            java.lang.String r2 = "viewManager"
            p2628d.p2639f.p2641b.C52711k.m112237a(r2)
        L_0x0510:
            r1.mo89218a(r4)
            com.ss.android.ugc.aweme.shortvideo.cut.viewmodel.VEVideoCutterViewModel r1 = r0.f110687c
            if (r1 != 0) goto L_0x051c
            java.lang.String r2 = "veVideoCutterViewModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r2)
        L_0x051c:
            com.ss.android.ugc.aweme.shortvideo.cut.viewmodel.a r2 = new com.ss.android.ugc.aweme.shortvideo.cut.viewmodel.a
            r3 = 1
            r2.<init>(r3, r4)
            r1.mo87731a(r2)
            return
        L_0x0526:
            r2 = 2132022214(0x7f1413c6, float:1.9682841E38)
            if (r1 != r2) goto L_0x052e
            r18.m96023j()
        L_0x052e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.edit.multiedit.p2200d.C43719f.onClick(android.view.View):void");
    }

    /* renamed from: a */
    public final void mo89155a(int i, int i2) {
        VideoEditViewModel videoEditViewModel = this.f110686b;
        if (videoEditViewModel == null) {
            C52711k.m112237a("videoEditViewModel");
        }
        VideoSegment videoSegment = (VideoSegment) videoEditViewModel.mo87634l().remove(i);
        VideoEditViewModel videoEditViewModel2 = this.f110686b;
        if (videoEditViewModel2 == null) {
            C52711k.m112237a("videoEditViewModel");
        }
        videoEditViewModel2.mo87634l().add(i2, videoSegment);
        VideoEditViewModel videoEditViewModel3 = this.f110686b;
        if (videoEditViewModel3 == null) {
            C52711k.m112237a("videoEditViewModel");
        }
        List<VideoSegment> l = videoEditViewModel3.mo87634l();
        C52711k.m112236a((Object) l, "videoEditViewModel.originVideoList");
        int i3 = 0;
        int i4 = 0;
        for (VideoSegment videoSegment2 : l) {
            videoSegment2.f107902a = i3;
            if (i3 < i2) {
                C52711k.m112236a((Object) videoSegment2, "segment");
                i4 += (int) (videoSegment2.mo86953g() - videoSegment2.mo86952f());
            }
            i3++;
        }
        MultiEditVideoRecordData multiEditVideoRecordData = this.f110698n;
        if (multiEditVideoRecordData == null) {
            C52711k.m112237a("curRecordData");
        }
        MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData = (MultiEditVideoSegmentRecordData) multiEditVideoRecordData.segmentDataList.remove(i);
        MultiEditVideoRecordData multiEditVideoRecordData2 = this.f110698n;
        if (multiEditVideoRecordData2 == null) {
            C52711k.m112237a("curRecordData");
        }
        multiEditVideoRecordData2.segmentDataList.add(i2, multiEditVideoSegmentRecordData);
        C43699d dVar = this.f110692h;
        MultiEditVideoRecordData multiEditVideoRecordData3 = this.f110698n;
        if (multiEditVideoRecordData3 == null) {
            C52711k.m112237a("curRecordData");
        }
        if (multiEditVideoRecordData3 != null) {
            C20347c cVar = dVar.f110646a;
            if (cVar != null) {
                cVar.mo43080o();
            }
            VERecordData a = C43738a.m96063a(multiEditVideoRecordData3);
            C20347c cVar2 = dVar.f110646a;
            if (cVar2 != null) {
                cVar2.mo42992a(a, false);
            }
            dVar.mo89146b(multiEditVideoRecordData3);
            C20347c cVar3 = dVar.f110646a;
            if (cVar3 != null) {
                cVar3.mo43019a(true);
            }
            dVar.mo89147c();
            C20347c cVar4 = dVar.f110646a;
            if (cVar4 != null) {
                cVar4.mo43077n();
            }
            dVar.mo89148d();
            C20347c cVar5 = dVar.f110646a;
            if (cVar5 != null) {
                cVar5.mo42983a(i4, C50743d.EDITOR_SEEK_FLAG_LastSeek);
            }
        }
        C43744a aVar = this.f110691g;
        if (aVar == null) {
            C52711k.m112237a("viewManager");
        }
        aVar.mo89227f();
        C43744a aVar2 = this.f110691g;
        if (aVar2 == null) {
            C52711k.m112237a("viewManager");
        }
        aVar2.mo89224c();
        C43698c cVar6 = this.f110678A;
        MultiEditVideoRecordData multiEditVideoRecordData4 = this.f110699o;
        if (multiEditVideoRecordData4 == null) {
            C52711k.m112237a("restoreRecordData");
        }
        cVar6.mo89136a(multiEditVideoRecordData4);
        ArrayList<TimeSpeedModelExtension> arrayList = this.f110706v;
        if (arrayList == null) {
            C52711k.m112237a("editSegments");
        }
        if (i < arrayList.size()) {
            ArrayList<TimeSpeedModelExtension> arrayList2 = this.f110706v;
            if (arrayList2 == null) {
                C52711k.m112237a("editSegments");
            }
            Object remove = arrayList2.remove(i);
            C52711k.m112236a(remove, "editSegments.removeAt(from)");
            TimeSpeedModelExtension timeSpeedModelExtension = (TimeSpeedModelExtension) remove;
            ArrayList<TimeSpeedModelExtension> arrayList3 = this.f110706v;
            if (arrayList3 == null) {
                C52711k.m112237a("editSegments");
            }
            arrayList3.add(i2, timeSpeedModelExtension);
        }
        C43682b bVar = C43682b.f110613f;
        C26890h.m65011a("edit_segment_order", C43682b.m95953c().mo47829a("from_order", String.valueOf(i + 1)).mo47829a("to_order", String.valueOf(i2 + 1)).f61491a);
    }
}
