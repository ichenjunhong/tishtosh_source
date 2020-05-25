package com.bytedance.android.livesdkapi.p448f;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: com.bytedance.android.livesdkapi.f.c */
public final class C8742c {

    /* renamed from: a */
    public static final List<String> f24010a;

    /* renamed from: b */
    public static final List<Pattern> f24011b;

    /* renamed from: c */
    public static final List<String> f24012c;

    /* renamed from: d */
    public static final List<Pattern> f24013d;

    /* renamed from: e */
    public static final List<String> f24014e;

    /* renamed from: f */
    public static final List<Pattern> f24015f;

    /* renamed from: g */
    public static final List<String> f24016g;

    /* renamed from: h */
    public static final List<Pattern> f24017h;

    /* renamed from: i */
    public static final List<String> f24018i;

    /* renamed from: j */
    public static final List<Pattern> f24019j;

    /* renamed from: k */
    public static final List<String> f24020k;

    /* renamed from: l */
    public static final List<Pattern> f24021l;

    /* renamed from: a */
    private static List<String> m17214a() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("webcast_activity");
        return arrayList;
    }

    static {
        ArrayList arrayList = new ArrayList();
        arrayList.add("webcast_douyin");
        arrayList.addAll(m17214a());
        f24010a = arrayList;
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(Pattern.compile(".snssdk.com/falcon/"));
        arrayList2.add(Pattern.compile("s3.bytecdn.cn/aweme/resource/falcon/"));
        arrayList2.add(Pattern.compile("s3a.bytecdn.cn/aweme/resource/falcon/"));
        arrayList2.add(Pattern.compile("s3.bytecdn.cn/ies/resource/falcon/"));
        arrayList2.add(Pattern.compile("s3a.bytecdn.cn/ies/resource/falcon/"));
        arrayList2.add(Pattern.compile(".amemv.com/falcon/"));
        arrayList2.add(Pattern.compile(".bytedance.net/falcon/"));
        f24011b = arrayList2;
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add("webcast_mt");
        f24012c = arrayList3;
        ArrayList arrayList4 = new ArrayList();
        arrayList4.add(Pattern.compile(".musical.ly/falcon/"));
        arrayList4.add(Pattern.compile(".tiktokv.com/falcon/"));
        arrayList4.add(Pattern.compile(".akamaized.net/ies/resource/falcon/"));
        arrayList4.add(Pattern.compile(".tiktokcdn.com/ies/resource/falcon/"));
        f24013d = arrayList4;
        ArrayList arrayList5 = new ArrayList();
        arrayList5.add("webcast_pipixia");
        arrayList5.addAll(m17214a());
        f24014e = arrayList5;
        ArrayList arrayList6 = new ArrayList();
        arrayList6.add(Pattern.compile("api.ribaoapi.com/falcon/"));
        arrayList6.add(Pattern.compile("s3.bytecdn.cn/ies/resource/falcon/"));
        arrayList6.add(Pattern.compile("s3a.bytecdn.cn/ies/resource/falcon/"));
        arrayList6.add(Pattern.compile("/*.snssdk.com/falcon/"));
        arrayList6.add(Pattern.compile("webcast-ppx.snssdk.com/falcon/"));
        arrayList6.add(Pattern.compile(".bytedance.net/falcon/"));
        f24015f = arrayList6;
        ArrayList arrayList7 = new ArrayList();
        arrayList7.add("webcast_huoshan");
        arrayList7.addAll(m17214a());
        f24016g = arrayList7;
        ArrayList arrayList8 = new ArrayList();
        arrayList8.add(Pattern.compile(".snssdk.com/falcon/"));
        arrayList8.add(Pattern.compile("s3.bytecdn.cn/ies/resource/falcon/"));
        arrayList8.add(Pattern.compile("s3a.bytecdn.cn/ies/resource/falcon/"));
        arrayList8.add(Pattern.compile(".amemv.com/falcon/"));
        arrayList8.add(Pattern.compile(".bytedance.net/falcon/"));
        arrayList8.add(Pattern.compile(".huoshan.com/falcon/"));
        f24017h = arrayList8;
        ArrayList arrayList9 = new ArrayList();
        arrayList9.add("webcast_xigua");
        arrayList9.addAll(m17214a());
        f24018i = arrayList9;
        ArrayList arrayList10 = new ArrayList();
        arrayList10.add(Pattern.compile(".snssdk.com/falcon/"));
        arrayList10.add(Pattern.compile("s3.bytecdn.cn/ies/resource/falcon/"));
        arrayList10.add(Pattern.compile("s3a.bytecdn.cn/ies/resource/falcon/"));
        arrayList10.add(Pattern.compile(".bytedance.net/falcon/"));
        arrayList10.add(Pattern.compile(".ixigua.com/falcon/"));
        arrayList10.add(Pattern.compile("snssdk.com/feoffline/"));
        f24019j = arrayList10;
        ArrayList arrayList11 = new ArrayList();
        arrayList11.add("webcast_vigo");
        arrayList11.addAll(m17214a());
        f24020k = arrayList11;
        ArrayList arrayList12 = new ArrayList();
        arrayList12.add(Pattern.compile(".hypstar.com/falcon/"));
        arrayList12.add(Pattern.compile(".akamaized.net/ies/resource/falcon/"));
        arrayList12.add(Pattern.compile(".hypstarcdn.com/ies/resource/falcon/"));
        f24021l = arrayList12;
    }
}
