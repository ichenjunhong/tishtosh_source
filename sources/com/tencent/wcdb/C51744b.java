package com.tencent.wcdb;

import android.database.CharArrayBuffer;

/* renamed from: com.tencent.wcdb.b */
public abstract class C51744b extends C51742a {

    /* renamed from: i */
    protected CursorWindow f129007i;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo107097a() {
        super.mo107097a();
        mo107140c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo107099b() {
        super.mo107099b();
        if (this.f129007i == null) {
            throw new C51783m("Attempting to access a closed CursorWindow.Most probable cause: cursor is deactivated prior to calling this method.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo107140c() {
        if (this.f129007i != null) {
            this.f129007i.close();
            this.f129007i = null;
        }
    }

    public byte[] getBlob(int i) {
        mo107099b();
        return this.f129007i.mo107086b(this.f128994b, i);
    }

    public double getDouble(int i) {
        mo107099b();
        return this.f129007i.mo107091e(this.f128994b, i);
    }

    public float getFloat(int i) {
        mo107099b();
        return (float) this.f129007i.mo107091e(this.f128994b, i);
    }

    public int getInt(int i) {
        mo107099b();
        return (int) this.f129007i.mo107089d(this.f128994b, i);
    }

    public long getLong(int i) {
        mo107099b();
        return this.f129007i.mo107089d(this.f128994b, i);
    }

    public short getShort(int i) {
        mo107099b();
        return (short) ((int) this.f129007i.mo107089d(this.f128994b, i));
    }

    public String getString(int i) {
        mo107099b();
        return this.f129007i.mo107087c(this.f128994b, i);
    }

    public int getType(int i) {
        mo107099b();
        return this.f129007i.mo107083a(this.f128994b, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo107139a(String str) {
        if (this.f129007i == null) {
            this.f129007i = new CursorWindow(str);
        } else {
            this.f129007i.mo107084a();
        }
    }

    public boolean isNull(int i) {
        mo107099b();
        if (this.f129007i.mo107083a(this.f128994b, i) == 0) {
            return true;
        }
        return false;
    }

    public void copyStringToBuffer(int i, CharArrayBuffer charArrayBuffer) {
        mo107099b();
        CursorWindow cursorWindow = this.f129007i;
        int i2 = this.f128994b;
        if (charArrayBuffer != null) {
            cursorWindow.mo107205d();
            try {
                CursorWindow.nativeCopyStringToBuffer(cursorWindow.f128990a, i2 - cursorWindow.f128991b, i, charArrayBuffer);
            } finally {
                cursorWindow.mo107206e();
            }
        } else {
            throw new IllegalArgumentException("CharArrayBuffer should not be null");
        }
    }
}
