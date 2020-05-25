package com.p683ss.ttvideoengine;

import android.content.Context;
import android.graphics.Bitmap;
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
import p096cn.p097a.p098a.p099a.C2225c;
import p096cn.p097a.p098a.p099a.C2225c.C2226a;
import p096cn.p097a.p098a.p099a.C2225c.C2227b;
import p096cn.p097a.p098a.p099a.C2225c.C2228c;
import p096cn.p097a.p098a.p099a.C2225c.C2229d;
import p096cn.p097a.p098a.p099a.C2225c.C2230e;
import p096cn.p097a.p098a.p099a.C2225c.C2231f;
import p096cn.p097a.p098a.p099a.C2225c.C2232g;
import p096cn.p097a.p098a.p099a.C2234d;
import p096cn.p097a.p098a.p099a.C2235e;

/* renamed from: com.ss.ttvideoengine.MediaPlayerWrapperVer3 */
public class MediaPlayerWrapperVer3 implements MediaPlayer {
    private static boolean sHasLoadPlayerClass;
    public OnBufferingUpdateListener mBufferingUpdateListener;
    private C2235e mClient;
    public OnCompletionListener mCompletionListener;
    public OnErrorListener mErrorListener;
    private String mExceptionStr = "";
    public OnExternInfoListener mExternInfoListener;
    private boolean mHasException;
    public OnInfoListener mInfoListener;
    private MediaPlayerClient mLittleClient;
    public OnLogListener mLogListener;
    public OnPreparedListener mPreparedListener;
    public OnScreenshotListener mScreenshotListener;
    public OnSeekCompleteListener mSeekCompleteListener;
    public MediaPlayer mSelf;
    public OnVideoSizeChangedListener mVideoSizeChangedListener;

    public String getExceptionStr() {
        return this.mExceptionStr;
    }

    public boolean hasException() {
        return this.mHasException;
    }

    public void prevClose() {
    }

    public void setDataSource(IMediaDataSource iMediaDataSource) throws IllegalArgumentException, IOException {
    }

    public void setDataSource(FileDescriptor fileDescriptor, long j, long j2) throws IllegalStateException, IllegalArgumentException, IOException {
    }

    public void setOnSARChangedListener(onSARChangedListener onsarchangedlistener) {
    }

    public void switchStream(int i, int i2) {
    }

    public int getPlayerType() {
        if (this.mClient == null && this.mLittleClient != null) {
            return 3;
        }
        return 0;
    }

    public boolean isMute() {
        if (this.mClient == null && this.mLittleClient != null) {
            this.mLittleClient.isMute();
        }
        return false;
    }

    public boolean isOSPlayer() {
        if (this.mClient != null || this.mLittleClient == null) {
            return true;
        }
        return false;
    }

    public static boolean tryLoadPlayerPlugin() {
        if (sHasLoadPlayerClass) {
            return true;
        }
        try {
            Class.forName("cn.org.mediakit.player.MKPlayerAdapter");
            sHasLoadPlayerClass = true;
            return true;
        } catch (Throwable th) {
            TTVideoEngineLog.m110645d(th);
            return false;
        }
    }

    public int getCurrentPosition() {
        if (this.mClient != null) {
            return this.mClient.mo6599h();
        }
        if (this.mLittleClient != null) {
            return this.mLittleClient.getCurrentPosition();
        }
        return 0;
    }

    public String getDataSource() {
        if (this.mClient == null && this.mLittleClient != null) {
            return this.mLittleClient.getDataSource();
        }
        return null;
    }

    public int getDuration() {
        if (this.mClient != null) {
            return this.mClient.mo6602k();
        }
        if (this.mLittleClient != null) {
            return this.mLittleClient.getDuration();
        }
        return 0;
    }

    public TrackInfo[] getTrackInfo() {
        if (this.mClient != null) {
            this.mClient.mo6606o();
            return null;
        }
        if (this.mLittleClient != null) {
            this.mClient.mo6606o();
        }
        return null;
    }

    public int getVideoHeight() {
        if (this.mClient != null) {
            return this.mClient.mo6600i();
        }
        if (this.mLittleClient != null) {
            return this.mLittleClient.getVideoHeight();
        }
        return 0;
    }

    public int getVideoType() {
        if (this.mClient == null && this.mLittleClient != null) {
            return this.mLittleClient.getVideoType();
        }
        return 0;
    }

