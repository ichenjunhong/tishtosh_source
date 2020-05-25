package com.zhihu.matisse.internal.p2254ui.p2626a;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CursorAdapter;
import android.widget.TextView;
import com.facebook.drawee.p940f.C13833a;
import com.facebook.drawee.p940f.C13834b;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.imagepipeline.common.C13952d;
import com.facebook.imagepipeline.p975o.C14229b;
import com.facebook.imagepipeline.p975o.C14232c;
import com.ss.android.ugc.trill.R;
import com.zhihu.matisse.internal.entity.Album;
import java.io.File;

/* renamed from: com.zhihu.matisse.internal.ui.a.b */
public final class C52532b extends CursorAdapter {

    /* renamed from: a */
    private final Drawable f130806a;

    public final View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
        return LayoutInflater.from(context).inflate(R.layout.f4, viewGroup, false);
    }

    public C52532b(Context context, Cursor cursor, boolean z) {
        super(context, null, false);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.ai});
        this.f130806a = obtainStyledAttributes.getDrawable(0);
        obtainStyledAttributes.recycle();
    }

    public final void bindView(View view, Context context, Cursor cursor) {
        Album a = Album.m98883a(cursor);
        ((TextView) view.findViewById(R.id.e_)).setText(a.mo91655a(context));
        ((TextView) view.findViewById(R.id.e9)).setText(String.valueOf(a.f114651d));
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) view.findViewById(R.id.e6);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.jb);
        C14229b a2 = C14232c.m29169a(Uri.fromFile(new File(a.f114650c))).mo26453a(new C13952d(dimensionPixelSize, dimensionPixelSize)).mo26449a();
        C13833a aVar = (C13833a) simpleDraweeView.getHierarchy();
        if (aVar == null) {
            aVar = new C13834b(context.getResources()).mo25912a();
        }
        aVar.mo25904b(this.f130806a);
        simpleDraweeView.setHierarchy(aVar);
        simpleDraweeView.setImageRequest(a2);
    }
}
