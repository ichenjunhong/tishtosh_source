package com.p683ss.android.ugc.aweme.services.connection;

import android.arch.lifecycle.C0184k;

/* renamed from: com.ss.android.ugc.aweme.services.connection.IConnectionEntranceService */
public interface IConnectionEntranceService {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* renamed from: com.ss.android.ugc.aweme.services.connection.IConnectionEntranceService$Companion */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    int bubbleTime();

    void checkShowConnectionEntrance(C0184k kVar, int i);

    String getSchema();

    void hideConnectionEntrance();

    boolean isShowConnectionEntrance();

    void setConnectionEntranceHasClickedToday();

    void setConnectionEntranceHasShowBubbleToday();

    void showConnectionEntrance();

    boolean withAnimation();
}
