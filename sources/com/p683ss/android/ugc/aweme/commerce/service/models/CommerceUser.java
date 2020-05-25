package com.p683ss.android.ugc.aweme.commerce.service.models;

import com.bytedance.common.utility.C9431p;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.experiment.UnReadVideoExperiment;
import com.p683ss.android.ugc.aweme.framework.services.IUserService;
import com.p683ss.android.ugc.aweme.services.BaseUserService;
import com.p683ss.android.ugc.aweme.video.preload.model.PreloadTask;
import java.io.Serializable;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.commerce.service.models.CommerceUser */
public final class CommerceUser implements Serializable {
    private UrlModel avatarMedium;
    private String bindPhone;
    private Integer followStatus;
    private boolean isHasOrders;
    private String nickname;
    private String secUid;
    private String shopMicroApp;
    private String uid;
    private boolean withCommerceNewbieTask;
    private boolean withCommerceRights;
    private boolean withItemCommerceEntry;
    private boolean withNewGoods;
    private boolean withShopEntry;

    public static /* synthetic */ CommerceUser copy$default(CommerceUser commerceUser, UrlModel urlModel, String str, String str2, String str3, boolean z, String str4, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, String str5, Integer num, int i, Object obj) {
        CommerceUser commerceUser2 = commerceUser;
        int i2 = i;
        return commerceUser.copy((i2 & 1) != 0 ? commerceUser2.avatarMedium : urlModel, (i2 & 2) != 0 ? commerceUser2.uid : str, (i2 & 4) != 0 ? commerceUser2.secUid : str2, (i2 & 8) != 0 ? commerceUser2.nickname : str3, (i2 & 16) != 0 ? commerceUser2.isHasOrders : z, (i2 & 32) != 0 ? commerceUser2.bindPhone : str4, (i2 & 64) != 0 ? commerceUser2.withCommerceRights : z2, (i2 & 128) != 0 ? commerceUser2.withShopEntry : z3, (i2 & UnReadVideoExperiment.BROWSE_RECORD_LIST) != 0 ? commerceUser2.withNewGoods : z4, (i2 & UnReadVideoExperiment.LIKE_USER_LIST) != 0 ? commerceUser2.withCommerceNewbieTask : z5, (i2 & PreloadTask.BYTE_UNIT_NUMBER) != 0 ? commerceUser2.withItemCommerceEntry : z6, (i2 & 2048) != 0 ? commerceUser2.shopMicroApp : str5, (i2 & 4096) != 0 ? commerceUser2.followStatus : num);
    }

    public final UrlModel component1() {
        return this.avatarMedium;
    }

    public final boolean component10() {
        return this.withCommerceNewbieTask;
    }

    public final boolean component11() {
        return this.withItemCommerceEntry;
    }

    public final String component12() {
        return this.shopMicroApp;
    }

    public final Integer component13() {
        return this.followStatus;
    }

    public final String component2() {
        return this.uid;
    }

    public final String component3() {
        return this.secUid;
    }

    public final String component4() {
        return this.nickname;
    }

    public final boolean component5() {
        return this.isHasOrders;
    }

    public final String component6() {
        return this.bindPhone;
    }

    public final boolean component7() {
        return this.withCommerceRights;
    }

    public final boolean component8() {
        return this.withShopEntry;
    }

    public final boolean component9() {
        return this.withNewGoods;
    }

