package com.p683ss.android.ugc.aweme.familiar;

import android.support.annotation.Keep;
import android.text.TextUtils;
import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import p2628d.p2629a.C52568f;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

@Keep
/* renamed from: com.ss.android.ugc.aweme.familiar.DuoshanUrlModel */
public final class DuoshanUrlModel implements Serializable {
    @C17952c(mo34828a = "file_hash")
    public final String fileHash;
    @C17952c(mo34828a = "height")
    public final int height;
    @C17952c(mo34828a = "data_size")
    public final long size;
    @C17952c(mo34828a = "uri")
    public String uri;
    @C17952c(mo34828a = "url_key")
    public final String urlKey;
    @C17952c(mo34828a = "url_list")
    public String[] urlList;
    @C17952c(mo34828a = "width")
    public final int width;

    public DuoshanUrlModel() {
        this(null, null, 0, 0, null, 0, null, 127, null);
    }

    private final int component3() {
        return this.width;
    }

    private final int component4() {
        return this.height;
    }

    private final String component5() {
        return this.urlKey;
    }

    private final long component6() {
        return this.size;
    }

    private final String component7() {
        return this.fileHash;
    }

    public static /* synthetic */ DuoshanUrlModel copy$default(DuoshanUrlModel duoshanUrlModel, String str, String[] strArr, int i, int i2, String str2, long j, String str3, int i3, Object obj) {
        DuoshanUrlModel duoshanUrlModel2 = duoshanUrlModel;
        return duoshanUrlModel.copy((i3 & 1) != 0 ? duoshanUrlModel2.uri : str, (i3 & 2) != 0 ? duoshanUrlModel2.urlList : strArr, (i3 & 4) != 0 ? duoshanUrlModel2.width : i, (i3 & 8) != 0 ? duoshanUrlModel2.height : i2, (i3 & 16) != 0 ? duoshanUrlModel2.urlKey : str2, (i3 & 32) != 0 ? duoshanUrlModel2.size : j, (i3 & 64) != 0 ? duoshanUrlModel2.fileHash : str3);
    }

    /* access modifiers changed from: protected */
    public final String component1() {
        return this.uri;
    }

    public final String[] component2() {
        return this.urlList;
    }

    public final DuoshanUrlModel copy(String str, String[] strArr, int i, int i2, String str2, long j, String str3) {
        DuoshanUrlModel duoshanUrlModel = new DuoshanUrlModel(str, strArr, i, i2, str2, j, str3);
        return duoshanUrlModel;
    }

    /* access modifiers changed from: protected */
    public final String getUri() {
        return this.uri;
    }

    public final String[] getUrlList() {
        return this.urlList;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DuoshanUrlModel(uri=");
        sb.append(this.uri);
        sb.append(", urlList=");
        sb.append(Arrays.toString(this.urlList));
        sb.append(", width=");
        sb.append(this.width);
        sb.append(", height=");
        sb.append(this.height);
        sb.append(", urlKey=");
        sb.append(this.urlKey);
        sb.append(", size=");
        sb.append(this.size);
        sb.append(", fileHash=");
        sb.append(this.fileHash);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        String str;
        int i;
        if (TextUtils.isEmpty(this.urlKey)) {
            str = this.uri;
        } else {
            str = this.urlKey;
        }
        int i2 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        if (this.urlList != null) {
            String[] strArr = this.urlList;
            if (strArr != null) {
                i2 = strArr.hashCode();
            }
        }
        return i3 + i2;
    }

    public final UrlModel toUrlModel() {
        List list;
        UrlModel urlModel = new UrlModel();
        urlModel.setUri(this.uri);
        String[] strArr = this.urlList;
        if (strArr != null) {
            list = C52568f.m112068a(strArr);
        } else {
            list = null;
        }
        urlModel.setUrlList(list);
        urlModel.setWidth(this.width);
        urlModel.setHeight(this.height);
        urlModel.setUrlKey(this.urlKey);
        urlModel.setSize(this.size);
        urlModel.setFileHash(this.fileHash);
        return urlModel;
    }

    /* access modifiers changed from: protected */
    public final void setUri(String str) {
        this.uri = str;
    }

    public final void setUrlList(String[] strArr) {
        this.urlList = strArr;
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UrlModel)) {
            return false;
        }
        UrlModel urlModel = (UrlModel) obj;
        if (this.uri != null) {
            z = !C52711k.m112239a((Object) this.uri, (Object) urlModel.getUri());
        } else if (urlModel.getUri() != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return false;
        }
        if (this.urlKey != null) {
            z2 = !C52711k.m112239a((Object) this.urlKey, (Object) urlModel.getUrlKey());
        } else if (urlModel.getUrlKey() != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            return false;
        }
        if (this.urlList != null) {
            return C52711k.m112239a((Object) this.urlList, (Object) urlModel.getUrlList());
        }
        if (urlModel.getUrlList() == null) {
            return true;
        }
        return false;
    }

    public DuoshanUrlModel(String str, String[] strArr, int i, int i2, String str2, long j, String str3) {
        this.uri = str;
        this.urlList = strArr;
        this.width = i;
        this.height = i2;
        this.urlKey = str2;
        this.size = j;
        this.fileHash = str3;
    }

    public /* synthetic */ DuoshanUrlModel(String str, String[] strArr, int i, int i2, String str2, long j, String str3, int i3, C52707g gVar) {
        String str4;
        String[] strArr2;
        int i4;
        String str5;
        long j2;
        String str6 = null;
        if ((i3 & 1) != 0) {
            str4 = null;
        } else {
            str4 = str;
        }
        if ((i3 & 2) != 0) {
            strArr2 = null;
        } else {
            strArr2 = strArr;
        }
        int i5 = 0;
        if ((i3 & 4) != 0) {
            i4 = 0;
        } else {
            i4 = i;
        }
        if ((i3 & 8) == 0) {
            i5 = i2;
        }
        if ((i3 & 16) != 0) {
            str5 = null;
        } else {
            str5 = str2;
        }
        if ((i3 & 32) != 0) {
            j2 = 0;
        } else {
            j2 = j;
        }
        if ((i3 & 64) == 0) {
            str6 = str3;
        }
        this(str4, strArr2, i4, i5, str5, j2, str6);
    }
}
