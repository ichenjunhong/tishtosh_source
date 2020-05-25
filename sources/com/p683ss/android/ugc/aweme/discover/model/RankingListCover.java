package com.p683ss.android.ugc.aweme.discover.model;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import com.p683ss.android.ugc.aweme.commerce.service.models.C25563g;
import com.p683ss.android.ugc.aweme.music.model.BrandBillboard;
import com.p683ss.android.ugc.aweme.music.model.Music;
import com.p683ss.android.ugc.aweme.profile.model.User;
import java.io.Serializable;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.discover.model.RankingListCover */
public final class RankingListCover extends BaseResponse implements Serializable {
    @C17952c(mo34828a = "top_brand")
    private BrandBillboard topBrand;
    @C17952c(mo34828a = "top_promotion")
    private C25563g topGoods;
    @C17952c(mo34828a = "top_music")
    private Music topMusic;
    @C17952c(mo34828a = "top_star")
    private User topStar;

    public final BrandBillboard getTopBrand() {
        return this.topBrand;
    }

    public final C25563g getTopGoods() {
        return this.topGoods;
    }

    public final Music getTopMusic() {
        return this.topMusic;
    }

    public final User getTopStar() {
        return this.topStar;
    }

    public final int hashCode() {
        int i;
        int i2;
        Music music = this.topMusic;
        int i3 = 0;
        if (music != null) {
            i = music.hashCode();
        } else {
            i = 0;
        }
        int i4 = i * 31;
        User user = this.topStar;
        if (user != null) {
            i2 = user.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (i4 + i2) * 31;
        C25563g gVar = this.topGoods;
        if (gVar != null) {
            i3 = gVar.hashCode();
        }
        return i5 + i3;
    }

    public final void setTopBrand(BrandBillboard brandBillboard) {
        this.topBrand = brandBillboard;
    }

    public final void setTopGoods(C25563g gVar) {
        this.topGoods = gVar;
    }

    public final void setTopMusic(Music music) {
        this.topMusic = music;
    }

    public final void setTopStar(User user) {
        this.topStar = user;
    }

    public final boolean equals(Object obj) {
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        if (this == obj) {
            return true;
        }
        Class cls = getClass();
        String str = null;
        if (obj != null) {
            obj2 = obj.getClass();
        } else {
            obj2 = null;
        }
        if (!C52711k.m112239a((Object) cls, obj2)) {
            return false;
        }
        if (obj != null) {
            Music music = this.topMusic;
            if (music != null) {
                obj3 = Long.valueOf(music.getId());
            } else {
                obj3 = null;
            }
            RankingListCover rankingListCover = (RankingListCover) obj;
            Music music2 = rankingListCover.topMusic;
            if (music2 != null) {
                obj4 = Long.valueOf(music2.getId());
            } else {
                obj4 = null;
            }
            if (!C52711k.m112239a(obj3, obj4)) {
                return false;
            }
            User user = this.topStar;
            if (user != null) {
                obj5 = user.getUid();
            } else {
                obj5 = null;
            }
            User user2 = rankingListCover.topStar;
            if (user2 != null) {
                obj6 = user2.getUid();
            } else {
                obj6 = null;
            }
            if (!C52711k.m112239a(obj5, obj6)) {
                return false;
            }
            C25563g gVar = this.topGoods;
            if (gVar != null) {
                obj7 = gVar.getTitle();
            } else {
                obj7 = null;
            }
            C25563g gVar2 = rankingListCover.topGoods;
            if (gVar2 != null) {
                str = gVar2.getTitle();
            }
            if (!C52711k.m112239a(obj7, (Object) str)) {
                return false;
            }
            return true;
        }
        throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.model.RankingListCover");
    }
}
