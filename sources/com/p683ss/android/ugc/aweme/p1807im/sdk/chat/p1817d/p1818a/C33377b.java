package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.p1817d.p1818a;

import com.google.gson.p1076a.C17952c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.d.a.b */
public class C33377b implements Serializable {
    @C17952c(mo34828a = "inner_image_config")

    /* renamed from: a */
    private C33378c f86550a;
    @C17952c(mo34828a = "public_image_config")

    /* renamed from: b */
    private C33378c f86551b;
    @C17952c(mo34828a = "extra")

    /* renamed from: c */
    private C33379d f86552c;

    public C33379d getExtraInfo() {
        return this.f86552c;
    }

    public C33378c getInnerImageConfig() {
        return this.f86550a;
    }

    public C33378c getPublicImageConfig() {
        return this.f86551b;
    }

    public void setExtraInfo(C33379d dVar) {
        this.f86552c = dVar;
    }

    public void setInnerImageConfig(C33378c cVar) {
        this.f86550a = cVar;
    }

    public void setPublicImageConfig(C33378c cVar) {
        this.f86551b = cVar;
    }
}
