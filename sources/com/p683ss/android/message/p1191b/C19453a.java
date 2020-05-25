package com.p683ss.android.message.p1191b;

import android.net.Uri;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.message.b.a */
public final class C19453a {

    /* renamed from: a */
    public List<C19455b> f53769a = new ArrayList();

    /* renamed from: b */
    public String f53770b;

    /* renamed from: c */
    public String f53771c;

    /* renamed from: d */
    public String f53772d;

    /* renamed from: e */
    public String f53773e;

    /* renamed from: com.ss.android.message.b.a$a */
    public static class C19454a {

        /* renamed from: a */
        public C19453a f53774a;

        /* renamed from: c */
        public static C19454a m47606c(String str) {
            return new C19454a(str);
        }

        /* renamed from: a */
        public final C19454a mo40587a(C19455b bVar) {
            this.f53774a.f53769a.add(bVar);
            return this;
        }

        /* renamed from: b */
        public final C19454a mo40589b(String str) {
            this.f53774a.f53772d = str;
            return this;
        }

        private C19454a(String str) {
            this.f53774a = new C19453a(str);
        }

        /* renamed from: a */
        public final C19454a mo40588a(String str) {
            this.f53774a.f53771c = str;
            return this;
        }
    }

    /* renamed from: com.ss.android.message.b.a$b */
    public static class C19455b {

        /* renamed from: a */
        List<String> f53775a;

        /* renamed from: b */
        List<String> f53776b;

        /* renamed from: c */
        Uri f53777c;

        public final int hashCode() {
            int i;
            int i2;
            int i3 = 0;
            if (this.f53775a != null) {
                i = this.f53775a.hashCode();
            } else {
                i = 0;
            }
            int i4 = i * 31;
            if (this.f53776b != null) {
                i2 = this.f53776b.hashCode();
            } else {
                i2 = 0;
            }
            int i5 = (i4 + i2) * 31;
            if (this.f53777c != null) {
                i3 = this.f53777c.hashCode();
            }
            return i5 + i3;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("IntentFilter{actions=");
            sb.append(this.f53775a);
            sb.append(", categories=");
            sb.append(this.f53776b);
            sb.append(", data=");
            sb.append(this.f53777c);
            sb.append('}');
            return sb.toString();
        }

        public C19455b(List<String> list) {
            this(list, null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C19455b)) {
                return false;
            }
            C19455b bVar = (C19455b) obj;
            if (this.f53775a == null ? bVar.f53775a != null : !this.f53775a.equals(bVar.f53775a)) {
                return false;
            }
            if (this.f53776b == null ? bVar.f53776b != null : !this.f53776b.equals(bVar.f53776b)) {
                return false;
            }
            if (this.f53777c != null) {
                return this.f53777c.equals(bVar.f53777c);
            }
            if (bVar.f53777c == null) {
                return true;
            }
            return false;
        }

        public C19455b(List<String> list, List<String> list2) {
            this.f53775a = list;
            this.f53776b = list2;
        }

        public C19455b(List<String> list, List<String> list2, Uri uri) {
            this.f53775a = list;
            this.f53776b = null;
            this.f53777c = uri;
        }
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = 0;
        if (this.f53769a != null) {
            i = this.f53769a.hashCode();
        } else {
            i = 0;
        }
        int i6 = i * 31;
        if (this.f53770b != null) {
            i2 = this.f53770b.hashCode();
        } else {
            i2 = 0;
        }
        int i7 = (i6 + i2) * 31;
        if (this.f53771c != null) {
            i3 = this.f53771c.hashCode();
        } else {
            i3 = 0;
        }
        int i8 = (i7 + i3) * 31;
        if (this.f53772d != null) {
            i4 = this.f53772d.hashCode();
        } else {
            i4 = 0;
        }
        int i9 = (i8 + i4) * 31;
        if (this.f53773e != null) {
            i5 = this.f53773e.hashCode();
        }
        return i9 + i5;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Component{name='");
        sb.append(this.f53770b);
        sb.append('\'');
        sb.append(", intentFilter=");
        sb.append(this.f53769a);
        sb.append(", processName='");
        sb.append(this.f53771c);
        sb.append('\'');
        sb.append(", permission='");
        sb.append(this.f53772d);
        sb.append('\'');
        sb.append(", authorities='");
        sb.append(this.f53773e);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }

    public C19453a(String str) {
        this.f53770b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19453a)) {
            return false;
        }
        C19453a aVar = (C19453a) obj;
        if (this.f53769a == null ? aVar.f53769a != null : !this.f53769a.equals(aVar.f53769a)) {
            return false;
        }
        if (this.f53770b == null ? aVar.f53770b != null : !this.f53770b.equals(aVar.f53770b)) {
            return false;
        }
        if (this.f53771c == null ? aVar.f53771c != null : !this.f53771c.equals(aVar.f53771c)) {
            return false;
        }
        if (this.f53772d == null ? aVar.f53772d != null : !this.f53772d.equals(aVar.f53772d)) {
            return false;
        }
        if (this.f53773e == null ? aVar.f53773e == null : this.f53773e.equals(aVar.f53773e)) {
            return true;
        }
        return false;
    }
}
