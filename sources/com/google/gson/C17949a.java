package com.google.gson;

import com.google.gson.internal.C18058d;
import com.google.gson.internal.C18070i;
import com.google.gson.internal.bind.p1080a.C18000a;
import com.google.gson.p1078c.C17958a;
import com.google.gson.p1078c.C17960b;
import com.google.gson.p1078c.C17961c;
import java.io.IOException;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* renamed from: com.google.gson.a */
final class C17949a extends C18095w<Date> {

    /* renamed from: a */
    private final Class<? extends Date> f49840a;

    /* renamed from: b */
    private final List<DateFormat> f49841b = new ArrayList();

    public final String toString() {
        DateFormat dateFormat = (DateFormat) this.f49841b.get(0);
        if (dateFormat instanceof SimpleDateFormat) {
            StringBuilder sb = new StringBuilder("DefaultDateTypeAdapter(");
            sb.append(((SimpleDateFormat) dateFormat).toPattern());
            sb.append(')');
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder("DefaultDateTypeAdapter(");
        sb2.append(dateFormat.getClass().getSimpleName());
        sb2.append(')');
        return sb2.toString();
    }

    /* renamed from: a */
    private static Class<? extends Date> m43996a(Class<? extends Date> cls) {
        if (cls == Date.class || cls == java.sql.Date.class || cls == Timestamp.class) {
            return cls;
        }
        StringBuilder sb = new StringBuilder("Date type must be one of ");
        sb.append(Date.class);
        sb.append(", ");
        sb.append(Timestamp.class);
        sb.append(", or ");
        sb.append(java.sql.Date.class);
        sb.append(" but was ");
        sb.append(cls);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    private Date m43997a(String str) {
        synchronized (this.f49841b) {
            for (DateFormat parse : this.f49841b) {
                try {
                    Date parse2 = parse.parse(str);
                    return parse2;
                } catch (ParseException unused) {
                }
            }
            try {
                Date a = C18000a.m44169a(str, new ParsePosition(0));
                return a;
            } catch (ParseException e) {
                throw new C18091u(str, e);
            }
        }
    }

    public final /* synthetic */ Object read(C17958a aVar) throws IOException {
        if (aVar.mo34843f() == C17960b.NULL) {
            aVar.mo34847k();
            return null;
        }
        Date a = m43997a(aVar.mo34845i());
        if (this.f49840a == Date.class) {
            return a;
        }
        if (this.f49840a == Timestamp.class) {
            return new Timestamp(a.getTime());
        }
        if (this.f49840a == java.sql.Date.class) {
            return new java.sql.Date(a.getTime());
        }
        throw new AssertionError();
    }

    public final /* synthetic */ void write(C17961c cVar, Object obj) throws IOException {
        Date date = (Date) obj;
        if (date == null) {
            cVar.mo34870f();
            return;
        }
        synchronized (this.f49841b) {
            cVar.mo34864b(((DateFormat) this.f49841b.get(0)).format(date));
        }
    }

    C17949a(Class<? extends Date> cls, String str) {
        this.f49840a = m43996a(cls);
        this.f49841b.add(new SimpleDateFormat(str, Locale.US));
        if (!Locale.getDefault().equals(Locale.US)) {
            this.f49841b.add(new SimpleDateFormat(str));
        }
    }

    public C17949a(Class<? extends Date> cls, int i, int i2) {
        this.f49840a = m43996a(cls);
        this.f49841b.add(DateFormat.getDateTimeInstance(i, i2, Locale.US));
        if (!Locale.getDefault().equals(Locale.US)) {
            this.f49841b.add(DateFormat.getDateTimeInstance(i, i2));
        }
        if (C18058d.m44246a()) {
            this.f49841b.add(C18070i.m44261a(i, i2));
        }
    }
}
