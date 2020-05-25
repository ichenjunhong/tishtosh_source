package com.p683ss.android.ugc.aweme.discover.mixfeed;

import com.bytedance.common.utility.p522b.C9376b;
import com.google.gson.p1076a.C17951b;
import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.utils.C23722i;
import com.p683ss.android.ugc.aweme.comment.model.Comment;
import com.p683ss.android.ugc.aweme.commercialize.model.C26110ae;
import com.p683ss.android.ugc.aweme.commercialize.model.C26114ah;
import com.p683ss.android.ugc.aweme.discover.alading.C28047l;
import com.p683ss.android.ugc.aweme.discover.model.RelatedSearchWordItem;
import com.p683ss.android.ugc.aweme.discover.model.SearchCarBrandAladdin;
import com.p683ss.android.ugc.aweme.discover.model.SearchCarModelAladdin;
import com.p683ss.android.ugc.aweme.discover.model.SearchChallenge;
import com.p683ss.android.ugc.aweme.discover.model.SearchCommodity;
import com.p683ss.android.ugc.aweme.discover.model.SearchHomeStay;
import com.p683ss.android.ugc.aweme.discover.model.SearchMovie;
import com.p683ss.android.ugc.aweme.discover.model.SearchMusicAladdin;
import com.p683ss.android.ugc.aweme.discover.model.SearchOperationInfo;
import com.p683ss.android.ugc.aweme.discover.model.SearchPoi;
import com.p683ss.android.ugc.aweme.discover.model.SearchUser;
import com.p683ss.android.ugc.aweme.discover.model.SearchXiGuaVideo;
import com.p683ss.android.ugc.aweme.discover.model.suggest.RecommendWordMob;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.LogPbBean;
import com.p683ss.android.ugc.aweme.miniapp_api.model.C36966e;
import com.p683ss.android.ugc.aweme.model.TextExtraStruct;
import com.p683ss.android.ugc.aweme.music.model.Music;
import com.p683ss.android.ugc.aweme.newfollow.p1998e.C37858a;
import com.p683ss.android.ugc.aweme.newfollow.p1998e.C37859b;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p683ss.android.ugc.aweme.p1308ad.p1314e.p1318d.C22403c;
import com.p683ss.android.ugc.aweme.search.model.C41438c;
import com.p683ss.android.ugc.aweme.search.model.C41439d;
import com.p683ss.android.ugc.aweme.search.model.C41442g;
import com.p683ss.android.ugc.aweme.utils.StringJsonAdapterFactory;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.l */
public class C28333l extends C37859b {
    @C17951b(mo34826a = StringJsonAdapterFactory.class)
    @C17952c(mo34828a = "ad_data")

    /* renamed from: A */
    public C26110ae f74335A;
    @C17952c(mo34828a = "ad_module_info")

    /* renamed from: B */
    public C22403c f74336B;
    @C17952c(mo34828a = "words_query_record")

    /* renamed from: C */
    public RecommendWordMob f74337C;
    @C17952c(mo34828a = "commerce_info")

    /* renamed from: D */
    public List<C26114ah> f74338D;
    @C17952c(mo34828a = "props")

    /* renamed from: E */
    public C41439d f74339E;
    @C17952c(mo34828a = "photo_template")

    /* renamed from: F */
    public C41438c f74340F;
    @C17952c(mo34828a = "collection_live")

    /* renamed from: G */
    public C41442g f74341G;

    /* renamed from: H */
    public LogPbBean f74342H;

    /* renamed from: I */
    public transient boolean f74343I;

    /* renamed from: J */
    public transient int f74344J;
    @C17952c(mo34828a = "type")

    /* renamed from: K */
    private int f74345K;
    @C17952c(mo34828a = "aweme_info")

    /* renamed from: L */
    private Aweme f74346L;
    @C17952c(mo34828a = "comment_list")

    /* renamed from: M */
    private List<Comment> f74347M;

    /* renamed from: a */
    public String f74348a;
    @C17952c(mo34828a = "user_list")

    /* renamed from: b */
    public List<SearchUser> f74349b;
    @C17952c(mo34828a = "hotspot_info")

    /* renamed from: c */
    public C28047l f74350c;
    @C17952c(mo34828a = "module_list")

    /* renamed from: d */
    public C28344t f74351d;
    @C17952c(mo34828a = "relate_list")

    /* renamed from: e */
    public C28369w f74352e;
    @C17952c(mo34828a = "music_list")

    /* renamed from: f */
    public List<Music> f74353f;
    @C17952c(mo34828a = "challenge_list")

    /* renamed from: g */
    public List<SearchChallenge> f74354g;
    @C17952c(mo34828a = "has_top_user")

    /* renamed from: h */
    public boolean f74355h;
    @C17952c(mo34828a = "article_list")

    /* renamed from: i */
    public List<C37858a> f74356i;
    @C17952c(mo34828a = "related_word_list")