    public int getVideoWidth() {
        if (this.mClient != null) {
            return this.mClient.mo6601j();
        }
        if (this.mLittleClient != null) {
            return this.mLittleClient.getVideoWidth();
        }
        return 0;
    }

    public boolean isLooping() {
        if (this.mClient != null) {
            return this.mClient.mo6604m();
        }
        if (this.mLittleClient != null) {
            return this.mLittleClient.isLooping();
        }
        return false;
    }

    public boolean isPlaying() {
        if (this.mClient != null) {
            return this.mClient.mo6603l();
        }
        if (this.mLittleClient != null) {
            return this.mLittleClient.isPlaying();
        }
        return false;
    }

    public void pause() {
        if (this.mClient != null) {
            this.mClient.mo6592c();
            return;
        }
        if (this.mLittleClient != null) {
            this.mLittleClient.pause();
        }
    }

    public void prepare() {
        if (this.mClient != null) {
            this.mClient.mo6597f();
            return;
        }
        if (this.mLittleClient != null) {
            this.mLittleClient.prepare();
        }
    }

    public void prepareAsync() {
        if (this.mClient != null) {
            this.mClient.mo6598g();
            return;
        }
        if (this.mLittleClient != null) {
            this.mLittleClient.prepareAsync();
        }
    }

    public void release() {
        if (this.mClient != null) {
            this.mClient.mo6571a();
            return;
        }
        if (this.mLittleClient != null) {
            this.mLittleClient.release();
        }
    }

    public void releaseAsync() {
        if (this.mClient != null) {
            this.mClient.mo6605n();
            return;
        }
        if (this.mLittleClient != null) {
            this.mLittleClient.releaseAsync();
        }
    }

    public void reset() {
        if (this.mClient != null) {
            this.mClient.mo6595d();
            return;
        }
        if (this.mLittleClient != null) {
            this.mLittleClient.reset();
        }
    }

    public void start() {
        if (this.mClient != null) {
            this.mClient.mo6589b();
            return;
        }
        if (this.mLittleClient != null) {
            this.mLittleClient.start();
        }
    }

    public void stop() {
        if (this.mClient != null) {
            this.mClient.mo6596e();
            return;
        }
        if (this.mLittleClient != null) {
            this.mLittleClient.stop();
        }
    }

    public void selectTrack(int i) {
        if (this.mClient != null) {
            this.mClient.mo6590b(i);
        }
    }

    public void setIsMute(boolean z) {
        if (this.mClient == null && this.mLittleClient != null) {
            this.mLittleClient.setIsMute(z);
        }
    }

    public void setPanoVideoControlModel(int i) {
        if (this.mClient == null && this.mLittleClient != null) {
            this.mLittleClient.setPanoVideoControlModel(i);
        }
    }

    public void deselectTrack(int i) {
        if (this.mClient != null) {
            this.mClient.mo6593c(i);
            return;
        }
        if (this.mLittleClient != null) {
            this.mLittleClient.deselectTrack(i);
        }
    }

    public int getSelectedTrack(int i) {
        if (this.mClient != null) {
            this.mClient.mo6594d(i);
        } else if (this.mLittleClient != null) {
            this.mLittleClient.getSelectedTrack(i);
        }
        return 0;
    }

    public String getStringOption(int i) {
        if (this.mClient == null && this.mLittleClient != null) {
            return this.mLittleClient.getStringOption(i);
        }
        return null;
    }

    public void seekTo(int i) {
        if (this.mClient != null) {
            this.mClient.mo6573a(i);
            return;
        }
        if (this.mLittleClient != null) {
            this.mLittleClient.seekTo(i);
        }
    }

    public void setDisplay(SurfaceHolder surfaceHolder) {
        if (this.mClient != null) {
            this.mClient.mo6578a(surfaceHolder);
            return;
        }
        if (this.mLittleClient != null) {
            this.mLittleClient.setDisplay(surfaceHolder);
        }
    }

    public void setLooping(boolean z) {
        if (this.mClient != null) {
            this.mClient.mo6588a(z);
            return;
        }
        if (this.mLittleClient != null) {
            this.mLittleClient.setLooping(z);
        }
    }

    public void setOnBufferingUpdateListener(OnBufferingUpdateListener onBufferingUpdateListener) {
        if (this.mClient != null) {
            this.mBufferingUpdateListener = onBufferingUpdateListener;
            this.mClient.mo6579a((C2226a) new C2226a() {
                public void onBufferingUpdate(C2225c cVar, int i) {
                    MediaPlayerWrapperVer3.this.mBufferingUpdateListener.onBufferingUpdate(MediaPlayerWrapperVer3.this.mSelf, i);
                }
            });
            return;
        }
        if (this.mLittleClient != null) {
            this.mLittleClient.setOnBufferingUpdateListener(onBufferingUpdateListener);
        }
    }

