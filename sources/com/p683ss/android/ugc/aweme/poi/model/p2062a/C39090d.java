package com.p683ss.android.ugc.aweme.poi.model.p2062a;

import com.google.gson.p1076a.C17952c;
import java.io.Serializable;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.poi.model.a.d */
public final class C39090d implements Serializable {
    @C17952c(mo34828a = "title")

    /* renamed from: a */
    String f99691a;
    @C17952c(mo34828a = "description")

    /* renamed from: b */
    String f99692b;
    @C17952c(mo34828a = "epidemic_update_time")

    /* renamed from: c */
    String f99693c;
    @C17952c(mo34828a = "schema_title")

    /* renamed from: d */
    String f99694d;
    @C17952c(mo34828a = "epidemic_live")

    /* renamed from: e */
    C39091e f99695e;
    @C17952c(mo34828a = "epidemic_extension_list")

    /* renamed from: f */
    List<Object> f99696f;

    public final String getDescription() {
        return this.f99692b;
    }

    public final List<Object> getEpidemicExtensionList() {
        return this.f99696f;
    }

    public final C39091e getEpidemicLive() {
        return this.f99695e;
    }

    public final String getEpidemicUpdateTime() {
        return this.f99693c;
    }

    public final String getSchemaTitle() {
        return this.f99694d;
    }

    public final String getTitle() {
        return this.f99691a;
    }

    public final void setDescription(String str) {
        this.f99692b = str;
    }

    public final void setEpidemicLive(C39091e eVar) {
        this.f99695e = eVar;
    }

    public final void setEpidemicUpdateTime(String str) {
        this.f99693c = str;
    }

    public final void setSchemaTitle(String str) {
        this.f99694d = str;
    }

    public final void setTitle(String str) {
        this.f99691a = str;
    }
}
