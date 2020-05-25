package com.p683ss.android.ugc.aweme.commercialize.model;

import com.bytedance.p879t.p881b.C13235c;
import com.bytedance.p879t.p881b.C13239g;
import com.google.gson.p1076a.C17952c;
import java.io.Serializable;
import java.util.LinkedList;
import java.util.Set;

/* renamed from: com.ss.android.ugc.aweme.commercialize.model.v */
public final class C26142v implements Serializable {
    @C17952c(mo34828a = "static_resource")

    /* renamed from: a */
    private Set<String> f69028a;
    @C17952c(mo34828a = "icon_view_tracking")

    /* renamed from: b */
    private Set<String> f69029b;
    @C17952c(mo34828a = "icon_click")

    /* renamed from: c */
    private C26143a f69030c;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.model.v$a */
    public static class C26143a implements Serializable {
        @C17952c(mo34828a = "click_through")

        /* renamed from: a */
        private String f69031a;
        @C17952c(mo34828a = "click_tracking")

        /* renamed from: b */
        private Set<String> f69032b;

        public final String getClickThrough() {
            return this.f69031a;
        }

        public final Set<String> getClickTracking() {
            return this.f69032b;
        }

        public final C13239g toVideoClick() {
            C13239g gVar = new C13239g();
            gVar.clickThrough = this.f69031a;
            gVar.clickTracking = this.f69032b;
            return gVar;
        }

        public final void setClickThrough(String str) {
            this.f69031a = str;
        }

        public final void setClickTracking(Set<String> set) {
            this.f69032b = set;
        }
    }

    public final C26143a getIconClick() {
        return this.f69030c;
    }

    public final Set<String> getStaticResource() {
        return this.f69028a;
    }

    public final Set<String> getViewTracking() {
        return this.f69029b;
    }

    public final void setIconClick(C26143a aVar) {
        this.f69030c = aVar;
    }

    public final void setStaticResource(Set<String> set) {
        this.f69028a = set;
    }

    public final void setViewTracking(Set<String> set) {
        this.f69029b = set;
    }

    public final C13235c toIcon(String str) {
        C13235c cVar = new C13235c();
        cVar.program = str;
        cVar.staticResource = this.f69028a;
        cVar.viewTracking = this.f69029b;
        if (this.f69030c != null) {
            cVar.clickList = new LinkedList();
            cVar.clickList.add(this.f69030c.toVideoClick());
        }
        return cVar;
    }
}
