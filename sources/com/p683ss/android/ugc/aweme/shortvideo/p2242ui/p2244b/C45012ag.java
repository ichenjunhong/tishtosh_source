package com.p683ss.android.ugc.aweme.shortvideo.p2242ui.p2244b;

import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.LiveData;
import android.os.Bundle;
import android.support.p043v7.app.AppCompatActivity;
import com.bytedance.als.ApiCenter.C2755a;
import com.bytedance.als.C2759d;
import com.bytedance.als.C2764h;
import com.bytedance.als.C2767k;
import com.bytedance.p780m.C12361b;
import com.p683ss.android.ttve.editorInfo.C20084a;
import com.p683ss.android.ttve.nativePort.TEVideoRecorder;
import com.p683ss.android.ugc.aweme.beauty.C23777a;
import com.p683ss.android.ugc.aweme.filter.C31459g;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.property.C40789h.C40790a;
import com.p683ss.android.ugc.aweme.property.C40797m;
import com.p683ss.android.ugc.aweme.shortvideo.C43214dh;
import com.p683ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p683ss.android.ugc.aweme.shortvideo.beauty.C42451a;
import com.p683ss.android.ugc.aweme.shortvideo.p2187e.C43306a;
import com.p683ss.android.ugc.aweme.shortvideo.p2206j.C43906h;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.TimeSpeedModelExtension;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.VideoRecordNewActivity;
import com.p683ss.android.ugc.aweme.tools.C47067l;
import com.p683ss.android.ugc.aweme.tools.C47337r;
import com.p683ss.android.ugc.aweme.tools.C47349x;
import com.p683ss.android.ugc.aweme.tools.C47351z;
import com.p683ss.android.ugc.aweme.util.C47625i;
import com.p683ss.android.ugc.gamora.recorder.filter.p2470a.C49683a;
import com.p683ss.android.ugc.gamora.recorder.p2478l.C49860a;
import com.p683ss.android.ugc.gamora.recorder.sticker.p2484a.C50048n;
import java.util.ArrayList;
import p2628d.C52860x;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.b.ag */
public final class C45012ag extends C2764h<C45011af> implements C45011af {

    /* renamed from: a */
    public final C45011af f113971a = this;

    /* renamed from: b */
    final AppCompatActivity f113972b;

    /* renamed from: c */
    final VideoRecordNewActivity f113973c;

    /* renamed from: d */
    final C45004a f113974d;

    /* renamed from: e */
    final C49683a f113975e;

    /* renamed from: f */
    final C50048n f113976f;

    /* renamed from: g */
    public final ShortVideoContext f113977g;

    /* renamed from: h */
    private final C42451a f113978h;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.b.ag$a */
    static final class C45013a<T> implements C2767k<C47349x> {

        /* renamed from: a */
        final /* synthetic */ C45012ag f113979a;

