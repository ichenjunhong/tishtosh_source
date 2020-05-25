package com.p683ss.android.ugc.aweme.shortvideo.stitch;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.p683ss.android.ugc.aweme.experiment.UnReadVideoExperiment;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.shortvideo.C42482c;
import com.p683ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.p683ss.android.ugc.aweme.video.preload.experiment.VideoCacheReadBuffersizeExperiment;
import com.p683ss.android.ugc.aweme.video.preload.model.PreloadTask;
import java.io.Serializable;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.stitch.StitchParams */
public final class StitchParams implements Parcelable, Serializable {
    public static final Creator CREATOR = new C44723a();

    /* renamed from: a */
    private EditVideoSegment f113211a;

    /* renamed from: b */
    private String f113212b;

    /* renamed from: c */
    private C42482c f113213c;

    /* renamed from: d */
    private String f113214d;

    /* renamed from: e */
    private int f113215e;

    /* renamed from: f */
    private boolean f113216f;

    /* renamed from: g */
    private String f113217g;

    /* renamed from: h */
    private User f113218h;

    /* renamed from: i */
    private String f113219i;

    /* renamed from: j */
    private String f113220j;

    /* renamed from: k */
    private long f113221k;

    /* renamed from: l */
    private String f113222l;

    /* renamed from: m */
    private String f113223m;

    /* renamed from: n */
    private boolean f113224n;

    /* renamed from: o */
    private boolean f113225o;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.stitch.StitchParams$a */
    public static class C44723a implements Creator {
        public final Object createFromParcel(Parcel parcel) {
            Parcel parcel2 = parcel;
            C52711k.m112240b(parcel2, "in");
            StitchParams stitchParams = new StitchParams((EditVideoSegment) parcel2.readParcelable(StitchParams.class.getClassLoader()), parcel.readString(), (C42482c) parcel.readSerializable(), parcel.readString(), parcel.readInt(), parcel.readInt() != 0, parcel.readString(), (User) parcel.readSerializable(), parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0);
            return stitchParams;
        }

        public final Object[] newArray(int i) {
            return new StitchParams[i];
        }
    }

    public StitchParams() {
        this(null, null, null, null, 0, false, null, null, null, null, 0, null, null, false, false, 32767, null);
    }

    public static /* synthetic */ StitchParams copy$default(StitchParams stitchParams, EditVideoSegment editVideoSegment, String str, C42482c cVar, String str2, int i, boolean z, String str3, User user, String str4, String str5, long j, String str6, String str7, boolean z2, boolean z3, int i2, Object obj) {
        StitchParams stitchParams2 = stitchParams;
        int i3 = i2;
        return stitchParams.copy((i3 & 1) != 0 ? stitchParams2.f113211a : editVideoSegment, (i3 & 2) != 0 ? stitchParams2.f113212b : str, (i3 & 4) != 0 ? stitchParams2.f113213c : cVar, (i3 & 8) != 0 ? stitchParams2.f113214d : str2, (i3 & 16) != 0 ? stitchParams2.f113215e : i, (i3 & 32) != 0 ? stitchParams2.f113216f : z, (i3 & 64) != 0 ? stitchParams2.f113217g : str3, (i3 & 128) != 0 ? stitchParams2.f113218h : user, (i3 & UnReadVideoExperiment.BROWSE_RECORD_LIST) != 0 ? stitchParams2.f113219i : str4, (i3 & UnReadVideoExperiment.LIKE_USER_LIST) != 0 ? stitchParams2.f113220j : str5, (i3 & PreloadTask.BYTE_UNIT_NUMBER) != 0 ? stitchParams2.f113221k : j, (i3 & 2048) != 0 ? stitchParams2.f113222l : str6, (i3 & 4096) != 0 ? stitchParams2.f113223m : str7, (i3 & VideoCacheReadBuffersizeExperiment.DEFAULT) != 0 ? stitchParams2.f113224n : z2, (i3 & 16384) != 0 ? stitchParams2.f113225o : z3);
    }

