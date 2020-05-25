package com.p683ss.android.ugc.aweme.shortvideo.cut.stickingpoint;

import com.bytedance.apm.p501q.C9190h;
import com.p683ss.android.ugc.asve.p1239c.C20347c;
import com.p683ss.android.ugc.aweme.shortvideo.C42482c;
import com.p683ss.android.ugc.aweme.shortvideo.cut.model.C42662e;
import com.p683ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.p683ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p2183c.C43023g;
import com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.C44300e;
import com.p683ss.android.ugc.aweme.tools.C47339t;
import com.p683ss.android.ugc.aweme.video.C48016e;
import com.p683ss.android.vesdk.C50720o.C50743d;
import com.p683ss.android.vesdk.C50720o.C50747h;
import com.p683ss.android.vesdk.clipparam.VEAlgorithmPath;
import com.p683ss.android.vesdk.clipparam.VEClipAlgorithmParam;
import com.p683ss.android.vesdk.clipparam.VEClipSourceParam;
import com.p683ss.android.vesdk.clipparam.VEClipTimelineParam;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;
import p001a.C0011g;
import p001a.C0013i;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.l */
public final class C43051l {

    /* renamed from: h */
    public static final C43053a f108672h = new C43053a(null);

    /* renamed from: a */
    public C20347c f108673a;

    /* renamed from: b */
    public C42482c f108674b;

    /* renamed from: c */
    public final HashMap<String, List<C42662e>> f108675c = new HashMap<>();

    /* renamed from: d */
    public C43054b f108676d;

    /* renamed from: e */
    public int f108677e = -1;

    /* renamed from: f */
    public int f108678f;

    /* renamed from: g */
    public final C42998b f108679g = new C42998b();

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.l$a */
    public static final class C43053a {
        private C43053a() {
        }

        public /* synthetic */ C43053a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.l$b */
    public interface C43054b {
        /* renamed from: a */
        void mo87279a(int i);

        /* renamed from: a */
        boolean mo87280a();

        /* renamed from: b */
        List<VideoSegment> mo87281b();
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.l$c */
    public static final class C43055c<V> implements Callable<TResult> {

        /* renamed from: a */
        final /* synthetic */ C43051l f108681a;

        /* renamed from: b */
        final /* synthetic */ int f108682b;

        /* renamed from: c */
        final /* synthetic */ List f108683c;

        public C43055c(C43051l lVar, int i, List list) {
            this.f108681a = lVar;
            this.f108682b = i;
            this.f108683c = list;
        }

