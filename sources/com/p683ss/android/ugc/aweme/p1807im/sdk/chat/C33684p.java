package com.p683ss.android.ugc.aweme.p1807im.sdk.chat;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.text.util.Linkify;
import android.text.util.Linkify.MatchFilter;
import android.util.Patterns;
import android.view.View;
import android.widget.TextView;
import com.bytedance.android.livesdk.chatroom.p325ui.C5939aq;
import com.bytedance.android.livesdk.chatroom.p325ui.C6162et;
import com.bytedance.p702im.core.p706c.C11207p;
import com.p683ss.android.p1192ml.process.p1194bl.MLConfigModel;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.MobClick;
import com.p683ss.android.ugc.aweme.effect.C29094ad;
import com.p683ss.android.ugc.aweme.p1807im.sdk.abtest.C33220b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.abtest.ImCommerceConfigSettings;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.EPlatformCardContent.LinkItem;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34004b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35187ac;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35190af;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35204ar;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35270j;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35279p;
import com.ss.android.ugc.trill.R;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import leakcanary.internal.LeakCanaryFileProvider;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.p */
public final class C33684p {

    /* renamed from: a */
    public static final String[] f87335a = {"http://", "https://", "rtsp://"};

    /* renamed from: b */
    public static final String[] f87336b = {"mailto:"};

    /* renamed from: c */
    private static final String[] f87337c = {"top", "com.cn", "com", "net.cn", "net", "org", "edu", "gov", "int", "mil", "cn", "tel", "biz", "cc", "tv", "info", LeakCanaryFileProvider.f132049i, "hk", "mobi", "asia", "cd", "travel", "pro", "museum", "coop", "aero", C29094ad.f76264a, "ae", "af", "ag", "ai", "al", "am", "an", "ao", C5939aq.f15627a, "ar", "as", "at", "au", "aw", "az", "ba", "bb", "bd", "be", "bf", "bg", "bh", "bi", "bj", "bm", "bn", "bo", "br", "bs", "bt", "bv", "bw", "by", "bz", "ca", "cc", "cf", "cg", "ch", "ci", "ck", "cl", "cm", "cn", "co", "cq", "cr", "cu", "cv", "cx", "cy", "cz", "de", "dj", "dk", "dm", "do", "dz", "ec", "ee", "eg", "eh", "es", C6162et.f16534a, "ev", "fi", "fj", "fk", "fm", "fo", "fr", "ga", "gb", "gd", "ge", "gf", "gh", "gi", "gl", "gm", "gn", "gp", "gr", "gt", "gu", "gw", "gy", "hk", "hm", "hn", "hr", "ht", "hu", "id", "ie", "il", "in", "io", "iq", "ir", "is", "it", "jm", "jo", "jp", "ke", "kg", "kh", "ki", "km", "kn", "kp", "kr", "kw", "ky", "kz", "la", "lb", "lc", "li", "lk", "lr", "ls", "lt", "lu", "lv", "ly", "ma", "mc", "md", "mg", "mh", "ml", "mm", "mn", "mo", "mp", "mq", "mr", "ms", "mt", "mv", "mw", "mx", "my", "mz", "na", "nc", "ne", "nf", "ng", "ni", "nl", "no", "np", "nr", "nt", "nu", "nz", "om", "qa", "pa", "pe", "pf", "pg", "ph", "pk", "pl", "pm", "pn", "pr", "pt", "pw", "py", "re", "ro", "ru", "rw", "sa", "sb", "sc", "sd", "se", "sg", "sh", "si", "sj", "sk", "sl", "sm", "sn", "so", "sr", "st", "su", "sy", "sz", "tc", "td", MLConfigModel.MODEL_TYPE_TF, "tg", "th", "tj", "tk", "tm", "tn", "to", "tp", "tr", "tt", "tv", "tw", "ty", "tz", "ua", "ug", "uk", "us", "uy", "va", "vc", "ve", "vg", "vn", "vu", "wf", "ws", "xyz", "ye", "yu", "za", "zm", "zr", "zw"};

    /* renamed from: d */
    private static Pattern f87338d;

    /* renamed from: e */
    private static final Pattern f87339e = Pattern.compile("(1\\d{10})|(0\\d{9,10})|(0\\d{2}-\\d{8})|(0\\d{3}-\\d{8})|(0\\d{2}-\\d{7})|(0\\d{3}-\\d{7})|(\\d{5})|(1\\d{2}-\\d{4}-\\d{4})|(1\\d{2}-\\d{3}-\\d{5})");

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.p$a */
    public static final class C33685a extends ClickableSpan {

