package com.bytedance.android.live.base.model.feed;

import android.text.TextUtils;
import android.util.Base64;
import com.bytedance.android.live.C2942b;
import com.bytedance.android.live.base.model.C2963b;
import com.bytedance.android.live.base.model.C2973f;
import com.bytedance.android.live.base.model.banner.C2965a;
import com.bytedance.android.live.base.model.banner.C2966b;
import com.bytedance.android.live.base.model.banner.C2967c;
import com.bytedance.android.livesdkapi.depend.model.live.C8706l;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.google.gson.C18082l;
import com.google.gson.C18085o;
import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ttve.nativePort.TEVideoRecorder;
import java.util.Arrays;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public class FeedItem {
    public transient JSONObject adJSONObject;
    @C17952c(mo34828a = "ad")
    public String adRawString;
    @C17952c(mo34828a = "banner")
    public C2966b bannerContainer;
    public transient List<C2965a> banners;
    @C17952c(mo34828a = "cate_cell")
    public C2963b cateCell;
    @C17952c(mo34828a = "data")
    C18085o data;
    @C17952c(mo34828a = "is_recommend_card")
    public boolean isRecommendCard;
    public transient C2973f item;
    public transient String logPb;
    public transient Object object;
    @C17952c(mo34828a = "order_type")
    public int orderType;
    @C17952c(mo34828a = "rank_round_banner")
    public C2967c rankRoundBanner;
    public transient boolean repeatDisable;
    @C17952c(mo34828a = "rid")
    public String resId;
    transient Room room;
    public transient String searchId = "";
    public transient String searchReqId = "";
    @C17952c(mo34828a = "tags")
    public List<String> tags;
    @C17952c(mo34828a = "type")
    public int type;

    public C2973f item() {
        return this.item;
    }

    public String logPb() {
        return this.logPb;
    }

    public String requestId() {
        return this.resId;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.item});
    }

    public String toString() {
        if (this.item == null) {
            return TEVideoRecorder.FACE_BEAUTY_NULL;
        }
        return this.item.toString();
    }

    public Room getRoom() {
        if (this.room != null) {
            return this.room;
        }
        this.room = (Room) C2942b.m8369a().mo34881a((C18082l) this.data, Room.class);
        return this.room;
    }

    public void init() {
        if (this.type == 1 || this.type == 2 || this.type == 4 || this.type == 5) {
            this.item = getRoom();
            return;
        }
        if (this.type == 3) {
            try {
                String str = new String(Base64.decode(this.adRawString, 1));
                if (!TextUtils.isEmpty(str)) {
                    this.adJSONObject = new JSONObject(str);
                    this.item = (C2973f) C2942b.m8369a().mo34884a(str, C8706l.class);
                    long currentTimeMillis = System.currentTimeMillis();
                    ((C8706l) this.item).f23858K = currentTimeMillis;
                    this.adJSONObject.put("subId", currentTimeMillis);
                }
            } catch (JSONException unused) {
            }
        }
    }

    public void setRoom(Room room2) {
        this.room = room2;
    }

    public void setRoomFrom(FeedItem feedItem) {
        this.data = feedItem.data;
        this.room = feedItem.room;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FeedItem feedItem = (FeedItem) obj;
        C2973f fVar = this.item;
        C2973f fVar2 = feedItem.item;
        if (fVar == fVar2 || (fVar != null && fVar.equals(fVar2))) {
            return true;
        }
        return false;
    }

    public static FeedItem create(int i, C2973f fVar) {
        FeedItem feedItem = new FeedItem();
        feedItem.type = i;
        feedItem.item = fVar;
        return feedItem;
    }

    public static FeedItem create(int i, C2973f fVar, String str, String str2) {
        FeedItem feedItem = new FeedItem();
        feedItem.type = i;
        feedItem.item = fVar;
        feedItem.logPb = str;
        feedItem.resId = str2;
        return feedItem;
    }
}
