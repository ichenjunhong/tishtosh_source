package com.p683ss.android.ugc.aweme.shortvideo;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import com.p683ss.android.ugc.aweme.shortvideo.model.AVUploadSaveModel;
import com.p683ss.android.ugc.aweme.video.C48016e;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.al */
public class C42421al extends BaseResponse {
    @C17952c(mo34828a = "save_model")
    public AVUploadSaveModel mSaveModel;
    public transient String materialId;
    @C17952c(mo34828a = "open_platform_name")
    public String openPlatformName;
    public String videoCoverPath;

    public String getVideoCoverPath() {
        if (C48016e.m103944b(this.videoCoverPath)) {
            return this.videoCoverPath;
        }
        return null;
    }
}
