package org.riversun.recvfcm;

import android.app.IntentService;
import android.content.Intent;

import com.google.firebase.iid.FirebaseInstanceId;


public class FcmTokenRegistrationService extends IntentService {

    public FcmTokenRegistrationService() {
        super("FcmTokenRegistrationService");
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        final String regToken = FirebaseInstanceId.getInstance().getToken();

        Logg.d("Firebase registrationToken=" + regToken);

        //TODO register token to your server.

    }


}
