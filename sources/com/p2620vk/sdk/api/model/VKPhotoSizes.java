package com.p2620vk.sdk.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.p2620vk.sdk.api.model.VKList.C52402a;
import java.util.Collections;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.vk.sdk.api.model.VKPhotoSizes */
public class VKPhotoSizes extends VKList<VKApiPhotoSize> implements Parcelable {
    public static Creator<VKPhotoSizes> CREATOR = new Creator<VKPhotoSizes>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new VKPhotoSizes[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new VKPhotoSizes(parcel);
        }
    };

    /* renamed from: d */
    private static float f130743d = 1.0f;

    /* renamed from: b */
    public int f130744b;

    /* renamed from: c */
    public int f130745c;

    /* renamed from: e */
    private String f130746e;

    /* renamed from: f */
    private int f130747f;

    /* renamed from: g */
    private final C52402a<VKApiPhotoSize> f130748g;

    /* renamed from: a */
    public final void mo109385a() {
        Collections.sort(this);
    }

    public int describeContents() {
        return 0;
    }

    public VKPhotoSizes() {
        this.f130744b = 1;
        this.f130745c = 1;
        this.f130748g = new C52402a<VKApiPhotoSize>() {
            /* renamed from: a */
            public final /* synthetic */ Object mo109344a(JSONObject jSONObject) throws Exception {
                int i = VKPhotoSizes.this.f130744b;
                int i2 = VKPhotoSizes.this.f130745c;
                VKApiPhotoSize vKApiPhotoSize = new VKApiPhotoSize();
                vKApiPhotoSize.f130544a = jSONObject.optString("src");
                vKApiPhotoSize.f130545b = jSONObject.optInt("width");
                vKApiPhotoSize.f130546c = jSONObject.optInt("height");
                String optString = jSONObject.optString("type");
                if (!TextUtils.isEmpty(optString)) {
                    vKApiPhotoSize.f130547d = optString.charAt(0);
                }
                if (vKApiPhotoSize.f130545b == 0 || vKApiPhotoSize.f130546c == 0) {
                    VKApiPhotoSize.m111906a(vKApiPhotoSize, i, i2);
                }
                return vKApiPhotoSize;
            }
        };
    }

    /* renamed from: a */
    public final void mo109386a(JSONArray jSONArray) {
        mo109351a(jSONArray, this.f130748g);
        mo109385a();
    }

    private VKPhotoSizes(Parcel parcel) {
        super(parcel);
        this.f130744b = 1;
        this.f130745c = 1;
        this.f130748g = new C52402a<VKApiPhotoSize>() {
            /* renamed from: a */
            public final /* synthetic */ Object mo109344a(JSONObject jSONObject) throws Exception {
                int i = VKPhotoSizes.this.f130744b;
                int i2 = VKPhotoSizes.this.f130745c;
                VKApiPhotoSize vKApiPhotoSize = new VKApiPhotoSize();
                vKApiPhotoSize.f130544a = jSONObject.optString("src");
                vKApiPhotoSize.f130545b = jSONObject.optInt("width");
                vKApiPhotoSize.f130546c = jSONObject.optInt("height");
                String optString = jSONObject.optString("type");
                if (!TextUtils.isEmpty(optString)) {
                    vKApiPhotoSize.f130547d = optString.charAt(0);
                }
                if (vKApiPhotoSize.f130545b == 0 || vKApiPhotoSize.f130546c == 0) {
                    VKApiPhotoSize.m111906a(vKApiPhotoSize, i, i2);
                }
                return vKApiPhotoSize;
            }
        };
        this.f130744b = parcel.readInt();
        this.f130745c = parcel.readInt();
        this.f130746e = parcel.readString();
        this.f130747f = parcel.readInt();
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f130744b);
        parcel.writeInt(this.f130745c);
        parcel.writeString(this.f130746e);
        parcel.writeInt(this.f130747f);
    }
}
