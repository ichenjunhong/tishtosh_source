package com.bytedance.common.wschannel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.common.wschannel.a */
public final class C9439a {

    /* renamed from: a */
    final int f25700a;

    /* renamed from: b */
    String f25701b;

    /* renamed from: c */
    String f25702c;

    /* renamed from: d */
    Map<String, String> f25703d = new HashMap();

    /* renamed from: e */
    List<String> f25704e = new ArrayList();

    /* renamed from: f */
    int f25705f;

    /* renamed from: g */
    int f25706g;

    /* renamed from: h */
    String f25707h;

    /* renamed from: i */
    int f25708i;

    /* renamed from: com.bytedance.common.wschannel.a$a */
    public static class C9440a {

        /* renamed from: a */
        Map<String, String> f25709a = new HashMap();

        /* renamed from: b */
        List<String> f25710b = new ArrayList();

        /* renamed from: c */
        private final int f25711c;

        /* renamed from: d */
        private int f25712d;

        /* renamed from: e */
        private int f25713e;

        /* renamed from: f */
        private int f25714f;

        /* renamed from: g */
        private String f25715g;

        /* renamed from: h */
        private String f25716h;

        /* renamed from: i */
        private String f25717i;

        /* renamed from: a */
        public final C9439a mo17085a() {
            C9439a aVar = new C9439a(this.f25713e, this.f25712d, this.f25714f, this.f25715g, this.f25711c, this.f25716h, this.f25717i, this.f25710b, this.f25709a);
            return aVar;
        }

        /* renamed from: a */
        public final C9440a mo17082a(String str) {
            this.f25715g = str;
            return this;
        }

        /* renamed from: b */
        public final C9440a mo17087b(String str) {
            this.f25716h = str;
            return this;
        }

        /* renamed from: c */
        public final C9440a mo17088c(int i) {
            this.f25712d = i;
            return this;
        }

        /* renamed from: d */
        public final C9440a mo17090d(int i) {
            this.f25714f = i;
            return this;
        }

        /* renamed from: a */
        public final C9440a mo17083a(List<String> list) {
            this.f25710b.addAll(list);
            return this;
        }

        /* renamed from: b */
        public final C9440a mo17086b(int i) {
            this.f25713e = 9;
            return this;
        }

        /* renamed from: c */
        public final C9440a mo17089c(String str) {
            this.f25717i = str;
            return this;
        }

        /* renamed from: a */
        public static C9440a m18711a(int i) {
            return new C9440a(1239108);
        }

        private C9440a(int i) {
            this.f25711c = i;
        }

        /* renamed from: a */
        public final C9440a mo17084a(Map<String, String> map) {
            this.f25709a.putAll(map);
            return this;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChannelInfo{channelId = ");
        sb.append(this.f25700a);
        sb.append(", deviceId = ");
        sb.append(this.f25702c);
        sb.append(", installId = ");
        sb.append(this.f25702c);
        sb.append(", fpid = ");
        sb.append(this.f25705f);
        sb.append(", aid = ");
        sb.append(this.f25706g);
        sb.append(", updateVersionCode = ");
        sb.append(this.f25708i);
        sb.append(", appKey = ");
        sb.append(this.f25707h);
        sb.append(", extra = ");
        sb.append(this.f25703d);
        sb.append(", urls = ");
        sb.append(this.f25704e);
        sb.append("}");
        return sb.toString();
    }

    public C9439a(int i, int i2, int i3, String str, int i4, String str2, String str3, List<String> list, Map<String, String> map) {
        this.f25700a = i4;
        this.f25701b = str2;
        this.f25702c = str3;
        this.f25708i = i3;
        if (list != null) {
            this.f25704e.addAll(list);
        }
        if (map != null) {
            this.f25703d.putAll(map);
        }
        this.f25705f = i;
        this.f25706g = i2;
        this.f25707h = str;
    }
}