    public void setOnCompletionListener(OnCompletionListener onCompletionListener) {
        if (this.mClient != null) {
            this.mCompletionListener = onCompletionListener;
            this.mClient.mo6580a((C2227b) new C2227b() {
                public void onCompletion(C2225c cVar) {
                    MediaPlayerWrapperVer3.this.mCompletionListener.onCompletion(MediaPlayerWrapperVer3.this.mSelf);
                }
            });
            return;
        }
        if (this.mLittleClient != null) {
            this.mLittleClient.setOnCompletionListener(onCompletionListener);
        }
    }

    public void setOnErrorListener(OnErrorListener onErrorListener) {
        if (this.mClient != null) {
            this.mErrorListener = onErrorListener;
            this.mClient.mo6581a((C2228c) new C2228c() {
                public boolean onError(C2225c cVar, int i, int i2) {
                    return MediaPlayerWrapperVer3.this.mErrorListener.onError(MediaPlayerWrapperVer3.this.mSelf, i, i2);
                }
            });
            return;
        }
        if (this.mLittleClient != null) {
            this.mLittleClient.setOnErrorListener(onErrorListener);
        }
    }

    public void setOnExternInfoListener(OnExternInfoListener onExternInfoListener) {
        if (this.mClient != null) {
            this.mExternInfoListener = onExternInfoListener;
            new Object() {
                public void onExternInfo(C2225c cVar, int i, String str) {
                    MediaPlayerWrapperVer3.this.mExternInfoListener.onExternInfo(MediaPlayerWrapperVer3.this.mSelf, i, str);
                }
            };
            return;
        }
        if (this.mLittleClient != null) {
            this.mLittleClient.setOnExternInfoListener(onExternInfoListener);
        }
    }

    public void setOnInfoListener(OnInfoListener onInfoListener) {
        if (this.mClient != null) {
            this.mInfoListener = onInfoListener;
            this.mClient.mo6582a((C2229d) new C2229d() {
                public boolean onInfo(C2225c cVar, int i, int i2) {
                    return MediaPlayerWrapperVer3.this.mInfoListener.onInfo(MediaPlayerWrapperVer3.this.mSelf, i, i2);
                }
            });
            return;
        }
        if (this.mLittleClient != null) {
            this.mLittleClient.setOnInfoListener(onInfoListener);
        }
    }

    public void setOnLogListener(OnLogListener onLogListener) {
        if (this.mClient != null) {
            this.mLogListener = onLogListener;
            new Object() {
                public void onLogInfo(C2225c cVar, String str) {
                    MediaPlayerWrapperVer3.this.mLogListener.onLogInfo(MediaPlayerWrapperVer3.this.mSelf, str);
                }
            };
            return;
        }
        if (this.mLittleClient != null) {
            this.mLittleClient.setOnLogListener(onLogListener);
        }
    }

    public void setOnPreparedListener(OnPreparedListener onPreparedListener) {
        if (this.mClient != null) {
            this.mPreparedListener = onPreparedListener;
            this.mClient.mo6583a((C2230e) new C2230e() {
                public void onPrepared(C2225c cVar) {
                    MediaPlayerWrapperVer3.this.mPreparedListener.onPrepared(MediaPlayerWrapperVer3.this.mSelf);
                }
            });
            return;
        }
        if (this.mLittleClient != null) {
            this.mLittleClient.setOnPreparedListener(onPreparedListener);
        }
    }

    public void setOnSeekCompleteListener(OnSeekCompleteListener onSeekCompleteListener) {
        if (this.mClient != null) {
            this.mSeekCompleteListener = onSeekCompleteListener;
            this.mClient.mo6584a((C2231f) new C2231f() {
                public void onSeekComplete(C2225c cVar) {
                    MediaPlayerWrapperVer3.this.mSeekCompleteListener.onSeekComplete(MediaPlayerWrapperVer3.this.mSelf);
                }
            });
            return;
        }
        if (this.mLittleClient != null) {
            this.mLittleClient.setOnSeekCompleteListener(onSeekCompleteListener);
        }
    }

