package dmt.p2652av.video.superentrance.p2657a;

import android.content.Intent;
import com.bytedance.common.utility.p522b.C9376b;
import java.util.Collection;
import java.util.Set;

/* renamed from: dmt.av.video.superentrance.a.a */
public final class C53003a {
    /* renamed from: a */
    public static final void m112727a(Intent intent, Intent intent2) {
        if (intent != null) {
            intent2.setAction(intent.getAction());
        }
    }

    /* renamed from: b */
    public static final void m112728b(Intent intent, Intent intent2) {
        if (intent != null) {
            Set<String> categories = intent.getCategories();
            if (!C9376b.m18558a((Collection<T>) categories)) {
                for (String addCategory : categories) {
                    intent2.addCategory(addCategory);
                }
            }
        }
    }
}
