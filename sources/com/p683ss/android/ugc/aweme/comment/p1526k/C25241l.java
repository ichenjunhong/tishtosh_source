package com.p683ss.android.ugc.aweme.comment.p1526k;

import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.emoji.p1689h.p1692b.C29406a;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.ss.android.ugc.aweme.comment.k.l */
public final class C25241l {

    /* renamed from: a */
    private static final Pattern f66843a = Pattern.compile("(\\[)([^\\[\\]]+)(])");

    /* renamed from: b */
    private static final Pattern f66844b = Pattern.compile("<no_trans>(.+?)</no_trans>");

    /* renamed from: b */
    public static String m61364b(String str) {
        Matcher matcher = f66844b.matcher(str);
        StringBuilder sb = new StringBuilder(str);
        int i = 0;
        while (matcher.find()) {
            sb.replace(matcher.start() - i, matcher.end() - i, matcher.group(1));
            i += 21;
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static String m61363a(String str) {
        Matcher matcher = f66843a.matcher(str);
        StringBuilder sb = new StringBuilder(str);
        int i = 0;
        while (matcher.find()) {
            int start = matcher.start() + i;
            int end = matcher.end() + i;
            if (C29406a.m69329b(C11010c.m22280a()).mo59404a(matcher.group())) {
                sb.insert(start, "<no_trans>");
                sb.insert(end + 10, "</no_trans>");
                i += 21;
            }
        }
        return sb.toString();
    }
}
