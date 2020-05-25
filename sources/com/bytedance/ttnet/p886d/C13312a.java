package com.bytedance.ttnet.p886d;

import java.util.Map;

/* renamed from: com.bytedance.ttnet.d.a */
public final class C13312a {

    /* renamed from: a */
    public boolean f34719a;

    /* renamed from: b */
    public boolean f34720b = true;

    /* renamed from: c */
    public Map<String, Integer> f34721c;

    /* renamed from: d */
    public Map<String, String> f34722d;

    /* renamed from: e */
    public int f34723e = 10;

    /* renamed from: f */
    public int f34724f = 3;

    /* renamed from: g */
    public int f34725g = 3;

    /* renamed from: h */
    public int f34726h = 10;

    /* renamed from: i */
    public int f34727i = 3;

    /* renamed from: j */
    public int f34728j = 3;

    /* renamed from: k */
    public int f34729k = 900;

    /* renamed from: l */
    public int f34730l = 120;

    /* renamed from: m */
    public String f34731m;

    public final String toString() {
        int i;
        StringBuilder sb = new StringBuilder();
        sb.append(" localEnable: ");
        sb.append(this.f34719a);
        sb.append(" probeEnable: ");
        sb.append(this.f34720b);
        sb.append(" hostFilter: ");
        int i2 = 0;
        if (this.f34721c != null) {
            i = this.f34721c.size();
        } else {
            i = 0;
        }
        sb.append(i);
        sb.append(" hostMap: ");
        if (this.f34722d != null) {
            i2 = this.f34722d.size();
        }
        sb.append(i2);
        sb.append(" reqTo: ");
        sb.append(this.f34723e);
        sb.append("#");
        sb.append(this.f34724f);
        sb.append("#");
        sb.append(this.f34725g);
        sb.append(" reqErr: ");
        sb.append(this.f34726h);
        sb.append("#");
        sb.append(this.f34727i);
        sb.append("#");
        sb.append(this.f34728j);
        sb.append(" updateInterval: ");
        sb.append(this.f34729k);
        sb.append(" updateRandom: ");
        sb.append(this.f34730l);
        sb.append(" httpBlack: ");
        sb.append(this.f34731m);
        return sb.toString();
    }
}
