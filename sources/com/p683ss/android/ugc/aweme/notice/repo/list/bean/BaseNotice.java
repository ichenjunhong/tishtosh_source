package com.p683ss.android.ugc.aweme.notice.repo.list.bean;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.base.utils.C23722i;
import com.p683ss.android.ugc.aweme.feed.model.LogPbBean;

/* renamed from: com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice */
public class BaseNotice {
    public static final int AD_HELPER = 6;
    public static final int ANNOUNCEMENT = 1;

    /* renamed from: AT */
    public static final int f96882AT = 45;
    public static final int AUDITFAILED = 3;
    public static final int CHALLENGE = 34;
    public static final int CHECK_PROFILE = 1002;
    public static final int COMMENT = 31;
    public static final int COMMENT_REPLY_WITH_VIDEO = 1003;
    public static final int CREATE_AWEME = 22;
    public static final int CREATOR = 62;
    public static final int DONATION = 69;
    public static final int DOUEXPRESS = 5;
    public static final int DOUYIN_ROBOT_NOTICE = 12;
    public static final int DUET = 21;
    public static final int FOLLOW = 33;
    public static final int FOLLOW_REQUEST = 13;
    public static final int FOLLOW_REQUEST_APPROVE = 23;
    public static final int FRIEND = 24;
    public static final int GAME_HELPER = 60;
    public static final int HASHTAG = 101;
    public static final int HEAD_TITLE = 999;
    public static final int LIKE = 41;
    public static final int LINK_PROFIT = 14;
    public static final int LIVE = 1001;
    public static final int LUBAN = 30;
    public static final int NEIGUANG = 7;
    public static final int RECOMMEND_LIVE = 50;
    public static final int SHOP = 4;
    public static final int STAR_ATLAS = 8;
    public static final int STORY_NOTICE_COMMENT = 26;
    public static final int STORY_NOTICE_UPDATE = 27;
    public static final int STORY_NOTICE_VIEW = 25;
    public static final int SYSTEM_ASSISTANT_NOTICE = 11;
    public static final int TCM = 61;
    public static final int TUTORIAL_VIDEO = 1000;
    public static final int USERTEXT = 2;
    public static final int VOTE = 9;
    public static final int WALLET = 10;
    @C17952c(mo34828a = "migrate_notice")
    C38086a accountMigrateNotice;
    @C17952c(mo34828a = "ad")
    C38087b adHelperNotice;
    @C17952c(mo34828a = "announcement")
    AnnouncementNotice announcement;
    @C17952c(mo34828a = "at")
    AtMe atMe;
    @C17952c(mo34828a = "audit")
    AuditFailedNotice auditNotice;
    @C17952c(mo34828a = "inner_avatar_thumb")
    UrlModel avatarUrl;
    @C17952c(mo34828a = "challenge")
    ChallengeNotice challengeNotice;
    public transient int clientOrder = -1;
    @C17952c(mo34828a = "comment")
    CommentNotice commentNotice;
    @C17952c(mo34828a = "create_time")
    long createTime;
    @C17952c(mo34828a = "digg")
    DiggNotice diggNotice;
    @C17952c(mo34828a = "donation")
    private C38090d donationNotice;
    @C17952c(mo34828a = "duet")
    DuetNotice duetNotice;
    @C17952c(mo34828a = "follow")
    FollowNotice followNotice;
    @C17952c(mo34828a = "friend")
    FriendNotice friendNotice;
    @C17952c(mo34828a = "game_notice")
    C38091e gameNotice;
    @C17952c(mo34828a = "group_avatar_thumb")
    UrlModel groupAvatarUrl;
    @C17952c(mo34828a = "group_name")
    String groupName;
    public boolean isAlreadyRead = true;
    private transient long lastReadTime;
    @C17952c(mo34828a = "ad_link")
    C38094h linkProfitNotice;
    @C17952c(mo34828a = "live_assistant")
    public C38095i liveAssistantNotice;
    public LogPbBean logPbBean;
    @C17952c(mo34828a = "lowest_position")
    int lowestPosition;
    @C17952c(mo34828a = "luban_notice")
    C38096j lubanNotice;
    @C17952c(mo34828a = "creator_mission_notice")
    C38098l nationalTaskAssistantNotice;
    @C17952c(mo34828a = "nid")
    String nid;
    @C17952c(mo34828a = "poi_notice")
    public PoiNotice poiNotice;
    @C17952c(mo34828a = "shop")
    C38102o shopNotice;
    private int showingPosition;
    @C17952c(mo34828a = "amazing_notice")
    C38103p springRedPacketNotice;
    @C17952c(mo34828a = "star_atlas_notice")
    C38104q starAtlasNotice;
    @C17952c(mo34828a = "story_notice")
    StoryNotice storyNotice;
    @C17952c(mo34828a = "tcm_notice")
    C38105r tcmNotice;
    @C17952c(mo34828a = "text")
    UserTextNotice textNotice;
    public transient int timeLineType = -1;
    @C17952c(mo34828a = "type")
    int type;
    private int unReadCount;
    @C17952c(mo34828a = "urge")
    UrgeNotice urgeNotice;
    @C17952c(mo34828a = "user_id")
    String userId;
    @C17952c(mo34828a = "vcd_auth_status")
    int vcdAuthStatus;
    @C17952c(mo34828a = "vote_notice")
    C38106s voteNotice;
    @C17952c(mo34828a = "wallet_notice")
    public WalletNotice walletNotice;
    @C17952c(mo34828a = "xs_notice")
    public C38107t xsStruct;

