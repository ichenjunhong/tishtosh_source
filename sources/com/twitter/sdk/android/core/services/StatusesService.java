package com.twitter.sdk.android.core.services;

import com.twitter.sdk.android.core.models.C52209m;
import java.util.List;
import p2666g.C53061b;
import p2666g.p2672c.C53072c;
import p2666g.p2672c.C53074e;
import p2666g.p2672c.C53075f;
import p2666g.p2672c.C53084o;
import p2666g.p2672c.C53088s;
import p2666g.p2672c.C53089t;

public interface StatusesService {
    @C53084o(mo110612a = "/1.1/statuses/destroy/{id}.json?tweet_mode=extended&include_cards=true&cards_platform=TwitterKit-13")
    @C53074e
    C53061b<C52209m> destroy(@C53088s(mo110617a = "id") Long l, @C53072c(mo110600a = "trim_user") Boolean bool);

    @C53075f(mo110603a = "/1.1/statuses/home_timeline.json?tweet_mode=extended&include_cards=true&cards_platform=TwitterKit-13")
    C53061b<List<C52209m>> homeTimeline(@C53089t(mo110619a = "count") Integer num, @C53089t(mo110619a = "since_id") Long l, @C53089t(mo110619a = "max_id") Long l2, @C53089t(mo110619a = "trim_user") Boolean bool, @C53089t(mo110619a = "exclude_replies") Boolean bool2, @C53089t(mo110619a = "contributor_details") Boolean bool3, @C53089t(mo110619a = "include_entities") Boolean bool4);

    @C53075f(mo110603a = "/1.1/statuses/lookup.json?tweet_mode=extended&include_cards=true&cards_platform=TwitterKit-13")
    C53061b<List<C52209m>> lookup(@C53089t(mo110619a = "id") String str, @C53089t(mo110619a = "include_entities") Boolean bool, @C53089t(mo110619a = "trim_user") Boolean bool2, @C53089t(mo110619a = "map") Boolean bool3);

    @C53075f(mo110603a = "/1.1/statuses/mentions_timeline.json?tweet_mode=extended&include_cards=true&cards_platform=TwitterKit-13")
    C53061b<List<C52209m>> mentionsTimeline(@C53089t(mo110619a = "count") Integer num, @C53089t(mo110619a = "since_id") Long l, @C53089t(mo110619a = "max_id") Long l2, @C53089t(mo110619a = "trim_user") Boolean bool, @C53089t(mo110619a = "contributor_details") Boolean bool2, @C53089t(mo110619a = "include_entities") Boolean bool3);

    @C53084o(mo110612a = "/1.1/statuses/retweet/{id}.json?tweet_mode=extended&include_cards=true&cards_platform=TwitterKit-13")
    @C53074e
    C53061b<C52209m> retweet(@C53088s(mo110617a = "id") Long l, @C53072c(mo110600a = "trim_user") Boolean bool);

    @C53075f(mo110603a = "/1.1/statuses/retweets_of_me.json?tweet_mode=extended&include_cards=true&cards_platform=TwitterKit-13")
    C53061b<List<C52209m>> retweetsOfMe(@C53089t(mo110619a = "count") Integer num, @C53089t(mo110619a = "since_id") Long l, @C53089t(mo110619a = "max_id") Long l2, @C53089t(mo110619a = "trim_user") Boolean bool, @C53089t(mo110619a = "include_entities") Boolean bool2, @C53089t(mo110619a = "include_user_entities") Boolean bool3);

    @C53075f(mo110603a = "/1.1/statuses/show.json?tweet_mode=extended&include_cards=true&cards_platform=TwitterKit-13")
    C53061b<C52209m> show(@C53089t(mo110619a = "id") Long l, @C53089t(mo110619a = "trim_user") Boolean bool, @C53089t(mo110619a = "include_my_retweet") Boolean bool2, @C53089t(mo110619a = "include_entities") Boolean bool3);

    @C53084o(mo110612a = "/1.1/statuses/unretweet/{id}.json?tweet_mode=extended&include_cards=true&cards_platform=TwitterKit-13")
    @C53074e
    C53061b<C52209m> unretweet(@C53088s(mo110617a = "id") Long l, @C53072c(mo110600a = "trim_user") Boolean bool);

    @C53084o(mo110612a = "/1.1/statuses/update.json?tweet_mode=extended&include_cards=true&cards_platform=TwitterKit-13")
    @C53074e
    C53061b<C52209m> update(@C53072c(mo110600a = "status") String str, @C53072c(mo110600a = "in_reply_to_status_id") Long l, @C53072c(mo110600a = "possibly_sensitive") Boolean bool, @C53072c(mo110600a = "lat") Double d, @C53072c(mo110600a = "long") Double d2, @C53072c(mo110600a = "place_id") String str2, @C53072c(mo110600a = "display_coordinates") Boolean bool2, @C53072c(mo110600a = "trim_user") Boolean bool3, @C53072c(mo110600a = "media_ids") String str3);

    @C53075f(mo110603a = "/1.1/statuses/user_timeline.json?tweet_mode=extended&include_cards=true&cards_platform=TwitterKit-13")
    C53061b<List<C52209m>> userTimeline(@C53089t(mo110619a = "user_id") Long l, @C53089t(mo110619a = "screen_name") String str, @C53089t(mo110619a = "count") Integer num, @C53089t(mo110619a = "since_id") Long l2, @C53089t(mo110619a = "max_id") Long l3, @C53089t(mo110619a = "trim_user") Boolean bool, @C53089t(mo110619a = "exclude_replies") Boolean bool2, @C53089t(mo110619a = "contributor_details") Boolean bool3, @C53089t(mo110619a = "include_rts") Boolean bool4);
}
