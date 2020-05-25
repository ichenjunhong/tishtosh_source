package com.twitter.sdk.android.core.services;

import com.twitter.sdk.android.core.models.C52213q;
import p2666g.C53061b;
import p2666g.p2672c.C53075f;
import p2666g.p2672c.C53089t;

public interface AccountService {
    @C53075f(mo110603a = "/1.1/account/verify_credentials.json")
    C53061b<C52213q> verifyCredentials(@C53089t(mo110619a = "include_entities") Boolean bool, @C53089t(mo110619a = "skip_status") Boolean bool2, @C53089t(mo110619a = "include_email") Boolean bool3);
}
