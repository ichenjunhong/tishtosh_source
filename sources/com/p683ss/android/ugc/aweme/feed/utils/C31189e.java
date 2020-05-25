package com.p683ss.android.ugc.aweme.feed.utils;

import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.BitRate;
import com.p683ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.p683ss.android.ugc.p2419d.p2420a.p2421a.p2422a.p2423a.C48525c;

/* renamed from: com.ss.android.ugc.aweme.feed.utils.e */
public final class C31189e {
    /* renamed from: a */
    public static int m72826a(Aweme aweme) {
        int i = 0;
        if (aweme == null || aweme.getVideo() == null) {
            return 0;
        }
        try {
            int b = m72828b(aweme.getVideo().getPlayAddr());
            if (b != -1) {
                i = b;
            }
        } catch (Exception unused) {
        }
        return i;
    }

    /* renamed from: b */
    public static int m72828b(VideoUrlModel videoUrlModel) {
        Integer num;
        if (videoUrlModel == null) {
            return -1;
        }
        C48525c hitBitrate = videoUrlModel.getHitBitrate();
        if (hitBitrate == null) {
            num = null;
        } else {
            num = Integer.valueOf(hitBitrate.getQualityType());
        }
        if (num == null) {
            num = Integer.valueOf(-1);
        }
        return num.intValue();
    }

    /* renamed from: a */
    public static Integer m72827a(VideoUrlModel videoUrlModel) {
        if (videoUrlModel != null && videoUrlModel.getHitBitrate() != null) {
            return Integer.valueOf(videoUrlModel.getHitBitrate().getBitRate());
        }
        if (videoUrlModel == null || videoUrlModel.getBitRate() == null || videoUrlModel.getBitRate().size() <= 0) {
            return null;
        }
        return Integer.valueOf(((BitRate) videoUrlModel.getBitRate().get(0)).getBitRate());
    }
}
