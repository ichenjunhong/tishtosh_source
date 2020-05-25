package com.p683ss.android.ugc.aweme.p1807im.sdk.group.model;

import android.support.annotation.Keep;
import com.google.gson.p1076a.C17952c;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

@Keep
/* renamed from: com.ss.android.ugc.aweme.im.sdk.group.model.FamiliarGroupEnhanceConfig */
public final class FamiliarGroupEnhanceConfig {
    public static final C34275a Companion = new C34275a(null);
    public static final int DEFAULT_CELL_FRIEND_THRESHOLD = 2;
    public static final int DEFAULT_CELL_SHOW_INTERVAL = 7;
    public static final int DEFAULT_CELL_SHOW_MAX_COUNT = 3;
    public static final int DEFAULT_CLICK_DISAPPEAR_THRESHOLD = 1;
    public static final int DEFAULT_FOLLOW_USER_GUIDE_THRESHOLD = 20;
    @C17952c(mo34828a = "cell_click_disappear_threshold")
    public int cellClickDisappearThreshold;
    @C17952c(mo34828a = "cell_friend_threshold")
    public int cellFriendThreshold;
    @C17952c(mo34828a = "cell_float_days_interval")
    public int cellShowInterval;
    @C17952c(mo34828a = "cell_float_max_count")
    public int cellShowMaxCount;
    @C17952c(mo34828a = "cell_float_user_threshold")
    public int followUserGuideThreshold;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.model.FamiliarGroupEnhanceConfig$a */
    public static final class C34275a {
        private C34275a() {
        }

        public /* synthetic */ C34275a(C52707g gVar) {
            this();
        }
    }

    public final int getCellClickDisappearThreshold() {
        return this.cellClickDisappearThreshold;
    }

    public final int getCellFriendThreshold() {
        return this.cellFriendThreshold;
    }

    public final int getCellShowInterval() {
        return this.cellShowInterval;
    }

    public final int getCellShowMaxCount() {
        return this.cellShowMaxCount;
    }

    public final int getFollowUserGuideThreshold() {
        return this.followUserGuideThreshold;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder(" cellFriendThreshold: ");
        sb2.append(this.cellFriendThreshold);
        sb2.append(' ');
        sb.append(sb2.toString());
        StringBuilder sb3 = new StringBuilder(" cellClickDisappearThreshold: ");
        sb3.append(this.cellClickDisappearThreshold);
        sb3.append(' ');
        sb.append(sb3.toString());
        StringBuilder sb4 = new StringBuilder(" followUserGuideThreshold: ");
        sb4.append(this.followUserGuideThreshold);
        sb4.append(' ');
        sb.append(sb4.toString());
        StringBuilder sb5 = new StringBuilder(" cellShowInterval: ");
        sb5.append(this.cellShowInterval);
        sb5.append(' ');
        sb.append(sb5.toString());
        StringBuilder sb6 = new StringBuilder(" cellShowMaxCount: ");
        sb6.append(this.cellShowMaxCount);
        sb6.append(' ');
        sb.append(sb6.toString());
        String sb7 = sb.toString();
        C52711k.m112236a((Object) sb7, "builder.toString()");
        return sb7;
    }

    public final void setCellClickDisappearThreshold(int i) {
        this.cellClickDisappearThreshold = i;
    }

    public final void setCellFriendThreshold(int i) {
        this.cellFriendThreshold = i;
    }

    public final void setCellShowInterval(int i) {
        this.cellShowInterval = i;
    }

    public final void setCellShowMaxCount(int i) {
        this.cellShowMaxCount = i;
    }

    public final void setFollowUserGuideThreshold(int i) {
        this.followUserGuideThreshold = i;
    }
}
