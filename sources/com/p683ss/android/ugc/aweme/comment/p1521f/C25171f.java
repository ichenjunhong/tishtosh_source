package com.p683ss.android.ugc.aweme.comment.p1521f;

import com.p683ss.android.ugc.aweme.commercialize.model.C26129j;
import com.p683ss.android.ugc.aweme.feed.C29984ac;
import com.p683ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.comment.f.f */
public final class C25171f extends C25168d<C25171f> {
    private static final long serialVersionUID = -8706130331733501305L;

    /* renamed from: A */
    private boolean f66686A;

    /* renamed from: B */
    private int f66687B;

    /* renamed from: C */
    private String f66688C;

    /* renamed from: D */
    private String f66689D;

    /* renamed from: E */
    private String f66690E;

    /* renamed from: F */
    private String f66691F;

    /* renamed from: G */
    private String f66692G;

    /* renamed from: H */
    private boolean f66693H;

    /* renamed from: I */
    private List<User> f66694I;

    /* renamed from: J */
    private boolean f66695J;

    /* renamed from: K */
    private String f66696K;

    /* renamed from: L */
    private boolean f66697L;

    /* renamed from: d */
    private int f66698d;

    /* renamed from: e */
    private String f66699e;

    /* renamed from: f */
    private String f66700f;

    /* renamed from: g */
    private boolean f66701g;

    /* renamed from: h */
    private boolean f66702h;

    /* renamed from: i */
    private boolean f66703i;

    /* renamed from: j */
    private int f66704j;

    /* renamed from: k */
    private String f66705k;

    /* renamed from: l */
    private String f66706l;

    /* renamed from: m */
    private boolean f66707m;

    /* renamed from: n */
    private boolean f66708n;

    /* renamed from: o */
    private boolean f66709o;

    /* renamed from: p */
    private boolean f66710p;

    /* renamed from: q */
    private boolean f66711q;

    /* renamed from: r */
    private Map<String, String> f66712r;

    /* renamed from: s */
    private String f66713s;

    /* renamed from: t */
    private String f66714t;

    /* renamed from: u */
    private transient C29984ac f66715u;

    /* renamed from: v */
    private String f66716v;

    /* renamed from: w */
    private String f66717w;

    /* renamed from: x */
    private C26129j f66718x;

    /* renamed from: y */
    private boolean f66719y;

    /* renamed from: z */
    private boolean f66720z;

    public final String getCreationId() {
        return this.f66696K;
    }

    public final String getEnterMethod() {
        return this.f66688C;
    }

    public final String getEventType() {
        return this.f66699e;
    }

    public final String getHintCids() {
        return this.f66706l;
    }

    public final Map<String, String> getHotPlayerMap() {
        return this.f66712r;
    }

    public final String getInsertCids() {
        return this.f66705k;
    }

    public final int getIsLongItem() {
        return this.f66687B;
    }

    public final List<User> getLikeUsers() {
        return this.f66694I;
    }

    public final C29984ac getOnShowHeightChangeListener() {
        return this.f66715u;
    }

    public final int getPageType() {
        return this.f66704j;
    }

    public final String getPlayListId() {
        return this.f66691F;
    }

    public final String getPlayListIdKey() {
        return this.f66690E;
    }

    public final String getPlayListType() {
        return this.f66689D;
    }

    public final String getPoiId() {
        return this.f66713s;
    }

    public final String getPoiObjectId() {
        return this.f66716v;
    }

    public final String getPoiRegionType() {
        return this.f66717w;
    }

    public final String getPreviousPage() {
        return this.f66714t;
    }

    public final String getRequestId() {
        return this.f66700f;
    }

    public final int getSource() {
        return this.f66698d;
    }

    public final String getTabName() {
        return this.f66692G;
    }

    public final boolean isCommentClose() {
        return this.f66720z;
    }

    public final boolean isCommentLimited() {
        return this.f66686A;
    }

    public final boolean isEnableComment() {
        return this.f66703i;
    }

    public final boolean isEnterFullScreen() {
        return this.f66693H;
    }

    public final boolean isForceHideKeyboard() {
        return this.f66710p;
    }

    public final boolean isForceOpenReply() {
        return this.f66709o;
    }

    public final boolean isForceRefresh() {
        return this.f66719y;
    }

    public final boolean isFromPostList() {
        return this.f66697L;
    }

    public final boolean isHotPlayer() {
        return this.f66711q;
    }

    public final boolean isMyProfile() {
        return this.f66702h;
    }

    public final boolean isPrivateAweme() {
        return this.f66701g;
    }

    public final boolean isScrollToTop() {
        return this.f66707m;
    }

