package com.p683ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import com.p683ss.android.ugc.aweme.global.config.settings.C32811d;
import com.p683ss.android.ugc.aweme.lego.C35894d;
import com.p683ss.android.ugc.aweme.lego.C35896f;
import com.p683ss.android.ugc.aweme.lego.C35898h;
import com.p683ss.android.ugc.aweme.lego.LegoTask;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.PosterSRProcessorInitTask */
public final class PosterSRProcessorInitTask implements LegoTask {
    public static final C35957a Companion = new C35957a(null);
    public static volatile boolean NEED_POSTER_PROCESS;
    private final int posterSrType;

    /* renamed from: com.ss.android.ugc.aweme.legoImp.task.PosterSRProcessorInitTask$a */
    public static final class C35957a {
        private C35957a() {
        }

        public /* synthetic */ C35957a(C52707g gVar) {
            this();
        }
    }

    public static final void destroy() {
    }

    public static final String getCpuModel() {
        return "";
    }

    public static final void hotStartInit() {
    }

    public static final void maybeInit() {
    }

    public static final C32811d watcher() {
        return null;
    }

    public final C35896f process() {
        return C35894d.m81063a(this);
    }

    public final void run(Context context) {
        C52711k.m112240b(context, "context");
    }

    public final C35898h type() {
        return C35898h.BOOT_FINISH;
    }

    public PosterSRProcessorInitTask(int i) {
        this.posterSrType = i;
    }
}
