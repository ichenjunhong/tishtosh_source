package com.google.android.gms.internal.ads;

import android.location.Location;
import com.google.android.gms.ads.C15040j;
import com.google.android.gms.ads.formats.C14919c;
import com.google.android.gms.ads.formats.C14919c.C14920a;
import com.google.android.gms.ads.mediation.C15067i;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

@C16299uq
/* renamed from: com.google.android.gms.internal.ads.pt */
public final class C16167pt implements C15067i {

    /* renamed from: a */
    private final Date f45416a;

    /* renamed from: b */
    private final int f45417b;

    /* renamed from: c */
    private final Set<String> f45418c;

    /* renamed from: d */
    private final boolean f45419d;

    /* renamed from: e */
    private final Location f45420e;

    /* renamed from: f */
    private final int f45421f;

    /* renamed from: g */
    private final zzafl f45422g;

    /* renamed from: h */
    private final List<String> f45423h = new ArrayList();

    /* renamed from: i */
    private final boolean f45424i;

    /* renamed from: j */
    private final Map<String, Boolean> f45425j = new HashMap();

    /* renamed from: k */
    private final int f45426k;

    /* renamed from: l */
    private final String f45427l;

    public C16167pt(Date date, int i, Set<String> set, Location location, boolean z, int i2, zzafl zzafl, List<String> list, boolean z2, int i3, String str) {
        this.f45416a = date;
        this.f45417b = i;
        this.f45418c = set;
        this.f45420e = location;
        this.f45419d = z;
        this.f45421f = i2;
        this.f45422g = zzafl;
        this.f45424i = z2;
        this.f45426k = i3;
        this.f45427l = str;
        String str2 = "custom:";
        if (list != null) {
            for (String str3 : list) {
                if (str3.startsWith(str2)) {
                    String[] split = str3.split(":", 3);
                    if (split.length == 3) {
                        if ("true".equals(split[2])) {
                            this.f45425j.put(split[1], Boolean.valueOf(true));
                        } else if ("false".equals(split[2])) {
                            this.f45425j.put(split[1], Boolean.valueOf(false));
                        }
                    }
                } else {
                    this.f45423h.add(str3);
                }
            }
        }
    }

    /* renamed from: a */
    public final Date mo27748a() {
        return this.f45416a;
    }

    /* renamed from: b */
    public final int mo27749b() {
        return this.f45417b;
    }

    /* renamed from: c */
    public final Set<String> mo27750c() {
        return this.f45418c;
    }

    /* renamed from: d */
    public final Location mo27751d() {
        return this.f45420e;
    }

    /* renamed from: f */
    public final boolean mo27753f() {
        return this.f45419d;
    }

    /* renamed from: e */
    public final int mo27752e() {
        return this.f45421f;
    }

    /* renamed from: h */
    public final C14919c mo27783h() {
        if (this.f45422g == null) {
            return null;
        }
        C14920a b = new C14920a().mo27353a(this.f45422g.f46066b).mo27352a(this.f45422g.f46067c).mo27355b(this.f45422g.f46068d);
        if (this.f45422g.f46065a >= 2) {
            b.f38483f = this.f45422g.f46069e;
        }
        if (this.f45422g.f46065a >= 3 && this.f45422g.f46070f != null) {
            b.f38482e = new C15040j(this.f45422g.f46070f);
        }
        return b.mo27354a();
    }

    /* renamed from: i */
    public final boolean mo27784i() {
        return this.f45423h != null && (this.f45423h.contains("2") || this.f45423h.contains("6"));
    }

    /* renamed from: j */
    public final boolean mo27785j() {
        return this.f45423h != null && this.f45423h.contains("6");
    }

    /* renamed from: k */
    public final boolean mo27786k() {
        return this.f45423h != null && (this.f45423h.contains("1") || this.f45423h.contains("6"));
    }

    /* renamed from: l */
    public final boolean mo27787l() {
        return this.f45423h != null && this.f45423h.contains("3");
    }

    /* renamed from: m */
    public final Map<String, Boolean> mo27788m() {
        return this.f45425j;
    }

    /* renamed from: g */
    public final boolean mo27754g() {
        return this.f45424i;
    }
}
