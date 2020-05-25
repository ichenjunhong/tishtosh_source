package com.bytedance.android.livesdk.chatroom.p307c;

import android.arch.lifecycle.C0199s;
import android.view.View;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.bytedance.ies.sdk.widgets.KVData;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.android.livesdk.chatroom.c.d */
public final class C5038d<V extends View> implements C0199s<KVData> {

    /* renamed from: a */
    DataCenter f13490a;

    /* renamed from: b */
    public V f13491b;

    /* renamed from: c */
    Map<String, C5042b> f13492c;

    /* renamed from: com.bytedance.android.livesdk.chatroom.c.d$a */
    public static final class C5040a<V extends View> {

        /* renamed from: a */
        public C5040a<V> f13493a;

        /* renamed from: b */
        public C5043c<V> f13494b;

        /* renamed from: c */
        public C5041a f13495c;

        /* renamed from: d */
        private C5044e f13496d;

        /* renamed from: e */
        private DataCenter f13497e;

        /* renamed from: f */
        private V f13498f;

        /* renamed from: com.bytedance.android.livesdk.chatroom.c.d$a$a */
        static final class C5041a<V extends View, T> {

            /* renamed from: a */
            public String f13499a;

            /* renamed from: b */
            public C5042b<V, T> f13500b;

            /* renamed from: c */
            public boolean f13501c;

            /* renamed from: d */
            public boolean f13502d;

            private C5041a(String str, C5042b<V, T> bVar, boolean z, boolean z2) {
                this.f13499a = str;
                this.f13500b = bVar;
                this.f13501c = z;
                this.f13502d = z2;
            }
        }

        /* renamed from: a */
        public final C5038d<V> mo10902a() {
            C5038d<V> dVar = new C5038d<>(this.f13497e, this.f13498f, this.f13493a);
            this.f13496d.f13503a.add(dVar);
            return dVar;
        }

        /* renamed from: a */
        public final C5040a<V> mo10900a(C5043c<V> cVar) {
            this.f13494b = cVar;
            return this;
        }

        /* renamed from: a */
        public final <T> C5040a<V> mo10901a(String str, C5042b<V, T> bVar) {
            C5041a aVar = new C5041a(str, bVar);
            this.f13495c = aVar;
            C5040a<V> aVar2 = new C5040a<>(this.f13497e, this.f13498f, this.f13496d);
            aVar2.f13493a = this;
            aVar2.f13494b = this.f13494b;
            return aVar2;
        }

        C5040a(DataCenter dataCenter, V v, C5044e eVar) {
            this.f13497e = dataCenter;
            this.f13498f = v;
            this.f13496d = eVar;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.c.d$b */
    public interface C5042b<V extends View, T> {
        /* renamed from: a */
        void mo10903a(V v, T t);
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.c.d$c */
    public interface C5043c<V extends View> {
        /* renamed from: a */
        void mo10904a(V v);
    }

    public final /* synthetic */ void onChanged(Object obj) {
        KVData kVData = (KVData) obj;
        if (kVData != null && kVData.getKey() != null && kVData.getData() != null) {
            String key = kVData.getKey();
            Object data = kVData.getData();
            if (this.f13492c.keySet().contains(key)) {
                ((C5042b) this.f13492c.get(key)).mo10903a(this.f13491b, data);
            }
        }
    }

    private C5038d(DataCenter dataCenter, V v, C5040a<V> aVar) {
        this.f13492c = new HashMap();
        this.f13490a = dataCenter;
        this.f13491b = v;
        if (aVar.f13494b != null) {
            aVar.f13494b.mo10904a(this.f13491b);
        }
        while (aVar != null) {
            C5041a aVar2 = aVar.f13495c;
            this.f13492c.put(aVar2.f13499a, aVar2.f13500b);
            if (aVar2.f13501c) {
                if (aVar2.f13502d) {
                    this.f13490a.observeForever(aVar2.f13499a, this, true);
                } else {
                    this.f13490a.observeForever(aVar2.f13499a, this);
                }
            } else if (aVar2.f13502d) {
                this.f13490a.observe(aVar2.f13499a, this, true);
            } else {
                this.f13490a.observe(aVar2.f13499a, this);
            }
            aVar = aVar.f13493a;
        }
    }
}
