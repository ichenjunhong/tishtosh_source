package com.p683ss.android.ugc.bytex.coverage_lib;

import android.os.Looper;
import android.os.MessageQueue.IdleHandler;
import com.p683ss.android.ugc.aweme.p1468bu.C24076h;
import com.p683ss.android.ugc.aweme.p1468bu.C24085m;
import com.p683ss.android.ugc.aweme.p1468bu.C24093p;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;

/* renamed from: com.ss.android.ugc.bytex.coverage_lib.DemoCoverageImp */
public class DemoCoverageImp implements CoveragePlugin {
    public static ExecutorService service;
    public ConcurrentHashMap<Integer, Integer> hashMap;
    public int interval;
    public long nextReportTime;

    /* renamed from: com.ss.android.ugc.bytex.coverage_lib.DemoCoverageImp$SingletonHolder */
    static class SingletonHolder {
        public static final DemoCoverageImp INSTANCE = new DemoCoverageImp();

        private SingletonHolder() {
        }
    }

    /* renamed from: com.ss.android.ugc.bytex.coverage_lib.DemoCoverageImp$_lancet */
    class _lancet {
        private _lancet() {
        }

        /* renamed from: com_ss_android_ugc_aweme_lancet_ThreadPoolLancet_newSingleThreadExecutor */
        static ExecutorService m104943x6416be54() {
            return C24076h.m58898a(C24085m.m58928a(C24093p.FIXED).mo49844a(1).mo49847a());
        }
    }

    public static DemoCoverageImp getInstance() {
        return SingletonHolder.INSTANCE;
    }

    private void initIdleHandler() {
        Looper.myQueue().addIdleHandler(new IdleHandler() {
            public boolean queueIdle() {
                if (System.currentTimeMillis() > DemoCoverageImp.this.nextReportTime) {
                    if (DemoCoverageImp.this.hashMap.size() >= 20) {
                        DemoCoverageImp.service.execute(new Runnable() {
                            public void run() {
                                StringBuilder sb = new StringBuilder();
                                for (Entry entry : DemoCoverageImp.this.hashMap.entrySet()) {
                                    sb.append(entry.getKey());
                                    sb.append(" ");
                                    sb.append(entry.getValue());
                                    sb.append("\n");
                                }
                                DemoCoverageImp.this.hashMap.clear();
                            }
                        });
                    }
                    DemoCoverageImp.this.nextReportTime = System.currentTimeMillis() + ((long) DemoCoverageImp.this.interval);
                }
                return true;
            }
        });
    }

    private DemoCoverageImp() {
        this.interval = 120000;
        this.hashMap = new ConcurrentHashMap<>(10000);
        this.nextReportTime = System.currentTimeMillis() + ((long) this.interval);
        service = _lancet.m104943x6416be54();
        initIdleHandler();
    }

    public void addData(int i) {
        Integer num = (Integer) this.hashMap.get(Integer.valueOf(i));
        if (num == null) {
            this.hashMap.put(Integer.valueOf(i), Integer.valueOf(1));
        } else {
            this.hashMap.put(Integer.valueOf(i), Integer.valueOf(num.intValue() + 1));
        }
    }
}