    public void setOnVideoSizeChangedListener(OnVideoSizeChangedListener onVideoSizeChangedListener) {
        if (this.mClient != null) {
            this.mVideoSizeChangedListener = onVideoSizeChangedListener;
            this.mClient.mo6585a((C2232g) new C2232g() {
                public void onVideoSizeChanged(C2225c cVar, int i, int i2) {
                    MediaPlayerWrapperVer3.this.mVideoSizeChangedListener.onVideoSizeChanged(MediaPlayerWrapperVer3.this.mSelf, i, i2);
                }
            });
            return;
        }
        if (this.mLittleClient != null) {
            this.mLittleClient.setOnVideoSizeChangedListener(onVideoSizeChangedListener);
        }
    }

    public void setScreenOnWhilePlaying(boolean z) {
        if (this.mClient != null) {
            this.mClient.mo6591b(z);
            return;
        }
        if (this.mLittleClient != null) {
            this.mLittleClient.setScreenOnWhilePlaying(z);
        }
    }

    public void setSurface(Surface surface) {
        if (surface != null && !surface.isValid()) {
            return;
        }
        if (this.mClient != null) {
            this.mClient.mo6577a(surface);
            return;
        }
        if (this.mLittleClient != null) {
            this.mLittleClient.setSurface(surface);
        }
    }

    public void takeScreenshot(OnScreenshotListener onScreenshotListener) {
        if (this.mClient != null) {
            this.mScreenshotListener = onScreenshotListener;
            new Object() {
                public void onTakeScreenShotCompletion(Bitmap bitmap) {
                    MediaPlayerWrapperVer3.this.mScreenshotListener.onTakeScreenShotCompletion(bitmap);
                }
            };
            return;
        }
        if (this.mLittleClient != null) {
            this.mLittleClient.takeScreenshot(onScreenshotListener);
        }
    }

    public void setPlaybackParams(PlaybackParams playbackParams) {
        if (this.mClient != null) {
            C2234d dVar = new C2234d();
            dVar.mo6625a(playbackParams.getAudioFallbackMode());
            dVar.mo6624a(playbackParams.getPitch());
            dVar.mo6626b(playbackParams.getSpeed());
            this.mClient.mo6586a(dVar);
            return;
        }
        if (this.mLittleClient != null) {
            this.mLittleClient.setPlaybackParams(playbackParams);
        }
    }

    public void setDataSource(String str) throws IllegalArgumentException, SecurityException, IllegalStateException, IOException {
        if (this.mClient != null) {
            this.mClient.mo6587a(str);
            return;
        }
        if (this.mLittleClient != null) {
            this.mLittleClient.setDataSource(str);
        }
    }

    public void rotateCamera(float f, float f2) {
        if (this.mClient == null && this.mLittleClient != null) {
            this.mLittleClient.rotateCamera(f, f2);
        }
    }

    public void setCacheFile(String str, int i) {
        if (this.mClient == null && this.mLittleClient != null) {
            this.mLittleClient.setCacheFile(str, i);
        }
    }

    public int setFloatOption(int i, float f) {
        if (this.mClient == null && this.mLittleClient != null) {
            this.mLittleClient.setFloatOption(i, f);
        }
        return 0;
    }

    public void setIntOption(int i, int i2) {
        if (this.mClient == null && this.mLittleClient != null) {
            this.mLittleClient.setIntOption(i, i2);
        }
    }

    public void setStringOption(int i, String str) {
        if (this.mClient == null && this.mLittleClient != null) {
            this.mLittleClient.setStringOption(i, str);
        }
    }

    public float getFloatOption(int i, float f) {
        if (this.mClient == null && this.mLittleClient != null) {
            return this.mLittleClient.getFloatOption(i, f);
        }
        return f;
    }

    public int getIntOption(int i, int i2) {
        if (this.mClient != null) {
            if (i == 141) {
                if (i2 == 1) {
                    return 0;
                }
                if (i2 == 2) {
                    return 1;
                }
            }
            return i2;
        } else if (this.mLittleClient != null) {
            return this.mLittleClient.getIntOption(i, i2);
        } else {
            return i2;
        }
    }

    public long getLongOption(int i, long j) {
        if (this.mClient == null && this.mLittleClient != null) {
            return this.mLittleClient.getLongOption(i, j);
        }
        return j;
    }

    public void setDataSource(Context context, Uri uri) throws IllegalArgumentException, SecurityException, IllegalStateException, IOException {
        if (this.mClient != null) {
            this.mClient.mo6575a(context, uri);
            return;
        }
        if (this.mLittleClient != null) {
            this.mLittleClient.setDataSource(context, uri);
        }
    }

