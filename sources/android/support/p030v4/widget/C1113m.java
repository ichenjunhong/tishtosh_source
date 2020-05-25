package android.support.p030v4.widget;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: android.support.v4.widget.m */
public abstract class C1113m extends C1103f {

    /* renamed from: j */
    public int f3547j;

    /* renamed from: k */
    public int f3548k;

    /* renamed from: l */
    private LayoutInflater f3549l;

    /* renamed from: a */
    public View mo3533a(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f3549l.inflate(this.f3547j, viewGroup, false);
    }

    /* renamed from: b */
    public final View mo3536b(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f3549l.inflate(this.f3548k, viewGroup, false);
    }

    public C1113m(Context context, int i, Cursor cursor, boolean z) {
        super(context, null, true);
        this.f3548k = i;
        this.f3547j = i;
        this.f3549l = (LayoutInflater) context.getSystemService("layout_inflater");
    }
}
