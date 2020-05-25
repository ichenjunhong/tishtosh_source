package com.p683ss.android.ugc.aweme.shortvideo.edit;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.profile.model.User;
import java.io.Serializable;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.LivePublishModel */
public final class LivePublishModel implements Parcelable, Serializable {
    public static final C43315a CREATOR = new C43315a(null);
    @C17952c(mo34828a = "live_author")

    /* renamed from: a */
    private User f109521a;
    @C17952c(mo34828a = "publish_type")

    /* renamed from: b */
    private Integer f109522b;
    @C17952c(mo34828a = "live_time")

    /* renamed from: c */
    private String f109523c;
    @C17952c(mo34828a = "self_video")

    /* renamed from: d */
    private Boolean f109524d;
    @C17952c(mo34828a = "watermark_location")

    /* renamed from: e */
    private Float[] f109525e;
    @C17952c(mo34828a = "room_id")

    /* renamed from: f */
    private String f109526f;
    @C17952c(mo34828a = "file_path")

    /* renamed from: g */
    private String f109527g;
    @C17952c(mo34828a = "video_rotate")

    /* renamed from: h */
    private Integer f109528h;
    @C17952c(mo34828a = "record_start_time")

    /* renamed from: i */
    private String f109529i;
    @C17952c(mo34828a = "record_end_time")

    /* renamed from: j */
    private String f109530j;
    @C17952c(mo34828a = "live_record_anchor_id")

    /* renamed from: k */
    private String f109531k;
    @C17952c(mo34828a = "fragment_id")

    /* renamed from: l */
    private String f109532l;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.LivePublishModel$a */
    public static final class C43315a implements Creator<LivePublishModel> {
        private C43315a() {
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new LivePublishModel[i];
        }

        public /* synthetic */ C43315a(C52707g gVar) {
            this();
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            C52711k.m112240b(parcel, "parcel");
            return new LivePublishModel(parcel);
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final String getAnchorId() {
        return this.f109531k;
    }

    public final User getAuthor() {
        return this.f109521a;
    }

    public final String getEndTime() {
        return this.f109530j;
    }

    public final String getFilePath() {
        return this.f109527g;
    }

    public final String getFragmentId() {
        return this.f109532l;
    }

    public final String getRoomId() {
        return this.f109526f;
    }

    public final Integer getRotate() {
        return this.f109528h;
    }

    public final Boolean getSelfVideo() {
        return this.f109524d;
    }

    public final String getStartTime() {
        return this.f109529i;
    }

    public final String getTime() {
        return this.f109523c;
    }

    public final Integer getType() {
        return this.f109522b;
    }

    public final Float[] getWatermarkLocation() {
        return this.f109525e;
    }

    public final boolean isHighlight() {
        Integer num = this.f109522b;
        if (num != null && num.intValue() == 2) {
            return true;
        }
        return false;
    }

    public final boolean isRecord() {
        Integer num = this.f109522b;
        if (num != null && num.intValue() == 1) {
            return true;
        }
        return false;
    }

    public LivePublishModel() {
        this.f109522b = Integer.valueOf(0);
        this.f109523c = "";
        this.f109524d = Boolean.valueOf(false);
        this.f109528h = Integer.valueOf(0);
        this.f109529i = "";
        this.f109530j = "";
        this.f109531k = "";
        this.f109532l = "";
    }

    public final void setAnchorId(String str) {
        this.f109531k = str;
    }

    public final void setAuthor(User user) {
        this.f109521a = user;
    }

    public final void setEndTime(String str) {
        this.f109530j = str;
    }

    public final void setFilePath(String str) {
        this.f109527g = str;
    }

    public final void setFragmentId(String str) {
        this.f109532l = str;
    }

    public final void setRoomId(String str) {
        this.f109526f = str;
    }

    public final void setRotate(Integer num) {
        this.f109528h = num;
    }

    public final void setSelfVideo(Boolean bool) {
        this.f109524d = bool;
    }

    public final void setStartTime(String str) {
        this.f109529i = str;
    }

    public final void setTime(String str) {
        this.f109523c = str;
    }

    public final void setType(Integer num) {
        this.f109522b = num;
    }

    public final void setWatermarkLocation(Float[] fArr) {
        this.f109525e = fArr;
    }

    public LivePublishModel(Parcel parcel) {
        C52711k.m112240b(parcel, "parcel");
        this();
        Object readValue = parcel.readValue(Integer.TYPE.getClassLoader());
        if (!(readValue instanceof Integer)) {
            readValue = null;
        }
        this.f109522b = (Integer) readValue;
        this.f109523c = parcel.readString();
        Object readValue2 = parcel.readValue(Boolean.TYPE.getClassLoader());
        if (!(readValue2 instanceof Boolean)) {
            readValue2 = null;
        }
        this.f109524d = (Boolean) readValue2;
        this.f109526f = parcel.readString();
        this.f109527g = parcel.readString();
        Object readValue3 = parcel.readValue(Integer.TYPE.getClassLoader());
        if (!(readValue3 instanceof Integer)) {
            readValue3 = null;
        }
        this.f109528h = (Integer) readValue3;
        this.f109529i = parcel.readString();
        this.f109530j = parcel.readString();
        this.f109531k = parcel.readString();
        this.f109532l = parcel.readString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C52711k.m112240b(parcel, "parcel");
        parcel.writeValue(this.f109522b);
        parcel.writeString(this.f109523c);
        parcel.writeValue(this.f109524d);
        parcel.writeString(this.f109526f);
        parcel.writeString(this.f109527g);
        parcel.writeValue(this.f109528h);
        parcel.writeString(this.f109529i);
        parcel.writeString(this.f109530j);
        parcel.writeString(this.f109531k);
        parcel.writeString(this.f109532l);
    }
}
