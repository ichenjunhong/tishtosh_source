package com.p683ss.android.ugc.aweme.status;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.p1076a.C17952c;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.status.StatusCreateVideoData */
public final class StatusCreateVideoData implements Parcelable, Serializable {
    public static final C45732a CREATOR = new C45732a(null);
    @C17952c(mo34828a = "key_status_type")

    /* renamed from: a */
    private int f115588a;
    @C17952c(mo34828a = "bg_path")

    /* renamed from: b */
    private String f115589b;
    @C17952c(mo34828a = "bg_id")

    /* renamed from: c */
    private String f115590c;
    @C17952c(mo34828a = "status_background_selected_from")

    /* renamed from: d */
    private String f115591d;
    @C17952c(mo34828a = "status_background_size")

    /* renamed from: e */
    private int f115592e;
    @C17952c(mo34828a = "status_background_width")

    /* renamed from: f */
    private int f115593f;
    @C17952c(mo34828a = "status_background_height")

    /* renamed from: g */
    private int f115594g;
    @C17952c(mo34828a = "status_background_src_image")

    /* renamed from: h */
    private String f115595h;
    @C17952c(mo34828a = "music_path")

    /* renamed from: i */
    private String f115596i;
    @C17952c(mo34828a = "effect_path")

    /* renamed from: j */
    private String f115597j;
    @C17952c(mo34828a = "effect_id")

    /* renamed from: k */
    private String f115598k;
    @C17952c(mo34828a = "status_music_ids")

    /* renamed from: l */
    private List<String> f115599l;
    @C17952c(mo34828a = "status_video_cover")

    /* renamed from: m */
    private String f115600m;
    @C17952c(mo34828a = "status_video_cover_starttime")

    /* renamed from: n */
    private int f115601n;
    @C17952c(mo34828a = "status_template_text")

    /* renamed from: o */
    private String f115602o;
    @C17952c(mo34828a = "status_user_text")

    /* renamed from: p */
    private String f115603p;

    /* renamed from: com.ss.android.ugc.aweme.status.StatusCreateVideoData$a */
    public static final class C45732a implements Creator<StatusCreateVideoData> {
        private C45732a() {
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new StatusCreateVideoData[i];
        }