    public C38086a getAccountMigrateNotice() {
        return this.accountMigrateNotice;
    }

    public C38087b getAdHelperNotice() {
        return this.adHelperNotice;
    }

    public AnnouncementNotice getAnnouncement() {
        return this.announcement;
    }

    public AtMe getAtMe() {
        return this.atMe;
    }

    public AuditFailedNotice getAuditNotice() {
        return this.auditNotice;
    }

    public ChallengeNotice getChallengeNotice() {
        return this.challengeNotice;
    }

    public CommentNotice getCommentNotice() {
        return this.commentNotice;
    }

    public long getCreateTime() {
        return this.createTime;
    }

    public DiggNotice getDiggNotice() {
        return this.diggNotice;
    }

    public C38090d getDonationNotice() {
        return this.donationNotice;
    }

    public DuetNotice getDuetNotice() {
        return this.duetNotice;
    }

    public FollowNotice getFollowNotice() {
        return this.followNotice;
    }

    public FriendNotice getFriendNotice() {
        return this.friendNotice;
    }

    public C38091e getGameNotice() {
        return this.gameNotice;
    }

    public UrlModel getGroupAvatarUrl() {
        return this.groupAvatarUrl;
    }

    public String getGroupName() {
        return this.groupName;
    }

    public long getLastReadTime() {
        return this.lastReadTime;
    }

    public C38094h getLinkProfit() {
        return this.linkProfitNotice;
    }

    public C38095i getLiveAssistantNotice() {
        return this.liveAssistantNotice;
    }

    public int getLowestPosition() {
        return this.lowestPosition;
    }

    public C38096j getLubanNotice() {
        return this.lubanNotice;
    }

    public C38098l getNationalTaskAssistantNotice() {
        return this.nationalTaskAssistantNotice;
    }

    public String getNid() {
        return this.nid;
    }

    public PoiNotice getPoiNotice() {
        return this.poiNotice;
    }

    public C38102o getShopNotice() {
        return this.shopNotice;
    }

    public int getShowingPosition() {
        return this.showingPosition;
    }

    public C38103p getSpringRedPacketNotice() {
        return this.springRedPacketNotice;
    }

    public C38104q getStarAtlasNotice() {
        return this.starAtlasNotice;
    }

    public StoryNotice getStoryNotice() {
        return this.storyNotice;
    }

    public C38105r getTcmNotice() {
        return this.tcmNotice;
    }

    public UserTextNotice getTextNotice() {
        return this.textNotice;
    }

    public int getType() {
        return this.type;
    }

    public int getUnReadCount() {
        return this.unReadCount;
    }

    public UrgeNotice getUrgeNotice() {
        return this.urgeNotice;
    }

    public String getUserId() {
        return this.userId;
    }

    public int getVcdAuthStatus() {
        return this.vcdAuthStatus;
    }

