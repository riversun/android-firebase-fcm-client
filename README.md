# Overview

### android-firebase-fcm-client is example for receiving push notification from firebase without showing notification popup even if the App is in the background.

### You can receive downstream message from firebase.

It is licensed under [MIT license](https://opensource.org/licenses/MIT).

# Quick Start

# 1.Clone or download this example project.
## Change applicationId(package name) to yours.

### RecvFcm/app/build.gradle
```
  applicationId "org.riversun.recvfcm"
```
to yours like
```
  applicationId "org.example.yourapp"
```

# 2.Setting up firebase account

## 2-1.Create Google account

## 2-2.Goto firebase console and setup cloud messaging for Android devices.
https://console.firebase.google.com/

![firebase](https://riversun.github.io/img/fcm/img01.png
 "firebase")

![firebase](https://riversun.github.io/img/fcm/img02.png
  "firebase")

![firebase](https://riversun.github.io/img/fcm/img03.png
	 "firebase")

![firebase](https://riversun.github.io/img/fcm/img04.png
	 	 "firebase")

![firebase](https://riversun.github.io/img/fcm/img05.png
		 	 "firebase")

![firebase](https://riversun.github.io/img/fcm/img06.png
			 "firebase")

![firebase](https://riversun.github.io/img/fcm/img07.png
"firebase")
- This server API key is required to send notification to Android Device from your server.
- Set this server API key with  [FcmClient#setServerKey](https://github.com/riversun/java-firebase-fcm-client/blob/master/src/main/java/org/riversun/fcm/FcmClient.java)

![firebase](https://riversun.github.io/img/fcm/img08.png
			 "firebase")

![firebase](https://riversun.github.io/img/fcm/img09.png
			 "firebase")
- Input your app's applicationId(package name).

![firebase](https://riversun.github.io/img/fcm/img10.png
			 "firebase")
- After automatic download finished,
- Copy <b>google-services.json</b> to the <b>RecvFcm/app/</b>

See below.

![firebase](https://riversun.github.io/img/fcm/img12.png
			 "firebase")


![firebase](https://riversun.github.io/img/fcm/img11.png
			 "firebase")

### OK, Firebase settings finished.

# 3.Let's send push notification
## Send firebase cloud messaging from your server or your computer using client library.

### See below.
https://github.com/riversun/java-firebase-fcm-client
