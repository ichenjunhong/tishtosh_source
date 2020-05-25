package com.twitter.sdk.android.core.services;

import com.twitter.sdk.android.core.services.p2619a.C52227a;
import p2666g.C53061b;
import p2666g.p2672c.C53075f;
import p2666g.p2672c.C53089t;

public interface SearchService {
    @C53075f(mo110603a = "/1.1/search/tweets.json?tweet_mode=extended&include_cards=true&cards_platform=TwitterKit-13")
    C53061b<Object> tweets(@C53089t(mo110619a = "q") String str, @C53089t(mo110619a = "geocode", mo110620b = true) C52227a aVar, @C53089t(mo110619a = "lang") String str2, @C53089t(mo110619a = "locale") String str3, @C53089t(mo110619a = "result_type") String str4, @C53089t(mo110619a = "count") Integer num, @C53089t(mo110619a = "until") String str5, @C53089t(mo110619a = "since_id") Long l, @C53089t(mo110619a = "max_id") Long l2, @C53089t(mo110619a = "include_entities") Boolean bool);
}
