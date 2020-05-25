package com.p683ss.android.ugc.aweme.discover.mixfeed;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.discover.model.BannerInfo;
import com.p683ss.android.ugc.aweme.discover.model.NavInfo;
import com.p683ss.android.ugc.aweme.discover.model.Stat;
import com.p683ss.android.ugc.aweme.discover.model.Tag;
import com.p683ss.android.ugc.aweme.discover.model.ViewMoreStat;
import com.p683ss.android.ugc.aweme.live.model.C36142c;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.j */
public final class C28328j {
    @C17952c(mo34828a = "banner_info")

    /* renamed from: a */
    public BannerInfo f74311a;
    @C17952c(mo34828a = "nav_info")

    /* renamed from: b */
    public NavInfo f74312b;
    @C17952c(mo34828a = "tag_info")

    /* renamed from: c */
    public List<Tag> f74313c;
    @C17952c(mo34828a = "stats_info")

    /* renamed from: d */
    public List<Stat> f74314d;
    @C17952c(mo34828a = "stats_title")

    /* renamed from: e */
    public List<String> f74315e;
    @C17952c(mo34828a = "stats_view_more")

    /* renamed from: f */
    public ViewMoreStat f74316f;
    @C17952c(mo34828a = "update_time")

    /* renamed from: g */
    public String f74317g;
    @C17952c(mo34828a = "doc_id")

    /* renamed from: h */
    public String f74318h;
    @C17952c(mo34828a = "ala_src")

    /* renamed from: i */
    public String f74319i;
    @C17952c(mo34828a = "data")

    /* renamed from: j */
    public List<C28323f> f74320j;
    @C17952c(mo34828a = "bg_color")

    /* renamed from: k */
    public String f74321k;
    @C17952c(mo34828a = "end_color")

    /* renamed from: l */
    public String f74322l;
    @C17952c(mo34828a = "epic_live_info")

    /* renamed from: m */
    public C36142c f74323m;

    /* renamed from: n */
    public int f74324n;

    /* renamed from: o */
    public int f74325o;
    @C17952c(mo34828a = "douyin_topic_display", mo34829b = {"douyin_movie_topic_display", "douyin_tv_topic_display", "douyin_series_topic_display"})

    /* renamed from: p */
    public C28371y f74326p;
    @C17952c(mo34828a = "douyin_movie_series_display")

    /* renamed from: q */
    public C28323f f74327q;

    /* renamed from: a */
    public final List<C28323f> mo56732a() {
        List<C28323f> list = this.f74320j;
        if (list != null) {
            for (C28323f fVar : list) {
                fVar.f74299b = this.f74324n;
                String str = this.f74318h;
                if (str == null) {
                    str = "";
                }
                C52711k.m112240b(str, "<set-?>");
                fVar.f74300c = str;
                fVar.f74301d = this.f74325o;
            }
        }
        return this.f74320j;
    }
}
