package com.twitter.sdk.android.core.services;

import com.twitter.sdk.android.core.models.C52202i;
import okhttp3.C53500ac;
import p2666g.C53061b;
import p2666g.p2672c.C53081l;
import p2666g.p2672c.C53084o;
import p2666g.p2672c.C53086q;

public interface MediaService {
    @C53084o(mo110612a = "https://upload.twitter.com/1.1/media/upload.json")
    @C53081l
    C53061b<C52202i> upload(@C53086q(mo110614a = "media") C53500ac acVar, @C53086q(mo110614a = "media_data") C53500ac acVar2, @C53086q(mo110614a = "additional_owners") C53500ac acVar3);
}
