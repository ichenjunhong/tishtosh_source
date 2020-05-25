package com.p683ss.android.vesdk;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.p683ss.android.vesdk.C50712l.C50716c;

/* renamed from: com.ss.android.vesdk.VECameraSettings */
public class VECameraSettings implements Parcelable {
    public static final Creator<VECameraSettings> CREATOR = new Creator<VECameraSettings>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new VECameraSettings[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new VECameraSettings(parcel);
        }
    };

    /* renamed from: a */
    public static final String f126679a = "VECameraSettings";

    /* renamed from: d */
    public static final String[] f126680d = {"auto", "action", "barcode", "beach", "candlelight", "fireworks", "hdr", "landscape", "night", "night-portrait", "party", "portrait", "snow", "sports", "steadyphoto", "sunset", "theatre"};

    /* renamed from: b */
    int[] f126681b;

    /* renamed from: c */
    int[] f126682c;

    /* renamed from: e */
    public int f126683e;

    /* renamed from: f */
    public VESize f126684f;

    /* renamed from: g */
    public int[] f126685g;

    /* renamed from: h */
    public CAMERA_HW_LEVEL f126686h;

    /* renamed from: i */
    public CAMERA_TYPE f126687i;

    /* renamed from: j */
    public CAMERA_FACING_ID f126688j;

    /* renamed from: k */
    public String f126689k;

    /* renamed from: l */
    public String f126690l;

    /* renamed from: m */
    public boolean f126691m;

    /* renamed from: n */
    public boolean f126692n;

    /* renamed from: o */
    public int f126693o;

    /* renamed from: p */
    public boolean f126694p;

    /* renamed from: q */
    public byte f126695q;

    /* renamed from: r */
    public VESize f126696r;

    /* renamed from: s */
    public CAMERA_OUTPUT_MODE f126697s;

    /* renamed from: t */
    public boolean f126698t;

    /* renamed from: u */
    public CAMERA_MODE_TYPE f126699u;

    /* renamed from: v */
    public boolean f126700v;

    /* renamed from: w */
    public int f126701w;

    /* renamed from: x */
    public Bundle f126702x;

    /* renamed from: y */
    private C50533b f126703y;

    /* renamed from: com.ss.android.vesdk.VECameraSettings$CAMERA_FACING_ID */
    public enum CAMERA_FACING_ID implements Parcelable {
        FACING_BACK,
        FACING_FRONT,
        FACING_WIDE_ANGLE,
        FACING_TELEPHOTO,
        FACING_3RD;
        
        public static final Creator<CAMERA_FACING_ID> CREATOR = null;

        public final int describeContents() {
            return 0;
        }

        static {
            CREATOR = new Creator<CAMERA_FACING_ID>() {
                public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                    return new CAMERA_FACING_ID[i];
                }

                public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                    return CAMERA_FACING_ID.values()[parcel.readInt()];
                }
            };
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(ordinal());
        }
    }

    /* renamed from: com.ss.android.vesdk.VECameraSettings$CAMERA_FLASH_MODE */
    public enum CAMERA_FLASH_MODE implements Parcelable {
        CAMERA_FLASH_OFF,
        CAMERA_FLASH_ON,
        CAMERA_FLASH_TORCH,
        CAMERA_FLASH_AUTO,
        CAMERA_FLASH_RED_EYE;
        
        public static final Creator<CAMERA_FLASH_MODE> CREATOR = null;

        public final int describeContents() {
            return 0;
        }

        static {
            CREATOR = new Creator<CAMERA_FLASH_MODE>() {
                public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                    return new CAMERA_FLASH_MODE[i];
                }

                public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                    return CAMERA_FLASH_MODE.values()[parcel.readInt()];
                }
            };
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(ordinal());
        }
    }

    /* renamed from: com.ss.android.vesdk.VECameraSettings$CAMERA_HW_LEVEL */
    public enum CAMERA_HW_LEVEL implements Parcelable {
        CAMERA_HW_LEVEL_LEGACY,
        CAMERA_HW_LEVEL_LIMITED,
        CAMERA_HW_LEVEL_FULL,
        CAMERA_HW_LEVEL_LEVEL_3;
        
        public static final Creator<CAMERA_HW_LEVEL> CREATOR = null;

        public final int describeContents() {
            return 0;
        }

        static {
            CREATOR = new Creator<CAMERA_HW_LEVEL>() {
                public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                    return new CAMERA_HW_LEVEL[i];
                }

                public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                    return CAMERA_HW_LEVEL.values()[parcel.readInt()];
                }
            };
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(ordinal());
        }
    }

    /* renamed from: com.ss.android.vesdk.VECameraSettings$CAMERA_MODE_TYPE */
    public enum CAMERA_MODE_TYPE implements Parcelable {
        VIDEO_MODE,
        IMAGE_MODE;
        
        public static final Creator<CAMERA_MODE_TYPE> CREATOR = null;

        public final int describeContents() {
            return 0;
        }

        static {
            CREATOR = new Creator<CAMERA_MODE_TYPE>() {
                public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                    return new CAMERA_MODE_TYPE[i];
                }

                public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                    return CAMERA_MODE_TYPE.values()[parcel.readInt()];
                }
            };
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(ordinal());
        }
    }

    /* renamed from: com.ss.android.vesdk.VECameraSettings$CAMERA_OUTPUT_MODE */
    public enum CAMERA_OUTPUT_MODE implements Parcelable {
        SURFACE,
        FRAME,
        SURFACE_FRAME;
        
        public static final Creator<CAMERA_OUTPUT_MODE> CREATOR = null;

        public final int describeContents() {
            return 0;
        }

        static {
            CREATOR = new Creator<CAMERA_OUTPUT_MODE>() {
                public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                    return new CAMERA_OUTPUT_MODE[i];
                }

                public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                    return CAMERA_OUTPUT_MODE.values()[parcel.readInt()];
                }
            };
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(ordinal());
        }
    }

    /* renamed from: com.ss.android.vesdk.VECameraSettings$CAMERA_TYPE */
    public enum CAMERA_TYPE implements Parcelable {
        NULL,
        TYPE1,
        TYPE2,
        TYPE_CHRYCamera,
        TYPE_Mi,
        TYPE_Oppo,
        TYPE_CamKit,
        TYPE_Vivo;
        
        public static final Creator<CAMERA_TYPE> CREATOR = null;

        public final int describeContents() {
            return 0;
        }

        static {
            CREATOR = new Creator<CAMERA_TYPE>() {
                public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                    return new CAMERA_TYPE[i];
                }

                public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                    return CAMERA_TYPE.values()[parcel.readInt()];
                }
            };
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(ordinal());
        }
    }

    /* renamed from: com.ss.android.vesdk.VECameraSettings$a */
    public static class C50532a {

        /* renamed from: a */
        public VECameraSettings f126710a;

        public C50532a() {
            this.f126710a = new VECameraSettings();
        }

        public C50532a(VECameraSettings vECameraSettings) {
            this.f126710a = vECameraSettings;
        }

        /* renamed from: a */
        public final C50532a mo98518a(byte b) {
            this.f126710a.f126695q = b;
            return this;
        }

        /* renamed from: b */
        public final C50532a mo98526b(int i) {
            this.f126710a.f126701w = 2;
            return this;
        }

        /* renamed from: a */
        public final C50532a mo98519a(int i) {
            this.f126710a.f126683e = 0;
            return this;
        }

        /* renamed from: b */
        public final C50532a mo98527b(boolean z) {
            this.f126710a.f126698t = z;
            return this;
        }

        /* renamed from: a */
        public final C50532a mo98521a(CAMERA_FACING_ID camera_facing_id) {
            C50716c a = C50712l.m109659a().mo99229a("wide_camera_id");
            if (a != null && (a.f127275b instanceof String)) {
                this.f126710a.f126689k = (String) a.f127275b;
            }
            this.f126710a.f126688j = camera_facing_id;
            return this;
        }

        /* renamed from: a */
        public final C50532a mo98522a(CAMERA_HW_LEVEL camera_hw_level) {
            this.f126710a.f126686h = camera_hw_level;
            return this;
        }

        /* renamed from: a */
        public final C50532a mo98523a(CAMERA_OUTPUT_MODE camera_output_mode) {
            this.f126710a.f126697s = camera_output_mode;
            return this;
        }

        /* renamed from: a */
        public final C50532a mo98524a(CAMERA_TYPE camera_type) {
            this.f126710a.f126687i = camera_type;
            return this;
        }

        /* renamed from: a */
        public final C50532a mo98525a(boolean z) {
            this.f126710a.f126691m = z;
            return this;
        }

        /* renamed from: a */
        public final C50532a mo98520a(int i, int i2) {
            this.f126710a.f126684f = new VESize(i, i2);
            return this;
        }
    }

    /* renamed from: com.ss.android.vesdk.VECameraSettings$b */
    public enum C50533b {
        DYNAMIC_FRAMERATE,
        FIXED_FRAMERATE_WITH_AE_ON,
        FIXED_FRAMERATE_WITH_AE_OFF
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: a */
    public final C50533b mo98489a() {
        C50716c a = C50712l.m109659a().mo99229a("frame_rate_strategy");
        if (a != null && (a.f127275b instanceof Integer)) {
            if (((Integer) a.f127275b).intValue() == 1) {
                this.f126703y = C50533b.FIXED_FRAMERATE_WITH_AE_ON;
            } else if (((Integer) a.f127275b).intValue() == 2) {
                this.f126703y = C50533b.FIXED_FRAMERATE_WITH_AE_OFF;
            } else {
                this.f126703y = C50533b.DYNAMIC_FRAMERATE;
            }
        }
        return this.f126703y;
    }

    private VECameraSettings() {
        this.f126681b = new int[]{2, 0, 1, 3};
        this.f126682c = new int[]{1, 2, 0, 3};
        this.f126683e = 30;
        this.f126684f = new VESize(720, 1280);
        this.f126685g = new int[]{7, 30};
        this.f126686h = CAMERA_HW_LEVEL.CAMERA_HW_LEVEL_LEGACY;
        this.f126687i = CAMERA_TYPE.TYPE1;
        this.f126688j = CAMERA_FACING_ID.FACING_FRONT;
        this.f126689k = "-1";
        this.f126690l = "auto";
        this.f126691m = false;
        this.f126703y = C50533b.DYNAMIC_FRAMERATE;
        this.f126692n = false;
        this.f126693o = 0;
        this.f126694p = false;
        this.f126695q = 1;
        this.f126696r = new VESize(-1, -1);
        this.f126697s = CAMERA_OUTPUT_MODE.SURFACE;
        this.f126698t = true;
        this.f126699u = CAMERA_MODE_TYPE.VIDEO_MODE;
        this.f126700v = false;
        this.f126701w = 0;
        this.f126687i = CAMERA_TYPE.TYPE1;
        this.f126688j = CAMERA_FACING_ID.FACING_FRONT;
        this.f126683e = 30;
        this.f126684f.width = 720;
        this.f126684f.height = 1280;
        this.f126702x = new Bundle();
    }

    protected VECameraSettings(Parcel parcel) {
        boolean z;
        boolean z2;
        boolean z3;
        this.f126681b = new int[]{2, 0, 1, 3};
        this.f126682c = new int[]{1, 2, 0, 3};
        this.f126683e = 30;
        this.f126684f = new VESize(720, 1280);
        this.f126685g = new int[]{7, 30};
        this.f126686h = CAMERA_HW_LEVEL.CAMERA_HW_LEVEL_LEGACY;
        this.f126687i = CAMERA_TYPE.TYPE1;
        this.f126688j = CAMERA_FACING_ID.FACING_FRONT;
        this.f126689k = "-1";
        this.f126690l = "auto";
        boolean z4 = false;
        this.f126691m = false;
        this.f126703y = C50533b.DYNAMIC_FRAMERATE;
        this.f126692n = false;
        this.f126693o = 0;
        this.f126694p = false;
        this.f126695q = 1;
        this.f126696r = new VESize(-1, -1);
        this.f126697s = CAMERA_OUTPUT_MODE.SURFACE;
        this.f126698t = true;
        this.f126699u = CAMERA_MODE_TYPE.VIDEO_MODE;
        this.f126700v = false;
        this.f126701w = 0;
        this.f126681b = parcel.createIntArray();
        this.f126682c = parcel.createIntArray();
        this.f126683e = parcel.readInt();
        this.f126684f = (VESize) parcel.readParcelable(VESize.class.getClassLoader());
        this.f126685g = parcel.createIntArray();
        this.f126686h = (CAMERA_HW_LEVEL) parcel.readParcelable(CAMERA_HW_LEVEL.class.getClassLoader());
        this.f126687i = (CAMERA_TYPE) parcel.readParcelable(CAMERA_TYPE.class.getClassLoader());
        this.f126688j = (CAMERA_FACING_ID) parcel.readParcelable(CAMERA_FACING_ID.class.getClassLoader());
        this.f126689k = parcel.readString();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f126691m = z;
        if (parcel.readByte() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f126692n = z2;
        this.f126690l = parcel.readString();
        this.f126695q = parcel.readByte();
        this.f126696r = (VESize) parcel.readParcelable(VESize.class.getClassLoader());
        this.f126693o = parcel.readInt();
        this.f126697s = (CAMERA_OUTPUT_MODE) parcel.readParcelable(CAMERA_OUTPUT_MODE.class.getClassLoader());
        this.f126702x = parcel.readBundle();
        if (parcel.readByte() != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.f126698t = z3;
        if (parcel.readByte() != 0) {
            z4 = true;
        }
        this.f126700v = z4;
        this.f126699u = (CAMERA_MODE_TYPE) parcel.readParcelable(CAMERA_MODE_TYPE.class.getClassLoader());
        this.f126701w = parcel.readInt();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.f126681b);
        parcel.writeIntArray(this.f126682c);
        parcel.writeInt(this.f126683e);
        parcel.writeParcelable(this.f126684f, i);
        parcel.writeIntArray(this.f126685g);
        parcel.writeParcelable(this.f126686h, i);
        parcel.writeParcelable(this.f126687i, i);
        parcel.writeParcelable(this.f126688j, i);
        parcel.writeString(this.f126689k);
        parcel.writeByte(this.f126691m ? (byte) 1 : 0);
        parcel.writeByte(this.f126692n ? (byte) 1 : 0);
        parcel.writeString(this.f126690l);
        parcel.writeByte(this.f126695q);
        parcel.writeParcelable(this.f126696r, i);
        parcel.writeInt(this.f126693o);
        parcel.writeParcelable(this.f126697s, i);
        parcel.writeBundle(this.f126702x);
        parcel.writeByte(this.f126698t ? (byte) 1 : 0);
        parcel.writeByte(this.f126700v ? (byte) 1 : 0);
        parcel.writeParcelable(this.f126699u, i);
        parcel.writeInt(this.f126701w);
    }
}
