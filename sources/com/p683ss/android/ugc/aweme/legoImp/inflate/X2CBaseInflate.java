package com.p683ss.android.ugc.aweme.legoImp.inflate;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.p100a.p102b.C2281a;
import com.p683ss.android.ugc.aweme.LegacyServiceImpl;
import com.p683ss.android.ugc.aweme.lego.C35857a;
import com.p683ss.android.ugc.aweme.lego.C35894d;
import com.p683ss.android.ugc.aweme.lego.C35896f;
import com.p683ss.android.ugc.aweme.lego.C35898h;
import com.p683ss.android.ugc.aweme.lego.LegoInflate;
import com.p683ss.android.ugc.aweme.lego.LegoTask;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.legoImp.inflate.X2CBaseInflate */
public abstract class X2CBaseInflate implements LegoInflate {
    private LegoTask inflateReleaseTask = new LegoTask() {
        public C35896f process() {
            return C35894d.m81063a(this);
        }

        public C35898h type() {
            return C35898h.BOOT_FINISH;
        }

        /* access modifiers changed from: 0000 */
        public final /* synthetic */ void lambda$run$0$X2CBaseInflate$1() {
            synchronized (X2CBaseInflate.this.viewCaches) {
                X2CBaseInflate.this.viewCaches.clear();
            }
        }

        public void run(Context context) {
            new Handler(Looper.getMainLooper()).post(new C35913d(this));
        }
    };
    private int isX2COpen = -1;
    protected List<SparseArray<View>> viewCaches = new ArrayList();

    /* access modifiers changed from: protected */
    public int cacheCount() {
        return 1;
    }

    /* access modifiers changed from: protected */
    public abstract int[] layoutResId();

    public int theme() {
        return R.style.hg;
    }

    public Class<? extends Activity> activity() {
        return LegacyServiceImpl.createILegacyServicebyMonsterPlugin().getMainPageService().mo75704a();
    }

    /* access modifiers changed from: protected */
    public boolean isX2CAsyncInflateOpen() {
        if (this.isX2COpen == -1) {
            this.isX2COpen = C35916g.m81077a();
        }
        if (this.isX2COpen == 2) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public boolean isX2CClose() {
        if (this.isX2COpen == -1) {
            this.isX2COpen = C35916g.m81077a();
        }
        if (this.isX2COpen == -2) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public boolean isX2COpen() {
        if (this.isX2COpen == -1) {
            this.isX2COpen = C35916g.m81077a();
        }
        if (this.isX2COpen == 1) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void addViewCache(SparseArray<View> sparseArray) {
        synchronized (this.viewCaches) {
            this.viewCaches.add(sparseArray);
        }
    }

    public View getView(Context context, int i) {
        if (isX2CAsyncInflateOpen()) {
            for (SparseArray sparseArray : this.viewCaches) {
                View view = (View) sparseArray.get(i);
                if (view != null) {
                    sparseArray.remove(i);
                    return view;
                }
            }
            return C2281a.m6814a(context, i, new FrameLayout(context), false);
        } else if (isX2CClose()) {
            return LayoutInflater.from(context).inflate(i, new FrameLayout(context), false);
        } else {
            return C2281a.m6814a(context, i, new FrameLayout(context), false);
        }
    }

    public void inflate(Context context, Activity activity) {
        int[] layoutResId;
        if (activity != null && isX2CAsyncInflateOpen()) {
            for (int i = 0; i < cacheCount(); i++) {
                addViewCache(new SparseArray());
            }
            for (SparseArray sparseArray : this.viewCaches) {
                for (int i2 : layoutResId()) {
                    sparseArray.put(i2, C2281a.m6814a(activity, i2, new FrameLayout(activity), false));
                }
            }
            C35857a.m81001b().mo74526a(this.inflateReleaseTask).mo74527a();
        }
    }
}
