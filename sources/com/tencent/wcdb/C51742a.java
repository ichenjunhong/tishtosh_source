package com.tencent.wcdb;

import android.content.ContentResolver;
import android.database.CharArrayBuffer;
import android.database.ContentObservable;
import android.database.ContentObserver;
import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.net.Uri;
import android.os.Bundle;
import com.tencent.wcdb.support.Log;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.tencent.wcdb.a */
public abstract class C51742a implements C51746d {

    /* renamed from: a */
    protected HashMap<Long, Map<String, Object>> f128993a = new HashMap<>();

    /* renamed from: b */
    protected int f128994b = -1;

    /* renamed from: c */
    protected int f128995c = -1;

    /* renamed from: d */
    protected Long f128996d = null;

    /* renamed from: e */
    protected boolean f128997e;

    /* renamed from: f */
    protected ContentResolver f128998f;

    /* renamed from: g */
    final Object f128999g = new Object();

    /* renamed from: h */
    final ContentObservable f129000h = new ContentObservable();

    /* renamed from: i */
    private Uri f129001i;

    /* renamed from: j */
    private ContentObserver f129002j;

    /* renamed from: k */
    private boolean f129003k;

    /* renamed from: l */
    private final DataSetObservable f129004l = new DataSetObservable();

    /* renamed from: m */
    private Bundle f129005m = Bundle.EMPTY;

    /* renamed from: com.tencent.wcdb.a$a */
    protected static class C51743a extends ContentObserver {

        /* renamed from: a */
        WeakReference<C51742a> f129006a;

        public final boolean deliverSelfNotifications() {
            return false;
        }

        public C51743a(C51742a aVar) {
            super(null);
            this.f129006a = new WeakReference<>(aVar);
        }

        public final void onChange(boolean z) {
            C51742a aVar = (C51742a) this.f129006a.get();
            if (aVar != null) {
                synchronized (aVar.f128999g) {
                    aVar.f129000h.dispatchChange(false);
                }
            }
        }
    }

    /* renamed from: a */
    public boolean mo107098a(int i, int i2) {
        return true;
    }

    public void deactivate() {
        mo107097a();
    }

    public abstract String[] getColumnNames();

    public abstract int getCount();

    public Bundle getExtras() {
        return this.f129005m;
    }

    public abstract long getLong(int i);

    public Uri getNotificationUri() {
        return this.f129001i;
    }

    public final int getPosition() {
        return this.f128994b;
    }

    public abstract String getString(int i);

    public int getType(int i) {
        return 3;
    }

    public boolean getWantsAllOnMoveCalls() {
        return false;
    }

    public boolean isClosed() {
        return this.f128997e;
    }

    public int getColumnCount() {
        return getColumnNames().length;
    }

    public final boolean moveToFirst() {
        return moveToPosition(0);
    }

    public void close() {
        this.f128997e = true;
        this.f129000h.unregisterAll();
        mo107097a();
    }

    public final boolean isBeforeFirst() {
        if (getCount() == 0 || this.f128994b == -1) {
            return true;
        }
        return false;
    }

    public final boolean isFirst() {
        if (this.f128994b != 0 || getCount() == 0) {
            return false;
        }
        return true;
    }

    public final boolean isLast() {
        int count = getCount();
        if (this.f128994b != count - 1 || count == 0) {
            return false;
        }
        return true;
    }

    public final boolean moveToLast() {
        return moveToPosition(getCount() - 1);
    }

    public final boolean moveToNext() {
        return moveToPosition(this.f128994b + 1);
    }

