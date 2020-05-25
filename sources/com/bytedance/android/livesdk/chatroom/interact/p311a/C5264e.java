package com.bytedance.android.livesdk.chatroom.interact.p311a;

import android.content.Context;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.chatroom.interact.p311a.C5265f.C5266a;
import com.bytedance.android.livesdk.chatroom.interact.p318g.C5382c;
import com.bytedance.android.livesdk.chatroom.interact.p320i.C5620a;
import com.bytedance.android.livesdk.chatroom.interact.p320i.C5620a.C5622a;
import com.bytedance.android.livesdk.chatroom.interact.p320i.C5623b;
import com.bytedance.android.livesdk.chatroom.interact.p320i.C5625d;
import com.bytedance.android.livesdk.chatroom.interact.p320i.C5626e;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.C9414h;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.a.e */
public final class C5264e extends C1322a<C1352v> implements C5622a {

    /* renamed from: a */
    private final int f14082a;

    /* renamed from: b */
    private List<Room> f14083b;

    /* renamed from: c */
    private List<Room> f14084c;

    /* renamed from: d */
    private HashMap<Long, C5382c> f14085d;

    /* renamed from: e */
    private Context f14086e;

    /* renamed from: f */
    private C5266a f14087f;

    /* renamed from: g */
    private int f14088g;

    /* renamed from: h */
    private int f14089h;

    /* renamed from: i */
    private int f14090i = 1;

    /* renamed from: j */
    private C5622a f14091j;

    /* renamed from: k */
    private boolean f14092k;

    /* renamed from: l */
    private boolean f14093l;

    /* renamed from: m */
    private C5623b f14094m;

    /* renamed from: n */
    private int f14095n;

    public final int getItemCount() {
        if (C9414h.m18630a(this.f14083b) && C9414h.m18630a(this.f14084c)) {
            return 1;
        }
        if (this.f14093l) {
            if (C9414h.m18630a(this.f14083b)) {
                return this.f14089h + this.f14088g + 1;
            }
            return this.f14089h + this.f14088g + 2;
        } else if (this.f14092k) {
            if (C9414h.m18630a(this.f14083b)) {
                return this.f14089h + this.f14088g + 2;
            }
            return this.f14089h + this.f14088g + 3;
        } else if (C9414h.m18630a(this.f14083b)) {
            return this.f14090i + this.f14088g + 1;
        } else {
            return this.f14090i + this.f14088g + 2;
        }
    }

    /* renamed from: b */
    private int m11918b(int i) {
        if (C9414h.m18630a(this.f14083b) && C9414h.m18630a(this.f14084c)) {
            return 0;
        }
        if (i < this.f14090i) {
            return i - 1;
        }
        if (i > this.f14090i + 1 && !this.f14093l) {
            return (i - this.f14090i) - 2;
        }
        if (i <= this.f14090i || !this.f14093l) {
            return 0;
        }
        return (i - this.f14090i) - 1;
    }

    public final int getItemViewType(int i) {
        if (i == 0 && this.f14089h == 0) {
            return 7;
        }
        if (i == 0) {
            return 1;
        }
        if (i == this.f14090i && this.f14093l) {
            return 3;
        }
        if (i > this.f14090i && this.f14093l) {
            return 4;
        }
        if (i == this.f14090i) {
            return 5;
        }
        if (i == this.f14090i + 1) {
            return 3;
        }
        if (i > this.f14090i + 1) {
            return 4;
        }
        return 2;
    }

    /* renamed from: a */
    public final void mo11116a(int i) {
        if (this.f14092k) {
            if (!C9414h.m18630a(this.f14084c)) {
                int i2 = 0;
                while (true) {
                    if (i2 >= this.f14084c.size()) {
                        break;
                    } else if (((Room) this.f14084c.get(i2)).getOwner().getLinkMicStats() == 0 || ((Room) this.f14084c.get(i2)).getLinkMicInfo() != null) {
                        this.f14090i = i2;
                    } else {
                        i2++;
                    }
                }
                this.f14090i = i2;
                if (this.f14089h == 0) {
                    this.f14090i = 1;
                    this.f14093l = true;
                } else if (i2 == this.f14089h || i2 == this.f14089h - 1) {
                    this.f14093l = true;
                    this.f14090i = this.f14089h + 1;
                } else {
                    this.f14093l = false;
                    this.f14090i += 2;
                }
            } else {
                this.f14093l = true;
                this.f14090i = 1;
            }
            this.f14092k = false;
        } else {
            this.f14090i = this.f14089h + 1;
            this.f14092k = true;
        }
        this.f14091j.mo11116a(i);
    }