    public final EditVideoSegment component1() {
        return this.f113211a;
    }

    public final String component10() {
        return this.f113220j;
    }

    public final long component11() {
        return this.f113221k;
    }

    public final String component12() {
        return this.f113222l;
    }

    public final String component13() {
        return this.f113223m;
    }

    public final boolean component14() {
        return this.f113224n;
    }

    public final boolean component15() {
        return this.f113225o;
    }

    public final String component2() {
        return this.f113212b;
    }

    public final C42482c component3() {
        return this.f113213c;
    }

    public final String component4() {
        return this.f113214d;
    }

    public final int component5() {
        return this.f113215e;
    }

    public final boolean component6() {
        return this.f113216f;
    }

    public final String component7() {
        return this.f113217g;
    }

    public final User component8() {
        return this.f113218h;
    }

    public final String component9() {
        return this.f113219i;
    }

    public final StitchParams copy(EditVideoSegment editVideoSegment, String str, C42482c cVar, String str2, int i, boolean z, String str3, User user, String str4, String str5, long j, String str6, String str7, boolean z2, boolean z3) {
        StitchParams stitchParams = new StitchParams(editVideoSegment, str, cVar, str2, i, z, str3, user, str4, str5, j, str6, str7, z2, z3);
        return stitchParams;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof StitchParams) {
                StitchParams stitchParams = (StitchParams) obj;
                if (C52711k.m112239a((Object) this.f113211a, (Object) stitchParams.f113211a) && C52711k.m112239a((Object) this.f113212b, (Object) stitchParams.f113212b) && C52711k.m112239a((Object) this.f113213c, (Object) stitchParams.f113213c) && C52711k.m112239a((Object) this.f113214d, (Object) stitchParams.f113214d)) {
                    if (this.f113215e == stitchParams.f113215e) {
                        if ((this.f113216f == stitchParams.f113216f) && C52711k.m112239a((Object) this.f113217g, (Object) stitchParams.f113217g) && C52711k.m112239a((Object) this.f113218h, (Object) stitchParams.f113218h) && C52711k.m112239a((Object) this.f113219i, (Object) stitchParams.f113219i) && C52711k.m112239a((Object) this.f113220j, (Object) stitchParams.f113220j)) {
                            if ((this.f113221k == stitchParams.f113221k) && C52711k.m112239a((Object) this.f113222l, (Object) stitchParams.f113222l) && C52711k.m112239a((Object) this.f113223m, (Object) stitchParams.f113223m)) {
                                if (this.f113224n == stitchParams.f113224n) {
                                    if (this.f113225o == stitchParams.f113225o) {
                                        return true;
                                    }
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

    public final String getAwemeId() {
        return this.f113219i;
    }

    public final String getChain() {
        return this.f113220j;
    }

    public final String getConcatAudioPath() {
        return this.f113223m;
    }

    public final String getConcatVideoPath() {
        return this.f113222l;
    }

    public final long getDuration() {
        return this.f113221k;
    }

    public final boolean getEnableMic() {
        return this.f113224n;
    }

    public final User getFromUser() {
        return this.f113218h;
    }

    public final C42482c getMusic() {
        return this.f113213c;
    }

    public final String getMusicId() {
        return this.f113217g;
    }

    public final String getMusicPath() {
        return this.f113214d;
    }

    public final int getMusicStart() {
        return this.f113215e;
    }

    public final String getVideoPath() {
        return this.f113212b;
    }

    public final EditVideoSegment getVideoSegment() {
        return this.f113211a;
    }

    public final int hashCode() {
        EditVideoSegment editVideoSegment = this.f113211a;
        int i = 0;
        int hashCode = (editVideoSegment != null ? editVideoSegment.hashCode() : 0) * 31;
        String str = this.f113212b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        C42482c cVar = this.f113213c;
        int hashCode3 = (hashCode2 + (cVar != null ? cVar.hashCode() : 0)) * 31;
        String str2 = this.f113214d;
        int hashCode4 = (((hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f113215e) * 31;
        boolean z = this.f113216f;
        if (z) {
            z = true;
        }
        int i2 = (hashCode4 + (z ? 1 : 0)) * 31;
        String str3 = this.f113217g;
        int hashCode5 = (i2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        User user = this.f113218h;
        int hashCode6 = (hashCode5 + (user != null ? user.hashCode() : 0)) * 31;
        String str4 = this.f113219i;
        int hashCode7 = (hashCode6 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f113220j;
        int hashCode8 = (hashCode7 + (str5 != null ? str5.hashCode() : 0)) * 31;
        long j = this.f113221k;
        int i3 = (hashCode8 + ((int) (j ^ (j >>> 32)))) * 31;
        String str6 = this.f113222l;
        int hashCode9 = (i3 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.f113223m;
        if (str7 != null) {
            i = str7.hashCode();
        }
        int i4 = (hashCode9 + i) * 31;
        boolean z2 = this.f113224n;
        if (z2) {
            z2 = true;
        }
        int i5 = (i4 + (z2 ? 1 : 0)) * 31;
        boolean z3 = this.f113225o;
        if (z3) {
            z3 = true;
        }
        return i5 + (z3 ? 1 : 0);
    }

    public final boolean isMuted() {
        return this.f113225o;
    }

    public final boolean isPGCMusic() {
        return this.f113216f;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StitchParams(videoSegment=");
        sb.append(this.f113211a);
        sb.append(", videoPath=");
        sb.append(this.f113212b);
        sb.append(", music=");
        sb.append(this.f113213c);
        sb.append(", musicPath=");
        sb.append(this.f113214d);
        sb.append(", musicStart=");
        sb.append(this.f113215e);
        sb.append(", isPGCMusic=");
        sb.append(this.f113216f);
        sb.append(", musicId=");
        sb.append(this.f113217g);
        sb.append(", fromUser=");
        sb.append(this.f113218h);
        sb.append(", awemeId=");
        sb.append(this.f113219i);
        sb.append(", chain=");
        sb.append(this.f113220j);
        sb.append(", duration=");
        sb.append(this.f113221k);
        sb.append(", concatVideoPath=");
        sb.append(this.f113222l);
        sb.append(", concatAudioPath=");
        sb.append(this.f113223m);
        sb.append(", enableMic=");
        sb.append(this.f113224n);
        sb.append(", isMuted=");
        sb.append(this.f113225o);
        sb.append(")");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C52711k.m112240b(parcel, "parcel");
        parcel.writeParcelable(this.f113211a, i);
        parcel.writeString(this.f113212b);
        parcel.writeSerializable(this.f113213c);
        parcel.writeString(this.f113214d);
        parcel.writeInt(this.f113215e);
        parcel.writeInt(this.f113216f ? 1 : 0);
        parcel.writeString(this.f113217g);
        parcel.writeSerializable(this.f113218h);
        parcel.writeString(this.f113219i);
        parcel.writeString(this.f113220j);
        parcel.writeLong(this.f113221k);
        parcel.writeString(this.f113222l);
        parcel.writeString(this.f113223m);
        parcel.writeInt(this.f113224n ? 1 : 0);
        parcel.writeInt(this.f113225o ? 1 : 0);
    }

    public final void setAwemeId(String str) {
        this.f113219i = str;
    }

    public final void setChain(String str) {
        this.f113220j = str;
    }

    public final void setConcatAudioPath(String str) {
        this.f113223m = str;
    }

    public final void setConcatVideoPath(String str) {
        this.f113222l = str;
    }

    public final void setDuration(long j) {
        this.f113221k = j;
    }

    public final void setEnableMic(boolean z) {
        this.f113224n = z;
    }

    public final void setFromUser(User user) {
        this.f113218h = user;
    }

    public final void setMusic(C42482c cVar) {
        this.f113213c = cVar;
    }

    public final void setMusicId(String str) {
        this.f113217g = str;
    }

    public final void setMusicPath(String str) {
        this.f113214d = str;
    }

    public final void setMusicStart(int i) {
        this.f113215e = i;
    }

    public final void setMuted(boolean z) {
        this.f113225o = z;
    }

    public final void setPGCMusic(boolean z) {
        this.f113216f = z;
    }

    public final void setVideoPath(String str) {
        this.f113212b = str;
    }

    public final void setVideoSegment(EditVideoSegment editVideoSegment) {
        this.f113211a = editVideoSegment;
    }

    public StitchParams(EditVideoSegment editVideoSegment, String str, C42482c cVar, String str2, int i, boolean z, String str3, User user, String str4, String str5, long j, String str6, String str7, boolean z2, boolean z3) {
        this.f113211a = editVideoSegment;
        this.f113212b = str;
        this.f113213c = cVar;
        this.f113214d = str2;
        this.f113215e = i;
        this.f113216f = z;
        this.f113217g = str3;
        this.f113218h = user;
        this.f113219i = str4;
        this.f113220j = str5;
        this.f113221k = j;
        this.f113222l = str6;
        this.f113223m = str7;
        this.f113224n = z2;
        this.f113225o = z3;
    }

    public /* synthetic */ StitchParams(EditVideoSegment editVideoSegment, String str, C42482c cVar, String str2, int i, boolean z, String str3, User user, String str4, String str5, long j, String str6, String str7, boolean z2, boolean z3, int i2, C52707g gVar) {
        EditVideoSegment editVideoSegment2;
        String str8;
        C42482c cVar2;
        String str9;
        int i3;
        boolean z4;
        String str10;
        User user2;
        String str11;
        String str12;
        long j2;
        String str13;
        String str14;
        boolean z5;
        int i4 = i2;
        if ((i4 & 1) != 0) {
            editVideoSegment2 = null;
        } else {
            editVideoSegment2 = editVideoSegment;
        }
        if ((i4 & 2) != 0) {
            str8 = null;
        } else {
            str8 = str;
        }
        if ((i4 & 4) != 0) {
            cVar2 = null;
        } else {
            cVar2 = cVar;
        }
        if ((i4 & 8) != 0) {
            str9 = null;
        } else {
            str9 = str2;
        }
        boolean z6 = false;
        if ((i4 & 16) != 0) {
            i3 = 0;
        } else {
            i3 = i;
        }
        if ((i4 & 32) != 0) {
            z4 = false;
        } else {
            z4 = z;
        }
        if ((i4 & 64) != 0) {
            str10 = null;
        } else {
            str10 = str3;
        }
        if ((i4 & 128) != 0) {
            user2 = null;
        } else {
            user2 = user;
        }
        if ((i4 & UnReadVideoExperiment.BROWSE_RECORD_LIST) != 0) {
            str11 = null;
        } else {
            str11 = str4;
        }
        if ((i4 & UnReadVideoExperiment.LIKE_USER_LIST) != 0) {
            str12 = null;
        } else {
            str12 = str5;
        }
        if ((i4 & PreloadTask.BYTE_UNIT_NUMBER) != 0) {
            j2 = 0;
        } else {
            j2 = j;
        }
        if ((i4 & 2048) != 0) {
            str13 = null;
        } else {
            str13 = str6;
        }
        if ((i4 & 4096) != 0) {
            str14 = null;
        } else {
            str14 = str7;
        }
        if ((i4 & VideoCacheReadBuffersizeExperiment.DEFAULT) != 0) {
            z5 = true;
        } else {
            z5 = z2;
        }
        if ((i4 & 16384) == 0) {
            z6 = z3;
        }
        this(editVideoSegment2, str8, cVar2, str9, i3, z4, str10, user2, str11, str12, j2, str13, str14, z5, z6);
    }
}
