package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder.like;

import android.view.View;
import android.view.View.OnTouchListener;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import java.lang.reflect.Field;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewholder.like.h */
public final class C33870h {

    /* renamed from: a */
    static Field f87856a;

    /* renamed from: b */
    static Field f87857b;

    static {
        try {
            Field declaredField = View.class.getDeclaredField("mListenerInfo");
            f87856a = declaredField;
            declaredField.setAccessible(true);
            Field declaredField2 = Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnTouchListener");
            f87857b = declaredField2;
            declaredField2.setAccessible(true);
        } catch (Exception e) {
            C32458a.m75143a(e);
        }
    }

    /* renamed from: a */
    public static OnTouchListener m77637a(View view) {
        try {
            Object obj = f87857b.get(f87856a.get(view));
            if (obj instanceof OnTouchListener) {
                return (OnTouchListener) obj;
            }
        } catch (Exception e) {
            C32458a.m75143a(e);
        }
        return null;
    }
}
