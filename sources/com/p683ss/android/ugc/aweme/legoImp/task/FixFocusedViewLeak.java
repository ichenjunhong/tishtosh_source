package com.p683ss.android.ugc.aweme.legoImp.task;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build.VERSION;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.p683ss.android.ugc.aweme.lego.C35894d;
import com.p683ss.android.ugc.aweme.lego.C35896f;
import com.p683ss.android.ugc.aweme.lego.C35898h;
import com.p683ss.android.ugc.aweme.lego.LegoTask;
import com.p683ss.android.ugc.aweme.utils.p2390d.C47798a;
import com.p683ss.android.ugc.aweme.utils.p2390d.C47800b;
import com.p683ss.android.ugc.aweme.utils.p2390d.C47801c;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.FixFocusedViewLeak */
public class FixFocusedViewLeak implements LegoTask {
    public C35896f process() {
        return C35894d.m81063a(this);
    }

    public C35898h type() {
        return C35898h.MAIN;
    }

    public void run(Context context) {
        Application application = (Application) context;
        if (VERSION.SDK_INT >= 19 && VERSION.SDK_INT <= 25) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(Arrays.asList(C47798a.f120344a));
            if (C47801c.m103432a() && VERSION.SDK_INT >= 23) {
                arrayList.add("mLastSrvView");
            }
            application.registerActivityLifecycleCallbacks(new C47800b(arrayList) {

                /* renamed from: a */
                final /* synthetic */ List f120345a;

                {
                    this.f120345a = r1;
                }

                public final void onActivityDestroyed(Activity activity) {
                    Object obj;
                    super.onActivityDestroyed(activity);
                    List<String> list = this.f120345a;
                    if (activity != null && list != null) {
                        try {
                            obj = (InputMethodManager) activity.getApplicationContext().getSystemService("input_method");
                        } catch (Throwable unused) {
                            obj = null;
                        }
                        if (obj != null) {
                            for (String declaredField : list) {
                                try {
                                    Field declaredField2 = obj.getClass().getDeclaredField(declaredField);
                                    if (declaredField2 != null) {
                                        if (!declaredField2.isAccessible()) {
                                            declaredField2.setAccessible(true);
                                        }
                                        Object obj2 = declaredField2.get(obj);
                                        if (obj2 != null) {
                                            if (obj2 instanceof View) {
                                                if (((View) obj2).getContext() == activity) {
                                                    declaredField2.set(obj, null);
                                                }
                                            }
                                        }
                                    }
                                } catch (Throwable unused2) {
                                }
                            }
                        }
                    }
                }
            });
        }
    }
}
