package com.p683ss.android.ugc.aweme.utils;

import com.p683ss.android.ugc.aweme.shortvideo.util.C45377ad.C45378a;
import com.p683ss.android.ugc.aweme.video.hashtag.C48024a;
import com.taobao.android.dexposed.ClassUtils;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.ss.android.ugc.aweme.utils.ce */
public final class C47761ce {

    /* renamed from: a */
    public static String f120283a = "";

    /* renamed from: b */
    public static String f120284b = "";

    /* renamed from: a */
    public static boolean m103388a(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(C45378a.m98927a());
        sb.append(ClassUtils.INNER_CLASS_SEPARATOR);
        return Pattern.compile(sb.toString()).matcher(str).find();
    }

    /* renamed from: a */
    public static ArrayList<String> m103387a(String str, String str2) {
        Matcher matcher = Pattern.compile(str2).matcher(str);
        ArrayList<String> arrayList = new ArrayList<>();
        while (matcher.find()) {
            arrayList.add(matcher.group());
        }
        return arrayList;
    }

    /* renamed from: b */
    public static C48024a m103389b(String str, String str2) {
        C48024a aVar = new C48024a();
        StringBuilder sb = new StringBuilder("#");
        sb.append(str2);
        sb.append(" ");
        String sb2 = sb.toString();
        aVar.f120700a = str.length();
        aVar.f120702c = sb2;
        aVar.f120701b = aVar.f120700a + aVar.f120702c.length();
        return aVar;
    }
}
