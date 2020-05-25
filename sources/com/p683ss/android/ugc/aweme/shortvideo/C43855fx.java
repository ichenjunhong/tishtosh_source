package com.p683ss.android.ugc.aweme.shortvideo;

import com.p683ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.fx */
public final class C43855fx {
    /* renamed from: a */
    public static final String m96288a(VideoPublishEditModel videoPublishEditModel) {
        if (videoPublishEditModel == null) {
            return "";
        }
        if (videoPublishEditModel.getAvetParameter() != null) {
            return videoPublishEditModel.getAvetParameter().getContentSource();
        }
        if (videoPublishEditModel.mFromCut || videoPublishEditModel.mFromMultiCut || videoPublishEditModel.isMvThemeVideoType()) {
            return "upload";
        }
        return "shoot";
    }

    /* renamed from: b */
    public static final String m96289b(VideoPublishEditModel videoPublishEditModel) {
        if (videoPublishEditModel == null) {
            return "";
        }
        if (videoPublishEditModel.isMvThemeVideoType()) {
            return "mv";
        }
        if (videoPublishEditModel.isCutSameVideoType()) {
            return "jianying_mv";
        }
        if (videoPublishEditModel.isStickPointMode) {
            return "sound_sync";
        }
        if (videoPublishEditModel.publishFromLiveScreenCapture()) {
            return "live_record";
        }
        if (videoPublishEditModel.publishFromLiveHighLight()) {
            return "live_highlight";
        }
        if (videoPublishEditModel.getAvetParameter() != null) {
            return videoPublishEditModel.getAvetParameter().getContentType();
        }
        return "video";
    }
}
