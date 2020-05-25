package android.support.p030v4.widget;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.FilterQueryProvider;
import android.widget.Filterable;

/* renamed from: android.support.v4.widget.f */
public abstract class C1103f extends BaseAdapter implements C1107a, Filterable {

    /* renamed from: a */
    protected boolean f3525a;

    /* renamed from: b */
    protected boolean f3526b;

    /* renamed from: c */
    protected Cursor f3527c;

    /* renamed from: d */
    protected Context f3528d;

    /* renamed from: e */
    protected int f3529e;

    /* renamed from: f */
    protected C1104a f3530f;

    /* renamed from: g */
    protected DataSetObserver f3531g;

    /* renamed from: h */
    protected C1106g f3532h;

    /* renamed from: i */
    public FilterQueryProvider f3533i;

    /* renamed from: android.support.v4.widget.f$a */
    class C1104a extends ContentObserver {
        public final boolean deliverSelfNotifications() {
            return true;
        }

        public final void onChange(boolean z) {
            C1103f.this.mo3538b();
        }

        C1104a() {
            super(new Handler());
        }
    }

    /* renamed from: android.support.v4.widget.f$b */
    class C1105b extends DataSetObserver {
        public final void onChanged() {
            C1103f.this.f3525a = true;
            C1103f.this.notifyDataSetChanged();
        }

        public final void onInvalidated() {
            C1103f.this.f3525a = false;
            C1103f.this.notifyDataSetInvalidated();
        }

        C1105b() {
        }
    }

    /* renamed from: a */
    public final Cursor mo3531a() {
        return this.f3527c;
    }

    /* renamed from: a */
    public abstract View mo3533a(Context context, Cursor cursor, ViewGroup viewGroup);

    /* renamed from: a */
    public abstract void mo3535a(View view, Context context, Cursor cursor);

    public boolean hasStableIds() {
        return true;
    }

    public Filter getFilter() {
        if (this.f3532h == null) {
            this.f3532h = new C1106g(this);
        }
        return this.f3532h;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo3538b() {
        if (this.f3526b && this.f3527c != null && !this.f3527c.isClosed()) {
            this.f3525a = this.f3527c.requery();
        }
    }

    public int getCount() {
        if (!this.f3525a || this.f3527c == null) {
            return 0;
        }
        return this.f3527c.getCount();
    }

    /* renamed from: a */
    public Cursor mo3532a(CharSequence charSequence) {
        if (this.f3533i != null) {
            return this.f3533i.runQuery(charSequence);
        }
        return this.f3527c;
    }

    /* renamed from: b */
    public CharSequence mo3537b(Cursor cursor) {
        if (cursor == null) {
            return "";
        }
        return cursor.toString();
    }

    public Object getItem(int i) {
        if (!this.f3525a || this.f3527c == null) {
            return null;
        }
        this.f3527c.moveToPosition(i);
        return this.f3527c;
    }

    public long getItemId(int i) {
        if (!this.f3525a || this.f3527c == null || !this.f3527c.moveToPosition(i)) {
            return 0;
        }
        return this.f3527c.getLong(this.f3529e);
    }

    /* renamed from: a */
    public void mo3534a(Cursor cursor) {
        Cursor cursor2;
        if (cursor == this.f3527c) {
            cursor2 = null;
        } else {
            Cursor cursor3 = this.f3527c;
            if (cursor3 != null) {
                if (this.f3530f != null) {
                    cursor3.unregisterContentObserver(this.f3530f);
                }
                if (this.f3531g != null) {
                    cursor3.unregisterDataSetObserver(this.f3531g);
                }
            }
            this.f3527c = cursor;
            if (cursor != null) {
                if (this.f3530f != null) {
                    cursor.registerContentObserver(this.f3530f);
                }
                if (this.f3531g != null) {
                    cursor.registerDataSetObserver(this.f3531g);
                }
                this.f3529e = cursor.getColumnIndexOrThrow("_id");
                this.f3525a = true;
                notifyDataSetChanged();
            } else {
                this.f3529e = -1;
                this.f3525a = false;
                notifyDataSetInvalidated();
            }
            cursor2 = cursor3;
        }
        if (cursor2 != null) {
            cursor2.close();
        }
    }

    /* renamed from: b */
    public View mo3536b(Context context, Cursor cursor, ViewGroup viewGroup) {
        return mo3533a(context, cursor, viewGroup);
    }

    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (!this.f3525a) {
            return null;
        }
        this.f3527c.moveToPosition(i);
        if (view == null) {
            view = mo3536b(this.f3528d, this.f3527c, viewGroup);
        }
        mo3535a(view, this.f3528d, this.f3527c);
        return view;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (!this.f3525a) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        } else if (this.f3527c.moveToPosition(i)) {
            if (view == null) {
                view = mo3533a(this.f3528d, this.f3527c, viewGroup);
            }
            mo3535a(view, this.f3528d, this.f3527c);
            return view;
        } else {
            StringBuilder sb = new StringBuilder("couldn't move cursor to position ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
    }

    public C1103f(Context context, Cursor cursor, boolean z) {
        char c;
        int i;
        boolean z2 = true;
        if (z) {
            c = 1;
        } else {
            c = 2;
        }
        if ((c & 1) == 1) {
            c |= 2;
            this.f3526b = true;
        } else {
            this.f3526b = false;
        }
        if (cursor == null) {
            z2 = false;
        }
        this.f3527c = cursor;
        this.f3525a = z2;
        this.f3528d = context;
        if (z2) {
            i = cursor.getColumnIndexOrThrow("_id");
        } else {
            i = -1;
        }
        this.f3529e = i;
        if ((c & 2) == 2) {
            this.f3530f = new C1104a();
            this.f3531g = new C1105b();
        } else {
            this.f3530f = null;
            this.f3531g = null;
        }
        if (z2) {
            if (this.f3530f != null) {
                cursor.registerContentObserver(this.f3530f);
            }
            if (this.f3531g != null) {
                cursor.registerDataSetObserver(this.f3531g);
            }
        }
    }
}
