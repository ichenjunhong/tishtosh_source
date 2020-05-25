package com.bytedance.frameworks.baselib.network.http.p573d;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Locale;

/* renamed from: com.bytedance.frameworks.baselib.network.http.d.a */
public final class C9890a implements Externalizable {

    /* renamed from: a */
    private String f26950a;

    /* renamed from: b */
    private String f26951b;

    /* renamed from: c */
    private C9891b f26952c;

    public final C9891b getParameters() {
        return this.f26952c;
    }

    public final String getPrimaryType() {
        return this.f26950a;
    }

    public final String getSubType() {
        return this.f26951b;
    }

    public C9890a() {
        this.f26950a = "application";
        this.f26951b = "*";
        this.f26952c = new C9891b();
    }

    public final String getBaseType() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f26950a);
        sb.append("/");
        sb.append(this.f26951b);
        return sb.toString();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getBaseType());
        sb.append(this.f26952c.toString());
        return sb.toString();
    }

    public C9890a(String str) throws C9892c {
        m19795a(str);
    }

    public final boolean match(String str) throws C9892c {
        return match(new C9890a(str));
    }

    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeUTF(toString());
        objectOutput.flush();
    }

    /* renamed from: a */
    private static boolean m19796a(char c) {
        if (c <= ' ' || c >= 127 || "()<>@,;:/[]?=\\\"".indexOf(c) >= 0) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private static boolean m19797b(String str) {
        int length = str.length();
        if (length <= 0) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            if (!m19796a(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public final String getParameter(String str) {
        return (String) this.f26952c.f26953a.get(str.trim().toLowerCase(Locale.ENGLISH));
    }

    public final void readExternal(ObjectInput objectInput) throws IOException, ClassNotFoundException {
        try {
            m19795a(objectInput.readUTF());
        } catch (C9892c e) {
            throw new IOException(e.toString());
        }
    }

    public final void removeParameter(String str) {
        this.f26952c.f26953a.remove(str.trim().toLowerCase(Locale.ENGLISH));
    }

    public final void setPrimaryType(String str) throws C9892c {
        if (m19797b(this.f26950a)) {
            this.f26950a = str.toLowerCase(Locale.ENGLISH);
            return;
        }
        throw new C9892c("Primary type is invalid.");
    }

    public final void setSubType(String str) throws C9892c {
        if (m19797b(this.f26951b)) {
            this.f26951b = str.toLowerCase(Locale.ENGLISH);
            return;
        }
        throw new C9892c("Sub type is invalid.");
    }

    public final boolean match(C9890a aVar) {
        if (!this.f26950a.equals(aVar.getPrimaryType()) || (!this.f26951b.equals("*") && !aVar.getSubType().equals("*") && !this.f26951b.equals(aVar.getSubType()))) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private void m19795a(String str) throws C9892c {
        int indexOf = str.indexOf(47);
        int indexOf2 = str.indexOf(59);
        if (indexOf < 0 && indexOf2 < 0) {
            throw new C9892c("Unable to find a sub type.");
        } else if (indexOf >= 0 || indexOf2 < 0) {
            if (indexOf >= 0 && indexOf2 < 0) {
                this.f26950a = str.substring(0, indexOf).trim().toLowerCase(Locale.ENGLISH);
                this.f26951b = str.substring(indexOf + 1).trim().toLowerCase(Locale.ENGLISH);
                this.f26952c = new C9891b();
            } else if (indexOf < indexOf2) {
                this.f26950a = str.substring(0, indexOf).trim().toLowerCase(Locale.ENGLISH);
                this.f26951b = str.substring(indexOf + 1, indexOf2).trim().toLowerCase(Locale.ENGLISH);
                this.f26952c = new C9891b(str.substring(indexOf2));
            } else {
                throw new C9892c("Unable to find a sub type.");
            }
            if (!m19797b(this.f26950a)) {
                throw new C9892c("Primary type is invalid.");
            } else if (!m19797b(this.f26951b)) {
                throw new C9892c("Sub type is invalid.");
            }
        } else {
            throw new C9892c("Unable to find a sub type.");
        }
    }

    public final void setParameter(String str, String str2) {
        this.f26952c.f26953a.put(str.trim().toLowerCase(Locale.ENGLISH), str2);
    }

    public C9890a(String str, String str2) throws C9892c {
        if (m19797b(str)) {
            this.f26950a = str.toLowerCase(Locale.ENGLISH);
            if (m19797b(str2)) {
                this.f26951b = str2.toLowerCase(Locale.ENGLISH);
                this.f26952c = new C9891b();
                return;
            }
            throw new C9892c("Sub type is invalid.");
        }
        throw new C9892c("Primary type is invalid.");
    }
}
