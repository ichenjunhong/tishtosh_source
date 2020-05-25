package com.p683ss.android.ugc.aweme.shortvideo.edit.audioeffect;

import android.text.TextUtils;
import com.p683ss.android.ttve.nativePort.TEVideoRecorder;
import com.p683ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p683ss.android.ugc.aweme.shortvideo.model.AVETParameter;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.g */
public final class C43379g {

    /* renamed from: a */
    public static final C43379g f109665a = new C43379g();

    private C43379g() {
    }

    /* renamed from: a */
    public static final String m95124a(String str, VideoPublishEditModel videoPublishEditModel) {
        C52711k.m112240b(str, "key");
        String str2 = "";
        int hashCode = str.hashCode();
        AVETParameter aVETParameter = null;
        if (hashCode != 502589089) {
            if (hashCode != 831846208) {
                if (hashCode == 2061724374 && str.equals("shoot_entrance")) {
                    if (videoPublishEditModel != null) {
                        aVETParameter = videoPublishEditModel.getAvetParameter();
                    }
                    if (aVETParameter != null) {
                        str2 = videoPublishEditModel.getAvetParameter().getStoryShootEntrance();
                    }
                }
            } else if (str.equals("content_type")) {
                if (videoPublishEditModel != null) {
                    aVETParameter = videoPublishEditModel.getAvetParameter();
                }
                if (aVETParameter != null) {
                    str2 = videoPublishEditModel.getAvetParameter().getContentType();
                }
            }
        } else if (str.equals("content_source")) {
            if (videoPublishEditModel != null) {
                aVETParameter = videoPublishEditModel.getAvetParameter();
            }
            if (aVETParameter != null) {
                str2 = videoPublishEditModel.getAvetParameter().getContentSource();
            }
        }
        if (str2 == null || TextUtils.equals(TEVideoRecorder.FACE_BEAUTY_NULL, str2)) {
            return "";
        }
        return str2;
    }
}
