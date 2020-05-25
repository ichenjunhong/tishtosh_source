package com.p683ss.android.ugc.aweme.services.external.p2130ui;

import com.p683ss.android.ugc.aweme.shortvideo.reaction.ReactionParams;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.services.external.ui.ReactConfig */
public final class ReactConfig {
    private final int minDuration;
    private final String originVideo;
    private final String outputDir;
    private final ReactionParams params;

    public final int getMinDuration() {
        return this.minDuration;
    }

    public final String getOriginVideo() {
        return this.originVideo;
    }

    public final String getOutputDir() {
        return this.outputDir;
    }

    public final ReactionParams getParams() {
        return this.params;
    }

    public ReactConfig(String str, String str2, ReactionParams reactionParams, int i) {
        C52711k.m112240b(str, "originVideo");
        C52711k.m112240b(str2, "outputDir");
        C52711k.m112240b(reactionParams, "params");
        this.originVideo = str;
        this.outputDir = str2;
        this.params = reactionParams;
        this.minDuration = i;
    }
}
