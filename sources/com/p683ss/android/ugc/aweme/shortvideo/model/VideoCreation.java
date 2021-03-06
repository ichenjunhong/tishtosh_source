package com.p683ss.android.ugc.aweme.shortvideo.model;

import com.bytedance.common.utility.p522b.C9376b;
import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.model.VideoCreation */
public class VideoCreation extends BaseResponse {
    public String mCoverUri;
    public UploadUrlBean mCurrentUrl;
    @C17952c(mo34828a = "material_id")
    public String materialId;
    private int position;
    @C17952c(mo34828a = "upload_url")
    public String uploadUrl;
    @C17952c(mo34828a = "url_list")
    public List<UploadUrlBean> uploadUrllistBean;
    public int videoHeight;
    public int videoWidth;

    public boolean hasNext() {
        if (this.position < this.uploadUrllistBean.size()) {
            return true;
        }
        return false;
    }

    public UploadUrlBean getCurrentUrl() {
        if (!C9376b.m18558a((Collection<T>) this.uploadUrllistBean)) {
            this.mCurrentUrl = (UploadUrlBean) this.uploadUrllistBean.get(0);
        }
        return this.mCurrentUrl;
    }

    public UploadUrlBean nextUrl() {
        if (C9376b.m18558a((Collection<T>) this.uploadUrllistBean)) {
            return null;
        }
        List<UploadUrlBean> list = this.uploadUrllistBean;
        int i = this.position + 1;
        this.position = i;
        this.mCurrentUrl = (UploadUrlBean) list.get(i % this.uploadUrllistBean.size());
        return this.mCurrentUrl;
    }

    public VideoCreation setCoverUri(String str) {
        this.mCoverUri = str;
        return this;
    }

    public VideoCreation setMaterialId(String str) {
        this.materialId = str;
        return this;
    }

    public VideoCreation setVideoHeight(int i) {
        this.videoHeight = i;
        return this;
    }

    public VideoCreation setVideoWidth(int i) {
        this.videoWidth = i;
        return this;
    }
}
