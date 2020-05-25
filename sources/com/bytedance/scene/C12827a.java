package com.bytedance.scene;

import android.app.Activity;
import android.content.res.Resources.NotFoundException;
import android.view.View;

/* renamed from: com.bytedance.scene.a */
public final class C12827a implements C12986y {

    /* renamed from: a */
    private final Activity f33603a;

    public C12827a(Activity activity) {
        this.f33603a = activity;
    }

    /* renamed from: a */
    public final <T extends View> T mo24298a(int i) {
        T findViewById = this.f33603a.findViewById(i);
        if (findViewById != null) {
            return findViewById;
        }
        try {
            String resourceName = this.f33603a.getResources().getResourceName(i);
            StringBuilder sb = new StringBuilder(" ");
            sb.append(resourceName);
            sb.append(" view not found");
            throw new IllegalArgumentException(sb.toString());
        } catch (NotFoundException unused) {
            StringBuilder sb2 = new StringBuilder(" ");
            sb2.append(i);
            sb2.append(" view not found");
            throw new IllegalArgumentException(sb2.toString());
        }
    }
}