    public final CommerceUser copy(UrlModel urlModel, String str, String str2, String str3, boolean z, String str4, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, String str5, Integer num) {
        String str6 = str;
        C52711k.m112240b(str6, "uid");
        String str7 = str2;
        C52711k.m112240b(str7, "secUid");
        CommerceUser commerceUser = new CommerceUser(urlModel, str6, str7, str3, z, str4, z2, z3, z4, z5, z6, str5, num);
        return commerceUser;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CommerceUser) {
                CommerceUser commerceUser = (CommerceUser) obj;
                if (C52711k.m112239a((Object) this.avatarMedium, (Object) commerceUser.avatarMedium) && C52711k.m112239a((Object) this.uid, (Object) commerceUser.uid) && C52711k.m112239a((Object) this.secUid, (Object) commerceUser.secUid) && C52711k.m112239a((Object) this.nickname, (Object) commerceUser.nickname)) {
                    if ((this.isHasOrders == commerceUser.isHasOrders) && C52711k.m112239a((Object) this.bindPhone, (Object) commerceUser.bindPhone)) {
                        if (this.withCommerceRights == commerceUser.withCommerceRights) {
                            if (this.withShopEntry == commerceUser.withShopEntry) {
                                if (this.withNewGoods == commerceUser.withNewGoods) {
                                    if (this.withCommerceNewbieTask == commerceUser.withCommerceNewbieTask) {
                                        if (!(this.withItemCommerceEntry == commerceUser.withItemCommerceEntry) || !C52711k.m112239a((Object) this.shopMicroApp, (Object) commerceUser.shopMicroApp) || !C52711k.m112239a((Object) this.followStatus, (Object) commerceUser.followStatus)) {
                                            return false;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final UrlModel getAvatarMedium() {
        return this.avatarMedium;
    }

    public final String getBindPhone() {
        return this.bindPhone;
    }

    public final Integer getFollowStatus() {
        return this.followStatus;
    }

    public final String getNickname() {
        return this.nickname;
    }

    public final String getSecUid() {
        return this.secUid;
    }

    public final String getShopMicroApp() {
        return this.shopMicroApp;
    }

    public final String getUid() {
        return this.uid;
    }

    public final boolean getWithCommerceNewbieTask() {
        return this.withCommerceNewbieTask;
    }

    public final boolean getWithCommerceRights() {
        return this.withCommerceRights;
    }

    public final boolean getWithItemCommerceEntry() {
        return this.withItemCommerceEntry;
    }

    public final boolean getWithNewGoods() {
        return this.withNewGoods;
    }

    public final boolean getWithShopEntry() {
        return this.withShopEntry;
    }

    public final int hashCode() {
        UrlModel urlModel = this.avatarMedium;
        int i = 0;
        int hashCode = (urlModel != null ? urlModel.hashCode() : 0) * 31;
        String str = this.uid;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.secUid;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.nickname;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        boolean z = this.isHasOrders;
        if (z) {
            z = true;
        }
        int i2 = (hashCode4 + (z ? 1 : 0)) * 31;
        String str4 = this.bindPhone;
        int hashCode5 = (i2 + (str4 != null ? str4.hashCode() : 0)) * 31;
        boolean z2 = this.withCommerceRights;
        if (z2) {
            z2 = true;
        }
        int i3 = (hashCode5 + (z2 ? 1 : 0)) * 31;
        boolean z3 = this.withShopEntry;
        if (z3) {
            z3 = true;
        }
        int i4 = (i3 + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.withNewGoods;
        if (z4) {
            z4 = true;
        }
        int i5 = (i4 + (z4 ? 1 : 0)) * 31;
        boolean z5 = this.withCommerceNewbieTask;
        if (z5) {
            z5 = true;
        }
        int i6 = (i5 + (z5 ? 1 : 0)) * 31;
        boolean z6 = this.withItemCommerceEntry;
        if (z6) {
            z6 = true;
        }
        int i7 = (i6 + (z6 ? 1 : 0)) * 31;
        String str5 = this.shopMicroApp;
        int hashCode6 = (i7 + (str5 != null ? str5.hashCode() : 0)) * 31;
        Integer num = this.followStatus;
        if (num != null) {
            i = num.hashCode();
        }
        return hashCode6 + i;
    }

    public final boolean isHasOrders() {
        return this.isHasOrders;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommerceUser(avatarMedium=");
        sb.append(this.avatarMedium);
        sb.append(", uid=");
        sb.append(this.uid);
        sb.append(", secUid=");
        sb.append(this.secUid);
        sb.append(", nickname=");
        sb.append(this.nickname);
        sb.append(", isHasOrders=");
        sb.append(this.isHasOrders);
        sb.append(", bindPhone=");
        sb.append(this.bindPhone);
        sb.append(", withCommerceRights=");
        sb.append(this.withCommerceRights);
        sb.append(", withShopEntry=");
        sb.append(this.withShopEntry);
        sb.append(", withNewGoods=");
        sb.append(this.withNewGoods);
        sb.append(", withCommerceNewbieTask=");
        sb.append(this.withCommerceNewbieTask);
        sb.append(", withItemCommerceEntry=");
        sb.append(this.withItemCommerceEntry);
        sb.append(", shopMicroApp=");
        sb.append(this.shopMicroApp);
        sb.append(", followStatus=");
        sb.append(this.followStatus);
        sb.append(")");
        return sb.toString();
    }

    public CommerceUser() {
        this(null, "", "", "", false, "", false, false, false, false, false, null, null, 7680, null);
    }

    public final boolean isMe() {
        IUserService baseUserService_Monster = BaseUserService.getBaseUserService_Monster();
        String str = this.uid;
        C52711k.m112236a((Object) baseUserService_Monster, "userService");
        return C9431p.m18665a(str, baseUserService_Monster.getCurrentUserID());
    }

    public final void setAvatarMedium(UrlModel urlModel) {
        this.avatarMedium = urlModel;
    }

    public final void setBindPhone(String str) {
        this.bindPhone = str;
    }

    public final void setFollowStatus(Integer num) {
        this.followStatus = num;
    }

    public final void setHasOrders(boolean z) {
        this.isHasOrders = z;
    }

    public final void setNickname(String str) {
        this.nickname = str;
    }

    public final void setShopMicroApp(String str) {
        this.shopMicroApp = str;
    }

    public final void setWithCommerceNewbieTask(boolean z) {
        this.withCommerceNewbieTask = z;
    }

    public final void setWithCommerceRights(boolean z) {
        this.withCommerceRights = z;
    }

    public final void setWithItemCommerceEntry(boolean z) {
        this.withItemCommerceEntry = z;
    }

    public final void setWithNewGoods(boolean z) {
        this.withNewGoods = z;
    }

    public final void setWithShopEntry(boolean z) {
        this.withShopEntry = z;
    }

    public final void setSecUid(String str) {
        C52711k.m112240b(str, "<set-?>");
        this.secUid = str;
    }

    public final void setUid(String str) {
        C52711k.m112240b(str, "<set-?>");
        this.uid = str;
    }

    public CommerceUser(UrlModel urlModel, String str, String str2, String str3, boolean z, String str4, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, String str5, Integer num) {
        C52711k.m112240b(str, "uid");
        C52711k.m112240b(str2, "secUid");
        this.avatarMedium = urlModel;
        this.uid = str;
        this.secUid = str2;
        this.nickname = str3;
        this.isHasOrders = z;
        this.bindPhone = str4;
        this.withCommerceRights = z2;
        this.withShopEntry = z3;
        this.withNewGoods = z4;
        this.withCommerceNewbieTask = z5;
        this.withItemCommerceEntry = z6;
        this.shopMicroApp = str5;
        this.followStatus = num;
    }

    public /* synthetic */ CommerceUser(UrlModel urlModel, String str, String str2, String str3, boolean z, String str4, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, String str5, Integer num, int i, C52707g gVar) {
        String str6;
        String str7;
        String str8;
        String str9;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        String str10;
        Integer num2;
        int i2 = i;
        if ((i2 & 2) != 0) {
            str6 = "";
        } else {
            str6 = str;
        }
        if ((i2 & 4) != 0) {
            str7 = "";
        } else {
            str7 = str2;
        }
        if ((i2 & 8) != 0) {
            str8 = "";
        } else {
            str8 = str3;
        }
        if ((i2 & 32) != 0) {
            str9 = "";
        } else {
            str9 = str4;
        }
        if ((i2 & 64) != 0) {
            z7 = false;
        } else {
            z7 = z2;
        }
        if ((i2 & 128) != 0) {
            z8 = false;
        } else {
            z8 = z3;
        }
        if ((i2 & UnReadVideoExperiment.BROWSE_RECORD_LIST) != 0) {
            z9 = false;
        } else {
            z9 = z4;
        }
        if ((i2 & UnReadVideoExperiment.LIKE_USER_LIST) != 0) {
            z10 = false;
        } else {
            z10 = z5;
        }
        if ((i2 & PreloadTask.BYTE_UNIT_NUMBER) != 0) {
            z11 = false;
        } else {
            z11 = z6;
        }
        if ((i2 & 2048) != 0) {
            str10 = "";
        } else {
            str10 = str5;
        }
        if ((i2 & 4096) != 0) {
            num2 = Integer.valueOf(-1);
        } else {
            num2 = num;
        }
        this(urlModel, str6, str7, str8, z, str9, z7, z8, z9, z10, z11, str10, num2);
    }
}
