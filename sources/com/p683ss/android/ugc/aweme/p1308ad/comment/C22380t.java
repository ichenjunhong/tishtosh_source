package com.p683ss.android.ugc.aweme.p1308ad.comment;

import com.p683ss.android.ugc.aweme.commercialize.model.C26129j;
import com.p683ss.android.ugc.aweme.profile.model.User;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.ad.comment.t */
public final class C22380t extends C22347a<C22380t> {
    private static final long serialVersionUID = -8706130331733501305L;

    /* renamed from: A */
    private String f60248A;

    /* renamed from: B */
    private String f60249B;

    /* renamed from: C */
    private String f60250C;

    /* renamed from: D */
    private String f60251D;

    /* renamed from: E */
    private boolean f60252E;

    /* renamed from: F */
    private List<User> f60253F;

    /* renamed from: G */
    private boolean f60254G;

    /* renamed from: d */
    private int f60255d;

    /* renamed from: e */
    private String f60256e;

    /* renamed from: f */
    private String f60257f;

    /* renamed from: g */
    private boolean f60258g;

    /* renamed from: h */
    private boolean f60259h;

    /* renamed from: i */
    private boolean f60260i;

    /* renamed from: j */
    private int f60261j;

    /* renamed from: k */
    private String f60262k;

    /* renamed from: l */
    private String f60263l;

    /* renamed from: m */
    private boolean f60264m;

    /* renamed from: n */
    private boolean f60265n;

    /* renamed from: o */
    private boolean f60266o;

    /* renamed from: p */
    private String f60267p;

    /* renamed from: q */
    private String f60268q;

    /* renamed from: r */
    private transient C22379s f60269r;

    /* renamed from: s */
    private String f60270s;

    /* renamed from: t */
    private String f60271t;

    /* renamed from: u */
    private C26129j f60272u;

    /* renamed from: v */
    private boolean f60273v;

    /* renamed from: w */
    private boolean f60274w;

    /* renamed from: x */
    private boolean f60275x;

    /* renamed from: y */
    private int f60276y;

    /* renamed from: z */
    private String f60277z;

    public final String getEnterMethod() {
        return this.f60277z;
    }

    public final String getEventType() {
        return this.f60256e;
    }

    public final String getHintCids() {
        return this.f60263l;
    }

    public final String getInsertCids() {
        return this.f60262k;
    }

    public final int getIsLongItem() {
        return this.f60276y;
    }

    public final List<User> getLikeUsers() {
        return this.f60253F;
    }

    public final C22379s getOnShowHeightChangeListener() {
        return this.f60269r;
    }

    public final int getPageType() {
        return this.f60261j;
    }

    public final String getPlayListId() {
        return this.f60250C;
    }

    public final String getPlayListIdKey() {
        return this.f60249B;
    }

    public final String getPlayListType() {
        return this.f60248A;
    }

    public final String getPoiId() {
        return this.f60267p;
    }

    public final String getPoiObjectId() {
        return this.f60270s;
    }

    public final String getPoiRegionType() {
        return this.f60271t;
    }

    public final String getPreviousPage() {
        return this.f60268q;
    }

    public final String getRequestId() {
        return this.f60257f;
    }

    public final int getSource() {
        return this.f60255d;
    }

    public final String getTabName() {
        return this.f60251D;
    }

    public final boolean isCommentClose() {
        return this.f60274w;
    }

    public final boolean isCommentLimited() {
        return this.f60275x;
    }

    public final boolean isEnableComment() {
        return this.f60260i;
    }

    public final boolean isEnterFullScreen() {
        return this.f60252E;
    }

    public final boolean isForceOpenReply() {
        return this.f60266o;
    }

    public final boolean isForceRefresh() {
        return this.f60273v;
    }

    public final boolean isMyProfile() {
        return this.f60259h;
    }

    public final boolean isPrivateAweme() {
        return this.f60258g;
    }

    public final boolean isScrollToTop() {
        return this.f60264m;
    }

    public final boolean isShowLikeUsers() {
        return this.f60254G;
    }

    public final boolean showReplyWithInsertCid() {
        return this.f60265n;
    }

