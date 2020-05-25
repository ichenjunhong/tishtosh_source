package com.google.p997a.p998a.p1013e;

import com.google.p997a.p998a.p1020g.C14794c;
import com.google.p997a.p998a.p1020g.C14806j;
import com.google.p997a.p998a.p1020g.C14815p;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* renamed from: com.google.a.a.e.a */
public class C14771a extends C14806j implements Cloneable {

    /* renamed from: a */
    public C14774b f38283a;

    /* renamed from: a */
    public C14771a clone() {
        return (C14771a) super.clone();
    }

    public String toString() {
        if (this.f38283a == null) {
            return super.toString();
        }
        try {
            C14774b bVar = this.f38283a;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            C14775c a = bVar.mo27066a(byteArrayOutputStream, C14794c.f38313a);
            a.mo27083a(false, this);
            a.mo27067a();
            return byteArrayOutputStream.toString("UTF-8");
        } catch (IOException e) {
            throw C14815p.m30292a(e);
        }
    }

    /* renamed from: a */
    public C14771a mo27048b(String str, Object obj) {
        return (C14771a) super.mo27048b(str, obj);
    }
}
