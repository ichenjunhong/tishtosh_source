package com.p683ss.android.ugc.aweme.router;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.ss.android.ugc.aweme.router.u */
public final class C41300u {

    /* renamed from: a */
    public ArrayList<String> f104741a;

    /* renamed from: b */
    public ArrayList<String> f104742b;

    /* renamed from: c */
    public ArrayList<String> f104743c;

    /* renamed from: d */
    public ArrayList<String> f104744d;

    /* renamed from: e */
    public ArrayList<String> f104745e;

    /* renamed from: f */
    public ArrayList<String> f104746f;

    /* renamed from: g */
    public ArrayList<String> f104747g;

    /* renamed from: h */
    public ArrayList<String> f104748h;

    /* renamed from: i */
    public ArrayList<String> f104749i;

    /* renamed from: a */
    public final void mo83853a() {
        m91035a(this.f104743c);
        m91035a(this.f104747g);
        m91035a(this.f104748h);
        m91035a(this.f104746f);
        m91035a(this.f104745e);
        m91035a(this.f104741a);
        m91035a(this.f104742b);
        m91035a(this.f104744d);
        m91035a(this.f104743c);
    }

    /* renamed from: a */
    private static void m91035a(ArrayList<String> arrayList) {
        if (arrayList != null && !arrayList.isEmpty()) {
            arrayList.clear();
        }
    }

    /* renamed from: b */
    public final void mo83855b(String str) {
        if (this.f104741a == null) {
            this.f104741a = new ArrayList<>();
        }
        this.f104741a.add(str);
    }

    /* renamed from: c */
    public final void mo83856c(String str) {
        if (this.f104743c == null) {
            this.f104743c = new ArrayList<>();
        }
        this.f104743c.add(str);
    }

    /* renamed from: a */
    public final void mo83854a(String str) {
        if (this.f104749i == null) {
            this.f104749i = new ArrayList<>();
        }
        this.f104749i.add(str);
    }

    /* renamed from: a */
    static boolean m91036a(ArrayList<String> arrayList, String str) {
        if (arrayList == null) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((String) it.next()).equals(str)) {
                return true;
            }
        }
        return false;
    }
}
