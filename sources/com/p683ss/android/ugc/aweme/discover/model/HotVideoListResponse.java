package com.p683ss.android.ugc.aweme.discover.model;

import com.bytedance.common.utility.p522b.C9376b;
import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.app.api.C22982e;
import com.p683ss.android.ugc.aweme.awemeservice.C23325e;
import com.p683ss.android.ugc.aweme.awemeservice.api.IRequestIdService;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import com.p683ss.android.ugc.aweme.base.share.ShareInfo;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.discover.model.HotVideoListResponse */
public class HotVideoListResponse extends BaseResponse implements C22982e {
    @C17952c(mo34828a = "active_time")
    public String lastUpdateTime;
    @C17952c(mo34828a = "log_pb")
    public LogPbBean logPb;
    @C17952c(mo34828a = "aweme_list")
    public List<HotVideoItem> mHotVideoItemList;
    private String requestId;
    @C17952c(mo34828a = "share_info")
    public ShareInfo shareInfo;

    public String getRequestId() {
        return this.requestId;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("HotVideoListResponse{mHotVideoItemList=");
        sb.append(this.mHotVideoItemList);
        sb.append(", lastUpdateTime='");
        sb.append(this.lastUpdateTime);
        sb.append('\'');
        sb.append(", logPb=");
        sb.append(this.logPb);
        sb.append('}');
        return sb.toString();
    }

    public void setRequestId(String str) {
        this.requestId = str;
        if (!C9376b.m18558a((Collection<T>) this.mHotVideoItemList)) {
            for (int i = 0; i < this.mHotVideoItemList.size(); i++) {
                HotVideoItem hotVideoItem = (HotVideoItem) this.mHotVideoItemList.get(i);
                if (hotVideoItem != null) {
                    Aweme aweme = hotVideoItem.getAweme();
                    if (aweme != null) {
                        aweme.setRequestId(str);
                        IRequestIdService a = C23325e.m57379a();
                        StringBuilder sb = new StringBuilder();
                        sb.append(aweme.getAid());
                        sb.append(13);
                        a.setRequestIdAndIndex(sb.toString(), str, i);
                    }
                }
            }
        }
    }
}
