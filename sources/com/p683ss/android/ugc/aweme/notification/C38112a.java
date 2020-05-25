package com.p683ss.android.ugc.aweme.notification;

import com.p683ss.android.ugc.aweme.notice.api.bean.NoticeCount;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.notification.a */
public final class C38112a {

    /* renamed from: a */
    public int f96987a;

    /* renamed from: b */
    public int f96988b;

    /* renamed from: c */
    public List<NoticeCount> f96989c;

    /* renamed from: d */
    public HashMap<Integer, Integer> f96990d;

    public C38112a(HashMap<Integer, Integer> hashMap) {
        this.f96990d = hashMap;
    }

    /* renamed from: a */
    public final int mo78080a(int i) {
        try {
            return ((Integer) this.f96990d.get(Integer.valueOf(i))).intValue();
        } catch (Exception unused) {
            return 0;
        }
    }

    public C38112a(int i, int i2) {
        this.f96987a = i;
        this.f96988b = i2;
    }
}
