package com.bytedance.android.livesdk.message;

import android.os.Message;
import com.bytedance.android.livesdk.message.model.C7809an;
import com.bytedance.android.livesdkapi.depend.p435c.C8618a;
import com.bytedance.android.livesdkapi.depend.p435c.C8618a.C8619a;
import com.bytedance.common.utility.C9414h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.message.e */
public class C7791e implements C8619a {

    /* renamed from: a */
    private static C7791e f21414a;

    /* renamed from: b */
    private final List<LinkedList<C7776b>> f21415b = new ArrayList();

    /* renamed from: c */
    private List<Long> f21416c;

    /* renamed from: d */
    private int f21417d = -1;

    /* renamed from: e */
    private final LinkedList<C7776b> f21418e = new LinkedList<>();

    /* renamed from: f */
    private final List<C7789c> f21419f = new ArrayList();

    /* renamed from: g */
    private boolean f21420g;

    /* renamed from: h */
    private C8618a f21421h = new C8618a(this);

    /* renamed from: a */
    public static C7791e m15852a() {
        if (f21414a == null) {
            synchronized (C7791e.class) {
                if (f21414a == null) {
                    f21414a = new C7791e();
                }
            }
        }
        return f21414a;
    }

    /* renamed from: c */
    public final void mo14136c() {
        for (LinkedList linkedList : this.f21415b) {
            if (!C9414h.m18630a(linkedList)) {
                linkedList.clear();
            }
        }
        this.f21420g = false;
    }

    private C7791e() {
    }

    /* renamed from: b */
    public final void mo14134b() {
        do {
            this.f21421h.removeMessages(0);
            C7776b bVar = null;
            this.f21420g = false;
            if (this.f21418e.isEmpty()) {
                Iterator it = this.f21415b.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    LinkedList linkedList = (LinkedList) it.next();
                    if (!linkedList.isEmpty()) {
                        bVar = (C7776b) linkedList.poll();
                        break;
                    }
                }
            } else {
                bVar = (C7776b) this.f21418e.poll();
            }
            if (bVar != null) {
                Iterator it2 = this.f21419f.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (((C7789c) it2.next()).mo12552a(bVar)) {
                            this.f21420g = true;
                            this.f21421h.sendEmptyMessageDelayed(0, 30000);
                            break;
                        }
                    } else {
                        break;
                    }
                }
            } else {
                return;
            }
        } while (!this.f21420g);
    }

    /* renamed from: a */
    public final void mo11060a(Message message) {
        if (message.what == 0) {
            mo14134b();
        }
    }

    /* renamed from: a */
    public final void mo14133a(C7789c cVar) {
        if (!this.f21419f.contains(cVar)) {
            this.f21419f.add(cVar);
        }
    }

    /* renamed from: b */
    public final void mo14135b(C7789c cVar) {
        this.f21419f.remove(cVar);
        if (this.f21419f.isEmpty()) {
            this.f21416c = null;
            this.f21415b.clear();
            this.f21417d = -1;
            this.f21418e.clear();
            this.f21420g = false;
        }
    }

    /* renamed from: a */
    private void m15853a(List<Long> list) {
        if (C9414h.m18630a(this.f21415b) && !C9414h.m18630a(list)) {
            this.f21416c = list;
            for (int i = 0; i < this.f21416c.size(); i++) {
                if (i >= this.f21415b.size()) {
                    this.f21415b.add(new LinkedList());
                } else {
                    LinkedList linkedList = (LinkedList) this.f21415b.get(i);
                    int longValue = (int) ((Long) this.f21416c.get(i)).longValue();
                    if (longValue != -1) {
                        if (longValue < -1) {
                            longValue = 200;
                        }
                        if (linkedList.size() >= longValue) {
                            for (int size = (linkedList.size() - longValue) + 1; size > 0; size--) {
                                linkedList.remove();
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo14132a(C7776b bVar) {
        if (bVar != null) {
            C7809an a = bVar.mo14121a();
            if (bVar.mo14122b()) {
                if (this.f21417d < 0 || this.f21417d >= this.f21415b.size()) {
                    this.f21418e.add(bVar);
                } else {
                    ((LinkedList) this.f21415b.get(this.f21417d)).add(bVar);
                }
            } else if (a != null) {
                m15853a(a.f21489a);
                int i = a.f21491c;
                this.f21417d = (int) a.f21490b;
                if (i >= this.f21415b.size() || i < 0) {
                    this.f21418e.add(bVar);
                } else {
                    LinkedList linkedList = (LinkedList) this.f21415b.get(i);
                    linkedList.add(bVar);
                    long longValue = ((Long) this.f21416c.get(i)).longValue();
                    if ((((long) linkedList.size()) > longValue && longValue >= 0) || (longValue < -1 && linkedList.size() > 200)) {
                        linkedList.remove();
                    }
                }
            } else {
                this.f21418e.add(bVar);
            }
            if (!this.f21420g) {
                mo14134b();
            }
        }
    }
}
