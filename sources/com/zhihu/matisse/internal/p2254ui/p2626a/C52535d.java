package com.zhihu.matisse.internal.p2254ui.p2626a;

import android.database.Cursor;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1352v;

/* renamed from: com.zhihu.matisse.internal.ui.a.d */
public abstract class C52535d<VH extends C1352v> extends C1322a<VH> {

    /* renamed from: a */
    private int f130809a;

    /* renamed from: c */
    public Cursor f130810c;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo110057a(int i, Cursor cursor);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo110058a(VH vh, Cursor cursor);

    public int getItemCount() {
        if (m112017b(this.f130810c)) {
            return this.f130810c.getCount();
        }
        return 0;
    }

    C52535d(Cursor cursor) {
        setHasStableIds(true);
        mo110067a(null);
    }

    /* renamed from: b */
    private static boolean m112017b(Cursor cursor) {
        if (cursor == null || cursor.isClosed()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo110067a(Cursor cursor) {
        if (cursor != this.f130810c) {
            if (cursor != null) {
                this.f130810c = cursor;
                this.f130809a = this.f130810c.getColumnIndexOrThrow("_id");
                notifyDataSetChanged();
                return;
            }
            notifyItemRangeRemoved(0, getItemCount());
            this.f130810c = null;
            this.f130809a = -1;
        }
    }

    public long getItemId(int i) {
        if (!m112017b(this.f130810c)) {
            throw new IllegalStateException("Cannot lookup item id when cursor is in invalid state.");
        } else if (this.f130810c.moveToPosition(i)) {
            return this.f130810c.getLong(this.f130809a);
        } else {
            StringBuilder sb = new StringBuilder("Could not move cursor to position ");
            sb.append(i);
            sb.append(" when trying to get an item id");
            throw new IllegalStateException(sb.toString());
        }
    }

    public int getItemViewType(int i) {
        if (this.f130810c.moveToPosition(i)) {
            return mo110057a(i, this.f130810c);
        }
        StringBuilder sb = new StringBuilder("Could not move cursor to position ");
        sb.append(i);
        sb.append(" when trying to get item view type.");
        throw new IllegalStateException(sb.toString());
    }

    public void onBindViewHolder(VH vh, int i) {
        if (!m112017b(this.f130810c)) {
            throw new IllegalStateException("Cannot bind view holder when cursor is in invalid state.");
        } else if (this.f130810c.moveToPosition(i)) {
            mo110058a(vh, this.f130810c);
        } else {
            StringBuilder sb = new StringBuilder("Could not move cursor to position ");
            sb.append(i);
            sb.append(" when trying to bind view holder");
            throw new IllegalStateException(sb.toString());
        }
    }
}
