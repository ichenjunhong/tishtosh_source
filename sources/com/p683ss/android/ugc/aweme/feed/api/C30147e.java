package com.p683ss.android.ugc.aweme.feed.api;

import com.p683ss.android.ugc.aweme.commercialize.model.C26138s;
import com.p683ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p683ss.android.ugc.aweme.feed.model.ItemCommentEggGroup;
import com.p683ss.android.ugc.aweme.feed.model.RelationLabelExtra;
import com.p683ss.android.ugc.aweme.feed.model.live.NewLiveRoomStruct;
import com.p683ss.android.ugc.aweme.utils.C47759cc;

/* renamed from: com.ss.android.ugc.aweme.feed.api.e */
public final class C30147e {
    /* renamed from: a */
    public static C26138s m70751a(String str, C26138s sVar) {
        if (str == null) {
            return sVar;
        }
        return (C26138s) C47759cc.m103382a().getGson().mo34884a(str, C26138s.class);
    }

    /* renamed from: a */
    public static AwemeRawAd m70752a(String str, AwemeRawAd awemeRawAd) {
        if (str == null) {
            return awemeRawAd;
        }
        return (AwemeRawAd) C47759cc.m103382a().getGson().mo34884a(str, AwemeRawAd.class);
    }

    /* renamed from: a */
    public static ItemCommentEggGroup m70753a(String str, ItemCommentEggGroup itemCommentEggGroup) {
        if (str == null) {
            return itemCommentEggGroup;
        }
        return (ItemCommentEggGroup) C47759cc.m103382a().getGson().mo34884a(str, ItemCommentEggGroup.class);
    }

    /* renamed from: a */
    public static RelationLabelExtra m70754a(String str, RelationLabelExtra relationLabelExtra) {
        if (str == null) {
            return relationLabelExtra;
        }
        return (RelationLabelExtra) C47759cc.m103382a().getGson().mo34884a(str, RelationLabelExtra.class);
    }

    /* renamed from: a */
    public static NewLiveRoomStruct m70755a(String str, NewLiveRoomStruct newLiveRoomStruct) {
        if (str == null) {
            return newLiveRoomStruct;
        }
        return (NewLiveRoomStruct) C47759cc.m103382a().getGson().mo34884a(str, NewLiveRoomStruct.class);
    }
}
