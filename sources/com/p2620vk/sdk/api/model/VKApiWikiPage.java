package com.p2620vk.sdk.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.p2620vk.sdk.api.model.VKAttachments.VKApiAttachment;
import org.json.JSONObject;

/* renamed from: com.vk.sdk.api.model.VKApiWikiPage */
public class VKApiWikiPage extends VKApiAttachment implements Parcelable {
    public static Creator<VKApiWikiPage> CREATOR = new Creator<VKApiWikiPage>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new VKApiWikiPage[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new VKApiWikiPage(parcel);
        }
    };

    /* renamed from: a */
    public int f130723a;

    /* renamed from: b */
    public int f130724b;

    /* renamed from: c */
    public int f130725c;

    /* renamed from: d */
    public String f130726d;

    /* renamed from: e */
    public String f130727e;

    /* renamed from: f */
    public boolean f130728f;

    /* renamed from: g */
    public boolean f130729g;

    /* renamed from: h */
    public int f130730h;

    /* renamed from: i */
    public int f130731i;

    /* renamed from: j */
    public int f130732j;

    /* renamed from: k */
    public long f130733k;

    /* renamed from: l */
    public long f130734l;

    /* renamed from: m */
    public String f130735m;

    /* renamed from: n */
    public String f130736n;

    public VKApiWikiPage() {
    }

    /* renamed from: b */
    public final String mo109176b() {
        return "page";
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: a */
    public final CharSequence mo109174a() {
        StringBuilder sb = new StringBuilder("page");
        sb.append(this.f130724b);
        sb.append('_');
        sb.append(this.f130723a);
        return sb;
    }

    public VKApiWikiPage(Parcel parcel) {
        boolean z;
        this.f130723a = parcel.readInt();
        this.f130724b = parcel.readInt();
        this.f130725c = parcel.readInt();
        this.f130726d = parcel.readString();
        this.f130727e = parcel.readString();
        boolean z2 = false;
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f130728f = z;
        if (parcel.readByte() != 0) {
            z2 = true;
        }
        this.f130729g = z2;
        this.f130730h = parcel.readInt();
        this.f130731i = parcel.readInt();
        this.f130732j = parcel.readInt();
        this.f130733k = parcel.readLong();
        this.f130734l = parcel.readLong();
        this.f130735m = parcel.readString();
        this.f130736n = parcel.readString();
    }

    /* renamed from: a */
    public final VKApiWikiPage mo109175b(JSONObject jSONObject) {
        this.f130723a = jSONObject.optInt("id");
        this.f130724b = jSONObject.optInt("group_id");
        this.f130725c = jSONObject.optInt("creator_id");
        this.f130726d = jSONObject.optString("title");
        this.f130727e = jSONObject.optString("source");
        this.f130728f = C52414b.m111969a(jSONObject, "current_user_can_edit");
        this.f130729g = C52414b.m111969a(jSONObject, "current_user_can_edit_access");
        this.f130730h = jSONObject.optInt("who_can_view");
        this.f130731i = jSONObject.optInt("who_can_edit");
        this.f130732j = jSONObject.optInt("editor_id");
        this.f130733k = jSONObject.optLong("edited");
        this.f130734l = jSONObject.optLong("created");
        this.f130735m = jSONObject.optString("parent");
        this.f130736n = jSONObject.optString("parent2");
        return this;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f130723a);
        parcel.writeInt(this.f130724b);
        parcel.writeInt(this.f130725c);
        parcel.writeString(this.f130726d);
        parcel.writeString(this.f130727e);
        parcel.writeByte(this.f130728f ? (byte) 1 : 0);
        parcel.writeByte(this.f130729g ? (byte) 1 : 0);
        parcel.writeInt(this.f130730h);
        parcel.writeInt(this.f130731i);
        parcel.writeInt(this.f130732j);
        parcel.writeLong(this.f130733k);
        parcel.writeLong(this.f130734l);
        parcel.writeString(this.f130735m);
        parcel.writeString(this.f130736n);
    }
}
