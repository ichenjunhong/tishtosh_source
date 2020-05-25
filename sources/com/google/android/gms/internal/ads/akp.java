package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.C14963ax;
import java.util.Map;

@C16299uq
public final class akp implements C15948hq<aib> {
    /* renamed from: a */
    public final /* synthetic */ void mo27606a(Object obj, Map map) {
        aib aib = (aib) obj;
        ams b = aib.mo28936b();
        if (b == null) {
            try {
                ams ams = new ams(aib, Float.parseFloat((String) map.get("duration")), "1".equals(map.get("customControlsAllowed")), "1".equals(map.get("clickToExpandAllowed")));
                aib.mo28932a(ams);
                b = ams;
            } catch (NullPointerException | NumberFormatException e) {
                abv.m32793b("Unable to parse videoMeta message.", e);
                C14963ax.m30834d().mo28588a(e, "VideoMetaGmsgHandler.onGmsg");
                return;
            }
        }
        float parseFloat = Float.parseFloat((String) map.get("duration"));
        boolean equals = "1".equals(map.get("muted"));
        float parseFloat2 = Float.parseFloat((String) map.get("currentTime"));
        int parseInt = Integer.parseInt((String) map.get("playbackState"));
        if (parseInt < 0 || 3 < parseInt) {
            parseInt = 0;
        }
        String str = (String) map.get("aspectRatio");
        float parseFloat3 = TextUtils.isEmpty(str) ? 0.0f : Float.parseFloat(str);
        if (abv.m32791a(3)) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 140);
            sb.append("Video Meta GMSG: currentTime : ");
            sb.append(parseFloat2);
            sb.append(" , duration : ");
            sb.append(parseFloat);
            sb.append(" , isMuted : ");
            sb.append(equals);
            sb.append(" , playbackState : ");
            sb.append(parseInt);
            sb.append(" , aspectRatio : ");
            sb.append(str);
            abv.m32792b(sb.toString());
        }
        b.mo29348a(parseFloat2, parseFloat, parseInt, equals, parseFloat3);
    }
}
