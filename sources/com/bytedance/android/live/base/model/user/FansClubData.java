package com.bytedance.android.live.base.model.user;

import android.text.TextUtils;
import com.bytedance.android.live.base.model.ImageModel;
import com.google.gson.p1076a.C17952c;
import java.util.List;
import java.util.Map;

public class FansClubData {
    public static final int BADGE_ICON_NORMAL = 1;
    public static final int BADGE_ICON_SMALL = 2;
    @C17952c(mo34828a = "anchor_id")
    public long anchorId;
    @C17952c(mo34828a = "available_gift_ids")
    public List<Long> availableGiftIds;
    @C17952c(mo34828a = "badge")
    public UserBadge badge;
    @C17952c(mo34828a = "club_name")
    public String clubName;
    @C17952c(mo34828a = "level")
    public int level;
    @C17952c(mo34828a = "user_fans_club_status")
    public int userFansClubStatus;

    public static class UserBadge {
        @C17952c(mo34828a = "icons")
        public Map<Integer, ImageModel> icons;
        @C17952c(mo34828a = "title")
        public String title;
    }

    public static boolean isValid(FansClubData fansClubData) {
        if (fansClubData == null || TextUtils.isEmpty(fansClubData.clubName)) {
            return false;
        }
        return true;
    }
}
