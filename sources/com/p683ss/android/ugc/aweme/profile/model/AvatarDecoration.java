package com.p683ss.android.ugc.aweme.profile.model;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.profile.model.AvatarDecoration */
public class AvatarDecoration implements Serializable, Cloneable {
    @C17952c(mo34828a = "id")

    /* renamed from: id */
    public long f101819id;
    @C17952c(mo34828a = "name")
    public String name;
    @C17952c(mo34828a = "source_url")
    public UrlModel sourceUrl;

    public long getId() {
        return this.f101819id;
    }

    public String getName() {
        return this.name;
    }

    public UrlModel getSourceUrl() {
        return this.sourceUrl;
    }
}
