package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.facebook.share.model.CameraEffectArguments.C14627a;
import com.facebook.share.model.CameraEffectTextures.C14629a;

public class ShareCameraEffectContent extends ShareContent<ShareCameraEffectContent, Object> {
    public static final Creator<ShareCameraEffectContent> CREATOR = new Creator<ShareCameraEffectContent>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new ShareCameraEffectContent[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new ShareCameraEffectContent(parcel);
        }
    };

    /* renamed from: a */
    public String f37943a;

    /* renamed from: b */
    public CameraEffectArguments f37944b;

    /* renamed from: c */
    public CameraEffectTextures f37945c;

    ShareCameraEffectContent(Parcel parcel) {
        super(parcel);
        this.f37943a = parcel.readString();
        C14627a aVar = new C14627a();
        CameraEffectArguments cameraEffectArguments = (CameraEffectArguments) parcel.readParcelable(CameraEffectArguments.class.getClassLoader());
        if (cameraEffectArguments != null) {
            aVar.f37930a.putAll(cameraEffectArguments.f37929a);
        }
        this.f37944b = new CameraEffectArguments(aVar);
        C14629a aVar2 = new C14629a();
        CameraEffectTextures cameraEffectTextures = (CameraEffectTextures) parcel.readParcelable(CameraEffectTextures.class.getClassLoader());
        if (cameraEffectTextures != null) {
            aVar2.f37932a.putAll(cameraEffectTextures.f37931a);
        }
        this.f37945c = new CameraEffectTextures(aVar2);
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f37943a);
        parcel.writeParcelable(this.f37944b, 0);
        parcel.writeParcelable(this.f37945c, 0);
    }
}