    public C38106s getVoteNotice() {
        return this.voteNotice;
    }

    public WalletNotice getWalletNotice() {
        return this.walletNotice;
    }

    public UrlModel getAvatarUrl() {
        if (this.avatarUrl != null) {
            return this.avatarUrl;
        }
        return this.groupAvatarUrl;
    }

    public int hashCode() {
        return C23722i.m58214a(this.nid);
    }

    public boolean needForceInsert() {
        if ((this.type == 1 || this.type == 2 || this.type == 1002) && this.lowestPosition > 0) {
            return true;
        }
        return false;
    }

    public String getLabelText() {
        if (this.diggNotice != null) {
            return this.diggNotice.getLabelText();
        }
        if (this.atMe != null) {
            return this.atMe.getLabelText();
        }
        if (this.commentNotice != null) {
            return this.commentNotice.getLabelText();
        }
        return "";
    }

    public long getTaskId() {
        if (this.type == 1 && getAnnouncement() != null) {
            return getAnnouncement().getTaskId();
        }
        if (this.type != 2 || getTextNotice() == null) {
            return 0;
        }
        return getTextNotice().getTaskId();
    }

    public BaseNotice clone() {
        FollowNotice followNotice2;
        BaseNotice baseNotice = new BaseNotice();
        baseNotice.nid = this.nid;
        baseNotice.type = this.type;
        baseNotice.createTime = this.createTime;
        baseNotice.groupAvatarUrl = this.groupAvatarUrl;
        baseNotice.avatarUrl = this.avatarUrl;
        baseNotice.groupName = this.groupName;
        baseNotice.diggNotice = this.diggNotice;
        baseNotice.commentNotice = this.commentNotice;
        baseNotice.announcement = this.announcement;
        if (this.followNotice == null) {
            followNotice2 = null;
        } else {
            followNotice2 = this.followNotice.clone();
        }
        baseNotice.followNotice = followNotice2;
        baseNotice.atMe = this.atMe;
        baseNotice.textNotice = this.textNotice;
        baseNotice.auditNotice = this.auditNotice;
        baseNotice.challengeNotice = this.challengeNotice;
        baseNotice.userId = this.userId;
        baseNotice.shopNotice = this.shopNotice;
        baseNotice.adHelperNotice = this.adHelperNotice;
        baseNotice.friendNotice = this.friendNotice;
        baseNotice.storyNotice = this.storyNotice;
        baseNotice.lubanNotice = this.lubanNotice;
        baseNotice.starAtlasNotice = this.starAtlasNotice;
        baseNotice.voteNotice = this.voteNotice;
        baseNotice.poiNotice = this.poiNotice;
        baseNotice.lowestPosition = this.lowestPosition;
        baseNotice.linkProfitNotice = this.linkProfitNotice;
        baseNotice.lastReadTime = this.lastReadTime;
        baseNotice.timeLineType = this.timeLineType;
        baseNotice.clientOrder = this.clientOrder;
        baseNotice.isAlreadyRead = this.isAlreadyRead;
        baseNotice.liveAssistantNotice = this.liveAssistantNotice;
        baseNotice.walletNotice = this.walletNotice;
        baseNotice.logPbBean = this.logPbBean;
        baseNotice.showingPosition = this.showingPosition;
        baseNotice.unReadCount = this.unReadCount;
        baseNotice.duetNotice = this.duetNotice;
        baseNotice.springRedPacketNotice = this.springRedPacketNotice;
        baseNotice.gameNotice = this.gameNotice;
        baseNotice.vcdAuthStatus = this.vcdAuthStatus;
        baseNotice.accountMigrateNotice = this.accountMigrateNotice;
        baseNotice.nationalTaskAssistantNotice = this.nationalTaskAssistantNotice;
        baseNotice.donationNotice = this.donationNotice;
        return baseNotice;
    }

    public void setAccountMigrateNotice(C38086a aVar) {
        this.accountMigrateNotice = aVar;
    }

    public void setAdHelperNotice(C38087b bVar) {
        this.adHelperNotice = bVar;
    }

    public void setAnnouncement(AnnouncementNotice announcementNotice) {
        this.announcement = announcementNotice;
    }

