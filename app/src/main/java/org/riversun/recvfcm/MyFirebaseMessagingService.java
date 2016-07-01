package org.riversun.recvfcm;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

import java.util.Map;

public class MyFirebaseMessagingService extends FirebaseMessagingService {
    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {

        Logg.d();

        Map<String, String> data = remoteMessage.getData();
        String val1 = data.get("myKey1");
        String val2 = data.get("myKey2");

        Logg.d("val1=" + val1 + " val2=" + val2);

    }


}
