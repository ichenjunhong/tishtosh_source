package com.p683ss.android.ugc.aweme.main;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import com.C2240a;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.feed.C29981aa;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.widget.C31246e;
import com.p683ss.android.ugc.aweme.longvideo.C36367d;
import com.p683ss.android.ugc.aweme.longvideo.p1934b.C36353b;
import com.p683ss.android.ugc.aweme.longvideo.p1934b.C36353b.C36354a;
import com.p683ss.android.ugc.aweme.longvideo.p1934b.C36353b.C36354a.C36355a;
import com.p683ss.android.ugc.aweme.longvideo.p1934b.C36353b.C36354a.C36356b;
import com.ss.android.ugc.trill.R;
import java.util.Arrays;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.main.q */
public final class C36675q implements C36653g {
    /* renamed from: a */
    public final boolean mo75754a(Aweme aweme) {
        return C36353b.m82038a(aweme);
    }

    /* renamed from: c */
    public final String mo75756c(Aweme aweme) {
        return C36353b.f93061a.mo75270c(aweme);
    }

    /* renamed from: b */
    public final boolean mo75755b(Aweme aweme) {
        if (aweme == null || aweme.getDistributeType() != 2) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo75753a(Context context, Aweme aweme, String str, int i) {
        C36367d.m82058a(context, aweme, str, i);
    }

    /* renamed from: a */
    public final SpannableStringBuilder mo75752a(Context context, Aweme aweme, String str, int i, SpannableStringBuilder spannableStringBuilder) {
        C36354a aVar = C36353b.f93061a;
        C52711k.m112240b(context, "mContext");
        C52711k.m112240b(aweme, "mAweme");
        C52711k.m112240b(str, "mEventType");
        C52711k.m112240b(spannableStringBuilder, "spannableStringBuilder");
        String spannableStringBuilder2 = spannableStringBuilder.toString();
        C52711k.m112236a((Object) spannableStringBuilder2, "spannableStringBuilder.toString()");
        String string = context.getString(R.string.b7s);
        C52711k.m112236a((Object) string, "mContext.getString(R.string.full_version)");
        String a = C2240a.m6772a(string, Arrays.copyOf(new Object[]{aVar.mo75270c(aweme)}, 1));
        C52711k.m112236a((Object) a, "java.lang.String.format(format, *args)");
        C31246e eVar = new C31246e(context, R.color.cg, a, R.drawable.ap3);
        spannableStringBuilder.setSpan(new C36356b(context, aweme, str, i), (spannableStringBuilder2.length() - 4) + 1, spannableStringBuilder2.length(), 17);
        spannableStringBuilder.setSpan(eVar, (spannableStringBuilder2.length() - 4) + 1, spannableStringBuilder2.length(), 17);
        return spannableStringBuilder;
    }

    /* renamed from: a */
    public final SpannableString mo75751a(Context context, String str, Aweme aweme, String str2, int i) {
        C36354a aVar = C36353b.f93061a;
        C52711k.m112240b(context, "mContext");
        C52711k.m112240b(str, "awemeDesc");
        C52711k.m112240b(aweme, "mAweme");
        C52711k.m112240b(str2, "mEventType");
        C52711k.m112240b(context, "mContext");
        C52711k.m112240b(str, "awemeDesc");
        C52711k.m112240b(aweme, "mAweme");
        C52711k.m112240b(str2, "mEventType");
        if (str.length() > 146) {
            String substring = str.substring(0, 143);
            C52711k.m112236a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            StringBuilder sb = new StringBuilder();
            sb.append(substring);
            sb.append("...");
            str = sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(" [r]");
        SpannableString spannableString = new SpannableString(sb2.toString());
        C52711k.m112240b(context, "mContext");
        C52711k.m112240b(aweme, "mAweme");
        C52711k.m112240b(str2, "mEventType");
        C52711k.m112240b(spannableString, "spannableString");
        C26890h.m65011a("show_complete_video_entrance", C23089d.m56640a().mo47829a("log_pb", C29981aa.m70153a().mo60161a(aweme.getAid())).mo47827a("local_time_ms", System.currentTimeMillis()).mo47829a("enter_from", str2).mo47829a("group_id", aweme.getAid()).f61491a);
        String spannableString2 = spannableString.toString();
        C52711k.m112236a((Object) spannableString2, "spannableString.toString()");
        String string = context.getString(R.string.b7s);
        C52711k.m112236a((Object) string, "mContext.getString(R.string.full_version)");
        String a = C2240a.m6772a(string, Arrays.copyOf(new Object[]{aVar.mo75270c(aweme)}, 1));
        C52711k.m112236a((Object) a, "java.lang.String.format(format, *args)");
        C31246e eVar = new C31246e(context, R.color.cg, a, R.drawable.ap3);
        spannableString.setSpan(new C36355a(context, aweme, str2, i), (spannableString2.length() - 4) + 1, spannableString2.length(), 17);
        spannableString.setSpan(eVar, (spannableString2.length() - 4) + 1, spannableString2.length(), 17);
        return spannableString;
    }
}