    public long setLongOption(int i, long j) {
        if (this.mClient == null && this.mLittleClient != null) {
            return (long) this.mLittleClient.setLongOption(i, j);
        }
        return -1;
    }

    public void setVolume(float f, float f2) {
        if (this.mClient != null) {
            this.mClient.mo6572a(f, f2);
            return;
        }
        if (this.mLittleClient != null) {
            this.mLittleClient.setVolume(f, f2);
        }
    }

    public void setWakeMode(Context context, int i) {
        if (this.mClient != null) {
            this.mClient.mo6574a(context, i);
            return;
        }
        if (this.mLittleClient != null) {
            this.mLittleClient.setWakeMode(context, i);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0039 A[Catch:{ Throwable -> 0x0071 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.p683ss.ttm.player.MediaPlayer create(android.content.Context r10, int r11) {
        /*
            com.ss.ttvideoengine.MediaPlayerWrapperVer3 r0 = new com.ss.ttvideoengine.MediaPlayerWrapperVer3
            r0.<init>()
            r0.mSelf = r0
            java.lang.Class<com.ss.ttvideoengine.MediaPlayerWrapperVer3> r1 = com.p683ss.ttvideoengine.MediaPlayerWrapperVer3.class
            monitor-enter(r1)
            r2 = 6
            r3 = 0
            int r2 = p096cn.p097a.p098a.p099a.C2236f.m6765a(r2, r3)     // Catch:{ all -> 0x00c7 }
            r4 = 1
            if (r2 == r4) goto L_0x0035
            int r2 = p096cn.p097a.p098a.p099a.C2236f.m6765a(r4, r3)     // Catch:{ all -> 0x00c7 }
            if (r2 != 0) goto L_0x001b
        L_0x0019:
            r2 = 0
            goto L_0x0036
        L_0x001b:
            r2 = 7
            int r2 = p096cn.p097a.p098a.p099a.C2236f.m6765a(r2, r3)     // Catch:{ all -> 0x00c7 }
            if (r2 == r4) goto L_0x0019
            r2 = 8
            int r2 = p096cn.p097a.p098a.p099a.C2236f.m6765a(r2, r3)     // Catch:{ all -> 0x00c7 }
            if (r2 != r4) goto L_0x002b
            goto L_0x0019
        L_0x002b:
            r2 = 10
            int r2 = p096cn.p097a.p098a.p099a.C2236f.m6765a(r2, r3)     // Catch:{ all -> 0x00c7 }
            r5 = 3
            if (r2 < r5) goto L_0x0035
            goto L_0x0019
        L_0x0035:
            r2 = 1
        L_0x0036:
            r5 = 0
            if (r2 == 0) goto L_0x00b7
            boolean r2 = com.p683ss.ttvideoengine.TTVideoEngine.isForceUseLitePlayer()     // Catch:{ all -> 0x00c7 }
            r6 = 2
            if (r2 != 0) goto L_0x007d
            java.lang.String r2 = "cn.org.mediakit.player.MKPlayerAdapter"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch:{ Throwable -> 0x0071 }
            java.lang.String r7 = "create"
            java.lang.Class[] r8 = new java.lang.Class[r6]     // Catch:{ Throwable -> 0x0071 }
            java.lang.Class<cn.a.a.a.c> r9 = p096cn.p097a.p098a.p099a.C2225c.class
            r8[r3] = r9     // Catch:{ Throwable -> 0x0071 }
            java.lang.Class<android.content.Context> r9 = android.content.Context.class
            r8[r4] = r9     // Catch:{ Throwable -> 0x0071 }
            java.lang.reflect.Method r7 = r2.getDeclaredMethod(r7, r8)     // Catch:{ Throwable -> 0x0071 }
            r7.setAccessible(r4)     // Catch:{ Throwable -> 0x0071 }
            java.lang.Object[] r8 = new java.lang.Object[r6]     // Catch:{ Throwable -> 0x0071 }
            r8[r3] = r5     // Catch:{ Throwable -> 0x0071 }
            r8[r4] = r10     // Catch:{ Throwable -> 0x0071 }
            java.lang.Object r2 = r7.invoke(r2, r8)     // Catch:{ Throwable -> 0x0071 }
            cn.a.a.a.e r2 = (p096cn.p097a.p098a.p099a.C2235e) r2     // Catch:{ Throwable -> 0x0071 }
            r0.mClient = r2     // Catch:{ Throwable -> 0x0071 }
            sHasLoadPlayerClass = r4     // Catch:{ Throwable -> 0x0071 }
            java.lang.String r2 = "MediaPlayerWrapperVer3"
            java.lang.String r7 = "using 3.0 player"
            com.p683ss.ttvideoengine.utils.TTVideoEngineLog.m110647i(r2, r7)     // Catch:{ Throwable -> 0x0071 }
            goto L_0x007d
        L_0x0071:
            r2 = move-exception
            com.p683ss.ttvideoengine.utils.TTVideoEngineLog.m110645d(r2)     // Catch:{ all -> 0x00c7 }
            r0.mHasException = r4     // Catch:{ all -> 0x00c7 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x00c7 }
            r0.mExceptionStr = r2     // Catch:{ all -> 0x00c7 }
        L_0x007d:
            cn.a.a.a.e r2 = r0.mClient     // Catch:{ all -> 0x00c7 }
            if (r2 != 0) goto L_0x00b7
            if (r11 == r4) goto L_0x00b7
            java.lang.String r11 = "com.ss.ttmplayer.player.TTPlayerClient"
            java.lang.Class r11 = java.lang.Class.forName(r11)     // Catch:{ Throwable -> 0x00ab }
            java.lang.String r2 = "create"
            java.lang.Class[] r7 = new java.lang.Class[r6]     // Catch:{ Throwable -> 0x00ab }
            java.lang.Class<com.ss.ttm.player.MediaPlayer> r8 = com.p683ss.ttm.player.MediaPlayer.class
            r7[r3] = r8     // Catch:{ Throwable -> 0x00ab }
            java.lang.Class<android.content.Context> r8 = android.content.Context.class
            r7[r4] = r8     // Catch:{ Throwable -> 0x00ab }
            java.lang.reflect.Method r2 = r11.getDeclaredMethod(r2, r7)     // Catch:{ Throwable -> 0x00ab }
            r2.setAccessible(r4)     // Catch:{ Throwable -> 0x00ab }
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ Throwable -> 0x00ab }
            r6[r3] = r0     // Catch:{ Throwable -> 0x00ab }
            r6[r4] = r10     // Catch:{ Throwable -> 0x00ab }
            java.lang.Object r11 = r2.invoke(r11, r6)     // Catch:{ Throwable -> 0x00ab }
            com.ss.ttm.player.MediaPlayerClient r11 = (com.p683ss.ttm.player.MediaPlayerClient) r11     // Catch:{ Throwable -> 0x00ab }
            r0.mLittleClient = r11     // Catch:{ Throwable -> 0x00ab }
            goto L_0x00b7
        L_0x00ab:
            r11 = move-exception
            com.p683ss.ttvideoengine.utils.TTVideoEngineLog.m110645d(r11)     // Catch:{ all -> 0x00c7 }
            r0.mHasException = r4     // Catch:{ all -> 0x00c7 }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x00c7 }
            r0.mExceptionStr = r11     // Catch:{ all -> 0x00c7 }
        L_0x00b7:
            cn.a.a.a.e r11 = r0.mClient     // Catch:{ all -> 0x00c7 }
            if (r11 != 0) goto L_0x00c5
            com.ss.ttm.player.MediaPlayerClient r11 = r0.mLittleClient     // Catch:{ all -> 0x00c7 }
            if (r11 != 0) goto L_0x00c5
            cn.a.a.a.a r10 = p096cn.p097a.p098a.p099a.C2215a.m6688a(r5, r10)     // Catch:{ all -> 0x00c7 }
            r0.mClient = r10     // Catch:{ all -> 0x00c7 }
        L_0x00c5:
            monitor-exit(r1)     // Catch:{ all -> 0x00c7 }
            return r0
        L_0x00c7:
            r10 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00c7 }
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.ttvideoengine.MediaPlayerWrapperVer3.create(android.content.Context, int):com.ss.ttm.player.MediaPlayer");
    }

    public void mouseEvent(int i, int i2, int i3) {
        if (this.mClient == null && this.mLittleClient != null) {
            this.mLittleClient.mouseEvent(i, i2, i3);
        }
    }

    public void setDataSource(Context context, Uri uri, Map<String, String> map) throws IllegalArgumentException, SecurityException, IllegalStateException, IOException {
        if (this.mClient != null) {
            this.mClient.mo6576a(context, uri, map);
            return;
        }
        if (this.mLittleClient != null) {
            this.mLittleClient.setDataSource(context, uri, map);
        }
    }
}