        public final /* synthetic */ Object call() {
            int i = this.f108682b;
            List list = this.f108683c;
            if (list == null) {
                C52711k.m112234a();
            }
            int size = i - list.size();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (VideoSegment videoSegment : this.f108683c) {
                VEClipSourceParam vEClipSourceParam = new VEClipSourceParam();
                vEClipSourceParam.clipFilePath = videoSegment.mo86941a(false);
                vEClipSourceParam.clipWidth = videoSegment.f107908g;
                vEClipSourceParam.clipHeight = videoSegment.f107909h;
                arrayList.add(vEClipSourceParam);
                VEClipTimelineParam vEClipTimelineParam = new VEClipTimelineParam();
                vEClipTimelineParam.speed = (double) C47339t.NORMAL.value();
                vEClipTimelineParam.trimIn = 0;
                vEClipTimelineParam.trimOut = (int) videoSegment.f107904c;
                arrayList2.add(vEClipTimelineParam);
            }
            C20347c cVar = this.f108681a.f108673a;
            if (cVar == null) {
                C52711k.m112234a();
            }
            int a = cVar.mo42979a(0, size, arrayList, arrayList2);
            if (a >= 0) {
                C20347c cVar2 = this.f108681a.f108673a;
                if (cVar2 == null) {
                    C52711k.m112234a();
                }
                a = cVar2.mo43095y();
                if (a >= 0) {
                    C20347c cVar3 = this.f108681a.f108673a;
                    if (cVar3 == null) {
                        C52711k.m112234a();
                    }
                    a = cVar3.mo43093w();
                }
            }
            return Integer.valueOf(a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.l$d */
    public static final class C43056d<TTaskResult, TContinuationResult> implements C0011g<Integer, Object> {

        /* renamed from: a */
        final /* synthetic */ C43051l f108684a;

        /* renamed from: b */
        final /* synthetic */ C43023g f108685b;

        /* renamed from: c */
        final /* synthetic */ int f108686c;

        /* renamed from: d */
        final /* synthetic */ List f108687d;

        public C43056d(C43051l lVar, C43023g gVar, int i, List list) {
            this.f108684a = lVar;
            this.f108685b = gVar;
            this.f108686c = i;
            this.f108687d = list;
        }

        public final /* synthetic */ Object then(C0013i iVar) {
            if (iVar == null || iVar.mo34e() == null) {
                C43023g gVar = this.f108685b;
                if (gVar != null) {
                    gVar.mo87073a();
                }
            } else if (((Number) iVar.mo34e()).intValue() == 0) {
                int i = this.f108686c;
                List list = this.f108687d;
                if (list == null) {
                    C52711k.m112234a();
                }
                this.f108684a.mo87428a(1, i - list.size());
                C43023g gVar2 = this.f108685b;
                if (gVar2 != null) {
                    gVar2.mo87074a(((Number) iVar.mo34e()).intValue());
                }
            } else {
                C43023g gVar3 = this.f108685b;
                if (gVar3 != null) {
                    gVar3.mo87073a();
                }
            }
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.l$e */
    public static final class C43057e implements C43023g {

        /* renamed from: a */
        final /* synthetic */ C43051l f108688a;

        /* renamed from: b */
        final /* synthetic */ C43023g f108689b;

        /* renamed from: c */
        final /* synthetic */ int f108690c;

        /* renamed from: a */
        public final void mo87073a() {
            C43023g gVar = this.f108689b;
            if (gVar != null) {
                gVar.mo87073a();
            }
        }

        /* renamed from: a */
        public final void mo87074a(int i) {
            this.f108688a.mo87430a(this.f108688a.f108674b, this.f108690c, this.f108689b);
        }

        public C43057e(C43051l lVar, C43023g gVar, int i) {
            this.f108688a = lVar;
            this.f108689b = gVar;
            this.f108690c = i;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.l$f */
    static final class C43058f<V> implements Callable<TResult> {

        /* renamed from: a */
        final /* synthetic */ C43051l f108691a;

        /* renamed from: b */
        final /* synthetic */ String f108692b;

        /* renamed from: c */
        final /* synthetic */ VEAlgorithmPath f108693c;

        /* renamed from: d */
        final /* synthetic */ int f108694d;

        C43058f(C43051l lVar, String str, VEAlgorithmPath vEAlgorithmPath, int i) {
            this.f108691a = lVar;
            this.f108692b = str;
            this.f108693c = vEAlgorithmPath;
            this.f108694d = i;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:93:0x01bc, code lost:
            if (com.p683ss.android.vesdk.VEUtils.getMusicDefaultAlgorithm(r2, r7.getOnlineBeatsPath()) < 0) goto L_0x01a0;
         */
        /* JADX WARNING: Removed duplicated region for block: B:101:0x01e8  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Object call() {
            /*
                r16 = this;
                r0 = r16
                com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.l r1 = r0.f108691a
                com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.b r1 = r1.f108679g
                java.lang.String r2 = r0.f108692b
                com.ss.android.vesdk.clipparam.VEAlgorithmPath r3 = r0.f108693c
                com.ss.android.ugc.aweme.port.in.ak r4 = com.p683ss.android.ugc.aweme.port.p2082in.C39630m.m88234a()
                com.ss.android.ugc.aweme.port.in.ab r4 = r4.mo58604b()
                int r4 = r4.mo80578b(r2)
                com.ss.android.ugc.aweme.port.in.u r5 = com.p683ss.android.ugc.aweme.port.p2082in.C39629l.m88232a()
                com.ss.android.ugc.aweme.property.l r5 = r5.mo58574e()
                com.ss.android.ugc.aweme.property.l$a r6 = com.p683ss.android.ugc.aweme.property.C40795l.C40796a.LongVideoPermitted
                boolean r5 = r5.mo83117a(r6)
                if (r5 == 0) goto L_0x0035
                com.ss.android.ugc.aweme.port.in.u r5 = com.p683ss.android.ugc.aweme.port.p2082in.C39629l.m88232a()
                com.ss.android.ugc.aweme.property.l r5 = r5.mo58574e()
                com.ss.android.ugc.aweme.property.l$a r6 = com.p683ss.android.ugc.aweme.property.C40795l.C40796a.LongVideoThreshold
                long r5 = r5.mo83119c(r6)
                goto L_0x0037
            L_0x0035:
                r5 = 15000(0x3a98, double:7.411E-320)
            L_0x0037:
                int r5 = (int) r5
                if (r4 <= 0) goto L_0x01f9
                if (r4 <= r5) goto L_0x003d
                r4 = r5
            L_0x003d:
                com.ss.android.ugc.aweme.port.in.u r5 = com.p683ss.android.ugc.aweme.port.p2082in.C39629l.m88232a()
                com.ss.android.ugc.aweme.property.h r5 = r5.mo58583n()
                com.ss.android.ugc.aweme.property.h$a r7 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.StickPointMusicCutLength
                com.ss.android.ugc.aweme.property.aa$a r7 = (com.p683ss.android.ugc.aweme.property.C40761aa.C40762a) r7
                int r5 = r5.mo83104b(r7)
                if (r5 > 0) goto L_0x0051
                r5 = 20
            L_0x0051:
                int r5 = r5 * 1000
                if (r4 <= r5) goto L_0x0056
                r4 = r5
            L_0x0056:
                com.ss.android.vesdk.clipparam.VEAlgorithmPath r5 = com.p683ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C42998b.m94242a(r3)
                com.ss.android.vesdk.clipparam.VEAlgorithmPath r7 = com.p683ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C42998b.m94242a(r3)
                r8 = r2
                java.lang.CharSequence r8 = (java.lang.CharSequence) r8
                boolean r9 = android.text.TextUtils.isEmpty(r8)
                r12 = -10006(0xffffffffffffd8ea, float:NaN)
                r14 = 0
                r15 = 0
                if (r9 == 0) goto L_0x006f
                r6 = -10001(0xffffffffffffd8ef, float:NaN)
                goto L_0x00fb
            L_0x006f:
                if (r3 != 0) goto L_0x0075
                r6 = -10002(0xffffffffffffd8ee, float:NaN)
                goto L_0x00fb
            L_0x0075:
                int r9 = r3.getType()
                int r6 = com.p683ss.android.vesdk.clipparam.VEAlgorithmPath.BEATES_FILE_DEFAULT
                if (r9 != r6) goto L_0x0081
                r6 = -10006(0xffffffffffffd8ea, float:NaN)
                goto L_0x00fb
            L_0x0081:
                int r6 = r3.getType()
                int r9 = com.p683ss.android.vesdk.clipparam.VEAlgorithmPath.BEATES_FILE_BEATS_A0
                if (r6 != r9) goto L_0x00a3
                java.lang.String r6 = r3.getVeBeatsPath()
                boolean r6 = com.p683ss.android.ugc.aweme.video.C48016e.m103944b(r6)
                if (r6 != 0) goto L_0x0096
                r6 = -10003(0xffffffffffffd8ed, float:NaN)
                goto L_0x00fb
            L_0x0096:
                java.lang.String r6 = r3.getVeBeatsPath()
                r3.setManMadePath(r6)
                r3.setDownBeatsPath(r15)
                r3.setVeBeatsPath(r15)
            L_0x00a3:
                int r6 = r3.getType()
                int r9 = com.p683ss.android.vesdk.clipparam.VEAlgorithmPath.BEATES_FILE_SERVER_C
                if (r6 != r9) goto L_0x00c7
                java.lang.String r6 = r3.getDownBeatsPath()
                boolean r6 = com.p683ss.android.ugc.aweme.video.C48016e.m103944b(r6)
                if (r6 != 0) goto L_0x00ba
                r3 = -10004(0xffffffffffffd8ec, float:NaN)
                r6 = -10004(0xffffffffffffd8ec, float:NaN)
                goto L_0x00fb
            L_0x00ba:
                java.lang.String r6 = r3.getDownBeatsPath()
                r3.setManMadePath(r6)
                r3.setVeBeatsPath(r15)
                r3.setDownBeatsPath(r15)
            L_0x00c7:
                int r6 = r3.getType()
                int r9 = com.p683ss.android.vesdk.clipparam.VEAlgorithmPath.BEATES_FILE_CUSTOM
                if (r6 != r9) goto L_0x00e4
                java.lang.String r6 = r3.getManMadePath()
                boolean r6 = com.p683ss.android.ugc.aweme.video.C48016e.m103944b(r6)
                if (r6 != 0) goto L_0x00de
                r3 = -10005(0xffffffffffffd8eb, float:NaN)
                r6 = -10005(0xffffffffffffd8eb, float:NaN)
                goto L_0x00fb
            L_0x00de:
                r3.setVeBeatsPath(r15)
                r3.setDownBeatsPath(r15)
            L_0x00e4:
                r3.setNoStrengthBeatsPath(r15)
                r3.setOnlineBeatsPath(r15)
                com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.b$a r6 = r1.f108580a
                if (r6 != 0) goto L_0x00f1
                p2628d.p2639f.p2641b.C52711k.m112234a()
            L_0x00f1:
                if (r2 != 0) goto L_0x00f6
                p2628d.p2639f.p2641b.C52711k.m112234a()
            L_0x00f6:
                int r3 = r6.mo87389a(r2, r14, r4, r3)
                r6 = r3
            L_0x00fb:
                r3 = 1
                if (r6 == r12) goto L_0x0121
                if (r6 < 0) goto L_0x0102
                r9 = 1
                goto L_0x0103
            L_0x0102:
                r9 = 0
            L_0x0103:
                com.ss.android.ugc.aweme.shortvideo.c r12 = r1.f108581b
                java.lang.String r12 = com.p683ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C43036f.m94310d(r12)
                java.lang.String r10 = "stickpoint_successively_alg"
                if (r9 == 0) goto L_0x010f
                r9 = 0
                goto L_0x0110
            L_0x010f:
                r9 = r6
            L_0x0110:
                com.ss.android.ugc.aweme.shortvideo.ay r11 = com.p683ss.android.ugc.aweme.shortvideo.C42437ay.m93202a()
                java.lang.String r13 = "url"
                com.ss.android.ugc.aweme.shortvideo.ay r11 = r11.mo86521a(r13, r12)
                org.json.JSONObject r11 = r11.mo86522b()
                com.p683ss.android.ugc.aweme.base.C23569o.m57776a(r10, r9, r11)
            L_0x0121:
                if (r6 < 0) goto L_0x0125
                goto L_0x01fa
            L_0x0125:
                boolean r6 = android.text.TextUtils.isEmpty(r8)
                r9 = -10007(0xffffffffffffd8e9, float:NaN)
                if (r6 == 0) goto L_0x0130
                r6 = -10001(0xffffffffffffd8ef, float:NaN)
                goto L_0x0172
            L_0x0130:
                if (r5 != 0) goto L_0x0135
                r6 = -10002(0xffffffffffffd8ee, float:NaN)
                goto L_0x0172
            L_0x0135:
                java.lang.String r6 = r5.getVeBeatsPath()
                java.lang.CharSequence r6 = (java.lang.CharSequence) r6
                boolean r6 = android.text.TextUtils.isEmpty(r6)
                if (r6 == 0) goto L_0x0144
                r6 = -10007(0xffffffffffffd8e9, float:NaN)
                goto L_0x0172
            L_0x0144:
                java.lang.String r6 = r5.getVeBeatsPath()
                boolean r6 = com.p683ss.android.ugc.aweme.video.C48016e.m103944b(r6)
                if (r6 != 0) goto L_0x0151
                r6 = -10003(0xffffffffffffd8ed, float:NaN)
                goto L_0x0172
            L_0x0151:
                int r6 = com.p683ss.android.vesdk.clipparam.VEAlgorithmPath.BEATES_FILE_DEFAULT
                r5.setType(r6)
                int r6 = com.p683ss.android.vesdk.clipparam.VEAlgorithmPath.INTMODE_ONSET
                r5.setMode(r6)
                r5.setManMadePath(r15)
                r5.setOnlineBeatsPath(r15)
                com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.b$a r6 = r1.f108580a
                if (r6 != 0) goto L_0x0168
                p2628d.p2639f.p2641b.C52711k.m112234a()
            L_0x0168:
                if (r2 != 0) goto L_0x016d
                p2628d.p2639f.p2641b.C52711k.m112234a()
            L_0x016d:
                int r5 = r6.mo87389a(r2, r14, r4, r5)
                r6 = r5
            L_0x0172:
                if (r6 == r9) goto L_0x0197
                if (r6 < 0) goto L_0x0178
                r5 = 1
                goto L_0x0179
            L_0x0178:
                r5 = 0
            L_0x0179:
                com.ss.android.ugc.aweme.shortvideo.c r9 = r1.f108581b
                java.lang.String r9 = com.p683ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C43036f.m94310d(r9)
                java.lang.String r10 = "stickpoint_beats_alg"
                if (r5 == 0) goto L_0x0185
                r5 = 0
                goto L_0x0186
            L_0x0185:
                r5 = r6
            L_0x0186:
                com.ss.android.ugc.aweme.shortvideo.ay r11 = com.p683ss.android.ugc.aweme.shortvideo.C42437ay.m93202a()
                java.lang.String r12 = "url"
                com.ss.android.ugc.aweme.shortvideo.ay r9 = r11.mo86521a(r12, r9)
                org.json.JSONObject r9 = r9.mo86522b()
                com.p683ss.android.ugc.aweme.base.C23569o.m57776a(r10, r5, r9)
            L_0x0197:
                if (r6 < 0) goto L_0x019a
                goto L_0x01fa
            L_0x019a:
                boolean r5 = android.text.TextUtils.isEmpty(r8)
                if (r5 == 0) goto L_0x01a2
            L_0x01a0:
                r6 = -1
                goto L_0x01e6
            L_0x01a2:
                if (r7 != 0) goto L_0x01a5
                goto L_0x01a0
            L_0x01a5:
                java.lang.String r5 = r7.getOnlineBeatsPath()
                boolean r5 = com.p683ss.android.ugc.aweme.video.C48016e.m103944b(r5)
                if (r5 != 0) goto L_0x01bf
                if (r2 != 0) goto L_0x01b4
                p2628d.p2639f.p2641b.C52711k.m112234a()
            L_0x01b4:
                java.lang.String r5 = r7.getOnlineBeatsPath()
                int r5 = com.p683ss.android.vesdk.VEUtils.getMusicDefaultAlgorithm(r2, r5)
                if (r5 >= 0) goto L_0x01bf
                goto L_0x01a0
            L_0x01bf:
                r7.setManMadePath(r15)
                r7.setVeBeatsPath(r15)
                r7.setNoStrengthBeatsPath(r15)
                r7.setDownBeatsPath(r15)
                int r5 = com.p683ss.android.vesdk.clipparam.VEAlgorithmPath.BEATES_FILE_DEFAULT
                r7.setType(r5)
                int r5 = com.p683ss.android.vesdk.clipparam.VEAlgorithmPath.INTMODE_ONSET
                r7.setMode(r5)
                com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.b$a r1 = r1.f108580a
                if (r1 != 0) goto L_0x01dc
                p2628d.p2639f.p2641b.C52711k.m112234a()
            L_0x01dc:
                if (r2 != 0) goto L_0x01e1
                p2628d.p2639f.p2641b.C52711k.m112234a()
            L_0x01e1:
                int r1 = r1.mo87389a(r2, r14, r4, r7)
                r6 = r1
            L_0x01e6:
                if (r6 < 0) goto L_0x01e9
                r14 = 1
            L_0x01e9:
                java.lang.String r1 = "stickpoint_default_alg"
                r2 = r14 ^ 1
                com.ss.android.ugc.aweme.shortvideo.ay r3 = com.p683ss.android.ugc.aweme.shortvideo.C42437ay.m93202a()
                org.json.JSONObject r3 = r3.mo86522b()
                com.p683ss.android.ugc.aweme.base.C23569o.m57776a(r1, r2, r3)
                goto L_0x01fa
            L_0x01f9:
                r6 = -1
            L_0x01fa:
                int r1 = r0.f108694d
                r2 = 2
                if (r1 == r2) goto L_0x0204
                int r1 = r0.f108694d
                r2 = 4
                if (r1 != r2) goto L_0x0213
            L_0x0204:
                if (r6 < 0) goto L_0x0213
                com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.l r1 = r0.f108691a
                com.ss.android.ugc.asve.c.c r1 = r1.f108673a
                if (r1 != 0) goto L_0x020f
                p2628d.p2639f.p2641b.C52711k.m112234a()
            L_0x020f:
                int r6 = r1.mo43093w()
            L_0x0213:
                java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C43051l.C43058f.call():java.lang.Object");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.l$g */
    static final class C43059g<TTaskResult, TContinuationResult> implements C0011g<Integer, Object> {

        /* renamed from: a */
        final /* synthetic */ C43023g f108695a;

        C43059g(C43023g gVar) {
            this.f108695a = gVar;
        }

        public final /* synthetic */ Object then(C0013i iVar) {
            if (iVar == null || iVar.mo34e() == null || C52711k.m112230a(((Number) iVar.mo34e()).intValue(), 0) < 0) {
                C43023g gVar = this.f108695a;
                if (gVar != null) {
                    gVar.mo87073a();
                }
            } else {
                C43023g gVar2 = this.f108695a;
                if (gVar2 != null) {
                    Object e = iVar.mo34e();
                    C52711k.m112236a(e, "it.result");
                    gVar2.mo87074a(((Number) e).intValue());
                }
            }
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.l$h */
    public static final class C43060h implements C43023g {

        /* renamed from: a */
        final /* synthetic */ C43051l f108696a;

        /* renamed from: b */
        final /* synthetic */ C43023g f108697b;

        /* renamed from: c */
        final /* synthetic */ int f108698c;

        /* renamed from: a */
        public final void mo87073a() {
            this.f108696a.f108677e = -1;
            C43023g gVar = this.f108697b;
            if (gVar != null) {
                gVar.mo87073a();
            }
        }

        /* renamed from: a */
        public final void mo87074a(int i) {
            this.f108696a.f108677e = i;
            if (!C43051l.m94347a(this.f108698c)) {
                this.f108696a.mo87428a(this.f108698c, -1);
            } else {
                if (this.f108696a.f108676d != null) {
                    C43054b bVar = this.f108696a.f108676d;
                    if (bVar == null) {
                        C52711k.m112234a();
                    }
                    bVar.mo87279a(this.f108698c);
                }
                this.f108696a.mo87429a(this.f108696a.mo87433b(this.f108696a.f108678f));
            }
            C43023g gVar = this.f108697b;
            if (gVar != null) {
                gVar.mo87074a(this.f108696a.f108677e);
            }
        }

        C43060h(C43051l lVar, C43023g gVar, int i) {
            this.f108696a = lVar;
            this.f108697b = gVar;
            this.f108698c = i;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.l$i */
    public static final class C43061i<V> implements Callable<TResult> {

        /* renamed from: a */
        final /* synthetic */ C43051l f108699a;

        /* renamed from: b */
        final /* synthetic */ int f108700b;

        /* renamed from: c */
        final /* synthetic */ int f108701c;

        public C43061i(C43051l lVar, int i, int i2) {
            this.f108699a = lVar;
            this.f108700b = i;
            this.f108701c = i2;
        }

        public final /* synthetic */ Object call() {
            C20347c cVar = this.f108699a.f108673a;
            if (cVar == null) {
                C52711k.m112234a();
            }
            int a = cVar.mo42970a(0, this.f108700b, this.f108701c);
            if (a >= 0) {
                C20347c cVar2 = this.f108699a.f108673a;
                if (cVar2 == null) {
                    C52711k.m112234a();
                }
                a = cVar2.mo43095y();
                if (a >= 0) {
                    C20347c cVar3 = this.f108699a.f108673a;
                    if (cVar3 == null) {
                        C52711k.m112234a();
                    }
                    a = cVar3.mo43093w();
                }
            }
            return Integer.valueOf(a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.l$j */
    public static final class C43062j<TTaskResult, TContinuationResult> implements C0011g<Integer, Object> {

        /* renamed from: a */
        final /* synthetic */ C43051l f108702a;

        /* renamed from: b */
        final /* synthetic */ C43023g f108703b;

        /* renamed from: c */
        final /* synthetic */ int f108704c;

        public C43062j(C43051l lVar, C43023g gVar, int i) {
            this.f108702a = lVar;
            this.f108703b = gVar;
            this.f108704c = i;
        }

        public final /* synthetic */ Object then(C0013i iVar) {
            if (iVar == null || iVar.mo34e() == null) {
                C43023g gVar = this.f108703b;
                if (gVar != null) {
                    gVar.mo87073a();
                }
            } else {
                Integer num = (Integer) iVar.mo34e();
                if (num != null && num.intValue() == 0) {
                    this.f108702a.mo87428a(3, this.f108704c);
                    C43023g gVar2 = this.f108703b;
                    if (gVar2 != null) {
                        Object e = iVar.mo34e();
                        C52711k.m112236a(e, "it.result");
                        gVar2.mo87074a(((Number) e).intValue());
                    }
                } else {
                    C43023g gVar3 = this.f108703b;
                    if (gVar3 != null) {
                        gVar3.mo87073a();
                    }
                }
            }
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.l$k */
    static final class C43063k<V> implements Callable<TResult> {

        /* renamed from: a */
        final /* synthetic */ C43051l f108705a;

        /* renamed from: b */
        final /* synthetic */ boolean f108706b;

        C43063k(C43051l lVar, boolean z) {
            this.f108705a = lVar;
            this.f108706b = z;
        }

        public final /* synthetic */ Object call() {
            int i;
            if (this.f108705a.f108673a != null) {
                C20347c cVar = this.f108705a.f108673a;
                if (cVar == null) {
                    C52711k.m112234a();
                }
                i = cVar.mo43095y();
                if (this.f108706b && i >= 0) {
                    C20347c cVar2 = this.f108705a.f108673a;
                    if (cVar2 == null) {
                        C52711k.m112234a();
                    }
                    i = cVar2.mo43093w();
                }
            } else {
                i = -1;
            }
            return Integer.valueOf(i);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.l$l */
    static final class C43064l<TTaskResult, TContinuationResult> implements C0011g<Integer, Object> {

        /* renamed from: a */
        final /* synthetic */ C43023g f108707a;

        C43064l(C43023g gVar) {
            this.f108707a = gVar;
        }

        public final /* synthetic */ Object then(C0013i iVar) {
            if (iVar == null || iVar.mo34e() == null) {
                C43023g gVar = this.f108707a;
                if (gVar != null) {
                    gVar.mo87073a();
                }
            } else {
                C43023g gVar2 = this.f108707a;
                if (gVar2 != null) {
                    Object e = iVar.mo34e();
                    C52711k.m112236a(e, "task.result");
                    gVar2.mo87074a(((Number) e).intValue());
                }
            }
            return null;
        }
    }

    /* renamed from: a */
    public static boolean m94347a(int i) {
        return i == 6 || i == 7;
    }

    /* renamed from: d */
    private static boolean m94348d(int i) {
        return i == 1 || i == 4 || i == 3;
    }

    /* renamed from: i */
    private final boolean m94350i() {
        if (this.f108673a != null) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo87432a() {
        if (this.f108677e >= 0) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final void mo87435c() {
        C20347c cVar = this.f108673a;
        if (cVar != null) {
            cVar.mo43087s();
        }
    }

    /* renamed from: g */
    public final void mo87440g() {
        if (this.f108676d == null) {
            throw new IllegalArgumentException("stickpoint listener not init");
        }
    }

    /* renamed from: h */
    private final List<VEClipAlgorithmParam> m94349h() {
        if (this.f108673a == null || !mo87432a()) {
            return null;
        }
        C20347c cVar = this.f108673a;
        if (cVar == null) {
            C52711k.m112234a();
        }
        return cVar.mo43075m();
    }

    /* renamed from: b */
    public final boolean mo87434b() {
        if (this.f108673a == null) {
            return false;
        }
        try {
            C20347c cVar = this.f108673a;
            if (cVar == null) {
                C52711k.m112234a();
            }
            if (cVar.mo43063g() == C50747h.STARTED) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: d */
    public final void mo87437d() {
        if (!mo87434b()) {
            C20347c cVar = this.f108673a;
            if (cVar != null) {
                cVar.mo43085r();
            }
        }
    }

    /* renamed from: e */
    public final boolean mo87438e() {
        Integer num;
        C20347c cVar = this.f108673a;
        if (cVar != null) {
            num = Integer.valueOf(cVar.mo43069j(this.f108677e));
        } else {
            num = null;
        }
        if (num != null && num.intValue() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final int mo87439f() {
        if (this.f108673a == null) {
            return 0;
        }
        C20347c cVar = this.f108673a;
        if (cVar == null) {
            C52711k.m112234a();
        }
        return cVar.mo43073l();
    }

    /* renamed from: c */
    public final void mo87436c(int i) {
        C20347c cVar = this.f108673a;
        if (cVar != null) {
            cVar.mo43046c(i);
        }
    }

    /* renamed from: a */
    public final void mo87429a(long j) {
        C20347c cVar = this.f108673a;
        if (cVar != null) {
            cVar.mo42983a((int) j, C50743d.EDITOR_SEEK_FLAG_LastSeek);
        }
    }

    /* renamed from: b */
    public final long mo87433b(int i) {
        long j = 0;
        if (this.f108676d == null) {
            return 0;
        }
        C43054b bVar = this.f108676d;
        if (bVar == null) {
            C52711k.m112234a();
        }
        List b = bVar.mo87281b();
        if (C9190h.m18253a(b) || i < 0 || i >= b.size()) {
            return 0;
        }
        for (int i2 = 0; i2 < i; i2++) {
            if (!((VideoSegment) b.get(i2)).f107911j) {
                j += ((VideoSegment) b.get(i2)).mo86953g() - ((VideoSegment) b.get(i2)).mo86952f();
            }
        }
        return j;
    }

    /* renamed from: a */
    private static void m94345a(VEClipAlgorithmParam vEClipAlgorithmParam, VideoSegment videoSegment) {
        if (vEClipAlgorithmParam != null && videoSegment != null && C44300e.m97041c()) {
            String a = videoSegment.mo86941a(false);
            C52711k.m112236a((Object) a, "videoSegment.getPath(false)");
            if (C44300e.m97039a(a) && vEClipAlgorithmParam.range > 3000) {
                videoSegment.f107904c = (long) vEClipAlgorithmParam.range;
            }
        }
    }

    /* renamed from: a */
    public final void mo87428a(int i, int i2) {
        long j;
        long j2;
        boolean z;
        int i3 = i;
        if (mo87432a()) {
            mo87440g();
            C43054b bVar = this.f108676d;
            if (bVar == null) {
                C52711k.m112234a();
            }
            List<VideoSegment> b = bVar.mo87281b();
            if (!C9190h.m18253a(b)) {
                List<VEClipAlgorithmParam> h = m94349h();
                long j3 = 0;
                if (C9190h.m18253a(h)) {
                    mo87429a(0);
                    return;
                }
                for (VideoSegment videoSegment : b) {
                    if (h == null) {
                        C52711k.m112234a();
                    }
                    for (VEClipAlgorithmParam vEClipAlgorithmParam : h) {
                        if (vEClipAlgorithmParam.index == videoSegment.f107902a) {
                            m94345a(vEClipAlgorithmParam, videoSegment);
                            if (videoSegment.f107917p == null) {
                                if (i3 == 5) {
                                    j2 = (long) vEClipAlgorithmParam.trimIn;
                                } else {
                                    j2 = j3;
                                }
                                C42662e eVar = new C42662e(videoSegment.f107902a, j2, (long) vEClipAlgorithmParam.range, videoSegment.f107904c);
                                videoSegment.f107917p = eVar;
                                if (this.f108676d == null) {
                                    z = false;
                                } else {
                                    C43054b bVar2 = this.f108676d;
                                    if (bVar2 == null) {
                                        C52711k.m112234a();
                                    }
                                    z = bVar2.mo87280a();
                                }
                                videoSegment.f107918q = z;
                            } else if (i3 == 5) {
                                videoSegment.f107917p.resetVideoStartTime((long) vEClipAlgorithmParam.trimIn, (long) vEClipAlgorithmParam.range);
                            } else {
                                if (i3 == 2 || i3 == 6) {
                                    HashMap<String, List<C42662e>> hashMap = this.f108675c;
                                    C42482c cVar = this.f108674b;
                                    if (cVar == null) {
                                        C52711k.m112234a();
                                    }
                                    List<C42662e> list = (List) hashMap.get(cVar.getMusicId());
                                    if (C9190h.m18253a(list)) {
                                        videoSegment.f107917p.updateVideoStartTime((long) vEClipAlgorithmParam.range);
                                    } else {
                                        C42662e eVar2 = null;
                                        if (list == null) {
                                            C52711k.m112234a();
                                        }
                                        for (C42662e eVar3 : list) {
                                            if (eVar3.getVideoIndex() == videoSegment.f107902a) {
                                                eVar2 = eVar3;
                                            }
                                        }
                                        if (eVar2 != null) {
                                            videoSegment.f107917p.resetVideoStartTime(eVar2.getVideoStart(), eVar2.getVideoRange());
                                        } else {
                                            j = 0;
                                            videoSegment.f107917p.resetVideoStartTime(0, (long) vEClipAlgorithmParam.range);
                                        }
                                    }
                                } else if (m94348d(i)) {
                                    videoSegment.f107917p.updateVideoStartTime((long) vEClipAlgorithmParam.range);
                                }
                                j = 0;
                            }
                            j3 = 0;
                        } else {
                            j = j3;
                        }
                        j3 = j;
                    }
                }
                if (this.f108676d != null) {
                    C43054b bVar3 = this.f108676d;
                    if (bVar3 == null) {
                        C52711k.m112234a();
                    }
                    bVar3.mo87279a(i3);
                }
                mo87429a(mo87433b(i2));
            }
        }
    }

    /* renamed from: a */
    public final void mo87431a(C43023g gVar, boolean z) {
        C0013i.m22b((Callable<TResult>) new C43063k<TResult>(this, z)).mo20a((C0011g<TResult, TContinuationResult>) new C43064l<TResult,TContinuationResult>(gVar), C0013i.f25b);
    }

    /* renamed from: a */
    public final void mo87430a(C42482c cVar, int i, C43023g gVar) {
        this.f108674b = cVar;
        this.f108679g.f108581b = cVar;
        if (m94350i() && cVar != null && cVar.getStickPointMusicAlg() != null) {
            String c = C43036f.m94308c(cVar);
            if (C48016e.m103944b(c)) {
                m94346a(c, i, C42998b.m94241a(cVar), new C43060h(this, gVar, i));
            }
        }
    }

    /* renamed from: a */
    private final void m94346a(String str, int i, VEAlgorithmPath vEAlgorithmPath, C43023g gVar) {
        C0013i.m16a((Callable<TResult>) new C43058f<TResult>(this, str, vEAlgorithmPath, i)).mo20a((C0011g<TResult, TContinuationResult>) new C43059g<TResult,TContinuationResult>(gVar), C0013i.f25b);
    }
}