    /* renamed from: j */
    public List<RelatedSearchWordItem> f74357j;
    @C17952c(mo34828a = "poi_info_list")

    /* renamed from: k */
    public List<SearchPoi> f74358k;
    @C17952c(mo34828a = "micro_app_info")

    /* renamed from: l */
    public C36966e f74359l;
    @C17952c(mo34828a = "goods_list")

    /* renamed from: m */
    public List<SearchCommodity> f74360m;
    @C17952c(mo34828a = "movie_info")

    /* renamed from: n */
    public SearchMovie f74361n;
    @C17952c(mo34828a = "card_info")

    /* renamed from: o */
    public C28328j f74362o;
    @C17952c(mo34828a = "car_brand")

    /* renamed from: p */
    public SearchCarBrandAladdin f74363p;
    @C17952c(mo34828a = "car_model")

    /* renamed from: q */
    public SearchCarModelAladdin f74364q;
    @C17952c(mo34828a = "music")

    /* renamed from: r */
    public SearchMusicAladdin f74365r;
    @C17952c(mo34828a = "dynamic_type")

    /* renamed from: s */
    public int f74366s;
    @C17952c(mo34828a = "dynamic_patch")

    /* renamed from: t */
    public C28322e f74367t;
    @C17952c(mo34828a = "activity_info")

    /* renamed from: u */
    public SearchOperationInfo f74368u;
    @C17952c(mo34828a = "has_more_goods")

    /* renamed from: v */
    public boolean f74369v;
    @C17952c(mo34828a = "xigua_video_list")

    /* renamed from: w */
    public List<SearchXiGuaVideo> f74370w;
    @C17952c(mo34828a = "hotel_info")

    /* renamed from: x */
    public SearchHomeStay f74371x;
    @C17952c(mo34828a = "aweme_mix_info")

    /* renamed from: y */
    public C28327i f74372y;
    @C17952c(mo34828a = "view_more")

    /* renamed from: z */
    public boolean f74373z = true;

    public Aweme getAweme() {
        return this.f74346L;
    }

    public boolean needUpdateComment() {
        return true;
    }

    /* renamed from: a */
    public final boolean mo56735a() {
        if (this.f74345K == 1) {
            return true;
        }
        return false;
    }

    public List<Comment> getCommentList() {
        if (this.f74347M == null || this.f74346L == null || !this.f74346L.getAwemeControl().canShowComment()) {
            this.f74347M = new ArrayList();
        }
        return this.f74347M;
    }

