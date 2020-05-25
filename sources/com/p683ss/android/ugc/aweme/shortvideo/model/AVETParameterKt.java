package com.p683ss.android.ugc.aweme.shortvideo.model;

import android.content.Intent;
import java.io.Serializable;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.model.AVETParameterKt */
public final class AVETParameterKt {
    public static final AVETParameter generateAVETParam(Intent intent) {
        C52711k.m112240b(intent, "intent");
        if (intent.getSerializableExtra("av_et_parameter") != null) {
            Serializable serializableExtra = intent.getSerializableExtra("av_et_parameter");
            if (serializableExtra != null) {
                return (AVETParameter) serializableExtra;
            }
            throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.model.AVETParameter");
        }
        AVETParameter aVETParameter = new AVETParameter();
        String stringExtra = intent.getStringExtra("creation_id");
        if (stringExtra == null) {
            stringExtra = "";
        }
        aVETParameter.setCreationId(stringExtra);
        aVETParameter.setDraftId(intent.getIntExtra("draft_id", 0));
        String stringExtra2 = intent.getStringExtra("shoot_way");
        if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        aVETParameter.setShootWay(stringExtra2);
        aVETParameter.setShootMode(intent.getIntExtra("shoot_mode", 0));
        if (intent.hasExtra("content_type")) {
            String stringExtra3 = intent.getStringExtra("content_type");
            C52711k.m112236a((Object) stringExtra3, "intent.getStringExtra(EXTRA_CONTENT_TYPE)");
            aVETParameter.setContentType(stringExtra3);
        }
        if (intent.hasExtra("content_source")) {
            String stringExtra4 = intent.getStringExtra("content_source");
            C52711k.m112236a((Object) stringExtra4, "intent.getStringExtra(EXTRA_CONTENT_SOURCE)");
            aVETParameter.setContentSource(stringExtra4);
        }
        return aVETParameter;
    }
}
