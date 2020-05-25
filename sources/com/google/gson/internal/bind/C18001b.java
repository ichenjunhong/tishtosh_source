package com.google.gson.internal.bind;

import com.google.gson.C18091u;
import com.google.gson.C18095w;
import com.google.gson.C18097x;
import com.google.gson.internal.C18058d;
import com.google.gson.internal.C18070i;
import com.google.gson.internal.bind.p1080a.C18000a;
import com.google.gson.p1078c.C17958a;
import com.google.gson.p1078c.C17960b;
import com.google.gson.p1078c.C17961c;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* renamed from: com.google.gson.internal.bind.b */
public final class C18001b extends C18095w<Date> {

    /* renamed from: a */
    public static final C18097x f50003a = new DateTypeAdapter$1();

    /* renamed from: b */
    private final List<DateFormat> f50004b = new ArrayList();

    public C18001b() {
        this.f50004b.add(DateFormat.getDateTimeInstance(2, 2, Locale.US));
        if (!Locale.getDefault().equals(Locale.US)) {
            this.f50004b.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (C18058d.m44246a()) {
            this.f50004b.add(C18070i.m44261a(2, 2));
        }
    }

    public final /* synthetic */ Object read(C17958a aVar) throws IOException {
        if (aVar.mo34843f() != C17960b.NULL) {
            return m44171a(aVar.mo34845i());
        }
        aVar.mo34847k();
        return null;
    }

    /* renamed from: a */
    private synchronized Date m44171a(String str) {
        for (DateFormat parse : this.f50004b) {
            try {
                return parse.parse(str);
            } catch (ParseException unused) {
            }
        }
        try {
            return C18000a.m44169a(str, new ParsePosition(0));
        } catch (ParseException e) {
            throw new C18091u(str, e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public synchronized void write(C17961c cVar, Date date) throws IOException {
        if (date == null) {
            cVar.mo34870f();
        } else {
            cVar.mo34864b(((DateFormat) this.f50004b.get(0)).format(date));
        }
    }
}
