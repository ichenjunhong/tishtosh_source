package com.bytedance.android.livesdk.chatroom.interact.p311a;

import android.content.Context;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.chatroom.interact.p318g.C5382c;
import com.bytedance.android.livesdk.chatroom.interact.p320i.C5626e;
import com.bytedance.android.livesdk.chatroom.interact.p320i.C5627f;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.C9414h;
import com.ss.android.ugc.trill.R;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.a.f */
public final class C5265f extends C1322a<C1352v> {

    /* renamed from: a */
    public List<Room> f14096a;

    /* renamed from: b */
    public List<Room> f14097b;

    /* renamed from: c */
    public int f14098c;

    /* renamed from: d */
    public int f14099d;

    /* renamed from: e */
    private Context f14100e;

    /* renamed from: f */
    private C5266a f14101f;

    /* renamed from: com.bytedance.android.livesdk.chatroom.interact.a.f$a */
    public interface C5266a {
        /* renamed from: a */
        void mo11117a(Room room, int i, int i2, C5382c cVar, int i3);
    }

    public final int getItemCount() {
        if (C9414h.m18630a(this.f14096a) && C9414h.m18630a(this.f14097b)) {
            return 0;
        }
        if (this.f14099d == 0) {
            return this.f14098c;
        }
        if (this.f14098c == 0) {
            return this.f14099d + 1;
        }
        return this.f14099d + this.f14098c + 2;
    }

    public final int getItemViewType(int i) {
        if (this.f14099d == 0) {
            return 4;
        }
        if (i == 0) {
            return 1;
        }
        if (i <= this.f14099d) {
            return 2;
        }
        if (i == this.f14099d + 1) {
            return 3;
        }
        return 4;
    }

    /* renamed from: a */
    private int m11920a(int i) {
        if (C9414h.m18630a(this.f14096a) && C9414h.m18630a(this.f14097b)) {
            return 0;
        }
        if (this.f14099d == 0) {
            return i;
        }
        if (this.f14098c == 0) {
            return i - 1;
        }
        if (i <= this.f14099d) {
            return i - 1;
        }
        return (i - this.f14099d) - 2;
    }

    public C5265f(Context context, C5266a aVar) {
        this.f14100e = context;
        this.f14101f = aVar;
    }

    public final C1352v onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == 3 || i == 1) {
            return new C5626e(LayoutInflater.from(this.f14100e).inflate(R.layout.am3, viewGroup, false), i);
        }
        return new C5627f(LayoutInflater.from(this.f14100e).inflate(R.layout.am4, viewGroup, false), this.f14101f, i);
    }

    public final void onBindViewHolder(C1352v vVar, int i) {
        boolean z;
        boolean z2;
        if (getItemViewType(i) == 4) {
            if (m11920a(i) >= 0 && m11920a(i) < this.f14096a.size()) {
                C5627f fVar = (C5627f) vVar;
                Room room = (Room) this.f14096a.get(m11920a(i));
                if (i < getItemCount() - 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                fVar.mo11511a(fVar, i, room, z2, 4);
            }
        } else if (getItemViewType(i) == 2) {
            if (m11920a(i) >= 0 && m11920a(i) < this.f14097b.size()) {
                C5627f fVar2 = (C5627f) vVar;
                Room room2 = (Room) this.f14097b.get(m11920a(i));
                if (i < this.f14099d) {
                    z = true;
                } else {
                    z = false;
                }
                fVar2.mo11511a(fVar2, i, room2, z, 3);
            }
        } else if (getItemViewType(i) == 3) {
            ((C5626e) vVar).mo11510a(this.f14100e.getString(R.string.ekc));
        } else if (getItemViewType(i) == 1) {
            ((C5626e) vVar).mo11510a(this.f14100e.getString(R.string.elr));
        }
    }
}
