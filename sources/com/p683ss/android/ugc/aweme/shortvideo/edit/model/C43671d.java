package com.p683ss.android.ugc.aweme.shortvideo.edit.model;

import com.p683ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData;
import com.p683ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoSegmentRecordData;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.model.d */
public final class C43671d {

    /* renamed from: a */
    private final int f110583a;

    /* renamed from: b */
    private final int f110584b;

    /* renamed from: c */
    private final long f110585c;

    /* renamed from: d */
    private final long f110586d;

    public C43671d() {
        this(0, 0, 0, 0, 15, null);
    }

    public C43671d(int i, int i2) {
        this(i, i2, 0, 0, 12, null);
    }

    /* renamed from: a */
    public final EditPreviewInfo mo89101a(MultiEditVideoRecordData multiEditVideoRecordData) {
        MultiEditVideoRecordData multiEditVideoRecordData2 = multiEditVideoRecordData;
        C52711k.m112240b(multiEditVideoRecordData2, "data");
        C43672e eVar = new C43672e(this.f110583a, this.f110584b, this.f110585c, this.f110586d);
        List<MultiEditVideoSegmentRecordData> list = multiEditVideoRecordData2.segmentDataList;
        C52711k.m112236a((Object) list, "data.segmentDataList");
        Iterable<MultiEditVideoSegmentRecordData> iterable = list;
        Collection arrayList = new ArrayList(C52575l.m112104a(iterable, 10));
        for (MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData : iterable) {
            String str = multiEditVideoSegmentRecordData.videoPath;
            C52711k.m112236a((Object) str, "it.videoPath");
            String str2 = multiEditVideoSegmentRecordData.audioPath;
            VideoFileInfo videoFileInfo = r8;
            VideoFileInfo videoFileInfo2 = new VideoFileInfo(this.f110583a, this.f110584b, multiEditVideoSegmentRecordData.videoLength, -100, 0, 16, null);
            arrayList.add(new EditVideoSegment(str, str2, videoFileInfo));
        }
        return eVar.mo89102a(C52575l.m112139e((Collection<? extends T>) (List) arrayList));
    }

    private C43671d(int i, int i2, long j, long j2) {
        this.f110583a = i;
        this.f110584b = i2;
        this.f110585c = j;
        this.f110586d = j2;
    }

    private /* synthetic */ C43671d(int i, int i2, long j, long j2, int i3, C52707g gVar) {
        int i4;
        int i5;
        if ((i3 & 1) != 0) {
            i4 = 0;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i5 = 0;
        } else {
            i5 = i2;
        }
        this(i4, i5, 0, 0);
    }
}
