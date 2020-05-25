package com.twitter.sdk.android.core.services;

import com.twitter.sdk.android.core.models.C52209m;
import java.util.List;
import p2666g.C53061b;
import p2666g.p2672c.C53072c;
import p2666g.p2672c.C53074e;
import p2666g.p2672c.C53075f;
import p2666g.p2672c.C53084o;
import p2666g.p2672c.C53089t;

public interface FavoriteService {
    @C53084o(mo110612a = "/1.1/favorites/create.json?tweet_mode=extended&include_cards=true&cards_platform=TwitterKit-13")
    @C53074e
    C53061b<C52209m> create(@C53072c(mo110600a = "id") Long l, @C53072c(mo110600a = "include_entities") Boolean bool);

    @C53084o(mo110612a = "/1.1/favorites/destroy.json?tweet_mode=extended&include_cards=true&cards_platform=TwitterKit-13")
    @C53074e
    C53061b<C52209m> destroy(@C53072c(mo110600a = "id") Long l, @C53072c(mo110600a = "include_entities") Boolean bool);

    @C53075f(mo110603a = "/1.1/favorites/list.json?tweet_mode=extended&include_cards=true&cards_platform=TwitterKit-13")
    C53061b<List<C52209m>> list(@C53089t(mo110619a = "user_id") Long l, @C53089t(mo110619a = "screen_name") String str, @C53089t(mo110619a = "count") Integer num, @C53089t(mo110619a = "since_id") String str2, @C53089t(mo110619a = "max_id") String str3, @C53089t(mo110619a = "include_entities") Boolean bool);
}