    public final boolean isShowLikeUsers() {
        return this.f66695J;
    }

    public final boolean showReplyWithInsertCid() {
        return this.f66708n;
    }

    public final C26129j getAdCommentStruct() {
        if (this.f66718x == null) {
            return null;
        }
        this.f66718x.setAwemeId(this.f66682b);
        User user = new User();
        user.setUid(this.f66683c);
        user.setAvatarThumb(this.f66718x.getAvatarIcon());
        this.f66718x.setUser(user);
        this.f66718x.setCommentType(10);
        return this.f66718x;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x002c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String getCommentTag() {
        /*
            r3 = this;
            java.lang.String r0 = r3.f66699e
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
            java.lang.String r0 = r3.f66699e
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
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.comment.p1521f.C25171f.getCommentTag():java.lang.String");
    }

    public final String getEnterFrom() {
        switch (this.f66704j) {
            case 1000:
                return "personal_homepage";
            case 1001:
                return "personal_collection";
            case 2000:
                return "others_homepage";
            case 2001:
                return "others_collection";
            default:
                return this.f66699e;
        }
    }

    public C25171f(String str) {
        super(str);
    }

    public final C25171f forceRefresh(boolean z) {
        this.f66719y = z;
        return this;
    }

    public final C25171f setAdCommentStruct(C26129j jVar) {
        this.f66718x = jVar;
        return this;
    }

    public final C25171f setCommentClose(boolean z) {
        this.f66720z = z;
        return this;
    }

    public final C25171f setCommentLimited(boolean z) {
        this.f66686A = z;
        return this;
    }

    public final C25171f setCreationId(String str) {
        this.f66696K = str;
        return this;
    }

    public final C25171f setEnableComment(boolean z) {
        this.f66703i = z;
        return this;
    }

    public final C25171f setEnterFullScreen(boolean z) {
        this.f66693H = z;
        return this;
    }

    public final C25171f setEnterMethod(String str) {
        this.f66688C = str;
        return this;
    }

    public final C25171f setEventType(String str) {
        this.f66699e = str;
        return this;
    }

    public final C25171f setForceHideKeyboard(boolean z) {
        this.f66710p = z;
        return this;
    }

    public final C25171f setFromPostList(boolean z) {
        this.f66697L = z;
        return this;
    }

    public final C25171f setHintCids(String str) {
        this.f66706l = str;
        return this;
    }

    public final C25171f setHotPlayer(boolean z) {
        this.f66711q = z;
        return this;
    }

    public final C25171f setHotPlayerMap(Map<String, String> map) {
        this.f66712r = map;
        return this;
    }

    public final C25171f setIsLongItem(int i) {
        this.f66687B = i;
        return this;
    }

    public final C25171f setLikeUsers(List<User> list) {
        this.f66694I = list;
        return this;
    }

    public final C25171f setMyProfile(boolean z) {
        this.f66702h = z;
        return this;
    }

    public final C25171f setOnShowHeightChangeListener(C29984ac acVar) {
        this.f66715u = acVar;
        return this;
    }

    public final C25171f setPageType(int i) {
        this.f66704j = i;
        return this;
    }

    public final C25171f setPlayListId(String str) {
        this.f66691F = str;
        return this;
    }

    public final C25171f setPlayListIdKey(String str) {
        this.f66690E = str;
        return this;
    }

    public final C25171f setPlayListType(String str) {
        this.f66689D = str;
        return this;
    }

    public final C25171f setPoiId(String str) {
        this.f66713s = str;
        return this;
    }

    public final C25171f setPoiObjectId(String str) {
        this.f66716v = str;
        return this;
    }

    public final C25171f setPoiRegionType(String str) {
        this.f66717w = str;
        return this;
    }

    public final C25171f setPreviousPage(String str) {
        this.f66714t = str;
        return this;
    }

    public final C25171f setPrivateAweme(boolean z) {
        this.f66701g = z;
        return this;
    }

    public final C25171f setRequestId(String str) {
        this.f66700f = str;
        return this;
    }

    public final C25171f setScrollToTop(boolean z) {
        this.f66707m = z;
        return this;
    }

    public final C25171f setShowLikeUsers(boolean z) {
        this.f66695J = z;
        return this;
    }

    public final C25171f setSource(int i) {
        this.f66698d = i;
        return this;
    }

    public final C25171f setTabName(String str) {
        this.f66692G = str;
        return this;
    }

    public final C25171f setInsertCids(String str, boolean z, boolean z2) {
        this.f66705k = str;
        this.f66708n = z;
        this.f66709o = z2;
        return this;
    }
}