        /* renamed from: a */
        LinkItem f87340a;

        /* renamed from: b */
        String f87341b;

        /* renamed from: c */
        private int f87342c;

        /* renamed from: d */
        private Context f87343d;

        /* renamed from: e */
        private long f87344e;

        /* renamed from: f */
        private boolean f87345f;

        public final void updateDrawState(TextPaint textPaint) {
            textPaint.setColor(this.f87342c);
        }

        public final void onClick(View view) {
            switch (this.f87340a.actionType) {
                case 1:
                    new C33220b(this.f87343d, new C33688q(this)).sendMsg();
                    C35190af.m79504e(this.f87341b, String.valueOf(this.f87344e), "question_list");
                    return;
                case 2:
                    Uri parse = Uri.parse(this.f87340a.value);
                    String queryParameter = parse.getQueryParameter("target");
                    if (queryParameter == null || !queryParameter.endsWith(".pdf") || C35279p.m79763a()) {
                        if (!this.f87345f) {
                            parse = parse.buildUpon().appendQueryParameter("hide_more", "1").build();
                        }
                        C34004b.m77717a().mo71949f().openUrl(this.f87343d, parse, false);
                        C35190af.m79504e(this.f87341b, String.valueOf(this.f87344e), "text");
                        return;
                    }
                    C34004b.m77717a().mo71949f().downloadPdf(this.f87343d, queryParameter, "application/pdf");
                    return;
                case 3:
                    C34004b.m77717a().mo71949f().makePhoneCall((Activity) this.f87343d, this.f87340a.phoneNumber, this.f87340a.phoneInstanceId, this.f87340a.phoneEncryptKey, "");
                    C35190af.m79504e(this.f87341b, String.valueOf(this.f87344e), "phone");
                    break;
            }
        }

        public C33685a(Context context, String str, long j, LinkItem linkItem, int i, boolean z) {
            this.f87340a = linkItem;
            this.f87342c = i;
            this.f87343d = context;
            this.f87341b = str;
            this.f87344e = j;
            this.f87345f = z;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.p$b */
    static final class C33686b extends ClickableSpan {

        /* renamed from: a */
        public String f87346a;

        /* renamed from: b */
        public String f87347b;

        /* renamed from: c */
        private int f87348c;

        /* renamed from: d */
        private int f87349d;

        /* renamed from: e */
        private boolean f87350e;

        /* renamed from: f */
        private String f87351f;

        /* renamed from: g */
        private long f87352g;

        public final void updateDrawState(TextPaint textPaint) {
            textPaint.setColor(this.f87348c);
        }

        public final void onClick(final View view) {
            if (this.f87350e) {
                C35190af.m79504e(this.f87351f, String.valueOf(this.f87352g), "link");
            } else {
                C35190af.m79442a();
                C26890h.onEvent(MobClick.obtain().setEventName("click_link").setLabelName("chat").setValue(this.f87347b));
            }
            int i = this.f87349d;
            if (i != 4) {
                switch (i) {
                    case 1:
                        C35204ar.m79584a(view.getContext(), C33684p.m77133a(this.f87346a, C33684p.f87335a));
                        return;
                    case 2:
                        String a = C33684p.m77133a(this.f87346a, C33684p.f87336b);
                        Context context = view.getContext();
                        Intent intent = new Intent("android.intent.action.SENDTO");
                        intent.setData(Uri.parse(a));
                        C35187ac.m79437a(context, intent);
                        break;
                }
                return;
            }
            C35270j.m79749a(view.getContext(), R.string.bgi, R.string.bf_, R.string.ah2, new Runnable() {
                public final void run() {
                    C35187ac.m79438a(view.getContext(), C33686b.this.f87346a);
                }
            });
        }

        C33686b(String str, int i, int i2, boolean z, String str2, long j) {
            this.f87346a = str;
            this.f87348c = i;
            this.f87349d = i2;
            this.f87350e = z;
            this.f87351f = str2;
            this.f87352g = j;
        }
    }

    static {
        StringBuilder sb = new StringBuilder();
        sb.append("(");
        List<String> asList = Arrays.asList(f87337c);
        String[] domainList = ImCommerceConfigSettings.INSTANCE.getDomainList();
        if (domainList != null) {
            for (String str : domainList) {
                if (!asList.contains(str)) {
                    sb.append(str);
                    sb.append("|");
                }
            }
        }
        for (String append : asList) {
            sb.append(append);
            sb.append("|");
        }
        sb.deleteCharAt(sb.length() - 1);
        sb.append(")");
        StringBuilder sb2 = new StringBuilder("((https?|s?ftp|irc[6s]?|git|afp|telnet|smb)://)?((\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3})|((www\\.|[a-zA-Z0-9\\.\\-]+\\.)?[a-zA-Z0-9\\-]+\\.");
        sb2.append(sb.toString());
        sb2.append("(:[0-9]{1,5})?))((/[a-zA-Z0-9\\./,;\\?'\\+&%\\$#=~_\\-]*)|([^\\u4e00-\\u9fa5\\s0-9a-zA-Z\\./,;\\?'\\+&%\\$#=~_\\-]*))");
        f87338d = Pattern.compile(sb2.toString());
    }

    /* renamed from: a */
    public static String m77133a(String str, String[] strArr) {
        boolean z;
        int i = 0;
        while (true) {
            z = true;
            if (i >= strArr.length) {
                z = false;
                break;
            }
            if (str.regionMatches(true, 0, strArr[i], 0, strArr[i].length())) {
                if (!str.regionMatches(false, 0, strArr[i], 0, strArr[i].length())) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(strArr[i]);
                    sb.append(str.substring(strArr[i].length()));
                    str = sb.toString();
                }
            } else {
                i++;
            }
        }
        if (z || strArr.length <= 0) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(strArr[0]);
        sb2.append(str);
        return sb2.toString();
    }

