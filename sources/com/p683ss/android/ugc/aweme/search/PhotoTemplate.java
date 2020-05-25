package com.p683ss.android.ugc.aweme.search;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.search.PhotoTemplate */
public class PhotoTemplate implements Serializable {
    @C17952c(mo34828a = "desc")
    public String desc;
    @C17952c(mo34828a = "icon")
    public UrlModel icon;
    @C17952c(mo34828a = "id")

    /* renamed from: id */
    public String f104954id;
    @C17952c(mo34828a = "name")
    public String name;
    @C17952c(mo34828a = "use_count")
    public int useCount;

    public String desc() {
        return this.desc;
    }

    public UrlModel icon() {
        return this.icon;
    }

    /* renamed from: id */
    public String mo84050id() {
        return this.f104954id;
    }

    public String name() {
        return this.name;
    }

    public int useCount() {
        return this.useCount;
    }
}
