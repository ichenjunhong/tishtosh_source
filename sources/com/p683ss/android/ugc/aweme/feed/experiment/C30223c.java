package com.p683ss.android.ugc.aweme.feed.experiment;

import com.bytedance.ies.abmock.C10181b;
import com.p683ss.android.ugc.aweme.experiment.UnLoginDiggExperiment;
import com.p683ss.android.ugc.aweme.feed.model.FeedCompoundConfig;
import com.p683ss.android.ugc.aweme.video.preload.model.PreloadStrategyConfig;

/* renamed from: com.ss.android.ugc.aweme.feed.experiment.c */
public final class C30223c {
    /* renamed from: e */
    public static boolean m70964e() {
        if (m70965f() == null) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static int m70960a() {
        return C10181b.m20511a().mo18168a(UnLoginDiggExperiment.class, true, "unlogin_digg_limit", 31744, 0);
    }

    /* renamed from: b */
    public static int m70961b() {
        int c = m70962c();
        if (c == 1) {
            return 2;
        }
        if (c == 2) {
            return 3;
        }
        return Integer.MAX_VALUE;
    }

    /* renamed from: c */
    public static int m70962c() {
        int a = C10181b.m20511a().mo18168a(ShareGuideExperiment.class, true, "share_guide", 31744, 0);
        if (a < 0 || a > 2) {
            return 0;
        }
        return a;
    }

    /* renamed from: d */
    public static PreloadStrategyConfig m70963d() {
        PreloadStrategyConfig preloadStrategyConfig;
        try {
            preloadStrategyConfig = (PreloadStrategyConfig) C10181b.m20511a().mo18170a(PreloadStrategyConfigExperiment.class, true, "preload_strategy", 31744, PreloadStrategyConfig.class);
        } catch (Throwable unused) {
            preloadStrategyConfig = null;
        }
        if (preloadStrategyConfig == null) {
            return PreloadStrategyConfig.convertOldConfig(C10181b.m20511a().mo18168a(VideoPreloadNumberExperiment.class, true, "video_preload_number", 31744, 1), C10181b.m20511a().mo18168a(VideoPreloadSizeExperiment.class, true, "video_preload_size", 31744, (int) VideoPreloadSizeExperiment.DEFAULT));
        }
        return preloadStrategyConfig;
    }

    /* renamed from: f */
    public static FeedCompoundConfig m70965f() {
        FeedCompoundConfig[] feedCompoundConfigArr;
        FeedCompoundConfig feedCompoundConfig;
        try {
            feedCompoundConfigArr = (FeedCompoundConfig[]) C10181b.m20511a().mo18170a(FeedCompoundExperiment.class, true, "compound_request_setting", 31744, FeedCompoundConfig[].class);
        } catch (Throwable unused) {
            feedCompoundConfigArr = null;
        }
        if (feedCompoundConfigArr == null || feedCompoundConfigArr.length == 0) {
            return null;
        }
        try {
            feedCompoundConfig = feedCompoundConfigArr[0];
        } catch (Throwable unused2) {
            feedCompoundConfig = null;
        }
        if (feedCompoundConfig == null || feedCompoundConfig.isFeedCompoundClose()) {
            return null;
        }
        return feedCompoundConfig;
    }
}
