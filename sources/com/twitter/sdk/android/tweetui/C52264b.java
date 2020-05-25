package com.twitter.sdk.android.tweetui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.support.p030v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import com.squareup.p1094a.C18350ae;
import com.squareup.p1094a.C18351af;
import com.squareup.p1094a.C18356aj;
import com.squareup.p1094a.C18391r;
import com.squareup.p1094a.C18396v;
import com.squareup.p1094a.C18396v.C18402d;
import com.squareup.p1094a.C18409y;
import com.squareup.p1094a.C18412z;
import com.twitter.sdk.android.core.models.C52203j;
import com.twitter.sdk.android.tweetui.internal.C52291b;
import com.twitter.sdk.android.tweetui.internal.C52296f.C52297a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.twitter.sdk.android.tweetui.b */
final class C52264b extends PagerAdapter {

    /* renamed from: a */
    final List<C52203j> f130131a = new ArrayList();

    /* renamed from: b */
    final Context f130132b;

    /* renamed from: c */
    final C52297a f130133c;

    public final boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }

    public final int getCount() {
        return this.f130131a.size();
    }

    C52264b(Context context, C52297a aVar) {
        this.f130132b = context;
        this.f130133c = aVar;
    }

    public final Object instantiateItem(ViewGroup viewGroup, int i) {
        C52291b bVar = new C52291b(this.f130132b);
        bVar.setSwipeToDismissCallback(this.f130133c);
        viewGroup.addView(bVar);
        C18412z a = C18396v.m44672a(this.f130132b).mo36849a(((C52203j) this.f130131a.get(i)).mediaUrlHttps);
        long nanoTime = System.nanoTime();
        C18356aj.m44597a();
        if (!a.f50875c) {
            Drawable drawable = null;
            if (!a.f50874b.mo36876a()) {
                a.f50873a.mo36854a((C18350ae) bVar);
                if (a.f50876d) {
                    drawable = a.mo36888c();
                }
                bVar.mo36797a(drawable);
            } else {
                C18409y a2 = a.mo36879a(nanoTime);
                String a3 = C18356aj.m44595a(a2);
                if (C18391r.shouldReadFromMemoryCache(a.f50879g)) {
                    Bitmap b = a.f50873a.mo36856b(a3);
                    if (b != null) {
                        a.f50873a.mo36854a((C18350ae) bVar);
                        bVar.mo36796a(b, C18402d.MEMORY);
                    }
                }
                if (a.f50876d) {
                    drawable = a.mo36888c();
                }
                bVar.mo36797a(drawable);
                C18351af afVar = new C18351af(a.f50873a, bVar, a2, a.f50879g, a.f50880h, a.f50882j, a3, a.f50883k, a.f50878f);
                a.f50873a.mo36853a((C18341a) afVar);
            }
            return bVar;
        }
        throw new IllegalStateException("Fit cannot be used with a Target.");
    }

    public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) obj);
    }
}
