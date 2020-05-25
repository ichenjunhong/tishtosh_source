package com.p683ss.android.ugc.aweme.p1807im.sdk.utils;

import com.google.gson.C17971f;
import com.google.gson.C17978g;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.gson.BooleanDefaultFalseAdapter;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.gson.IntegerDefaultZeroAdater;
import java.lang.reflect.Type;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.utils.o */
public final class C35277o {

    /* renamed from: a */
    private static C35208au<C17971f> f90613a = new C35208au<C17971f>() {
        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final /* synthetic */ Object mo70757a() {
            return new C17978g().mo34896a((Type) Boolean.class, (Object) new BooleanDefaultFalseAdapter()).mo34896a((Type) Integer.class, (Object) new IntegerDefaultZeroAdater()).mo34896a((Type) Boolean.TYPE, (Object) new BooleanDefaultFalseAdapter()).mo34900d();
        }
    };

    /* renamed from: a */
    public static C17971f m79759a() {
        return (C17971f) f90613a.mo73326b();
    }

    /* renamed from: a */
    public static String m79761a(Object obj) {
        return ((C17971f) f90613a.mo73326b()).mo34889b(obj);
    }

    /* renamed from: a */
    public static <T> T m79760a(String str, Class<T> cls) {
        return ((C17971f) f90613a.mo73326b()).mo34884a(str, cls);
    }
}
