package com.p683ss.android.ugc.aweme.services.external.p2130ui;

import java.io.Serializable;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.services.external.ui.PoiConfig */
public final class PoiConfig implements Serializable {
    private final String challengeId;
    private final String effect;
    private final String struct;

    public final String getChallengeId() {
        return this.challengeId;
    }

    public final String getEffect() {
        return this.effect;
    }

    public final String getStruct() {
        return this.struct;
    }

    public PoiConfig(String str, String str2, String str3) {
        C52711k.m112240b(str, "struct");
        this.struct = str;
        this.effect = str2;
        this.challengeId = str3;
    }
}
