package com.p683ss.android.ugc.aweme.setting.p2133b;

import com.google.gson.p1076a.C17952c;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* renamed from: com.ss.android.ugc.aweme.setting.b.h */
public final class C41576h {

    /* renamed from: a */
    public static LinkedHashMap<String, ArrayList<C41576h>> f105290a = new LinkedHashMap<>();

    /* renamed from: b */
    public static ArrayList<C41576h> f105291b = new ArrayList<>();

    /* renamed from: c */
    C41575g f105292c;

    /* renamed from: d */
    public Field f105293d;

    /* renamed from: e */
    public C41565b f105294e;

    /* renamed from: f */
    public C41578j f105295f;

    /* renamed from: g */
    public ArrayList<String> f105296g = new ArrayList<>();

    /* renamed from: h */
    public String f105297h;

    /* renamed from: i */
    private Object f105298i;

    C41576h(Field field, Object obj) {
        String str;
        this.f105293d = field;
        this.f105298i = obj;
        field.setAccessible(true);
        this.f105292c = (C41575g) field.getAnnotation(C41575g.class);
        this.f105296g.add(field.getName().toLowerCase());
        this.f105297h = field.getName();
        C17952c cVar = (C17952c) field.getAnnotation(C17952c.class);
        if (cVar != null) {
            this.f105296g.add(cVar.mo34828a().toLowerCase());
        }
        this.f105294e = (C41565b) field.getAnnotation(C41565b.class);
        if (this.f105294e != null) {
            this.f105296g.add(this.f105294e.mo85351b().toLowerCase());
            this.f105296g.add(this.f105294e.mo85350a().toLowerCase());
            try {
                if (((Boolean) field.get(obj)).booleanValue()) {
                    str = this.f105294e.mo85350a();
                } else {
                    str = this.f105294e.mo85351b();
                }
                this.f105297h = str;
            } catch (Exception unused) {
            }
        }
        this.f105295f = (C41578j) field.getAnnotation(C41578j.class);
        if (this.f105295f != null) {
            this.f105296g.add(this.f105295f.mo85357a());
            this.f105297h = this.f105295f.mo85357a();
        }
        if (this.f105295f != null) {
            StringBuilder sb = new StringBuilder("1");
            sb.append(this.f105297h.trim().toLowerCase());
            this.f105297h = sb.toString();
            return;
        }
        StringBuilder sb2 = new StringBuilder("0");
        sb2.append(this.f105297h.trim().toLowerCase());
        this.f105297h = sb2.toString();
    }
}
