package com.p683ss.android.ugc.tools.utils;

import com.p683ss.android.ugc.aweme.audiorecord.AudioRecorderParam;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.tools.utils.a */
public final class C50197a {
    /* renamed from: a */
    public static final String m108326a(AudioRecorderParam audioRecorderParam) {
        C52711k.m112240b(audioRecorderParam, "$this$getDraftAudioUrl");
        if (C52830p.m112413c(audioRecorderParam.getAudioUrl(), "df", false, 2, null)) {
            return audioRecorderParam.getAudioUrl();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(audioRecorderParam.getAudioUrl());
        sb.append("df");
        return sb.toString();
    }
}
