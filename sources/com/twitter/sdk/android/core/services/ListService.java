package com.twitter.sdk.android.core.services;

import com.twitter.sdk.android.core.models.C52209m;
import java.util.List;
import p2666g.C53061b;
import p2666g.p2672c.C53075f;
import p2666g.p2672c.C53089t;

public interface ListService {
    @C53075f(mo110603a = "/1.1/lists/statuses.json?tweet_mode=extended&include_cards=true&cards_platform=TwitterKit-13")
    C53061b<List<C52209m>> statuses(@C53089t(mo110619a = "list_id") Long l, @C53089t(mo110619a = "slug") String str, @C53089t(mo110619a = "owner_screen_name") String str2, @C53089t(mo110619a = "owner_id") Long l2, @C53089t(mo110619a = "since_id") Long l3, @C53089t(mo110619a = "max_id") Long l4, @C53089t(mo110619a = "count") Integer num, @C53089t(mo110619a = "include_entities") Boolean bool, @C53089t(mo110619a = "include_rts") Boolean bool2);
}
