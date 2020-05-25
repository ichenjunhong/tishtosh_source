package com.p683ss.android.ugc.aweme.commercialize.model;

import android.support.annotation.Keep;
import com.google.gson.p1076a.C17952c;
import p2628d.p2639f.p2641b.C52707g;

@Keep
/* renamed from: com.ss.android.ugc.aweme.commercialize.model.AwemeAdRankSettingsModel */
public final class AwemeAdRankSettingsModel {
    public static final C26104a Companion = new C26104a(null);
    public static final AwemeAdRankSettingsModel DEFAULT_DISABLE_VERSION = new AwemeAdRankSettingsModel(false, false, 2, null);
    @C17952c(mo34828a = "enable_upload_rerank_result")
    public final boolean enableUploadRerankResult;
    @C17952c(mo34828a = "enabled")
    public final boolean enabled;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.model.AwemeAdRankSettingsModel$a */
    public static final class C26104a {
        private C26104a() {
        }

        public /* synthetic */ C26104a(C52707g gVar) {
            this();
        }
    }

    public AwemeAdRankSettingsModel() {
        this(false, false, 3, null);
    }

    public final boolean getEnableUploadRerankResult() {
        return this.enableUploadRerankResult;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public AwemeAdRankSettingsModel(boolean z, boolean z2) {
        this.enabled = z;
        this.enableUploadRerankResult = z2;
    }

    public /* synthetic */ AwemeAdRankSettingsModel(boolean z, boolean z2, int i, C52707g gVar) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        this(z, z2);
    }
}
