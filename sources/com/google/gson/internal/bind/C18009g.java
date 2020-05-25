package com.google.gson.internal.bind;

import com.google.gson.C18091u;
import com.google.gson.C18095w;
import com.google.gson.C18097x;
import com.google.gson.p1078c.C17958a;
import com.google.gson.p1078c.C17960b;
import com.google.gson.p1078c.C17961c;
import java.io.IOException;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/* renamed from: com.google.gson.internal.bind.g */
public final class C18009g extends C18095w<Date> {

    /* renamed from: a */
    public static final C18097x f50019a = new SqlDateTypeAdapter$1();

    /* renamed from: b */
    private final DateFormat f50020b = new SimpleDateFormat("MMM d, yyyy");

    /* access modifiers changed from: private */
    /* renamed from: a */
    public synchronized Date read(C17958a aVar) throws IOException {
        if (aVar.mo34843f() == C17960b.NULL) {
            aVar.mo34847k();
            return null;
        }
        try {
            return new Date(this.f50020b.parse(aVar.mo34845i()).getTime());
        } catch (ParseException e) {
            throw new C18091u((Throwable) e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public synchronized void write(C17961c cVar, Date date) throws IOException {
        String str;
        if (date == null) {
            str = null;
        } else {
            str = this.f50020b.format(date);
        }
        cVar.mo34864b(str);
    }
}
