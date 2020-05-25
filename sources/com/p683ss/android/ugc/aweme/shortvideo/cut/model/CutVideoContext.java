package com.p683ss.android.ugc.aweme.shortvideo.cut.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.bytedance.common.utility.C9414h;
import com.p683ss.android.ugc.aweme.tools.C47339t;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.model.CutVideoContext */
public class CutVideoContext implements Parcelable, Serializable {
    public static final Creator<CutVideoContext> CREATOR = new Creator<CutVideoContext>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new CutVideoContext[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new CutVideoContext(parcel);
        }
    };

    /* renamed from: a */
    private List<VideoSegment> f107900a;
    public float totalSpeed;

    public CutVideoContext() {
    }

    public int describeContents() {
        return 0;
    }

    public List<VideoSegment> getVideoSegmentList() {
        return this.f107900a;
    }

    public void resetVideoSegmentList() {
        if (!C9414h.m18630a(this.f107900a)) {
            for (int i = 0; i < this.f107900a.size(); i++) {
                VideoSegment videoSegment = (VideoSegment) this.f107900a.get(i);
                videoSegment.f107905d = 0;
                videoSegment.f107906e = videoSegment.f107904c;
                videoSegment.f107907f = C47339t.NORMAL.value();
                videoSegment.f107912k = 0;
                videoSegment.f107911j = false;
            }
        }
    }

    public void setSpeed(float f) {
        this.totalSpeed = f;
    }

    public void setVideoSegmentList(List<VideoSegment> list) {
        this.f107900a = list;
    }

    protected CutVideoContext(Parcel parcel) {
        this.totalSpeed = parcel.readFloat();
        this.f107900a = new ArrayList();
        parcel.readList(this.f107900a, VideoSegment.class.getClassLoader());
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeDouble((double) this.totalSpeed);
        parcel.writeList(this.f107900a);
    }
}
