package com.p683ss.ttvideoengine;

import android.content.Context;
import android.net.Uri;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.p683ss.ttm.player.IMediaDataSource;
import com.p683ss.ttm.player.MediaPlayer;
import com.p683ss.ttm.player.MediaPlayer.OnBufferingUpdateListener;
import com.p683ss.ttm.player.MediaPlayer.OnCompletionListener;
import com.p683ss.ttm.player.MediaPlayer.OnErrorListener;
import com.p683ss.ttm.player.MediaPlayer.OnExternInfoListener;
import com.p683ss.ttm.player.MediaPlayer.OnInfoListener;
import com.p683ss.ttm.player.MediaPlayer.OnLogListener;
import com.p683ss.ttm.player.MediaPlayer.OnPreparedListener;
import com.p683ss.ttm.player.MediaPlayer.OnScreenshotListener;
import com.p683ss.ttm.player.MediaPlayer.OnSeekCompleteListener;
import com.p683ss.ttm.player.MediaPlayer.OnVideoSizeChangedListener;
import com.p683ss.ttm.player.MediaPlayer.TrackInfo;
import com.p683ss.ttm.player.MediaPlayer.onSARChangedListener;
import com.p683ss.ttm.player.MediaPlayerClient;
import com.p683ss.ttm.player.PlaybackParams;
import com.p683ss.ttvideoengine.utils.TTVideoEngineLog;
import java.io.FileDescriptor;
import java.io.IOException;
import java.util.Map;

/* renamed from: com.ss.ttvideoengine.MediaPlayerWrapper */
public class MediaPlayerWrapper implements MediaPlayer {
    private static boolean sHasLoadPlayerClass;
    private MediaPlayerClient mClient;
    private String mExceptionStr = "";
    private boolean mHasException;

    public String getExceptionStr() {
        return this.mExceptionStr;
    }

    public boolean hasException() {
        return this.mHasException;
    }

    public void setOnSARChangedListener(onSARChangedListener onsarchangedlistener) {
    }

    public int getCurrentPosition() {
        if (this.mClient != null) {
            return this.mClient.getCurrentPosition();
        }
        return 0;
    }

    public String getDataSource() {
        if (this.mClient != null) {
            return this.mClient.getDataSource();
        }
        return null;
    }

    public int getDuration() {
        if (this.mClient != null) {
            return this.mClient.getDuration();
        }
        return 0;
    }

    public int getPlayerType() {
        if (this.mClient != null) {
            return this.mClient.getType();
        }
        return 0;
    }

    public TrackInfo[] getTrackInfo() {
        if (this.mClient != null) {
            this.mClient.getTrackInfo();
        }
        return null;
    }

    public int getVideoHeight() {
        if (this.mClient != null) {
            return this.mClient.getVideoHeight();
        }
        return 0;
    }

    public int getVideoType() {
        if (this.mClient != null) {
            return this.mClient.getVideoType();
        }
        return 0;
    }

    public int getVideoWidth() {
        if (this.mClient != null) {
            return this.mClient.getVideoWidth();
        }
        return 0;
    }

    public boolean isLooping() {
        if (this.mClient != null) {
            return this.mClient.isLooping();
        }
        return false;
    }

    public boolean isMute() {
        if (this.mClient != null) {
            return this.mClient.isMute();
        }
        return false;
    }

    public boolean isPlaying() {
        if (this.mClient != null) {
            return this.mClient.isPlaying();
        }
        return false;
    }

    public void pause() {
        if (this.mClient != null) {
            this.mClient.pause();
        }
    }

    public void prepare() {
        if (this.mClient != null) {
            this.mClient.prepare();
        }
    }

    public void prepareAsync() {
        if (this.mClient != null) {
            this.mClient.prepareAsync();
        }
    }

    public void prevClose() {
        if (this.mClient != null) {
            this.mClient.prevClose();
        }
    }

    public void release() {
        if (this.mClient != null) {
            this.mClient.release();
        }
    }

    public void releaseAsync() {
        if (this.mClient != null) {
            this.mClient.releaseAsync();
        }
    }

    public void reset() {
        if (this.mClient != null) {
            this.mClient.reset();
        }
    }

    public void start() {
        if (this.mClient != null) {
            this.mClient.start();
        }
    }

    public void stop() {
        if (this.mClient != null) {
            this.mClient.stop();
        }
    }

