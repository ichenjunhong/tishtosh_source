package com.p683ss.android.ugc.aweme.base.widget.recyclerview;

import android.content.Context;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.ViewGroup;
import com.p683ss.android.ugc.aweme.base.mvvm.C23561d;
import com.p683ss.android.ugc.aweme.base.mvvm.C23562e;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.ss.android.ugc.aweme.base.widget.recyclerview.b */
public class C23759b<T extends C23562e> extends C1322a<C23756a> {

    /* renamed from: a */
    private Map<Class, Class> f63337a;

    /* renamed from: b */
    private final List<T> f63338b;

    /* renamed from: c */
    private final Context f63339c;

    /* renamed from: d */
    private Map<Class, Integer> f63340d;

    /* renamed from: e */
    private List<Constructor> f63341e;

    public int getItemCount() {
        return this.f63338b.size();
    }

    /* renamed from: a */
    private Object m58302a(int i) {
        return this.f63338b.get(i);
    }

    /* renamed from: a */
    private void m58303a(Map<Class, Class> map) {
        for (Entry entry : map.entrySet()) {
            if (m58304a((Class) entry.getKey(), C23562e.class)) {
                if (!m58304a((Class) entry.getValue(), C23561d.class)) {
                }
            }
            throw new IllegalArgumentException("All keys in dataViewMap must be <K> Class<K extends IViewModel> and All values must be <T> Class<T extends IView>");
        }
    }

    public int getItemViewType(int i) {
        int itemViewType = super.getItemViewType(i);
        Integer num = (Integer) this.f63340d.get(m58302a(i).getClass());
        if (num != null) {
            return itemViewType + num.intValue();
        }
        StringBuilder sb = new StringBuilder("No corresponding View match ");
        sb.append(m58302a(i).getClass().getName());
        throw new NullPointerException(sb.toString());
    }

    /* renamed from: b */
    private void m58305b(Map<Class, Class> map) {
        this.f63340d = new HashMap();
        ArrayList arrayList = new ArrayList();
        this.f63341e = new ArrayList();
        Class cls = null;
        try {
            for (Entry entry : map.entrySet()) {
                Class cls2 = (Class) entry.getKey();
                Class cls3 = (Class) entry.getValue();
                try {
                    if (!this.f63340d.containsKey(cls2)) {
                        if (!arrayList.contains(cls3)) {
                            arrayList.add(cls3);
                            this.f63341e.add(cls3.getConstructor(new Class[]{Context.class}));
                        }
                        this.f63340d.put(cls2, Integer.valueOf(arrayList.indexOf(entry.getValue())));
                    }
                    Class cls4 = cls3;
                } catch (NoSuchMethodException unused) {
                    cls = cls3;
                    StringBuilder sb = new StringBuilder("Can't find constructor in ");
                    sb.append(cls.getSimpleName());
                    sb.append(".class according to ");
                    sb.append(getClass().getSimpleName());
                    sb.append("'s getConstructor(Class)!");
                    throw new RuntimeException(sb.toString());
                }
            }
        } catch (NoSuchMethodException unused2) {
            StringBuilder sb2 = new StringBuilder("Can't find constructor in ");
            sb2.append(cls.getSimpleName());
            sb2.append(".class according to ");
            sb2.append(getClass().getSimpleName());
            sb2.append("'s getConstructor(Class)!");
            throw new RuntimeException(sb2.toString());
        }
    }

    /* renamed from: a */
    private static boolean m58304a(Class cls, Class cls2) {
        return cls2.isAssignableFrom(cls);
    }

    public /* synthetic */ void onBindViewHolder(C1352v vVar, int i) {
        ((C23756a) vVar).f63330a.bind((C23562e) this.f63338b.get(i));
    }

    public /* synthetic */ C1352v onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C23756a(m58301a(i, viewGroup));
    }

    /* renamed from: a */
    private C23561d m58301a(int i, ViewGroup viewGroup) {
        try {
            C23561d dVar = (C23561d) ((Constructor) this.f63341e.get(i)).newInstance(new Object[]{this.f63339c});
            try {
                dVar.create(this.f63339c, viewGroup);
                return dVar;
            } catch (Exception unused) {
                return dVar;
            }
        } catch (Exception unused2) {
            return null;
        }
    }

    public C23759b(Context context, List<T> list, Map<Class, Class> map) {
        if (context == null) {
            throw new NullPointerException("context mustn't be null!");
        } else if (list != null) {
            m58303a(map);
            this.f63339c = context;
            this.f63338b = list;
            this.f63337a = map;
            m58305b(map);
        } else {
            throw new NullPointerException("viewbeans mustn't be null!");
        }
    }
}
