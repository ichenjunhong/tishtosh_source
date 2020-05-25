package com.p683ss.android.ugc.aweme.challenge.recommend.p1499a;

import android.content.Context;
import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.commercialize.log.C26077e;
import com.p683ss.android.ugc.aweme.discover.model.Challenge;
import com.p683ss.android.ugc.aweme.video.hashtag.C48029c.C48030a;
import java.util.HashMap;

/* renamed from: com.ss.android.ugc.aweme.challenge.recommend.a.a */
public final class C24596a {
    @C17952c(mo34828a = "mark")

    /* renamed from: a */
    public int f65067a;
    @C17952c(mo34828a = "pos")

    /* renamed from: b */
    public int f65068b;
    @C17952c(mo34828a = "ch_info")

    /* renamed from: c */
    public Challenge f65069c;
    @C17952c(mo34828a = "ad_data")

    /* renamed from: d */
    public C24597a f65070d;

    /* renamed from: com.ss.android.ugc.aweme.challenge.recommend.a.a$a */
    public static class C24597a implements C48030a {
        @C17952c(mo34828a = "creative_id")

        /* renamed from: a */
        public long f65071a;
        @C17952c(mo34828a = "type")

        /* renamed from: b */
        public String f65072b;
        @C17952c(mo34828a = "log_extra")

        /* renamed from: c */
        public String f65073c;
        @C17952c(mo34828a = "is_preview")

        /* renamed from: d */
        public boolean f65074d;

        /* renamed from: a */
        public final void mo50415a(Context context, int i) {
            HashMap hashMap = new HashMap();
            hashMap.put("topic_order", Integer.valueOf(i + 1));
            C26077e.m63190a().mo53582a("launch_ad").mo53593b("show").mo53602g("topic").mo53604i(this.f65073c).mo53580a(Long.valueOf(this.f65071a)).mo53581a((Object) hashMap).mo53586a(context);
        }

        /* renamed from: b */
        public final void mo50416b(Context context, int i) {
            HashMap hashMap = new HashMap();
            hashMap.put("topic_order", Integer.valueOf(i + 1));
            C26077e.m63190a().mo53582a("launch_ad").mo53593b("click").mo53602g("topic").mo53604i(this.f65073c).mo53580a(Long.valueOf(this.f65071a)).mo53581a((Object) hashMap).mo53586a(context);
        }
    }
}
