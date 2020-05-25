package com.p683ss.android.ugc.aweme.feed.model;

import android.text.TextUtils;
import com.bytedance.common.utility.p522b.C9376b;
import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.app.api.C22982e;
import com.p683ss.android.ugc.aweme.app.api.p1367c.C22978d;
import com.p683ss.android.ugc.aweme.feed.model.NearbyCities.CityBean;
import com.p683ss.android.ugc.aweme.feed.model.poi.PoiClassInfoStruct;
import com.p683ss.android.ugc.aweme.feed.model.poi.PoiOpTabStruct;
import com.p683ss.android.ugc.aweme.poi.model.C39098ad;
import com.p683ss.android.ugc.aweme.poi.model.C39108an;
import com.p683ss.android.ugc.aweme.profile.jedi.aweme.C39937k;
import com.p683ss.ugc.aweme.proto.aweme_v2_feed_response;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.feed.model.FeedItemList */
public class FeedItemList implements C22978d, C22982e, IFeedItemList {
    public volatile boolean appendCache;
    @C17952c(mo34828a = "block_code")
    public int blockCode;
    public String cityCode;
    @C17952c(mo34828a = "current_city")
    public CityBean currentCity;
    @C17952c(mo34828a = "cursor")
    public long cursor;
    @C17952c(mo34828a = "enable_re_rank")
    public boolean enableReRank;
    @C17952c(mo34828a = "error_code")
    public int error_code;
    @C17952c(mo34828a = "extra")
    public Extra extra;
    public int fetchType;
    @C17952c(mo34828a = "has_more")
    public int hasMore;
    @C17952c(mo34828a = "is_hiding_invalid_item")
    public int hidingInvalidItem;
    @C17952c(mo34828a = "guide_word")
    public HotSearchGuideWord hotSearchGuideWord;
    @C17952c(mo34828a = "hotsoon_text")
    public String hotSoonText;
    @C17952c(mo34828a = "hotsoon_filtered_count")
    public int hotsoonFilteredCount;
    @C17952c(mo34828a = "hotsoon_has_more")
    public int hotsoonHasMore;
    @C17952c(mo34828a = "invalid_item_count")
    public int invalidItemCount;
    @C17952c(mo34828a = "invalid_item_text")
    public String invalidItemText;
    public boolean isFromLocalCache;
    @C17952c(mo34828a = "aweme_list")
    public List<Aweme> items;
    public Map<String, String> localExtra = new HashMap();
    @C17952c(mo34828a = "log_pb")
    public LogPbBean logPb;
    @C17952c(mo34828a = "max_cursor", mo34829b = {"max_time"})
    public long maxCursor;
    @C17952c(mo34828a = "min_cursor", mo34829b = {"min_time"})
    public long minCursor;
    public transient Long networkInfoKey;
    public transient aweme_v2_feed_response pbData;
    @C17952c(mo34828a = "poi_class_info_list")
    public List<PoiClassInfoStruct> poiClassInfoStructList;
    @C17952c(mo34828a = "poi_op_card_list")
    public List<C39098ad> poiOpCardStructs;
    @C17952c(mo34828a = "poi_op_tab_list")
    public List<PoiOpTabStruct> poiOpTabStructs;
    @C17952c(mo34828a = "poi_rank_card_list")
    public List<C39108an> poiRankCardStructs;
    @C17952c(mo34828a = "preload_ads")
    public List<Aweme> preloadAds;
    @C17952c(mo34828a = "preload_awemes")
    public List<Aweme> preloadAwemes;
    @C17952c(mo34828a = "refresh_clear")
    public int refreshClear;
    public volatile boolean replaceFake;
    @C17952c(mo34828a = "rid")
    public String requestId;
    @C17952c(mo34828a = "status_code")
    public int status_code;
    @C17952c(mo34828a = "status_msg")
    public String status_msg;

    public List<Aweme> getItems() {
        return this.items;
    }

    public Long getNetworkInfoKey() {
        return this.networkInfoKey;
    }

    public String getRequestId() {
        return this.requestId;
    }

    public void setReplaceFake() {
        this.replaceFake = true;
    }

    public boolean isHasMore() {
        if (this.hasMore == 1) {
            return true;
        }
        return false;
    }

    public boolean isRefreshClear() {
        if (this.refreshClear == 1) {
            return true;
        }
        return false;
    }

    public void resetForceAppend() {
        this.replaceFake = false;
        this.appendCache = false;
    }

    public boolean isForceAppend() {
        if (this.replaceFake || this.appendCache) {
            return true;
        }
        return false;
    }

    public int size() {
        if (C9376b.m18558a((Collection<T>) this.items)) {
            return 0;
        }
        return this.items.size();
    }

    public FeedItemList clone() {
        FeedItemList feedItemList = new FeedItemList();
        feedItemList.minCursor = this.minCursor;
        feedItemList.maxCursor = this.maxCursor;
        feedItemList.cursor = this.cursor;
        feedItemList.hasMore = this.hasMore;
        feedItemList.items = C39937k.m88679a(this.items);
        feedItemList.requestId = this.requestId;
        feedItemList.refreshClear = this.refreshClear;
        feedItemList.extra = this.extra;
        feedItemList.status_code = this.status_code;
        feedItemList.status_msg = this.status_msg;
        feedItemList.error_code = this.error_code;
        feedItemList.currentCity = this.currentCity;
        feedItemList.poiClassInfoStructList = this.poiClassInfoStructList;
        feedItemList.poiOpTabStructs = this.poiOpTabStructs;
        feedItemList.poiRankCardStructs = this.poiRankCardStructs;
        feedItemList.poiOpCardStructs = this.poiOpCardStructs;
        feedItemList.blockCode = this.blockCode;
        feedItemList.hotSearchGuideWord = this.hotSearchGuideWord;
        feedItemList.preloadAds = this.preloadAds;
        feedItemList.fetchType = this.fetchType;
        feedItemList.replaceFake = this.replaceFake;
        feedItemList.appendCache = this.appendCache;
        feedItemList.localExtra = this.localExtra;
        feedItemList.isFromLocalCache = this.isFromLocalCache;
        feedItemList.logPb = this.logPb;
        feedItemList.cityCode = this.cityCode;
        feedItemList.invalidItemCount = this.invalidItemCount;
        feedItemList.hidingInvalidItem = this.hidingInvalidItem;
        feedItemList.invalidItemText = this.invalidItemText;
        return feedItemList;
    }

    public void setNetworkInfoKey(Long l) {
        this.networkInfoKey = l;
    }

    public void setRequestId(String str) {
        this.requestId = str;
    }

    public boolean isCurrentCity(String str) {
        if (TextUtils.isEmpty(this.cityCode)) {
            return false;
        }
        return this.cityCode.equalsIgnoreCase(str);
    }

    public void setCityCode(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.cityCode = str;
        } else if (this.currentCity != null) {
            this.cityCode = this.currentCity.code;
        }
    }

    public void setLocalExtra(String str, String str2) {
        this.localExtra.put(str, str2);
    }
}
