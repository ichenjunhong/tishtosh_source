package com.bytedance.android.live.wallet.api;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.android.live.wallet.api.i */
public interface C4303i {

    /* renamed from: com.bytedance.android.live.wallet.api.i$a */
    public interface C4304a {
        /* renamed from: a */
        void mo10085a();

        /* renamed from: a */
        void mo10086a(Bundle bundle);
    }

    /* renamed from: com.bytedance.android.live.wallet.api.i$b */
    public interface C4305b {
        /* renamed from: a */
        void mo10087a(String str, String str2);
    }

    /* renamed from: com.bytedance.android.live.wallet.api.i$c */
    public interface C4306c {
    }

    /* renamed from: com.bytedance.android.live.wallet.api.i$d */
    public interface C4307d {
        /* renamed from: a */
        void mo10088a(boolean z);
    }

    /* renamed from: com.bytedance.android.live.wallet.api.i$e */
    public static class C4308e {

        /* renamed from: a */
        public static int f11793a = 0;

        /* renamed from: b */
        public static int f11794b = 0;

        /* renamed from: c */
        public static int f11795c = 1;

        /* renamed from: d */
        public static int f11796d = 2;

        /* renamed from: e */
        public static int f11797e = 3;

        /* renamed from: f */
        public static int f11798f = 4;

        /* renamed from: g */
        public static int f11799g = 5;
    }

    /* renamed from: com.bytedance.android.live.wallet.api.i$f */
    public static class C4309f {

        /* renamed from: a */
        public static String f11800a = "pay_result_code";

        /* renamed from: b */
        public static String f11801b = "pay_result_extra";

        /* renamed from: c */
        public static String f11802c = "pay_result_detail_code";

        /* renamed from: d */
        public static String f11803d = "pay_result_msg";
    }

    /* renamed from: a */
    void mo10074a();

    /* renamed from: a */
    void mo10075a(Activity activity, String str, Map<String, String> map, int i, Bundle bundle);

    /* renamed from: a */
    void mo10076a(Context context);

    /* renamed from: a */
    void mo10077a(Context context, String str);

    /* renamed from: a */
    void mo10078a(Context context, ArrayList<String> arrayList, C4306c cVar);

    /* renamed from: a */
    void mo10079a(Context context, List<String> list, String str, C4304a aVar);

    /* renamed from: a */
    void mo10080a(C4305b bVar);

    /* renamed from: a */
    void mo10081a(C4307d dVar);

    /* renamed from: b */
    void mo10082b();

    /* renamed from: b */
    void mo10083b(Context context, String str);

    /* renamed from: c */
    void mo10084c();
}
