package com.p683ss.android.ugc.aweme.poi.utils;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.p683ss.android.ugc.aweme.poi.C39067g;

/* renamed from: com.ss.android.ugc.aweme.poi.utils.s */
final /* synthetic */ class C39463s implements OnClickListener {

    /* renamed from: a */
    private final Context f100885a;

    /* renamed from: b */
    private final String[] f100886b;

    /* renamed from: c */
    private final String f100887c;

    /* renamed from: d */
    private final String f100888d;

    /* renamed from: e */
    private final C39067g f100889e;

    C39463s(Context context, String[] strArr, String str, String str2, C39067g gVar) {
        this.f100885a = context;
        this.f100886b = strArr;
        this.f100887c = str;
        this.f100888d = str2;
        this.f100889e = gVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        Context context = this.f100885a;
        String[] strArr = this.f100886b;
        C39462r.m87774b(context, strArr[i], this.f100887c, this.f100888d, this.f100889e);
    }
}