    public final boolean moveToPrevious() {
        return moveToPosition(this.f128994b - 1);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo107097a() {
        if (this.f129002j != null) {
            this.f128998f.unregisterContentObserver(this.f129002j);
            this.f129003k = false;
        }
        this.f129004l.notifyInvalidated();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo107099b() {
        if (-1 == this.f128994b || getCount() == this.f128994b) {
            throw new C51776f(this.f128994b, getCount());
        }
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        if (this.f129002j != null && this.f129003k) {
            this.f128998f.unregisterContentObserver(this.f129002j);
        }
        try {
            if (!this.f128997e) {
                close();
            }
        } catch (Exception unused) {
        }
    }

    public final boolean isAfterLast() {
        if (getCount() == 0 || this.f128994b == getCount()) {
            return true;
        }
        return false;
    }

    public boolean requery() {
        if (this.f129002j != null && !this.f129003k) {
            this.f128998f.registerContentObserver(this.f129001i, true, this.f129002j);
            this.f129003k = true;
        }
        this.f129004l.notifyChanged();
        return true;
    }

    public Bundle respond(Bundle bundle) {
        return Bundle.EMPTY;
    }

    public byte[] getBlob(int i) {
        throw new UnsupportedOperationException("getBlob is not supported");
    }

    public String getColumnName(int i) {
        return getColumnNames()[i];
    }

    public final boolean move(int i) {
        return moveToPosition(this.f128994b + i);
    }

    public void registerContentObserver(ContentObserver contentObserver) {
        this.f129000h.registerObserver(contentObserver);
    }

    public void registerDataSetObserver(DataSetObserver dataSetObserver) {
        this.f129004l.registerObserver(dataSetObserver);
    }

    public void setExtras(Bundle bundle) {
        if (bundle == null) {
            bundle = Bundle.EMPTY;
        }
        this.f129005m = bundle;
    }

    public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
        this.f129004l.unregisterObserver(dataSetObserver);
    }

    public void unregisterContentObserver(ContentObserver contentObserver) {
        if (!this.f128997e) {
            this.f129000h.unregisterObserver(contentObserver);
        }
    }

    public int getColumnIndexOrThrow(String str) {
        int columnIndex = getColumnIndex(str);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        StringBuilder sb = new StringBuilder("column '");
        sb.append(str);
        sb.append("' does not exist");
        throw new IllegalArgumentException(sb.toString());
    }

    public int getColumnIndex(String str) {
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf != -1) {
            Exception exc = new Exception();
            StringBuilder sb = new StringBuilder("requesting column name with table name -- ");
            sb.append(str);
            Log.m111074a("Cursor", sb.toString(), exc);
            str = str.substring(lastIndexOf + 1);
        }
        String[] columnNames = getColumnNames();
        int length = columnNames.length;
        for (int i = 0; i < length; i++) {
            if (columnNames[i].equalsIgnoreCase(str)) {
                return i;
            }
        }
        return -1;
    }

    public boolean moveToPosition(int i) {
        int count = getCount();
        if (i >= count) {
            this.f128994b = count;
            return false;
        } else if (i < 0) {
            this.f128994b = -1;
            return false;
        } else if (i == this.f128994b) {
            return true;
        } else {
            mo107098a(this.f128994b, i);
            this.f128994b = i;
            if (this.f128995c != -1) {
                this.f128996d = Long.valueOf(getLong(this.f128995c));
            }
            return true;
        }
    }

    public void copyStringToBuffer(int i, CharArrayBuffer charArrayBuffer) {
        String string = getString(i);
        if (string != null) {
            char[] cArr = charArrayBuffer.data;
            if (cArr == null || cArr.length < string.length()) {
                charArrayBuffer.data = string.toCharArray();
            } else {
                string.getChars(0, string.length(), cArr, 0);
            }
            charArrayBuffer.sizeCopied = string.length();
            return;
        }
        charArrayBuffer.sizeCopied = 0;
    }

    public void setNotificationUri(ContentResolver contentResolver, Uri uri) {
        synchronized (this.f128999g) {
            this.f129001i = uri;
            this.f128998f = contentResolver;
            if (this.f129002j != null) {
                this.f128998f.unregisterContentObserver(this.f129002j);
            }
            this.f129002j = new C51743a(this);
            this.f128998f.registerContentObserver(this.f129001i, true, this.f129002j);
            this.f129003k = true;
        }
    }
}