    public void setAtMe(AtMe atMe2) {
        this.atMe = atMe2;
    }

    public void setAuditNotice(AuditFailedNotice auditFailedNotice) {
        this.auditNotice = auditFailedNotice;
    }

    public void setAvatarUrl(UrlModel urlModel) {
        this.avatarUrl = urlModel;
    }

    public void setChallengeNotice(ChallengeNotice challengeNotice2) {
        this.challengeNotice = challengeNotice2;
    }

    public void setCommentNotice(CommentNotice commentNotice2) {
        this.commentNotice = commentNotice2;
    }

    public void setCreateTime(long j) {
        this.createTime = j;
    }

    public void setDiggNotice(DiggNotice diggNotice2) {
        this.diggNotice = diggNotice2;
    }

    public void setDonationNotice(C38090d dVar) {
        this.donationNotice = dVar;
    }

    public void setDuetNotice(DuetNotice duetNotice2) {
        this.duetNotice = duetNotice2;
    }

    public void setFollowNotice(FollowNotice followNotice2) {
        this.followNotice = followNotice2;
    }

    public void setFriendNotice(FriendNotice friendNotice2) {
        this.friendNotice = friendNotice2;
    }

    public void setGameNotice(C38091e eVar) {
        this.gameNotice = eVar;
    }

    public void setGroupAvatarUrl(UrlModel urlModel) {
        this.groupAvatarUrl = urlModel;
    }

    public void setGroupName(String str) {
        this.groupName = str;
    }

    public void setLastReadTime(long j) {
        this.lastReadTime = j;
    }

    public void setLinkProfit(C38094h hVar) {
        this.linkProfitNotice = hVar;
    }

    public void setLiveAssistantNotice(C38095i iVar) {
        this.liveAssistantNotice = iVar;
    }

    public void setLowestPosition(int i) {
        this.lowestPosition = i;
    }

    public void setLubanNotice(C38096j jVar) {
        this.lubanNotice = jVar;
    }

    public void setNationalTaskAssistantNotice(C38098l lVar) {
        this.nationalTaskAssistantNotice = lVar;
    }

    public void setNid(String str) {
        this.nid = str;
    }

    public void setPoiNotice(PoiNotice poiNotice2) {
        this.poiNotice = poiNotice2;
    }

    public void setShopNotice(C38102o oVar) {
        this.shopNotice = oVar;
    }

    public void setShowingPosition(int i) {
        this.showingPosition = i;
    }

    public void setSpringRedPacketNotice(C38103p pVar) {
        this.springRedPacketNotice = pVar;
    }

    public void setStarAtlasNotice(C38104q qVar) {
        this.starAtlasNotice = qVar;
    }

    public void setStoryNotice(StoryNotice storyNotice2) {
        this.storyNotice = storyNotice2;
    }

    public void setTcmNotice(C38105r rVar) {
        this.tcmNotice = rVar;
    }

    public void setTextNotice(UserTextNotice userTextNotice) {
        this.textNotice = userTextNotice;
    }

    public void setType(int i) {
        this.type = i;
    }

    public void setUnReadCount(int i) {
        this.unReadCount = i;
    }

    public void setUrgeNotice(UrgeNotice urgeNotice2) {
        this.urgeNotice = urgeNotice2;
    }

    public void setUserId(String str) {
        this.userId = str;
    }

    public void setVcdAuthStatus(int i) {
        this.vcdAuthStatus = i;
    }

    public void setVoteNotice(C38106s sVar) {
        this.voteNotice = sVar;
    }

    public void setWalletNotice(WalletNotice walletNotice2) {
        this.walletNotice = walletNotice2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BaseNotice baseNotice = (BaseNotice) obj;
        if (this.isAlreadyRead != baseNotice.isAlreadyRead) {
            return false;
        }
        if (this.followNotice == null || baseNotice.followNotice == null) {
            return C23722i.m58215a(this.nid, baseNotice.nid);
        }
        if (!C23722i.m58215a(this.nid, baseNotice.nid) || !C23722i.m58215a(this.followNotice.user, baseNotice.followNotice.user)) {
            return false;
        }
        return true;
    }
}
