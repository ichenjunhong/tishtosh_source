package com.bytedance.android.livesdkapi.depend.live;

import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.app.C22835a.C22858c;

/* renamed from: com.bytedance.android.livesdkapi.depend.live.a */
public enum C8638a {
    FEED_WITH_PREVIEW("feed_with_preview"),
    FEED(C22858c.f61207c),
    FEED_SHORTCUT("feed_shortcut"),
    MOMENT("moment"),
    SLIDE("slide"),
    LIVE_END("live_end"),
    PUSH("push"),
    WEB("web"),
    OTHER("other");
    
    public final String typeName;

    public static C8638a convert(String str) {
        C8638a aVar = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        char c = 65535;
        switch (str.hashCode()) {
            case -1068531200:
                if (str.equals("moment")) {
                    c = 3;
                    break;
                }
                break;
            case 117588:
                if (str.equals("web")) {
                    c = 7;
                    break;
                }
                break;
            case 3138974:
                if (str.equals(C22858c.f61207c)) {
                    c = 1;
                    break;
                }
                break;
            case 3452698:
                if (str.equals("push")) {
                    c = 6;
                    break;
                }
                break;
            case 106069776:
                if (str.equals("other")) {
                    c = 8;
                    break;
                }
                break;
            case 109526449:
                if (str.equals("slide")) {
                    c = 4;
                    break;
                }
                break;
            case 758159815:
                if (str.equals("feed_shortcut")) {
                    c = 2;
                    break;
                }
                break;
            case 1418007304:
                if (str.equals("live_end")) {
                    c = 5;
                    break;
                }
                break;
            case 1595681360:
                if (str.equals("feed_with_preview")) {
                    c = 0;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                aVar = FEED_WITH_PREVIEW;
                break;
            case 1:
                aVar = FEED;
                break;
            case 2:
                aVar = FEED_SHORTCUT;
                break;
            case 3:
                aVar = MOMENT;
                break;
            case 4:
                aVar = SLIDE;
                break;
            case 5:
                aVar = LIVE_END;
                break;
            case 6:
                aVar = PUSH;
                break;
            case 7:
                aVar = WEB;
                break;
            case 8:
                aVar = OTHER;
                break;
        }
        return aVar;
    }

    private C8638a(String str) {
        this.typeName = str;
    }
}
