package com.p683ss.android.ugc.aweme.sticker.data;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.p683ss.android.ugc.aweme.sharer.p2172b.C42311c;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.sticker.data.CreateAnchorInfo */
public final class CreateAnchorInfo implements Parcelable {
    public static final int ADD_FROM_EDIT = 1;
    public static final int ADD_FROM_PUBLISH = 2;
    public static final Creator CREATOR = new C45866b();
    public static final C45865a Companion = new C45865a(null);
    public static final String KEY_ADD_FROM = "add_from";
    public static final String KEY_ANCHORS = "anchors";
    private final String content;
    private final String keyword;
    private final String language;
    private final int type;
    private final String url;

    /* renamed from: com.ss.android.ugc.aweme.sticker.data.CreateAnchorInfo$a */
    public static final class C45865a {
        private C45865a() {
        }

        public /* synthetic */ C45865a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.data.CreateAnchorInfo$b */
    public static class C45866b implements Creator {
        public final Object createFromParcel(Parcel parcel) {
            C52711k.m112240b(parcel, "in");
            CreateAnchorInfo createAnchorInfo = new CreateAnchorInfo(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            return createAnchorInfo;
        }

        public final Object[] newArray(int i) {
            return new CreateAnchorInfo[i];
        }
    }

    public static /* synthetic */ CreateAnchorInfo copy$default(CreateAnchorInfo createAnchorInfo, int i, String str, String str2, String str3, String str4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = createAnchorInfo.type;
        }
        if ((i2 & 2) != 0) {
            str = createAnchorInfo.keyword;
        }
        String str5 = str;
        if ((i2 & 4) != 0) {
            str2 = createAnchorInfo.url;
        }
        String str6 = str2;
        if ((i2 & 8) != 0) {
            str3 = createAnchorInfo.language;
        }
        String str7 = str3;
        if ((i2 & 16) != 0) {
            str4 = createAnchorInfo.content;
        }
        return createAnchorInfo.copy(i, str5, str6, str7, str4);
    }

    public final int component1() {
        return this.type;
    }

    public final String component2() {
        return this.keyword;
    }

    public final String component3() {
        return this.url;
    }

    public final String component4() {
        return this.language;
    }

    public final String component5() {
        return this.content;
    }

    public final CreateAnchorInfo copy(int i, String str, String str2, String str3, String str4) {
        C52711k.m112240b(str, "keyword");
        C52711k.m112240b(str2, "url");
        C52711k.m112240b(str3, "language");
        C52711k.m112240b(str4, C42311c.f106865i);
        CreateAnchorInfo createAnchorInfo = new CreateAnchorInfo(i, str, str2, str3, str4);
        return createAnchorInfo;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CreateAnchorInfo) {
                CreateAnchorInfo createAnchorInfo = (CreateAnchorInfo) obj;
                if (!(this.type == createAnchorInfo.type) || !C52711k.m112239a((Object) this.keyword, (Object) createAnchorInfo.keyword) || !C52711k.m112239a((Object) this.url, (Object) createAnchorInfo.url) || !C52711k.m112239a((Object) this.language, (Object) createAnchorInfo.language) || !C52711k.m112239a((Object) this.content, (Object) createAnchorInfo.content)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String getContent() {
        return this.content;
    }

    public final String getKeyword() {
        return this.keyword;
    }

    public final String getLanguage() {
        return this.language;
    }

    public final int getType() {
        return this.type;
    }

    public final String getUrl() {
        return this.url;
    }

    public final int hashCode() {
        int i = this.type * 31;
        String str = this.keyword;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.url;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.language;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.content;
        if (str4 != null) {
            i2 = str4.hashCode();
        }
        return hashCode3 + i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CreateAnchorInfo(type=");
        sb.append(this.type);
        sb.append(", keyword=");
        sb.append(this.keyword);
        sb.append(", url=");
        sb.append(this.url);
        sb.append(", language=");
        sb.append(this.language);
        sb.append(", content=");
        sb.append(this.content);
        sb.append(")");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C52711k.m112240b(parcel, "parcel");
        parcel.writeInt(this.type);
        parcel.writeString(this.keyword);
        parcel.writeString(this.url);
        parcel.writeString(this.language);
        parcel.writeString(this.content);
    }

    public CreateAnchorInfo(int i, String str, String str2, String str3, String str4) {
        C52711k.m112240b(str, "keyword");
        C52711k.m112240b(str2, "url");
        C52711k.m112240b(str3, "language");
        C52711k.m112240b(str4, C42311c.f106865i);
        this.type = i;
        this.keyword = str;
        this.url = str2;
        this.language = str3;
        this.content = str4;
    }
}
