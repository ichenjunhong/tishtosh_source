package com.p683ss.android.ugc.aweme.opensdk.p2038a;

import com.google.gson.p1076a.C17952c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.opensdk.a.a */
public final class C38484a implements Serializable {
    @C17952c(mo34828a = "base")

    /* renamed from: a */
    private final C38486b f97905a;
    @C17952c(mo34828a = "anchor")

    /* renamed from: b */
    private final C38485a f97906b;
    @C17952c(mo34828a = "share")

    /* renamed from: c */
    private final C38487c f97907c;

    /* renamed from: com.ss.android.ugc.aweme.opensdk.a.a$a */
    public static final class C38485a implements Serializable {
        @C17952c(mo34828a = "name")

        /* renamed from: a */
        private final String f97908a;
        @C17952c(mo34828a = "icon")

        /* renamed from: b */
        private final String f97909b;
        @C17952c(mo34828a = "url")

        /* renamed from: c */
        private final String f97910c;

        public final String getIcon() {
            return this.f97909b;
        }

        public final String getName() {
            return this.f97908a;
        }

        public final String getUrl() {
            return this.f97910c;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.opensdk.a.a$b */
    public static final class C38486b implements Serializable {
        @C17952c(mo34828a = "client_key")

        /* renamed from: a */
        private final String f97911a;
        @C17952c(mo34828a = "app_name")

        /* renamed from: b */
        private final String f97912b;
        @C17952c(mo34828a = "app_icon")

        /* renamed from: c */
        private final String f97913c;

        public final String getAppIcon() {
            return this.f97913c;
        }

        public final String getAppName() {
            return this.f97912b;
        }

        public final String getClientKey() {
            return this.f97911a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.opensdk.a.a$c */
    public static final class C38487c implements Serializable {
        @C17952c(mo34828a = "share_id")

        /* renamed from: a */
        private final String f97914a;
        @C17952c(mo34828a = "style_id")

        /* renamed from: b */
        private final String f97915b;

        public final String getShareId() {
            return this.f97914a;
        }

        public final String getStyleId() {
            return this.f97915b;
        }
    }

    public final C38485a getAnchorInfo() {
        return this.f97906b;
    }

    public final C38486b getBaseInfo() {
        return this.f97905a;
    }

    public final C38487c getShareInfo() {
        return this.f97907c;
    }
}
