package com.p683ss.android.vesdk;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

/* renamed from: com.ss.android.vesdk.VEAudioEncodeSettings */
public class VEAudioEncodeSettings implements Parcelable {
    public static final Creator<VEAudioEncodeSettings> CREATOR = new Creator<VEAudioEncodeSettings>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new VEAudioEncodeSettings[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new VEAudioEncodeSettings(parcel);
        }
    };

    /* renamed from: a */
    static final VEAudioEncodeSettings f126650a = new VEAudioEncodeSettings();

    /* renamed from: b */
    public ENCODE_STANDARD f126651b;

    /* renamed from: c */
    public int f126652c;

    /* renamed from: d */
    public int f126653d;

    /* renamed from: e */
    public int f126654e;

    /* renamed from: f */
    public boolean f126655f;

    /* renamed from: com.ss.android.vesdk.VEAudioEncodeSettings$ENCODE_STANDARD */
    public enum ENCODE_STANDARD implements Parcelable {
        ENCODE_STANDARD_WAV,
        ENCODE_STANDARD_PCM,
        ENCODE_STANDARD_AAC;
        
        public static final Creator<ENCODE_STANDARD> CREATOR = null;

        public final int describeContents() {
            return 0;
        }

        static {
            CREATOR = new Creator<ENCODE_STANDARD>() {
                public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                    return new ENCODE_STANDARD[i];
                }

                public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                    return ENCODE_STANDARD.values()[parcel.readInt()];
                }
            };
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(ordinal());
        }
    }

    /* renamed from: com.ss.android.vesdk.VEAudioEncodeSettings$a */
    public static final class C50523a {

        /* renamed from: a */
        public ENCODE_STANDARD f126657a = ENCODE_STANDARD.ENCODE_STANDARD_WAV;

        /* renamed from: b */
        public int f126658b = 44100;

        /* renamed from: c */
        public int f126659c = 131072;

        /* renamed from: d */
        public int f126660d = 2;

        /* renamed from: e */
        public boolean f126661e;

        /* renamed from: a */
        public final VEAudioEncodeSettings mo98461a() {
            return new VEAudioEncodeSettings(this);
        }

        /* renamed from: c */
        public final C50523a mo98463c(int i) {
            this.f126660d = 2;
            return this;
        }

        /* renamed from: a */
        public final C50523a mo98460a(int i) {
            this.f126658b = 16000;
            return this;
        }

        /* renamed from: b */
        public final C50523a mo98462b(int i) {
            this.f126659c = 128000;
            return this;
        }
    }

    public int describeContents() {
        return 0;
    }

    public VEAudioEncodeSettings() {
        this.f126652c = 44100;
        this.f126653d = 131072;
        this.f126654e = 2;
        this.f126652c = 44100;
        this.f126653d = 128000;
        this.f126654e = 2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        sb.append("\"mCodec\":");
        sb.append(this.f126651b);
        sb.append(",\"mSampleRate\":");
        sb.append(this.f126652c);
        sb.append(",\"mBps\":");
        sb.append(this.f126653d);
        sb.append(",\"mChannelCount\":");
        sb.append(this.f126654e);
        sb.append(",\"mHwEnc\":");
        sb.append(this.f126655f);
        sb.append('}');
        return sb.toString();
    }

    protected VEAudioEncodeSettings(Parcel parcel) {
        boolean z;
        this.f126652c = 44100;
        this.f126653d = 131072;
        this.f126654e = 2;
        this.f126651b = (ENCODE_STANDARD) parcel.readParcelable(ENCODE_STANDARD.class.getClassLoader());
        this.f126652c = parcel.readInt();
        this.f126653d = parcel.readInt();
        this.f126654e = parcel.readInt();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f126655f = z;
    }

    private VEAudioEncodeSettings(C50523a aVar) {
        this.f126652c = 44100;
        this.f126653d = 131072;
        this.f126654e = 2;
        this.f126651b = aVar.f126657a;
        this.f126652c = aVar.f126658b;
        this.f126653d = aVar.f126659c;
        this.f126654e = aVar.f126660d;
        this.f126655f = aVar.f126661e;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f126651b, i);
        parcel.writeInt(this.f126652c);
        parcel.writeInt(this.f126653d);
        parcel.writeInt(this.f126654e);
        parcel.writeByte(this.f126655f ? (byte) 1 : 0);
    }
}