    public int getFeedType() {
        int i = this.f74345K;
        if (i != 40) {
            if (i == 102) {
                return 1048080;
            }
            if (i == Integer.MAX_VALUE) {
                return 65462;
            }
            switch (i) {
                case 1:
                    if (getAweme() == null || !getAweme().isLive()) {
                        return 65280;
                    }
                    return 100;
                case 2:
                    return 65456;
                case 3:
                    return 65457;
                case 4:
                    return 65458;
                case 5:
                    return TextExtraStruct.TYPE_CUSTOM_SEARCH_CAPTION;
                case 6:
                    return 65459;
                case 7:
                    return 65460;
                case 8:
                    return 65461;
                case 9:
                    return 65463;
                case 10:
                    return 65464;
                case 11:
                    return 65466;
                case 12:
                    return 65467;
                case 13:
                    return 65468;
                case 14:
                    return 65469;
                case 15:
                    return 65471;
                case 16:
                    return 65470;
                default:
                    switch (i) {
                        case 19:
                            return 65472;
                        case 20:
                            return 65504;
                        case 21:
                            return 65505;
                        case 22:
                            return 65506;
                        default:
                            switch (i) {
                                case 25:
                                    return 65510;
                                case BaseNotice.STORY_NOTICE_COMMENT /*26*/:
                                    return 65511;
                                case BaseNotice.STORY_NOTICE_UPDATE /*27*/:
                                    return 65512;
                                case 28:
                                    return 65508;
                                default:
                                    switch (i) {
                                        case 998:
                                            if (this.f74362o != null) {
                                                return 998;
                                            }
                                            return -1;
                                        case 999:
                                            return 65514;
                                        default:
                                            return this.f74345K;
                                    }
                            }
                    }
            }
        } else if (this.f74341G == null || this.f74341G.f105063a == null) {
            return -1;
        } else {
            return 40;
        }
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19 = this.f74345K * 31;
        int i20 = 0;
        if (this.f74346L != null) {
            i = this.f74346L.hashCode();
        } else {
            i = 0;
        }
        int i21 = (i19 + i) * 31;
        if (this.f74349b != null) {
            i2 = this.f74349b.hashCode();
        } else {
            i2 = 0;
        }
        int i22 = (i21 + i2) * 31;
        if (this.f74353f != null) {
            i3 = this.f74353f.hashCode();
        } else {
            i3 = 0;
        }
        int i23 = (i22 + i3) * 31;
        if (this.f74354g != null) {
            i4 = this.f74354g.hashCode();
        } else {
            i4 = 0;
        }
        int i24 = (i23 + i4) * 31;
        if (this.f74356i != null) {
            i5 = this.f74356i.hashCode();
        } else {
            i5 = 0;
        }
        int i25 = (i24 + i5) * 31;
        if (this.f74357j != null) {
            i6 = this.f74357j.hashCode();
        } else {
            i6 = 0;
        }
        int i26 = (i25 + i6) * 31;
        if (this.f74358k != null) {
            i7 = this.f74358k.hashCode();
        } else {
            i7 = 0;
        }
        int i27 = (i26 + i7) * 31;
        if (this.f74359l != null) {
            i8 = this.f74359l.hashCode();
        } else {
            i8 = 0;
        }
        int i28 = (i27 + i8) * 31;
        if (this.f74360m != null) {
            i9 = this.f74360m.hashCode();
        } else {
            i9 = 0;
        }
        int i29 = (i28 + i9) * 31;
        if (this.f74361n != null) {
            i10 = this.f74361n.hashCode();
        } else {
            i10 = 0;
        }
        int i30 = (i29 + i10) * 31;
        if (this.f74370w != null) {
            i11 = this.f74370w.hashCode();
        } else {
            i11 = 0;
        }
        int i31 = (i30 + i11) * 31;
        if (this.f74335A != null) {
            i12 = this.f74335A.hashCode();
        } else {
            i12 = 0;
        }
        int i32 = (i31 + i12) * 31;
        if (this.f74338D != null) {
            i13 = this.f74338D.hashCode();
        } else {
            i13 = 0;
        }
        int i33 = (i32 + i13) * 31;
        if (this.f74338D != null) {
            i14 = this.f74338D.hashCode();
        } else {
            i14 = 0;
        }
        int i34 = (i33 + i14) * 31;
        if (this.f74363p != null) {
            i15 = this.f74363p.hashCode();
        } else {
            i15 = 0;
        }
        int i35 = (i34 + i15) * 31;
        if (this.f74364q != null) {
            i16 = this.f74364q.hashCode();
        } else {
            i16 = 0;
        }
        int i36 = (i35 + i16) * 31;
        if (this.f74367t != null) {
            i17 = this.f74367t.hashCode();
        } else {
            i17 = 0;
        }
        int i37 = (i36 + i17) * 31;
        if (this.f74372y != null) {
            i18 = this.f74372y.hashCode();
        } else {
            i18 = 0;
        }
        int i38 = (i37 + i18) * 31;
        if (this.f74341G != null) {
            i20 = this.f74341G.hashCode();
        }
        return i38 + i20;
    }

    public void setAweme(Aweme aweme) {
        this.f74346L = aweme;
    }

    public void setCommentList(List<Comment> list) {
        this.f74347M = list;
    }

    public void setFeedType(int i) {
        this.f74345K = i;
    }

    /* renamed from: a */
    public final void mo56734a(String str) {
        if (this.f74358k != null) {
            for (SearchPoi searchPoi : this.f74358k) {
                searchPoi.logPb = str;
            }
        }
    }

    public void setRequestId(String str) {
        super.setRequestId(str);
        if (this.f74346L != null) {
            this.f74346L.setRequestId(str);
        }
        if (!C9376b.m18558a((Collection<T>) this.f74356i)) {
            for (C37858a aVar : this.f74356i) {
                if (aVar != null) {
                    aVar.f96373a = str;
                }
            }
        }
        if (this.f74361n != null && this.f74361n.getAweme() != null) {
            this.f74361n.getAweme().setRequestId(str);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28333l)) {
            return false;
        }
        C28333l lVar = (C28333l) obj;
        if (this.f74345K == lVar.f74345K && C23722i.m58215a(this.f74346L, lVar.f74346L) && C23722i.m58215a(this.f74349b, lVar.f74349b) && C23722i.m58215a(this.f74353f, lVar.f74353f) && C23722i.m58215a(this.f74354g, lVar.f74354g) && C23722i.m58215a(this.f74356i, lVar.f74356i) && C23722i.m58215a(this.f74357j, lVar.f74357j) && C23722i.m58215a(this.f74358k, lVar.f74358k) && C23722i.m58215a(this.f74359l, lVar.f74359l) && C23722i.m58215a(this.f74360m, lVar.f74360m) && C23722i.m58215a(this.f74361n, lVar.f74361n) && C23722i.m58215a(this.f74370w, lVar.f74370w) && C23722i.m58215a(this.f74338D, lVar.f74338D) && C23722i.m58215a(this.f74363p, lVar.f74363p) && C23722i.m58215a(this.f74364q, lVar.f74364q) && C23722i.m58215a(this.f74367t, lVar.f74367t) && C23722i.m58215a(this.f74372y, lVar.f74372y) && C23722i.m58215a(this.f74341G, lVar.f74341G)) {
            return C23722i.m58215a(this.f74335A, lVar.f74335A);
        }
        return false;
    }
}
