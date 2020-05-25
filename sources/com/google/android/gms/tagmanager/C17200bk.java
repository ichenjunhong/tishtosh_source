package com.google.android.gms.tagmanager;

import com.google.android.gms.common.api.Status;
import java.util.concurrent.ConcurrentMap;

/* renamed from: com.google.android.gms.tagmanager.bk */
final class C17200bk implements C17189b {

    /* renamed from: a */
    C17161a f48626a;

    /* renamed from: b */
    C17201bl f48627b;

    /* renamed from: c */
    boolean f48628c;

    /* renamed from: d */
    private C17161a f48629d;

    /* renamed from: e */
    private Status f48630e;

    /* renamed from: f */
    private C17202bm f48631f;

    /* renamed from: g */
    private C17207d f48632g;

    /* renamed from: a */
    public final Status mo27935a() {
        return this.f48630e;
    }

    /* renamed from: b */
    public final void mo28127b() {
        String str;
        if (!this.f48628c) {
            this.f48628c = true;
            ConcurrentMap<String, C17200bk> concurrentMap = this.f48632g.f48647c;
            if (this.f48628c) {
                str = "";
            } else {
                str = this.f48626a.f48562a;
            }
            Object remove = concurrentMap.remove(str);
            this.f48626a.f48563b = null;
            this.f48626a = null;
            this.f48629d = null;
            this.f48627b = null;
            this.f48631f = null;
        }
    }
}
