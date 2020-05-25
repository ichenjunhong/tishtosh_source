package androidx.versionedparcelable;

import android.os.Parcelable;
import com.C2240a;
import com.p683ss.android.ugc.aweme.sharer.p2172b.C42311c;
import java.lang.reflect.InvocationTargetException;

/* renamed from: androidx.versionedparcelable.a */
public abstract class C1524a {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo5877a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo5878a(int i);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo5880a(Parcelable parcelable);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo5884a(String str);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo5886a(byte[] bArr);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract C1524a mo5890b();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract boolean mo5893b(int i);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract int mo5895c();

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract void mo5896c(int i);

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract String mo5897d();

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract byte[] mo5898e();

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract <T extends Parcelable> T mo5899f();

    /* renamed from: a */
    public final void mo5887a(byte[] bArr, int i) {
        mo5896c(2);
        mo5886a(bArr);
    }

    /* renamed from: a */
    public final void mo5885a(String str, int i) {
        mo5896c(7);
        mo5884a(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final <T extends C1526c> T mo5900g() {
        String d = mo5897d();
        if (d == null) {
            return null;
        }
        return m5437a(d, mo5890b());
    }

    /* renamed from: c */
    private static <T extends C1526c> Class m5441c(T t) throws ClassNotFoundException {
        return m5438a(t.getClass());
    }

    /* renamed from: a */
    private static Class m5438a(Class<? extends C1526c> cls) throws ClassNotFoundException {
        return Class.forName(C2240a.m6772a("%s.%sParcelizer", new Object[]{cls.getPackage().getName(), cls.getSimpleName()}), false, cls.getClassLoader());
    }

    /* renamed from: b */
    private void m5440b(C1526c cVar) {
        try {
            mo5884a(m5438a(cVar.getClass()).getName());
        } catch (ClassNotFoundException e) {
            StringBuilder sb = new StringBuilder();
            sb.append(cVar.getClass().getSimpleName());
            sb.append(" does not have a Parcelizer");
            throw new RuntimeException(sb.toString(), e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo5882a(C1526c cVar) {
        if (cVar == null) {
            mo5884a((String) null);
            return;
        }
        m5440b(cVar);
        C1524a b = mo5890b();
        m5439a((T) cVar, b);
        b.mo5877a();
    }

    /* renamed from: a */
    public final void mo5879a(int i, int i2) {
        mo5896c(i2);
        mo5878a(i);
    }

    /* renamed from: b */
    public final int mo5888b(int i, int i2) {
        if (!mo5893b(i2)) {
            return i;
        }
        return mo5895c();
    }

    /* renamed from: b */
    public final <T extends Parcelable> T mo5889b(T t, int i) {
        if (!mo5893b(i)) {
            return t;
        }
        return mo5899f();
    }

    /* renamed from: a */
    private static <T extends C1526c> T m5437a(String str, C1524a aVar) {
        try {
            return (C1526c) Class.forName(str, true, C1524a.class.getClassLoader()).getDeclaredMethod("read", new Class[]{C1524a.class}).invoke(null, new Object[]{aVar});
        } catch (IllegalAccessException e) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e);
        } catch (InvocationTargetException e2) {
            if (e2.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e2.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (ClassNotFoundException e4) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e4);
        }
    }

    /* renamed from: b */
    public final <T extends C1526c> T mo5891b(T t, int i) {
        if (!mo5893b(1)) {
            return t;
        }
        return mo5900g();
    }

    /* renamed from: a */
    private static <T extends C1526c> void m5439a(T t, C1524a aVar) {
        try {
            m5441c(t).getDeclaredMethod(C42311c.f106862f, new Class[]{t.getClass(), C1524a.class}).invoke(null, new Object[]{t, aVar});
        } catch (IllegalAccessException e) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e);
        } catch (InvocationTargetException e2) {
            if (e2.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e2.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (ClassNotFoundException e4) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e4);
        }
    }

    /* renamed from: b */
    public final String mo5892b(String str, int i) {
        if (!mo5893b(7)) {
            return str;
        }
        return mo5897d();
    }

    /* renamed from: a */
    public final void mo5881a(Parcelable parcelable, int i) {
        mo5896c(i);
        mo5880a(parcelable);
    }

    /* renamed from: b */
    public final byte[] mo5894b(byte[] bArr, int i) {
        if (!mo5893b(2)) {
            return bArr;
        }
        return mo5898e();
    }

    /* renamed from: a */
    public final void mo5883a(C1526c cVar, int i) {
        mo5896c(1);
        mo5882a(cVar);
    }
}
