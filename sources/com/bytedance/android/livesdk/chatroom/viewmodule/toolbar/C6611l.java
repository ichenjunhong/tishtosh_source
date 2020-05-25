package com.bytedance.android.livesdk.chatroom.viewmodule.toolbar;

import android.text.TextUtils;
import com.bytedance.android.live.C2942b;
import com.bytedance.android.live.core.p224c.C3831a;
import com.bytedance.android.livesdk.chatroom.viewmodule.p326a.p327a.C6433c;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.p270ab.C4514j;
import com.bytedance.android.livesdk.p272ad.C4525b;
import com.google.gson.p1076a.C17952c;
import com.google.gson.p1077b.C17956a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.l */
public final class C6611l {

    /* renamed from: a */
    private ArrayList<C6613a> f17966a;

    /* renamed from: b */
    private ArrayList<C6613a> f17967b;

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.l$a */
    class C6613a {
        @C17952c(mo34828a = "key")

        /* renamed from: a */
        public String f17969a;
        @C17952c(mo34828a = "version")

        /* renamed from: b */
        public int f17970b;
        @C17952c(mo34828a = "local_version")

        /* renamed from: c */
        public int f17971c;
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.l$b */
    static class C6614b {

        /* renamed from: a */
        public static C6611l f17972a = new C6611l();
    }

    /* renamed from: a */
    public static C6611l m13991a() {
        return C6614b.f17972a;
    }

    private C6611l() {
        m13994d();
    }

    /* renamed from: b */
    public final boolean mo12690b() {
        if (this.f17967b != null && this.f17967b.size() > 0) {
            Iterator it = this.f17967b.iterator();
            while (it.hasNext()) {
                if (m13992a((C6613a) it.next())) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: d */
    private void m13994d() {
        String str = (String) LiveSettingKeys.LIVE_GROUP_TOOLBAR_RED_DOT_SETTING.mo9431a();
        StringBuilder sb = new StringBuilder("intRedDotSettingList onlineRedDotStr: ");
        sb.append(str);
        C3831a.m9716d("ToolbarMoreRedDotManager", sb.toString());
        ArrayList<C6613a> c = m13993c(str);
        if (c != null && c.size() != 0) {
            String str2 = (String) C4525b.f12424bv.mo10345a();
            StringBuilder sb2 = new StringBuilder("intRedDotSettingList localRedDotStr: ");
            sb2.append(str2);
            C3831a.m9716d("ToolbarMoreRedDotManager", sb2.toString());
            ArrayList c2 = m13993c(str2);
            if (c2 != null && c2.size() > 0) {
                Iterator it = c.iterator();
                while (it.hasNext()) {
                    C6613a aVar = (C6613a) it.next();
                    C6613a a = m13990a(aVar.f17969a, c2);
                    if (a != null) {
                        aVar.f17971c = a.f17971c;
                        c2.remove(a);
                    }
                }
            }
            this.f17966a = c;
            this.f17967b = new ArrayList<>();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo12691c() {
        if (this.f17966a != null) {
            try {
                String b = C2942b.m8369a().mo34889b(this.f17966a);
                StringBuilder sb = new StringBuilder("saveRedDotSetting fullInfo: ");
                sb.append(b);
                C3831a.m9716d("ToolbarMoreRedDotManager", sb.toString());
                C4525b.f12424bv.mo10346a(b);
            } catch (Exception e) {
                C3831a.m9714b("ToolbarMoreRedDotManager", (Throwable) e);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public C6613a mo12689b(String str) {
        return m13990a(str, this.f17967b);
    }

    /* renamed from: a */
    private static boolean m13992a(C6613a aVar) {
        if (aVar == null || aVar.f17971c >= aVar.f17970b) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final boolean mo12688a(String str) {
        StringBuilder sb = new StringBuilder("showRedDot key: ");
        sb.append(str);
        C3831a.m9716d("ToolbarMoreRedDotManager", sb.toString());
        return m13992a(mo12689b(str));
    }

    /* renamed from: c */
    private ArrayList<C6613a> m13993c(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return (ArrayList) C4514j.m10883j().mo10320a().mo34885a(str, new C17956a<List<C6613a>>() {
                }.f49843c);
            } catch (Exception e) {
                C3831a.m9714b("ToolbarMoreRedDotManager", (Throwable) e);
            }
        }
        return null;
    }

    /* renamed from: a */
    public final void mo12687a(List<String> list) {
        if (this.f17966a != null && this.f17966a.size() != 0) {
            if (this.f17967b != null) {
                this.f17967b.clear();
            }
            if (list != null && list.size() > 0) {
                for (String a : list) {
                    C6613a a2 = m13990a(a, this.f17966a);
                    if (m13992a(a2)) {
                        this.f17967b.add(a2);
                    }
                }
                if (mo12690b()) {
                    C3831a.m9716d("ToolbarMoreRedDotManager", "intRedDotSettingList sendCommand true: ");
                    C6610k.m13985a().mo12667a(C6605h.MORE, (C6597a) new C6433c(true));
                }
            }
        }
    }

    /* renamed from: a */
    private static C6613a m13990a(String str, ArrayList<C6613a> arrayList) {
        if (!TextUtils.isEmpty(str) && arrayList != null && arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C6613a aVar = (C6613a) it.next();
                if (aVar.f17969a.equals(str)) {
                    return aVar;
                }
            }
        }
        return null;
    }
}
