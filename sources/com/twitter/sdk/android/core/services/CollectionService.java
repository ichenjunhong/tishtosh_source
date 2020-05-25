package com.twitter.sdk.android.core.services;

import p2666g.C53061b;
import p2666g.p2672c.C53075f;
import p2666g.p2672c.C53089t;

public interface CollectionService {
    @C53075f(mo110603a = "/1.1/collections/entries.json?tweet_mode=extended&include_cards=true&cards_platform=TwitterKit-13")
    C53061b<Object> collection(@C53089t(mo110619a = "id") String str, @C53089t(mo110619a = "count") Integer num, @C53089t(mo110619a = "max_position") Long l, @C53089t(mo110619a = "min_position") Long l2);
}
