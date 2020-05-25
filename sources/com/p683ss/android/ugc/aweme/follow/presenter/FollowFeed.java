package com.p683ss.android.ugc.aweme.follow.presenter;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.comment.model.Comment;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.live.RoomFeedCellStruct;
import com.p683ss.android.ugc.aweme.follow.C31857a;
import com.p683ss.android.ugc.aweme.model.TextExtraStruct;
import com.p683ss.android.ugc.aweme.newfollow.p1998e.C37859b;
import com.p683ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.follow.presenter.FollowFeed */
public class FollowFeed extends C37859b {
    @C17952c(mo34828a = "aweme")
    private Aweme aweme;
    private long blockFavoriteTime;
    @C17952c(mo34828a = "comment_list")
    private List<Comment> commentList;
    private List<String> favoriteIds;
    @C17952c(mo34828a = "favorite_list")
    private List<Aweme> favorites;
    @C17952c(mo34828a = "feed_type")
    private int feedType;
    private C31857a lastViewData;
    @C17952c(mo34828a = "count")
    private int likeCount;
    @C17952c(mo34828a = "like_list")
    private List<User> likeList;
    private boolean mIsMomentStyle;
    private User mRecommendUser;
    @C17952c(mo34828a = "recommend_reason")
    private String recommendReason;
    @C17952c(mo34828a = "cell_room")
    private RoomFeedCellStruct roomStruct;
    @C17952c(mo34828a = "user")
    private List<User> user;

    public FollowFeed() {
    }

    public Aweme getAweme() {
        return this.aweme;
    }

    public long getBlockFavoriteTime() {
        return this.blockFavoriteTime;
    }

    public List<String> getFavoriteIds() {
        return this.favoriteIds;
    }

    public List<Aweme> getFavorites() {
        return this.favorites;
    }

    public C31857a getLastViewData() {
        return this.lastViewData;
    }

    public int getLikeCount() {
        return this.likeCount;
    }

    public List<User> getLikeList() {
        return this.likeList;
    }

    public String getRecommendReason() {
        return this.recommendReason;
    }

    public User getRecommendUser() {
        return this.mRecommendUser;
    }

    public RoomFeedCellStruct getRoomStruct() {
        return this.roomStruct;
    }

    public List<User> getUser() {
        return this.user;
    }

    public boolean isMomentStyle() {
        return this.mIsMomentStyle;
    }

    public boolean needUpdateComment() {
        return true;
    }

    public List<Comment> getCommentList() {
        if (this.commentList == null || this.aweme == null || !this.aweme.getAwemeControl().canShowComment()) {
            this.commentList = new ArrayList();
        }
        return this.commentList;
    }

    public int getFeedType() {
        int i = this.feedType;
        if (i == -1) {
            return 65288;
        }
        switch (i) {
            case 1:
                return 65280;
            case 2:
                return TextExtraStruct.TYPE_CUSTOM;
            case 3:
                return 65298;
            default:
                return this.feedType;
        }
    }

    public void setAweme(Aweme aweme2) {
        this.aweme = aweme2;
    }

    public void setBlockFavoriteTime(long j) {
        this.blockFavoriteTime = j;
    }

    public void setFavoriteIds(List<String> list) {
        this.favoriteIds = list;
    }

    public void setFavorites(List<Aweme> list) {
        this.favorites = list;
    }

    public void setFeedType(int i) {
        this.feedType = i;
    }

    public void setIsMomentStyle(boolean z) {
        this.mIsMomentStyle = z;
    }

    public void setLastViewData(C31857a aVar) {
        this.lastViewData = aVar;
    }

    public void setLikeCount(int i) {
        this.likeCount = i;
    }

    public void setLikeList(List<User> list) {
        this.likeList = list;
    }

    public void setRecommendReason(String str) {
        this.recommendReason = str;
    }

    public void setRecommendUser(User user2) {
        this.mRecommendUser = user2;
    }

    public void setRoomStruct(RoomFeedCellStruct roomFeedCellStruct) {
        this.roomStruct = roomFeedCellStruct;
    }

    public void setUser(List<User> list) {
        this.user = list;
    }

    public static FollowFeed createLastWatchHistoryItem(C31857a aVar) {
        FollowFeed followFeed = new FollowFeed();
        followFeed.setFeedType(65297);
        followFeed.setLastViewData(aVar);
        return followFeed;
    }

    public void setCommentList(List<Comment> list) {
        if (list == null) {
            list = new ArrayList<>();
        }
        this.commentList = list;
    }

    public void setRequestId(String str) {
        super.setRequestId(str);
        if (this.aweme != null) {
            this.aweme.setRequestId(str);
        }
    }

    public FollowFeed(Aweme aweme2) {
        this.feedType = 65280;
        this.aweme = aweme2;
        this.commentList = new ArrayList();
    }
}
