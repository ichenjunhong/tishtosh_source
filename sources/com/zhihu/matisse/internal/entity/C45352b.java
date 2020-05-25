package com.zhihu.matisse.internal.entity;

import android.content.Context;
import android.os.Build.VERSION;
import android.support.p030v4.app.FragmentActivity;
import android.widget.Toast;
import com.p683ss.android.ugc.aweme.utils.C47905fy;
import com.zhihu.matisse.internal.p2254ui.widget.C52542b;

/* renamed from: com.zhihu.matisse.internal.entity.b */
public final class C45352b {

    /* renamed from: a */
    private int f114661a;

    /* renamed from: b */
    private String f114662b;

    /* renamed from: c */
    private String f114663c;

    public C45352b(String str) {
        this.f114663c = str;
    }

    public C45352b(int i, String str) {
        this.f114661a = 1;
        this.f114663c = str;
    }

    /* renamed from: a */
    public static void m98892a(Context context, C45352b bVar) {
        if (bVar != null) {
            switch (bVar.f114661a) {
                case 1:
                    C52542b.m112029a(bVar.f114662b, bVar.f114663c).show(((FragmentActivity) context).getSupportFragmentManager(), C52542b.class.getName());
                    return;
                case 2:
                    return;
                default:
                    Toast makeText = Toast.makeText(context, bVar.f114663c, 0);
                    if (VERSION.SDK_INT == 25) {
                        C47905fy.m103630a(makeText);
                    }
                    makeText.show();
                    return;
            }
        }
    }
}
