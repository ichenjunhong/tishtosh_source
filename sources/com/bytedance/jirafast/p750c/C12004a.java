package com.bytedance.jirafast.p750c;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.support.p043v7.app.C1160b.C1161a;
import com.bytedance.jirafast.p750c.C12009c.C12010a;
import com.ss.android.ugc.trill.R;

/* renamed from: com.bytedance.jirafast.c.a */
public final class C12004a {

    /* renamed from: com.bytedance.jirafast.c.a$a */
    public interface C12007a<T> {
    }

    /* renamed from: a */
    public static void m24410a(final Activity activity, final C12007a<Boolean> aVar) {
        C12009c.f31755a.mo22753a(activity, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, new C12010a() {
            /* renamed from: a */
            public final void mo22749a(String[] strArr, int[] iArr) {
                if (iArr == null || iArr.length <= 0 || iArr[0] != 0) {
                    new C1161a(activity, R.style.mp).mo3770b((CharSequence) "当前状态无法存储，请尝试以下方案解决：\n1、未开启存储权限：在设置应用权限中允许使用存储权限\n2、如果您手机系统版本是Android 6.0以上，请打开读取外置存储权限").mo3765a((CharSequence) "确定", (OnClickListener) new OnClickListener() {
                        public final void onClick(DialogInterface dialogInterface, int i) {
                            dialogInterface.dismiss();
                        }
                    }).mo3772b().show();
                    if (aVar != null) {
                        Boolean.valueOf(false);
                    }
                } else if (aVar != null) {
                    Boolean.valueOf(true);
                }
            }
        });
    }
}
