package com.p683ss.android.ugc.aweme.feed.model;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.feed.model.PrivateUrlModel */
public class PrivateUrlModel extends BaseResponse {
    @C17952c(mo34828a = "hybrid_label")
    public List<AwemeHybridLabelModel> hybridLabels;
    @C17952c(mo34828a = "label_private")
    public UrlModel labelPrivate;
    @C17952c(mo34828a = "video_text")
    public List<AwemeTextLabelModel> textVideoLabels;
}