        public /* synthetic */ C45732a(C52707g gVar) {
            this();
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            C52711k.m112240b(parcel, "parcel");
            return new StatusCreateVideoData(parcel);
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final String getBgFrom() {
        return this.f115591d;
    }

    public final int getBgHeight() {
        return this.f115594g;
    }

    public final String getBgId() {
        return this.f115590c;
    }

    public final String getBgPath() {
        return this.f115589b;
    }

    public final int getBgSize() {
        return this.f115592e;
    }

    public final String getBgSrcImage() {
        return this.f115595h;
    }

    public final int getBgWidth() {
        return this.f115593f;
    }

    public final String getEffectId() {
        return this.f115598k;
    }

    public final String getEffectPath() {
        return this.f115597j;
    }

    public final List<String> getMusicIds() {
        return this.f115599l;
    }

    public final String getMusicPath() {
        return this.f115596i;
    }

    public final int getStatusType() {
        return this.f115588a;
    }

    public final String getTemplateText() {
        return this.f115602o;
    }

    public final String getUserText() {
        return this.f115603p;
    }

    public final String getVideoCoverImgPath() {
        return this.f115600m;
    }

    public final int getVideoCoverStartTime() {
        return this.f115601n;
    }

    public StatusCreateVideoData() {
        this.f115588a = -1;
        this.f115589b = "";
        this.f115590c = "";
        this.f115591d = "template";
        this.f115595h = "";
        this.f115596i = "";
        this.f115597j = "";
        this.f115598k = "";
        this.f115599l = new ArrayList();
        this.f115602o = "";
        this.f115603p = "";
    }

    public final void setBgHeight(int i) {
        this.f115594g = i;
    }

    public final void setBgSize(int i) {
        this.f115592e = i;
    }

    public final void setBgWidth(int i) {
        this.f115593f = i;
    }

    public final void setStatusType(int i) {
        this.f115588a = i;
    }

    public final void setVideoCoverImgPath(String str) {
        this.f115600m = str;
    }

    public final void setVideoCoverStartTime(int i) {
        this.f115601n = i;
    }

    public final void setBgFrom(String str) {
        C52711k.m112240b(str, "<set-?>");
        this.f115591d = str;
    }

    public final void setBgId(String str) {
        C52711k.m112240b(str, "<set-?>");
        this.f115590c = str;
    }

    public final void setBgPath(String str) {
        C52711k.m112240b(str, "<set-?>");
        this.f115589b = str;
    }

    public final void setBgSrcImage(String str) {
        C52711k.m112240b(str, "<set-?>");
        this.f115595h = str;
    }

    public final void setEffectId(String str) {
        C52711k.m112240b(str, "<set-?>");
        this.f115598k = str;
    }

    public final void setEffectPath(String str) {
        C52711k.m112240b(str, "<set-?>");
        this.f115597j = str;
    }

    public final void setMusicIds(List<String> list) {
        C52711k.m112240b(list, "<set-?>");
        this.f115599l = list;
    }

    public final void setMusicPath(String str) {
        C52711k.m112240b(str, "<set-?>");
        this.f115596i = str;
    }

    public final void setTemplateText(String str) {
        C52711k.m112240b(str, "<set-?>");
        this.f115602o = str;
    }

    public final void setUserText(String str) {
        C52711k.m112240b(str, "<set-?>");
        this.f115603p = str;
    }

    public StatusCreateVideoData(Parcel parcel) {
        C52711k.m112240b(parcel, "parcel");
        this();
        this.f115588a = parcel.readInt();
        String readString = parcel.readString();
        if (readString == null) {
            readString = "";
        }
        this.f115589b = readString;
        String readString2 = parcel.readString();
        if (readString2 == null) {
            readString2 = "";
        }
        this.f115590c = readString2;
        String readString3 = parcel.readString();
        if (readString3 == null) {
            readString3 = "";
        }
        this.f115591d = readString3;
        this.f115592e = parcel.readInt();
        this.f115593f = parcel.readInt();
        this.f115594g = parcel.readInt();
        String readString4 = parcel.readString();
        C52711k.m112236a((Object) readString4, "parcel.readString()");
        this.f115595h = readString4;
        String readString5 = parcel.readString();
        if (readString5 == null) {
            readString5 = "";
        }
        this.f115596i = readString5;
        String readString6 = parcel.readString();
        if (readString6 == null) {
            readString6 = "";
        }
        this.f115597j = readString6;
        String readString7 = parcel.readString();
        if (readString7 == null) {
            readString7 = "";
        }
        this.f115598k = readString7;
        parcel.readList(this.f115599l, String.class.getClassLoader());
        String readString8 = parcel.readString();
        if (readString8 == null) {
            readString8 = "";
        }
        this.f115600m = readString8;
        this.f115601n = parcel.readInt();
        String readString9 = parcel.readString();
        if (readString9 == null) {
            readString9 = "";
        }
        this.f115602o = readString9;
        String readString10 = parcel.readString();
        if (readString10 == null) {
            readString10 = "";
        }
        this.f115603p = readString10;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        if (parcel != null) {
            parcel.writeInt(this.f115588a);
            parcel.writeString(this.f115589b);
            parcel.writeString(this.f115590c);
            parcel.writeString(this.f115591d);
            parcel.writeInt(this.f115592e);
            parcel.writeInt(this.f115593f);
            parcel.writeInt(this.f115594g);
            parcel.writeString(this.f115595h);
            parcel.writeString(this.f115596i);
            parcel.writeString(this.f115597j);
            parcel.writeString(this.f115598k);
            parcel.writeList(this.f115599l);
            parcel.writeString(this.f115600m);
            parcel.writeInt(this.f115601n);
            parcel.writeString(this.f115602o);
            parcel.writeString(this.f115603p);
        }
    }
}
