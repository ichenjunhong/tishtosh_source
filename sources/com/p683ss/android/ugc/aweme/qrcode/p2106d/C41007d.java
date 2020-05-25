package com.p683ss.android.ugc.aweme.qrcode.p2106d;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: com.ss.android.ugc.aweme.qrcode.d.d */
public final class C41007d {

    /* renamed from: a */
    public static final List<String> f104259a = new ArrayList(Arrays.asList(new String[]{"v16.musical.ly", "v16.tiktokv.com", "v.douyin.com", "v.tiktok.com", "vt.tiktok.com", "vm.tiktok.com"}));

    /* renamed from: a */
    public static boolean m90632a(String str) {
        return Pattern.compile("(https?|http)://[-A-Za-z0-9+&@#/%?=~_|!:,.;]+[-A-Za-z0-9+&@#/%=~_|]").matcher(str).find();
    }

    /* renamed from: b */
    public static boolean m90633b(String str) {
        if (TextUtils.isEmpty(str) || !str.startsWith("ttschema://view_grade_resource")) {
            return false;
        }
        return true;
    }
}
