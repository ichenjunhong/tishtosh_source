package com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.controller;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.p683ss.android.ugc.aweme.utils.C47723bk;
import com.p683ss.android.ugc.aweme.video.C48016e;
import java.io.File;
import java.util.concurrent.Callable;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.controller.h */
public abstract class C43570h {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract String mo88739a(String str, int i);

    /* renamed from: a */
    public final C0013i<C43569g> mo88765a(View view, View view2, String str, int i, int i2, int i3, int i4) {
        if (view != null && view2 != null && !TextUtils.isEmpty(str)) {
            return m95714b(view, view2, str, i, i2, i3, i4);
        }
        StringBuilder sb = new StringBuilder("stickerView = ");
        sb.append(view);
        sb.append(", stickerLayout = ");
        sb.append(view2);
        sb.append("draftDir = ");
        sb.append(str);
        return C0013i.m13a((Exception) new NullPointerException(sb.toString()));
    }

    /* renamed from: b */
    private C0013i<C43569g> m95714b(View view, View view2, String str, int i, int i2, int i3, int i4) {
        View view3 = view;
        String str2 = str;
        String a = mo88739a(str, ((ViewGroup) view2).indexOfChild(view));
        File file = new File(a);
        try {
            if (file.exists()) {
                if (file.isDirectory()) {
                    C47723bk.m103315c(a);
                } else {
                    file.delete();
                }
            }
        } catch (Exception unused) {
        }
        C48016e.m103935a(a, true);
        C43571i iVar = new C43571i(this, i, i2, view2, view, i3, i4);
        return C0013i.m18a((Callable<TResult>) iVar, C0013i.f25b).mo30c(new C43572j(this, a, view), C0013i.f24a);
    }
}
