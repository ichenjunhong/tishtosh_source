package com.p683ss.android.ugc.aweme.setting.p2148ui;

import android.support.p043v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.p664ui.widget.DmtEditText;
import com.bytedance.ies.dmt.p664ui.widget.setting.SettingItemSwitch;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.setting.ui.TestPoiOverseasActivity_ViewBinding */
public class TestPoiOverseasActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private TestPoiOverseasActivity f105860a;

    /* renamed from: b */
    private View f105861b;

    /* renamed from: c */
    private View f105862c;

    /* renamed from: d */
    private View f105863d;

    /* renamed from: e */
    private View f105864e;

    public void unbind() {
        TestPoiOverseasActivity testPoiOverseasActivity = this.f105860a;
        if (testPoiOverseasActivity != null) {
            this.f105860a = null;
            testPoiOverseasActivity.fakeGps = null;
            testPoiOverseasActivity.mSchemaEditText = null;
            testPoiOverseasActivity.mTxtLat = null;
            testPoiOverseasActivity.mTxtLng = null;
            testPoiOverseasActivity.mTxtApply = null;
            testPoiOverseasActivity.latValue = null;
            testPoiOverseasActivity.lngValue = null;
            testPoiOverseasActivity.mTitle = null;
            testPoiOverseasActivity.mMccMnc = null;
            testPoiOverseasActivity.mLocationList = null;
            testPoiOverseasActivity.mMapGetPoint = null;
            this.f105861b.setOnClickListener(null);
            this.f105861b = null;
            this.f105862c.setOnClickListener(null);
            this.f105862c = null;
            this.f105863d.setOnClickListener(null);
            this.f105863d = null;
            this.f105864e.setOnClickListener(null);
            this.f105864e = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public TestPoiOverseasActivity_ViewBinding(final TestPoiOverseasActivity testPoiOverseasActivity, View view) {
        this.f105860a = testPoiOverseasActivity;
        testPoiOverseasActivity.fakeGps = (SettingItemSwitch) Utils.findRequiredViewAsType(view, R.id.aad, "field 'fakeGps'", SettingItemSwitch.class);
        testPoiOverseasActivity.mSchemaEditText = (DmtEditText) Utils.findRequiredViewAsType(view, R.id.chi, "field 'mSchemaEditText'", DmtEditText.class);
        testPoiOverseasActivity.mTxtLat = (TextView) Utils.findRequiredViewAsType(view, R.id.b6m, "field 'mTxtLat'", TextView.class);
        testPoiOverseasActivity.mTxtLng = (TextView) Utils.findRequiredViewAsType(view, R.id.bh2, "field 'mTxtLng'", TextView.class);
        View findRequiredView = Utils.findRequiredView(view, R.id.g7, "field 'mTxtApply' and method 'onConfigPoiOverseas'");
        testPoiOverseasActivity.mTxtApply = (TextView) Utils.castView(findRequiredView, R.id.g7, "field 'mTxtApply'", TextView.class);
        this.f105861b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                testPoiOverseasActivity.onConfigPoiOverseas();
            }
        });
        testPoiOverseasActivity.latValue = (DmtEditText) Utils.findRequiredViewAsType(view, R.id.b6n, "field 'latValue'", DmtEditText.class);
        testPoiOverseasActivity.lngValue = (DmtEditText) Utils.findRequiredViewAsType(view, R.id.bh3, "field 'lngValue'", DmtEditText.class);
        testPoiOverseasActivity.mTitle = (TextView) Utils.findRequiredViewAsType(view, R.id.title, "field 'mTitle'", TextView.class);
        testPoiOverseasActivity.mMccMnc = (TextView) Utils.findRequiredViewAsType(view, R.id.bkq, "field 'mMccMnc'", TextView.class);
        testPoiOverseasActivity.mLocationList = (RecyclerView) Utils.findRequiredViewAsType(view, R.id.bif, "field 'mLocationList'", RecyclerView.class);
        View findRequiredView2 = Utils.findRequiredView(view, R.id.bk4, "field 'mMapGetPoint' and method 'mapGetPoint'");
        testPoiOverseasActivity.mMapGetPoint = (TextView) Utils.castView(findRequiredView2, R.id.bk4, "field 'mMapGetPoint'", TextView.class);
        this.f105862c = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                testPoiOverseasActivity.mapGetPoint();
            }
        });
        View findRequiredView3 = Utils.findRequiredView(view, R.id.b5z, "method 'schemaJump'");
        this.f105863d = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                testPoiOverseasActivity.schemaJump();
            }
        });
        View findRequiredView4 = Utils.findRequiredView(view, R.id.ik, "method 'exit'");
        this.f105864e = findRequiredView4;
        findRequiredView4.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                testPoiOverseasActivity.exit(view);
            }
        });
    }
}
