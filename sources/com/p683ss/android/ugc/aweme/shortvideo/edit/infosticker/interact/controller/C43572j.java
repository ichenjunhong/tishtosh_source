package com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.controller;

import android.graphics.Bitmap.CompressFormat;
import android.view.View;
import com.p683ss.android.ugc.tools.utils.C50199c;
import java.io.File;
import p001a.C0011g;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.controller.j */
final /* synthetic */ class C43572j implements C0011g {

    /* renamed from: a */
    private final C43570h f110275a;

    /* renamed from: b */
    private final String f110276b;

    /* renamed from: c */
    private final View f110277c;

    C43572j(C43570h hVar, String str, View view) {
        this.f110275a = hVar;
        this.f110276b = str;
        this.f110277c = view;
    }

    public final Object then(C0013i iVar) {
        C43570h hVar = this.f110275a;
        String str = this.f110276b;
        C43569g gVar = C50199c.m108337a(((C43574l) iVar.mo34e()).f110282a, new File(str), 100, CompressFormat.PNG) ? new C43569g(str, ((C43574l) iVar.mo34e()).f110283b.intValue(), this.f110277c.hashCode()) : null;
        C50199c.m108335a(((C43574l) iVar.mo34e()).f110282a);
        return gVar;
    }
}
