package android.support.p030v4.widget;

import android.database.Cursor;
import android.widget.Filter;
import android.widget.Filter.FilterResults;

/* renamed from: android.support.v4.widget.g */
final class C1106g extends Filter {

    /* renamed from: a */
    C1107a f3536a;

    /* renamed from: android.support.v4.widget.g$a */
    interface C1107a {
        /* renamed from: a */
        Cursor mo3531a();

        /* renamed from: a */
        Cursor mo3532a(CharSequence charSequence);

        /* renamed from: a */
        void mo3534a(Cursor cursor);

        /* renamed from: b */
        CharSequence mo3537b(Cursor cursor);
    }

    C1106g(C1107a aVar) {
        this.f3536a = aVar;
    }

    public final CharSequence convertResultToString(Object obj) {
        return this.f3536a.mo3537b((Cursor) obj);
    }

    /* access modifiers changed from: protected */
    public final FilterResults performFiltering(CharSequence charSequence) {
        Cursor a = this.f3536a.mo3532a(charSequence);
        FilterResults filterResults = new FilterResults();
        if (a != null) {
            filterResults.count = a.getCount();
            filterResults.values = a;
        } else {
            filterResults.count = 0;
            filterResults.values = null;
        }
        return filterResults;
    }

    /* access modifiers changed from: protected */
    public final void publishResults(CharSequence charSequence, FilterResults filterResults) {
        Cursor a = this.f3536a.mo3531a();
        if (filterResults.values != null && filterResults.values != a) {
            this.f3536a.mo3534a((Cursor) filterResults.values);
        }
    }
}