    public final C26129j getAdCommentStruct() {
        if (this.f60272u == null) {
            return null;
        }
        this.f60272u.setAwemeId(this.f60205b);
        User user = new User();
        user.setUid(this.f60206c);
        user.setAvatarThumb(this.f60272u.getAvatarIcon());
        this.f60272u.setUser(user);
        this.f60272u.setCommentType(10);
        return this.f60272u;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x002c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String getCommentTag() {
        /*
            r3 = this;
            java.lang.String r0 = r3.f60256e
            int r1 = r0.hashCode()
            r2 = -1741312354(0xffffffff9835ae9e, float:-2.348186E-24)
            if (r1 == r2) goto L_0x001b
            r2 = 3418175(0x34283f, float:4.789883E-39)
            if (r1 == r2) goto L_0x0011
            goto L_0x0025
        L_0x0011:
            java.lang.String r1 = "opus"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0025
            r0 = 0
            goto L_0x0026
        L_0x001b:
            java.lang.String r1 = "collection"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0025
            r0 = 1
            goto L_0x0026
        L_0x0025:
            r0 = -1
        L_0x0026:
            switch(r0) {
                case 0: goto L_0x002c;
                case 1: goto L_0x002c;
                default: goto L_0x0029;
            }
        L_0x0029:
            java.lang.String r0 = r3.f60256e
            return r0
        L_0x002c:
            boolean r0 = r3.isMyProfile()
            if (r0 == 0) goto L_0x0035
            java.lang.String r0 = "personal_homepage"
            return r0
        L_0x0035:
            java.lang.String r0 = "others_homepage"
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1308ad.comment.C22380t.getCommentTag():java.lang.String");
    }

    public final String getEnterFrom() {
        switch (this.f60261j) {
            case 1000:
                return "personal_homepage";
            case 1001:
                return "personal_collection";
            case 2000:
                return "others_homepage";
            case 2001:
                return "others_collection";
            default:
                return this.f60256e;
        }
    }

    public C22380t(String str) {
        super(str);
    }

    public final C22380t forceRefresh(boolean z) {
        this.f60273v = z;
        return this;
    }

    public final C22380t setAdCommentStruct(C26129j jVar) {
        this.f60272u = jVar;
        return this;
    }

    public final C22380t setCommentClose(boolean z) {
        this.f60274w = z;
        return this;
    }

    public final C22380t setCommentLimited(boolean z) {
        this.f60275x = z;
        return this;
    }

    public final C22380t setEnableComment(boolean z) {
        this.f60260i = z;
        return this;
    }

    public final C22380t setEnterFullScreen(boolean z) {
        this.f60252E = z;
        return this;
    }

    public final C22380t setEnterMethod(String str) {
        this.f60277z = str;
        return this;
    }

    public final C22380t setEventType(String str) {
        this.f60256e = str;
        return this;
    }

    public final C22380t setHintCids(String str) {
        this.f60263l = str;
        return this;
    }

    public final C22380t setIsLongItem(int i) {
        this.f60276y = i;
        return this;
    }

    public final C22380t setLikeUsers(List<User> list) {
        this.f60253F = list;
        return this;
    }

    public final C22380t setMyProfile(boolean z) {
        this.f60259h = z;
        return this;
    }

    public final C22380t setOnShowHeightChangeListener(C22379s sVar) {
        this.f60269r = sVar;
        return this;
    }

    public final C22380t setPageType(int i) {
        this.f60261j = i;
        return this;
    }

    public final C22380t setPlayListId(String str) {
        this.f60250C = str;
        return this;
    }

    public final C22380t setPlayListIdKey(String str) {
        this.f60249B = str;
        return this;
    }

    public final C22380t setPlayListType(String str) {
        this.f60248A = str;
        return this;
    }

    public final C22380t setPoiId(String str) {
        this.f60267p = str;
        return this;
    }

    public final C22380t setPoiObjectId(String str) {
        this.f60270s = str;
        return this;
    }

    public final C22380t setPoiRegionType(String str) {
        this.f60271t = str;
        return this;
    }

    public final C22380t setPreviousPage(String str) {
        this.f60268q = str;
        return this;
    }

    public final C22380t setPrivateAweme(boolean z) {
        this.f60258g = z;
        return this;
    }

    public final C22380t setRequestId(String str) {
        this.f60257f = str;
        return this;
    }

    public final C22380t setScrollToTop(boolean z) {
        this.f60264m = z;
        return this;
    }

    public final C22380t setShowLikeUsers(boolean z) {
        this.f60254G = z;
        return this;
    }

    public final C22380t setSource(int i) {
        this.f60255d = i;
        return this;
    }

    public final C22380t setTabName(String str) {
        this.f60251D = str;
        return this;
    }

    public final C22380t setInsertCids(String str, boolean z, boolean z2) {
        this.f60262k = str;
        this.f60265n = z;
        this.f60266o = z2;
        return this;
    }
}
