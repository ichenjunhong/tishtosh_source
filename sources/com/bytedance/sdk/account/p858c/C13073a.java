package com.bytedance.sdk.account.p858c;

import android.text.TextUtils;
import com.p683ss.android.account.C18495c;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.bytedance.sdk.account.c.a */
public final class C13073a {

    /* renamed from: a */
    public final String f34143a;

    /* renamed from: b */
    public final String f34144b;

    /* renamed from: c */
    public final Map<String, String> f34145c;

    /* renamed from: com.bytedance.sdk.account.c.a$a */
    public static class C13074a {

        /* renamed from: a */
        private String f34146a;

        /* renamed from: b */
        private String f34147b;

        /* renamed from: c */
        private Map<String, String> f34148c;

        /* renamed from: b */
        public final C13073a mo24756b() {
            this.f34147b = "get";
            return new C13073a(this.f34146a, this.f34147b, this.f34148c);
        }

        /* renamed from: c */
        public final C13073a mo24757c() {
            this.f34147b = "post";
            return new C13073a(this.f34146a, this.f34147b, this.f34148c);
        }

        /* renamed from: a */
        public final C13074a mo24751a() {
            if (this.f34148c == null) {
                this.f34148c = new HashMap();
            }
            if (C18495c.m44742a().mo38464d()) {
                this.f34148c.put("multi_login", "1");
            }
            return this;
        }

        /* renamed from: a */
        public final C13074a mo24752a(String str) {
            this.f34146a = str;
            return this;
        }

        /* renamed from: a */
        public final C13074a mo24754a(Map<String, String> map) {
            if (this.f34148c == null) {
                this.f34148c = map;
            } else if (map != null) {
                for (Entry entry : map.entrySet()) {
                    this.f34148c.put(entry.getKey(), entry.getValue());
                }
            }
            return this;
        }

        /* renamed from: a */
        public final C13074a mo24753a(String str, String str2) {
            if (this.f34148c == null) {
                this.f34148c = new HashMap();
            }
            this.f34148c.put(str, str2);
            return this;
        }

        /* renamed from: a */
        public final C13074a mo24755a(Map<String, String> map, Map<String, String> map2) {
            if (this.f34148c == null) {
                this.f34148c = new HashMap();
            }
            if (map != null) {
                for (Entry entry : map.entrySet()) {
                    this.f34148c.put(entry.getKey(), entry.getValue());
                }
            }
            if (map2 != null && !map2.isEmpty()) {
                for (String str : map2.keySet()) {
                    if (!TextUtils.isEmpty(str) && map2.get(str) != null) {
                        this.f34148c.put(str, map2.get(str));
                    }
                }
            }
            return this;
        }
    }

    /* renamed from: a */
    public final String mo24750a(String str) {
        if (this.f34145c == null) {
            return null;
        }
        return (String) this.f34145c.get(str);
    }

    public C13073a(String str, String str2, Map<String, String> map) {
        this.f34143a = str;
        this.f34144b = str2;
        this.f34145c = map;
    }
}
