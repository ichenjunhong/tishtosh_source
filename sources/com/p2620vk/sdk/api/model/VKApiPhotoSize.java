package com.p2620vk.sdk.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.p683ss.android.ugc.aweme.video.preload.model.PreloadTask;

/* renamed from: com.vk.sdk.api.model.VKApiPhotoSize */
public class VKApiPhotoSize extends VKApiModel implements Parcelable, C52413a, Comparable<VKApiPhotoSize> {
    public static Creator<VKApiPhotoSize> CREATOR = new Creator<VKApiPhotoSize>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new VKApiPhotoSize[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new VKApiPhotoSize(parcel);
        }
    };

    /* renamed from: a */
    public String f130544a;

    /* renamed from: b */
    public int f130545b;

    /* renamed from: c */
    public int f130546c;

    /* renamed from: d */
    public char f130547d;

    VKApiPhotoSize() {
    }

    public int describeContents() {
        return 0;
    }

    private VKApiPhotoSize(Parcel parcel) {
        this.f130544a = parcel.readString();
        this.f130545b = parcel.readInt();
        this.f130546c = parcel.readInt();
        this.f130547d = (char) parcel.readInt();
    }

    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        VKApiPhotoSize vKApiPhotoSize = (VKApiPhotoSize) obj;
        if (this.f130545b < vKApiPhotoSize.f130545b) {
            return -1;
        }
        if (this.f130545b == vKApiPhotoSize.f130545b) {
            return 0;
        }
        return 1;
    }

    /* renamed from: a */
    public static VKApiPhotoSize m111902a(String str, int i) {
        return m111903a(str, i, i);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f130544a);
        parcel.writeInt(this.f130545b);
        parcel.writeInt(this.f130546c);
        parcel.writeInt(this.f130547d);
    }

    /* renamed from: b */
    private static void m111907b(VKApiPhotoSize vKApiPhotoSize, float f, int i) {
        m111904a(vKApiPhotoSize, Math.min(1.5f, f), i);
    }

    /* renamed from: a */
    private static void m111904a(VKApiPhotoSize vKApiPhotoSize, float f, int i) {
        vKApiPhotoSize.f130545b = i;
        vKApiPhotoSize.f130546c = (int) Math.ceil((double) (((float) vKApiPhotoSize.f130545b) / f));
    }

    /* renamed from: a */
    public static VKApiPhotoSize m111903a(String str, int i, int i2) {
        char c;
        VKApiPhotoSize vKApiPhotoSize = new VKApiPhotoSize();
        vKApiPhotoSize.f130544a = str;
        vKApiPhotoSize.f130545b = i;
        vKApiPhotoSize.f130546c = i2;
        float f = ((float) i) / ((float) i2);
        if (i <= 75) {
            vKApiPhotoSize.f130547d = 's';
        } else if (i <= 130) {
            if (f <= 1.5f) {
                c = 'o';
            } else {
                c = 'm';
            }
            vKApiPhotoSize.f130547d = c;
        } else if (i <= 200 && f <= 1.5f) {
            vKApiPhotoSize.f130547d = 'p';
        } else if (i <= 320 && f <= 1.5f) {
            vKApiPhotoSize.f130547d = 'q';
        } else if (i <= 604) {
            vKApiPhotoSize.f130547d = 'x';
        } else if (i <= 807) {
            vKApiPhotoSize.f130547d = 'y';
        } else if (i <= 1280 && i2 <= 1024) {
            vKApiPhotoSize.f130547d = 'z';
        } else if (i <= 2560 && i2 <= 2048) {
            vKApiPhotoSize.f130547d = 'w';
        }
        return vKApiPhotoSize;
    }

    /* renamed from: a */
    static void m111906a(VKApiPhotoSize vKApiPhotoSize, int i, int i2) {
        float f = ((float) i) / ((float) i2);
        switch (vKApiPhotoSize.f130547d) {
            case 'm':
                m111904a(vKApiPhotoSize, f, Math.min(i, 130));
                return;
            case 'o':
                m111907b(vKApiPhotoSize, f, Math.min(i, 130));
                return;
            case 'p':
                m111907b(vKApiPhotoSize, f, Math.min(i, 200));
                return;
            case 'q':
                m111907b(vKApiPhotoSize, f, Math.min(i, 320));
                return;
            case 's':
                m111904a(vKApiPhotoSize, f, Math.min(i, 75));
                return;
            case 'w':
                m111905a(vKApiPhotoSize, f, Math.min(i, 2560), Math.min(i2, 2048));
                break;
            case 'x':
                m111904a(vKApiPhotoSize, f, Math.min(i, 604));
                return;
            case 'y':
                m111904a(vKApiPhotoSize, f, Math.min(i, 807));
                return;
            case 'z':
                m111905a(vKApiPhotoSize, f, Math.min(i, 1280), Math.min(i2, PreloadTask.BYTE_UNIT_NUMBER));
                return;
        }
    }

    /* renamed from: a */
    public static VKApiPhotoSize m111901a(String str, char c, int i, int i2) {
        VKApiPhotoSize vKApiPhotoSize = new VKApiPhotoSize();
        vKApiPhotoSize.f130544a = str;
        vKApiPhotoSize.f130547d = c;
        m111906a(vKApiPhotoSize, i, i2);
        return vKApiPhotoSize;
    }

    /* renamed from: a */
    private static void m111905a(VKApiPhotoSize vKApiPhotoSize, float f, int i, int i2) {
        if (f > 1.0f) {
            vKApiPhotoSize.f130545b = i;
            vKApiPhotoSize.f130546c = (int) (((float) vKApiPhotoSize.f130545b) / f);
            return;
        }
        vKApiPhotoSize.f130546c = i2;
        vKApiPhotoSize.f130545b = (int) (((float) vKApiPhotoSize.f130546c) * f);
    }
}
