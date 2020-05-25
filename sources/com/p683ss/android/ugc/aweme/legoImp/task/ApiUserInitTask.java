package com.p683ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.p125a.C2666a;
import com.bytedance.p125a.C2667b;
import com.p683ss.android.common.p1146d.C18894a;
import com.p683ss.android.ugc.aweme.experiment.ApiUserExperiment;
import com.p683ss.android.ugc.aweme.experiment.C29498a;
import com.p683ss.android.ugc.aweme.experiment.C29505f;
import com.p683ss.android.ugc.aweme.experiment.C29507h;
import com.p683ss.android.ugc.aweme.lego.C35894d;
import com.p683ss.android.ugc.aweme.lego.C35896f;
import com.p683ss.android.ugc.aweme.lego.C35898h;
import com.p683ss.android.ugc.aweme.lego.LegoTask;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.ApiUserInitTask */
public final class ApiUserInitTask implements LegoTask {

    /* renamed from: com.ss.android.ugc.aweme.legoImp.task.ApiUserInitTask$a */
    public static final class C35930a implements C2666a {

        /* renamed from: a */
        public static final C35930a f92158a = new C35930a();

        private C35930a() {
        }

        /* renamed from: a */
        public final void mo7220a(String str, JSONObject jSONObject) {
            C18894a.m46006a(str, jSONObject);
        }
    }

    public final C35896f process() {
        return C35894d.m81063a(this);
    }

    public final C35898h type() {
        return C35898h.BACKGROUND;
    }

    public final void run(Context context) {
        Integer num;
        Integer num2;
        Integer num3;
        try {
            Object a = C10181b.m20511a().mo18170a(ApiUserExperiment.class, true, "api_user_config", 31744, C29498a.class);
            C52711k.m112236a(a, "ABManager.getInstance().…erExperiment::class.java)");
            C29498a aVar = (C29498a) a;
            StringBuilder sb = new StringBuilder();
            Integer num4 = null;
            if (aVar != null) {
                num = Integer.valueOf(aVar.f77279b);
            } else {
                num = null;
            }
            sb.append(num.intValue());
            sb.append("   ");
            if (aVar != null) {
                num2 = Integer.valueOf(aVar.f77278a);
            } else {
                num2 = null;
            }
            sb.append(num2.intValue());
            HashMap hashMap = new HashMap();
            if (aVar != null) {
                if (aVar != null) {
                    List<C29505f> list = aVar.f77280c;
                    if (list != null) {
                        for (C29505f fVar : list) {
                            if (fVar != null) {
                                String str = fVar.f77290a;
                                List<C29507h> list2 = fVar.f77291b;
                                if (list2 != null) {
                                    for (C29507h hVar : list2) {
                                        hashMap.put(C52711k.m112231a(str, (Object) hVar.f77292a), Integer.valueOf(hVar.f77293b));
                                    }
                                }
                            }
                        }
                    }
                }
                if (aVar != null) {
                    num3 = Integer.valueOf(aVar.f77279b);
                } else {
                    num3 = null;
                }
                int intValue = num3.intValue();
                Map map = hashMap;
                if (aVar != null) {
                    num4 = Integer.valueOf(aVar.f77278a);
                }
                C2667b.m7661a(intValue, map, num4.intValue(), (C2666a) C35930a.f92158a);
            }
        } catch (Throwable unused) {
        }
    }
}
