package com.p683ss.android.ugc.aweme.emoji.utils.p1694a;

import com.p683ss.android.ugc.aweme.emoji.utils.p1694a.C29438d.C29439a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;

/* renamed from: com.ss.android.ugc.aweme.emoji.utils.a.u */
public class C29459u extends ZipEntry implements Cloneable {

    /* renamed from: f */
    private static final byte[] f77124f = new byte[0];

    /* renamed from: l */
    private static final C29460v[] f77125l = new C29460v[0];

    /* renamed from: a */
    public int f77126a;

    /* renamed from: b */
    public int f77127b;

    /* renamed from: c */
    public long f77128c;

    /* renamed from: d */
    public C29448l f77129d;

    /* renamed from: e */
    public C29441f f77130e;

    /* renamed from: g */
    private int f77131g;

    /* renamed from: h */
    private long f77132h;

    /* renamed from: i */
    private C29460v[] f77133i;

    /* renamed from: j */
    private String f77134j;

    /* renamed from: k */
    private byte[] f77135k;

    public int getMethod() {
        return this.f77131g;
    }

    public long getSize() {
        return this.f77132h;
    }

    /* renamed from: a */
    public final void mo59538a(byte[] bArr) {
        try {
            m69489a(C29438d.m69433a(bArr, false, C29439a.f77082c), false);
        } catch (ZipException e) {
            throw new RuntimeException(e.getMessage(), e);
        }
    }

    protected C29459u() {
        this("");
    }

    /* renamed from: d */
    private C29460v[] m69495d() {
        if (this.f77129d == null) {
            return f77125l;
        }
        return new C29460v[]{this.f77129d};
    }

    /* renamed from: f */
    private byte[] m69497f() {
        byte[] extra = getExtra();
        if (extra != null) {
            return extra;
        }
        return f77124f;
    }

    public String getName() {
        if (this.f77134j == null) {
            return super.getName();
        }
        return this.f77134j;
    }

    public int hashCode() {
        return getName().hashCode();
    }

    public boolean isDirectory() {
        return getName().endsWith("/");
    }

    /* renamed from: c */
    private C29460v[] m69494c() {
        C29460v[] a = m69491a(this.f77133i, this.f77133i.length + 1);
        a[this.f77133i.length] = this.f77129d;
        return a;
    }

    /* renamed from: e */
    private C29460v[] m69496e() {
        if (this.f77133i == null) {
            return m69495d();
        }
        if (this.f77129d != null) {
            return m69494c();
        }
        return this.f77133i;
    }

    public Object clone() {
        C29459u uVar = (C29459u) super.clone();
        uVar.f77126a = this.f77126a;
        uVar.f77128c = this.f77128c;
        uVar.m69488a(m69496e());
        return uVar;
    }

    /* renamed from: b */
    public final byte[] mo59540b() {
        boolean z;
        int i;
        C29460v[] a = m69490a(true);
        if (a.length <= 0 || !(a[a.length - 1] instanceof C29448l)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            i = a.length - 1;
        } else {
            i = a.length;
        }
        int i2 = i * 4;
        for (C29460v b : a) {
            i2 += b.mo59508b().f77201a;
        }
        byte[] bArr = new byte[i2];
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4++) {
            System.arraycopy(a[i4].mo59512e().mo59566a(), 0, bArr, i3, 2);
            System.arraycopy(a[i4].mo59508b().mo59566a(), 0, bArr, i3 + 2, 2);
            byte[] a2 = a[i4].mo59507a();
            System.arraycopy(a2, 0, bArr, i3 + 4, a2.length);
            i3 += a2.length + 4;
        }
        if (z) {
            byte[] a3 = a[a.length - 1].mo59507a();
            System.arraycopy(a3, 0, bArr, i3, a3.length);
        }
        return bArr;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo59533a() {
        super.setExtra(C29438d.m69432a(m69490a(true)));
    }

    /* renamed from: b */
    private C29460v[] m69493b(C29460v[] vVarArr) {
        return m69491a(vVarArr, vVarArr.length);
    }

    /* renamed from: a */
    private C29460v[] m69490a(boolean z) {
        C29460v[] e = m69496e();
        if (e == this.f77133i) {
            return m69493b(e);
        }
        return e;
    }

    private C29459u(String str) {
        super(str);
        this.f77131g = -1;
        this.f77132h = -1;
        this.f77130e = new C29441f();
        mo59536a(str);
    }

    /* renamed from: b */
    public final C29460v mo59539b(C29471z zVar) {
        C29460v[] vVarArr;
        if (this.f77133i != null) {
            for (C29460v vVar : this.f77133i) {
                if (zVar.equals(vVar.mo59512e())) {
                    return vVar;
                }
            }
        }
        return null;
    }

