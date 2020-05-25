package com.p683ss.android.ugc.aweme.discover.model;

import android.text.TextUtils;
import com.bytedance.common.utility.p522b.C9376b;
import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.base.share.ShareInfo;
import com.p683ss.android.ugc.aweme.feed.model.LogPbBean;
import com.p683ss.android.ugc.aweme.p1323ae.p1325b.C22468a;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.discover.model.HotSearchMusicListResponse */
public class HotSearchMusicListResponse extends BaseResponse {
    @C17952c(mo34828a = "banner_url")
    public UrlModel bannerUrl;
    @C17952c(mo34828a = "active_time")
    public String lastUpdateTime;
    @C17952c(mo34828a = "music_list")
    public List<HotSearchMusicItem> list;
    @C17952c(mo34828a = "log_pb")
    public LogPbBean logPb;
    @C17952c(mo34828a = "share_info")
    public ShareInfo shareInfo;
    @C17952c(mo34828a = "weekly_bill_info")
    public C22468a weeklyBillInfo;

    public boolean isValid() {
        if (C9376b.m18558a((Collection<T>) this.list) || TextUtils.isEmpty(this.lastUpdateTime)) {
            return false;
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("HotSearchMusicListResponse{list=");
        sb.append(this.list);
        sb.append(", lastUpdateTime='");
        sb.append(this.lastUpdateTime);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }

    public void setEditionUid(String str) {
        if (!C9376b.m18558a((Collection<T>) this.list)) {
            for (HotSearchMusicItem hotSearchMusicItem : this.list) {
                hotSearchMusicItem.mEditionUid = str;
            }
        }
    }
}
