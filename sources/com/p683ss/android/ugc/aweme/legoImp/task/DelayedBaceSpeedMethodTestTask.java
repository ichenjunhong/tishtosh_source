package com.p683ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.bytedance.retrofit2.p830a.C12685b;
import com.bytedance.retrofit2.p831b.C12699af;
import com.bytedance.retrofit2.p831b.C12700b;
import com.bytedance.retrofit2.p831b.C12706h;
import com.bytedance.retrofit2.p831b.C12710l;
import com.bytedance.retrofit2.p831b.C12718t;
import com.google.p1057b.p1065h.p1066a.C17832m;
import com.p683ss.android.p1140c.C18845b;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.lego.C35894d;
import com.p683ss.android.ugc.aweme.lego.C35896f;
import com.p683ss.android.ugc.aweme.lego.C35898h;
import com.p683ss.android.ugc.aweme.lego.LegoTask;
import com.p683ss.android.ugc.aweme.p1466bt.p1467a.C24052b;
import com.p683ss.android.ugc.aweme.p1466bt.p1467a.C24053c;
import com.p683ss.android.ugc.aweme.p1466bt.p1467a.C24054d;
import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;
import java.util.Timer;
import java.util.TimerTask;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.DelayedBaceSpeedMethodTestTask */
public class DelayedBaceSpeedMethodTestTask implements LegoTask {
    private static final String TAG = "DelayedBaceSpeedMethodTestTask";
    private volatile TestIdc mTestIdc;
    private int testCount;
    private Timer timer;

    /* renamed from: com.ss.android.ugc.aweme.legoImp.task.DelayedBaceSpeedMethodTestTask$TestIdc */
    public interface TestIdc {
        @C12706h
        C17832m<String> doGet(@C12699af String str);

        @C12718t
        C17832m<String> doPost(@C12699af String str, @C12700b TypedOutput typedOutput, @C12710l List<C12685b> list);

        @C12706h(mo23876a = "/aweme/v1/testidc/")
        C17832m<C24052b> testIdc();
    }

    public C35896f process() {
        return C35894d.m81063a(this);
    }

    public C35898h type() {
        return C35898h.BOOT_FINISH;
    }

    private TestIdc getTestIdc() {
        if (this.mTestIdc == null) {
            this.mTestIdc = (TestIdc) RetrofitFactory.createIRetrofitFactorybyMonsterPlugin().createBuilder(C18845b.f52040e).mo19925a().mo19930a(TestIdc.class);
        }
        return this.mTestIdc;
    }

    public void run() {
        try {
            final C24053c cVar = ((C24052b) getTestIdc().testIdc().get()).f63838a;
            if (!(cVar == null || cVar.f63841c == null)) {
                if (!cVar.f63841c.isEmpty()) {
                    if (this.timer != null) {
                        this.timer.cancel();
                        this.timer = null;
                    }
                    this.timer = new Timer("test_speed_1");
                    if (cVar.f63839a > 100) {
                        cVar.f63839a = 100;
                    }
                    this.timer.schedule(new TimerTask() {
                        public final void run() {
                            DelayedBaceSpeedMethodTestTask.this.dealWithTest(cVar);
                        }
                    }, 0, (long) (cVar.f63840b * 1000));
                }
            }
        } catch (Exception unused) {
        }
    }

    public void run(Context context) {
        C32458a.m75144a(TAG);
        run();
    }

    public void dealWithTest(C24053c cVar) {
        String str;
        if (this.testCount > cVar.f63839a) {
            if (this.timer != null) {
                this.timer.cancel();
                this.timer = null;
            }
            return;
        }
        this.testCount++;
        for (C24054d dVar : cVar.f63841c) {
            if (!(dVar.f63842a == null || dVar.f63845d == null)) {
                if ("get".equals(dVar.f63845d.toLowerCase())) {
                    try {
                        getTestIdc().doGet(dVar.f63842a).get();
                    } catch (Exception unused) {
                    }
                } else if ("post".equals(dVar.f63845d.toLowerCase())) {
                    if (dVar.f63846e != null) {
                        str = dVar.f63846e.toString();
                    } else {
                        str = "";
                    }
                    String str2 = "application/json";
                    if (!(dVar.f63843b == null || dVar.f63843b.get("Content-Type") == null)) {
                        str2 = (String) dVar.f63843b.get("Content-Type");
                    }
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new C12685b("Content-Type", str2));
                    if (dVar.f63843b != null && !dVar.f63843b.isEmpty()) {
                        for (Entry entry : dVar.f63843b.entrySet()) {
                            arrayList.add(new C12685b((String) entry.getKey(), (String) entry.getValue()));
                        }
                    }
                    getTestIdc().doPost(dVar.f63842a, new TypedByteArray(str2, str.getBytes("utf8"), new String[0]), arrayList).get();
                }
            }
        }
    }
}