    /* renamed from: a */
    public static void m77135a(TextView textView, String str, String str2, boolean z, long j, C11207p pVar) {
        if (TextUtils.isEmpty(str)) {
            textView.setText("");
            return;
        }
        SpannableString spannableString = new SpannableString(str);
        TextView textView2 = textView;
        String str3 = str;
        SpannableString spannableString2 = spannableString;
        String str4 = str2;
        boolean z2 = z;
        long j2 = j;
        C11207p pVar2 = pVar;
        m77137c(textView2, str3, spannableString2, str4, z2, j2, pVar2);
        m77136b(textView2, str3, spannableString2, str4, z2, j2, pVar2);
        m77134a(textView2, str3, spannableString2, str4, z2, j2, pVar2);
        textView.setText(spannableString);
    }

    /* renamed from: a */
    private static void m77134a(TextView textView, String str, SpannableString spannableString, String str2, boolean z, long j, C11207p pVar) {
        String str3 = str;
        Matcher matcher = Patterns.EMAIL_ADDRESS.matcher(str);
        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            String group = matcher.group();
            pVar.isSelf();
            C33686b bVar = new C33686b(group, textView.getResources().getColor(R.color.r1), 2, z, str2, j);
            bVar.f87347b = str2;
            SpannableString spannableString2 = spannableString;
            spannableString.setSpan(bVar, start, end, 33);
        }
    }

    /* renamed from: b */
    private static void m77136b(TextView textView, String str, SpannableString spannableString, String str2, boolean z, long j, C11207p pVar) {
        String str3 = str;
        Matcher matcher = f87338d.matcher(str);
        MatchFilter matchFilter = Linkify.sUrlMatchFilter;
        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            String group = matcher.group();
            if (matchFilter.acceptMatch(str, start, end)) {
                pVar.isSelf();
                C33686b bVar = new C33686b(group, textView.getResources().getColor(R.color.r1), 1, z, str2, j);
                bVar.f87347b = str2;
                spannableString.setSpan(bVar, start, end, 33);
            } else {
                SpannableString spannableString2 = spannableString;
                String str4 = str2;
            }
        }
    }

    /* renamed from: c */
    private static void m77137c(TextView textView, String str, SpannableString spannableString, String str2, boolean z, long j, C11207p pVar) {
        String str3 = str;
        Matcher matcher = f87339e.matcher(str);
        MatchFilter matchFilter = Linkify.sPhoneNumberMatchFilter;
        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            String group = matcher.group();
            if (matchFilter.acceptMatch(str, start, end)) {
                pVar.isSelf();
                C33686b bVar = new C33686b(group, textView.getResources().getColor(R.color.r1), 4, z, str2, j);
                bVar.f87347b = str2;
                spannableString.setSpan(bVar, start, end, 33);
            } else {
                SpannableString spannableString2 = spannableString;
                String str4 = str2;
            }
        }
    }
}
