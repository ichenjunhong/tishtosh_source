package com.p683ss.android.ugc.aweme.shortvideo.model;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.model.PublishBehaviorModel */
public final class PublishBehaviorModel {
    public final String code;
    public int idIndex = -1;
    public final String info;
    public final String publishId;
    public final String stage;
    public final long timeStamp;
    public final BehaviorType type;

    public final String getSimpleTime() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-HHmmss", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC+0"));
        String format = simpleDateFormat.format(new Date(this.timeStamp));
        C52711k.m112236a((Object) format, "SimpleDateFormat(\"dd-HHm…}.format(Date(timeStamp))");
        return format;
    }

    public PublishBehaviorModel(long j, String str, BehaviorType behaviorType, String str2, String str3, String str4) {
        C52711k.m112240b(str, "publishId");
        C52711k.m112240b(behaviorType, "type");
        C52711k.m112240b(str2, "stage");
        C52711k.m112240b(str3, "code");
        C52711k.m112240b(str4, "info");
        this.timeStamp = j;
        this.publishId = str;
        this.type = behaviorType;
        this.stage = str2;
        this.code = str3;
        this.info = str4;
    }
}
