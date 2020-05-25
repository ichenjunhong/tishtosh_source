package com.p683ss.android.ugc.aweme.tools;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.p1076a.C17952c;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.tools.ToolsUrlModel */
public class ToolsUrlModel implements Parcelable {
    public static final Creator<ToolsUrlModel> CREATOR = new Creator<ToolsUrlModel>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new ToolsUrlModel[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new ToolsUrlModel(parcel);
        }
    };
    @C17952c(mo34828a = "uri")

    /* renamed from: a */
    public String f118258a;
    @C17952c(mo34828a = "url_list")

    /* renamed from: b */
    public List<String> f118259b;

    public ToolsUrlModel() {
    }

    public int describeContents() {
        return 0;
    }

    public int hashCode() {
        return (this.f118258a.hashCode() * 31) + this.f118259b.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ToolsUrlModel{uri='");
        sb.append(this.f118258a);
        sb.append('\'');
        sb.append(", urlList=");
        sb.append(this.f118259b);
        sb.append('}');
        return sb.toString();
    }

    protected ToolsUrlModel(Parcel parcel) {
        this.f118258a = parcel.readString();
        this.f118259b = parcel.createStringArrayList();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ToolsUrlModel toolsUrlModel = (ToolsUrlModel) obj;
        if (!this.f118258a.equals(toolsUrlModel.f118258a)) {
            return false;
        }
        return this.f118259b.equals(toolsUrlModel.f118259b);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f118258a);
        parcel.writeStringList(this.f118259b);
    }
}
