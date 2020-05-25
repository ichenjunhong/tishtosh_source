package com.google.gson.internal.bind;

import com.google.gson.C18091u;
import com.google.gson.C18095w;
import com.google.gson.C18097x;
import com.google.gson.p1078c.C17958a;
import com.google.gson.p1078c.C17960b;
import com.google.gson.p1078c.C17961c;
import java.io.IOException;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/* renamed from: com.google.gson.internal.bind.h */
public final class C18010h extends C18095w<Time> {

    /* renamed from: a */
    public static final C18097x f50021a = new TimeTypeAdapter$1();

    /* renamed from: b */
    private final DateFormat f50022b = new SimpleDateFormat("hh:mm:ss a");

    /* access modifiers changed from: private */
    /* renamed from: a */
    public synchronized Time read(C17958a aVar) throws IOException {
        if (aVar.mo34843f() == C17960b.NULL) {
            aVar.mo34847k();
            return null;
        }
        try {
            return new Time(this.f50022b.parse(aVar.mo34845i()).getTime());
        } catch (ParseException e) {
            throw new C18091u((Throwable) e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public synchronized void write(C17961c cVar, Time time) throws IOException {
        String str;
        if (time == null) {
            str = null;
        } else {
            str = this.f50022b.format(time);
        }
        cVar.mo34864b(str);
    }
}
