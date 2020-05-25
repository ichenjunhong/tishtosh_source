package com.p683ss.android.ugc.aweme.app;

import android.content.SharedPreferences.Editor;
import android.text.TextUtils;
import com.bytedance.common.utility.p522b.C9376b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.app.bg */
public final class C23052bg<T> extends C23051bf<List<T>> {

    /* renamed from: d */
    private Class<T> f61418d;

    /* renamed from: e */
    public final List<T> mo47782d() {
        String string = m56568a().getString(this.f61416b, "");
        if (TextUtils.isEmpty(string)) {
            return (List) this.f61415a;
        }
        String[] split = string.split(",");
        ArrayList arrayList = new ArrayList(split.length);
        for (String str : split) {
            if (this.f61418d == String.class) {
                arrayList.add(str);
            } else if (this.f61418d == Integer.class) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str)));
            } else if (this.f61418d == Float.class) {
                arrayList.add(Float.valueOf(Float.parseFloat(str)));
            } else if (this.f61418d == Long.class) {
                arrayList.add(Long.valueOf(Long.parseLong(str)));
            } else if (this.f61418d == Boolean.class) {
                arrayList.add(Boolean.valueOf(Boolean.parseBoolean(str)));
            } else {
                StringBuilder sb = new StringBuilder("un support type: ");
                sb.append(this.f61418d.getName());
                throw new RuntimeException(sb.toString());
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ void mo47775a(Editor editor, Object obj) {
        List list = (List) obj;
        if (C9376b.m18558a((Collection<T>) list)) {
            editor.remove(this.f61416b);
        } else {
            editor.putString(this.f61416b, TextUtils.join(",", list));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ void mo47777a(Object obj, boolean z) {
        List list = (List) obj;
        Editor edit = m56568a().edit();
        if (C9376b.m18558a((Collection<T>) list)) {
            edit.remove(this.f61416b);
        } else {
            edit.putString(this.f61416b, TextUtils.join(",", list));
        }
        edit.apply();
    }

    public C23052bg(Class<T> cls, String str, List<T> list) {
        super(str, list);
        this.f61418d = cls;
    }
}