    public static String getPluginVersion() {
        String str = "";
        try {
            return Class.forName("com.ss.ttmplugin.player.TTVersion").getField("VERSION_NAME").get(null).toString();
        } catch (Throwable th) {
            TTVideoEngineLog.m110645d(th);
            return str;
        }
    }

    public static boolean tryLoadPlayerPlugin() {
        if (sHasLoadPlayerClass) {
            return true;
        }
        try {
            Class.forName("com.ss.ttm.player.TTPlayerClient");
            sHasLoadPlayerClass = true;
            return true;
        } catch (Throwable th) {
            TTVideoEngineLog.m110645d(th);
            return false;
        }
    }

    public boolean isOSPlayer() {
        if (this.mClient == null || this.mClient.getType() == 0) {
            return true;
        }
        return false;
    }

    public void deselectTrack(int i) {
        if (this.mClient != null) {
            this.mClient.deselectTrack(i);
        }
    }

    public int getSelectedTrack(int i) {
        if (this.mClient != null) {
            this.mClient.getSelectedTrack(i);
        }
        return 0;
    }

    public String getStringOption(int i) {
        if (this.mClient != null) {
            return this.mClient.getStringOption(i);
        }
        return null;
    }

    public void seekTo(int i) {
        if (this.mClient != null) {
            this.mClient.seekTo(i);
        }
    }

    public void selectTrack(int i) {
        if (this.mClient != null) {
            this.mClient.selectTrack(i);
        }
    }

    public void setDisplay(SurfaceHolder surfaceHolder) {
        if (this.mClient != null) {
            this.mClient.setDisplay(surfaceHolder);
        }
    }

    public void setIsMute(boolean z) {
        if (this.mClient != null) {
            this.mClient.setIsMute(z);
        }
    }

    public void setLooping(boolean z) {
        if (this.mClient != null) {
            this.mClient.setLooping(z);
        }
    }

    public void setOnBufferingUpdateListener(OnBufferingUpdateListener onBufferingUpdateListener) {
        if (this.mClient != null) {
            this.mClient.setOnBufferingUpdateListener(onBufferingUpdateListener);
        }
    }

    public void setOnCompletionListener(OnCompletionListener onCompletionListener) {
        if (this.mClient != null) {
            this.mClient.setOnCompletionListener(onCompletionListener);
        }
    }

    public void setOnErrorListener(OnErrorListener onErrorListener) {
        if (this.mClient != null) {
            this.mClient.setOnErrorListener(onErrorListener);
        }
    }

    public void setOnExternInfoListener(OnExternInfoListener onExternInfoListener) {
        if (this.mClient != null) {
            this.mClient.setOnExternInfoListener(onExternInfoListener);
        }
    }

    public void setOnInfoListener(OnInfoListener onInfoListener) {
        if (this.mClient != null) {
            this.mClient.setOnInfoListener(onInfoListener);
        }
    }

    public void setOnLogListener(OnLogListener onLogListener) {
        if (this.mClient != null) {
            this.mClient.setOnLogListener(onLogListener);
        }
    }

    public void setOnPreparedListener(OnPreparedListener onPreparedListener) {
        if (this.mClient != null) {
            this.mClient.setOnPreparedListener(onPreparedListener);
        }
    }

    public void setOnSeekCompleteListener(OnSeekCompleteListener onSeekCompleteListener) {
        if (this.mClient != null) {
            this.mClient.setOnSeekCompleteListener(onSeekCompleteListener);
        }
    }

    public void setOnVideoSizeChangedListener(OnVideoSizeChangedListener onVideoSizeChangedListener) {
        if (this.mClient != null) {
            this.mClient.setOnVideoSizeChangedListener(onVideoSizeChangedListener);
        }
    }

    public void setPanoVideoControlModel(int i) {
        if (this.mClient != null) {
            this.mClient.setPanoVideoControlModel(i);
        }
    }

    public void setPlaybackParams(PlaybackParams playbackParams) {
        if (this.mClient != null) {
            this.mClient.setPlaybackParams(playbackParams);
        }
    }

    public void setScreenOnWhilePlaying(boolean z) {
        if (this.mClient != null) {
            this.mClient.setScreenOnWhilePlaying(z);
        }
    }

    public void takeScreenshot(OnScreenshotListener onScreenshotListener) {
        if (this.mClient != null) {
            this.mClient.takeScreenshot(onScreenshotListener);
        }
    }

