package com.p683ss.android.ugc.aweme.poi.model;

import com.bytedance.common.utility.p522b.C9376b;
import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.poi.model.ag */
public final class C39101ag implements Serializable {
    @C17952c(mo34828a = "pic_large")
    public UrlModel picLarge;
    @C17952c(mo34828a = "pic_medium")
    public UrlModel picMedium;
    @C17952c(mo34828a = "tag_list")
    public List<C39113as> poiTagList;
    @C17952c(mo34828a = "title")
    public String title;
    @C17952c(mo34828a = "upload_image_watermark")
    public String uploadImageWaterMark;

    public final UrlModel getPicMedium() {
        return this.picMedium;
    }

    public final String getLarge() {
        return (String) this.picLarge.getUrlList().get(0);
    }

    public final String getMedium() {
        return (String) this.picMedium.getUrlList().get(0);
    }

    public final String getTagName() {
        if (C9376b.m18558a((Collection<T>) this.poiTagList)) {
            return "";
        }
        return ((C39113as) this.poiTagList.get(0)).f99780a;
    }

    public final int getTagType() {
        if (C9376b.m18558a((Collection<T>) this.poiTagList)) {
            return 0;
        }
        return ((C39113as) this.poiTagList.get(0)).f99781b;
    }
}
