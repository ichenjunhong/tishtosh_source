package com.p683ss.android.ugc.aweme.shortvideo.edit.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.io.Serializable;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.model.VideoFileInfo */
public final class VideoFileInfo implements Parcelable, Serializable {
    public static final Creator CREATOR = new C43666b();
    public static final C43665a Companion = new C43665a(null);
    public static final int FPS_POSTPONE = -100;
    private final int bitrate;
    private final long duration;
    private final int fps;
    private final int height;
    private final int width;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.model.VideoFileInfo$a */
    public static final class C43665a {
        private C43665a() {
        }

        public /* synthetic */ C43665a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.model.VideoFileInfo$b */
    public static class C43666b implements Creator {
        public final Object createFromParcel(Parcel parcel) {
            C52711k.m112240b(parcel, "in");
            VideoFileInfo videoFileInfo = new VideoFileInfo(parcel.readInt(), parcel.readInt(), parcel.readLong(), parcel.readInt(), parcel.readInt());
            return videoFileInfo;
        }

        public final Object[] newArray(int i) {
            return new VideoFileInfo[i];
        }
    }

    public static /* synthetic */ VideoFileInfo copy$default(VideoFileInfo videoFileInfo, int i, int i2, long j, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = videoFileInfo.width;
        }
        if ((i5 & 2) != 0) {
            i2 = videoFileInfo.height;
        }
        int i6 = i2;
        if ((i5 & 4) != 0) {
            j = videoFileInfo.duration;
        }
        long j2 = j;
        if ((i5 & 8) != 0) {
            i3 = videoFileInfo.fps;
        }
        int i7 = i3;
        if ((i5 & 16) != 0) {
            i4 = videoFileInfo.bitrate;
        }
        return videoFileInfo.copy(i, i6, j2, i7, i4);
    }

    public final int component1() {
        return this.width;
    }

    public final int component2() {
        return this.height;
    }

    public final long component3() {
        return this.duration;
    }

    public final int component4() {
        return this.fps;
    }

    public final int component5() {
        return this.bitrate;
    }

    public final VideoFileInfo copy(int i, int i2, long j, int i3, int i4) {
        VideoFileInfo videoFileInfo = new VideoFileInfo(i, i2, j, i3, i4);
        return videoFileInfo;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof VideoFileInfo) {
                VideoFileInfo videoFileInfo = (VideoFileInfo) obj;
                if (this.width == videoFileInfo.width) {
                    if (this.height == videoFileInfo.height) {
                        if (this.duration == videoFileInfo.duration) {
                            if (this.fps == videoFileInfo.fps) {
                                if (this.bitrate == videoFileInfo.bitrate) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int getBitrate() {
        return this.bitrate;
    }

    public final long getDuration() {
        return this.duration;
    }

    public final int getFps() {
        return this.fps;
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getWidth() {
        return this.width;
    }

    public final int hashCode() {
        int i = ((this.width * 31) + this.height) * 31;
        long j = this.duration;
        return ((((i + ((int) (j ^ (j >>> 32)))) * 31) + this.fps) * 31) + this.bitrate;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoFileInfo(width=");
        sb.append(this.width);
        sb.append(", height=");
        sb.append(this.height);
        sb.append(", duration=");
        sb.append(this.duration);
        sb.append(", fps=");
        sb.append(this.fps);
        sb.append(", bitrate=");
        sb.append(this.bitrate);
        sb.append(")");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C52711k.m112240b(parcel, "parcel");
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
        parcel.writeLong(this.duration);
        parcel.writeInt(this.fps);
        parcel.writeInt(this.bitrate);
    }

    public final String getResolution() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.width);
        sb.append('*');
        sb.append(this.height);
        return sb.toString();
    }

    public VideoFileInfo(int i, int i2, long j, int i3, int i4) {
        this.width = i;
        this.height = i2;
        this.duration = j;
        this.fps = i3;
        this.bitrate = i4;
    }

    public /* synthetic */ VideoFileInfo(int i, int i2, long j, int i3, int i4, int i5, C52707g gVar) {
        int i6;
        if ((i5 & 16) != 0) {
            i6 = 0;
        } else {
            i6 = i4;
        }
        this(i, i2, j, i3, i6);
    }
}
