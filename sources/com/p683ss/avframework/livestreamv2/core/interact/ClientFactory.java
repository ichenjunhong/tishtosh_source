package com.p683ss.avframework.livestreamv2.core.interact;

import com.p683ss.avframework.livestreamv2.core.Client;
import com.p683ss.avframework.livestreamv2.core.LiveCore.Builder.ILogMonitor;
import com.p683ss.avframework.livestreamv2.core.LiveCore.InteractConfig;
import com.p683ss.avframework.utils.AVLog;
import com.p683ss.video.rtc.interact.model.Config.ViewType;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.ss.avframework.livestreamv2.core.interact.ClientFactory */
class ClientFactory {
    private final InteractEngineBuilder mBuilder;
    protected ArrayList<Client> mClients = new ArrayList<>();
    protected boolean mEnableMixer;
    protected ArrayList<String> mInteractsId = new ArrayList<>();
    protected boolean mIsTextureViewOnInteract;
    protected ILogMonitor mLogMonitor;

    /* access modifiers changed from: protected */
    public Client createClient(InteractConfig interactConfig, boolean z) {
        return null;
    }

    public void pause() {
        synchronized (this.mClients) {
            Iterator it = this.mClients.iterator();
            while (it.hasNext()) {
                ((Client) it.next()).pause();
            }
        }
    }

    public void resume() {
        synchronized (this.mClients) {
            Iterator it = this.mClients.iterator();
            while (it.hasNext()) {
                ((Client) it.next()).resume();
            }
        }
    }

    public void dispose() {
        synchronized (this.mClients) {
            Iterator it = this.mClients.iterator();
            while (it.hasNext()) {
                Client client = (Client) it.next();
                client.stop();
                if (client.isGuest()) {
                    ((GuestInternal) client).superDispose();
                } else {
                    ((AnchorInternal) client).superDispose();
                }
            }
            this.mClients.clear();
        }
        this.mBuilder.getWorkThreadHandler().post(ClientFactory$$Lambda$0.$instance);
    }

    private void addClients(Client client) {
        synchronized (this.mClients) {
            this.mClients.add(client);
        }
    }

    public boolean removeClient(Client client) {
        boolean remove;
        synchronized (this.mClients) {
            remove = this.mClients.remove(client);
        }
        return remove;
    }

    public ClientFactory(InteractEngineBuilder interactEngineBuilder) {
        this.mLogMonitor = interactEngineBuilder.getLiveCoreBuilder().getLogMonitor();
        this.mBuilder = interactEngineBuilder;
    }

    /* access modifiers changed from: protected */
    public void start(Client client) {
        StringBuilder sb = new StringBuilder("Start clientFactory at client(");
        sb.append(client);
        sb.append(")");
        AVLog.iod("ClientFactory", sb.toString());
        this.mInteractsId.clear();
    }

    /* access modifiers changed from: protected */
    public void stop(Client client) {
        StringBuilder sb = new StringBuilder("Stop clientFactory at client(");
        sb.append(client);
        sb.append(")");
        AVLog.iod("ClientFactory", sb.toString());
    }

    /* access modifiers changed from: protected */
    public void onUserJoin(Client client, String str) {
        synchronized (this.mInteractsId) {
            this.mEnableMixer = this.mInteractsId.isEmpty();
            if (!this.mInteractsId.contains(str)) {
                this.mInteractsId.add(str);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0031, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onUserLeaved(com.p683ss.avframework.livestreamv2.core.Client r3, java.lang.String r4) {
        /*
            r2 = this;
            java.util.ArrayList<java.lang.String> r3 = r2.mInteractsId
            monitor-enter(r3)
            java.util.ArrayList<java.lang.String> r0 = r2.mInteractsId     // Catch:{ all -> 0x0032 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0032 }
            if (r0 == 0) goto L_0x0014
            java.lang.String r4 = "ClientFactory"
            java.lang.String r0 = "Repeat interact user leaved event."
            com.p683ss.avframework.utils.AVLog.iow(r4, r0)     // Catch:{ all -> 0x0032 }
            monitor-exit(r3)     // Catch:{ all -> 0x0032 }
            return
        L_0x0014:
            java.util.ArrayList<java.lang.String> r0 = r2.mInteractsId     // Catch:{ all -> 0x0032 }
            int r0 = r0.indexOf(r4)     // Catch:{ all -> 0x0032 }
        L_0x001a:
            if (r0 < 0) goto L_0x0030
            java.util.ArrayList<java.lang.String> r1 = r2.mInteractsId     // Catch:{ all -> 0x0032 }
            int r1 = r1.size()     // Catch:{ all -> 0x0032 }
            if (r0 >= r1) goto L_0x0030
            java.util.ArrayList<java.lang.String> r1 = r2.mInteractsId     // Catch:{ all -> 0x0032 }
            r1.remove(r0)     // Catch:{ all -> 0x0032 }
            java.util.ArrayList<java.lang.String> r0 = r2.mInteractsId     // Catch:{ all -> 0x0032 }
            int r0 = r0.indexOf(r4)     // Catch:{ all -> 0x0032 }
            goto L_0x001a
        L_0x0030:
            monitor-exit(r3)     // Catch:{ all -> 0x0032 }
            return
        L_0x0032:
            r4 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0032 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.avframework.livestreamv2.core.interact.ClientFactory.onUserLeaved(com.ss.avframework.livestreamv2.core.Client, java.lang.String):void");
    }

    public Client create(InteractConfig interactConfig, boolean z) {
        boolean z2;
        String str;
        String str2;
        Client createClient = createClient(interactConfig, z);
        addClients(createClient);
        if (interactConfig.getViewType() == ViewType.TEXTURE_VIEW) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.mIsTextureViewOnInteract = z2;
        String str3 = "ClientFactory";
        StringBuilder sb = new StringBuilder("Create interact client(");
        if (z) {
            str = "guest";
        } else {
            str = "anchor";
        }
        sb.append(str);
        sb.append(",");
        if (this.mBuilder.isClientMixer()) {
            str2 = "clientMixer";
        } else {
            str2 = "ServerMixer";
        }
        sb.append(str2);
        sb.append(" with textureView ) ");
        sb.append(this.mIsTextureViewOnInteract);
        sb.append(" ");
        sb.append(createClient);
        AVLog.iod(str3, sb.toString());
        return createClient;
    }
}