        C45013a(C45012ag agVar) {
            this.f113979a = agVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            C47349x xVar = (C47349x) obj;
            C45012ag agVar = this.f113979a;
            ShortVideoContext shortVideoContext = this.f113979a.f113977g;
            C52711k.m112236a((Object) xVar, "it");
            Bundle bundle = new Bundle();
            bundle.putInt("cameraId", agVar.f113974d.mo91315U());
            bundle.putSerializable("beautyMetadata", agVar.f113973c.f113767F.mo86561c());
            bundle.putString("cameraLensInfo", agVar.f113974d.mo91346af());
            if (shortVideoContext.mo86369j()) {
                bundle.putSerializable("greenscreenImage", shortVideoContext.f107108bg);
            }
            shortVideoContext.mo86375p().begin(xVar.f119499a, agVar.f113976f.mo97798C(), agVar.f113976f.mo97799D(), bundle);
            StringBuilder sb = new StringBuilder("set hasStopped to false, cur Speed: ");
            sb.append(xVar.f119499a);
            C47625i.m103103a(sb.toString());
            if (shortVideoContext.f107122o) {
                ((C49860a) C2755a.m7851a(agVar.f113972b).mo7339a(C49860a.class)).mo97684a(1);
            }
            agVar.f113974d.mo91314T();
            LiveData d = agVar.f113975e.mo89459d();
            C52711k.m112236a((Object) d, "filterApiComponent.isDisableFilter()");
            C31459g e = ((C43906h) agVar.f113975e.mo89445c()).mo89440e();
            C52711k.m112236a((Object) e, "filterApiComponent.getFilterFunc().getCurFilter()");
            String str = e.f82326c;
            if (str != null) {
                shortVideoContext.f107082ah.add(str);
            }
            String valueOf = String.valueOf(e.f82324a);
            if (d.getValue() != null) {
                Object value = d.getValue();
                if (value == null) {
                    C52711k.m112234a();
                }
                if (((Boolean) value).booleanValue()) {
                    shortVideoContext.f107083ai.add(TEVideoRecorder.FACE_BEAUTY_NULL);
                    agVar.f113974d.mo91310P();
                    shortVideoContext.mo86356a(xVar.f119500b);
                }
            }
            shortVideoContext.f107083ai.add(valueOf);
            agVar.f113974d.mo91310P();
            shortVideoContext.mo86356a(xVar.f119500b);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.b.ag$b */
    static final class C45014b<T> implements C2767k<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C45012ag f113980a;

        C45014b(C45012ag agVar) {
            this.f113980a = agVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:13:0x00f2, code lost:
            if (r9 == null) goto L_0x00f4;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ void onChanged(java.lang.Object r14) {
            /*
                r13 = this;
                d.x r14 = (p2628d.C52860x) r14
                com.ss.android.ugc.aweme.shortvideo.ui.b.ag r14 = r13.f113980a
                com.ss.android.ugc.aweme.shortvideo.ui.b.a r0 = r14.f113974d
                com.ss.android.ugc.asve.recorder.view.ASCameraView r0 = r0.mo91307M()
                com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity r1 = r14.f113973c
                com.ss.android.ugc.aweme.shortvideo.beauty.a r1 = r1.f113767F
                com.ss.android.ugc.aweme.tools.beauty.c.g r1 = r1.mo86562d()
                com.ss.android.ugc.aweme.beauty.ComposerBeautyBuriedInfo r1 = r1.mo94112k()
                long r2 = r0.getEndFrameTimeUS()
                r4 = 1000(0x3e8, double:4.94E-321)
                long r2 = r2 / r4
                com.ss.android.ugc.gamora.recorder.sticker.a.n r6 = r14.f113976f
                com.ss.android.ugc.aweme.sticker.model.FaceStickerBean r6 = r6.mo97798C()
                java.lang.Integer r7 = com.p683ss.android.ugc.asve.recorder.C20526i.m51506a()
                r8 = 0
                if (r7 == 0) goto L_0x011f
                java.lang.Integer r7 = com.p683ss.android.ugc.asve.recorder.C20526i.m51507b()
                if (r7 == 0) goto L_0x011f
                java.lang.String r7 = "video_record_block"
                com.ss.android.ugc.aweme.shortvideo.az r9 = com.p683ss.android.ugc.aweme.shortvideo.C42438az.m93209a()
                java.lang.String r10 = "creation_id"
                com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r11 = r14.f113977g
                com.ss.android.ugc.aweme.shortvideo.model.AVETParameter r11 = r11.mo86370k()
                java.lang.String r11 = r11.getCreationId()
                com.ss.android.ugc.aweme.shortvideo.az r9 = r9.mo86526a(r10, r11)
                java.lang.String r10 = "content_type"
                com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r11 = r14.f113977g
                com.ss.android.ugc.aweme.shortvideo.model.AVETParameter r11 = r11.mo86370k()
                java.lang.String r11 = r11.getContentType()
                com.ss.android.ugc.aweme.shortvideo.az r9 = r9.mo86526a(r10, r11)
                java.lang.String r10 = "content_source"
                com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r11 = r14.f113977g
                com.ss.android.ugc.aweme.shortvideo.model.AVETParameter r11 = r11.mo86370k()
                java.lang.String r11 = r11.getContentSource()
                com.ss.android.ugc.aweme.shortvideo.az r9 = r9.mo86526a(r10, r11)
                java.lang.String r10 = "record_mode"
                com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r11 = r14.f113977g
                int r11 = r11.f107081ag
                com.ss.android.ugc.aweme.shortvideo.az r9 = r9.mo86523a(r10, r11)
                java.lang.String r10 = "record_block_tms"
                java.lang.Integer r11 = com.p683ss.android.ugc.asve.recorder.C20526i.m51506a()
                if (r11 != 0) goto L_0x007b
                p2628d.p2639f.p2641b.C52711k.m112234a()
            L_0x007b:
                int r11 = r11.intValue()
                com.ss.android.ugc.aweme.shortvideo.az r9 = r9.mo86523a(r10, r11)
                java.lang.String r10 = "record_block_duration"
                java.lang.Integer r11 = com.p683ss.android.ugc.asve.recorder.C20526i.m51507b()
                if (r11 != 0) goto L_0x008e
                p2628d.p2639f.p2641b.C52711k.m112234a()
            L_0x008e:
                int r11 = r11.intValue()
                com.ss.android.ugc.aweme.shortvideo.az r9 = r9.mo86523a(r10, r11)
                java.lang.String r10 = "record_duration"
                long r11 = r0.getEndFrameTimeUS()
                long r11 = r11 / r4
                com.ss.android.ugc.aweme.shortvideo.az r4 = r9.mo86524a(r10, r11)
                java.lang.String r5 = "is_composer"
                int r9 = com.p683ss.android.ugc.aweme.beauty.C23778b.m58355c(r1)
                com.ss.android.ugc.aweme.shortvideo.az r4 = r4.mo86523a(r5, r9)
                java.lang.String r5 = "beautify_used"
                int r9 = com.p683ss.android.ugc.aweme.beauty.C23778b.m58354b(r1)
                com.ss.android.ugc.aweme.shortvideo.az r4 = r4.mo86523a(r5, r9)
                java.lang.String r5 = "beautify_info"
                java.lang.String r9 = com.p683ss.android.ugc.aweme.beauty.C23778b.m58352a(r1)
                com.ss.android.ugc.aweme.shortvideo.az r4 = r4.mo86526a(r5, r9)
                java.lang.String r5 = "filter_id"
                com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity r9 = r14.f113973c
                com.ss.android.ugc.gamora.recorder.filter.a.a r9 = r9.mo91195e()
                java.lang.String r10 = "videoRecordNewActivity.filterApiComponent"
                p2628d.p2639f.p2641b.C52711k.m112236a(r9, r10)
                com.ss.android.ugc.aweme.shortvideo.j.a r9 = r9.mo89445c()
                com.ss.android.ugc.aweme.shortvideo.j.h r9 = (com.p683ss.android.ugc.aweme.shortvideo.p2206j.C43906h) r9
                java.lang.String r10 = "videoRecordNewActivity.f…erApiComponent.filterFunc"
                p2628d.p2639f.p2641b.C52711k.m112236a(r9, r10)
                com.ss.android.ugc.aweme.filter.g r9 = r9.mo89440e()
                java.lang.String r10 = "videoRecordNewActivity.f…nent.filterFunc.curFilter"
                p2628d.p2639f.p2641b.C52711k.m112236a(r9, r10)
                int r9 = r9.f82324a
                com.ss.android.ugc.aweme.shortvideo.az r4 = r4.mo86523a(r5, r9)
                java.lang.String r5 = "prop_id"
                if (r6 == 0) goto L_0x00f4
                long r9 = r6.getStickerId()
                java.lang.String r9 = java.lang.String.valueOf(r9)
                if (r9 != 0) goto L_0x00f6
            L_0x00f4:
                java.lang.String r9 = ""
            L_0x00f6:
                com.ss.android.ugc.aweme.shortvideo.az r4 = r4.mo86526a(r5, r9)
                java.lang.String r5 = "eyes"
                com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity r9 = r14.f113973c
                com.ss.android.ugc.aweme.shortvideo.beauty.a r9 = r9.f113767F
                int r9 = r9.mo86585k()
                com.ss.android.ugc.aweme.shortvideo.az r4 = r4.mo86523a(r5, r9)
                java.lang.String r5 = "smooth"
                com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity r9 = r14.f113973c
                com.ss.android.ugc.aweme.shortvideo.beauty.a r9 = r9.f113767F
                int r9 = r9.mo86584i()
                com.ss.android.ugc.aweme.shortvideo.az r4 = r4.mo86523a(r5, r9)
                java.util.Map<java.lang.String, java.lang.String> r4 = r4.f107329a
                com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r7, r4)
                com.p683ss.android.ugc.asve.recorder.C20526i.f56237a = r8
                com.p683ss.android.ugc.asve.recorder.C20526i.f56238b = r8
            L_0x011f:
                com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity r4 = r14.f113973c
                com.ss.android.ugc.gamora.recorder.filter.a.a r4 = r4.mo91195e()
                java.lang.String r5 = "videoRecordNewActivity.filterApiComponent"
                p2628d.p2639f.p2641b.C52711k.m112236a(r4, r5)
                com.ss.android.ugc.aweme.shortvideo.j.a r4 = r4.mo89445c()
                com.ss.android.ugc.aweme.shortvideo.j.h r4 = (com.p683ss.android.ugc.aweme.shortvideo.p2206j.C43906h) r4
                java.lang.String r5 = "videoRecordNewActivity.f…erApiComponent.filterFunc"
                p2628d.p2639f.p2641b.C52711k.m112236a(r4, r5)
                com.ss.android.ugc.aweme.filter.g r4 = r4.mo89440e()
                java.lang.String r5 = "tool_performance_video_record"
                com.ss.android.ugc.aweme.shortvideo.az r7 = com.p683ss.android.ugc.aweme.shortvideo.C42438az.m93209a()
                java.lang.String r9 = "creation_id"
                com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r10 = r14.f113977g
                java.lang.String r10 = r10.f107131x
                com.ss.android.ugc.aweme.shortvideo.az r7 = r7.mo86526a(r9, r10)
                java.lang.String r9 = "shoot_way"
                com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r14 = r14.f113977g
                java.lang.String r14 = r14.f107132y
                com.ss.android.ugc.aweme.shortvideo.az r14 = r7.mo86526a(r9, r14)
                java.lang.String r7 = "resolution"
                java.lang.String r9 = com.p683ss.android.ugc.aweme.property.C40797m.m90252g()
                com.ss.android.ugc.aweme.shortvideo.az r14 = r14.mo86526a(r7, r9)
                java.lang.String r7 = "effect_id"
                if (r6 != 0) goto L_0x0164
                java.lang.String r6 = ""
                goto L_0x0168
            L_0x0164:
                java.lang.String r6 = r6.getId()
            L_0x0168:
                com.ss.android.ugc.aweme.shortvideo.az r14 = r14.mo86526a(r7, r6)
                java.lang.String r6 = "filter_id"
                if (r4 != 0) goto L_0x0173
                java.lang.String r4 = ""
                goto L_0x0185
            L_0x0173:
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                int r4 = r4.f82324a
                java.lang.String r4 = java.lang.String.valueOf(r4)
                r7.append(r4)
                java.lang.String r4 = r7.toString()
            L_0x0185:
                com.ss.android.ugc.aweme.shortvideo.az r14 = r14.mo86526a(r6, r4)
                java.lang.String r4 = "beauty_status"
                r6 = 1
                int r6 = com.p683ss.android.ugc.aweme.beauty.C23778b.m58354b(com.p683ss.android.ugc.aweme.beauty.C23778b.f63365a)
                com.ss.android.ugc.aweme.shortvideo.az r14 = r14.mo86523a(r4, r6)
                java.lang.String r4 = "lag_count"
                com.ss.android.ugc.asve.recorder.b.a r6 = r0.getMediaController()
                int r6 = r6.mo43323m()
                com.ss.android.ugc.aweme.shortvideo.az r14 = r14.mo86523a(r4, r6)
                java.lang.String r4 = "lag_max"
                com.ss.android.ugc.asve.recorder.b.a r6 = r0.getMediaController()
                int r6 = r6.mo43324n()
                com.ss.android.ugc.aweme.shortvideo.az r14 = r14.mo86523a(r4, r6)
                java.lang.String r4 = "fps"
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                com.ss.android.ugc.asve.recorder.b.a r7 = r0.getMediaController()
                float r7 = r7.mo43326p()
                java.lang.String r7 = java.lang.String.valueOf(r7)
                r6.append(r7)
                java.lang.String r6 = r6.toString()
                com.ss.android.ugc.aweme.shortvideo.az r14 = r14.mo86526a(r4, r6)
                java.lang.String r4 = "lag_total_duration"
                com.ss.android.ugc.asve.recorder.b.a r6 = r0.getMediaController()
                int r6 = r6.mo43325o()
                com.ss.android.ugc.aweme.shortvideo.az r14 = r14.mo86523a(r4, r6)
                java.lang.String r4 = "duration"
                com.ss.android.ugc.aweme.shortvideo.az r14 = r14.mo86524a(r4, r2)
                java.lang.String r2 = "write_fps"
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                com.ss.android.ugc.asve.recorder.b.a r4 = r0.getMediaController()
                float r4 = r4.mo43331u()
                java.lang.String r4 = java.lang.String.valueOf(r4)
                r3.append(r4)
                java.lang.String r3 = r3.toString()
                com.ss.android.ugc.aweme.shortvideo.az r14 = r14.mo86526a(r2, r3)
                java.lang.String r2 = "frame_total"
                com.ss.android.ugc.asve.recorder.b.a r0 = r0.getMediaController()
                int r0 = r0.mo43332v()
                com.ss.android.ugc.aweme.shortvideo.az r14 = r14.mo86523a(r2, r0)
                java.lang.String r0 = "beautify_used"
                int r2 = com.p683ss.android.ugc.aweme.beauty.C23778b.m58354b(r1)
                com.ss.android.ugc.aweme.shortvideo.az r14 = r14.mo86523a(r0, r2)
                java.lang.String r0 = "beautify_info"
                java.lang.String r2 = com.p683ss.android.ugc.aweme.beauty.C23778b.m58352a(r1)
                com.ss.android.ugc.aweme.shortvideo.az r14 = r14.mo86526a(r0, r2)
                java.lang.String r0 = "is_composer"
                int r1 = com.p683ss.android.ugc.aweme.beauty.C23778b.m58355c(r1)
                com.ss.android.ugc.aweme.shortvideo.az r14 = r14.mo86523a(r0, r1)
                java.util.Map<java.lang.String, java.lang.String> r14 = r14.f107329a
                com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r5, r14)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.p2242ui.p2244b.C45012ag.C45014b.onChanged(java.lang.Object):void");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.b.ag$c */
    static final class C45015c<T> implements C2767k<C47351z> {

        /* renamed from: a */
        final /* synthetic */ C45012ag f113981a;

        C45015c(C45012ag agVar) {
            this.f113981a = agVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            C47351z zVar = (C47351z) obj;
            C45012ag agVar = this.f113981a;
            C52711k.m112236a((Object) zVar, "it");
            long endFrameTimeUS = agVar.f113974d.mo91307M().getEndFrameTimeUS() / 1000;
            C49683a e = agVar.f113973c.mo91195e();
            C52711k.m112236a((Object) e, "videoRecordNewActivity.filterApiComponent");
            C43906h hVar = (C43906h) e.mo89445c();
            C52711k.m112236a((Object) hVar, "videoRecordNewActivity.f…erApiComponent.filterFunc");
            C31459g e2 = hVar.mo89440e();
            C52711k.m112236a((Object) e2, "filterBean");
            if (e2.f82326c != null) {
                agVar.f113977g.f107082ah.addIndex();
            }
            if (String.valueOf(e2.f82324a) != null) {
                agVar.f113977g.f107083ai.addIndex();
            }
            if (zVar.f119503a == 1) {
                agVar.f113974d.mo91386a(new C47067l());
                C40797m.m90242a(agVar.f113977g.mo86375p().isEmpty());
                agVar.f113977g.f107127t = C40797m.m90243a() ? 1 : 0;
                return;
            }
            if (endFrameTimeUS <= 10 && endFrameTimeUS >= 0) {
                agVar.f113974d.mo91386a(new C47067l());
            }
            C47337r a = C47337r.m102705a(agVar.f113977g.mo86375p(), agVar.f113977g.mo86372m());
            C45004a aVar = agVar.f113974d;
            C52711k.m112236a((Object) a, "ev");
            aVar.mo91331a(a);
            if (!C23777a.m58349b()) {
                agVar.f113977g.f107084aj.add(Integer.toString(agVar.f113973c.f113767F.mo86584i()));
                agVar.f113977g.f107087am.add(Integer.toString(agVar.f113973c.f113767F.mo86589o()));
                agVar.f113977g.f107086al.add(Integer.toString(agVar.f113973c.f113767F.mo86585k()));
                agVar.f113977g.f107085ak.add(Integer.toString(agVar.f113973c.f113767F.mo86586l()));
            } else {
                agVar.f113977g.f107084aj.add(Integer.toString((int) (C40797m.m90239a(agVar.f113973c.f113767F.mo86584i()) * 100.0f)));
                int b = (int) (C40797m.m90245b(agVar.f113973c.f113767F.mo86586l()) * 100.0f);
                agVar.f113977g.f107085ak.add(Integer.toString(b));
                agVar.f113977g.f107086al.add(Integer.toString(b));
                agVar.f113977g.f107087am.add(Integer.toString(agVar.f113973c.f113767F.mo86589o()));
            }
            C43306a.m94980a(agVar.f113977g.f107110c);
            C43306a.m94993b(agVar.f113977g.f107027F, agVar.f113977g.f107028G);
            C43306a.m94983a(agVar.f113977g.f107035N);
            C43306a.m94984a(agVar.f113977g.f107036O);
            C43306a.m94991b(agVar.f113977g.f107128u ? 1 : 0);
            C43306a.m94979a(agVar.f113977g.f107127t);
            C43306a.m94986a(agVar.f113977g.f107112e, C43214dh.m94817a().mo50201b(), agVar.f113977g.f107113f);
            C43306a.m94988a((ArrayList<TimeSpeedModelExtension>) agVar.f113977g.f107119l);
            C43306a.m94982a(agVar.f113974d.mo91309O().mo94324e());
            C43306a.m94987a(agVar.f113977g.f107082ah.toString(), agVar.f113977g.f107083ai.toString());
            if (C39618d.f101152P.mo83103a(C40790a.EnableUploadMetadata)) {
                agVar.f113977g.f107130w = C20084a.m49601a();
                C43306a.m94989a(agVar.f113977g.f107130w);
            }
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C2759d mo7353a() {
        return this.f113971a;
    }

    public final void bO_() {
        super.bO_();
        C0184k kVar = this;
        this.f113974d.mo91376w().mo7349a(kVar, new C45013a(this));
        this.f113974d.mo91379z().mo7349a(kVar, new C45014b(this));
        this.f113974d.mo91378y().mo7349a(kVar, new C45015c(this));
    }

    public C45012ag(C12361b bVar) {
        C52711k.m112240b(bVar, "objectContainer");
        this.f113972b = (AppCompatActivity) bVar.mo23373a(AppCompatActivity.class, (String) null);
        this.f113973c = (VideoRecordNewActivity) bVar.mo23373a(VideoRecordNewActivity.class, (String) null);
        this.f113974d = (C45004a) bVar.mo23373a(C45004a.class, (String) null);
        this.f113975e = (C49683a) bVar.mo23373a(C49683a.class, (String) null);
        this.f113976f = (C50048n) bVar.mo23373a(C50048n.class, (String) null);
        this.f113978h = (C42451a) bVar.mo23373a(C42451a.class, (String) null);
        this.f113977g = (ShortVideoContext) bVar.mo23373a(ShortVideoContext.class, (String) null);
    }
}
