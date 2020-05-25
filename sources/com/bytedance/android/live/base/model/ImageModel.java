package com.bytedance.android.live.base.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.bytedance.android.live.C2942b;
import com.google.gson.p1076a.C17952c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONObject;

public class ImageModel implements Parcelable {
    public static final Creator<ImageModel> CREATOR = new Creator<ImageModel>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new ImageModel[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new ImageModel(parcel);
        }
    };
    private static final int HASH_CODE_31 = 31;
    @C17952c(mo34828a = "avg_color")
    public String avgColor;
    @C17952c(mo34828a = "content")
    Content content;
    @C17952c(mo34828a = "height")
    public int height;
    @C17952c(mo34828a = "image_type")
    int imageType;
    @C17952c(mo34828a = "is_animated")
    boolean isAnimated;
    private boolean isFeedCandidate;
    private boolean isLoaded;
    private boolean isMonitored;
    @C17952c(mo34828a = "uri")
    public String mUri;
    @C17952c(mo34828a = "url_list")
    public List<String> mUrls = new ArrayList();
    @C17952c(mo34828a = "open_web_url")
    public String schema;
    @C17952c(mo34828a = "width")
    public int width;

    public static class Content implements Parcelable {
        public static final Creator<Content> CREATOR = new Creator<Content>() {
            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new Content[i];
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new Content(parcel);
            }
        };
        @C17952c(mo34828a = "name")

        /* renamed from: a */
        public String f8664a;
        @C17952c(mo34828a = "font_color")

        /* renamed from: b */
        public String f8665b;
        @C17952c(mo34828a = "level")

        /* renamed from: c */
        public long f8666c;

        public Content() {
        }

        public int describeContents() {
            return 0;
        }

        protected Content(Parcel parcel) {
            this.f8664a = parcel.readString();
            this.f8665b = parcel.readString();
            this.f8666c = parcel.readLong();
        }

        /* renamed from: a */
        public static boolean m8382a(Content content) {
            if (content == null || TextUtils.isEmpty(content.f8664a) || TextUtils.isEmpty(content.f8665b)) {
                return false;
            }
            return true;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f8664a);
            parcel.writeString(this.f8665b);
            parcel.writeLong(this.f8666c);
        }
    }

    public int describeContents() {
        return 0;
    }

    public String getAvgColor() {
        return this.avgColor;
    }

    public int getHeight() {
        return this.height;
    }

    @C17952c(mo34828a = "content")
    public Content getImageContent() {
        return this.content;
    }

    @C17952c(mo34828a = "image_type")
    public int getImageType() {
        return this.imageType;
    }

    @C17952c(mo34828a = "open_web_url")
    public String getSchema() {
        return this.schema;
    }

    @C17952c(mo34828a = "uri")
    public String getUri() {
        return this.mUri;
    }

    @C17952c(mo34828a = "url_list")
    public List<String> getUrls() {
        return this.mUrls;
    }

    public int getWidth() {
        return this.width;
    }

    @C17952c(mo34828a = "is_animated")
    public boolean isAnimated() {
        return this.isAnimated;
    }

    public boolean isFeedCandidate() {
        return this.isFeedCandidate;
    }

    public boolean isLoaded() {
        return this.isLoaded;
    }

    public boolean isMonitored() {
        return this.isMonitored;
    }

    public ImageModel() {
    }

    public int hashCode() {
        return hash(this.avgColor, this.mUri, this.mUrls, Integer.valueOf(this.width), Integer.valueOf(this.height));
    }

    public String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder();
        sb.append("{\"uri\":");
        sb.append("\"");
        if (this.mUri == null) {
            str = "";
        } else {
            str = this.mUri;
        }
        sb.append(str);
        sb.append("\",\"image_type\":\"");
        if (this.schema == null) {
            str2 = "";
        } else {
            str2 = this.schema;
        }
        sb.append(str2);
        sb.append("\",\"url_list\":[");
        if (this.mUrls != null) {
            int size = this.mUrls.size();
            for (int i = 0; i < size; i++) {
                sb.append("\"");
                sb.append((String) this.mUrls.get(i));
                sb.append("\"");
                if (i != size - 1) {
                    sb.append(",");
                }
            }
        }
        sb.append("]}");
        return sb.toString();
    }

    @C17952c(mo34828a = "is_animated")
    public void setAnimated(boolean z) {
        this.isAnimated = z;
    }

    public void setAvgColor(String str) {
        this.avgColor = str;
    }

    @C17952c(mo34828a = "content")
    public void setContent(Content content2) {
        this.content = content2;
    }

    public void setFeedCandidate(boolean z) {
        this.isFeedCandidate = z;
    }

    public void setHeight(int i) {
        this.height = i;
    }

    @C17952c(mo34828a = "image_type")
    public void setImageType(int i) {
        this.imageType = i;
    }

    public void setLoaded(boolean z) {
        this.isLoaded = z;
    }

    public void setMonitored(boolean z) {
        this.isMonitored = z;
    }

    @C17952c(mo34828a = "open_web_url")
    public void setSchema(String str) {
        this.schema = str;
    }

    @C17952c(mo34828a = "uri")
    public void setUri(String str) {
        this.mUri = str;
    }

    @C17952c(mo34828a = "url_list")
    public void setUrls(List<String> list) {
        this.mUrls = list;
    }

    public void setWidth(int i) {
        this.width = i;
    }

    public static ImageModel fromJson(String str) {
        return (ImageModel) C2942b.m8369a().mo34884a(str, ImageModel.class);
    }

    public static ImageModel genBy(String str) {
        ImageModel imageModel = new ImageModel();
        imageModel.setUrls(Collections.singletonList(str));
        return imageModel;
    }

    public static String toJsonString(ImageModel imageModel) {
        if (imageModel == null) {
            return "";
        }
        return C2942b.m8369a().mo34889b(imageModel);
    }

    public static ImageModel fromJson(JSONObject jSONObject) {
        return (ImageModel) C2942b.m8369a().mo34884a(jSONObject.toString(), ImageModel.class);
    }

    private static int hash(Object... objArr) {
        int i;
        if (objArr == null) {
            return 0;
        }
        int i2 = 1;
        for (Object obj : objArr) {
            int i3 = i2 * 31;
            if (obj == null) {
                i = 0;
            } else {
                i = obj.hashCode();
            }
            i2 = i3 + i;
        }
        return i2;
    }

    protected ImageModel(Parcel parcel) {
        boolean z;
        boolean z2;
        boolean z3;
        this.mUri = parcel.readString();
        this.mUrls = parcel.createStringArrayList();
        this.width = parcel.readInt();
        this.height = parcel.readInt();
        this.schema = parcel.readString();
        this.imageType = parcel.readInt();
        this.content = (Content) parcel.readParcelable(Content.class.getClassLoader());
        boolean z4 = false;
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.isAnimated = z;
        if (parcel.readByte() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.isLoaded = z2;
        if (parcel.readByte() != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.isMonitored = z3;
        if (parcel.readByte() != 0) {
            z4 = true;
        }
        this.isFeedCandidate = z4;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ImageModel imageModel = (ImageModel) obj;
        if (this.width != imageModel.width || this.height != imageModel.height || !equals(this.avgColor, imageModel.avgColor) || !equals(this.mUri, imageModel.mUri) || !equals(this.mUrls, imageModel.mUrls)) {
            return false;
        }
        return true;
    }

    private static boolean equals(Object obj, Object obj2) {
        if (obj == obj2 || (obj != null && obj.equals(obj2))) {
            return true;
        }
        return false;
    }

    public ImageModel(String str, List<String> list) {
        this.mUri = str;
        this.mUrls = list;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mUri);
        parcel.writeStringList(this.mUrls);
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
        parcel.writeString(this.schema);
        parcel.writeInt(this.imageType);
        parcel.writeParcelable(this.content, i);
        parcel.writeByte(this.isAnimated ? (byte) 1 : 0);
        parcel.writeByte(this.isLoaded ? (byte) 1 : 0);
        parcel.writeByte(this.isMonitored ? (byte) 1 : 0);
        parcel.writeByte(this.isFeedCandidate ? (byte) 1 : 0);
    }

    public ImageModel(String str, List<String> list, String str2) {
        this.mUri = str;
        this.mUrls = list;
        this.schema = str2;
    }
}
