package com.bytedance.android.livesdk.chatroom.p310f;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import com.bytedance.android.live.base.model.feed.C2974a;
import com.bytedance.android.live.base.model.feed.FeedItem;
import com.bytedance.android.live.core.p224c.C3831a;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.p399o.C8049c;
import com.bytedance.android.livesdkapi.C8830k;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.p450h.C8750a;
import com.bytedance.common.utility.C9414h;
import com.bytedance.common.utility.C9431p;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.chatroom.f.j */
public final class C5225j {

    /* renamed from: a */
    public static boolean f13949a;

    /* renamed from: b */
    public static int f13950b;

    /* renamed from: a */
    static void m11846a(FeedItem feedItem) {
        if (feedItem == null) {
            return;
        }
        if ((feedItem.type == 1 || feedItem.type == 2) && (feedItem.item instanceof Room)) {
            Room room = (Room) feedItem.item;
            room.setLog_pb(feedItem.logPb);
            if (room.getOwner() != null) {
                room.getOwner().setLogPb(feedItem.logPb);
            }
            room.setRequestId(feedItem.resId);
        }
    }

    /* renamed from: a */
    static void m11847a(List<FeedItem> list) {
        if (!C9414h.m18630a(list)) {
            for (FeedItem feedItem : list) {
                if (feedItem != null && feedItem.item == null) {
                    try {
                        feedItem.item = feedItem.getRoom();
                    } catch (Exception unused) {
                    }
                }
            }
        }
    }

    /* renamed from: a */
    static void m11844a(long j, long j2) {
        if (((Integer) LiveSettingKeys.LIVE_NEW_FEED_FIRST_FRAME_OPTIMIZE.mo9431a()).intValue() == 1) {
            Bundle bundle = new Bundle();
            bundle.putLong("live.intent.extra.LOADING_SHOW", 0);
            bundle.putLong("live.intent.extra.ROOM_ID", -4);
            TTLiveSDKContext.getHostService().mo10314g().mo15568a(C8830k.m17331e().mo13039a().context(), -4, bundle);
        }
    }

    /* renamed from: a */
    private static Bundle m11842a(FeedItem feedItem, C2974a aVar) {
        String str = null;
        if (feedItem == null || feedItem.item == null || !(feedItem.item instanceof Room)) {
            return null;
        }
        Bundle a = C8750a.m17218a((Room) feedItem.item);
        if (aVar != null) {
            try {
                a.putString("live.intent.extra.LOG_PB", String.valueOf(aVar.mo7693a()));
                a.putString("log_pb", String.valueOf(aVar.mo7693a()));
                if (TextUtils.isEmpty(aVar.f8717g) && !TextUtils.isEmpty(String.valueOf(aVar.mo7693a()))) {
                    aVar.f8717g = new JSONObject(aVar.mo7693a().toString()).getString("impr_id");
                }
                a.putString("live.intent.extra.REQUEST_ID", aVar.f8717g);
                a.putString("request_id", aVar.f8717g);
                String str2 = "enter_from_merge_recommend";
                if (feedItem.isRecommendCard) {
                    str = "pop_card";
                }
                a.putString(str2, str);
            } catch (Exception e) {
                C3831a.m9714b("NewFeedStyleEntranceUtils", (Throwable) e);
            }
        }
        return a;
    }

    /* renamed from: a */
    static void m11845a(long j, Bundle bundle) {
        HashMap hashMap = new HashMap();
        if (j > 0 && bundle != null) {
            hashMap.put("duration", String.valueOf(SystemClock.elapsedRealtime() - j));
            hashMap.put("enter_from_merge", "live_merge");
            hashMap.put("enter_method", "live_cover");
            hashMap.put("anchor_id", String.valueOf(bundle.getLong("anchor_id", 0)));
            hashMap.put("room_id", String.valueOf(bundle.getLong("live.intent.extra.ROOM_ID", 0)));
            hashMap.put("request_id", bundle.getString("live.intent.extra.REQUEST_ID", ""));
            hashMap.put("action_type", "click");
            hashMap.put("live_window_mode", "full_screen");
            hashMap.put("log_pb", bundle.getString("live.intent.extra.LOG_PB", ""));
            C8049c.m15979a().mo14202a("livesdk_new_style_feed_duration", hashMap, new Object[0]);
        }
    }

    /* renamed from: a */
    static Bundle m11843a(List<FeedItem> list, C2974a aVar, String str, long j, Map<String, String> map) {
        Bundle bundle;
        FeedItem feedItem = (FeedItem) list.get(0);
        boolean z = ((FeedItem) list.get(0)).isRecommendCard;
        String str2 = null;
        if (feedItem == null || feedItem.item == null || !(feedItem.item instanceof Room)) {
            bundle = null;
        } else {
            bundle = m11842a(feedItem, aVar);
        }
        if (bundle == null) {
            return new Bundle();
        }
        bundle.putString("live.intent.extra.FEED_URL", str);
        bundle.putBoolean("live.intent.extra.FROM_NEW_STYLE", true);
        bundle.putString("enter_from_live_source", "live_square");
        bundle.putString("live.intent.extra.WINDOW_MODE", "full_screen");
        bundle.putLong("live.intent.extra.LOAD_DURATION", j);
        bundle.putString("enter_from_merge", "live_merge");
        bundle.putString("enter_method", "live_cover");
        String str3 = "enter_from_merge_recommend";
        if (z) {
            str2 = "pop_card";
        }
        bundle.putString(str3, str2);
        Bundle bundle2 = new Bundle();
        bundle2.putAll(bundle);
        if (map != null && map.containsKey("enter_from_merge")) {
            bundle2.putString("enter_from_merge", (String) map.get("enter_from_merge"));
            map.remove("enter_from_merge");
        }
        bundle.putBundle("live.intent.extra.ENTER_LIVE_EXTRA", bundle2);
        SparseArray sparseArray = new SparseArray(list.size());
        int size = list.size();
        for (int i = 1; i < size; i++) {
            Bundle a = m11842a((FeedItem) list.get(i), aVar);
            if (a != null) {
                sparseArray.put(i, a);
            }
        }
        bundle.putSparseParcelableArray("live.intent.extra.MORE_BUNDLE", sparseArray);
        if (aVar != null) {
            bundle.putBoolean("live.intent.extra.HAS_MORE", aVar.hasMore);
            bundle.putLong("live.intent.extra.MAX_TIME", aVar.f8715e);
            bundle.putString("live.intent.extra.UNREAD_ID", aVar.f8713c);
        }
        if (map != null && !map.isEmpty()) {
            for (String str4 : map.keySet()) {
                if (!C9431p.m18664a(str4)) {
                    bundle2.putString(str4, (String) map.get(str4));
                }
            }
        }
        return bundle;
    }
}
