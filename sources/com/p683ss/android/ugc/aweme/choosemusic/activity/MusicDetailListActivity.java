package com.p683ss.android.ugc.aweme.choosemusic.activity;

import android.app.Activity;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.gyf.barlibrary.ImmersionBar;
import com.p683ss.android.ugc.aweme.base.activity.AmeSSActivity;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.activity.MusicDetailListActivity */
public class MusicDetailListActivity extends AmeSSActivity {
    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.choosemusic.activity.MusicDetailListActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.choosemusic.activity.MusicDetailListActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.choosemusic.activity.MusicDetailListActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void onDestroy() {
        super.onDestroy();
        ImmersionBar.with((Activity) this).destroy();
    }

    /* JADX WARNING: type inference failed for: r7v11, types: [android.support.v4.app.Fragment] */
    /* JADX WARNING: type inference failed for: r7v12, types: [android.support.v4.app.Fragment] */
    /* JADX WARNING: type inference failed for: r7v15, types: [android.support.v4.app.Fragment] */
    /* JADX WARNING: type inference failed for: r7v20, types: [android.support.v4.app.Fragment] */
    /* JADX WARNING: type inference failed for: r7v23, types: [android.support.v4.app.Fragment] */
    /* JADX WARNING: type inference failed for: r7v24 */
    /* JADX WARNING: type inference failed for: r7v27, types: [android.support.v4.app.Fragment] */
    /* JADX WARNING: type inference failed for: r7v31 */
    /* JADX WARNING: type inference failed for: r7v32 */
    /* JADX WARNING: type inference failed for: r7v33 */
    /* JADX WARNING: type inference failed for: r7v34 */
    /* JADX WARNING: type inference failed for: r7v35 */
    /* JADX WARNING: type inference failed for: r7v36 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r7) {
        /*
            r6 = this;
            java.lang.String r0 = "com.ss.android.ugc.aweme.choosemusic.activity.MusicDetailListActivity"
            java.lang.String r1 = "onCreate"
            r2 = 1
            com.bytedance.apm.agent.instrumentation.ActivityInstrumentation.onTrace(r0, r1, r2)
            super.onCreate(r7)
            r7 = 2132213851(0x7f17005b, float:2.0071527E38)
            r6.setContentView(r7)
            android.content.Intent r7 = r6.getIntent()
            r0 = 0
            if (r7 == 0) goto L_0x00d3
            android.content.Intent r7 = r6.getIntent()
            java.lang.String r1 = "cid"
            java.lang.String r7 = r7.getStringExtra(r1)
            boolean r7 = android.text.TextUtils.isEmpty(r7)
            r1 = 2
            if (r7 != 0) goto L_0x002b
            r7 = 2
            goto L_0x0035
        L_0x002b:
            android.content.Intent r7 = r6.getIntent()
            java.lang.String r3 = "music_type"
            int r7 = r7.getIntExtra(r3, r2)
        L_0x0035:
            com.gyf.barlibrary.ImmersionBar r3 = com.gyf.barlibrary.ImmersionBar.with(r6)
            r4 = 2131823004(0x7f11099c, float:1.9278795E38)
            com.gyf.barlibrary.ImmersionBar r3 = r3.statusBarColor(r4)
            com.gyf.barlibrary.ImmersionBar r3 = r3.statusBarDarkFont(r2)
            r3.init()
            switch(r7) {
                case 1: goto L_0x005c;
                case 2: goto L_0x0059;
                case 3: goto L_0x0056;
                case 4: goto L_0x0053;
                case 5: goto L_0x0050;
                case 6: goto L_0x004d;
                default: goto L_0x004a;
            }
        L_0x004a:
            java.lang.String r3 = ""
            goto L_0x005e
        L_0x004d:
            java.lang.String r3 = "local_music_list_edit"
            goto L_0x005e
        L_0x0050:
            java.lang.String r3 = "local_music_list_shoot"
            goto L_0x005e
        L_0x0053:
            java.lang.String r3 = "tag_music_sheet"
            goto L_0x005e
        L_0x0056:
            java.lang.String r3 = "local_music_list"
            goto L_0x005e
        L_0x0059:
            java.lang.String r3 = "music_class_sheet"
            goto L_0x005e
        L_0x005c:
            java.lang.String r3 = "hot_music_list"
        L_0x005e:
            android.support.v4.app.k r4 = r6.getSupportFragmentManager()
            android.support.v4.app.Fragment r5 = r4.mo2224a(r3)
            if (r5 != 0) goto L_0x00c6
            android.content.Intent r5 = r6.getIntent()
            switch(r7) {
                case 1: goto L_0x00bb;
                case 2: goto L_0x00b6;
                case 3: goto L_0x00ab;
                case 4: goto L_0x0091;
                case 5: goto L_0x0086;
                case 6: goto L_0x007b;
                default: goto L_0x006f;
            }
        L_0x006f:
            java.lang.String r7 = "com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE"
            int r7 = r5.getIntExtra(r7, r2)
            android.support.v4.app.Fragment r7 = com.p683ss.android.ugc.aweme.choosemusic.fragment.C24938n.m60616a(r7)
        L_0x0079:
            r5 = r7
            goto L_0x00c6
        L_0x007b:
            java.lang.String r7 = "com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE"
            int r7 = r5.getIntExtra(r7, r0)
            android.support.v4.app.Fragment r7 = com.p683ss.android.ugc.aweme.choosemusic.fragment.C24941q.m60632a(r7)
            goto L_0x0079
        L_0x0086:
            java.lang.String r7 = "com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE"
            int r7 = r5.getIntExtra(r7, r1)
            android.support.v4.app.Fragment r7 = com.p683ss.android.ugc.aweme.choosemusic.fragment.C24941q.m60632a(r7)
            goto L_0x0079
        L_0x0091:
            java.lang.String r7 = "com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE"
            int r7 = r5.getIntExtra(r7, r2)
            com.ss.android.ugc.aweme.choosemusic.fragment.z r1 = new com.ss.android.ugc.aweme.choosemusic.fragment.z
            r1.<init>()
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            java.lang.String r5 = "com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE"
            r2.putInt(r5, r7)
            r1.setArguments(r2)
            r5 = r1
            goto L_0x00c6
        L_0x00ab:
            java.lang.String r7 = "com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE"
            int r7 = r5.getIntExtra(r7, r2)
            android.support.v4.app.Fragment r7 = com.p683ss.android.ugc.aweme.choosemusic.fragment.C24941q.m60632a(r7)
            goto L_0x0079
        L_0x00b6:
            android.support.v4.app.Fragment r7 = com.p683ss.android.ugc.aweme.choosemusic.fragment.C24952y.m60688a(r5)
            goto L_0x0079
        L_0x00bb:
            java.lang.String r7 = "com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE"
            int r7 = r5.getIntExtra(r7, r2)
            android.support.v4.app.Fragment r7 = com.p683ss.android.ugc.aweme.choosemusic.fragment.C24938n.m60616a(r7)
            goto L_0x0079
        L_0x00c6:
            android.support.v4.app.r r7 = r4.mo2225a()
            r1 = 2132019228(0x7f14081c, float:1.9676785E38)
            r7.mo2192b(r1, r5, r3)
            r7.mo2195c()
        L_0x00d3:
            java.lang.String r7 = "com.ss.android.ugc.aweme.choosemusic.activity.MusicDetailListActivity"
            java.lang.String r1 = "onCreate"
            com.bytedance.apm.agent.instrumentation.ActivityInstrumentation.onTrace(r7, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.choosemusic.activity.MusicDetailListActivity.onCreate(android.os.Bundle):void");
    }
}