    public final C1352v onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == 3 || i == 1) {
            return new C5626e(LayoutInflater.from(this.f14086e).inflate(R.layout.am3, viewGroup, false), i);
        }
        if (i == 6) {
            return new C5620a(LayoutInflater.from(this.f14086e).inflate(R.layout.am1, viewGroup, false), this, 0);
        }
        if (i == 5) {
            return new C5620a(LayoutInflater.from(this.f14086e).inflate(R.layout.am1, viewGroup, false), this, 2);
        }
        if (i == 7) {
            return new C5625d(LayoutInflater.from(this.f14086e).inflate(R.layout.am2, viewGroup, false), 1);
        }
        return new C5623b(LayoutInflater.from(this.f14086e).inflate(R.layout.am4, viewGroup, false), this.f14087f, i);
    }

    public final void onBindViewHolder(C1352v vVar, int i) {
        String str;
        String str2;
        C5382c cVar;
        C5382c cVar2;
        int i2 = i;
        long j = -1;
        boolean z = true;
        if (getItemViewType(i2) == 4 && this.f14083b != null) {
            int b = m11918b(i2);
            if (b >= 0 && b < this.f14083b.size()) {
                C5623b bVar = (C5623b) vVar;
                Room room = (Room) this.f14083b.get(b);
                if (i2 >= getItemCount() - 1) {
                    z = false;
                }
                if (this.f14085d != null) {
                    HashMap<Long, C5382c> hashMap = this.f14085d;
                    if (this.f14083b.get(b) != null) {
                        j = ((Room) this.f14083b.get(b)).getId();
                    }
                    cVar2 = (C5382c) hashMap.get(Long.valueOf(j));
                } else {
                    cVar2 = null;
                }
                bVar.mo11508a(bVar, i, room, z, 2, cVar2, Boolean.valueOf(false), this.f14082a, this.f14095n);
            }
        } else if (getItemViewType(i2) == 2 && this.f14084c != null) {
            int b2 = m11918b(i2);
            if (b2 >= 0 && b2 < this.f14084c.size()) {
                C5623b bVar2 = (C5623b) vVar;
                Room room2 = (Room) this.f14084c.get(b2);
                if (i2 >= this.f14089h) {
                    z = false;
                }
                if (this.f14085d != null) {
                    HashMap<Long, C5382c> hashMap2 = this.f14085d;
                    if (this.f14084c.get(b2) != null) {
                        j = ((Room) this.f14084c.get(b2)).getId();
                    }
                    cVar = (C5382c) hashMap2.get(Long.valueOf(j));
                } else {
                    cVar = null;
                }
                bVar2.mo11508a(bVar2, i, room2, z, 1, cVar, Boolean.valueOf(false), this.f14082a, this.f14095n);
                this.f14094m = bVar2;
            }
        } else if (getItemViewType(i2) == 3) {
            ((C5626e) vVar).mo11510a(this.f14086e.getString(R.string.hqu));
        } else if (getItemViewType(i2) == 1) {
            ((C5626e) vVar).mo11510a(this.f14086e.getString(R.string.ehe));
        } else {
            int itemViewType = getItemViewType(i2);
            int i3 = R.drawable.c43;
            if (itemViewType == 6) {
                C5620a aVar = (C5620a) vVar;
                if (this.f14092k) {
                    str2 = this.f14086e.getString(R.string.hqz);
                } else {
                    str2 = this.f14086e.getString(R.string.hr0);
                }
                if (this.f14092k) {
                    i3 = R.drawable.c42;
                }
                aVar.mo11506a(str2, i3);
                return;
            }
            if (getItemViewType(i2) == 5) {
                C5620a aVar2 = (C5620a) vVar;
                if (this.f14092k) {
                    str = this.f14086e.getString(R.string.hqz);
                } else {
                    str = this.f14086e.getString(R.string.hr0);
                }
                if (this.f14092k) {
                    i3 = R.drawable.c42;
                }
                aVar2.mo11506a(str, i3);
                if (this.f14094m != null) {
                    this.f14094m.f14723c.setVisibility(8);
                }
            } else if (getItemViewType(i2) == 7) {
                C5625d dVar = (C5625d) vVar;
                dVar.f14739a.setText(this.f14086e.getString(R.string.enn));
            }
        }
    }

    public C5264e(Context context, C5266a aVar, C5622a aVar2, int i) {
        this.f14086e = context;
        this.f14087f = aVar;
        this.f14091j = aVar2;
        this.f14083b = new LinkedList();
        this.f14084c = new LinkedList();
        this.f14082a = i;
    }
}
