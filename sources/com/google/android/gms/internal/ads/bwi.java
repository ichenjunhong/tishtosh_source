package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.C14963ax;
import java.util.ArrayList;

@C16299uq
public final class bwi {

    /* renamed from: a */
    final Object f44116a = new Object();

    /* renamed from: b */
    public int f44117b = 0;

    /* renamed from: c */
    public int f44118c = 0;

    /* renamed from: d */
    int f44119d = 0;

    /* renamed from: e */
    public int f44120e;

    /* renamed from: f */
    public String f44121f = "";

    /* renamed from: g */
    public String f44122g = "";

    /* renamed from: h */
    public String f44123h = "";

    /* renamed from: i */
    private final int f44124i;

    /* renamed from: j */
    private final int f44125j;

    /* renamed from: k */
    private final int f44126k;

    /* renamed from: l */
    private final bwv f44127l;

    /* renamed from: m */
    private final bxe f44128m;

    /* renamed from: n */
    private ArrayList<String> f44129n = new ArrayList<>();

    /* renamed from: o */
    private ArrayList<String> f44130o = new ArrayList<>();

    /* renamed from: p */
    private ArrayList<bwt> f44131p = new ArrayList<>();

    public bwi(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.f44124i = i;
        this.f44125j = i2;
        this.f44126k = i3;
        this.f44127l = new bwv(i4);
        this.f44128m = new bxe(i5, i6, i7);
    }

    /* renamed from: a */
    public final boolean mo30804a() {
        boolean z;
        synchronized (this.f44116a) {
            z = this.f44119d == 0;
        }
        return z;
    }

    /* renamed from: b */
    public final void mo30805b() {
        synchronized (this.f44116a) {
            this.f44119d++;
        }
    }

    /* renamed from: a */
    public final void mo30803a(String str, boolean z, float f, float f2, float f3, float f4) {
        m36912c(str, z, f, f2, f3, f4);
        synchronized (this.f44116a) {
            if (this.f44119d < 0) {
                abv.m32792b("ActivityContent: negative number of WebViews.");
            }
            mo30807c();
        }
    }

    /* renamed from: b */
    public final void mo30806b(String str, boolean z, float f, float f2, float f3, float f4) {
        m36912c(str, z, f, f2, f3, f4);
    }

    /* renamed from: c */
    private final void m36912c(String str, boolean z, float f, float f2, float f3, float f4) {
        if (str != null && str.length() >= this.f44126k) {
            synchronized (this.f44116a) {
                this.f44129n.add(str);
                this.f44117b += str.length();
                if (z) {
                    this.f44130o.add(str);
                    ArrayList<bwt> arrayList = this.f44131p;
                    bwt bwt = new bwt(f, f2, f3, f4, this.f44130o.size() - 1);
                    arrayList.add(bwt);
                }
            }
        }
    }

    /* renamed from: c */
    public final void mo30807c() {
        synchronized (this.f44116a) {
            int i = (this.f44117b * this.f44124i) + (this.f44118c * this.f44125j);
            if (i > this.f44120e) {
                this.f44120e = i;
                if (!C14963ax.m30834d().mo28595f().mo28636c()) {
                    this.f44121f = this.f44127l.mo30836a(this.f44129n);
                    this.f44122g = this.f44127l.mo30836a(this.f44130o);
                }
                if (!C14963ax.m30834d().mo28595f().mo28640e()) {
                    this.f44123h = this.f44128m.mo30843a(this.f44130o, this.f44131p);
                }
            }
        }
    }

    /* renamed from: a */
    private static String m36911a(ArrayList<String> arrayList, int i) {
        if (arrayList.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList2 = arrayList;
        int size = arrayList2.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList2.get(i2);
            i2++;
            sb.append((String) obj);
            sb.append(' ');
            if (sb.length() > 100) {
                break;
            }
        }
        sb.deleteCharAt(sb.length() - 1);
        String sb2 = sb.toString();
        if (sb2.length() < 100) {
            return sb2;
        }
        return sb2.substring(0, 100);
    }

    public final String toString() {
        int i = this.f44118c;
        int i2 = this.f44120e;
        int i3 = this.f44117b;
        String a = m36911a(this.f44129n, 100);
        String a2 = m36911a(this.f44130o, 100);
        String str = this.f44121f;
        String str2 = this.f44122g;
        String str3 = this.f44123h;
        StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 165 + String.valueOf(a2).length() + String.valueOf(str).length() + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb.append("ActivityContent fetchId: ");
        sb.append(i);
        sb.append(" score:");
        sb.append(i2);
        sb.append(" total_length:");
        sb.append(i3);
        sb.append("\n text: ");
        sb.append(a);
        sb.append("\n viewableText");
        sb.append(a2);
        sb.append("\n signture: ");
        sb.append(str);
        sb.append("\n viewableSignture: ");
        sb.append(str2);
        sb.append("\n viewableSignatureForVertical: ");
        sb.append(str3);
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof bwi)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        bwi bwi = (bwi) obj;
        return bwi.f44121f != null && bwi.f44121f.equals(this.f44121f);
    }

    public final int hashCode() {
        return this.f44121f.hashCode();
    }
}
