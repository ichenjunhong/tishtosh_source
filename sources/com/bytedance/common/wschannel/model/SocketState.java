package com.bytedance.common.wschannel.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.p683ss.android.ugc.aweme.main.experiment.pneumonia.DynamicTabYellowPointVersion;
import org.json.JSONException;
import org.json.JSONObject;

public class SocketState implements Parcelable {
    public static final Creator<SocketState> CREATOR = new Creator<SocketState>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new SocketState[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new SocketState(parcel);
        }
    };

    /* renamed from: a */
    public int f25919a;

    /* renamed from: b */
    public int f25920b;

    /* renamed from: c */
    public String f25921c;

    /* renamed from: d */
    public int f25922d;

    /* renamed from: e */
    public int f25923e;

    /* renamed from: f */
    public String f25924f;

    /* renamed from: g */
    public int f25925g;

    public SocketState() {
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: a */
    public final JSONObject mo17273a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("channel_id", this.f25922d);
            jSONObject.put("type", this.f25919a);
            jSONObject.put("state", this.f25920b);
            jSONObject.put("url", this.f25921c);
            jSONObject.put("channel_type", this.f25923e);
            jSONObject.put("error", this.f25924f);
            jSONObject.put("error_code", this.f25925g);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SocketState{connectionType=");
        sb.append(this.f25919a);
        sb.append(", connectionState=");
        sb.append(this.f25920b);
        sb.append(", connectionUrl='");
        sb.append(this.f25921c);
        sb.append('\'');
        sb.append(", channelId=");
        sb.append(this.f25922d);
        sb.append(", channelType=");
        sb.append(this.f25923e);
        sb.append(", error='");
        sb.append(this.f25924f);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }

    protected SocketState(Parcel parcel) {
        this.f25919a = parcel.readInt();
        this.f25920b = parcel.readInt();
        this.f25921c = parcel.readString();
        this.f25922d = parcel.readInt();
        this.f25923e = parcel.readInt();
        this.f25924f = parcel.readString();
        this.f25925g = parcel.readInt();
    }

    /* renamed from: a */
    public static SocketState m18895a(JSONObject jSONObject) {
        SocketState socketState = new SocketState();
        socketState.f25922d = jSONObject.optInt("channel_id", DynamicTabYellowPointVersion.DEFAULT);
        socketState.f25919a = jSONObject.optInt("type", -1);
        socketState.f25920b = jSONObject.optInt("state", -1);
        socketState.f25921c = jSONObject.optString("url", "");
        socketState.f25923e = jSONObject.optInt("channel_type");
        socketState.f25924f = jSONObject.optString("error", "");
        socketState.f25925g = jSONObject.optInt("error_code");
        return socketState;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f25919a);
        parcel.writeInt(this.f25920b);
        parcel.writeString(this.f25921c);
        parcel.writeInt(this.f25922d);
        parcel.writeInt(this.f25923e);
        parcel.writeString(this.f25924f);
        parcel.writeInt(this.f25925g);
    }
}
