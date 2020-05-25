package com.p683ss.android.ugc.aweme.utils;

import com.bytedance.android.livesdk.chatroom.p325ui.C5939aq;
import com.bytedance.android.livesdk.chatroom.p325ui.C6162et;
import com.p683ss.android.p1192ml.process.p1194bl.MLConfigModel;
import com.p683ss.android.ugc.aweme.effect.C29094ad;
import java.util.regex.Pattern;
import leakcanary.internal.LeakCanaryFileProvider;

/* renamed from: com.ss.android.ugc.aweme.utils.dy */
public final class C47836dy {

    /* renamed from: a */
    public static Pattern f120395a;

    /* renamed from: b */
    private static final String[] f120396b = {"top", "com.cn", "com", "net", "org", "edu", "gov", "int", "mil", "cn", "tel", "biz", "cc", "tv", "info", LeakCanaryFileProvider.f132049i, "hk", "mobi", "asia", "cd", "travel", "pro", "museum", "coop", "aero", C29094ad.f76264a, "ae", "af", "ag", "ai", "al", "am", "an", "ao", C5939aq.f15627a, "ar", "as", "at", "au", "aw", "az", "ba", "bb", "bd", "be", "bf", "bg", "bh", "bi", "bj", "bm", "bn", "bo", "br", "bs", "bt", "bv", "bw", "by", "bz", "ca", "cc", "cf", "cg", "ch", "ci", "ck", "cl", "cm", "cn", "co", "cq", "cr", "cu", "cv", "cx", "cy", "cz", "de", "dj", "dk", "dm", "do", "dz", "ec", "ee", "eg", "eh", "es", C6162et.f16534a, "ev", "fi", "fj", "fk", "fm", "fo", "fr", "ga", "gb", "gd", "ge", "gf", "gh", "gi", "gl", "gm", "gn", "gp", "gr", "gt", "gu", "gw", "gy", "hk", "hm", "hn", "hr", "ht", "hu", "id", "ie", "il", "in", "io", "iq", "ir", "is", "it", "jm", "jo", "jp", "ke", "kg", "kh", "ki", "km", "kn", "kp", "kr", "kw", "ky", "kz", "la", "lb", "lc", "li", "lk", "lr", "ls", "lt", "lu", "lv", "ly", "ma", "mc", "md", "mg", "mh", "ml", "mm", "mn", "mo", "mp", "mq", "mr", "ms", "mt", "mv", "mw", "mx", "my", "mz", "na", "nc", "ne", "nf", "ng", "ni", "nl", "no", "np", "nr", "nt", "nu", "nz", "om", "qa", "pa", "pe", "pf", "pg", "ph", "pk", "pl", "pm", "pn", "pr", "pt", "pw", "py", "re", "ro", "ru", "rw", "sa", "sb", "sc", "sd", "se", "sg", "sh", "si", "sj", "sk", "sl", "sm", "sn", "so", "sr", "st", "su", "sy", "sz", "tc", "td", MLConfigModel.MODEL_TYPE_TF, "tg", "th", "tj", "tk", "tm", "tn", "to", "tp", "tr", "tt", "tv", "tw", "tz", "ua", "ug", "uk", "us", "uy", "va", "vc", "ve", "vg", "vn", "vu", "wf", "ws", "ye", "yu", "za", "zm", "zr", "zw"};

    static {
        StringBuilder sb = new StringBuilder();
        sb.append("(");
        for (String append : f120396b) {
            sb.append(append);
            sb.append("|");
        }
        sb.deleteCharAt(sb.length() - 1);
        sb.append(")");
        StringBuilder sb2 = new StringBuilder("((https?|s?ftp|irc[6s]?|git|afp|telnet|smb)://)?((\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3})|((www\\.|[a-zA-Z\\.\\-]+\\.)?[a-zA-Z0-9\\-]+\\.");
        sb2.append(sb.toString());
        sb2.append("(:[0-9]{1,5})?))((/[a-zA-Z0-9\\./,;\\?'\\+&%\\$#=~_\\-]*)|([^\\u4e00-\\u9fa5\\s0-9a-zA-Z\\./,;\\?'\\+&%\\$#=~_\\-]*))");
        f120395a = Pattern.compile(sb2.toString());
    }
}
