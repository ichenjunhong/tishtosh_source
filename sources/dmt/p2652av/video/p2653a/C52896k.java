package dmt.p2652av.video.p2653a;

import android.content.Context;
import android.util.Pair;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;
import android.view.SurfaceView;
import com.bytedance.apm.p501q.C9190h;
import com.p683ss.android.ugc.asve.p1239c.C20347c;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.property.C40789h.C40790a;
import com.p683ss.android.ugc.aweme.property.C40795l.C40796a;
import com.p683ss.android.ugc.aweme.shortvideo.edit.multiedit.data.C43738a;
import com.p683ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData;
import com.p683ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoSegmentRecordData;
import com.p683ss.android.ugc.aweme.shortvideo.edit.multiedit.p2198b.C43683c;
import com.p683ss.android.ugc.aweme.shortvideo.edit.multiedit.p2198b.C43684d;
import com.p683ss.android.ugc.aweme.utils.C47716bd;
import com.p683ss.android.ugc.aweme.utils.C47807de;
import com.p683ss.android.ugc.aweme.video.C48016e;
import com.p683ss.android.vesdk.C50720o.C50742c;
import com.p683ss.android.vesdk.C50720o.C50743d;
import com.p683ss.android.vesdk.VERecordData;
import com.p683ss.android.vesdk.VESize;
import dmt.p2652av.video.VEPreviewMusicParams;
import dmt.p2652av.video.VEPreviewParams;
import java.util.List;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: dmt.av.video.a.k */
public final class C52896k extends C52885a {

    /* renamed from: t */
    private boolean f131209t;

    /* renamed from: dmt.av.video.a.k$a */
    public static final class C52897a implements Callback {

        /* renamed from: a */
        final /* synthetic */ C52896k f131210a;

        public final void surfaceCreated(SurfaceHolder surfaceHolder) {
            C52711k.m112240b(surfaceHolder, "holder");
        }

        public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            C52711k.m112240b(surfaceHolder, "holder");
        }

        C52897a(C52896k kVar) {
            this.f131210a = kVar;
        }

