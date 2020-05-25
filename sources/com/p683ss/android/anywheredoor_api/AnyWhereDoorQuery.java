package com.p683ss.android.anywheredoor_api;

import java.util.ArrayList;
import p2628d.p2639f.p2641b.C52707g;

/* renamed from: com.ss.android.anywheredoor_api.AnyWhereDoorQuery */
public final class AnyWhereDoorQuery {
    public static final int ACTION_TYPE_ALERT = 1;
    public static final int ACTION_TYPE_NONE = 0;
    public static final int ACTION_TYPE_TOAST = 2;
    public static final C18836a Companion = new C18836a(null);
    private int action_type;
    private ArrayList<AnyWhereDoorScheme> alert_button_actions;
    private ArrayList<String> alert_button_titles;
    private String alert_description = "";
    private String alert_title = "";
    private ArrayList<AnyWhereDoorScheme> extra_scheme;
    private String toast_description = "";

    /* renamed from: com.ss.android.anywheredoor_api.AnyWhereDoorQuery$a */
    public static final class C18836a {
        private C18836a() {
        }

        public /* synthetic */ C18836a(C52707g gVar) {
            this();
        }
    }

    public final int getAction_type() {
        return this.action_type;
    }

    public final ArrayList<AnyWhereDoorScheme> getAlert_button_actions() {
        return this.alert_button_actions;
    }

    public final ArrayList<String> getAlert_button_titles() {
        return this.alert_button_titles;
    }

    public final String getAlert_description() {
        return this.alert_description;
    }

    public final String getAlert_title() {
        return this.alert_title;
    }

    public final ArrayList<AnyWhereDoorScheme> getExtra_scheme() {
        return this.extra_scheme;
    }

    public final String getToast_description() {
        return this.toast_description;
    }

    public final void setAction_type(int i) {
        this.action_type = i;
    }

    public final void setAlert_button_actions(ArrayList<AnyWhereDoorScheme> arrayList) {
        this.alert_button_actions = arrayList;
    }

    public final void setAlert_button_titles(ArrayList<String> arrayList) {
        this.alert_button_titles = arrayList;
    }

    public final void setAlert_description(String str) {
        this.alert_description = str;
    }

    public final void setAlert_title(String str) {
        this.alert_title = str;
    }

    public final void setExtra_scheme(ArrayList<AnyWhereDoorScheme> arrayList) {
        this.extra_scheme = arrayList;
    }

    public final void setToast_description(String str) {
        this.toast_description = str;
    }
}
