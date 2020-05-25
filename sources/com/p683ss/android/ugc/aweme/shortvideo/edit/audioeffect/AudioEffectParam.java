package com.p683ss.android.ugc.aweme.shortvideo.edit.audioeffect;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.experiment.UnReadVideoExperiment;
import com.p683ss.android.ugc.aweme.shortvideo.AVChallenge;
import java.io.Serializable;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioEffectParam */
public final class AudioEffectParam implements Parcelable, Serializable {
    public static final C43346a CREATOR = new C43346a(null);
    @C17952c(mo34828a = "challenge")
    private AVChallenge challenge;
    @C17952c(mo34828a = "effectPath")
    private String effectPath;
    @C17952c(mo34828a = "effectTag")
    private String effectTag;
    @C17952c(mo34828a = "preprocessResult")
    private byte[] preprocessResult;
    @C17952c(mo34828a = "seqIn")
    private int seqIn;
    @C17952c(mo34828a = "seqOut")
    private int seqOut;
    private boolean showErrorToast;
    @C17952c(mo34828a = "trackIndex")
    private int trackIndex;
    @C17952c(mo34828a = "trackType")
    private int trackType;
    @C17952c(mo34828a = "uploadId")
    private String uploadId;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioEffectParam$a */
    public static final class C43346a implements Creator<AudioEffectParam> {
        private C43346a() {
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new AudioEffectParam[i];
        }

        public /* synthetic */ C43346a(C52707g gVar) {
            this();
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            C52711k.m112240b(parcel, "parcel");
            return new AudioEffectParam(parcel);
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final AVChallenge getChallenge() {
        return this.challenge;
    }

    public final String getEffectPath() {
        return this.effectPath;
    }

    public final String getEffectTag() {
        return this.effectTag;
    }

    public final byte[] getPreprocessResult() {
        return this.preprocessResult;
    }

    public final int getSeqIn() {
        return this.seqIn;
    }

    public final int getSeqOut() {
        return this.seqOut;
    }

    public final boolean getShowErrorToast() {
        return this.showErrorToast;
    }

    public final int getTrackIndex() {
        return this.trackIndex;
    }

    public final int getTrackType() {
        return this.trackType;
    }

    public final String getUploadId() {
        return this.uploadId;
    }

    public final void setChallenge(AVChallenge aVChallenge) {
        this.challenge = aVChallenge;
    }

    public final void setPreprocessResult(byte[] bArr) {
        this.preprocessResult = bArr;
    }

    public final void setSeqIn(int i) {
        this.seqIn = i;
    }

    public final void setSeqOut(int i) {
        this.seqOut = i;
    }

    public final void setShowErrorToast(boolean z) {
        this.showErrorToast = z;
    }

    public final void setTrackIndex(int i) {
        this.trackIndex = i;
    }

    public final void setTrackType(int i) {
        this.trackType = i;
    }

    public final void setEffectPath(String str) {
        C52711k.m112240b(str, "<set-?>");
        this.effectPath = str;
    }

    public final void setEffectTag(String str) {
        C52711k.m112240b(str, "<set-?>");
        this.effectTag = str;
    }

    public final void setUploadId(String str) {
        C52711k.m112240b(str, "<set-?>");
        this.uploadId = str;
    }

    public AudioEffectParam(Parcel parcel) {
        C52711k.m112240b(parcel, "parcel");
        String readString = parcel.readString();
        if (readString == null) {
            readString = "";
        }
        String str = readString;
        int readInt = parcel.readInt();
        int readInt2 = parcel.readInt();
        String readString2 = parcel.readString();
        if (readString2 == null) {
            readString2 = "";
        }
        String str2 = readString2;
        String readString3 = parcel.readString();
        if (readString3 == null) {
            readString3 = "";
        }
        this(str, readInt, readInt2, str2, readString3, parcel.readInt(), parcel.readInt(), parcel.createByteArray(), (AVChallenge) parcel.readParcelable(AVChallenge.class.getClassLoader()));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C52711k.m112240b(parcel, "parcel");
        parcel.writeString(this.uploadId);
        parcel.writeInt(this.trackType);
        parcel.writeInt(this.trackIndex);
        parcel.writeString(this.effectPath);
        parcel.writeString(this.effectTag);
        parcel.writeInt(this.seqIn);
        parcel.writeInt(this.seqOut);
        parcel.writeByteArray(this.preprocessResult);
        parcel.writeParcelable(this.challenge, i);
    }

    public AudioEffectParam(String str, int i, int i2, String str2, String str3, int i3, int i4, byte[] bArr, AVChallenge aVChallenge) {
        C52711k.m112240b(str, "uploadId");
        C52711k.m112240b(str2, "effectPath");
        C52711k.m112240b(str3, "effectTag");
        this.uploadId = str;
        this.trackType = i;
        this.trackIndex = i2;
        this.effectPath = str2;
        this.effectTag = str3;
        this.seqIn = i3;
        this.seqOut = i4;
        this.preprocessResult = bArr;
        this.challenge = aVChallenge;
    }

    public /* synthetic */ AudioEffectParam(String str, int i, int i2, String str2, String str3, int i3, int i4, byte[] bArr, AVChallenge aVChallenge, int i5, C52707g gVar) {
        String str4;
        int i6;
        int i7;
        String str5;
        String str6;
        int i8;
        int i9;
        AVChallenge aVChallenge2;
        int i10 = i5;
        if ((i10 & 1) != 0) {
            str4 = "";
        } else {
            str4 = str;
        }
        if ((i10 & 2) != 0) {
            i6 = 0;
        } else {
            i6 = i;
        }
        if ((i10 & 4) != 0) {
            i7 = 0;
        } else {
            i7 = i2;
        }
        if ((i10 & 8) != 0) {
            str5 = "";
        } else {
            str5 = str2;
        }
        if ((i10 & 16) != 0) {
            str6 = "";
        } else {
            str6 = str3;
        }
        if ((i10 & 32) != 0) {
            i8 = 0;
        } else {
            i8 = i3;
        }
        if ((i10 & 64) != 0) {
            i9 = 0;
        } else {
            i9 = i4;
        }
        if ((i10 & UnReadVideoExperiment.BROWSE_RECORD_LIST) != 0) {
            aVChallenge2 = null;
        } else {
            aVChallenge2 = aVChallenge;
        }
        this(str4, i6, i7, str5, str6, i8, i9, bArr, aVChallenge2);
    }
}
