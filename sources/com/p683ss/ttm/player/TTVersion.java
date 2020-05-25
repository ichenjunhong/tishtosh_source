package com.p683ss.ttm.player;

/* renamed from: com.ss.ttm.player.TTVersion */
public final class TTVersion {
    public static final String VERSION_NAME = "2.9.40.80";

    public static final void saveVersionInfo() {
        TTPlayerConfiger.setValue(15, "version name:2.9.40.80,version code:294080,ttplayer release was built by tiger at 2020-04-29 11:24:49 on origin/master branch, commit 8f45d96d027c6c667bcdf22fde548a6110e3b054");
        TTPlayerConfiger.setValue(13, 294080);
        TTPlayerConfiger.setValue(14, VERSION_NAME);
    }
}
