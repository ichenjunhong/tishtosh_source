package com.p683ss.android.ugc.aweme.video.preload.model;

import com.google.gson.p1076a.C17952c;
import java.util.Collections;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.video.preload.model.PreloadStrategyConfig */
public class PreloadStrategyConfig {
    @C17952c(mo34828a = "network_lower")
    private long networkLower;
    @C17952c(mo34828a = "network_upper")
    private long networkUpper;
    @C17952c(mo34828a = "tasks")
    public List<PreloadTask> tasks;

    /* renamed from: com.ss.android.ugc.aweme.video.preload.model.PreloadStrategyConfig$a */
    static class C48112a {

        /* renamed from: a */
        public static final PreloadStrategyConfig f120919a;

        static {
            PreloadStrategyConfig preloadStrategyConfig = new PreloadStrategyConfig();
            f120919a = preloadStrategyConfig;
            preloadStrategyConfig.tasks = Collections.singletonList(new PreloadTask());
        }
    }

    public static PreloadStrategyConfig getDefault() {
        return C48112a.f120919a;
    }

    public long getNetworkLower() {
        return this.networkLower;
    }

    public long getNetworkUpper() {
        return this.networkUpper;
    }

    public List<PreloadTask> getTasks() {
        if (this.tasks == null) {
            this.tasks = Collections.emptyList();
        }
        return this.tasks;
    }

    public void clearFlag() {
        if (this.tasks != null) {
            for (PreloadTask preloadTask : this.tasks) {
                preloadTask.alreadyPreload = false;
            }
        }
    }

    public static PreloadStrategyConfig convertOldConfig(int i, int i2) {
        PreloadStrategyConfig preloadStrategyConfig = new PreloadStrategyConfig();
        preloadStrategyConfig.tasks = Collections.singletonList(new PreloadTask(i, i2));
        return preloadStrategyConfig;
    }
}
