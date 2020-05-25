package com.p683ss.android.ugc.aweme.feed.model.live;

import android.text.TextUtils;
import com.google.gson.p1076a.C17952c;
import java.io.Serializable;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.feed.model.live.LiveImageModel */
public class LiveImageModel implements Serializable {
    @C17952c(mo34828a = "avg_color")
    public String avgColor;
    @C17952c(mo34828a = "height")
    private int height;
    @C17952c(mo34828a = "image_type")
    private int imageType;
    @C17952c(mo34828a = "open_web_url")
    private String schema;
    @C17952c(mo34828a = "uri")
    protected String uri;
    @C17952c(mo34828a = "url_list")
    protected List<String> urlList;
    @C17952c(mo34828a = "width")
    private int width;

    public String getAvgColor() {
        return this.avgColor;
    }

    public int getHeight() {
        return this.height;
    }

    public int getImageType() {
        return this.imageType;
    }

    public String getSchema() {
        return this.schema;
    }

    public String getUri() {
        return this.uri;
    }

    public List<String> getUrlList() {
        return this.urlList;
    }

    public int getWidth() {
        return this.width;
    }

    public boolean isValid() {
        if (!TextUtils.isEmpty(this.uri) || (this.urlList != null && !this.urlList.isEmpty())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return hash(this.avgColor, this.uri, this.urlList, Integer.valueOf(this.width), Integer.valueOf(this.height));
    }

    public void setAvgColor(String str) {
        this.avgColor = str;
    }

    public void setHeight(int i) {
        this.height = i;
    }

    public void setImageType(int i) {
        this.imageType = i;
    }

    public void setSchema(String str) {
        this.schema = str;
    }

    public void setUri(String str) {
        this.uri = str;
    }

    public void setUrlList(List<String> list) {
        this.urlList = list;
    }

    public void setWidth(int i) {
        this.width = i;
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

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LiveImageModel liveImageModel = (LiveImageModel) obj;
        if (this.width != liveImageModel.width || this.height != liveImageModel.height || !equals(this.avgColor, liveImageModel.avgColor) || !equals(this.uri, liveImageModel.uri) || !equals(this.urlList, liveImageModel.urlList)) {
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
}
