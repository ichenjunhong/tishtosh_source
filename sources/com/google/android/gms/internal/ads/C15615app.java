package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.ate.C15645b;
import com.google.android.gms.internal.ads.azj;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.app */
public abstract class C15615app<P, KeyProto extends azj, KeyFormatProto extends azj> implements apo<P> {

    /* renamed from: a */
    private final Class<P> f41195a;

    /* renamed from: b */
    private final Class<KeyProto> f41196b;

    /* renamed from: c */
    private final Class<KeyFormatProto> f41197c;

    /* renamed from: d */
    private final String f41198d;

    protected C15615app(Class<P> cls, Class<KeyProto> cls2, Class<KeyFormatProto> cls3, String str) {
        this.f41195a = cls;
        this.f41196b = cls2;
        this.f41197c = cls3;
        this.f41198d = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract C15645b mo29452c();

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract P mo29453c(KeyProto keyproto) throws GeneralSecurityException;

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract KeyProto mo29454d(awo awo) throws ayi;

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract KeyProto mo29455d(KeyFormatProto keyformatproto) throws GeneralSecurityException;

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract KeyFormatProto mo29456e(awo awo) throws ayi;

    /* renamed from: a */
    private static <Casted> Casted m33876a(Object obj, String str, Class<Casted> cls) throws GeneralSecurityException {
        if (cls.isInstance(obj)) {
            return obj;
        }
        throw new GeneralSecurityException(str);
    }

    /* renamed from: a */
    public final P mo29445a(awo awo) throws GeneralSecurityException {
        try {
            return mo29453c((KeyProto) mo29454d(awo));
        } catch (ayi e) {
            String str = "Failures parsing proto of type ";
            String valueOf = String.valueOf(this.f41196b.getName());
            throw new GeneralSecurityException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str), e);
        }
    }

    /* renamed from: a */
    public final P mo29446a(azj azj) throws GeneralSecurityException {
        String str = "Expected proto of type ";
        String valueOf = String.valueOf(this.f41196b.getName());
        return mo29453c((KeyProto) (azj) m33876a(azj, valueOf.length() != 0 ? str.concat(valueOf) : new String(str), this.f41196b));
    }

    /* renamed from: b */
    public final azj mo29448b(awo awo) throws GeneralSecurityException {
        try {
            return mo29455d((KeyFormatProto) mo29456e(awo));
        } catch (ayi e) {
            String str = "Failures parsing proto of type ";
            String valueOf = String.valueOf(this.f41197c.getName());
            throw new GeneralSecurityException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str), e);
        }
    }

    /* renamed from: b */
    public final azj mo29449b(azj azj) throws GeneralSecurityException {
        String str = "Expected proto of type ";
        String valueOf = String.valueOf(this.f41197c.getName());
        return mo29455d((KeyFormatProto) (azj) m33876a(azj, valueOf.length() != 0 ? str.concat(valueOf) : new String(str), this.f41197c));
    }

    /* renamed from: a */
    public final String mo29447a() {
        return this.f41198d;
    }

    /* renamed from: c */
    public final ate mo29451c(awo awo) throws GeneralSecurityException {
        try {
            return (ate) ((axz) ate.m34108b().mo29527a(this.f41198d).mo29526a(mo29455d((KeyFormatProto) mo29456e(awo)).mo29579e()).mo29525a(mo29452c()).mo29832e());
        } catch (ayi e) {
            throw new GeneralSecurityException("Unexpected proto", e);
        }
    }

    /* renamed from: b */
    public final Class<P> mo29450b() {
        return this.f41195a;
    }
}