    public void setMethod(int i) {
        if (i >= 0) {
            this.f77131g = i;
            return;
        }
        StringBuilder sb = new StringBuilder("ZIP compression method can not be negative: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    public void setSize(long j) {
        if (j >= 0) {
            this.f77132h = j;
            return;
        }
        throw new IllegalArgumentException("invalid entry size");
    }

    /* renamed from: a */
    private void m69488a(C29460v[] vVarArr) {
        ArrayList arrayList = new ArrayList();
        for (C29448l lVar : vVarArr) {
            if (lVar instanceof C29448l) {
                this.f77129d = lVar;
            } else {
                arrayList.add(lVar);
            }
        }
        this.f77133i = (C29460v[]) arrayList.toArray(new C29460v[arrayList.size()]);
        mo59533a();
    }

    /* renamed from: b */
    private void m69492b(C29460v vVar) {
        if (vVar instanceof C29448l) {
            this.f77129d = (C29448l) vVar;
        } else if (this.f77133i == null) {
            this.f77133i = new C29460v[]{vVar};
        } else {
            if (mo59539b(vVar.mo59512e()) != null) {
                mo59535a(vVar.mo59512e());
            }
            C29460v[] a = m69491a(this.f77133i, this.f77133i.length + 1);
            a[this.f77133i.length] = vVar;
            this.f77133i = a;
        }
        mo59533a();
    }

    public void setExtra(byte[] bArr) throws RuntimeException {
        try {
            m69489a(C29438d.m69433a(bArr, true, C29439a.f77082c), true);
        } catch (ZipException e) {
            StringBuilder sb = new StringBuilder("Error parsing extra fields for entry: ");
            sb.append(getName());
            sb.append(" - ");
            sb.append(e.getMessage());
            throw new RuntimeException(sb.toString(), e);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C29459u uVar = (C29459u) obj;
        String name = getName();
        String name2 = uVar.getName();
        if (name == null) {
            if (name2 != null) {
                return false;
            }
        } else if (!name.equals(name2)) {
            return false;
        }
        String comment = getComment();
        String comment2 = uVar.getComment();
        if (comment == null) {
            comment = "";
        }
        if (comment2 == null) {
            comment2 = "";
        }
        if (getTime() == uVar.getTime() && comment.equals(comment2) && this.f77126a == uVar.f77126a && this.f77127b == uVar.f77127b && this.f77128c == uVar.f77128c && getMethod() == uVar.getMethod() && getSize() == uVar.getSize() && getCrc() == uVar.getCrc() && getCompressedSize() == uVar.getCompressedSize() && Arrays.equals(mo59540b(), uVar.mo59540b()) && Arrays.equals(m69497f(), uVar.m69497f()) && this.f77130e.equals(uVar.f77130e)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo59534a(C29460v vVar) {
        int i;
        if (mo59539b(vVar.mo59512e()) != null) {
            mo59535a(vVar.mo59512e());
        }
        C29460v[] vVarArr = this.f77133i;
        if (this.f77133i != null) {
            i = this.f77133i.length + 1;
        } else {
            i = 1;
        }
        this.f77133i = new C29460v[i];
        this.f77133i[0] = vVar;
        if (vVarArr != null) {
            System.arraycopy(vVarArr, 0, this.f77133i, 1, this.f77133i.length - 1);
        }
        mo59533a();
    }

    /* renamed from: a */
    public final void mo59535a(C29471z zVar) {
        C29460v[] vVarArr;
        if (this.f77133i != null) {
            ArrayList arrayList = new ArrayList();
            for (C29460v vVar : this.f77133i) {
                if (!zVar.equals(vVar.mo59512e())) {
                    arrayList.add(vVar);
                }
            }
            if (this.f77133i.length != arrayList.size()) {
                this.f77133i = (C29460v[]) arrayList.toArray(new C29460v[arrayList.size()]);
                mo59533a();
                return;
            }
            throw new NoSuchElementException();
        }
        throw new NoSuchElementException();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo59536a(String str) {
        if (str != null && this.f77127b == 0 && !str.contains("/")) {
            str = str.replace('\\', '/');
        }
        this.f77134j = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo59537a(String str, byte[] bArr) {
        mo59536a(str);
        this.f77135k = bArr;
    }

    /* renamed from: a */
    private static C29460v[] m69491a(C29460v[] vVarArr, int i) {
        C29460v[] vVarArr2 = new C29460v[i];
        System.arraycopy(vVarArr, 0, vVarArr2, 0, Math.min(vVarArr.length, i));
        return vVarArr2;
    }

    /* renamed from: a */
    private void m69489a(C29460v[] vVarArr, boolean z) throws ZipException {
        C29460v vVar;
        if (this.f77133i == null) {
            m69488a(vVarArr);
            return;
        }
        for (C29460v vVar2 : vVarArr) {
            if (vVar2 instanceof C29448l) {
                vVar = this.f77129d;
            } else {
                vVar = mo59539b(vVar2.mo59512e());
            }
            if (vVar == null) {
                m69492b(vVar2);
            } else if (z || !(vVar instanceof C29437c)) {
                byte[] c = vVar2.mo59509c();
                vVar.mo59506a(c, 0, c.length);
            } else {
                byte[] a = vVar2.mo59507a();
                ((C29437c) vVar).mo59513b(a, 0, a.length);
            }
        }
        mo59533a();
    }
}
