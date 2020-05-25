package com.p683ss.android.ugc.aweme.shortvideo.edit.multiedit.data;

import com.p683ss.android.ugc.tools.utils.C50200d;
import com.p683ss.android.vesdk.VERecordData;
import com.p683ss.android.vesdk.VERecordData.VERecordSegmentData;
import java.util.ArrayList;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.a */
public final class C43738a {
    /* renamed from: a */
    private static VERecordSegmentData m96062a(MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData) {
        C52711k.m112240b(multiEditVideoSegmentRecordData, "$this$convertData");
        String str = multiEditVideoSegmentRecordData.videoPath;
        if (!C50200d.m108346a(str)) {
            str = multiEditVideoSegmentRecordData.draftVideoPath;
        }
        String str2 = str;
        String str3 = multiEditVideoSegmentRecordData.audioPath;
        if (!C50200d.m108346a(str3)) {
            str3 = multiEditVideoSegmentRecordData.draftAudioPath;
        }
        VERecordSegmentData vERecordSegmentData = new VERecordSegmentData(str2, multiEditVideoSegmentRecordData.videoLength, str3, multiEditVideoSegmentRecordData.audioLength, multiEditVideoSegmentRecordData.speed, multiEditVideoSegmentRecordData.startTime * 1000, 1000 * multiEditVideoSegmentRecordData.endTime, true);
        return vERecordSegmentData;
    }

    /* renamed from: a */
    public static final VERecordData m96063a(MultiEditVideoRecordData multiEditVideoRecordData) {
        C52711k.m112240b(multiEditVideoRecordData, "$this$convertData");
        ArrayList arrayList = new ArrayList();
        for (MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData : multiEditVideoRecordData.segmentDataList) {
            C52711k.m112236a((Object) multiEditVideoSegmentRecordData, "segmentRecordData");
            arrayList.add(m96062a(multiEditVideoSegmentRecordData));
        }
        VERecordData vERecordData = new VERecordData(arrayList, multiEditVideoRecordData.useMusic);
        vERecordData.f126772d = multiEditVideoRecordData.concatVideo;
        vERecordData.f126773e = multiEditVideoRecordData.concatAudio;
        return vERecordData;
    }
}