        public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            C52711k.m112240b(surfaceHolder, "holder");
            VESize a = this.f131210a.f131177f.mo43012a(i2, i3);
            C43683c.m95958a(i2, i3, a.width, a.height);
            C20347c cVar = this.f131210a.f131177f;
            C52711k.m112236a((Object) cVar, "mVEEditor");
            C52896k.m112552a(cVar);
            C20347c cVar2 = this.f131210a.f131177f;
            C52711k.m112236a((Object) cVar2, "mVEEditor");
            C52896k.m112554b(cVar2);
        }
    }

    /* renamed from: a */
    public final boolean mo110495a(VEPreviewMusicParams vEPreviewMusicParams) {
        if (!this.f131209t) {
            return super.mo110495a(vEPreviewMusicParams);
        }
        this.f131209t = false;
        return true;
    }

    /* renamed from: a */
    public static void m112552a(C20347c cVar) {
        cVar.mo42995a(C50742c.SCALE_MODE_CENTER_INSIDE_WITH_2DENGINE);
        if (C43683c.f110614a.mo89111k()) {
            cVar.mo43047c(C43683c.m95962e(), C43683c.m95963f());
        }
    }

    /* renamed from: a */
    public final void mo110486a(SurfaceView surfaceView) {
        super.mo110486a(surfaceView);
        if (surfaceView != null) {
            surfaceView.getHolder().addCallback(new C52897a(this));
        }
    }

    /* renamed from: b */
    public static void m112554b(C20347c cVar) {
        boolean z;
        if (C43683c.m95964g() <= 0 || C43683c.m95965h() <= 0 || C43683c.m95966i() <= 0 || C43683c.m95967j() <= 0) {
            z = false;
        } else {
            z = true;
        }
        if (C43683c.f110614a.mo89112l() && z) {
            cVar.mo43014a(((float) C43683c.m95960c()) / ((float) C43683c.m95966i()), ((float) C43683c.m95961d()) / ((float) C43683c.m95967j()), 0.0f, -(((C43683c.m95964g() / 2) - (C43683c.m95960c() / 2)) - C43683c.m95957a()), ((C43683c.m95965h() / 2) - (C43683c.m95961d() / 2)) - C43683c.m95959b());
        }
    }

    /* renamed from: a */
    private final void m112553a(C20347c cVar, MultiEditVideoRecordData multiEditVideoRecordData) {
        if (multiEditVideoRecordData != null && C48016e.m103944b(multiEditVideoRecordData.musicPath)) {
            if (multiEditVideoRecordData.musicDuration <= 0) {
                multiEditVideoRecordData.musicDuration = C47807de.m103443a(multiEditVideoRecordData.musicPath, true);
            }
            String str = multiEditVideoRecordData.musicPath;
            C52711k.m112236a((Object) str, "recordData.musicPath");
            int a = cVar.mo43001a(str, multiEditVideoRecordData.musicTrimIn, multiEditVideoRecordData.musicDuration, C39629l.m88232a().mo58583n().mo83103a(C40790a.RearMusicAutoLoop));
            cVar.mo43021a(a, 1, multiEditVideoRecordData.musicVolume);
            multiEditVideoRecordData.musicIndex = a;
            this.f131179h = a;
        }
    }

    /* renamed from: a */
    public final int mo110482a(Context context, C20347c cVar, VEPreviewParams vEPreviewParams) {
        int i;
        C20347c cVar2 = cVar;
        VEPreviewParams vEPreviewParams2 = vEPreviewParams;
        C52711k.m112240b(cVar2, "editor");
        C52711k.m112240b(vEPreviewParams2, "params");
        super.mo110482a(context, cVar, vEPreviewParams);
        if (vEPreviewParams2.recordData.isMultiEditRetake) {
            if (vEPreviewParams2.recordData.segmentSizeChange) {
                MultiEditVideoRecordData multiEditVideoRecordData = vEPreviewParams2.recordData.curMultiEditVideoRecordData;
                C52711k.m112236a((Object) multiEditVideoRecordData, "params.recordData.curMultiEditVideoRecordData");
                int i2 = vEPreviewParams2.recordData.currentEditIndex;
                Pair playInOutTime = multiEditVideoRecordData.getPlayInOutTime();
                Integer num = (Integer) playInOutTime.first;
                Integer num2 = (Integer) playInOutTime.second;
                List<MultiEditVideoSegmentRecordData> list = multiEditVideoRecordData.segmentDataList;
                C52711k.m112236a((Object) list, "editVideoRecordData.segmentDataList");
                int i3 = 0;
                int i4 = 0;
                for (Object next : list) {
                    int i5 = i3 + 1;
                    if (i3 < 0) {
                        C52575l.m112100b();
                    }
                    MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData = (MultiEditVideoSegmentRecordData) next;
                    if (i3 < i2) {
                        i = i2;
                        i4 += (int) (multiEditVideoSegmentRecordData.endTime - multiEditVideoSegmentRecordData.startTime);
                    } else {
                        i = i2;
                    }
                    i3 = i5;
                    i2 = i;
                }
                VERecordData a = C43738a.m96063a(multiEditVideoRecordData);
                a.mo98589a(((long) num.intValue()) * 1000, ((long) num2.intValue()) * 1000);
                cVar2.mo42992a(a, false);
                m112553a(cVar2, multiEditVideoRecordData);
                cVar2.mo43019a(true);
                m112552a(cVar);
                cVar.mo43077n();
                m112554b(cVar);
                cVar2.mo42983a(i4, C50743d.EDITOR_SEEK_FLAG_LastSeek);
            } else {
                MultiEditVideoRecordData multiEditVideoRecordData2 = vEPreviewParams2.recordData.curMultiEditVideoRecordData;
                C52711k.m112236a((Object) multiEditVideoRecordData2, "params.recordData.curMultiEditVideoRecordData");
                int i6 = vEPreviewParams2.recordData.currentEditIndex;
                if (!C9190h.m18253a(multiEditVideoRecordData2.segmentDataList)) {
                    MultiEditVideoRecordData a2 = C43684d.m95970a(multiEditVideoRecordData2, null);
                    a2.resetTimeData();
                    MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData2 = (MultiEditVideoSegmentRecordData) a2.segmentDataList.get(i6);
                    a2.segmentDataList.clear();
                    a2.segmentDataList.add(multiEditVideoSegmentRecordData2);
                    List<MultiEditVideoSegmentRecordData> list2 = multiEditVideoRecordData2.segmentDataList;
                    C52711k.m112236a((Object) list2, "multiEditVideoRecordData.segmentDataList");
                    int i7 = 0;
                    int i8 = 0;
                    for (Object next2 : list2) {
                        int i9 = i7 + 1;
                        if (i7 < 0) {
                            C52575l.m112100b();
                        }
                        MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData3 = (MultiEditVideoSegmentRecordData) next2;
                        if (i7 < i6) {
                            i8 += (int) (multiEditVideoSegmentRecordData3.endTime - multiEditVideoSegmentRecordData3.startTime);
                        }
                        i7 = i9;
                    }
                    long j = ((MultiEditVideoSegmentRecordData) multiEditVideoRecordData2.segmentDataList.get(i6)).startTime;
                    long j2 = ((MultiEditVideoSegmentRecordData) multiEditVideoRecordData2.segmentDataList.get(i6)).endTime;
                    cVar.mo43080o();
                    cVar2.mo42992a(C43738a.m96063a(a2), false);
                    if (multiEditVideoRecordData2.isPlaySingleSegmentMusic()) {
                        m112553a(cVar2, multiEditVideoRecordData2);
                        int i10 = (int) (j2 - j);
                        if (!(multiEditVideoRecordData2 == null || multiEditVideoRecordData2.musicIndex == -1)) {
                            int i11 = i8 + multiEditVideoRecordData2.musicTrimIn;
                            if (i11 > multiEditVideoRecordData2.musicDuration) {
                                i11 %= multiEditVideoRecordData2.musicDuration;
                            }
                            cVar2.mo42972a(multiEditVideoRecordData2.musicIndex, i11, i10 + i11, C39629l.m88232a().mo58583n().mo83103a(C40790a.RearMusicAutoLoop));
                        }
                    }
                    cVar2.mo43019a(true);
                    m112552a(cVar);
                    cVar.mo43077n();
                    m112554b(cVar);
                    int i12 = (int) j;
                    cVar2.mo43028b(i12, (int) j2);
                    cVar2.mo42983a(i12, C50743d.EDITOR_SEEK_FLAG_LastSeek);
                }
            }
            if (vEPreviewParams2.recordData.curMultiEditVideoRecordData.musicIndex != -1) {
                this.f131209t = true;
            }
            return 0;
        }
        boolean z = true;
        MultiEditVideoRecordData multiEditVideoRecordData3 = vEPreviewParams2.recordData.curMultiEditVideoRecordData;
        C52711k.m112236a((Object) multiEditVideoRecordData3, "params.recordData.curMultiEditVideoRecordData");
        Pair playInOutTime2 = multiEditVideoRecordData3.getPlayInOutTime();
        Integer num3 = (Integer) playInOutTime2.first;
        Integer num4 = (Integer) playInOutTime2.second;
        MultiEditVideoRecordData multiEditVideoRecordData4 = vEPreviewParams2.recordData.curMultiEditVideoRecordData;
        C52711k.m112236a((Object) multiEditVideoRecordData4, "params.recordData.curMultiEditVideoRecordData");
        VERecordData a3 = C43738a.m96063a(multiEditVideoRecordData4);
        a3.mo98589a(((long) num3.intValue()) * 1000, ((long) num4.intValue()) * 1000);
        if (!vEPreviewParams2.mIsFromDraft || !C39629l.m88232a().mo58574e().mo83117a(C40796a.DraftUseMultiVideoEdit) ? C47716bd.m103286b() || vEPreviewParams2.recordData.isUseMultiEdit : !(vEPreviewParams2.recordData == null || !vEPreviewParams2.recordData.isSupportMultiEdit || vEPreviewParams2.recordData.curMultiEditVideoRecordData == null)) {
            z = false;
        }
        return cVar2.mo42992a(a3, z);
    }
}