    public void setSurface(Surface surface) {
        if ((surface == null || surface.isValid()) && this.mClient != null) {
            this.mClient.setSurface(surface);
        }
    }

    public void setDataSource(IMediaDataSource iMediaDataSource) throws IllegalArgumentException, IOException {
        if (this.mClient != null) {
            this.mClient.setDataSource(iMediaDataSource);
        }
    }

    public void setDataSource(String str) throws IllegalArgumentException, SecurityException, IllegalStateException, IOException {
        if (this.mClient != null) {
            this.mClient.setDataSource(str);
        }
    }

    public float getFloatOption(int i, float f) {
        if (this.mClient != null) {
            return this.mClient.getFloatOption(i, f);
        }
        return f;
    }

    public int getIntOption(int i, int i2) {
        if (this.mClient != null) {
            return this.mClient.getIntOption(i, i2);
        }
        return i2;
    }

    public long getLongOption(int i, long j) {
        if (this.mClient != null) {
            return this.mClient.getLongOption(i, j);
        }
        return j;
    }

    public void rotateCamera(float f, float f2) {
        if (this.mClient != null) {
            this.mClient.rotateCamera(f, f2);
        }
    }

    public void setCacheFile(String str, int i) {
        if (this.mClient != null) {
            this.mClient.setCacheFile(str, i);
        }
    }

    public void setDataSource(Context context, Uri uri) throws IllegalArgumentException, SecurityException, IllegalStateException, IOException {
        if (this.mClient != null) {
            this.mClient.setDataSource(context, uri);
        }
    }

    public int setFloatOption(int i, float f) {
        if (this.mClient != null) {
            this.mClient.setFloatOption(i, f);
        }
        return 0;
    }

    public void setIntOption(int i, int i2) {
        if (this.mClient != null) {
            this.mClient.setIntOption(i, i2);
        }
    }

    public long setLongOption(int i, long j) {
        if (this.mClient != null) {
            return (long) this.mClient.setLongOption(i, j);
        }
        return -1;
    }

    public void setStringOption(int i, String str) {
        if (this.mClient != null) {
            this.mClient.setStringOption(i, str);
        }
    }

    public void setVolume(float f, float f2) {
        if (this.mClient != null) {
            this.mClient.setVolume(f, f2);
        }
    }

    public void setWakeMode(Context context, int i) {
        if (this.mClient != null) {
            this.mClient.setWakeMode(context, i);
        }
    }

    public void switchStream(int i, int i2) {
        if (this.mClient != null) {
            this.mClient.switchStream(i, i2);
        }
    }

    public void mouseEvent(int i, int i2, int i3) {
        if (this.mClient != null) {
            this.mClient.mouseEvent(i, i2, i3);
        }
    }

    public void setDataSource(Context context, Uri uri, Map<String, String> map) throws IllegalArgumentException, SecurityException, IllegalStateException, IOException {
        if (this.mClient != null) {
            this.mClient.setDataSource(context, uri, map);
        }
    }

    public void setDataSource(FileDescriptor fileDescriptor, long j, long j2) throws IllegalStateException, IllegalArgumentException, IOException {
        if (this.mClient != null) {
            this.mClient.setDataSource(fileDescriptor, j, j2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x00a7 A[Catch:{ Throwable -> 0x00d5, all -> 0x0083 }] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x018e A[Catch:{ Throwable -> 0x00d5, all -> 0x0083 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.p683ss.ttm.player.MediaPlayer create(android.content.Context r10, int r11, java.util.HashMap<java.lang.Integer, java.lang.Integer> r12) {
        /*
            com.ss.ttvideoengine.MediaPlayerWrapper r0 = new com.ss.ttvideoengine.MediaPlayerWrapper
            r0.<init>()
            java.lang.Class<com.ss.ttvideoengine.MediaPlayerWrapper> r1 = com.p683ss.ttvideoengine.MediaPlayerWrapper.class
            monitor-enter(r1)
            r2 = 10
            r3 = 7
            r4 = 3
            r5 = 2
            r6 = 0
            r7 = 1
            if (r12 == 0) goto L_0x0086
            r8 = 100
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x0083 }
            java.lang.Object r8 = r12.get(r8)     // Catch:{ all -> 0x0083 }
            java.lang.Integer r8 = (java.lang.Integer) r8     // Catch:{ all -> 0x0083 }
            int r8 = r8.intValue()     // Catch:{ all -> 0x0083 }
            if (r8 != r7) goto L_0x0086
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x0083 }
            java.lang.Object r8 = r12.get(r8)     // Catch:{ all -> 0x0083 }
            java.lang.Integer r8 = (java.lang.Integer) r8     // Catch:{ all -> 0x0083 }
            int r8 = r8.intValue()     // Catch:{ all -> 0x0083 }
            if (r8 != 0) goto L_0x0086
            java.lang.Integer r8 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0083 }
            java.lang.Object r8 = r12.get(r8)     // Catch:{ all -> 0x0083 }
            java.lang.Integer r8 = (java.lang.Integer) r8     // Catch:{ all -> 0x0083 }
            int r8 = r8.intValue()     // Catch:{ all -> 0x0083 }
            if (r8 != r7) goto L_0x006f
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0083 }
            java.lang.Object r3 = r12.get(r3)     // Catch:{ all -> 0x0083 }
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ all -> 0x0083 }
            int r3 = r3.intValue()     // Catch:{ all -> 0x0083 }
            if (r3 != r7) goto L_0x006f
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0083 }
            java.lang.Object r2 = r12.get(r2)     // Catch:{ all -> 0x0083 }
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ all -> 0x0083 }
            int r2 = r2.intValue()     // Catch:{ all -> 0x0083 }
            if (r2 < r4) goto L_0x006f
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0083 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0083 }
            r12.put(r2, r3)     // Catch:{ all -> 0x0083 }
            goto L_0x00a1
        L_0x006f:
            r2 = 11
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0083 }
            java.lang.Object r2 = r12.get(r2)     // Catch:{ all -> 0x0083 }
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ all -> 0x0083 }
            int r2 = r2.intValue()     // Catch:{ all -> 0x0083 }
            if (r2 != 0) goto L_0x00a1
            goto L_0x018a
        L_0x0083:
            r10 = move-exception
            goto L_0x0196
        L_0x0086:
            boolean r8 = com.p683ss.ttm.player.TTPlayerConfiger.isOnTTPlayer()     // Catch:{ all -> 0x0083 }
            if (r8 != 0) goto L_0x00a1
            boolean r8 = com.p683ss.ttm.player.TTPlayerConfiger.getValue(r5, r6)     // Catch:{ all -> 0x0083 }
            if (r8 == 0) goto L_0x018a
            int r3 = com.p683ss.ttm.player.TTPlayerConfiger.getValue(r3, r6)     // Catch:{ all -> 0x0083 }
            if (r3 == r7) goto L_0x009e
            int r2 = com.p683ss.ttm.player.TTPlayerConfiger.getValue(r2, r6)     // Catch:{ all -> 0x0083 }
            if (r2 < r4) goto L_0x018a
        L_0x009e:
            com.p683ss.ttm.player.TTPlayerConfiger.setValue(r5, r6)     // Catch:{ all -> 0x0083 }
        L_0x00a1:
            boolean r2 = com.p683ss.ttvideoengine.TTVideoEngine.isForceUseLitePlayer()     // Catch:{ all -> 0x0083 }
            if (r2 != 0) goto L_0x0150
            boolean r2 = com.p683ss.ttvideoengine.TTVideoEngine.isForceUsePluginPlayer()     // Catch:{ all -> 0x0083 }
            if (r2 == 0) goto L_0x00e1
            java.lang.String r2 = "com.ss.ttmplugin.player.TTPlayerClient"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch:{ Throwable -> 0x00d5 }
            java.lang.String r3 = "create"
            java.lang.Class[] r8 = new java.lang.Class[r5]     // Catch:{ Throwable -> 0x00d5 }
            java.lang.Class<com.ss.ttm.player.MediaPlayer> r9 = com.p683ss.ttm.player.MediaPlayer.class
            r8[r6] = r9     // Catch:{ Throwable -> 0x00d5 }
            java.lang.Class<android.content.Context> r9 = android.content.Context.class
            r8[r7] = r9     // Catch:{ Throwable -> 0x00d5 }
            java.lang.reflect.Method r3 = r2.getDeclaredMethod(r3, r8)     // Catch:{ Throwable -> 0x00d5 }
            r3.setAccessible(r7)     // Catch:{ Throwable -> 0x00d5 }
            java.lang.Object[] r8 = new java.lang.Object[r5]     // Catch:{ Throwable -> 0x00d5 }
            r8[r6] = r0     // Catch:{ Throwable -> 0x00d5 }
            r8[r7] = r10     // Catch:{ Throwable -> 0x00d5 }
            java.lang.Object r2 = r3.invoke(r2, r8)     // Catch:{ Throwable -> 0x00d5 }
            com.ss.ttm.player.MediaPlayerClient r2 = (com.p683ss.ttm.player.MediaPlayerClient) r2     // Catch:{ Throwable -> 0x00d5 }
            r0.mClient = r2     // Catch:{ Throwable -> 0x00d5 }
            goto L_0x00e1
        L_0x00d5:
            r2 = move-exception
            com.p683ss.ttvideoengine.utils.TTVideoEngineLog.m110645d(r2)     // Catch:{ all -> 0x0083 }
            r0.mHasException = r7     // Catch:{ all -> 0x0083 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0083 }
            r0.mExceptionStr = r2     // Catch:{ all -> 0x0083 }
        L_0x00e1:
            com.ss.ttm.player.MediaPlayerClient r2 = r0.mClient     // Catch:{ all -> 0x0083 }
            if (r2 != 0) goto L_0x018a
            java.lang.String r2 = "com.ss.ttm.player.TTPlayerClient"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch:{ Throwable -> 0x0115 }
            java.lang.String r3 = "create"
            java.lang.Class[] r8 = new java.lang.Class[r4]     // Catch:{ Throwable -> 0x0115 }
            java.lang.Class<com.ss.ttm.player.MediaPlayer> r9 = com.p683ss.ttm.player.MediaPlayer.class
            r8[r6] = r9     // Catch:{ Throwable -> 0x0115 }
            java.lang.Class<android.content.Context> r9 = android.content.Context.class
            r8[r7] = r9     // Catch:{ Throwable -> 0x0115 }
            java.lang.Class<java.util.HashMap> r9 = java.util.HashMap.class
            r8[r5] = r9     // Catch:{ Throwable -> 0x0115 }
            java.lang.reflect.Method r3 = r2.getDeclaredMethod(r3, r8)     // Catch:{ Throwable -> 0x0115 }
            r3.setAccessible(r7)     // Catch:{ Throwable -> 0x0115 }
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ Throwable -> 0x0115 }
            r4[r6] = r0     // Catch:{ Throwable -> 0x0115 }
            r4[r7] = r10     // Catch:{ Throwable -> 0x0115 }
            r4[r5] = r12     // Catch:{ Throwable -> 0x0115 }
            java.lang.Object r12 = r3.invoke(r2, r4)     // Catch:{ Throwable -> 0x0115 }
            com.ss.ttm.player.MediaPlayerClient r12 = (com.p683ss.ttm.player.MediaPlayerClient) r12     // Catch:{ Throwable -> 0x0115 }
            r0.mClient = r12     // Catch:{ Throwable -> 0x0115 }
            sHasLoadPlayerClass = r7     // Catch:{ Throwable -> 0x0115 }
            goto L_0x0119
        L_0x0115:
            r12 = move-exception
            com.p683ss.ttvideoengine.utils.TTVideoEngineLog.m110645d(r12)     // Catch:{ all -> 0x0083 }
        L_0x0119:
            com.ss.ttm.player.MediaPlayerClient r12 = r0.mClient     // Catch:{ all -> 0x0083 }
            if (r12 != 0) goto L_0x0150
            java.lang.String r12 = "com.ss.ttm.player.TTPlayerClient"
            java.lang.Class r12 = java.lang.Class.forName(r12)     // Catch:{ Throwable -> 0x0147 }
            java.lang.String r2 = "create"
            java.lang.Class[] r3 = new java.lang.Class[r5]     // Catch:{ Throwable -> 0x0147 }
            java.lang.Class<com.ss.ttm.player.MediaPlayer> r4 = com.p683ss.ttm.player.MediaPlayer.class
            r3[r6] = r4     // Catch:{ Throwable -> 0x0147 }
            java.lang.Class<android.content.Context> r4 = android.content.Context.class
            r3[r7] = r4     // Catch:{ Throwable -> 0x0147 }
            java.lang.reflect.Method r2 = r12.getDeclaredMethod(r2, r3)     // Catch:{ Throwable -> 0x0147 }
            r2.setAccessible(r7)     // Catch:{ Throwable -> 0x0147 }
            java.lang.Object[] r3 = new java.lang.Object[r5]     // Catch:{ Throwable -> 0x0147 }
            r3[r6] = r0     // Catch:{ Throwable -> 0x0147 }
            r3[r7] = r10     // Catch:{ Throwable -> 0x0147 }
            java.lang.Object r12 = r2.invoke(r12, r3)     // Catch:{ Throwable -> 0x0147 }
            com.ss.ttm.player.MediaPlayerClient r12 = (com.p683ss.ttm.player.MediaPlayerClient) r12     // Catch:{ Throwable -> 0x0147 }
            r0.mClient = r12     // Catch:{ Throwable -> 0x0147 }
            sHasLoadPlayerClass = r7     // Catch:{ Throwable -> 0x0147 }
            goto L_0x0150
        L_0x0147:
            r12 = move-exception
            r0.mHasException = r7     // Catch:{ all -> 0x0083 }
            java.lang.String r12 = r12.toString()     // Catch:{ all -> 0x0083 }
            r0.mExceptionStr = r12     // Catch:{ all -> 0x0083 }
        L_0x0150:
            com.ss.ttm.player.MediaPlayerClient r12 = r0.mClient     // Catch:{ all -> 0x0083 }
            if (r12 != 0) goto L_0x018a
            if (r11 == r7) goto L_0x018a
            java.lang.String r11 = "com.ss.ttmplayer.player.TTPlayerClient"
            java.lang.Class r11 = java.lang.Class.forName(r11)     // Catch:{ Throwable -> 0x017e }
            java.lang.String r12 = "create"
            java.lang.Class[] r2 = new java.lang.Class[r5]     // Catch:{ Throwable -> 0x017e }
            java.lang.Class<com.ss.ttm.player.MediaPlayer> r3 = com.p683ss.ttm.player.MediaPlayer.class
            r2[r6] = r3     // Catch:{ Throwable -> 0x017e }
            java.lang.Class<android.content.Context> r3 = android.content.Context.class
            r2[r7] = r3     // Catch:{ Throwable -> 0x017e }
            java.lang.reflect.Method r12 = r11.getDeclaredMethod(r12, r2)     // Catch:{ Throwable -> 0x017e }
            r12.setAccessible(r7)     // Catch:{ Throwable -> 0x017e }
            java.lang.Object[] r2 = new java.lang.Object[r5]     // Catch:{ Throwable -> 0x017e }
            r2[r6] = r0     // Catch:{ Throwable -> 0x017e }
            r2[r7] = r10     // Catch:{ Throwable -> 0x017e }
            java.lang.Object r11 = r12.invoke(r11, r2)     // Catch:{ Throwable -> 0x017e }
            com.ss.ttm.player.MediaPlayerClient r11 = (com.p683ss.ttm.player.MediaPlayerClient) r11     // Catch:{ Throwable -> 0x017e }
            r0.mClient = r11     // Catch:{ Throwable -> 0x017e }
            goto L_0x018a
        L_0x017e:
            r11 = move-exception
            com.p683ss.ttvideoengine.utils.TTVideoEngineLog.m110645d(r11)     // Catch:{ all -> 0x0083 }
            r0.mHasException = r7     // Catch:{ all -> 0x0083 }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x0083 }
            r0.mExceptionStr = r11     // Catch:{ all -> 0x0083 }
        L_0x018a:
            com.ss.ttm.player.MediaPlayerClient r11 = r0.mClient     // Catch:{ all -> 0x0083 }
            if (r11 != 0) goto L_0x0194
            com.ss.ttm.player.OSPlayerClient r10 = com.p683ss.ttm.player.OSPlayerClient.create(r0, r10)     // Catch:{ all -> 0x0083 }
            r0.mClient = r10     // Catch:{ all -> 0x0083 }
        L_0x0194:
            monitor-exit(r1)     // Catch:{ all -> 0x0083 }
            return r0
        L_0x0196:
            monitor-exit(r1)     // Catch:{ all -> 0x0083 }
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.ttvideoengine.MediaPlayerWrapper.create(android.content.Context, int, java.util.HashMap):com.ss.ttm.player.MediaPlayer");
    }
}
